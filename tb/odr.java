package tb;

import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.content.business.b;
import com.ut.mini.UTAnalytics;
import com.ut.mini.internal.UTOriginalCustomHitBuilder;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes8.dex */
public class odr {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-525210939);
    }

    public static void a(String str, String str2, String str3, String str4, String str5, String str6) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2562e1a4", new Object[]{str, str2, str3, str4, str5, str6});
            return;
        }
        HashMap hashMap = new HashMap(16);
        hashMap.put("url", str);
        hashMap.put("itemId", str3);
        hashMap.put("source", str2);
        hashMap.put(b.ACCOUNT_ID, str4);
        hashMap.put("scenceId", str5);
        hashMap.put("contentId", str6);
        UTAnalytics.getInstance().getDefaultTracker().send(new UTOriginalCustomHitBuilder("Page_Content_Business", 2101, "sendSuccess", "", "", hashMap).build());
        AppMonitor.Alarm.commitSuccess("Page_Content_Business", "cpsMonitor");
    }

    public static void a(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52d14b8", new Object[]{str, str2, str3, str4, str5, str6, str7, str8});
            return;
        }
        HashMap hashMap = new HashMap(16);
        hashMap.put("url", str);
        hashMap.put("errorCode", str2);
        hashMap.put("errorMsg", str3);
        hashMap.put("itemId", str5);
        hashMap.put("source", str4);
        hashMap.put(b.ACCOUNT_ID, str6);
        hashMap.put(b.BIZ_TYPE, str7);
        hashMap.put("contentId", str8);
        UTAnalytics.getInstance().getDefaultTracker().send(new UTOriginalCustomHitBuilder("Page_Content_Business", 2101, "sendFailed", "", "", hashMap).build());
        AppMonitor.Alarm.commitFail("Page_Content_Business", "cpsMonitor", str2, str3);
    }

    public static void b(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10acfa39", new Object[]{str, str2, str3, str4, str5, str6, str7, str8});
            return;
        }
        HashMap hashMap = new HashMap(16);
        hashMap.put("url", str);
        hashMap.put(b.ACCOUNT_ID, str2);
        hashMap.put(b.TCP_BID, str3);
        hashMap.put(b.CT, str4);
        hashMap.put(b.SID, str5);
        hashMap.put("itemId", str6);
        hashMap.put("contentId", str7);
        hashMap.put("scenceId", str8);
        UTAnalytics.getInstance().getDefaultTracker().send(new UTOriginalCustomHitBuilder("Page_Content_Business_Tcp", 2101, "sendSuccess", "", "", hashMap).build());
        AppMonitor.Alarm.commitSuccess("Page_Content_Business", "tcpMonitor");
    }

    public static void a(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40364dcc", new Object[]{str, str2, str3, str4, str5, str6, str7, str8, str9, str10});
            return;
        }
        HashMap hashMap = new HashMap(16);
        hashMap.put("url", str);
        hashMap.put("errorCode", str2);
        hashMap.put("errorMsg", str3);
        hashMap.put(b.ACCOUNT_ID, str4);
        hashMap.put(b.TCP_BID, str5);
        hashMap.put(b.CT, str6);
        hashMap.put(b.SID, str7);
        hashMap.put("itemId", str8);
        hashMap.put("contentId", str9);
        hashMap.put("scenceId", str10);
        UTAnalytics.getInstance().getDefaultTracker().send(new UTOriginalCustomHitBuilder("Page_Content_Business_Tcp", 2101, "sendFailed", "", "", hashMap).build());
        AppMonitor.Alarm.commitFail("Page_Content_Business", "tcpMonitor", str2, str3);
    }

    public static void a(String str, Map<String, String> map, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b82901d", new Object[]{str, map, str2});
            return;
        }
        map.put("url", str);
        map.put("source", str2);
        UTAnalytics.getInstance().getDefaultTracker().send(new UTOriginalCustomHitBuilder("Page_Content_Business_Both", 2101, "sendSuccess", "", "", map).build());
        AppMonitor.Alarm.commitSuccess("Page_Content_Business", "bothMonitor");
    }

    public static void a(String str, String str2, String str3, Map<String, String> map, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("72a9de89", new Object[]{str, str2, str3, map, str4});
            return;
        }
        map.put("url", str);
        map.put("errorCode", str2);
        map.put("errorMsg", str3);
        map.put("source", str4);
        UTAnalytics.getInstance().getDefaultTracker().send(new UTOriginalCustomHitBuilder("Page_Content_Business_Both", 2101, "sendFailed", "", "", map).build());
        AppMonitor.Alarm.commitFail("Page_Content_Business", "bothMonitor", str2, str3);
    }
}
