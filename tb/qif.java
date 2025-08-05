package tb;

import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes8.dex */
public final class qif {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    public static boolean f32935a = true;
    public static boolean b = false;

    public static void a(String str, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("82c81dbf", new Object[]{str, objArr});
            return;
        }
        try {
            if (!f32935a || objArr.length == 0) {
                return;
            }
            String.format(str, objArr);
        } catch (Throwable th) {
            a("log.error.e=" + th.toString() + th.getMessage());
        }
    }

    public static void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{str});
            return;
        }
        try {
            if (!f32935a) {
                return;
            }
            Log.e("TBHuDong", str);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static void a(String str, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe179b03", new Object[]{str, th});
            return;
        }
        a(str + "\nstack:" + Log.getStackTraceString(th));
        if (b) {
            throw new RuntimeException(th);
        }
    }
}
