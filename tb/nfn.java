package tb;

import android.content.Context;
import android.os.Build;
import android.os.Environment;
import mtopsdk.common.util.StringUtils;
import com.alibaba.ability.impl.photo.b;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import tb.nfk;

/* loaded from: classes7.dex */
public class nfn implements nfl {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final a b;
    private volatile nfk c;

    /* renamed from: a  reason: collision with root package name */
    private final Object f31423a = new Object();
    private boolean d = true;

    static {
        kge.a(728626362);
        kge.a(370424472);
    }

    public nfn(Context context, String str, int i) {
        this.b = new a(context, str);
        a(i);
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            return;
        }
        a aVar = this.b;
        if (aVar == null) {
            return;
        }
        aVar.a(i);
    }

    @Override // tb.nfl
    public void a() {
        File file;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        synchronized (this.f31423a) {
            if ((this.c == null || this.c.a()) && (file = this.b.b) != null) {
                if (!file.exists()) {
                    file.mkdirs();
                }
                if (a(file) > this.b.f31424a) {
                    try {
                        this.c = nfk.a(file, 1, 1, this.b.f31424a);
                        ngr.a("PackageCacheDiskLru", "Disk cache initialized");
                    } catch (IOException e) {
                        this.b.b = null;
                        ngr.b("PackageCacheDiskLru", "initDiskCache - " + e);
                    }
                }
            }
            this.d = false;
            this.f31423a.notifyAll();
        }
    }

    @Override // tb.nfl
    public synchronized boolean b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3dd7e577", new Object[]{this, str})).booleanValue();
        }
        if (this.c != null && str != null) {
            try {
                this.c.d(str);
                return true;
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return false;
    }

    @Override // tb.nfl
    public boolean a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d9378d80", new Object[]{this, str, str2})).booleanValue();
        }
        if (str2 == null || str == null) {
            return false;
        }
        synchronized (this.f31423a) {
            if (this.c != null) {
                OutputStream outputStream = null;
                try {
                    nfk.a c = this.c.c(str);
                    if (c != null) {
                        outputStream = c.a(0);
                        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream);
                        outputStreamWriter.write(str2);
                        outputStreamWriter.flush();
                        c.a();
                        outputStreamWriter.close();
                        outputStream.close();
                        if (outputStream != null) {
                            try {
                                outputStream.close();
                            } catch (IOException unused) {
                            }
                        }
                        return true;
                    }
                } catch (Exception e) {
                    ngr.b("PackageCacheDiskLru", "addBitmapToCache - " + e);
                    if (outputStream != null) {
                        try {
                            outputStream.close();
                        } catch (IOException unused2) {
                        }
                    }
                }
            }
            return false;
        }
    }

    public boolean c(String str) {
        boolean a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("88097eb8", new Object[]{this, str})).booleanValue();
        }
        synchronized (this.f31423a) {
            while (this.d) {
                try {
                    this.f31423a.wait();
                } catch (InterruptedException unused) {
                }
            }
        }
        if (this.c == null || StringUtils.isEmpty(str)) {
            return false;
        }
        synchronized (this.f31423a) {
            a2 = this.c.a(str);
        }
        return a2;
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x00bf A[Catch: all -> 0x00ef, TryCatch #7 {, blocks: (B:8:0x001b, B:10:0x001f, B:12:0x0025, B:42:0x007d, B:44:0x0082, B:65:0x00bf, B:67:0x00c5, B:69:0x00c8, B:70:0x00d0, B:72:0x00d2, B:73:0x00d7, B:74:0x00ed, B:53:0x00a7, B:55:0x00ac, B:59:0x00b3, B:61:0x00b8, B:62:0x00bb), top: B:92:0x001b }] */
    @Override // tb.nfl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String a(java.lang.String r11) {
        /*
            Method dump skipped, instructions count: 242
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.nfn.a(java.lang.String):java.lang.String");
    }

    @Override // tb.nfl
    public boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
        }
        synchronized (this.f31423a) {
            if (this.c != null) {
                try {
                    this.c.b();
                    ngr.c("PackageCacheDiskLru", "Disk cache flushed");
                    return true;
                } catch (IOException e) {
                    ngr.b("PackageCacheDiskLru", "flush - " + e);
                }
            }
            return false;
        }
    }

    private long a(File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8a979fd3", new Object[]{this, file})).longValue();
        }
        if (file != null) {
            return file.getUsableSpace();
        }
        return 0L;
    }

    /* loaded from: classes7.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public int f31424a = b.MAX_IMAGE_SIZE;
        public File b;

        static {
            kge.a(1238728129);
        }

        public a(Context context, String str) {
            this.b = a(context, str);
        }

        public void a(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            } else if (i <= 0) {
            } else {
                this.f31424a = i;
            }
        }

        public File a(Context context, String str) {
            String path;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (File) ipChange.ipc$dispatch("90186323", new Object[]{this, context, str});
            }
            if ("mounted".equals(Environment.getExternalStorageState()) || !a()) {
                path = a(context).getPath();
            } else {
                path = context.getCacheDir().getPath();
            }
            return new File(path + File.separator + str);
        }

        public File a(Context context) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (File) ipChange.ipc$dispatch("72147cad", new Object[]{this, context});
            }
            File file = null;
            if (Build.VERSION.SDK_INT >= 8) {
                file = context.getExternalCacheDir();
            }
            if (file != null) {
                return file;
            }
            return new File(Environment.getExternalStorageDirectory().getPath() + ("/Android/data/" + context.getPackageName() + "/cache/"));
        }

        public boolean a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : Environment.isExternalStorageRemovable();
        }
    }
}
