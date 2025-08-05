package kotlin.io;

import java.io.File;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import kotlin.t;
import kotlin.v;
import tb.rul;
import tb.ruw;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u001a\u001b\u001cB\u0019\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006B\u0089\u0001\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b\u0018\u00010\b\u00128\u0010\f\u001a4\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\u000b\u0018\u00010\r\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0014¢\u0006\u0002\u0010\u0015J\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u0017H\u0096\u0002J\u000e\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0014J\u001a\u0010\u0007\u001a\u00020\u00002\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t0\bJ \u0010\f\u001a\u00020\u00002\u0018\u0010\u0019\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u000b0\rJ\u001a\u0010\n\u001a\u00020\u00002\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b0\bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t\u0018\u00010\bX\u0082\u0004¢\u0006\u0002\n\u0000R@\u0010\f\u001a4\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\u000b\u0018\u00010\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b\u0018\u00010\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0002X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lkotlin/io/FileTreeWalk;", "Lkotlin/sequences/Sequence;", "Ljava/io/File;", "start", "direction", "Lkotlin/io/FileWalkDirection;", "(Ljava/io/File;Lkotlin/io/FileWalkDirection;)V", "onEnter", "Lkotlin/Function1;", "", "onLeave", "", "onFail", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "f", "Ljava/io/IOException;", "e", "maxDepth", "", "(Ljava/io/File;Lkotlin/io/FileWalkDirection;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;I)V", com.taobao.android.weex_framework.util.a.ATOM_EXT_iterator, "", "depth", com.taobao.android.weex_framework.util.a.ATOM_function, "DirectoryState", "FileTreeWalkIterator", "WalkState", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class d implements kotlin.sequences.e<File> {

    /* renamed from: a  reason: collision with root package name */
    private final File f24924a;
    private final FileWalkDirection b;
    private final rul<File, Boolean> c;
    private final rul<File, t> d;
    private final ruw<File, IOException, t> e;
    private final int f;

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\"\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lkotlin/io/FileTreeWalk$DirectoryState;", "Lkotlin/io/FileTreeWalk$WalkState;", "rootDir", "Ljava/io/File;", "(Ljava/io/File;)V", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes9.dex */
    public static abstract class a extends c {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(File rootDir) {
            super(rootDir);
            q.d(rootDir, "rootDir");
            if (v.ENABLED) {
                boolean isDirectory = rootDir.isDirectory();
                if (v.ENABLED && !isDirectory) {
                    throw new AssertionError("rootDir must be verified to be directory beforehand.");
                }
            }
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\r\u000e\u000fB\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0007\u001a\u00020\bH\u0014J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0002H\u0002J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0002H\u0082\u0010R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lkotlin/io/FileTreeWalk$FileTreeWalkIterator;", "Lkotlin/collections/AbstractIterator;", "Ljava/io/File;", "(Lkotlin/io/FileTreeWalk;)V", "state", "Ljava/util/ArrayDeque;", "Lkotlin/io/FileTreeWalk$WalkState;", "computeNext", "", "directoryState", "Lkotlin/io/FileTreeWalk$DirectoryState;", "root", "gotoNext", "BottomUpDirectoryState", "SingleFileState", "TopDownDirectoryState", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes9.dex */
    private final class b extends kotlin.collections.b<File> {
        private final ArrayDeque<c> b = new ArrayDeque<>();

        /* JADX INFO: Access modifiers changed from: private */
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\n\u0010\r\u001a\u0004\u0018\u00010\u0003H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\nX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000bR\u000e\u0010\f\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lkotlin/io/FileTreeWalk$FileTreeWalkIterator$BottomUpDirectoryState;", "Lkotlin/io/FileTreeWalk$DirectoryState;", "rootDir", "Ljava/io/File;", "(Lkotlin/io/FileTreeWalk$FileTreeWalkIterator;Ljava/io/File;)V", "failed", "", "fileIndex", "", "fileList", "", "[Ljava/io/File;", "rootVisited", "step", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes9.dex */
        public final class a extends a {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ b f24926a;
            private boolean b;
            private File[] c;
            private int d;
            private boolean e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(b bVar, File rootDir) {
                super(rootDir);
                q.d(rootDir, "rootDir");
                this.f24926a = bVar;
            }

            @Override // kotlin.io.d.c
            public File a() {
                if (!this.e && this.c == null) {
                    rul rulVar = d.this.c;
                    boolean z = false;
                    if (rulVar != null && !((Boolean) rulVar.mo2421invoke(b())).booleanValue()) {
                        z = true;
                    }
                    if (z) {
                        return null;
                    }
                    this.c = b().listFiles();
                    if (this.c == null) {
                        ruw ruwVar = d.this.e;
                        if (ruwVar != null) {
                            ruwVar.mo2423invoke(b(), new AccessDeniedException(b(), null, "Cannot list files in a directory", 2, null));
                        }
                        this.e = true;
                    }
                }
                File[] fileArr = this.c;
                if (fileArr != null) {
                    int i = this.d;
                    q.a(fileArr);
                    if (i < fileArr.length) {
                        File[] fileArr2 = this.c;
                        q.a(fileArr2);
                        int i2 = this.d;
                        this.d = i2 + 1;
                        return fileArr2[i2];
                    }
                }
                if (!this.b) {
                    this.b = true;
                    return b();
                }
                rul rulVar2 = d.this.d;
                if (rulVar2 != null) {
                    rulVar2.mo2421invoke(b());
                }
                return null;
            }
        }

        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0082\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\n\u0010\u0007\u001a\u0004\u0018\u00010\u0003H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lkotlin/io/FileTreeWalk$FileTreeWalkIterator$SingleFileState;", "Lkotlin/io/FileTreeWalk$WalkState;", "rootFile", "Ljava/io/File;", "(Lkotlin/io/FileTreeWalk$FileTreeWalkIterator;Ljava/io/File;)V", "visited", "", "step", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: kotlin.io.d$b$b  reason: collision with other inner class name */
        /* loaded from: classes9.dex */
        private final class C1069b extends c {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ b f24927a;
            private boolean b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1069b(b bVar, File rootFile) {
                super(rootFile);
                q.d(rootFile, "rootFile");
                this.f24927a = bVar;
                if (v.ENABLED) {
                    boolean isFile = rootFile.isFile();
                    if (v.ENABLED && !isFile) {
                        throw new AssertionError("rootFile must be verified to be file beforehand.");
                    }
                }
            }

            @Override // kotlin.io.d.c
            public File a() {
                if (this.b) {
                    return null;
                }
                this.b = true;
                return b();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0082\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\n\u0010\f\u001a\u0004\u0018\u00010\u0003H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\bX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lkotlin/io/FileTreeWalk$FileTreeWalkIterator$TopDownDirectoryState;", "Lkotlin/io/FileTreeWalk$DirectoryState;", "rootDir", "Ljava/io/File;", "(Lkotlin/io/FileTreeWalk$FileTreeWalkIterator;Ljava/io/File;)V", "fileIndex", "", "fileList", "", "[Ljava/io/File;", "rootVisited", "", "step", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes9.dex */
        public final class c extends a {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ b f24928a;
            private boolean b;
            private File[] c;
            private int d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(b bVar, File rootDir) {
                super(rootDir);
                q.d(rootDir, "rootDir");
                this.f24928a = bVar;
            }

            /* JADX WARN: Code restructure failed: missing block: B:32:0x0085, code lost:
                if (r0.length == 0) goto L32;
             */
            @Override // kotlin.io.d.c
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public java.io.File a() {
                /*
                    r10 = this;
                    boolean r0 = r10.b
                    r1 = 0
                    if (r0 != 0) goto L2c
                    kotlin.io.d$b r0 = r10.f24928a
                    kotlin.io.d r0 = kotlin.io.d.this
                    tb.rul r0 = kotlin.io.d.a(r0)
                    r2 = 0
                    r3 = 1
                    if (r0 == 0) goto L22
                    java.io.File r4 = r10.b()
                    java.lang.Object r0 = r0.mo2421invoke(r4)
                    java.lang.Boolean r0 = (java.lang.Boolean) r0
                    boolean r0 = r0.booleanValue()
                    if (r0 != 0) goto L22
                    r2 = 1
                L22:
                    if (r2 == 0) goto L25
                    return r1
                L25:
                    r10.b = r3
                    java.io.File r0 = r10.b()
                    return r0
                L2c:
                    java.io.File[] r0 = r10.c
                    if (r0 == 0) goto L4b
                    int r2 = r10.d
                    kotlin.jvm.internal.q.a(r0)
                    int r0 = r0.length
                    if (r2 >= r0) goto L39
                    goto L4b
                L39:
                    kotlin.io.d$b r0 = r10.f24928a
                    kotlin.io.d r0 = kotlin.io.d.this
                    tb.rul r0 = kotlin.io.d.c(r0)
                    if (r0 == 0) goto L4a
                    java.io.File r2 = r10.b()
                    r0.mo2421invoke(r2)
                L4a:
                    return r1
                L4b:
                    java.io.File[] r0 = r10.c
                    if (r0 != 0) goto L99
                    java.io.File r0 = r10.b()
                    java.io.File[] r0 = r0.listFiles()
                    r10.c = r0
                    java.io.File[] r0 = r10.c
                    if (r0 != 0) goto L7d
                    kotlin.io.d$b r0 = r10.f24928a
                    kotlin.io.d r0 = kotlin.io.d.this
                    tb.ruw r0 = kotlin.io.d.b(r0)
                    if (r0 == 0) goto L7d
                    java.io.File r2 = r10.b()
                    kotlin.io.AccessDeniedException r9 = new kotlin.io.AccessDeniedException
                    java.io.File r4 = r10.b()
                    r5 = 0
                    r7 = 2
                    r8 = 0
                    java.lang.String r6 = "Cannot list files in a directory"
                    r3 = r9
                    r3.<init>(r4, r5, r6, r7, r8)
                    r0.mo2423invoke(r2, r9)
                L7d:
                    java.io.File[] r0 = r10.c
                    if (r0 == 0) goto L87
                    kotlin.jvm.internal.q.a(r0)
                    int r0 = r0.length
                    if (r0 != 0) goto L99
                L87:
                    kotlin.io.d$b r0 = r10.f24928a
                    kotlin.io.d r0 = kotlin.io.d.this
                    tb.rul r0 = kotlin.io.d.c(r0)
                    if (r0 == 0) goto L98
                    java.io.File r2 = r10.b()
                    r0.mo2421invoke(r2)
                L98:
                    return r1
                L99:
                    java.io.File[] r0 = r10.c
                    kotlin.jvm.internal.q.a(r0)
                    int r1 = r10.d
                    int r2 = r1 + 1
                    r10.d = r2
                    r0 = r0[r1]
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlin.io.d.b.c.a():java.io.File");
            }
        }

        public b() {
            ArrayDeque<c> arrayDeque;
            c c1069b;
            if (d.this.f24924a.isDirectory()) {
                arrayDeque = this.b;
                c1069b = a(d.this.f24924a);
            } else if (!d.this.f24924a.isFile()) {
                b();
                return;
            } else {
                arrayDeque = this.b;
                c1069b = new C1069b(this, d.this.f24924a);
            }
            arrayDeque.push(c1069b);
        }

        private final a a(File file) {
            a cVar;
            int i = e.$EnumSwitchMapping$0[d.this.b.ordinal()];
            if (i == 1) {
                cVar = new c(this, file);
            } else if (i != 2) {
                throw new NoWhenBranchMatchedException();
            } else {
                cVar = new a(this, file);
            }
            return cVar;
        }

        private final File c() {
            File a2;
            while (true) {
                c peek = this.b.peek();
                if (peek == null) {
                    return null;
                }
                a2 = peek.a();
                if (a2 == null) {
                    this.b.pop();
                } else if (q.a(a2, peek.b()) || !a2.isDirectory() || this.b.size() >= d.this.f) {
                    break;
                } else {
                    this.b.push(a(a2));
                }
            }
            return a2;
        }

        @Override // kotlin.collections.b
        protected void a() {
            File c2 = c();
            if (c2 != null) {
                a((b) c2);
            } else {
                b();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\"\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\n\u0010\u0007\u001a\u0004\u0018\u00010\u0003H&R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lkotlin/io/FileTreeWalk$WalkState;", "", "root", "Ljava/io/File;", "(Ljava/io/File;)V", "getRoot", "()Ljava/io/File;", "step", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes9.dex */
    public static abstract class c {

        /* renamed from: a  reason: collision with root package name */
        private final File f24929a;

        public c(File root) {
            q.d(root, "root");
            this.f24929a = root;
        }

        public abstract File a();

        public final File b() {
            return this.f24929a;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public d(File start, FileWalkDirection direction) {
        this(start, direction, null, null, null, 0, 32, null);
        q.d(start, "start");
        q.d(direction, "direction");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private d(File file, FileWalkDirection fileWalkDirection, rul<? super File, Boolean> rulVar, rul<? super File, t> rulVar2, ruw<? super File, ? super IOException, t> ruwVar, int i) {
        this.f24924a = file;
        this.b = fileWalkDirection;
        this.c = rulVar;
        this.d = rulVar2;
        this.e = ruwVar;
        this.f = i;
    }

    /* synthetic */ d(File file, FileWalkDirection fileWalkDirection, rul rulVar, rul rulVar2, ruw ruwVar, int i, int i2, o oVar) {
        this(file, (i2 & 2) != 0 ? FileWalkDirection.TOP_DOWN : fileWalkDirection, rulVar, rulVar2, ruwVar, (i2 & 32) != 0 ? Integer.MAX_VALUE : i);
    }

    @Override // kotlin.sequences.e
    public Iterator<File> a() {
        return new b();
    }
}
