package tb;

import com.airbnb.lottie.g;
import com.airbnb.lottie.model.content.Mask;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.alibaba.analytics.core.sync.q;
import com.alibaba.security.realidentity.o;
import com.meizu.cloud.pushsdk.notification.model.AdvertisementOption;
import java.io.IOException;

/* loaded from: classes2.dex */
class ajn {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static Mask a(JsonReader jsonReader, g gVar) throws IOException {
        char c;
        jsonReader.c();
        Mask.MaskMode maskMode = null;
        aig aigVar = null;
        aic aicVar = null;
        boolean z = false;
        while (jsonReader.e()) {
            String g = jsonReader.g();
            int hashCode = g.hashCode();
            char c2 = 65535;
            if (hashCode == 111) {
                if (g.equals(o.b)) {
                    c = 2;
                }
                c = 65535;
            } else if (hashCode == 3588) {
                if (g.equals(AdvertisementOption.PRIORITY_VALID_TIME)) {
                    c = 1;
                }
                c = 65535;
            } else if (hashCode != 104433) {
                if (hashCode == 3357091 && g.equals("mode")) {
                    c = 0;
                }
                c = 65535;
            } else {
                if (g.equals("inv")) {
                    c = 3;
                }
                c = 65535;
            }
            if (c == 0) {
                String i = jsonReader.i();
                int hashCode2 = i.hashCode();
                if (hashCode2 != 97) {
                    if (hashCode2 != 105) {
                        if (hashCode2 != 110) {
                            if (hashCode2 == 115 && i.equals("s")) {
                                c2 = 1;
                            }
                        } else if (i.equals("n")) {
                            c2 = 2;
                        }
                    } else if (i.equals(q.MSGTYPE_INTERVAL)) {
                        c2 = 3;
                    }
                } else if (i.equals("a")) {
                    c2 = 0;
                }
                if (c2 != 0) {
                    if (c2 == 1) {
                        maskMode = Mask.MaskMode.MASK_MODE_SUBTRACT;
                    } else if (c2 == 2) {
                        maskMode = Mask.MaskMode.MASK_MODE_NONE;
                    } else if (c2 != 3) {
                        akh.c("Unknown mask mode " + g + ". Defaulting to Add.");
                    } else {
                        gVar.a("Animation contains intersect masks. They are not supported but will be treated like add masks.");
                        maskMode = Mask.MaskMode.MASK_MODE_INTERSECT;
                    }
                }
                maskMode = Mask.MaskMode.MASK_MODE_ADD;
            } else if (c == 1) {
                aigVar = ait.e(jsonReader, gVar);
            } else if (c == 2) {
                aicVar = ait.b(jsonReader, gVar);
            } else if (c != 3) {
                jsonReader.m();
            } else {
                z = jsonReader.j();
            }
        }
        jsonReader.d();
        return new Mask(maskMode, aigVar, aicVar, z);
    }
}
