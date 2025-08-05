package tb;

import com.airbnb.lottie.g;
import com.airbnb.lottie.model.content.GradientType;
import com.airbnb.lottie.model.content.ShapeStroke;
import com.airbnb.lottie.model.content.f;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.alibaba.security.realidentity.o;
import com.loc.at;
import com.taobao.calendar.sdk.db.schedule.Repeat;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

/* loaded from: classes2.dex */
class ajg {

    /* renamed from: a  reason: collision with root package name */
    private static final JsonReader.a f25368a = JsonReader.a.a("nm", at.f, o.b, "t", "s", "e", "w", "lc", "lj", "ml", "hd", Repeat.D);
    private static final JsonReader.a b = JsonReader.a.a("p", at.k);
    private static final JsonReader.a c = JsonReader.a.a("n", "v");

    /* JADX INFO: Access modifiers changed from: package-private */
    public static f a(JsonReader jsonReader, g gVar) throws IOException {
        aib aibVar;
        ArrayList arrayList = new ArrayList();
        aic aicVar = null;
        String str = null;
        GradientType gradientType = null;
        aib aibVar2 = null;
        aie aieVar = null;
        aie aieVar2 = null;
        aia aiaVar = null;
        ShapeStroke.LineCapType lineCapType = null;
        ShapeStroke.LineJoinType lineJoinType = null;
        float f = 0.0f;
        aia aiaVar2 = null;
        boolean z = false;
        while (jsonReader.e()) {
            switch (jsonReader.a(f25368a)) {
                case 0:
                    str = jsonReader.i();
                    break;
                case 1:
                    int i = -1;
                    jsonReader.c();
                    while (jsonReader.e()) {
                        int a2 = jsonReader.a(b);
                        if (a2 != 0) {
                            aibVar = aibVar2;
                            if (a2 != 1) {
                                jsonReader.h();
                                jsonReader.m();
                            } else {
                                aibVar2 = ait.a(jsonReader, gVar, i);
                            }
                        } else {
                            aibVar = aibVar2;
                            i = jsonReader.l();
                        }
                        aibVar2 = aibVar;
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
                    aiaVar = ait.a(jsonReader, gVar);
                    break;
                case 7:
                    lineCapType = ShapeStroke.LineCapType.values()[jsonReader.l() - 1];
                    break;
                case 8:
                    lineJoinType = ShapeStroke.LineJoinType.values()[jsonReader.l() - 1];
                    break;
                case 9:
                    f = (float) jsonReader.k();
                    break;
                case 10:
                    z = jsonReader.j();
                    break;
                case 11:
                    jsonReader.a();
                    while (jsonReader.e()) {
                        jsonReader.c();
                        String str2 = null;
                        aia aiaVar3 = null;
                        while (jsonReader.e()) {
                            int a3 = jsonReader.a(c);
                            if (a3 != 0) {
                                aia aiaVar4 = aiaVar2;
                                if (a3 != 1) {
                                    jsonReader.h();
                                    jsonReader.m();
                                } else {
                                    aiaVar3 = ait.a(jsonReader, gVar);
                                }
                                aiaVar2 = aiaVar4;
                            } else {
                                str2 = jsonReader.i();
                            }
                        }
                        aia aiaVar5 = aiaVar2;
                        jsonReader.d();
                        if (str2.equals(o.b)) {
                            aiaVar2 = aiaVar3;
                        } else {
                            if (str2.equals(Repeat.D) || str2.equals(at.f)) {
                                gVar.a(true);
                                arrayList.add(aiaVar3);
                            }
                            aiaVar2 = aiaVar5;
                        }
                    }
                    aia aiaVar6 = aiaVar2;
                    jsonReader.b();
                    if (arrayList.size() == 1) {
                        arrayList.add(arrayList.get(0));
                    }
                    aiaVar2 = aiaVar6;
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
        return new f(str, gradientType, aibVar2, aicVar, aieVar, aieVar2, aiaVar, lineCapType, lineJoinType, f, arrayList, aiaVar2, z);
    }
}
