package tb;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Handler;
import android.text.TextUtils;
import com.alibaba.android.split.PatchSplitFileInfo;
import com.alibaba.android.split.SplitFileInfo;
import com.alibaba.android.split.d;
import com.alibaba.android.split.k;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.downloader.b;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Executor;
import tb.bgi;
import tb.kml;

/* loaded from: classes.dex */
public class cam implements bgi<kmq> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Context f26228a;
    private String b;

    @Override // tb.bgi
    public /* bridge */ /* synthetic */ int a(List list, kmq kmqVar, Executor executor, Handler handler, bgi.b<kmq> bVar) {
        return a2((List<SplitFileInfo>) list, kmqVar, executor, handler, bVar);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [tb.kmq, java.lang.Object] */
    @Override // tb.bgi
    public /* synthetic */ kmq a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("bd3407ca", new Object[]{this}) : b();
    }

    public cam(Context context) {
        this.f26228a = context;
        try {
            this.b = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }
    }

    public kmq b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kmq) ipChange.ipc$dispatch("16b8950e", new Object[]{this});
        }
        kmq kmqVar = new kmq();
        if (k.a() != null) {
            try {
                kmqVar.h = k.a().b().n().getAbsolutePath();
            } catch (Exception unused) {
                kmqVar.h = c();
            }
        } else {
            kmqVar.h = c();
        }
        return kmqVar;
    }

    private String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bd025a76", new Object[]{this});
        }
        try {
            return a(new File(a(d.a()), "downloaded-splits")).getAbsolutePath();
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }

    private final File a(boolean z) throws IOException {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (File) ipChange.ipc$dispatch("8f61e121", new Object[]{this, new Boolean(z)}) : a(new File(b(z), this.b));
    }

    private final File b(boolean z) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("5d0c42e2", new Object[]{this, new Boolean(z)});
        }
        if (z) {
            return a(new File(this.f26228a.getFilesDir(), "splitcompat"));
        }
        return a(new File(this.f26228a.getExternalFilesDir(null), "splitcompat"));
    }

    private static File a(File file) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("4659278e", new Object[]{file});
        }
        if (file.exists()) {
            if (!file.isDirectory()) {
                throw new IllegalArgumentException("File input must be directory when it exists.");
            }
            return file;
        }
        file.mkdirs();
        if (file.isDirectory()) {
            return file;
        }
        String absolutePath = file.getAbsolutePath();
        throw new IOException(absolutePath.length() != 0 ? "Unable to create directory: ".concat(absolutePath) : new String("Unable to create directory: "));
    }

    /* renamed from: a  reason: avoid collision after fix types in other method */
    public int a2(List<SplitFileInfo> list, kmq kmqVar, Executor executor, Handler handler, bgi.b<kmq> bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8296f48d", new Object[]{this, list, kmqVar, executor, handler, bVar})).intValue();
        }
        kmm kmmVar = new kmm();
        kmmVar.b = kmqVar;
        kmqVar.f30169a = "splitdownload";
        kmqVar.c = 20;
        kmmVar.f30166a = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            SplitFileInfo splitFileInfo = list.get(i);
            if (!TextUtils.isEmpty(splitFileInfo.url)) {
                kmo kmoVar = new kmo(splitFileInfo.url);
                kmoVar.c = splitFileInfo.md5;
                if (splitFileInfo instanceof PatchSplitFileInfo) {
                    kmoVar.d = splitFileInfo.splitName.concat(".patch");
                } else {
                    kmoVar.d = splitFileInfo.splitName.concat(bgy.APK_EXTENSION);
                }
                kmoVar.b = Long.valueOf(splitFileInfo.fileSize).longValue();
                kmmVar.f30166a.add(kmoVar);
            }
        }
        return b.a().a(kmmVar, new a(executor, bVar));
    }

    @Override // tb.bgi
    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else {
            b.a().c(i);
        }
    }

    @Override // tb.bgi
    public void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
        } else {
            b.a().b(i);
        }
    }

    /* loaded from: classes3.dex */
    public class a implements kmn {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private Executor b;
        private bgi.b c;

        public static /* synthetic */ bgi.b a(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (bgi.b) ipChange.ipc$dispatch("e54e2278", new Object[]{aVar}) : aVar.c;
        }

        private a(Executor executor, bgi.b bVar) {
            this.b = executor;
            this.c = bVar;
        }

        @Override // tb.kml
        public void onDownloadProgress(final int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("49af8908", new Object[]{this, new Integer(i)});
                return;
            }
            bgi.b bVar = this.c;
            if (bVar == null) {
                return;
            }
            Executor executor = this.b;
            if (executor != null) {
                executor.execute(new Runnable() { // from class: tb.cam.a.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            a.a(a.this).a(i);
                        }
                    }
                });
            } else {
                bVar.a(i);
            }
        }

        @Override // tb.kml
        public void onDownloadError(final String str, final int i, final String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cc722e3b", new Object[]{this, str, new Integer(i), str2});
                return;
            }
            bgi.b bVar = this.c;
            if (bVar == null) {
                return;
            }
            Executor executor = this.b;
            if (executor != null) {
                executor.execute(new Runnable() { // from class: tb.cam.a.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            a.a(a.this).a(str, i, str2);
                        }
                    }
                });
            } else {
                bVar.a(str, i, str2);
            }
        }

        @Override // tb.kml
        public void onDownloadFinish(final String str, final String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("43d7a315", new Object[]{this, str, str2});
                return;
            }
            bgi.b bVar = this.c;
            if (bVar == null) {
                return;
            }
            Executor executor = this.b;
            if (executor != null) {
                executor.execute(new Runnable() { // from class: tb.cam.a.3
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            a.a(a.this).a(str, str2);
                        }
                    }
                });
            } else {
                bVar.a(str, str2);
            }
        }

        @Override // tb.kml
        public void onDownloadStateChange(final String str, final boolean z) {
            Executor executor;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("98fdb789", new Object[]{this, str, new Boolean(z)});
            } else if (this.c == null || (executor = this.b) == null) {
            } else {
                executor.execute(new Runnable() { // from class: tb.cam.a.4
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            a.a(a.this);
                        }
                    }
                });
            }
        }

        @Override // tb.kml
        public void onFinish(final boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6a109f1b", new Object[]{this, new Boolean(z)});
                return;
            }
            bgi.b bVar = this.c;
            if (bVar == null) {
                return;
            }
            Executor executor = this.b;
            if (executor != null) {
                executor.execute(new Runnable() { // from class: tb.cam.a.5
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            a.a(a.this).a(z);
                        }
                    }
                });
            } else {
                bVar.a(z);
            }
        }

        @Override // tb.kml
        public void onNetworkLimit(final int i, final kmq kmqVar, final kml.a aVar) {
            Executor executor;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6919023a", new Object[]{this, new Integer(i), kmqVar, aVar});
            } else if (this.c == null || (executor = this.b) == null) {
            } else {
                executor.execute(new Runnable() { // from class: tb.cam.a.6
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            a.a(a.this);
                        }
                    }
                });
            }
        }

        @Override // tb.kmn
        public void a(String str, HashMap<String, String> hashMap) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3202a441", new Object[]{this, str, hashMap});
                return;
            }
            bgi.b bVar = this.c;
            if (bVar == null) {
                return;
            }
            bVar.a(str, hashMap);
        }
    }
}
