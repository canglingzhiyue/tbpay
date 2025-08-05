package tb;

import com.airbnb.lottie.g;
import com.airbnb.lottie.model.content.c;
import com.airbnb.lottie.model.content.l;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class ajz {

    /* renamed from: a  reason: collision with root package name */
    private static final JsonReader.a f25383a = JsonReader.a.a("nm", "hd", AdvanceSetting.NETWORK_TYPE);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static l a(JsonReader jsonReader, g gVar) throws IOException {
        ArrayList arrayList = new ArrayList();
        String str = null;
        boolean z = false;
        while (jsonReader.e()) {
            int a2 = jsonReader.a(f25383a);
            if (a2 == 0) {
                str = jsonReader.i();
            } else if (a2 == 1) {
                z = jsonReader.j();
            } else if (a2 != 2) {
                jsonReader.m();
            } else {
                jsonReader.a();
                while (jsonReader.e()) {
                    c a3 = aix.a(jsonReader, gVar);
                    if (a3 != null) {
                        arrayList.add(a3);
                    }
                }
                jsonReader.b();
            }
        }
        return new l(str, arrayList, z);
    }
}
