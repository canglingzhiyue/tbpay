package com.taobao.tao.shop.fetcher;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v4.content.LocalBroadcastManager;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.autosize.h;
import com.taobao.android.autosize.l;
import com.taobao.android.behavix.service.BUFS;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.shop.TBSRCtx;
import com.taobao.tao.shop.common.ShopConstants;
import com.taobao.tao.shop.e;
import com.taobao.tao.shop.fetcher.a;
import com.taobao.tao.shop.fetcher.adapter.TBSRDownloadAdapter;
import com.taobao.tao.shop.rule.mtop.MtopTaobaoWirelessShopRouteProcessNewRequest;
import com.taobao.tao.shop.rule.mtop.MtopTaobaoWirelessShopRouteProcessRequest;
import com.taobao.tao.shop.rule.mtop.MtopTaobaoWirelessShopRouteProcessResponse;
import com.taobao.tao.shop.rule.mtop.MtopTaobaoWirelessShopRouteProcessResponseData;
import com.taobao.tao.shop.track.IShopRouterMonitor;
import com.taobao.utils.Global;
import java.util.HashMap;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MtopResponse;
import tb.kge;
import tb.ouu;
import tb.ouw;

/* loaded from: classes8.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final a f21083a;

    static {
        kge.a(-73070087);
    }

    public static /* synthetic */ void a(c cVar, String str, String str2, b bVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4639375f", new Object[]{cVar, str, str2, bVar, new Boolean(z)});
        } else {
            cVar.b(str, str2, bVar, z);
        }
    }

    public c(Context context) {
        com.taobao.tao.shop.fetcher.adapter.a aVar = new com.taobao.tao.shop.fetcher.adapter.a(context);
        com.taobao.tao.shop.fetcher.adapter.b a2 = com.taobao.tao.shop.fetcher.adapter.b.a();
        TBSRDownloadAdapter tBSRDownloadAdapter = new TBSRDownloadAdapter();
        tBSRDownloadAdapter.a(new TBSRDownloadAdapter.a() { // from class: com.taobao.tao.shop.fetcher.c.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.shop.fetcher.adapter.TBSRDownloadAdapter.a
            public void a(Object obj, TBSRDownloadAdapter.TBSRDownloadException tBSRDownloadException) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("33ae46ce", new Object[]{this, obj, tBSRDownloadException});
                } else if (tBSRDownloadException == null) {
                    if (obj == null) {
                        return;
                    }
                    TBSRCtx.safeMonitor(1004, null);
                } else {
                    int errorCode = tBSRDownloadException.getErrorCode();
                    String errorMsg = tBSRDownloadException.getErrorMsg();
                    TBSRCtx.safeMonitor(1005, new IShopRouterMonitor.MonitorException("" + errorCode, errorMsg));
                }
            }
        });
        this.f21083a = new a(context, aVar, a2, tBSRDownloadAdapter);
    }

    public MtopTaobaoWirelessShopRouteProcessResponseData a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MtopTaobaoWirelessShopRouteProcessResponseData) ipChange.ipc$dispatch("3c603a4b", new Object[]{this, str}) : this.f21083a.a(str);
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            this.f21083a.a();
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else {
            this.f21083a.b();
        }
    }

    public void a(final String str, final String str2, final b<MtopTaobaoWirelessShopRouteProcessResponseData> bVar, final boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d3c4d0", new Object[]{this, str, str2, bVar, new Boolean(z)});
            return;
        }
        TBSRCtx.safeMonitor(1001, null);
        this.f21083a.a(str, str2, new a.InterfaceC0879a<MtopTaobaoWirelessShopRouteProcessResponseData>() { // from class: com.taobao.tao.shop.fetcher.c.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.shop.fetcher.a.InterfaceC0879a
            public void a(MtopTaobaoWirelessShopRouteProcessResponseData mtopTaobaoWirelessShopRouteProcessResponseData) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("ca60fc0f", new Object[]{this, mtopTaobaoWirelessShopRouteProcessResponseData});
                    return;
                }
                if (mtopTaobaoWirelessShopRouteProcessResponseData != null && com.taobao.tao.shop.fetcher.adapter.b.a().n() && mtopTaobaoWirelessShopRouteProcessResponseData.isMiniAppRenderStyle()) {
                    mtopTaobaoWirelessShopRouteProcessResponseData = null;
                }
                if (mtopTaobaoWirelessShopRouteProcessResponseData != null) {
                    TBSRCtx.safeMonitor(1000, null);
                    ouu.a("[fetch callback] :  use cache - originUrl=" + str + ", data=" + mtopTaobaoWirelessShopRouteProcessResponseData);
                    bVar.a(str, (String) mtopTaobaoWirelessShopRouteProcessResponseData);
                    return;
                }
                try {
                    Intent intent = new Intent("SHOP_START_ROUTE");
                    intent.putExtra("shopRouteUrl", str);
                    LocalBroadcastManager.getInstance(Global.getApplication()).sendBroadcast(intent);
                } catch (Throwable th) {
                    ouu.a(th, "send shop route preload mini data broadcast failed");
                }
                ouu.a("[fetch callback] :  mtop send-> originUrl=" + str + ", ruleSetName=" + str2);
                c.a(c.this, str, str2, bVar, z);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void b(String str, final String str2, final b<MtopTaobaoWirelessShopRouteProcessResponseData> bVar, boolean z) {
        MtopTaobaoWirelessShopRouteProcessRequest mtopTaobaoWirelessShopRouteProcessRequest;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d0dfabd1", new Object[]{this, str, str2, bVar, new Boolean(z)});
            return;
        }
        TBSRCtx.safeMonitor(1002, null);
        final String b = b(str);
        if (z) {
            Uri parse = Uri.parse(b);
            MtopTaobaoWirelessShopRouteProcessNewRequest mtopTaobaoWirelessShopRouteProcessNewRequest = new MtopTaobaoWirelessShopRouteProcessNewRequest();
            mtopTaobaoWirelessShopRouteProcessNewRequest.pageId = parse.getQueryParameter("pageId");
            mtopTaobaoWirelessShopRouteProcessNewRequest.pathInfo = parse.getQueryParameter("pathInfo");
            mtopTaobaoWirelessShopRouteProcessNewRequest.shopId = parse.getQueryParameter("shopId");
            mtopTaobaoWirelessShopRouteProcessNewRequest.sellerId = parse.getQueryParameter("sellerId");
            ouu.c(mtopTaobaoWirelessShopRouteProcessNewRequest.toString());
            mtopTaobaoWirelessShopRouteProcessRequest = mtopTaobaoWirelessShopRouteProcessNewRequest;
        } else {
            MtopTaobaoWirelessShopRouteProcessRequest mtopTaobaoWirelessShopRouteProcessRequest2 = new MtopTaobaoWirelessShopRouteProcessRequest();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("deviceLevel", (Object) Integer.valueOf(c()));
            jSONObject.put("bxContext", (Object) d());
            mtopTaobaoWirelessShopRouteProcessRequest2.setExtParams(jSONObject.toJSONString());
            mtopTaobaoWirelessShopRouteProcessRequest2.setShopURL(b);
            mtopTaobaoWirelessShopRouteProcessRequest2.setMatchedRuleSetName(str2);
            mtopTaobaoWirelessShopRouteProcessRequest = mtopTaobaoWirelessShopRouteProcessRequest2;
            if (com.taobao.tao.shop.fetcher.adapter.b.a().n()) {
                mtopTaobaoWirelessShopRouteProcessRequest2.setMiniappDowngrade(true);
                mtopTaobaoWirelessShopRouteProcessRequest2.setVERSION("2.0");
                mtopTaobaoWirelessShopRouteProcessRequest = mtopTaobaoWirelessShopRouteProcessRequest2;
                if (com.taobao.tao.shop.fetcher.adapter.b.a((Context) e.b)) {
                    mtopTaobaoWirelessShopRouteProcessRequest2.setAccessibility_downgrade(true);
                    mtopTaobaoWirelessShopRouteProcessRequest = mtopTaobaoWirelessShopRouteProcessRequest2;
                }
            }
        }
        ouw.a(mtopTaobaoWirelessShopRouteProcessRequest, MtopTaobaoWirelessShopRouteProcessResponse.class, new IRemoteBaseListener() { // from class: com.taobao.tao.shop.fetcher.TBSRUrlProcessFetcher$3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                    return;
                }
                TBSRCtx.safeMonitor(1003, null);
                if (!(baseOutDo instanceof MtopTaobaoWirelessShopRouteProcessResponse)) {
                    ouu.b("[fetch callback] : mtop ->  pojo == null or pojo can not cast to data");
                    bVar.a(b, false);
                    return;
                }
                ouu.a("[fetch callback] : mtop ->  success with data=" + baseOutDo);
                MtopTaobaoWirelessShopRouteProcessResponseData mo2429getData = ((MtopTaobaoWirelessShopRouteProcessResponse) baseOutDo).mo2429getData();
                if (com.taobao.tao.shop.fetcher.adapter.b.a().p()) {
                    if (mo2429getData != null && mo2429getData.getShopTargetUrl() != null) {
                        c cVar = c.this;
                        c.$ipChange.a(b, str2, mo2429getData);
                    }
                } else if (mo2429getData != null) {
                    c cVar2 = c.this;
                    c.$ipChange.a(b, str2, mo2429getData);
                }
                bVar.a(b, (String) mo2429getData);
                TBSRCtx.safeMonitor(1006, null);
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
            public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                    return;
                }
                TBSRCtx.safeMonitor(1003, null);
                StringBuilder sb = new StringBuilder();
                sb.append("[fetch callback] : mtop ->  system error   originUrl=");
                sb.append(b);
                sb.append("  error=");
                sb.append(mtopResponse == null ? "response == null" : mtopResponse.getRetMsg());
                ouu.c(sb.toString());
                bVar.a(b, true);
                performMonitorError(mtopResponse);
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onError(int i, MtopResponse mtopResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                    return;
                }
                TBSRCtx.safeMonitor(1003, null);
                StringBuilder sb = new StringBuilder();
                sb.append("[fetch callback] : mtop ->  business error   originUrl=");
                sb.append(b);
                sb.append(" error=");
                sb.append(mtopResponse == null ? "response == null" : mtopResponse.getRetMsg());
                ouu.c(sb.toString());
                bVar.a(b, false);
                performMonitorError(mtopResponse);
            }

            private void performMonitorError(MtopResponse mtopResponse) {
                String str3;
                String str4;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("62b2a1b", new Object[]{this, mtopResponse});
                    return;
                }
                if (mtopResponse != null) {
                    str3 = mtopResponse.getRetCode();
                    str4 = mtopResponse.getRetMsg();
                } else {
                    str3 = "-999";
                    str4 = "MtopResponse is null";
                }
                HashMap hashMap = new HashMap();
                hashMap.put("originUrl", b);
                hashMap.put("ruleSetName", str2);
                TBSRCtx.safeMonitor(1007, new IShopRouterMonitor.MonitorException(str3, str4, hashMap));
            }
        });
    }

    private static String b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6111438d", new Object[]{str});
        }
        if (!l.d(Global.getApplication())) {
            return str;
        }
        return Uri.parse(str).buildUpon().appendQueryParameter("foldDeviceStyle", h.a().b((Context) Global.getApplication()) ^ true ? "open" : "close").toString();
    }

    private static String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("43881515", new Object[0]);
        }
        try {
            if (com.taobao.tao.shop.fetcher.adapter.b.a().x()) {
                return BUFS.getFeature(new BUFS.QueryArgs(), "shop.request.fetch", "PageShop", ShopConstants.PAGE_SHOP);
            }
            return null;
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    private static int c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5889b5d", new Object[0])).intValue();
        }
        try {
            int a2 = com.taobao.application.common.c.a().a("deviceLevel", -1);
            if (a2 == 0) {
                return 3;
            }
            if (a2 == 1) {
                return 2;
            }
            return a2 != 2 ? 0 : 1;
        } catch (Throwable th) {
            th.printStackTrace();
            return 0;
        }
    }
}
