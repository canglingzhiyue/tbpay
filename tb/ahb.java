package tb;

import android.graphics.PointF;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.model.content.i;
import com.airbnb.lottie.model.content.j;
import com.airbnb.lottie.model.layer.a;
import java.util.ArrayList;
import java.util.List;
import tb.ahg;

/* loaded from: classes2.dex */
public class ahb implements ahd, ahg.a {

    /* renamed from: a  reason: collision with root package name */
    private final LottieDrawable f25335a;
    private final String b;
    private final ahg<Float, Float> c;
    private j d;

    public ahb(LottieDrawable lottieDrawable, a aVar, i iVar) {
        this.f25335a = lottieDrawable;
        this.b = iVar.a();
        this.c = iVar.b().a();
        aVar.a(this.c);
        this.c.a(this);
    }

    private static int a(int i, int i2) {
        return i - (b(i, i2) * i2);
    }

    private static int b(int i, int i2) {
        int i3 = i / i2;
        return ((i ^ i2) >= 0 || i2 * i3 == i) ? i3 : i3 - 1;
    }

    private j b(j jVar) {
        List<com.airbnb.lottie.model.a> c = jVar.c();
        boolean b = jVar.b();
        int size = c.size() - 1;
        int i = 0;
        while (size >= 0) {
            com.airbnb.lottie.model.a aVar = c.get(size);
            com.airbnb.lottie.model.a aVar2 = c.get(a(size - 1, c.size()));
            PointF c2 = (size != 0 || b) ? aVar2.c() : jVar.a();
            i = (!((size != 0 || b) ? aVar2.b() : c2).equals(c2) || !aVar.a().equals(c2) || (!jVar.b() && size == 0 && size == c.size() - 1)) ? i + 1 : i + 2;
            size--;
        }
        j jVar2 = this.d;
        if (jVar2 == null || jVar2.c().size() != i) {
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 < i; i2++) {
                arrayList.add(new com.airbnb.lottie.model.a());
            }
            this.d = new j(new PointF(0.0f, 0.0f), false, arrayList);
        }
        this.d.a(b);
        return this.d;
    }

    @Override // tb.ahd
    public j a(j jVar) {
        List<com.airbnb.lottie.model.a> list;
        boolean z;
        List<com.airbnb.lottie.model.a> c = jVar.c();
        if (c.size() <= 2) {
            return jVar;
        }
        float floatValue = this.c.g().floatValue();
        if (floatValue == 0.0f) {
            return jVar;
        }
        j b = b(jVar);
        b.a(jVar.a().x, jVar.a().y);
        List<com.airbnb.lottie.model.a> c2 = b.c();
        boolean b2 = jVar.b();
        int i = 0;
        int i2 = 0;
        while (i < c.size()) {
            com.airbnb.lottie.model.a aVar = c.get(i);
            com.airbnb.lottie.model.a aVar2 = c.get(a(i - 1, c.size()));
            com.airbnb.lottie.model.a aVar3 = c.get(a(i - 2, c.size()));
            PointF c3 = (i != 0 || b2) ? aVar2.c() : jVar.a();
            PointF b3 = (i != 0 || b2) ? aVar2.b() : c3;
            PointF a2 = aVar.a();
            PointF c4 = aVar3.c();
            PointF c5 = aVar.c();
            boolean z2 = !jVar.b() && i == 0 && i == c.size() + (-1);
            if (!b3.equals(c3) || !a2.equals(c3) || z2) {
                list = c;
                z = b2;
                com.airbnb.lottie.model.a aVar4 = c2.get(a(i2 - 1, c2.size()));
                aVar4.b(aVar2.c().x, aVar2.c().y);
                aVar4.c(aVar2.c().x, aVar2.c().y);
                c2.get(i2).a(aVar.c().x, aVar.c().y);
            } else {
                float f = c3.x - c4.x;
                float f2 = c3.y - c4.y;
                float f3 = c5.x - c3.x;
                float f4 = c5.y - c3.y;
                list = c;
                z = b2;
                float min = Math.min(floatValue / ((float) Math.hypot(f, f2)), 0.5f);
                float min2 = Math.min(floatValue / ((float) Math.hypot(f3, f4)), 0.5f);
                float f5 = c3.x + ((c4.x - c3.x) * min);
                float f6 = c3.y + ((c4.y - c3.y) * min);
                float f7 = c3.x + ((c5.x - c3.x) * min2);
                float f8 = c3.y + ((c5.y - c3.y) * min2);
                float f9 = f5 - ((f5 - c3.x) * 0.5519f);
                float f10 = f6 - ((f6 - c3.y) * 0.5519f);
                float f11 = f7 - ((f7 - c3.x) * 0.5519f);
                float f12 = f8 - ((f8 - c3.y) * 0.5519f);
                com.airbnb.lottie.model.a aVar5 = c2.get(a(i2 - 1, c2.size()));
                com.airbnb.lottie.model.a aVar6 = c2.get(i2);
                aVar5.b(f5, f6);
                aVar5.c(f5, f6);
                if (i == 0) {
                    b.a(f5, f6);
                }
                aVar6.a(f9, f10);
                i2++;
                aVar6.b(f11, f12);
                aVar6.c(f7, f8);
                c2.get(i2).a(f7, f8);
            }
            i2++;
            i++;
            c = list;
            b2 = z;
        }
        return b;
    }

    @Override // tb.agn
    public String a() {
        return this.b;
    }

    @Override // tb.agn
    public void a(List<agn> list, List<agn> list2) {
    }

    public ahg<Float, Float> b() {
        return this.c;
    }

    @Override // tb.ahg.a
    public void onValueChanged() {
        this.f25335a.invalidateSelf();
    }
}
