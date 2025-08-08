package com.alibaba.ut.abtest.internal.util;

import mtopsdk.common.util.StringUtils;
import com.alibaba.evo.internal.bucketing.model.ExperimentGroupV5;
import com.alibaba.evo.internal.bucketing.model.ExperimentV5;
import com.android.alibaba.ip.runtime.IpChange;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import tb.kge;

/* loaded from: classes.dex */
public class d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1870440557);
    }

    public static String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{str});
        }
        try {
            return String.format("%032X", new BigInteger(1, MessageDigest.getInstance("MD5").digest(str.getBytes())));
        } catch (NoSuchAlgorithmException e) {
            h.c("DecisionUtils", "motu md5 digest fail", e);
            return null;
        }
    }

    public static String b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6111438d", new Object[]{str});
        }
        try {
            try {
                StringBuilder sb = new StringBuilder(new BigInteger(1, MessageDigest.getInstance("md5").digest(str.getBytes())).toString(16));
                for (int i = 0; i < 32 - sb.length(); i++) {
                    sb.insert(0, "0");
                }
                return sb.toString();
            } catch (NoSuchAlgorithmException e) {
                h.c("DecisionUtils", "trade md5 digest fail", e);
                return null;
            }
        } catch (Throwable unused) {
            return null;
        }
    }

    public static double c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("88097ea2", new Object[]{str})).doubleValue();
        }
        if (!StringUtils.isEmpty(str) && str.contains("_")) {
            String[] split = str.split("_");
            try {
                return Double.parseDouble(split[split.length - 1]);
            } catch (Exception unused) {
            }
        }
        return -1.0d;
    }

    public static boolean a(ExperimentV5 experimentV5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3088aa04", new Object[]{experimentV5})).booleanValue();
        }
        long a2 = m.a();
        return a2 >= experimentV5.getBeginTime() && a2 <= experimentV5.getEndTime();
    }

    public static boolean a(com.alibaba.ut.abtest.internal.bucketing.model.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d3a3d5fb", new Object[]{bVar})).booleanValue();
        }
        long a2 = m.a();
        return a2 >= bVar.k() && a2 <= bVar.l();
    }

    public static boolean a(int i, ExperimentGroupV5 experimentGroupV5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2db39daa", new Object[]{new Integer(i), experimentGroupV5})).booleanValue();
        }
        boolean a2 = a(i, experimentGroupV5.getRatioRange());
        if (a2) {
            h.f("DecisionUtils", "【运行实验】实验分组流量计算。分组ID：" + experimentGroupV5.getId() + "，计算结果：有效流量(命中分桶)");
        } else {
            h.b("DecisionUtils", "【运行实验】实验分组流量计算。分组ID：" + experimentGroupV5.getId() + "，计算结果：无效流量(未命中分桶)");
        }
        return a2;
    }

    public static boolean a(int i, int[][] iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9e1bf6ec", new Object[]{new Integer(i), iArr})).booleanValue();
        }
        if (i >= 0 && iArr != null && iArr.length != 0) {
            for (int[] iArr2 : iArr) {
                if (a(i, iArr2)) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean a(int i, int[] iArr) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("2621a7ed", new Object[]{new Integer(i), iArr})).booleanValue() : iArr != null && iArr.length >= 2 && i >= iArr[0] && i <= iArr[1];
    }
}
