package wycliffe.com.iknowyourtouch;

import android.view.GestureDetector;
import android.view.MotionEvent;

/**
 * Created by Wycliffe on 9/28/2017.
 */

public class GestureListener extends GestureDetector.SimpleOnGestureListener {

    static String currentGestureDetected;

    // Override s all the callback methods of GestureDetector.SimpleOnGestureListener
    @Override
    public boolean onSingleTapUp(MotionEvent ev) {
        currentGestureDetected=ev.toString();

        return true;
    }
    @Override
    public void onShowPress(MotionEvent ev) {
        currentGestureDetected=ev.toString();

    }
    @Override
    public void onLongPress(MotionEvent ev) {
        currentGestureDetected=ev.toString();

    }
    @Override
    public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX, float distanceY) {
        currentGestureDetected=e1.toString()+ "  "+e2.toString();

        return true;
    }
    @Override
    public boolean onDown(MotionEvent ev) {
        currentGestureDetected=ev.toString();

        return true;
    }
    @Override
    public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
        currentGestureDetected=e1.toString()+ "  "+e2.toString();
        return true;
    }

    @Override
    public boolean onDoubleTap(MotionEvent ev) {
        currentGestureDetected=ev.toString();
        return true;
    }

    @Override
    public boolean onDoubleTapEvent(MotionEvent ev) {
        currentGestureDetected=ev.toString();
        return true;
    }
}
