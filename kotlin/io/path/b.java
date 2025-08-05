package kotlin.io.path;

import kotlin.Metadata;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\bÃ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001c\u0010\u0003\u001a\u00020\u0004*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"Lkotlin/io/path/DefaultCopyActionContext;", "Lkotlin/io/path/CopyActionContext;", "()V", "copyToIgnoringExistingDirectory", "Lkotlin/io/path/CopyActionResult;", "Ljava/nio/file/Path;", "target", "followLinks", "", "kotlin-stdlib-jdk7"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class b implements a {
    public static final b INSTANCE = new b();

    private b() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0038, code lost:
        if (java.nio.file.Files.isDirectory(r5, (java.nio.file.LinkOption[]) java.util.Arrays.copyOf(r0, r0.length)) == false) goto L8;
     */
    @Override // kotlin.io.path.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public kotlin.io.path.CopyActionResult a(java.nio.file.Path r4, java.nio.file.Path r5, boolean r6) {
        /*
            r3 = this;
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.q.d(r4, r0)
            java.lang.String r0 = "target"
            kotlin.jvm.internal.q.d(r5, r0)
            kotlin.io.path.f r0 = kotlin.io.path.f.INSTANCE
            java.nio.file.LinkOption[] r6 = r0.a(r6)
            int r0 = r6.length
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r6, r0)
            java.nio.file.LinkOption[] r0 = (java.nio.file.LinkOption[]) r0
            int r1 = r0.length
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r1)
            java.nio.file.LinkOption[] r0 = (java.nio.file.LinkOption[]) r0
            boolean r0 = java.nio.file.Files.isDirectory(r4, r0)
            if (r0 == 0) goto L3a
            r0 = 1
            java.nio.file.LinkOption[] r0 = new java.nio.file.LinkOption[r0]
            r1 = 0
            java.nio.file.LinkOption r2 = java.nio.file.LinkOption.NOFOLLOW_LINKS
            r0[r1] = r2
            int r1 = r0.length
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r1)
            java.nio.file.LinkOption[] r0 = (java.nio.file.LinkOption[]) r0
            boolean r0 = java.nio.file.Files.isDirectory(r5, r0)
            if (r0 != 0) goto L51
        L3a:
            int r0 = r6.length
            java.lang.Object[] r6 = java.util.Arrays.copyOf(r6, r0)
            java.nio.file.CopyOption[] r6 = (java.nio.file.CopyOption[]) r6
            int r0 = r6.length
            java.lang.Object[] r6 = java.util.Arrays.copyOf(r6, r0)
            java.nio.file.CopyOption[] r6 = (java.nio.file.CopyOption[]) r6
            java.nio.file.Path r4 = java.nio.file.Files.copy(r4, r5, r6)
            java.lang.String r5 = "copy(...)"
            kotlin.jvm.internal.q.b(r4, r5)
        L51:
            kotlin.io.path.CopyActionResult r4 = kotlin.io.path.CopyActionResult.CONTINUE
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.io.path.b.a(java.nio.file.Path, java.nio.file.Path, boolean):kotlin.io.path.CopyActionResult");
    }
}
