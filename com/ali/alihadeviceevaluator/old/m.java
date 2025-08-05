package com.ali.alihadeviceevaluator.old;

import android.os.Environment;
import android.os.StatFs;
import com.android.alibaba.ip.runtime.IpChange;
import tb.aks;
import tb.alb;
import tb.alf;

/* loaded from: classes.dex */
public class m {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public int f1812a;
    public int b;
    public int c;
    public int d;
    public int e;

    public int a(HardWareInfo hardWareInfo) {
        int i;
        float f;
        float f2;
        float f3;
        StatFs statFs;
        IpChange ipChange = $ipChange;
        int i2 = 1;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5aea3420", new Object[]{this, hardWareInfo})).intValue();
        }
        int a2 = new b().a(hardWareInfo);
        int a3 = new d().a(hardWareInfo);
        c cVar = new c();
        int a4 = cVar.a(hardWareInfo);
        int a5 = new h().a(hardWareInfo);
        k kVar = new k();
        kVar.f1811a = aks.a().f().f25406a;
        int a6 = kVar.a(hardWareInfo);
        f fVar = new f();
        int[] a7 = new alb().a(alf.f25418a);
        fVar.f1808a = a7[0];
        fVar.b = a7[1];
        int a8 = fVar.a(hardWareInfo);
        int a9 = new i().a(hardWareInfo);
        try {
            long blockSize = new StatFs(Environment.getDataDirectory().getPath()).getBlockSize();
            i = a8;
            try {
                j jVar = new j();
                jVar.f1810a = (int) ((((statFs.getBlockCount() * blockSize) / 1024) / 1024) / 1024);
                jVar.b = (int) ((((blockSize * statFs.getAvailableBlocks()) / 1024) / 1024) / 1024);
                i2 = jVar.a(hardWareInfo);
            } catch (Exception unused) {
            }
        } catch (Exception unused2) {
            i = a8;
        }
        try {
            f = Float.parseFloat(aks.a().d().d);
        } catch (Exception unused3) {
            f = 2.0f;
        }
        g gVar = new g();
        gVar.f1809a = f;
        int a10 = gVar.a(hardWareInfo);
        int a11 = new l().a(hardWareInfo);
        int b = cVar.b(hardWareInfo);
        int a12 = new e().a(hardWareInfo);
        if (a12 == 0) {
            a12 = (int) ((a4 * 0.5f) + (a3 * 0.5f) + (b * 0.25f));
        }
        this.f1812a = Math.round(((a4 << 1) + (a3 * 0.5f)) + (b * 0.5f)) / 3;
        if (this.f1812a > 10) {
            this.f1812a = 10;
        }
        float f4 = a6 * 1.5f;
        int i3 = i;
        this.c = Math.round(f4 + (i3 * 0.5f)) / 2;
        if (this.c > 10) {
            this.c = 10;
        }
        this.b = a12;
        if (this.b > 10) {
            this.b = 10;
        }
        this.d = a10;
        this.e = Math.round(a2 + a12 + f2 + (a4 * 2.0f) + a5 + f4 + f3 + (a9 * 0.5f) + (i2 * 0.5f) + (a10 * 0.5f) + a11);
        if (this.e > 100) {
            this.e = 100;
        }
        hardWareInfo.a();
        String str = "设备分=" + this.e + ", apiScore=" + a5 + ",memScore=" + this.c + ",memLimitScore=" + i3 + ", cpuModelScore=" + a4 + ",cpuCountScore=" + a3 + ",mCpuScore=" + this.f1812a + ", CpuHzScore=" + b + ",GpuScore=" + this.b + ",screenScore=" + a9 + ", openglScore=" + this.d + ",storeScore=" + i2 + ",useTimeScore=" + a11;
        return this.e;
    }
}
