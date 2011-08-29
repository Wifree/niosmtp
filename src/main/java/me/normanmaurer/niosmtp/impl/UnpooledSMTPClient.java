package me.normanmaurer.niosmtp.impl;

import java.io.InputStream;
import java.net.InetSocketAddress;
import java.util.List;
import java.util.concurrent.Future;

import me.normanmaurer.niosmtp.RecipientStatus;
import me.normanmaurer.niosmtp.SMTPClient;
import me.normanmaurer.niosmtp.SMTPClientConfig;

/**
 * {@link SMTPClient} implementation which will create a new Connection for every
 * {@link #deliver(InetSocketAddress, String, List, InputStream, SMTPClientConfig)} call. 
 * 
 * So no pooling is active
 * 
 * @author Norman Maurer
 *
 */
public class UnpooledSMTPClient implements SMTPClient{

    public Future<List<RecipientStatus>> deliver(InetSocketAddress host, String mailFrom, List<String> recipients, InputStream msg, SMTPClientConfig config) {
        
        // TODO Auto-generated method stub
        return null;
    }


}
