package tb;

import com.airbnb.lottie.model.DocumentData;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.alibaba.ariver.kernel.RVStartParams;
import com.loc.at;
import com.taobao.android.weex_framework.util.a;
import java.io.IOException;

/* loaded from: classes2.dex */
public class aiy implements akd<DocumentData> {
    public static final aiy INSTANCE = new aiy();

    /* renamed from: a  reason: collision with root package name */
    private static final JsonReader.a f25361a = JsonReader.a.a("t", "f", "s", at.j, "tr", "lh", RVStartParams.KEY_LANDSCAPE_SHORT, "fc", "sc", "sw", a.ATOM_of);

    private aiy() {
    }

    @Override // tb.akd
    /* renamed from: a */
    public DocumentData b(JsonReader jsonReader, float f) throws IOException {
        DocumentData.Justification justification = DocumentData.Justification.CENTER;
        jsonReader.c();
        DocumentData.Justification justification2 = justification;
        String str = null;
        String str2 = null;
        float f2 = 0.0f;
        int i = 0;
        float f3 = 0.0f;
        float f4 = 0.0f;
        int i2 = 0;
        int i3 = 0;
        float f5 = 0.0f;
        boolean z = true;
        while (jsonReader.e()) {
            switch (jsonReader.a(f25361a)) {
                case 0:
                    str = jsonReader.i();
                    break;
                case 1:
                    str2 = jsonReader.i();
                    break;
                case 2:
                    f2 = (float) jsonReader.k();
                    break;
                case 3:
                    int l = jsonReader.l();
                    if (l <= DocumentData.Justification.CENTER.ordinal() && l >= 0) {
                        justification2 = DocumentData.Justification.values()[l];
                        break;
                    } else {
                        justification2 = DocumentData.Justification.CENTER;
                        break;
                    }
                case 4:
                    i = jsonReader.l();
                    break;
                case 5:
                    f3 = (float) jsonReader.k();
                    break;
                case 6:
                    f4 = (float) jsonReader.k();
                    break;
                case 7:
                    i2 = aji.a(jsonReader);
                    break;
                case 8:
                    i3 = aji.a(jsonReader);
                    break;
                case 9:
                    f5 = (float) jsonReader.k();
                    break;
                case 10:
                    z = jsonReader.j();
                    break;
                default:
                    jsonReader.h();
                    jsonReader.m();
                    break;
            }
        }
        jsonReader.d();
        return new DocumentData(str, str2, f2, justification2, i, f3, f4, i2, i3, f5, z);
    }
}
