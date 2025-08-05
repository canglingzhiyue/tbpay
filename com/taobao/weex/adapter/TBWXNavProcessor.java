package com.taobao.weex.adapter;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import android.widget.Toast;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilitykit.ability.pop.model.c;
import com.taobao.android.nav.d;
import com.taobao.android.nav.e;
import com.taobao.android.weex_framework.adapter.h;
import com.taobao.android.weex_framework.util.f;
import com.taobao.homepage.page.weexv2.a;
import com.taobao.orange.OrangeConfig;
import com.taobao.search.common.util.k;
import com.taobao.tao.log.TLog;
import com.taobao.themis.kernel.solution.TMSSolutionType;
import com.taobao.themis.kernel.utils.i;
import com.taobao.themis.taobao.impl.TMS;
import com.taobao.weex.WXEnvironment;
import com.taobao.weex.WXSDKManager;
import com.taobao.weex.base.b;
import com.taobao.weex.common.WXErrorCode;
import com.taobao.weex.j;
import com.taobao.weex.module.NavPrefetchShopFetchManager;
import com.taobao.weex.module.SubscribeViewRegisterUtils;
import com.taobao.weex.remote.e;
import com.taobao.weex.utils.BaseUtils;
import com.taobao.weex.utils.NavProcesserUrlCache;
import com.taobao.weex.utils.Switch;
import com.taobao.weex.utils.TBWXConfigManger;
import com.taobao.weex.utils.UriUtil;
import com.taobao.weex.utils.WXExceptionUtils;
import com.taobao.weex.utils.WXLogUtils;
import com.taobao.weex.utils.WXUtils;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import tb.ado;
import tb.anu;
import tb.dkt;
import tb.dkx;
import tb.dlh;
import tb.dll;
import tb.dlr;
import tb.kge;
import tb.riu;

/* loaded from: classes9.dex */
public class TBWXNavProcessor implements e {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String BROWSER_ONLY_CATEGORY = "com.taobao.intent.category.HYBRID_UI";
    private static final String FROM = "_wx_f_";
    private static final String FROM_WEEX = "1";
    private static final String FROM_WEEX_DEGRADE_H5 = "2";
    private static final String TAG = "TBWXNavProcessor";
    private static final String WEEX_FORCE_THEMIS = "weex_force_tms";
    private static final String WEEX_ORIGINAL_URL = "weex_original_url";
    private static final String WEEX_POP_ID = "wx_popId";
    private static final String WEEX_POP_INTERCEPT_LOW_DEVICE_DOWNGRADE = "weex_pop_down_grade";
    private static final String WEEX_POP_LOADING = "weex_pop_loading";
    private static final String WEEX_POP_LOW_DEVICE = "pop_low_device";
    private static final String WEEX_POP_PAN_ENABLE = "weex_pop_pan_enable";
    private static volatile int mPopIndex;

    @Override // com.taobao.android.nav.e
    public String name() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aa84494e", new Object[]{this}) : TAG;
    }

    @Override // com.taobao.android.nav.e
    public boolean skip() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7fce928a", new Object[]{this})).booleanValue();
        }
        return false;
    }

    static {
        kge.a(-582328871);
        kge.a(-719787762);
        mPopIndex = 0;
    }

    @Override // com.taobao.android.nav.e
    public boolean process(Intent intent, d dVar) {
        String str;
        Uri build;
        String str2;
        boolean z;
        String a2;
        IpChange ipChange = $ipChange;
        boolean z2 = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("873c91c1", new Object[]{this, intent, dVar})).booleanValue();
        }
        Uri data = intent.getData();
        if (data == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("uri:");
            sb.append(data);
            WXLogUtils.d(TAG, sb.toString() == null ? "uri is null!" : data.toString());
            return true;
        }
        Uri addScheme = UriUtil.addScheme(data);
        String uri = addScheme.toString();
        if (TBWXConfigManger.getInstance().isUseShopNavProcessor() && !TextUtils.isEmpty(addScheme.getHost()) && (("shop.m.taobao.com".equals(addScheme.getHost()) || addScheme.getHost().contains(".m.tmall.com") || (addScheme.getHost().contains("shop") && addScheme.getHost().contains(".taobao.com"))) && (a2 = com.taobao.tao.shop.d.a(addScheme)) != null && a2.contains("wh_weex=true"))) {
            WXLogUtils.d(TAG, "WEEX after TBSREngine.matchedUrl and Put BundleUrl:" + a2);
            intent.putExtra(riu.c, a2);
            intent.putExtra(riu.e, a2);
            intent.setData(addScheme.buildUpon().authority("h5.m.taobao.com").path("/weex/viewpage.htm").appendQueryParameter("weex_original_url", addScheme.toString()).build());
            intent.putExtra("weex_original_url", addScheme.toString());
            Uri parse = Uri.parse(a2);
            if (parse.isHierarchical() && parse.getBooleanQueryParameter(riu.j, false)) {
                intent.addCategory(riu.b);
                if (parse.getBooleanQueryParameter(riu.k, true)) {
                    NavPrefetchShopFetchManager.getInstance().processDataPrefetchInNavAsync(a2);
                }
            } else {
                intent.addCategory(riu.f33172a);
            }
            intent.putExtra("ActivityName", "ShopRenderActivity");
            WXLogUtils.d(TAG, "WEEX Shop Weex intent Extra:" + intent.getStringExtra(riu.c));
            j.a(dVar.a(), false, false, false, null);
            return true;
        }
        String str3 = "99500";
        if (TBWXConfigManger.getInstance().isDegrade() || !addScheme.isHierarchical() || intent.hasCategory("com.taobao.intent.category.HYBRID_UI")) {
            String str4 = null;
            WXLogUtils.d(TAG, "degrade:" + TBWXConfigManger.getInstance().isDegrade());
            WXLogUtils.d(TAG, "hierarchical:" + addScheme.isHierarchical());
            WXLogUtils.d(TAG, "category:" + intent.hasCategory("com.taobao.intent.category.HYBRID_UI"));
            if (addScheme.isHierarchical()) {
                String queryParameter = addScheme.getQueryParameter(FROM);
                Uri.Builder buildUpon = addScheme.buildUpon();
                if (TextUtils.isEmpty(queryParameter)) {
                    buildUpon.appendQueryParameter(FROM, "1");
                }
                addScheme = buildUpon.build();
                str = addScheme.getQueryParameter("weex_original_url");
                str4 = queryParameter;
            } else {
                str = null;
            }
            if (!TextUtils.isEmpty(str4)) {
                z2 = TextUtils.equals(str4, "2");
            }
            if (z2) {
                try {
                    if (addScheme.isHierarchical()) {
                        if (!TextUtils.isEmpty(str)) {
                            Set<String> queryParameterNames = addScheme.getQueryParameterNames();
                            Uri.Builder buildUpon2 = Uri.parse(str).buildUpon();
                            for (String str5 : queryParameterNames) {
                                buildUpon2.appendQueryParameter(str5, addScheme.getQueryParameter(str5));
                            }
                            intent.setData(buildUpon2.build());
                            WXLogUtils.d(TAG, "weex_degrade_h5:" + build.toString());
                            str3 = "99501";
                        } else {
                            str3 = "99502";
                        }
                    }
                } catch (Throwable th) {
                    WXLogUtils.e(TAG, th.getMessage());
                    return true;
                }
            }
            reportExpURL(uri, str3);
            return true;
        }
        reportExpURL(uri, str3);
        Uri bundleUri = UriUtil.getBundleUri(addScheme);
        WXLogUtils.d(TAG, bundleUri == null ? "bundleUri is null!" : "bundleUrl:" + bundleUri.toString());
        if (bundleUri == null) {
            return true;
        }
        String uri2 = bundleUri.toString();
        if (f.h() && bundleUri.isHierarchical()) {
            boolean z3 = f.i() && "true".equals(bundleUri.getQueryParameter(WEEX_POP_LOW_DEVICE));
            boolean equals = "true".equals(bundleUri.getQueryParameter(h.WEEX_POP));
            if (z3 && BaseUtils.isLowDevice()) {
                equals = false;
            }
            if (equals && dVar.a() != null) {
                interceptWeex2Pop(addScheme, dVar);
                return false;
            }
        }
        if ("true".equals(OrangeConfig.getInstance().getConfig("weexv2_container_config", "weex_tms_intercept", "true"))) {
            String config = OrangeConfig.getInstance().getConfig("weexv2_container_config", "weex_tms_white_list", "");
            boolean booleanValue = com.taobao.android.weex_framework.util.d.e != null ? com.taobao.android.weex_framework.util.d.e.booleanValue() : false;
            if (bundleUri != null && bundleUri.isHierarchical() && "true".equals(bundleUri.getQueryParameter(WEEX_FORCE_THEMIS))) {
                booleanValue = true;
            }
            if (!TextUtils.isEmpty(config)) {
                String[] split = config.split(",");
                StringBuilder sb2 = new StringBuilder();
                z = booleanValue;
                sb2.append(addScheme.getHost());
                sb2.append(addScheme.getPath());
                String sb3 = sb2.toString();
                int length = split.length;
                str2 = "weex_original_url";
                int i = 0;
                while (true) {
                    if (i >= length) {
                        break;
                    }
                    int i2 = length;
                    if (sb3.equals(split[i])) {
                        z = true;
                        break;
                    }
                    i++;
                    length = i2;
                }
            } else {
                z = booleanValue;
                str2 = "weex_original_url";
            }
            if (z) {
                return !TMS.startApp(intent, dVar, TMSSolutionType.WEEX);
            } else if (i.a(bundleUri)) {
                return true;
            }
        } else {
            str2 = "weex_original_url";
        }
        preInitWeexInstance(uri, bundleUri);
        if (uri2.startsWith(ado.URL_SEPARATOR)) {
            uri2 = uri2.replaceFirst(ado.URL_SEPARATOR, k.HTTP_PREFIX);
        }
        NavProcesserUrlCache.addUrlCache(uri2, uri);
        WXLogUtils.d(TAG, "WEEX normal put bundleUrl extra :" + uri2);
        intent.putExtra(riu.c, uri2);
        intent.putExtra(riu.e, addScheme.toString());
        if (addScheme.getBooleanQueryParameter(riu.j, false)) {
            SubscribeViewRegisterUtils.tryRegister();
            intent.addCategory(riu.b);
            WXLogUtils.d(TAG, "WEEX add Shop Category");
            if (addScheme.getBooleanQueryParameter(riu.k, true)) {
                NavPrefetchShopFetchManager.getInstance().processDataPrefetchInNavAsync(uri2);
            }
        } else {
            intent.addCategory(riu.f33172a);
            WXLogUtils.e(TAG, "WEEX add Weex Category");
        }
        String str6 = null;
        j.a(dVar.a(), false, false, false, null);
        intent.putExtra("ActivityName", "WXActivity:" + bundleUri.buildUpon().clearQuery().scheme("").toString().replaceFirst("^(/|://|:/|//)", ""));
        boolean z4 = false;
        if (addScheme.getBooleanQueryParameter("_wx_virtual", false)) {
            processRedimIntent(intent, addScheme);
        } else {
            boolean isWeexV2Enable = TBWXConfigManger.getInstance().isWeexV2Enable();
            if (isWeexV2Enable) {
                try {
                    z4 = "true".equals(addScheme.getQueryParameter("downgradeV1"));
                    if (!z4) {
                        str6 = TBWXConfigManger.getInstance().getConfigUrl(uri2);
                    }
                } catch (Exception e) {
                    WXLogUtils.e("TBNav:" + e.toString());
                }
                String str7 = str6;
                if (!TextUtils.isEmpty(str7) && !z4) {
                    uri2 = str7;
                }
                intent.putExtra(riu.d, uri2);
                str6 = str7;
            }
            if (isWeexV2Enable && (("dom".equals(addScheme.getQueryParameter("weex_mode")) || "xr".equals(addScheme.getQueryParameter("weex_mode")) || a.KEY_MUS.equals(addScheme.getQueryParameter("weex_mode")) || !TextUtils.isEmpty(str6)) && !z4)) {
                intent.setData(addScheme.buildUpon().authority("h5.m.taobao.com").path("/weexpro/pro.htm").appendQueryParameter(str2, addScheme.toString()).build());
            } else {
                return tryNavToWeex1(dVar.a(), addScheme, intent);
            }
        }
        WXLogUtils.d(TAG, "WEEX intent:" + intent.toString());
        WXLogUtils.d(TAG, "WEEX uri:" + addScheme.toString());
        WXLogUtils.d(TAG, "WEEX Normal Weex intent Extra:" + intent.getStringExtra(riu.c));
        return true;
    }

    private boolean tryNavToWeex1(final Context context, Uri uri, final Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3ca0c654", new Object[]{this, context, uri, intent})).booleanValue();
        }
        if (Boolean.valueOf(WXUtils.checkForceDowngrade(uri.toString())).booleanValue()) {
            if (WXEnvironment.isApkDebugable()) {
                WXSDKManager.getInstance().postOnUiThread(new Runnable() { // from class: com.taobao.weex.adapter.TBWXNavProcessor.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            Toast.makeText(context, "Weex1.0即将下线，请尽快迁移", 0).show();
                        }
                    }
                }, 0L);
            }
            downgradeToH5(uri, intent);
            return true;
        } else if (checkWaitLoading(uri)) {
            final Uri build = uri.buildUpon().appendQueryParameter(riu.f, "true").build();
            com.taobao.weex.remote.e.a("init", uri.toString(), null, true, new e.a() { // from class: com.taobao.weex.adapter.TBWXNavProcessor.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.weex.remote.e.a
                public void onSuccess() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d0e393ab", new Object[]{this});
                        return;
                    }
                    WXLogUtils.e(TBWXNavProcessor.TAG, "tryNavToWeex1 success");
                    intent.addCategory(riu.f33172a);
                    intent.putExtra(riu.e, build.toString());
                    intent.setData(build.buildUpon().authority("h5.m.taobao.com").path("/weex/viewpage.htm").appendQueryParameter("weex_original_url", build.toString()).build());
                    intent.setComponent(new ComponentName(context, "com.taobao.weex.WXActivity"));
                    intent.putExtra("weex_original_url", build.toString());
                    try {
                        if (intent.resolveActivity(context.getPackageManager()) == null) {
                            WXLogUtils.e(TBWXNavProcessor.TAG, "cannot resolveActivity!");
                        }
                    } catch (Throwable th) {
                        WXLogUtils.e(TBWXNavProcessor.TAG, th);
                    }
                    WXLogUtils.e(TBWXNavProcessor.TAG, "intent :" + intent.toString());
                    context.startActivity(intent);
                }

                @Override // com.taobao.weex.remote.e.a
                public void onError(String str) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("ac367d3a", new Object[]{this, str});
                        return;
                    }
                    TLog.loge("Weex", TBWXNavProcessor.TAG, "tryNavToWeex1 failed : " + str);
                }
            });
            return false;
        } else if (com.taobao.weex.remote.e.a(context)) {
            intent.putExtra(riu.e, uri.toString());
            intent.setData(uri.buildUpon().authority("h5.m.taobao.com").path("/weex/viewpage.htm").appendQueryParameter("weex_original_url", uri.toString()).build());
            intent.putExtra("weex_original_url", uri.toString());
            return true;
        } else {
            downgradeToH5(uri, intent);
            return true;
        }
    }

    private void downgradeToH5(Uri uri, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26d8ffc0", new Object[]{this, uri, intent});
            return;
        }
        intent.addCategory("com.taobao.intent.category.HYBRID_UI");
        intent.removeCategory(riu.f33172a);
        WXExceptionUtils.commitCriticalExceptionWithDefaultUrl(uri.toString(), null, WXErrorCode.WX_DEGRAD_ERR, "degradeToH5", "degradeToH5 Remote has not installed", null);
    }

    private boolean checkWaitLoading(Uri uri) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9c50a925", new Object[]{this, uri})).booleanValue() : (urlInWaitLoadingList(uri) || uri.getBooleanQueryParameter(riu.f, false) || Switch.isSwitchOn(".force_WXActivity_loading").booleanValue()) && !Switch.isSwitchOn(".disableWeexRemote").booleanValue();
    }

    private boolean urlInWaitLoadingList(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("46b9a293", new Object[]{this, uri})).booleanValue();
        }
        try {
            Iterator<Object> it = JSONArray.parseArray(b.a()).iterator();
            while (it.hasNext()) {
                if (uri.toString().contains(String.valueOf(it.next()))) {
                    return true;
                }
            }
        } catch (Throwable th) {
            WXLogUtils.e(TAG, th);
        }
        return false;
    }

    private void processRedimIntent(Intent intent, Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80112f41", new Object[]{this, intent, uri});
            return;
        }
        intent.removeCategory(riu.f33172a);
        intent.setData(uri.buildUpon().authority("tb.cn").path("/n/redim").appendQueryParameter("weex_original_url", uri.toString()).build());
    }

    public void reportExpURL(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c0a9c81", new Object[]{this, str, str2});
        } else if (TextUtils.isEmpty(str) || str.indexOf("h5.m.taobao.com/weex/viewpage.htm") == -1) {
        } else {
            try {
                WXLogUtils.d(TAG, "degrade:" + TBWXConfigManger.getInstance().isDegrade());
                HashMap hashMap = new HashMap();
                hashMap.put("degradeToWindVaneUrl", str);
                AppMonitor.Alarm.commitFail("weex", "WeexErrorUrl", JSON.toJSONString(hashMap), str2, "url match h5.m.taobao.com/weex/viewpage.htm");
                WXLogUtils.d(TAG, "degrade: url [" + str + "] match h5.m.taobao.com/weex/viewpage.htm");
            } catch (Throwable th) {
                Log.e(TAG, "degrade: url [" + str + "] match h5.m.taobao.com/weex/viewpage.htm error", th);
            }
        }
    }

    private void preInitWeexInstance(String str, Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("967f990d", new Object[]{this, str, uri});
        } else if (uri == null || str == null) {
        } else {
            Log.e("test->", "try strart preinit for " + str);
            anu.a().a(uri, str);
        }
    }

    private void interceptWeex2Pop(Uri uri, d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d5f7a88", new Object[]{this, uri, dVar});
            return;
        }
        dlr dlrVar = new dlr();
        dlrVar.a(dVar.a());
        if ((dVar.a() instanceof Activity) && ((Activity) dVar.a()).getWindow() != null && ((Activity) dVar.a()).getWindow().getDecorView() != null) {
            dlrVar.a(((Activity) dVar.a()).getWindow().getDecorView());
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("type", "showWeex2Pop");
        JSONObject jSONObject2 = new JSONObject();
        String str = "popId" + mPopIndex;
        mPopIndex++;
        Uri build = uri.buildUpon().appendQueryParameter("wx_popId", str).build();
        jSONObject2.put("url", (Object) build.toString());
        jSONObject2.put("popId", (Object) str);
        boolean equals = build.getQueryParameter(WEEX_POP_LOADING) != null ? "true".equals(build.getQueryParameter(WEEX_POP_LOADING)) : false;
        boolean equals2 = build.getQueryParameter(WEEX_POP_PAN_ENABLE) != null ? "true".equals(build.getQueryParameter(WEEX_POP_PAN_ENABLE)) : true;
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("animation", (Object) com.taobao.android.abilitykit.ability.pop.model.d.KEY_FADE_IN_OUT);
        jSONObject3.put("tapEnable", (Object) true);
        jSONObject3.put("pushType", (Object) "outterJump");
        jSONObject3.put("originHeight", (Object) 1);
        jSONObject3.put("maxHeight", (Object) 1);
        jSONObject3.put("cornerRadius", (Object) 0);
        jSONObject3.put("attachMode", (Object) "activity");
        jSONObject3.put("showLoading", (Object) Boolean.valueOf(equals));
        jSONObject3.put("panEnable", (Object) Boolean.valueOf(equals2));
        jSONObject2.put(c.KEY_POP_CONFIG, (Object) jSONObject3);
        jSONObject.put("params", (Object) jSONObject2);
        new dkt().a(new dlh(jSONObject), dlrVar, new dll() { // from class: com.taobao.weex.adapter.TBWXNavProcessor.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.dll
            public void callback(String str2, dkx dkxVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("398d9b15", new Object[]{this, str2, dkxVar});
                }
            }
        });
    }
}
