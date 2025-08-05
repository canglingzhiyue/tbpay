package kotlin.io.path;

import java.nio.file.DirectoryStream;
import java.nio.file.FileSystemException;
import java.nio.file.FileSystemLoopException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.SecureDirectoryStream;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.p;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.rva;

@Metadata(d1 = {"\u0000v\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a$\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005H\u0082\b¢\u0006\u0002\b\u0006\u001a\u001d\u0010\u0007\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\u0003H\u0002¢\u0006\u0002\b\n\u001a'\u0010\u000b\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\t2\b\u0010\r\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0002\u001a\u00020\u0003H\u0002¢\u0006\u0002\b\u000e\u001a&\u0010\u000f\u001a\u0004\u0018\u0001H\u0010\"\u0004\b\u0000\u0010\u00102\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00100\u0005H\u0082\b¢\u0006\u0004\b\u0011\u0010\u0012\u001a\f\u0010\u0013\u001a\u00020\u0001*\u00020\tH\u0000\u001a\u0019\u0010\u0014\u001a\u00020\u0001*\u00020\t2\u0006\u0010\r\u001a\u00020\tH\u0002¢\u0006\u0002\b\u0015\u001aw\u0010\u0016\u001a\u00020\t*\u00020\t2\u0006\u0010\u0017\u001a\u00020\t2Q\b\u0002\u0010\u0018\u001aK\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001c\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u0017\u0012\u0017\u0012\u00150\u001dj\u0002`\u001e¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001f\u0012\u0004\u0012\u00020 0\u00192\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\"H\u0007\u001a´\u0001\u0010\u0016\u001a\u00020\t*\u00020\t2\u0006\u0010\u0017\u001a\u00020\t2Q\b\u0002\u0010\u0018\u001aK\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001c\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u0017\u0012\u0017\u0012\u00150\u001dj\u0002`\u001e¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001f\u0012\u0004\u0012\u00020 0\u00192\u0006\u0010!\u001a\u00020\"2C\b\u0002\u0010$\u001a=\u0012\u0004\u0012\u00020%\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001c\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u0017\u0012\u0004\u0012\u00020&0\u0019¢\u0006\u0002\b'H\u0007\u001a\f\u0010(\u001a\u00020\u0001*\u00020\tH\u0007\u001a\u001b\u0010)\u001a\f\u0012\b\u0012\u00060\u001dj\u0002`\u001e0**\u00020\tH\u0002¢\u0006\u0002\b+\u001a'\u0010,\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\t0-2\u0006\u0010\u001b\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\u0003H\u0002¢\u0006\u0002\b.\u001a1\u0010/\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\t0-2\u0006\u0010\u001b\u001a\u00020\t2\b\u0010\r\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0002\u001a\u00020\u0003H\u0002¢\u0006\u0002\b0\u001a5\u00101\u001a\u00020\"*\b\u0012\u0004\u0012\u00020\t0-2\u0006\u00102\u001a\u00020\t2\u0012\u00103\u001a\n\u0012\u0006\b\u0001\u0012\u00020504\"\u000205H\u0002¢\u0006\u0004\b6\u00107\u001a\u0011\u00108\u001a\u000209*\u00020&H\u0003¢\u0006\u0002\b:\u001a\u0011\u00108\u001a\u000209*\u00020 H\u0003¢\u0006\u0002\b:¨\u0006;"}, d2 = {"collectIfThrows", "", "collector", "Lkotlin/io/path/ExceptionsCollector;", com.taobao.android.weex_framework.util.a.ATOM_function, "Lkotlin/Function0;", "collectIfThrows$PathsKt__PathRecursiveFunctionsKt", "insecureEnterDirectory", "path", "Ljava/nio/file/Path;", "insecureEnterDirectory$PathsKt__PathRecursiveFunctionsKt", "insecureHandleEntry", com.taobao.tao.flexbox.layoutmanager.container.a.CONFIG_ENTRY, com.alibaba.triver.triver_shop.newShop.event.broadcast.c.MSG_SOURCE_PARENT, "insecureHandleEntry$PathsKt__PathRecursiveFunctionsKt", "tryIgnoreNoSuchFileException", "R", "tryIgnoreNoSuchFileException$PathsKt__PathRecursiveFunctionsKt", "(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "checkFileName", "checkNotSameAs", "checkNotSameAs$PathsKt__PathRecursiveFunctionsKt", "copyToRecursively", "target", "onError", "Lkotlin/Function3;", "Lkotlin/ParameterName;", "name", "source", "Ljava/lang/Exception;", "Lkotlin/Exception;", "exception", "Lkotlin/io/path/OnErrorResult;", "followLinks", "", "overwrite", "copyAction", "Lkotlin/io/path/CopyActionContext;", "Lkotlin/io/path/CopyActionResult;", "Lkotlin/ExtensionFunctionType;", "deleteRecursively", "deleteRecursivelyImpl", "", "deleteRecursivelyImpl$PathsKt__PathRecursiveFunctionsKt", "enterDirectory", "Ljava/nio/file/SecureDirectoryStream;", "enterDirectory$PathsKt__PathRecursiveFunctionsKt", "handleEntry", "handleEntry$PathsKt__PathRecursiveFunctionsKt", "isDirectory", "entryName", "options", "", "Ljava/nio/file/LinkOption;", "isDirectory$PathsKt__PathRecursiveFunctionsKt", "(Ljava/nio/file/SecureDirectoryStream;Ljava/nio/file/Path;[Ljava/nio/file/LinkOption;)Z", "toFileVisitResult", "Ljava/nio/file/FileVisitResult;", "toFileVisitResult$PathsKt__PathRecursiveFunctionsKt", "kotlin-stdlib-jdk7"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/io/path/PathsKt")
/* loaded from: classes9.dex */
class m extends l {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes9.dex */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[CopyActionResult.values().length];
            try {
                iArr[CopyActionResult.CONTINUE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CopyActionResult.TERMINATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CopyActionResult.SKIP_SUBTREE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[OnErrorResult.values().length];
            try {
                iArr2[OnErrorResult.TERMINATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[OnErrorResult.SKIP_SUBTREE.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    private static final FileVisitResult a(CopyActionResult copyActionResult) {
        int i = a.$EnumSwitchMapping$0[copyActionResult.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return FileVisitResult.TERMINATE;
            }
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            return FileVisitResult.SKIP_SUBTREE;
        }
        return FileVisitResult.CONTINUE;
    }

    private static final FileVisitResult a(OnErrorResult onErrorResult) {
        int i = a.$EnumSwitchMapping$1[onErrorResult.ordinal()];
        if (i != 1) {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            return FileVisitResult.SKIP_SUBTREE;
        }
        return FileVisitResult.TERMINATE;
    }

    private static final Path a(Path path, Path path2, Path path3, Path path4) {
        Path resolve = path2.resolve(k.a(path4, path).toString());
        if (resolve.normalize().startsWith(path3)) {
            q.a(resolve);
            return resolve;
        }
        throw new IllegalFileNameException(path4, resolve, "Copying files to outside the specified target directory is prohibited. The directory being recursively copied might contain an entry with an illegal name.");
    }

    public static final void a(Path path) {
        q.d(path, "<this>");
        List<Exception> c = c(path);
        if (!c.isEmpty()) {
            FileSystemException fileSystemException = new FileSystemException("Failed to delete one or more files. See suppressed exceptions for details.");
            for (Exception exc : c) {
                kotlin.a.a(fileSystemException, exc);
            }
            throw fileSystemException;
        }
    }

    private static final void a(Path path, Path path2) {
        if (Files.isSymbolicLink(path) || !Files.isSameFile(path, path2)) {
            return;
        }
        throw new FileSystemLoopException(path.toString());
    }

    private static final void a(Path path, Path path2, d dVar) {
        if (path2 != null) {
            try {
                k.b(path);
                a(path, path2);
            } catch (Exception e) {
                dVar.a(e);
                return;
            }
        }
        LinkOption[] linkOptionArr = {LinkOption.NOFOLLOW_LINKS};
        if (!Files.isDirectory(path, (LinkOption[]) Arrays.copyOf(linkOptionArr, linkOptionArr.length))) {
            Files.deleteIfExists(path);
            return;
        }
        int a2 = dVar.a();
        a(path, dVar);
        if (a2 != dVar.a()) {
            return;
        }
        Files.deleteIfExists(path);
    }

    private static final void a(Path path, d dVar) {
        DirectoryStream<Path> directoryStream;
        try {
            try {
                directoryStream = Files.newDirectoryStream(path);
            } catch (Exception e) {
                dVar.a(e);
                return;
            }
        } catch (NoSuchFileException unused) {
            directoryStream = null;
        }
        if (directoryStream != null) {
            DirectoryStream<Path> directoryStream2 = directoryStream;
            for (Path path2 : directoryStream2) {
                q.a(path2);
                a(path2, path, dVar);
            }
            t tVar = t.INSTANCE;
            kotlin.io.b.a(directoryStream2, null);
        }
    }

    private static final void a(SecureDirectoryStream<Path> secureDirectoryStream, Path path, Path path2, d dVar) {
        dVar.b(path);
        if (path2 != null) {
            try {
                Path c = dVar.c();
                q.a(c);
                k.b(c);
                a(c, path2);
            } catch (Exception e) {
                dVar.a(e);
            }
        }
        if (a(secureDirectoryStream, path, LinkOption.NOFOLLOW_LINKS)) {
            int a2 = dVar.a();
            a(secureDirectoryStream, path, dVar);
            if (a2 == dVar.a()) {
                secureDirectoryStream.deleteDirectory(path);
            }
            dVar.c(path);
        }
        secureDirectoryStream.deleteFile(path);
        t tVar = t.INSTANCE;
        dVar.c(path);
    }

    private static final void a(SecureDirectoryStream<Path> secureDirectoryStream, Path path, d dVar) {
        SecureDirectoryStream<Path> secureDirectoryStream2;
        try {
            try {
                secureDirectoryStream2 = secureDirectoryStream.newDirectoryStream(path, LinkOption.NOFOLLOW_LINKS);
            } catch (NoSuchFileException unused) {
                secureDirectoryStream2 = null;
            }
            if (secureDirectoryStream2 == null) {
                return;
            }
            SecureDirectoryStream<Path> secureDirectoryStream3 = secureDirectoryStream2;
            SecureDirectoryStream<Path> secureDirectoryStream4 = secureDirectoryStream3;
            for (Path path2 : secureDirectoryStream4) {
                Path fileName = path2.getFileName();
                q.b(fileName, "getFileName(...)");
                a(secureDirectoryStream4, fileName, dVar.c(), dVar);
            }
            t tVar = t.INSTANCE;
            kotlin.io.b.a(secureDirectoryStream3, null);
        } catch (Exception e) {
            dVar.a(e);
        }
    }

    private static final boolean a(SecureDirectoryStream<Path> secureDirectoryStream, Path path, LinkOption... linkOptionArr) {
        Boolean bool;
        try {
            bool = Boolean.valueOf(((BasicFileAttributeView) secureDirectoryStream.getFileAttributeView(path, BasicFileAttributeView.class, (LinkOption[]) Arrays.copyOf(linkOptionArr, linkOptionArr.length))).readAttributes().isDirectory());
        } catch (NoSuchFileException unused) {
            bool = null;
        }
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FileVisitResult b(ArrayList<Path> arrayList, rva<? super kotlin.io.path.a, ? super Path, ? super Path, ? extends CopyActionResult> rvaVar, Path path, Path path2, Path path3, rva<? super Path, ? super Path, ? super Exception, ? extends OnErrorResult> rvaVar2, Path path4, BasicFileAttributes basicFileAttributes) {
        try {
            if (!arrayList.isEmpty()) {
                k.b(path4);
                a(path4, (Path) p.j((List<? extends Object>) arrayList));
            }
            return a(rvaVar.invoke(b.INSTANCE, path4, a(path, path2, path3, path4)));
        } catch (Exception e) {
            return b(rvaVar2, path, path2, path3, path4, e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FileVisitResult b(rva<? super Path, ? super Path, ? super Exception, ? extends OnErrorResult> rvaVar, Path path, Path path2, Path path3, Path path4, Exception exc) {
        return a(rvaVar.invoke(path4, a(path, path2, path3, path4), exc));
    }

    public static final void b(Path path) {
        q.d(path, "<this>");
        String c = k.c(path);
        int hashCode = c.hashCode();
        if (hashCode != 46) {
            if (hashCode != 1518) {
                if (hashCode != 45679) {
                    if (hashCode != 45724) {
                        if (hashCode != 1472) {
                            if (hashCode != 1473 || !c.equals("./")) {
                                return;
                            }
                        } else if (!c.equals("..")) {
                            return;
                        }
                    } else if (!c.equals("..\\")) {
                        return;
                    }
                } else if (!c.equals("../")) {
                    return;
                }
            } else if (!c.equals(".\\")) {
                return;
            }
        } else if (!c.equals(".")) {
            return;
        }
        throw new IllegalFileNameException(path);
    }

    private static final List<Exception> c(Path path) {
        DirectoryStream<Path> directoryStream;
        boolean z = true;
        d dVar = new d(0, 1, null);
        Path parent = path.getParent();
        if (parent != null) {
            try {
                directoryStream = Files.newDirectoryStream(parent);
            } catch (Throwable unused) {
                directoryStream = null;
            }
            if (directoryStream != null) {
                DirectoryStream<Path> directoryStream2 = directoryStream;
                try {
                    DirectoryStream<Path> directoryStream3 = directoryStream2;
                    if (directoryStream3 instanceof SecureDirectoryStream) {
                        dVar.a(parent);
                        Path fileName = path.getFileName();
                        q.b(fileName, "getFileName(...)");
                        a((SecureDirectoryStream) directoryStream3, fileName, (Path) null, dVar);
                        z = false;
                    }
                    t tVar = t.INSTANCE;
                    kotlin.io.b.a(directoryStream2, null);
                } finally {
                }
            }
        }
        if (z) {
            a(path, (Path) null, dVar);
        }
        return dVar.b();
    }
}
