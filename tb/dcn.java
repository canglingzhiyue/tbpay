package tb;

import android.os.Build;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.autosize.l;
import com.taobao.tao.Globals;

/* loaded from: classes2.dex */
public class dcn {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static Boolean f26689a;

    static {
        kge.a(63612854);
    }

    public static boolean a() {
        Boolean bool;
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            bool = (Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0]);
        } else {
            Boolean bool2 = f26689a;
            if (bool2 != null) {
                return bool2.booleanValue();
            }
            if (Build.VERSION.SDK_INT >= 19) {
                if (l.d(Globals.getApplication()) || l.b(Globals.getApplication())) {
                    z = true;
                }
                f26689a = Boolean.valueOf(z);
            }
            bool = f26689a;
        }
        return bool.booleanValue();
    }
}
