package tb;

import com.airbnb.lottie.g;
import com.airbnb.lottie.model.content.h;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.alibaba.security.realidentity.o;
import com.taobao.android.msoa.c;
import java.io.IOException;

/* loaded from: classes2.dex */
class aju {

    /* renamed from: a  reason: collision with root package name */
    private static final JsonReader.a f25379a = JsonReader.a.a("nm", c.TAG, o.b, "tr", "hd");

    /* JADX INFO: Access modifiers changed from: package-private */
    public static h a(JsonReader jsonReader, g gVar) throws IOException {
        String str = null;
        aia aiaVar = null;
        aia aiaVar2 = null;
        aik aikVar = null;
        boolean z = false;
        while (jsonReader.e()) {
            int a2 = jsonReader.a(f25379a);
            if (a2 == 0) {
                str = jsonReader.i();
            } else if (a2 == 1) {
                aiaVar = ait.a(jsonReader, gVar, false);
            } else if (a2 == 2) {
                aiaVar2 = ait.a(jsonReader, gVar, false);
            } else if (a2 == 3) {
                aikVar = ais.a(jsonReader, gVar);
            } else if (a2 != 4) {
                jsonReader.m();
            } else {
                z = jsonReader.j();
            }
        }
        return new h(str, aiaVar, aiaVar2, aikVar, z);
    }
}
