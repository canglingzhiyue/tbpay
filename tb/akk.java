package tb;

import android.graphics.Path;
import android.graphics.PointF;
import com.airbnb.lottie.model.a;
import com.airbnb.lottie.model.content.j;
import com.airbnb.lottie.model.d;
import java.util.List;

/* loaded from: classes2.dex */
public class akk {

    /* renamed from: a  reason: collision with root package name */
    private static final PointF f25393a = new PointF();

    public static double a(double d, double d2, double d3) {
        return d + (d3 * (d2 - d));
    }

    public static float a(float f, float f2, float f3) {
        return f + (f3 * (f2 - f));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(float f, float f2) {
        return a((int) f, (int) f2);
    }

    private static int a(int i, int i2) {
        return i - (i2 * b(i, i2));
    }

    public static int a(int i, int i2, float f) {
        return (int) (i + (f * (i2 - i)));
    }

    public static int a(int i, int i2, int i3) {
        return Math.max(i2, Math.min(i3, i));
    }

    public static PointF a(PointF pointF, PointF pointF2) {
        return new PointF(pointF.x + pointF2.x, pointF.y + pointF2.y);
    }

    public static void a(j jVar, Path path) {
        path.reset();
        PointF a2 = jVar.a();
        path.moveTo(a2.x, a2.y);
        f25393a.set(a2.x, a2.y);
        for (int i = 0; i < jVar.c().size(); i++) {
            a aVar = jVar.c().get(i);
            PointF a3 = aVar.a();
            PointF b = aVar.b();
            PointF c = aVar.c();
            if (!a3.equals(f25393a) || !b.equals(c)) {
                path.cubicTo(a3.x, a3.y, b.x, b.y, c.x, c.y);
            } else {
                path.lineTo(c.x, c.y);
            }
            f25393a.set(c.x, c.y);
        }
        if (jVar.b()) {
            path.close();
        }
    }

    public static void a(d dVar, int i, List<d> list, d dVar2, agv agvVar) {
        if (dVar.c(agvVar.a(), i)) {
            list.add(dVar2.a(agvVar.a()).a(agvVar));
        }
    }

    public static double b(double d, double d2, double d3) {
        return Math.max(d2, Math.min(d3, d));
    }

    public static float b(float f, float f2, float f3) {
        return Math.max(f2, Math.min(f3, f));
    }

    private static int b(int i, int i2) {
        int i3 = i / i2;
        return (((i ^ i2) >= 0) || i % i2 == 0) ? i3 : i3 - 1;
    }

    public static boolean c(float f, float f2, float f3) {
        return f >= f2 && f <= f3;
    }
}
