package kotlin.io.path;

import java.nio.file.Path;
import java.nio.file.Paths;
import kotlin.Metadata;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÂ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lkotlin/io/path/PathRelativizer;", "", "()V", "emptyPath", "Ljava/nio/file/Path;", "kotlin.jvm.PlatformType", "parentPath", "tryRelativeTo", "path", "base", "kotlin-stdlib-jdk7"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
final class h {
    public static final h INSTANCE = new h();

    /* renamed from: a  reason: collision with root package name */
    private static final Path f24934a = Paths.get("", new String[0]);
    private static final Path b = Paths.get("..", new String[0]);

    private h() {
    }

    public final Path a(Path path, Path base) {
        q.d(path, "path");
        q.d(base, "base");
        Path normalize = base.normalize();
        Path normalize2 = path.normalize();
        Path relativize = normalize.relativize(normalize2);
        int min = Math.min(normalize.getNameCount(), normalize2.getNameCount());
        for (int i = 0; i < min && q.a(normalize.getName(i), b); i++) {
            if (!q.a(normalize2.getName(i), b)) {
                throw new IllegalArgumentException("Unable to compute relative path");
            }
        }
        if (q.a(normalize2, normalize) || !q.a(normalize, f24934a)) {
            String obj = relativize.toString();
            String separator = relativize.getFileSystem().getSeparator();
            q.b(separator, "getSeparator(...)");
            normalize2 = kotlin.text.n.c(obj, separator, false, 2, (Object) null) ? relativize.getFileSystem().getPath(kotlin.text.n.d(obj, relativize.getFileSystem().getSeparator().length()), new String[0]) : relativize;
        }
        q.a(normalize2);
        return normalize2;
    }
}
