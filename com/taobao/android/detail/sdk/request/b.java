package com.taobao.android.detail.sdk.request;

import android.net.Uri;
import android.text.TextUtils;
import anetwork.channel.entity.RequestImpl;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.protocol.adapter.optional.d;
import com.taobao.android.detail.sdk.model.network.market.MarketFlashActivity;
import com.taobao.android.detail.sdk.model.network.market.MarketHotActivity;
import com.taobao.android.detail.sdk.model.node.NodeBundle;
import com.taobao.android.detail.sdk.request.isv.QueryIsvUrlRequestClient;
import com.taobao.android.detail.sdk.request.market.MarketRecommendRequestClient;
import com.taobao.android.detail.sdk.request.o2o.QueryO2ORequestClient;
import java.util.Map;
import mtopsdk.mtop.global.SDKConfig;
import tb.euy;
import tb.euz;
import tb.kge;
import tb.mrm;
import tb.tpc;

/* loaded from: classes4.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private String f10309a;
    private String b;

    /* loaded from: classes4.dex */
    public static class a {
        public static final b INSTANCE;

        static {
            kge.a(-1981120387);
            INSTANCE = new b();
        }
    }

    static {
        kge.a(2146167400);
    }

    private b() {
        this.b = mrm.KEY_AREA_ID;
        this.f10309a = SDKConfig.getInstance().getGlobalTtid();
        tpc.a("com.taobao.android.detail.sdk.request.DataSourceManager");
    }

    public static b a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("fd487777", new Object[0]) : a.INSTANCE;
    }

    public void a(String str, NodeBundle nodeBundle, com.taobao.android.trade.boost.request.mtop.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("751b0a37", new Object[]{this, str, nodeBundle, cVar});
        } else {
            a(str, nodeBundle, cVar, null);
        }
    }

    public void a(String str, NodeBundle nodeBundle, com.taobao.android.trade.boost.request.mtop.c cVar, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b2d83c6e", new Object[]{this, str, nodeBundle, cVar, map});
        } else if (TextUtils.isEmpty(str)) {
        } else {
            int a2 = com.taobao.android.detail.sdk.request.a.a(str);
            if (a2 == 1) {
                d(nodeBundle, cVar);
            } else if (a2 == 2) {
                c(nodeBundle, cVar);
            } else if (a2 == 3) {
                b(nodeBundle, cVar);
            } else if (a2 == 4) {
                a(nodeBundle, cVar);
            } else if (a2 != 5) {
            } else {
                a(map, cVar);
            }
        }
    }

    private void a(Map map, com.taobao.android.trade.boost.request.mtop.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c701185e", new Object[]{this, map, cVar});
            return;
        }
        new QueryIsvUrlRequestClient().execute(new com.taobao.android.detail.sdk.request.isv.a(map), (com.taobao.android.trade.boost.request.mtop.a) cVar, this.f10309a);
    }

    private void a(NodeBundle nodeBundle, com.taobao.android.trade.boost.request.mtop.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9db3176d", new Object[]{this, nodeBundle, cVar});
        } else if (nodeBundle == null) {
        } else {
            String str = nodeBundle.itemNode.itemId;
            String str2 = nodeBundle.sellerNode.shopId;
            com.taobao.android.detail.protocol.adapter.optional.d h = euy.h();
            d.a aVar = new d.a();
            if (h == null) {
                aVar.b = "0";
                aVar.f10211a = "0";
            } else {
                d.a a2 = h.a(euz.a());
                aVar.b = a2.b;
                aVar.f10211a = a2.f10211a;
            }
            new QueryO2ORequestClient().execute(new com.taobao.android.detail.sdk.request.o2o.a(str, aVar.f10211a, aVar.b, str2), (com.taobao.android.trade.boost.request.mtop.a) cVar, this.f10309a);
        }
    }

    private void b(NodeBundle nodeBundle, com.taobao.android.trade.boost.request.mtop.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a13aba6e", new Object[]{this, nodeBundle, cVar});
        } else {
            new c<MarketFlashActivity>(null, new RequestImpl(a("https://chaoshi.tmall.com/nativeApp/getTodayCrazy.do", nodeBundle.shippingNode.areaId)), cVar) { // from class: com.taobao.android.detail.sdk.request.b.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* JADX WARN: Type inference failed for: r4v3, types: [com.taobao.android.detail.sdk.model.network.market.MarketFlashActivity, java.lang.Object] */
                @Override // com.taobao.android.detail.sdk.request.c
                public /* synthetic */ MarketFlashActivity b(String str) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("6e4e661f", new Object[]{this, str}) : a(str);
                }

                public MarketFlashActivity a(String str) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? (MarketFlashActivity) ipChange2.ipc$dispatch("6324d7c", new Object[]{this, str}) : (MarketFlashActivity) JSONObject.parseObject(str, MarketFlashActivity.class);
                }
            }.a();
        }
    }

    private void c(NodeBundle nodeBundle, com.taobao.android.trade.boost.request.mtop.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4c25d6f", new Object[]{this, nodeBundle, cVar});
        } else {
            new c<MarketHotActivity>(null, new RequestImpl(a("https://chaoshi.tmall.com/nativeApp/getActivity.do", nodeBundle.shippingNode.areaId)), cVar) { // from class: com.taobao.android.detail.sdk.request.b.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, com.taobao.android.detail.sdk.model.network.market.MarketHotActivity] */
                @Override // com.taobao.android.detail.sdk.request.c
                public /* synthetic */ MarketHotActivity b(String str) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("6e4e661f", new Object[]{this, str}) : a(str);
                }

                public MarketHotActivity a(String str) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? (MarketHotActivity) ipChange2.ipc$dispatch("39fd61bf", new Object[]{this, str}) : (MarketHotActivity) JSONObject.parseObject(str, MarketHotActivity.class);
                }
            }.a();
        }
    }

    private void d(NodeBundle nodeBundle, com.taobao.android.trade.boost.request.mtop.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a84a0070", new Object[]{this, nodeBundle, cVar});
        } else if (nodeBundle == null) {
        } else {
            String str = "";
            String str2 = nodeBundle.itemNode != null ? nodeBundle.itemNode.itemId : str;
            String str3 = nodeBundle.sellerNode != null ? nodeBundle.sellerNode.userId : str;
            if (nodeBundle.verticalNode.superMarketNode != null) {
                str = nodeBundle.verticalNode.superMarketNode.logicArea;
            }
            new MarketRecommendRequestClient().execute(new com.taobao.android.detail.sdk.request.market.a(str2, str3, str, nodeBundle.shippingNode.areaId), (com.taobao.android.trade.boost.request.mtop.a) cVar, this.f10309a);
        }
    }

    private String a(String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("b5178ea4", new Object[]{this, str, str2}) : TextUtils.isEmpty(str2) ? str : new Uri.Builder().encodedPath(str).appendQueryParameter(this.b, str2).build().toString();
    }
}
