package tb;

import android.content.Context;
import android.content.SharedPreferences;
import mtopsdk.common.util.StringUtils;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import com.taobao.orange.g;
import tb.cew;
import tb.mto;

/* loaded from: classes7.dex */
public class kgb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
        } else {
            OrangeConfig.getInstance().registerListener(new String[]{"codetrack"}, new g() { // from class: tb.kgb.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.orange.g
                public void onConfigUpdate(String str, boolean z) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("9458c0f9", new Object[]{this, str, new Boolean(z)});
                    } else if (!"codetrack".equals(str)) {
                    } else {
                        kft.a("CodeTrack.ConfigUtil", "orange groupName updated, codetrack");
                    }
                }
            });
        }
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[0])).booleanValue();
        }
        String config = OrangeConfig.getInstance().getConfig("codetrack", "codetrackV2Enable", Boolean.TRUE.toString());
        return !StringUtils.isEmpty(config) && Boolean.parseBoolean(config);
    }

    private static long d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("596b2df", new Object[0])).longValue();
        }
        String config = OrangeConfig.getInstance().getConfig("codetrack", "codetrackTimeInterval", String.valueOf((long) cew.a.CONFIG_TRACK_1022_INTERVAL_TIME));
        if (StringUtils.isEmpty(config)) {
            return cew.a.CONFIG_TRACK_1022_INTERVAL_TIME;
        }
        try {
            return Long.parseLong(config);
        } catch (NumberFormatException unused) {
            return cew.a.CONFIG_TRACK_1022_INTERVAL_TIME;
        }
    }

    private static double e() {
        double parseDouble;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5a4ca5a", new Object[0])).doubleValue();
        }
        String config = OrangeConfig.getInstance().getConfig("codetrack", "codetrackV2SampleRate", String.valueOf(0.01d));
        if (StringUtils.isEmpty(config)) {
            return 0.01d;
        }
        try {
            parseDouble = Double.parseDouble(config);
        } catch (Throwable unused) {
        }
        if (parseDouble < mto.a.GEO_NOT_SUPPORT) {
            return 0.01d;
        }
        return parseDouble;
    }

    public static boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[0])).booleanValue();
        }
        double random = Math.random();
        double e = e();
        Log.e("CodeTrack.ConfigUtil", "realRate = " + random + ", configRate = " + e);
        return random < e;
    }

    public static boolean a(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9e1d6464", new Object[]{context})).booleanValue() : System.currentTimeMillis() - c(context) < d();
    }

    public static void b(Context context) {
        SharedPreferences.Editor edit;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9eca0fff", new Object[]{context});
            return;
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences("codetrack_sp", 0);
        if (sharedPreferences == null || (edit = sharedPreferences.edit()) == null) {
            return;
        }
        edit.putLong("upload_time", System.currentTimeMillis());
        edit.apply();
    }

    private static long c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9f76bb92", new Object[]{context})).longValue();
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences("codetrack_sp", 0);
        if (sharedPreferences == null) {
            return 0L;
        }
        return sharedPreferences.getLong("upload_time", 0L);
    }
}
