package com.alibaba.aliweex.adapter.adapter;

import android.app.Application;
import android.net.Uri;
import mtopsdk.common.util.StringUtils;
import android.util.Log;
import com.alibaba.aliweex.d;
import com.alibaba.fastjson.JSON;
import com.alibaba.ha.bizerrorreporter.e;
import com.alibaba.ha.bizerrorreporter.module.AggregationType;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.appbundle.remote.a;
import com.taobao.browser.utils.i;
import com.taobao.vessel.utils.b;
import com.taobao.weex.WXSDKInstance;
import com.taobao.weex.WXSDKManager;
import com.taobao.weex.adapter.IWXJSExceptionAdapter;
import com.taobao.weex.common.WXConfig;
import com.taobao.weex.common.WXErrorCode;
import com.taobao.weex.common.WXJSExceptionInfo;
import com.taobao.weex.utils.WXLogUtils;
import java.io.Serializable;
import java.net.URLDecoder;
import java.util.HashMap;
import java.util.Map;
import tb.adk;
import tb.ams;
import tb.anb;
import tb.kge;

/* loaded from: classes2.dex */
public class WXExceptionAdapter implements IWXJSExceptionAdapter, Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static String WX_AIR_TAG;

    /* renamed from: a  reason: collision with root package name */
    private final String f2003a = "instanceId";
    private final String b = "frameWorkVersion";
    private final String c = "errorCode";
    private final String d = "errorGroup";
    private final String e = "errorType";

    static {
        kge.a(242642898);
        kge.a(-1693272328);
        kge.a(1028243835);
        WX_AIR_TAG = adk.KEY_AIR_TAG;
    }

    @Override // com.taobao.weex.adapter.IWXJSExceptionAdapter
    public void onJSException(WXJSExceptionInfo wXJSExceptionInfo) {
        Map<String, Object> map;
        ams q;
        WXSDKInstance wXSDKInstance;
        Map<String, String> F;
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6e00b53", new Object[]{this, wXJSExceptionInfo});
        } else if (wXJSExceptionInfo == null) {
            Log.e("WXJSExceptionAdapter", "null == exception");
        } else {
            try {
                if (wXJSExceptionInfo.getErrCode() == WXErrorCode.WX_USER_CANCEL_REMOTE_INSTALL) {
                    a.c("taobao_weex_adapter", wXJSExceptionInfo.getBundleUrl());
                }
                com.alibaba.ha.bizerrorreporter.module.a aVar = new com.alibaba.ha.bizerrorreporter.module.a();
                aVar.b = AggregationType.CONTENT;
                WXErrorCode errCode = wXJSExceptionInfo.getErrCode();
                if (errCode.getErrorGroup() == WXErrorCode.ErrorGroup.NATIVE && errCode.getErrorType() == WXErrorCode.ErrorType.NATIVE_ERROR) {
                    aVar.f3119a = "weex_native_error";
                    aVar.d = errCode.getErrorCode();
                } else {
                    aVar.f3119a = "WEEX_ERROR";
                    String bundleUrl = wXJSExceptionInfo.getBundleUrl();
                    if (bundleUrl != null) {
                        String realNameFromNameOrUrl = getRealNameFromNameOrUrl(bundleUrl, true);
                        if (realNameFromNameOrUrl.length() > 1024) {
                            realNameFromNameOrUrl = realNameFromNameOrUrl.substring(0, 1024);
                        }
                        aVar.d = realNameFromNameOrUrl;
                    }
                }
                if (!a(aVar.f3119a)) {
                    return;
                }
                aVar.j = wXJSExceptionInfo.getBundleUrl();
                aVar.c = errCode.getErrorCode();
                String weexVersion = wXJSExceptionInfo.getWeexVersion();
                if (weexVersion != null) {
                    aVar.e = weexVersion;
                }
                String exception = wXJSExceptionInfo.getException();
                if (exception != null) {
                    int indexOf = exception.indexOf("\n");
                    aVar.f = indexOf > 0 ? exception.substring(0, indexOf) : exception;
                    aVar.h = exception + "\nend_weex_stack\n";
                }
                String function = wXJSExceptionInfo.getFunction();
                if (function != null) {
                    aVar.g = function;
                }
                HashMap hashMap = new HashMap();
                hashMap.put("errorCode", errCode.getErrorCode());
                hashMap.put("errorGroup", errCode.getErrorGroup());
                hashMap.put("errorType", errCode.getErrorType());
                WXSDKInstance sDKInstance = WXSDKManager.getInstance().getSDKInstance(wXJSExceptionInfo.getInstanceId());
                if (sDKInstance != null && errCode.getErrorGroup() == WXErrorCode.ErrorGroup.JS) {
                    String str2 = sDKInstance.aq().pageName;
                    hashMap.put("wxBundlePageName", str2 == null ? "unKnowPageNameCaseUnSet" : str2);
                    if (sDKInstance.O() instanceof anb) {
                        anb anbVar = (anb) sDKInstance.O();
                        HashMap hashMap2 = new HashMap();
                        hashMap2.put("useWeex", true);
                        hashMap2.put("infoType", aVar.f3119a);
                        if (exception != null) {
                            int i = 200;
                            if (exception.length() <= 200) {
                                i = exception.length();
                            }
                            hashMap2.put("shortErrorMsg", exception.substring(0, i));
                        }
                        hashMap2.put("weexRealPageName", str2);
                        anbVar.addFeedCallBackInfo(aVar.f3119a, JSON.toJSONString(hashMap2));
                    }
                }
                String instanceId = wXJSExceptionInfo.getInstanceId();
                if (instanceId != null) {
                    hashMap.put("instanceId", instanceId);
                } else {
                    hashMap.put("instanceId", "no instanceId");
                }
                String jsFrameworkVersion = wXJSExceptionInfo.getJsFrameworkVersion();
                if (jsFrameworkVersion != null) {
                    hashMap.put("frameWorkVersion", jsFrameworkVersion);
                } else {
                    hashMap.put("frameWorkVersion", "no framework version");
                }
                Map<String, String> extParams = wXJSExceptionInfo.getExtParams();
                if (extParams != null && extParams.size() > 0) {
                    hashMap.putAll(extParams);
                    if (!StringUtils.isEmpty(extParams.get("wxGreyBundle"))) {
                        aVar.c = extParams.get("wxGreyBundle");
                    }
                }
                try {
                    if (!StringUtils.isEmpty(instanceId) && (wXSDKInstance = WXSDKManager.getInstance().getAllInstanceMap().get(instanceId)) != null && (F = wXSDKInstance.F()) != null && F.containsKey(WX_AIR_TAG) && (str = F.get(WX_AIR_TAG)) != null) {
                        hashMap.put(WX_AIR_TAG, str);
                    }
                } catch (Throwable unused) {
                }
                aVar.i = hashMap;
                if (a("god_eye_stage_data") && errCode != WXErrorCode.WX_ERROR_WHITE_SCREEN && (q = d.a().q()) != null) {
                    q.onException("exception_weex_check", aVar.f, hashMap);
                }
                aVar.l = Thread.currentThread();
                e.a().a(d.a().b(), aVar);
                if (errCode.getErrorGroup() != WXErrorCode.ErrorGroup.JS || sDKInstance == null) {
                    return;
                }
                try {
                    map = JSON.parseObject(JSON.toJSONString(wXJSExceptionInfo));
                } catch (Exception unused2) {
                    HashMap hashMap3 = new HashMap();
                    hashMap3.put("bundleUrl", wXJSExceptionInfo.getBundleUrl());
                    hashMap3.put("errorCode", wXJSExceptionInfo.getErrCode());
                    hashMap3.put("exception", wXJSExceptionInfo.getException());
                    hashMap3.put("extParams", wXJSExceptionInfo.getExtParams());
                    hashMap3.put(com.taobao.android.weex_framework.util.a.ATOM_function, wXJSExceptionInfo.getFunction());
                    hashMap3.put("instanceId", wXJSExceptionInfo.getInstanceId());
                    hashMap3.put("jsFrameworkVersion", wXJSExceptionInfo.getJsFrameworkVersion());
                    hashMap3.put(WXConfig.weexVersion, wXJSExceptionInfo.getWeexVersion());
                    map = hashMap3;
                }
                sDKInstance.a("exception", map);
            } catch (Exception e) {
                Log.e("weex js err", "build weex callback data err", e);
            }
        }
    }

    public static String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aff6e538", new Object[0]);
        }
        try {
            Application b = d.a().b();
            return b == null ? "" : b.getPackageManager().getPackageInfo(b.getPackageName(), 0).versionName;
        } catch (Exception e) {
            WXLogUtils.e("WXExceptionAdapter getAppVersionName Exception: ", e);
            return "";
        }
    }

    private boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{this, str})).booleanValue();
        }
        if (StringUtils.isEmpty(str)) {
            return true;
        }
        double d = 100.0d;
        double random = Math.random() * 100.0d;
        if ("weex_native_error".equals(str)) {
            String a2 = a();
            if (StringUtils.isEmpty(a2) || a2.split(".").length == 3) {
                d = 10.0d;
            }
        }
        com.alibaba.aliweex.e l = d.a().l();
        if (l != null) {
            try {
                d = Double.valueOf(l.getConfig("wxapm", str, String.valueOf(d))).doubleValue();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return random < d;
    }

    public static String getRealNameFromNameOrUrl(String str, boolean z) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c8ae6855", new Object[]{str, new Boolean(z)});
        }
        try {
            String dealUrl = str.startsWith("http") ? dealUrl(str, z) : str;
            if (dealUrl != null) {
                return dealUrl;
            }
            if (str.startsWith(b.HTTPS_SCHEMA)) {
                i = 8;
            } else if (str.startsWith("http:")) {
                i = 7;
            }
            return str.substring(i);
        } catch (Exception e) {
            e.printStackTrace();
            return str;
        }
    }

    private static String dealUrl(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2eea6700", new Object[]{str, new Boolean(z)});
        }
        if (StringUtils.isEmpty(str)) {
            return null;
        }
        try {
            Uri parse = Uri.parse(URLDecoder.decode(str, "utf-8"));
            String queryParameter = parse.getQueryParameter(b.WX_TPL);
            if (queryParameter == null) {
                queryParameter = parse.getQueryParameter(i.WEEX_REFERER_ORIGIN);
            }
            if (queryParameter != null) {
                parse = Uri.parse(queryParameter);
            }
            if (!z) {
                return parse.toString();
            }
            return parse.getHost() + parse.getPath();
        } catch (Exception e) {
            e.printStackTrace();
            return str;
        }
    }
}
