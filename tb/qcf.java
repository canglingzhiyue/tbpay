package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.ut.mini.UTAnalytics;
import com.ut.mini.UTHitBuilders;
import java.util.Map;
import tb.icf;

/* loaded from: classes8.dex */
public class qcf {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(478098989);
    }

    public static void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{str, str2});
            return;
        }
        UTHitBuilders.UTCustomHitBuilder uTCustomHitBuilder = new UTHitBuilders.UTCustomHitBuilder("Material");
        uTCustomHitBuilder.setEventPage("Tixel");
        uTCustomHitBuilder.setProperty(ios.KEY_BIZ_LINE, str);
        uTCustomHitBuilder.setProperty("action_event", str2);
        uTCustomHitBuilder.setProperty("from", "cache");
        uTCustomHitBuilder.setProperty("action_result", "success");
        UTAnalytics.getInstance().getDefaultTracker().send(uTCustomHitBuilder.build());
    }

    public static void a(String str, String str2, long j, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d262092", new Object[]{str, str2, new Long(j), str3});
            return;
        }
        UTHitBuilders.UTCustomHitBuilder uTCustomHitBuilder = new UTHitBuilders.UTCustomHitBuilder("Material");
        uTCustomHitBuilder.setEventPage("Tixel");
        uTCustomHitBuilder.setProperty(UTHitBuilders.a.FIELD_ARG2, "Request");
        uTCustomHitBuilder.setProperty(ios.KEY_BIZ_LINE, str);
        uTCustomHitBuilder.setProperty("action_event", str2);
        uTCustomHitBuilder.setProperty("from", "net");
        uTCustomHitBuilder.setProperty("action_result", "success");
        uTCustomHitBuilder.setProperty("tid", str3);
        uTCustomHitBuilder.setProperty("time", String.valueOf(j));
        UTAnalytics.getInstance().getDefaultTracker().send(uTCustomHitBuilder.build());
    }

    public static void a(String str, String str2, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4dba98c8", new Object[]{str, str2, new Long(j)});
        } else {
            a(str, str2, j, "");
        }
    }

    public static void a(String str, String str2, String str3, String str4, String str5, long j, String str6) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("33603af4", new Object[]{str, str2, str3, str4, str5, new Long(j), str6});
            return;
        }
        UTHitBuilders.UTControlHitBuilder uTControlHitBuilder = new UTHitBuilders.UTControlHitBuilder("Tixel", "Material");
        uTControlHitBuilder.setProperty(UTHitBuilders.a.FIELD_ARG2, "Request");
        uTControlHitBuilder.setProperty("action_result", "Error");
        uTControlHitBuilder.setProperty(ios.KEY_BIZ_LINE, str);
        uTControlHitBuilder.setProperty("param", str3);
        uTControlHitBuilder.setProperty("time", String.valueOf(j));
        uTControlHitBuilder.setProperty("action_event", str2);
        uTControlHitBuilder.setProperty("code", str4);
        uTControlHitBuilder.setProperty("message", str5);
        uTControlHitBuilder.setProperty("tid", str6);
        UTAnalytics.getInstance().getDefaultTracker().send(uTControlHitBuilder.build());
    }

    public static void a(String str, String str2, String str3, String str4, String str5, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d81e7aa", new Object[]{str, str2, str3, str4, str5, new Long(j)});
        } else {
            a(str, str2, str3, str4, str5, j, "");
        }
    }

    public static void a(int i, int i2, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d025a92", new Object[]{new Integer(i), new Integer(i2), str});
            return;
        }
        UTHitBuilders.UTControlHitBuilder uTControlHitBuilder = new UTHitBuilders.UTControlHitBuilder("Tixel", "Material");
        uTControlHitBuilder.setProperty(UTHitBuilders.a.FIELD_ARG2, icf.a.CONTROL_FILTER);
        uTControlHitBuilder.setProperty(UTHitBuilders.a.FIELD_ARG3, String.valueOf(i));
        uTControlHitBuilder.setProperty("material_type", String.valueOf(i2));
        uTControlHitBuilder.setProperty("filter_type", "cloudgame");
        uTControlHitBuilder.setProperty("filter_info", str);
        UTAnalytics.getInstance().getDefaultTracker().send(uTControlHitBuilder.build());
    }

    public static void a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("929ad046", new Object[]{str, str2, str3});
            return;
        }
        UTHitBuilders.UTControlHitBuilder uTControlHitBuilder = new UTHitBuilders.UTControlHitBuilder("Tixel", "Material");
        uTControlHitBuilder.setProperty(UTHitBuilders.a.FIELD_ARG2, "unzip_fail");
        uTControlHitBuilder.setProperty("error", str3);
        uTControlHitBuilder.setProperty(ios.KEY_BIZ_LINE, str);
        uTControlHitBuilder.setProperty("materialId", str2);
        UTAnalytics.getInstance().getDefaultTracker().send(uTControlHitBuilder.build());
    }

    public static void a(int i, String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd34debf", new Object[]{new Integer(i), str, new Long(j)});
            return;
        }
        UTHitBuilders.UTCustomHitBuilder uTCustomHitBuilder = new UTHitBuilders.UTCustomHitBuilder("Material");
        uTCustomHitBuilder.setEventPage("Tixel");
        uTCustomHitBuilder.setProperty(UTHitBuilders.a.FIELD_ARG2, "file_size");
        uTCustomHitBuilder.setProperty(UTHitBuilders.a.FIELD_ARG3, String.valueOf(i));
        uTCustomHitBuilder.setProperty("size", String.valueOf(j));
        uTCustomHitBuilder.setProperty("materialId", str);
        UTAnalytics.getInstance().getDefaultTracker().send(uTCustomHitBuilder.build());
    }

    public static void a(String str, String str2, String str3, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0bfaf3e", new Object[]{str, str2, str3, new Long(j)});
            return;
        }
        UTHitBuilders.UTControlHitBuilder uTControlHitBuilder = new UTHitBuilders.UTControlHitBuilder("Tixel", "Material");
        uTControlHitBuilder.setProperty(UTHitBuilders.a.FIELD_ARG2, "resource");
        uTControlHitBuilder.setProperty(UTHitBuilders.a.FIELD_ARG3, str);
        uTControlHitBuilder.setProperty("time", String.valueOf(j));
        uTControlHitBuilder.setProperty("errorCode", str2);
        uTControlHitBuilder.setProperty("errorMsg", str3);
        UTAnalytics.getInstance().getDefaultTracker().send(uTControlHitBuilder.build());
    }

    public static void a(String str, String str2, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84162689", new Object[]{str, str2, map});
            return;
        }
        UTHitBuilders.UTControlHitBuilder uTControlHitBuilder = new UTHitBuilders.UTControlHitBuilder("Tixel", "Material");
        uTControlHitBuilder.setProperty(UTHitBuilders.a.FIELD_ARG2, str);
        uTControlHitBuilder.setProperty(UTHitBuilders.a.FIELD_ARG3, str2);
        if (map != null) {
            uTControlHitBuilder.setProperties(map);
        }
        UTAnalytics.getInstance().getDefaultTracker().send(uTControlHitBuilder.build());
    }
}
