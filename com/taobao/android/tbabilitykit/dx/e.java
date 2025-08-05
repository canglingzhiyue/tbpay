package com.taobao.android.tbabilitykit.dx;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRenderOptions;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.eventchain.l;
import com.taobao.android.dinamicx.r;
import com.taobao.taobao.R;
import tb.dkx;
import tb.dla;
import tb.dlh;
import tb.dll;
import tb.kge;

/* loaded from: classes6.dex */
public class e extends h<l> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String DXDXUPDATETEMPLATE_DXUPDATETEMPLATE = "-3230627156620387701";

    static {
        kge.a(50003258);
    }

    public static /* synthetic */ Object ipc$super(e eVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.android.tbabilitykit.dx.h, tb.dlg
    public dkx a(dlh dlhVar, l lVar, dll dllVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dkx) ipChange.ipc$dispatch("a81bf6d9", new Object[]{this, dlhVar, lVar, dllVar});
        }
        DXRuntimeContext h = lVar.h();
        Object f = dlhVar.f(com.taobao.tao.flexbox.layoutmanager.container.b.KEY_ACTIONS);
        if (!(f instanceof JSONArray)) {
            return a("params.actions is not JSONArray", true);
        }
        if (h == null) {
            return a("runtimeContext is null", true);
        }
        JSONObject jSONObject = new JSONObject();
        if (h.e() == null) {
            return a(com.taobao.vessel.utils.c.LOAD_DATA_NULL, true);
        }
        jSONObject.putAll(h.e());
        dkx a2 = a(jSONObject, (JSONArray) f);
        if (a2.a()) {
            return a2;
        }
        a(h, ((dla) a2).c());
        return a2;
    }

    private boolean a(DXRuntimeContext dXRuntimeContext, JSONObject jSONObject) {
        r C;
        DinamicXEngine b;
        DXRootView s;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("63cd443b", new Object[]{this, dXRuntimeContext, jSONObject})).booleanValue();
        }
        if (dXRuntimeContext == null || (C = dXRuntimeContext.C()) == null || (b = C.b()) == null || (s = dXRuntimeContext.s()) == null) {
            return false;
        }
        s.setTag(R.id.update_view_data, jSONObject);
        DXRenderOptions a2 = new DXRenderOptions.a().b(dXRuntimeContext.z()).a(dXRuntimeContext.y()).a(dXRuntimeContext.b()).a();
        dXRuntimeContext.a(jSONObject);
        b.a(dXRuntimeContext.m(), s, s.getDxTemplateItem(), dXRuntimeContext.e(), 0, a2);
        return false;
    }
}
