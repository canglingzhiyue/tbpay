package tb;

import android.app.Application;
import android.widget.Toast;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.Globals;

/* loaded from: classes5.dex */
public class qxo {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-217106470);
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue() : jqm.a();
    }

    public static void a(String str, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe179b03", new Object[]{str, th});
            return;
        }
        if (str == null) {
            str = "";
        }
        if (!a()) {
            if (th == null) {
                fjt.a("new_detail异常", str);
                return;
            } else {
                fjt.a("new_detail异常", str, th);
                return;
            }
        }
        Application application = Globals.getApplication();
        Toast.makeText(application, "DebugError:" + str + " case:" + th, 1).show();
        fjt.a("new_detail异常", str, th);
    }
}
