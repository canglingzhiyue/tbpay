package com.taobao.android.order.bundle.widget;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import org.json.JSONObject;
import tb.hyq;
import tb.kge;

/* loaded from: classes6.dex */
public class OffsetBodyWrapper extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final String TAG;
    private boolean isResetRunning;
    private a mBusiness;
    private AKVerticalGestureHandler mGestureHandler;
    private boolean mInWeexContainer;
    private int mInitOffset;
    private int mMaxBodyOffset;

    /* loaded from: classes6.dex */
    public interface a {
        int a();

        void a(JSONObject jSONObject);

        int b();

        boolean c();

        void e();
    }

    static {
        kge.a(299661836);
        kge.a(1331046654);
    }

    public static /* synthetic */ Object ipc$super(OffsetBodyWrapper offsetBodyWrapper, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode != -1447998406) {
            if (hashCode != -407533570) {
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            }
            return new Boolean(super.onInterceptTouchEvent((MotionEvent) objArr[0]));
        }
        return new Boolean(super.onTouchEvent((MotionEvent) objArr[0]));
    }

    public static /* synthetic */ AKVerticalGestureHandler access$000(OffsetBodyWrapper offsetBodyWrapper) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AKVerticalGestureHandler) ipChange.ipc$dispatch("6b4d1f8", new Object[]{offsetBodyWrapper}) : offsetBodyWrapper.mGestureHandler;
    }

    public static /* synthetic */ boolean access$102(OffsetBodyWrapper offsetBodyWrapper, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7520edb", new Object[]{offsetBodyWrapper, new Boolean(z)})).booleanValue();
        }
        offsetBodyWrapper.isResetRunning = z;
        return z;
    }

    public void setBusiness(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("178b040f", new Object[]{this, aVar});
        } else {
            this.mBusiness = aVar;
        }
    }

    public a getBusiness() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("75adcaff", new Object[]{this}) : this.mBusiness;
    }

    public OffsetBodyWrapper(Context context) {
        super(context);
        this.TAG = "OffsetBodyWrapper";
        this.mInWeexContainer = false;
    }

    public OffsetBodyWrapper(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.TAG = "OffsetBodyWrapper";
        this.mInWeexContainer = false;
    }

    public OffsetBodyWrapper(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.TAG = "OffsetBodyWrapper";
        this.mInWeexContainer = false;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e7b587fe", new Object[]{this, motionEvent})).booleanValue();
        }
        AKVerticalGestureHandler aKVerticalGestureHandler = this.mGestureHandler;
        if (aKVerticalGestureHandler != null) {
            try {
                if (this.mInWeexContainer) {
                    return false;
                }
                return aKVerticalGestureHandler.b(motionEvent, this);
            } catch (Throwable th) {
                hyq.c(getContext(), "OffsetBodyWrapper", "onInterceptTouchEvent", "WRAPPER_INTERCEPT_ERROR", th.toString(), null);
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9b14c3a", new Object[]{this, motionEvent})).booleanValue();
        }
        AKVerticalGestureHandler aKVerticalGestureHandler = this.mGestureHandler;
        if (aKVerticalGestureHandler != null) {
            try {
                return aKVerticalGestureHandler.a(motionEvent, this);
            } catch (Throwable th) {
                hyq.c(getContext(), "OffsetBodyWrapper", "onTouchEvent", "WRAPPER_TOUCH_ERROR", th.toString(), null);
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setGestureHandler(AKVerticalGestureHandler aKVerticalGestureHandler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f44902a4", new Object[]{this, aKVerticalGestureHandler});
        } else {
            this.mGestureHandler = aKVerticalGestureHandler;
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79ab759a", new Object[]{this, new Boolean(z)});
            return;
        }
        AKVerticalGestureHandler aKVerticalGestureHandler = this.mGestureHandler;
        if (aKVerticalGestureHandler == null) {
            return;
        }
        aKVerticalGestureHandler.a(this, z);
    }

    public void resetState(final int i) {
        AKVerticalGestureHandler aKVerticalGestureHandler;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c34d01a", new Object[]{this, new Integer(i)});
        } else if (this.isResetRunning || (aKVerticalGestureHandler = this.mGestureHandler) == null || i == aKVerticalGestureHandler.a() || this.mGestureHandler.a() == 4) {
        } else {
            this.isResetRunning = true;
            post(new Runnable() { // from class: com.taobao.android.order.bundle.widget.OffsetBodyWrapper.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        if (((RecyclerView) OffsetBodyWrapper.this.getChildAt(0)).computeVerticalScrollOffset() == 0) {
                            OffsetBodyWrapper.access$000(OffsetBodyWrapper.this).a(i, OffsetBodyWrapper.this, 300.0f);
                        }
                    } catch (Throwable unused) {
                    }
                    OffsetBodyWrapper.access$102(OffsetBodyWrapper.this, false);
                }
            });
        }
    }

    public void initBodyWrapper(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1b9556", new Object[]{this, jSONObject});
            return;
        }
        a aVar = this.mBusiness;
        if (aVar == null) {
            return;
        }
        aVar.a(jSONObject);
        setBodyOffset();
    }

    public void updateBodyOffset() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("31e3cc05", new Object[]{this});
            return;
        }
        this.mBusiness.e();
        setBodyOffset();
    }

    private void setBodyOffset() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49a68fde", new Object[]{this});
            return;
        }
        if (this.mMaxBodyOffset != this.mBusiness.a() || this.mInitOffset != this.mBusiness.b()) {
            z = true;
        }
        if (!z) {
            return;
        }
        this.mMaxBodyOffset = this.mBusiness.a();
        this.mInitOffset = this.mBusiness.b();
        AKVerticalGestureHandler aKVerticalGestureHandler = this.mGestureHandler;
        if (aKVerticalGestureHandler != null) {
            int i = this.mInitOffset;
            int i2 = this.mMaxBodyOffset;
            aKVerticalGestureHandler.a(i, i2, i2, this);
        }
        if (!this.mBusiness.c() && this.mMaxBodyOffset != 0) {
            return;
        }
        initOffset();
    }

    private void initOffset() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa694ca", new Object[]{this});
            return;
        }
        AKVerticalGestureHandler aKVerticalGestureHandler = this.mGestureHandler;
        if (aKVerticalGestureHandler == null) {
            return;
        }
        aKVerticalGestureHandler.a(0, this, 1000.0f);
    }

    public void setInWeexContainer(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b268734", new Object[]{this, new Boolean(z)});
        } else {
            this.mInWeexContainer = z;
        }
    }

    public void release() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca5510e", new Object[]{this});
            return;
        }
        AKVerticalGestureHandler aKVerticalGestureHandler = this.mGestureHandler;
        if (aKVerticalGestureHandler == null) {
            return;
        }
        aKVerticalGestureHandler.d();
    }
}
