package tb;

import com.alibaba.analytics.core.model.LogField;
import com.alipay.mobile.common.logging.util.perf.Constants;
import com.android.alibaba.ip.runtime.IpChange;
import com.ut.mini.UTAnalytics;
import java.util.HashMap;

/* loaded from: classes4.dex */
public class dwb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-143152341);
    }

    public static void a(String str, int i, Object obj, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("17940952", new Object[]{str, new Integer(i), obj, strArr});
            return;
        }
        String a2 = a(strArr);
        HashMap hashMap = new HashMap();
        hashMap.put(LogField.PAGE.toString(), str);
        String logField = LogField.EVENTID.toString();
        hashMap.put(logField, "" + i);
        hashMap.put(LogField.ARG1.toString(), aqc.a(obj));
        if (a2 != null) {
            hashMap.put(LogField.ARGS.toString(), a2);
        }
        hashMap.put("_bmbu", Constants.VAL_YES);
        UTAnalytics.getInstance().getDefaultTracker().send(hashMap);
    }

    private static String a(String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a51c09c9", new Object[]{strArr});
        }
        if (strArr != null && strArr.length == 0) {
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer();
        if (strArr != null && strArr.length > 0) {
            boolean z = false;
            for (int i = 0; i < strArr.length; i++) {
                if (!aqc.e(strArr[i])) {
                    if (z) {
                        stringBuffer.append(",");
                    }
                    stringBuffer.append(strArr[i]);
                    z = true;
                }
            }
        }
        return stringBuffer.toString();
    }
}
