package tb;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.util.ArrayMap;
import com.alibaba.ariver.kernel.common.utils.ProcessUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.lifecycle.PanguApplication;
import com.taobao.android.miniLive.services.d;
import com.taobao.taobaocompat.lifecycle.TimestampSynchronizer;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.HashMap;

/* loaded from: classes6.dex */
public class hub {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1150750959);
    }

    public static boolean a(Context context) {
        ConnectivityManager connectivityManager;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9e1d6464", new Object[]{context})).booleanValue();
        }
        if (context == null || context.getApplicationContext() == null || (connectivityManager = (ConnectivityManager) context.getApplicationContext().getSystemService("connectivity")) == null) {
            return false;
        }
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        boolean z = activeNetworkInfo != null && activeNetworkInfo.isConnected();
        hue.a("TBLiveService", "isNotMobileNetwork isConnect = " + z);
        if (!z || activeNetworkInfo.getType() != 0) {
            return true;
        }
        hue.a("TBLiveService", "isNotMobileNetwork TYPE_MOBILE");
        return false;
    }

    public static boolean a(int i, long j) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5c11568d", new Object[]{new Integer(i), new Long(j)})).booleanValue() : TimestampSynchronizer.getServerTime() - j > ((long) ((i * 60) * 1000));
    }

    public static long b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9eca0ff3", new Object[]{context})).longValue();
        }
        if (context != null) {
            return context.getSharedPreferences("tbminilive", 0).getLong("denyTimestamps", 0L);
        }
        return 0L;
    }

    public static void a(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61b6362a", new Object[]{context, str});
        } else if (context == null) {
        } else {
            SharedPreferences.Editor edit = context.getSharedPreferences("tbminilive", 0).edit();
            edit.putLong(str, TimestampSynchronizer.getServerTime());
            edit.apply();
        }
    }

    public static int c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9f76bb91", new Object[]{context})).intValue();
        }
        int identifier = context.getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (identifier <= 0) {
            return 0;
        }
        return context.getResources().getDimensionPixelSize(identifier);
    }

    public static String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{str});
        }
        return "http://h5.m.taobao.com/taolive/video.html?id=" + str;
    }

    public static Activity d(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (!(context instanceof PanguApplication)) {
            return null;
        }
        try {
            Field declaredField = PanguApplication.class.getDeclaredField("mWeakActivity");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(context);
            if (!(obj instanceof WeakReference)) {
                return null;
            }
            Object obj2 = ((WeakReference) obj).get();
            if (!(obj2 instanceof Activity)) {
                return null;
            }
            return (Activity) obj2;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static Activity a() {
        try {
            Class<?> cls = Class.forName(ProcessUtils.ACTIVITY_THREAD);
            Object invoke = cls.getMethod(ProcessUtils.CURRENT_ACTIVITY_THREAD, new Class[0]).invoke(null, new Object[0]);
            Field declaredField = cls.getDeclaredField("mActivities");
            declaredField.setAccessible(true);
            for (Object obj : ((ArrayMap) declaredField.get(invoke)).values()) {
                Class<?> cls2 = obj.getClass();
                Field declaredField2 = cls2.getDeclaredField("paused");
                declaredField2.setAccessible(true);
                if (!declaredField2.getBoolean(obj)) {
                    Field declaredField3 = cls2.getDeclaredField("activity");
                    declaredField3.setAccessible(true);
                    Activity activity = (Activity) declaredField3.get(obj);
                    if (hud.d(activity.getComponentName().getClassName())) {
                        return activity;
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void b(final Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b80d809", new Object[]{context, str});
            return;
        }
        if (context != null) {
            d.a().a(new Runnable() { // from class: tb.hub.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    Context context2 = context;
                    if (context2 == null) {
                        return;
                    }
                    hub.a(context2, "denyTimestamps");
                }
            });
        }
        HashMap hashMap = new HashMap();
        if (pmd.a().q() != null) {
            hashMap.put("userId", pmd.a().q().a());
        }
        huf.a(str, "Deny_Permission", hashMap);
    }
}
