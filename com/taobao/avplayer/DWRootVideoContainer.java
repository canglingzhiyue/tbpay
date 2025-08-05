package com.taobao.avplayer;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobaoavsdk.CodeUsageCounter;
import tb.kcl;
import tb.kge;

/* loaded from: classes6.dex */
public class DWRootVideoContainer extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private DWContext mDWContext;
    private com.taobao.avplayer.common.m mHookSmallWindowClickListener;
    private final float mRatio;
    private float mTouchX;
    private float mTouchY;
    private com.taobao.avplayer.common.i mVideoMoveEvent;
    private float x;
    private float y;

    static {
        kge.a(-727283327);
    }

    public static /* synthetic */ Object ipc$super(DWRootVideoContainer dWRootVideoContainer, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode != -1447998406) {
            if (hashCode != 2075560917) {
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            }
            return new Boolean(super.dispatchTouchEvent((MotionEvent) objArr[0]));
        }
        return new Boolean(super.onTouchEvent((MotionEvent) objArr[0]));
    }

    public DWRootVideoContainer(DWContext dWContext) {
        super(dWContext.getActivity());
        this.mRatio = 0.2f;
        this.mDWContext = dWContext;
        CodeUsageCounter.a().a(CodeUsageCounter.componentName.dw_sdk_DWRootVideoContainer);
    }

    public void setDWVideoMoveEvent(com.taobao.avplayer.common.i iVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b88582ee", new Object[]{this, iVar});
        } else {
            this.mVideoMoveEvent = iVar;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("7bb68bd5", new Object[]{this, motionEvent})).booleanValue() : super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9b14c3a", new Object[]{this, motionEvent})).booleanValue();
        }
        DWContext dWContext = this.mDWContext;
        if (dWContext != null && dWContext.isFloating() && getMeasuredHeight() > 0 && getMeasuredWidth() > 0) {
            int a2 = kcl.a((Context) this.mDWContext.getActivity());
            this.x = motionEvent.getRawX();
            this.y = motionEvent.getRawY() - a2;
            int action = motionEvent.getAction();
            if (action == 0) {
                this.mTouchX = motionEvent.getX();
                this.mTouchY = motionEvent.getY();
            } else if (action == 1) {
                int i2 = (int) (this.x - this.mTouchX);
                int i3 = (int) (this.y - this.mTouchY);
                if (Math.abs(motionEvent.getX() - this.mTouchX) < 10.0f && Math.abs(motionEvent.getY() - this.mTouchY) < 10.0f) {
                    com.taobao.avplayer.common.m mVar = this.mHookSmallWindowClickListener;
                    if (mVar != null) {
                        mVar.onSmallWindowClick();
                    } else {
                        this.mVideoMoveEvent.b();
                    }
                } else if (this.mVideoMoveEvent != null && (i2 <= (-getMeasuredWidth()) / 2 || i3 <= (-getMeasuredHeight()) / 2 || i2 >= kcl.c() - (getMeasuredWidth() / 2) || i3 >= kcl.d() - (getMeasuredHeight() / 2))) {
                    setAlpha(1.0f);
                    this.mVideoMoveEvent.a();
                } else if (getLayoutParams() != null && (getLayoutParams() instanceof FrameLayout.LayoutParams)) {
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) getLayoutParams();
                    if ((i2 > (-getMeasuredWidth()) / 2 && i2 < 0) || (i2 > kcl.c() - getMeasuredWidth() && i2 < kcl.c() - (getMeasuredWidth() / 2))) {
                        layoutParams.leftMargin = (i2 <= (-getMeasuredWidth()) / 2 || i2 >= 0) ? (kcl.c() - getMeasuredWidth()) - 10 : 10;
                    }
                    if ((i3 > (-getMeasuredHeight()) / 2 && i3 < 0) || (i3 > kcl.d() - getMeasuredHeight() && i3 < kcl.d() - (getMeasuredHeight() / 2))) {
                        layoutParams.topMargin = (i3 <= (-getMeasuredHeight()) / 2 || i3 >= 0) ? (kcl.d() - getMeasuredHeight()) - 10 : 10;
                    }
                    if (this.mDWContext.getActivity() != null && this.mDWContext.getActivity().getWindow() != null && this.mDWContext.getActivity().getWindow().findViewById(16908290) != null) {
                        i = this.mDWContext.getActivity().getWindow().findViewById(16908290).getTop();
                    }
                    int d = (kcl.d() - kcl.a(this.mDWContext.getActivity())) + i + 10;
                    if (layoutParams.topMargin < d) {
                        layoutParams.topMargin = d;
                    }
                    requestLayout();
                    setAlpha(1.0f);
                }
                this.mTouchY = 0.0f;
                this.mTouchX = 0.0f;
            } else if (action != 2) {
                if (action == 3) {
                    setAlpha(1.0f);
                }
            } else if (Math.abs(motionEvent.getX() - this.mTouchX) > 10.0f || Math.abs(motionEvent.getY() - this.mTouchY) > 10.0f) {
                updateViewPosition();
            }
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    private void updateViewPosition() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f517eb5e", new Object[]{this});
            return;
        }
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (measuredWidth <= 0 || measuredHeight <= 0) {
            return;
        }
        int i = (int) (this.x - this.mTouchX);
        int i2 = (int) (this.y - this.mTouchY);
        if (getLayoutParams() == null || !(getLayoutParams() instanceof FrameLayout.LayoutParams)) {
            return;
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) getLayoutParams();
        layoutParams.leftMargin = i;
        layoutParams.topMargin = i2;
        float f = 0.0f;
        float f2 = i;
        float f3 = measuredWidth;
        int i3 = (f2 > (f3 * (-0.2f)) ? 1 : (f2 == (f3 * (-0.2f)) ? 0 : -1));
        if (i3 < 0 || f2 > (kcl.c() - measuredWidth) + (f3 * 0.2f)) {
            f = Math.abs(((int) ((i3 < 0 ? Math.abs(layoutParams.leftMargin) : Math.abs((layoutParams.leftMargin - kcl.c()) + measuredWidth)) - (0.2f * f3))) / f3);
        } else {
            float f4 = i2;
            float f5 = measuredHeight;
            int i4 = (f4 > ((-0.2f) * f5) ? 1 : (f4 == ((-0.2f) * f5) ? 0 : -1));
            if (i4 < 0 || f4 > (kcl.d() - measuredHeight) + (f5 * 0.2f)) {
                f = Math.abs(((int) (Math.abs(i4 < 0 ? layoutParams.topMargin : (layoutParams.topMargin - kcl.d()) + measuredHeight) - (0.2f * f5))) / f5);
            }
        }
        if (f > 1.0f) {
            f = 1.0f;
        }
        setAlpha(1.0f - f);
        requestLayout();
    }

    public void setHookSmallWindowClickListener(com.taobao.avplayer.common.m mVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42ad6d51", new Object[]{this, mVar});
        } else {
            this.mHookSmallWindowClickListener = mVar;
        }
    }
}
