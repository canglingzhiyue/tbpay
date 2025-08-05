package tb;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.TBMainHost;
import com.taobao.tao.k;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;

/* loaded from: classes3.dex */
public final class cpe {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final c Companion;
    public static final float DARK_FRAME_THRESHOLD = 0.3f;
    public static final String IS_PLT_SCREENSHOT_FLOAT_BAR_OPEN_DEFAULT = "isPltScreenshotFloatBarOpenDefault";
    public static final String KEY_EXTRA_VERIFY = "extra_verify";
    public static final String PLT_SCREENSHOT_FLOAT_WINDOW_BIZ_CODE = "taoPai";
    public static final String PLT_SCREENSHOT_FLOAT_WINDOW_TRIGGER_ID = "client";
    public static final String PsSourceSY_SYS = "sy_sys";

    /* renamed from: a  reason: collision with root package name */
    private static boolean f26384a;
    private static boolean b;
    private static String c;
    private static String d;
    private static String e;

    @JvmStatic
    public static final cpt a(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (cpt) ipChange.ipc$dispatch("34c1f95f", new Object[]{context}) : Companion.a(context);
    }

    public static final void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{str});
        } else {
            d = str;
        }
    }

    public static final String d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("43881515", new Object[0]) : d;
    }

    public static final void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d23b17f5", new Object[]{str});
        } else {
            e = str;
        }
    }

    public static final String e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[0]) : e;
    }

    public static final /* synthetic */ void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{str});
        } else {
            c = str;
        }
    }

    public static final /* synthetic */ void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{new Boolean(z)});
        } else {
            f26384a = z;
        }
    }

    public static final /* synthetic */ boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue() : f26384a;
    }

    public static final /* synthetic */ void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{str});
        } else {
            d = str;
        }
    }

    public static final /* synthetic */ void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{new Boolean(z)});
        } else {
            b = z;
        }
    }

    public static final /* synthetic */ boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[0])).booleanValue() : b;
    }

    public static final /* synthetic */ String c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bd025a76", new Object[0]) : c;
    }

    /* loaded from: classes3.dex */
    public static final class b {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static final b INSTANCE;
        public static final int TAB_IMAGE_SEARCH = 1;
        public static final int TAB_MARKETING = 2;
        public static final int TAB_SCAN = 0;
        public static final int TAB_UNKNOWN = -1;

        static {
            kge.a(234780284);
            INSTANCE = new b();
        }

        private b() {
        }

        @JvmStatic
        public static final String a(Integer num) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("3baa0f71", new Object[]{num});
            }
            if (num == null) {
                return "scan";
            }
            num.intValue();
            return num.intValue() == 0 ? "scan" : num.intValue() == 1 ? a.SCENE_AUTO_DETECT : a.SCENE_MARKETING;
        }
    }

    /* loaded from: classes3.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static final a INSTANCE;
        public static final String SCENE_AUTO_DETECT = "autodetect";
        public static final String SCENE_MARKETING = "ppl";
        public static final String SCENE_META_SIGHT = "metasight";
        public static final String SCENE_SCAN = "scan";

        static {
            kge.a(-1918686029);
            INSTANCE = new a();
        }

        private a() {
        }

        @JvmStatic
        public static final int a(String scene) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("f3a64c25", new Object[]{scene})).intValue();
            }
            q.c(scene, "scene");
            if (TextUtils.isEmpty(scene)) {
                return -1;
            }
            int hashCode = scene.hashCode();
            if (hashCode != -1051148616) {
                if (hashCode == 3524221) {
                    return scene.equals("scan") ? 0 : 2;
                } else if (hashCode != 90227986 || !scene.equals(SCENE_AUTO_DETECT)) {
                    return 2;
                }
            } else if (!scene.equals(SCENE_META_SIGHT)) {
                return 2;
            }
            return 1;
        }

        @JvmStatic
        public static final String b(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("6111438d", new Object[]{str});
            }
            if (str == null) {
                return "";
            }
            int hashCode = str.hashCode();
            return hashCode != -1051148616 ? hashCode != 3524221 ? (hashCode == 90227986 && str.equals(SCENE_AUTO_DETECT)) ? SCENE_AUTO_DETECT : SCENE_MARKETING : str.equals("scan") ? "scan" : SCENE_MARKETING : str.equals(SCENE_META_SIGHT) ? SCENE_META_SIGHT : SCENE_MARKETING;
        }
    }

    /* loaded from: classes3.dex */
    public static final class c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(1335099129);
        }

        private c() {
        }

        public /* synthetic */ c(o oVar) {
            this();
        }

        public final void a(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            } else {
                cpe.a(z);
            }
        }

        public final boolean a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : cpe.a();
        }

        public final void b(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
            } else {
                cpe.b(z);
            }
        }

        public final boolean b() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : cpe.b();
        }

        public final void a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
                return;
            }
            q.c(str, "<set-?>");
            cpe.a(str);
        }

        public final String c() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bd025a76", new Object[]{this}) : cpe.c();
        }

        public final void b(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
            } else {
                cpe.b(str);
            }
        }

        @JvmStatic
        public final cpt a(Context context) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (cpt) ipChange.ipc$dispatch("34c1f95f", new Object[]{this, context});
            }
            q.c(context, "context");
            if (context instanceof cpu) {
                return ((cpu) context).c();
            }
            k a2 = TBMainHost.a(context);
            if (a2 == null) {
                return null;
            }
            Fragment currentFragment = a2.getCurrentFragment();
            if (!(currentFragment instanceof cpu)) {
                return null;
            }
            return ((cpu) currentFragment).c();
        }
    }

    static {
        kge.a(-406401807);
        Companion = new c(null);
        c = "";
    }
}
