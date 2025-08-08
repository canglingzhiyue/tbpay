package tb;

import android.content.Context;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Environment;
import mtopsdk.common.util.StringUtils;
import android.util.Log;
import android.util.LruCache;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.trade.template.db.b;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

/* loaded from: classes6.dex */
public class jkk {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static b k;

    /* renamed from: a  reason: collision with root package name */
    public final String f29598a;
    public final String b;
    public final long c;
    public final int d;
    public final Context e;
    public final File f;
    public final boolean g;
    public com.taobao.android.trade.template.db.b h;
    public LruCache<String, byte[]> i;
    public b j;

    /* loaded from: classes6.dex */
    public interface b {
        byte[] a(String str);
    }

    public static /* synthetic */ File a(jkk jkkVar, byte[] bArr, File file) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (File) ipChange.ipc$dispatch("db376f41", new Object[]{jkkVar, bArr, file}) : jkkVar.a(bArr, file);
    }

    private jkk(a aVar) {
        this.j = k;
        this.f29598a = a.a(aVar);
        this.e = a.b(aVar);
        this.b = a.c(aVar);
        this.d = a.d(aVar);
        this.c = a.e(aVar);
        this.g = a.f(aVar);
        this.f = a();
        this.i = new LruCache<>(this.d);
        this.h = new com.taobao.android.trade.template.db.b(this.e, this.f, this.b, this.c);
    }

    public byte[] a(String str, String str2, jkm jkmVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("cff9d7bd", new Object[]{this, str, str2, jkmVar});
        }
        byte[] a2 = a(str, jkmVar);
        if (a2 != null) {
            return a2;
        }
        byte[] b2 = b(str, jkmVar);
        return b2 != null ? b2 : b(str, str2, jkmVar);
    }

    public byte[] a(String str, jkm jkmVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("bf7745c7", new Object[]{this, str, jkmVar});
        }
        long currentTimeMillis = System.currentTimeMillis();
        byte[] bArr = this.i.get(str);
        long currentTimeMillis2 = System.currentTimeMillis();
        jkmVar.f29606a = 1;
        jkmVar.b = currentTimeMillis2 - currentTimeMillis;
        String str2 = "[getTemplateById #" + str + "] get template from memory.";
        return bArr;
    }

    public byte[] b(String str, jkm jkmVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("47a785a6", new Object[]{this, str, jkmVar});
        }
        byte[] bArr = null;
        long currentTimeMillis = System.currentTimeMillis();
        b.a a2 = this.h.a(str);
        if (a2 != null && (bArr = a(a2.b)) != null && bArr.length > 0) {
            String str2 = "[getTemplateById #" + str + "] get template from file.";
            this.i.put(str, bArr);
        }
        long currentTimeMillis2 = System.currentTimeMillis();
        jkmVar.f29606a = 2;
        jkmVar.c = currentTimeMillis2 - currentTimeMillis;
        return bArr;
    }

    /* JADX WARN: Type inference failed for: r10v3, types: [tb.jkk$1] */
    private byte[] b(final String str, final String str2, jkm jkmVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("c1a37ddc", new Object[]{this, str, str2, jkmVar});
        }
        long currentTimeMillis = System.currentTimeMillis();
        final byte[] a2 = this.j.a(str2);
        long currentTimeMillis2 = System.currentTimeMillis();
        jkmVar.f29606a = 3;
        jkmVar.d = currentTimeMillis2 - currentTimeMillis;
        if (a2 != null) {
            this.i.put(str, a2);
            String str3 = "[getTemplateById #" + str + "] get template from server.";
            new AsyncTask<Void, Void, Void>() { // from class: tb.jkk.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Void, java.lang.Object] */
                @Override // android.os.AsyncTask
                public /* synthetic */ Void doInBackground(Void[] voidArr) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("e83e4786", new Object[]{this, voidArr}) : a(voidArr);
                }

                public Void a(Void... voidArr) {
                    String lastPathSegment;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return (Void) ipChange2.ipc$dispatch("54f0ab29", new Object[]{this, voidArr});
                    }
                    if (jkk.this.g) {
                        lastPathSegment = str;
                    } else {
                        lastPathSegment = Uri.parse(Uri.decode(str2)).getLastPathSegment();
                    }
                    synchronized (jkk.class) {
                        File file = new File(jkk.this.f, lastPathSegment);
                        if (file.exists()) {
                            return null;
                        }
                        jkk.a(jkk.this, a2, file);
                        if (file.isFile() && file.length() > 0) {
                            try {
                                jkk.this.h.a(str, file);
                            } catch (Throwable th) {
                                Log.e(bzy.POINT_TEMPLATE_CACHE, "File cache store exception", th);
                            }
                        }
                        return null;
                    }
                }
            }.executeOnExecutor(AsyncTask.SERIAL_EXECUTOR, new Void[0]);
            return a2;
        }
        String str4 = "[getTemplateById #" + str + "] template from server is null.";
        return null;
    }

    public byte[] a(File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("c85c5cde", new Object[]{this, file});
        }
        try {
            return b(file);
        } catch (IOException e) {
            Log.e(bzy.POINT_TEMPLATE_CACHE, "Read all bytes exception:", e);
            return null;
        }
    }

    private byte[] b(File file) throws IOException {
        int read;
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("affe333d", new Object[]{this, file});
        }
        long length = file.length();
        if (length > 2147483639) {
            throw new OutOfMemoryError("Required array size too large");
        }
        FileInputStream fileInputStream = new FileInputStream(file);
        int i2 = (int) length;
        byte[] bArr = new byte[i2];
        while (true) {
            int read2 = fileInputStream.read(bArr, i, i2 - i);
            if (read2 > 0) {
                i += read2;
            } else if (read2 < 0 || (read = fileInputStream.read()) < 0) {
                break;
            } else {
                if (i2 <= 2147483639 - i2) {
                    i2 = Math.max(i2 << 1, 8192);
                } else if (i2 == 2147483639) {
                    throw new OutOfMemoryError("Required array size too large");
                } else {
                    i2 = 2147483639;
                }
                bArr = Arrays.copyOf(bArr, i2);
                bArr[i] = (byte) read;
                i++;
            }
        }
        fileInputStream.close();
        return i2 == i ? bArr : Arrays.copyOf(bArr, i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x003f, code lost:
        if (r1 != null) goto L12;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x003b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.io.File a(byte[] r4, java.io.File r5) {
        /*
            r3 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = tb.jkk.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L1b
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r3
            r2 = 1
            r1[r2] = r4
            r4 = 2
            r1[r4] = r5
            java.lang.String r4 = "77dca867"
            java.lang.Object r4 = r0.ipc$dispatch(r4, r1)
            java.io.File r4 = (java.io.File) r4
            return r4
        L1b:
            r0 = 0
            java.io.BufferedOutputStream r1 = new java.io.BufferedOutputStream     // Catch: java.lang.Throwable -> L2d java.lang.Exception -> L2f
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L2d java.lang.Exception -> L2f
            r2.<init>(r5)     // Catch: java.lang.Throwable -> L2d java.lang.Exception -> L2f
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L2d java.lang.Exception -> L2f
            r1.write(r4)     // Catch: java.lang.Exception -> L30 java.lang.Throwable -> L37
        L29:
            r1.close()     // Catch: java.io.IOException -> L42
            goto L42
        L2d:
            r4 = move-exception
            goto L39
        L2f:
            r1 = r0
        L30:
            if (r5 == 0) goto L3f
            r5.delete()     // Catch: java.lang.Throwable -> L37
            r5 = r0
            goto L3f
        L37:
            r4 = move-exception
            r0 = r1
        L39:
            if (r0 == 0) goto L3e
            r0.close()     // Catch: java.io.IOException -> L3e
        L3e:
            throw r4
        L3f:
            if (r1 == 0) goto L42
            goto L29
        L42:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.jkk.a(byte[], java.io.File):java.io.File");
    }

    private File a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("a060c1a5", new Object[]{this});
        }
        File b2 = b();
        if (b2 == null) {
            return null;
        }
        File file = new File(b2, this.f29598a);
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    private File b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("64f2a3c4", new Object[]{this});
        }
        File filesDir = this.e.getFilesDir();
        if (filesDir != null && filesDir.canWrite()) {
            return filesDir;
        }
        File cacheDir = this.e.getCacheDir();
        if (cacheDir != null && cacheDir.canWrite()) {
            return cacheDir;
        }
        if ("mounted".equals(Environment.getExternalStorageState())) {
            try {
                File externalFilesDir = this.e.getExternalFilesDir(null);
                if (externalFilesDir != null && externalFilesDir.canWrite()) {
                    return externalFilesDir;
                }
                File externalCacheDir = this.e.getExternalCacheDir();
                if (externalCacheDir != null) {
                    if (externalCacheDir.canWrite()) {
                        return externalCacheDir;
                    }
                }
            } catch (Exception e) {
                Log.e(bzy.POINT_TEMPLATE_CACHE, "get external files dir exception", e);
            }
        }
        return null;
    }

    static {
        kge.a(-1537599569);
        k = new b() { // from class: tb.jkk.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Code restructure failed: missing block: B:25:0x005f, code lost:
                if (r9 == null) goto L33;
             */
            /* JADX WARN: Code restructure failed: missing block: B:26:0x0061, code lost:
                r9.disconnect();
             */
            /* JADX WARN: Code restructure failed: missing block: B:50:0x009a, code lost:
                if (r9 == null) goto L33;
             */
            /* JADX WARN: Code restructure failed: missing block: B:52:0x009d, code lost:
                if (r3 == null) goto L36;
             */
            /* JADX WARN: Code restructure failed: missing block: B:54:0x00a3, code lost:
                return r3.toByteArray();
             */
            /* JADX WARN: Code restructure failed: missing block: B:55:0x00a4, code lost:
                return null;
             */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:42:0x0089  */
            /* JADX WARN: Removed duplicated region for block: B:49:0x0097 A[Catch: IOException -> 0x009a, TRY_LEAVE, TryCatch #1 {IOException -> 0x009a, blocks: (B:47:0x0092, B:49:0x0097), top: B:60:0x0092 }] */
            /* JADX WARN: Removed duplicated region for block: B:60:0x0092 A[EXC_TOP_SPLITTER, SYNTHETIC] */
            @Override // tb.jkk.b
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public byte[] a(java.lang.String r9) {
                /*
                    r8 = this;
                    com.android.alibaba.ip.runtime.IpChange r0 = tb.jkk.AnonymousClass2.$ipChange
                    boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
                    r2 = 0
                    if (r1 == 0) goto L18
                    r1 = 2
                    java.lang.Object[] r1 = new java.lang.Object[r1]
                    r1[r2] = r8
                    r2 = 1
                    r1[r2] = r9
                    java.lang.String r9 = "81233aeb"
                    java.lang.Object r9 = r0.ipc$dispatch(r9, r1)
                    byte[] r9 = (byte[]) r9
                    return r9
                L18:
                    r0 = 0
                    java.net.URL r1 = new java.net.URL     // Catch: java.lang.Throwable -> L79 java.lang.Exception -> L8d
                    r1.<init>(r9)     // Catch: java.lang.Throwable -> L79 java.lang.Exception -> L8d
                    java.net.URLConnection r9 = r1.openConnection()     // Catch: java.lang.Throwable -> L79 java.lang.Exception -> L8d
                    java.net.HttpURLConnection r9 = (java.net.HttpURLConnection) r9     // Catch: java.lang.Throwable -> L79 java.lang.Exception -> L8d
                    r1 = 10000(0x2710, float:1.4013E-41)
                    r9.setConnectTimeout(r1)     // Catch: java.lang.Throwable -> L73 java.lang.Exception -> L77
                    r1 = 12000(0x2ee0, float:1.6816E-41)
                    r9.setReadTimeout(r1)     // Catch: java.lang.Throwable -> L73 java.lang.Exception -> L77
                    r9.connect()     // Catch: java.lang.Throwable -> L73 java.lang.Exception -> L77
                    int r1 = r9.getResponseCode()     // Catch: java.lang.Throwable -> L73 java.lang.Exception -> L77
                    r3 = 200(0xc8, float:2.8E-43)
                    if (r1 == r3) goto L3f
                    if (r9 == 0) goto L3e
                    r9.disconnect()
                L3e:
                    return r0
                L3f:
                    java.io.InputStream r1 = r9.getInputStream()     // Catch: java.lang.Throwable -> L73 java.lang.Exception -> L77
                    java.io.ByteArrayOutputStream r3 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L6b java.lang.Exception -> L71
                    r4 = 4096(0x1000, float:5.74E-42)
                    r3.<init>(r4)     // Catch: java.lang.Throwable -> L6b java.lang.Exception -> L71
                    byte[] r4 = new byte[r4]     // Catch: java.lang.Throwable -> L65 java.lang.Exception -> L90
                L4c:
                    int r5 = r1.read(r4)     // Catch: java.lang.Throwable -> L65 java.lang.Exception -> L90
                    r6 = -1
                    if (r5 == r6) goto L57
                    r3.write(r4, r2, r5)     // Catch: java.lang.Throwable -> L65 java.lang.Exception -> L90
                    goto L4c
                L57:
                    r3.close()     // Catch: java.io.IOException -> L5f
                    if (r1 == 0) goto L5f
                    r1.close()     // Catch: java.io.IOException -> L5f
                L5f:
                    if (r9 == 0) goto L9d
                L61:
                    r9.disconnect()
                    goto L9d
                L65:
                    r0 = move-exception
                    r2 = r9
                    r9 = r1
                    r1 = r0
                    r0 = r3
                    goto L7d
                L6b:
                    r2 = move-exception
                    r7 = r2
                    r2 = r9
                    r9 = r1
                    r1 = r7
                    goto L7d
                L71:
                    r3 = r0
                    goto L90
                L73:
                    r1 = move-exception
                    r2 = r9
                    r9 = r0
                    goto L7d
                L77:
                    r1 = r0
                    goto L8f
                L79:
                    r9 = move-exception
                    r1 = r9
                    r9 = r0
                    r2 = r9
                L7d:
                    if (r0 == 0) goto L82
                    r0.close()     // Catch: java.io.IOException -> L87
                L82:
                    if (r9 == 0) goto L87
                    r9.close()     // Catch: java.io.IOException -> L87
                L87:
                    if (r2 == 0) goto L8c
                    r2.disconnect()
                L8c:
                    throw r1
                L8d:
                    r9 = r0
                    r1 = r9
                L8f:
                    r3 = r1
                L90:
                    if (r3 == 0) goto L95
                    r3.close()     // Catch: java.io.IOException -> L9a
                L95:
                    if (r1 == 0) goto L9a
                    r1.close()     // Catch: java.io.IOException -> L9a
                L9a:
                    if (r9 == 0) goto L9d
                    goto L61
                L9d:
                    if (r3 == 0) goto La4
                    byte[] r9 = r3.toByteArray()
                    return r9
                La4:
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: tb.jkk.AnonymousClass2.a(java.lang.String):byte[]");
            }
        };
    }

    /* loaded from: classes6.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private Context f29600a;
        private String b;
        private String c;
        private int d = 8;
        private long e = 4194304;
        private boolean f = true;

        static {
            kge.a(935448454);
        }

        public static /* synthetic */ String a(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("8a6bc0cf", new Object[]{aVar}) : aVar.b;
        }

        public static /* synthetic */ Context b(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("60d5472a", new Object[]{aVar}) : aVar.f29600a;
        }

        public static /* synthetic */ String c(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9acc408d", new Object[]{aVar}) : aVar.c;
        }

        public static /* synthetic */ int d(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("494ab2a7", new Object[]{aVar})).intValue() : aVar.d;
        }

        public static /* synthetic */ long e(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a3261ce9", new Object[]{aVar})).longValue() : aVar.e;
        }

        public static /* synthetic */ boolean f(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("fd01873a", new Object[]{aVar})).booleanValue() : aVar.f;
        }

        public jkk a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (jkk) ipChange.ipc$dispatch("f067314", new Object[]{this});
            }
            if (this.f29600a == null || StringUtils.isEmpty(this.b) || StringUtils.isEmpty(this.c)) {
                throw new IllegalArgumentException();
            }
            return new jkk(this);
        }

        public a a(Context context) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("17d032bf", new Object[]{this, context});
            }
            this.f29600a = context;
            return this;
        }

        public a a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("2499f72d", new Object[]{this, str});
            }
            this.b = str;
            return this;
        }

        public a b(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("acca370c", new Object[]{this, str});
            }
            this.c = str;
            return this;
        }

        public a a(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("dafdf5e4", new Object[]{this, new Integer(i)});
            }
            this.d = i;
            return this;
        }

        public a a(long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("e2af9b43", new Object[]{this, new Long(j)});
            }
            this.e = j;
            return this;
        }

        public a a(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("5dc9f133", new Object[]{this, new Boolean(z)});
            }
            this.f = z;
            return this;
        }
    }
}
