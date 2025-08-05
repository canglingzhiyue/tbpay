package com.taobao.android.fluid.framework.container.render.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.RelativeLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;
import tb.sjz;
import tb.ske;

/* loaded from: classes5.dex */
public class MultiTabLayout extends RelativeLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private ske callback;
    private int currentHeight;
    private int currentWidth;
    private sjz horizontalSlideCallback;
    private boolean isLockedTouchEvent;
    private int motionEventAction;
    private final a pullLeftHelper;

    static {
        kge.a(-742397266);
    }

    public static /* synthetic */ Object ipc$super(MultiTabLayout multiTabLayout, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1447998406:
                return new Boolean(super.onTouchEvent((MotionEvent) objArr[0]));
            case -407533570:
                return new Boolean(super.onInterceptTouchEvent((MotionEvent) objArr[0]));
            case 650865254:
                super.onMeasure(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
                return null;
            case 2075560917:
                return new Boolean(super.dispatchTouchEvent((MotionEvent) objArr[0]));
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    public static /* synthetic */ sjz access$000(MultiTabLayout multiTabLayout) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (sjz) ipChange.ipc$dispatch("7900aea7", new Object[]{multiTabLayout}) : multiTabLayout.horizontalSlideCallback;
    }

    public MultiTabLayout(Context context) {
        super(context);
        this.isLockedTouchEvent = false;
        this.motionEventAction = -1;
        this.pullLeftHelper = new a(this) { // from class: com.taobao.android.fluid.framework.container.render.view.MultiTabLayout.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.fluid.framework.container.render.view.a
            public void a() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                } else if (MultiTabLayout.access$000(MultiTabLayout.this) == null) {
                } else {
                    MultiTabLayout.access$000(MultiTabLayout.this).b();
                }
            }
        };
    }

    public MultiTabLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.isLockedTouchEvent = false;
        this.motionEventAction = -1;
        this.pullLeftHelper = new a(this) { // from class: com.taobao.android.fluid.framework.container.render.view.MultiTabLayout.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.fluid.framework.container.render.view.a
            public void a() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                } else if (MultiTabLayout.access$000(MultiTabLayout.this) == null) {
                } else {
                    MultiTabLayout.access$000(MultiTabLayout.this).b();
                }
            }
        };
    }

    public MultiTabLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.isLockedTouchEvent = false;
        this.motionEventAction = -1;
        this.pullLeftHelper = new a(this) { // from class: com.taobao.android.fluid.framework.container.render.view.MultiTabLayout.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.fluid.framework.container.render.view.a
            public void a() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                } else if (MultiTabLayout.access$000(MultiTabLayout.this) == null) {
                } else {
                    MultiTabLayout.access$000(MultiTabLayout.this).b();
                }
            }
        };
    }

    public boolean isTouchOnView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b0fa71c4", new Object[]{this})).booleanValue();
        }
        int i = this.motionEventAction;
        return i == 0 || i == 2;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7bb68bd5", new Object[]{this, motionEvent})).booleanValue();
        }
        this.motionEventAction = motionEvent.getAction();
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e7b587fe", new Object[]{this, motionEvent})).booleanValue();
        }
        if (this.isLockedTouchEvent) {
            return false;
        }
        if (this.horizontalSlideCallback != null) {
            return this.pullLeftHelper.a(motionEvent);
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9b14c3a", new Object[]{this, motionEvent})).booleanValue();
        }
        if (this.isLockedTouchEvent) {
            return false;
        }
        if (this.horizontalSlideCallback != null) {
            return this.pullLeftHelper.b(motionEvent);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setHorizontalSlideCallback(sjz sjzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9ebeca4", new Object[]{this, sjzVar});
        } else {
            this.horizontalSlideCallback = sjzVar;
        }
    }

    public void setLockedTouchEvent(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf9e29c6", new Object[]{this, new Boolean(z)});
        } else {
            this.isLockedTouchEvent = z;
        }
    }

    public void setSizeChangedCallback(ske skeVar) {
        int i;
        ske skeVar2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ae7d7e0", new Object[]{this, skeVar});
            return;
        }
        this.callback = skeVar;
        int i2 = this.currentWidth;
        if (i2 <= 0 || (i = this.currentHeight) <= 0 || (skeVar2 = this.callback) == null) {
            return;
        }
        skeVar2.a(i2, i);
    }

    @Override // android.widget.RelativeLayout, android.view.View
    public void onMeasure(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        super.onMeasure(i, i2);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (this.currentWidth == measuredWidth && this.currentHeight == measuredHeight) {
            return;
        }
        this.currentWidth = measuredWidth;
        this.currentHeight = measuredHeight;
        ske skeVar = this.callback;
        if (skeVar == null) {
            return;
        }
        skeVar.a(measuredWidth, measuredHeight);
    }
}
