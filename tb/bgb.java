package tb;

import android.text.TextUtils;
import com.alibaba.analytics.core.model.LogField;
import com.alibaba.android.umbrella.link.UMLinkLogInterface;
import com.alibaba.android.umbrella.link.a;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tinct.ITinctOperater;
import com.ut.mini.UTAnalytics;
import java.util.HashMap;

/* loaded from: classes2.dex */
public class bgb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static UMLinkLogInterface f25870a = bpp.a();

    public static void a(String str, String str2, String str3, String str4, String str5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9b9da5a", new Object[]{str, str2, str3, str4, str5});
            return;
        }
        try {
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str4)) {
                String str6 = TextUtils.isEmpty(str3) ? "" : str3;
                String str7 = TextUtils.isEmpty(str5) ? "" : str5;
                HashMap hashMap = new HashMap();
                hashMap.put("catalog", str2);
                hashMap.put("extraInfo", str6);
                String tinctInfo = ITinctOperater.getInstance().getTinctInfo(str);
                if (TextUtils.isEmpty(tinctInfo)) {
                    tinctInfo = "empty";
                }
                String str8 = tinctInfo;
                hashMap.put(a.PARAM_TINCT_TAG, str8);
                f25870a.commitFailure("AppErrorTrace", "", "", bgc.UMBRELLA_SPINDLE_BIZ, str, hashMap, str4, str7);
                a(str, str8, str2, str6, str4, str7);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    private static void a(String str, String str2, String str3, String str4, String str5, String str6) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2562e1a4", new Object[]{str, str2, str3, str4, str5, str6});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(LogField.EVENTID.toString(), "19999");
        hashMap.put(LogField.PAGE.toString(), str);
        String logField = LogField.ARG1.toString();
        if (TextUtils.isEmpty(str4)) {
            str4 = "";
        }
        hashMap.put(logField, str4);
        hashMap.put(LogField.ARG2.toString(), str5);
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("tinctTag=");
        if (TextUtils.isEmpty(str2)) {
            str2 = "";
        }
        stringBuffer.append(str2);
        stringBuffer.append(",");
        stringBuffer.append("catalog=");
        if (TextUtils.isEmpty(str3)) {
            str3 = "";
        }
        stringBuffer.append(str3);
        stringBuffer.append(",");
        stringBuffer.append("errorMsg=");
        if (TextUtils.isEmpty(str6)) {
            str6 = "";
        }
        stringBuffer.append(str6);
        hashMap.put(LogField.ARGS.toString(), stringBuffer.toString());
        UTAnalytics.getInstance().getDefaultTracker().send(hashMap);
    }
}
