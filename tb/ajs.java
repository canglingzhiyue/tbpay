package tb;

import android.graphics.PointF;
import com.airbnb.lottie.g;
import com.airbnb.lottie.model.content.PolystarShape;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.meizu.cloud.pushsdk.notification.model.AdvertisementOption;
import com.taobao.calendar.sdk.db.schedule.Repeat;
import java.io.IOException;

/* loaded from: classes2.dex */
class ajs {

    /* renamed from: a  reason: collision with root package name */
    private static final JsonReader.a f25377a = JsonReader.a.a("nm", "sy", AdvertisementOption.PRIORITY_VALID_TIME, "p", "r", "or", "os", "ir", "is", "hd", Repeat.D);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static PolystarShape a(JsonReader jsonReader, g gVar, int i) throws IOException {
        boolean z = i == 3;
        String str = null;
        PolystarShape.Type type = null;
        aia aiaVar = null;
        ail<PointF, PointF> ailVar = null;
        aia aiaVar2 = null;
        aia aiaVar3 = null;
        aia aiaVar4 = null;
        aia aiaVar5 = null;
        aia aiaVar6 = null;
        boolean z2 = false;
        while (jsonReader.e()) {
            switch (jsonReader.a(f25377a)) {
                case 0:
                    str = jsonReader.i();
                    break;
                case 1:
                    type = PolystarShape.Type.forValue(jsonReader.l());
                    break;
                case 2:
                    aiaVar = ait.a(jsonReader, gVar, false);
                    break;
                case 3:
                    ailVar = aiq.b(jsonReader, gVar);
                    break;
                case 4:
                    aiaVar2 = ait.a(jsonReader, gVar, false);
                    break;
                case 5:
                    aiaVar4 = ait.a(jsonReader, gVar);
                    break;
                case 6:
                    aiaVar6 = ait.a(jsonReader, gVar, false);
                    break;
                case 7:
                    aiaVar3 = ait.a(jsonReader, gVar);
                    break;
                case 8:
                    aiaVar5 = ait.a(jsonReader, gVar, false);
                    break;
                case 9:
                    z2 = jsonReader.j();
                    break;
                case 10:
                    if (jsonReader.l() != 3) {
                        z = false;
                        break;
                    } else {
                        z = true;
                        break;
                    }
                default:
                    jsonReader.h();
                    jsonReader.m();
                    break;
            }
        }
        return new PolystarShape(str, type, aiaVar, ailVar, aiaVar2, aiaVar3, aiaVar4, aiaVar5, aiaVar6, z2, z);
    }
}
