package com.alibaba.security.realidentity;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.text.TextUtils;
import com.alibaba.security.realidentity.algo.wrapper.entity.ABJniDetectState;
import com.alibaba.security.realidentity.algo.wrapper.entity.ABJniDetectType;
import com.alibaba.security.realidentity.algo.wrapper.entity.ABJniFailReason;
import com.alibaba.security.realidentity.algo.wrapper.entity.ABJniPromptMessage;
import com.alibaba.security.realidentity.algo.wrapper.entity.detector.ABDetectType;
import com.alibaba.security.realidentity.biz.config.RPBizConfig;
import com.alibaba.security.realidentity.service.track.model.TrackLog;
import com.alibaba.security.realidentity.ui.webview.jsbridge.BaseJsExecutor;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public class y extends b0 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String A = "ldClassifier.bin";
    public static final String B = "faceContinuity.bin";
    public static final String[] C = {"fdmodel.bin", "ldmodel.bin", "ldClassifier.bin", "faceContinuity.bin"};
    public static final String w = "y";
    public static final int x = 5;
    public static final String y = "fdmodel.bin";
    public static final String z = "ldmodel.bin";
    public final u4 b;
    public final t0 c;
    public Context d;
    public String e;
    public ABDetectType f;
    public ArrayList<c0> g;
    public byte[] h;
    public float[] i;
    public Rect j;
    public byte[] k;
    public byte[] l;
    public byte[] m;
    public float[] n;
    public boolean o;
    public b p;
    public int q = 0;
    public int r = 0;
    public int s = 0;
    public float t = -1.0f;
    public final p u = new p();
    public RPBizConfig v;

    /* loaded from: classes3.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public byte[] f3602a;
        public float b;
        public float c;
        public boolean d;
        public boolean e;

        public b() {
        }

        public void a(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            } else {
                this.d = z;
            }
        }

        public void b(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
            } else {
                this.e = z;
            }
        }

        public float c() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5889b5a", new Object[]{this})).floatValue() : this.b;
        }

        public boolean d() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue() : this.d;
        }

        public boolean e() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[]{this})).booleanValue() : this.e;
        }

        public void a(byte[] bArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c19672f", new Object[]{this, bArr});
            } else {
                this.f3602a = bArr;
            }
        }

        public byte[] b() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (byte[]) ipChange.ipc$dispatch("a9d5fa14", new Object[]{this}) : this.f3602a;
        }

        public float a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c58", new Object[]{this})).floatValue() : this.c;
        }

        public void b(float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a9d660f7", new Object[]{this, new Float(f)});
            } else {
                this.b = f;
            }
        }

        public void a(float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a8218858", new Object[]{this, new Float(f)});
            } else {
                this.c = f;
            }
        }
    }

    public y(t0 t0Var, u4 u4Var) {
        this.c = t0Var;
        this.b = u4Var;
    }

    private boolean b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9eca1003", new Object[]{this, context})).booleanValue();
        }
        for (String str : C) {
            if (!f.b(context, str)) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ Object ipc$super(y yVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    private a0 l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a0) ipChange.ipc$dispatch("8ddf099e", new Object[]{this});
        }
        a0 a0Var = new a0();
        a0Var.h0 = this.t;
        return a0Var;
    }

    @Override // com.alibaba.security.realidentity.b0
    public boolean a(Context context, RPBizConfig rPBizConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4c542848", new Object[]{this, context, rPBizConfig})).booleanValue();
        }
        if (!m.k()) {
            a(e2.f, "");
            return false;
        }
        this.v = rPBizConfig;
        this.d = context;
        this.g = new ArrayList<>();
        this.e = context.getFilesDir() + "/flm/";
        if (b(context)) {
            f.b(this.e);
            String a2 = a(context);
            if (!TextUtils.isEmpty(a2)) {
                a(e2.K, a2);
                return false;
            }
        }
        o.b().a(4, (Map<String, Object>) null);
        this.o = true;
        this.q = 0;
        this.r = 0;
        this.s = 0;
        this.u.b();
        return this.o;
    }

    @Override // com.alibaba.security.realidentity.b0
    public Rect c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Rect) ipChange.ipc$dispatch("61daa133", new Object[]{this}) : this.j;
    }

    @Override // com.alibaba.security.realidentity.b0
    public byte[] d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("ad3fab52", new Object[]{this});
        }
        if (this.o) {
            return this.l;
        }
        return null;
    }

    @Override // com.alibaba.security.realidentity.b0
    public byte[] e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("aef483f1", new Object[]{this});
        }
        if (this.o) {
            return this.m;
        }
        return null;
    }

    @Override // com.alibaba.security.realidentity.b0
    public float[] f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (float[]) ipChange.ipc$dispatch("b0a95c94", new Object[]{this}) : this.n;
    }

    @Override // com.alibaba.security.realidentity.b0
    public byte[] g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("b25e352f", new Object[]{this});
        }
        if (this.o) {
            return this.h;
        }
        return null;
    }

    @Override // com.alibaba.security.realidentity.b0
    public float[] h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (float[]) ipChange.ipc$dispatch("b4130dd2", new Object[]{this}) : this.i;
    }

    @Override // com.alibaba.security.realidentity.b0
    public ArrayList<c0> i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("cc8f744a", new Object[]{this});
        }
        if (this.o) {
            return this.g;
        }
        return null;
    }

    @Override // com.alibaba.security.realidentity.b0
    public boolean j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5eb3ff5", new Object[]{this})).booleanValue() : this.o && this.u.a();
    }

    @Override // com.alibaba.security.realidentity.b0
    public void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f95772", new Object[]{this});
            return;
        }
        this.g = null;
        if (!this.o) {
            return;
        }
        this.u.b();
    }

    public float m() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6158664", new Object[]{this})).floatValue() : this.t;
    }

    @Override // com.alibaba.security.realidentity.b0
    public byte[] b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("a9d5fa14", new Object[]{this});
        }
        if (this.o) {
            return this.k;
        }
        return null;
    }

    @Override // com.alibaba.security.realidentity.b0
    public Bundle b(byte[] bArr, int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bundle) ipChange.ipc$dispatch("68ec7c37", new Object[]{this, bArr, new Integer(i), new Integer(i2), new Integer(i3)});
        }
        try {
            if (!this.o) {
                return null;
            }
            if ((this.u.a() && (i != this.q || i2 != this.r || i3 != this.s)) || !this.u.a()) {
                return null;
            }
            a0 a0Var = new a0();
            if (this.u.b(bArr, a0Var, this.v.getBasicsConfig().umidToken) != 0 || !a0Var.f3351a) {
                return null;
            }
            Bundle bundle = new Bundle();
            if (a0Var.O != null) {
                bundle.putByteArray("img", a0Var.O);
            }
            bundle.putInt("width", a0Var.M);
            bundle.putInt("height", a0Var.N);
            bundle.putIntArray("rect", new int[]{a0Var.P, a0Var.Q, a0Var.R, a0Var.S});
            if (a0Var.c != null) {
                bundle.putFloatArray("landmarks", a0Var.c);
            }
            return bundle;
        } catch (Throwable th) {
            com.alibaba.security.realidentity.a.a(w, th);
            return null;
        }
    }

    private String a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bbc5dc40", new Object[]{this, context});
        }
        ArrayList arrayList = new ArrayList();
        if (!a(context, "fdmodel.bin", this.e + "fdmodel.bin")) {
            return "fdmodel.bin";
        }
        arrayList.add("fdmodel.bin");
        if (!a(context, "ldmodel.bin", this.e + "ldmodel.bin")) {
            return "ldmodel.bin";
        }
        arrayList.add("ldmodel.bin");
        if (!a(context, "ldClassifier.bin", this.e + "ldClassifier.bin")) {
            return "ldClassifier.bin";
        }
        arrayList.add("ldClassifier.bin");
        if (!a(context, "faceContinuity.bin", this.e + "faceContinuity.bin")) {
            return "faceContinuity.bin";
        }
        arrayList.add("faceContinuity.bin");
        return null;
    }

    private boolean a(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d18de978", new Object[]{this, context, str, str2})).booleanValue() : f.a(context, str, str2);
    }

    private void a(TrackLog trackLog) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6099b195", new Object[]{this, trackLog});
            return;
        }
        l0 l0Var = this.f3364a;
        if (l0Var == null) {
            return;
        }
        l0Var.a(trackLog);
    }

    @Override // com.alibaba.security.realidentity.b0
    public void a(boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z2)});
        } else if (!this.o) {
        } else {
            this.u.a(z2);
        }
    }

    @Override // com.alibaba.security.realidentity.b0
    public void a(ABDetectType aBDetectType, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7099cc9", new Object[]{this, aBDetectType, new Boolean(z2)});
        } else if (!this.o) {
        } else {
            this.f = aBDetectType;
            if (!this.u.a()) {
                return;
            }
            this.u.a(a(aBDetectType), z2);
        }
    }

    @Override // com.alibaba.security.realidentity.b0
    public ABDetectType a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ABDetectType) ipChange.ipc$dispatch("1bd4bcab", new Object[]{this}) : this.f;
    }

    @Override // com.alibaba.security.realidentity.b0
    public boolean a(byte[] bArr, int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b1ecb518", new Object[]{this, bArr, new Integer(i), new Integer(i2), new Integer(i3)})).booleanValue();
        }
        if (!this.o || !a(i, i2, i3)) {
            return false;
        }
        if (!this.u.a()) {
            a(e2.G, "");
            return false;
        }
        this.c.Q();
        a0 l = l();
        int a2 = this.u.a(bArr, l, this.v.getBasicsConfig().umidToken);
        if (a2 != 0) {
            a(e2.H, a2 + " " + l.toString());
            return false;
        }
        return a(bArr, i, i2, i3, l);
    }

    private boolean a(int i, int i2, int i3) {
        int i4;
        int i5;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2619793f", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)})).booleanValue();
        }
        p pVar = this.u;
        if (!pVar.a()) {
            pVar.a(1, 0.1f);
            pVar.a(2, 0.1f);
            pVar.a(3, 0.9f);
            pVar.a(4, 0.8f);
            if (this.v.getBiometricsConfig().isLessImageMode) {
                pVar.a(26, this.v.getBiometricsConfig().bigImageSize);
            }
            float f = 1.0f;
            pVar.a(37, this.v.getBiometricsConfig().isDetectWrongAction ? 1.0f : 0.0f);
            if (!this.v.getBiometricsConfig().isDetectOcclusion) {
                f = 0.0f;
            }
            pVar.a(38, f);
            if (this.v.getBiometricsConfig().bgDetectTimeIntervals >= 0) {
                pVar.a(39, this.v.getBiometricsConfig().bgDetectTimeIntervals);
            }
            if (this.v.getBiometricsConfig().bgDetectColorThreshold >= 0) {
                pVar.a(40, this.v.getBiometricsConfig().bgDetectColorThreshold);
            }
            int a2 = pVar.a(i, i2, i3, this.e + "fdmodel.bin", this.e + "ldmodel.bin", this.e + "ldClassifier.bin", this.e + "faceContinuity.bin", this.v.getBiometricsConfig().secToken, this.v.getBiometricsType());
            HashMap hashMap = new HashMap();
            hashMap.put("width", Integer.valueOf(i));
            hashMap.put("height", Integer.valueOf(i2));
            hashMap.put("rotation", Integer.valueOf(i3));
            hashMap.put("fdPath", this.e + "fdmodel.bin");
            hashMap.put("ldPath", this.e + "ldmodel.bin");
            hashMap.put("ldClaPath", this.e + "ldClassifier.bin");
            hashMap.put("fcPath", this.e + "faceContinuity.bin");
            hashMap.put("errorCode", Integer.valueOf(a2));
            hashMap.put(BaseJsExecutor.NAME_VERIFY_TOKEN, this.v.getBiometricsConfig().secToken);
            o.b().a(8, (Map<String, Object>) hashMap);
            if (a2 != 0) {
                a(e2.F, com.alibaba.security.realidentity.b.a((Object) hashMap));
                return false;
            }
            this.q = i;
            i4 = i2;
            this.r = i4;
            i5 = i3;
            this.s = i5;
            a(a(), false);
        } else {
            i4 = i2;
            i5 = i3;
        }
        if (!this.u.a()) {
            return true;
        }
        if (i == this.q && i4 == this.r && i5 == this.s) {
            return true;
        }
        this.u.b();
        return true;
    }

    public void a(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8218858", new Object[]{this, new Float(f)});
        } else {
            this.t = f;
        }
    }

    public y a(Rect rect) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (y) ipChange.ipc$dispatch("4890dc6e", new Object[]{this, rect});
        }
        this.j = rect;
        return this;
    }

    private void a(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20f12ca5", new Object[]{this, new Integer(i), str});
        } else if (this.f3364a == null) {
        } else {
            Bundle bundle = new Bundle();
            bundle.putString(u.c, str);
            this.f3364a.b(i, bundle);
        }
    }

    private boolean a(byte[] bArr, int i, int i2, int i3, a0 a0Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("40ff3733", new Object[]{this, bArr, new Integer(i), new Integer(i2), new Integer(i3), a0Var})).booleanValue();
        }
        if (a0Var == null || this.f3364a == null) {
            return false;
        }
        z zVar = new z(a0Var, bArr, i, i2, i3);
        if (this.v.getDegradeConfig().needCollectLocalImage) {
            a(bArr, a0Var);
            zVar.a(this.p.b());
        }
        if (a0Var.a() == ABJniDetectState.DETECT_STATE_FAIL) {
            Bundle bundle = new Bundle();
            bundle.putString("ecResult", a0Var.t0);
            this.f3364a.c(a(a0Var.d()), bundle);
        } else if (a0Var.a() == ABJniDetectState.DETECT_STATE_SUC) {
            this.h = a0Var.O;
            this.i = a0Var.c;
            this.k = a0Var.V;
            this.l = a0Var.Y;
            this.m = a0Var.e0;
            this.n = a0Var.b;
            int i4 = a0Var.P;
            int i5 = a0Var.Q;
            this.j = new Rect(i4, i5, a0Var.R + i4, a0Var.S + i5);
            this.g.clear();
            this.g.add(new h0(a0Var.b0[0], a0Var.Z, a0Var.a0, 0, 1, a0Var.g0));
            this.g.add(new h0(a0Var.b0[1], a0Var.Z, a0Var.a0, 0, 1, a0Var.g0));
            ABDetectType a2 = this.f3364a.a(zVar, this.f);
            if (a2 != ABDetectType.DONE || a2 != ABDetectType.NONE) {
                a(a2, true);
            }
        } else if (a0Var.a() == ABJniDetectState.DETECT_STATE_DETECTING) {
            a0Var.e().getMessage();
            Bundle bundle2 = new Bundle();
            zVar.a(a(a0Var.e()));
            this.f3364a.a(zVar.i(), bundle2);
        }
        this.f3364a.a(10L, zVar);
        return true;
    }

    private void a(byte[] bArr, a0 a0Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9307d0a", new Object[]{this, bArr, a0Var});
            return;
        }
        b bVar = this.p;
        if (bVar == null) {
            b bVar2 = new b();
            this.p = bVar2;
            bVar2.a(bArr);
            this.p.b(0.0f);
            this.p.a(0.0f);
            this.p.a(false);
            this.p.b(false);
        } else if (!a(bVar, a0Var)) {
        } else {
            this.p.a(bArr);
            this.p.b(a0Var.q);
            this.p.a(a0Var.o);
        }
    }

    private boolean a(b bVar, a0 a0Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a0e0a86", new Object[]{this, bVar, a0Var})).booleanValue();
        }
        if (a0Var != null && bVar != null) {
            if (!bVar.d() && !a0Var.f3351a && bVar.a() < a0Var.o) {
                return true;
            }
            if (a0Var.f3351a) {
                bVar.a(true);
                if (!a0Var.k) {
                    bVar.b(true);
                    return bVar.c() < a0Var.q;
                }
                return !bVar.e();
            }
        }
        return false;
    }

    private ABJniDetectType a(ABDetectType aBDetectType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ABJniDetectType) ipChange.ipc$dispatch("7fb011b4", new Object[]{this, aBDetectType});
        }
        if (aBDetectType == ABDetectType.AIMLESS) {
            return ABJniDetectType.DETECT_TYPE_AIMLESS;
        }
        if (aBDetectType == ABDetectType.BLINK) {
            return ABJniDetectType.DETECT_TYPE_BLINK;
        }
        if (aBDetectType == ABDetectType.POS_PITCH) {
            return ABJniDetectType.DETECT_TYPE_PITCH;
        }
        if (aBDetectType == ABDetectType.POS_PITCH_DOWN) {
            return ABJniDetectType.DETECT_TYPE_PITCH;
        }
        if (aBDetectType == ABDetectType.POS_PITCH_UP) {
            return ABJniDetectType.DETECT_TYPE_PITCH;
        }
        if (aBDetectType == ABDetectType.KEEP_STILL) {
            return ABJniDetectType.DETECT_TYPE_STILL;
        }
        if (aBDetectType == ABDetectType.POS_YAW) {
            return ABJniDetectType.DETECT_TYPE_YAW;
        }
        if (aBDetectType == ABDetectType.MOUTH) {
            return ABJniDetectType.DETECT_TYPE_MOUTH;
        }
        if (aBDetectType == ABDetectType.PITCH_STILL) {
            return ABJniDetectType.DETECT_TYPE_PITCH_STILL;
        }
        if (aBDetectType == ABDetectType.YAW_STILL) {
            return ABJniDetectType.DETECT_TYPE_YAW_STILL;
        }
        if (aBDetectType == ABDetectType.MOUTH_STILL) {
            return ABJniDetectType.DETECT_TYPE_MOUTH_STILL;
        }
        if (aBDetectType == ABDetectType.BLINK_STILL) {
            return ABJniDetectType.DETECT_TYPE_BLINK_STILL;
        }
        return ABJniDetectType.DETECT_TYPE_AIMLESS;
    }

    private int a(ABJniFailReason aBJniFailReason) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f4b19fbf", new Object[]{this, aBJniFailReason})).intValue();
        }
        if (ABJniFailReason.FAIL_ACTION_MOUTH_OCCLUSION.equals(aBJniFailReason)) {
            return 6;
        }
        if (ABJniFailReason.FAIL_ACTION_PITCH_FACE_DISAPPEAR.equals(aBJniFailReason) || ABJniFailReason.FAIL_ACTION_PITCH_FACE_CHANGE.equals(aBJniFailReason) || ABJniFailReason.FAIL_ACTION_YAW_FACE_DISAPPEAR.equals(aBJniFailReason) || ABJniFailReason.FAIL_ACTION_YAW_FACE_CHANGE.equals(aBJniFailReason) || ABJniFailReason.FAIL_ACTION_MOUTH_FACE_DISAPPEAR.equals(aBJniFailReason) || ABJniFailReason.FAIL_ACTION_MOUTH_FACE_CHANGE.equals(aBJniFailReason) || ABJniFailReason.FAIL_ACTION_BLINK_OCCLUSION.equals(aBJniFailReason) || ABJniFailReason.FAIL_ACTION_BLINK_FACE_DISAPPEAR.equals(aBJniFailReason) || ABJniFailReason.FAIL_ACTION_BLINK_FACE_CHANGE.equals(aBJniFailReason)) {
            return 1;
        }
        if (ABJniFailReason.FAIL_ACTION_PITCH_GET_YAW.equals(aBJniFailReason) || ABJniFailReason.FAIL_ACTION_PITCH_GET_MOUTH.equals(aBJniFailReason) || ABJniFailReason.FAIL_ACTION_YAW_GET_PITCH.equals(aBJniFailReason) || ABJniFailReason.FAIL_ACTION_YAW_GET_MOUTH.equals(aBJniFailReason) || ABJniFailReason.FAIL_ACTION_MOUTH_GET_PITCH.equals(aBJniFailReason) || ABJniFailReason.FAIL_ACTION_MOUTH_GET_YAW.equals(aBJniFailReason) || ABJniFailReason.FAIL_ACTION_BLINK_GET_YAW.equals(aBJniFailReason) || ABJniFailReason.FAIL_ACTION_BLINK_GET_MOUTH.equals(aBJniFailReason) || ABJniFailReason.FAIL_ACTION_BLINK_GET_PITCH.equals(aBJniFailReason)) {
            return 0;
        }
        if (ABJniFailReason.FAIL_STILL_TIMEOUT.equals(aBJniFailReason) || ABJniFailReason.FAIL_ACTION_YAW_TIMEOUT.equals(aBJniFailReason) || ABJniFailReason.FAIL_ACTION_MOUTH_TIMEOUT.equals(aBJniFailReason) || ABJniFailReason.FAIL_ACTION_PITCH_TIMEOUT.equals(aBJniFailReason) || ABJniFailReason.FAIL_ACTION_BLINK_TIMEOUT.equals(aBJniFailReason) || ABJniFailReason.FAIL_NO_FACE_DETECT.equals(aBJniFailReason)) {
            return 2;
        }
        if (ABJniFailReason.FAIL_ACTION_PITCH_NOT_3D.equals(aBJniFailReason) || ABJniFailReason.FAIL_ACTION_YAW_NOT_3D.equals(aBJniFailReason)) {
            return 5;
        }
        if (ABJniFailReason.FAIL_NONE.equals(aBJniFailReason)) {
            return -1;
        }
        if (ABJniFailReason.FAIL_STILL_OUT_OF_REGION.equals(aBJniFailReason) || ABJniFailReason.FAIL_STILL_TOO_SMALL.equals(aBJniFailReason) || ABJniFailReason.FAIL_STILL_TOO_BIG.equals(aBJniFailReason) || ABJniFailReason.FAIL_STILL_LIGHT_UNEVEN.equals(aBJniFailReason) || ABJniFailReason.FAIL_STILL_NOT_STILL.equals(aBJniFailReason) || ABJniFailReason.FAIL_STILL_TOO_DARK.equals(aBJniFailReason) || ABJniFailReason.FAIL_STILL_PITCH_TOO_BIG.equals(aBJniFailReason) || ABJniFailReason.FAIL_STILL_YAW_TOO_BIG.equals(aBJniFailReason)) {
            return 2;
        }
        if (aBJniFailReason == null) {
            return -1;
        }
        return aBJniFailReason.getValue();
    }

    private int a(ABJniPromptMessage aBJniPromptMessage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a65790d2", new Object[]{this, aBJniPromptMessage})).intValue();
        }
        if (ABJniPromptMessage.PROMPT_PUT_FACE_IN_REGION.equals(aBJniPromptMessage)) {
            return 1002;
        }
        if (ABJniPromptMessage.PROMPT_MOVE_CLOSE.equals(aBJniPromptMessage)) {
            return 1008;
        }
        if (ABJniPromptMessage.PROMPT_MOVE_FAR.equals(aBJniPromptMessage)) {
            return 1007;
        }
        if (ABJniPromptMessage.PROMPT_FACE_YAW_TOO_BIG.equals(aBJniPromptMessage)) {
            return 1013;
        }
        if (ABJniPromptMessage.PROMPT_FACE_PITCH_TOO_BIG.equals(aBJniPromptMessage)) {
            return w.m;
        }
        if (ABJniPromptMessage.PROMPT_TOO_DARK.equals(aBJniPromptMessage)) {
            return 1001;
        }
        if (ABJniPromptMessage.PROMPT_FACE_UNEVEN.equals(aBJniPromptMessage)) {
            return 1055;
        }
        if (ABJniPromptMessage.PROMPT_KEEP_STILL.equals(aBJniPromptMessage)) {
            return 1004;
        }
        return ABJniPromptMessage.PROMPT_GESTURE_SMALL.equals(aBJniPromptMessage) ? 1053 : 0;
    }
}
