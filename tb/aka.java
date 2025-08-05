package tb;

import com.airbnb.lottie.g;
import com.airbnb.lottie.model.content.m;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;

/* loaded from: classes2.dex */
class aka {

    /* renamed from: a  reason: collision with root package name */
    static JsonReader.a f25384a = JsonReader.a.a("nm", "ind", "ks", "hd");

    /* JADX INFO: Access modifiers changed from: package-private */
    public static m a(JsonReader jsonReader, g gVar) throws IOException {
        int i = 0;
        String str = null;
        aig aigVar = null;
        boolean z = false;
        while (jsonReader.e()) {
            int a2 = jsonReader.a(f25384a);
            if (a2 == 0) {
                str = jsonReader.i();
            } else if (a2 == 1) {
                i = jsonReader.l();
            } else if (a2 == 2) {
                aigVar = ait.e(jsonReader, gVar);
            } else if (a2 != 3) {
                jsonReader.m();
            } else {
                z = jsonReader.j();
            }
        }
        return new m(str, i, aigVar, z);
    }
}
