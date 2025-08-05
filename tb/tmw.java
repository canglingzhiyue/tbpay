package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.umipublish.monitor.UmiPublishMonitor;

/* loaded from: classes8.dex */
public class tmw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-426832294);
    }

    public static void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{str, str2});
            return;
        }
        UmiPublishMonitor a2 = UmiPublishMonitor.a();
        if (!TextUtils.isEmpty(str2)) {
            str = str + "_" + str2;
        }
        a2.a("stat_code", str, (JSONObject) null);
    }

    public static void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{str});
        } else {
            a(str, "");
        }
    }
}
