package com.taobao.live.home.dinamic.ability;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.eventchain.l;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import tb.dkv;
import tb.dkw;
import tb.dkx;
import tb.dky;
import tb.dla;
import tb.dlg;
import tb.dlh;
import tb.dll;
import tb.dln;
import tb.pro;

/* loaded from: classes7.dex */
public class c extends dlg<l> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long TBLCALLEVENTCHAIN = -8050389688105802924L;

    @Override // tb.dlg
    public dkx a(dlh dlhVar, l lVar, dll dllVar) {
        DXRuntimeContext h;
        DXWidgetNode d;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dkx) ipChange.ipc$dispatch("a81bf6d9", new Object[]{this, dlhVar, lVar, dllVar});
        }
        if (dlhVar == null || dlhVar.c() == null) {
            return new dky();
        }
        JSONObject c = dlhVar.c();
        String string = c.getString("targetChainName");
        String string2 = c.getString("currentUserId");
        String string3 = c.getString("targetUserId");
        JSONObject jSONObject = c.getJSONObject("targetParams");
        if (pro.e(string)) {
            if (lVar != null) {
                return a("参数缺失", true);
            }
            return new dky();
        }
        if (lVar != null && (h = lVar.h()) != null) {
            DinamicXEngine D = h.D();
            DXRootView s = h.s();
            DXWidgetNode d2 = h.d();
            if (D != null && s != null && s.getExpandWidgetNode() != null) {
                DXWidgetNode queryWidgetNodeByUserId = !pro.e(string2) ? s.getExpandWidgetNode().queryWidgetNodeByUserId(string2) : d2;
                if (!pro.e(string3)) {
                    d = s.getExpandWidgetNode().queryWidgetNodeByUserId(string3);
                } else {
                    d = h.d();
                }
                DXWidgetNode dXWidgetNode = d;
                if (queryWidgetNodeByUserId != null && dXWidgetNode != null) {
                    D.a(string, queryWidgetNodeByUserId, dXWidgetNode, jSONObject, (String) null, (com.taobao.android.dinamicx.eventchain.g) null);
                    return new dla();
                }
            }
        }
        return new dky();
    }

    public dkw a(String str, boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (dkw) ipChange.ipc$dispatch("5f2b9c94", new Object[]{this, str, new Boolean(z)}) : new dkw(new dkv(18426, str), z);
    }

    /* loaded from: classes7.dex */
    public static class a implements dln {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.dln
        public /* synthetic */ dlg b(Object obj) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (dlg) ipChange.ipc$dispatch("1766b262", new Object[]{this, obj}) : a(obj);
        }

        public c a(Object obj) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("a22bfe43", new Object[]{this, obj}) : new c();
        }
    }
}
