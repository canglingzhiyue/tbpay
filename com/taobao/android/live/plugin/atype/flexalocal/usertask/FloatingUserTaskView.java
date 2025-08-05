package com.taobao.android.live.plugin.atype.flexalocal.usertask;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.BounceInterpolator;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.fullscreen.FullScreenFrame;
import tb.kge;

/* loaded from: classes6.dex */
public class FloatingUserTaskView extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static float sX;
    public static float sY;
    private boolean isDrug;
    private b mIUserTaskEntryClickListener;
    private c mIUserTaskEventListener;
    private d mIUserTaskPosChanged;
    private float mLastRawX;
    private float mLastRawY;
    private int mRootMeasuredHeight;
    private int mRootMeasuredWidth;
    private int mRootTopY;

    public static /* synthetic */ Object ipc$super(FloatingUserTaskView floatingUserTaskView, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode != -1447998406) {
            if (hashCode != 2075560917) {
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            }
            return new Boolean(super.dispatchTouchEvent((MotionEvent) objArr[0]));
        }
        return new Boolean(super.onTouchEvent((MotionEvent) objArr[0]));
    }

    public View getView() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("576a35e4", new Object[]{this}) : this;
    }

    static {
        kge.a(641371566);
        sY = 0.0f;
        sX = -1.0f;
    }

    public FloatingUserTaskView(Context context) {
        this(context, null);
    }

    public FloatingUserTaskView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public FloatingUserTaskView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.isDrug = false;
        this.mRootMeasuredWidth = 0;
        this.mRootMeasuredHeight = 0;
        this.mRootTopY = 0;
        setClickable(true);
    }

    public void setIUserTaskEventListener(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e29d061d", new Object[]{this, cVar});
        } else {
            this.mIUserTaskEventListener = cVar;
        }
    }

    public void setIUserTaskEntryClickListener(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af093ce8", new Object[]{this, bVar});
        } else {
            this.mIUserTaskEntryClickListener = bVar;
        }
    }

    public void setIUserTaskPosChanged(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d604e75c", new Object[]{this, dVar});
        } else {
            this.mIUserTaskPosChanged = dVar;
        }
    }

    public void initView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55b93576", new Object[]{this, view});
            return;
        }
        removeAllViews();
        addView(view);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7bb68bd5", new Object[]{this, motionEvent})).booleanValue();
        }
        super.dispatchTouchEvent(motionEvent);
        return true;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int i;
        c cVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9b14c3a", new Object[]{this, motionEvent})).booleanValue();
        }
        float rawX = motionEvent.getRawX();
        float rawY = motionEvent.getRawY();
        int action = motionEvent.getAction();
        if (action == 0) {
            c cVar2 = this.mIUserTaskEventListener;
            if (cVar2 != null) {
                cVar2.a("com.taobao.taolive.room.disable_updown_switch", "");
                this.mIUserTaskEventListener.a(FullScreenFrame.EVENT_DISABLE_LEFTRIGHT_SWITCH, "");
            }
            this.isDrug = false;
            this.mLastRawX = rawX;
            this.mLastRawY = rawY;
            ViewGroup viewGroup = (ViewGroup) getParent();
            if (viewGroup != null) {
                int[] iArr = new int[2];
                viewGroup.getLocationInWindow(iArr);
                this.mRootMeasuredHeight = viewGroup.getMeasuredHeight();
                this.mRootMeasuredWidth = viewGroup.getMeasuredWidth();
                this.mRootTopY = iArr[1];
            }
        } else if (action == 1) {
            if (this.isDrug) {
                int i2 = this.mRootMeasuredWidth;
                if (this.mLastRawX <= i2 / 2) {
                    sX = 0.0f;
                    animate().setInterpolator(new BounceInterpolator()).setDuration(500L).x(0.0f).start();
                } else {
                    sX = i2 - getWidth();
                    animate().setInterpolator(new BounceInterpolator()).setDuration(500L).x(sX).start();
                }
            } else {
                b bVar = this.mIUserTaskEntryClickListener;
                if (bVar != null) {
                    bVar.a();
                }
            }
            c cVar3 = this.mIUserTaskEventListener;
            if (cVar3 != null) {
                cVar3.a("com.taobao.taolive.room.enable_updown_switch", "");
                this.mIUserTaskEventListener.a(FullScreenFrame.EVENT_ENABLE_LEFTRIGHT_SWITCH, "");
            }
            d dVar = this.mIUserTaskPosChanged;
            if (dVar != null) {
                dVar.a(sX, sY);
            }
        } else if (action != 2) {
            if (action == 3 && (cVar = this.mIUserTaskEventListener) != null) {
                cVar.a("com.taobao.taolive.room.enable_updown_switch", "");
                this.mIUserTaskEventListener.a(FullScreenFrame.EVENT_ENABLE_LEFTRIGHT_SWITCH, "");
            }
        } else if (rawX >= 0.0f && rawX <= this.mRootMeasuredWidth) {
            if (rawY >= this.mRootTopY && rawY <= this.mRootMeasuredHeight + i) {
                float f = rawX - this.mLastRawX;
                float f2 = rawY - this.mLastRawY;
                if (!this.isDrug) {
                    if (Math.sqrt((f * f) + (f2 * f2)) < 2.0d) {
                        this.isDrug = false;
                    } else {
                        this.isDrug = true;
                    }
                }
                float x = f + getX();
                float y = f2 + getY();
                float width = this.mRootMeasuredWidth - getWidth();
                float height = this.mRootMeasuredHeight - getHeight();
                if (x < 0.0f) {
                    x = 0.0f;
                } else if (x > width) {
                    x = width;
                }
                if (y < 0.0f) {
                    y = 0.0f;
                } else if (y > height) {
                    y = height;
                }
                sY = y;
                setX(x);
                setY(y);
                this.mLastRawX = rawX;
                this.mLastRawY = rawY;
            }
        }
        return this.isDrug || super.onTouchEvent(motionEvent);
    }
}
