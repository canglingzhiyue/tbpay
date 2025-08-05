package com.taobao.android.detail.wrapper.aura.event;

import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.alibaba.android.aura.s;
import com.alibaba.android.aura.service.event.AURAEventIO;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.activity.DetailCoreActivity;
import com.taobao.android.detail.core.detail.kit.utils.p;
import com.taobao.android.detail.core.request.jhs.RemindResult;
import com.taobao.android.detail.wrapper.ext.event.subscriber.jhs.b;
import tb.arv;
import tb.emu;
import tb.eob;
import tb.kge;

@AURAExtensionImpl(code = "alidetail.impl.event.addJhsWaiting")
/* loaded from: classes5.dex */
public final class a extends arv {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EVENT_TYPE = "addJhsWaiting";

    static {
        kge.a(-296352586);
    }

    @Override // tb.arw
    public String e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[]{this}) : "addJhsWaiting";
    }

    public a() {
        emu.a("com.taobao.android.detail.wrapper.aura.event.AliDetailAddJHSWaitingEvent");
    }

    @Override // tb.arv
    public void b(AURAEventIO aURAEventIO) {
        JSONObject c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("186833d5", new Object[]{this, aURAEventIO});
        } else if (!(b().e() instanceof DetailCoreActivity) || (c = aURAEventIO.getEventModel().c()) == null) {
        } else {
            DetailCoreActivity detailCoreActivity = (DetailCoreActivity) b().e();
            com.taobao.android.detail.datasdk.model.datamodel.node.c C = detailCoreActivity.C();
            if (C != null) {
                c.put("itemId", (Object) C.i());
            }
            s b = b().b();
            AURARenderComponent d = aURAEventIO.getEventModel().d();
            if (b == null || d == null) {
                return;
            }
            com.taobao.android.detail.wrapper.ext.event.subscriber.jhs.b bVar = new com.taobao.android.detail.wrapper.ext.event.subscriber.jhs.b(detailCoreActivity);
            bVar.a(new C0437a(b, d, c));
            bVar.a(new eob(c));
            p.a(detailCoreActivity, "addJhsWaiting");
        }
    }

    /* renamed from: com.taobao.android.detail.wrapper.aura.event.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static class C0437a implements b.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public s f11106a;
        public AURARenderComponent b;
        public JSONObject c;

        static {
            kge.a(-541587306);
            kge.a(1678778942);
        }

        public C0437a(s sVar, AURARenderComponent aURARenderComponent, JSONObject jSONObject) {
            this.f11106a = sVar;
            this.b = aURARenderComponent;
            this.c = jSONObject;
        }

        @Override // com.taobao.android.detail.wrapper.ext.event.subscriber.jhs.b.a
        public void a(RemindResult remindResult) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("359db738", new Object[]{this, remindResult});
            } else if (remindResult == null) {
            } else {
                b(remindResult);
            }
        }

        private void b(RemindResult remindResult) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c9dc26d7", new Object[]{this, remindResult});
                return;
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.putAll(this.c);
            jSONObject.put("subType", "jhsRemind");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("beReplaced", (Object) "bottomBarVO");
            jSONObject2.put("toReplace", (Object) "fields");
            jSONObject.put("targetReplacement", (Object) jSONObject2);
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.putAll(jSONObject);
            jSONObject3.put("status", Boolean.valueOf(remindResult.btnDisable));
            jSONObject3.put("btnTitle", this.c.getString("disabledTitle"));
            jSONObject.put("payload", (Object) jSONObject3);
            com.alibaba.android.aura.service.event.d dVar = new com.alibaba.android.aura.service.event.d();
            dVar.a(this.b);
            dVar.a("" + System.currentTimeMillis());
            dVar.a(jSONObject);
            com.alibaba.android.aura.service.event.c.a(this.f11106a, "adjustState", dVar);
        }
    }
}
