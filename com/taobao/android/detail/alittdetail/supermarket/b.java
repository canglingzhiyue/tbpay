package com.taobao.android.detail.alittdetail.supermarket;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.content.LocalBroadcastManager;
import mtopsdk.common.util.StringUtils;
import android.widget.Toast;
import com.alibaba.android.icart.core.QueryParamsManager;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.alittdetail.supermarket.b;
import com.taobao.android.detail.core.event.subscriber.trade.AddCartSubscriber;
import com.taobao.android.detail.ttdetail.data.meta.Feature;
import com.taobao.android.detail.ttdetail.data.meta.Seller;
import com.taobao.android.detail.ttdetail.data.meta.SkuCore;
import com.taobao.android.detail.ttdetail.data.meta.Trade;
import com.taobao.android.detail.ttdetail.handler.bizhandlers.q;
import com.taobao.android.detail.ttdetail.handler.event.RuntimeAbilityParam;
import com.taobao.android.detail.ttdetail.utils.d;
import com.taobao.android.detail.ttdetail.utils.e;
import com.taobao.android.detail.ttdetail.utils.f;
import com.taobao.android.detail.ttdetail.utils.i;
import com.taobao.android.detail.ttdetail.utils.l;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.remotebusiness.IRemoteListener;
import com.taobao.tao.remotebusiness.RemoteBusiness;
import java.util.HashMap;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MethodEnum;
import mtopsdk.mtop.domain.MtopRequest;
import mtopsdk.mtop.domain.MtopResponse;
import tb.eyx;
import tb.kge;
import tb.nom;

/* loaded from: classes4.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* loaded from: classes4.dex */
    public interface a {
        void a();

        void b();
    }

    static {
        kge.a(-664153251);
    }

    public static /* synthetic */ void a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("929ad046", new Object[]{str, str2, str3});
        } else {
            b(str, str2, str3);
        }
    }

    public static boolean a(final eyx eyxVar, final c cVar, final a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("daed263c", new Object[]{eyxVar, cVar, aVar})).booleanValue();
        }
        final String b = cVar.b();
        if (StringUtils.isEmpty(b)) {
            return false;
        }
        final HashMap hashMap = new HashMap();
        hashMap.put("addSource", "nativeDetail");
        if (cVar.d() != null) {
            hashMap.putAll(cVar.d());
        }
        MtopRequest mtopRequest = new MtopRequest();
        mtopRequest.setData(new JSONObject() { // from class: com.taobao.android.detail.alittdetail.supermarket.SuperMarketAddCartHandler$1
            {
                put("detail_v", "3.3.2");
                put("itemId", (Object) b);
                put("skuId", (Object) cVar.a());
                put("quantity", (Object) String.valueOf(cVar.c()));
                put("cartFrom", QueryParamsManager.DEFAULT_CART_FROM);
                put("exParams", (Object) JSONObject.toJSONString(hashMap));
            }
        }.toJSONString());
        mtopRequest.setApiName("mtop.trade.addBag");
        mtopRequest.setVersion("3.1");
        mtopRequest.setNeedEcode(true);
        mtopRequest.setNeedSession(true);
        RemoteBusiness build = RemoteBusiness.build(mtopRequest, e.c());
        build.registeListener((IRemoteListener) new IRemoteBaseListener() { // from class: com.taobao.android.detail.alittdetail.supermarket.SuperMarketAddCartHandler$2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            private void handleAddCartSuccess(MtopResponse mtopResponse) {
                JSONObject afterAddToCartAction;
                JSONObject jSONObject;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("98f8acb6", new Object[]{this, mtopResponse});
                    return;
                }
                Trade trade = (Trade) eyx.this.a().a(Trade.class);
                if (trade == null || (afterAddToCartAction = trade.getAfterAddToCartAction()) == null || (jSONObject = afterAddToCartAction.getJSONObject("fields")) == null) {
                    return;
                }
                String string = afterAddToCartAction.getString("type");
                if (StringUtils.isEmpty(jSONObject.getString("url")) || StringUtils.isEmpty(string)) {
                    return;
                }
                eyx.this.c().a(new com.taobao.android.detail.ttdetail.handler.event.a(afterAddToCartAction), new RuntimeAbilityParam[0]);
            }

            private void broadcastCartDataUpdate(Context context, String str) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("c299eeb7", new Object[]{this, context, str});
                    return;
                }
                Intent intent = new Intent();
                intent.setAction("cartRefreshData");
                if (StringUtils.isEmpty(str)) {
                    str = "";
                }
                intent.putExtra("stringifyAddCartResult", str);
                intent.addCategory("android.intent.category.DEFAULT");
                LocalBroadcastManager.getInstance(context).sendBroadcast(intent);
            }

            private void handleSmAchieveCoupon() {
                SkuCore skuCore;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8c08585c", new Object[]{this});
                    return;
                }
                Feature feature = (Feature) eyx.this.a().a(Feature.class);
                if (feature == null || !feature.isSmAcitonAfterPurchase() || (skuCore = (SkuCore) eyx.this.a().a(SkuCore.class)) == null || !skuCore.isNoSkuId()) {
                    return;
                }
                SkuCore.c cVar2 = skuCore.getZeroSku2info().get("0");
                String a2 = cVar2.a();
                String b2 = cVar2.b();
                String a3 = d.a((Seller) eyx.this.a().a(Seller.class), "");
                if (StringUtils.isEmpty(b2) || StringUtils.isEmpty(a3)) {
                    return;
                }
                b.a(a2, b2, a3);
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                } else if (mtopResponse != null && mtopResponse.isApiSuccess()) {
                    handleAddCartSuccess(mtopResponse);
                    Toast.makeText(eyx.this.g(), AddCartSubscriber.ADD_CART_SUCCESS, 0).show();
                    broadcastCartDataUpdate(eyx.this.g(), b.$ipChange);
                    b.a aVar2 = aVar;
                    if (aVar2 != null) {
                        aVar2.a();
                    }
                    handleSmAchieveCoupon();
                } else {
                    handleAddCartError(mtopResponse);
                }
            }

            private void handleAddCartError(MtopResponse mtopResponse) {
                org.json.JSONObject dataJsonObject;
                String str;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("fb4c80bb", new Object[]{this, mtopResponse});
                    return;
                }
                if (mtopResponse != null) {
                    try {
                        dataJsonObject = mtopResponse.getDataJsonObject();
                    } catch (Throwable unused) {
                    }
                } else {
                    dataJsonObject = null;
                }
                if (dataJsonObject != null && dataJsonObject.getBoolean(nom.KEY_IS_FULL)) {
                    final String string = dataJsonObject.getString("popLayerUrl");
                    if (StringUtils.isEmpty(string)) {
                        return;
                    }
                    eyx.this.c().a(new com.taobao.android.detail.ttdetail.handler.event.a(new JSONObject() { // from class: com.taobao.android.detail.alittdetail.supermarket.SuperMarketAddCartHandler$2.1
                        {
                            put("type", q.EVENT_TYPE_ALTERNATIVE);
                            put("fields", (Object) new JSONObject() { // from class: com.taobao.android.detail.alittdetail.supermarket.SuperMarketAddCartHandler.2.1.1
                                {
                                    put("url", (Object) string);
                                }
                            });
                        }
                    }), new RuntimeAbilityParam[0]);
                    return;
                }
                String str2 = "小二很忙，系统很累，请稍后重试";
                if (mtopResponse == null || mtopResponse.is41XResult()) {
                    str = str2;
                } else {
                    str = mtopResponse.getRetMsg();
                    if (StringUtils.isEmpty(str)) {
                        str = AddCartSubscriber.ADD_CART_FAILED;
                    }
                }
                if (mtopResponse == null || !mtopResponse.isSessionInvalid()) {
                    if (mtopResponse != null && !mtopResponse.isMtopServerError() && !mtopResponse.isMtopSdkError() && !mtopResponse.isNetworkError() && !mtopResponse.isSystemError() && !mtopResponse.isExpiredRequest() && !mtopResponse.is41XResult() && !mtopResponse.isApiLockedResult()) {
                        str2 = str;
                    }
                    Toast.makeText(f.a(), str2, 0).show();
                }
                b.a aVar2 = aVar;
                if (aVar2 != null) {
                    aVar2.b();
                }
                if ((mtopResponse != null && (mtopResponse.isSessionInvalid() || "ANDROID_SYS_LOGIN_CANCEL".equals(mtopResponse.getRetCode()))) || StringUtils.isEmpty(b)) {
                    return;
                }
                l.a(eyx.this.g(), String.format("https://a.m.taobao.com/i%s.htm", b));
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onError(int i, MtopResponse mtopResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                } else {
                    handleAddCartError(mtopResponse);
                }
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
            public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                } else {
                    onError(i, mtopResponse, obj);
                }
            }
        });
        build.mo1328setUnitStrategy("UNIT_TRADE");
        build.mo1305reqMethod(MethodEnum.POST);
        build.startRequest();
        return true;
    }

    private static void b(final String str, final String str2, final String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3509d07", new Object[]{str, str2, str3});
            return;
        }
        MtopRequest mtopRequest = new MtopRequest();
        mtopRequest.setData(new JSONObject() { // from class: com.taobao.android.detail.alittdetail.supermarket.SuperMarketAddCartHandler$3
            {
                put("detail_v", "3.3.2");
                put("asac", (Object) str);
                put("itemApplyParams", (Object) str2);
                put("sellerId", (Object) str3);
            }
        }.toJSONString());
        mtopRequest.setApiName("mtop.taobao.detail.multiApplyCoupon");
        mtopRequest.setVersion("1.0");
        mtopRequest.setNeedEcode(false);
        mtopRequest.setNeedSession(false);
        RemoteBusiness build = RemoteBusiness.build(mtopRequest, e.c());
        build.registeListener((IRemoteListener) new IRemoteBaseListener() { // from class: com.taobao.android.detail.alittdetail.supermarket.SuperMarketAddCartHandler$4
            public static volatile transient /* synthetic */ IpChange $ipChange = null;
            private static final String DEFAULT_TIP = "很遗憾，领券失败。请到商品页面领券处试试～";
            private Handler mHandler = new Handler(Looper.getMainLooper());

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                IpChange ipChange2 = $ipChange;
                boolean z = true;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                    return;
                }
                org.json.JSONObject dataJsonObject = mtopResponse != null ? mtopResponse.getDataJsonObject() : null;
                final String str4 = DEFAULT_TIP;
                if (dataJsonObject != null) {
                    str4 = dataJsonObject.optString("tip", str4);
                }
                if (dataJsonObject == null || !dataJsonObject.optBoolean("isSuccess", false)) {
                    z = false;
                }
                if (z) {
                    return;
                }
                this.mHandler.postDelayed(new Runnable() { // from class: com.taobao.android.detail.alittdetail.supermarket.SuperMarketAddCartHandler$4.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange3 = $ipChange;
                        if (ipChange3 instanceof IpChange) {
                            ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            Toast.makeText(f.a(), str4, 0).show();
                        }
                    }
                }, 5000L);
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onError(int i, final MtopResponse mtopResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                } else {
                    this.mHandler.postDelayed(new Runnable() { // from class: com.taobao.android.detail.alittdetail.supermarket.SuperMarketAddCartHandler$4.2
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                            } else {
                                Toast.makeText(f.a(), mtopResponse.getRetMsg(), 0).show();
                            }
                        }
                    }, 5000L);
                }
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
            public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                } else {
                    onError(i, mtopResponse, obj);
                }
            }
        });
        build.mo1305reqMethod(MethodEnum.GET);
        build.startRequest();
    }

    private static String b(MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e2ef8f2", new Object[]{mtopResponse});
        }
        if (mtopResponse == null) {
            return null;
        }
        try {
            return JSON.parseObject(new String(mtopResponse.getBytedata())).getString("data");
        } catch (Throwable th) {
            i.a("SuperMarketAddCartHandler", "getMtopData error", th);
            return null;
        }
    }
}
