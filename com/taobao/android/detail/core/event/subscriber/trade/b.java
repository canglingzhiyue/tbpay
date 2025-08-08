package com.taobao.android.detail.core.event.subscriber.trade;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.activity.DetailCoreActivity;
import com.taobao.android.detail.core.event.params.JoinJhsParams;
import com.taobao.android.detail.datasdk.event.params.c;
import com.taobao.android.trade.event.ThreadMode;
import com.taobao.android.trade.event.f;
import com.taobao.android.trade.event.i;
import com.taobao.android.trade.event.j;
import java.util.HashMap;
import java.util.Map;
import tb.ecg;
import tb.edt;
import tb.edu;
import tb.efu;
import tb.emu;
import tb.epq;
import tb.eps;
import tb.eqb;
import tb.eqg;
import tb.kge;

/* loaded from: classes4.dex */
public class b implements j<efu> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String K_BOOKING_DATE = "bookingDate";
    public static final String K_ENTRANCE_DATE = "entranceDate";

    /* renamed from: a  reason: collision with root package name */
    private DetailCoreActivity f9736a;

    static {
        kge.a(108721296);
        kge.a(-1453870097);
    }

    @Override // com.taobao.android.trade.event.j
    public /* synthetic */ i handleEvent(efu efuVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (i) ipChange.ipc$dispatch("caa7474e", new Object[]{this, efuVar}) : a(efuVar);
    }

    public b(DetailCoreActivity detailCoreActivity) {
        this.f9736a = detailCoreActivity;
        emu.a("com.taobao.android.detail.core.event.subscriber.trade.BuyNowSubscriber");
    }

    public i a(efu efuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (i) ipChange.ipc$dispatch("2635a74b", new Object[]{this, efuVar});
        }
        if (efuVar.c == null) {
            return com.taobao.android.detail.core.event.a.FAILURE;
        }
        c cVar = efuVar.c;
        com.taobao.android.detail.datasdk.event.params.a aVar = cVar.f9951a;
        String str = aVar.b;
        if (cVar.b) {
            f.a(this.f9736a, new edu(new JoinJhsParams(str, "toBuy", new efu(), aVar)));
            return com.taobao.android.detail.core.event.a.SUCCESS;
        } else if (StringUtils.isEmpty(aVar.b)) {
            return com.taobao.android.detail.core.event.a.FAILURE;
        } else {
            HashMap<String, String> a2 = a(cVar, aVar, str);
            if (a2.get("exParams") instanceof String) {
                JSONObject parseObject = JSON.parseObject(a2.get("exParams"));
                for (Map.Entry<String, String> entry : efuVar.b.entrySet()) {
                    parseObject.put(entry.getKey(), (Object) entry.getValue());
                }
                a2.put("exParams", JSONObject.toJSONString(parseObject));
            }
            if (b()) {
                f.a(this.f9736a, new edt(a2));
                return com.taobao.android.detail.core.event.a.SUCCESS;
            }
            Bundle bundle = new Bundle();
            bundle.putInt("purchase_from", 2);
            bundle.putSerializable("buildOrderParams", a2);
            if (!StringUtils.isEmpty(a(a2, efuVar))) {
                ecg.a((Context) this.f9736a, a(a2, efuVar), (Map<String, Object>) null);
                epq.a(this.f9736a, a(a2, efuVar));
            } else {
                HashMap hashMap = new HashMap();
                hashMap.put("param", a2);
                ecg.a((Context) this.f9736a, "https://h5.m.taobao.com/awp/base/buy.htm", (Map<String, Object>) hashMap);
                epq.a(this.f9736a, "https://h5.m.taobao.com/awp/base/buy.htm", bundle);
            }
            a();
            return com.taobao.android.detail.core.event.a.SUCCESS;
        }
    }

    private void a() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        DetailCoreActivity detailCoreActivity = this.f9736a;
        String str2 = "";
        if (detailCoreActivity == null || detailCoreActivity.y() == null || this.f9736a.y().t == null) {
            str = str2;
        } else {
            str2 = this.f9736a.y().t.i();
            str = this.f9736a.y().t.h();
        }
        eps.a("Page_Detail", 2101, "buyNowNormal", null, null, "itemId=" + str2, "sellerId=" + str);
    }

    private boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : (this.f9736a.y() == null || this.f9736a.y().t == null || !this.f9736a.y().t.w()) ? false : true;
    }

    private HashMap<String, String> a(c cVar, com.taobao.android.detail.datasdk.event.params.a aVar, String str) {
        String str2;
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("b4df5643", new Object[]{this, cVar, aVar, str});
        }
        long j = aVar.c;
        if (j < 1) {
            j = 1;
        }
        String valueOf = String.valueOf(j);
        String str4 = aVar.f9948a;
        String str5 = aVar.e;
        HashMap hashMap = new HashMap();
        if (!eqg.a(aVar.i)) {
            hashMap.putAll(aVar.i);
        }
        DetailCoreActivity detailCoreActivity = this.f9736a;
        if (detailCoreActivity != null && detailCoreActivity.y() != null && this.f9736a.y().v != null) {
            hashMap.putAll(this.f9736a.y().v);
        }
        String a2 = a(hashMap, cVar.c);
        String str6 = null;
        if (aVar.i != null) {
            str6 = aVar.i.get("tgKey");
            str3 = aVar.i.get(K_BOOKING_DATE);
            str2 = aVar.i.get(K_ENTRANCE_DATE);
        } else {
            str2 = null;
            str3 = null;
        }
        HashMap<String, String> hashMap2 = new HashMap<>();
        hashMap2.put("buyNow", "true");
        hashMap2.put("itemId", str);
        hashMap2.put("skuId", str4);
        hashMap2.put("quantity", valueOf);
        hashMap2.put("serviceId", str5);
        hashMap2.put("tgKey", str6);
        hashMap2.put(K_BOOKING_DATE, str3);
        hashMap2.put(K_ENTRANCE_DATE, str2);
        hashMap2.put("exParams", a2);
        return hashMap2;
    }

    @Override // com.taobao.android.trade.event.j
    public ThreadMode getThreadMode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ThreadMode) ipChange.ipc$dispatch("6de50c9b", new Object[]{this}) : ThreadMode.MainThread;
    }

    private String a(Map<String, String> map, Map<String, String> map2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c82e51d8", new Object[]{this, map, map2});
        }
        if (map == null && map2 == null) {
            return null;
        }
        if (map == null) {
            return JSON.toJSONString(map2);
        }
        if (map2 == null) {
            return JSON.toJSONString(map);
        }
        HashMap hashMap = new HashMap(map);
        hashMap.putAll(map2);
        return JSON.toJSONString(hashMap);
    }

    private String a(Map<String, String> map, efu efuVar) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("35c56a7", new Object[]{this, map, efuVar});
        }
        if (!StringUtils.isEmpty(efuVar.f27286a)) {
            str = efuVar.f27286a;
        } else {
            str = (this.f9736a.y() == null || this.f9736a.y().h == null || this.f9736a.y().h.f27459a == null || this.f9736a.y().h.f27459a.f10055a == null || eqb.e(this.f9736a.y().h.f27459a.f10055a) == null) ? "" : eqb.e(this.f9736a.y().h.f27459a.f10055a).buyNowUrl;
        }
        if (StringUtils.isEmpty(str)) {
            return null;
        }
        if (map.isEmpty()) {
            return str;
        }
        Uri.Builder buildUpon = Uri.parse(str).buildUpon();
        for (String str2 : map.keySet()) {
            if (map.get(str2) != null && (buildUpon.build() == null || buildUpon.build().getQuery() == null || !buildUpon.build().getQuery().contains(str2))) {
                buildUpon.appendQueryParameter(str2, map.get(str2));
            }
        }
        return buildUpon.toString();
    }
}
