package com.taobao.weex.module;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.alibaba.triver.triver_shop.extension.ShopPointExtension;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.shop.activity.ShopRenderActivity;
import com.taobao.android.shop.utils.c;
import com.taobao.android.task.Coordinator;
import com.taobao.browser.utils.i;
import com.taobao.orange.OrangeConfig;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.remotebusiness.IRemoteListener;
import com.taobao.tao.remotebusiness.MtopBusiness;
import com.taobao.weex.WXEnvironment;
import com.taobao.weex.utils.WXLogUtils;
import java.lang.ref.SoftReference;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MethodEnum;
import mtopsdk.mtop.domain.MtopRequest;
import mtopsdk.mtop.domain.MtopResponse;
import mtopsdk.mtop.domain.ProtocolEnum;
import mtopsdk.mtop.util.ErrorConstant;
import mtopsdk.mtop.util.ReflectUtil;
import tb.kge;

/* loaded from: classes9.dex */
public class NavPrefetchShopFetchManager {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String PAGE_SHOPRENDER_ERROR = "Page_ShopRender_Error";
    public static final String SHOP_MODULE = "Shop";
    private static final String TAG = "NavPrefetchShop";
    private static NavPrefetchShopFetchManager instance;
    private SoftReference<FetchDataResultListener> mListener;
    private Map<String, JSONObject> fetchCache = new ConcurrentHashMap();
    private Map<String, String> fetchCacheString = new ConcurrentHashMap();
    private Map<String, Long> mtopStartTimeCahce = new ConcurrentHashMap();

    /* renamed from: com.taobao.weex.module.NavPrefetchShopFetchManager$1  reason: invalid class name */
    /* loaded from: classes9.dex */
    public class AnonymousClass1 extends Coordinator.TaggedRunnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ long val$mtopStartTime;
        public final /* synthetic */ String val$url;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str, String str2, long j) {
            super(str);
            this.val$url = str2;
            this.val$mtopStartTime = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            int indexOf;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                final Uri parse = Uri.parse(this.val$url);
                if (!parse.isHierarchical()) {
                    return;
                }
                if ("h5.m.taobao.com".equals(parse.getHost()) && "/weex/viewpage.htm".equals(parse.getPath()) && !TextUtils.isEmpty(parse.getQueryParameter(i.WEEX_REFERER_ORIGIN))) {
                    parse = Uri.parse(parse.getQueryParameter(i.WEEX_REFERER_ORIGIN));
                }
                MtopRequest mtopRequest = null;
                final String queryParameter = parse.getQueryParameter("shopId");
                if (TextUtils.isEmpty(queryParameter) && this.val$url != null && this.val$url.contains("shopId") && (indexOf = this.val$url.indexOf("shopId=")) > 0) {
                    int indexOf2 = this.val$url.indexOf("&", indexOf);
                    if (indexOf2 == -1) {
                        indexOf2 = this.val$url.length();
                    }
                    int i = indexOf + 7;
                    if (i < indexOf2) {
                        queryParameter = this.val$url.substring(i, indexOf2);
                    }
                }
                if (!TextUtils.isEmpty(queryParameter) && "true".equals(OrangeConfig.getInstance().getConfig("shop_render", "use_static_default_mtop_prefetch", "true")) && parse.getHost().contains("market.") && parse.getHost().contains(".taobao.com") && "/apps/market/shop/weex.html".equals(parse.getPath())) {
                    mtopRequest = new MtopRequest();
                    mtopRequest.setApiName(ShopPointExtension.SHOP_FETCH_API);
                    mtopRequest.setVersion("2.0");
                    mtopRequest.setNeedEcode(false);
                    HashMap hashMap = new HashMap();
                    hashMap.put("shopId", parse.getQueryParameter("shopId"));
                    hashMap.put("sellerId", parse.getQueryParameter("sellerId"));
                    hashMap.put("shopNavi", parse.getQueryParameter(ShopRenderActivity.SHOP_NAVI));
                    hashMap.put("originUrl", parse.getQueryParameter("shop_origin"));
                    mtopRequest.dataParams = hashMap;
                    mtopRequest.setData(ReflectUtil.converMapToDataStr(mtopRequest.dataParams));
                }
                if (mtopRequest != null) {
                    MtopBusiness build = MtopBusiness.build(mtopRequest);
                    build.mo1303protocol(ProtocolEnum.HTTPSECURE).mo1334useCache().mo1305reqMethod(MethodEnum.GET).registerListener((IRemoteListener) new IRemoteBaseListener() { // from class: com.taobao.weex.module.NavPrefetchShopFetchManager.1.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
                        public void onSystemError(int i2, MtopResponse mtopResponse, Object obj) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i2), mtopResponse, obj});
                                return;
                            }
                            WXLogUtils.e("shopRender-data-prefetch-in-nav onSystemError.");
                            if (mtopResponse != null && (ErrorConstant.ERRCODE_NO_NETWORK.equals(mtopResponse.getRetCode()) || "ANDROID_SYS_NETWORK_ERROR".equals(mtopResponse.getRetCode()))) {
                                Log.e(NavPrefetchShopFetchManager.TAG, mtopResponse.getRetCode() + " in NavPrefetchShopFetchManager mtop callback onSystemError");
                                return;
                            }
                            AppMonitor.Alarm.commitFail("Shop", "Page_ShopRender_Error", JSON.toJSONString(mtopResponse) + "|" + AnonymousClass1.this.val$url, "-61005", "error in nav prefetch onSystemError." + parse.getQuery());
                            NavPrefetchShopFetchManager.access$000(NavPrefetchShopFetchManager.this, "-61005", "error in nav prefetch onSystemError.", "dataProcess", new Object[]{JSON.toJSONString(mtopResponse) + "|" + AnonymousClass1.this.val$url});
                        }

                        @Override // com.taobao.tao.remotebusiness.IRemoteListener
                        public void onError(int i2, MtopResponse mtopResponse, Object obj) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i2), mtopResponse, obj});
                                return;
                            }
                            String str = mtopResponse.getBytedata() == null ? "{}" : new String(mtopResponse.getBytedata());
                            WXLogUtils.e("shopRender-data-prefetch-in-nav onError." + str);
                            if (str.contains("店铺已被冻结") || str.contains("店铺已被释放")) {
                                Log.e(NavPrefetchShopFetchManager.TAG, "Common error. in NavPrefetchShopFetchManager mtop callback onError. " + str);
                                return;
                            }
                            AppMonitor.Alarm.commitFail("Shop", "Page_ShopRender_Error", str + "|" + AnonymousClass1.this.val$url, "-61004", "error in nav prefetch onError." + parse.getQuery());
                            NavPrefetchShopFetchManager.access$000(NavPrefetchShopFetchManager.this, "-61004", "error in nav prefetch onError.", "dataProcess", new Object[]{str + "|" + AnonymousClass1.this.val$url});
                        }

                        @Override // com.taobao.tao.remotebusiness.IRemoteListener
                        public void onSuccess(int i2, final MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i2), mtopResponse, baseOutDo, obj});
                            } else {
                                Coordinator.execute(new Coordinator.TaggedRunnable("shopRender-data-prefetch-in-nav-complete") { // from class: com.taobao.weex.module.NavPrefetchShopFetchManager.1.1.1
                                    public static volatile transient /* synthetic */ IpChange $ipChange;

                                    @Override // java.lang.Runnable
                                    public void run() {
                                        IpChange ipChange3 = $ipChange;
                                        if (ipChange3 instanceof IpChange) {
                                            ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                            return;
                                        }
                                        long currentTimeMillis = System.currentTimeMillis();
                                        try {
                                            if (mtopResponse.getBytedata() == null || mtopResponse.getBytedata().length <= 0) {
                                                AppMonitor.Alarm.commitFail("Shop", "Page_ShopRender_Error", parse.getQuery(), "-61003", "empty response in nav prefetch process." + queryParameter);
                                                NavPrefetchShopFetchManager.access$000(NavPrefetchShopFetchManager.this, "-61003", "empty response in nav prefetch process.", "dataProcess", new Object[]{queryParameter + "|" + AnonymousClass1.this.val$url});
                                                return;
                                            }
                                            String str = new String(mtopResponse.getBytedata());
                                            if (parse.getBooleanQueryParameter("_use_string_mtop_result", false)) {
                                                NavPrefetchShopFetchManager.access$100(NavPrefetchShopFetchManager.getInstance(), queryParameter, str, AnonymousClass1.this.val$mtopStartTime);
                                            } else {
                                                JSONObject parseObject = JSONObject.parseObject(str);
                                                Map<String, List<String>> headerFields = mtopResponse.getHeaderFields();
                                                if (headerFields != null && headerFields.get("eagleeye-traceid") != null) {
                                                    parseObject.put("eagleeye-traceid", (Object) headerFields.get("eagleeye-traceid"));
                                                }
                                                NavPrefetchShopFetchManager.access$200(NavPrefetchShopFetchManager.getInstance(), queryParameter, parseObject, AnonymousClass1.this.val$mtopStartTime);
                                            }
                                            long currentTimeMillis2 = System.currentTimeMillis();
                                            if (!WXEnvironment.isApkDebugable()) {
                                                return;
                                            }
                                            String str2 = "main-cost navFetchData get value, shopId=" + queryParameter + " totalCost " + (currentTimeMillis2 - AnonymousClass1.this.val$mtopStartTime) + " ms. receiver cost " + (currentTimeMillis2 - currentTimeMillis) + " ms.  at " + Thread.currentThread().getName();
                                        } catch (Throwable th) {
                                            WXLogUtils.e("error in processDataPrefetchInNavAsync navFetchData", th);
                                            AppMonitor.Alarm.commitFail("Shop", "Page_ShopRender_Error", th.getMessage() + "|" + AnonymousClass1.this.val$url, "-61002", "error in nav prefetch process." + queryParameter);
                                            NavPrefetchShopFetchManager.access$300(NavPrefetchShopFetchManager.this, "-61002", "error in nav prefetch process.", "dataProcess", th, new Object[]{queryParameter + "|" + th.getMessage() + "|" + AnonymousClass1.this.val$url});
                                        }
                                    }
                                }, 20);
                            }
                        }
                    });
                    build.startRequest();
                    if (!WXEnvironment.isApkDebugable()) {
                        return;
                    }
                    String str = "main-cost navFetchData fired in nav. " + Thread.currentThread().getName();
                    return;
                }
                String str2 = "main-cost no prefetch string by PrefetchX. " + queryParameter;
                if (parse.isHierarchical() && ("detail.m.tmall.com".equals(parse.getHost()) || "/app/tb-source-app/shopindex/pages/index".equals(parse.getPath()) || "/app/tb-source-app/wz111/pages/error".equals(parse.getPath()) || "ts.tmall.com".equals(parse.getHost()) || "tmyp.tmall.com".equals(parse.getHost()) || "/app/trip/fliggy-shop/pages/index".equals(parse.getPath()) || this.val$url.contains("pages.tmall.com/wow/"))) {
                    String str3 = "empty prefetch string. " + queryParameter + " " + this.val$url;
                } else if (new Random().nextInt(100) <= 94) {
                } else {
                    AppMonitor.Alarm.commitFail("Shop", "Page_ShopRender_Error", this.val$url, "-61006", "empty prefetch string." + queryParameter);
                    NavPrefetchShopFetchManager.access$000(NavPrefetchShopFetchManager.this, "-61006", "empty prefetch string.", "dataProcess", new Object[]{queryParameter});
                }
            } catch (Throwable th) {
                WXLogUtils.e("error in sending processDataPrefetchInNavAsync navFetchData.", th);
                NavPrefetchShopFetchManager.access$300(NavPrefetchShopFetchManager.this, "-61010", "error in sending processDataPrefetchInNavAsync navFetchData.", "dataProcess", th, new Object[]{this.val$url});
            }
        }
    }

    /* loaded from: classes9.dex */
    public interface FetchDataResultListener {
        void onReceiveFetchData(String str, JSONObject jSONObject, long j);

        void onReceiveFetchDataString(String str, String str2, long j);
    }

    static {
        kge.a(581319675);
    }

    public static /* synthetic */ void access$000(NavPrefetchShopFetchManager navPrefetchShopFetchManager, String str, String str2, String str3, Object[] objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bca13a8", new Object[]{navPrefetchShopFetchManager, str, str2, str3, objArr});
        } else {
            navPrefetchShopFetchManager.reportFail(str, str2, str3, objArr);
        }
    }

    public static /* synthetic */ void access$100(NavPrefetchShopFetchManager navPrefetchShopFetchManager, String str, String str2, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36b295a4", new Object[]{navPrefetchShopFetchManager, str, str2, new Long(j)});
        } else {
            navPrefetchShopFetchManager.putShopFetchDataString(str, str2, j);
        }
    }

    public static /* synthetic */ void access$200(NavPrefetchShopFetchManager navPrefetchShopFetchManager, String str, JSONObject jSONObject, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c955276b", new Object[]{navPrefetchShopFetchManager, str, jSONObject, new Long(j)});
        } else {
            navPrefetchShopFetchManager.putShopFetchData(str, jSONObject, j);
        }
    }

    public static /* synthetic */ void access$300(NavPrefetchShopFetchManager navPrefetchShopFetchManager, String str, String str2, String str3, Throwable th, Object[] objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("275d008", new Object[]{navPrefetchShopFetchManager, str, str2, str3, th, objArr});
        } else {
            navPrefetchShopFetchManager.reportFail(str, str2, str3, th, objArr);
        }
    }

    private NavPrefetchShopFetchManager() {
    }

    public static NavPrefetchShopFetchManager getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (NavPrefetchShopFetchManager) ipChange.ipc$dispatch("20a91d98", new Object[0]);
        }
        if (instance == null) {
            synchronized (NavPrefetchShopFetchManager.class) {
                if (instance == null) {
                    instance = new NavPrefetchShopFetchManager();
                }
            }
        }
        return instance;
    }

    private void putShopFetchData(String str, JSONObject jSONObject, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da912b84", new Object[]{this, str, jSONObject, new Long(j)});
            return;
        }
        if (this.fetchCache.size() > 1) {
            AppMonitor.Alarm.commitFail("Shop", "Page_ShopRender_Error", str, "-61007", "fetchCache more than 1, clear. " + this.fetchCache.keySet());
            reportFail("-61007", "fetchCache more than 1, will clear.", "dataProcess", this.fetchCache.keySet());
            this.fetchCache.clear();
        }
        SoftReference<FetchDataResultListener> softReference = this.mListener;
        if (softReference != null && softReference.get() != null) {
            this.mListener.get().onReceiveFetchData(str, jSONObject, j);
            return;
        }
        this.fetchCache.put(str, jSONObject);
        this.mtopStartTimeCahce.put(str, Long.valueOf(j));
    }

    private void putShopFetchDataString(String str, String str2, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e87684b9", new Object[]{this, str, str2, new Long(j)});
            return;
        }
        if (this.fetchCache.size() > 1) {
            AppMonitor.Alarm.commitFail("Shop", "Page_ShopRender_Error", str, "-61007", "fetchCache more than 1, will clear." + this.fetchCache.keySet());
            reportFail("-61007", "fetchCache more than 1, will clear.", "dataProcess", this.fetchCache.keySet());
            this.fetchCache.clear();
        }
        SoftReference<FetchDataResultListener> softReference = this.mListener;
        if (softReference != null && softReference.get() != null) {
            this.mListener.get().onReceiveFetchDataString(str, str2, j);
            return;
        }
        this.fetchCacheString.put(str, str2);
        this.mtopStartTimeCahce.put(str, Long.valueOf(j));
    }

    public void setFetchDataListener(String str, FetchDataResultListener fetchDataResultListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("825a698a", new Object[]{this, str, fetchDataResultListener});
        } else if (fetchDataResultListener == null) {
        } else {
            if (!TextUtils.isEmpty(str) && this.fetchCache.get(str) != null) {
                fetchDataResultListener.onReceiveFetchData(str, this.fetchCache.remove(str), this.mtopStartTimeCahce.get(str) != null ? this.mtopStartTimeCahce.get(str).longValue() : System.currentTimeMillis());
            } else if (!TextUtils.isEmpty(str) && this.fetchCacheString.get(str) != null) {
                fetchDataResultListener.onReceiveFetchDataString(str, this.fetchCacheString.remove(str), this.mtopStartTimeCahce.get(str) != null ? this.mtopStartTimeCahce.get(str).longValue() : System.currentTimeMillis());
            } else {
                this.mListener = new SoftReference<>(fetchDataResultListener);
            }
        }
    }

    public void clear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b42d4c54", new Object[]{this});
        } else {
            this.fetchCache.clear();
        }
    }

    public void removeFetchDataListener(FetchDataResultListener fetchDataResultListener) {
        SoftReference<FetchDataResultListener> softReference;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da93c1e", new Object[]{this, fetchDataResultListener});
        } else if (fetchDataResultListener == null || (softReference = this.mListener) == null || fetchDataResultListener != softReference.get()) {
        } else {
            this.mListener.clear();
        }
    }

    public void processDataPrefetchInNavAsync(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("43c6f75f", new Object[]{this, str});
        } else {
            Coordinator.execute(new AnonymousClass1("shopRender-data-prefetch-in-nav", str, System.currentTimeMillis()), 20);
        }
    }

    private void reportFail(String str, String str2, String str3, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d361eba", new Object[]{this, str, str2, str3, objArr});
        } else {
            c.b(str, str2, str3, objArr);
        }
    }

    private void reportFail(String str, String str2, String str3, Throwable th, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e980d33", new Object[]{this, str, str2, str3, th, objArr});
        } else {
            c.b(str, str2, str3, th, objArr);
        }
    }
}
