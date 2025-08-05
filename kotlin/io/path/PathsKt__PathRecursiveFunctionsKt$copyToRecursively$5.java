package kotlin.io.path;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.p;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.rul;
import tb.ruw;
import tb.rva;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lkotlin/io/path/FileVisitorBuilder;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
final class PathsKt__PathRecursiveFunctionsKt$copyToRecursively$5 extends Lambda implements rul<e, t> {
    final /* synthetic */ rva<a, Path, Path, CopyActionResult> $copyAction;
    final /* synthetic */ Path $normalizedTarget;
    final /* synthetic */ rva<Path, Path, Exception, OnErrorResult> $onError;
    final /* synthetic */ ArrayList<Path> $stack;
    final /* synthetic */ Path $target;
    final /* synthetic */ Path $this_copyToRecursively;

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Ljava/nio/file/FileVisitResult;", "directory", "Ljava/nio/file/Path;", "attributes", "Ljava/nio/file/attribute/BasicFileAttributes;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kotlin.io.path.PathsKt__PathRecursiveFunctionsKt$copyToRecursively$5$1  reason: invalid class name */
    /* loaded from: classes9.dex */
    public static final class AnonymousClass1 extends Lambda implements ruw<Path, BasicFileAttributes, FileVisitResult> {
        final /* synthetic */ rva<a, Path, Path, CopyActionResult> $copyAction;
        final /* synthetic */ Path $normalizedTarget;
        final /* synthetic */ rva<Path, Path, Exception, OnErrorResult> $onError;
        final /* synthetic */ ArrayList<Path> $stack;
        final /* synthetic */ Path $target;
        final /* synthetic */ Path $this_copyToRecursively;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(ArrayList<Path> arrayList, rva<? super a, ? super Path, ? super Path, ? extends CopyActionResult> rvaVar, Path path, Path path2, Path path3, rva<? super Path, ? super Path, ? super Exception, ? extends OnErrorResult> rvaVar2) {
            super(2);
            this.$stack = arrayList;
            this.$copyAction = rvaVar;
            this.$this_copyToRecursively = path;
            this.$target = path2;
            this.$normalizedTarget = path3;
            this.$onError = rvaVar2;
        }

        @Override // tb.ruw
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final FileVisitResult mo2423invoke(Path directory, BasicFileAttributes attributes) {
            FileVisitResult b;
            q.d(directory, "directory");
            q.d(attributes, "attributes");
            b = m.b(this.$stack, this.$copyAction, this.$this_copyToRecursively, this.$target, this.$normalizedTarget, this.$onError, directory, attributes);
            ArrayList<Path> arrayList = this.$stack;
            if (b == FileVisitResult.CONTINUE) {
                arrayList.add(directory);
            }
            return b;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kotlin.io.path.PathsKt__PathRecursiveFunctionsKt$copyToRecursively$5$2  reason: invalid class name */
    /* loaded from: classes9.dex */
    public /* synthetic */ class AnonymousClass2 extends FunctionReferenceImpl implements ruw<Path, BasicFileAttributes, FileVisitResult> {
        final /* synthetic */ rva<a, Path, Path, CopyActionResult> $copyAction;
        final /* synthetic */ Path $normalizedTarget;
        final /* synthetic */ rva<Path, Path, Exception, OnErrorResult> $onError;
        final /* synthetic */ ArrayList<Path> $stack;
        final /* synthetic */ Path $target;
        final /* synthetic */ Path $this_copyToRecursively;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass2(ArrayList<Path> arrayList, rva<? super a, ? super Path, ? super Path, ? extends CopyActionResult> rvaVar, Path path, Path path2, Path path3, rva<? super Path, ? super Path, ? super Exception, ? extends OnErrorResult> rvaVar2) {
            super(2, q.a.class, "copy", "copyToRecursively$copy$PathsKt__PathRecursiveFunctionsKt(Ljava/util/ArrayList;Lkotlin/jvm/functions/Function3;Ljava/nio/file/Path;Ljava/nio/file/Path;Ljava/nio/file/Path;Lkotlin/jvm/functions/Function3;Ljava/nio/file/Path;Ljava/nio/file/attribute/BasicFileAttributes;)Ljava/nio/file/FileVisitResult;", 0);
            this.$stack = arrayList;
            this.$copyAction = rvaVar;
            this.$this_copyToRecursively = path;
            this.$target = path2;
            this.$normalizedTarget = path3;
            this.$onError = rvaVar2;
        }

        @Override // tb.ruw
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final FileVisitResult mo2423invoke(Path p0, BasicFileAttributes p1) {
            FileVisitResult b;
            q.d(p0, "p0");
            q.d(p1, "p1");
            b = m.b(this.$stack, this.$copyAction, this.$this_copyToRecursively, this.$target, this.$normalizedTarget, this.$onError, p0, p1);
            return b;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kotlin.io.path.PathsKt__PathRecursiveFunctionsKt$copyToRecursively$5$3  reason: invalid class name */
    /* loaded from: classes9.dex */
    public /* synthetic */ class AnonymousClass3 extends FunctionReferenceImpl implements ruw<Path, Exception, FileVisitResult> {
        final /* synthetic */ Path $normalizedTarget;
        final /* synthetic */ rva<Path, Path, Exception, OnErrorResult> $onError;
        final /* synthetic */ Path $target;
        final /* synthetic */ Path $this_copyToRecursively;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass3(rva<? super Path, ? super Path, ? super Exception, ? extends OnErrorResult> rvaVar, Path path, Path path2, Path path3) {
            super(2, q.a.class, "error", "copyToRecursively$error$PathsKt__PathRecursiveFunctionsKt(Lkotlin/jvm/functions/Function3;Ljava/nio/file/Path;Ljava/nio/file/Path;Ljava/nio/file/Path;Ljava/nio/file/Path;Ljava/lang/Exception;)Ljava/nio/file/FileVisitResult;", 0);
            this.$onError = rvaVar;
            this.$this_copyToRecursively = path;
            this.$target = path2;
            this.$normalizedTarget = path3;
        }

        @Override // tb.ruw
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final FileVisitResult mo2423invoke(Path p0, Exception p1) {
            FileVisitResult b;
            q.d(p0, "p0");
            q.d(p1, "p1");
            b = m.b(this.$onError, this.$this_copyToRecursively, this.$target, this.$normalizedTarget, p0, p1);
            return b;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Ljava/nio/file/FileVisitResult;", "directory", "Ljava/nio/file/Path;", "exception", "Ljava/io/IOException;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kotlin.io.path.PathsKt__PathRecursiveFunctionsKt$copyToRecursively$5$4  reason: invalid class name */
    /* loaded from: classes9.dex */
    public static final class AnonymousClass4 extends Lambda implements ruw<Path, IOException, FileVisitResult> {
        final /* synthetic */ Path $normalizedTarget;
        final /* synthetic */ rva<Path, Path, Exception, OnErrorResult> $onError;
        final /* synthetic */ ArrayList<Path> $stack;
        final /* synthetic */ Path $target;
        final /* synthetic */ Path $this_copyToRecursively;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass4(ArrayList<Path> arrayList, rva<? super Path, ? super Path, ? super Exception, ? extends OnErrorResult> rvaVar, Path path, Path path2, Path path3) {
            super(2);
            this.$stack = arrayList;
            this.$onError = rvaVar;
            this.$this_copyToRecursively = path;
            this.$target = path2;
            this.$normalizedTarget = path3;
        }

        @Override // tb.ruw
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final FileVisitResult mo2423invoke(Path directory, IOException iOException) {
            FileVisitResult b;
            q.d(directory, "directory");
            p.e((List) this.$stack);
            if (iOException == null) {
                return FileVisitResult.CONTINUE;
            }
            b = m.b(this.$onError, this.$this_copyToRecursively, this.$target, this.$normalizedTarget, directory, iOException);
            return b;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    PathsKt__PathRecursiveFunctionsKt$copyToRecursively$5(ArrayList<Path> arrayList, rva<? super a, ? super Path, ? super Path, ? extends CopyActionResult> rvaVar, Path path, Path path2, Path path3, rva<? super Path, ? super Path, ? super Exception, ? extends OnErrorResult> rvaVar2) {
        super(1);
        this.$stack = arrayList;
        this.$copyAction = rvaVar;
        this.$this_copyToRecursively = path;
        this.$target = path2;
        this.$normalizedTarget = path3;
        this.$onError = rvaVar2;
    }

    @Override // tb.rul
    /* renamed from: invoke */
    public /* bridge */ /* synthetic */ t mo2421invoke(e eVar) {
        invoke2(eVar);
        return t.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(e visitFileTree) {
        q.d(visitFileTree, "$this$visitFileTree");
        new AnonymousClass1(this.$stack, this.$copyAction, this.$this_copyToRecursively, this.$target, this.$normalizedTarget, this.$onError);
        new AnonymousClass2(this.$stack, this.$copyAction, this.$this_copyToRecursively, this.$target, this.$normalizedTarget, this.$onError);
        new AnonymousClass3(this.$onError, this.$this_copyToRecursively, this.$target, this.$normalizedTarget);
        new AnonymousClass4(this.$stack, this.$onError, this.$this_copyToRecursively, this.$target, this.$normalizedTarget);
    }
}
