package com.alibaba.android.ultron.event.ext;

import com.alibaba.android.ultron.vfw.commonpopupwindow.a;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes2.dex */
public class u extends p {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1636150116);
    }

    @Override // com.alibaba.android.ultron.event.ext.p
    public String e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[]{this}) : "2804205717073054163";
    }

    public static /* synthetic */ com.taobao.android.ultron.common.model.b a(u uVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.ultron.common.model.b) ipChange.ipc$dispatch("e05101a6", new Object[]{uVar}) : uVar.b();
    }

    public static /* synthetic */ void a(u uVar, JSONArray jSONArray, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5604aa23", new Object[]{uVar, jSONArray, obj});
        } else {
            uVar.a(jSONArray, obj);
        }
    }

    @Override // com.alibaba.android.ultron.event.ext.p
    public void d(com.alibaba.android.ultron.event.base.e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c03fdde0", new Object[]{this, eVar});
            return;
        }
        try {
            com.alibaba.android.ultron.vfw.commonpopupwindow.a aVar = (com.alibaba.android.ultron.vfw.commonpopupwindow.a) eVar.h().f().get("CommonPopupWindow");
            aVar.a(new a.InterfaceC0097a() { // from class: com.alibaba.android.ultron.event.ext.u.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.alibaba.android.ultron.vfw.commonpopupwindow.a.InterfaceC0097a
                public void a(boolean z) {
                    JSONObject fields;
                    JSONObject jSONObject;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
                    } else if (!z || (fields = u.a(u.this).getFields()) == null || (jSONObject = fields.getJSONObject("next")) == null) {
                    } else {
                        u.a(u.this, jSONObject.getJSONArray("complete"), fields);
                    }
                }
            });
            aVar.a(true);
        } catch (Throwable unused) {
        }
    }
}
