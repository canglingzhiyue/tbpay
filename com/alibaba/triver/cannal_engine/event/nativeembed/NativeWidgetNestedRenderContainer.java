package com.alibaba.triver.cannal_engine.event.nativeembed;

import android.content.Context;
import android.view.MotionEvent;
import com.alibaba.triver.cannal_engine.event.WidgetRenderContainer;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes3.dex */
public class NativeWidgetNestedRenderContainer extends WidgetRenderContainer {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private float startX;
    private float startY;

    /* renamed from: com.alibaba.triver.cannal_engine.event.nativeembed.NativeWidgetNestedRenderContainer$1  reason: invalid class name */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f3642a = new int[WidgetRenderContainer.GestureMode.values().length];

        static {
            try {
                f3642a[WidgetRenderContainer.GestureMode.ALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3642a[WidgetRenderContainer.GestureMode.HORIZONTAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3642a[WidgetRenderContainer.GestureMode.VERTICAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f3642a[WidgetRenderContainer.GestureMode.DEFAULT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    static {
        kge.a(-1105465366);
    }

    public static /* synthetic */ Object ipc$super(NativeWidgetNestedRenderContainer nativeWidgetNestedRenderContainer, String str, Object... objArr) {
        if (str.hashCode() == 877943481) {
            return new Boolean(super.dispatchWidgetTouchEvent((MotionEvent) objArr[0]));
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public NativeWidgetNestedRenderContainer(Context context) {
        super(context);
    }

    public NativeWidgetNestedRenderContainer(Context context, WidgetRenderContainer.GestureMode gestureMode) {
        super(context, gestureMode);
    }

    @Override // com.alibaba.triver.cannal_engine.event.WidgetRenderContainer
    public boolean dispatchWidgetTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("34545ab9", new Object[]{this, motionEvent})).booleanValue();
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.startX = motionEvent.getX();
            this.startY = motionEvent.getY();
            return super.dispatchWidgetTouchEvent(motionEvent);
        } else if (action == 2) {
            if (!needDispatchTouchEvent(motionEvent.getX() - this.startX, motionEvent.getY() - this.startY).booleanValue()) {
                return false;
            }
            interceptTouchEvent();
            return super.dispatchWidgetTouchEvent(motionEvent);
        } else {
            return super.dispatchWidgetTouchEvent(motionEvent);
        }
    }

    private Boolean needDispatchTouchEvent(float f, float f2) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("436be16f", new Object[]{this, new Float(f), new Float(f2)});
        }
        int i = AnonymousClass1.f3642a[this.mGestureMode.ordinal()];
        if (i == 1) {
            return true;
        }
        if (i == 2) {
            if (Math.abs(f) > Math.abs(f2)) {
                z = true;
            }
            return Boolean.valueOf(z);
        } else if (i == 3) {
            if (Math.abs(f) < Math.abs(f2)) {
                z = true;
            }
            return Boolean.valueOf(z);
        } else if (i == 4) {
            if (Math.abs(f) > Math.abs(f2) || this.gestureModeInner) {
                z = true;
            }
            return Boolean.valueOf(z);
        } else {
            return false;
        }
    }

    public void interceptTouchEvent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7fcf8304", new Object[]{this});
        } else if (getParent() == null) {
        } else {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
    }
}
