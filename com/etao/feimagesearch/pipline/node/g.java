package com.etao.feimagesearch.pipline.node;

import android.graphics.Bitmap;
import android.graphics.RectF;
import android.os.SystemClock;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import tb.crj;
import tb.crl;
import tb.crp;
import tb.crq;
import tb.kge;

/* loaded from: classes3.dex */
public final class g extends crj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private boolean f6945a;
    private boolean b;
    private boolean c;
    private RectF d;
    private volatile int e;
    private int f;
    private Bitmap.CompressFormat g;

    static {
        kge.a(-1401704208);
    }

    public g() {
        this(false, false, null, 0, 0, 31, null);
    }

    public static /* synthetic */ Object ipc$super(g gVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // tb.crj
    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : "ImageProcess";
    }

    public /* synthetic */ g(boolean z, boolean z2, RectF rectF, int i, int i2, int i3, o oVar) {
        this((i3 & 1) != 0 ? true : z, (i3 & 2) == 0 ? z2 : true, (i3 & 4) != 0 ? null : rectF, (i3 & 8) != 0 ? 70 : i, (i3 & 16) != 0 ? 0 : i2);
    }

    public g(boolean z, boolean z2, RectF rectF, int i, int i2) {
        this.b = z;
        this.c = z2;
        this.d = rectF;
        this.e = i;
        this.f = i2;
        this.g = Bitmap.CompressFormat.JPEG;
    }

    @Override // tb.crj
    public crl b(crq pipLineDS) {
        Bitmap b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (crl) ipChange.ipc$dispatch("45632432", new Object[]{this, pipLineDS});
        }
        q.c(pipLineDS, "pipLineDS");
        Bitmap d = pipLineDS.d();
        if (d == null) {
            a(-8, "需要处理的图片资源不存在");
            if (pipLineDS.t()) {
                return a((Object) null);
            }
            return crj.a(this, -8, "需要处理的图片资源不存在", false, 4, null);
        }
        this.f6945a = pipLineDS.k();
        a(this.f6945a);
        com.etao.feimagesearch.newresult.perf.a.c(this.e);
        com.etao.feimagesearch.newresult.perf.a.d(this.f);
        com.etao.feimagesearch.newresult.perf.a.d(this.g.toString());
        StringBuilder sb = new StringBuilder();
        sb.append(this.f);
        sb.append('_');
        sb.append(this.e);
        sb.append('_');
        sb.append(this.g);
        a("resizeConfig", sb.toString());
        if (this.b && (b = com.etao.feimagesearch.util.d.b(d, this.f)) != null) {
            pipLineDS.b(b);
            d = b;
        }
        String a2 = a(pipLineDS, d);
        pipLineDS.c(a2);
        RectF rectF = this.d;
        if (rectF != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append((int) (rectF.left * d.getWidth()));
            sb2.append(',');
            sb2.append((int) (rectF.right * d.getWidth()));
            sb2.append(',');
            sb2.append((int) (rectF.top * d.getHeight()));
            sb2.append(',');
            sb2.append((int) (rectF.bottom * d.getHeight()));
            pipLineDS.b(sb2.toString());
        }
        d();
        com.etao.feimagesearch.newresult.perf.a.h(Long.valueOf(a2.length()));
        com.etao.feimagesearch.newresult.perf.a.g(Long.valueOf(SystemClock.elapsedRealtime() - b()));
        return a(new crp(a2, new Integer[]{Integer.valueOf(d.getWidth()), Integer.valueOf(d.getHeight())}));
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void a(boolean r13) {
        /*
            r12 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.etao.feimagesearch.pipline.node.g.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 0
            r3 = 2
            if (r1 == 0) goto L1a
            java.lang.Object[] r1 = new java.lang.Object[r3]
            r1[r2] = r12
            r2 = 1
            java.lang.Boolean r3 = new java.lang.Boolean
            r3.<init>(r13)
            r1[r2] = r3
            java.lang.String r13 = "a821d36c"
            r0.ipc$dispatch(r13, r1)
            return
        L1a:
            int r0 = com.etao.feimagesearch.config.b.cd()
            java.lang.String r1 = com.etao.feimagesearch.config.b.da()
            r4 = 640(0x280, float:8.97E-43)
            r5 = 70
            if (r1 != 0) goto L29
            goto L56
        L29:
            int r6 = r1.hashCode()
            r7 = 2716(0xa9c, float:3.806E-42)
            if (r6 == r7) goto L47
            r7 = 2717(0xa9d, float:3.807E-42)
            if (r6 == r7) goto L36
            goto L56
        L36:
            java.lang.String r6 = "V3"
            boolean r1 = r1.equals(r6)
            if (r1 == 0) goto L56
            android.graphics.Bitmap$CompressFormat r1 = android.graphics.Bitmap.CompressFormat.WEBP
            r12.g = r1
            r1 = 85
            r12.e = r1
            goto L5c
        L47:
            java.lang.String r6 = "V2"
            boolean r1 = r1.equals(r6)
            if (r1 == 0) goto L56
            android.graphics.Bitmap$CompressFormat r1 = android.graphics.Bitmap.CompressFormat.WEBP
            r12.g = r1
            r12.e = r5
            goto L5c
        L56:
            android.graphics.Bitmap$CompressFormat r1 = android.graphics.Bitmap.CompressFormat.JPEG
            r12.g = r1
            r12.e = r5
        L5c:
            if (r13 == 0) goto L9f
            java.lang.String r13 = com.etao.feimagesearch.config.b.c()
            java.lang.String r1 = "ConfigModel.getScreenShotSizeConfig()"
            kotlin.jvm.internal.q.a(r13, r1)
            r6 = r13
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            java.lang.String r13 = "_"
            java.lang.String[] r7 = new java.lang.String[]{r13}
            r8 = 0
            r9 = 0
            r10 = 6
            r11 = 0
            java.util.List r13 = kotlin.text.n.b(r6, r7, r8, r9, r10, r11)
            int r1 = r13.size()
            r6 = 3
            if (r1 >= r6) goto L84
            r12.f = r4
            r12.e = r0
            return
        L84:
            java.lang.Object r0 = r13.get(r2)
            java.lang.String r0 = (java.lang.String) r0
            r1 = 1200(0x4b0, float:1.682E-42)
            int r0 = com.taobao.android.searchbaseframe.util.g.b(r0, r1)
            r12.f = r0
            java.lang.Object r13 = r13.get(r3)
            java.lang.String r13 = (java.lang.String) r13
            int r13 = com.taobao.android.searchbaseframe.util.g.b(r13, r5)
            r12.e = r13
            return
        L9f:
            r12.f = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etao.feimagesearch.pipline.node.g.a(boolean):void");
    }

    private final String a(crq crqVar, Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("df5ec268", new Object[]{this, crqVar, bitmap});
        }
        if (!this.c || bitmap == null) {
            return "";
        }
        String a2 = com.etao.feimagesearch.util.d.a(bitmap, this.g, this.e);
        if (a2 == null) {
            a2 = "";
        }
        int ao = com.etao.feimagesearch.config.b.ao();
        if (this.f6945a && a2.length() > ao) {
            float length = ao / a2.length();
            a("triggerSecondaryResize", "resizeScale:" + length);
            bitmap = com.etao.feimagesearch.util.d.b(bitmap, (int) (((float) this.f) * length));
            a2 = com.etao.feimagesearch.util.d.a(bitmap, this.g, this.e);
            if (a2 == null) {
                a2 = "";
            }
        }
        if (bitmap != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(bitmap.getWidth());
            sb.append('_');
            sb.append(bitmap.getHeight());
            String sb2 = sb.toString();
            a("resizeImgSize", sb2);
            com.etao.feimagesearch.newresult.perf.a.c(sb2);
            crqVar.b(bitmap);
        }
        a("base64Size", String.valueOf(a2.length()));
        return a2;
    }
}
