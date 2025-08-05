package tb;

import android.graphics.PointF;
import com.airbnb.lottie.g;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.loc.at;
import java.io.IOException;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public class aiq {

    /* renamed from: a  reason: collision with root package name */
    private static final JsonReader.a f25355a = JsonReader.a.a(at.k, "x", "y");

    public static aid a(JsonReader jsonReader, g gVar) throws IOException {
        ArrayList arrayList = new ArrayList();
        if (jsonReader.f() == JsonReader.Token.BEGIN_ARRAY) {
            jsonReader.a();
            while (jsonReader.e()) {
                arrayList.add(ajp.a(jsonReader, gVar));
            }
            jsonReader.b();
            ajk.a(arrayList);
        } else {
            arrayList.add(new akm(aji.b(jsonReader, akl.a())));
        }
        return new aid(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ail<PointF, PointF> b(JsonReader jsonReader, g gVar) throws IOException {
        jsonReader.c();
        aid aidVar = null;
        boolean z = false;
        aia aiaVar = null;
        aia aiaVar2 = null;
        while (jsonReader.f() != JsonReader.Token.END_OBJECT) {
            int a2 = jsonReader.a(f25355a);
            if (a2 == 0) {
                aidVar = a(jsonReader, gVar);
            } else if (a2 != 1) {
                if (a2 != 2) {
                    jsonReader.h();
                    jsonReader.m();
                } else if (jsonReader.f() == JsonReader.Token.STRING) {
                    jsonReader.m();
                    z = true;
                } else {
                    aiaVar2 = ait.a(jsonReader, gVar);
                }
            } else if (jsonReader.f() == JsonReader.Token.STRING) {
                jsonReader.m();
                z = true;
            } else {
                aiaVar = ait.a(jsonReader, gVar);
            }
        }
        jsonReader.d();
        if (z) {
            gVar.a("Lottie doesn't support expressions.");
        }
        return aidVar != null ? aidVar : new aih(aiaVar, aiaVar2);
    }
}
