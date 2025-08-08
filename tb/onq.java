package tb;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.image.ImageStrategyConfig;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes7.dex */
public class onq {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int HOME_BIZ_ID = 51;
    public static final int HOME_FIRST_SCREEN_BIZ_ID = 5151;
    public static final String HOME_IMAGE_PRIORITY_MODULE_NAME = "homepage-ads";
    public static final ImageStrategyConfig IMAGE_FIRST_SCREEN_STRATEGY_CONFIG;
    public static final ImageStrategyConfig IMAGE_STRATEGY_CONFIG;

    /* renamed from: a  reason: collision with root package name */
    private static String f32217a;
    private static ImageStrategyConfig b;
    private static ConcurrentHashMap<String, ImageStrategyConfig> c;
    private static ConcurrentHashMap<String, String> d;
    private static boolean e;
    private static volatile boolean f;
    private static final AtomicReference<xkn> g;

    static {
        kge.a(-621806065);
        IMAGE_STRATEGY_CONFIG = ImageStrategyConfig.a("home", 51).a();
        IMAGE_FIRST_SCREEN_STRATEGY_CONFIG = ImageStrategyConfig.a("home", (int) HOME_FIRST_SCREEN_BIZ_ID).a();
        f32217a = null;
        b = null;
        c = new ConcurrentHashMap<>();
        d = new ConcurrentHashMap<>();
        e = false;
        f = false;
        g = new AtomicReference<>();
    }

    public static void a(TUrlImageView tUrlImageView, String str, String str2, ImageStrategyConfig imageStrategyConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d58ecd5", new Object[]{tUrlImageView, str, str2, imageStrategyConfig});
        } else if (!e) {
        } else {
            tUrlImageView.setPriorityModuleName(a(str, str2));
            tUrlImageView.setStrategyConfig(a(str, imageStrategyConfig));
        }
    }

    public static String a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b5178ea4", new Object[]{str, str2});
        }
        if (!e) {
            return str2;
        }
        if (!StringUtils.isEmpty(str) && d.containsKey(str)) {
            return d.get(str);
        }
        String str3 = f32217a;
        if (str3 != null) {
            str2 = str3;
        }
        if (!StringUtils.isEmpty(str) && StringUtils.equals(str2, "homepage-ads") && d.size() < 200) {
            d.put(str, str2);
        }
        return str2;
    }

    public static ImageStrategyConfig a(String str, ImageStrategyConfig imageStrategyConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ImageStrategyConfig) ipChange.ipc$dispatch("7ceeb804", new Object[]{str, imageStrategyConfig});
        }
        if (!e) {
            return imageStrategyConfig;
        }
        if (!StringUtils.isEmpty(str) && c.containsKey(str)) {
            return c.get(str);
        }
        ImageStrategyConfig imageStrategyConfig2 = b;
        if (imageStrategyConfig2 != null) {
            imageStrategyConfig = imageStrategyConfig2;
        }
        if (!StringUtils.isEmpty(str) && imageStrategyConfig != null && imageStrategyConfig == IMAGE_STRATEGY_CONFIG && d.size() < 200) {
            c.put(str, imageStrategyConfig);
        }
        return imageStrategyConfig;
    }

    public static String b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4204a5c3", new Object[]{str, str2});
        }
        if (!e) {
            return str2;
        }
        if (!StringUtils.isEmpty(str) && c.containsKey(str)) {
            return String.valueOf(c.get(str).e());
        }
        ImageStrategyConfig imageStrategyConfig = b;
        if (!StringUtils.isEmpty(str) && imageStrategyConfig != null && imageStrategyConfig == IMAGE_STRATEGY_CONFIG && c.size() < 200) {
            c.put(str, imageStrategyConfig);
        }
        return imageStrategyConfig != null ? String.valueOf(imageStrategyConfig.e()) : str2;
    }

    public static void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{new Boolean(z)});
        } else {
            e = z;
        }
    }

    public static void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{str});
        } else {
            f32217a = str;
        }
    }

    public static void a(ImageStrategyConfig imageStrategyConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49ce285b", new Object[]{imageStrategyConfig});
            return;
        }
        b = imageStrategyConfig;
        xkn g2 = g();
        if (g2 == null) {
            return;
        }
        if (imageStrategyConfig == IMAGE_FIRST_SCREEN_STRATEGY_CONFIG) {
            g2.a(true);
        } else if (imageStrategyConfig == IMAGE_STRATEGY_CONFIG) {
            g2.a(false);
            g2.d();
        } else {
            g2.e();
        }
    }

    public static void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{new Boolean(z)});
        } else {
            f = z;
        }
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[0])).booleanValue() : f;
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
            return;
        }
        f32217a = null;
        b = null;
        c.clear();
        d.clear();
    }

    public static synchronized void c() {
        synchronized (onq.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5889b6a", new Object[0]);
                return;
            }
            xkn xknVar = new xkn();
            xknVar.a();
            a(xknVar);
        }
    }

    public static synchronized void d() {
        synchronized (onq.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("596b2eb", new Object[0]);
                return;
            }
            xkn g2 = g();
            if (g2 != null) {
                g2.b();
                g2.c();
            }
            a((xkn) null);
        }
    }

    private static void a(xkn xknVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7714d1d", new Object[]{xknVar});
        } else {
            g.set(xknVar);
        }
    }

    private static xkn g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (xkn) ipChange.ipc$dispatch("3d36b0dd", new Object[0]) : g.get();
    }

    public static boolean e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[0])).booleanValue() : g() != null;
    }

    public static JSONObject f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("d2e6990d", new Object[0]);
        }
        xkn g2 = g();
        if (g2 == null) {
            return null;
        }
        return g2.f();
    }
}
