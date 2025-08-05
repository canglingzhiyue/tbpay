package com.ali.alihadeviceevaluator.old;

import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f1806a;
    public int b = 4;
    private String d = "SDM845,KIRIN970,MSM8998,EXYNOS8895";
    private String e = "MSM8997,HI3660";
    private String f = "MSM8996,MSM8996PRO,MSM8996 PRO,EXYNOS8890,MT6799";
    private String g = "SDM660,SDM630,MSM8994,MSM8992,HI3650,EXYNOS7420,VBOX86";
    private String h = "MSM8956,MSM8946,MT6797X,MT6797X,MT6797T,MT6797D";
    private String i = "APQ8084,MSM8084,MSM8953,HI3630,EXYNOS5433,HI3635,EXYNOS5";
    private String j = "MSM8X74,MSM8X74AA,MSM8X74AB,MSM8X74AC,MSM8674,MSM8274,MSM8074,EXYNOS5430,EXYNOS7870,EXYNOS7580,EXYNOS5433,MT679X,MT6797T,MT6797,EXYNOS5420,UNIVERSAL5420,RANCHU";
    private String k = "MT675X,MT6795,MT6755,MT6752,MT6753,EXYNOS5800,EXYNOS5422,EXYNOS5410,MSM8952,MSM8940,PXA1936,HI6210SFT";
    private String l = "EXYNOS5260,EXYNOS5250,MT6750,MT6735,MSM8939V2,MSM8937,MSM8929,APQ8064,MSM8917,EXYNOS52,K3V2+,REDHOOKBAY,PXA1908,SC9860,HI6620OEM";
    private String m = "MT6595,MT6592,MT6582,MSM8936,MSM8909,MSM8909V2,MSM8916V2,MSM8208,MSM8960T,MSM8260A,MSM8660A,MSM8960,MSM8X12,MSM8X10,MSM8X30,LC1860";
    private String n = "K3V2E,K3V2,MT6589,EXYNOS4210,EXYNOS4212,MSM8X25Q,MSM8X26,PXA1088,PXA1L88,MSM8260,MSM8660,MSM8625,MSM8225,MSM8655,APQ8055,MSM7230,MSM7630,GOLDFISH,MSM8255T,MSM8655T,MSM7627A,MSM7227A,MSM7627T,MSM7227T,MT6577T,MT6572M,MT6515M,MT6575,QSD8650,QSD8250,OMAP4470,SP8810,SC8810MT6516,MT6573,MT6513,S5PC100,S5L8900,HI3611,HI3620,OMAP4460,OMAP4440,OMAP4430,EXYNOS3475,EXYNOS3110";
    public String[] c = {this.n, this.m, this.l, this.k, this.j, this.i, this.h, this.g, this.f, this.e, this.d};

    public int a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f3a64c25", new Object[]{this, str})).intValue();
        }
        if (this.f1806a == null) {
            return -1;
        }
        for (int length = this.c.length - 1; length >= 0; length--) {
            String str2 = this.c[length];
            if (str2 != null && str2.contains(str)) {
                Log.e("OnlineMonitor", "cpuModel=" + str + ",score=" + length);
                return length;
            }
        }
        return -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:104:0x01a3, code lost:
        if (r0 >= 2) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x01b2, code lost:
        if (r0 >= 2) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x01c2, code lost:
        if (r0 >= 2) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x01d1, code lost:
        if (r0 >= 2) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x01e6, code lost:
        if (r0 >= 2) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0116, code lost:
        if (r0 >= 2) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x016a, code lost:
        if (r0 >= 2) goto L54;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int a(com.ali.alihadeviceevaluator.old.HardWareInfo r15) {
        /*
            Method dump skipped, instructions count: 502
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ali.alihadeviceevaluator.old.c.a(com.ali.alihadeviceevaluator.old.HardWareInfo):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:108:0x0136, code lost:
        if (r5 >= 1.0f) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0139, code lost:
        r3 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x007b, code lost:
        if (r18.d >= 1.0f) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x00fa, code lost:
        if (r5 >= 1.0f) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x00fc, code lost:
        r3 = 2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int b(com.ali.alihadeviceevaluator.old.HardWareInfo r18) {
        /*
            Method dump skipped, instructions count: 317
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ali.alihadeviceevaluator.old.c.b(com.ali.alihadeviceevaluator.old.HardWareInfo):int");
    }
}
