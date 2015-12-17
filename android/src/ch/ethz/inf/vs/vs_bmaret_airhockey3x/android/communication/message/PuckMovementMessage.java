package ch.ethz.inf.vs.vs_bmaret_airhockey3x.android.communication.message;

import android.graphics.Point;

import com.badlogic.gdx.math.Vector2;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.Vector;

/**
 * Created by Rimle on 09.12.2015.
 *
 * subclass of Message
 * creates messages with information about the puck such es direction and speed, which can be sent to other players potentially receiving the puck
 *
 */

public class PuckMovementMessage extends Message {

    // Keys occuring in msg
    protected final static String SPEED_KEY = "speed";
    protected final static String DIRECTION_KEY= "direction";
    protected final static String ENTRY_POINT_KEY = "entry_point";

    // TODO: we can change this later if we need more or different information
    /*
    double speed;
    Point entryPoint;
    Vector direction;
    */

    public Vector2 mPosition;
    public Vector2 mVelocity;

    /*
    public PuckMovementMessage(int receiverPos, Point entryPoint, Vector direction, double speed){
        super(receiverPos, Message.PUCK_MOVEMENT_MSG);
        this.speed = speed;
        this.entryPoint = entryPoint;
        this.direction = direction;

        try {
            mBody = new JSONObject();
            mBody.put(ENTRY_POINT_KEY, entryPoint);
            mBody.put(DIRECTION_KEY, direction);
            mBody.put(SPEED_KEY, speed);

            mMsg.put(BODY_KEY, mBody);

        } catch (JSONException e) {
            e.printStackTrace();
        }

    }
    */

    public PuckMovementMessage(int receiverPos, Vector2 position, Vector2 velocity)
    {
        super(receiverPos,Message.PUCK_MOVEMENT_MSG);
        mPosition = position;
        mVelocity = velocity;


    }


    public PuckMovementMessage(Message msg)
    {
        super(msg);
    }



}
