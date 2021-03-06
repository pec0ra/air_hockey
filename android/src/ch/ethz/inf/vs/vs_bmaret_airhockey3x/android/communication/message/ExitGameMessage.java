package ch.ethz.inf.vs.vs_bmaret_airhockey3x.android.communication.message;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by Valentin on 03/12/15.
 *
 * Use to invite someone into the game. The other player can deduce where the inviter is positioned
 * by this message.
 * No special functionality in here; Consider making one class for all classes that have no special
 * functionality.
 */
public class ExitGameMessage extends Message {

    public ExitGameMessage(int receiverPos)
    {
        super(receiverPos, Message.EXIT_GAME_MSG);

        try {
            mBody = new JSONObject();
            mMsg.put(BODY_KEY,mBody);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public ExitGameMessage(Message msg)
    {
        super(msg);
        try {
            mBody = new JSONObject();
            mBody = mMsg.getJSONObject(BODY_KEY);
        } catch (JSONException e) {e.printStackTrace();}
    }

}
