package tb;

import android.taobao.windvane.util.m;
import android.text.TextUtils;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.share.multiapp.ShareBizAdapter;
import com.ut.device.UTDevice;
import java.util.HashMap;

/* loaded from: classes8.dex */
public class nyx {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static String f31852a;

    static {
        kge.a(-101460603);
    }

    public static String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aff6e538", new Object[0]);
        }
        if (TextUtils.isEmpty(f31852a)) {
            f31852a = UTDevice.getUtdid(ShareBizAdapter.getInstance().getAppEnv().b());
        }
        return f31852a;
    }

    public static void a(String str, String str2, HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a507bab7", new Object[]{str, str2, hashMap});
            return;
        }
        StringBuilder sb = new StringBuilder();
        if (hashMap != null && hashMap.size() > 0) {
            for (String str3 : hashMap.keySet()) {
                if (!TextUtils.isEmpty(str3)) {
                    sb.append(str3);
                    sb.append(":");
                    sb.append(hashMap.get(str3));
                    sb.append(",");
                }
            }
        }
        sb.append("utdid:");
        sb.append(a());
        AppMonitor.Alarm.commitFail("taobao_share", "biz_alarm_common", sb.toString(), str, str2);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("taobao_share");
        sb2.append("_");
        sb2.append("biz_alarm_common");
        sb2.append("--code:");
        sb2.append(str);
        sb2.append("--msg:");
        sb2.append(str2);
        sb2.append("--args:");
        if (hashMap == null || hashMap.size() == 0) {
            sb2.append(",");
        }
        sb2.append(sb.toString());
        m.c("taobao_share", sb2.toString());
    }
}
