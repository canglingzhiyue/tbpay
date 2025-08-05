package tb;

import com.airbnb.lottie.g;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;
import java.util.List;

/* loaded from: classes2.dex */
public class ait {
    private static <T> List<akm<T>> a(JsonReader jsonReader, float f, g gVar, akd<T> akdVar) throws IOException {
        return ajk.a(jsonReader, gVar, f, akdVar, false);
    }

    private static <T> List<akm<T>> a(JsonReader jsonReader, g gVar, akd<T> akdVar) throws IOException {
        return ajk.a(jsonReader, gVar, 1.0f, akdVar, false);
    }

    public static aia a(JsonReader jsonReader, g gVar) throws IOException {
        return a(jsonReader, gVar, true);
    }

    public static aia a(JsonReader jsonReader, g gVar, boolean z) throws IOException {
        return new aia(a(jsonReader, z ? akl.a() : 1.0f, gVar, ajb.INSTANCE));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static aib a(JsonReader jsonReader, g gVar, int i) throws IOException {
        return new aib(a(jsonReader, gVar, new aje(i)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static aic b(JsonReader jsonReader, g gVar) throws IOException {
        return new aic(a(jsonReader, gVar, ajh.INSTANCE));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static aie c(JsonReader jsonReader, g gVar) throws IOException {
        return new aie(ajk.a(jsonReader, gVar, akl.a(), ajr.INSTANCE, true));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static aif d(JsonReader jsonReader, g gVar) throws IOException {
        return new aif(a(jsonReader, gVar, ajw.INSTANCE));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static aig e(JsonReader jsonReader, g gVar) throws IOException {
        return new aig(a(jsonReader, akl.a(), gVar, ajx.INSTANCE));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static aii f(JsonReader jsonReader, g gVar) throws IOException {
        return new aii(a(jsonReader, gVar, aiy.INSTANCE));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ahz g(JsonReader jsonReader, g gVar) throws IOException {
        return new ahz(a(jsonReader, gVar, aiw.INSTANCE));
    }
}
