package tb;

import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;

/* loaded from: classes2.dex */
public class ajw implements akd<akp> {
    public static final ajw INSTANCE = new ajw();

    private ajw() {
    }

    @Override // tb.akd
    /* renamed from: a */
    public akp b(JsonReader jsonReader, float f) throws IOException {
        boolean z = jsonReader.f() == JsonReader.Token.BEGIN_ARRAY;
        if (z) {
            jsonReader.a();
        }
        float k = (float) jsonReader.k();
        float k2 = (float) jsonReader.k();
        while (jsonReader.e()) {
            jsonReader.m();
        }
        if (z) {
            jsonReader.b();
        }
        return new akp((k / 100.0f) * f, (k2 / 100.0f) * f);
    }
}
