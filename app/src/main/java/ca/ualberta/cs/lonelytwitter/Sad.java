package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by imtih on 2018-01-19.
 */

public class Sad extends Mood {
    Sad(String mood){
        super("sad");
    }

    Sad(String mood, Date date){
        super(mood, date);
    }

    public String getMood(){
        return mood + ":`(";
    }
}
