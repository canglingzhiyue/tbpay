package tb;

import android.widget.Toast;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.utils.Global;

/* loaded from: classes7.dex */
public class tjn {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-530145899);
    }

    public static void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{str});
        } else {
            Toast.makeText(Global.getApplication(), str, 0).show();
        }
    }
}
