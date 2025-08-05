package tb;

import android.graphics.Color;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;

/* loaded from: classes2.dex */
public class aiw implements akd<Integer> {
    public static final aiw INSTANCE = new aiw();

    private aiw() {
    }

    @Override // tb.akd
    /* renamed from: a */
    public Integer b(JsonReader jsonReader, float f) throws IOException {
        boolean z = jsonReader.f() == JsonReader.Token.BEGIN_ARRAY;
        if (z) {
            jsonReader.a();
        }
        double k = jsonReader.k();
        double k2 = jsonReader.k();
        double k3 = jsonReader.k();
        double k4 = jsonReader.f() == JsonReader.Token.NUMBER ? jsonReader.k() : 1.0d;
        if (z) {
            jsonReader.b();
        }
        if (k <= 1.0d && k2 <= 1.0d && k3 <= 1.0d) {
            k *= 255.0d;
            k2 *= 255.0d;
            k3 *= 255.0d;
            if (k4 <= 1.0d) {
                k4 *= 255.0d;
            }
        }
        return Integer.valueOf(Color.argb((int) k4, (int) k, (int) k2, (int) k3));
    }
}
