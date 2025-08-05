package tb;

import android.graphics.Path;
import com.airbnb.lottie.g;
import com.airbnb.lottie.model.content.k;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.alibaba.security.realidentity.o;
import com.taobao.android.msoa.c;
import java.io.IOException;
import java.util.Collections;

/* loaded from: classes2.dex */
class ajy {

    /* renamed from: a  reason: collision with root package name */
    private static final JsonReader.a f25382a = JsonReader.a.a("nm", c.TAG, o.b, "fillEnabled", "r", "hd");

    /* JADX INFO: Access modifiers changed from: package-private */
    public static k a(JsonReader jsonReader, g gVar) throws IOException {
        aic aicVar = null;
        String str = null;
        ahz ahzVar = null;
        int i = 1;
        boolean z = false;
        boolean z2 = false;
        while (jsonReader.e()) {
            int a2 = jsonReader.a(f25382a);
            if (a2 == 0) {
                str = jsonReader.i();
            } else if (a2 == 1) {
                ahzVar = ait.g(jsonReader, gVar);
            } else if (a2 == 2) {
                aicVar = ait.b(jsonReader, gVar);
            } else if (a2 == 3) {
                z = jsonReader.j();
            } else if (a2 == 4) {
                i = jsonReader.l();
            } else if (a2 != 5) {
                jsonReader.h();
                jsonReader.m();
            } else {
                z2 = jsonReader.j();
            }
        }
        if (aicVar == null) {
            aicVar = new aic(Collections.singletonList(new akm(100)));
        }
        return new k(str, z, i == 1 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD, ahzVar, aicVar, z2);
    }
}
