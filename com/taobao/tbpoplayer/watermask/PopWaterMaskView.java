package com.taobao.tbpoplayer.watermask;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.alibaba.poplayer.factory.view.base.PopLayerBaseView;
import com.alibaba.poplayer.layermanager.PopRequest;
import com.alibaba.poplayer.track.module.OnePopModule;
import com.alibaba.poplayer.trigger.d;
import com.alibaba.poplayer.utils.c;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.caf;
import tb.kge;

/* loaded from: classes9.dex */
public class PopWaterMaskView extends PopLayerBaseView<View, d> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String VIEW_TYPE = "waterMask";

    static {
        kge.a(-1645867631);
    }

    public static /* synthetic */ Object ipc$super(PopWaterMaskView popWaterMaskView, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 358419887) {
            super.onViewUIAdded();
            return null;
        } else if (hashCode == 571929693) {
            super.init((Context) objArr[0], (Context) ((PopRequest) objArr[1]));
            return null;
        } else if (hashCode != 1890078406) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.destroyView();
            return null;
        }
    }

    public PopWaterMaskView(Context context) {
        super(context);
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [InnerView, com.taobao.tbpoplayer.watermask.WaterMaskView] */
    @Override // com.alibaba.poplayer.factory.view.base.PopLayerBaseView
    public void init(Context context, d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef24561", new Object[]{this, context, dVar});
            return;
        }
        super.init(context, (Context) dVar);
        if (!com.taobao.tbpoplayer.info.a.a().s()) {
            close(OnePopModule.OnePopLoseReasonCode.OnViewJSClose, "initCancel", "", "");
            return;
        }
        ?? waterMaskView = new WaterMaskView(getContext());
        if (!waterMaskView.init()) {
            close(OnePopModule.OnePopLoseReasonCode.OnViewJSClose, "waterMaskViewInitError", "", "");
            return;
        }
        this.mInnerView = waterMaskView;
        waterMaskView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addInnerView();
        setPopRequest(dVar);
        displayMe();
        c.a("PopWaterMaskView.init", new Object[0]);
    }

    @Override // com.alibaba.poplayer.factory.view.base.PopLayerBaseView
    public boolean shouldViewUIAdd() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("312780", new Object[]{this})).booleanValue();
        }
        if (!com.taobao.tbpoplayer.info.a.a().s()) {
            close(OnePopModule.OnePopLoseReasonCode.OnViewJSClose, "isWaterMaskEnable=false", "", "");
            return false;
        }
        boolean a2 = a.a().a(caf.a().g(), caf.a().f());
        c.a("PopWaterMaskView.shouldViewUIAdd=" + a2, new Object[0]);
        if (this.mInnerView instanceof WaterMaskView) {
            ((WaterMaskView) this.mInnerView).resetAlpha();
        }
        return a2;
    }

    @Override // com.alibaba.poplayer.factory.view.base.PopLayerBaseView
    public void onViewUIAdded() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("155d0daf", new Object[]{this});
            return;
        }
        super.onViewUIAdded();
        c.a("PopWaterMaskView.onViewUIAdded", new Object[0]);
    }

    @Override // com.alibaba.poplayer.factory.view.base.PopLayerBaseView
    public void destroyView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70a84ec6", new Object[]{this});
            return;
        }
        super.destroyView();
        if (this.mInnerView == 0 || !(this.mInnerView instanceof WaterMaskView)) {
            return;
        }
        ((WaterMaskView) this.mInnerView).destroy();
    }
}
