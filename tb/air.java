package tb;

import com.airbnb.lottie.g;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;

/* loaded from: classes2.dex */
public class air {

    /* renamed from: a  reason: collision with root package name */
    private static final JsonReader.a f25356a = JsonReader.a.a("a");
    private static final JsonReader.a b = JsonReader.a.a("fc", "sc", "sw", "t");

    public static aij a(JsonReader jsonReader, g gVar) throws IOException {
        jsonReader.c();
        aij aijVar = null;
        while (jsonReader.e()) {
            if (jsonReader.a(f25356a) != 0) {
                jsonReader.h();
                jsonReader.m();
            } else {
                aijVar = b(jsonReader, gVar);
            }
        }
        jsonReader.d();
        return aijVar == null ? new aij(null, null, null, null) : aijVar;
    }

    private static aij b(JsonReader jsonReader, g gVar) throws IOException {
        jsonReader.c();
        ahz ahzVar = null;
        ahz ahzVar2 = null;
        aia aiaVar = null;
        aia aiaVar2 = null;
        while (jsonReader.e()) {
            int a2 = jsonReader.a(b);
            if (a2 == 0) {
                ahzVar = ait.g(jsonReader, gVar);
            } else if (a2 == 1) {
                ahzVar2 = ait.g(jsonReader, gVar);
            } else if (a2 == 2) {
                aiaVar = ait.a(jsonReader, gVar);
            } else if (a2 != 3) {
                jsonReader.h();
                jsonReader.m();
            } else {
                aiaVar2 = ait.a(jsonReader, gVar);
            }
        }
        jsonReader.d();
        return new aij(ahzVar, ahzVar2, aiaVar, aiaVar2);
    }
}
