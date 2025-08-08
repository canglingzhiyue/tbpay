package com.taobao.tao.flexbox.layoutmanager.module;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.ac.g;
import com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.t;
import java.util.Map;
import tb.kge;
import tb.ogg;

/* loaded from: classes8.dex */
public class TintModule {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "TintModule";

    static {
        kge.a(72371905);
        kge.a(-818961104);
    }

    public static void setBizName(g.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd29275c", new Object[]{cVar});
            return;
        }
        t W = cVar.f19938a.W();
        String a2 = cVar.a("bizName", (String) null);
        if (!StringUtils.isEmpty(a2)) {
            W.a(a2);
        } else {
            ogg.c(TAG, "setBizName is empty ");
        }
    }

    public static void setOrangeConfig(g.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("481ff906", new Object[]{cVar});
            return;
        }
        t W = cVar.f19938a.W();
        String a2 = cVar.a("configs", (String) null);
        if (!StringUtils.isEmpty(a2)) {
            W.a(a2.split(","));
        } else {
            ogg.c(TAG, "setOrangeConfig is empty ");
        }
    }

    public static void getAllTintInfo(g.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ac30c04", new Object[]{cVar});
            return;
        }
        t W = cVar.f19938a.W();
        if (cVar.c == null) {
            return;
        }
        cVar.c.a(cVar, W.a());
    }

    public static void updateExtraTintInfo(g.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("757ec528", new Object[]{cVar});
            return;
        }
        t W = cVar.f19938a.W();
        if (!(cVar.b instanceof Map)) {
            return;
        }
        for (Map.Entry entry : ((Map) cVar.b).entrySet()) {
            W.a(String.valueOf(entry.getKey()), String.valueOf(entry.getValue()));
        }
    }

    public static void updateGlobalTintInfo(g.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85edabc3", new Object[]{cVar});
            return;
        }
        t W = cVar.f19938a.W();
        if (!(cVar.b instanceof Map)) {
            return;
        }
        for (Map.Entry entry : ((Map) cVar.b).entrySet()) {
            W.b(String.valueOf(entry.getKey()), String.valueOf(entry.getValue()));
        }
    }

    public static void commitSuccess(g.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f31f20c", new Object[]{cVar});
            return;
        }
        t W = cVar.f19938a.W();
        String a2 = cVar.a("module", (String) null);
        String a3 = cVar.a("name", (String) null);
        Map a4 = cVar.a("args", (Map) null);
        if (StringUtils.isEmpty(a3)) {
            return;
        }
        W.a(a2, a3, a4);
    }

    public static void commitFail(g.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71f7f03", new Object[]{cVar});
            return;
        }
        t W = cVar.f19938a.W();
        String a2 = cVar.a("module", (String) null);
        String a3 = cVar.a("name", (String) null);
        String a4 = cVar.a("errorCode", (String) null);
        Map a5 = cVar.a("args", (Map) null);
        if (StringUtils.isEmpty(a3)) {
            return;
        }
        W.a(a2, a3, a4, a5);
    }

    public static void commitState(g.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19603cfe", new Object[]{cVar});
            return;
        }
        t W = cVar.f19938a.W();
        String a2 = cVar.a("module", (String) null);
        String a3 = cVar.a("name", (String) null);
        Map<String, Object> a4 = cVar.a("dimensions", (Map) null);
        Map<String, Object> a5 = cVar.a("measurements", (Map) null);
        if (StringUtils.isEmpty(a3)) {
            return;
        }
        W.a(a2, a3, a4, a5);
    }
}
