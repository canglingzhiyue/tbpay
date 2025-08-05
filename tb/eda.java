package tb;

import android.view.MotionEvent;

/* loaded from: classes4.dex */
public interface eda {
    void afterDispatchTouchEvent(MotionEvent motionEvent);

    void afterOnTouchEvent(MotionEvent motionEvent);

    void beforeDispatchTouchEvent(MotionEvent motionEvent);

    void beforeOnTouchEvent(MotionEvent motionEvent);
}
