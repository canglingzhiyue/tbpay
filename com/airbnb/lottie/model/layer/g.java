package com.airbnb.lottie.model.layer;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.support.v4.util.LongSparseArray;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.m;
import com.airbnb.lottie.model.DocumentData;
import com.airbnb.lottie.model.content.l;
import com.airbnb.lottie.s;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.ago;
import tb.ahg;
import tb.ahu;
import tb.ahw;
import tb.aij;
import tb.akl;
import tb.ako;

/* loaded from: classes2.dex */
public class g extends a {
    private final StringBuilder g;
    private final RectF h;
    private final Matrix i;
    private final Paint j;
    private final Paint k;
    private final Map<com.airbnb.lottie.model.c, List<ago>> l;
    private final LongSparseArray<String> m;
    private final ahu n;
    private final LottieDrawable o;
    private final com.airbnb.lottie.g p;
    private ahg<Integer, Integer> q;
    private ahg<Integer, Integer> r;
    private ahg<Integer, Integer> s;
    private ahg<Integer, Integer> t;
    private ahg<Float, Float> u;
    private ahg<Float, Float> v;
    private ahg<Float, Float> w;
    private ahg<Float, Float> x;
    private ahg<Float, Float> y;
    private ahg<Typeface, Typeface> z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.airbnb.lottie.model.layer.g$3  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class AnonymousClass3 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f1780a = new int[DocumentData.Justification.values().length];

        static {
            try {
                f1780a[DocumentData.Justification.LEFT_ALIGN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1780a[DocumentData.Justification.RIGHT_ALIGN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1780a[DocumentData.Justification.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public g(LottieDrawable lottieDrawable, Layer layer) {
        super(lottieDrawable, layer);
        this.g = new StringBuilder(2);
        this.h = new RectF();
        this.i = new Matrix();
        this.j = new Paint(1) { // from class: com.airbnb.lottie.model.layer.g.1
            {
                setStyle(Paint.Style.FILL);
            }
        };
        this.k = new Paint(1) { // from class: com.airbnb.lottie.model.layer.g.2
            {
                setStyle(Paint.Style.STROKE);
            }
        };
        this.l = new HashMap();
        this.m = new LongSparseArray<>();
        this.o = lottieDrawable;
        this.p = layer.a();
        this.n = layer.s().a();
        this.n.a(this);
        a(this.n);
        aij t = layer.t();
        if (t != null && t.f25350a != null) {
            this.q = t.f25350a.a();
            this.q.a(this);
            a(this.q);
        }
        if (t != null && t.b != null) {
            this.s = t.b.a();
            this.s.a(this);
            a(this.s);
        }
        if (t != null && t.c != null) {
            this.u = t.c.a();
            this.u.a(this);
            a(this.u);
        }
        if (t == null || t.d == null) {
            return;
        }
        this.w = t.d.a();
        this.w.a(this);
        a(this.w);
    }

    private float a(String str, com.airbnb.lottie.model.b bVar, float f, float f2) {
        float f3 = 0.0f;
        for (int i = 0; i < str.length(); i++) {
            com.airbnb.lottie.model.c cVar = this.p.j().get(com.airbnb.lottie.model.c.a(str.charAt(i), bVar.a(), bVar.c()));
            if (cVar != null) {
                f3 = (float) (f3 + (cVar.b() * f * akl.a() * f2));
            }
        }
        return f3;
    }

    private Typeface a(com.airbnb.lottie.model.b bVar) {
        Typeface g;
        ahg<Typeface, Typeface> ahgVar = this.z;
        if (ahgVar == null || (g = ahgVar.g()) == null) {
            Typeface a2 = this.o.a(bVar.a(), bVar.c());
            return a2 != null ? a2 : bVar.d();
        }
        return g;
    }

    private String a(String str, int i) {
        int codePointAt = str.codePointAt(i);
        int charCount = Character.charCount(codePointAt) + i;
        while (charCount < str.length()) {
            int codePointAt2 = str.codePointAt(charCount);
            if (!a(codePointAt2)) {
                break;
            }
            charCount += Character.charCount(codePointAt2);
            codePointAt = (codePointAt * 31) + codePointAt2;
        }
        long j = codePointAt;
        if (this.m.indexOfKey(j) >= 0) {
            return this.m.get(j);
        }
        this.g.setLength(0);
        while (i < charCount) {
            int codePointAt3 = str.codePointAt(i);
            this.g.appendCodePoint(codePointAt3);
            i += Character.charCount(codePointAt3);
        }
        String sb = this.g.toString();
        this.m.put(j, sb);
        return sb;
    }

    private List<ago> a(com.airbnb.lottie.model.c cVar) {
        if (this.l.containsKey(cVar)) {
            return this.l.get(cVar);
        }
        List<l> a2 = cVar.a();
        int size = a2.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            arrayList.add(new ago(this.o, this, a2.get(i)));
        }
        this.l.put(cVar, arrayList);
        return arrayList;
    }

    private List<String> a(String str) {
        return Arrays.asList(str.replaceAll("\r\n", "\r").replaceAll("\n", "\r").split("\r"));
    }

    private void a(Path path, Paint paint, Canvas canvas) {
        if (paint.getColor() == 0) {
            return;
        }
        if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == 0.0f) {
            return;
        }
        canvas.drawPath(path, paint);
    }

    private void a(DocumentData.Justification justification, Canvas canvas, float f) {
        int i = AnonymousClass3.f1780a[justification.ordinal()];
        if (i != 1) {
            if (i == 2) {
                canvas.translate(-f, 0.0f);
            } else if (i != 3) {
            } else {
                canvas.translate((-f) / 2.0f, 0.0f);
            }
        }
    }

    private void a(DocumentData documentData, Matrix matrix, com.airbnb.lottie.model.b bVar, Canvas canvas) {
        ahg<Float, Float> ahgVar = this.y;
        float floatValue = (ahgVar != null ? ahgVar.g().floatValue() : documentData.c) / 100.0f;
        float a2 = akl.a(matrix);
        String str = documentData.f1748a;
        float a3 = documentData.f * akl.a();
        List<String> a4 = a(str);
        int size = a4.size();
        for (int i = 0; i < size; i++) {
            String str2 = a4.get(i);
            float a5 = a(str2, bVar, floatValue, a2);
            canvas.save();
            a(documentData.d, canvas, a5);
            canvas.translate(0.0f, (i * a3) - (((size - 1) * a3) / 2.0f));
            a(str2, documentData, matrix, bVar, canvas, a2, floatValue);
            canvas.restore();
        }
    }

    private void a(DocumentData documentData, com.airbnb.lottie.model.b bVar, Canvas canvas) {
        Typeface a2 = a(bVar);
        if (a2 == null) {
            return;
        }
        String str = documentData.f1748a;
        s z = this.o.z();
        if (z != null) {
            str = z.c(a(), str);
        }
        this.j.setTypeface(a2);
        ahg<Float, Float> ahgVar = this.y;
        float floatValue = ahgVar != null ? ahgVar.g().floatValue() : documentData.c;
        this.j.setTextSize(akl.a() * floatValue);
        this.k.setTypeface(this.j.getTypeface());
        this.k.setTextSize(this.j.getTextSize());
        float a3 = documentData.f * akl.a();
        float f = documentData.e / 10.0f;
        ahg<Float, Float> ahgVar2 = this.x;
        if (ahgVar2 != null || (ahgVar2 = this.w) != null) {
            f += ahgVar2.g().floatValue();
        }
        float a4 = ((f * akl.a()) * floatValue) / 100.0f;
        List<String> a5 = a(str);
        int size = a5.size();
        for (int i = 0; i < size; i++) {
            String str2 = a5.get(i);
            float measureText = this.k.measureText(str2) + ((str2.length() - 1) * a4);
            canvas.save();
            a(documentData.d, canvas, measureText);
            canvas.translate(0.0f, (i * a3) - (((size - 1) * a3) / 2.0f));
            a(str2, documentData, canvas, a4);
            canvas.restore();
        }
    }

    private void a(com.airbnb.lottie.model.c cVar, Matrix matrix, float f, DocumentData documentData, Canvas canvas) {
        Paint paint;
        List<ago> a2 = a(cVar);
        for (int i = 0; i < a2.size(); i++) {
            Path d = a2.get(i).d();
            d.computeBounds(this.h, false);
            this.i.set(matrix);
            this.i.preTranslate(0.0f, (-documentData.g) * akl.a());
            this.i.preScale(f, f);
            d.transform(this.i);
            if (documentData.k) {
                a(d, this.j, canvas);
                paint = this.k;
            } else {
                a(d, this.k, canvas);
                paint = this.j;
            }
            a(d, paint, canvas);
        }
    }

    private void a(String str, Paint paint, Canvas canvas) {
        if (paint.getColor() == 0) {
            return;
        }
        if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == 0.0f) {
            return;
        }
        canvas.drawText(str, 0, str.length(), 0.0f, 0.0f, paint);
    }

    private void a(String str, DocumentData documentData, Canvas canvas) {
        Paint paint;
        if (documentData.k) {
            a(str, this.j, canvas);
            paint = this.k;
        } else {
            a(str, this.k, canvas);
            paint = this.j;
        }
        a(str, paint, canvas);
    }

    private void a(String str, DocumentData documentData, Canvas canvas, float f) {
        int i = 0;
        while (i < str.length()) {
            String a2 = a(str, i);
            i += a2.length();
            a(a2, documentData, canvas);
            canvas.translate(this.j.measureText(a2) + f, 0.0f);
        }
    }

    private void a(String str, DocumentData documentData, Matrix matrix, com.airbnb.lottie.model.b bVar, Canvas canvas, float f, float f2) {
        for (int i = 0; i < str.length(); i++) {
            com.airbnb.lottie.model.c cVar = this.p.j().get(com.airbnb.lottie.model.c.a(str.charAt(i), bVar.a(), bVar.c()));
            if (cVar != null) {
                a(cVar, matrix, f2, documentData, canvas);
                float b = ((float) cVar.b()) * f2 * akl.a() * f;
                float f3 = documentData.e / 10.0f;
                ahg<Float, Float> ahgVar = this.x;
                if (ahgVar != null || (ahgVar = this.w) != null) {
                    f3 += ahgVar.g().floatValue();
                }
                canvas.translate(b + (f3 * f), 0.0f);
            }
        }
    }

    private boolean a(int i) {
        return Character.getType(i) == 16 || Character.getType(i) == 27 || Character.getType(i) == 6 || Character.getType(i) == 28 || Character.getType(i) == 8 || Character.getType(i) == 19;
    }

    @Override // com.airbnb.lottie.model.layer.a, tb.agp
    public void a(RectF rectF, Matrix matrix, boolean z) {
        super.a(rectF, matrix, z);
        rectF.set(0.0f, 0.0f, this.p.d().width(), this.p.d().height());
    }

    @Override // com.airbnb.lottie.model.layer.a, com.airbnb.lottie.model.e
    public <T> void a(T t, ako<T> akoVar) {
        ahg<?, ?> ahgVar;
        super.a((g) t, (ako<g>) akoVar);
        if (t == m.COLOR) {
            ahg<Integer, Integer> ahgVar2 = this.r;
            if (ahgVar2 != null) {
                b(ahgVar2);
            }
            if (akoVar == null) {
                this.r = null;
                return;
            }
            this.r = new ahw(akoVar);
            this.r.a(this);
            ahgVar = this.r;
        } else if (t == m.STROKE_COLOR) {
            ahg<Integer, Integer> ahgVar3 = this.t;
            if (ahgVar3 != null) {
                b(ahgVar3);
            }
            if (akoVar == null) {
                this.t = null;
                return;
            }
            this.t = new ahw(akoVar);
            this.t.a(this);
            ahgVar = this.t;
        } else if (t == m.STROKE_WIDTH) {
            ahg<Float, Float> ahgVar4 = this.v;
            if (ahgVar4 != null) {
                b(ahgVar4);
            }
            if (akoVar == null) {
                this.v = null;
                return;
            }
            this.v = new ahw(akoVar);
            this.v.a(this);
            ahgVar = this.v;
        } else if (t == m.TEXT_TRACKING) {
            ahg<Float, Float> ahgVar5 = this.x;
            if (ahgVar5 != null) {
                b(ahgVar5);
            }
            if (akoVar == null) {
                this.x = null;
                return;
            }
            this.x = new ahw(akoVar);
            this.x.a(this);
            ahgVar = this.x;
        } else if (t == m.TEXT_SIZE) {
            ahg<Float, Float> ahgVar6 = this.y;
            if (ahgVar6 != null) {
                b(ahgVar6);
            }
            if (akoVar == null) {
                this.y = null;
                return;
            }
            this.y = new ahw(akoVar);
            this.y.a(this);
            ahgVar = this.y;
        } else if (t != m.TYPEFACE) {
            if (t != m.TEXT) {
                return;
            }
            this.n.b(akoVar);
            return;
        } else {
            ahg<Typeface, Typeface> ahgVar7 = this.z;
            if (ahgVar7 != null) {
                b(ahgVar7);
            }
            if (akoVar == null) {
                this.z = null;
                return;
            }
            this.z = new ahw(akoVar);
            this.z.a(this);
            ahgVar = this.z;
        }
        a(ahgVar);
    }

    @Override // com.airbnb.lottie.model.layer.a
    void b(Canvas canvas, Matrix matrix, int i) {
        canvas.save();
        if (!this.o.A()) {
            canvas.concat(matrix);
        }
        DocumentData g = this.n.g();
        com.airbnb.lottie.model.b bVar = this.p.k().get(g.b);
        if (bVar == null) {
            canvas.restore();
            return;
        }
        ahg<Integer, Integer> ahgVar = this.r;
        if (ahgVar == null && (ahgVar = this.q) == null) {
            this.j.setColor(g.h);
        } else {
            this.j.setColor(ahgVar.g().intValue());
        }
        ahg<Integer, Integer> ahgVar2 = this.t;
        if (ahgVar2 == null && (ahgVar2 = this.s) == null) {
            this.k.setColor(g.i);
        } else {
            this.k.setColor(ahgVar2.g().intValue());
        }
        int intValue = ((this.d.a() == null ? 100 : this.d.a().g().intValue()) * 255) / 100;
        this.j.setAlpha(intValue);
        this.k.setAlpha(intValue);
        ahg<Float, Float> ahgVar3 = this.v;
        if (ahgVar3 == null && (ahgVar3 = this.u) == null) {
            this.k.setStrokeWidth(g.j * akl.a() * akl.a(matrix));
        } else {
            this.k.setStrokeWidth(ahgVar3.g().floatValue());
        }
        if (this.o.A()) {
            a(g, matrix, bVar, canvas);
        } else {
            a(g, bVar, canvas);
        }
        canvas.restore();
    }
}
