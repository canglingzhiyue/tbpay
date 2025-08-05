package com.taobao.taolive.movehighlight.screen.frame;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.BaseFrame;
import com.taobao.alilive.aliliveframework.frame.a;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import com.taobao.taolive.sdk.utils.y;
import tb.kge;
import tb.pfb;
import tb.pfx;
import tb.sgr;

/* loaded from: classes8.dex */
public class ClearScreenDXFrame extends BaseFrame implements sgr {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private DXRootView clearScreenDXRootView;
    private FrameLayout container;

    static {
        kge.a(-147225819);
        kge.a(1522751733);
    }

    public static /* synthetic */ Object ipc$super(ClearScreenDXFrame clearScreenDXFrame, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1777320968) {
            super.onCreateView2((ViewGroup) objArr[0]);
            return null;
        } else if (hashCode == -1257959318) {
            super.onDidDisappear();
            return null;
        } else if (hashCode != -309961236) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.onCleanUp();
            return null;
        }
    }

    public ClearScreenDXFrame(Context context, boolean z, TBLiveDataModel tBLiveDataModel, a aVar) {
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
        if (viewGroup instanceof FrameLayout) {
            this.container = (FrameLayout) viewGroup;
        }
        if (!y.a()) {
            return;
        }
        if (!y.b(this.mContext) && !y.c(this.mContext)) {
            return;
        }
        y.a(this);
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame
    public void onCleanUp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed865dec", new Object[]{this});
            return;
        }
        super.onCleanUp();
        FrameLayout frameLayout = this.container;
        if (frameLayout == null) {
            return;
        }
        frameLayout.setVisibility(8);
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
        } else if (!y.a()) {
        } else {
            if (!y.b(this.mContext) && !y.c(this.mContext)) {
                return;
            }
            y.b(this);
        }
    }

    public void setVisibility(boolean z) {
        FrameLayout frameLayout;
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a5ae299", new Object[]{this, new Boolean(z)});
        } else if (pfb.a(this.mFrameContext).n() == null || this.container == null) {
        } else {
            this.clearScreenDXRootView = pfx.a().a(this.mContext, "highlight_clear_screen");
            if (this.clearScreenDXRootView == null || (frameLayout = this.container) == null) {
                return;
            }
            frameLayout.removeAllViews();
            this.container.addView(this.clearScreenDXRootView);
            pfx.a().a(this.clearScreenDXRootView, pfb.a(this.mFrameContext).n(), this.mFrameContext);
            FrameLayout frameLayout2 = this.container;
            if (!z) {
                i = 8;
            }
            frameLayout2.setVisibility(i);
        }
    }

    @Override // tb.sgr
    public void onScreenOrientationChange(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("647c2a98", new Object[]{this, new Boolean(z)});
        } else if (this.clearScreenDXRootView == null) {
        } else {
            pfx a2 = pfx.a();
            DXRootView dXRootView = this.clearScreenDXRootView;
            a2.a(dXRootView, dXRootView.getData(), this.mFrameContext);
        }
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onDidDisappear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b505106a", new Object[]{this});
            return;
        }
        super.onDidDisappear();
        pfb.a(this.mFrameContext).a((JSONObject) null);
    }
}
