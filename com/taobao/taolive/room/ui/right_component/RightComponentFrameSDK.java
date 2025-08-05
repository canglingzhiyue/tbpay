package com.taobao.taolive.room.ui.right_component;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.BaseFrame;
import com.taobao.alilive.aliliveframework.frame.a;
import com.taobao.taobao.R;
import com.taobao.taolive.room.openarchitecture.entity.ATaoLiveOpenEntity;
import com.taobao.taolive.room.openarchitecture.entity.TaoliveOpenBizCodeEnum;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import com.taobao.tbliveinteractive.e;
import com.taobao.tbliveinteractive.view.right_component.c;
import tb.kge;
import tb.phq;

/* loaded from: classes8.dex */
public class RightComponentFrameSDK extends BaseFrame {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private c mRightComponentController;

    static {
        kge.a(1135514206);
    }

    public static /* synthetic */ Object ipc$super(RightComponentFrameSDK rightComponentFrameSDK, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1777320968:
                super.onCreateView2((ViewGroup) objArr[0]);
                return null;
            case -1504501726:
                super.onDestroy();
                return null;
            case -1257959318:
                super.onDidDisappear();
                return null;
            case -553924265:
                super.onStatusChange(((Number) objArr[0]).intValue(), objArr[1]);
                return null;
            case 47479189:
                return super.getComponentView();
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponent
    public String getComponentName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bb5fe8c7", new Object[]{this}) : c.TAG;
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame
    public void onCreateView(ViewStub viewStub) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3782edd", new Object[]{this, viewStub});
        }
    }

    @Deprecated
    public RightComponentFrameSDK(Context context, boolean z, TBLiveDataModel tBLiveDataModel) {
        super(context, z, tBLiveDataModel);
    }

    public RightComponentFrameSDK(Context context, boolean z, TBLiveDataModel tBLiveDataModel, a aVar) {
        super(context, z, tBLiveDataModel, aVar);
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame
    public void onCreateView2(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96103bf8", new Object[]{this, viewGroup});
            return;
        }
        super.onCreateView2(viewGroup);
        this.mContainer = viewGroup;
    }

    public void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        e tBLiveInteractiveManager = getTBLiveInteractiveManager();
        if (tBLiveInteractiveManager != null && (this.mContainer instanceof ViewGroup)) {
            this.mRightComponentController = tBLiveInteractiveManager.a((ViewGroup) this.mContainer, isLandscape());
            c cVar = this.mRightComponentController;
            if (cVar != null) {
                cVar.b();
                setRightComponentView();
            }
        }
        adjustLayoutParams();
    }

    private void adjustLayoutParams() {
        ATaoLiveOpenEntity o;
        Float aR_;
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65833386", new Object[]{this});
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) getComponentView().getLayoutParams();
        float f = 0.0f;
        if (!(this.mFrameContext instanceof com.taobao.taolive.sdk.core.e) || (o = ((com.taobao.taolive.sdk.core.e) this.mFrameContext).o()) == null || o.uiCompontent == null || o.uiCompontent.a() == null || TaoliveOpenBizCodeEnum.TaoLiveOpenBizCode_OpenWatch.toString().equals(o.bizCode) || TaoliveOpenBizCodeEnum.TaoLiveOpenBizCode_HomeTab.toString().equals(o.bizCode) || TaoliveOpenBizCodeEnum.TaoLiveOpenBizCode_Tab2.toString().equals(o.bizCode) || (aR_ = o.uiCompontent.a().aR_()) == null || aR_.floatValue() <= 0.0f || aR_.floatValue() > 500.0f) {
            z = false;
        } else {
            f = aR_.floatValue();
        }
        if (z) {
            marginLayoutParams.topMargin = (int) (marginLayoutParams.topMargin + f);
        }
        getComponentView().setLayoutParams(marginLayoutParams);
    }

    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        c cVar = this.mRightComponentController;
        if (cVar != null) {
            cVar.c();
            this.mRightComponentController = null;
        }
        if (!(this.mContainer instanceof ViewGroup)) {
            return;
        }
        ((ViewGroup) this.mContainer).removeAllViews();
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        destroy();
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onDidDisappear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b505106a", new Object[]{this});
            return;
        }
        super.onDidDisappear();
        destroy();
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onStatusChange(int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("defbc957", new Object[]{this, new Integer(i), obj});
            return;
        }
        super.onStatusChange(i, obj);
        if (i != 1) {
            return;
        }
        init();
    }

    private e getTBLiveInteractiveManager() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (e) ipChange.ipc$dispatch("a8e86078", new Object[]{this});
        }
        if (!(this.mFrameContext instanceof phq)) {
            return null;
        }
        return ((phq) this.mFrameContext).p();
    }

    private void setRightComponentView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66f3a50f", new Object[]{this});
        } else if (this.mRightComponentController.a() == null || this.mFrameContext == null) {
        } else {
            this.mFrameContext.b(this.mRightComponentController.a().findViewById(R.id.interactive_right_component_recycler));
        }
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponent
    public View getComponentView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("2d47995", new Object[]{this});
        }
        c cVar = this.mRightComponentController;
        return cVar != null ? cVar.e() : super.getComponentView();
    }
}
