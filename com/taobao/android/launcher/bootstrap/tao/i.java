package com.taobao.android.launcher.bootstrap.tao;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.launcher.bootstrap.tao.g;
import com.taobao.orange.OrangeConfig;
import com.taobao.tao.log.TLog;
import com.ut.share.utils.Constants;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import tb.byk;
import tb.byl;
import tb.gtk;
import tb.gtx;
import tb.gve;

/* loaded from: classes.dex */
public class i implements g.b, com.taobao.orange.d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Context f13088a;

    @Override // com.taobao.android.launcher.bootstrap.tao.g.b
    public boolean a(Application application, gtx gtxVar, gtk gtkVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("647fb8bc", new Object[]{this, application, gtxVar, gtkVar, str})).booleanValue();
        }
        this.f13088a = application;
        boolean a2 = InstrumentationDelegate.a(gtkVar, application);
        TLog.loge(gve.MODULE, "SGLinkFilterAction", "optimize result: " + a2);
        this.f13088a.getSharedPreferences("next_launch_link_filter", 0);
        OrangeConfig.getInstance().registerListener(new String[]{"next_launch_link_filter"}, this, false);
        return true;
    }

    @Override // com.taobao.orange.d
    public void onConfigUpdate(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f2fc4ea", new Object[]{this, str, map});
            return;
        }
        TLog.loge(gve.MODULE, "SGLinkFilterAction", "onConfigUpdate: " + str);
        Context context = this.f13088a;
        if (context == null) {
            TLog.loge(gve.MODULE, "SGLinkFilterAction", "error occurred when onConfigUpdate, context is null");
            return;
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences("next_launch_link_filter", 0);
        String string = sharedPreferences.getString("__configVersion__", null);
        String str2 = map.get("configVersion");
        if (TextUtils.equals(string, str2)) {
            TLog.loge(gve.MODULE, "SGLinkFilterAction", "version is not changed, discard it. local=" + string + ", remote=" + str2);
            return;
        }
        sharedPreferences.edit().putString("__configVersion__", str2).putString("schemes", OrangeConfig.getInstance().getConfig("next_launch_link_filter", "schemes", "")).commit();
    }

    public static boolean a(Activity activity, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d13e9f7b", new Object[]{activity, intent})).booleanValue();
        }
        String scheme = intent.getScheme();
        if (TextUtils.isEmpty(scheme)) {
            return false;
        }
        String string = activity.getApplication().getSharedPreferences("next_launch_link_filter", 0).getString("schemes", null);
        if (TextUtils.isEmpty(string)) {
            return false;
        }
        List asList = Arrays.asList(string.split(","));
        if (!asList.contains(scheme)) {
            TLog.loge(gve.MODULE, "SGLinkFilterAction", "scheme " + scheme + " is not in list: " + asList);
            return false;
        }
        String dataString = intent.getDataString();
        String packageName = activity.getPackageName();
        String a2 = a(activity);
        if (TextUtils.equals(packageName, a2)) {
            return false;
        }
        return a(activity, dataString, a2, intent);
    }

    private static void a(byl bylVar, String str, String str2, String str3, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ad52183", new Object[]{bylVar, str, str2, str3, new Long(j)});
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("cost", (Object) Long.valueOf(j));
            jSONObject.put("url", (Object) str);
            jSONObject.put(Constants.WEIBO_REDIRECTURL_KEY, (Object) bylVar.b);
            jSONObject.put("referrer", (Object) str3);
            jSONObject.put("isBlack", (Object) Boolean.valueOf(bylVar.f26179a));
            jSONObject.put("pageName", (Object) str2);
            AppMonitor.Counter.commit(gve.MODULE, "SGLinkFilterAction", jSONObject.toJSONString(), 1.0d);
        } catch (Throwable th) {
            TLog.loge(gve.MODULE, "SGLinkFilterAction", "error occurred when sending dp monitor", th);
        }
    }

    public static boolean a(Context context, String str, String str2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("59015535", new Object[]{context, str, str2, intent})).booleanValue();
        }
        long currentTimeMillis = System.currentTimeMillis();
        byl a2 = byk.a(str, str2, context);
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        boolean z = a2.f26179a;
        String str3 = a2.b;
        a(a2, str, context.getClass().getName(), str2, currentTimeMillis2);
        if (TextUtils.isEmpty(str3)) {
            return false;
        }
        TLog.loge(gve.MODULE, "SGLinkFilterAction", "SGLinkFilter.checkBlackMarketURL, uri: '" + str + "', result: is { isBlack=" + z + ", url=" + str3 + " }");
        Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse(str3));
        intent2.setPackage(context.getPackageName());
        ComponentName resolveActivity = intent2.resolveActivity(context.getPackageManager());
        if (resolveActivity == null) {
            return false;
        }
        intent2.setComponent(resolveActivity);
        TLog.loge(gve.MODULE, "SGLinkFilterAction", "resolved ComponentName, uri: '" + str + "', origin component: " + intent.getComponent() + ", new component: " + resolveActivity);
        int fillIn = intent.fillIn(intent2, 2);
        StringBuilder sb = new StringBuilder();
        sb.append("filled in with resolved intent, result is 0x");
        sb.append(Integer.toHexString(fillIn));
        TLog.loge(gve.MODULE, "SGLinkFilterAction", sb.toString());
        return true;
    }

    private static String a(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cf9cba26", new Object[]{activity});
        }
        if (Build.VERSION.SDK_INT >= 22) {
            Uri referrer = activity.getReferrer();
            if (referrer == null) {
                return null;
            }
            return referrer.getAuthority();
        }
        ActivityManager activityManager = (ActivityManager) activity.getSystemService("activity");
        if (activityManager == null) {
            return null;
        }
        try {
            for (ActivityManager.RunningTaskInfo runningTaskInfo : activityManager.getRunningTasks(2)) {
                if (!TextUtils.equals(runningTaskInfo.baseActivity.getPackageName(), activity.getPackageName())) {
                    return runningTaskInfo.baseActivity.getPackageName();
                }
            }
        } catch (SecurityException e) {
            TLog.loge(gve.MODULE, "SGLinkFilterAction", "obtain referrer error for sdk_int < android.os.Build.VERSION_CODES.LOLLIPOP_MR1", e);
        }
        return null;
    }
}
