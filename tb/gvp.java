package tb;

import android.content.SharedPreferences;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.launcher.common.LauncherRuntime;
import com.taobao.orange.OrangeConfig;
import com.taobao.tao.log.TLog;
import com.ut.mini.UTAnalytics;
import com.ut.mini.internal.UTOriginalCustomHitBuilder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public class gvp implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final String f28520a;
    private final String b;
    private final int c;

    public gvp(String str, String str2, int i) {
        this.b = str;
        this.f28520a = str2;
        this.c = i;
    }

    @Override // java.lang.Runnable
    public void run() {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
        } else if (!Boolean.parseBoolean(OrangeConfig.getInstance().getConfig(gve.MODULE, gve.TAG, Boolean.TRUE.toString()))) {
            TLog.loge(gve.MODULE, gve.TAG, "switch is off, return");
        } else {
            SharedPreferences sharedPreferences = LauncherRuntime.h.getSharedPreferences(this.f28520a, 0);
            Map<String, ?> all = sharedPreferences.getAll();
            if (all == null || all.isEmpty()) {
                TLog.loge(gve.MODULE, gve.TAG, "no data in storage");
                return;
            }
            ArrayList<String> arrayList = new ArrayList();
            for (Map.Entry<String, ?> entry : all.entrySet()) {
                Object value = entry.getValue();
                if (value instanceof String) {
                    String key = entry.getKey();
                    if (!StringUtils.equals(key, "version")) {
                        String str = (String) value;
                        TLog.loge(gve.MODULE, gve.TAG, str);
                        if (StringUtils.equals(key, this.b)) {
                            if (a(str)) {
                                arrayList.add(key);
                            }
                        } else {
                            i++;
                            if (i <= this.c && a(str)) {
                                arrayList.add(key);
                            }
                        }
                    }
                }
            }
            if (arrayList.isEmpty()) {
                return;
            }
            SharedPreferences.Editor edit = sharedPreferences.edit();
            for (String str2 : arrayList) {
                edit.remove(str2);
            }
            edit.commit();
        }
    }

    private static boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{str})).booleanValue();
        }
        if (!UTAnalytics.getInstance().isInit()) {
            TLog.loge(gve.MODULE, gve.TAG, "ut is not ready for: " + str);
            return false;
        }
        HashMap hashMap = new HashMap(1);
        hashMap.put("startup_data", str);
        UTAnalytics.getInstance().getDefaultTracker().send(new UTOriginalCustomHitBuilder("exp_negative_problems", 19999, "startup", null, null, hashMap).build());
        return true;
    }
}
