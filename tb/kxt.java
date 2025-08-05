package tb;

import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes5.dex */
public class kxt {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-733595840);
    }

    public static void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{str});
        } else if (!fqi.bj()) {
        } else {
            Log.e("DXLanguageLogUtil", str);
        }
    }
}
