package tb;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import com.taobao.themis.kernel.i;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.q;
import kotlin.text.n;

/* loaded from: classes2.dex */
public final class amh {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final amh INSTANCE;

    /* renamed from: a  reason: collision with root package name */
    private static boolean f25446a;
    private static boolean b;

    static {
        kge.a(1838467831);
        INSTANCE = new amh();
    }

    private amh() {
    }

    @JvmStatic
    public static final boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue();
        }
        if (b()) {
            return q.a((Object) "true", (Object) OrangeConfig.getInstance().getConfig("ability_kit", "showAudioFloat", "true"));
        }
        return false;
    }

    @JvmStatic
    public static final boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[0])).booleanValue();
        }
        if (b()) {
            return q.a((Object) "true", (Object) OrangeConfig.getInstance().getConfig("ability_kit", "enableMtopPostQ", "true"));
        }
        return false;
    }

    @JvmStatic
    public static final boolean a(String str) {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{str})).booleanValue();
        }
        if (b() && str != null) {
            try {
                obj = JSON.parse(OrangeConfig.getInstance().getConfig(i.GROUP_ARIVER_COMMON_CONFIG, "keepAliveWhiteList", ""));
            } catch (Exception unused) {
                obj = null;
            }
            if (obj instanceof JSONArray) {
                return ((JSONArray) obj).contains(str);
            }
        }
        return false;
    }

    @JvmStatic
    public static final boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[0])).booleanValue();
        }
        if (b()) {
            return q.a((Object) "true", (Object) OrangeConfig.getInstance().getConfig("ability_kit", "downgradeImagePreview", "false"));
        }
        return false;
    }

    @JvmStatic
    public static final long b(String bizId) {
        String config;
        Long e;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3dd7e567", new Object[]{bizId})).longValue();
        }
        q.d(bizId, "bizId");
        if (b() && (config = OrangeConfig.getInstance().getConfig("mega_kv_storage_quota", bizId, null)) != null && (e = n.e(config)) != null) {
            return e.longValue();
        }
        return 5120L;
    }

    @JvmStatic
    public static final String a(String key, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b5178ea4", new Object[]{key, str});
        }
        q.d(key, "key");
        return !b() ? str : OrangeConfig.getInstance().getConfig("ability_kit", key, str);
    }

    @JvmStatic
    private static final boolean b() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[0])).booleanValue();
        }
        if (b) {
            return f25446a;
        }
        try {
            OrangeConfig.getInstance();
            z = true;
        } catch (ClassNotFoundException | NoClassDefFoundError | NoSuchMethodError | NoSuchMethodException unused) {
        }
        f25446a = z;
        b = true;
        return f25446a;
    }

    @JvmStatic
    public static final Float c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Float) ipChange.ipc$dispatch("7bdabbb3", new Object[0]);
        }
        if (!b()) {
            return null;
        }
        try {
            String config = OrangeConfig.getInstance().getConfig("ability_kit", "shakeIntensityDiffValue", null);
            if (config == null) {
                return null;
            }
            return n.b(config);
        } catch (Exception unused) {
            return null;
        }
    }
}
