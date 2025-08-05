package com.taobao.avplayer;

import android.os.Build;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.Window;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobaoavsdk.CodeUsageCounter;
import tb.kcl;
import tb.kge;

/* loaded from: classes6.dex */
public class DWVideoContainer extends FrameLayout implements com.taobao.avplayer.common.q {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private DWContext mDWContext;
    private com.taobao.avplayer.player.b mDWGestureController;
    private DWLifecycleType mDWLifecycleType;
    private boolean mFirst;
    private GestureDetector mGestureDetector;
    private com.taobao.avplayer.common.l mGestureTouchListener;
    private boolean mInit;
    private com.taobao.avplayer.common.aa mRootViewTouchListener;

    static {
        kge.a(1094988927);
        kge.a(556437024);
    }

    public static /* synthetic */ Object ipc$super(DWVideoContainer dWVideoContainer, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode != -1447998406) {
            if (hashCode == 1626033557) {
                super.onAttachedToWindow();
                return null;
            } else if (hashCode != 2075560917) {
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            } else {
                return new Boolean(super.dispatchTouchEvent((MotionEvent) objArr[0]));
            }
        }
        return new Boolean(super.onTouchEvent((MotionEvent) objArr[0]));
    }

    public DWVideoContainer(DWContext dWContext) {
        super(dWContext.getActivity());
        this.mFirst = true;
        this.mDWContext = dWContext;
        setBackgroundColor(getResources().getColor(17170444));
        CodeUsageCounter.a().a(CodeUsageCounter.componentName.dw_sdk_DWVideoContainer);
    }

    public void initGesture() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("871b8e20", new Object[]{this});
        } else if (this.mInit) {
        } else {
            this.mInit = true;
            this.mDWGestureController = new com.taobao.avplayer.player.b(this.mDWContext, this);
            this.mGestureDetector = new GestureDetector(this.mDWContext.getActivity(), this.mDWGestureController);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60eb4d95", new Object[]{this});
            return;
        }
        super.onAttachedToWindow();
        if (this.mDWContext.getInitScreenType() == DWVideoScreenType.NORMAL || !this.mFirst) {
            return;
        }
        this.mFirst = false;
        this.mDWContext.getVideo().s();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Window window;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7bb68bd5", new Object[]{this, motionEvent})).booleanValue();
        }
        DWContext dWContext = this.mDWContext;
        if (dWContext != null && dWContext.mNeedSmallWindow) {
            if (this.mDWContext.isFloating()) {
                setClickable(false);
            } else {
                setClickable(true);
            }
        }
        DWContext dWContext2 = this.mDWContext;
        if (dWContext2 == null) {
            return super.dispatchTouchEvent(motionEvent);
        }
        if ((dWContext2.screenType() == DWVideoScreenType.PORTRAIT_FULL_SCREEN || this.mDWContext.screenType() == DWVideoScreenType.LANDSCAPE_FULL_SCREEN) && Build.VERSION.SDK_INT > 18) {
            if (this.mDWContext.getWindow() == null) {
                window = this.mDWContext.getActivity().getWindow();
            } else {
                window = this.mDWContext.getWindow();
            }
            if (4102 != kcl.a(window)) {
                return true;
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9b14c3a", new Object[]{this, motionEvent})).booleanValue();
        }
        com.taobao.avplayer.common.aa aaVar = this.mRootViewTouchListener;
        if (aaVar != null && aaVar.onTouch(motionEvent)) {
            return false;
        }
        if ((!this.mDWContext.getNeedGesture() && this.mDWContext.screenType() == DWVideoScreenType.NORMAL) || this.mDWLifecycleType != DWLifecycleType.MID || ((!this.mDWContext.getNeedGesture() && this.mDWContext.mPlayContext != null && this.mDWContext.mPlayContext.mEmbed) || (this.mDWContext.screenType() == DWVideoScreenType.NORMAL && this.mDWContext.mPlayContext != null && this.mDWContext.mPlayContext.mEmbed))) {
            return super.onTouchEvent(motionEvent);
        }
        if (this.mInit) {
            if (motionEvent.getAction() == 1) {
                z = this.mDWGestureController.c();
                this.mDWGestureController.a();
                if (z) {
                    com.taobao.avplayer.common.l lVar = this.mGestureTouchListener;
                }
            } else {
                if (motionEvent.getAction() == 3) {
                    this.mDWGestureController.d();
                    this.mDWGestureController.a();
                }
                z = false;
            }
            return z || this.mGestureDetector.onTouchEvent(motionEvent) || super.onTouchEvent(motionEvent);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setHookRootViewTouchListener(com.taobao.avplayer.common.aa aaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d998d1b5", new Object[]{this, aaVar});
        } else {
            this.mRootViewTouchListener = aaVar;
        }
    }

    @Override // com.taobao.avplayer.common.q
    public void onLifecycleChanged(DWLifecycleType dWLifecycleType) {
        com.taobao.avplayer.player.b bVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e41106", new Object[]{this, dWLifecycleType});
            return;
        }
        this.mDWLifecycleType = dWLifecycleType;
        if (this.mDWLifecycleType == DWLifecycleType.MID || (bVar = this.mDWGestureController) == null) {
            return;
        }
        bVar.e();
    }
}
