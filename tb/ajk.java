package tb;

import com.airbnb.lottie.g;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.loc.at;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
class ajk {

    /* renamed from: a  reason: collision with root package name */
    static JsonReader.a f25372a = JsonReader.a.a(at.k);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> List<akm<T>> a(JsonReader jsonReader, g gVar, float f, akd<T> akdVar, boolean z) throws IOException {
        ArrayList arrayList = new ArrayList();
        if (jsonReader.f() == JsonReader.Token.STRING) {
            gVar.a("Lottie doesn't support expressions.");
            return arrayList;
        }
        jsonReader.c();
        while (jsonReader.e()) {
            if (jsonReader.a(f25372a) != 0) {
                jsonReader.m();
            } else if (jsonReader.f() == JsonReader.Token.BEGIN_ARRAY) {
                jsonReader.a();
                if (jsonReader.f() == JsonReader.Token.NUMBER) {
                    arrayList.add(ajj.a(jsonReader, gVar, f, akdVar, false, z));
                } else {
                    while (jsonReader.e()) {
                        arrayList.add(ajj.a(jsonReader, gVar, f, akdVar, true, z));
                    }
                }
                jsonReader.b();
            } else {
                arrayList.add(ajj.a(jsonReader, gVar, f, akdVar, false, z));
            }
        }
        jsonReader.d();
        a(arrayList);
        return arrayList;
    }

    public static <T> void a(List<? extends akm<T>> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        while (true) {
            i = size - 1;
            if (i2 >= i) {
                break;
            }
            akm<T> akmVar = list.get(i2);
            i2++;
            akm<T> akmVar2 = list.get(i2);
            akmVar.g = Float.valueOf(akmVar2.f);
            if (akmVar.b == null && akmVar2.f25395a != null) {
                akmVar.b = akmVar2.f25395a;
                if (akmVar instanceof aho) {
                    ((aho) akmVar).a();
                }
            }
        }
        akm<T> akmVar3 = list.get(i);
        if ((akmVar3.f25395a == null || akmVar3.b == null) && list.size() > 1) {
            list.remove(akmVar3);
        }
    }
}
