package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.share.multiapp.ShareBizAdapter;
import com.taobao.tao.log.TLog;

/* loaded from: classes8.dex */
public class nyy {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String REFLOW = "_REFLOW";
    public static final String SHARE = "_SHARE";
    public static final String SHARE_TAG = "TBShare";

    static {
        kge.a(1082690049);
    }

    public static void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{str, str2});
            return;
        }
        TLog.loge("TBShareModule", str, "[return]--> " + str2);
    }

    public static void b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65d7b87d", new Object[]{str, str2});
            return;
        }
        TLog.loge("TBShareModule", str, "[record]--> " + str2);
    }

    public static void c(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f277e37e", new Object[]{str, str2});
            return;
        }
        TLog.loge("TBShareModule", str, "[exception]--> " + str2);
    }

    public static void a(String str) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{str});
            return;
        }
        try {
            str2 = ShareBizAdapter.getInstance().getAppEnv().c().getClass().getSimpleName();
        } catch (Throwable unused) {
            str2 = "";
        }
        TLog.loge("TBShareModule", REFLOW, str + ",currentAty=" + str2);
    }

    public static void b(String str) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{str});
            return;
        }
        try {
            str2 = ShareBizAdapter.getInstance().getAppEnv().c().getClass().getSimpleName();
        } catch (Throwable unused) {
            str2 = "";
        }
        TLog.loge("TBShareModule", SHARE, str + ",currentAty=" + str2);
    }
}
