package com.taobao.tao.log.statistics;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.g;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import tb.kge;

/* loaded from: classes.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static boolean f20699a;
    private static boolean b;

    static {
        kge.a(1256144793);
        f20699a = false;
        b = false;
    }

    public static void a(Context context, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c642cc0", new Object[]{context, new Integer(i), new Integer(i2)});
            return;
        }
        if (i > 10000 || i < 0) {
            i = 4000;
        }
        if (i2 > 10000 || i2 < 0) {
            i2 = 2000;
        }
        try {
            int nextInt = new Random().nextInt(10000);
            f20699a = nextInt < i;
            b = nextInt < i2;
            Log.e("TLogStatistics", String.format("TLog statistic ut_enable=%b, file_enable=%b, randomRate=%d, configRate=%d，fileRate=%d", Boolean.valueOf(f20699a), Boolean.valueOf(b), Integer.valueOf(nextInt), Integer.valueOf(i), Integer.valueOf(i2)));
        } catch (Exception e) {
            e.printStackTrace();
            Log.e("TLogStatistics", "TLogStatisticsManager init exception!");
        }
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue() : f20699a;
    }

    public static void a(Context context) {
        Iterator<String> it;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{context});
            return;
        }
        try {
            if (!com.taobao.tao.log.d.j() && (!f20699a || !b)) {
                Log.e("TLogStatistics", "statistics file is disable");
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            String a2 = g.a(currentTimeMillis);
            SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
            String string = defaultSharedPreferences.getString("tlog_file_statistics_timestamp", "");
            if (!TextUtils.isEmpty(a2) && !a2.equals(string)) {
                String a3 = g.a(currentTimeMillis - 86400000);
                ArrayList arrayList = new ArrayList();
                Iterator<String> it2 = com.taobao.tao.log.utils.a.f().iterator();
                long j = 0;
                long j2 = 0;
                int i = 0;
                int i2 = 0;
                while (it2.hasNext()) {
                    File file = new File(it2.next());
                    if (!file.exists() || !file.isFile()) {
                        it = it2;
                    } else {
                        i++;
                        j += file.length();
                        String name = file.getName();
                        int indexOf = name.indexOf("_");
                        int indexOf2 = name.indexOf(com.taobao.tao.log.utils.a.LOG_SUFFIX_DATA);
                        it = it2;
                        if (indexOf2 == -1) {
                            indexOf2 = name.indexOf(com.taobao.tao.log.utils.a.LOG_SUFFIX_TLOG);
                        }
                        if (indexOf != -1 && indexOf2 != -1) {
                            String substring = name.substring(indexOf + 1, indexOf2);
                            if (!arrayList.contains(substring)) {
                                arrayList.add(substring);
                            }
                            if (substring.equals(a3)) {
                                i2++;
                                j2 += file.length();
                            }
                        }
                    }
                    it2 = it;
                }
                TLogEventHelper.a(i, j, arrayList.size(), i2, j2);
                defaultSharedPreferences.edit().putString("tlog_file_statistics_timestamp", a2).apply();
            }
        } catch (Exception e) {
            e.printStackTrace();
            Log.e("TLogStatistics", "statisticsFile exception!");
        }
    }
}
