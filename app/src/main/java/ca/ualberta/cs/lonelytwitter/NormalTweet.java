
/*
 * NormalTweet
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
 * Represents a normal tweet,
 * extended from tweet
 *
 * @author imtihan
 * @version 1.0
 * @see Tweet
 *
 */

public class NormalTweet extends Tweet {

    /**
     * Constructs a normal tweet with a message
     *
     * @param message is the tweet message
     */
    NormalTweet(String message){
        super(message);
    }

    /**
     * Constructs a normal tweet with a date and message
     *
     * @param message is the tweet message
     * @param date is the date of the message
     */
    NormalTweet(String message, Date date){
        super(message, date);
    }

    /**
     * Method describing if the tweet is important or not
     *
     * @return returns false since this is a normal tweet
     */
    @Override
    public boolean IsImportant() {
        return false;
    }

}
