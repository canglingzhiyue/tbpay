package com.taobao.android.detail.core.aura.utils;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.android.umbrella.link.UMLinkLogInterface;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.activity.DetailCoreActivity;
import java.util.HashMap;
import java.util.Map;
import tb.arc;
import tb.bpp;
import tb.dwq;
import tb.eca;
import tb.emu;
import tb.kge;

/* loaded from: classes4.dex */
public class h {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1199488044);
        emu.a("com.taobao.android.detail.core.aura.utils.AliDetailUmbrellaMonitor");
    }

    public static void a(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d18de974", new Object[]{context, str, str2});
        } else {
            a(context, new com.alibaba.android.aura.b(1, dwq.AURA_MODULE_NAME, str, str2));
        }
    }

    @Deprecated
    public static void a(Context context, com.alibaba.android.aura.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7f4e578", new Object[]{context, bVar});
        } else {
            a(context, bVar, (String) null);
        }
    }

    @Deprecated
    public static void a(Context context, com.alibaba.android.aura.b bVar, String str) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b708a142", new Object[]{context, bVar, str});
            return;
        }
        UMLinkLogInterface a2 = bpp.a();
        String f = bVar.f();
        String a3 = bVar.a();
        if (!TextUtils.isEmpty(str)) {
            a3 = a3 + "_" + str;
        }
        String str3 = a3;
        String str4 = "";
        if (!TextUtils.isEmpty(bVar.b())) {
            str4 = str4 + bVar.b();
        }
        if (!TextUtils.isEmpty(str)) {
            str2 = str4 + "_" + str;
        } else {
            str2 = str4;
        }
        HashMap hashMap = new HashMap();
        HashMap<String, String> b = b(context, bVar);
        a2.logError("detail2", eca.TYPE_DETAIL_AURA, f, null, str3, str2, hashMap, com.alibaba.android.umbrella.link.export.a.a(b));
        a2.commitFailure(f, "detail2", "1.0", "detail2", eca.TYPE_DETAIL_AURA, b, str3, str2);
        arc.a().c(arc.AURA_LOGGER, "onError", "AuraDetail|" + f + "|" + str3 + "|" + str2 + "|" + b);
    }

    private static HashMap<String, String> b(Context context, com.alibaba.android.aura.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("c3f5da3a", new Object[]{context, bVar});
        }
        HashMap<String, String> hashMap = new HashMap<>();
        Map<String, Object> c = bVar.c();
        if (c != null) {
            for (Map.Entry<String, Object> entry : c.entrySet()) {
                hashMap.put(entry.getKey(), String.valueOf(entry.getValue()));
            }
        }
        com.alibaba.android.aura.c e = bVar.e();
        if (e != null) {
            hashMap.put("serviceCode", e.c());
            hashMap.put("flowCode", e.d());
        }
        String a2 = a(context);
        if (!TextUtils.isEmpty(a2)) {
            hashMap.put("itemId", a2);
        }
        return hashMap;
    }

    private static String a(Context context) {
        com.taobao.android.detail.datasdk.model.datamodel.node.c C;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bbc5dc40", new Object[]{context});
        }
        if (!(context instanceof DetailCoreActivity) || (C = ((DetailCoreActivity) context).C()) == null) {
            return null;
        }
        return C.i();
    }
}
