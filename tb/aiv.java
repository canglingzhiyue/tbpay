package tb;

import android.graphics.PointF;
import com.airbnb.lottie.g;
import com.airbnb.lottie.model.content.b;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.taobao.calendar.sdk.db.schedule.Repeat;
import java.io.IOException;

/* loaded from: classes2.dex */
class aiv {

    /* renamed from: a  reason: collision with root package name */
    private static final JsonReader.a f25359a = JsonReader.a.a("nm", "p", "s", "hd", Repeat.D);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static b a(JsonReader jsonReader, g gVar, int i) throws IOException {
        boolean z = i == 3;
        String str = null;
        ail<PointF, PointF> ailVar = null;
        aie aieVar = null;
        boolean z2 = false;
        while (jsonReader.e()) {
            int a2 = jsonReader.a(f25359a);
            if (a2 == 0) {
                str = jsonReader.i();
            } else if (a2 == 1) {
                ailVar = aiq.b(jsonReader, gVar);
            } else if (a2 == 2) {
                aieVar = ait.c(jsonReader, gVar);
            } else if (a2 == 3) {
                z2 = jsonReader.j();
            } else if (a2 != 4) {
                jsonReader.h();
                jsonReader.m();
            } else {
                z = jsonReader.l() == 3;
            }
        }
        return new b(str, ailVar, aieVar, z, z2);
    }
}
