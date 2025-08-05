package com.alibaba.security.realidentity;

import android.content.Context;
import android.os.Bundle;
import android.os.Message;
import com.alibaba.security.realidentity.algo.wrapper.entity.detector.ABDetectType;
import com.alibaba.security.realidentity.algo.wrapper.entity.result.ABActionResult;
import com.alibaba.security.realidentity.algo.wrapper.entity.result.ABImageResult;
import com.alibaba.security.realidentity.algo.wrapper.entity.result.ALBiometricsResult;
import com.alibaba.security.realidentity.biz.config.RPBizConfig;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;

/* loaded from: classes3.dex */
public class m0 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int i = 1;

    /* renamed from: a  reason: collision with root package name */
    public final Context f3463a;
    public final RPBizConfig b;
    public final y c;
    public final d0 d;
    public long e = -1;
    public int f = 0;
    public boolean g = false;
    public ALBiometricsResult h;

    public m0(Context context, RPBizConfig rPBizConfig, i0 i0Var, y yVar) {
        this.f3463a = context;
        this.c = yVar;
        this.b = rPBizConfig;
        this.d = new d0(i0Var);
    }

    public Message a(int i2, Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Message) ipChange.ipc$dispatch("bab02992", new Object[]{this, new Integer(i2), obj}) : this.d.a(i2, obj);
    }

    public void b(int i2, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf718196", new Object[]{this, new Integer(i2), obj});
        } else {
            this.d.l(a(i2, obj));
        }
    }

    public final boolean b(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9d66c3e", new Object[]{this, new Integer(i2)})).booleanValue();
        }
        if (i2 != -10407 && i2 != -10405 && i2 != -10217 && i2 != -10207 && i2 != -10106 && i2 != -10100 && i2 != -10205 && i2 != -10204) {
            switch (i2) {
                case e2.P /* -10212 */:
                case e2.O /* -10211 */:
                case e2.N /* -10210 */:
                case e2.M /* -10209 */:
                    break;
                default:
                    switch (i2) {
                        case e2.G /* -10202 */:
                        case e2.F /* -10201 */:
                        case e2.E /* -10200 */:
                            break;
                        default:
                            return false;
                    }
            }
        }
        return true;
    }

    public final boolean c(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ab8b44dd", new Object[]{this, new Integer(i2)})).booleanValue();
        }
        if (i2 != -10219 && i2 != 1004 && i2 != 1013 && i2 != 1060 && i2 != 1090 && i2 != 1001 && i2 != 1002) {
            switch (i2) {
                case e2.S /* -10215 */:
                case e2.R /* -10214 */:
                case e2.Q /* -10213 */:
                    break;
                default:
                    switch (i2) {
                        case 1006:
                        case 1007:
                        case 1008:
                            break;
                        default:
                            switch (i2) {
                                case 1053:
                                case w.m /* 1054 */:
                                case 1055:
                                    break;
                                default:
                                    return false;
                            }
                    }
            }
        }
        return true;
    }

    public boolean c(b0 b0Var) {
        byte[] e;
        byte[] e2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6cdfc48a", new Object[]{this, b0Var})).booleanValue();
        }
        try {
            if (this.b.getBiometricsConfig().isLessImageMode) {
                e = b0Var.g();
                this.h.qualityImage.setLandmarks(b0Var.h());
            } else {
                e = b0Var.e();
                this.h.qualityImage.setLandmarks(b0Var.f());
            }
            if (e == null) {
                return false;
            }
            d(this.h, e);
            if (this.b.getBiometricsConfig().needOriginalImage && (e2 = b0Var.e()) != null) {
                c(this.h, e2);
            }
            if (b0Var.c() != null) {
                this.h.qualityImage.setFaceRect(new int[]{b0Var.c().left, b0Var.c().top, b0Var.c().width(), b0Var.c().height()});
            }
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public Message d(int i2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Message) ipChange.ipc$dispatch("9d0e5d31", new Object[]{this, new Integer(i2)}) : this.d.a(i2);
    }

    public boolean e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[]{this})).booleanValue() : this.b.getBiometricsConfig().reflectILThreshold > 0 && ((double) this.c.m()) >= -0.1d && this.c.m() < ((float) this.b.getBiometricsConfig().reflectILThreshold);
    }

    public void f(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0a9ceb6", new Object[]{this, new Integer(i2)});
        } else {
            this.d.l(d(i2));
        }
    }

    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putAll(a(0));
        b(13, new g0(0, bundle));
    }

    public void a(byte[] bArr, int i2, int i3, int i4) {
        int i5;
        Bundle b;
        byte[] byteArray;
        IpChange ipChange = $ipChange;
        int i6 = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1ecb514", new Object[]{this, bArr, new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        try {
            if (this.c == null || !this.g || this.f >= this.b.getBiometricsConfig().imageCount || (i5 = this.b.getBiometricsConfig().imageCount) > 3) {
                return;
            }
            int i7 = i5 - 1;
            int i8 = this.b.getBiometricsConfig().imageIntervals;
            long j = this.e;
            long j2 = i8;
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis > (i7 * i8) + j + j2) {
                this.g = false;
                return;
            }
            while (i6 < i7) {
                int i9 = i6 + 1;
                int i10 = i7;
                int i11 = i8;
                long j3 = (i9 * i8) + j;
                long j4 = j3 + j2;
                if (currentTimeMillis > j3 && currentTimeMillis < j4 && this.f < i6 + 2 && (b = this.c.b(bArr, i2, i3, i4)) != null && (byteArray = b.getByteArray("img")) != null) {
                    ABImageResult aBImageResult = new ABImageResult();
                    if (a(byteArray, "continue" + i6, aBImageResult)) {
                        this.f++;
                        b(2, aBImageResult);
                        i6 = i9;
                        i7 = i10;
                        i8 = i11;
                    }
                }
                i6 = i9;
                i7 = i10;
                i8 = i11;
            }
        } catch (Throwable unused) {
        }
    }

    public boolean b(b0 b0Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("879e55c9", new Object[]{this, b0Var})).booleanValue();
        }
        try {
            if (this.h.localImage == null) {
                this.h.setLocalImage(new ABImageResult());
            }
            byte[] d = b0Var.d();
            if (d == null) {
                return false;
            }
            b(this.h, d);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public void d(ALBiometricsResult aLBiometricsResult, byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ee58cc1", new Object[]{this, aLBiometricsResult, bArr});
        } else if (bArr == null) {
        } else {
            ABImageResult aBImageResult = this.h.qualityImage;
            if (aBImageResult == null) {
                aBImageResult = new ABImageResult();
            }
            if (!a(bArr, "best", aBImageResult)) {
                return;
            }
            aLBiometricsResult.qualityImage = aBImageResult;
        }
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        this.f = 0;
        this.e = 0L;
        this.g = false;
        c().wipeRetryTime();
        a(ABDetectType.AIMLESS, true, true);
    }

    public void e(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aef4f617", new Object[]{this, new Integer(i2)});
        } else {
            this.f = i2;
        }
    }

    public boolean d() {
        ABImageResult aBImageResult;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue();
        }
        ALBiometricsResult aLBiometricsResult = this.h;
        return (aLBiometricsResult == null || (aBImageResult = aLBiometricsResult.qualityImage) == null || aBImageResult.imagePath == null) ? false : true;
    }

    public void b(ALBiometricsResult aLBiometricsResult, byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a2f5f03", new Object[]{this, aLBiometricsResult, bArr});
        } else if (bArr == null) {
        } else {
            ABImageResult aBImageResult = this.h.localImage;
            if (aBImageResult == null) {
                aBImageResult = new ABImageResult();
            }
            if (!a(bArr, "local", aBImageResult, ".png")) {
                return;
            }
            aLBiometricsResult.setLocalImage(aBImageResult);
        }
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        ALBiometricsResult aLBiometricsResult = new ALBiometricsResult();
        this.h = aLBiometricsResult;
        aLBiometricsResult.beginTime = System.currentTimeMillis();
        this.h.qualityImage = new ABImageResult();
    }

    public void c(ALBiometricsResult aLBiometricsResult, byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec8a75e2", new Object[]{this, aLBiometricsResult, bArr});
        } else if (bArr == null) {
        } else {
            ABImageResult aBImageResult = this.h.originImage;
            if (aBImageResult == null) {
                aBImageResult = new ABImageResult();
            }
            if (!a(bArr, "origin", aBImageResult)) {
                return;
            }
            aLBiometricsResult.setOriginImage(aBImageResult);
        }
    }

    public ALBiometricsResult c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ALBiometricsResult) ipChange.ipc$dispatch("f82df0df", new Object[]{this});
        }
        if (this.h == null) {
            b();
        }
        return this.h;
    }

    public void a(ABDetectType aBDetectType, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da2aaf2b", new Object[]{this, aBDetectType, new Boolean(z), new Boolean(z2)});
            return;
        }
        y yVar = this.c;
        if (yVar == null) {
            return;
        }
        if (z) {
            yVar.a(z2);
        }
        this.c.a(aBDetectType, z2);
    }

    public boolean a(b0 b0Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a25ce708", new Object[]{this, b0Var})).booleanValue();
        }
        try {
            if (this.h.globalImage == null) {
                this.h.setGlobalImage(new ABImageResult());
            }
            byte[] b = b0Var.b();
            if (b == null) {
                return false;
            }
            a(this.h, b);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public void a(ALBiometricsResult aLBiometricsResult, byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27d44824", new Object[]{this, aLBiometricsResult, bArr});
        } else if (bArr == null) {
        } else {
            ABImageResult aBImageResult = this.h.globalImage;
            if (aBImageResult == null) {
                aBImageResult = new ABImageResult();
            }
            if (!a(bArr, "global", aBImageResult, ".png")) {
                return;
            }
            aLBiometricsResult.setGlobalImage(aBImageResult);
        }
    }

    public boolean a(byte[] bArr, String str, ABImageResult aBImageResult) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("cd2fc38e", new Object[]{this, bArr, str, aBImageResult})).booleanValue() : a(bArr, str, aBImageResult, ".jpeg");
    }

    public boolean a(byte[] bArr, String str, ABImageResult aBImageResult, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a882ded8", new Object[]{this, bArr, str, aBImageResult, str2})).booleanValue();
        }
        aBImageResult.imageBuffer = bArr;
        String str3 = this.f3463a.getFilesDir().toString() + File.separator + (i.a(str) + str2);
        boolean a2 = f.a(new File(str3), bArr);
        aBImageResult.imagePath = str3;
        return a2;
    }

    public boolean a(b0 b0Var, ABActionResult aBActionResult, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e54104d7", new Object[]{this, b0Var, aBActionResult, new Integer(i2)})).booleanValue();
        }
        try {
            aBActionResult.imageList.clear();
            for (int i3 = 0; i3 < 2; i3++) {
                ABImageResult aBImageResult = new ABImageResult();
                byte[] c = b0Var.i().get(i3).c();
                if (a(c, "action_" + i2 + "_" + i3, aBImageResult)) {
                    aBActionResult.addImageResult(aBImageResult);
                }
            }
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public int a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[]{this})).intValue() : !e() ? 1060 : 0;
    }

    public void a(int i2, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c777bd59", new Object[]{this, new Integer(i2), bundle});
            return;
        }
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            bundle2.putAll(bundle);
        }
        bundle2.putAll(a(i2));
        bundle2.putInt(u.b, i2);
        b(13, new g0(1, bundle2));
    }

    private Bundle a(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bundle) ipChange.ipc$dispatch("feee5f9f", new Object[]{this, new Integer(i2)});
        }
        Bundle bundle = new Bundle();
        long currentTimeMillis = System.currentTimeMillis();
        ALBiometricsResult aLBiometricsResult = this.h;
        if (aLBiometricsResult != null) {
            aLBiometricsResult.endTime = currentTimeMillis;
            aLBiometricsResult.biometricsResult = i2;
            bundle.putSerializable(u.f3525a, aLBiometricsResult);
        }
        return bundle;
    }

    public void a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821975c", new Object[]{this, new Long(j)});
        } else {
            this.e = j;
        }
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.g = z;
        }
    }
}
