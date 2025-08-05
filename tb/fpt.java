package tb;

import android.content.Context;
import android.net.Uri;
import android.os.AsyncTask;
import android.text.TextUtils;
import android.util.Log;
import android.util.LruCache;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamic.c;
import com.taobao.android.dinamic.e;
import com.taobao.android.dinamic.tempate.DinamicTemplate;
import com.taobao.android.dinamic.tempate.db.b;
import com.taobao.android.dinamicx.monitor.DXMonitorConstant;
import com.taobao.android.dinamicx.s;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

/* loaded from: classes.dex */
public class fpt {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static b k;

    /* renamed from: a  reason: collision with root package name */
    public final String f28102a;
    public final String b;
    public final long c;
    public final int d;
    public final Context e;
    public final File f;
    public final boolean g;
    public com.taobao.android.dinamic.tempate.db.b h;
    public LruCache<String, byte[]> i;
    public b j;
    private String l;

    /* loaded from: classes.dex */
    public interface b {
        byte[] a(String str);
    }

    public static /* synthetic */ File a(fpt fptVar, byte[] bArr, File file, DinamicTemplate dinamicTemplate, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (File) ipChange.ipc$dispatch("7654910d", new Object[]{fptVar, bArr, file, dinamicTemplate, str}) : fptVar.a(bArr, file, dinamicTemplate, str);
    }

    private fpt(a aVar) {
        this.j = k;
        this.f28102a = a.a(aVar);
        this.e = a.b(aVar);
        this.b = a.c(aVar);
        this.d = a.d(aVar);
        this.c = a.e(aVar);
        this.g = a.f(aVar);
        this.l = a.g(aVar);
        this.f = b();
        this.i = new LruCache<>(this.d);
        this.h = new com.taobao.android.dinamic.tempate.db.b(this.e, this.f, this.b, this.c);
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else {
            this.i = new LruCache<>(i);
        }
    }

    public byte[] a(DinamicTemplate dinamicTemplate, String str, String str2, fpu fpuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("7b43c012", new Object[]{this, dinamicTemplate, str, str2, fpuVar});
        }
        byte[] a2 = a(str, fpuVar);
        if (a2 != null) {
            return a2;
        }
        try {
            a2 = b(str, fpuVar);
        } catch (IOException unused) {
        }
        return a2 != null ? a2 : b(dinamicTemplate, str, str2, fpuVar);
    }

    public byte[] a(String str, fpu fpuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("f4d74fe6", new Object[]{this, str, fpuVar});
        }
        long currentTimeMillis = System.currentTimeMillis();
        byte[] bArr = this.i.get(str);
        long currentTimeMillis2 = System.currentTimeMillis();
        fpuVar.f28107a = 1;
        fpuVar.b = currentTimeMillis2 - currentTimeMillis;
        String str2 = "[getTemplateById #" + str + "] get template from memory.";
        return bArr;
    }

    public byte[] b(String str, fpu fpuVar) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("7d078fc5", new Object[]{this, str, fpuVar});
        }
        byte[] bArr = null;
        long currentTimeMillis = System.currentTimeMillis();
        b.a a2 = this.h.a(str);
        if (a2 != null && (bArr = a(a2.b)) != null && bArr.length > 0) {
            String str2 = "[getTemplateById #" + str + "] get template from file.";
            this.i.put(str, bArr);
        }
        long currentTimeMillis2 = System.currentTimeMillis();
        fpuVar.f28107a = 2;
        fpuVar.c = currentTimeMillis2 - currentTimeMillis;
        return bArr;
    }

    /* JADX WARN: Type inference failed for: r8v1, types: [tb.fpt$1] */
    private byte[] b(final DinamicTemplate dinamicTemplate, final String str, final String str2, final fpu fpuVar) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("43a1e4b1", new Object[]{this, dinamicTemplate, str, str2, fpuVar});
        }
        long nanoTime = System.nanoTime();
        final byte[] a2 = this.j.a(str2);
        long nanoTime2 = System.nanoTime();
        fpuVar.f28107a = 3;
        fpuVar.d = nanoTime2 - nanoTime;
        if (a2 == null) {
            z = false;
        }
        a(fpuVar, dinamicTemplate, z);
        if (a2 != null) {
            this.i.put(str, a2);
            String str3 = "[getTemplateById #" + str + "] get template from server.";
            new AsyncTask<Void, Void, Void>() { // from class: tb.fpt.1
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
                    if (fpt.this.g) {
                        lastPathSegment = str;
                    } else {
                        lastPathSegment = Uri.parse(Uri.decode(str2)).getLastPathSegment();
                    }
                    synchronized (fpt.class) {
                        File file = new File(fpt.this.f, lastPathSegment);
                        if (file.exists()) {
                            return null;
                        }
                        fpt.a(fpt.this, a2, file, dinamicTemplate, fpuVar.e);
                        if (file.isFile() && file.length() > 0) {
                            try {
                                fpt.this.h.a(str, file);
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

    private void a(final fpu fpuVar, final DinamicTemplate dinamicTemplate, final boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4261e1d", new Object[]{this, fpuVar, dinamicTemplate, new Boolean(z)});
        } else if (c.a().b() == null || !fpb.a()) {
        } else {
            fpb.f28086a.a(new Runnable() { // from class: tb.fpt.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    if (e.a()) {
                        fpa.a(e.TAG, "download template=" + dinamicTemplate + (((float) fpuVar.d) / 1000000.0d));
                    }
                    c.a().b().c(fpuVar.e, dinamicTemplate, z, null, fpuVar.d / 1000000.0d);
                }
            });
        }
    }

    public byte[] a(File file) throws IOException {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (byte[]) ipChange.ipc$dispatch("c85c5cde", new Object[]{this, file}) : b(file);
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

    /* JADX WARN: Code restructure failed: missing block: B:17:0x005b, code lost:
        if (r3 == null) goto L16;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0062 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.io.File a(byte[] r12, java.io.File r13, com.taobao.android.dinamic.tempate.DinamicTemplate r14, java.lang.String r15) {
        /*
            r11 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = tb.fpt.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L21
            r1 = 5
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r11
            r2 = 1
            r1[r2] = r12
            r12 = 2
            r1[r12] = r13
            r12 = 3
            r1[r12] = r14
            r12 = 4
            r1[r12] = r15
            java.lang.String r12 = "ef1eec13"
            java.lang.Object r12 = r0.ipc$dispatch(r12, r1)
            java.io.File r12 = (java.io.File) r12
            return r12
        L21:
            long r0 = java.lang.System.nanoTime()
            r2 = 0
            java.io.BufferedOutputStream r3 = new java.io.BufferedOutputStream     // Catch: java.lang.Throwable -> L44 java.lang.Exception -> L47
            java.io.FileOutputStream r4 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L44 java.lang.Exception -> L47
            r4.<init>(r13)     // Catch: java.lang.Throwable -> L44 java.lang.Exception -> L47
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L44 java.lang.Exception -> L47
            r3.write(r12)     // Catch: java.lang.Exception -> L48 java.lang.Throwable -> L5f
            r8 = 1
            long r4 = java.lang.System.nanoTime()     // Catch: java.lang.Exception -> L48 java.lang.Throwable -> L5f
            long r9 = r4 - r0
            r5 = r11
            r6 = r15
            r7 = r14
            r5.a(r6, r7, r8, r9)     // Catch: java.lang.Exception -> L48 java.lang.Throwable -> L5f
        L40:
            r3.close()     // Catch: java.io.IOException -> L5e
            goto L5e
        L44:
            r12 = move-exception
            r3 = r2
            goto L60
        L47:
            r3 = r2
        L48:
            if (r13 == 0) goto L4e
            r13.delete()     // Catch: java.lang.Throwable -> L5f
            r13 = r2
        L4e:
            r7 = 0
            long r4 = java.lang.System.nanoTime()     // Catch: java.lang.Throwable -> L5f
            long r8 = r4 - r0
            r4 = r11
            r5 = r15
            r6 = r14
            r4.a(r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L5f
            if (r3 == 0) goto L5e
            goto L40
        L5e:
            return r13
        L5f:
            r12 = move-exception
        L60:
            if (r3 == 0) goto L65
            r3.close()     // Catch: java.io.IOException -> L65
        L65:
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.fpt.a(byte[], java.io.File, com.taobao.android.dinamic.tempate.DinamicTemplate, java.lang.String):java.io.File");
    }

    private void a(final String str, final DinamicTemplate dinamicTemplate, final boolean z, final long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70e484ac", new Object[]{this, str, dinamicTemplate, new Boolean(z), new Long(j)});
        } else if (c.a().b() == null || !fpb.a()) {
        } else {
            fpb.f28086a.a(new Runnable() { // from class: tb.fpt.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    if (e.a()) {
                        fpa.a(e.TAG, "write template=" + dinamicTemplate + (((float) j) / 1000000.0d));
                    }
                    c.a().b().d(str, dinamicTemplate, z, null, j / 1000000.0d);
                }
            });
        }
    }

    private File b() {
        File c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("64f2a3c4", new Object[]{this});
        }
        if (this.e == null || (c = c()) == null) {
            return null;
        }
        File file = new File(c, this.f28102a);
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    public File a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (File) ipChange.ipc$dispatch("a060c1a5", new Object[]{this}) : this.f;
    }

    private File c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("298485e3", new Object[]{this});
        }
        File filesDir = this.e.getFilesDir();
        if (filesDir != null && filesDir.canWrite()) {
            return filesDir;
        }
        File cacheDir = this.e.getCacheDir();
        if (cacheDir != null && cacheDir.canWrite()) {
            return cacheDir;
        }
        if (fqi.Z()) {
            s sVar = new s(this.l);
            s.a aVar = new s.a(DXMonitorConstant.DX_MONITOR_ROUTER, DXMonitorConstant.DX_TEMPLATE_CACHE_ERROR, s.DXERROR_ROUTER_GET_EXTERNAL_DIR_ERROR);
            aVar.e = "module " + this.l;
            sVar.c.add(aVar);
            com.taobao.android.dinamicx.monitor.b.a(sVar);
        }
        return null;
    }

    static {
        kge.a(758844514);
        k = new b() { // from class: tb.fpt.4
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
            @Override // tb.fpt.b
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public byte[] a(java.lang.String r9) {
                /*
                    r8 = this;
                    com.android.alibaba.ip.runtime.IpChange r0 = tb.fpt.AnonymousClass4.$ipChange
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
                throw new UnsupportedOperationException("Method not decompiled: tb.fpt.AnonymousClass4.a(java.lang.String):byte[]");
            }
        };
    }

    /* loaded from: classes.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private Context f28106a;
        private String b;
        private String c;
        private int d = 8;
        private long e = 4194304;
        private boolean f = true;
        private String g;

        static {
            kge.a(-968335047);
        }

        public static /* synthetic */ String a(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("170ba6f", new Object[]{aVar}) : aVar.b;
        }

        public static /* synthetic */ Context b(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("aeb2398a", new Object[]{aVar}) : aVar.f28106a;
        }

        public static /* synthetic */ String c(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("11d13a2d", new Object[]{aVar}) : aVar.c;
        }

        public static /* synthetic */ int d(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("c1a0c507", new Object[]{aVar})).intValue() : aVar.d;
        }

        public static /* synthetic */ long e(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("1b7c2f49", new Object[]{aVar})).longValue() : aVar.e;
        }

        public static /* synthetic */ boolean f(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("7557999a", new Object[]{aVar})).booleanValue() : aVar.f;
        }

        public static /* synthetic */ String g(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("329239a9", new Object[]{aVar}) : aVar.g;
        }

        public fpt a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (fpt) ipChange.ipc$dispatch("f04b574", new Object[]{this});
            }
            if (TextUtils.isEmpty(this.b) || TextUtils.isEmpty(this.c)) {
                throw new IllegalArgumentException();
            }
            return new fpt(this);
        }

        public a a(Context context) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("11475d1f", new Object[]{this, context});
            }
            this.f28106a = context;
            return this;
        }

        public a a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("1e11218d", new Object[]{this, str});
            }
            this.b = str;
            return this;
        }

        public a b(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("a641616c", new Object[]{this, str});
            }
            this.g = str;
            return this;
        }

        public a c(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("2e71a14b", new Object[]{this, str});
            }
            this.c = str;
            return this;
        }

        public a a(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("d4752044", new Object[]{this, new Integer(i)});
            }
            this.d = i;
            return this;
        }

        public a a(long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("dc26c5a3", new Object[]{this, new Long(j)});
            }
            this.e = j;
            return this;
        }
    }
}
