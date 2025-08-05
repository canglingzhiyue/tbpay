package com.taobao.android.preview;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import org.json.JSONException;
import org.json.JSONObject;
import tb.kge;

/* loaded from: classes6.dex */
public class CustomFrameLayout extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final String TAG;
    public boolean isConsumed;
    public Runnable runnable;
    public float x;
    public float y;

    static {
        kge.a(-1951709012);
    }

    public static /* synthetic */ Object ipc$super(CustomFrameLayout customFrameLayout, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode != -1447998406) {
            if (hashCode == -407533570) {
                return new Boolean(super.onInterceptTouchEvent((MotionEvent) objArr[0]));
            }
            if (hashCode != 2075560917) {
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            }
            return new Boolean(super.dispatchTouchEvent((MotionEvent) objArr[0]));
        }
        return new Boolean(super.onTouchEvent((MotionEvent) objArr[0]));
    }

    public CustomFrameLayout(Context context) {
        super(context);
        this.TAG = getClass().getName();
        this.isConsumed = false;
        this.runnable = new Runnable() { // from class: com.taobao.android.preview.CustomFrameLayout.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                CustomFrameLayout customFrameLayout = CustomFrameLayout.this;
                customFrameLayout.isConsumed = true;
                try {
                    new JSONObject(customFrameLayout.getContentDescription().toString()).toString(4);
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        };
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("7bb68bd5", new Object[]{this, motionEvent})).booleanValue() : super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e7b587fe", new Object[]{this, motionEvent})).booleanValue();
        }
        if (motionEvent.getAction() == 0) {
            this.x = motionEvent.getX();
            this.y = motionEvent.getY();
            this.isConsumed = false;
            getHandler().postDelayed(this.runnable, 1500L);
            return super.onInterceptTouchEvent(motionEvent);
        } else if (motionEvent.getAction() == 1) {
            if (this.isConsumed) {
                return true;
            }
            getHandler().removeCallbacks(this.runnable);
            return super.onInterceptTouchEvent(motionEvent);
        } else if (motionEvent.getAction() == 2 && Math.abs(motionEvent.getX() - this.x) > 32.0f && Math.abs(motionEvent.getY() - this.y) > 32.0f && !this.isConsumed) {
            getHandler().removeCallbacks(this.runnable);
            return super.onInterceptTouchEvent(motionEvent);
        } else if (motionEvent.getAction() == 3) {
            if (this.isConsumed) {
                return true;
            }
            getHandler().removeCallbacks(this.runnable);
            return super.onInterceptTouchEvent(motionEvent);
        } else {
            return super.onInterceptTouchEvent(motionEvent);
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a9b14c3a", new Object[]{this, motionEvent})).booleanValue() : super.onTouchEvent(motionEvent);
    }
}
