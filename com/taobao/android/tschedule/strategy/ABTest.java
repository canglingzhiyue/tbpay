package com.taobao.android.tschedule.strategy;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import android.util.Log;
import com.alibaba.ut.abtest.UTABTest;
import com.alibaba.ut.abtest.VariationSet;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ab.api.ABGlobal;
import java.util.HashMap;
import tb.jmc;
import tb.jmh;
import tb.kge;

/* loaded from: classes6.dex */
public class ABTest {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* loaded from: classes6.dex */
    public static class NoABExpException extends Exception {
        static {
            kge.a(-1444950848);
        }
    }

    static {
        kge.a(-1234194440);
    }

    public static boolean a(int i) {
        long j;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a821939f", new Object[]{new Integer(i)})).booleanValue();
        }
        String str = (String) com.taobao.android.launcher.common.c.a("deviceId", "");
        if (StringUtils.isEmpty(str)) {
            return false;
        }
        int length = str.length();
        if (length > 0) {
            j = 0;
            for (int i2 = 0; i2 < length; i2++) {
                j += (31 * j) + str.charAt(i2);
            }
        } else {
            j = 0;
        }
        int i3 = 100 / i;
        if (i3 != 0) {
            j *= i3;
        }
        long a2 = jmh.a("start_prerender_gray_hash", 0L);
        return a2 > 0 && (a2 >= 10000 || j % 10000 <= a2);
    }

    public static boolean a(String str) throws NoABExpException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{str})).booleanValue();
        }
        if (com.taobao.android.launcher.common.h.a(".tschedule_ab_on")) {
            return true;
        }
        Context b = com.taobao.android.tschedule.e.b();
        if (ABGlobal.a(b, "tb_global", "phazhc", str + "_strategy_schedule")) {
            return true;
        }
        String b2 = b(str);
        if (b2 == null) {
            return false;
        }
        VariationSet activate = UTABTest.activate("tschedule", b2);
        if (activate.getExperimentId() <= 0) {
            Log.e("ScheduleABTest", "No exp found, try again later");
            HashMap hashMap = new HashMap();
            hashMap.put("expBucketId", "0");
            hashMap.put("switchValue", "N/A");
            jmc.a("downgrade", "", "1", "TSchedule", "pageOnLeave", hashMap);
            throw new NoABExpException();
        }
        boolean valueAsBoolean = activate.getVariation("open").getValueAsBoolean(false);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("expBucketId", String.valueOf(activate.getExperimentBucketId()));
        hashMap2.put("switchValue", String.valueOf(valueAsBoolean));
        jmc.a("downgrade", "", "1", "TSchedule", "pageOnLeave", hashMap2);
        return activate.getVariation("open").getValueAsBoolean(false);
    }

    private static String b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6111438d", new Object[]{str});
        }
        String str2 = (String) com.taobao.android.launcher.common.c.a("appVersion", null);
        if (str2 != null) {
            return String.format("%s_%s_%s", "androidSchedule", str, str2.replace('.', '_'));
        }
        return null;
    }
}
