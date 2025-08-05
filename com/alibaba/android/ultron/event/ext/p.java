package com.alibaba.android.ultron.event.ext;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.ultron.datamodel.imp.DMEvent;
import java.util.HashMap;
import java.util.Iterator;
import tb.bkd;
import tb.bkg;
import tb.bki;
import tb.bkm;
import tb.dla;
import tb.dll;
import tb.ibm;
import tb.kge;

/* loaded from: classes2.dex */
public abstract class p extends com.alibaba.android.ultron.event.q {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String DEFAULT_EVENT_PARAM = "defaultEventParamEventModel";

    static {
        kge.a(1586219462);
    }

    public abstract void d(com.alibaba.android.ultron.event.base.e eVar);

    public String e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[]{this}) : "";
    }

    public boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5c0f972", new Object[]{this})).booleanValue();
        }
        return true;
    }

    public JSONObject e(com.alibaba.android.ultron.event.base.e eVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("6f905a9f", new Object[]{this, eVar}) : ibm.a(eVar);
    }

    @Override // com.alibaba.android.ultron.event.q
    public final void a(com.alibaba.android.ultron.event.base.e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93d93503", new Object[]{this, eVar});
            return;
        }
        bkd.a(getClass().getSimpleName(), "commonEventStart", "事件开始");
        if (eVar == null) {
            bkd.a("UltronBaseV2Subscriber", "onHandleEvent", "ultronEvent is null");
            return;
        }
        if (g() && e(eVar) != null && eVar.d("ext_key_ability_callback") == null) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("data", (Object) eVar.c("key$event_data"));
            if (eVar.d() != null) {
                jSONObject.put(bkm.PARSER_KEY_COMP, (Object) eVar.d().getFields());
            }
            if (eVar.h() != null && eVar.h().b() != null) {
                jSONObject.put(bkm.PARSER_KEY_ULTRON_GLOBAL, (Object) eVar.h().b().c());
            }
            HashMap hashMap = (HashMap) eVar.d("bizParams");
            if (hashMap != null) {
                jSONObject.put(bkm.PARSER_KEY_DX_SUBDATA, hashMap.get(bkm.PARSER_KEY_DX_SUBDATA));
                jSONObject.put(bkm.PARSER_KEY_DX_DATA, hashMap.get(bkm.PARSER_KEY_DX_DATA));
            }
            jSONObject.put(bkm.PARSER_KEY_DX_PARENT_DATA, (Object) eVar.d());
            jSONObject.put(bkm.PARSER_KEY_PARENT_KEY, (Object) eVar.d());
            bkg.a(e(eVar), jSONObject, "native$next");
        }
        d(eVar);
        if (f()) {
            return;
        }
        bkd.a(getClass().getSimpleName(), "commonEventEnd", "事件结束");
    }

    public void a(com.alibaba.android.ultron.event.base.e eVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e19a440d", new Object[]{this, eVar, str});
        } else {
            a(eVar, str, (JSONObject) null);
        }
    }

    public void a(com.alibaba.android.ultron.event.base.e eVar, String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("33096c83", new Object[]{this, eVar, str, jSONObject});
        } else if (eVar.d("ext_key_ability_callback") instanceof dll) {
            ((dll) eVar.d("ext_key_ability_callback")).callback(str, new dla(jSONObject));
        } else {
            if (f()) {
                bkd.a(getClass().getSimpleName(), "commonEventEnd", "事件结束");
            }
            bkd.a(getClass().getSimpleName(), "eventChainNext", "准备执行下一个事件");
            JSONObject e = e(eVar);
            if (e == null || !(e.get("native$next") instanceof JSONObject)) {
                bkd.a(getClass().getSimpleName(), "eventChainOver", "事件链结束");
            } else if (e.getJSONObject("native$next").get(str) instanceof JSONArray) {
                a(eVar, e.getJSONObject("native$next").getJSONArray(str), jSONObject);
            } else if (e.getJSONObject("native$next").get(str) instanceof String) {
                b(eVar, e.getJSONObject("native$next").getString(str), jSONObject);
            } else {
                bkd.a(getClass().getSimpleName(), "eventChainOver", "事件链结束");
            }
        }
    }

    public void b(com.alibaba.android.ultron.event.base.e eVar, String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("62c0a084", new Object[]{this, eVar, str, jSONObject});
            return;
        }
        JSONArray a2 = bki.a((DXRootView) eVar.d("triggerView"), str);
        if (a2 == null) {
            a2 = (JSONArray) eVar.d().getEvents().get(str);
        }
        a(eVar, a2, jSONObject);
    }

    public void a(com.alibaba.android.ultron.event.base.e eVar, JSONArray jSONArray, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("544a2a25", new Object[]{this, eVar, jSONArray, jSONObject});
        } else if (jSONArray == null) {
        } else {
            Iterator<Object> it = jSONArray.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (next instanceof JSONObject) {
                    JSONObject jSONObject2 = (JSONObject) next;
                    a(eVar, jSONObject2.getString("type"), jSONObject2.getJSONObject("fields"), jSONObject);
                }
            }
        }
    }

    public void b(com.alibaba.android.ultron.event.base.e eVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc17d48e", new Object[]{this, eVar, jSONObject});
        } else if (jSONObject == null) {
        } else {
            a(eVar, jSONObject.getString("type"), jSONObject.getJSONObject("fields"), (JSONObject) null);
        }
    }

    public void c(com.alibaba.android.ultron.event.base.e eVar, String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9277d485", new Object[]{this, eVar, str, jSONObject});
        } else {
            a(eVar, str, jSONObject, (JSONObject) null);
        }
    }

    public void a(com.alibaba.android.ultron.event.base.e eVar, String str, JSONObject jSONObject, JSONObject jSONObject2) {
        com.alibaba.android.ultron.event.base.f d;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ec3aacd", new Object[]{this, eVar, str, jSONObject, jSONObject2});
        } else if (eVar.h() == null || (d = eVar.h().d()) == null) {
        } else {
            com.alibaba.android.ultron.event.base.e a2 = d.a();
            a2.a("bizParams", eVar.d("bizParams"));
            a2.a("triggerView", eVar.d("triggerView"));
            a2.a(eVar.d());
            if (this.c != null) {
                a2.a(this.c.e());
            }
            a2.a("key$event_data", jSONObject2);
            com.taobao.android.ultron.common.model.b a3 = bki.a(new DMEvent(str, bkg.a(jSONObject), null), eVar.h());
            a2.a(a3);
            a2.a(a3.getType());
            d.a(a2);
        }
    }
}
