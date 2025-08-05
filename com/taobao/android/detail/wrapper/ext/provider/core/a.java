package com.taobao.android.detail.wrapper.ext.provider.core;

import android.content.Context;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.activity.DetailCoreActivity;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.component.TBErrorView;
import com.taobao.uikit.extend.component.error.Error;
import java.util.HashMap;
import mtopsdk.mtop.domain.MtopResponse;
import tb.dya;
import tb.ect;
import tb.eho;
import tb.emu;
import tb.eps;
import tb.fpz;
import tb.god;
import tb.its;
import tb.kge;

/* loaded from: classes5.dex */
public class a implements eho {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1424589480);
        kge.a(1541647175);
    }

    public a() {
        emu.a("com.taobao.android.detail.wrapper.ext.provider.core.IErrorViewDependProvider");
    }

    @Override // tb.eho
    public View a(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("876fa4a2", new Object[]{this, context}) : new TBErrorView(context);
    }

    @Override // tb.eho
    public boolean a(View view, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("293f8cca", new Object[]{this, view, obj})).booleanValue();
        }
        if (view == null || !(view instanceof TBErrorView) || obj == null || !(obj instanceof MtopResponse) || !(view.getContext() instanceof DetailCoreActivity)) {
            return false;
        }
        TBErrorView tBErrorView = (TBErrorView) view;
        final dya y = ((DetailCoreActivity) fpz.b(view.getContext())).y();
        MtopResponse mtopResponse = (MtopResponse) obj;
        if (mtopResponse != null && ((mtopResponse.isApiLockedResult() || mtopResponse.isNetworkError() || mtopResponse.is41XResult() || a(mtopResponse)) && y != null && y.p() != null && y.q() != null && y.t() != null)) {
            y.p().setVisibility(8);
            y.q().setVisibility(0);
            y.t().setVisibility(0);
            tBErrorView.setButton(TBErrorView.ButtonType.BUTTON_LEFT, com.alibaba.ability.localization.b.a(R.string.x_detail_app_refresh), new View.OnClickListener() { // from class: com.taobao.android.detail.wrapper.ext.provider.core.a.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view2});
                        return;
                    }
                    if (view2 != null) {
                        com.taobao.android.detail.core.perf.b.b(view2.getContext(), "retryRequest", "详情错误页面用户点击重试");
                    }
                    y.a(false);
                }
            });
            tBErrorView.setError(Error.Factory.fromMtopResponse(mtopResponse.getResponseCode(), mtopResponse.getMappingCode(), mtopResponse.getRetCode(), mtopResponse.getRetMsg()));
            a(view, mtopResponse);
            return true;
        }
        return false;
    }

    private void a(View view, MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a46504af", new Object[]{this, view, mtopResponse});
            return;
        }
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("ttd", "false");
            hashMap.put("httpResponseCode", String.valueOf(mtopResponse.getResponseCode()));
            eps.a(fpz.b(view.getContext()), "Page_Detail", 19999, "Page_Detail_MainInterfaceShowError", "", ect.a(hashMap), new String[0]);
        } catch (Exception e) {
            com.taobao.android.detail.core.utils.i.a("ErrorViewDependProvider", "Page_Detail_MainInterfaceShowError", e);
        }
    }

    private boolean a(MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ab3bce31", new Object[]{this, mtopResponse})).booleanValue();
        }
        if (mtopResponse == null) {
            return false;
        }
        return (499 == mtopResponse.getResponseCode() || its.TRAFFIC_LIMIT_STATUS.equals(mtopResponse.getRetCode())) && god.s;
    }
}
