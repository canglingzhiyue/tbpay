package com.alipay.mobile.common.logging.strategy;

import com.alipay.mobile.framework.MpaasClassInfo;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.image.d;
import tb.fxb;

@MpaasClassInfo(BundleName = "android-phone-mobilesdk-logging", ExportJarName = "unknown", Level = "lib", Product = ":android-phone-mobilesdk-logging")
/* loaded from: classes3.dex */
public class IntUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final char[] f5452a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', d.LEVEL_D, d.LEVEL_E, 'F', 'G', 'H', d.LEVEL_I, 'J', 'K', d.LEVEL_L, 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', d.LEVEL_V, d.LEVEL_W, 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '+', fxb.DIR};

    public static long a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f3a64c26", new Object[]{str})).longValue();
        }
        int pow = (int) Math.pow(2.0d, 6.0d);
        int length = str.length();
        int i = length;
        long j = 0;
        int i2 = 0;
        while (i2 < length) {
            int i3 = i2 + 1;
            String substring = str.substring(i2, i3);
            int i4 = 0;
            while (true) {
                if (i4 >= 64) {
                    i4 = 0;
                    break;
                } else if (substring.equals(String.valueOf(f5452a[i4]))) {
                    break;
                } else {
                    i4++;
                }
            }
            j += Integer.parseInt(String.valueOf(i4)) * ((long) Math.pow(pow, i - 1));
            i--;
            i2 = i3;
        }
        return j;
    }
}
