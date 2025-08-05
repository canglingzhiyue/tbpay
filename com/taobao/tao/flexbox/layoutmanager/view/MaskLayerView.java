package com.taobao.tao.flexbox.layoutmanager.view;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;
import tb.oeb;
import tb.ohl;

/* loaded from: classes8.dex */
public class MaskLayerView extends FlatViewGroup {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private float checkAlpha;
    private boolean disableDispatchTouch;
    private boolean hitChild;
    private boolean openCheckAlphaSwitch;
    private boolean satisfyCheckAlpha;

    static {
        kge.a(57210121);
    }

    public static /* synthetic */ Object ipc$super(MaskLayerView maskLayerView, String str, Object... objArr) {
        if (str.hashCode() == 2075560917) {
            return new Boolean(super.dispatchTouchEvent((MotionEvent) objArr[0]));
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.view.FlatViewGroup, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9b14c3a", new Object[]{this, motionEvent})).booleanValue();
        }
        return false;
    }

    public MaskLayerView(Context context) {
        super(context);
        this.hitChild = false;
        this.satisfyCheckAlpha = true;
        try {
            this.disableDispatchTouch = oeb.a(context);
            this.openCheckAlphaSwitch = oeb.h();
        } catch (Throwable unused) {
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.view.FlatViewGroup, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7bb68bd5", new Object[]{this, motionEvent})).booleanValue();
        }
        if (motionEvent.getAction() == 0) {
            this.hitChild = false;
            this.satisfyCheckAlpha = true;
            if (this.openCheckAlphaSwitch && ohl.a(this, (int) motionEvent.getX(), (int) motionEvent.getY()) < ((int) (this.checkAlpha * 255.0f))) {
                this.satisfyCheckAlpha = false;
            }
            if (this.satisfyCheckAlpha) {
                float rawX = motionEvent.getRawX();
                float rawY = motionEvent.getRawY();
                int i = 0;
                while (true) {
                    if (i >= getChildCount()) {
                        break;
                    }
                    View childAt = getChildAt(i);
                    int[] iArr = new int[2];
                    childAt.getLocationOnScreen(iArr);
                    if (iArr[0] <= rawX && rawX <= iArr[0] + childAt.getWidth() && iArr[1] <= rawY && rawY <= iArr[1] + childAt.getHeight()) {
                        this.hitChild = true;
                        break;
                    }
                    i++;
                }
            }
        }
        if (this.disableDispatchTouch) {
            if (!this.satisfyCheckAlpha) {
                return false;
            }
            return super.dispatchTouchEvent(motionEvent);
        } else if (!this.hitChild) {
            return false;
        } else {
            return super.dispatchTouchEvent(motionEvent);
        }
    }

    public void setCheckAlpha(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("17d96fe1", new Object[]{this, new Float(f)});
        } else {
            this.checkAlpha = f;
        }
    }
}
