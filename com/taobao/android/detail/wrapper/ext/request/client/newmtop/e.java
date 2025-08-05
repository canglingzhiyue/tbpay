package com.taobao.android.detail.wrapper.ext.request.client.newmtop;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.performance.BTags;
import com.taobao.android.detail.core.request.MtopRequestListener;
import com.taobao.android.detail.core.request.main.MainRequestParams;
import com.taobao.android.detail.core.utils.i;
import com.taobao.android.detail.core.utils.t;
import com.taobao.android.detail.ttdetail.TTDetailPageManager;
import com.taobao.android.detail.wrapper.ext.request.client.OptimizeMainBusinessRequestClient;
import com.taobao.android.detail.wrapper.ext.request.client.newmtop.d;
import java.util.Map;
import mtopsdk.mtop.domain.MtopResponse;
import tb.dyo;
import tb.ecg;
import tb.eip;
import tb.emu;
import tb.epo;
import tb.fek;
import tb.fgo;
import tb.fgq;
import tb.kge;

/* loaded from: classes5.dex */
public class e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(797251745);
        emu.a("com.taobao.android.detail.wrapper.ext.request.client.newmtop.NewMainRequestManager");
    }

    public static void a(Context context, MainRequestParams mainRequestParams, String str, MtopRequestListener<String> mtopRequestListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b46cec39", new Object[]{context, mainRequestParams, str, mtopRequestListener});
            return;
        }
        final String c = c.c(mainRequestParams);
        final d dVar = new d(context, mainRequestParams, str, mtopRequestListener);
        String a2 = t.a(context);
        final JSONObject remove = !TextUtils.isEmpty(a2) ? TTDetailPageManager.sDowngradeData.remove(a2) : null;
        if (remove != null) {
            fgq.a().c().post(new Runnable() { // from class: com.taobao.android.detail.wrapper.ext.request.client.newmtop.e.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    MtopResponse mtopResponse = new MtopResponse();
                    mtopResponse.setBytedata(JSONObject.this.toString().getBytes());
                    dVar.h().onSuccess(0, mtopResponse, null, null);
                }
            });
            return;
        }
        dVar.a(new d.a() { // from class: com.taobao.android.detail.wrapper.ext.request.client.newmtop.e.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.detail.wrapper.ext.request.client.newmtop.d.a
            public void a(Context context2, MainRequestParams mainRequestParams2, String str2, MtopRequestListener<String> mtopRequestListener2, String str3) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("513ed9c3", new Object[]{this, context2, mainRequestParams2, str2, mtopRequestListener2, str3});
                    return;
                }
                if (fgo.b()) {
                    OptimizeMainBusinessRequestClient optimizeMainBusinessRequestClient = new OptimizeMainBusinessRequestClient(context2, mainRequestParams2, epo.f(), mtopRequestListener2, str3);
                    optimizeMainBusinessRequestClient.setFromDownGrade(true);
                    i.a(com.taobao.android.detail.core.performance.i.a("NewMainRequestManager", BTags.MainRequestTag, BTags.DowngradeTag), "sendNewDetailMtopWithDowngrade OptimizeMainBusinessRequestClient");
                    ecg.c(context2, fek.TEXT_FEATURE_TYPE, "downgrade_start_business_request", "降级进入business请求", (Map<String, Object>) null);
                    optimizeMainBusinessRequestClient.execute();
                }
                if (!eip.j) {
                    return;
                }
                dyo.a(c);
            }
        });
        dVar.a();
    }
}
