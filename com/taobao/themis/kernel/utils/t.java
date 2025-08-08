package com.taobao.themis.kernel.utils;

import android.content.Context;
import android.net.Uri;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.media.MediaConstant;
import com.taobao.themis.kernel.adapter.IConfigAdapter;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.ut.device.UTDevice;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.Pair;
import tb.kge;
import tb.qpt;

/* loaded from: classes9.dex */
public class t {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static int f22576a;
    public static AtomicLong b;
    public static AtomicLong c;
    public static AtomicLong d;
    public static AtomicLong e;
    public static AtomicLong f;
    private static int g;

    static {
        kge.a(-1328183874);
        f22576a = -1;
        g = -1;
        b = new AtomicLong(-1L);
        c = new AtomicLong(-1L);
        d = new AtomicLong(-1L);
        e = new AtomicLong(-1L);
        f = new AtomicLong(-1L);
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue();
        }
        if (f22576a < 0) {
            return false;
        }
        try {
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return f22576a < Integer.parseInt(((IConfigAdapter) qpt.a(IConfigAdapter.class)).getConfigByGroupAndNameFromLocal(com.taobao.themis.kernel.i.GROUP_THEMIS_COMMON_CONFIG, "enableWebAsyncApiChannelRate", "90"));
    }

    public static boolean b(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9eca1003", new Object[]{context})).booleanValue() : c.a(context);
    }

    public static boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{str})).booleanValue();
        }
        try {
            return a(((IConfigAdapter) qpt.a(IConfigAdapter.class)).getConfigByGroupAndNameFromLocal(com.taobao.themis.kernel.i.GROUP_ARIVER_COMMON_CONFIG, "tms_white_list", ""), str);
        } catch (Exception e2) {
            e2.printStackTrace();
            return false;
        }
    }

    public static boolean a(Uri uri, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fcb0ecd", new Object[]{uri, context})).booleanValue();
        }
        if (g.c()) {
            return true;
        }
        if (!e(context).b() || !n.av()) {
            return false;
        }
        String queryParameter = uri.getQueryParameter(com.taobao.themis.kernel.i.APP_ID);
        if (!StringUtils.isEmpty(queryParameter)) {
            return c(queryParameter);
        }
        return d(uri.toString());
    }

    private static boolean c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("88097eb8", new Object[]{str})).booleanValue();
        }
        try {
            String configByGroupAndNameFromLocal = ((IConfigAdapter) qpt.a(IConfigAdapter.class)).getConfigByGroupAndNameFromLocal(com.taobao.themis.kernel.i.ORANGE_GROUP_THEMIS_WHITE_LIST_CONFIG, "tms_fragment_pub_white_list", "");
            if (!StringUtils.isEmpty(configByGroupAndNameFromLocal)) {
                return configByGroupAndNameFromLocal.contains(str);
            }
            return false;
        } catch (Exception e2) {
            e2.printStackTrace();
            return false;
        }
    }

    public static String c(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("a6ba28c2", new Object[]{context}) : c.a(context) ? "ThemisLaunchTaskReorder_A1" : "ThemisLaunchTaskOld_B1";
    }

    private static boolean d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d23b17f9", new Object[]{str})).booleanValue();
        }
        try {
            String configByGroupAndNameFromLocal = ((IConfigAdapter) qpt.a(IConfigAdapter.class)).getConfigByGroupAndNameFromLocal(com.taobao.themis.kernel.i.ORANGE_GROUP_THEMIS_WHITE_LIST_CONFIG, "tms_fragment_url_white_list", "");
            if (StringUtils.isEmpty(configByGroupAndNameFromLocal)) {
                return false;
            }
            if (configByGroupAndNameFromLocal.equals("*")) {
                return true;
            }
            for (String str2 : configByGroupAndNameFromLocal.split(",")) {
                if (str.contains(str2)) {
                    return true;
                }
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    private static boolean a(String str, String str2) {
        JSONObject parseObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d9378d80", new Object[]{str, str2})).booleanValue();
        }
        try {
            if (f22576a < 0) {
                return false;
            }
            if (StringUtils.isEmpty(str)) {
                parseObject = new JSONObject();
            } else {
                parseObject = JSON.parseObject(str);
            }
            if (parseObject != null && parseObject.containsKey(str2)) {
                if (f22576a < parseObject.getIntValue(str2)) {
                    return true;
                }
            }
            return false;
        } catch (Exception e2) {
            e2.printStackTrace();
            return false;
        }
    }

    public static boolean a(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("61b6362e", new Object[]{context, str})).booleanValue();
        }
        a(context);
        if (f22576a < 0) {
            return false;
        }
        if (g.b()) {
            return true;
        }
        return f22576a <= n.a(com.taobao.themis.kernel.i.GROUP_PHA_SWITCH_THEMIS_CONFIG, "pha_switch_rate", 0) && !n.a(com.taobao.themis.kernel.i.GROUP_PHA_SWITCH_THEMIS_CONFIG, "pha_switch_black_list", MediaConstant.DEFALUT_H265_HW_BLACK_LIST_FOR_DEGRADE_H264).contains(str);
    }

    public static void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{context});
            return;
        }
        try {
            if (f22576a >= 0) {
                return;
            }
            String utdid = UTDevice.getUtdid(context);
            if (StringUtils.isEmpty(utdid)) {
                return;
            }
            f22576a = Math.abs((utdid.hashCode() % 49993) % 100);
            TMSLogger.d("TMSBucket", "BucketId: " + f22576a);
        } catch (Throwable th) {
            TMSLogger.d("TMSBucket", th.getLocalizedMessage());
        }
    }

    public static void d(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a023673d", new Object[]{context});
            return;
        }
        try {
            if (g >= 0) {
                return;
            }
            String utdid = UTDevice.getUtdid(context);
            if (StringUtils.isEmpty(utdid)) {
                return;
            }
            g = Math.abs((utdid.hashCode() % 49993) % 100);
            TMSLogger.d("TMSBucket", "BucketId: " + g);
        } catch (Throwable th) {
            TMSLogger.d("TMSBucket", th.getLocalizedMessage());
        }
    }

    public static boolean b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3dd7e577", new Object[]{str})).booleanValue();
        }
        try {
            return b(((IConfigAdapter) qpt.a(IConfigAdapter.class)).getConfigByGroupAndNameFromLocal(com.taobao.themis.kernel.i.GROUP_THEMIS_COMMON_CONFIG, "poly_open_window_list", ""), str);
        } catch (Exception e2) {
            e2.printStackTrace();
            return false;
        }
    }

    private static boolean b(String str, String str2) {
        JSONObject parseObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("65d7b881", new Object[]{str, str2})).booleanValue();
        }
        try {
            if (f22576a < 0) {
                return false;
            }
            if (StringUtils.isEmpty(str)) {
                parseObject = new JSONObject();
            } else {
                parseObject = JSON.parseObject(str);
            }
            if (parseObject != null && parseObject.containsKey(str2)) {
                if (f22576a < parseObject.getIntValue(str2) / 10) {
                    return true;
                }
            }
            return false;
        } catch (Exception e2) {
            e2.printStackTrace();
            return false;
        }
    }

    public static boolean a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("929ad04a", new Object[]{str, str2, str3})).booleanValue();
        }
        try {
            if (f22576a < 0 || !"true".equals(n.a(com.taobao.themis.kernel.i.GROUP_WIDGET_COMMOM_CONFIG, "enableThemisWidget", "true")) || n.a(com.taobao.themis.kernel.i.GROUP_WIDGET_COMMOM_CONFIG, "themisWidgetIdBlackList", "").contains(str3) || !n.a(com.taobao.themis.kernel.i.GROUP_WIDGET_COMMOM_CONFIG, "themisWidgetSceneIdList", "20").contains(str)) {
                return false;
            }
            int a2 = n.a(com.taobao.themis.kernel.i.GROUP_WIDGET_COMMOM_CONFIG, "themisFullSwitchRate", 0);
            if (a2 > 0) {
                return !JSONObject.parseObject(n.a(com.taobao.themis.kernel.i.GROUP_WIDGET_COMMOM_CONFIG, "themisWidgetSellerIdBlackList", "")).containsKey(str2) && f22576a <= a2;
            }
            JSONObject parseObject = JSONObject.parseObject(n.a(com.taobao.themis.kernel.i.GROUP_WIDGET_COMMOM_CONFIG, "themisWidgetSellerIdListV2", ""));
            return parseObject.containsKey(str2) && f22576a <= parseObject.getIntValue(str2);
        } catch (Throwable th) {
            th.printStackTrace();
            return false;
        }
    }

    public static List<Pair<Integer, Integer>> f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("f186af0", new Object[]{str});
        }
        ArrayList arrayList = new ArrayList();
        try {
            return e(n.b(com.taobao.themis.kernel.i.GROUP_THEMIS_COMMON_CONFIG, str, "").trim());
        } catch (Exception e2) {
            TMSLogger.b("TMSABTestUtils", "getDevicesPostDelayTime error", e2);
            return arrayList;
        }
    }

    public static v c(Context context, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (v) ipChange.ipc$dispatch("329af641", new Object[]{context, str}) : c(context, str, n.b(com.taobao.themis.kernel.i.GROUP_THEMIS_COMMON_CONFIG, str, ""));
    }

    public static v c(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (v) ipChange.ipc$dispatch("b77617b7", new Object[]{context, str, str2});
        }
        try {
            a(context);
            if (f22576a >= 0) {
                int i = 0;
                for (Pair<Integer, Integer> pair : e(str2.trim())) {
                    if (f22576a >= pair.getFirst().intValue() && f22576a <= pair.getSecond().intValue()) {
                        return new v(str + "_EXP_" + i, true, i);
                    }
                    i++;
                }
            }
        } catch (Exception e2) {
            TMSLogger.d("TMSABTestUtils", e2.getLocalizedMessage());
        }
        return new v(str + "_DEFAULT", false, 0);
    }

    public static v b(Context context, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (v) ipChange.ipc$dispatch("5221a040", new Object[]{context, str}) : b(context, str, n.b(com.taobao.themis.kernel.i.GROUP_THEMIS_COMMON_CONFIG, str, ""));
    }

    public static v a(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (v) ipChange.ipc$dispatch("7a01a835", new Object[]{context, str, str2}) : b(context, str, n.b(com.taobao.themis.kernel.i.GROUP_THEMIS_COMMON_CONFIG, str, str2));
    }

    private static v b(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return (v) ipChange.ipc$dispatch("98bbdff6", new Object[]{context, str, str2});
        }
        try {
            a(context);
            if (f22576a >= 0) {
                List<Pair<Integer, Integer>> e2 = e(str2.trim());
                if (e2.size() == 2) {
                    if (f22576a >= e2.get(0).getFirst().intValue() && f22576a <= e2.get(0).getSecond().intValue()) {
                        return new v(str + "_EXP", true, 0);
                    }
                    if (f22576a < e2.get(1).getFirst().intValue() || f22576a > e2.get(1).getSecond().intValue()) {
                        z = false;
                    }
                    if (z) {
                        return new v(str + "_CTRL", false, 0);
                    }
                }
            }
        } catch (Exception e3) {
            TMSLogger.d("TMSABTestUtils", e3.getLocalizedMessage());
        }
        return new v(str + "_DEFAULT", false, 0);
    }

    public static v d(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (v) ipChange.ipc$dispatch("d6304f78", new Object[]{context, str, str2}) : e(context, str, n.b(com.taobao.themis.kernel.i.GROUP_THEMIS_COMMON_CONFIG, str, str2));
    }

    private static v e(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return (v) ipChange.ipc$dispatch("f4ea8739", new Object[]{context, str, str2});
        }
        try {
            d(context);
            if (g >= 0) {
                List<Pair<Integer, Integer>> e2 = e(str2.trim());
                if (e2.size() == 2) {
                    if (g >= e2.get(0).getFirst().intValue() && g <= e2.get(0).getSecond().intValue()) {
                        return new v(str + "_EXP", true, 0);
                    }
                    if (g < e2.get(1).getFirst().intValue() || g > e2.get(1).getSecond().intValue()) {
                        z = false;
                    }
                    if (z) {
                        return new v(str + "_CTRL", false, 0);
                    }
                }
            }
        } catch (Exception e3) {
            TMSLogger.d("TMSABTestUtils", e3.getLocalizedMessage());
        }
        return new v(str + "_DEFAULT", false, 0);
    }

    public static v h(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (v) ipChange.ipc$dispatch("e0fed890", new Object[]{context}) : a(context, "getWriteChunkAsyncAB", "[-1,-1],[-1,-1]");
    }

    public static v e(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (v) ipChange.ipc$dispatch("6504bcd", new Object[]{context}) : a(context, "getUseHomeFragmentAB", "[-1,-1],[-1,-1]");
    }

    public static v f(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (v) ipChange.ipc$dispatch("f9dfd00e", new Object[]{context}) : d(context, "PreCreateWebViewAB", "[-1,-1],[-1,-1]");
    }

    private static List<Pair<Integer, Integer>> e(String str) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("adc5ce51", new Object[]{str});
        }
        ArrayList arrayList = new ArrayList();
        while (i < str.length()) {
            if (str.charAt(i) == '[') {
                int i2 = i + 1;
                StringBuilder sb = new StringBuilder();
                while (str.charAt(i2) != ',') {
                    sb.append(str.charAt(i2));
                    i2++;
                }
                i = i2 + 1;
                StringBuilder sb2 = new StringBuilder();
                while (str.charAt(i) != ']') {
                    sb2.append(str.charAt(i));
                    i++;
                }
                arrayList.add(new Pair(Integer.valueOf(Integer.parseInt(sb.toString())), Integer.valueOf(Integer.parseInt(sb2.toString()))));
            }
            i++;
        }
        return arrayList;
    }
}
