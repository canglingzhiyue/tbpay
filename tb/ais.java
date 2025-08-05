package tb;

import android.graphics.PointF;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.alibaba.security.realidentity.o;
import com.loc.at;

/* loaded from: classes2.dex */
public class ais {

    /* renamed from: a  reason: collision with root package name */
    private static final JsonReader.a f25357a = JsonReader.a.a("a", "p", "s", "rz", "r", o.b, "so", "eo", "sk", "sa");
    private static final JsonReader.a b = JsonReader.a.a(at.k);

    /* JADX WARN: Removed duplicated region for block: B:23:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0091  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static tb.aik a(com.airbnb.lottie.parser.moshi.JsonReader r27, com.airbnb.lottie.g r28) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 350
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.ais.a(com.airbnb.lottie.parser.moshi.JsonReader, com.airbnb.lottie.g):tb.aik");
    }

    private static boolean a(aia aiaVar) {
        if (aiaVar != null) {
            return aiaVar.b() && ((Float) ((akm) aiaVar.c().get(0)).f25395a).floatValue() == 0.0f;
        }
        return true;
    }

    private static boolean a(aid aidVar) {
        if (aidVar != null) {
            return aidVar.b() && aidVar.c().get(0).f25395a.equals(0.0f, 0.0f);
        }
        return true;
    }

    private static boolean a(aif aifVar) {
        if (aifVar != null) {
            return aifVar.b() && ((akp) ((akm) aifVar.c().get(0)).f25395a).b(1.0f, 1.0f);
        }
        return true;
    }

    private static boolean a(ail<PointF, PointF> ailVar) {
        if (ailVar != null) {
            return !(ailVar instanceof aih) && ailVar.b() && ailVar.c().get(0).f25395a.equals(0.0f, 0.0f);
        }
        return true;
    }

    private static boolean b(aia aiaVar) {
        if (aiaVar != null) {
            return aiaVar.b() && ((Float) ((akm) aiaVar.c().get(0)).f25395a).floatValue() == 0.0f;
        }
        return true;
    }

    private static boolean c(aia aiaVar) {
        if (aiaVar != null) {
            return aiaVar.b() && ((Float) ((akm) aiaVar.c().get(0)).f25395a).floatValue() == 0.0f;
        }
        return true;
    }
}
