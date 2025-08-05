package tb;

import com.airbnb.lottie.g;
import com.airbnb.lottie.model.content.ShapeStroke;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.alibaba.security.realidentity.o;
import com.loc.at;
import com.taobao.android.msoa.c;
import com.taobao.calendar.sdk.db.schedule.Repeat;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class akb {

    /* renamed from: a  reason: collision with root package name */
    private static final JsonReader.a f25385a = JsonReader.a.a("nm", c.TAG, "w", o.b, "lc", "lj", "ml", "hd", Repeat.D);
    private static final JsonReader.a b = JsonReader.a.a("n", "v");

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ShapeStroke a(JsonReader jsonReader, g gVar) throws IOException {
        char c;
        ArrayList arrayList = new ArrayList();
        aic aicVar = null;
        String str = null;
        aia aiaVar = null;
        ahz ahzVar = null;
        aia aiaVar2 = null;
        ShapeStroke.LineCapType lineCapType = null;
        ShapeStroke.LineJoinType lineJoinType = null;
        float f = 0.0f;
        boolean z = false;
        while (true) {
            int i = 100;
            if (!jsonReader.e()) {
                return new ShapeStroke(str, aiaVar, arrayList, ahzVar, aicVar == null ? new aic(Collections.singletonList(new akm(100))) : aicVar, aiaVar2, lineCapType, lineJoinType, f, z);
            }
            int i2 = 1;
            switch (jsonReader.a(f25385a)) {
                case 0:
                    str = jsonReader.i();
                    break;
                case 1:
                    ahzVar = ait.g(jsonReader, gVar);
                    break;
                case 2:
                    aiaVar2 = ait.a(jsonReader, gVar);
                    break;
                case 3:
                    aicVar = ait.b(jsonReader, gVar);
                    break;
                case 4:
                    lineCapType = ShapeStroke.LineCapType.values()[jsonReader.l() - 1];
                    break;
                case 5:
                    lineJoinType = ShapeStroke.LineJoinType.values()[jsonReader.l() - 1];
                    break;
                case 6:
                    f = (float) jsonReader.k();
                    break;
                case 7:
                    z = jsonReader.j();
                    break;
                case 8:
                    jsonReader.a();
                    while (jsonReader.e()) {
                        jsonReader.c();
                        aia aiaVar3 = null;
                        String str2 = null;
                        while (jsonReader.e()) {
                            int a2 = jsonReader.a(b);
                            if (a2 == 0) {
                                str2 = jsonReader.i();
                            } else if (a2 != i2) {
                                jsonReader.h();
                                jsonReader.m();
                            } else {
                                aiaVar3 = ait.a(jsonReader, gVar);
                            }
                        }
                        jsonReader.d();
                        int hashCode = str2.hashCode();
                        if (hashCode == i) {
                            if (str2.equals(Repeat.D)) {
                                c = 1;
                            }
                            c = 65535;
                        } else if (hashCode != 103) {
                            if (hashCode == 111 && str2.equals(o.b)) {
                                c = 0;
                            }
                            c = 65535;
                        } else {
                            if (str2.equals(at.f)) {
                                c = 2;
                            }
                            c = 65535;
                        }
                        if (c == 0) {
                            aiaVar = aiaVar3;
                        } else if (c == 1 || c == 2) {
                            gVar.a(true);
                            arrayList.add(aiaVar3);
                        }
                        i = 100;
                        i2 = 1;
                    }
                    jsonReader.b();
                    if (arrayList.size() != 1) {
                        break;
                    } else {
                        arrayList.add(arrayList.get(0));
                        break;
                    }
                default:
                    jsonReader.m();
                    break;
            }
        }
    }
}
