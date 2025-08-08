package com.taobao.android.detail.core.aura.extension.event.openUrl;

import android.content.Context;
import android.net.Uri;
import mtopsdk.common.util.StringUtils;
import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.android.aura.service.event.AURAEventIO;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.activity.DetailCoreActivity;
import com.taobao.android.detail.core.detail.kit.utils.p;
import com.taobao.android.detail.datasdk.model.datamodel.sku.SkuPageModel;
import tb.arc;
import tb.arv;
import tb.dya;
import tb.emu;
import tb.eqb;
import tb.fgl;
import tb.kge;
import tb.mrm;

@AURAExtensionImpl(code = "alidetail.impl.event.openAddress")
/* loaded from: classes4.dex */
public final class a extends arv {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EVENT_TYPE = "openAddress";

    static {
        kge.a(1336599881);
    }

    public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // tb.arw
    public String e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[]{this}) : "openAddress";
    }

    public a() {
        emu.a("com.taobao.android.detail.core.aura.extension.event.openUrl.AliDetailOpenAddressEvent");
    }

    @Override // tb.arv
    public void b(AURAEventIO aURAEventIO) {
        com.alibaba.android.aura.service.event.d b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("186833d5", new Object[]{this, aURAEventIO});
            return;
        }
        Context e = b().e();
        if (!(e instanceof DetailCoreActivity)) {
            return;
        }
        DetailCoreActivity detailCoreActivity = (DetailCoreActivity) e;
        if (detailCoreActivity.y() == null || detailCoreActivity.y().t == null) {
            return;
        }
        if (c(aURAEventIO)) {
            b = a(detailCoreActivity, aURAEventIO);
        } else {
            b = b(detailCoreActivity, aURAEventIO);
        }
        if (b == null) {
            arc.a().c("AliDetailOpenAddressEvent", "innerHandleEvent", "openAddressUrlEventModel is null");
            return;
        }
        com.alibaba.android.aura.service.event.c.a(b().b(), "openUrl", b);
        p.a(detailCoreActivity, "openAddress");
    }

    private boolean c(AURAEventIO aURAEventIO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3dfc3cda", new Object[]{this, aURAEventIO})).booleanValue();
        }
        JSONObject c = aURAEventIO.getEventModel().c();
        return c != null && !StringUtils.isEmpty(c.getString("url"));
    }

    private com.alibaba.android.aura.service.event.d a(DetailCoreActivity detailCoreActivity, AURAEventIO aURAEventIO) {
        com.taobao.android.detail.datasdk.model.datamodel.node.c cVar;
        SkuPageModel h;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.alibaba.android.aura.service.event.d) ipChange.ipc$dispatch("4b2db9dc", new Object[]{this, detailCoreActivity, aURAEventIO});
        }
        dya y = detailCoreActivity.y();
        if (y == null || (cVar = y.t) == null || (h = y.h()) == null) {
            return null;
        }
        String i = cVar.i();
        String currentAreaId = h.getCurrentAreaId();
        JSONObject parseObject = JSONObject.parseObject(aURAEventIO.getEventModel().c().toJSONString());
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(fgl.TARGETITEMID, (Object) i);
        jSONObject.put(fgl.ORIGINALITEMID, (Object) i);
        jSONObject.put(mrm.KEY_AREA_ID, (Object) currentAreaId);
        jSONObject.put("token", (Object) detailCoreActivity.h);
        parseObject.put("queryParams", (Object) jSONObject);
        com.alibaba.android.aura.service.event.d dVar = new com.alibaba.android.aura.service.event.d(aURAEventIO.getEventModel());
        dVar.a(parseObject);
        return dVar;
    }

    private com.alibaba.android.aura.service.event.d b(DetailCoreActivity detailCoreActivity, AURAEventIO aURAEventIO) {
        com.taobao.android.detail.datasdk.model.datamodel.node.c cVar;
        SkuPageModel h;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.alibaba.android.aura.service.event.d) ipChange.ipc$dispatch("11dc7d5d", new Object[]{this, detailCoreActivity, aURAEventIO});
        }
        dya y = detailCoreActivity.y();
        if (y == null || (cVar = y.t) == null || (h = y.h()) == null) {
            return null;
        }
        String encode = h.getCurrentAreaFullName() != null ? Uri.encode(h.getCurrentAreaFullName()) : "";
        String i = cVar.i();
        String str = cVar.c() ? com.taobao.linkmanager.flowout.c.TMALL : "taobao";
        String h2 = cVar.h();
        String currentAreaId = h.getCurrentAreaId();
        JSONObject c = aURAEventIO.getEventModel().c();
        if (c == null) {
            c = new JSONObject();
        }
        JSONObject parseObject = JSONObject.parseObject(c.toJSONString());
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("itemId", (Object) i);
        jSONObject.put("itemType", (Object) str);
        jSONObject.put("sellerId", (Object) h2);
        jSONObject.put(mrm.KEY_AREA_ID, (Object) currentAreaId);
        jSONObject.put("sku_token", (Object) detailCoreActivity.h);
        jSONObject.put("loadUrl", (Object) Uri.encode(a(detailCoreActivity, "//market.m.taobao.com/apps/market/detailrax/address-picker.html?spm=a2116h.app.0.0.16d957e9nDYOzv&wh_weex=true", encode)));
        parseObject.put("queryParams", (Object) jSONObject);
        parseObject.put("pageType", (Object) "Native");
        parseObject.put("url", (Object) "https://arealocation.taobao.com/home.htm");
        com.alibaba.android.aura.service.event.d dVar = new com.alibaba.android.aura.service.event.d(aURAEventIO.getEventModel());
        dVar.a(parseObject);
        return dVar;
    }

    private String a(DetailCoreActivity detailCoreActivity) {
        com.taobao.android.detail.datasdk.model.datamodel.node.c cVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("387dc60d", new Object[]{this, detailCoreActivity});
        }
        if (detailCoreActivity.y() != null && (cVar = detailCoreActivity.y().t) != null && cVar.f10055a != null && eqb.h(cVar.f10055a) != null) {
            return eqb.h(cVar.f10055a).addressWeexUrl;
        }
        return null;
    }

    private String a(DetailCoreActivity detailCoreActivity, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("265168f9", new Object[]{this, detailCoreActivity, str, str2});
        }
        if (!StringUtils.isEmpty(str)) {
            String a2 = !StringUtils.isEmpty(a(detailCoreActivity)) ? a(detailCoreActivity) : str;
            if (!StringUtils.isEmpty(str2)) {
                com.taobao.android.detail.datasdk.model.datamodel.node.c cVar = detailCoreActivity.y().t;
                return (a2 + "&currentAddress=" + str2) + "&item_id=" + cVar.i() + "&seller_id=" + cVar.h();
            }
        }
        return str;
    }
}
