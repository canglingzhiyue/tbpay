package com.alibaba.triver.triver_shop.newShop;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.alibaba.triver.triver_shop.newShop.ext.o;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes3.dex */
public final class ClickView extends View {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private View.OnClickListener clickListener;
    private float downX;
    private float downY;
    private long lastTimeDown;

    static {
        kge.a(1723751468);
    }

    public static /* synthetic */ Object ipc$super(ClickView clickView, String str, Object... objArr) {
        if (str.hashCode() == 2075560917) {
            return new Boolean(super.dispatchTouchEvent((MotionEvent) objArr[0]));
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public ClickView(Context context) {
        super(context);
    }

    public ClickView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ClickView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public ClickView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    @Override // android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        View.OnClickListener onClickListener;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7bb68bd5", new Object[]{this, motionEvent})).booleanValue();
        }
        if (motionEvent == null) {
            return super.dispatchTouchEvent(motionEvent);
        }
        if (motionEvent.getAction() == 0) {
            this.lastTimeDown = System.currentTimeMillis();
            this.downX = motionEvent.getRawX();
            this.downY = motionEvent.getRawY();
        }
        if (motionEvent.getAction() == 1 && System.currentTimeMillis() - this.lastTimeDown <= 700 && clickDistanceValid(motionEvent.getRawX(), motionEvent.getRawY()) && (onClickListener = this.clickListener) != null) {
            onClickListener.onClick(this);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    private final boolean clickDistanceValid(float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("68815fea", new Object[]{this, new Float(f), new Float(f2)})).booleanValue();
        }
        float abs = Math.abs(f - this.downX);
        float abs2 = Math.abs(f2 - this.downY);
        return o.b(Float.valueOf((float) Math.sqrt((double) ((abs * abs) + (abs2 * abs2))))) <= 15;
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8408cbf7", new Object[]{this, onClickListener});
            return;
        }
        this.clickListener = onClickListener;
        setClickable(true);
    }
}
