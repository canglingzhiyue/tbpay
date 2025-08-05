package kotlin.io.path;

import java.nio.file.Path;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.q;
import tb.rva;

@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\n¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Ljava/nio/file/Path;", "<anonymous parameter 1>", "exception", "Ljava/lang/Exception;", "Lkotlin/Exception;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
final class PathsKt__PathRecursiveFunctionsKt$copyToRecursively$3 extends Lambda implements rva {
    public static final PathsKt__PathRecursiveFunctionsKt$copyToRecursively$3 INSTANCE = new PathsKt__PathRecursiveFunctionsKt$copyToRecursively$3();

    PathsKt__PathRecursiveFunctionsKt$copyToRecursively$3() {
        super(3);
    }

    @Override // tb.rva
    public final Void invoke(Path path, Path path2, Exception exception) {
        q.d(path, "<anonymous parameter 0>");
        q.d(path2, "<anonymous parameter 1>");
        q.d(exception, "exception");
        throw exception;
    }
}
