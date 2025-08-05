package tb;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.alibaba.ability.localization.b;
import com.alipay.mobile.common.rpc.util.RpcInvokerUtil;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.activity.DetailCoreActivity;
import com.taobao.android.detail.core.utils.t;
import com.taobao.android.detail.datasdk.model.datamodel.node.SellerNode;
import com.taobao.android.detail.datasdk.model.datamodel.node.c;
import com.taobao.android.detail.wrapper.ext.request.client.newmtop.MtopStreamRequestCallback;
import com.taobao.android.live.plugin.atype.flexalocal.input.InputFrame3;
import com.taobao.taobao.R;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public class ecg {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ERR_UMBRELLA_PIC_GALLERY_DEGRADE = "90060";
    public static final String ERR_UMBRELLA_PIC_GALLERY_DEGRADE_TAKE_REASON = "90061";
    public static final String PERFORMANCE_BIZ_NAME = "Page_Detail_Performance";
    public static final String UMB_FEATURE_ASYNC_TEMPLATEDATA = "AsyncTemplateData";
    public static final String UMB_FEATURE_ASYNC_VIEW = "asyncView";
    public static final String UMB_FEATURE_COMPONENT_RENDER_TAG = "umbrella.component.render";
    public static final String UMB_FEATURE_DATA_PROCESS = "dataProcess";
    public static final String UMB_FEATURE_DOWNGRADE = "downgrade";
    public static final String UMB_FEATURE_EVENT_PROCESS = "eventProcess";
    public static final String UMB_FEATURE_INSIDE_DETAIL = "insideDetail";
    public static final String UMB_FEATURE_LBS = "LoadLBS";
    public static final String UMB_FEATURE_NETWORK_REQUEST = "netRequest";
    public static final String UMB_FEATURE_NEW_MTOP_DOWNGRADE = "MainInterfaceDowngrade";
    public static final String UMB_FEATURE_OPEN_BUSINESS = "openBusiness";
    public static final String UMB_FEATURE_PAGE_RENDER = "pageRender";
    public static final String UMB_FEATURE_TCLOUD_OFFLINE = "offline_monitor";
    public static final String UMB_FEATURE_VIDEO_PLAY = "LoadVideo";
    public static final String UMB_FEATURE_WEB_VIEW = "webView";
    public static final String UMB_FEATURE_WHITE_SCREEN = "WhiteScreen";

    /* renamed from: a  reason: collision with root package name */
    private static String f27184a;
    private static String b;

    /* loaded from: classes4.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public String f27185a = "";
        public String b = "";
        public String c = "";
        public String d = "";

        static {
            kge.a(-412179785);
        }
    }

    static {
        kge.a(-1621574665);
        f27184a = eaz.DINAMIC_MODULE_NAME;
        b = "2.0";
        emu.a("com.taobao.android.detail.core.detail.profile.UmbrellaMonitor");
    }

    public static void a(Context context, String str, boolean z, boolean z2, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64816174", new Object[]{context, str, new Boolean(z), new Boolean(z2), str2});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("itemId", str);
        hashMap.put("hasApiStack", z + "");
        hashMap.put("isPreload", z2 + "");
        hashMap.put("stackTrack", str2 + "");
        a(context, UMB_FEATURE_TCLOUD_OFFLINE, UMB_FEATURE_TCLOUD_OFFLINE, hashMap, "Tcloud_Offline", "Tcloud下线埋点");
    }

    public static void a(Context context, boolean z, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b06cf3e", new Object[]{context, new Boolean(z), str});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("msg", str + "");
        a(context, UMB_FEATURE_TCLOUD_OFFLINE, UMB_FEATURE_TCLOUD_OFFLINE, hashMap, z ? "Init_ItemId_Empty" : "Update_ItemId_Empty", "ItemId为空（初始化/穿越）");
    }

    public static void a(Context context, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f3f1e3e", new Object[]{context, str, str2, str3});
            return;
        }
        HashMap hashMap = new HashMap();
        if (TextUtils.isEmpty(str)) {
            str = "";
        }
        hashMap.put("itemId", str);
        if (TextUtils.isEmpty(str2)) {
            str2 = "";
        }
        hashMap.put("from", str2);
        if (TextUtils.isEmpty(str3)) {
            str3 = "";
        }
        hashMap.put("bucketId", str3);
        e(context, "Page_Detail_Preload", "cacheRender", "PreloadCacheRender", hashMap);
    }

    public static void b(Context context, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("773e7c9d", new Object[]{context, str, str2, str3});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("dxName", str);
        hashMap.put("dxVersion", str2);
        hashMap.put("dxUrl", str3);
        a(context, PERFORMANCE_BIZ_NAME, "contentListDxDownloadFail", "contentListDxDownloadFail", hashMap, "contentListDxDownloadFail", "列表DX下载失败");
    }

    public static void a(Context context, String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6fc7488", new Object[]{context, str, str2, str3, str4});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("dxName", str);
        hashMap.put("dxVersion", str2);
        hashMap.put("dxUrl", str3);
        a(context, PERFORMANCE_BIZ_NAME, "contentListDxRenderFail", "contentListDxRenderFail", hashMap, "contentListDxRenderFail", str4);
    }

    public static void b(Context context, String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f5a9927", new Object[]{context, str, str2, str3, str4});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("dxName", str);
        hashMap.put("dxVersion", str2);
        hashMap.put("dxUrl", str3);
        a(context, PERFORMANCE_BIZ_NAME, "contentDetailDxRenderFail", "contentDetailDxRenderFail", hashMap, "contentDetailDxRenderFail", str4);
    }

    public static void c(Context context, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf3ddafc", new Object[]{context, str, str2, str3});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("dxName", str);
        hashMap.put("dxVersion", str2);
        hashMap.put("dxUrl", str3);
        a(context, PERFORMANCE_BIZ_NAME, "contentListDxDownloadFail", "contentListDxDownloadFail", hashMap, "contentListDxDownloadFail", "详情DX下载失败");
    }

    public static void a(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d18de974", new Object[]{context, str, str2});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("itemId", str);
        a(context, PERFORMANCE_BIZ_NAME, "contentDataRequestFail", "contentDataRequestFail", hashMap, "contentDataRequestFail", str2);
    }

    public static void a(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61b6362a", new Object[]{context, str});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("itemId", str);
        e(context, PERFORMANCE_BIZ_NAME, "contentDataRequestSuccess", "contentDataRequestSuccess", hashMap);
    }

    public static void d(Context context, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73d395b", new Object[]{context, str, str2, str3});
            return;
        }
        HashMap hashMap = new HashMap();
        if (TextUtils.isEmpty(str)) {
            str = "";
        }
        hashMap.put("itemId", str);
        if (TextUtils.isEmpty(str2)) {
            str2 = "";
        }
        hashMap.put("from", str2);
        if (TextUtils.isEmpty(str3)) {
            str3 = "";
        }
        hashMap.put("bucketId", str3);
        e(context, "Page_Detail_Preload", "totalRender", "DetailRender", hashMap);
    }

    public static void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{str});
            return;
        }
        HashMap hashMap = new HashMap();
        if (TextUtils.isEmpty(str)) {
            str = "";
        }
        hashMap.put("itemId", str);
        a(PERFORMANCE_BIZ_NAME, "detailDegrade", "degradeToErrorPage", hashMap, "degradeToErrorPage", "degradeToErrorPage");
    }

    public static void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{str});
            return;
        }
        HashMap hashMap = new HashMap();
        if (TextUtils.isEmpty(str)) {
            str = "";
        }
        hashMap.put("itemId", str);
        a(PERFORMANCE_BIZ_NAME, "detailDegrade", "degradeToBaseDetail", hashMap, "degradeToBaseDetail", "degradeToBaseDetail");
    }

    public static void a(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee2b490", new Object[]{str, str2, str3, str4});
            return;
        }
        HashMap hashMap = new HashMap();
        if (TextUtils.isEmpty(str)) {
            str = "";
        }
        hashMap.put("itemIds", str);
        if (TextUtils.isEmpty(str2)) {
            str2 = "0";
        }
        hashMap.put("itemCount", str2);
        if (TextUtils.isEmpty(str3)) {
            str3 = "";
        }
        hashMap.put("from", str3);
        if (TextUtils.isEmpty(str4)) {
            str4 = "";
        }
        hashMap.put("bucketId", str4);
        a("Page_Detail_Preload", tbt.PRE_REQUEST, "DetailPreloadRequest", hashMap);
    }

    public static void b(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb13311", new Object[]{str, str2, str3, str4});
            return;
        }
        HashMap hashMap = new HashMap();
        if (TextUtils.isEmpty(str)) {
            str = "";
        }
        hashMap.put("itemIds", str);
        if (TextUtils.isEmpty(str2)) {
            str2 = "0";
        }
        hashMap.put("itemCount", str2);
        if (TextUtils.isEmpty(str3)) {
            str3 = "";
        }
        hashMap.put("from", str3);
        if (TextUtils.isEmpty(str4)) {
            str4 = "";
        }
        hashMap.put("bucketId", str4);
        a("Page_Detail_Preload", "preRequestSuccess", "DetailPreloadRequest", hashMap);
    }

    public static void c(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("107fb192", new Object[]{str, str2, str3, str4});
            return;
        }
        HashMap hashMap = new HashMap();
        if (TextUtils.isEmpty(str)) {
            str = "";
        }
        hashMap.put("itemIds", str);
        if (TextUtils.isEmpty(str2)) {
            str2 = "";
        }
        hashMap.put("message", str2);
        if (TextUtils.isEmpty(str3)) {
            str3 = "";
        }
        hashMap.put("from", str3);
        if (TextUtils.isEmpty(str4)) {
            str4 = "";
        }
        hashMap.put("bucketId", str4);
        a("Page_Detail_Preload", "preRequestFail", "DetailPreloadRequest", hashMap, "100077", "批量预请求失败");
    }

    public static void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{str, str2});
            return;
        }
        HashMap hashMap = new HashMap();
        if (TextUtils.isEmpty(str)) {
            str = "";
        }
        hashMap.put("itemId", str);
        if (TextUtils.isEmpty(str2)) {
            str2 = "";
        }
        hashMap.put("from", str2);
        a("Page_Detail_Preload", "navRequest", "DetailPreloadRequest", hashMap);
    }

    public static void b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65d7b87d", new Object[]{str, str2});
            return;
        }
        HashMap hashMap = new HashMap();
        if (TextUtils.isEmpty(str)) {
            str = "";
        }
        hashMap.put("itemId", str);
        if (TextUtils.isEmpty(str2)) {
            str2 = "";
        }
        hashMap.put("from", str2);
        a("Page_Detail_Preload", "navRequestSuccess", "DetailPreloadRequest", hashMap);
    }

    public static void c(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f277e37e", new Object[]{str, str2});
            return;
        }
        HashMap hashMap = new HashMap();
        if (TextUtils.isEmpty(str)) {
            str = "";
        }
        hashMap.put("itemId", str);
        if (TextUtils.isEmpty(str2)) {
            str2 = "";
        }
        hashMap.put("from", str2);
        a("Page_Detail_Preload", "navRequestFail", "DetailPreloadRequest", hashMap);
    }

    public static void a(String str, String str2, boolean z, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36b578a2", new Object[]{str, str2, new Boolean(z), str3});
            return;
        }
        HashMap hashMap = new HashMap();
        if (TextUtils.isEmpty(str)) {
            str = "";
        }
        hashMap.put("itemId", str);
        if (TextUtils.isEmpty(str2)) {
            str2 = "";
        }
        hashMap.put("from", str2);
        hashMap.put("cache", String.valueOf(z));
        if (TextUtils.isEmpty(str3)) {
            str3 = "";
        }
        hashMap.put("detailVersion", str3);
        a("Page_Detail_Preload", "navRequestCache", "DetailPreloadRequest", hashMap);
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
        } else {
            a("Page_Detail_Preload", "navRequestCacheNotUse", "DetailPreloadRequest", new HashMap());
        }
    }

    public static void d(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f180e7f", new Object[]{str, str2});
            return;
        }
        HashMap hashMap = new HashMap();
        if (TextUtils.isEmpty(str)) {
            str = "";
        }
        hashMap.put("from", str);
        if (TextUtils.isEmpty(str2)) {
            str2 = "";
        }
        hashMap.put(nfc.PHA_MONITOR_DIMENSION_PRELOAD_TYPE, str2);
        a("Page_Detail_Preload", "preloadRequestItemIdNull", "DetailPreloadRequest", hashMap, "100083", "itemId is Null");
    }

    public static void d(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("114e3013", new Object[]{str, str2, str3, str4});
            return;
        }
        HashMap hashMap = new HashMap();
        if (TextUtils.isEmpty(str2)) {
            str2 = "";
        }
        hashMap.put("message", str2);
        if (TextUtils.isEmpty(str)) {
            str = "";
        }
        hashMap.put("itemId", str);
        if (TextUtils.isEmpty(str3)) {
            str3 = "";
        }
        hashMap.put("from", str3);
        if (TextUtils.isEmpty(str4)) {
            str4 = "";
        }
        hashMap.put("bucketId", str4);
        a("Page_Detail_Preload", "batchDetailResponse", "DetailPreloadResponse", hashMap, "100079", "预缓存数据判断不保存");
    }

    public static void a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("929ad046", new Object[]{str, str2, str3});
            return;
        }
        HashMap hashMap = new HashMap();
        if (TextUtils.isEmpty(str)) {
            str = "";
        }
        hashMap.put("itemIds", str);
        if (TextUtils.isEmpty(str2)) {
            str2 = "";
        }
        hashMap.put("message", str2);
        if (TextUtils.isEmpty(str3)) {
            str3 = "";
        }
        hashMap.put("from", str3);
        a("Page_Detail_Preload", "preloadTaskExecuteFail", "DetailPreloadRequest", hashMap, "100080", "预加载任务执行失败");
    }

    public static void b(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3bbd7193", new Object[]{context, str, str2});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("itemId", str);
        hashMap.put("message", str2);
        a(context, "Page_Detail_Preload", "preloadDowngrade", "DetailPreload", hashMap, "100075", "详情预加载优化降级");
    }

    public static void c(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5ecf9b2", new Object[]{context, str, str2});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("itemId", str);
        hashMap.put("message", str2);
        a(context, "Page_Detail_Preload", "preloadUpgrade", "DetailPreload", hashMap, "100081", "详情预加载优化升级");
    }

    public static void d(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("101c81d1", new Object[]{context, str, str2});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("itemId", str);
        hashMap.put("message", str2);
        a(context, "Page_Detail_Preload", "preloadMainPicUrlDiff", "DetailPreload", hashMap, "100076", "详情预加载头图不一致");
    }

    public static void e(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("121cae94", new Object[]{str, str2, str3, str4});
            return;
        }
        HashMap hashMap = new HashMap();
        if (TextUtils.isEmpty(str)) {
            str = "";
        }
        hashMap.put("itemIds", str);
        if (TextUtils.isEmpty(str2)) {
            str2 = "";
        }
        hashMap.put("message", str2);
        if (TextUtils.isEmpty(str3)) {
            str3 = "";
        }
        hashMap.put("from", str3);
        if (TextUtils.isEmpty(str4)) {
            str4 = "";
        }
        hashMap.put("data", str4);
        a("Page_Detail_Preload", "preloadSaveBatchDataError", "DetailPreload", hashMap, "100082", "详情预加载数据保存失败");
    }

    public static void b(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b80d809", new Object[]{context, str});
            return;
        }
        HashMap hashMap = new HashMap();
        if (str == null) {
            str = "";
        }
        hashMap.put("message", str);
        a(context, PERFORMANCE_BIZ_NAME, "detail_ref", "detail_ref", hashMap, "200008", "网络请求时ref 弱引用对像被回收导致错误");
    }

    public static void c(Context context, String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57b8bdc6", new Object[]{context, str, str2, str3, str4});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("itemId", str);
        hashMap.put("feature", str2);
        hashMap.put("type", str3);
        hashMap.put("errorMsg", str4);
        a(context, UMB_FEATURE_OPEN_BUSINESS, "OpenBusiness", hashMap, "90075", "详情开放定制");
    }

    @Deprecated
    public static void c(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d54b79e8", new Object[]{context, str});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("itemId", str);
        a(context, "dataProcess", "LoadDetail", hashMap, "90025", "主接口全部数据为空");
    }

    public static void e(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a4c09f0", new Object[]{context, str, str2});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(eby.KEY_PIC_URL, str);
        if (!TextUtils.isEmpty(str2)) {
            hashMap.put("retCode", str2);
        }
        a(context, "dataProcess", "descNativeLoadPic", hashMap, "descNativeLoadPicError", "native宝贝详情图片加载失败");
    }

    public static void d(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f161bc7", new Object[]{context, str});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("errorInfo", str);
        a(context, UMB_FEATURE_WEB_VIEW, "detailWebViewDestroy", hashMap, "detailWebViewDestroyError", "详情webView destroy异常");
    }

    public static void b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9eca0fff", new Object[]{context});
            return;
        }
        f27184a = eaz.DINAMIC_MODULE_NAME;
        d(context, "pageRender", b, new HashMap());
    }

    public static void a(Context context, String str, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("47d01c0b", new Object[]{context, str, th});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("itemId", str);
        hashMap.put("errorTrace", Log.getStackTraceString(th));
        a(context, "downgrade", "DowngradeH5Exception", hashMap, "90015", "客户端异常进入H5详情");
    }

    public static void b(Context context, String str, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3921ab8c", new Object[]{context, str, th});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("itemId", str);
        hashMap.put("errorTrace", Log.getStackTraceString(th));
        a(context, "downgrade", "UltronDowngradeH5Exception", hashMap, "90016", "客户端新奥创解析异常进入H5详情");
    }

    public static void a(Context context, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9870b95", new Object[]{context, th});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("errorTrace", Log.getStackTraceString(th));
        a(context, UMB_FEATURE_ASYNC_VIEW, "ViewContextException", hashMap, "90045", "异步视图相关异常");
    }

    public static void i(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("230a2a6c", new Object[]{context, str, str2});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("errorMsg", str2);
        if (str == null) {
            str = "";
        }
        hashMap.put("itemId", str);
        a(context, "netRequest", "LoadDesc", hashMap, "90022", "图文详情接口请求失败");
    }

    public static void a(Context context, String str, String str2, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("587e3b01", new Object[]{context, str, str2, th});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("errorTrace", Log.getStackTraceString(th));
        if (str == null) {
            str = "";
        }
        hashMap.put("itemId", str);
        hashMap.put(InputFrame3.TYPE_RESPONSE, str2);
        a(context, "dataProcess", "LoadDescDate", hashMap, "90023", "图文详情数据解析异常");
    }

    public static void e(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48e0bda6", new Object[]{context, str});
            return;
        }
        HashMap hashMap = new HashMap();
        if (str == null) {
            str = "";
        }
        hashMap.put("itemId", str);
        a(context, "descNativeDegradeH5", "descNativeDegradeH5", hashMap, "descNativeDegradeH5", "图文详情Native降级到H5渲染");
    }

    public static void a(Context context, String str, String str2, int i, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("58729c19", new Object[]{context, str, str2, new Integer(i), str3});
            return;
        }
        HashMap hashMap = new HashMap();
        if (str == null) {
            str = "";
        }
        hashMap.put("itemId", str);
        hashMap.put("url", str2);
        hashMap.put("receivedErrorCode", i + "");
        hashMap.put("receivedErrorMsg", str3);
        a(context, "descH5LoadFail", "descH5LoadFail", hashMap, "descH5LoadFail", "图文详情H5加载失败");
    }

    public static void a(Context context, String str, String str2, String str3, int i, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8600f0f", new Object[]{context, str, str2, str3, new Integer(i), str4});
            return;
        }
        HashMap hashMap = new HashMap();
        if (str == null) {
            str = "";
        }
        hashMap.put("itemId", str);
        hashMap.put("url", str2);
        hashMap.put("descUrl", str3);
        hashMap.put("receivedErrorCode", i + "");
        hashMap.put("receivedErrorMsg", str4);
        a(context, "descH5LoadFailFromNativeDegrade", "descH5LoadFailFromNativeDegrade", hashMap, "descH5LoadFailFromNativeDegrade", "来自Native降级的图文详情H5加载失败");
    }

    public static void g(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc760164", new Object[]{context, str});
            return;
        }
        HashMap hashMap = new HashMap();
        if (str == null) {
            str = "";
        }
        hashMap.put("itemId", str);
        e(context, PERFORMANCE_BIZ_NAME, "descNativeLoadData", "descNativeLoadData", hashMap);
    }

    public static void h(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f640a343", new Object[]{context, str});
            return;
        }
        HashMap hashMap = new HashMap();
        if (str == null) {
            str = "";
        }
        hashMap.put("itemId", str);
        e(context, PERFORMANCE_BIZ_NAME, "descH5LoadData", "descH5LoadData", hashMap);
    }

    public static void c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f76bb9e", new Object[]{context});
        } else {
            a(context, PERFORMANCE_BIZ_NAME, "mainRequestFirstExecute", "mainRequestFirstExecute", null, "mainRequestFirstExecute", "主请求比预请求先执行");
        }
    }

    public static void a(Context context, String str, String str2, List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea830e65", new Object[]{context, str, str2, list});
        } else if (list == null || list.isEmpty()) {
        } else {
            HashMap hashMap = new HashMap();
            if (str == null) {
                str = "";
            }
            hashMap.put("itemId", str);
            if (str2 == null) {
                str2 = "";
            }
            hashMap.put("fromSource", str2);
            hashMap.put("diffParams", list.toString());
            e(context, PERFORMANCE_BIZ_NAME, "MainRequestExParamsDiff", "MainRequestExParamsDiff", hashMap);
        }
    }

    public static void a(Context context, Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd717ce7", new Object[]{context, uri});
            return;
        }
        String a2 = t.a(context);
        HashMap hashMap = new HashMap();
        String str = "";
        if (uri != null && uri.toString() != null) {
            str = uri.toString();
        }
        hashMap.put("url", str);
        if (!TextUtils.isEmpty(a2)) {
            hashMap.put("downgradeDataId", a2);
        }
        a(context, PERFORMANCE_BIZ_NAME, "enterDetailActivity", "enterDetailActivity", hashMap, "enterDetailActivity", "ERR_MESSAGE_ENTER_DETAIL_ACTIVITY");
    }

    public static void b(Context context, Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32eba328", new Object[]{context, uri});
            return;
        }
        String a2 = t.a(context);
        HashMap hashMap = new HashMap();
        String str = "";
        if (uri != null && uri.toString() != null) {
            str = uri.toString();
        }
        hashMap.put("url", str);
        if (!TextUtils.isEmpty(a2)) {
            hashMap.put("downgradeDataId", a2);
        }
        a(context, PERFORMANCE_BIZ_NAME, "enterDetailNav", "enterDetailNav", hashMap, "enterDetailNav", "ERR_MESSAGE_ENTER_DETAIL_NAV");
    }

    public static void c(Context context, Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a865c969", new Object[]{context, uri});
            return;
        }
        String a2 = t.a(context);
        HashMap hashMap = new HashMap();
        String str = "";
        if (uri != null && uri.toString() != null) {
            str = uri.toString();
        }
        hashMap.put("url", str);
        if (!TextUtils.isEmpty(a2)) {
            hashMap.put("downgradeDataId", a2);
        }
        a(context, PERFORMANCE_BIZ_NAME, "disableDetailNav", "disableDetailNav", hashMap, "disableDetailNav", "ERR_MESSAGE_DISABLE_DETAIL_NAV");
    }

    public static void d(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a023673d", new Object[]{context});
        } else {
            e(context, PERFORMANCE_BIZ_NAME, "activityKilled", "activityKilled", (Map<String, String>) null);
        }
    }

    public static void a(Context context, Exception exc) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb7e0626", new Object[]{context, exc});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("exception", exc != null ? exc.toString() : "");
        a(context, PERFORMANCE_BIZ_NAME, "detailNavException", "detailNavException", hashMap, "detailNavException", "详情nav阶段process异常");
    }

    public static void a(Context context, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("258fda74", new Object[]{context, new Boolean(z)});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("isSystemError", z ? "true" : "false");
        a(context, PERFORMANCE_BIZ_NAME, "prefetchCallbackError", "prefetchCallbackError", hashMap, "prefetchCallbackError", "预请求回调失败");
    }

    public static void i(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("300b4522", new Object[]{context, str});
        } else {
            a(context, PERFORMANCE_BIZ_NAME, "popupWindowException", "popupWindowException", null, "popupWindowException", str);
        }
    }

    public static void j(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69d5e701", new Object[]{context, str});
        } else {
            a(context, PERFORMANCE_BIZ_NAME, "ImageSaveFailed", "ImageSaveFailed", null, "ImageSaveFailed", str);
        }
    }

    public static void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{context});
        } else {
            e(context, PERFORMANCE_BIZ_NAME, "H5DetailEnterNavProcessor", "H5DetailEnterNavProcessor", (Map<String, String>) null);
        }
    }

    public static void j(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d39b28b", new Object[]{context, str, str2});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("errorMsg", str2);
        if (str == null) {
            str = "";
        }
        hashMap.put("itemId", str);
        a(context, "netRequest", "LoadRecmd", hashMap, "90031", "推荐接口请求失败");
    }

    public static void c(Context context, String str, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a733b0d", new Object[]{context, str, th});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("errorTrace", Log.getStackTraceString(th));
        if (str == null) {
            str = "";
        }
        hashMap.put("itemId", str);
        a(context, "dataProcess", "LoadRecmdData", hashMap, "90032", "推荐数据解析异常");
    }

    public static void g(Context context, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df3b5478", new Object[]{context, str, str2, str3});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("errorMsg", str3);
        if (str == null) {
            str = "";
        }
        hashMap.put("itemId", str);
        hashMap.put("errorCode", str2);
        a(context, "eventProcess", "AddCart", hashMap, "80002", "添加购物车失败");
    }

    public static void b(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3509d07", new Object[]{str, str2, str3});
            return;
        }
        HashMap hashMap = new HashMap();
        if (str == null) {
            str = "";
        }
        hashMap.put("itemId", str);
        hashMap.put("errorCode", str2);
        hashMap.put("errorMsg", str3);
        a(PERFORMANCE_BIZ_NAME, "queryCollectFail", "queryCollectFail", hashMap, "queryCollectFail", "查询收藏状态失败");
    }

    public static void i(Context context, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f3a1136", new Object[]{context, str, str2, str3});
            return;
        }
        HashMap hashMap = new HashMap();
        if (str == null) {
            str = "";
        }
        hashMap.put("itemId", str);
        hashMap.put("errorCode", str2);
        hashMap.put("errorMsg", str3);
        a(context, "showCategoryListFail", "showCategoryListFail", hashMap, "showCategoryListFail", "展示收藏类别列表失败");
    }

    public static void j(Context context, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7396f95", new Object[]{context, str, str2, str3});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("errorMsg", str3);
        if (str == null) {
            str = "";
        }
        hashMap.put("itemId", str);
        hashMap.put("errorCode", str2);
        a(context, "eventProcess", "AddCollectItem", hashMap, "80003", "添加收藏失败");
    }

    public static void k(Context context, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff38cdf4", new Object[]{context, str, str2, str3});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("errorMsg", str3);
        if (str == null) {
            str = "";
        }
        hashMap.put("itemId", str);
        hashMap.put("errorCode", str2);
        a(context, "eventProcess", "DelCollectItem", hashMap, "80004", b.a(R.string.x_detail_app_cancel_collect_fail));
    }

    public static void d(Context context, String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2016e265", new Object[]{context, str, str2, str3, str4});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("errorMsg", str4);
        if (str == null) {
            str = "";
        }
        hashMap.put("itemId", str);
        hashMap.put("url", str2);
        hashMap.put("errorCode", str3);
        a(context, "dataProcess", "WeexLoadError", hashMap, "90041", str4);
    }

    public static void e(Context context, String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8750704", new Object[]{context, str, str2, str3, str4});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("url", str2);
        if (str == null) {
            str = "";
        }
        hashMap.put("itemId", str);
        hashMap.put("errorCode", str3);
        a(context, "dataProcess", "H5LoadError", hashMap, "90043", str4);
    }

    public static void a(Context context, String str, String str2, String str3, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c86b987", new Object[]{context, str, str2, str3, map});
            return;
        }
        if (map == null) {
            map = new HashMap<>();
        }
        Map<String, String> map2 = map;
        map2.put("errorMsg", str3);
        map2.put("url", str);
        map2.put("errorCode", str2);
        a(context, "dataProcess", "WeexLoadError", map2, "90051", str3);
    }

    public static void d(Context context, String str, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1bc4ca8e", new Object[]{context, str, th});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("errorMsg", Log.getStackTraceString(th));
        hashMap.put("packageName", str);
        a(context, "dataProcess", "TwoPartyLoadError", hashMap, "90042", "二方业务异常");
    }

    public static void a(Context context, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8df32b25", new Object[]{context, map});
        } else if (map == null) {
        } else {
            a(context, "umbrella.component.render", "DinamicRenderPartlyFailed", map, "90044", "Dinamic渲染失败");
        }
    }

    public static void k(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3a088e0", new Object[]{context, str});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("itemId", str);
        a(context, "insideDetail", "insideDetailParamsError", hashMap, "insideDetailRequestParamsError", "insideDetail半屏标识参数值错误");
    }

    public static void a(Context context, int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21de43", new Object[]{context, new Integer(i), new Integer(i2), new Integer(i3)});
            return;
        }
        HashMap hashMap = new HashMap(3);
        hashMap.put("total", String.valueOf(i));
        hashMap.put("invokeCount", String.valueOf(i2));
        hashMap.put("hitCount", String.valueOf(i3));
        try {
            hashMap.put("average", String.valueOf(i3 / i2));
        } catch (Throwable th) {
            th.printStackTrace();
        }
        e(context, PERFORMANCE_BIZ_NAME, "asyncLayoutHitCacheStatus", "asyncLayoutHitCacheStatus", hashMap);
    }

    public static void l(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd6b2abf", new Object[]{context, str});
        } else {
            a(context, PERFORMANCE_BIZ_NAME, "asyncLayoutHitCacheStatus", "asyncLayoutHitCacheStatus", null, "asyncLayoutError", str);
        }
    }

    public static void m(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1735cc9e", new Object[]{context, str});
            return;
        }
        HashMap hashMap = new HashMap(1);
        hashMap.put("source", str);
        e(context, PERFORMANCE_BIZ_NAME, "webviewLazyInitOpt", "webviewLazyInitOpt", hashMap);
    }

    public static void e(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0d012dc", new Object[]{context});
        } else {
            a(context, PERFORMANCE_BIZ_NAME, "codeExceptionCollect", "pullToRefreshAddFeatureException", null, "pullToRefreshAddFeatureException", "pullToRefreshAddFeatureException");
        }
    }

    public static void n(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51006e7d", new Object[]{context, str});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("msg", str + "");
        a(context, PERFORMANCE_BIZ_NAME, "detail_segment", "detail_segment", hashMap, "200000", "分段返回首屏数据返回全量数据");
    }

    public static void o(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8acb105c", new Object[]{context, str});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("itemId", "" + str);
        a(context, PERFORMANCE_BIZ_NAME, "detail_segment", "detail_segment", hashMap, "200001", "点击加购拉起sku和newbuy发全量请求");
    }

    public static void f(Context context, String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0d32ba3", new Object[]{context, str, str2, str3, str4});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("msg", str + "");
        hashMap.put(MtopStreamRequestCallback.IS_STREAM, str2);
        hashMap.put("retCode", str3);
        hashMap.put(arz.KEY_RET_MSG, str4);
        a(context, PERFORMANCE_BIZ_NAME, "detail_segment", "detail_segment", hashMap, "200002", "分段接口请求失败");
    }

    public static void p(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c495b23b", new Object[]{context, str});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("msg", str + "");
        a(context, PERFORMANCE_BIZ_NAME, "detail_segment", "detail_segment", hashMap, "200003", "分段接口数据合并失败");
    }

    public static void q(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe60541a", new Object[]{context, str});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("msg", str + "");
        a(context, PERFORMANCE_BIZ_NAME, "detail_segment", "detail_segment", hashMap, "200006", "流式返回头参数拷贝失败");
    }

    public static void r(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("382af5f9", new Object[]{context, str});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("msg", str + "");
        a(context, PERFORMANCE_BIZ_NAME, "detail_segment", "detail_segment", hashMap, "200005", "分段接口数据不能合并");
    }

    public static void s(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71f597d8", new Object[]{context, str});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("itemId", str + "");
        a(context, PERFORMANCE_BIZ_NAME, "detail_segment", "detail_segment", hashMap, "200007", "流式合并数据sku使用时延迟获取");
    }

    public static void a(Context context, boolean z, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c6be70f", new Object[]{context, new Boolean(z), new Integer(i)});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(MtopStreamRequestCallback.IS_STREAM, String.valueOf(z));
        hashMap.put("segments", String.valueOf(i));
        e(context, PERFORMANCE_BIZ_NAME, "detail_segment_data_finish", "detail_segment", hashMap);
    }

    public static void a(Context context, boolean z, int i, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9fd00a3", new Object[]{context, new Boolean(z), new Integer(i), str, str2});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(MtopStreamRequestCallback.IS_STREAM, String.valueOf(z));
        hashMap.put("segments", String.valueOf(i));
        hashMap.put("retCode", str);
        hashMap.put(arz.KEY_RET_MSG, str2);
        e(context, PERFORMANCE_BIZ_NAME, "detail_segment_data_error", "detail_segment", hashMap);
    }

    public static void b(Context context, boolean z, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("149c26ee", new Object[]{context, new Boolean(z), new Integer(i)});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(MtopStreamRequestCallback.IS_STREAM, String.valueOf(z));
        hashMap.put("segments", String.valueOf(i));
        e(context, PERFORMANCE_BIZ_NAME, "detail_segment_data_receive", "detail_segment", hashMap);
    }

    public static void t(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("abc039b7", new Object[]{context, str});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("detailVersion", str + "");
        e(context, PERFORMANCE_BIZ_NAME, "detail_segment_data_render", "detail_segment", hashMap);
    }

    public static void u(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e58adb96", new Object[]{context, str});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("ext", str + "");
        e(context, PERFORMANCE_BIZ_NAME, "detail_segment_data_request", "detail_segment", hashMap);
    }

    public static void c(Context context, boolean z, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ccc66cd", new Object[]{context, new Boolean(z), new Integer(i)});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(MtopStreamRequestCallback.IS_STREAM, String.valueOf(z));
        hashMap.put("segments", String.valueOf(i));
        e(context, PERFORMANCE_BIZ_NAME, "detail_segment_data_null_value", "detail_segment", hashMap);
    }

    public static void a(Context context, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("555f8066", new Object[]{context, str, str2, str3, str4, str5, str6, str7});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("transImgUrl", String.valueOf(str));
        hashMap.put("transImgRatio", String.valueOf(str2));
        hashMap.put("transImgType", String.valueOf(str3));
        hashMap.put("imgUrl", String.valueOf(str4));
        hashMap.put("imgRatio", String.valueOf(str5));
        hashMap.put("imgType", String.valueOf(str6));
        hashMap.put("detailVersion", String.valueOf(str7));
        e(context, PERFORMANCE_BIZ_NAME, "detail_trans_main_pic_info", "trans_main_pic_info", hashMap);
    }

    public static void l(Context context, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("47382c53", new Object[]{context, str, str2, str3});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("url", str);
        hashMap.put("errorCode", str2);
        hashMap.put("errorMsg", str3);
        a(context, UMB_FEATURE_VIDEO_PLAY, "", hashMap, "80008", "视频播放错误");
    }

    public static void k(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7693aaa", new Object[]{context, str, str2});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("errorCode", str);
        hashMap.put("errorMsg", str2);
        a(context, UMB_FEATURE_LBS, "", hashMap, "80009", "地理位置获取错误");
    }

    public static void l(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6198c2c9", new Object[]{context, str, str2});
        } else {
            a(context, UMB_FEATURE_ASYNC_TEMPLATEDATA, "", (Map<String, String>) null, str, str2);
        }
    }

    public static void b(Context context, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d122956", new Object[]{context, th});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("errorMsg", Log.getStackTraceString(th));
        a(context, "umbrella.component.render", "DinamicRenderPartlyFailed", hashMap, "90044", "异常");
    }

    public static void a(Context context, Map<String, String> map, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f203b5af", new Object[]{context, map, str});
        } else {
            a(context, "Page_Detail_Use_Old_Gallery", "has_downgrade", map, ERR_UMBRELLA_PIC_GALLERY_DEGRADE, str);
        }
    }

    public static void b(Context context, Map<String, String> map, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e59339f0", new Object[]{context, map, str});
        } else {
            a(context, "Page_Detail_Use_Old_Gallery_Take_Reason", "has_downgrade", map, ERR_UMBRELLA_PIC_GALLERY_DEGRADE_TAKE_REASON, str);
        }
    }

    public static void c(Context context, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("909d4717", new Object[]{context, th});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("errorMsg", Log.getStackTraceString(th));
        a(context, "scrollContainer", "commonException", hashMap, "10000", "异常");
    }

    public static void b(Context context, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2893eda6", new Object[]{context, map});
            return;
        }
        if (map == null) {
            map = new HashMap<>(2);
        }
        map.put("childBizName", g(context).d);
        map.put("childBizCode", g(context).b);
        com.taobao.android.detail.datasdk.protocol.adapter.optional.a e = epj.e();
        if (e == null) {
            return;
        }
        e.a(com.taobao.android.detail.datasdk.protocol.adapter.optional.a.PAGE_LIFECYCLE_ENTER, map);
    }

    public static void c(Context context, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c334b027", new Object[]{context, map});
            return;
        }
        if (map == null) {
            map = new HashMap<>(2);
        }
        map.put("childBizName", g(context).d);
        map.put("childBizCode", g(context).b);
        com.taobao.android.detail.datasdk.protocol.adapter.optional.a e = epj.e();
        if (e == null) {
            return;
        }
        e.a("LOAD", map);
    }

    public static void d(Context context, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd572a8", new Object[]{context, map});
            return;
        }
        if (map == null) {
            map = new HashMap<>(2);
        }
        map.put("childBizName", g(context).d);
        map.put("childBizCode", g(context).b);
        com.taobao.android.detail.datasdk.protocol.adapter.optional.a e = epj.e();
        if (e == null) {
            return;
        }
        e.a(com.taobao.android.detail.datasdk.protocol.adapter.optional.a.PAGE_LIFECYCLE_APPEAR, map);
    }

    public static void e(Context context, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8763529", new Object[]{context, map});
            return;
        }
        if (map == null) {
            map = new HashMap<>(2);
        }
        map.put("childBizName", g(context).d);
        map.put("childBizCode", g(context).b);
        com.taobao.android.detail.datasdk.protocol.adapter.optional.a e = epj.e();
        if (e == null) {
            return;
        }
        e.a(com.taobao.android.detail.datasdk.protocol.adapter.optional.a.PAGE_LIFECYCLE_DISAPPEAR, map);
    }

    public static void f(Context context, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9316f7aa", new Object[]{context, map});
            return;
        }
        if (map == null) {
            map = new HashMap<>(2);
        }
        map.put("childBizName", g(context).d);
        map.put("childBizCode", g(context).b);
        com.taobao.android.detail.datasdk.protocol.adapter.optional.a e = epj.e();
        if (e == null) {
            return;
        }
        e.a(com.taobao.android.detail.datasdk.protocol.adapter.optional.a.PAGE_LIFECYCLE_LEAVE, map);
    }

    public static void b(Context context, String str, String str2, String str3, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b40f148", new Object[]{context, str, str2, str3, map});
            return;
        }
        if (map == null) {
            map = new HashMap<>(2);
        }
        map.put("childBizName", g(context).d);
        map.put("childBizCode", g(context).b);
        com.taobao.android.detail.datasdk.protocol.adapter.optional.a e = epj.e();
        if (e == null) {
            return;
        }
        e.a(str, str2, str3, map);
    }

    public static void a(Context context, Object obj, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a355fc9", new Object[]{context, obj, map});
            return;
        }
        if (map == null) {
            map = new HashMap<>(2);
        }
        map.put("childBizName", g(context).d);
        map.put("childBizCode", g(context).b);
        com.taobao.android.detail.datasdk.protocol.adapter.optional.a e = epj.e();
        if (e == null) {
            return;
        }
        e.a(obj, map);
    }

    public static void a(Context context, String str, String str2, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("742d5b91", new Object[]{context, str, str2, map});
            return;
        }
        if (map == null) {
            map = new HashMap<>();
        }
        map.put("templateName", str2);
        map.put("dxVersion", RpcInvokerUtil.RPC_V2);
        b(context, "templateRender_" + str, map);
    }

    public static void b(Context context, String str, String str2, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54a6b192", new Object[]{context, str, str2, map});
            return;
        }
        if (map == null) {
            map = new HashMap<>();
        }
        map.put("templateName", str2);
        map.put("dxVersion", "V3");
        b(context, "templateRender_" + str, map);
    }

    public static void c(Context context, String str, String str2, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("35200793", new Object[]{context, str, str2, map});
            return;
        }
        if (map == null) {
            map = new HashMap<>();
        }
        map.put("templateName", str2);
        b(context, "templateRender_" + str, map);
    }

    public static void a(Context context, String str, String str2, String str3, String str4, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7dcc5fd", new Object[]{context, str, str2, str3, str4, map});
            return;
        }
        if (map == null) {
            map = new HashMap<>();
        }
        map.put("templateName", str2);
        c(context, "templateRender_" + str, str3, str4, map);
    }

    public static void a(Context context, String str, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a974c1b", new Object[]{context, str, map});
            return;
        }
        if (map == null) {
            map = new HashMap<>();
        }
        map.put("url", str);
        b(context, "jumpUrl", map);
    }

    public static void b(Context context, String str, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e26d05c", new Object[]{context, str, map});
            return;
        }
        if (map == null) {
            map = new HashMap<>(2);
        }
        map.put("childBizName", g(context).d);
        map.put("childBizCode", g(context).b);
        com.taobao.android.detail.datasdk.protocol.adapter.optional.a e = epj.e();
        if (e == null) {
            return;
        }
        e.b(str, map);
    }

    public static void c(Context context, String str, String str2, String str3, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9fb2909", new Object[]{context, str, str2, str3, map});
            return;
        }
        if (map == null) {
            map = new HashMap<>(2);
        }
        map.put("childBizName", g(context).d);
        map.put("childBizCode", g(context).b);
        com.taobao.android.detail.datasdk.protocol.adapter.optional.a e = epj.e();
        if (e == null) {
            return;
        }
        e.b(str, str2, str3, map);
    }

    public static void d(Context context, String str, String str2, String str3, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8b560ca", new Object[]{context, str, str2, str3, map});
            return;
        }
        if (map == null) {
            map = new HashMap<>(2);
        }
        map.put("childBizName", g(context).d);
        map.put("childBizCode", g(context).b);
        com.taobao.android.detail.datasdk.protocol.adapter.optional.a e = epj.e();
        if (e == null) {
            return;
        }
        e.c(str, str2, str3, map);
    }

    private static void d(Context context, String str, String str2, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15995d94", new Object[]{context, str, str2, map});
        } else {
            e(context, "", str, str2, map);
        }
    }

    private static void a(String str, String str2, String str3, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("109fb67f", new Object[]{str, str2, str3, map});
        } else {
            e((Context) null, str, str2, str3, map);
        }
    }

    public static void e(Context context, String str, String str2, String str3, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f76f988b", new Object[]{context, str, str2, str3, map});
            return;
        }
        if (map == null) {
            map = new HashMap<>();
        }
        map.putAll(m(context, str2, str3));
        com.taobao.android.detail.datasdk.protocol.adapter.optional.a e = epj.e();
        if (e == null) {
            return;
        }
        e.a(str, "", map);
    }

    private static Map<String, String> m(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("df09271d", new Object[]{context, str, str2});
        }
        HashMap hashMap = new HashMap();
        hashMap.put("ttid", epo.f());
        hashMap.put("detail_v", com.taobao.android.detail.core.request.b.b);
        hashMap.put("containerType", f27184a);
        hashMap.put("featureType", str);
        hashMap.put("tagId", str2);
        if (context != null && hashMap.get("childBizName") == null) {
            hashMap.put("childBizName", g(context).d);
        }
        if (context != null && hashMap.get("shopType") == null) {
            hashMap.put("shopType", g(context).c);
        }
        if (context != null && hashMap.get("itemId") == null) {
            hashMap.put("itemId", g(context).f27185a);
        }
        return hashMap;
    }

    private static void a(Context context, String str, String str2, Map<String, String> map, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc4ddc25", new Object[]{context, str, str2, map, str3, str4});
        } else {
            a(context, "", str, str2, map, str3, str4);
        }
    }

    private static void a(String str, String str2, String str3, Map<String, String> map, String str4, String str5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce21d813", new Object[]{str, str2, str3, map, str4, str5});
        } else {
            a(null, str, str2, str3, map, str4, str5);
        }
    }

    public static void a(Context context, String str, String str2, String str3, Map<String, String> map, String str4, String str5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2741f71b", new Object[]{context, str, str2, str3, map, str4, str5});
            return;
        }
        if (map == null) {
            map = new HashMap<>();
        }
        Map<String, String> map2 = map;
        map2.putAll(m(context, str2, str3));
        com.taobao.android.detail.datasdk.protocol.adapter.optional.a e = epj.e();
        if (e == null) {
            return;
        }
        e.a(str, "", map2, str4, str5);
    }

    public static a g(Context context) {
        c cVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("c4db35a6", new Object[]{context});
        }
        a aVar = new a();
        if (context != null) {
            try {
                if ((context instanceof DetailCoreActivity) && ((DetailCoreActivity) context).y() != null && (cVar = ((DetailCoreActivity) context).y().t) != null) {
                    if (cVar.f() != null) {
                        aVar.b = cVar.f().get("aliBizCode");
                        aVar.d = cVar.f().get("aliBizName");
                    }
                    aVar.f27185a = cVar.i();
                    SellerNode d = eqb.d(cVar.f10055a);
                    if (d != null) {
                        aVar.c = d.shopType == 2 ? "B" : "C";
                    }
                }
            } catch (Throwable unused) {
            }
        }
        return aVar;
    }
}
