package tb;

import android.app.ActivityManager;
import android.app.AppOpsManager;
import android.app.KeyguardManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Binder;
import android.os.Build;
import android.os.Process;
import android.provider.Settings;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.application.common.a;
import com.taobao.login4android.api.Login;
import com.taobao.tao.log.TLog;
import com.taobao.wireless.link.common.b;
import com.taobao.wireless.link.common.c;
import com.ut.device.UTDevice;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class rkj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static long f33205a;
    private static char[] b;

    static {
        kge.a(2022627650);
        f33205a = 0L;
        b = "0123456789ABCDEF".toCharArray();
    }

    public static boolean a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a8219760", new Object[]{new Long(j)})).booleanValue();
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - f33205a < j) {
            return true;
        }
        f33205a = currentTimeMillis;
        return false;
    }

    public static long a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c5c", new Object[0])).longValue() : System.currentTimeMillis();
    }

    public static String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{str});
        }
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(str.getBytes());
            return a(messageDigest);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    private static String a(MessageDigest messageDigest) {
        byte[] digest;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("18fff0f0", new Object[]{messageDigest});
        }
        StringBuilder sb = new StringBuilder();
        for (byte b2 : messageDigest.digest()) {
            sb.append(Integer.toHexString((b2 >> 4) & 15));
            sb.append(Integer.toHexString(b2 & 15));
        }
        return sb.toString();
    }

    public static String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[0]) : Login.getUserId();
    }

    public static String a(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bbc5dc40", new Object[]{context}) : UTDevice.getUtdid(context);
    }

    public static int a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d9378d6f", new Object[]{str, str2})).intValue();
        }
        if (StringUtils.equals(str, str2)) {
            return 0;
        }
        String[] split = str.split("\\.");
        String[] split2 = str2.split("\\.");
        int min = Math.min(split.length, split2.length);
        int i = 0;
        int i2 = 0;
        while (i < min) {
            i2 = Integer.parseInt(split[i]) - Integer.parseInt(split2[i]);
            if (i2 != 0) {
                break;
            }
            i++;
        }
        if (i2 != 0) {
            return i2 > 0 ? 1 : -1;
        }
        for (int i3 = i; i3 < split.length; i3++) {
            if (Integer.parseInt(split[i3]) > 0) {
                return 1;
            }
        }
        while (i < split2.length) {
            if (Integer.parseInt(split2[i]) > 0) {
                return -1;
            }
            i++;
        }
        return 0;
    }

    public static boolean b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9eca1003", new Object[]{context})).booleanValue();
        }
        if (context != null) {
            return ((KeyguardManager) context.getSystemService("keyguard")).inKeyguardRestrictedInputMode();
        }
        return false;
    }

    public static boolean c(Context context) {
        boolean z = true;
        if (Build.VERSION.SDK_INT < 19) {
            rkg.a("link_tag", "AssistantUtils === checkFloatPermission === 小于19版本，返回true");
            return true;
        }
        try {
            if (Build.VERSION.SDK_INT >= 23) {
                if (Build.VERSION.SDK_INT >= 26) {
                    AppOpsManager appOpsManager = (AppOpsManager) context.getSystemService("appops");
                    if (appOpsManager == null) {
                        return false;
                    }
                    int checkOpNoThrow = appOpsManager.checkOpNoThrow("android:system_alert_window", Process.myUid(), context.getPackageName());
                    if (!Settings.canDrawOverlays(context) && checkOpNoThrow != 0) {
                        z = false;
                    }
                    rkg.a("link_tag", "LinkUtils === checkFloatPermission === 大于26版本，返回" + z);
                    return z;
                }
                boolean canDrawOverlays = Settings.canDrawOverlays(context);
                rkg.a("link_tag", "LinkUtils === checkFloatPermission === 大于23  小于26版本，返回" + canDrawOverlays);
                return canDrawOverlays;
            }
            Class<?> cls = Class.forName("android.content.Context");
            Field declaredField = cls.getDeclaredField("APP_OPS_SERVICE");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(cls);
            if (!(obj instanceof String)) {
                return false;
            }
            Object invoke = cls.getMethod("getSystemService", String.class).invoke(context, (String) obj);
            Class<?> cls2 = Class.forName("android.app.AppOpsManager");
            Field declaredField2 = cls2.getDeclaredField("MODE_ALLOWED");
            declaredField2.setAccessible(true);
            int intValue = ((Integer) cls2.getMethod("checkOp", Integer.TYPE, Integer.TYPE, String.class).invoke(invoke, 24, Integer.valueOf(Binder.getCallingUid()), context.getPackageName())).intValue();
            rkg.a("link_tag", "LinkUtils === checkFloatPermission === 小于23版本，返回 = " + declaredField2.getInt(cls2));
            return intValue == declaredField2.getInt(cls2);
        } catch (Throwable th) {
            TLog.loge("linkManagerCommon", "assistant", "异常=" + th);
            return false;
        }
    }

    public static boolean d(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a0236741", new Object[]{context})).booleanValue();
        }
        try {
            return i(context).contains(((ActivityManager) context.getSystemService("activity")).getRunningTasks(1).get(0).topActivity.getPackageName());
        } catch (Throwable th) {
            rkg.a("link_tag", "LinkUtils === isHome === 判断异常" + th);
            return false;
        }
    }

    private static List<String> i(Context context) {
        PackageManager packageManager;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("6b2d35ef", new Object[]{context});
        }
        ArrayList arrayList = new ArrayList();
        if (context == null || (packageManager = context.getPackageManager()) == null) {
            return arrayList;
        }
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.HOME");
        List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent, 65536);
        if (queryIntentActivities != null && queryIntentActivities.size() != 0) {
            for (ResolveInfo resolveInfo : queryIntentActivities) {
                arrayList.add(resolveInfo.activityInfo.packageName);
            }
        }
        return arrayList;
    }

    public static void a(Context context, String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6fc7488", new Object[]{context, str, str2, str3, str4});
            return;
        }
        try {
            b(context, b.a(context, "afc_message_open", "true"), str3, str, str4);
        } catch (Exception e) {
            rkg.b("link_tag", "LinkUtils === jumpPage === 跳转异常：" + e);
        }
    }

    public static void b(Context context, String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f5a9927", new Object[]{context, str, str2, str3, str4});
        } else if (context == null || StringUtils.isEmpty(str3)) {
        } else {
            Uri parse = Uri.parse(str3);
            Intent intent = new Intent();
            intent.setFlags(268468224);
            intent.setData(parse);
            if (!StringUtils.isEmpty(str4)) {
                intent.putExtra("AliAgooMsgID", str4);
            }
            if (StringUtils.equals("true", str)) {
                intent.setPackage("com.taobao.taobao");
                intent.putExtra("source", str2);
                intent.putExtra("messageId", str4);
                intent.putExtra("afcDeskTopMessage", "true");
            }
            context.startActivity(intent);
            rkg.a("link_tag", "LinkUtils === jumpInLink === 跳转打开：" + intent);
        }
    }

    public static void e(Context context) {
        Method method;
        try {
            Object systemService = context.getSystemService("statusbar");
            if (Build.VERSION.SDK_INT <= 16) {
                method = systemService.getClass().getMethod("collapse", new Class[0]);
            } else {
                method = systemService.getClass().getMethod("collapsePanels", new Class[0]);
            }
            method.invoke(systemService, new Object[0]);
        } catch (Throwable th) {
            rkg.b("link_tag", "LinkUtils === collapseStatusBar === 关闭通知栏异常：" + th);
        }
    }

    public static int f(Context context) {
        try {
            Class<?> cls = Class.forName("com.android.internal.R$dimen");
            return context.getResources().getDimensionPixelSize(((Integer) cls.getField("status_bar_height").get(cls.newInstance())).intValue());
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    public static void g(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2296a1a", new Object[]{context});
        } else if (context == null) {
        } else {
            Intent intent = new Intent("android.intent.action.MAIN");
            intent.addCategory("android.intent.category.HOME");
            intent.putExtra("jump_source", "assistant");
            intent.addFlags(270532608);
            context.startActivity(intent);
        }
    }

    public static boolean a(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("61b6362e", new Object[]{context, str})).booleanValue();
        }
        if (context != null && !StringUtils.isEmpty(str)) {
            try {
                ArrayList arrayList = (ArrayList) ((ActivityManager) context.getSystemService("activity")).getRunningServices(1000);
                if (arrayList != null && arrayList.size() != 0) {
                    for (int i = 0; i < arrayList.size(); i++) {
                        if (((ActivityManager.RunningServiceInfo) arrayList.get(i)).service.getClassName().equals(str)) {
                            return true;
                        }
                    }
                }
                return false;
            } catch (Throwable th) {
                rkg.a("link_tag", "AssistantUtils === isServiceRunning === 判断服务是否开启异常：" + th);
            }
        }
        return false;
    }

    public static boolean a(long j, long j2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5c11caec", new Object[]{new Long(j), new Long(j2)})).booleanValue() : a() - j < j2;
    }

    public static Map<String, Object> a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("d08f5a0b", new Object[]{jSONObject});
        }
        HashMap hashMap = new HashMap();
        if (jSONObject == null) {
            return hashMap;
        }
        try {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                Object opt = jSONObject.opt(next);
                if (opt instanceof JSONObject) {
                    hashMap.put(next, a((JSONObject) opt));
                } else if (opt instanceof JSONArray) {
                    hashMap.put(next, a((JSONArray) opt));
                } else {
                    hashMap.put(next, opt);
                }
            }
        } catch (Exception unused) {
        }
        return hashMap;
    }

    public static List<Object> a(JSONArray jSONArray) throws JSONException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("6e6e7505", new Object[]{jSONArray});
        }
        if (jSONArray == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(jSONArray.length());
        if (arrayList.size() == 0) {
            return arrayList;
        }
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            Object obj = jSONArray.get(i);
            if (obj instanceof JSONObject) {
                arrayList.add(a((JSONObject) obj));
            } else if (obj instanceof JSONArray) {
                arrayList.add(a((JSONArray) obj));
            } else {
                arrayList.add(jSONArray.get(i));
            }
        }
        return arrayList;
    }

    public static String h(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("f21ce807", new Object[]{context}) : context == null ? "" : context.getPackageManager().getNameForUid(Binder.getCallingUid());
    }

    public static void a(Context context, final c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2ea4c6b", new Object[]{context, cVar});
        } else {
            com.taobao.application.common.c.a(new a.b() { // from class: tb.rkj.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.application.common.IApmEventListener
                public void onEvent(int i) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("fef3fc41", new Object[]{this, new Integer(i)});
                        return;
                    }
                    c cVar2 = c.this;
                    if (cVar2 == null) {
                        return;
                    }
                    cVar2.onEvent(i);
                }
            });
        }
    }

    public static boolean b(Context context, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9b80d80d", new Object[]{context, str})).booleanValue() : (context == null || StringUtils.isEmpty(str) || c(context, str) == null) ? false : true;
    }

    public static ApplicationInfo c(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ApplicationInfo) ipChange.ipc$dispatch("86b326fb", new Object[]{context, str});
        }
        if (context == null) {
            return null;
        }
        if (!StringUtils.isEmpty(str)) {
            try {
            } catch (Exception unused) {
                return null;
            }
        }
        return context.getPackageManager().getApplicationInfo(str, 0);
    }
}
