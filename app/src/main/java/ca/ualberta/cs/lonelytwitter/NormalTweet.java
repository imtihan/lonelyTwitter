package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by imtih on 2018-01-17.
 */

public class NormalTweet extends Tweet {
    NormalTweet(String message){
        super(message);
    }

    NormalTweet(String message, Date date){
        super(message, date);
    }

    @Override
    public boolean IsImportant() {
        return false;
    }

}
