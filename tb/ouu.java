package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;
import com.taobao.tao.shop.h;

/* loaded from: classes8.dex */
public class ouu {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-4999517);
    }

    public static void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{str});
            return;
        }
        TLog.loge("[TBSR]:", "TBSR", str);
        h.a("TBSR_I", "", "", str);
    }

    public static void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{str});
            return;
        }
        TLog.loge("[TBSR]:", "TBSR", str);
        h.a("TBSR_E", "other_error", "", str);
    }

    public static void a(Throwable th, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9531d917", new Object[]{th, str});
        } else {
            TLog.loge("TBSR", str, th);
        }
    }

    public static void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{str});
        } else {
            TLog.loge("[TBSR]:", "TBSR", str);
        }
    }
}
