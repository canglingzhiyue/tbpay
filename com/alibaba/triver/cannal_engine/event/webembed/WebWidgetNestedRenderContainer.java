package com.alibaba.triver.cannal_engine.event.webembed;

import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import com.alibaba.triver.cannal_engine.TRWidgetInstance;
import com.alibaba.triver.cannal_engine.event.WidgetRenderContainer;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes3.dex */
public class WebWidgetNestedRenderContainer extends WidgetRenderContainer {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private TRWidgetInstance mInstance;
    private boolean needDispatchTouchEvent;
    private float startX;
    private float startY;
    private boolean touchMoveDispatched;

    /* renamed from: com.alibaba.triver.cannal_engine.event.webembed.WebWidgetNestedRenderContainer$1  reason: invalid class name */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f3643a = new int[WidgetRenderContainer.GestureMode.values().length];

        static {
            try {
                f3643a[WidgetRenderContainer.GestureMode.ALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3643a[WidgetRenderContainer.GestureMode.HORIZONTAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3643a[WidgetRenderContainer.GestureMode.VERTICAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f3643a[WidgetRenderContainer.GestureMode.DEFAULT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    static {
        kge.a(1941311044);
    }

    public static /* synthetic */ Object ipc$super(WebWidgetNestedRenderContainer webWidgetNestedRenderContainer, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 348684699) {
            super.onVisibilityChanged((View) objArr[0], ((Number) objArr[1]).intValue());
            return null;
        } else if (hashCode != 877943481) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            return new Boolean(super.dispatchWidgetTouchEvent((MotionEvent) objArr[0]));
        }
    }

    public WebWidgetNestedRenderContainer(Context context) {
        super(context);
        this.needDispatchTouchEvent = false;
        this.touchMoveDispatched = false;
    }

    public WebWidgetNestedRenderContainer(Context context, WidgetRenderContainer.GestureMode gestureMode) {
        super(context, gestureMode);
        this.needDispatchTouchEvent = false;
        this.touchMoveDispatched = false;
    }

    public void setWidget(TRWidgetInstance tRWidgetInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("189bbc70", new Object[]{this, tRWidgetInstance});
        } else {
            this.mInstance = tRWidgetInstance;
        }
    }

    @Override // android.view.View
    public void onVisibilityChanged(View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14c8819b", new Object[]{this, view, new Integer(i)});
            return;
        }
        super.onVisibilityChanged(view, i);
        if (this.mInstance == null || view.getParent() == null || !(view.getContext() instanceof Activity) || ((Activity) view.getContext()).getWindow().getDecorView() == view) {
            return;
        }
        this.mInstance.onVisibilityChanged(i);
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
            this.touchMoveDispatched = false;
            this.needDispatchTouchEvent = false;
            if (touchEditText(this, motionEvent) != null) {
                return super.dispatchWidgetTouchEvent(motionEvent);
            }
            super.dispatchWidgetTouchEvent(motionEvent);
            return false;
        } else if (action == 1) {
            if (this.needDispatchTouchEvent) {
                return super.dispatchWidgetTouchEvent(motionEvent);
            }
            super.dispatchWidgetTouchEvent(motionEvent);
            return false;
        } else if (action != 2) {
            if (action == 3) {
                return super.dispatchWidgetTouchEvent(motionEvent);
            }
            super.dispatchWidgetTouchEvent(motionEvent);
            return false;
        } else {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            float f = x - this.startX;
            float f2 = y - this.startY;
            if (!this.touchMoveDispatched) {
                this.touchMoveDispatched = true;
                this.needDispatchTouchEvent = needDispatchTouchEvent(f, f2).booleanValue();
            }
            if (!this.needDispatchTouchEvent) {
                return false;
            }
            return super.dispatchWidgetTouchEvent(motionEvent);
        }
    }

    private Boolean needDispatchTouchEvent(float f, float f2) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("436be16f", new Object[]{this, new Float(f), new Float(f2)});
        }
        int i = AnonymousClass1.f3643a[this.mGestureMode.ordinal()];
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

    private View touchEditText(View view, MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("9d97e90c", new Object[]{this, view, motionEvent});
        }
        if (view instanceof EditText) {
            if (!a.a(view, motionEvent.getRawX(), motionEvent.getRawY())) {
                return null;
            }
            return view;
        } else if (!(view instanceof ViewGroup)) {
            return null;
        } else {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                if ((childAt instanceof EditText) && a.a(childAt, motionEvent.getRawX(), motionEvent.getRawY())) {
                    return childAt;
                }
                View view2 = touchEditText(childAt, motionEvent);
                if (view2 != null) {
                    return view2;
                }
            }
            return null;
        }
    }
}
