package tb;

import android.graphics.PointF;
import com.airbnb.lottie.model.content.g;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;

/* loaded from: classes2.dex */
class ajt {

    /* renamed from: a  reason: collision with root package name */
    private static final JsonReader.a f25378a = JsonReader.a.a("nm", "p", "s", "r", "hd");

    /* JADX INFO: Access modifiers changed from: package-private */
    public static g a(JsonReader jsonReader, com.airbnb.lottie.g gVar) throws IOException {
        String str = null;
        ail<PointF, PointF> ailVar = null;
        aie aieVar = null;
        aia aiaVar = null;
        boolean z = false;
        while (jsonReader.e()) {
            int a2 = jsonReader.a(f25378a);
            if (a2 == 0) {
                str = jsonReader.i();
            } else if (a2 == 1) {
                ailVar = aiq.b(jsonReader, gVar);
            } else if (a2 == 2) {
                aieVar = ait.c(jsonReader, gVar);
            } else if (a2 == 3) {
                aiaVar = ait.a(jsonReader, gVar);
            } else if (a2 != 4) {
                jsonReader.m();
            } else {
                z = jsonReader.j();
            }
        }
        return new g(str, ailVar, aieVar, aiaVar, z);
    }
}
