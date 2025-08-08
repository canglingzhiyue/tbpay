package tb;

import android.content.Context;
import android.os.AsyncTask;
import android.os.Environment;
import mtopsdk.common.util.StringUtils;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.datamodel.cache.db.b;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes6.dex */
public class joi {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final String f29656a;
    public final String b;
    public final long c;
    public final int d;
    public final Context e;
    public final File f;
    public final boolean g;
    public b h;

    static {
        kge.a(-826152093);
    }

    public static /* synthetic */ File a(joi joiVar, byte[] bArr, File file) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (File) ipChange.ipc$dispatch("d40707bb", new Object[]{joiVar, bArr, file}) : joiVar.a(bArr, file);
    }

    private joi(a aVar) {
        this.f29656a = a.a(aVar);
        this.e = a.b(aVar);
        this.b = a.c(aVar);
        this.d = a.d(aVar);
        this.c = a.e(aVar);
        this.g = a.f(aVar);
        this.f = b();
        this.h = new b(this.e, this.f, this.b, this.c);
    }

    public List<String> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("627608df", new Object[]{this});
        }
        ArrayList arrayList = new ArrayList();
        List<b.a> a2 = this.h.a();
        if (a2 != null && a2.size() != 0) {
            for (b.a aVar : a2) {
                arrayList.add(aVar.f15744a);
            }
        }
        return arrayList;
    }

    public synchronized void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            this.h.b(str);
        }
    }

    public byte[] b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("7d24c9ca", new Object[]{this, str});
        }
        byte[] bArr = null;
        b.a a2 = this.h.a(str);
        if (a2 != null && (bArr = a(a2.b)) != null && bArr.length > 0) {
            String str2 = "[getTemplateById #" + str + "] get template from file.";
        }
        return bArr;
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

    /* JADX WARN: Type inference failed for: r0v1, types: [tb.joi$1] */
    public void a(final String str, final byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a35a7c79", new Object[]{this, str, bArr});
        } else if (bArr == null) {
            String str2 = "[getTemplateById #" + str + "] template from server is null.";
        } else {
            new AsyncTask<Void, Void, Void>() { // from class: tb.joi.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Void, java.lang.Object] */
                @Override // android.os.AsyncTask
                public /* synthetic */ Void doInBackground(Void[] voidArr) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("e83e4786", new Object[]{this, voidArr}) : a(voidArr);
                }

                public Void a(Void... voidArr) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return (Void) ipChange2.ipc$dispatch("54f0ab29", new Object[]{this, voidArr});
                    }
                    String str3 = str;
                    synchronized (joi.class) {
                        File file = new File(joi.this.f, str3);
                        if (file.exists()) {
                            return null;
                        }
                        joi.a(joi.this, bArr, file);
                        if (file.isFile() && file.length() > 0) {
                            try {
                                joi.this.h.a(str, file);
                            } catch (Throwable th) {
                                Log.e(bzy.POINT_TEMPLATE_CACHE, "File cache store exception", th);
                            }
                        }
                        return null;
                    }
                }
            }.executeOnExecutor(AsyncTask.SERIAL_EXECUTOR, new Void[0]);
        }
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
            com.android.alibaba.ip.runtime.IpChange r0 = tb.joi.$ipChange
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
        throw new UnsupportedOperationException("Method not decompiled: tb.joi.a(byte[], java.io.File):java.io.File");
    }

    private File b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("64f2a3c4", new Object[]{this});
        }
        File c = c();
        if (c == null) {
            return null;
        }
        File file = new File(c, this.f29656a);
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
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

    /* loaded from: classes6.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private Context f29658a;
        private String b;
        private String c;
        private int d = 8;
        private long e = 4194304;
        private boolean f = true;

        static {
            kge.a(-1295732934);
        }

        public static /* synthetic */ String a(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("e60ec9c9", new Object[]{aVar}) : aVar.b;
        }

        public static /* synthetic */ Context b(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("b31f10f0", new Object[]{aVar}) : aVar.f29658a;
        }

        public static /* synthetic */ String c(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("f66f4987", new Object[]{aVar}) : aVar.c;
        }

        public static /* synthetic */ int d(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("1979ee6d", new Object[]{aVar})).intValue() : aVar.d;
        }

        public static /* synthetic */ long e(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("735558af", new Object[]{aVar})).longValue() : aVar.e;
        }

        public static /* synthetic */ boolean f(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("cd30c300", new Object[]{aVar})).booleanValue() : aVar.f;
        }

        public joi a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (joi) ipChange.ipc$dispatch("f0681da", new Object[]{this});
            }
            if (this.f29658a == null || StringUtils.isEmpty(this.b) || StringUtils.isEmpty(this.c)) {
                throw new IllegalArgumentException();
            }
            return new joi(this);
        }

        public a a(Context context) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("1807a805", new Object[]{this, context});
            }
            this.f29658a = context;
            return this;
        }

        public a a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("24d16c73", new Object[]{this, str});
            }
            this.b = str;
            return this;
        }

        public a b(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("ad01ac52", new Object[]{this, str});
            }
            this.c = str;
            return this;
        }

        public a a(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("db356b2a", new Object[]{this, new Integer(i)});
            }
            this.d = i;
            return this;
        }

        public a a(long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("e2e71089", new Object[]{this, new Long(j)});
            }
            this.e = j;
            return this;
        }
    }
}
