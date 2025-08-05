package tb;

import android.content.Context;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.IpChange;
import com.ta.utdid2.device.UTDevice;
import com.taobao.orange.OConstant;

/* loaded from: classes6.dex */
public class kan {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static boolean f29916a;

    static {
        kge.a(-244730871);
        f29916a = false;
        try {
            Class.forName(OConstant.REFLECT_APPMONITOR);
            f29916a = true;
        } catch (ClassNotFoundException unused) {
            f29916a = false;
        }
    }

    public static void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{str, str2});
        } else if (!f29916a) {
        } else {
            AppMonitor.Alarm.commitSuccess("TBVideoCore_VCSimpleSession", str, str2);
        }
    }

    public static String a(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bbc5dc40", new Object[]{context}) : f29916a ? UTDevice.getUtdid(context) : "";
    }
}
