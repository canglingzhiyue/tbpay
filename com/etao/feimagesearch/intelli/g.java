package com.etao.feimagesearch.intelli;

import android.content.Context;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.config.bean.YuvDiffCheckerConfig;
import com.etao.feimagesearch.nn.optimize.OptimizeOutput;
import com.etao.feimagesearch.util.ak;
import com.etao.feimagesearch.util.f;
import java.util.ArrayList;
import tb.cot;
import tb.coy;
import tb.ctf;
import tb.kge;

/* loaded from: classes3.dex */
public class g extends e {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final long r;
    private static final int s;
    private static final float t;
    private static final int u;

    public static /* synthetic */ Object ipc$super(g gVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1862824439:
                super.b(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
                return null;
            case -1481951945:
                super.onDeviceStable();
                return null;
            case -1474178196:
                super.a(((Boolean) objArr[0]).booleanValue());
                return null;
            case -1465072898:
                super.a((byte[]) objArr[0], ((Boolean) objArr[1]).booleanValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue(), ((Number) objArr[4]).intValue());
                return null;
            case -551298290:
                return super.d();
            case -358846778:
                super.a((com.etao.feimagesearch.structure.capture.e) objArr[0]);
                return null;
            case 90991720:
                super.a();
                return null;
            case 91915241:
                super.b();
                return null;
            case 92838762:
                super.c();
                return null;
            case 101150451:
                super.l();
                return null;
            case 365356045:
                super.onDeviceMove();
                return null;
            case 1544639176:
                super.a(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    @Override // com.etao.feimagesearch.intelli.e, com.etao.feimagesearch.intelli.d, com.etao.feimagesearch.structure.capture.g
    public /* bridge */ /* synthetic */ void a() {
        super.a();
    }

    @Override // com.etao.feimagesearch.intelli.e, com.etao.feimagesearch.intelli.d, com.etao.feimagesearch.structure.capture.g
    public /* bridge */ /* synthetic */ void a(int i, int i2) {
        super.a(i, i2);
    }

    @Override // com.etao.feimagesearch.intelli.e, com.etao.feimagesearch.intelli.d, com.etao.feimagesearch.structure.capture.g
    public /* bridge */ /* synthetic */ void a(com.etao.feimagesearch.structure.capture.e eVar) {
        super.a(eVar);
    }

    @Override // com.etao.feimagesearch.intelli.e, com.etao.feimagesearch.intelli.d, com.etao.feimagesearch.structure.capture.g
    public /* bridge */ /* synthetic */ void a(boolean z) {
        super.a(z);
    }

    @Override // com.etao.feimagesearch.intelli.e, com.etao.feimagesearch.intelli.d, com.etao.feimagesearch.structure.capture.g
    public /* bridge */ /* synthetic */ void a(byte[] bArr, boolean z, int i, int i2, int i3) {
        super.a(bArr, z, i, i2, i3);
    }

    @Override // com.etao.feimagesearch.intelli.e, com.etao.feimagesearch.intelli.d, com.etao.feimagesearch.structure.capture.g
    public /* bridge */ /* synthetic */ void b() {
        super.b();
    }

    @Override // com.etao.feimagesearch.intelli.e, com.etao.feimagesearch.intelli.d
    public /* bridge */ /* synthetic */ void b(int i, int i2) {
        super.b(i, i2);
    }

    @Override // com.etao.feimagesearch.intelli.e, com.etao.feimagesearch.intelli.d, com.etao.feimagesearch.structure.capture.g
    public /* bridge */ /* synthetic */ void c() {
        super.c();
    }

    @Override // com.etao.feimagesearch.intelli.e, com.etao.feimagesearch.intelli.d, com.etao.feimagesearch.structure.capture.g
    public /* bridge */ /* synthetic */ FrameLayout d() {
        return super.d();
    }

    @Override // com.etao.feimagesearch.intelli.e
    public /* bridge */ /* synthetic */ void l() {
        super.l();
    }

    @Override // com.etao.feimagesearch.intelli.e, tb.cqi
    public /* bridge */ /* synthetic */ void onDeviceMove() {
        super.onDeviceMove();
    }

    @Override // com.etao.feimagesearch.intelli.e, tb.cqi
    public /* bridge */ /* synthetic */ void onDeviceStable() {
        super.onDeviceStable();
    }

    static {
        kge.a(-258836769);
        r = com.etao.feimagesearch.config.b.cE();
        s = com.etao.feimagesearch.config.b.cF();
        t = com.etao.feimagesearch.config.b.cD();
        u = com.etao.feimagesearch.config.b.cG();
    }

    public g(Context context) {
        super(context, "planB_ManualObjectDetector");
        coy.b(com.etao.feimagesearch.structure.capture.a.f6987a, "startForcedDetect", new String[0]);
    }

    @Override // com.etao.feimagesearch.intelli.e
    public ak g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ak) ipChange.ipc$dispatch("8ee0fe8f", new Object[]{this});
        }
        YuvDiffCheckerConfig cA = com.etao.feimagesearch.config.b.cA();
        return new ak(cA.graySize, s, cA.frameCountThreshold, cA.timeThreshold);
    }

    @Override // com.etao.feimagesearch.intelli.e
    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
        } else {
            this.m.set(true);
        }
    }

    @Override // com.etao.feimagesearch.intelli.e
    public void a(byte[] bArr, int i, int i2, boolean z, int i3, com.etao.feimagesearch.structure.capture.e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1396741c", new Object[]{this, bArr, new Integer(i), new Integer(i2), new Boolean(z), new Integer(i3), eVar});
            return;
        }
        cot.d("planB_ManualObjectDetector", "autoDetectProcess");
        b(true);
        com.etao.feimagesearch.nn.optimize.a aVar = new com.etao.feimagesearch.nn.optimize.a();
        aVar.f6920a = new byte[bArr.length];
        System.arraycopy(bArr, 0, aVar.f6920a, 0, bArr.length);
        aVar.c = i;
        aVar.d = i2;
        aVar.e = this.f;
        aVar.f = this.g;
        aVar.g = this.h;
        aVar.h = this.i;
        aVar.b = z;
        OptimizeOutput a2 = OptimizeOutput.a(new ArrayList(1), new ArrayList(1), ((f.b) com.etao.feimagesearch.util.f.a(aVar.f6920a, aVar.c, aVar.d, i3, aVar.b)).b(aVar.e, aVar.f).a(), 0L, null);
        ctf ctfVar = new ctf("ForcedDetect", "");
        coy.b(com.etao.feimagesearch.structure.capture.a.f6987a, "ForcedDetect", new String[0]);
        a(a2, ctfVar, f());
        eVar.c();
    }

    @Override // com.etao.feimagesearch.intelli.e
    public float i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5dd2860", new Object[]{this})).floatValue() : t;
    }

    @Override // com.etao.feimagesearch.intelli.e
    public long j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5eb3fe5", new Object[]{this})).longValue() : u;
    }

    @Override // com.etao.feimagesearch.intelli.e
    public long k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5f95766", new Object[]{this})).longValue() : r;
    }

    @Override // com.etao.feimagesearch.intelli.d, com.etao.feimagesearch.structure.capture.g
    public ClientModelType f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ClientModelType) ipChange.ipc$dispatch("3c5a970b", new Object[]{this}) : ClientModelType.CLIENT;
    }
}
