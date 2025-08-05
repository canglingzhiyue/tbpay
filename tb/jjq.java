package tb;

import com.alibaba.analytics.core.model.LogField;
import com.android.alibaba.ip.runtime.IpChange;
import com.ut.mini.UTAnalytics;
import com.ut.mini.l;
import java.util.HashMap;

/* loaded from: classes6.dex */
public class jjq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-780858739);
    }

    public static void a(String str, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d04957ad", new Object[]{str, strArr});
            return;
        }
        String currentPageName = l.getInstance().getCurrentPageName();
        HashMap hashMap = new HashMap();
        hashMap.put(LogField.PAGE.toString(), currentPageName);
        hashMap.put(LogField.EVENTID.toString(), "19999");
        hashMap.put(LogField.ARG1.toString(), str);
        String a2 = a(strArr);
        if (a2 != null) {
            hashMap.put(LogField.ARGS.toString(), a2);
        }
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
