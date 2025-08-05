package tb;

import com.airbnb.lottie.g;
import com.airbnb.lottie.model.c;
import com.airbnb.lottie.model.content.l;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;
import java.util.ArrayList;

/* loaded from: classes2.dex */
class ajc {

    /* renamed from: a  reason: collision with root package name */
    private static final JsonReader.a f25364a = JsonReader.a.a("ch", "size", "w", "style", "fFamily", "data");
    private static final JsonReader.a b = JsonReader.a.a("shapes");

    /* JADX INFO: Access modifiers changed from: package-private */
    public static c a(JsonReader jsonReader, g gVar) throws IOException {
        ArrayList arrayList = new ArrayList();
        jsonReader.c();
        String str = null;
        String str2 = null;
        double d = 0.0d;
        double d2 = 0.0d;
        char c = 0;
        while (jsonReader.e()) {
            int a2 = jsonReader.a(f25364a);
            if (a2 == 0) {
                c = jsonReader.i().charAt(0);
            } else if (a2 == 1) {
                d = jsonReader.k();
            } else if (a2 == 2) {
                d2 = jsonReader.k();
            } else if (a2 == 3) {
                str = jsonReader.i();
            } else if (a2 == 4) {
                str2 = jsonReader.i();
            } else if (a2 != 5) {
                jsonReader.h();
                jsonReader.m();
            } else {
                jsonReader.c();
                while (jsonReader.e()) {
                    if (jsonReader.a(b) != 0) {
                        jsonReader.h();
                        jsonReader.m();
                    } else {
                        jsonReader.a();
                        while (jsonReader.e()) {
                            arrayList.add((l) aix.a(jsonReader, gVar));
                        }
                        jsonReader.b();
                    }
                }
                jsonReader.d();
            }
        }
        jsonReader.d();
        return new c(arrayList, c, d, d2, str, str2);
    }
}
