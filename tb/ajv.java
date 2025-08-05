package tb;

import com.airbnb.lottie.g;
import com.airbnb.lottie.model.content.i;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;

/* loaded from: classes2.dex */
public class ajv {

    /* renamed from: a  reason: collision with root package name */
    private static final JsonReader.a f25380a = JsonReader.a.a("nm", "r", "hd");

    /* JADX INFO: Access modifiers changed from: package-private */
    public static i a(JsonReader jsonReader, g gVar) throws IOException {
        boolean z = false;
        String str = null;
        aia aiaVar = null;
        while (jsonReader.e()) {
            int a2 = jsonReader.a(f25380a);
            if (a2 == 0) {
                str = jsonReader.i();
            } else if (a2 == 1) {
                aiaVar = ait.a(jsonReader, gVar, true);
            } else if (a2 != 2) {
                jsonReader.m();
            } else {
                z = jsonReader.j();
            }
        }
        if (z) {
            return null;
        }
        return new i(str, aiaVar);
    }
}
