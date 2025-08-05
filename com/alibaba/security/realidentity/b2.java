package com.alibaba.security.realidentity;

import android.content.Context;
import com.alibaba.security.realidentity.algo.wrapper.entity.result.ABActionResult;
import com.alibaba.security.realidentity.algo.wrapper.entity.result.ABImageResult;
import com.alibaba.security.realidentity.algo.wrapper.entity.result.ALBiometricsResult;
import com.alibaba.security.realidentity.biz.base.chain.BusinessType;
import com.alibaba.security.realidentity.biz.biometrics.BiometricsBucketParams;
import com.alibaba.security.realidentity.biz.bucket.BucketParams;
import com.alibaba.security.realidentity.biz.config.RPBizConfig;
import com.alibaba.security.realidentity.g4;
import com.alibaba.security.realidentity.i1;
import com.alibaba.security.realidentity.service.track.model.CommonTrackResult;
import com.alibaba.security.realidentity.service.track.model.TrackLog;
import com.alibaba.security.realidentity.y1;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;

/* loaded from: classes3.dex */
public class b2 extends i1 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String g = "10";

    /* loaded from: classes3.dex */
    public class a implements y1.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ long f3366a;
        public final /* synthetic */ a2 b;
        public final /* synthetic */ List c;
        public final /* synthetic */ i1.b d;
        public final /* synthetic */ BiometricsBucketParams e;

        public a(long j, a2 a2Var, List list, i1.b bVar, BiometricsBucketParams biometricsBucketParams) {
            this.f3366a = j;
            this.b = a2Var;
            this.c = list;
            this.d = bVar;
            this.e = biometricsBucketParams;
        }

        @Override // com.alibaba.security.realidentity.y1.b
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                return;
            }
            b2.a(b2.this, TrackLog.createBioMonitorUploadFinishLog(new CommonTrackResult(), true, System.currentTimeMillis() - this.f3366a));
            a2 a2Var = this.b;
            a2Var.e = this.c;
            a2Var.a(0);
            i1.b bVar = this.d;
            if (bVar == null) {
                return;
            }
            bVar.b(this.b, !this.e.i);
        }

        @Override // com.alibaba.security.realidentity.y1.b
        public void onError() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("11bc4f70", new Object[]{this});
                return;
            }
            b2.b(b2.this, TrackLog.createBioMonitorUploadFinishLog(new CommonTrackResult(-1, "uploadFile onError"), false, System.currentTimeMillis() - this.f3366a));
            this.c.clear();
            this.b.a(e2.B);
            i1.b bVar = this.d;
            if (bVar == null) {
                return;
            }
            bVar.a(this.b, true ^ this.e.i);
        }
    }

    public b2(Context context, RPBizConfig rPBizConfig, u4 u4Var) {
        super(context, rPBizConfig, u4Var);
    }

    public static /* synthetic */ void a(b2 b2Var, TrackLog trackLog) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("564344ef", new Object[]{b2Var, trackLog});
        } else {
            b2Var.a(trackLog);
        }
    }

    public static /* synthetic */ void b(b2 b2Var, TrackLog trackLog) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("966e2bb0", new Object[]{b2Var, trackLog});
        } else {
            b2Var.a(trackLog);
        }
    }

    public static /* synthetic */ Object ipc$super(b2 b2Var, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.alibaba.security.realidentity.i1
    public void a(h1 h1Var, i1 i1Var, BucketParams bucketParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d72f582", new Object[]{this, h1Var, i1Var, bucketParams});
        }
    }

    @Override // com.alibaba.security.realidentity.i1
    public void a(h1 h1Var, i1 i1Var, BucketParams bucketParams, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e7ca82cc", new Object[]{this, h1Var, i1Var, bucketParams, str});
        }
    }

    @Override // com.alibaba.security.realidentity.i1
    public String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : g4.b.G;
    }

    @Override // com.alibaba.security.realidentity.i1
    public void b(h1 h1Var, i1 i1Var, BucketParams bucketParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("29afaae1", new Object[]{this, h1Var, i1Var, bucketParams});
        }
    }

    @Override // com.alibaba.security.realidentity.i1
    public String c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bd025a76", new Object[]{this}) : "";
    }

    @Override // com.alibaba.security.realidentity.i1
    public String d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("43881515", new Object[]{this}) : "";
    }

    @Override // com.alibaba.security.realidentity.i1
    public String e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[]{this}) : "";
    }

    @Override // com.alibaba.security.realidentity.i1
    public String f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("50938a53", new Object[]{this}) : "identity";
    }

    @Override // com.alibaba.security.realidentity.i1
    public String g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("d71944f2", new Object[]{this}) : g4.b.F;
    }

    @Override // com.alibaba.security.realidentity.i1
    public boolean h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5cf10f3", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // com.alibaba.security.realidentity.i1
    public void a(h1 h1Var, i1.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("474ec0ed", new Object[]{this, h1Var, bVar});
            return;
        }
        v1 v1Var = h1Var.c;
        BiometricsBucketParams biometricsBucketParams = h1Var.d;
        a2 a2Var = h1Var.e;
        a(TrackLog.createBioMonitorUploadStartLog());
        a(this.f3439a, a2Var, v1Var, biometricsBucketParams, bVar);
    }

    private void a(Context context, a2 a2Var, v1 v1Var, BiometricsBucketParams biometricsBucketParams, i1.b bVar) {
        ABImageResult aBImageResult;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a30b6a9f", new Object[]{this, context, a2Var, v1Var, biometricsBucketParams, bVar});
            return;
        }
        ALBiometricsResult aLBiometricsResult = biometricsBucketParams.h;
        ABImageResult aBImageResult2 = aLBiometricsResult.qualityImage;
        ArrayList arrayList = new ArrayList();
        if (aBImageResult2 != null) {
            arrayList.add(a(f2.f, f2.f, this.d.getOssConfig().path, aBImageResult2.imageBuffer));
        }
        if (v1Var.o) {
            for (int i = 0; i < aLBiometricsResult.actionList.size(); i++) {
                ABActionResult aBActionResult = aLBiometricsResult.actionList.get(i);
                if (aBActionResult != null && aBActionResult.imageList.size() > 0) {
                    List<ABImageResult> list = aBActionResult.imageList;
                    ABImageResult aBImageResult3 = list.get(list.size() - 1);
                    if (aBImageResult3 != null) {
                        arrayList.add(a("action" + i, "action" + i, this.d.getOssConfig().path, aBImageResult3.imageBuffer));
                    }
                }
            }
        }
        if (v1Var.q && (aBImageResult = aLBiometricsResult.originImage) != null) {
            arrayList.add(a(f2.i, f2.i, this.d.getOssConfig().path, aBImageResult.imageBuffer));
        }
        ABImageResult aBImageResult4 = aLBiometricsResult.globalImage;
        if (aBImageResult4 != null) {
            arrayList.add(a(f2.h, f2.h, this.d.getOssConfig().path, aBImageResult4.imageBuffer));
        }
        ABImageResult aBImageResult5 = aLBiometricsResult.localImage;
        if (aBImageResult5 != null) {
            arrayList.add(a(f2.g, f2.g, this.d.getOssConfig().path, aBImageResult5.imageBuffer));
        }
        if (aLBiometricsResult.dazzleVideoPath != null) {
            arrayList.add(new z1(context, this.b, this.d, this.e, aLBiometricsResult.dazzleVideoPath, true, "10", aLBiometricsResult));
        }
        AtomicInteger atomicInteger = new AtomicInteger(arrayList.size());
        AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(new int[arrayList.size()]);
        long currentTimeMillis = System.currentTimeMillis();
        Iterator it = arrayList.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            c2 c2Var = (c2) it.next();
            c2Var.a(atomicInteger);
            c2Var.a(atomicIntegerArray);
            c2Var.a(i2);
            c2Var.b(arrayList.size());
            c2Var.a(new a(currentTimeMillis, a2Var, arrayList, bVar, biometricsBucketParams));
            i2++;
            arrayList = arrayList;
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((c2) it2.next()).execute(v1Var.j);
        }
    }

    private c2 a(String str, String str2, String str3, byte[] bArr) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (c2) ipChange.ipc$dispatch("70b3ed04", new Object[]{this, str, str2, str3, bArr}) : new c2(this.f3439a, this.b, this.d, this.e, str, str2, str3, bArr);
    }

    @Override // com.alibaba.security.realidentity.i1
    public BusinessType a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (BusinessType) ipChange.ipc$dispatch("a3686234", new Object[]{this}) : BusinessType.UPLOADFILE;
    }
}
