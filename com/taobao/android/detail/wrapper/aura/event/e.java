package com.taobao.android.detail.wrapper.aura.event;

import android.app.Activity;
import mtopsdk.common.util.StringUtils;
import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.alibaba.android.aura.service.event.AURAEventIO;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.activity.DetailCoreActivity;
import com.taobao.android.detail.core.detail.kit.utils.p;
import tb.arc;
import tb.arv;
import tb.eef;
import tb.emu;
import tb.kge;

@AURAExtensionImpl(code = "alidetail.impl.event.setRemind")
/* loaded from: classes5.dex */
public final class e extends arv {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EVENT_TYPE = "setRemind";

    static {
        kge.a(-778920696);
    }

    public static /* synthetic */ Object ipc$super(e eVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // tb.arw
    public String e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[]{this}) : "setRemind";
    }

    public e() {
        emu.a("com.taobao.android.detail.wrapper.aura.event.AliDetailSetRemindEvent");
    }

    @Override // tb.arv
    public void b(AURAEventIO aURAEventIO) {
        DetailCoreActivity detailCoreActivity;
        com.taobao.android.detail.datasdk.model.datamodel.node.c C;
        JSONObject c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("186833d5", new Object[]{this, aURAEventIO});
        } else if (!(b().e() instanceof DetailCoreActivity) || (C = (detailCoreActivity = (DetailCoreActivity) b().e()).C()) == null || (c = aURAEventIO.getEventModel().c()) == null) {
        } else {
            a(detailCoreActivity, C, c);
            a(aURAEventIO.getEventModel().d(), c);
            p.a(detailCoreActivity, "setRemind");
        }
    }

    private void a(Activity activity, com.taobao.android.detail.datasdk.model.datamodel.node.c cVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a81271d", new Object[]{this, activity, cVar, jSONObject});
            return;
        }
        com.taobao.android.detail.core.event.params.f fVar = new com.taobao.android.detail.core.event.params.f(cVar.i(), jSONObject.getString("title"), jSONObject.getString("link"), null, jSONObject.getLongValue("startTime"), jSONObject.getLongValue("endTime"), 0L);
        try {
            fVar.h = jSONObject.getIntValue("sourceId");
        } catch (Exception e) {
            arc.a().c("AliDetailSetRemindEvent", "sendOldRemindEvent", e.toString());
        }
        com.taobao.android.trade.event.f.a(activity, new eef(fVar));
    }

    private void a(AURARenderComponent aURARenderComponent, JSONObject jSONObject) {
        JSONArray jSONArray;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e90e1d7d", new Object[]{this, aURARenderComponent, jSONObject});
            return;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("next");
        if (jSONObject2 == null || (jSONArray = jSONObject2.getJSONArray("success")) == null) {
            return;
        }
        for (int i = 0; i < jSONArray.size(); i++) {
            JSONObject jSONObject3 = jSONArray.getJSONObject(i);
            if (jSONObject3 != null) {
                String string = jSONObject3.getString("type");
                if (!StringUtils.isEmpty(string)) {
                    JSONObject jSONObject4 = jSONObject3.getJSONObject("fields");
                    if (string.equals("adjustState") && jSONObject4 != null) {
                        JSONObject jSONObject5 = new JSONObject();
                        jSONObject5.put("beReplaced", (Object) "bottomBarVO");
                        jSONObject5.put("toReplace", (Object) "fields");
                        jSONObject4.put("targetReplacement", (Object) jSONObject5);
                    }
                    com.alibaba.android.aura.service.event.d dVar = new com.alibaba.android.aura.service.event.d();
                    dVar.a(aURARenderComponent);
                    dVar.a("" + System.currentTimeMillis());
                    dVar.a(jSONObject4);
                    com.alibaba.android.aura.service.event.c.a(b().b(), string, dVar);
                }
            }
        }
    }
}
