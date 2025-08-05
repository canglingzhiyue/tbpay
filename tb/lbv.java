package tb;

import android.graphics.Bitmap;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.config.b;
import com.etao.feimagesearch.mnn.k;
import com.taobao.android.alinnkit.core.AliNNFlipType;
import com.taobao.android.alinnkit.entity.FaceDetectionReport;
import com.taobao.android.alinnkit.net.FaceDetectionNet;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
public class lbv extends coi {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private FaceDetectionNet.a f30460a;
    private FaceDetectionNet b;
    private final AtomicBoolean c;
    private final AtomicBoolean d;

    /* loaded from: classes3.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static final lbv f30462a;

        static {
            kge.a(-1800912174);
            f30462a = new lbv();
        }

        public static /* synthetic */ lbv a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (lbv) ipChange.ipc$dispatch("f073b5e", new Object[0]) : f30462a;
        }
    }

    static {
        kge.a(472876638);
    }

    public static /* synthetic */ Object ipc$super(lbv lbvVar, String str, Object... objArr) {
        if (str.hashCode() == 657958622) {
            super.b((k) objArr[0]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ FaceDetectionNet a(lbv lbvVar, FaceDetectionNet faceDetectionNet) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FaceDetectionNet) ipChange.ipc$dispatch("251255be", new Object[]{lbvVar, faceDetectionNet});
        }
        lbvVar.b = faceDetectionNet;
        return faceDetectionNet;
    }

    public static /* synthetic */ AtomicBoolean a(lbv lbvVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AtomicBoolean) ipChange.ipc$dispatch("d4138c58", new Object[]{lbvVar}) : lbvVar.c;
    }

    public static /* synthetic */ void a(lbv lbvVar, k kVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b39a1bcd", new Object[]{lbvVar, kVar});
        } else {
            lbvVar.a(kVar);
        }
    }

    public static /* synthetic */ AtomicBoolean b(lbv lbvVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AtomicBoolean) ipChange.ipc$dispatch("fd67e199", new Object[]{lbvVar}) : lbvVar.d;
    }

    public static /* synthetic */ void b(lbv lbvVar, k kVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("98db8a8e", new Object[]{lbvVar, kVar});
        } else {
            lbvVar.a(kVar);
        }
    }

    public static /* synthetic */ k c(lbv lbvVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (k) ipChange.ipc$dispatch("dc2119f1", new Object[]{lbvVar}) : lbvVar.c();
    }

    public static /* synthetic */ k d(lbv lbvVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (k) ipChange.ipc$dispatch("e3864f10", new Object[]{lbvVar}) : lbvVar.c();
    }

    public static lbv b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (lbv) ipChange.ipc$dispatch("16b8e0bd", new Object[0]) : a.a();
    }

    private lbv() {
        this.f30460a = new FaceDetectionNet.a();
        this.c = new AtomicBoolean(true);
        this.d = new AtomicBoolean(false);
        this.f30460a.f9026a = FaceDetectionNet.FaceDetectMode.SCOPE_DETECT_MODE_IMAGE;
    }

    @Override // tb.coi, tb.coo
    public void a(final int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else if (!b.R() || !this.c.get() || this.b != null || this.d.get()) {
        } else {
            this.d.set(true);
            coy.a(com.etao.feimagesearch.structure.capture.a.f6987a, "prepareFaceModelV1", 19999, new String[0]);
            final long currentTimeMillis = System.currentTimeMillis();
            FaceDetectionNet.a(com.b(), this.f30460a, "jwH6QKsj+j1mHV3+pbi26Kh55aMzO/mKmHUqTY+E414CkWcXIqkh8kYP+7hkQn3lvEfmfx4RrRcitG0aMWLRsz2upDoAfAG/Yd5ry/iQf2M=", new dpu<FaceDetectionNet>() { // from class: tb.lbv.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.dpu
                public void a(int i2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("a821939b", new Object[]{this, new Integer(i2)});
                    }
                }

                @Override // tb.dpu
                public void a(FaceDetectionNet faceDetectionNet) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("83db4dcc", new Object[]{this, faceDetectionNet});
                        return;
                    }
                    long abs = Math.abs(System.currentTimeMillis() - currentTimeMillis);
                    String str = com.etao.feimagesearch.structure.capture.a.f6987a;
                    coy.a(str, "prepareFaceModelSuccessV1", 19999, "costTime", abs + "");
                    faceDetectionNet.a(FaceDetectionNet.DetectParamType.FACE_PARAM_DETECT_IMG_SIZE, (float) b.S());
                    faceDetectionNet.a(FaceDetectionNet.DetectParamType.FACE_PARAM_DETECT_THRESHOLD, b.T());
                    lbv.a(lbv.this, faceDetectionNet);
                    lbv.a(lbv.this).set(false);
                    if (!lbv.b(lbv.this).get()) {
                        lbv.this.b(i);
                        return;
                    }
                    k c = lbv.c(lbv.this);
                    if (c == null) {
                        return;
                    }
                    c.a();
                    lbv.a(lbv.this, (k) null);
                }

                @Override // tb.dpu
                public void a(Throwable th) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("fb9ad88d", new Object[]{this, th});
                        return;
                    }
                    lbv.a(lbv.this).set(true);
                    k d = lbv.d(lbv.this);
                    if (d == null) {
                        return;
                    }
                    d.a(-1, "prepare failed");
                    lbv.b(lbv.this, null);
                }
            });
        }
    }

    @Override // tb.coi, tb.coo
    public void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
        } else if (!b.R()) {
        } else {
            if (!this.c.get() && this.b != null) {
                coy.a(com.etao.feimagesearch.structure.capture.a.f6987a, "releaseFaceModelSuccessV1", 19999, new String[0]);
                this.c.set(true);
                this.b.release();
                this.b = null;
                a((k) null);
            }
            this.d.set(false);
        }
    }

    private int a(Bitmap bitmap, FaceDetectionNet faceDetectionNet) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ccd7409d", new Object[]{this, bitmap, faceDetectionNet})).intValue();
        }
        long currentTimeMillis = System.currentTimeMillis();
        FaceDetectionReport[] a2 = faceDetectionNet.a(b(bitmap), FaceDetectionNet.FacePixelFormat.FACE_PIXEL_FORMAT_RGB888, bitmap.getWidth(), bitmap.getHeight(), 0, 0L, 0, AliNNFlipType.FLIP_NONE, true, null);
        if (a2 == null) {
            return 0;
        }
        if (a2.length > 0) {
            long abs = Math.abs(System.currentTimeMillis() - currentTimeMillis);
            String str = com.etao.feimagesearch.structure.capture.a.f6987a;
            coy.a(str, "faceDetectedV1", 19999, "costTime", abs + "");
        }
        return a2.length;
    }

    @Override // tb.coi, tb.coo
    public cpa a(Bitmap bitmap) {
        FaceDetectionNet faceDetectionNet;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (cpa) ipChange.ipc$dispatch("435a89ec", new Object[]{this, bitmap});
        }
        if (this.c.get() || (faceDetectionNet = this.b) == null) {
            return new cpa(-1, "");
        }
        return new cpa(a(bitmap, faceDetectionNet), "");
    }

    @Override // tb.coi, tb.coo
    public void b(k kVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2737a6de", new Object[]{this, kVar});
        } else if (this.c.get() || this.b == null) {
            super.b(kVar);
        } else {
            kVar.a();
        }
    }

    public static byte[] b(Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("462f18", new Object[]{bitmap});
        }
        if (bitmap == null) {
            return null;
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int[] iArr = new int[width * height];
        bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
        return a(iArr);
    }

    public static byte[] a(int[] iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("2716ae27", new Object[]{iArr});
        }
        if (iArr == null) {
            return null;
        }
        byte[] bArr = new byte[iArr.length * 3];
        for (int i = 0; i < iArr.length; i++) {
            int i2 = i * 3;
            bArr[i2] = (byte) (iArr[i] >> 16);
            bArr[i2 + 1] = (byte) (iArr[i] >> 8);
            bArr[i2 + 2] = (byte) iArr[i];
        }
        return bArr;
    }
}
