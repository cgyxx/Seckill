package com.suixingpay.service;


public interface IMailService {


    String sendSimpleMail(String from, String to, String subject, String content);
    String sendHtmlMail(String from, String to, String subject, String content);
    String sendAttachmentsMail(String from, String to, String subject, String content, String filePath);
}