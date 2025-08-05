package tb;

import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;

/* loaded from: classes2.dex */
public class ajh implements akd<Integer> {
    public static final ajh INSTANCE = new ajh();

    private ajh() {
    }

    @Override // tb.akd
    /* renamed from: a */
    public Integer b(JsonReader jsonReader, float f) throws IOException {
        return Integer.valueOf(Math.round(aji.b(jsonReader) * f));
    }
}
