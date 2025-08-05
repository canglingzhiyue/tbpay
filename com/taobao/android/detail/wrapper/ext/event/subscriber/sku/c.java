package com.taobao.android.detail.wrapper.ext.event.subscriber.sku;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.AliNavServiceInterface;
import com.taobao.android.detail.core.detail.activity.DetailCoreActivity;
import com.taobao.android.detail.datasdk.model.datamodel.node.ItemNode;
import com.taobao.android.detail.datasdk.model.datamodel.node.SellerNode;
import com.taobao.android.detail.datasdk.model.datamodel.node.ShippingNode;
import com.taobao.android.detail.datasdk.model.datamodel.node.SkuCoreNode;
import com.taobao.android.detail.wrapper.activity.DetailActivity;
import com.taobao.android.detail.wrapper.fragment.weex.DetailFullScreenVesselFragment;
import com.taobao.android.t;
import com.taobao.android.trade.event.ThreadMode;
import com.taobao.android.trade.event.i;
import com.taobao.android.trade.event.j;
import java.util.HashMap;
import java.util.Map;
import tb.emu;
import tb.eod;
import tb.epo;
import tb.eqb;
import tb.kge;
import tb.mrm;

/* loaded from: classes5.dex */
public class c implements j<eod> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static String f11295a;
    public static String b;
    public static String c;
    public static String d;
    private static final String e;
    private DetailCoreActivity f;

    @Override // com.taobao.android.trade.event.j
    public /* synthetic */ i handleEvent(eod eodVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (i) ipChange.ipc$dispatch("caa7474e", new Object[]{this, eodVar}) : a(eodVar);
    }

    static {
        kge.a(305413452);
        kge.a(-1453870097);
        e = c.class.getSimpleName();
        f11295a = "method";
        b = "close_page";
        c = "sellected_area";
        d = "open_native_area_view";
    }

    public c(DetailCoreActivity detailCoreActivity) {
        this.f = detailCoreActivity;
        emu.a("com.taobao.android.detail.wrapper.ext.event.subscriber.sku.OpenAreaPickerWeexPageSubscriber");
    }

    public i a(eod eodVar) {
        String a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (i) ipChange.ipc$dispatch("43f81d51", new Object[]{this, eodVar});
        }
        if (!epo.g().b()) {
            epo.g().a(true);
            return com.taobao.android.detail.core.event.a.SUCCESS;
        }
        DetailFullScreenVesselFragment.newInstance();
        DetailFullScreenVesselFragment.class.getSimpleName();
        if (!TextUtils.isEmpty(eodVar.a())) {
            if (!TextUtils.isEmpty(a())) {
                a2 = a();
            } else {
                a2 = eodVar.a();
            }
            DetailCoreActivity detailCoreActivity = this.f;
            if (detailCoreActivity instanceof DetailActivity) {
                a(detailCoreActivity, "https://arealocation.taobao.com/home.htm", a((DetailActivity) detailCoreActivity, a2, eodVar.b()));
            }
        }
        return com.taobao.android.detail.core.event.a.SUCCESS;
    }

    private Map<String, String> a(DetailActivity detailActivity, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("7183fbc9", new Object[]{this, detailActivity, str, str2});
        }
        if (detailActivity == null || TextUtils.isEmpty(str) || detailActivity.y() == null || detailActivity.y().t == null || detailActivity.y().t.f10055a == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        String str3 = "";
        if (TextUtils.isEmpty(str2)) {
            str2 = str3;
        }
        hashMap.put("currentAddress", str2);
        HashMap hashMap2 = new HashMap();
        com.taobao.android.detail.datasdk.model.datamodel.node.b bVar = detailActivity.y().t.f10055a;
        ItemNode c2 = eqb.c(bVar);
        if (c2 != null) {
            hashMap.put("item_id", !TextUtils.isEmpty(c2.itemId) ? c2.itemId : str3);
            hashMap2.put("itemId", !TextUtils.isEmpty(c2.itemId) ? c2.itemId : str3);
        }
        SellerNode d2 = eqb.d(bVar);
        if (d2 != null) {
            hashMap.put("seller_id", !TextUtils.isEmpty(d2.userId) ? d2.userId : str3);
            hashMap2.put("sellerId", !TextUtils.isEmpty(d2.userId) ? d2.userId : str3);
        }
        ShippingNode h = eqb.h(bVar);
        if (h != null) {
            hashMap2.put(mrm.KEY_AREA_ID, !TextUtils.isEmpty(h.areaId) ? h.areaId : str3);
        }
        SkuCoreNode j = eqb.j(bVar);
        if (j != null && j.skuItem != null && j.skuItem.showAddressTaobao) {
            hashMap2.put("itemType", "taobao");
        } else {
            hashMap2.put("itemType", com.taobao.linkmanager.flowout.c.TMALL);
        }
        hashMap2.put("loadUrl", a(str, hashMap));
        if (!TextUtils.isEmpty(detailActivity.h)) {
            str3 = detailActivity.h;
        }
        hashMap2.put("sku_token", str3);
        return hashMap2;
    }

    private void a(Context context, String str, Map<String, String> map) {
        AliNavServiceInterface a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a974c1b", new Object[]{this, context, str, map});
        } else if (context == null || TextUtils.isEmpty(str) || map == null || map.isEmpty() || (a2 = t.a()) == null) {
        } else {
            a2.a(context).a(a(str, map));
        }
    }

    private String a(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4dcf7ed", new Object[]{this, str, map});
        }
        if (TextUtils.isEmpty(str) || map == null || map.isEmpty()) {
            return str;
        }
        Uri.Builder buildUpon = Uri.parse(str).buildUpon();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            buildUpon.appendQueryParameter(entry.getKey(), entry.getValue());
        }
        return buildUpon.build().toString();
    }

    @Override // com.taobao.android.trade.event.j
    public ThreadMode getThreadMode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ThreadMode) ipChange.ipc$dispatch("6de50c9b", new Object[]{this}) : ThreadMode.MainThread;
    }

    private String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this});
        }
        DetailCoreActivity detailCoreActivity = this.f;
        if (detailCoreActivity != null && detailCoreActivity.y() != null && this.f.y().t != null && this.f.y().t.f10055a != null && eqb.h(this.f.y().t.f10055a) != null) {
            return eqb.h(this.f.y().t.f10055a).addressWeexUrl;
        }
        return null;
    }
}
