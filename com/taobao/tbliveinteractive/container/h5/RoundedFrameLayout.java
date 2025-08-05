package com.taobao.tbliveinteractive.container.h5;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.support.design.widget.BottomSheetBehavior;
import android.support.v4.widget.ViewDragHelper;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.taolive.sdk.utils.u;
import com.taobao.taolivecontainer.TBLiveH5Container;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import tb.kge;
import tb.phg;

/* loaded from: classes8.dex */
public class RoundedFrameLayout extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private float[] mCornerRadii;
    private float mLastEvY;
    private Boolean needScroll;
    public Path path;
    private boolean supportScroll;

    static {
        kge.a(-1775209980);
    }

    public static /* synthetic */ Object ipc$super(RoundedFrameLayout roundedFrameLayout, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 623593120) {
            super.dispatchDraw((Canvas) objArr[0]);
            return null;
        } else if (hashCode == 1389530587) {
            super.onSizeChanged(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue());
            return null;
        } else if (hashCode != 2075560917) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            return new Boolean(super.dispatchTouchEvent((MotionEvent) objArr[0]));
        }
    }

    public void setSupportScroll(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("53357533", new Object[]{this, new Boolean(z)});
        } else {
            this.supportScroll = z;
        }
    }

    public void setCornerRadii(float[] fArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9100fcf0", new Object[]{this, fArr});
        } else {
            this.mCornerRadii = fArr;
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52d28ddb", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        super.onSizeChanged(i, i2, i3, i4);
        this.path = new Path();
        this.path.addRoundRect(new RectF(0.0f, 0.0f, i, i2), this.mCornerRadii, Path.Direction.CW);
    }

    public RoundedFrameLayout(Context context) {
        super(context);
        this.mCornerRadii = new float[8];
        this.mLastEvY = 0.0f;
        this.needScroll = null;
        this.supportScroll = false;
    }

    public RoundedFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mCornerRadii = new float[8];
        this.mLastEvY = 0.0f;
        this.needScroll = null;
        this.supportScroll = false;
    }

    public RoundedFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mCornerRadii = new float[8];
        this.mLastEvY = 0.0f;
        this.needScroll = null;
        this.supportScroll = false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        TBLiveH5Container tBLiveH5Container;
        Boolean bool;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7bb68bd5", new Object[]{this, motionEvent})).booleanValue();
        }
        int actionMasked = motionEvent.getActionMasked();
        ViewGroup viewGroup = (ViewGroup) getParent();
        BottomSheetBehavior b = BottomSheetBehavior.b((FrameLayout) viewGroup);
        if (actionMasked == 0) {
            if (u.bc() && this.supportScroll && 4 == b.d()) {
                viewGroup.requestDisallowInterceptTouchEvent(false);
            } else {
                viewGroup.requestDisallowInterceptTouchEvent(true);
                if (phg.d().a()) {
                    saveInitialMotion(b, motionEvent);
                }
            }
            this.mLastEvY = motionEvent.getY();
        } else if (1 == actionMasked || 3 == actionMasked) {
            this.mLastEvY = 0.0f;
            viewGroup.requestDisallowInterceptTouchEvent(false);
        } else if (2 == actionMasked) {
            float y = motionEvent.getY();
            boolean z = y > this.mLastEvY;
            this.mLastEvY = y;
            if (3 == b.d() && (tBLiveH5Container = (TBLiveH5Container) findViewById(R.id.web)) != null) {
                if (u.bc() && (bool = this.needScroll) != null) {
                    viewGroup.requestDisallowInterceptTouchEvent(!bool.booleanValue());
                    return super.dispatchTouchEvent(motionEvent);
                } else if ((z && canScrollVertically(tBLiveH5Container, -1)) || (!z && canScrollVertically(tBLiveH5Container, 1))) {
                    viewGroup.requestDisallowInterceptTouchEvent(true);
                    return super.dispatchTouchEvent(motionEvent);
                }
            }
            viewGroup.requestDisallowInterceptTouchEvent(false);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    private void saveInitialMotion(BottomSheetBehavior bottomSheetBehavior, MotionEvent motionEvent) {
        try {
            Field declaredField = BottomSheetBehavior.class.getDeclaredField("viewDragHelper");
            declaredField.setAccessible(true);
            Method declaredMethod = ViewDragHelper.class.getDeclaredMethod("saveInitialMotion", Float.TYPE, Float.TYPE, Integer.TYPE);
            declaredMethod.setAccessible(true);
            declaredMethod.invoke((ViewDragHelper) declaredField.get(bottomSheetBehavior), Float.valueOf(motionEvent.getX()), Float.valueOf(motionEvent.getY()), Integer.valueOf(motionEvent.getPointerId(0)));
        } catch (Throwable unused) {
        }
    }

    public void setNeedScroll(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cac78148", new Object[]{this, new Boolean(z)});
            return;
        }
        Log.e("RoundedFrameLayout", "needScroll:" + z);
        this.needScroll = Boolean.valueOf(z);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("252b46a0", new Object[]{this, canvas});
            return;
        }
        canvas.save();
        canvas.clipPath(this.path);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    private boolean canScrollVertically(TBLiveH5Container tBLiveH5Container, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4ac94bbe", new Object[]{this, tBLiveH5Container, new Integer(i)})).booleanValue();
        }
        int childCount = tBLiveH5Container.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            if (tBLiveH5Container.getChildAt(i2).canScrollVertically(i)) {
                return true;
            }
        }
        return false;
    }
}
