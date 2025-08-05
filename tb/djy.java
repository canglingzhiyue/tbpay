package tb;

import android.app.Application;
import android.content.Context;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ab.api.b;
import com.taobao.android.launcher.common.LauncherRuntime;
import com.taobao.tao.log.TLog;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class djy {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String SERIALIZE_EXP_BUCKET_ID = "bucket_id";
    public static final String SERIALIZE_EXP_GROUP_ID = "group_id";
    public static final String SERIALIZE_EXP_HEADER = "exps";
    public static final String SERIALIZE_EXP_ID = "id";
    public static final String SERIALIZE_EXP_NAME = "name";
    public static final String SERIALIZE_EXP_RELEASE_ID = "release_id";
    public static final String SERIALIZE_EXP_VARIATIONS = "variations";

    public static void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{str, str2});
        } else {
            TLog.loge("ABGlobal", str, str2);
        }
    }

    public static Context a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("a75aa358", new Object[]{context});
        }
        if (context instanceof Application) {
            return context;
        }
        if (context != null) {
            Context applicationContext = context.getApplicationContext();
            return applicationContext == null ? context : applicationContext;
        }
        return LauncherRuntime.h;
    }

    public static ExecutorService a(final String str, int i, int i2, long j, TimeUnit timeUnit, BlockingQueue<Runnable> blockingQueue) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExecutorService) ipChange.ipc$dispatch("e6ec24aa", new Object[]{str, new Integer(i), new Integer(i2), new Long(j), timeUnit, blockingQueue});
        }
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(i, i2, j, timeUnit, blockingQueue, new ThreadFactory() { // from class: tb.djy.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final AtomicInteger f26798a = new AtomicInteger(0);

            @Override // java.util.concurrent.ThreadFactory
            public Thread newThread(Runnable runnable) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (Thread) ipChange2.ipc$dispatch("d8079a58", new Object[]{this, runnable});
                }
                return new Thread(runnable, str + "-" + this.f26798a.getAndIncrement());
            }
        });
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return threadPoolExecutor;
    }

    public static JSONObject a(Map<String, dkl> map, dka dkaVar, boolean z) throws JSONException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("2ffb030f", new Object[]{map, dkaVar, new Boolean(z)});
        }
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        jSONObject.put(SERIALIZE_EXP_HEADER, jSONArray);
        for (Map.Entry<String, dkl> entry : map.entrySet()) {
            JSONObject jSONObject2 = new JSONObject();
            String key = entry.getKey();
            if (dkaVar == null || !dkaVar.a(key)) {
                dkl value = entry.getValue();
                jSONObject2.put("name", key);
                jSONObject2.put("id", value.b());
                jSONObject2.put("release_id", value.c());
                jSONObject2.put("group_id", value.d());
                jSONObject2.put(SERIALIZE_EXP_BUCKET_ID, value.e());
                if (value.a().hasNext()) {
                    JSONObject jSONObject3 = new JSONObject();
                    Iterator<b> a2 = value.a();
                    while (a2.hasNext()) {
                        b next = a2.next();
                        if (z) {
                            JSONObject jSONObject4 = new JSONObject();
                            jSONObject4.put("value", next.b());
                            jSONObject4.put("desc", next.c());
                            jSONObject3.put(next.a(), jSONObject4);
                        } else {
                            jSONObject3.put(next.a(), next.b());
                        }
                    }
                    jSONObject2.put(SERIALIZE_EXP_VARIATIONS, jSONObject3);
                }
                jSONArray.put(jSONObject2);
            }
        }
        return jSONObject;
    }

    public static <T, R> R a(Map<T, R> map, T t, R r) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (R) ipChange.ipc$dispatch("d5e2037d", new Object[]{map, t, r}) : (map == null || map.isEmpty() || !map.containsKey(t)) ? r : map.get(t);
    }

    public static long a(String str, String str2, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4dba94fb", new Object[]{str, str2, new Integer(i)})).longValue();
        }
        String a2 = a(str2 + str);
        if (TextUtils.isEmpty(a2)) {
            return -1L;
        }
        return Math.abs(a2.hashCode() % i);
    }

    public static String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{str});
        }
        try {
            return String.format("%032X", new BigInteger(1, MessageDigest.getInstance("MD5").digest(str.getBytes())));
        } catch (NoSuchAlgorithmException unused) {
            return null;
        }
    }

    public static String b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("31400281", new Object[]{context});
        }
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException unused) {
            return "";
        }
    }
}
