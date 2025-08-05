package tb;

import android.text.TextUtils;
import anet.channel.GlobalAppRuntimeInfo;
import com.alibaba.android.umbrella.trace.UmbrellaInfo;
import com.alibaba.android.umbrella.trace.UmbrellaTracker;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.speed.TBSpeed;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes6.dex */
public class jmc {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "TS.umbrella";

    static {
        kge.a(-456348935);
    }

    public static void a(String str, String str2, String str3, String str4, String str5, Map<String, String> map, String str6, String str7) {
        UmbrellaInfo a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3969d7f", new Object[]{str, str2, str3, str4, str5, map, str6, str7});
        } else if (!jmi.b() && !a(str5)) {
        } else {
            String subEdition = TBSpeed.getSubEdition();
            if (subEdition != null) {
                if (map == null) {
                    map = new HashMap<>(2);
                }
                map.put("speedBucket", subEdition);
                map.put("process", GlobalAppRuntimeInfo.getCurrentProcess());
            }
            UmbrellaInfo.a aVar = new UmbrellaInfo.a(str2, str3, str, str4, str5);
            aVar.a(str3).a(map);
            if (TextUtils.isEmpty(str6) || (a2 = aVar.a()) == null) {
                return;
            }
            String str8 = UmbrellaTracker.PURCHASE_POINT_PRE + a2.mainBizName + UmbrellaTracker.PURCHASE_POINT_POST;
            String jsonString = a2.toJsonString();
            AppMonitor.Alarm.commitFail("Page_Trade_Govern", str8, jsonString, str6, str7);
            jkq.a(TAG, "commitFailureStability, point:" + str8 + ", errorCode:" + str6 + ", info:" + jsonString);
        }
    }

    public static void a(String str, String str2, String str3, String str4, String str5, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19b0c1eb", new Object[]{str, str2, str3, str4, str5, map});
        } else if (!jmi.b() && !a(str5)) {
        } else {
            String subEdition = TBSpeed.getSubEdition();
            if (subEdition != null) {
                if (map == null) {
                    map = new HashMap<>();
                }
                map.put("speedBucket", subEdition);
                map.put("process", GlobalAppRuntimeInfo.getCurrentProcess());
            }
            UmbrellaInfo.a aVar = new UmbrellaInfo.a(str2, str3, str, str4, str5);
            aVar.a(str3).a(map);
            UmbrellaInfo a2 = aVar.a();
            if (a2 == null || TextUtils.isEmpty(a2.mainBizName)) {
                return;
            }
            String str6 = UmbrellaTracker.PURCHASE_POINT_PRE + a2.mainBizName + UmbrellaTracker.PURCHASE_POINT_POST;
            String jsonString = a2.toJsonString();
            AppMonitor.Alarm.commitSuccess("Page_Trade_Govern", str6, jsonString);
            jkq.a(TAG, "commitSuccessStability, point:" + str6 + ", info:" + jsonString);
        }
    }

    private static boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{str})).booleanValue();
        }
        double a2 = jmh.a(jmg.CONFIG_KEY_SAMPLE_RATIO, 5.0E-4d);
        if (!TextUtils.isEmpty(str)) {
            a2 = jmh.a("sample_ratio_" + str, a2);
        }
        return a2 > Math.random();
    }
}
