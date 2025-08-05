package tb;

import com.airbnb.lottie.model.b;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;

/* loaded from: classes2.dex */
class ajd {

    /* renamed from: a  reason: collision with root package name */
    private static final JsonReader.a f25365a = JsonReader.a.a("fFamily", "fName", "fStyle", "ascent");

    /* JADX INFO: Access modifiers changed from: package-private */
    public static b a(JsonReader jsonReader) throws IOException {
        jsonReader.c();
        String str = null;
        String str2 = null;
        String str3 = null;
        float f = 0.0f;
        while (jsonReader.e()) {
            int a2 = jsonReader.a(f25365a);
            if (a2 == 0) {
                str = jsonReader.i();
            } else if (a2 == 1) {
                str2 = jsonReader.i();
            } else if (a2 == 2) {
                str3 = jsonReader.i();
            } else if (a2 != 3) {
                jsonReader.h();
                jsonReader.m();
            } else {
                f = (float) jsonReader.k();
            }
        }
        jsonReader.d();
        return new b(str, str2, str3, f);
    }
}
