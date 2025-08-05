package tb;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Looper;
import android.support.v4.content.LocalBroadcastManager;
import android.text.TextUtils;
import com.alibaba.ariver.kernel.common.utils.ProcessUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.d;
import com.taobao.android.nav.e;
import com.taobao.android.stdpop.api.PopGravity;
import com.taobao.android.stdpop.api.a;
import com.taobao.android.stdpop.api.c;
import com.taobao.tao.log.TLog;
import com.ut.mini.UTAnalytics;
import com.ut.mini.internal.UTOriginalCustomHitBuilder;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes9.dex */
public class tkd implements e {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TLOG_MODULE = "tmcs_pay";

    /* renamed from: a  reason: collision with root package name */
    private static final String f34180a = "tkd";
    private static final List<String> b = Arrays.asList("com.taobao.android.detail2.core.framework.NewDetailActivity", "com.taobao.android.detail.wrapper.activity.DetailActivity", "com.taobao.android.detail.alittdetail.TTDetailActivity");
    private static final List<String> c = Arrays.asList("/wow/an/base/paysuccess/19004fe3174", "/wow/an/base/paysuccess/18cf234d11b");
    private static Class<?> d = null;
    private static Method e = null;
    private static Field f = null;

    @Override // com.taobao.android.nav.e
    public String name() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aa84494e", new Object[]{this}) : "TmcsPaySuccessNavProcessor";
    }

    @Override // com.taobao.android.nav.e
    public boolean skip() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7fce928a", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // com.taobao.android.nav.e
    public boolean process(Intent intent, d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("873c91c1", new Object[]{this, intent, dVar})).booleanValue();
        }
        tho.a();
        if (!tho.b()) {
            TLog.logi(TLOG_MODULE, f34180a, "路由拦截开关关闭");
            return true;
        }
        Uri data = intent.getData();
        if (data != null) {
            if (data.isOpaque()) {
                String str = f34180a;
                TLog.logi(TLOG_MODULE, str, "uri opaque: " + data);
                return true;
            }
            data.getScheme();
            String host = data.getHost();
            String path = data.getPath();
            String queryParameter = data.getQueryParameter("pagetype");
            String queryParameter2 = data.getQueryParameter("fromchannel");
            List<String> c2 = tho.c();
            String d2 = tho.d();
            if (("pages.tmall.com".equals(host) || "pre-wormhole.wapa.tmall.com".equals(host)) && c2.size() > 0 && c2.contains(path) && !TextUtils.isEmpty(d2) && TextUtils.equals(queryParameter, "pop") && !TextUtils.isEmpty(queryParameter2)) {
                TLog.logi(TLOG_MODULE, f34180a, "拦截到支付成功页页面！");
                String queryParameter3 = data.getQueryParameter("bizOrderIds");
                if (!thn.a(queryParameter2)) {
                    TLog.logi(TLOG_MODULE, f34180a, "AB开关关闭");
                    a(false, queryParameter2, queryParameter3, data);
                    return true;
                }
                a(true, queryParameter2, queryParameter3, data);
                a(queryParameter2, dVar);
                if (a(d2, queryParameter3, queryParameter2, dVar)) {
                    return false;
                }
            }
        }
        return true;
    }

    private static boolean a(String str, String str2, String str3, d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9dcf0714", new Object[]{str, str2, str3, dVar})).booleanValue();
        }
        try {
            c cVar = new c();
            cVar.a(1.0f);
            cVar.a(PopGravity.CENTER);
            Uri build = Uri.parse(str).buildUpon().appendQueryParameter("bizOrderIds", str2).appendQueryParameter("fromchannel", str3).appendQueryParameter("popid", cVar.a()).build();
            String str4 = f34180a;
            TLog.logi(TLOG_MODULE, str4, "展示支付成功浮层, url: " + build.toString());
            cVar.a(dVar.a().getApplicationContext(), build.toString(), (a) null);
            return true;
        } catch (Exception e2) {
            String str5 = f34180a;
            TLog.loge(TLOG_MODULE, str5, "打开pop失败: " + e2);
            return false;
        }
    }

    private static void a(String str, d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40e233fc", new Object[]{str, dVar});
            return;
        }
        if (TextUtils.equals(str, tho.e())) {
            TLog.logi(TLOG_MODULE, f34180a, "直播间场景，发送广播、关闭中间页");
            LocalBroadcastManager.getInstance(dVar.a()).sendBroadcast(new Intent("TradePay.Event.livebag.close"));
        } else {
            TLog.logi(TLOG_MODULE, f34180a, "非直播间场景，关闭中间页");
        }
        Intent intent = new Intent("auraEventNotification");
        intent.putExtra("type", "pop");
        LocalBroadcastManager.getInstance(dVar.a()).sendBroadcast(intent);
        a(str);
    }

    private static void a(String str) {
        List<String> b2 = b(str);
        if (b2 != null && !b2.isEmpty()) {
            try {
                if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                    TLog.logi(TLOG_MODULE, f34180a, "非主线程，不处理中间页");
                    return;
                }
                if (d == null) {
                    d = Class.forName(ProcessUtils.ACTIVITY_THREAD);
                }
                if (e == null) {
                    Method declaredMethod = d.getDeclaredMethod(ProcessUtils.CURRENT_ACTIVITY_THREAD, new Class[0]);
                    e = declaredMethod;
                    declaredMethod.setAccessible(true);
                }
                if (f == null) {
                    Field declaredField = d.getDeclaredField("mActivities");
                    f = declaredField;
                    declaredField.setAccessible(true);
                }
                for (Object obj : ((Map) f.get(e.invoke(null, new Object[0]))).values()) {
                    Field declaredField2 = obj.getClass().getDeclaredField("activity");
                    declaredField2.setAccessible(true);
                    Activity activity = (Activity) declaredField2.get(obj);
                    if (b2.contains(activity.getComponentName().getClassName())) {
                        String str2 = f34180a;
                        TLog.logi(TLOG_MODULE, str2, "手动关闭: " + activity.getComponentName().getClassName());
                        activity.finish();
                    }
                }
                return;
            } catch (Throwable th) {
                String str3 = f34180a;
                TLog.loge(TLOG_MODULE, str3, "关闭中间页失败：" + th);
                return;
            }
        }
        String str4 = f34180a;
        TLog.logi(TLOG_MODULE, str4, "removedActivities为空, 没有需要手动关闭的activity。fromChannel: " + str);
    }

    private static List<String> b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("89cdf874", new Object[]{str});
        }
        if (TextUtils.isEmpty(str)) {
            TLog.logi(TLOG_MODULE, f34180a, "fromChannel is null");
            return null;
        }
        String f2 = tho.f();
        if (f2 != null) {
            try {
                JSONObject parseObject = JSONObject.parseObject(f2);
                if (parseObject != null && parseObject.getJSONArray(str) != null) {
                    return JSONObject.parseArray(parseObject.getJSONArray(str).toJSONString(), String.class);
                }
            } catch (Throwable th) {
                String str2 = f34180a;
                TLog.loge(TLOG_MODULE, str2, "loadFinishedDialogActivities, onError: " + th);
                return null;
            }
        }
        char c2 = 65535;
        int hashCode = str.hashCode();
        if (hashCode != 478330232) {
            if (hashCode != 989204668) {
                if (hashCode == 1850222064 && str.equals("todaycrazy")) {
                    c2 = 0;
                }
            } else if (str.equals("recommend")) {
                c2 = 2;
            }
        } else if (str.equals("sxltmcssearch")) {
            c2 = 1;
        }
        if (c2 != 0 && c2 != 1 && c2 != 2) {
            return null;
        }
        return b;
    }

    private static void a(boolean z, String str, String str2, Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("538e22c7", new Object[]{new Boolean(z), str, str2, uri});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("url_parameters", uri.getQuery());
        hashMap.put("from_channel", str);
        hashMap.put("ab_ispop", z ? "true" : "false");
        hashMap.put("biz_orderids", str2);
        a(hashMap);
    }

    private static void a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{map});
        } else {
            UTAnalytics.getInstance().getDefaultTracker().send(new UTOriginalCustomHitBuilder("Page_Extend", 2201, "Page_SMPaySucc_Middleware_Expo", null, null, map).build());
        }
    }
}
