package com.taobao.android.detail.wrapper.ext.request.client.newmtop;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.request.MtopRequestListener;
import com.taobao.android.detail.core.request.main.MainRequestParams;
import com.taobao.android.detail.wrapper.ext.request.client.OptimizeMainBusinessRequestClient;
import java.util.Map;
import tb.bga;
import tb.ebx;
import tb.ecg;
import tb.emu;
import tb.epo;
import tb.fek;
import tb.fgo;
import tb.jpx;
import tb.kge;

/* loaded from: classes5.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(34338253);
        emu.a("com.taobao.android.detail.wrapper.ext.request.client.newmtop.MainRequestManager");
    }

    public static void a(Context context, ebx ebxVar, MainRequestParams mainRequestParams, MtopRequestListener<String> mtopRequestListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2fb788ba", new Object[]{context, ebxVar, mainRequestParams, mtopRequestListener});
            return;
        }
        int a2 = a(context, ebxVar);
        if (a2 == 1) {
            e.a(context, mainRequestParams, epo.f(), mtopRequestListener);
            a(true);
            ecg.c(context, fek.TEXT_FEATURE_TYPE, "start_new_detail_api_request", "进入new_detail_api动静终态请求", (Map<String, Object>) null);
        } else if (a2 != 2) {
        } else {
            a(false);
            a(context, mainRequestParams, mtopRequestListener);
        }
    }

    private static void a(Context context, MainRequestParams mainRequestParams, MtopRequestListener<String> mtopRequestListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("662adeef", new Object[]{context, mainRequestParams, mtopRequestListener});
        } else if (!fgo.b()) {
        } else {
            OptimizeMainBusinessRequestClient optimizeMainBusinessRequestClient = new OptimizeMainBusinessRequestClient(context, mainRequestParams, epo.f(), mtopRequestListener, "");
            ecg.c(context, fek.TEXT_FEATURE_TYPE, "start_business_request", "进入business请求", (Map<String, Object>) null);
            optimizeMainBusinessRequestClient.execute();
        }
    }

    private static int a(Context context, ebx ebxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("78a07168", new Object[]{context, ebxVar})).intValue();
        }
        if (!jpx.a(context) || com.taobao.android.detail.core.debug.a.g(context)) {
            return 1;
        }
        if (com.taobao.android.detail.core.debug.a.h(context)) {
            return 2;
        }
        return (!"new".equals(ebxVar.z) && "old".equals(ebxVar.z)) ? 2 : 1;
    }

    private static void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{new Boolean(z)});
            return;
        }
        try {
            bga.c.b("mainDetail", "request", z ? "NEW_INTERFACE" : "OLD_INTERFACE", "default");
        } catch (Throwable unused) {
        }
    }
}
