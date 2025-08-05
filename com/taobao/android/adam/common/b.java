package com.taobao.android.adam.common;

import android.text.TextUtils;
import com.alibaba.android.ultron.event.base.e;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.eventchain.f;
import com.taobao.android.dinamicx.eventchain.k;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.ultron.datamodel.imp.DMEvent;
import java.util.HashMap;
import tb.kge;

/* loaded from: classes4.dex */
public class b extends f {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String PARSER_KEY_DX_RUNTIMECONTEXT = "dxRuntimeContext";

    static {
        kge.a(1820740172);
    }

    public static com.taobao.android.dinamicx.eventchain.b a(DXRuntimeContext dXRuntimeContext, String str) {
        k dxEventChains;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.dinamicx.eventchain.b) ipChange.ipc$dispatch("4f576295", new Object[]{dXRuntimeContext, str});
        }
        if (dXRuntimeContext != null && dXRuntimeContext.d() != null && dXRuntimeContext.d().queryRootWidgetNode() != null && (dxEventChains = dXRuntimeContext.d().queryRootWidgetNode().getDxEventChains()) != null) {
            return dxEventChains.a(str);
        }
        return null;
    }

    public static boolean a(e eVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e19a4411", new Object[]{eVar, str})).booleanValue();
        }
        if (eVar == null) {
            return false;
        }
        try {
            DXEvent dXEvent = (DXEvent) eVar.d(com.alibaba.android.ultron.event.base.f.KEY_DXEVENT);
            HashMap hashMap = (HashMap) eVar.d("bizParams");
            return a(dXEvent, hashMap == null ? null : (DXRuntimeContext) hashMap.get(PARSER_KEY_DX_RUNTIMECONTEXT), new Object[]{str, a(eVar)});
        } catch (ClassCastException unused) {
            return false;
        }
    }

    public static JSONObject a(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("b8b1423", new Object[]{eVar});
        }
        Object i = eVar.i();
        if (!(i instanceof DMEvent)) {
            return null;
        }
        return ((DMEvent) i).getFields();
    }

    public static boolean a(DXEvent dXEvent, DXRuntimeContext dXRuntimeContext, Object[] objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("58c29a3a", new Object[]{dXEvent, dXRuntimeContext, objArr})).booleanValue();
        }
        if (objArr == null || objArr.length <= 0 || TextUtils.isEmpty(String.valueOf(objArr[0])) || a(dXRuntimeContext, String.valueOf(objArr[0])) == null) {
            return false;
        }
        new b().handleEvent(dXEvent, objArr, dXRuntimeContext);
        return true;
    }
}
