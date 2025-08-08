package tb;

import android.graphics.Bitmap;
import android.os.Build;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.pexode.d;
import com.taobao.pexode.e;
import com.taobao.phenix.request.ImageStatistics;
import com.taobao.phenix.request.b;
import com.taobao.tao.messagekit.base.network.AccsConnection;
import java.io.ByteArrayOutputStream;

/* loaded from: classes.dex */
public class nhz extends nmx<njb, njb, b> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(841260542);
    }

    public static /* synthetic */ Object ipc$super(nhz nhzVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public nhz() {
        super(1, 2);
    }

    private Bitmap a(Bitmap bitmap, njd njdVar) {
        int i;
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("8cba00ec", new Object[]{this, bitmap, njdVar});
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (width > height) {
            i2 = njdVar.h;
            i = (height * i2) / width;
        } else {
            i = njdVar.i;
            i2 = (width * i) / height;
        }
        if (width <= i2 && height <= i) {
            niw.b("BitmapProcess", njdVar.c, "skip to scale from large bitmap, target(%d) >= actual(%d)", Integer.valueOf(i2), Integer.valueOf(width));
            return null;
        }
        try {
            niw.a("BitmapProcess", njdVar.c, "scale down from large bitmap, target(%d) < actual(%d)", Integer.valueOf(i2), Integer.valueOf(width));
            return Bitmap.createScaledBitmap(bitmap, i2, i, true);
        } catch (Throwable th) {
            niw.c("BitmapProcess", njdVar.c, "error happen when scaling bitmap, throwable=%s", th);
            return null;
        }
    }

    private byte[] a(b bVar, Bitmap bitmap, njd njdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("9b72912a", new Object[]{this, bVar, bitmap, njdVar});
        }
        nec c = njdVar.c();
        boolean z = Build.VERSION.SDK_INT == 28 && com.taobao.phenix.intf.b.f18927a;
        byte[] bArr = null;
        if (c != null && !z) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(AccsConnection.DATA_PACKAGE_MAX);
            if (neb.PNG.a(c) || neb.PNG_A.a(c)) {
                bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
                bArr = byteArrayOutputStream.toByteArray();
            } else if (neb.JPEG.a(c)) {
                bitmap.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
                bArr = byteArrayOutputStream.toByteArray();
            } else if ((neb.WEBP.a(c) || neb.WEBP_A.a(c)) && d.b(c)) {
                bitmap.compress(Bitmap.CompressFormat.WEBP, 100, byteArrayOutputStream);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                niw.a("BitmapProcess", njdVar.c, "compress target bitmap into webp byte array", new Object[0]);
                if (!neb.WEBP_A.a(c) || neb.WEBP_A.a(byteArray)) {
                    bArr = byteArray;
                } else {
                    niw.c("BitmapProcess", njdVar.c, "lost alpha-channel when compress bitmap[ARGB8888 WebP], API-LEVEL=%d", Integer.valueOf(Build.VERSION.SDK_INT));
                }
            }
        }
        Object[] objArr = new Object[2];
        objArr[0] = Boolean.valueOf(bArr != null);
        objArr[1] = c;
        niw.a("BitmapProcess", bVar, "compress image with bitmap, result=%B, format=%s", objArr);
        return bArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0091  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(tb.nmv<tb.njb, com.taobao.phenix.request.b> r13, tb.njb r14, boolean r15) {
        /*
            r12 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = tb.nhz.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L20
            r1 = 4
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r3] = r12
            r1[r2] = r13
            r13 = 2
            r1[r13] = r14
            r13 = 3
            java.lang.Boolean r14 = new java.lang.Boolean
            r14.<init>(r15)
            r1[r13] = r14
            java.lang.String r13 = "860281c9"
            r0.ipc$dispatch(r13, r1)
            return
        L20:
            java.lang.Object r0 = r13.e()
            com.taobao.phenix.request.b r0 = (com.taobao.phenix.request.b) r0
            tb.njd r1 = r14.b()
            boolean r4 = r0.U()
            r12.b(r13, r15)
            if (r15 != 0) goto L35
            if (r4 == 0) goto L8d
        L35:
            boolean r4 = r14.f()
            if (r4 == 0) goto L8d
            android.graphics.Bitmap r4 = r14.c()
            tb.nia[] r5 = r0.n()
            if (r5 == 0) goto L80
            int r6 = r5.length
            if (r6 <= 0) goto L80
            int r6 = r5.length
            r8 = r4
            r7 = 0
        L4b:
            if (r7 >= r6) goto L6f
            r9 = r5[r7]
            java.lang.String r10 = r0.p()
            tb.nib r11 = tb.nib.a()
            android.graphics.Bitmap r8 = r9.process(r10, r11, r8)
            if (r8 != 0) goto L6c
            r14.h()
            java.lang.Throwable r14 = new java.lang.Throwable
            java.lang.String r15 = "processed result bitmap cannot be null!"
            r14.<init>(r15)
            r13.b(r14)
            return
        L6c:
            int r7 = r7 + 1
            goto L4b
        L6f:
            java.lang.Object[] r6 = new java.lang.Object[r2]
            int r5 = r5.length
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r6[r3] = r5
            java.lang.String r5 = "BitmapProcess"
            java.lang.String r7 = "bitmap processors call, length=%d"
            tb.niw.a(r5, r0, r7, r6)
            goto L81
        L80:
            r8 = r4
        L81:
            if (r4 == r8) goto L8d
            tb.njb r4 = new tb.njb
            tb.njd r5 = r14.b()
            r4.<init>(r5, r8)
            goto L8e
        L8d:
            r4 = r14
        L8e:
            if (r4 == r14) goto L91
            goto L92
        L91:
            r2 = 0
        L92:
            r12.a(r13, r2, r15)
            r13.b(r4, r15)
            com.taobao.phenix.intf.b r14 = com.taobao.phenix.intf.b.h()
            boolean r14 = r14.K()
            if (r14 == 0) goto Lbd
            if (r1 == 0) goto Lbd
            java.lang.Object r13 = r13.e()
            com.taobao.phenix.request.b r13 = (com.taobao.phenix.request.b) r13
            java.lang.String r13 = r13.a()
            tb.dqf r14 = tb.dqf.a()
            java.lang.String r15 = r0.u()
            android.graphics.Bitmap r0 = r4.c()
            r14.a(r13, r15, r0)
        Lbd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.nhz.a(tb.nmv, tb.njb, boolean):void");
    }

    @Override // tb.nmx
    public void a(nmv<njb, b> nmvVar, boolean z, njb njbVar) {
        IpChange ipChange = $ipChange;
        boolean z2 = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a063299d", new Object[]{this, nmvVar, new Boolean(z), njbVar});
            return;
        }
        njd b = njbVar.b();
        if (b == null || !njbVar.f() || b.f != 4) {
            a(nmvVar, njbVar, z);
            return;
        }
        b e = nmvVar.e();
        if (z) {
            d(nmvVar);
        }
        niw.a("Phenix", "BitMapProcessor Started.", e);
        Bitmap c = njbVar.c();
        Bitmap a2 = a(c, b);
        if (a2 != null) {
            niw.a("BitmapProcess", e, "scale bitmap, new size=%d, old size=%d", Integer.valueOf(niu.a(a2)), Integer.valueOf(niu.a(c)));
            if (a2 != c) {
                c.recycle();
            }
            byte[] a3 = a(e, a2, b);
            if (a3 != null && a3.length > 0) {
                b.h();
                b = b.a(new njc(a3, 0, a3.length), 1, true);
            }
            njbVar = new njb(b, a2);
        }
        if (z) {
            if (a2 != null) {
                z2 = true;
            }
            a(nmvVar, z2);
        }
        niw.a("Phenix", "BitMapProcessor Finished.", e);
        a(nmvVar, njbVar, z);
    }

    @Override // tb.nmy
    public boolean a(nmv<njb, b> nmvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f680a8e5", new Object[]{this, nmvVar})).booleanValue();
        }
        if (!com.taobao.phenix.intf.b.h().K()) {
            return false;
        }
        b e = nmvVar.e();
        String u = e.u();
        String a2 = nmvVar.e().a();
        Bitmap a3 = dqf.a().a(a2, u);
        if (a3 == null) {
            return false;
        }
        njb njbVar = new njb(null, e.a(a3).f18702a);
        niw.a("Phenix", "BitMapProcessor conductResult. hit local cache", e, true);
        e.b().a(ImageStatistics.FromType.FROM_FAST_DISK_CACHE);
        f(nmvVar);
        nmvVar.b(njbVar, true);
        dqf.a().a(a2, e.u(), a3);
        return true;
    }

    private void f(nmv<njb, b> nmvVar) {
        ImageStatistics b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f0fc966", new Object[]{this, nmvVar});
        } else if (com.taobao.phenix.intf.b.h().m() == null || (b = nmvVar.e().b()) == null || !StringUtils.isEmpty(b.f18937a)) {
        } else {
            b.Q = true;
            niw.a("Phenix", "BitMapProcessor createFullTrack." + nmvVar.e().p(), nmvVar.e(), true);
            com.taobao.phenix.intf.b.h().m().b(b);
        }
    }
}
