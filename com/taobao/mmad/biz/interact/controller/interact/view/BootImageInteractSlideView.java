package com.taobao.mmad.biz.interact.controller.interact.view;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.widget.LinearLayout;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import com.taobao.bootimage.data.BootImageInfo;
import com.taobao.bootimage.interact.view.BootImageInteractBaseView;
import com.taobao.bootimage.linked.h;
import tb.kej;
import tb.ken;
import tb.keo;
import tb.kge;
import tb.stw;

/* loaded from: classes7.dex */
public abstract class BootImageInteractSlideView extends BootImageInteractBaseView {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int CLOSE_SPLASH_DELAY_TIME = 500;
    public static final String CLOSE_TYPE_REDIRECT = "redirect";
    public static final String COMMERCIAL_INTERACT_TYPE_REDIRECT = "3";
    private static final String TAG = "BootImageInteractSlideView";
    private boolean mClickOutSide;
    public boolean mDisableInteract;
    public LinearLayout mInteractClickContainer;
    public float mMinSlideDistance;
    private int mNeedSlideDistance;
    private double mSlideAngle;
    private float mSlideDistance;
    public boolean mSlideSuccess;
    private float mSx;
    private float mSy;
    public int mTouchSlop;
    public JSONObject splashObject;

    static {
        kge.a(1681028471);
    }

    public static /* synthetic */ Object ipc$super(BootImageInteractSlideView bootImageInteractSlideView, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1383171873:
                super.stopInteract();
                return null;
            case -407533570:
                return new Boolean(super.onInterceptTouchEvent((MotionEvent) objArr[0]));
            case 2075560917:
                return new Boolean(super.dispatchTouchEvent((MotionEvent) objArr[0]));
            case 2144052543:
                super.startInteract();
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    public abstract void renderDefaultCard();

    public BootImageInteractSlideView(Context context, BootImageInfo bootImageInfo) {
        super(context, bootImageInfo);
        this.mMinSlideDistance = 75.0f;
        this.mDisableInteract = true;
        this.mClickOutSide = false;
        this.mSlideSuccess = false;
        try {
            this.mTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void setSlideDistance(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c61f7715", new Object[]{this, new Float(f)});
            return;
        }
        kej.a(TAG, "setSlideDistance=" + f);
        this.mMinSlideDistance = f;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e7b587fe", new Object[]{this, motionEvent})).booleanValue();
        }
        kej.a(TAG, "onInterceptTouchEvent");
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7bb68bd5", new Object[]{this, motionEvent})).booleanValue();
        }
        kej.a(TAG, "dispatchTouchEvent");
        try {
        } catch (Throwable th) {
            kej.a(TAG, "dispatchTouchEvent Error ", th);
        }
        if (this.mDisableInteract) {
            kej.a(TAG, "dispatchTouchEvent disableInteract");
            return super.dispatchTouchEvent(motionEvent);
        } else if (this.mBootImageInfo == null) {
            kej.a(TAG, "dispatchTouchEvent mBootImageInfo == null");
            return super.dispatchTouchEvent(motionEvent);
        } else {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                kej.a(TAG, "dispatchTouchEvent ACTION_DOWN");
                this.mSx = x;
                this.mSy = y;
                this.mSlideSuccess = false;
                if (!stw.a(this.mInteractClickContainer, x, y, this.mTouchSlop)) {
                    z = true;
                }
                this.mClickOutSide = z;
            } else if (actionMasked == 1) {
                kej.a(TAG, "dispatchTouchEvent ACTION_UP " + this.mClickOutSide);
                if (calculateDistance(this.mSx, this.mSy, x, y)) {
                    kej.a(TAG, "滑动成功: angle=" + this.mSlideAngle + ";distance=" + this.mSlideDistance + ";configDistance=" + this.mNeedSlideDistance);
                    this.mSlideSuccess = true;
                    h.b("").a(8, this.mBootImageInfo.isColdStart);
                    ken.a(this.mSlideDistance, this.mSlideAngle, (float) this.mNeedSlideDistance, this.mBootImageInfo);
                    onSlide();
                } else if (!this.mClickOutSide) {
                    kej.a(TAG, "点击成功");
                    onAdClick();
                } else {
                    kej.a(TAG, "滑动失败: angle=" + this.mSlideAngle + ";distance=" + this.mSlideDistance + ";configDistance=" + this.mNeedSlideDistance);
                    h.b("").a(11, this.mBootImageInfo.isColdStart);
                    ken.a(this.mSlideDistance, this.mSlideAngle, (float) this.mNeedSlideDistance, this.mBootImageInfo);
                }
            } else if (actionMasked == 2) {
                kej.a(TAG, "dispatchTouchEvent ACTION_MOVE");
                if (!stw.a(this.mInteractClickContainer, x, y, this.mTouchSlop)) {
                    this.mClickOutSide = true;
                }
            }
            return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9b14c3a", new Object[]{this, motionEvent})).booleanValue();
        }
        kej.a(TAG, "onTouchEvent");
        return true;
    }

    private boolean calculateDistance(float f, float f2, float f3, float f4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d05c5b86", new Object[]{this, new Float(f), new Float(f2), new Float(f3), new Float(f4)})).booleanValue();
        }
        this.mNeedSlideDistance = keo.a(getContext(), this.mMinSlideDistance);
        float f5 = f3 - f;
        float f6 = f4 - f2;
        double atan = f5 == 0.0f ? 90.0d : (Math.atan(Math.abs(f6) / Math.abs(f5)) / 3.141592653589793d) * 180.0d;
        this.mSlideAngle = atan;
        this.mSlideDistance = f6;
        return atan >= 15.0d && f6 < 0.0f && Math.abs(f6) >= ((float) this.mNeedSlideDistance);
    }

    public void onSlide() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce9ebe99", new Object[]{this});
        } else {
            kej.a(TAG, "onSlide");
        }
    }

    public void onAdClick() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f625d9cd", new Object[]{this});
        } else {
            kej.a(TAG, "onAdClick");
        }
    }

    @Override // com.taobao.bootimage.interact.view.BootImageInteractBaseView
    public void startInteract() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7fcba53f", new Object[]{this});
            return;
        }
        super.startInteract();
        try {
            this.mDisableInteract = false;
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.taobao.bootimage.interact.view.BootImageInteractBaseView
    public void stopInteract() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad8e78df", new Object[]{this});
            return;
        }
        super.stopInteract();
        try {
            this.mDisableInteract = true;
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void setDisableInteract(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b58c31", new Object[]{this, new Boolean(z)});
        } else {
            this.mDisableInteract = z;
        }
    }

    public void processClick(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5c02368", new Object[]{this, context});
            return;
        }
        try {
            String string = this.splashObject.getJSONObject("item").getJSONObject("0").getString("targetUrl");
            kej.a(TAG, "processClick targetUrl = " + string);
            if (context == null || StringUtils.isEmpty(string) || this.mBootImageInfo == null || !"3".equals(this.mBootImageInfo.actionResponse)) {
                return;
            }
            Nav.from(context).toUri(string);
            postDelayed(new Runnable() { // from class: com.taobao.mmad.biz.interact.controller.interact.view.BootImageInteractSlideView.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        if (BootImageInteractSlideView.this.getBootImageContentListener() == null) {
                            return;
                        }
                        kej.a(BootImageInteractSlideView.TAG, "getBootImageContentListener().onClose ");
                        BootImageInteractSlideView.this.getBootImageContentListener().a("redirect");
                    } catch (Throwable th) {
                        kej.a(BootImageInteractSlideView.TAG, "getBootImageContentListener().onClose error", th);
                    }
                }
            }, 500L);
        } catch (Throwable th) {
            kej.a(TAG, "processClick error", th);
        }
    }
}
