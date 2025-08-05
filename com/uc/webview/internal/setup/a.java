package com.uc.webview.internal.setup;

import android.content.Context;
import com.uc.webview.base.Log;
import com.uc.webview.base.io.PathUtils;
import com.uc.webview.base.task.c;
import com.uc.webview.base.timing.StartupTimingKeys;
import com.uc.webview.export.extension.JSILoader;
import java.io.File;
import java.util.ArrayList;

/* loaded from: classes9.dex */
public class a extends com.uc.webview.base.task.c {
    private final Context c;
    private final k d;
    private final com.uc.webview.base.io.b e;
    private final ArrayList<File> f = new ArrayList<>();

    public a(Context context, k kVar) {
        this.c = context;
        this.d = kVar;
        this.e = PathUtils.a(context, "Cleaner");
    }

    static /* synthetic */ void a(a aVar) {
        synchronized (a.class) {
            String[] strArr = {"ucwa/wa_upload_new.wa", "shared_prefs/UC_WA_STAT.xml"};
            for (int i = 0; i < 2; i++) {
                com.uc.webview.base.io.d.c("Cleaner-ab", new File(aVar.c.getApplicationInfo().dataDir, strArr[i]));
            }
            String[] strArr2 = {"app_cyclone", "app_ucmsdk"};
            for (int i2 = 0; i2 < 2; i2++) {
                com.uc.webview.base.io.d.a("Cleaner-af", new File(aVar.c.getApplicationInfo().dataDir, strArr2[i2]));
            }
        }
    }

    private void i() {
        try {
            this.e.a();
            j();
            l();
            k();
            com.uc.webview.base.task.d.a("cleanAbf", new Runnable() { // from class: com.uc.webview.internal.setup.a.1
                @Override // java.lang.Runnable
                public final void run() {
                    a.a(a.this);
                }
            }, 15000L);
        } finally {
            try {
            } finally {
            }
        }
    }

    private void j() {
        j e = l.b().e();
        if (e != null && !com.uc.webview.internal.e.d()) {
            a(e.q());
        }
        a(JSILoader.getUsingDir());
        com.uc.webview.base.io.d.a("Cleaner-ud", PathUtils.e(this.c), true, this.f);
    }

    private void k() {
        k kVar = this.d;
        if (kVar == null || kVar.h == null) {
            return;
        }
        this.d.h.delete();
    }

    private void l() {
        try {
            File[] listFiles = PathUtils.getDirCache(this.c).listFiles();
            if (listFiles != null) {
                for (File file : listFiles) {
                    if (file != null && file.isDirectory() && file.getName().startsWith(".tmp_unz_")) {
                        com.uc.webview.base.io.d.a("tmpunz-o", file, false, (ArrayList<File>) null);
                    }
                }
            }
            File[] listFiles2 = PathUtils.i(this.c).listFiles();
            if (listFiles2 == null) {
                return;
            }
            for (File file2 : listFiles2) {
                if (file2 != null && file2.isDirectory() && !com.uc.webview.base.zip.a.a(file2)) {
                    com.uc.webview.base.io.d.a("tmpunz", file2, false, (ArrayList<File>) null);
                }
            }
        } catch (Throwable th) {
            Log.w("Cleaner", "cleanTmpUnz failed", th);
        }
    }

    @Override // com.uc.webview.base.task.c
    public final com.uc.webview.base.task.c a() {
        return a(3000L);
    }

    public final a a(File file) {
        if (file != null && !this.f.contains(file)) {
            this.f.add(file);
        }
        return this;
    }

    @Override // com.uc.webview.base.task.c, java.util.concurrent.Callable
    public /* synthetic */ c.C1036c call() throws Exception {
        return super.call();
    }

    @Override // com.uc.webview.base.task.c
    public final void d() {
        synchronized (PathUtils.a()) {
            i();
        }
    }

    @Override // com.uc.webview.base.task.c
    public final String e() {
        return "Cleaner";
    }

    @Override // com.uc.webview.base.task.c
    public final int f() {
        return StartupTimingKeys.CLEANER;
    }

    public final void h() {
        d();
    }
}
