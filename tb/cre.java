package tb;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.util.z;
import com.taobao.android.alinnkit.alinn.AliNNImageProcess;
import com.taobao.android.alinnkit.alinn.AliNNNetInstance;
import com.taobao.android.searchbaseframe.util.k;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* loaded from: classes3.dex */
public class cre extends crb {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private float[] f;
    private float[] g;
    private int[] h;

    static {
        kge.a(1076166029);
    }

    public static /* synthetic */ Object ipc$super(cre creVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public cre(String str) {
        super(new crd(str));
        this.f = new float[]{0.0f, 0.0f, 0.0f};
        this.g = new float[]{0.003921569f, 0.003921569f, 0.003921569f};
        this.h = new int[3];
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
        if (this.d != null && !StringUtils.isEmpty(this.d.b) && !StringUtils.isEmpty(this.d.c)) {
            this.e |= 8;
            z.a().a("INIT_OBJECT_REGION_DETECTION_MODEL", -1);
            crd crdVar = (crd) this.d;
            this.f = crdVar.m();
            this.g = crdVar.l();
            this.c = com.etao.feimagesearch.util.a.a(this.f, this.g, AliNNImageProcess.Format.RGB);
            z.a().a("LOAD_OBJECT_REGION_DETECTION_MODEL", -1);
            int b2 = b();
            z.a().a("LOAD_OBJECT_REGION_DETECTION_MODEL");
            z.a().a("INIT_OBJECT_REGION_DETECTION_MODEL");
            this.e |= b2 | 4;
            this.e &= -9;
            if (b2 == 2) {
                return true;
            }
        }
        return false;
    }

    public b a(Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("d6fd752c", new Object[]{this, bitmap});
        }
        if (!h()) {
            return null;
        }
        long currentTimeMillis = System.currentTimeMillis();
        AliNNNetInstance.c.a a2 = this.b.a(null);
        crd crdVar = (crd) this.d;
        Bitmap createBitmap = Bitmap.createBitmap(crdVar.h(), crdVar.i(), Bitmap.Config.ARGB_8888);
        float min = Math.min((createBitmap.getWidth() * 1.0f) / bitmap.getWidth(), (createBitmap.getHeight() * 1.0f) / bitmap.getHeight());
        Canvas canvas = new Canvas();
        canvas.setBitmap(createBitmap);
        Rect rect = new Rect();
        int width = (int) (bitmap.getWidth() * min);
        int height = (int) (bitmap.getHeight() * min);
        rect.left = (createBitmap.getWidth() - width) / 2;
        rect.top = (createBitmap.getHeight() - height) / 2;
        rect.right = rect.left + width;
        rect.bottom = rect.top + height;
        int i = rect.left << 1;
        int i2 = rect.top << 1;
        canvas.drawBitmap(bitmap, (Rect) null, rect, (Paint) null);
        k.f("自动识别", "输入尺寸: width=" + createBitmap.getWidth() + " - height=" + createBitmap.getHeight(), new Object[0]);
        AliNNImageProcess.a(createBitmap, a2, this.c, null);
        long currentTimeMillis2 = System.currentTimeMillis();
        d();
        k.f("自动识别", "模型推理耗时(ms): " + (System.currentTimeMillis() - currentTimeMillis2), new Object[0]);
        a(this.b);
        ArrayList arrayList = new ArrayList();
        for (int i3 = 0; i3 < crdVar.f().length; i3++) {
            a(this.b.b(crdVar.f()[i3]), this.h[i3], crdVar.g()[i3], arrayList);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        a(arrayList, crdVar.k());
        a(arrayList, i, i2, rect.left, rect.top, width, height);
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        if (arrayList.size() > 0) {
            int size = arrayList.size();
            for (int i4 = 0; i4 < size; i4++) {
                a aVar = arrayList.get(i4);
                RectF rectF = new RectF();
                rectF.set(a.a(aVar)[0], a.a(aVar)[1], a.a(aVar)[2], a.a(aVar)[3]);
                arrayList2.add(rectF);
                arrayList3.add(Float.valueOf(a.b(aVar)));
            }
        }
        k.f("自动识别", "输出主体数量: " + arrayList2.size(), new Object[0]);
        for (int i5 = 0; i5 < arrayList2.size(); i5++) {
            k.f("自动识别", "主体框位置[left,top][right,bottom]: " + ((RectF) arrayList2.get(i5)).toShortString(), new Object[0]);
            k.f("自动识别", "主体置信度: " + arrayList3.get(i5), new Object[0]);
        }
        k.f("自动识别", "模型总耗时(ms): " + (System.currentTimeMillis() - currentTimeMillis), new Object[0]);
        return new b(arrayList2, arrayList3);
    }

    private float a(float[] fArr, float[] fArr2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bbab392e", new Object[]{this, fArr, fArr2})).floatValue();
        }
        float max = Math.max(0.0f, (Math.min(fArr[2], fArr2[2]) - Math.max(fArr[0], fArr2[0])) + 1.0f) * Math.max(0.0f, (Math.min(fArr[3], fArr2[3]) - Math.max(fArr[1], fArr2[1])) + 1.0f);
        return max / ((((fArr[2] - fArr[0]) * (fArr[3] - fArr[1])) + ((fArr2[2] - fArr2[0]) * (fArr2[3] - fArr2[1]))) - max);
    }

    public void a(List<a> list, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19a06987", new Object[]{this, list, new Float(f)});
            return;
        }
        Collections.sort(list, new Comparator<a>() { // from class: tb.cre.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.util.Comparator
            public /* synthetic */ int compare(a aVar, a aVar2) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ((Number) ipChange2.ipc$dispatch("6a9be197", new Object[]{this, aVar, aVar2})).intValue() : a(aVar, aVar2);
            }

            public int a(a aVar, a aVar2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Number) ipChange2.ipc$dispatch("e6e6515", new Object[]{this, aVar, aVar2})).intValue();
                }
                if (a.b(aVar) > a.b(aVar2)) {
                    return -1;
                }
                return a.b(aVar) < a.b(aVar2) ? 1 : 0;
            }
        });
        boolean[] zArr = new boolean[list.size()];
        Arrays.fill(zArr, true);
        for (int i = 0; i < zArr.length; i++) {
            if (zArr[i]) {
                for (int i2 = i + 1; i2 < zArr.length; i2++) {
                    zArr[i2] = zArr[i2] && a(a.a(list.get(i)), a.a(list.get(i2))) < f;
                }
            }
        }
        a(list, zArr);
    }

    public void a(List<a> list, boolean[] zArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a7705f8", new Object[]{this, list, zArr});
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            if (!zArr[i]) {
                arrayList.add(Integer.valueOf(i));
            }
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            list.remove(((Integer) arrayList.get(size)).intValue());
        }
    }

    private void a(AliNNNetInstance.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d2dad0f", new Object[]{this, cVar});
            return;
        }
        crd crdVar = (crd) this.d;
        for (int i = 0; i < crdVar.f().length; i++) {
            this.h[i] = crdVar.i() / cVar.b(crdVar.f()[i]).b()[2];
        }
    }

    private float a(float f, float f2, float f3) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("25edca48", new Object[]{this, new Float(f), new Float(f2), new Float(f3)})).floatValue() : Math.min(Math.max(f, f2), f3);
    }

    private void a(List<a> list, int i, int i2, int i3, int i4, int i5, int i6) {
        IpChange ipChange = $ipChange;
        char c = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bffa5bb9", new Object[]{this, list, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6)});
            return;
        }
        for (a aVar : list) {
            float f = i3;
            float f2 = i5;
            a.a(aVar)[c] = a(a.a(aVar)[c] - f, 0.0f, f2) / f2;
            float f3 = i4;
            float f4 = i6;
            a.a(aVar)[1] = a(a.a(aVar)[1] - f3, 0.0f, f4) / f4;
            a.a(aVar)[2] = a(a.a(aVar)[2] - f, 0.0f, f2) / f2;
            a.a(aVar)[3] = a(a.a(aVar)[3] - f3, 0.0f, f4) / f4;
            c = 0;
        }
    }

    private void a(AliNNNetInstance.c.a aVar, int i, float[] fArr, List<a> list) {
        crd crdVar;
        int i2;
        int i3;
        int i4;
        cre creVar = this;
        int i5 = i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6299ac4d", new Object[]{creVar, aVar, new Integer(i5), fArr, list});
            return;
        }
        float[] c = aVar.c();
        int length = c.length;
        for (int i6 = 0; i6 < length; i6++) {
            c[i6] = creVar.a(c[i6]);
        }
        crd crdVar2 = (crd) creVar.d;
        int[] b2 = aVar.b();
        int i7 = b2[1];
        int i8 = b2[2];
        int i9 = b2[3];
        int i10 = b2[4];
        int i11 = 0;
        while (i11 < i7) {
            int i12 = 0;
            while (i12 < i8) {
                int i13 = 0;
                while (i13 < i9) {
                    int i14 = (i11 * i8 * i9 * i10) + (i12 * i9 * i10) + (i13 * i10);
                    int i15 = i14 + 4;
                    if (c[i15] > crdVar2.j()) {
                        a aVar2 = new a();
                        crdVar = crdVar2;
                        i2 = i10;
                        double d = i5;
                        float f = (float) ((((c[i14] * 2.0f) - 0.5d) + i13) * d);
                        i3 = i7;
                        i4 = i8;
                        float f2 = (float) ((((c[i14 + 1] * 2.0f) - 0.5d) + i12) * d);
                        int i16 = i14 + 2;
                        int i17 = i11 << 1;
                        float f3 = c[i16] * c[i16] * 4.0f * fArr[i17];
                        int i18 = i14 + 3;
                        float f4 = c[i18] * c[i18] * 4.0f * fArr[i17 + 1];
                        float f5 = f3 / 2.0f;
                        a.a(aVar2)[0] = f - f5;
                        float f6 = f4 / 2.0f;
                        a.a(aVar2)[1] = f2 - f6;
                        a.a(aVar2)[2] = f + f5;
                        a.a(aVar2)[3] = f2 + f6;
                        a.a(aVar2, c[i15]);
                        list.add(aVar2);
                    } else {
                        crdVar = crdVar2;
                        i2 = i10;
                        i3 = i7;
                        i4 = i8;
                    }
                    i13++;
                    creVar = this;
                    i10 = i2;
                    i5 = i;
                    crdVar2 = crdVar;
                    i7 = i3;
                    i8 = i4;
                }
                i12++;
                creVar = this;
                i5 = i;
                crdVar2 = crdVar2;
            }
            i11++;
            creVar = this;
            i5 = i;
            crdVar2 = crdVar2;
        }
    }

    private float a(float f) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a8218848", new Object[]{this, new Float(f)})).floatValue() : (float) (1.0d / (Math.exp(-f) + 1.0d));
    }

    /* loaded from: classes3.dex */
    public class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private float[] b;
        private float c;

        static {
            kge.a(-483967232);
        }

        private a() {
            this.b = new float[4];
        }

        public static /* synthetic */ float a(a aVar, float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("c73a3f6b", new Object[]{aVar, new Float(f)})).floatValue();
            }
            aVar.c = f;
            return f;
        }

        public static /* synthetic */ float[] a(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (float[]) ipChange.ipc$dispatch("c739d89c", new Object[]{aVar}) : aVar.b;
        }

        public static /* synthetic */ float b(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("267a2f16", new Object[]{aVar})).floatValue() : aVar.c;
        }
    }

    /* loaded from: classes3.dex */
    public class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public List<Float> f26465a;
        private List<RectF> c;

        static {
            kge.a(-959276368);
        }

        public b(List<RectF> list, List<Float> list2) {
            this.c = list;
            this.f26465a = list2;
        }

        public List<RectF> a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("627608df", new Object[]{this}) : this.c;
        }
    }
}
