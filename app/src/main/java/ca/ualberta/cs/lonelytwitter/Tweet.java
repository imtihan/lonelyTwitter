package ca.ualberta.cs.lonelytwitter;

/**
 * Created by imtih on 2018-01-17.
 */

import java.util.Date;

public abstract class Tweet implements Tweetable {

    private String message;
    private Date date;

    public Tweet(){

    }

    public Tweet(String message){
        this.message = message;
    }

    public Tweet(String message, Date date){
        this.message = message;
        this.date = date;
    }

    public Date getDate(){
        return date;
    }

    public String getMessage(){
        return message;
    }

    public void setMessage(String message) throws TweetTooLongException{
        if(message.length() > 160){
            //throw an error
            throw new TweetTooLongException();
        }

        this.message = message;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString(){
       return message;
    }

    public abstract boolean IsImportant();
}
