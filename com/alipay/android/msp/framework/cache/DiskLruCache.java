package com.alipay.android.msp.framework.cache;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.StringWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes3.dex */
public final class DiskLruCache implements Closeable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final File f4675a;
    private final File b;
    private final File c;
    private final int d;
    private final long e;
    private final int f;
    private Writer h;
    private int j;
    private long g = 0;
    private final LinkedHashMap<String, Entry> i = new LinkedHashMap<>(0, 0.75f, true);
    private long k = 0;
    private final ThreadPoolExecutor l = new ThreadPoolExecutor(0, 1, 2, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactory() { // from class: com.alipay.android.msp.framework.cache.DiskLruCache.1
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private final AtomicInteger b = new AtomicInteger(1);

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Thread) ipChange.ipc$dispatch("d8079a58", new Object[]{this, runnable});
            }
            return new Thread(runnable, "MspDiskLru #" + this.b.getAndIncrement());
        }
    });
    private final Callable<Void> m = new Callable<Void>() { // from class: com.alipay.android.msp.framework.cache.DiskLruCache.2
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // java.util.concurrent.Callable
        public Void call() throws Exception {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Void) ipChange.ipc$dispatch("b898ca78", new Object[]{this});
            }
            synchronized (DiskLruCache.this) {
                if (DiskLruCache.a(DiskLruCache.this) == null) {
                    return null;
                }
                DiskLruCache.b(DiskLruCache.this);
                if (DiskLruCache.c(DiskLruCache.this)) {
                    DiskLruCache.d(DiskLruCache.this);
                    DiskLruCache.a(DiskLruCache.this, 0);
                }
                return null;
            }
        }
    };

    public static /* synthetic */ int a(DiskLruCache diskLruCache, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ad65b7e7", new Object[]{diskLruCache, new Integer(i)})).intValue();
        }
        diskLruCache.j = i;
        return i;
    }

    public static /* synthetic */ Editor a(DiskLruCache diskLruCache, String str, long j) throws IOException {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Editor) ipChange.ipc$dispatch("9e130cd3", new Object[]{diskLruCache, str, new Long(j)}) : diskLruCache.a(str, j);
    }

    public static /* synthetic */ Writer a(DiskLruCache diskLruCache) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Writer) ipChange.ipc$dispatch("3436c4a7", new Object[]{diskLruCache}) : diskLruCache.h;
    }

    public static /* synthetic */ void a(DiskLruCache diskLruCache, Editor editor, boolean z) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51519b3d", new Object[]{diskLruCache, editor, new Boolean(z)});
        } else {
            diskLruCache.a(editor, z);
        }
    }

    public static /* synthetic */ void b(DiskLruCache diskLruCache) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a42f00e", new Object[]{diskLruCache});
        } else {
            diskLruCache.f();
        }
    }

    public static /* synthetic */ boolean c(DiskLruCache diskLruCache) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("17300731", new Object[]{diskLruCache})).booleanValue() : diskLruCache.d();
    }

    public static /* synthetic */ void d(DiskLruCache diskLruCache) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a41d1e4c", new Object[]{diskLruCache});
        } else {
            diskLruCache.a();
        }
    }

    public static /* synthetic */ int e(DiskLruCache diskLruCache) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("310a355e", new Object[]{diskLruCache})).intValue() : diskLruCache.f;
    }

    public static /* synthetic */ File f(DiskLruCache diskLruCache) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (File) ipChange.ipc$dispatch("a7f6a8c3", new Object[]{diskLruCache}) : diskLruCache.b;
    }

    public static String readFully(Reader reader) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("50cc1195", new Object[]{reader});
        }
        try {
            StringWriter stringWriter = new StringWriter();
            char[] cArr = new char[1024];
            while (true) {
                int read = reader.read(cArr);
                if (read != -1) {
                    stringWriter.write(cArr, 0, read);
                } else {
                    return stringWriter.toString();
                }
            }
        } finally {
            reader.close();
        }
    }

    public static String readAsciiLine(InputStream inputStream) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("746440e3", new Object[]{inputStream});
        }
        StringBuilder sb = new StringBuilder(80);
        while (true) {
            int read = inputStream.read();
            if (read == -1) {
                throw new EOFException();
            }
            if (read != 10) {
                sb.append((char) read);
            } else {
                int length = sb.length();
                if (length > 0) {
                    int i = length - 1;
                    if (sb.charAt(i) == '\r') {
                        sb.setLength(i);
                    }
                }
                return sb.toString();
            }
        }
    }

    public static void closeQuietly(Closeable closeable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e61d37bb", new Object[]{closeable});
        } else if (closeable == null) {
        } else {
            try {
                closeable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }

    public static void deleteContents(File file) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea1b3063", new Object[]{file});
            return;
        }
        File[] listFiles = file.listFiles();
        if (listFiles == null) {
            throw new IllegalArgumentException("not a directory: ".concat(String.valueOf(file)));
        }
        for (File file2 : listFiles) {
            if (file2.isDirectory()) {
                deleteContents(file2);
            }
            if (!file2.delete()) {
                throw new IOException("failed to delete file: ".concat(String.valueOf(file2)));
            }
        }
    }

    private DiskLruCache(File file, int i, int i2, long j) {
        this.b = file;
        this.d = i;
        this.c = new File(file, "journal");
        this.f4675a = new File(file, "journal.tmp");
        this.f = i2;
        this.e = j;
        this.l.allowCoreThreadTimeOut(true);
    }

    public static DiskLruCache open(File file, int i, int i2, long j) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DiskLruCache) ipChange.ipc$dispatch("e98c93a3", new Object[]{file, new Integer(i), new Integer(i2), new Long(j)});
        }
        if (j <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        if (i2 <= 0) {
            throw new IllegalArgumentException("valueCount <= 0");
        }
        DiskLruCache diskLruCache = new DiskLruCache(file, i, i2, j);
        if (diskLruCache.c.exists()) {
            try {
                diskLruCache.b();
                diskLruCache.c();
                diskLruCache.h = new BufferedWriter(new FileWriter(diskLruCache.c, true), 4096);
                return diskLruCache;
            } catch (IOException unused) {
                diskLruCache.delete();
            }
        }
        file.mkdirs();
        DiskLruCache diskLruCache2 = new DiskLruCache(file, i, i2, j);
        diskLruCache2.a();
        return diskLruCache2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x011c, code lost:
        throw new java.io.IOException("unexpected journal line: ".concat(java.lang.String.valueOf(r0)));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void b() throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 352
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.android.msp.framework.cache.DiskLruCache.b():void");
    }

    private void c() throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        a(this.f4675a);
        Iterator<Entry> it = this.i.values().iterator();
        while (it.hasNext()) {
            Entry next = it.next();
            if (Entry.a(next) == null) {
                for (int i = 0; i < this.f; i++) {
                    this.g += Entry.b(next)[i];
                }
            } else {
                Entry.a(next, (Editor) null);
                for (int i2 = 0; i2 < this.f; i2++) {
                    a(next.getCleanFile(i2));
                    a(next.getDirtyFile(i2));
                }
                it.remove();
            }
        }
    }

    private synchronized void a() throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        if (this.h != null) {
            this.h.close();
        }
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(this.f4675a), 4096);
        bufferedWriter.write("libcore.io.DiskLruCache");
        bufferedWriter.write("\n");
        bufferedWriter.write("1");
        bufferedWriter.write("\n");
        bufferedWriter.write(Integer.toString(this.d));
        bufferedWriter.write("\n");
        bufferedWriter.write(Integer.toString(this.f));
        bufferedWriter.write("\n");
        bufferedWriter.write("\n");
        for (Entry entry : this.i.values()) {
            if (Entry.a(entry) != null) {
                bufferedWriter.write("DIRTY " + Entry.c(entry) + '\n');
            } else {
                bufferedWriter.write("CLEAN " + Entry.c(entry) + entry.getLengths() + '\n');
            }
        }
        bufferedWriter.close();
        this.f4675a.renameTo(this.c);
        this.h = new BufferedWriter(new FileWriter(this.c, true), 4096);
    }

    private static void a(File file) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a979fdf", new Object[]{file});
        } else if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    public final synchronized Snapshot get(String str) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Snapshot) ipChange.ipc$dispatch("e1e8bb20", new Object[]{this, str});
        }
        e();
        a(str);
        Entry entry = this.i.get(str);
        if (entry == null) {
            return null;
        }
        if (!Entry.d(entry)) {
            return null;
        }
        InputStream[] inputStreamArr = new InputStream[this.f];
        for (int i = 0; i < this.f; i++) {
            try {
                inputStreamArr[i] = new FileInputStream(entry.getCleanFile(i));
            } catch (FileNotFoundException unused) {
                return null;
            }
        }
        this.j++;
        this.h.append((CharSequence) ("READ " + str + '\n'));
        if (d()) {
            this.l.submit(this.m);
        }
        return new Snapshot(str, Entry.e(entry), inputStreamArr);
    }

    public final Editor edit(String str) throws IOException {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Editor) ipChange.ipc$dispatch("eeb35aa3", new Object[]{this, str}) : a(str, -1L);
    }

    private synchronized Editor a(String str, long j) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Editor) ipChange.ipc$dispatch("f3e7508c", new Object[]{this, str, new Long(j)});
        }
        e();
        a(str);
        Entry entry = this.i.get(str);
        if (j != -1 && (entry == null || Entry.e(entry) != j)) {
            return null;
        }
        if (entry == null) {
            entry = new Entry(str);
            this.i.put(str, entry);
        } else if (Entry.a(entry) != null) {
            return null;
        }
        Editor editor = new Editor(entry);
        Entry.a(entry, editor);
        Writer writer = this.h;
        writer.write("DIRTY " + str + '\n');
        this.h.flush();
        return editor;
    }

    public final File getDirectory() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (File) ipChange.ipc$dispatch("9c45090f", new Object[]{this}) : this.b;
    }

    public final long maxSize() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ab8be180", new Object[]{this})).longValue() : this.e;
    }

    public final synchronized long size() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("32697bfc", new Object[]{this})).longValue();
        }
        return this.g;
    }

    private synchronized void a(Editor editor, boolean z) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc96aa64", new Object[]{this, editor, new Boolean(z)});
            return;
        }
        Entry a2 = Editor.a(editor);
        if (Entry.a(a2) != editor) {
            throw new IllegalStateException();
        }
        if (z && !Entry.d(a2)) {
            for (int i = 0; i < this.f; i++) {
                if (!a2.getDirtyFile(i).exists()) {
                    editor.abort();
                    throw new IllegalStateException("edit didn't create file ".concat(String.valueOf(i)));
                }
            }
        }
        for (int i2 = 0; i2 < this.f; i2++) {
            File dirtyFile = a2.getDirtyFile(i2);
            if (z) {
                if (dirtyFile.exists()) {
                    File cleanFile = a2.getCleanFile(i2);
                    dirtyFile.renameTo(cleanFile);
                    long j = Entry.b(a2)[i2];
                    long length = cleanFile.length();
                    Entry.b(a2)[i2] = length;
                    this.g = (this.g - j) + length;
                }
            } else {
                a(dirtyFile);
            }
        }
        this.j++;
        Entry.a(a2, (Editor) null);
        if (Entry.d(a2) | z) {
            Entry.a(a2, true);
            this.h.write("CLEAN " + Entry.c(a2) + a2.getLengths() + '\n');
            if (z) {
                long j2 = this.k;
                this.k = 1 + j2;
                Entry.a(a2, j2);
            }
        } else {
            this.i.remove(Entry.c(a2));
            this.h.write("REMOVE " + Entry.c(a2) + '\n');
        }
        if (this.g > this.e || d()) {
            this.l.submit(this.m);
        }
    }

    private boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue();
        }
        int i = this.j;
        return i >= 2000 && i >= this.i.size();
    }

    public final synchronized boolean remove(String str) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("39af3819", new Object[]{this, str})).booleanValue();
        }
        e();
        a(str);
        Entry entry = this.i.get(str);
        if (entry != null && Entry.a(entry) == null) {
            for (int i = 0; i < this.f; i++) {
                File cleanFile = entry.getCleanFile(i);
                if (!cleanFile.delete()) {
                    throw new IOException("failed to delete ".concat(String.valueOf(cleanFile)));
                }
                this.g -= Entry.b(entry)[i];
                Entry.b(entry)[i] = 0;
            }
            this.j++;
            this.h.append((CharSequence) ("REMOVE " + str + '\n'));
            this.i.remove(str);
            if (d()) {
                this.l.submit(this.m);
            }
            return true;
        }
        return false;
    }

    public final boolean isClosed() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6afccc1", new Object[]{this})).booleanValue() : this.h == null;
    }

    private void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
        } else if (this.h == null) {
            throw new IllegalStateException("cache is closed");
        }
    }

    public final synchronized void flush() throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd889d8b", new Object[]{this});
            return;
        }
        e();
        f();
        this.h.flush();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e32ba67f", new Object[]{this});
        } else if (this.h == null) {
        } else {
            Iterator it = new ArrayList(this.i.values()).iterator();
            while (it.hasNext()) {
                Entry entry = (Entry) it.next();
                if (Entry.a(entry) != null) {
                    Entry.a(entry).abort();
                }
            }
            f();
            this.h.close();
            this.h = null;
        }
    }

    private void f() throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        while (this.g > this.e) {
            remove(this.i.entrySet().iterator().next().getKey());
        }
    }

    public final void delete() throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("691b3cb2", new Object[]{this});
            return;
        }
        close();
        deleteContents(this.b);
    }

    private static void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{str});
        } else if (!str.contains(" ") && !str.contains("\n") && !str.contains("\r")) {
        } else {
            throw new IllegalArgumentException("keys must not contain spaces or newlines: \"" + str + "\"");
        }
    }

    /* loaded from: classes3.dex */
    public final class Snapshot implements Closeable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private final String b;
        private final long c;
        private final InputStream[] d;

        private Snapshot(String str, long j, InputStream[] inputStreamArr) {
            this.b = str;
            this.c = j;
            this.d = inputStreamArr;
        }

        public final Editor edit() throws IOException {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Editor) ipChange.ipc$dispatch("e109606d", new Object[]{this}) : DiskLruCache.a(DiskLruCache.this, this.b, this.c);
        }

        public final InputStream getInputStream(int i) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (InputStream) ipChange.ipc$dispatch("e109cc2b", new Object[]{this, new Integer(i)}) : this.d[i];
        }

        public final String getString(int i) throws IOException {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("134d0c8b", new Object[]{this, new Integer(i)}) : DiskLruCache.a(getInputStream(i));
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e32ba67f", new Object[]{this});
                return;
            }
            for (InputStream inputStream : this.d) {
                DiskLruCache.closeQuietly(inputStream);
            }
        }
    }

    /* loaded from: classes3.dex */
    public final class Editor {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private final Entry b;
        private boolean c;

        public static /* synthetic */ Entry a(Editor editor) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Entry) ipChange.ipc$dispatch("a1b40a49", new Object[]{editor}) : editor.b;
        }

        public static /* synthetic */ boolean a(Editor editor, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("cc96aa68", new Object[]{editor, new Boolean(z)})).booleanValue();
            }
            editor.c = z;
            return z;
        }

        private Editor(Entry entry) {
            this.b = entry;
        }

        public final InputStream newInputStream(int i) throws IOException {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (InputStream) ipChange.ipc$dispatch("9b080975", new Object[]{this, new Integer(i)});
            }
            synchronized (DiskLruCache.this) {
                if (Entry.a(this.b) != this) {
                    throw new IllegalStateException();
                }
                if (!Entry.d(this.b)) {
                    return null;
                }
                return new FileInputStream(this.b.getCleanFile(i));
            }
        }

        public final String getString(int i) throws IOException {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("134d0c8b", new Object[]{this, new Integer(i)});
            }
            InputStream newInputStream = newInputStream(i);
            if (newInputStream == null) {
                return null;
            }
            return DiskLruCache.a(newInputStream);
        }

        public final OutputStream newOutputStream(int i) throws IOException {
            FaultHidingOutputStream faultHidingOutputStream;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (OutputStream) ipChange.ipc$dispatch("b00c21cd", new Object[]{this, new Integer(i)});
            }
            synchronized (DiskLruCache.this) {
                if (Entry.a(this.b) != this) {
                    throw new IllegalStateException();
                }
                faultHidingOutputStream = new FaultHidingOutputStream(new FileOutputStream(this.b.getDirtyFile(i)));
            }
            return faultHidingOutputStream;
        }

        public final void set(int i, String str) throws IOException {
            OutputStreamWriter outputStreamWriter;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d0bd7f84", new Object[]{this, new Integer(i), str});
                return;
            }
            OutputStreamWriter outputStreamWriter2 = null;
            try {
                outputStreamWriter = new OutputStreamWriter(newOutputStream(i), "UTF-8");
            } catch (Throwable th) {
                th = th;
            }
            try {
                outputStreamWriter.write(str);
                DiskLruCache.closeQuietly(outputStreamWriter);
            } catch (Throwable th2) {
                th = th2;
                outputStreamWriter2 = outputStreamWriter;
                DiskLruCache.closeQuietly(outputStreamWriter2);
                throw th;
            }
        }

        public final void commit() throws IOException {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c9f3a3e", new Object[]{this});
            } else if (this.c) {
                DiskLruCache.a(DiskLruCache.this, this, false);
                DiskLruCache.this.remove(Entry.c(this.b));
            } else {
                DiskLruCache.a(DiskLruCache.this, this, true);
            }
        }

        public final void abort() throws IOException {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("aaf58fb7", new Object[]{this});
            } else {
                DiskLruCache.a(DiskLruCache.this, this, false);
            }
        }

        /* loaded from: classes3.dex */
        public class FaultHidingOutputStream extends FilterOutputStream {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            private FaultHidingOutputStream(OutputStream outputStream) {
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
                    Editor.a(Editor.this, true);
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
                    Editor.a(Editor.this, true);
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
                    Editor.a(Editor.this, true);
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
                    Editor.a(Editor.this, true);
                }
            }
        }
    }

    /* loaded from: classes3.dex */
    public final class Entry {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private final String b;
        private final long[] c;
        private boolean d;
        private Editor e;
        private long f;

        public static /* synthetic */ long a(Entry entry, long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("5bf9497", new Object[]{entry, new Long(j)})).longValue();
            }
            entry.f = j;
            return j;
        }

        public static /* synthetic */ Editor a(Entry entry) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Editor) ipChange.ipc$dispatch("6b8a65bd", new Object[]{entry}) : entry.e;
        }

        public static /* synthetic */ Editor a(Entry entry, Editor editor) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Editor) ipChange.ipc$dispatch("d7d0ba35", new Object[]{entry, editor});
            }
            entry.e = editor;
            return editor;
        }

        public static /* synthetic */ boolean a(Entry entry, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("5bfd0b7", new Object[]{entry, new Boolean(z)})).booleanValue();
            }
            entry.d = z;
            return z;
        }

        public static /* synthetic */ long[] b(Entry entry) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (long[]) ipChange.ipc$dispatch("537e96c5", new Object[]{entry}) : entry.c;
        }

        public static /* synthetic */ String c(Entry entry) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("340a2081", new Object[]{entry}) : entry.b;
        }

        public static /* synthetic */ boolean d(Entry entry) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d62935e2", new Object[]{entry})).booleanValue() : entry.d;
        }

        public static /* synthetic */ long e(Entry entry) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("548a39b1", new Object[]{entry})).longValue() : entry.f;
        }

        private Entry(String str) {
            this.b = str;
            this.c = new long[DiskLruCache.e(DiskLruCache.this)];
        }

        public final String getLengths() throws IOException {
            long[] jArr;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("f60f5542", new Object[]{this});
            }
            StringBuilder sb = new StringBuilder();
            for (long j : this.c) {
                sb.append(' ');
                sb.append(j);
            }
            return sb.toString();
        }

        private static IOException a(String[] strArr) throws IOException {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (IOException) ipChange.ipc$dispatch("5966531b", new Object[]{strArr});
            }
            throw new IOException("unexpected journal line: " + Arrays.toString(strArr));
        }

        public final File getCleanFile(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (File) ipChange.ipc$dispatch("74813220", new Object[]{this, new Integer(i)});
            }
            File f = DiskLruCache.f(DiskLruCache.this);
            return new File(f, this.b + "." + i);
        }

        public final File getDirtyFile(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (File) ipChange.ipc$dispatch("42f962e9", new Object[]{this, new Integer(i)});
            }
            File f = DiskLruCache.f(DiskLruCache.this);
            return new File(f, this.b + "." + i + ".tmp");
        }

        public static /* synthetic */ void a(Entry entry, String[] strArr) throws IOException {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("80ec493e", new Object[]{entry, strArr});
            } else if (strArr.length != DiskLruCache.e(DiskLruCache.this)) {
                throw a(strArr);
            } else {
                for (int i = 0; i < strArr.length; i++) {
                    try {
                        entry.c[i] = Long.parseLong(strArr[i]);
                    } catch (NumberFormatException unused) {
                        throw a(strArr);
                    }
                }
            }
        }
    }

    public static /* synthetic */ String a(InputStream inputStream) throws IOException {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("172620d5", new Object[]{inputStream}) : readFully(new InputStreamReader(inputStream, "UTF-8"));
    }
}
