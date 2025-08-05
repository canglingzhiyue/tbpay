package tb;

import android.content.Context;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.ai;
import kotlin.j;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.q;
import kotlin.t;

/* loaded from: classes4.dex */
public final class dmh {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final dmh INSTANCE;

    /* renamed from: a  reason: collision with root package name */
    private static final bfy f26851a;
    private static final Map<String, JSONObject> b;

    static {
        kge.a(218712231);
        INSTANCE = new dmh();
        f26851a = new bfy("mega-local-storage-stat-total", 1);
        b = new LinkedHashMap();
    }

    private dmh() {
    }

    @JvmStatic
    private static final void a(Context context, String str) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61b6362a", new Object[]{context, str});
        } else if (b.containsKey(str)) {
        } else {
            Map<String, JSONObject> map = b;
            try {
                String string = context.getApplicationContext().getSharedPreferences("ability_storage_" + str, 0).getString("data", null);
                if (string != null) {
                    q.b(string, "this");
                    try {
                        AppMonitor.Alarm.commitSuccess("Megability", "LocalStorageTotalSizeStat", new JSONObject(ai.b(j.a("fileName", str), j.a("totalLen", Integer.valueOf(string.length())))).toJSONString());
                    } catch (ClassNotFoundException | NoClassDefFoundError | NoSuchMethodError | NoSuchMethodException unused) {
                    }
                    t tVar = t.INSTANCE;
                } else {
                    string = null;
                }
                jSONObject = JSON.parseObject(string);
                if (jSONObject == null) {
                    jSONObject = new JSONObject();
                }
            } catch (Exception unused2) {
                jSONObject = new JSONObject();
            }
            map.put(str, jSONObject);
        }
    }

    @JvmStatic
    public static final Object a(Context ctx, String fileName, String key) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("972c43e", new Object[]{ctx, fileName, key});
        }
        q.d(ctx, "ctx");
        q.d(fileName, "fileName");
        q.d(key, "key");
        a(ctx, fileName);
        JSONObject jSONObject = b.get(fileName);
        q.a(jSONObject);
        return dmp.a(key, jSONObject);
    }

    @JvmStatic
    public static final void a(Context ctx, String fileName, String key, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1bde450", new Object[]{ctx, fileName, key, obj});
            return;
        }
        q.d(ctx, "ctx");
        q.d(fileName, "fileName");
        q.d(key, "key");
        a(ctx, fileName);
        JSONObject jSONObject = b.get(fileName);
        q.a(jSONObject);
        JSONObject jSONObject2 = jSONObject;
        if (!dmp.a(key, jSONObject2, obj)) {
            return;
        }
        Context applicationContext = ctx.getApplicationContext();
        applicationContext.getSharedPreferences("ability_storage_" + fileName, 0).edit().putString("data", jSONObject2.toJSONString()).apply();
    }
}
