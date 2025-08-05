package android.taobao.windvane.util;

import android.os.Environment;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes2.dex */
public class l {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int ERROR = -1;

    static {
        kge.a(164689318);
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue();
        }
        try {
            String externalStorageState = Environment.getExternalStorageState();
            if (externalStorageState != null) {
                if (externalStorageState.equals("mounted")) {
                    return true;
                }
            }
        } catch (Exception unused) {
        }
        return false;
    }
}
