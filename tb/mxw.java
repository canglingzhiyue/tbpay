package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.festival.FestivalMgr;

/* loaded from: classes7.dex */
public final class mxw {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_ACTIONBAR_BACKGROUND_COLOR = "actionBarBackgroundColor";
    public static final String KEY_ACTIONBAR_BACKGROUND_IMAGE = "actionBarBackgroundImage";
    public static final String KEY_ACTIONBAR_TEXT_COLOR = "actionbarTextColor";
    public static final String KEY_SKIN_COLOR = "skinColor";
    public static final String KEY_SKIN_PIC = "skinPic";
    public static final String MODULE_NAME = "mytaobao";
    public static final String MODULE_NAME_GLOBAL = "global";

    /* renamed from: a  reason: collision with root package name */
    private static boolean f31315a;
    private static long b;

    static {
        kge.a(-526172876);
        f31315a = false;
        b = 0L;
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue();
        }
        f31315a = FestivalMgr.a().a("mytaobao");
        b = System.currentTimeMillis();
        return f31315a;
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[0])).booleanValue();
        }
        if (System.currentTimeMillis() - b < 1000) {
            return f31315a;
        }
        return a();
    }

    public static String a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9f352ae", new Object[]{str}) : FestivalMgr.a().a("mytaobao", str);
    }

    public static String b(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6111438d", new Object[]{str}) : FestivalMgr.a().a("global", str);
    }
}
