package mtopsdk.extra.antiattack;

import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tlog.adapter.AdapterForTLog;

/* loaded from: classes9.dex */
public final class a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int D = 2;
    public static final int E = 16;
    public static final int I = 4;
    public static final int N = 32;
    public static final int V = 1;
    public static final int W = 8;

    /* renamed from: a  reason: collision with root package name */
    public static volatile boolean f24999a = true;
    public static volatile boolean b = true;
    public static volatile int c = 4;

    public static int a(int i, String str, String str2, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ecdd4019", new Object[]{new Integer(i), str, str2, th})).intValue();
        }
        if (!f24999a) {
            return 0;
        }
        try {
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
        if (i == 1) {
            if (!b) {
                return Log.v(str, str2);
            }
            AdapterForTLog.logv(str, str2);
            return 0;
        } else if (i == 2) {
            if (!b) {
                return Log.d(str, str2);
            }
            AdapterForTLog.logd(str, str2);
            return 0;
        } else if (i == 4) {
            if (!b) {
                return Log.i(str, str2);
            }
            AdapterForTLog.logi(str, str2);
            return 0;
        } else if (i == 8) {
            if (!b) {
                return Log.w(str, str2, th);
            }
            AdapterForTLog.logw(str, str2, th);
            return 0;
        } else {
            if (i == 16) {
                if (!b) {
                    return Log.e(str, str2, th);
                }
                AdapterForTLog.loge(str, str2, th);
                return 0;
            }
            return 0;
        }
    }
}
