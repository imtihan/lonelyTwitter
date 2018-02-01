
/*
 * ImportantTweet
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
 * Represents an important tweet,
 * extended from tweet
 *
 * @author imtihan
 * @version 1.0
 * @see Tweet
 */
public class ImportantTweet extends Tweet {

    /**
     * Constructs an important tweet object with just a message
     *
     * @param message is the tweet message
     */
    ImportantTweet(String message){
        super(message);
    }

    /**
     * Constructs an important tweet object with date and message
     *
     * @param message is the tweet message
     * @param date is the tweet date
     */
    ImportantTweet(String message, Date date){
        super(message, date);
    }

    /**
     * Overrides the method from the tweet class
     * to return true since this is an important message
     *
     * @return
     */
    @Override
    public boolean IsImportant() {
        return true;
    }

}
