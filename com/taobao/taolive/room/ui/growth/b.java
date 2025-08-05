package com.taobao.taolive.room.ui.growth;

import android.text.TextUtils;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.h;
import com.taobao.android.fluid.framework.data.remote.c;
import com.taobao.taolive.room.utils.aq;
import com.taobao.taolive.room.utils.n;
import tb.kge;

/* loaded from: classes8.dex */
public class b extends h {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_EVENT_GROWTHTAP = 4824678327777114825L;

    static {
        kge.a(1002174091);
    }

    public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
        if (str.hashCode() == 1785185506) {
            super.prepareBindEventWithArgs((Object[]) objArr[0], (DXRuntimeContext) objArr[1]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.android.dinamicx.h, com.taobao.android.dinamicx.bn
    public void prepareBindEventWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a67c4e2", new Object[]{this, objArr, dXRuntimeContext});
        } else {
            super.prepareBindEventWithArgs(objArr, dXRuntimeContext);
        }
    }

    @Override // com.taobao.android.dinamicx.h, com.taobao.android.dinamicx.bn
    public void handleEvent(DXEvent dXEvent, Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9db7b67", new Object[]{this, dXEvent, objArr, dXRuntimeContext});
        } else if (objArr.length <= 0 || !(objArr[0] instanceof String)) {
        } else {
            String str = (String) objArr[0];
            if ("closeSubscribeFrame".equals(str)) {
                c(dXRuntimeContext);
                a.c(n.a());
            } else if (!"popSubscribePlus".equals(str) || !a(dXRuntimeContext)) {
            } else {
                a.b(n.a(), b(dXRuntimeContext));
            }
        }
    }

    private boolean a(DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("487cd5dd", new Object[]{this, dXRuntimeContext})).booleanValue();
        }
        JSONObject jSONObject = dXRuntimeContext.e().getJSONObject(c.KEY_DATA_SOURCE);
        if (!jSONObject.containsKey("jumpParam") || !(jSONObject.get("jumpParam") instanceof JSONObject)) {
            return false;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("jumpParam");
        String string = jSONObject2.getString("componentName");
        if (!TextUtils.isEmpty(string)) {
            a(string, jSONObject2);
        }
        return true;
    }

    private void a(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6635bcfe", new Object[]{this, str, jSONObject});
            return;
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("componentName", (Object) str);
        jSONObject2.put("data", (Object) jSONObject);
        aq.b(n.a(), "TBLiveWVPlugin.Event.openComponent", jSONObject2);
    }

    private void c(DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf93115b", new Object[]{this, dXRuntimeContext});
            return;
        }
        DXRootView s = dXRuntimeContext.s();
        if (s == null) {
            return;
        }
        ViewParent parent = s.getParent();
        if (!(parent instanceof ViewGroup)) {
            return;
        }
        ViewGroup viewGroup = (ViewGroup) parent;
        viewGroup.removeView(s);
        viewGroup.setPadding(0, 0, 0, 0);
    }

    private String b(DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("25786846", new Object[]{this, dXRuntimeContext});
        }
        JSONObject jSONObject = dXRuntimeContext.e().getJSONObject(c.KEY_DATA_SOURCE);
        return (jSONObject == null || !jSONObject.containsKey("jumpParam") || !(jSONObject.get("jumpParam") instanceof JSONObject) || !jSONObject.getJSONObject("jumpParam").getBoolean("isSubscription").booleanValue()) ? "appointment-detail" : "small_card_subscribe";
    }
}
