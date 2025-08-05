package kotlin.io.path;

import java.nio.file.CopyOption;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.v;
import tb.rva;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lkotlin/io/path/CopyActionResult;", "Lkotlin/io/path/CopyActionContext;", "src", "Ljava/nio/file/Path;", "dst", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
final class PathsKt__PathRecursiveFunctionsKt$copyToRecursively$2 extends Lambda implements rva<a, Path, Path, CopyActionResult> {
    final /* synthetic */ boolean $followLinks;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PathsKt__PathRecursiveFunctionsKt$copyToRecursively$2(boolean z) {
        super(3);
        this.$followLinks = z;
    }

    @Override // tb.rva
    public final CopyActionResult invoke(a copyToRecursively, Path src, Path dst) {
        q.d(copyToRecursively, "$this$copyToRecursively");
        q.d(src, "src");
        q.d(dst, "dst");
        LinkOption[] a2 = f.INSTANCE.a(this.$followLinks);
        LinkOption[] linkOptionArr = {LinkOption.NOFOLLOW_LINKS};
        boolean isDirectory = Files.isDirectory(dst, (LinkOption[]) Arrays.copyOf(linkOptionArr, linkOptionArr.length));
        LinkOption[] linkOptionArr2 = (LinkOption[]) Arrays.copyOf(a2, a2.length);
        if (!Files.isDirectory(src, (LinkOption[]) Arrays.copyOf(linkOptionArr2, linkOptionArr2.length)) || !isDirectory) {
            if (isDirectory) {
                k.a(dst);
            }
            v vVar = new v(2);
            vVar.a((Object) a2);
            vVar.b(StandardCopyOption.REPLACE_EXISTING);
            CopyOption[] copyOptionArr = (CopyOption[]) vVar.a((Object[]) new CopyOption[vVar.a()]);
            q.b(Files.copy(src, dst, (CopyOption[]) Arrays.copyOf(copyOptionArr, copyOptionArr.length)), "copy(...)");
        }
        return CopyActionResult.CONTINUE;
    }
}
