package com.taobao.android.tbabilitykit.dx;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.eventchain.l;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.dinamicx.widget.DXWidgetRefreshOption;
import tb.dkv;
import tb.dkw;
import tb.dkx;
import tb.dla;
import tb.dlg;
import tb.dlh;
import tb.dll;
import tb.dmo;
import tb.kge;

/* loaded from: classes6.dex */
public class c extends dlg<l> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String REFRESHTEMPLATE = "3886183279055418426";

    static {
        kge.a(955903842);
    }

    @Override // tb.dlg
    public dkx a(dlh dlhVar, l lVar, dll dllVar) {
        DXWidgetNode j;
        DXWidgetRefreshOption a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dkx) ipChange.ipc$dispatch("a81bf6d9", new Object[]{this, dlhVar, lVar, dllVar});
        }
        if (lVar == null) {
            return a("abilityRuntimeContext为空", true);
        }
        DXRuntimeContext h = lVar.h();
        if (h == null) {
            return a("runtimeContext为空", true);
        }
        DXWidgetNode d = h.d();
        if (d == null) {
            return a("rootWidget为空", true);
        }
        String c = dlhVar.c("userId");
        if (!StringUtils.isEmpty(c)) {
            j = d.queryWidgetNodeByUserId(c);
        } else {
            j = lVar.j();
        }
        if (j == null) {
            return a("查找当前widget为空", true);
        }
        String c2 = dlhVar.c("type");
        JSONObject a3 = dlhVar.a("option");
        if (a3 == null) {
            a2 = new DXWidgetRefreshOption();
        } else {
            a2 = new DXWidgetRefreshOption.a().a(dmo.a(a3, "refreshChildrenStrategy", 0)).a(dmo.a(a3, "needRefreshChildren", false)).b(dmo.a(a3, "refreshImmediately", false)).a();
        }
        DinamicXEngine b = h.C().b();
        if (b != null) {
            if ("layout".equals(c2)) {
                b.a(j, 1, a2);
            } else if ("parse".equals(c2)) {
                b.a(j, 0, a2);
            }
            return new dla();
        }
        return a("engine为空", true);
    }

    public dkw a(String str, boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (dkw) ipChange.ipc$dispatch("5f2b9c94", new Object[]{this, str, new Boolean(z)}) : new dkw(new dkv(18426, str), z);
    }
}
