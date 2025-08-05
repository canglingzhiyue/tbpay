package tb;

import com.airbnb.lottie.g;
import com.airbnb.lottie.model.content.a;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;

/* loaded from: classes2.dex */
class aiu {

    /* renamed from: a  reason: collision with root package name */
    private static final JsonReader.a f25358a = JsonReader.a.a("ef");
    private static final JsonReader.a b = JsonReader.a.a("ty", "v");

    /* JADX INFO: Access modifiers changed from: package-private */
    public static a a(JsonReader jsonReader, g gVar) throws IOException {
        a aVar = null;
        while (jsonReader.e()) {
            if (jsonReader.a(f25358a) != 0) {
                jsonReader.h();
                jsonReader.m();
            } else {
                jsonReader.a();
                while (jsonReader.e()) {
                    a b2 = b(jsonReader, gVar);
                    if (b2 != null) {
                        aVar = b2;
                    }
                }
                jsonReader.b();
            }
        }
        return aVar;
    }

    private static a b(JsonReader jsonReader, g gVar) throws IOException {
        jsonReader.c();
        a aVar = null;
        while (true) {
            boolean z = false;
            while (jsonReader.e()) {
                int a2 = jsonReader.a(b);
                if (a2 != 0) {
                    if (a2 != 1) {
                        jsonReader.h();
                    } else if (z) {
                        aVar = new a(ait.a(jsonReader, gVar));
                    }
                    jsonReader.m();
                } else if (jsonReader.l() == 0) {
                    z = true;
                }
            }
            jsonReader.d();
            return aVar;
        }
    }
}
