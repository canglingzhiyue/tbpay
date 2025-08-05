package tb;

import android.graphics.Color;
import android.graphics.PointF;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
class aji {

    /* renamed from: a  reason: collision with root package name */
    private static final JsonReader.a f25369a = JsonReader.a.a("x", "y");

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: tb.aji$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f25370a = new int[JsonReader.Token.values().length];

        static {
            try {
                f25370a[JsonReader.Token.NUMBER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f25370a[JsonReader.Token.BEGIN_ARRAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f25370a[JsonReader.Token.BEGIN_OBJECT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(JsonReader jsonReader) throws IOException {
        jsonReader.a();
        int k = (int) (jsonReader.k() * 255.0d);
        int k2 = (int) (jsonReader.k() * 255.0d);
        int k3 = (int) (jsonReader.k() * 255.0d);
        while (jsonReader.e()) {
            jsonReader.m();
        }
        jsonReader.b();
        return Color.argb(255, k, k2, k3);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static List<PointF> a(JsonReader jsonReader, float f) throws IOException {
        ArrayList arrayList = new ArrayList();
        jsonReader.a();
        while (jsonReader.f() == JsonReader.Token.BEGIN_ARRAY) {
            jsonReader.a();
            arrayList.add(b(jsonReader, f));
            jsonReader.b();
        }
        jsonReader.b();
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static float b(JsonReader jsonReader) throws IOException {
        JsonReader.Token f = jsonReader.f();
        int i = AnonymousClass1.f25370a[f.ordinal()];
        if (i != 1) {
            if (i != 2) {
                akh.c("Unknown value for token of type " + f);
                return 0.0f;
            }
            jsonReader.a();
            float k = (float) jsonReader.k();
            while (jsonReader.e()) {
                jsonReader.m();
            }
            jsonReader.b();
            return k;
        }
        return (float) jsonReader.k();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static PointF b(JsonReader jsonReader, float f) throws IOException {
        int i = AnonymousClass1.f25370a[jsonReader.f().ordinal()];
        if (i != 1) {
            if (i == 2) {
                return d(jsonReader, f);
            }
            if (i == 3) {
                return e(jsonReader, f);
            }
            akh.c("Unknown point starts with " + jsonReader.f());
            return new PointF();
        }
        return c(jsonReader, f);
    }

    private static PointF c(JsonReader jsonReader, float f) throws IOException {
        float k = (float) jsonReader.k();
        float k2 = (float) jsonReader.k();
        while (jsonReader.e()) {
            jsonReader.m();
        }
        return new PointF(k * f, k2 * f);
    }

    private static PointF d(JsonReader jsonReader, float f) throws IOException {
        jsonReader.a();
        float k = (float) jsonReader.k();
        float k2 = (float) jsonReader.k();
        while (jsonReader.f() != JsonReader.Token.END_ARRAY) {
            jsonReader.m();
        }
        jsonReader.b();
        return new PointF(k * f, k2 * f);
    }

    private static PointF e(JsonReader jsonReader, float f) throws IOException {
        jsonReader.c();
        float f2 = 0.0f;
        float f3 = 0.0f;
        while (jsonReader.e()) {
            int a2 = jsonReader.a(f25369a);
            if (a2 == 0) {
                f2 = b(jsonReader);
            } else if (a2 != 1) {
                jsonReader.h();
                jsonReader.m();
            } else {
                f3 = b(jsonReader);
            }
        }
        jsonReader.d();
        return new PointF(f2 * f, f3 * f);
    }
}
