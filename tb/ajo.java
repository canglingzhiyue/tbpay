package tb;

import com.airbnb.lottie.model.content.MergePaths;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;

/* loaded from: classes2.dex */
class ajo {

    /* renamed from: a  reason: collision with root package name */
    private static final JsonReader.a f25376a = JsonReader.a.a("nm", "mm", "hd");

    /* JADX INFO: Access modifiers changed from: package-private */
    public static MergePaths a(JsonReader jsonReader) throws IOException {
        String str = null;
        MergePaths.MergePathsMode mergePathsMode = null;
        boolean z = false;
        while (jsonReader.e()) {
            int a2 = jsonReader.a(f25376a);
            if (a2 == 0) {
                str = jsonReader.i();
            } else if (a2 == 1) {
                mergePathsMode = MergePaths.MergePathsMode.forId(jsonReader.l());
            } else if (a2 != 2) {
                jsonReader.h();
                jsonReader.m();
            } else {
                z = jsonReader.j();
            }
        }
        return new MergePaths(str, mergePathsMode, z);
    }
}
