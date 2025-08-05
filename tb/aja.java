package tb;

import com.airbnb.lottie.g;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;

/* loaded from: classes2.dex */
public class aja {

    /* renamed from: a  reason: collision with root package name */
    private static final JsonReader.a f25363a = JsonReader.a.a("ef");
    private static final JsonReader.a b = JsonReader.a.a("nm", "v");
    private ahz c;
    private aia d;
    private aia e;
    private aia f;
    private aia g;

    private void b(JsonReader jsonReader, g gVar) throws IOException {
        jsonReader.c();
        String str = "";
        while (jsonReader.e()) {
            int a2 = jsonReader.a(b);
            if (a2 != 0) {
                if (a2 != 1) {
                    jsonReader.h();
                } else {
                    char c = 65535;
                    switch (str.hashCode()) {
                        case 353103893:
                            if (str.equals("Distance")) {
                                c = 3;
                                break;
                            }
                            break;
                        case 397447147:
                            if (str.equals("Opacity")) {
                                c = 1;
                                break;
                            }
                            break;
                        case 1041377119:
                            if (str.equals("Direction")) {
                                c = 2;
                                break;
                            }
                            break;
                        case 1379387491:
                            if (str.equals("Shadow Color")) {
                                c = 0;
                                break;
                            }
                            break;
                        case 1383710113:
                            if (str.equals("Softness")) {
                                c = 4;
                                break;
                            }
                            break;
                    }
                    if (c == 0) {
                        this.c = ait.g(jsonReader, gVar);
                    } else if (c == 1) {
                        this.d = ait.a(jsonReader, gVar, false);
                    } else if (c == 2) {
                        this.e = ait.a(jsonReader, gVar, false);
                    } else if (c == 3) {
                        this.f = ait.a(jsonReader, gVar);
                    } else if (c == 4) {
                        this.g = ait.a(jsonReader, gVar);
                    }
                }
                jsonReader.m();
            } else {
                str = jsonReader.i();
            }
        }
        jsonReader.d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public aiz a(JsonReader jsonReader, g gVar) throws IOException {
        aia aiaVar;
        aia aiaVar2;
        aia aiaVar3;
        aia aiaVar4;
        while (jsonReader.e()) {
            if (jsonReader.a(f25363a) != 0) {
                jsonReader.h();
                jsonReader.m();
            } else {
                jsonReader.a();
                while (jsonReader.e()) {
                    b(jsonReader, gVar);
                }
                jsonReader.b();
            }
        }
        ahz ahzVar = this.c;
        if (ahzVar == null || (aiaVar = this.d) == null || (aiaVar2 = this.e) == null || (aiaVar3 = this.f) == null || (aiaVar4 = this.g) == null) {
            return null;
        }
        return new aiz(ahzVar, aiaVar, aiaVar2, aiaVar3, aiaVar4);
    }
}
