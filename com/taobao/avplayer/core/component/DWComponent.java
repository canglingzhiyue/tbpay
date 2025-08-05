package com.taobao.avplayer.core.component;

import android.animation.Animator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.avplayer.DWContext;
import com.taobao.avplayer.DWVideoScreenType;
import com.taobao.avplayer.core.IDWObject;
import com.taobao.avplayer.core.animation.data.AnimatorObject;
import com.taobao.avplayer.core.protocol.DWInteractiveObject;
import com.taobao.weex.WXSDKInstance;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.kbh;
import tb.kge;

/* loaded from: classes6.dex */
public abstract class DWComponent implements IDWObject {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public ViewGroup mComView;
    public Context mContext;
    public f mDWComponentInstance;
    public DWContext mDWContext;
    public DWInteractiveObject mDWInteractiveObject;
    private int mDuration;
    public Animator mEndAnimator;
    private boolean mIsForceHidden;
    public boolean mRenderFinished;
    public DWVideoScreenType mScreenType;
    public Animator mStartAnimator;
    public boolean isUrlMode = false;
    private boolean mShowing = false;
    public String mJsUrl = "";

    static {
        kge.a(-1704797074);
        kge.a(1102925301);
        kge.a(-996138287);
    }

    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
        }
    }

    public void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
        }
    }

    public abstract void initView();

    public abstract boolean isHandleForceShowOrHideForView();

    public void prefetchWeexTemplateUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b132d3ae", new Object[]{this, str});
        }
    }

    public void refreshComponent(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f9a9573", new Object[]{this, str});
        }
    }

    public abstract void renderView();

    public void updateFrame() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("684668ab", new Object[]{this});
        }
    }

    public static /* synthetic */ boolean access$000(DWComponent dWComponent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4d8d1efc", new Object[]{dWComponent})).booleanValue() : dWComponent.mShowing;
    }

    public DWComponent(DWContext dWContext, DWInteractiveObject dWInteractiveObject, DWVideoScreenType dWVideoScreenType) {
        this.mDWContext = dWContext;
        this.mContext = this.mDWContext.getActivity();
        this.mDWInteractiveObject = dWInteractiveObject;
        this.mScreenType = dWVideoScreenType;
        init();
        initView();
    }

    public DWContext getDWContext() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DWContext) ipChange.ipc$dispatch("8525c6a8", new Object[]{this}) : this.mDWContext;
    }

    public DWInteractiveObject getInteractiveObject() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DWInteractiveObject) ipChange.ipc$dispatch("370ca082", new Object[]{this}) : this.mDWInteractiveObject;
    }

    public void setJsUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f5fd7b5", new Object[]{this, str});
            return;
        }
        this.mJsUrl = str;
        prefetchWeexTemplateUrl(str);
    }

    public String getSource() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("3139e888", new Object[]{this}) : this.mDWInteractiveObject.mSource;
    }

    public void setDuration(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55c2b106", new Object[]{this, new Integer(i)});
        } else {
            this.mDuration = i;
        }
    }

    public DWVideoScreenType screenType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DWVideoScreenType) ipChange.ipc$dispatch("f79d40b6", new Object[]{this}) : this.mScreenType;
    }

    public f getDWComponentInstance() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (f) ipChange.ipc$dispatch("91a0bbcb", new Object[]{this}) : this.mDWComponentInstance;
    }

    public final void show(boolean z, DWVideoScreenType dWVideoScreenType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba7f9229", new Object[]{this, new Boolean(z), dWVideoScreenType});
            return;
        }
        if (getAnimationTargetView() != null) {
            initAnimation(getAnimationTargetView());
        }
        if (isHandleForceShowOrHideForView() && z) {
            this.mIsForceHidden = false;
        } else {
            this.mShowing = true;
        }
        if (!this.mIsForceHidden && this.mShowing) {
            showComponentView(dWVideoScreenType);
            if (dWVideoScreenType == this.mScreenType) {
                startAnimation();
            }
        }
        f fVar = this.mDWComponentInstance;
        if (fVar == null || !(fVar instanceof WXSDKInstance)) {
            return;
        }
        ((com.taobao.avplayer.component.weex.a) this.mDWComponentInstance).a("onInteractShow", (Map<String, Object>) new HashMap());
    }

    public void showComponentView(DWVideoScreenType dWVideoScreenType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3cdf31ad", new Object[]{this, dWVideoScreenType});
            return;
        }
        if (dWVideoScreenType == this.mScreenType) {
            this.mComView.setVisibility(0);
        } else {
            this.mComView.setVisibility(8);
        }
        this.mComView.bringToFront();
    }

    public final void hide(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("300cdb2b", new Object[]{this, new Boolean(z)});
            return;
        }
        this.mShowing = false;
        if (isHandleForceShowOrHideForView() && z) {
            this.mIsForceHidden = true;
        }
        if (this.mEndAnimator != null) {
            endAnimation();
        } else {
            hideComponentView();
        }
        DWContext dWContext = this.mDWContext;
        if (dWContext != null && dWContext.getWXCmpUtilsCallback2() != null) {
            this.mDWContext.getWXCmpUtilsCallback2().a(getSource());
        }
        f fVar = this.mDWComponentInstance;
        if (fVar == null || !(fVar instanceof WXSDKInstance)) {
            return;
        }
        ((WXSDKInstance) this.mDWComponentInstance).a("onInteractHidden", (Map<String, Object>) new HashMap());
    }

    public void hideComponentView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eac967a7", new Object[]{this});
            return;
        }
        ViewGroup viewGroup = this.mComView;
        if (viewGroup == null) {
            return;
        }
        viewGroup.setVisibility(8);
    }

    public boolean renderFinished() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("82d7a0b3", new Object[]{this})).booleanValue() : this.mRenderFinished;
    }

    public View getView() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("576a35e4", new Object[]{this}) : this.mComView;
    }

    public void initAnimation(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11101a17", new Object[]{this, view});
            return;
        }
        try {
            initStartAnimation(view);
            initEndAnimation(view);
        } catch (Exception e) {
            com.taobao.taobaoavsdk.util.c.b(com.taobao.taobaoavsdk.util.c.a(e));
        }
    }

    public void initStartAnimation(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b0c639", new Object[]{this, view});
        } else if (this.mStartAnimator != null) {
        } else {
            List parseArray = JSON.parseArray(this.mDWInteractiveObject.getStartAnimations(), AnimatorObject.class);
            if (parseArray == null || parseArray.isEmpty()) {
                this.mStartAnimator = null;
            } else {
                this.mStartAnimator = kbh.a(parseArray, view);
            }
        }
    }

    public void initEndAnimation(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dee5ab2", new Object[]{this, view});
        } else if (this.mEndAnimator != null) {
        } else {
            List parseArray = JSON.parseArray(this.mDWInteractiveObject.getEndAnimations(), AnimatorObject.class);
            if (parseArray == null || parseArray.isEmpty()) {
                this.mEndAnimator = null;
            } else {
                this.mEndAnimator = kbh.b(parseArray, view);
            }
        }
    }

    public void startAnimation() {
        Animator animator;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("579958c9", new Object[]{this});
        } else if (this.mComView == null || (animator = this.mStartAnimator) == null) {
        } else {
            animator.start();
        }
    }

    public void endAnimation() {
        Animator animator;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e1560f0", new Object[]{this});
        } else if (this.mComView == null || (animator = this.mEndAnimator) == null) {
        } else {
            animator.addListener(new Animator.AnimatorListener() { // from class: com.taobao.avplayer.core.component.DWComponent.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationCancel(Animator animator2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("90a3af63", new Object[]{this, animator2});
                    }
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationRepeat(Animator animator2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("4388ea84", new Object[]{this, animator2});
                    }
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationStart(Animator animator2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("3a405721", new Object[]{this, animator2});
                    }
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8024e25a", new Object[]{this, animator2});
                    } else if (DWComponent.access$000(DWComponent.this)) {
                    } else {
                        DWComponent.this.hideComponentView();
                    }
                }
            });
            this.mEndAnimator.start();
        }
    }

    private View getAnimationTargetView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("60d94d4d", new Object[]{this});
        }
        ViewGroup viewGroup = this.mComView;
        if (viewGroup != null && viewGroup.getChildAt(0) != null) {
            return this.mComView.getChildAt(0);
        }
        return null;
    }

    public boolean isForceHidden() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4ebdabf6", new Object[]{this})).booleanValue() : this.mIsForceHidden;
    }
}
