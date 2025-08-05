package com.taobao.linkmanager.afc.reduction;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.alibaba.fastjson.JSON;
import com.alipay.android.msp.framework.db.MspDBHelper;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import com.taobao.flowcustoms.afc.utils.AfcUtils;
import com.taobao.flowcustoms.afc.utils.d;
import com.taobao.linkmanager.afc.reduction.c;
import com.taobao.linkmanager.afc.request.TBLinkRequest;
import com.taobao.linkmanager.afc.utils.TFCCommonUtils;
import com.taobao.linkmanager.launcher.TbFcLinkInit;
import com.taobao.login4android.api.Login;
import com.taobao.login4android.biz.alipaysso.AlipayConstant;
import com.taobao.login4android.broadcast.LoginAction;
import com.taobao.login4android.broadcast.LoginBroadcastHelper;
import com.ut.mini.UTAnalytics;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import tb.kge;
import tb.koe;
import tb.mly;

/* loaded from: classes7.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: com.taobao.linkmanager.afc.reduction.c$4 */
    /* loaded from: classes7.dex */
    public static /* synthetic */ class AnonymousClass4 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f17674a = new int[LoginAction.values().length];

        static {
            try {
                f17674a[LoginAction.NOTIFY_LOGIN_SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17674a[LoginAction.NOTIFY_LOGIN_FAILED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* loaded from: classes7.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a */
        private static c f17675a;

        static {
            kge.a(881282554);
            f17675a = new c();
        }

        public static /* synthetic */ c a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("f204c496", new Object[0]) : f17675a;
        }
    }

    static {
        kge.a(-703278297);
    }

    public static /* synthetic */ Map a(c cVar, Context context, String str, String str2, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("8eee3741", new Object[]{cVar, context, str, str2, new Boolean(z), new Boolean(z2)}) : cVar.a(context, str, str2, z, z2);
    }

    public static /* synthetic */ void a(c cVar, Context context, LoginResultBean loginResultBean, String str, String str2, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("200298e1", new Object[]{cVar, context, loginResultBean, str, str2, new Boolean(z), new Boolean(z2)});
        } else {
            cVar.a(context, loginResultBean, str, str2, z, z2);
        }
    }

    public static /* synthetic */ void a(c cVar, Context context, String str, String str2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("772441c8", new Object[]{cVar, context, str, str2, new Boolean(z)});
        } else {
            cVar.a(context, str, str2, z);
        }
    }

    public static /* synthetic */ void a(c cVar, String str, String str2, boolean z, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a49b03ba", new Object[]{cVar, str, str2, new Boolean(z), str3});
        } else {
            cVar.a(str, str2, z, str3);
        }
    }

    public static /* synthetic */ void a(c cVar, JSONObject jSONObject, Context context, boolean z, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea05944", new Object[]{cVar, jSONObject, context, new Boolean(z), str});
        } else {
            cVar.a(jSONObject, context, z, str);
        }
    }

    public static /* synthetic */ boolean a(c cVar, Context context, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("bc01a546", new Object[]{cVar, context, str})).booleanValue() : cVar.a(context, str);
    }

    public static c a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("f204c496", new Object[0]) : a.a();
    }

    private c() {
    }

    public void a(final Context context, final boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("258fda74", new Object[]{this, context, new Boolean(z)});
            return;
        }
        final String b = AfcUtils.b(context);
        final HashMap hashMap = new HashMap();
        hashMap.put("deviceId", AfcUtils.a(TbFcLinkInit.instance().mApplication.getApplicationContext(), false));
        hashMap.put("deviceId2", TFCCommonUtils.b((Context) TbFcLinkInit.instance().mApplication));
        hashMap.put("isAfc", z + "");
        hashMap.put("growthWord", b);
        hashMap.put("deviceInfo", a(context).toJSONString());
        hashMap.put("isActivation", String.valueOf(AfcUtils.c(context)));
        hashMap.put("mediaType", Build.BRAND);
        String globalProperty = UTAnalytics.getInstance().getDefaultTracker().getGlobalProperty("_afc_id");
        if (!TextUtils.isEmpty(globalProperty)) {
            hashMap.put("afcId", globalProperty);
        }
        HashMap hashMap2 = new HashMap();
        hashMap2.put("requestParams", hashMap.toString());
        com.taobao.flowcustoms.afc.utils.b.a("afc_reduct_before_request", "", "", hashMap2);
        com.taobao.flowcustoms.afc.utils.c.a("linkx", "LoginReductionManager === executeLogin === 请求参数:" + hashMap);
        com.taobao.flowcustoms.afc.request.mtop.b.a().a(TBLinkRequest.REDUCTION_LOGIN_API, "1.0", hashMap, false, new koe() { // from class: com.taobao.linkmanager.afc.reduction.c.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            {
                c.this = this;
            }

            @Override // tb.koe
            public void a(JSONObject jSONObject) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("32861656", new Object[]{this, jSONObject});
                } else {
                    c.a(c.this, jSONObject, context, z, b);
                }
            }

            @Override // tb.koe
            public void a(JSONObject jSONObject, String str) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("1b6e96a0", new Object[]{this, jSONObject, str});
                    return;
                }
                com.taobao.flowcustoms.afc.utils.c.a("linkx", "LoginReductionManager === onError === 请求失败:" + jSONObject + " 错误码：" + str);
                hashMap.put("errMsg", str);
                com.taobao.flowcustoms.afc.utils.b.a("afc_reduct_request_result", "fail", "", hashMap);
            }
        }, new Handler(d.b.f17188a.getLooper()), 4000);
    }

    private void a(JSONObject jSONObject, final Context context, boolean z, final String str) {
        final AfcReductResult afcReductResult;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d87bcc2c", new Object[]{this, jSONObject, context, new Boolean(z), str});
            return;
        }
        com.taobao.flowcustoms.afc.utils.c.a("linkx", "LoginReductionManager === onSuccess === 返回结果:" + jSONObject);
        if (jSONObject == null || (afcReductResult = (AfcReductResult) JSON.parseObject(jSONObject.toString(), AfcReductResult.class)) == null) {
            return;
        }
        boolean isAutoLogin = afcReductResult.isAutoLogin();
        final String channel = afcReductResult.getChannel();
        final boolean isIsGrowthWord = afcReductResult.isIsGrowthWord();
        String adid = afcReductResult.getAdid();
        Map<String, String> a2 = a(context, adid, channel, z, isAutoLogin);
        a2.put("url", afcReductResult.getUrl());
        a2.put("type", String.valueOf(afcReductResult.getType()));
        com.taobao.flowcustoms.afc.utils.b.a("afc_reduct_request_result", "success", "", a2);
        if (isAutoLogin) {
            com.taobao.flowcustoms.afc.utils.b.a("afc_auto_login", "", "", a(context, adid, channel, z, true));
            a(context, adid, channel, z, true, new b() { // from class: com.taobao.linkmanager.afc.reduction.c.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                {
                    c.this = this;
                }

                @Override // com.taobao.linkmanager.afc.reduction.b
                public void a(String str2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("f3a64c32", new Object[]{this, str2});
                        return;
                    }
                    String url = afcReductResult.getUrl();
                    if (!TextUtils.equals("2200803434242", channel) || TextUtils.isEmpty(str2)) {
                        str2 = url;
                    }
                    c.a(c.this, context, str2, channel, c.a(c.this, context, str2));
                    c.a(c.this, str2, channel, isIsGrowthWord, str);
                }
            });
            return;
        }
        com.taobao.flowcustoms.afc.utils.c.a("linkx", "LoginReductionManager === onSuccess === 不需要免登，开始还原");
        String url = afcReductResult.getUrl();
        a(context, url, channel, a(context, url));
        a(url, channel, isIsGrowthWord, str);
    }

    private com.alibaba.fastjson.JSONObject a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.alibaba.fastjson.JSONObject) ipChange.ipc$dispatch("58b28f80", new Object[]{this, context});
        }
        com.alibaba.fastjson.JSONObject jSONObject = new com.alibaba.fastjson.JSONObject();
        try {
            if (Build.VERSION.SDK_INT >= 17) {
                DisplayMetrics displayMetrics = new DisplayMetrics();
                WindowManager windowManager = (WindowManager) context.getSystemService(com.taobao.android.weex_framework.util.a.ATOM_EXT_window);
                if (windowManager != null) {
                    windowManager.getDefaultDisplay().getRealMetrics(displayMetrics);
                    int i = displayMetrics.widthPixels;
                    int i2 = displayMetrics.heightPixels;
                    float a2 = com.taobao.application.common.c.a().a(com.taobao.tbdeviceevaluator.c.KEY_DISPLAY_DENSITY, 0.0f);
                    jSONObject.put("width", (Object) String.valueOf((int) Math.ceil(TFCCommonUtils.b(i))));
                    jSONObject.put("height", (Object) String.valueOf((int) Math.ceil(TFCCommonUtils.b(i2))));
                    jSONObject.put("scale", (Object) b(String.valueOf(a2)));
                    jSONObject.put("version", (Object) Build.VERSION.RELEASE);
                    jSONObject.put(MspDBHelper.BizEntry.COLUMN_NAME_DEVICE, (Object) Build.MODEL);
                }
            }
        } catch (Throwable unused) {
            com.taobao.flowcustoms.afc.utils.c.b("linkx", "LoginReductionManager.getDeviceInfoParam.error.");
        }
        return jSONObject;
    }

    private String b(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6111438d", new Object[]{this, str}) : new BigDecimal(str).stripTrailingZeros().toPlainString();
    }

    private Map<String, String> a(Context context, String str, String str2, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("e7ec8e29", new Object[]{this, context, str, str2, new Boolean(z), new Boolean(z2)});
        }
        HashMap hashMap = new HashMap();
        hashMap.put("deviceId", AfcUtils.a(context, false));
        hashMap.put("deviceId2", TFCCommonUtils.b(context));
        hashMap.put("userId", Login.getUserId());
        hashMap.put("adId", str);
        hashMap.put("channel", str2);
        hashMap.put("isAfc", z + "");
        hashMap.put("isAutoLogin", z2 + "");
        return hashMap;
    }

    private boolean a(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("61b6362e", new Object[]{this, context, str})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            com.taobao.flowcustoms.afc.utils.c.a("linkx", "LoginReductionManager === reductionNav === 还原URL为空，不导航");
            return false;
        }
        boolean uri = Nav.from(context).toUri(str);
        com.taobao.flowcustoms.afc.utils.c.a("linkx", "LoginReductionManager === reductionNav === 导航：" + uri);
        return uri;
    }

    private void a(Context context, String str, String str2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("602ff7e0", new Object[]{this, context, str, str2, new Boolean(z)});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("deviceId", AfcUtils.a(context, false));
        hashMap.put("deviceId2", TFCCommonUtils.b(context));
        hashMap.put("userId", Login.getUserId());
        hashMap.put("channel", str2);
        hashMap.put("url", str);
        com.taobao.flowcustoms.afc.utils.b.a("afc_reduct_result", z + "", "", hashMap);
    }

    private void a(String str, String str2, boolean z, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36b578a2", new Object[]{this, str, str2, new Boolean(z), str3});
            return;
        }
        try {
            String globalProperty = UTAnalytics.getInstance().getDefaultTracker().getGlobalProperty("_afc_id");
            if (TextUtils.isEmpty(globalProperty)) {
                return;
            }
            String[] split = globalProperty.split(mly.UNESCAPED_SEPARATOR);
            if (split.length < 4) {
                return;
            }
            if (!TextUtils.isEmpty(str2)) {
                split[1] = str2;
            }
            if (!TextUtils.isEmpty(str)) {
                if (str.contains("bc_fl_src")) {
                    String queryParameter = Uri.parse(str).getQueryParameter("bc_fl_src");
                    if (!TextUtils.isEmpty(queryParameter)) {
                        split[2] = queryParameter;
                    }
                } else {
                    split[2] = z ? "growthWord" : "dahanghai";
                }
            }
            String a2 = AfcUtils.a(Arrays.asList(split), "^");
            UTAnalytics.getInstance().getDefaultTracker().setGlobalProperty("_afc_id", a2);
            com.taobao.flowcustoms.afc.utils.c.a("linkx", "LoginReductionManager === reWriteAfcId === _afc_id：" + a2);
        } catch (Exception e) {
            com.taobao.flowcustoms.afc.utils.c.b("linkx", "LoginReductionManager === reWriteAfcId === 重写afc_id异常：" + e);
        }
    }

    public void a(final Context context, final String str, final String str2, final boolean z, final boolean z2, final b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d51767d", new Object[]{this, context, str, str2, new Boolean(z), new Boolean(z2), bVar});
            return;
        }
        com.taobao.flowcustoms.afc.utils.c.a("linkx", "LoginReductionManager === loginWithToken === 开始aidl获取免登信息");
        com.taobao.wireless.link.login.a.a().a(context, new com.taobao.wireless.link.login.b() { // from class: com.taobao.linkmanager.afc.reduction.c.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            {
                c.this = this;
            }

            @Override // com.taobao.wireless.link.login.b
            public void a(String str3) {
                String str4;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("f3a64c32", new Object[]{this, str3});
                    return;
                }
                com.taobao.flowcustoms.afc.utils.c.a("linkx", "LoginReductionManager === loginWithToken === 获取到的免登信息：" + str3);
                if (!TextUtils.isEmpty(str3)) {
                    LoginResultBean a2 = c.this.a(str3);
                    str4 = a2.landingUrl;
                    c.a(c.this, context, a2, str, str2, z, z2);
                    com.taobao.flowcustoms.afc.utils.b.a("afc_auto_login_start", "", "", c.a(c.this, context, str, str2, z, z2));
                } else {
                    str4 = "";
                }
                b bVar2 = bVar;
                if (bVar2 == null) {
                    return;
                }
                bVar2.a(str4);
            }
        });
    }

    public LoginResultBean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LoginResultBean) ipChange.ipc$dispatch("8fdfcbb9", new Object[]{this, str});
        }
        LoginResultBean loginResultBean = new LoginResultBean();
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has(AlipayConstant.LOGIN_ALIPAY_TOKEN_KEY)) {
                loginResultBean.loginToken = (String) jSONObject.get(AlipayConstant.LOGIN_ALIPAY_TOKEN_KEY);
            }
            if (jSONObject.has("h5Data")) {
                String str2 = (String) jSONObject.get("h5Data");
                if (!TextUtils.isEmpty(str2)) {
                    loginResultBean.landingUrl = (String) new JSONObject(str2).get("url");
                }
            }
            if (jSONObject.has("source")) {
                loginResultBean.source = (String) jSONObject.get("source");
            }
        } catch (JSONException e) {
            com.taobao.flowcustoms.afc.utils.c.b("linkx", "LoginReductionManager === getLoginInfoBean === 解析免登信息异常：" + e);
        }
        return loginResultBean;
    }

    private void a(Context context, LoginResultBean loginResultBean, String str, String str2, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6299e7c9", new Object[]{this, context, loginResultBean, str, str2, new Boolean(z), new Boolean(z2)});
            return;
        }
        try {
            b(context, str, str2, z, z2);
            Bundle bundle = new Bundle();
            bundle.putString(AlipayConstant.LOGIN_ALIPAY_TOKEN_KEY, loginResultBean.loginToken);
            bundle.putString("source", loginResultBean.source);
            Login.login(false, bundle);
            com.taobao.flowcustoms.afc.utils.c.a("linkx", "LoginReductionManager === loginFree === 开始免登");
        } catch (Throwable th) {
            com.taobao.flowcustoms.afc.utils.c.b("linkx", "LoginReductionManager === loginFree === 免登或者导航数据解析异常：" + th);
        }
    }

    private void b(Context context, final String str, final String str2, final boolean z, final boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("423db353", new Object[]{this, context, str, str2, new Boolean(z), new Boolean(z2)});
        } else {
            LoginBroadcastHelper.registerLoginReceiver(context, new BroadcastReceiver() { // from class: com.taobao.linkmanager.afc.reduction.LoginReductionManager$4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.content.BroadcastReceiver
                public void onReceive(Context context2, Intent intent) {
                    String str3;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("3c04d85a", new Object[]{this, context2, intent});
                        return;
                    }
                    com.taobao.flowcustoms.afc.utils.c.a("linkx", "LoginReductionManager === registerLoginCallBack === 登录广播回调，intent：" + intent);
                    if (intent == null) {
                        return;
                    }
                    Map a2 = c.a(c.this, context2, str, str2, z, z2);
                    int i = c.AnonymousClass4.f17674a[LoginAction.valueOf(intent.getAction()).ordinal()];
                    if (i != 1) {
                        if (i == 2) {
                            str3 = "false";
                        }
                        LoginBroadcastHelper.unregisterLoginReceiver(context2, this);
                        com.taobao.flowcustoms.afc.utils.c.a("linkx", "LoginReductionManager === registerLoginCallBack === 广播解注册了");
                    }
                    str3 = "true";
                    com.taobao.flowcustoms.afc.utils.b.a("afc_auto_login_result", str3, "", a2);
                    LoginBroadcastHelper.unregisterLoginReceiver(context2, this);
                    com.taobao.flowcustoms.afc.utils.c.a("linkx", "LoginReductionManager === registerLoginCallBack === 广播解注册了");
                }
            });
        }
    }
}
