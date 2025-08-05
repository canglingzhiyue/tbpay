package tb;

import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;

/* loaded from: classes2.dex */
public class ajb implements akd<Float> {
    public static final ajb INSTANCE = new ajb();

    private ajb() {
    }

    @Override // tb.akd
    /* renamed from: a */
    public Float b(JsonReader jsonReader, float f) throws IOException {
        return Float.valueOf(aji.b(jsonReader) * f);
    }
}
