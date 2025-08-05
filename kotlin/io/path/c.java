package kotlin.io.path;

import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.aw;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u00122\u0006\u0010\u0006\u001a\u00020\u0007J\u0018\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0010H\u0016R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lkotlin/io/path/DirectoryEntriesReader;", "Ljava/nio/file/SimpleFileVisitor;", "Ljava/nio/file/Path;", "followLinks", "", "(Z)V", "directoryNode", "Lkotlin/io/path/PathNode;", com.taobao.android.weex_framework.util.a.ATOM_EXT_entries, "Lkotlin/collections/ArrayDeque;", "getFollowLinks", "()Z", "preVisitDirectory", "Ljava/nio/file/FileVisitResult;", "dir", "attrs", "Ljava/nio/file/attribute/BasicFileAttributes;", "readEntries", "", "visitFile", "file", "kotlin-stdlib-jdk7"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
final class c extends SimpleFileVisitor<Path> {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f24930a;
    private g b;
    private aw<g> c = new aw<>();

    public c(boolean z) {
        this.f24930a = z;
    }

    @Override // java.nio.file.SimpleFileVisitor, java.nio.file.FileVisitor
    /* renamed from: a */
    public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) {
        q.d(dir, "dir");
        q.d(attrs, "attrs");
        this.c.add(new g(dir, attrs.fileKey(), this.b));
        FileVisitResult preVisitDirectory = super.preVisitDirectory(dir, attrs);
        q.b(preVisitDirectory, "preVisitDirectory(...)");
        return preVisitDirectory;
    }

    public final List<g> a(g directoryNode) {
        q.d(directoryNode, "directoryNode");
        this.b = directoryNode;
        Files.walkFileTree(directoryNode.a(), f.INSTANCE.b(this.f24930a), 1, this);
        this.c.b();
        aw<g> awVar = this.c;
        this.c = new aw<>();
        return awVar;
    }

    @Override // java.nio.file.SimpleFileVisitor, java.nio.file.FileVisitor
    /* renamed from: b */
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) {
        q.d(file, "file");
        q.d(attrs, "attrs");
        this.c.add(new g(file, null, this.b));
        FileVisitResult visitFile = super.visitFile(file, attrs);
        q.b(visitFile, "visitFile(...)");
        return visitFile;
    }
}
