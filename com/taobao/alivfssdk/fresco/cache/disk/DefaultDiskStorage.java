package com.taobao.alivfssdk.fresco.cache.disk;

import mtopsdk.common.util.StringUtils;
import android.util.Base64;
import com.alibaba.security.realidentity.v2;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alivfssdk.fresco.cache.common.CacheErrorLogger;
import com.taobao.alivfssdk.fresco.cache.common.g;
import com.taobao.alivfssdk.fresco.cache.disk.a;
import com.taobao.alivfssdk.fresco.common.file.FileUtils;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;
import tb.dij;
import tb.dil;
import tb.kge;
import tb.riy;

/* loaded from: classes.dex */
public class DefaultDiskStorage implements com.taobao.alivfssdk.fresco.cache.disk.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final long f8505a;
    private final File b;
    private final boolean c;
    private final File d;
    private final CacheErrorLogger e;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public enum FileType {
        CONTENT(".cnt"),
        TEMP(".tmp");
        
        public final String extension;

        FileType(String str) {
            this.extension = str;
        }

        public static FileType fromExtension(String str) {
            if (".cnt".equals(str)) {
                return CONTENT;
            }
            if (!".tmp".equals(str)) {
                return null;
            }
            return TEMP;
        }
    }

    /* loaded from: classes4.dex */
    public static class IncompleteFileException extends IOException {
        public final long actual;
        public final long expected;

        static {
            kge.a(-1937430473);
        }

        public IncompleteFileException(long j, long j2) {
            super("File was not written completely. Expected: " + j + ", found: " + j2);
            this.expected = j;
            this.actual = j2;
        }
    }

    private static boolean a(File file, CacheErrorLogger cacheErrorLogger) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("aa0ca675", new Object[]{file, cacheErrorLogger})).booleanValue();
        }
        return false;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e32ba67f", new Object[]{this});
        }
    }

    public static /* synthetic */ CacheErrorLogger a(DefaultDiskStorage defaultDiskStorage) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (CacheErrorLogger) ipChange.ipc$dispatch("16b387b3", new Object[]{defaultDiskStorage}) : defaultDiskStorage.e;
    }

    public static /* synthetic */ c a(DefaultDiskStorage defaultDiskStorage, File file) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("5e774e16", new Object[]{defaultDiskStorage, file}) : defaultDiskStorage.b(file);
    }

    @Override // com.taobao.alivfssdk.fresco.cache.disk.a
    public /* synthetic */ Collection f() throws IOException {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Collection) ipChange.ipc$dispatch("fabc0fa", new Object[]{this}) : d();
    }

    static {
        kge.a(-721619578);
        kge.a(-1320177195);
        f8505a = TimeUnit.MINUTES.toMillis(30L);
    }

    public DefaultDiskStorage(File file, int i, CacheErrorLogger cacheErrorLogger) {
        com.taobao.alivfssdk.fresco.common.internal.c.a(file);
        this.b = file;
        this.c = a(file, cacheErrorLogger);
        this.d = new File(this.b, a(i));
        this.e = cacheErrorLogger;
        e();
    }

    public static String a(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9064aa65", new Object[]{new Integer(i)}) : String.format(null, "%s.ols%d.%d", v2.d, 100, Integer.valueOf(i));
    }

    @Override // com.taobao.alivfssdk.fresco.cache.disk.a
    public boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : this.c;
    }

    @Override // com.taobao.alivfssdk.fresco.cache.disk.a
    public String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this});
        }
        String absolutePath = this.b.getAbsolutePath();
        return "_" + absolutePath.substring(absolutePath.lastIndexOf(47) + 1, absolutePath.length()) + "_" + absolutePath.hashCode();
    }

    private void e() {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        if (this.b.exists() && this.d.exists()) {
            z = false;
        }
        if (!z) {
            return;
        }
        try {
            FileUtils.a(this.d);
        } catch (FileUtils.CreateDirectoryException unused) {
            CacheErrorLogger cacheErrorLogger = this.e;
            if (cacheErrorLogger == null) {
                return;
            }
            CacheErrorLogger.CacheErrorCategory cacheErrorCategory = CacheErrorLogger.CacheErrorCategory.WRITE_CREATE_DIR;
            cacheErrorLogger.a(cacheErrorCategory, "DefaultDiskStorage", "version directory could not be created: " + this.d, null);
        }
    }

    public File a(String str, com.taobao.alivfssdk.fresco.cache.common.b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (File) ipChange.ipc$dispatch("f173d6d3", new Object[]{this, str, bVar}) : new File(c(str, bVar));
    }

    private String b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6111438d", new Object[]{this, str});
        }
        String valueOf = String.valueOf(Math.abs(str.hashCode() % 100));
        return this.d + File.separator + valueOf;
    }

    private File c(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (File) ipChange.ipc$dispatch("aae8cad9", new Object[]{this, str}) : new File(b(str));
    }

    /* loaded from: classes.dex */
    public class a implements com.taobao.alivfssdk.fresco.common.file.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private final List<a.InterfaceC0334a> b;

        static {
            kge.a(-1637413541);
            kge.a(-1713073687);
        }

        private a() {
            this.b = new ArrayList();
        }

        @Override // com.taobao.alivfssdk.fresco.common.file.b
        public void a(File file) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8a979fdf", new Object[]{this, file});
                return;
            }
            c a2 = DefaultDiskStorage.a(DefaultDiskStorage.this, file);
            if (a2 == null || a2.f8508a != FileType.CONTENT) {
                return;
            }
            this.b.add(new b(a2.b, file));
        }

        public List<a.InterfaceC0334a> a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("627608df", new Object[]{this}) : Collections.unmodifiableList(this.b);
        }
    }

    private void a(File file, String str) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2fbe2fe9", new Object[]{this, file, str});
            return;
        }
        try {
            FileUtils.a(file);
        } catch (FileUtils.CreateDirectoryException e) {
            this.e.a(CacheErrorLogger.CacheErrorCategory.WRITE_CREATE_DIR, "DefaultDiskStorage", str, e);
            throw e;
        }
    }

    @Override // com.taobao.alivfssdk.fresco.cache.disk.a
    public a.b a(String str, com.taobao.alivfssdk.fresco.cache.common.b bVar, Object obj) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a.b) ipChange.ipc$dispatch("6741b5f9", new Object[]{this, str, bVar, obj});
        }
        c cVar = new c(FileType.TEMP, str, bVar);
        File c2 = c(cVar.b);
        if (!c2.exists()) {
            a(c2, "insert");
        }
        try {
            return new d(str, cVar.a(c2));
        } catch (IOException e) {
            this.e.a(CacheErrorLogger.CacheErrorCategory.WRITE_CREATE_TEMPFILE, "DefaultDiskStorage", "insert", e);
            throw e;
        }
    }

    @Override // com.taobao.alivfssdk.fresco.cache.disk.a
    public dij b(String str, com.taobao.alivfssdk.fresco.cache.common.b bVar, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dij) ipChange.ipc$dispatch("fd874b6a", new Object[]{this, str, bVar, obj});
        }
        File a2 = a(str, bVar);
        if (!a2.exists()) {
            return null;
        }
        a2.setLastModified(System.currentTimeMillis());
        return dil.a(a2);
    }

    private String c(String str, com.taobao.alivfssdk.fresco.cache.common.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f9fe7024", new Object[]{this, str, bVar});
        }
        c cVar = new c(FileType.CONTENT, str, bVar);
        return cVar.a(b(cVar.b));
    }

    @Override // com.taobao.alivfssdk.fresco.cache.disk.a
    public boolean c(String str, com.taobao.alivfssdk.fresco.cache.common.b bVar, Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9d0ee4dc", new Object[]{this, str, bVar, obj})).booleanValue() : a(str, bVar, false);
    }

    private boolean a(String str, com.taobao.alivfssdk.fresco.cache.common.b bVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8ab8bd9e", new Object[]{this, str, bVar, new Boolean(z)})).booleanValue();
        }
        File a2 = a(str, bVar);
        boolean exists = a2.exists();
        if (z && exists) {
            a2.setLastModified(System.currentTimeMillis());
        }
        return exists;
    }

    @Override // com.taobao.alivfssdk.fresco.cache.disk.a
    public List<String> a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("287b5bd5", new Object[]{this, str});
        }
        File[] listFiles = c(str).listFiles();
        ArrayList arrayList = new ArrayList();
        if (listFiles != null) {
            for (File file : listFiles) {
                c b2 = c.b(file);
                if (b2 != null && b2.f8508a == FileType.CONTENT && str.equals(b2.b) && !StringUtils.isEmpty(b2.c)) {
                    try {
                        arrayList.add(new String(Base64.decode(b2.c, 11), "UTF-8"));
                    } catch (UnsupportedEncodingException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }
        return arrayList;
    }

    @Override // com.taobao.alivfssdk.fresco.cache.disk.a
    public long a(a.InterfaceC0334a interfaceC0334a) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6c02b0b6", new Object[]{this, interfaceC0334a})).longValue() : a(((b) interfaceC0334a).b().c());
    }

    @Override // com.taobao.alivfssdk.fresco.cache.disk.a
    public long b(String str, com.taobao.alivfssdk.fresco.cache.common.b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5c1a002f", new Object[]{this, str, bVar})).longValue() : a(a(str, bVar));
    }

    private long a(File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8a979fd3", new Object[]{this, file})).longValue();
        }
        if (!file.exists()) {
            return 0L;
        }
        long length = file.length();
        if (!file.delete()) {
            return -1L;
        }
        return length;
    }

    @Override // com.taobao.alivfssdk.fresco.cache.disk.a
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else {
            com.taobao.alivfssdk.fresco.common.file.a.a(this.b);
        }
    }

    public List<a.InterfaceC0334a> d() throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("195b8bfc", new Object[]{this});
        }
        a aVar = new a();
        com.taobao.alivfssdk.fresco.common.file.a.a(this.d, aVar);
        return aVar.a();
    }

    /* loaded from: classes.dex */
    public static class b implements a.InterfaceC0334a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final String f8507a;
        private final dil b;
        private long c;
        private long d;

        static {
            kge.a(1307747316);
            kge.a(-1375417149);
        }

        private b(String str, File file) {
            com.taobao.alivfssdk.fresco.common.internal.c.a(file);
            this.f8507a = (String) com.taobao.alivfssdk.fresco.common.internal.c.a(str);
            this.b = dil.a(file);
            this.c = -1L;
            this.d = -1L;
        }

        @Override // com.taobao.alivfssdk.fresco.cache.disk.a.InterfaceC0334a
        public String a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : this.f8507a;
        }

        @Override // com.taobao.alivfssdk.fresco.cache.disk.a.InterfaceC0334a
        public long c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("5889b5e", new Object[]{this})).longValue();
            }
            if (this.d < 0) {
                this.d = this.b.c().lastModified();
            }
            return this.d;
        }

        public dil b() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (dil) ipChange.ipc$dispatch("16b556d6", new Object[]{this}) : this.b;
        }

        @Override // com.taobao.alivfssdk.fresco.cache.disk.a.InterfaceC0334a
        public long d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("596b2df", new Object[]{this})).longValue();
            }
            if (this.c < 0) {
                this.c = this.b.b();
            }
            return this.c;
        }
    }

    private c b(File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("18eef4ac", new Object[]{this, file});
        }
        c b2 = c.b(file);
        if (b2 == null || !c(b2.b).equals(file.getParentFile())) {
            return null;
        }
        return b2;
    }

    /* loaded from: classes.dex */
    public static class c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final FileType f8508a;
        public final String b;
        public final String c;

        static {
            kge.a(-539651640);
        }

        private c(FileType fileType, String str, com.taobao.alivfssdk.fresco.cache.common.b bVar) {
            this.f8508a = fileType;
            this.b = str;
            if ((bVar instanceof com.taobao.alivfssdk.fresco.cache.common.f) && !StringUtils.isEmpty(((com.taobao.alivfssdk.fresco.cache.common.f) bVar).b)) {
                try {
                    this.c = Base64.encodeToString(((com.taobao.alivfssdk.fresco.cache.common.f) bVar).b.getBytes("UTF-8"), 11);
                    return;
                } catch (UnsupportedEncodingException e) {
                    throw new RuntimeException(e);
                } catch (Exception e2) {
                    throw new RuntimeException(e2);
                }
            }
            this.c = null;
        }

        private c(FileType fileType, String str, String str2) {
            this.f8508a = fileType;
            this.b = str;
            this.c = str2;
        }

        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            return this.f8508a + riy.BRACKET_START_STR + this.b + riy.BRACKET_END_STR;
        }

        public String a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{this, str});
            }
            String str2 = str + File.separator + this.b;
            if (!StringUtils.isEmpty(this.c)) {
                str2 = str2 + riy.AND_NOT + this.c;
            }
            return str2 + this.f8508a.extension;
        }

        public File a(File file) throws IOException {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (File) ipChange.ipc$dispatch("4659278e", new Object[]{this, file});
            }
            String str = this.b;
            if (!StringUtils.isEmpty(this.c)) {
                str = str + riy.AND_NOT + this.c + ".";
            }
            return File.createTempFile(str, ".tmp", file);
        }

        public static c b(File file) {
            FileType fromExtension;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (c) ipChange.ipc$dispatch("18eef4ac", new Object[]{file});
            }
            String name = file.getName();
            int lastIndexOf = name.lastIndexOf(46);
            String str = null;
            if (lastIndexOf <= 0 || (fromExtension = FileType.fromExtension(name.substring(lastIndexOf))) == null) {
                return null;
            }
            String substring = name.substring(0, lastIndexOf);
            if (fromExtension.equals(FileType.TEMP)) {
                int lastIndexOf2 = substring.lastIndexOf(46);
                if (lastIndexOf2 <= 0) {
                    return null;
                }
                substring = substring.substring(0, lastIndexOf2);
            }
            int lastIndexOf3 = substring.lastIndexOf(33);
            if (lastIndexOf3 > 0) {
                str = substring.substring(lastIndexOf3 + 1);
                substring = substring.substring(0, lastIndexOf3);
            }
            return new c(fromExtension, substring, str);
        }
    }

    /* loaded from: classes4.dex */
    public class d implements a.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final File f8509a;
        private final String c;

        static {
            kge.a(-2143040796);
            kge.a(1571263285);
        }

        public d(String str, File file) {
            this.c = str;
            this.f8509a = file;
        }

        @Override // com.taobao.alivfssdk.fresco.cache.disk.a.b
        public void a(g gVar, com.taobao.alivfssdk.fresco.cache.common.b bVar, Object obj) throws IOException {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d6cbe96f", new Object[]{this, gVar, bVar, obj});
                return;
            }
            try {
                OutputStream fileOutputStream = new FileOutputStream(this.f8509a);
                try {
                    com.taobao.alivfssdk.fresco.common.internal.b bVar2 = new com.taobao.alivfssdk.fresco.common.internal.b(fileOutputStream);
                    fileOutputStream = gVar.a(bVar2);
                    fileOutputStream.flush();
                    long a2 = bVar2.a();
                    fileOutputStream.close();
                    if (this.f8509a.length() != a2) {
                        throw new IncompleteFileException(a2, this.f8509a.length());
                    }
                } catch (Throwable th) {
                    fileOutputStream.close();
                    throw th;
                }
            } catch (FileNotFoundException e) {
                DefaultDiskStorage.a(DefaultDiskStorage.this).a(CacheErrorLogger.CacheErrorCategory.WRITE_UPDATE_FILE_NOT_FOUND, "DefaultDiskStorage", "updateResource", e);
                throw e;
            }
        }

        @Override // com.taobao.alivfssdk.fresco.cache.disk.a.b
        public dij a(com.taobao.alivfssdk.fresco.cache.common.b bVar, Object obj) throws IOException {
            CacheErrorLogger.CacheErrorCategory cacheErrorCategory;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (dij) ipChange.ipc$dispatch("53c2fd95", new Object[]{this, bVar, obj});
            }
            File a2 = DefaultDiskStorage.this.a(this.c, bVar);
            try {
                FileUtils.a(this.f8509a, a2);
                if (a2.exists()) {
                    a2.setLastModified(System.currentTimeMillis());
                }
                return dil.a(a2);
            } catch (FileUtils.RenameException e) {
                Throwable cause = e.getCause();
                if (cause == null) {
                    cacheErrorCategory = CacheErrorLogger.CacheErrorCategory.WRITE_RENAME_FILE_OTHER;
                } else if (cause instanceof FileUtils.ParentDirNotFoundException) {
                    cacheErrorCategory = CacheErrorLogger.CacheErrorCategory.WRITE_RENAME_FILE_TEMPFILE_PARENT_NOT_FOUND;
                } else if (cause instanceof FileNotFoundException) {
                    cacheErrorCategory = CacheErrorLogger.CacheErrorCategory.WRITE_RENAME_FILE_TEMPFILE_NOT_FOUND;
                } else {
                    cacheErrorCategory = CacheErrorLogger.CacheErrorCategory.WRITE_RENAME_FILE_OTHER;
                }
                DefaultDiskStorage.a(DefaultDiskStorage.this).a(cacheErrorCategory, "DefaultDiskStorage", "commit", e);
                throw e;
            }
        }

        @Override // com.taobao.alivfssdk.fresco.cache.disk.a.b
        public boolean a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : !this.f8509a.exists() || this.f8509a.delete();
        }
    }
}
