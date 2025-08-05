package tb;

import android.graphics.PointF;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;

/* loaded from: classes2.dex */
public class ajq implements akd<PointF> {
    public static final ajq INSTANCE = new ajq();

    private ajq() {
    }

    @Override // tb.akd
    /* renamed from: a */
    public PointF b(JsonReader jsonReader, float f) throws IOException {
        return aji.b(jsonReader, f);
    }
}
