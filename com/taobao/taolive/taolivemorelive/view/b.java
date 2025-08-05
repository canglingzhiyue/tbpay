package com.taobao.taolive.taolivemorelive.view;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.h;
import com.taobao.taolive.room.utils.n;
import com.taobao.taolive.sdk.utils.l;
import com.taobao.taolive.taolivemorelive.morelive.business.TabMenuResponseData;
import java.util.HashMap;
import tb.pql;
import tb.pqm;
import tb.pqp;
import tb.pqq;

/* loaded from: classes8.dex */
public class b extends h {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_EVENT_TBLHOTENTRYTAP = 1661339312200095634L;

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
        } else if (dXRuntimeContext == null || objArr == null || objArr.length <= 0 || objArr[0] == null || !(objArr[0] instanceof JSONObject) || dXRuntimeContext.s() == null) {
        } else {
            JSONObject jSONObject = (JSONObject) objArr[0];
            if (jSONObject != null) {
                JSONObject jSONObject2 = jSONObject.getJSONObject(pqm.b);
                if (jSONObject2 != null) {
                    pqq.a(n.a(), jSONObject2.getString("name"), new HashMap(pqp.a(jSONObject2.getString("params"))));
                } else {
                    HashMap hashMap = new HashMap();
                    hashMap.put("showStatu", jSONObject.getString("showStatus"));
                    pqq.b(n.a(), "click-moreliveEntrance", hashMap);
                }
            }
            if (pql.a().d() == null) {
                return;
            }
            pql.a().b(true);
            a(jSONObject);
            pql.a().d().a();
        }
    }

    public void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
        } else if (jSONObject == null) {
        } else {
            TabMenuResponseData.TopTab topTab = new TabMenuResponseData.TopTab();
            topTab.isDefault = "true";
            topTab.channelId = jSONObject.getString("channelId");
            topTab.channelType = jSONObject.getString("channelType");
            topTab.name = jSONObject.getString("title");
            pql.a().a(topTab);
            String string = jSONObject.getString("extParam");
            if (!l.e(string)) {
                pql.a().d(string);
            }
            String string2 = jSONObject.getString("topAccountList");
            if (l.e(string2)) {
                return;
            }
            pql.a().b(string2);
        }
    }
}
