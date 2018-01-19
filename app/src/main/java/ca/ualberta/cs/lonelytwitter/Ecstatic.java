package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by imtih on 2018-01-19.
 */

public class Ecstatic extends Mood {
    Ecstatic(String mood){
        super("Ecstatic");
    }

    Ecstatic(String mood, Date date){
        super("Ecstatic", date);
    }

    public String getMood(){
        return mood + ":DD";
    }
}
