package com.taobao.android.live.plugin.atype.flexalocal.comments.chat;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import java.util.HashMap;
import tb.iot;
import tb.kge;
import tb.xkw;

/* loaded from: classes5.dex */
public class j extends iot {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_EVENT_TAOLIVECOMMENTACTION = 8145846171775414553L;

    static {
        kge.a(736033715);
    }

    public static /* synthetic */ Object ipc$super(j jVar, String str, Object... objArr) {
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

    @Override // tb.iot
    public void a(DXEvent dXEvent, Object[] objArr, DXRuntimeContext dXRuntimeContext, com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6cc53e1f", new Object[]{this, dXEvent, objArr, dXRuntimeContext, cVar});
        } else if (objArr == null || objArr.length <= 0) {
        } else {
            Object obj = objArr[0];
            if (!(obj instanceof String)) {
                return;
            }
            String str = (String) obj;
            char c = 65535;
            if (str.hashCode() == 1060822828 && str.equals("chatHotSaleClick")) {
                c = 0;
            }
            if (c != 0 || objArr.length <= 1 || !(objArr[1] instanceof JSONObject)) {
                return;
            }
            JSONObject jSONObject = (JSONObject) objArr[1];
            String string = jSONObject.getString("jumpUrl");
            if (StringUtils.isEmpty(string)) {
                return;
            }
            HashMap hashMap = new HashMap(b.a(string));
            if (!hashMap.containsKey("action")) {
                return;
            }
            String str2 = (String) hashMap.get("action");
            hashMap.remove("action");
            HashMap hashMap2 = new HashMap();
            HashMap<String, String> hashMap3 = new HashMap<>();
            String string2 = jSONObject.getString("itemId");
            String string3 = jSONObject.getString("desc");
            if (!StringUtils.isEmpty(string2)) {
                hashMap3.put("item_id", string2);
            }
            if (string3 != null) {
                hashMap3.put("recom_reason", string3);
            }
            if (StringUtils.isEmpty(str2) || !"openGoodsContainer".equals(str2)) {
                return;
            }
            if (com.taobao.android.live.plugin.atype.flexalocal.good.a.a().j() != null) {
                com.taobao.android.live.plugin.atype.flexalocal.good.a.a().j().a("commentBuyAtmosphere", hashMap3);
            }
            if (hashMap.containsKey("clickSource")) {
                hashMap.put("from", hashMap.get("clickSource"));
            }
            hashMap2.putAll(hashMap);
            com.taobao.android.live.plugin.proxy.f.m().getActionAdapter().a(cVar == null ? null : cVar.C(), xkw.EVENT_SHOW_GOODSPACKAGE, hashMap2);
        }
    }
}
