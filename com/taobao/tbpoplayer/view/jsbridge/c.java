package com.taobao.tbpoplayer.view.jsbridge;

import com.alibaba.ability.result.ExecuteResult;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.bizmessage.o;
import java.util.Map;
import tb.alq;
import tb.alu;
import tb.bip;
import tb.kge;

/* loaded from: classes9.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1270128507);
    }

    public static void a(alu aluVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf602738", new Object[]{aluVar, str});
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("bizId", (Object) ("PopHub." + str));
            jSONObject.put("eventName", (Object) "common");
            jSONObject.put(bip.REQUEST_ONCE, (Object) false);
            aluVar.b("broadcast", "addEventListener", new alq(), jSONObject, $$Lambda$c$NNK6yKBvRtPosnPRu4amLZgpDk.INSTANCE);
        } catch (Throwable th) {
            com.alibaba.poplayer.utils.c.a("TBPopHubAbility.broadcast.addEventListener.error", th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void b(ExecuteResult executeResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a97b6612", new Object[]{executeResult});
            return;
        }
        try {
            com.alibaba.poplayer.utils.c.a("Broadcast.addEventListener.receiveEvent", new Object[0]);
            if (executeResult.d() != 1) {
                return;
            }
            Map<String, Object> e = executeResult.e();
            if (e == null) {
                com.alibaba.poplayer.utils.c.a("TBPopHubEventListener.addEventListener.data=null.return", new Object[0]);
                return;
            }
            Object obj = e.get("detail");
            if (!(obj instanceof JSONObject)) {
                return;
            }
            String string = ((JSONObject) obj).getString("event");
            JSONObject jSONObject = ((JSONObject) obj).getJSONObject("data");
            JSONObject jSONObject2 = new JSONObject();
            if (com.taobao.tbpoplayer.view.c.PAGE_EVENT_SCROLL_STATE_CHANGED.equals(string)) {
                String string2 = jSONObject.getString("newState");
                if ("idle".equals(string2)) {
                    jSONObject2.put("newState", (Object) 0);
                } else if (o.SCROLLING.equals(string2)) {
                    jSONObject2.put("newState", (Object) 1);
                }
            } else {
                jSONObject2.putAll(jSONObject);
            }
            com.taobao.tbpoplayer.view.c.a().a("PopHub", string, jSONObject2, new JSONObject());
        } catch (Throwable th) {
            com.alibaba.poplayer.utils.c.a("TBPopHubAbility.broadcast.addEventListener.executeResult.error", th);
        }
    }

    public static void b(alu aluVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e448ef79", new Object[]{aluVar, str});
        } else if (aluVar == null) {
        } else {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("bizId", (Object) ("PopHub." + str));
                jSONObject.put("eventName", (Object) "common");
                aluVar.b("broadcast", "removeEventListener", new alq(), jSONObject, $$Lambda$c$Z60MAbS0X5S0dG0cEeq6eyHelS4.INSTANCE);
            } catch (Throwable th) {
                com.alibaba.poplayer.utils.c.a("TBPopHubAbility.broadcast.removeEventListener.error", th);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(ExecuteResult executeResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("34013fd1", new Object[]{executeResult});
        } else {
            com.alibaba.poplayer.utils.c.a("Broadcast.removeEventListener.receiveEvent", new Object[0]);
        }
    }
}
