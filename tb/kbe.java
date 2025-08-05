package tb;

import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.task.Coordinator;
import com.ut.mini.UTAnalytics;
import com.ut.mini.internal.UTOriginalCustomHitBuilder;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes6.dex */
public class kbe {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ASYN_CHECK_SUCCESS = "asynCheck_Success";
    public static final String PAGE_AUGE = "Page_Auge";
    public static final String SYN_CHECK_SUCCESS = "synCheck_Success";

    public static void a(String str, String str2, List<String> list, List<String> list2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9371b55e", new Object[]{str, str2, list, list2});
            return;
        }
        HashMap hashMap = new HashMap();
        if (list != null && list.size() > 0) {
            for (String str3 : list) {
                hashMap.put(str3, list2.contains(str3) ? "true" : "false");
            }
        }
        final Map<String, String> build = new UTOriginalCustomHitBuilder(PAGE_AUGE, 19999, str, str2, JSON.toJSONString(hashMap), null).build();
        Coordinator.execute(new Runnable() { // from class: tb.kbe.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                try {
                    UTAnalytics.getInstance().getDefaultTracker().send(build);
                    kbd.a(kaw.LOG_TAG, "sendCustomHitMulti === 多个打点:" + build.toString());
                } catch (Exception e) {
                    kbd.b(kaw.LOG_TAG, "UserTracerUtils  ===  sendCustomHitMulti = 打点异常：" + e);
                }
            }
        });
    }

    public static void a(String str, String str2, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84162689", new Object[]{str, str2, map});
            return;
        }
        final Map<String, String> build = new UTOriginalCustomHitBuilder(PAGE_AUGE, 19999, str, str2, map != null ? JSON.toJSONString(map) : "", null).build();
        Coordinator.execute(new Runnable() { // from class: tb.kbe.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                try {
                    UTAnalytics.getInstance().getDefaultTracker().send(build);
                    kbd.a(kaw.LOG_TAG, "sendCustomHitSingle === 单个打点:" + build.toString());
                } catch (Exception e) {
                    kbd.b(kaw.LOG_TAG, "UserTracerUtils  ===  sendCustomHitSingle = 打点异常：" + e);
                }
            }
        });
    }
}
