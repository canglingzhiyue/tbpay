package com.etao.feimagesearch.cip.camera;

import android.graphics.Bitmap;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.cip.camera.c;
import com.etao.feimagesearch.mnn.k;
import com.etao.feimagesearch.util.i;
import com.etao.feimagesearch.util.l;
import com.taobao.android.weex_ability.modules.WeexZipModule;
import com.taobao.weex.common.Constants;
import java.io.File;
import java.util.HashMap;
import tb.aml;
import tb.com;
import tb.cot;
import tb.cuk;
import tb.czv;
import tb.dgh;
import tb.kge;

/* loaded from: classes3.dex */
public class f implements c.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final boolean f6632a;
    private final e b;
    private final int c;
    private final int d;
    private final boolean e;
    private final int f;

    static {
        kge.a(-605482211);
        kge.a(-1050129513);
    }

    public static /* synthetic */ int a(f fVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("e9f29efc", new Object[]{fVar})).intValue() : fVar.f;
    }

    public static /* synthetic */ void a(f fVar, Bitmap bitmap, byte[] bArr, int i, int i2, int i3, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7118215d", new Object[]{fVar, bitmap, bArr, new Integer(i), new Integer(i2), new Integer(i3), new Boolean(z)});
        } else {
            fVar.a(bitmap, bArr, i, i2, i3, z);
        }
    }

    public static /* synthetic */ void a(f fVar, Bitmap bitmap, byte[] bArr, int i, int i2, int i3, boolean z, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1ec7d46", new Object[]{fVar, bitmap, bArr, new Integer(i), new Integer(i2), new Integer(i3), new Boolean(z), new Integer(i4)});
        } else {
            fVar.a(bitmap, bArr, i, i2, i3, z, i4);
        }
    }

    public static /* synthetic */ void a(f fVar, Bitmap bitmap, byte[] bArr, int i, int i2, int i3, boolean z, czv czvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78a87b8e", new Object[]{fVar, bitmap, bArr, new Integer(i), new Integer(i2), new Integer(i3), new Boolean(z), czvVar});
        } else {
            fVar.a(bitmap, bArr, i, i2, i3, z, czvVar);
        }
    }

    public f(e eVar, boolean z, int i, int i2, boolean z2, int i3) {
        this.b = eVar;
        this.f6632a = z;
        this.c = i;
        this.d = i2;
        this.e = z2;
        this.f = i3;
    }

    @Override // com.etao.feimagesearch.cip.camera.c.a
    public void a(byte[] bArr, int i, int i2, int i3, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8baaa040", new Object[]{this, bArr, new Integer(i), new Integer(i2), new Integer(i3), new Boolean(z)});
        } else if (bArr == null || i * i2 == 0) {
            this.b.a(null, false, this, z);
        } else {
            b(bArr, i, i2, i3, z);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0050, code lost:
        if (r0 <= 0.1f) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void b(final byte[] r13, final int r14, final int r15, final int r16, final boolean r17) {
        /*
            r12 = this;
            r8 = r12
            r4 = r14
            r5 = r15
            r6 = r16
            r7 = r17
            com.android.alibaba.ip.runtime.IpChange r0 = com.etao.feimagesearch.cip.camera.f.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L3c
            r1 = 6
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r3] = r8
            r1[r2] = r13
            r2 = 2
            java.lang.Integer r3 = new java.lang.Integer
            r3.<init>(r14)
            r1[r2] = r3
            r2 = 3
            java.lang.Integer r3 = new java.lang.Integer
            r3.<init>(r15)
            r1[r2] = r3
            r2 = 4
            java.lang.Integer r3 = new java.lang.Integer
            r3.<init>(r6)
            r1[r2] = r3
            r2 = 5
            java.lang.Boolean r3 = new java.lang.Boolean
            r3.<init>(r7)
            r1[r2] = r3
            java.lang.String r2 = "208f5301"
            r0.ipc$dispatch(r2, r1)
            return
        L3c:
            if (r13 == 0) goto L53
            boolean r0 = r8.f6632a     // Catch: java.lang.Throwable -> L53
            if (r0 == 0) goto L53
            float r0 = com.etao.feimagesearch.util.p.a(r13, r14, r15)     // Catch: java.lang.Throwable -> L53
            r1 = 0
            int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r1 <= 0) goto L53
            r1 = 1036831949(0x3dcccccd, float:0.1)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 > 0) goto L53
            goto L54
        L53:
            r2 = 0
        L54:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "cameraWidth"
            r0.append(r1)
            r0.append(r14)
            java.lang.String r1 = ", cameraHeight="
            r0.append(r1)
            r0.append(r15)
            java.lang.String r1 = ", orientation="
            r0.append(r1)
            r0.append(r6)
            java.lang.String r1 = ", front="
            r0.append(r1)
            r0.append(r7)
            java.lang.String r1 = ", mViewWidth="
            r0.append(r1)
            int r1 = r8.c
            r0.append(r1)
            java.lang.String r1 = ", mViewHeight="
            r0.append(r1)
            int r1 = r8.d
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "FEISTakePictureTask"
            tb.cot.c(r1, r0)
            com.etao.feimagesearch.util.f$c r0 = com.etao.feimagesearch.util.f.a(r13, r14, r15, r16, r17)
            com.etao.feimagesearch.util.f$b r0 = (com.etao.feimagesearch.util.f.b) r0
            int r1 = r8.c
            int r9 = r8.d
            com.etao.feimagesearch.util.f$d r0 = r0.b(r1, r9)
            android.graphics.Bitmap r9 = r0.a()
            com.etao.feimagesearch.cip.camera.e r0 = r8.b
            if (r0 == 0) goto Ld0
            if (r9 != 0) goto Lb3
            r1 = 0
            r0.a(r1, r3, r12, r7)
            return
        Lb3:
            r0.a(r9, r2, r12, r7)
            boolean r0 = r8.e
            if (r0 == 0) goto Ld0
            java.util.concurrent.ExecutorService r10 = com.taobao.android.virtual_thread.face.VExecutors.defaultSharedThreadPool()
            com.etao.feimagesearch.cip.camera.f$1 r11 = new com.etao.feimagesearch.cip.camera.f$1
            r0 = r11
            r1 = r12
            r2 = r9
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            r7 = r17
            r0.<init>()
            r10.submit(r11)
        Ld0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etao.feimagesearch.cip.camera.f.b(byte[], int, int, int, boolean):void");
    }

    private void a(final Bitmap bitmap, final byte[] bArr, final int i, final int i2, final int i3, final boolean z, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e010ea5", new Object[]{this, bitmap, bArr, new Integer(i), new Integer(i2), new Integer(i3), new Boolean(z), new Integer(i4)});
            return;
        }
        try {
            if (!dgh.a().i()) {
                dgh.a().a(new k() { // from class: com.etao.feimagesearch.cip.camera.f.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.etao.feimagesearch.mnn.k
                    public void a() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                            return;
                        }
                        cot.c("FEISTakePictureTask", "detectDarkPhoto build success");
                        f.a(f.this, bitmap, bArr, i, i2, i3, z);
                    }

                    @Override // com.etao.feimagesearch.mnn.k
                    public void a(int i5, String str) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("20f12ca5", new Object[]{this, new Integer(i5), str});
                            return;
                        }
                        cot.a("PltCamera", "FEISTakePictureTask", "detectDarkPhoto failed: errorCode=" + i5 + ", errorMsg=" + str);
                    }
                }, String.valueOf(i4));
            } else {
                a(bitmap, bArr, i, i2, i3, z);
            }
        } catch (Throwable unused) {
        }
    }

    private void a(final Bitmap bitmap, final byte[] bArr, final int i, final int i2, final int i3, final boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("538c681e", new Object[]{this, bitmap, bArr, new Integer(i), new Integer(i2), new Integer(i3), new Boolean(z)});
            return;
        }
        dgh.a().a(new aml(bitmap, 1), (Object) null, new com.etao.feimagesearch.mnn.d<czv>() { // from class: com.etao.feimagesearch.cip.camera.f.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.etao.feimagesearch.mnn.d
            public void a(Throwable th) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("fb9ad88d", new Object[]{this, th});
                    return;
                }
                cot.a("PltCamera", "FEISTakePictureTask", "detectDarkPhoto failed: " + cot.a("", th));
            }

            @Override // com.etao.feimagesearch.mnn.d
            public void a(czv czvVar) {
                String str;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("e4728b99", new Object[]{this, czvVar});
                    return;
                }
                cot.c("FEISTakePictureTask", "onResult " + JSON.toJSONString(czvVar));
                if (dgh.VALUE_NORMAL_RESULT.equalsIgnoreCase(czvVar.a())) {
                    str = "正常帧";
                } else {
                    f.a(f.this, bitmap, bArr, i, i2, i3, z, czvVar);
                    str = "黑帧: " + czvVar.a();
                }
                if (!com.a()) {
                    return;
                }
                cuk.a().a(com.b(), str);
            }
        });
        cot.a("Dynamic", "FEISTakePictureTask", "detectDarkPhoto");
    }

    private void a(Bitmap bitmap, byte[] bArr, int i, int i2, int i3, boolean z, czv czvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("250e714f", new Object[]{this, bitmap, bArr, new Integer(i), new Integer(i2), new Integer(i3), new Boolean(z), czvVar});
            return;
        }
        String b = l.b(com.b(), bitmap, com.etao.feimagesearch.util.album.b.BIZ_TYPE_DARK_DETECT);
        if (StringUtils.isEmpty(b)) {
            return;
        }
        cot.c("FEISTakePictureTask", "pngFileAbsPath=" + b);
        StringBuilder sb = new StringBuilder();
        for (byte b2 : bArr) {
            String hexString = Integer.toHexString(b2 & 255);
            if (hexString.length() == 1) {
                sb.append('0');
            }
            sb.append(hexString);
            sb.append(" ");
        }
        String a2 = l.a(com.b(), sb.toString().toUpperCase(), com.etao.feimagesearch.util.album.b.BIZ_TYPE_DARK_DETECT);
        if (StringUtils.isEmpty(a2)) {
            i.b(b);
            return;
        }
        cot.c("FEISTakePictureTask", "contentFileAbsPath=" + a2);
        String a3 = l.a(com.b(), new String[]{b, a2}, com.etao.feimagesearch.util.album.b.BIZ_TYPE_DARK_DETECT);
        i.a(new File(a2));
        i.a(new File(b));
        if (StringUtils.isEmpty(a3)) {
            return;
        }
        HashMap<String, String> hashMap = new HashMap<>(8);
        hashMap.put(com.etao.feimagesearch.util.album.b.LOCAL_FILE_PATH, a3);
        hashMap.put("result_code", czvVar.a());
        hashMap.put("cameraWidth", String.valueOf(i));
        hashMap.put("cameraHeight", String.valueOf(i2));
        hashMap.put("orientation", String.valueOf(i3));
        hashMap.put("front", String.valueOf(z));
        hashMap.put("viewWidth", String.valueOf(this.c));
        hashMap.put(Constants.Name.VIEW_HEIGHT, String.valueOf(this.d));
        hashMap.put("extraInfo", czvVar.b());
        com.etao.feimagesearch.util.album.b.Companion.a(com.etao.feimagesearch.util.album.b.BIZ_TYPE_DARK_DETECT, a3, hashMap, WeexZipModule.NAME);
    }
}
