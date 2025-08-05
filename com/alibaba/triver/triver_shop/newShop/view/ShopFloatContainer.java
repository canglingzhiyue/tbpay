package com.alibaba.triver.triver_shop.newShop.view;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes3.dex */
public final class ShopFloatContainer extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private boolean canMove;
    private final DisplayMetrics displayMetrics;
    private int lastX;
    private int lastY;

    static {
        kge.a(-470928476);
    }

    public static /* synthetic */ Object ipc$super(ShopFloatContainer shopFloatContainer, String str, Object... objArr) {
        if (str.hashCode() == -1447998406) {
            return new Boolean(super.onTouchEvent((MotionEvent) objArr[0]));
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShopFloatContainer(Context context) {
        super(context);
        kotlin.jvm.internal.q.d(context, "context");
        this.displayMetrics = context.getResources().getDisplayMetrics();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9b14c3a", new Object[]{this, motionEvent})).booleanValue();
        }
        if (!this.canMove) {
            return super.onTouchEvent(motionEvent);
        }
        if (motionEvent == null) {
            return false;
        }
        int rawX = (int) motionEvent.getRawX();
        int rawY = (int) motionEvent.getRawY();
        if (!com.alibaba.triver.triver_shop.newShop.ext.o.a(this, rawX, rawY)) {
            return false;
        }
        if (motionEvent.getAction() == 2) {
            int measuredWidth = this.displayMetrics.widthPixels - getMeasuredWidth();
            int measuredHeight = this.displayMetrics.heightPixels - getMeasuredHeight();
            float translationX = getTranslationX() + (rawX - this.lastX);
            float translationY = getTranslationY() + (rawY - this.lastY);
            if (translationX < 0.0f) {
                translationX = 0.0f;
            }
            if (translationY < 0.0f) {
                translationY = 0.0f;
            }
            float f = measuredWidth;
            if (translationX <= f) {
                f = translationX;
            }
            float f2 = measuredHeight;
            if (translationY > f2) {
                translationY = f2;
            }
            setTranslationX(f);
            setTranslationY(translationY);
        }
        this.lastX = rawX;
        this.lastY = rawY;
        return true;
    }

    public final void setCanMove(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a771358e", new Object[]{this, new Boolean(z)});
        } else {
            this.canMove = z;
        }
    }
}
