package com.taobao.tbpoplayer.view;

import android.content.Context;
import android.view.View;
import com.alibaba.poplayer.factory.view.base.PopLayerBaseView;
import com.alibaba.poplayer.layermanager.PopRequest;
import com.alibaba.poplayer.track.module.OnePopModule;
import com.alibaba.poplayer.trigger.d;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes.dex */
public abstract class PopCustomNativeBaseView extends PopLayerBaseView<View, d> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1685808467);
    }

    public static /* synthetic */ Object ipc$super(PopCustomNativeBaseView popCustomNativeBaseView, String str, Object... objArr) {
        if (str.hashCode() == 571929693) {
            super.init((Context) objArr[0], (Context) ((PopRequest) objArr[1]));
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public abstract View initView(Context context);

    public PopCustomNativeBaseView(Context context) {
        super(context);
    }

    /* JADX WARN: Type inference failed for: r5v3, types: [InnerView, android.view.View] */
    @Override // com.alibaba.poplayer.factory.view.base.PopLayerBaseView
    public final void init(Context context, d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef24561", new Object[]{this, context, dVar});
            return;
        }
        super.init(context, (Context) dVar);
        setPopRequest(dVar);
        setClickable(false);
        setUseTouchIntercept(false);
        setVisibility(4);
        try {
            this.mInnerView = initView(context);
            if (this.mInnerView == 0) {
                dVar.t().r = "false";
                dVar.t().s = "false";
                close(OnePopModule.OnePopLoseReasonCode.OnViewCustomFilter, "CustomViewInitNull", "", "");
                return;
            }
            addInnerView();
        } catch (Throwable th) {
            close(OnePopModule.OnePopLoseReasonCode.OnViewErrorClose, "CustomViewInitError", th.getMessage(), "");
        }
    }
}
