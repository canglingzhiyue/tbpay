package tb;

import com.airbnb.lottie.g;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;

/* loaded from: classes2.dex */
class ajp {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static aho a(JsonReader jsonReader, g gVar) throws IOException {
        return new aho(gVar, ajj.a(jsonReader, gVar, akl.a(), ajq.INSTANCE, jsonReader.f() == JsonReader.Token.BEGIN_OBJECT, false));
    }
}
