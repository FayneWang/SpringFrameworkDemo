package com.fayne.demo.jdk.javax.net.ssl.HttpsSNI;

import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * @Author: WangZezhou(301255)
 * @Date 2018/6/22 10:40
 */
public class SSLSniSocketFactory extends SSLSocketFactory {

    private final SSLSocketFactory wrappedFactory;
    private final SSLParameters sslParameters;

    public SSLSniSocketFactory(SSLSocketFactory factory, SSLParameters sslParameters){
        this.wrappedFactory = factory;
        this.sslParameters = sslParameters;
    }

    @Override
    public String[] getDefaultCipherSuites() {
        return wrappedFactory.getDefaultCipherSuites();
    }

    @Override
    public String[] getSupportedCipherSuites() {
        return wrappedFactory.getSupportedCipherSuites();
    }

    @Override
    public Socket createSocket(Socket socket, String s, int i, boolean b) throws IOException {
        Socket sock = wrappedFactory.createSocket(socket,s,i,b);
        resetSslSocketSslParameters(sock);
        return sock;
    }

    @Override
    public Socket createSocket(String s, int i) throws IOException, UnknownHostException {
        Socket sock = wrappedFactory.createSocket(s,i);
        return resetSslSocketSslParameters(sock);
    }

    @Override
    public Socket createSocket(String s, int i, InetAddress inetAddress, int i1) throws IOException, UnknownHostException {
        Socket sock = wrappedFactory.createSocket(s,i,inetAddress,i1);
        return resetSslSocketSslParameters(sock);
    }

    @Override
    public Socket createSocket(InetAddress inetAddress, int i) throws IOException {
        Socket sock = wrappedFactory.createSocket(inetAddress,i);
        return resetSslSocketSslParameters(sock);
    }

    @Override
    public Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress1, int i1) throws IOException {
        Socket sock = wrappedFactory.createSocket(inetAddress,i,inetAddress1,i1);
        return resetSslSocketSslParameters(sock);
    }

    private Socket resetSslSocketSslParameters(Socket socket){
        if (socket instanceof  SSLSocket) {
            ((SSLSocket) socket).setSSLParameters(this.sslParameters);
        }
        return socket;
    }
}
