package tb;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v4.app.FragmentActivity;
import android.support.v4.content.LocalBroadcastManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import com.alibaba.android.ultron.vfw.weex2.UltronWeex2DialogFragment;
import com.alibaba.android.ultron.vfw.weex2.f;
import com.alibaba.android.ultron.vfw.weex2.highPerformance.model.UltronTradeHybridStage;
import com.alibaba.android.ultron.vfw.weex2.highPerformance.model.a;
import com.alibaba.android.ultron.vfw.weex2.highPerformance.widget.UltronTradeHybridActivity;
import com.alibaba.android.ultron.vfw.weex2.module.UltronWeex2BackKeyModule;
import com.alibaba.android.ultron.vfw.weex2.module.UltronWeex2BizLifecycleModule;
import com.alibaba.android.ultron.vfw.weex2.module.UltronWeex2ImagePreloadModule;
import com.alibaba.android.ultron.vfw.weex2.module.UltronWeex2PrefetchCacheModule;
import com.alibaba.android.ultron.vfw.weex2.module.UltronWeex2TinctModule;
import com.alibaba.android.ultron.vfw.weex2.module.UltronWeex2TradeHybridContainerModule;
import com.alibaba.android.ultron.vfw.weex2.module.UltronWeex2TradeHybridManagerModule;
import com.alibaba.ariver.kernel.common.utils.ProcessUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import com.taobao.android.ultron.common.utils.UnifyLog;
import com.taobao.android.weex_framework.MUSEngine;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import tb.bzu;

/* loaded from: classes2.dex */
public class adh {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static boolean f25266a;
    private static final List<String> b;
    private static final List<String> c;
    private static final List<String> d;
    private static boolean e;

    static {
        kge.a(-1829433989);
        f25266a = false;
        e = false;
        b = Arrays.asList("com.taobao.android.detail2.core.framework.NewDetailActivity");
        c = Arrays.asList("com.taobao.android.detail2.core.framework.NewDetailActivity", "com.taobao.android.detail.wrapper.activity.DetailActivity", "com.taobao.android.detail.alittdetail.TTDetailActivity");
        d = Arrays.asList("com.taobao.android.detail.wrapper.activity.DetailActivity", "com.taobao.android.detail.alittdetail.TTDetailActivity");
    }

    public static String a(Context context, a aVar, int i, int i2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("f6b7820b", new Object[]{context, aVar, new Integer(i), new Integer(i2)}) : f.a().a(context, aVar.f2786a, aVar.b, aVar.h, i, i2);
    }

    public static String a(Context context, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5ce90d2b", new Object[]{context, aVar});
        }
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        return a(context, aVar, displayMetrics.widthPixels, displayMetrics.heightPixels);
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
        } else if (f25266a) {
        } else {
            MUSEngine.registerModule(UltronWeex2TradeHybridContainerModule.MODULE_NAME, UltronWeex2TradeHybridContainerModule.class);
            MUSEngine.registerModule(UltronWeex2BackKeyModule.MODULE_NAME, UltronWeex2BackKeyModule.class);
            MUSEngine.registerModule(UltronWeex2TinctModule.MODULE_NAME, UltronWeex2TinctModule.class);
            MUSEngine.registerModule(UltronWeex2BizLifecycleModule.MODULE_NAME, UltronWeex2BizLifecycleModule.class);
            MUSEngine.registerModule(UltronWeex2PrefetchCacheModule.MODULE_NAME, UltronWeex2PrefetchCacheModule.class);
            MUSEngine.registerModule(UltronWeex2ImagePreloadModule.MODULE_NAME, UltronWeex2ImagePreloadModule.class);
            MUSEngine.registerModule(UltronWeex2TradeHybridManagerModule.MODULE_NAME, UltronWeex2TradeHybridManagerModule.class);
            f25266a = true;
            jqg.a("UltronTradeHybridHelper", "registerWeexModule:", "weexModule has registered");
        }
    }

    public static boolean a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{str})).booleanValue() : !TextUtils.isEmpty(str) && str.startsWith("${") && str.endsWith(riy.BLOCK_END_STR);
    }

    public static Object a(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("abaf35f4", new Object[]{str, jSONObject});
        }
        if (!a(str)) {
            return null;
        }
        try {
            String[] split = str.substring(2, str.length() - 1).split("\\.");
            JSONObject jSONObject2 = new JSONObject();
            if (jSONObject != null) {
                jSONObject2.putAll(jSONObject);
            }
            Object obj = null;
            for (int i = 0; i < split.length; i++) {
                if (i < split.length - 1) {
                    jSONObject2 = jSONObject2.getJSONObject(split[i]);
                    if (jSONObject2 == null) {
                        break;
                    }
                } else {
                    obj = jSONObject2.get(split[i]);
                }
            }
            return obj;
        } catch (Exception e2) {
            UnifyLog.d("UltronTradeHybridPreRequest.parseExpression", e2.toString());
            return null;
        }
    }

    public static String a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b5178ea4", new Object[]{str, str2});
        }
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            try {
                return Uri.parse(str).getQueryParameter(str2);
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public static void a(Context context, Uri uri) {
        if (context == null || uri == null) {
            return;
        }
        try {
            String queryParameter = uri.getQueryParameter("popFrom");
            if (TextUtils.equals("live_detail", queryParameter) || TextUtils.equals("live", queryParameter)) {
                LocalBroadcastManager.getInstance(context).sendBroadcast(new Intent("TradePay.Event.livebag.close"));
            }
            List<String> b2 = b(queryParameter);
            if (b2 != null && !b2.isEmpty()) {
                Class<?> cls = Class.forName(ProcessUtils.ACTIVITY_THREAD);
                Method declaredMethod = cls.getDeclaredMethod(ProcessUtils.CURRENT_ACTIVITY_THREAD, new Class[0]);
                declaredMethod.setAccessible(true);
                Object invoke = declaredMethod.invoke(null, new Object[0]);
                Field declaredField = cls.getDeclaredField("mActivities");
                declaredField.setAccessible(true);
                for (Object obj : ((Map) declaredField.get(invoke)).values()) {
                    Field declaredField2 = obj.getClass().getDeclaredField("activity");
                    declaredField2.setAccessible(true);
                    Activity activity = (Activity) declaredField2.get(obj);
                    if (b2.contains(activity.getComponentName().getClassName())) {
                        activity.finish();
                    }
                }
                return;
            }
            jqg.a("UltronTradeHybridHelper", "finishPreviousActivities:", "no removedActivities!");
        } catch (Throwable th) {
            jqg.a("UltronTradeHybridHelper", "finishPreviousActivities:", "onError!" + th);
        }
    }

    private static List<String> b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("89cdf874", new Object[]{str});
        }
        if (TextUtils.isEmpty(str)) {
            jqg.a("UltronTradeHybridHelper", "loadFinishedDialogActivities:", "popFrom is empty!");
            return null;
        }
        String a2 = spk.a(iro.ORANGE_KEY_PAY_SUCCESS, str, (String) null);
        if (a2 != null) {
            try {
                return JSON.parseArray(a2, String.class);
            } catch (Throwable th) {
                jqg.a("UltronTradeHybridHelper", "loadFinishedDialogActivities:", "onError!" + th);
                return null;
            }
        }
        char c2 = 65535;
        int hashCode = str.hashCode();
        if (hashCode != -1690874118) {
            if (hashCode != -1479097596) {
                if (hashCode == 3510 && str.equals("nd")) {
                    c2 = 0;
                }
            } else if (str.equals("live_detail")) {
                c2 = 2;
            }
        } else if (str.equals("nd_detail")) {
            c2 = 1;
        }
        if (c2 == 0) {
            return b;
        }
        if (c2 == 1) {
            return c;
        }
        if (c2 == 2) {
            return d;
        }
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0049, code lost:
        if (r6.equals(tb.alz.BizKeyOrderList) != false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean b(java.lang.String r5, java.lang.String r6) {
        /*
            com.android.alibaba.ip.runtime.IpChange r0 = tb.adh.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 2
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L1c
            java.lang.Object[] r1 = new java.lang.Object[r2]
            r1[r3] = r5
            r1[r4] = r6
            java.lang.String r5 = "65d7b881"
            java.lang.Object r5 = r0.ipc$dispatch(r5, r1)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            return r5
        L1c:
            r0 = -1
            int r1 = r6.hashCode()
            switch(r1) {
                case -1554129835: goto L60;
                case -1332506973: goto L56;
                case -767426601: goto L4c;
                case -391817972: goto L43;
                case 120528346: goto L39;
                case 1066145458: goto L2f;
                case 1275195605: goto L25;
                default: goto L24;
            }
        L24:
            goto L6a
        L25:
            java.lang.String r1 = "tabGuangGuang"
            boolean r6 = r6.equals(r1)
            if (r6 == 0) goto L6a
            r2 = 4
            goto L6b
        L2f:
            java.lang.String r1 = "tabMessage"
            boolean r6 = r6.equals(r1)
            if (r6 == 0) goto L6a
            r2 = 5
            goto L6b
        L39:
            java.lang.String r1 = "mytaobao"
            boolean r6 = r6.equals(r1)
            if (r6 == 0) goto L6a
            r2 = 1
            goto L6b
        L43:
            java.lang.String r1 = "orderList"
            boolean r6 = r6.equals(r1)
            if (r6 == 0) goto L6a
            goto L6b
        L4c:
            java.lang.String r1 = "refundProcess"
            boolean r6 = r6.equals(r1)
            if (r6 == 0) goto L6a
            r2 = 0
            goto L6b
        L56:
            java.lang.String r1 = "tabHomepage"
            boolean r6 = r6.equals(r1)
            if (r6 == 0) goto L6a
            r2 = 3
            goto L6b
        L60:
            java.lang.String r1 = "tabCart"
            boolean r6 = r6.equals(r1)
            if (r6 == 0) goto L6a
            r2 = 6
            goto L6b
        L6a:
            r2 = -1
        L6b:
            java.lang.String r6 = "on_container_resume"
            switch(r2) {
                case 0: goto L89;
                case 1: goto L89;
                case 2: goto L7a;
                case 3: goto L71;
                case 4: goto L71;
                case 5: goto L71;
                case 6: goto L71;
                default: goto L70;
            }
        L70:
            goto L90
        L71:
            java.lang.String r6 = "on_tab_change"
            boolean r5 = r6.equals(r5)
            if (r5 == 0) goto L90
            return r4
        L7a:
            boolean r6 = r6.equals(r5)
            if (r6 != 0) goto L88
            java.lang.String r6 = "on_container_destroy"
            boolean r5 = r6.equals(r5)
            if (r5 == 0) goto L90
        L88:
            return r4
        L89:
            boolean r5 = r6.equals(r5)
            if (r5 == 0) goto L90
            return r4
        L90:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.adh.b(java.lang.String, java.lang.String):boolean");
    }

    public static String a(String str, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5e7f4c93", new Object[]{str, strArr});
        }
        if (TextUtils.isEmpty(str) || strArr == null) {
            return str;
        }
        if (!add.a()) {
            jqg.a("UltronTradeHybridHelper", "appendPaySuccessCustomParam:", "not hit PaySuccess ABTest");
            return str;
        }
        Uri.Builder buildUpon = Uri.parse(str).buildUpon();
        for (String str2 : strArr) {
            if (!TextUtils.isEmpty(str2)) {
                buildUpon.appendQueryParameter(str2, "true");
            }
        }
        return buildUpon.build().toString();
    }

    public static void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{str});
        } else if (!TextUtils.equals(str, "mytaobao")) {
        } else {
            if (e) {
                jqg.a("UltronTradeHybridHelper", "tryPrefetchOListImgOnMytaobao:", "has prefetched");
            } else if (!spk.a(iro.ORANGE_KEY_MY_TAOBAO, "tryPrefetchOListImgOnMytaobao", true)) {
            } else {
                e = true;
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("useCustomDataSource", (Object) "true");
                com.alibaba.android.ultron.vfw.weex2.highPerformance.management.a.a().a(UltronTradeHybridStage.ON_RENDER_END, "mytaobao", jSONObject);
                jqg.a("UltronTradeHybridHelper", "tryPrefetchOListImgOnMytaobao:", "try to prefetch");
            }
        }
    }

    public static int a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9e1d6453", new Object[]{context})).intValue();
        }
        if (!(context instanceof Activity)) {
            return 0;
        }
        Activity activity = (Activity) context;
        if (activity.getWindowManager() == null || activity.getWindowManager().getDefaultDisplay() == null) {
            return 0;
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        activity.getWindowManager().getDefaultDisplay().getRealMetrics(displayMetrics);
        return displayMetrics.heightPixels;
    }

    public static void a(UltronWeex2DialogFragment ultronWeex2DialogFragment, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("168639f6", new Object[]{ultronWeex2DialogFragment, str, str2});
        } else if (!spk.a(iro.ORANGE_KEY_HYBRID_CONTAINER, "enableRedirectByWeexError", true)) {
            jqg.a("UltronTradeHybridHelper", "redirectPageByWeexError", "switcher is off");
        } else if (TextUtils.isEmpty(str)) {
            jqg.a("UltronTradeHybridHelper", "redirectPageByWeexError", "weexUrl is empty");
        } else if (ultronWeex2DialogFragment == null || ultronWeex2DialogFragment.getActivity() == null) {
            jqg.a("UltronTradeHybridHelper", "redirectPageByWeexError", "context is error");
        } else {
            FragmentActivity activity = ultronWeex2DialogFragment.getActivity();
            bzu.a(bzu.a.b("redirectPageByWeexError").a(false).a(String.format("%s - %s", str2, str)).a(0.01f));
            if (str.contains("tradeHybrid=true")) {
                str = str.replace("tradeHybrid=true", "tradeHybrid=false");
            }
            try {
                Nav.from(activity).disableTransition().toUri(Uri.parse(str));
                if (activity instanceof UltronTradeHybridActivity) {
                    activity.finish();
                } else {
                    ultronWeex2DialogFragment.dismiss();
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }
}
