package com.alibaba.triver.triver_shop.extension.accs;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.q;
import tb.kge;

/* loaded from: classes3.dex */
public final class ShopAccsUpStreamData {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final ChannelCode f3763a;
    private final String b;
    private final String c;
    private final String d;

    /* loaded from: classes3.dex */
    public enum ChannelCode {
        onShopEnter,
        onShopExit
    }

    static {
        kge.a(1410870482);
    }

    public ShopAccsUpStreamData(ChannelCode channel, String userId, String sellerId, String shopId) {
        q.d(channel, "channel");
        q.d(userId, "userId");
        q.d(sellerId, "sellerId");
        q.d(shopId, "shopId");
        this.f3763a = channel;
        this.b = userId;
        this.c = sellerId;
        this.d = shopId;
    }

    public final String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : this.b;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = jSONObject;
        jSONObject2.put((JSONObject) "channel", this.f3763a.toString());
        JSONObject jSONObject3 = new JSONObject();
        JSONObject jSONObject4 = jSONObject3;
        jSONObject4.put((JSONObject) "sellerId", this.c);
        jSONObject4.put((JSONObject) "shopId", this.d);
        jSONObject4.put((JSONObject) "clientTime", (String) Long.valueOf(System.currentTimeMillis()));
        jSONObject2.put((JSONObject) "data", (String) jSONObject3);
        String jSONString = jSONObject.toJSONString();
        q.b(jSONString, "json.toJSONString()");
        return jSONString;
    }
}
