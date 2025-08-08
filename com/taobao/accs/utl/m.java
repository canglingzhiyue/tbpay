package com.taobao.accs.utl;

import android.content.Context;
import android.os.Build;
import mtopsdk.common.util.StringUtils;
import android.util.Pair;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.client.GlobalClientInfo;
import com.taobao.accs.common.Constants;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.jzv;
import tb.kge;

/* loaded from: classes.dex */
public class m {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String DEFAULT_ARANGER_SERVICES = "com.taobao.accs.data.MsgDistributeService,com.taobao.accs.AccsMainService,com.alibaba.dingtalk.accs.connection.AccsBridgeService";
    public static final String KEY_AGOO_OPTIMIZATION_RANGE = "agoo_optimization_range";
    public static final String KEY_ALLOW_LOSS_SERVICE_ID = "allow_loss_service_id";
    public static final String KEY_ARANGER_SERVICES = "aranger_services";
    public static final String KEY_BLOCK_SERVICE = "block_service_ids";
    public static final String KEY_CONN_TO_PULL = "connect_to_pull_ids";
    public static final String KEY_KEEP_ALIVE_PREFIX = "keep_alive_prefix";
    public static final String KEY_KEEP_ALIVE_REPORT_RANGE = "keep_alive_report_range";
    public static final String KEY_SMART_HB_RANGE = "smart_hb_range";
    public static final String NAMESPACE = "accs2";
    public static final String SP_NAME = "ACCS_SDK2";
    public static final String SP_NAME_ORI = "ACCS_SDK2_ORI";

    /* renamed from: a  reason: collision with root package name */
    private static Long f8313a;
    private static Long b;
    private static Boolean c;
    private static Boolean d;

    static {
        kge.a(-874189475);
    }

    public static void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("631b576", new Object[0]);
            return;
        }
        f8313a = null;
        b = null;
        c = null;
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
        } else if (a.f()) {
            com.taobao.accs.common.a.f().execute($$Lambda$m$fKKMXYxicnSA3yNvuf2ZoLlqwYI.INSTANCE);
        } else {
            a(com.taobao.aranger.utils.h.a(jzv.a(), SP_NAME_ORI), SP_NAME);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69459fd", new Object[0]);
        } else {
            a(com.taobao.aranger.utils.h.a(jzv.a(), SP_NAME_ORI), SP_NAME);
        }
    }

    public static void a(Map<String, ?> map, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7b3cea7", new Object[]{map, str});
        } else if (map == null || map.isEmpty()) {
            ALog.e("OrangeAdapter2", "map is empty", new Object[0]);
        } else {
            try {
                HashMap hashMap = new HashMap();
                hashMap.put("optGetHwToken", a(map, "optGetHwToken", "false"));
                hashMap.put("optTokenReport", a(map, "optTokenReport", "false"));
                hashMap.put("optConnListenerRecover", a(map, "optConnListenerRecover", "Xiaomi,Redmi"));
                hashMap.put("smart_hb_max_interval", a(map, "smart_hb_max_interval", "600"));
                hashMap.put("smart_hb_min_interval", a(map, "smart_hb_min_interval", "60"));
                hashMap.put("keep_alive_report_interval", a(map, "keep_alive_report_interval", String.valueOf(86400000L)));
                hashMap.put("reportNow", a(map, "reportNow", "false"));
                hashMap.put("normal_changes", a(map, "normal_changes", "true"));
                hashMap.put("normal_changes_v1", a(map, "normal_changes_v1", "true"));
                hashMap.put("normal_changes_v2", a(map, "normal_changes_v2", "false"));
                hashMap.put(KEY_CONN_TO_PULL, a(map, KEY_CONN_TO_PULL, "powermsg3"));
                hashMap.put(KEY_BLOCK_SERVICE, a(map, KEY_BLOCK_SERVICE, "powermsg3"));
                hashMap.put(KEY_AGOO_OPTIMIZATION_RANGE, a(map, KEY_AGOO_OPTIMIZATION_RANGE, "2,99"));
                hashMap.put(KEY_ALLOW_LOSS_SERVICE_ID, a(map, KEY_ALLOW_LOSS_SERVICE_ID, Constants.TARGET_SERVICE_EVENT_COLLECT));
                hashMap.put(KEY_KEEP_ALIVE_REPORT_RANGE, a(map, KEY_KEEP_ALIVE_REPORT_RANGE, (String) null));
                hashMap.put(KEY_SMART_HB_RANGE, a(map, KEY_SMART_HB_RANGE, "18-18"));
                hashMap.put(KEY_ARANGER_SERVICES, a(map, KEY_ARANGER_SERVICES, DEFAULT_ARANGER_SERVICES));
                hashMap.put(KEY_KEEP_ALIVE_PREFIX, a(map, KEY_KEEP_ALIVE_PREFIX, ""));
                com.taobao.aranger.utils.h.a(jzv.a(), str, hashMap);
            } catch (Throwable th) {
                ALog.e("OrangeAdapter2", "saveConfigToSP err", th, new Object[0]);
            }
        }
    }

    private static String a(Map<String, ?> map, String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("696f900f", new Object[]{map, str, str2}) : map.containsKey(str) ? String.valueOf(map.get(str)) : str2;
    }

    private static String a(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("fc35a1ac", new Object[]{context, str, str2}) : p.a(context, SP_NAME, 4, str, str2);
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[0])).booleanValue() : com.taobao.accs.client.c.f8209a;
    }

    public static boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[0])).booleanValue();
        }
        boolean z = true;
        try {
            z = Boolean.parseBoolean(a(GlobalClientInfo.getContext(), "normal_changes", "true"));
            ALog.d("OrangeAdapter2", "isNormalChangesAvailable = " + z, new Object[0]);
            return z;
        } catch (Throwable th) {
            ALog.e("OrangeAdapter2", "isNormalChangesAvailable err", th, new Object[0]);
            return z;
        }
    }

    public static boolean t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6782aff", new Object[0])).booleanValue();
        }
        boolean z = true;
        try {
            z = Boolean.parseBoolean(a(GlobalClientInfo.getContext(), "normal_changes_v1", "true"));
            ALog.d("OrangeAdapter2", "isNormalChangesAvailableV1 = " + z, new Object[0]);
            return z;
        } catch (Throwable th) {
            ALog.e("OrangeAdapter2", "isNormalChangesAvailableV1 err", th, new Object[0]);
            return z;
        }
    }

    public static boolean g() {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5c0f972", new Object[0])).booleanValue();
        }
        try {
            z = Boolean.parseBoolean(a(GlobalClientInfo.getContext(), "normal_changes_v2", "false"));
        } catch (Throwable th) {
            th = th;
            z = false;
        }
        try {
            ALog.d("OrangeAdapter2", "isNormalChangesAvailableV2 = " + z, new Object[0]);
        } catch (Throwable th2) {
            th = th2;
            ALog.e("OrangeAdapter2", "isNormalChangesAvailableV2 err", th, new Object[0]);
            return z;
        }
        return z;
    }

    public static boolean d() {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[0])).booleanValue();
        }
        try {
            z = Boolean.parseBoolean(a(GlobalClientInfo.getContext(), "reportNow", "false"));
        } catch (Throwable th) {
            th = th;
            z = false;
        }
        try {
            ALog.d("OrangeAdapter2", "shouldReportNow = " + z, new Object[0]);
        } catch (Throwable th2) {
            th = th2;
            ALog.e("OrangeAdapter2", "shouldReportNow err", th, new Object[0]);
            return z;
        }
        return z;
    }

    public static String i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e424ba30", new Object[0]);
        }
        String str = "2,99";
        try {
            str = a(GlobalClientInfo.getContext(), KEY_AGOO_OPTIMIZATION_RANGE, str);
            ALog.d("OrangeAdapter2", "agooChangesInRange = " + str, new Object[0]);
            return str;
        } catch (Throwable th) {
            ALog.e("OrangeAdapter2", "agooChangesInRange err", th, new Object[0]);
            return str;
        }
    }

    public static String s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("255e0466", new Object[0]);
        }
        String str = Constants.TARGET_SERVICE_EVENT_COLLECT;
        try {
            str = a(GlobalClientInfo.getContext(), KEY_ALLOW_LOSS_SERVICE_ID, str);
            ALog.d("OrangeAdapter2", "getAllowLossServiceId = " + str, new Object[0]);
            return str;
        } catch (Throwable th) {
            ALog.e("OrangeAdapter2", "getAllowLossServiceId err", th, new Object[0]);
            return str;
        }
    }

    public static long p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("63fcceb", new Object[0])).longValue();
        }
        Long l = f8313a;
        if (l != null) {
            return l.longValue();
        }
        int i = 600;
        try {
            i = Integer.parseInt(a(GlobalClientInfo.getContext(), "smart_hb_max_interval", String.valueOf(600)));
            ALog.e("OrangeAdapter2", "getSmartHbMaxIntervalInMill = " + i, new Object[0]);
        } catch (Throwable th) {
            ALog.e("OrangeAdapter2", "getSmartHbMaxIntervalInMill err", th, new Object[0]);
        }
        Long valueOf = Long.valueOf(i * 1000);
        f8313a = valueOf;
        return valueOf.longValue();
    }

    public static long q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("64de46c", new Object[0])).longValue();
        }
        Long l = b;
        if (l != null) {
            return l.longValue();
        }
        int i = 60;
        try {
            i = Integer.parseInt(a(GlobalClientInfo.getContext(), "smart_hb_min_interval", String.valueOf(60)));
            ALog.e("OrangeAdapter2", "getSmartHbMinIntervalInMill = " + i, new Object[0]);
        } catch (Throwable th) {
            ALog.e("OrangeAdapter2", "getSmartHbMinIntervalInMill err", th, new Object[0]);
        }
        Long valueOf = Long.valueOf(i * 1000);
        b = valueOf;
        return valueOf.longValue();
    }

    public static long f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5b2e1e1", new Object[0])).longValue();
        }
        long j = 86400000;
        try {
            j = Long.parseLong(a(GlobalClientInfo.getContext(), "keep_alive_report_interval", String.valueOf(86400000L)));
            ALog.d("OrangeAdapter2", "getKeepAliveReportInterval = " + j, new Object[0]);
            return j;
        } catch (Throwable th) {
            ALog.e("OrangeAdapter2", "getKeepAliveReportInterval err", th, new Object[0]);
            return j;
        }
    }

    public static boolean j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5eb3ff5", new Object[0])).booleanValue() : UtilityImpl.isAppKeepAlive();
    }

    public static boolean m() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6158678", new Object[0])).booleanValue() : a(a(GlobalClientInfo.getContext(), KEY_KEEP_ALIVE_REPORT_RANGE, (String) null));
    }

    public static boolean e() {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[0])).booleanValue();
        }
        try {
            z = Boolean.parseBoolean(a(GlobalClientInfo.getContext(), "optTokenReport", "false"));
        } catch (Throwable th) {
            th = th;
            z = false;
        }
        try {
            ALog.d("OrangeAdapter2", "optTokenReport = " + z, new Object[0]);
        } catch (Throwable th2) {
            th = th2;
            ALog.e("OrangeAdapter2", "optTokenReport err", th, new Object[0]);
            return z;
        }
        return z;
    }

    public static boolean u() {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6864280", new Object[0])).booleanValue();
        }
        if (d == null) {
            try {
                z = a(GlobalClientInfo.getContext(), "optConnListenerRecover", "Xiaomi,Redmi").contains(Build.BRAND);
            } catch (Throwable th) {
                ALog.e("OrangeAdapter2", "optConnectionListenerRecover err", th, new Object[0]);
                z = false;
            }
            d = Boolean.valueOf(z);
            ALog.e("OrangeAdapter2", "optConnectionListenerRecover = " + d, new Object[0]);
        }
        return d.booleanValue();
    }

    public static boolean n() {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6239df9", new Object[0])).booleanValue();
        }
        try {
            z = Boolean.parseBoolean(a(GlobalClientInfo.getContext(), "optGetHwToken", "false"));
        } catch (Throwable th) {
            th = th;
            z = false;
        }
        try {
            ALog.d("OrangeAdapter2", "optGetHwToken = " + z, new Object[0]);
        } catch (Throwable th2) {
            th = th2;
            ALog.e("OrangeAdapter2", "optGetHwToken err", th, new Object[0]);
            return z;
        }
        return z;
    }

    public static boolean k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5f95776", new Object[0])).booleanValue() : UtilityImpl.isAppKeepAlive();
    }

    public static boolean r() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("65bfbfd", new Object[0])).booleanValue();
        }
        Boolean bool = c;
        if (bool != null) {
            return bool.booleanValue();
        }
        Context context = GlobalClientInfo.getContext();
        if (UtilityImpl.isChannelProcess(context) && a(a(context, KEY_SMART_HB_RANGE, "18-18"))) {
            z = true;
        }
        Boolean valueOf = Boolean.valueOf(z);
        c = valueOf;
        return valueOf.booleanValue();
    }

    public static String h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("5d9eff91", new Object[0]) : a(GlobalClientInfo.getContext(), KEY_ARANGER_SERVICES, DEFAULT_ARANGER_SERVICES);
    }

    private static boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{str})).booleanValue();
        }
        if (StringUtils.isEmpty(str) || !UtilityImpl.isAppKeepAlive()) {
            return false;
        }
        try {
            if (!StringUtils.isEmpty(str)) {
                String[] split = str.split("-");
                Pair create = Pair.create(Integer.valueOf(Integer.parseInt(split[0])), Integer.valueOf(Integer.parseInt(split[1])));
                int appKeepAliveBucketId = UtilityImpl.getAppKeepAliveBucketId(GlobalClientInfo.getContext());
                boolean z = appKeepAliveBucketId >= ((Integer) create.first).intValue() && appKeepAliveBucketId <= ((Integer) create.second).intValue();
                ALog.e("OrangeAdapter2", "withInRange", "enabled", Boolean.valueOf(z));
                return z;
            }
        } catch (Throwable th) {
            ALog.e("OrangeAdapter2", "withInRange err", th, new Object[0]);
        }
        return false;
    }

    public static String l() {
        String[] split;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("77b5ea0d", new Object[0]);
        }
        try {
            String a2 = a(GlobalClientInfo.getContext(), KEY_KEEP_ALIVE_PREFIX, "");
            String str = Build.BRAND;
            if (a2.contains(str)) {
                for (String str2 : a2.split(",")) {
                    if (!StringUtils.isEmpty(str2) && str2.contains("=")) {
                        String[] split2 = str2.split("=");
                        if (str.equals(split2[0])) {
                            return split2[1];
                        }
                    }
                }
            }
            ALog.d("OrangeAdapter2", "getKeepAlivePrefix = ", new Object[0]);
        } catch (Throwable th) {
            ALog.e("OrangeAdapter2", "getKeepAlivePrefix err", th, new Object[0]);
        }
        return "";
    }

    public static List<String> a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("87fd354c", new Object[]{new Integer(i)});
        }
        try {
            return l.b(GlobalClientInfo.getContext(), i, SP_NAME);
        } catch (Throwable th) {
            ALog.e("OrangeAdapter2", "getServiceIdsByType err", th, new Object[0]);
            return null;
        }
    }

    public static boolean a(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8123ad15", new Object[]{str, new Integer(i)})).booleanValue();
        }
        try {
            return a(i).contains(str);
        } catch (Throwable th) {
            ALog.e("OrangeAdapter2", "getAvailableByServiceIdAndType err", th, new Object[0]);
            return false;
        }
    }
}
