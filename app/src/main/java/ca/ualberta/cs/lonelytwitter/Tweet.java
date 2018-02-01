/*
 * Tweet
 *
 * January 31, 2018
 *
 * Copyright  Ⓒ 2018 Team X, CMPUT301, University of Alberta - All Rights Reserved.
 * You may use, distribute, or modify this code unders terms and conditions of the Code of Student Behaviour at University of Alberta.
 * You can find a copy of the license in this project. Otherwise please contact contact@abc.ca.
 */

package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Represents a tweet.
 *
 * @author imtihan
 * @version 1
 * @see NormalTweet
 * @see ImportantTweet
 */

public abstract class Tweet implements Tweetable {

    private String message;
    private Date date;

    /**
     * Constructs an empty tweet object
     *
     */
    public Tweet(){

    }

    /**
     * Constructs a tweet object with only a message.
     *
     * @param message
     */
    public Tweet(String message){
        this.message = message;
    }

    /**
     * Constructs a tweet object with a date and message.
     *
     * @param message tweet message
     * @param date tweet date
     */
    public Tweet(String message, Date date){
        this.message = message;
        this.date = date;
    }

    /**
     * Getter for the date of the tweet
     *
     * @return Returns the date object of the tweet
     */
    public Date getDate(){
        return date;
    }

    /**
     * Getter for the tweet message
     *
     * @return Returns the message string
     */
    public String getMessage(){
        return message;
    }

    /**
     * Setter for the tweet message.
     *
     * @param message tweet message
     * @throws TweetTooLongException thrown if tweet exceeds 140 characters
     */
    public void setMessage(String message) throws TweetTooLongException{
        if(message.length() > 140){
            //throw an error
            throw new TweetTooLongException();
        }

        this.message = message;
    }

    /**
     * Setter for the date
     *
     * @param date is the date of the message
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * Indicates whether the tweet is important or normal
     *
     * @return True if the tweet is important, false otherwise
     */
    public abstract boolean IsImportant();
}
