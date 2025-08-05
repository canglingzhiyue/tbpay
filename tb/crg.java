package tb;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.RectF;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.nn.NetConfig;
import com.taobao.android.alinnkit.alinn.AliNNImageProcess;
import com.taobao.android.alinnkit.alinn.AliNNNetInstance;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* loaded from: classes3.dex */
public class crg extends crb {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private List<b> f;
    private float g;
    private float h;
    private float i;
    private float j;
    private float k;
    private int l;
    private int m;

    /* loaded from: classes3.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public boolean f26467a;
        public boolean b;
        public int c;

        static {
            kge.a(-172463877);
        }
    }

    static {
        kge.a(-827559405);
    }

    public crg(crf crfVar) {
        super(crfVar);
        this.f = new ArrayList();
        this.g = crfVar.j();
        this.h = crfVar.g();
        this.i = crfVar.h();
        this.j = crfVar.i();
        this.k = crfVar.f();
    }

    @Override // tb.crb
    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        if (i()) {
            return true;
        }
        this.e |= 8;
        crf crfVar = (crf) this.d;
        this.c = com.etao.feimagesearch.util.a.a(crfVar.m(), crfVar.n(), AliNNImageProcess.Format.RGB, AliNNImageProcess.Filter.BILINEAL);
        this.e = b() | this.e;
        this.e &= -9;
        return true;
    }

    private static float[] a(float[] fArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (float[]) ipChange.ipc$dispatch("2715510e", new Object[]{fArr});
        }
        float[] fArr2 = new float[fArr.length];
        int length = fArr.length;
        float f = 0.0f;
        for (int i = 0; i < length; i++) {
            f += fArr[i] * fArr[i];
        }
        if (f != 0.0f) {
            float sqrt = (float) Math.sqrt(f);
            int length2 = fArr.length;
            for (int i2 = 0; i2 < length2; i2++) {
                fArr2[i2] = fArr[i2] / sqrt;
            }
        }
        return fArr2;
    }

    private static float a(float[] fArr, float[] fArr2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bbab392e", new Object[]{fArr, fArr2})).floatValue();
        }
        float f = 0.0f;
        int length = fArr.length;
        for (int i = 0; i < length; i++) {
            f += (fArr[i] - fArr2[i]) * (fArr[i] - fArr2[i]);
        }
        return (float) Math.sqrt(f);
    }

    public void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6076ef3", new Object[]{this});
        } else {
            this.l++;
        }
    }

    public a a(Bitmap bitmap, int i, RectF rectF, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("efa0b99f", new Object[]{this, bitmap, new Integer(i), rectF, new Float(f)});
        }
        try {
            a aVar = new a();
            AliNNNetInstance.c.a a2 = this.b.a(null);
            Matrix matrix = new Matrix();
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            crf crfVar = (crf) this.d;
            matrix.postScale(crfVar.k() / width, crfVar.l() / height);
            matrix.invert(matrix);
            AliNNImageProcess.a(bitmap, a2, this.c, matrix);
            d();
            float[] a3 = a(this.b.b(NetConfig.OUPUT_KEY).c());
            int m = com.etao.feimagesearch.config.b.m();
            if (this.f.isEmpty()) {
                b bVar = new b(a3, i);
                b.a(bVar).add(Float.valueOf(f));
                b.b(bVar).add(rectF);
                this.f.add(bVar);
                aVar.f26467a = false;
                if (b.c(bVar) < m) {
                    aVar = null;
                }
                if (aVar != null) {
                    int i2 = this.m;
                    this.m = i2 + 1;
                    bVar.f26468a = i2;
                }
                return aVar;
            }
            b bVar2 = null;
            float f2 = Float.MAX_VALUE;
            for (b bVar3 : this.f) {
                if (b.d(bVar3) != null) {
                    float a4 = a(b.d(bVar3), a3);
                    if (a4 <= this.g && a4 < f2) {
                        aVar.f26467a = true;
                        bVar2 = bVar3;
                        f2 = a4;
                    }
                }
            }
            if (bVar2 == null) {
                b bVar4 = new b(a3, i);
                b.a(bVar4).add(Float.valueOf(f));
                b.b(bVar4).add(rectF);
                this.f.add(bVar4);
                aVar.f26467a = false;
                if (b.c(bVar4) < m) {
                    aVar = null;
                }
                if (aVar != null) {
                    int i3 = this.m;
                    this.m = i3 + 1;
                    bVar4.f26468a = i3;
                }
                return aVar;
            }
            b.e(bVar2);
            b.a(bVar2).add(Float.valueOf(f));
            b.b(bVar2).add(rectF);
            aVar.f26467a = aVar.f26467a && b.c(bVar2) > m;
            if (b.f(bVar2) > f2) {
                b.a(bVar2, f2);
                int g = b.g(bVar2);
                b.a(bVar2, i);
                aVar.b = true;
                aVar.c = g;
            }
            if (b.d(bVar2) == null) {
                b.a(bVar2, a3);
                b.b(bVar2, new float[a3.length]);
                b.b(bVar2, 1);
                System.arraycopy(b.d(bVar2), 0, b.h(bVar2), 0, b.d(bVar2).length);
            } else {
                b.i(bVar2);
                for (int i4 = 0; i4 < b.d(bVar2).length; i4++) {
                    float[] h = b.h(bVar2);
                    h[i4] = h[i4] + a3[i4];
                    b.d(bVar2)[i4] = b.h(bVar2)[i4] / b.j(bVar2);
                }
            }
            if (b.c(bVar2) < m) {
                aVar = null;
            }
            if (aVar != null && !aVar.f26467a && bVar2.f26468a < 0) {
                int i5 = this.m;
                this.m = i5 + 1;
                bVar2.f26468a = i5;
            }
            return aVar;
        } catch (Exception unused) {
            return null;
        }
    }

    public int m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6158667", new Object[]{this})).intValue();
        }
        for (int i = 0; i < this.f.size(); i++) {
            List b2 = b.b(this.f.get(i));
            List a2 = b.a(this.f.get(i));
            for (int i2 = 0; i2 < b2.size(); i2++) {
                RectF rectF = (RectF) b2.get(i2);
                float floatValue = ((Float) a2.get(i2)).floatValue();
                float width = rectF.width() * rectF.height();
                if (floatValue > this.h && width > this.i) {
                    this.f.get(i).b++;
                }
            }
        }
        if (this.f.size() > 1) {
            Collections.sort(this.f, new Comparator<b>() { // from class: tb.crg.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.util.Comparator
                public /* synthetic */ int compare(b bVar, b bVar2) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? ((Number) ipChange2.ipc$dispatch("6a9be197", new Object[]{this, bVar, bVar2})).intValue() : a(bVar, bVar2);
                }

                public int a(b bVar, b bVar2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Number) ipChange2.ipc$dispatch("b6da100f", new Object[]{this, bVar, bVar2})).intValue();
                    }
                    if (bVar.b < bVar2.b) {
                        return 1;
                    }
                    return bVar.b > bVar2.b ? -1 : 0;
                }
            });
            float f = this.f.get(0).b * 1.0f;
            if (f / Math.max(1, this.f.get(1).b) > this.k || f / this.l > this.j) {
                return this.f.get(0).f26468a;
            }
        }
        return this.m - 1;
    }

    /* loaded from: classes3.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public int b;
        private float[] c;
        private float[] d;
        private float f;
        private int g;
        private int e = 1;

        /* renamed from: a  reason: collision with root package name */
        public int f26468a = -1;
        private List<Float> h = new ArrayList();
        private List<RectF> i = new ArrayList();
        private int j = 1;

        static {
            kge.a(-401025340);
        }

        public static /* synthetic */ float a(b bVar, float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("3114cd6e", new Object[]{bVar, new Float(f)})).floatValue();
            }
            bVar.f = f;
            return f;
        }

        public static /* synthetic */ int a(b bVar, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("3114d8b4", new Object[]{bVar, new Integer(i)})).intValue();
            }
            bVar.g = i;
            return i;
        }

        public static /* synthetic */ List a(b bVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("405e5385", new Object[]{bVar}) : bVar.h;
        }

        public static /* synthetic */ float[] a(b bVar, float[] fArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (float[]) ipChange.ipc$dispatch("404be4b4", new Object[]{bVar, fArr});
            }
            bVar.c = fArr;
            return fArr;
        }

        public static /* synthetic */ int b(b bVar, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("12a6b693", new Object[]{bVar, new Integer(i)})).intValue();
            }
            bVar.e = i;
            return i;
        }

        public static /* synthetic */ List b(b bVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("410aff24", new Object[]{bVar}) : bVar.i;
        }

        public static /* synthetic */ float[] b(b bVar, float[] fArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (float[]) ipChange.ipc$dispatch("4ddc6d3", new Object[]{bVar, fArr});
            }
            bVar.d = fArr;
            return fArr;
        }

        public static /* synthetic */ int c(b bVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("83bfbef7", new Object[]{bVar})).intValue() : bVar.j;
        }

        public static /* synthetic */ float[] d(b bVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (float[]) ipChange.ipc$dispatch("d5ca003c", new Object[]{bVar}) : bVar.c;
        }

        public static /* synthetic */ int e(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("37769379", new Object[]{bVar})).intValue();
            }
            int i = bVar.j;
            bVar.j = i + 1;
            return i;
        }

        public static /* synthetic */ float f(b bVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("9151fdb7", new Object[]{bVar})).floatValue() : bVar.f;
        }

        public static /* synthetic */ int g(b bVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("eb2d67fb", new Object[]{bVar})).intValue() : bVar.g;
        }

        public static /* synthetic */ float[] h(b bVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (float[]) ipChange.ipc$dispatch("5c1177b8", new Object[]{bVar}) : bVar.d;
        }

        public static /* synthetic */ int i(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("9ee43c7d", new Object[]{bVar})).intValue();
            }
            int i = bVar.e;
            bVar.e = i + 1;
            return i;
        }

        public static /* synthetic */ int j(b bVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("f8bfa6be", new Object[]{bVar})).intValue() : bVar.e;
        }

        public b(float[] fArr, int i) {
            this.c = fArr;
            this.d = new float[fArr.length];
            System.arraycopy(fArr, 0, this.d, 0, fArr.length);
            this.f = 1000.0f;
            this.g = i;
        }
    }
}
