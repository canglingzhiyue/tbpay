package tb;

import android.graphics.PointF;
import android.support.v4.util.SparseArrayCompat;
import android.support.v4.view.animation.PathInterpolatorCompat;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import com.airbnb.lottie.g;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.alibaba.analytics.core.sync.q;
import com.alibaba.security.realidentity.o;
import java.io.IOException;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
class ajj {
    private static SparseArrayCompat<WeakReference<Interpolator>> d;
    private static final Interpolator c = new LinearInterpolator();

    /* renamed from: a  reason: collision with root package name */
    static JsonReader.a f25371a = JsonReader.a.a("t", "s", "e", o.b, q.MSGTYPE_INTERVAL, "h", "to", "ti");
    static JsonReader.a b = JsonReader.a.a("x", "y");

    ajj() {
    }

    private static SparseArrayCompat<WeakReference<Interpolator>> a() {
        if (d == null) {
            d = new SparseArrayCompat<>();
        }
        return d;
    }

    private static Interpolator a(PointF pointF, PointF pointF2) {
        Interpolator create;
        pointF.x = akk.b(pointF.x, -1.0f, 1.0f);
        pointF.y = akk.b(pointF.y, -100.0f, 100.0f);
        pointF2.x = akk.b(pointF2.x, -1.0f, 1.0f);
        pointF2.y = akk.b(pointF2.y, -100.0f, 100.0f);
        int a2 = akl.a(pointF.x, pointF.y, pointF2.x, pointF2.y);
        WeakReference<Interpolator> a3 = a(a2);
        Interpolator interpolator = a3 != null ? a3.get() : null;
        if (a3 == null || interpolator == null) {
            try {
                create = PathInterpolatorCompat.create(pointF.x, pointF.y, pointF2.x, pointF2.y);
            } catch (IllegalArgumentException e) {
                create = "The Path cannot loop back on itself.".equals(e.getMessage()) ? PathInterpolatorCompat.create(Math.min(pointF.x, 1.0f), pointF.y, Math.max(pointF2.x, 0.0f), pointF2.y) : new LinearInterpolator();
            }
            interpolator = create;
            try {
                a(a2, new WeakReference(interpolator));
            } catch (ArrayIndexOutOfBoundsException unused) {
            }
        }
        return interpolator;
    }

    private static WeakReference<Interpolator> a(int i) {
        WeakReference<Interpolator> weakReference;
        synchronized (ajj.class) {
            weakReference = a().get(i);
        }
        return weakReference;
    }

    private static <T> akm<T> a(g gVar, JsonReader jsonReader, float f, akd<T> akdVar) throws IOException {
        Interpolator a2;
        T t;
        jsonReader.c();
        PointF pointF = null;
        PointF pointF2 = null;
        T t2 = null;
        T t3 = null;
        PointF pointF3 = null;
        PointF pointF4 = null;
        boolean z = false;
        float f2 = 0.0f;
        while (jsonReader.e()) {
            switch (jsonReader.a(f25371a)) {
                case 0:
                    f2 = (float) jsonReader.k();
                    break;
                case 1:
                    t3 = akdVar.b(jsonReader, f);
                    break;
                case 2:
                    t2 = akdVar.b(jsonReader, f);
                    break;
                case 3:
                    pointF = aji.b(jsonReader, 1.0f);
                    break;
                case 4:
                    pointF2 = aji.b(jsonReader, 1.0f);
                    break;
                case 5:
                    if (jsonReader.l() != 1) {
                        z = false;
                        break;
                    } else {
                        z = true;
                        break;
                    }
                case 6:
                    pointF3 = aji.b(jsonReader, f);
                    break;
                case 7:
                    pointF4 = aji.b(jsonReader, f);
                    break;
                default:
                    jsonReader.m();
                    break;
            }
        }
        jsonReader.d();
        if (z) {
            a2 = c;
            t = t3;
        } else {
            a2 = (pointF == null || pointF2 == null) ? c : a(pointF, pointF2);
            t = t2;
        }
        akm<T> akmVar = new akm<>(gVar, t3, t, a2, f2, null);
        akmVar.h = pointF3;
        akmVar.i = pointF4;
        return akmVar;
    }

    private static <T> akm<T> a(JsonReader jsonReader, float f, akd<T> akdVar) throws IOException {
        return new akm<>(akdVar.b(jsonReader, f));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> akm<T> a(JsonReader jsonReader, g gVar, float f, akd<T> akdVar, boolean z, boolean z2) throws IOException {
        return (!z || !z2) ? z ? a(gVar, jsonReader, f, akdVar) : a(jsonReader, f, akdVar) : b(gVar, jsonReader, f, akdVar);
    }

    private static void a(int i, WeakReference<Interpolator> weakReference) {
        synchronized (ajj.class) {
            d.put(i, weakReference);
        }
    }

    private static <T> akm<T> b(g gVar, JsonReader jsonReader, float f, akd<T> akdVar) throws IOException {
        Interpolator interpolator;
        Interpolator a2;
        Interpolator interpolator2;
        T t;
        PointF pointF;
        akm<T> akmVar;
        PointF pointF2;
        float f2;
        PointF pointF3;
        float f3;
        jsonReader.c();
        PointF pointF4 = null;
        boolean z = false;
        PointF pointF5 = null;
        PointF pointF6 = null;
        PointF pointF7 = null;
        T t2 = null;
        PointF pointF8 = null;
        PointF pointF9 = null;
        PointF pointF10 = null;
        float f4 = 0.0f;
        PointF pointF11 = null;
        T t3 = null;
        while (jsonReader.e()) {
            switch (jsonReader.a(f25371a)) {
                case 0:
                    pointF2 = pointF4;
                    f4 = (float) jsonReader.k();
                    break;
                case 1:
                    pointF2 = pointF4;
                    t2 = akdVar.b(jsonReader, f);
                    break;
                case 2:
                    pointF2 = pointF4;
                    t3 = akdVar.b(jsonReader, f);
                    break;
                case 3:
                    pointF2 = pointF4;
                    f2 = f4;
                    PointF pointF12 = pointF11;
                    if (jsonReader.f() != JsonReader.Token.BEGIN_OBJECT) {
                        pointF5 = aji.b(jsonReader, f);
                        f4 = f2;
                        pointF11 = pointF12;
                        break;
                    } else {
                        jsonReader.c();
                        float f5 = 0.0f;
                        float f6 = 0.0f;
                        float f7 = 0.0f;
                        float f8 = 0.0f;
                        while (jsonReader.e()) {
                            int a3 = jsonReader.a(b);
                            if (a3 != 0) {
                                if (a3 != 1) {
                                    jsonReader.m();
                                } else if (jsonReader.f() == JsonReader.Token.NUMBER) {
                                    f8 = (float) jsonReader.k();
                                    f6 = f8;
                                } else {
                                    jsonReader.a();
                                    f6 = (float) jsonReader.k();
                                    f8 = jsonReader.f() == JsonReader.Token.NUMBER ? (float) jsonReader.k() : f6;
                                    jsonReader.b();
                                }
                            } else if (jsonReader.f() == JsonReader.Token.NUMBER) {
                                f7 = (float) jsonReader.k();
                                f5 = f7;
                            } else {
                                jsonReader.a();
                                f5 = (float) jsonReader.k();
                                f7 = jsonReader.f() == JsonReader.Token.NUMBER ? (float) jsonReader.k() : f5;
                                jsonReader.b();
                            }
                        }
                        PointF pointF13 = new PointF(f5, f6);
                        PointF pointF14 = new PointF(f7, f8);
                        jsonReader.d();
                        pointF8 = pointF14;
                        pointF7 = pointF13;
                        pointF11 = pointF12;
                        f4 = f2;
                        break;
                    }
                case 4:
                    if (jsonReader.f() != JsonReader.Token.BEGIN_OBJECT) {
                        pointF2 = pointF4;
                        pointF6 = aji.b(jsonReader, f);
                        break;
                    } else {
                        jsonReader.c();
                        float f9 = 0.0f;
                        float f10 = 0.0f;
                        float f11 = 0.0f;
                        float f12 = 0.0f;
                        while (jsonReader.e()) {
                            PointF pointF15 = pointF11;
                            int a4 = jsonReader.a(b);
                            if (a4 != 0) {
                                pointF3 = pointF4;
                                if (a4 != 1) {
                                    jsonReader.m();
                                } else if (jsonReader.f() == JsonReader.Token.NUMBER) {
                                    f12 = (float) jsonReader.k();
                                    f4 = f4;
                                    f10 = f12;
                                } else {
                                    f3 = f4;
                                    jsonReader.a();
                                    f10 = (float) jsonReader.k();
                                    f12 = jsonReader.f() == JsonReader.Token.NUMBER ? (float) jsonReader.k() : f10;
                                    jsonReader.b();
                                    f4 = f3;
                                }
                            } else {
                                pointF3 = pointF4;
                                f3 = f4;
                                if (jsonReader.f() == JsonReader.Token.NUMBER) {
                                    f11 = (float) jsonReader.k();
                                    f4 = f3;
                                    f9 = f11;
                                } else {
                                    jsonReader.a();
                                    f9 = (float) jsonReader.k();
                                    f11 = jsonReader.f() == JsonReader.Token.NUMBER ? (float) jsonReader.k() : f9;
                                    jsonReader.b();
                                    f4 = f3;
                                }
                            }
                            pointF11 = pointF15;
                            pointF4 = pointF3;
                        }
                        pointF2 = pointF4;
                        f2 = f4;
                        PointF pointF16 = new PointF(f9, f10);
                        PointF pointF17 = new PointF(f11, f12);
                        jsonReader.d();
                        pointF10 = pointF17;
                        pointF9 = pointF16;
                        f4 = f2;
                        break;
                    }
                case 5:
                    if (jsonReader.l() == 1) {
                        z = true;
                    } else {
                        z = false;
                        continue;
                    }
                case 6:
                    pointF11 = aji.b(jsonReader, f);
                    continue;
                case 7:
                    pointF4 = aji.b(jsonReader, f);
                    continue;
                default:
                    pointF2 = pointF4;
                    jsonReader.m();
                    break;
            }
            pointF4 = pointF2;
        }
        PointF pointF18 = pointF4;
        float f13 = f4;
        PointF pointF19 = pointF11;
        jsonReader.d();
        if (z) {
            interpolator = c;
            t = t2;
        } else {
            if (pointF5 != null && pointF6 != null) {
                interpolator = a(pointF5, pointF6);
            } else if (pointF7 != null && pointF8 != null && pointF9 != null && pointF10 != null) {
                Interpolator a5 = a(pointF7, pointF9);
                a2 = a(pointF8, pointF10);
                interpolator2 = a5;
                t = t3;
                interpolator = null;
                if (interpolator2 != null || a2 == null) {
                    pointF = pointF19;
                    akmVar = new akm<>(gVar, t2, t, interpolator, f13, null);
                } else {
                    pointF = pointF19;
                    akmVar = new akm<>(gVar, t2, t, interpolator2, a2, f13, null);
                }
                akmVar.h = pointF;
                akmVar.i = pointF18;
                return akmVar;
            } else {
                interpolator = c;
            }
            t = t3;
        }
        interpolator2 = null;
        a2 = null;
        if (interpolator2 != null) {
        }
        pointF = pointF19;
        akmVar = new akm<>(gVar, t2, t, interpolator, f13, null);
        akmVar.h = pointF;
        akmVar.i = pointF18;
        return akmVar;
    }
}
