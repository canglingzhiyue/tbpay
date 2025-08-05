package tb;

import com.airbnb.lottie.g;
import com.airbnb.lottie.model.content.ShapeTrimPath;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.alibaba.security.realidentity.o;
import java.io.IOException;

/* loaded from: classes2.dex */
class akc {

    /* renamed from: a  reason: collision with root package name */
    private static final JsonReader.a f25386a = JsonReader.a.a("s", "e", o.b, "nm", "m", "hd");

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ShapeTrimPath a(JsonReader jsonReader, g gVar) throws IOException {
        String str = null;
        ShapeTrimPath.Type type = null;
        aia aiaVar = null;
        aia aiaVar2 = null;
        aia aiaVar3 = null;
        boolean z = false;
        while (jsonReader.e()) {
            int a2 = jsonReader.a(f25386a);
            if (a2 == 0) {
                aiaVar = ait.a(jsonReader, gVar, false);
            } else if (a2 == 1) {
                aiaVar2 = ait.a(jsonReader, gVar, false);
            } else if (a2 == 2) {
                aiaVar3 = ait.a(jsonReader, gVar, false);
            } else if (a2 == 3) {
                str = jsonReader.i();
            } else if (a2 == 4) {
                type = ShapeTrimPath.Type.forId(jsonReader.l());
            } else if (a2 != 5) {
                jsonReader.m();
            } else {
                z = jsonReader.j();
            }
        }
        return new ShapeTrimPath(str, type, aiaVar, aiaVar2, aiaVar3, z);
    }
}
