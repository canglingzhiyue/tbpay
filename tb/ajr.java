package tb;

import android.graphics.PointF;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;

/* loaded from: classes2.dex */
public class ajr implements akd<PointF> {
    public static final ajr INSTANCE = new ajr();

    private ajr() {
    }

    @Override // tb.akd
    /* renamed from: a */
    public PointF b(JsonReader jsonReader, float f) throws IOException {
        JsonReader.Token f2 = jsonReader.f();
        if (f2 != JsonReader.Token.BEGIN_ARRAY && f2 != JsonReader.Token.BEGIN_OBJECT) {
            if (f2 == JsonReader.Token.NUMBER) {
                PointF pointF = new PointF(((float) jsonReader.k()) * f, ((float) jsonReader.k()) * f);
                while (jsonReader.e()) {
                    jsonReader.m();
                }
                return pointF;
            }
            akh.c("Cannot convert json to point. Next token is " + f2);
            return new PointF();
        }
        return aji.b(jsonReader, f);
    }
}
