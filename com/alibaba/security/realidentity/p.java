package com.alibaba.security.realidentity;

import android.graphics.Rect;
import android.util.Base64;
import com.alibaba.security.realidentity.algo.jni.ALBiometricsJni;
import com.alibaba.security.realidentity.algo.wrapper.entity.ABJniDetectType;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class p extends t {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String b = "p";
    public static final int c = 1;
    public static final int d = 4;
    public static final int e = 8;
    public static final int f = 9;
    public static final int g = 50;
    public static final int h = 88;
    public static final int i = 1;
    public static final int j = 6;
    public static final int k = 36;

    /* renamed from: a  reason: collision with root package name */
    public final ALBiometricsJni f3482a = new ALBiometricsJni();

    public int a(int i2, int i3, int i4, String str, String str2, String str3, String str4, String str5, int i5) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("3c358329", new Object[]{this, new Integer(i2), new Integer(i3), new Integer(i4), str, str2, str3, str4, str5, new Integer(i5)})).intValue() : this.f3482a.init(i2, i3, i4, str, str2, str3, str4, str5, i5);
    }

    public int b(byte[] bArr, a0 a0Var, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8de7bc88", new Object[]{this, bArr, a0Var, str})).intValue();
        }
        float[] fArr = new float[36];
        int[] iArr = new int[6];
        byte[][] bArr2 = new byte[1];
        int doDetectContinueJni = this.f3482a.doDetectContinueJni(bArr, fArr, iArr, bArr2, String.valueOf(System.currentTimeMillis()), str);
        if (doDetectContinueJni != 0) {
            return doDetectContinueJni;
        }
        if (bArr2[0] != null) {
            a0Var.f3351a = true;
            a0Var.O = bArr2[0];
            a0Var.M = iArr[0];
            a0Var.N = iArr[1];
            a0Var.P = iArr[2];
            a0Var.Q = iArr[3];
            a0Var.R = iArr[4];
            a0Var.S = iArr[5];
            System.arraycopy(fArr, 0, a0Var.c, 0, 36);
        } else {
            a0Var.f3351a = false;
        }
        return doDetectContinueJni;
    }

    public int a(int i2, float f2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5c114778", new Object[]{this, new Integer(i2), new Float(f2)})).intValue() : this.f3482a.setParameter(i2, f2);
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : this.f3482a.isEnabled();
    }

    public int a(boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a821d35f", new Object[]{this, new Boolean(z)})).intValue() : this.f3482a.reset(z);
    }

    public int a(ABJniDetectType aBJniDetectType, boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("bb43f076", new Object[]{this, aBJniDetectType, new Boolean(z)})).intValue() : this.f3482a.changeDetectTypeJni(aBJniDetectType.getValue(), z);
    }

    public int a(byte[] bArr, a0 a0Var, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9a583847", new Object[]{this, bArr, a0Var, str})).intValue();
        }
        boolean[] zArr = new boolean[9];
        float[] fArr = new float[88];
        int[] iArr = new int[50];
        long[] jArr = new long[1];
        byte[][] bArr2 = new byte[8];
        byte[][] bArr3 = new byte[4];
        fArr[0] = a0Var.g0;
        fArr[1] = a0Var.h0;
        int doDetectJni = this.f3482a.doDetectJni(bArr, zArr, fArr, iArr, jArr, bArr2, bArr3, String.valueOf(System.currentTimeMillis()), str);
        if (doDetectJni != 0) {
            return doDetectJni;
        }
        a0Var.f3351a = zArr[0];
        a0Var.k = zArr[1];
        a0Var.l = zArr[2];
        a0Var.m = zArr[3];
        a0Var.n = zArr[4];
        a0Var.F = zArr[5];
        a0Var.G = zArr[6];
        a0Var.H = zArr[7];
        a0Var.I = zArr[8];
        System.arraycopy(fArr, 0, a0Var.b, 0, 36);
        a0Var.o = fArr[36];
        a0Var.p = fArr[37];
        a0Var.q = fArr[38];
        a0Var.r = fArr[39];
        a0Var.s = fArr[40];
        a0Var.t = fArr[41];
        a0Var.u = fArr[42];
        a0Var.v = fArr[43];
        a0Var.w = fArr[44];
        a0Var.x = fArr[45];
        a0Var.y = fArr[46];
        a0Var.z = fArr[51];
        a0Var.e = jArr[0];
        a0Var.f = iArr[0];
        a0Var.g = iArr[1];
        a0Var.h = iArr[2];
        a0Var.i = iArr[3];
        a0Var.j = iArr[4];
        a0Var.A = iArr[5];
        a0Var.B = iArr[6];
        a0Var.C = iArr[7];
        a0Var.D = iArr[8];
        a0Var.E = iArr[9];
        a0Var.J = iArr[10];
        a0Var.d = new Rect(iArr[25], iArr[26], iArr[25] + iArr[27], iArr[26] + iArr[28]);
        a0Var.K = iArr[11];
        a0Var.L = iArr[12];
        if (bArr2[0] != null) {
            a0Var.O = bArr2[0];
            a0Var.M = iArr[13];
            a0Var.N = iArr[14];
            a0Var.P = iArr[19];
            a0Var.Q = iArr[20];
            a0Var.R = iArr[21];
            a0Var.S = iArr[22];
            System.arraycopy(fArr, 52, a0Var.c, 0, 36);
        }
        if (bArr2[1] != null && bArr2[2] != null) {
            a0Var.b0 = r2;
            byte[][] bArr4 = {bArr2[1], bArr2[2]};
            a0Var.Z = iArr[15];
            a0Var.a0 = iArr[16];
        }
        if (bArr2[3] != null) {
            a0Var.V = bArr2[3];
            a0Var.T = iArr[17];
            a0Var.U = iArr[18];
        }
        if (bArr2[4] != null) {
            a0Var.Y = bArr2[4];
            a0Var.W = iArr[17];
            a0Var.X = iArr[18];
        }
        if (bArr2[5] != null) {
            a0Var.e0 = bArr2[5];
            a0Var.c0 = iArr[23];
            a0Var.d0 = iArr[24];
        }
        if (bArr3[0] != null) {
            a0Var.f0 = new String(bArr3[0]);
        }
        a0Var.m0 = iArr[39];
        a0Var.n0 = iArr[40];
        a0Var.o0 = iArr[41];
        a0Var.p0 = iArr[42];
        a0Var.k0 = bArr2[6];
        a0Var.l0 = bArr2[7];
        a0Var.q0 = iArr[43];
        a0Var.r0 = iArr[44];
        a0Var.s0 = iArr[45];
        if (bArr3[1] != null) {
            a0Var.j0 = new String(bArr3[1]);
        }
        if (bArr3[2] != null) {
            a0Var.i0 = new String(bArr3[2]);
        }
        if (bArr3[3] != null) {
            a0Var.t0 = Base64.encodeToString(bArr3[3], 2);
        }
        return doDetectJni;
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else {
            this.f3482a.release();
        }
    }
}
