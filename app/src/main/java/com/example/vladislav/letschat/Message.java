package com.example.vladislav.letschat;
import java.util.Date;
/**
 * Created by Vladislav on 5/27/2016.
 */
public class Message {

    private String mText;
    private String mSender;
    private String mReceiver;
    private Date mDate;


    public Date getDate() {
        return mDate;
    }

    public void setDate(Date date) {
        mDate = date;
    }

    public String getText() {
        return mText;
    }

    public void setText(String text) {
        mText = text;
    }

    public String getSender() {
        return mSender;
    }

    public void setSender(String sender) {
        mSender = sender;
    }

    public String getReceiver(){
        return mReceiver;
    }

    public void setReceiver(String receiver){
        mReceiver = receiver;
    }
}

