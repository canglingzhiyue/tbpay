package tb;

import android.graphics.Path;
import com.airbnb.lottie.g;
import com.airbnb.lottie.model.content.GradientType;
import com.airbnb.lottie.model.content.e;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.alibaba.security.realidentity.o;
import com.loc.at;
import java.io.IOException;
import java.util.Collections;

/* loaded from: classes2.dex */
class ajf {

    /* renamed from: a  reason: collision with root package name */
    private static final JsonReader.a f25367a = JsonReader.a.a("nm", at.f, o.b, "t", "s", "e", "r", "hd");
    private static final JsonReader.a b = JsonReader.a.a("p", at.k);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static e a(JsonReader jsonReader, g gVar) throws IOException {
        aic aicVar = null;
        Path.FillType fillType = Path.FillType.WINDING;
        String str = null;
        GradientType gradientType = null;
        aib aibVar = null;
        aie aieVar = null;
        aie aieVar2 = null;
        boolean z = false;
        while (jsonReader.e()) {
            switch (jsonReader.a(f25367a)) {
                case 0:
                    str = jsonReader.i();
                    break;
                case 1:
                    int i = -1;
                    jsonReader.c();
                    while (jsonReader.e()) {
                        int a2 = jsonReader.a(b);
                        if (a2 == 0) {
                            i = jsonReader.l();
                        } else if (a2 != 1) {
                            jsonReader.h();
                            jsonReader.m();
                        } else {
                            aibVar = ait.a(jsonReader, gVar, i);
                        }
                    }
                    jsonReader.d();
                    break;
                case 2:
                    aicVar = ait.b(jsonReader, gVar);
                    break;
                case 3:
                    gradientType = jsonReader.l() == 1 ? GradientType.LINEAR : GradientType.RADIAL;
                    break;
                case 4:
                    aieVar = ait.c(jsonReader, gVar);
                    break;
                case 5:
                    aieVar2 = ait.c(jsonReader, gVar);
                    break;
                case 6:
                    fillType = jsonReader.l() == 1 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD;
                    break;
                case 7:
                    z = jsonReader.j();
                    break;
                default:
                    jsonReader.h();
                    jsonReader.m();
                    break;
            }
        }
        if (aicVar == null) {
            aicVar = new aic(Collections.singletonList(new akm(100)));
        }
        return new e(str, gradientType, fillType, aibVar, aicVar, aieVar, aieVar2, null, null, z);
    }
}
