package tb;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import com.alibaba.ariver.kernel.common.utils.ProcessUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONException;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes5.dex */
public class xjj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static Set<String> f34330a;
    private static Set<String> b;
    private static Application c;

    public static Set<String> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("a0177257", new Object[0]);
        }
        if (b == null) {
            b = b(c());
        }
        return b;
    }

    public static Set<String> b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("6dc1d418", new Object[0]);
        }
        if (f34330a == null) {
            f34330a = a(c());
        }
        return f34330a;
    }

    public static void a(Context context, JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("95b1bd88", new Object[]{context, jSONArray});
            return;
        }
        HashSet hashSet = new HashSet();
        if (jSONArray != null) {
            for (int i = 0; i < jSONArray.size(); i++) {
                try {
                    hashSet.add(jSONArray.getString(i));
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }
        b(context, hashSet);
        b = hashSet;
    }

    public static void b(Context context, JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("29f02d27", new Object[]{context, jSONArray});
            return;
        }
        HashSet hashSet = new HashSet();
        if (jSONArray != null) {
            for (int i = 0; i < jSONArray.size(); i++) {
                try {
                    hashSet.add(jSONArray.getString(i));
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }
        a(context, hashSet);
        f34330a = hashSet;
    }

    private static void a(Context context, Set<String> set) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("986a6e5f", new Object[]{context, set});
        } else if (context == null) {
        } else {
            if (!(context instanceof Application)) {
                context = context.getApplicationContext();
            }
            SharedPreferences.Editor edit = context.getSharedPreferences("NDEntryParamWhiteList", 0).edit();
            edit.putStringSet("NDEntryParamWhiteList", set);
            edit.apply();
        }
    }

    private static void b(Context context, Set<String> set) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("330b30e0", new Object[]{context, set});
        } else if (context == null) {
        } else {
            if (!(context instanceof Application)) {
                context = context.getApplicationContext();
            }
            SharedPreferences.Editor edit = context.getSharedPreferences("NDEntryParamWhiteList", 0).edit();
            edit.putStringSet("UGCEntryParamWhiteList", set);
            edit.apply();
        }
    }

    private static Set<String> a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("4db184f", new Object[]{context});
        }
        if (context == null) {
            return new HashSet();
        }
        if (!(context instanceof Application)) {
            context = context.getApplicationContext();
        }
        return context.getSharedPreferences("NDEntryParamWhiteList", 0).getStringSet("NDEntryParamWhiteList", new HashSet());
    }

    private static Set<String> b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("c7c781ae", new Object[]{context});
        }
        if (context == null) {
            return new HashSet();
        }
        if (!(context instanceof Application)) {
            context = context.getApplicationContext();
        }
        return context.getSharedPreferences("NDEntryParamWhiteList", 0).getStringSet("UGCEntryParamWhiteList", new HashSet());
    }

    public static synchronized Application c() {
        synchronized (xjj.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Application) ipChange.ipc$dispatch("4bc1c139", new Object[0]);
            }
            if (c == null) {
                c = d();
            }
            return c;
        }
    }

    private static Application d() {
        try {
            Class<?> cls = Class.forName(ProcessUtils.ACTIVITY_THREAD);
            Method declaredMethod = cls.getDeclaredMethod(ProcessUtils.CURRENT_ACTIVITY_THREAD, new Class[0]);
            Field declaredField = cls.getDeclaredField("mInitialApplication");
            declaredField.setAccessible(true);
            return (Application) declaredField.get(declaredMethod.invoke(null, new Object[0]));
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
