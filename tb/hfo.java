package tb;

import android.os.Handler;
import android.os.Looper;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.room.utils.v;

/* loaded from: classes5.dex */
public class hfo {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String AB_KEY_SHOW_QUICK_COMMENT = "quickComment";
    public static final String ORANGE_KEY_SHOW_QUICK_COMMENT = "enableQuickComment";
    public static final String TBLIVE_AB_GROUP = "taolive";
    public static final String TBLIVE_ORANGE_GROUP = "tblive";

    /* renamed from: a  reason: collision with root package name */
    private static final Handler f28597a;

    public static boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue() : v.e(pmd.a().d().a("tblive", "enableQuickComment", "false")) && v.e(pmd.a().t().a("taolive", AB_KEY_SHOW_QUICK_COMMENT, "enable", "false"));
    }

    static {
        kge.a(1408998700);
        f28597a = new Handler(Looper.getMainLooper());
    }

    public static void a(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39112e6", new Object[]{runnable});
        } else if (Looper.getMainLooper() == Looper.myLooper()) {
            runnable.run();
        } else {
            f28597a.post(runnable);
        }
    }
}
