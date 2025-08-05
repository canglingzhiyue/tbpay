package tb;

import com.alibaba.ariver.kernel.RVConstants;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.flowcustoms.afc.utils.AfcUtils;
import com.taobao.flowcustoms.afc.utils.b;
import com.taobao.linkmanager.launcher.TbFcLinkInit;
import com.taobao.tao.log.TLog;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes7.dex */
public class max {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-174978427);
    }

    public static void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{str, str2});
            return;
        }
        try {
            TLog.loge("linkManager", str, str2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void a(String str, String str2, String str3, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("109fb67f", new Object[]{str, str2, str3, map});
            return;
        }
        if (map == null) {
            map = new HashMap<>();
        }
        map.put("currentTime", AfcUtils.a() + "");
        map.put(RVConstants.EXTRA_RES_LAUNCH_PARAMS, TbFcLinkInit.instance().launchParams + "");
        try {
            b.a(19999, str, str2, str3, map);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
