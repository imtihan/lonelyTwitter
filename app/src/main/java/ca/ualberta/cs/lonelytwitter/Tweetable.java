/*
 * Tweetable
 *
 * January 31, 2018
 *
 * Copyright  Ⓒ 2018 Team X, CMPUT301, University of Alberta - All Rights Reserved.
 * You may use, distribute, or modify this code unders terms and conditions of the Code of Student Behaviour at University of Alberta.
 * You can find a copy of the license in this project. Otherwise please contact contact@abc.ca.
 */

package ca.ualberta.cs.lonelytwitter;


/**
 * Interface class with the following methods.
 *
 * @author imtihan
 * @version 1.0
 * @since January 30, 2018
 */

public interface Tweetable {

    /**
     * Defines a getter for a message
     *
     * @return a message string
     */
    public String getMessage();

    /**
     * Defines a setter for a message
     * @param message is the message string
     * @throws TweetTooLongException if message is too long
     */
    public void setMessage(String message) throws TweetTooLongException;
}
