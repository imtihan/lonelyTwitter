package ca.ualberta.cs.lonelytwitter;

/**
 * Created by imtih on 2018-01-17.
 */

public interface Tweetable {
    public String getMessage();
    public void setMessage(String message) throws TweetTooLongException;
}
