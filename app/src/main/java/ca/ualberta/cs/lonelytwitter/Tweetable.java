package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by romansky on 1/14/16.
 */
public interface Tweetable {
    String getMessage();
    Date getDate();

    //removed redundant public modifier from the above two interfaces
}
