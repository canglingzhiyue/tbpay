package com.taobao.android.detail.wrapper.ext.event.subscriber.basic;

import android.net.Uri;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.activity.DetailCoreActivity;
import com.taobao.android.detail.datasdk.model.datamodel.node.ShippingNode;
import com.taobao.android.detail.datasdk.model.datamodel.sku.SkuPageModel;
import com.taobao.android.trade.event.ThreadMode;
import com.taobao.android.trade.event.j;
import tb.dya;
import tb.emu;
import tb.enu;
import tb.eqb;
import tb.fcs;
import tb.kge;
import tb.mrm;

/* loaded from: classes5.dex */
public class h implements j<fcs> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private DetailCoreActivity f11281a;

    static {
        kge.a(-1360550751);
        kge.a(-1453870097);
    }

    @Override // com.taobao.android.trade.event.j
    public /* synthetic */ com.taobao.android.trade.event.i handleEvent(fcs fcsVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.trade.event.i) ipChange.ipc$dispatch("caa7474e", new Object[]{this, fcsVar}) : a(fcsVar);
    }

    public h(DetailCoreActivity detailCoreActivity) {
        this.f11281a = detailCoreActivity;
        emu.a("com.taobao.android.detail.wrapper.ext.event.subscriber.basic.ShowAddressSubscriber");
    }

    public com.taobao.android.trade.event.i a(fcs fcsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.trade.event.i) ipChange.ipc$dispatch("a3ef21ad", new Object[]{this, fcsVar});
        }
        if (this.f11281a == null) {
            return com.taobao.android.detail.core.event.a.FAILURE;
        }
        String a2 = a(a());
        if (a2 == null) {
            return com.taobao.android.detail.core.event.a.FAILURE;
        }
        com.taobao.android.trade.event.f.a(this.f11281a, new enu(a2));
        return com.taobao.android.detail.core.event.a.SUCCESS;
    }

    private String a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("15c87a18", new Object[]{this, jSONObject});
        }
        if (jSONObject == null) {
            return null;
        }
        String string = jSONObject.getString("url");
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("queryParams");
        return jSONObject2 != null ? com.taobao.android.detail.core.aura.extension.event.openUrl.d.a(string, jSONObject2) : string;
    }

    private JSONObject a() {
        SkuPageModel d;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("709f7788", new Object[]{this});
        }
        com.taobao.android.detail.datasdk.model.datamodel.node.c c = c();
        if (c == null || (d = d()) == null) {
            return null;
        }
        String currentAreaFullName = d.getCurrentAreaFullName();
        String encode = currentAreaFullName != null ? Uri.encode(currentAreaFullName) : "";
        String i = c.i();
        String str = c.c() ? com.taobao.linkmanager.flowout.c.TMALL : "taobao";
        String h = c.h();
        String currentAreaId = d.getCurrentAreaId();
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("itemId", (Object) i);
        jSONObject2.put("itemType", (Object) str);
        jSONObject2.put("sellerId", (Object) h);
        jSONObject2.put(mrm.KEY_AREA_ID, (Object) currentAreaId);
        jSONObject2.put("sku_token", (Object) this.f11281a.h);
        jSONObject2.put("loadUrl", (Object) Uri.encode(a("//market.m.taobao.com/apps/market/detailrax/address-picker.html?spm=a2116h.app.0.0.16d957e9nDYOzv&wh_weex=true", encode)));
        jSONObject.put("queryParams", (Object) jSONObject2);
        jSONObject.put("pageType", (Object) "Native");
        jSONObject.put("url", (Object) "https://arealocation.taobao.com/home.htm");
        return jSONObject;
    }

    private String a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b5178ea4", new Object[]{this, str, str2});
        }
        String b = b();
        if (!TextUtils.isEmpty(b)) {
            str = b;
        } else if (TextUtils.isEmpty(str)) {
            return "";
        }
        if (TextUtils.isEmpty(str2)) {
            return str;
        }
        String str3 = str + "&currentAddress=" + str2;
        com.taobao.android.detail.datasdk.model.datamodel.node.c c = c();
        if (c == null) {
            return str3;
        }
        return str3 + "&item_id=" + c.i() + "&seller_id=" + c.h();
    }

    private String b() {
        ShippingNode h;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this});
        }
        com.taobao.android.detail.datasdk.model.datamodel.node.c c = c();
        if (c != null && c.f10055a != null && (h = eqb.h(c.f10055a)) != null) {
            return h.addressWeexUrl;
        }
        return null;
    }

    private com.taobao.android.detail.datasdk.model.datamodel.node.c c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.detail.datasdk.model.datamodel.node.c) ipChange.ipc$dispatch("f9508065", new Object[]{this});
        }
        dya y = this.f11281a.y();
        if (y != null) {
            return y.t;
        }
        return null;
    }

    private SkuPageModel d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SkuPageModel) ipChange.ipc$dispatch("cbd3e2eb", new Object[]{this});
        }
        dya y = this.f11281a.y();
        if (y != null) {
            return y.h();
        }
        return null;
    }

    @Override // com.taobao.android.trade.event.j
    public ThreadMode getThreadMode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ThreadMode) ipChange.ipc$dispatch("6de50c9b", new Object[]{this}) : ThreadMode.MainThread;
    }
}
