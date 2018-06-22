package com.fayne.demo.jdk.javax.net.ssl.HttpsSNI;

import com.fayne.demo.spring.framework.validator.DemoRunner;
import sun.security.util.HostnameChecker;

import javax.net.ssl.*;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.LinkedList;
import java.util.List;

/**
 * @Author: WangZezhou(301255)
 * @Date 2018/6/22 10:30
 */
public class HttpsSniDemo {

    private final static HostnameVerifier hostnameVerifier= new HostnameVerifier(){

        @Override
        public boolean verify(String s, SSLSession sslSession) {

            HostnameChecker hostnameChecker = HostnameChecker.getInstance((byte) 1);
            try {
                hostnameChecker.match("test.qa.101.com",(X509Certificate) sslSession.getPeerCertificates()[0]);
            } catch (CertificateException e) {
                return false;
            } catch (SSLPeerUnverifiedException e) {
                return false;
            }

            return true;
        }
    };

    public static void main(String args[]) throws IOException, NoSuchAlgorithmException, KeyManagementException {

        // Note 如果要改HttpUrlConnection的请求Host头需要配置以下属性。因为一些定义规范的
        //  System.setProperty("sun.net.http.allowRestrictedHeaders", "true");

        SSLContext sslContext = SSLContext.getDefault();

        // 1、设置SSL要握手的主机名。
        SSLParameters sslParameters = sslContext.getDefaultSSLParameters();
        List<SNIServerName> sniServerNames = new LinkedList<SNIServerName>();
        sniServerNames.add(new SNIHostName("certificate.qa.101.com"));
        sslParameters.setServerNames(sniServerNames);

        // 2、初始化 SNI Socket工厂
        SSLSniSocketFactory sslSniSocketFactory = new SSLSniSocketFactory(
                (SSLSocketFactory) SSLSocketFactory.getDefault(),sslParameters);

        // 3、请求hostname为IP地址。
        URL httpsUrl = new URL("https://192.168.181.231/certificate");
        URLConnection urlConn = httpsUrl.openConnection();
        if (urlConn instanceof HttpsURLConnection){
            HttpsURLConnection httpsConn = (HttpsURLConnection)urlConn;

            // https SNI认证不需要修改Host头。
            // httpsConn.setRequestProperty("Host","certificate.qa.101.com");

            // 4、替换默认的SSLSocket工厂。
            httpsConn.setSSLSocketFactory(sslSniSocketFactory);
            httpsConn.setHostnameVerifier(hostnameVerifier);
            httpsConn.setRequestMethod("GET");
        }

        urlConn.setDoInput(true);
        urlConn.setDoOutput(true);
        urlConn.connect();
        byte[] by = new byte[600];
        InputStream is = urlConn.getInputStream();
        is.read(by);
        String str = new String(by);
        str = str;

    }
}
