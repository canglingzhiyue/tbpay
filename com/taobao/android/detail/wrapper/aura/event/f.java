package com.taobao.android.detail.wrapper.aura.event;

import mtopsdk.common.util.StringUtils;
import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.alibaba.android.aura.s;
import com.alibaba.android.aura.service.event.AURAEventIO;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.kit.utils.p;
import com.taobao.android.detail.wrapper.activity.DetailActivity;
import tb.arv;
import tb.emu;
import tb.kge;

@AURAExtensionImpl(code = "alidetail.impl.event.updateSKUQuantity")
/* loaded from: classes5.dex */
public final class f extends arv {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EVENT_TYPE = "update_sku_quantity";

    static {
        kge.a(889673424);
    }

    public static /* synthetic */ Object ipc$super(f fVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // tb.arw
    public String e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[]{this}) : "update_sku_quantity";
    }

    public f() {
        emu.a("com.taobao.android.detail.wrapper.aura.event.AliDetailUpdateSKUQuantityEvent");
    }

    @Override // tb.arv
    public void b(AURAEventIO aURAEventIO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("186833d5", new Object[]{this, aURAEventIO});
            return;
        }
        JSONObject c = aURAEventIO.getEventModel().c();
        AURARenderComponent d = aURAEventIO.getEventModel().d();
        s b = b().b();
        if (c == null || d == null || b == null) {
            return;
        }
        a(c, d, b);
        a(c);
        p.a(b().e(), "update_sku_quantity");
    }

    private void a(JSONObject jSONObject, AURARenderComponent aURARenderComponent, s sVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8eb819a", new Object[]{this, jSONObject, aURARenderComponent, sVar});
            return;
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.putAll(jSONObject);
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("beReplaced", (Object) "globalMultiBuyVO");
        jSONObject3.put("toReplace", (Object) "fields");
        jSONObject2.put("targetReplacement", (Object) jSONObject3);
        JSONObject jSONObject4 = jSONObject.getJSONObject("extraData");
        if (jSONObject4 == null) {
            jSONObject4 = new JSONObject();
        }
        jSONObject2.put("payload", (Object) jSONObject4);
        com.alibaba.android.aura.service.event.d dVar = new com.alibaba.android.aura.service.event.d();
        dVar.a(aURARenderComponent);
        dVar.a("" + System.currentTimeMillis());
        dVar.a(jSONObject2);
        com.alibaba.android.aura.service.event.c.a(sVar, "adjustState", dVar);
    }

    private void a(JSONObject jSONObject) {
        com.taobao.android.detail.wrapper.newsku.a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
            return;
        }
        String string = jSONObject.getString("quantity");
        if (StringUtils.isEmpty(string) || !(b().e() instanceof DetailActivity) || (aVar = ((DetailActivity) b().e()).v) == null) {
            return;
        }
        aVar.e(string);
    }
}
