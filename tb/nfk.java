package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* loaded from: classes7.dex */
public final class nfk implements Closeable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final Pattern f31416a;
    private static final OutputStream p;
    private final File c;
    private final File d;
    private final File e;
    private final File f;
    private final int g;
    private long h;
    private final int i;
    private Writer k;
    private int m;
    private long j = 0;
    private final LinkedHashMap<String, b> l = new LinkedHashMap<>(0, 0.75f, true);
    private long n = 0;
    public final ThreadPoolExecutor b = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue());
    private final Callable<Void> o = new Callable<Void>() { // from class: tb.nfk.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Void, java.lang.Object] */
        @Override // java.util.concurrent.Callable
        public /* synthetic */ Void call() throws Exception {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ipChange.ipc$dispatch("6d249ded", new Object[]{this}) : a();
        }

        public Void a() throws Exception {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Void) ipChange.ipc$dispatch("ca430795", new Object[]{this});
            }
            synchronized (nfk.this) {
                if (nfk.a(nfk.this) == null) {
                    return null;
                }
                nfk.b(nfk.this);
                if (nfk.c(nfk.this)) {
                    nfk.d(nfk.this);
                    nfk.a(nfk.this, 0);
                }
                return null;
            }
        }
    };

    public static /* synthetic */ int a(nfk nfkVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("cd07f751", new Object[]{nfkVar, new Integer(i)})).intValue();
        }
        nfkVar.m = i;
        return i;
    }

    public static /* synthetic */ Writer a(nfk nfkVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Writer) ipChange.ipc$dispatch("8458c291", new Object[]{nfkVar}) : nfkVar.k;
    }

    public static /* synthetic */ void a(nfk nfkVar, a aVar, boolean z) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1dbd64af", new Object[]{nfkVar, aVar, new Boolean(z)});
        } else {
            nfkVar.a(aVar, z);
        }
    }

    public static /* synthetic */ void b(nfk nfkVar) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e49c0ac6", new Object[]{nfkVar});
        } else {
            nfkVar.j();
        }
    }

    public static /* synthetic */ boolean c(nfk nfkVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d31f114b", new Object[]{nfkVar})).booleanValue() : nfkVar.h();
    }

    public static /* synthetic */ OutputStream d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (OutputStream) ipChange.ipc$dispatch("ef8a673d", new Object[0]) : p;
    }

    public static /* synthetic */ void d(nfk nfkVar) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1a217c8", new Object[]{nfkVar});
        } else {
            nfkVar.g();
        }
    }

    public static /* synthetic */ int e(nfk nfkVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("b0251e3c", new Object[]{nfkVar})).intValue() : nfkVar.i;
    }

    public static /* synthetic */ File f(nfk nfkVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (File) ipChange.ipc$dispatch("fed73883", new Object[]{nfkVar}) : nfkVar.c;
    }

    static {
        kge.a(1805371372);
        kge.a(-1811054506);
        f31416a = Pattern.compile("[a-z0-9_-]{1,120}");
        p = new OutputStream() { // from class: tb.nfk.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.io.OutputStream
            public void write(int i) throws IOException {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("d7403add", new Object[]{this, new Integer(i)});
                }
            }
        };
    }

    private nfk(File file, int i, int i2, long j) {
        this.c = file;
        this.g = i;
        this.d = new File(file, "journal");
        this.e = new File(file, "journal.tmp");
        this.f = new File(file, "journal.bkp");
        this.i = i2;
        this.h = j;
    }

    public static nfk a(File file, int i, int i2, long j) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nfk) ipChange.ipc$dispatch("740d9d6e", new Object[]{file, new Integer(i), new Integer(i2), new Long(j)});
        }
        if (j <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        if (i2 <= 0) {
            throw new IllegalArgumentException("valueCount <= 0");
        }
        File file2 = new File(file, "journal.bkp");
        if (file2.exists()) {
            File file3 = new File(file, "journal");
            if (file3.exists()) {
                file2.delete();
            } else {
                a(file2, file3, false);
            }
        }
        nfk nfkVar = new nfk(file, i, i2, j);
        if (nfkVar.d.exists()) {
            try {
                nfkVar.e();
                nfkVar.f();
                return nfkVar;
            } catch (IOException e) {
                ngr.a("DiskLruCache " + file + " is corrupt: " + e.getMessage() + ", removing");
                nfkVar.c();
            }
        }
        file.mkdirs();
        nfk nfkVar2 = new nfk(file, i, i2, j);
        nfkVar2.g();
        return nfkVar2;
    }

    private void e() throws IOException {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        nfo nfoVar = new nfo(new FileInputStream(this.d), nfm.f31422a);
        try {
            String a2 = nfoVar.a();
            String a3 = nfoVar.a();
            String a4 = nfoVar.a();
            String a5 = nfoVar.a();
            String a6 = nfoVar.a();
            if (!"libcore.io.DiskLruCache".equals(a2) || !"1".equals(a3) || !Integer.toString(this.g).equals(a4) || !Integer.toString(this.i).equals(a5) || !"".equals(a6)) {
                throw new IOException("unexpected journal header: [" + a2 + ", " + a3 + ", " + a5 + ", " + a6 + riy.ARRAY_END_STR);
            }
            while (true) {
                try {
                    e(nfoVar.a());
                    i++;
                } catch (EOFException unused) {
                    this.m = i - this.l.size();
                    if (nfoVar.b()) {
                        g();
                    } else {
                        this.k = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.d, true), nfm.f31422a));
                    }
                    nfm.a(nfoVar);
                    return;
                }
            }
        } catch (Throwable th) {
            nfm.a(nfoVar);
            throw th;
        }
    }

    private void e(String str) throws IOException {
        String substring;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c6cb136", new Object[]{this, str});
            return;
        }
        int indexOf = str.indexOf(32);
        if (indexOf == -1) {
            throw new IOException("unexpected journal line: " + str);
        }
        int i = indexOf + 1;
        int indexOf2 = str.indexOf(32, i);
        if (indexOf2 == -1) {
            substring = str.substring(i);
            if (indexOf == 6 && str.startsWith("REMOVE")) {
                this.l.remove(substring);
                return;
            }
        } else {
            substring = str.substring(i, indexOf2);
        }
        b bVar = this.l.get(substring);
        if (bVar == null) {
            bVar = new b(substring);
            this.l.put(substring, bVar);
        }
        if (indexOf2 != -1 && indexOf == 5 && str.startsWith("CLEAN")) {
            String[] split = str.substring(indexOf2 + 1).split(" ");
            b.a(bVar, true);
            b.a(bVar, (a) null);
            b.a(bVar, split);
        } else if (indexOf2 == -1 && indexOf == 5 && str.startsWith("DIRTY")) {
            b.a(bVar, new a(bVar));
        } else if (indexOf2 == -1 && indexOf == 4 && str.startsWith("READ")) {
        } else {
            throw new IOException("unexpected journal line: " + str);
        }
    }

    private void f() throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        a(this.e);
        Iterator<b> it = this.l.values().iterator();
        while (it.hasNext()) {
            b next = it.next();
            if (b.a(next) == null) {
                for (int i = 0; i < this.i; i++) {
                    this.j += b.b(next)[i];
                }
            } else {
                b.a(next, (a) null);
                for (int i2 = 0; i2 < this.i; i2++) {
                    a(next.a(i2));
                    a(next.b(i2));
                }
                it.remove();
            }
        }
    }

    private synchronized void g() throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        if (this.k != null) {
            this.k.close();
        }
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.e), nfm.f31422a));
        bufferedWriter.write("libcore.io.DiskLruCache");
        bufferedWriter.write("\n");
        bufferedWriter.write("1");
        bufferedWriter.write("\n");
        bufferedWriter.write(Integer.toString(this.g));
        bufferedWriter.write("\n");
        bufferedWriter.write(Integer.toString(this.i));
        bufferedWriter.write("\n");
        bufferedWriter.write("\n");
        for (b bVar : this.l.values()) {
            if (b.a(bVar) != null) {
                bufferedWriter.write("DIRTY " + b.c(bVar) + '\n');
            } else {
                bufferedWriter.write("CLEAN " + b.c(bVar) + bVar.a() + '\n');
            }
        }
        bufferedWriter.close();
        if (this.d.exists()) {
            a(this.d, this.f, true);
        }
        a(this.e, this.d, false);
        this.f.delete();
        this.k = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.d, true), nfm.f31422a));
    }

    private static void a(File file) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a979fdf", new Object[]{file});
        } else if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    public boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{this, str})).booleanValue();
        }
        i();
        f(str);
        b bVar = this.l.get(str);
        return bVar != null && b.d(bVar);
    }

    private static void a(File file, File file2, boolean z) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d1d39e7e", new Object[]{file, file2, new Boolean(z)});
            return;
        }
        if (z) {
            a(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    public synchronized c b(String str) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("b3572441", new Object[]{this, str});
        }
        i();
        f(str);
        b bVar = this.l.get(str);
        if (bVar == null) {
            return null;
        }
        if (!b.d(bVar)) {
            return null;
        }
        InputStream[] inputStreamArr = new InputStream[this.i];
        for (int i = 0; i < this.i; i++) {
            try {
                inputStreamArr[i] = new FileInputStream(bVar.a(i));
            } catch (FileNotFoundException unused) {
                for (int i2 = 0; i2 < this.i && inputStreamArr[i2] != null; i2++) {
                    nfm.a(inputStreamArr[i2]);
                }
                return null;
            }
        }
        this.m++;
        this.k.append((CharSequence) ("READ " + str + '\n'));
        if (h()) {
            this.b.submit(this.o);
        }
        return new c(str, b.e(bVar), inputStreamArr, b.b(bVar));
    }

    public a c(String str) throws IOException {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("3b8763e2", new Object[]{this, str}) : a(str, -1L);
    }

    private synchronized a a(String str, long j) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("d860b384", new Object[]{this, str, new Long(j)});
        }
        i();
        f(str);
        b bVar = this.l.get(str);
        if (j != -1 && (bVar == null || b.e(bVar) != j)) {
            return null;
        }
        if (bVar == null) {
            bVar = new b(str);
            this.l.put(str, bVar);
        } else if (b.a(bVar) != null) {
            return null;
        }
        a aVar = new a(bVar);
        b.a(bVar, aVar);
        Writer writer = this.k;
        writer.write("DIRTY " + str + '\n');
        this.k.flush();
        return aVar;
    }

    private synchronized void a(a aVar, boolean z) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("850298ac", new Object[]{this, aVar, new Boolean(z)});
            return;
        }
        b a2 = a.a(aVar);
        if (b.a(a2) != aVar) {
            throw new IllegalStateException();
        }
        if (z && !b.d(a2)) {
            for (int i = 0; i < this.i; i++) {
                if (!a.b(aVar)[i]) {
                    aVar.b();
                    throw new IllegalStateException("Newly created entry didn't create value for index " + i);
                } else if (!a2.b(i).exists()) {
                    aVar.b();
                    ngr.b("DiskLruCache", "DiskLruCache: Newly created entry doesn't have file for index " + i);
                    return;
                }
            }
        }
        for (int i2 = 0; i2 < this.i; i2++) {
            File b2 = a2.b(i2);
            if (z) {
                if (b2.exists()) {
                    File a3 = a2.a(i2);
                    b2.renameTo(a3);
                    long j = b.b(a2)[i2];
                    long length = a3.length();
                    b.b(a2)[i2] = length;
                    this.j = (this.j - j) + length;
                }
            } else {
                a(b2);
            }
        }
        this.m++;
        b.a(a2, (a) null);
        if (b.d(a2) | z) {
            b.a(a2, true);
            this.k.write("CLEAN " + b.c(a2) + a2.a() + '\n');
            if (z) {
                long j2 = this.n;
                this.n = 1 + j2;
                b.a(a2, j2);
            }
        } else {
            this.l.remove(b.c(a2));
            this.k.write("REMOVE " + b.c(a2) + '\n');
        }
        this.k.flush();
        if (this.j > this.h || h()) {
            this.b.submit(this.o);
        }
    }

    private boolean h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5cf10f3", new Object[]{this})).booleanValue();
        }
        int i = this.m;
        return i >= 2000 && i >= this.l.size();
    }

    public synchronized boolean d(String str) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d23b17f9", new Object[]{this, str})).booleanValue();
        }
        i();
        f(str);
        b bVar = this.l.get(str);
        if (bVar != null && b.a(bVar) == null) {
            for (int i = 0; i < this.i; i++) {
                File a2 = bVar.a(i);
                if (a2.exists() && !a2.delete()) {
                    throw new IOException("failed to delete " + a2);
                }
                this.j -= b.b(bVar)[i];
                b.b(bVar)[i] = 0;
            }
            this.m++;
            this.k.append((CharSequence) ("REMOVE " + str + '\n'));
            this.l.remove(str);
            if (h()) {
                this.b.submit(this.o);
            }
            return true;
        }
        return false;
    }

    public synchronized boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        return this.k == null;
    }

    private void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
        } else if (this.k == null) {
            throw new IllegalStateException("cache is closed");
        }
    }

    public synchronized void b() throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        i();
        j();
        this.k.flush();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e32ba67f", new Object[]{this});
        } else if (this.k == null) {
        } else {
            Iterator it = new ArrayList(this.l.values()).iterator();
            while (it.hasNext()) {
                b bVar = (b) it.next();
                if (b.a(bVar) != null) {
                    b.a(bVar).b();
                }
            }
            j();
            this.k.close();
            this.k = null;
        }
    }

    private void j() throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb3ff1", new Object[]{this});
            return;
        }
        while (this.j > this.h) {
            d(this.l.entrySet().iterator().next().getKey());
        }
    }

    public void c() throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        close();
        nfm.a(this.c);
    }

    private void f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("669e4a77", new Object[]{this, str});
        } else if (f31416a.matcher(str).matches()) {
        } else {
            throw new IllegalArgumentException("keys must match regex [a-z0-9_-]{1,120}: \"" + str + "\"");
        }
    }

    /* loaded from: classes7.dex */
    public final class c implements Closeable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private final String b;
        private final long c;
        private final InputStream[] d;
        private final long[] e;

        static {
            kge.a(-1411565668);
            kge.a(-1811054506);
        }

        private c(String str, long j, InputStream[] inputStreamArr, long[] jArr) {
            this.b = str;
            this.c = j;
            this.d = inputStreamArr;
            this.e = jArr;
        }

        public InputStream a(int i) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (InputStream) ipChange.ipc$dispatch("19d3f31e", new Object[]{this, new Integer(i)}) : this.d[i];
        }

        public long b(int i) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a9d66c2e", new Object[]{this, new Integer(i)})).longValue() : this.e[i];
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e32ba67f", new Object[]{this});
                return;
            }
            for (InputStream inputStream : this.d) {
                nfm.a(inputStream);
            }
        }
    }

    /* loaded from: classes7.dex */
    public final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private final b b;
        private final boolean[] c;
        private boolean d;
        private boolean e;

        static {
            kge.a(424483141);
        }

        public static /* synthetic */ b a(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("252a260d", new Object[]{aVar}) : aVar.b;
        }

        public static /* synthetic */ boolean a(a aVar, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("850298b0", new Object[]{aVar, new Boolean(z)})).booleanValue();
            }
            aVar.d = z;
            return z;
        }

        public static /* synthetic */ boolean[] b(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (boolean[]) ipChange.ipc$dispatch("6693c4ac", new Object[]{aVar}) : aVar.c;
        }

        private a(b bVar) {
            this.b = bVar;
            this.c = b.d(bVar) ? null : new boolean[nfk.e(nfk.this)];
        }

        public OutputStream a(int i) throws IOException {
            FileOutputStream fileOutputStream;
            C1159a c1159a;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (OutputStream) ipChange.ipc$dispatch("a67bd48d", new Object[]{this, new Integer(i)});
            }
            if (i < 0 || i >= nfk.e(nfk.this)) {
                throw new IllegalArgumentException("Expected index " + i + " to be greater than 0 and less than the maximum value count of " + nfk.e(nfk.this));
            }
            synchronized (nfk.this) {
                if (b.a(this.b) != this) {
                    throw new IllegalStateException();
                }
                if (!b.d(this.b)) {
                    this.c[i] = true;
                }
                File b = this.b.b(i);
                try {
                    fileOutputStream = new FileOutputStream(b);
                } catch (FileNotFoundException unused) {
                    nfk.f(nfk.this).mkdirs();
                    try {
                        fileOutputStream = new FileOutputStream(b);
                    } catch (FileNotFoundException unused2) {
                        return nfk.d();
                    }
                }
                c1159a = new C1159a(fileOutputStream);
            }
            return c1159a;
        }

        public void a() throws IOException {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                return;
            }
            if (this.d) {
                nfk.a(nfk.this, this, false);
                nfk.this.d(b.c(this.b));
            } else {
                nfk.a(nfk.this, this, true);
            }
            this.e = true;
        }

        public void b() throws IOException {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            } else {
                nfk.a(nfk.this, this, false);
            }
        }

        /* renamed from: tb.nfk$a$a  reason: collision with other inner class name */
        /* loaded from: classes7.dex */
        public class C1159a extends FilterOutputStream {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            static {
                kge.a(1432668739);
            }

            private C1159a(OutputStream outputStream) {
                super(outputStream);
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream
            public void write(int i) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("d7403add", new Object[]{this, new Integer(i)});
                    return;
                }
                try {
                    this.out.write(i);
                } catch (IOException unused) {
                    a.a(a.this, true);
                }
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream
            public void write(byte[] bArr, int i, int i2) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("1b94b14d", new Object[]{this, bArr, new Integer(i), new Integer(i2)});
                    return;
                }
                try {
                    this.out.write(bArr, i, i2);
                } catch (IOException unused) {
                    a.a(a.this, true);
                }
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("e32ba67f", new Object[]{this});
                    return;
                }
                try {
                    this.out.close();
                } catch (IOException unused) {
                    a.a(a.this, true);
                }
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Flushable
            public void flush() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("dd889d8b", new Object[]{this});
                    return;
                }
                try {
                    this.out.flush();
                } catch (IOException unused) {
                    a.a(a.this, true);
                }
            }
        }
    }

    /* loaded from: classes7.dex */
    public final class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private final String b;
        private final long[] c;
        private boolean d;
        private a e;
        private long f;

        static {
            kge.a(152548762);
        }

        public static /* synthetic */ long a(b bVar, long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("85107411", new Object[]{bVar, new Long(j)})).longValue();
            }
            bVar.f = j;
            return j;
        }

        public static /* synthetic */ a a(b bVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("13ad2c6f", new Object[]{bVar}) : bVar.e;
        }

        public static /* synthetic */ a a(b bVar, a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("5c0db46f", new Object[]{bVar, aVar});
            }
            bVar.e = aVar;
            return aVar;
        }

        public static /* synthetic */ void a(b bVar, String[] strArr) throws IOException {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3a95fe38", new Object[]{bVar, strArr});
            } else {
                bVar.a(strArr);
            }
        }

        public static /* synthetic */ boolean a(b bVar, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("8510b031", new Object[]{bVar, new Boolean(z)})).booleanValue();
            }
            bVar.d = z;
            return z;
        }

        public static /* synthetic */ long[] b(b bVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (long[]) ipChange.ipc$dispatch("66a1dc1d", new Object[]{bVar}) : bVar.c;
        }

        public static /* synthetic */ String c(b bVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("cc1e9fb7", new Object[]{bVar}) : bVar.b;
        }

        public static /* synthetic */ boolean d(b bVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("e050b24e", new Object[]{bVar})).booleanValue() : bVar.d;
        }

        public static /* synthetic */ long e(b bVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("3a2c1c7f", new Object[]{bVar})).longValue() : bVar.f;
        }

        private b(String str) {
            this.b = str;
            this.c = new long[nfk.e(nfk.this)];
        }

        public String a() throws IOException {
            long[] jArr;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this});
            }
            StringBuilder sb = new StringBuilder();
            for (long j : this.c) {
                sb.append(' ');
                sb.append(j);
            }
            return sb.toString();
        }

        private void a(String[] strArr) throws IOException {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3b26fb7", new Object[]{this, strArr});
            } else if (strArr.length != nfk.e(nfk.this)) {
                throw b(strArr);
            } else {
                for (int i = 0; i < strArr.length; i++) {
                    try {
                        this.c[i] = Long.parseLong(strArr[i]);
                    } catch (NumberFormatException unused) {
                        throw b(strArr);
                    }
                }
            }
        }

        private IOException b(String[] strArr) throws IOException {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (IOException) ipChange.ipc$dispatch("1c52bc7a", new Object[]{this, strArr});
            }
            throw new IOException("unexpected journal line: " + Arrays.toString(strArr));
        }

        public File a(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (File) ipChange.ipc$dispatch("94b22552", new Object[]{this, new Integer(i)});
            }
            File f = nfk.f(nfk.this);
            return new File(f, this.b + "." + i);
        }

        public File b(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (File) ipChange.ipc$dispatch("625c8713", new Object[]{this, new Integer(i)});
            }
            File f = nfk.f(nfk.this);
            return new File(f, this.b + "." + i + ".tmp");
        }
    }
}
