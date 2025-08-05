package com.taobao.android.detail.wrapper.ultronengine.event;

import android.app.Activity;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.datasdk.model.datamodel.node.ConsumerRightsNode;
import com.taobao.android.detail.datasdk.model.datamodel.node.RightsNode;
import java.util.ArrayList;
import tb.emu;
import tb.epw;
import tb.epy;
import tb.fcm;
import tb.kge;

/* loaded from: classes5.dex */
public class j extends com.alibaba.android.ultron.event.q {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String SUBSCRIBER_ID = "openGuarantee";

    static {
        kge.a(530739347);
    }

    public static /* synthetic */ Object ipc$super(j jVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public j() {
        emu.a("com.taobao.android.detail.wrapper.ultronengine.event.OpenGuaranteeUltronSubscriber");
    }

    @Override // com.alibaba.android.ultron.event.q
    public void a(com.alibaba.android.ultron.event.base.e eVar) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93d93503", new Object[]{this, eVar});
            return;
        }
        com.taobao.android.detail.sdk.utils.f.b("OpenGuaranteeUltronSubscriber", "onHandleEvent");
        com.taobao.android.detail.wrapper.ext.event.subscriber.basic.e eVar2 = new com.taobao.android.detail.wrapper.ext.event.subscriber.basic.e((Activity) eVar.a());
        JSONObject c = c();
        if (c == null || (jSONObject = c.getJSONObject(ConsumerRightsNode.TAG)) == null) {
            return;
        }
        fcm fcmVar = new fcm(jSONObject.getString("url"), jSONObject.getString("type"));
        fcmVar.d = JSON.toJSONString(jSONObject);
        fcmVar.f27804a = a(jSONObject);
        fcmVar.e = jSONObject.getString("passValue");
        eVar2.a(fcmVar);
    }

    private ArrayList<RightsNode.b> a(JSONObject jSONObject) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("6b48cb62", new Object[]{this, jSONObject});
        }
        if (jSONObject != null && (jSONObject2 = jSONObject.getJSONObject("service")) != null) {
            return epw.a(jSONObject2.getJSONArray("items"), new epy<RightsNode.b>() { // from class: com.taobao.android.detail.wrapper.ultronengine.event.j.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, com.taobao.android.detail.datasdk.model.datamodel.node.RightsNode$b] */
                @Override // tb.epy
                public /* synthetic */ RightsNode.b b(Object obj) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("eeb6464d", new Object[]{this, obj}) : a(obj);
                }

                public RightsNode.b a(Object obj) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? (RightsNode.b) ipChange2.ipc$dispatch("8626ab91", new Object[]{this, obj}) : new RightsNode.b((JSONObject) obj);
                }
            });
        }
        return null;
    }
}
