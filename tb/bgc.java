package tb;

import android.text.TextUtils;
import com.alibaba.analytics.core.model.LogField;
import com.alibaba.android.umbrella.link.UMLinkLogInterface;
import com.alibaba.android.umbrella.link.a;
import com.alipay.mobile.security.zim.msgchannel.ZimMessageChannel;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tinct.ITinctOperater;
import com.ut.mini.UTAnalytics;
import java.util.HashMap;
import java.util.Map;
import mtopsdk.mtop.domain.MtopResponse;
import mtopsdk.mtop.util.MtopStatistics;

/* loaded from: classes2.dex */
public class bgc {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String UMBRELLA_SPINDLE_BIZ = "WirelessSRE";

    /* renamed from: a  reason: collision with root package name */
    private static UMLinkLogInterface f25871a = bpp.a();

    public static void a(String str, MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1453b77", new Object[]{str, mtopResponse});
            return;
        }
        try {
            if (!TextUtils.isEmpty(str) && mtopResponse != null) {
                String tinctInfo = ITinctOperater.getInstance().getTinctInfo(str);
                if (TextUtils.isEmpty(tinctInfo)) {
                    tinctInfo = "empty";
                }
                String str2 = tinctInfo;
                String api = mtopResponse.getApi();
                String v = mtopResponse.getV();
                String retCode = mtopResponse.getRetCode();
                String retMsg = mtopResponse.getRetMsg();
                Map<String, String> b = b(mtopResponse);
                b.put(a.PARAM_TINCT_TAG, str2);
                b.put("errorType", a(retCode));
                f25871a.commitFailure("MtopTrace", api, v, UMBRELLA_SPINDLE_BIZ, str, b, retCode, retMsg);
                a(str, str2, api, v, retCode, retMsg, b.get("eagleEyeTraceId"));
            }
        } catch (Throwable th) {
            String str3 = "MtopTracer~traceMtopError~Exception:::" + th.getMessage();
        }
    }

    public static void b(String str, MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e6d94478", new Object[]{str, mtopResponse});
            return;
        }
        try {
            if (!TextUtils.isEmpty(str) && mtopResponse != null) {
                String tinctInfo = ITinctOperater.getInstance().getTinctInfo(str);
                if (TextUtils.isEmpty(tinctInfo)) {
                    tinctInfo = "empty";
                }
                String api = mtopResponse.getApi();
                String v = mtopResponse.getV();
                Map<String, String> b = b(mtopResponse);
                b.put(a.PARAM_TINCT_TAG, tinctInfo);
                f25871a.commitSuccess("MtopTrace", api, v, UMBRELLA_SPINDLE_BIZ, str, b);
            }
        } catch (Throwable th) {
            String str2 = "MtopTracer~traceMtopSuccess~Exception:::" + th.getMessage();
        }
    }

    public static String a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9f352ae", new Object[]{str}) : TextUtils.isEmpty(str) ? "_EMPTY_" : str.startsWith("ANDROID_SYS_") ? "ERROR_MTOP_APP_SDK" : str.startsWith("FAIL_SYS_") ? "ERROR_MTOP_SERVER" : "ERROR_BIZ_SERVER";
    }

    public static String a(MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("cf8a613", new Object[]{mtopResponse}) : bpt.a(mtopResponse);
    }

    public static Map<String, String> b(MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("45f9bf23", new Object[]{mtopResponse});
        }
        HashMap hashMap = new HashMap();
        int responseCode = mtopResponse.getResponseCode();
        hashMap.put("responseSource", mtopResponse.getSource().name());
        hashMap.put(ZimMessageChannel.K_RPC_RES_CODE, String.valueOf(responseCode));
        String a2 = a(mtopResponse);
        if (a2 == null) {
            a2 = "";
        }
        hashMap.put("eagleEyeTraceId", a2);
        MtopStatistics mtopStat = mtopResponse.getMtopStat();
        if (mtopStat == null) {
            return hashMap;
        }
        boolean z = mtopStat.backGround;
        String str = mtopStat.domain;
        String str2 = mtopStat.clientTraceId;
        int i = mtopStat.netStats.retryTimes;
        long j = mtopStat.netStats.serverRT;
        long j2 = mtopStat.netTotalTime;
        long j3 = mtopStat.netStats.recDataTime;
        long totalTime = mtopStat.getTotalTime();
        hashMap.put("isBackground", String.valueOf(z));
        hashMap.put("domain", String.valueOf(str));
        hashMap.put("clientTraceId", String.valueOf(str2));
        hashMap.put("retryTimes", String.valueOf(i));
        hashMap.put("serverRT", String.valueOf(j));
        hashMap.put("netTotalTime", String.valueOf(j2));
        hashMap.put("recDataTime", String.valueOf(j3));
        hashMap.put("mtopTotalTime", String.valueOf(totalTime));
        return hashMap;
    }

    private static void a(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54b86a6e", new Object[]{str, str2, str3, str4, str5, str6, str7});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(LogField.EVENTID.toString(), "19999");
        hashMap.put(LogField.PAGE.toString(), str);
        String logField = LogField.ARG1.toString();
        hashMap.put(logField, str3 + "$" + str4);
        hashMap.put(LogField.ARG2.toString(), str5);
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("tinctTag=");
        String str8 = "";
        if (TextUtils.isEmpty(str2)) {
            str2 = str8;
        }
        stringBuffer.append(str2);
        stringBuffer.append(",");
        stringBuffer.append("traceId=");
        if (TextUtils.isEmpty(str7)) {
            str7 = str8;
        }
        stringBuffer.append(str7);
        stringBuffer.append(",");
        stringBuffer.append("errorMsg=");
        if (!TextUtils.isEmpty(str6)) {
            str8 = str6;
        }
        stringBuffer.append(str8);
        hashMap.put(LogField.ARGS.toString(), stringBuffer.toString());
        UTAnalytics.getInstance().getDefaultTracker().send(hashMap);
    }
}
