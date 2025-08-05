package com.uc.webview.internal.setup.verify;

import android.content.Context;
import com.uc.webview.base.EnvInfo;
import com.uc.webview.base.ErrorCode;
import com.uc.webview.base.GlobalSettings;
import com.uc.webview.base.Log;
import com.uc.webview.base.io.PathUtils;
import com.uc.webview.base.timing.StartupTimingKeys;
import com.uc.webview.base.timing.TraceEvent;
import com.uc.webview.export.Build;
import com.uc.webview.internal.interfaces.IStartupController;
import com.uc.webview.internal.setup.j;
import java.io.File;
import java.util.HashMap;

/* loaded from: classes9.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    private static final HashMap<String, Object> f23985a = new HashMap<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes9.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final File f23986a;
        private final boolean b;

        public a(File file, boolean z) {
            if (file.exists()) {
                File file2 = file.isDirectory() ? file : new File(file.getParent());
                this.f23986a = new File(file2, ".qf" + PathUtils.generateName(file));
            } else {
                this.f23986a = null;
                z = true;
            }
            this.b = z;
            StringBuilder sb = new StringBuilder("file:");
            sb.append(file.getPath());
            sb.append(", flag:");
            File file3 = this.f23986a;
            Object obj = "null";
            sb.append(file3 != null ? file3.getPath() : obj);
            sb.append(", exists:");
            File file4 = this.f23986a;
            sb.append(file4 != null ? Boolean.valueOf(file4.exists()) : obj);
            sb.append(", ignore:");
            sb.append(this.b);
            Log.i("Qchk", sb.toString());
        }

        public final void a(boolean z) {
            File file = this.f23986a;
            if (file == null) {
                return;
            }
            com.uc.webview.base.io.d.c("Qchk-sv", file);
            if (!z) {
                return;
            }
            com.uc.webview.base.io.d.b("Qchk-sv", this.f23986a);
        }

        public final boolean a() {
            File file;
            if (!this.b && (file = this.f23986a) != null) {
                return file.exists();
            }
            return false;
        }

        public final void b() {
            File file = this.f23986a;
            if (file == null) {
                return;
            }
            com.uc.webview.base.io.d.c("Qchk-cl", file);
        }
    }

    public static int a() {
        return GlobalSettings.getIntValue(135);
    }

    private static Object a(File file) {
        Object obj;
        synchronized (f23985a) {
            String absolutePath = file.getAbsolutePath();
            obj = f23985a.get(absolutePath);
            if (obj == null) {
                obj = new Object();
                f23985a.put(absolutePath, obj);
            }
        }
        return obj;
    }

    public static void a(Context context, File file, File file2, int i) {
        boolean z;
        synchronized (a(file)) {
            if (i == 0) {
                Log.d("Verifier", "checkDex disabled");
                return;
            }
            TraceEvent scoped = TraceEvent.scoped((int) StartupTimingKeys.CHECK_DEX_VALIDITY);
            long currentTimeMillis = System.currentTimeMillis();
            a aVar = new a(file2, b(i));
            boolean a2 = aVar.a();
            if (!a2) {
                z = c.a(context, file2.getAbsolutePath());
                aVar.a(z);
            } else {
                com.uc.webview.base.timing.a.a((int) StartupTimingKeys.CHECK_DEX_VALIDITY_QUICK, 1L);
                z = a2;
            }
            StringBuilder sb = new StringBuilder("checkDex ");
            sb.append(z ? "success" : "failed");
            sb.append(", cost:");
            sb.append(System.currentTimeMillis() - currentTimeMillis);
            sb.append(" [");
            sb.append(file2.getAbsolutePath());
            sb.append("] hitQuick:");
            sb.append(a2);
            Log.i("Verifier", sb.toString());
            if (!z) {
                ErrorCode.VERIFY_DEX_FAILED.report();
            }
            if (scoped != null) {
                scoped.close();
            }
        }
    }

    public static void a(j jVar) {
        if (jVar == null || jVar.c()) {
            return;
        }
        Log.d("Verifier", "clearFlags");
        if (jVar.r() != null) {
            jVar.r().b();
        }
        File m = jVar.m();
        if (m != null) {
            new a(m, true).b();
        }
        new a(jVar.p(), true).b();
    }

    public static void a(String[] strArr, boolean z) {
        TraceEvent scoped = TraceEvent.scoped((int) StartupTimingKeys.CHECK_COMPATIABLE);
        try {
            IStartupController iStartupController = IStartupController.Instance.get();
            if (!z) {
                if (!EnvInfo.g()) {
                    ErrorCode.COMPATIABLE_NOT_SUPPORT_ARCH.report(EnvInfo.h());
                }
                iStartupController.checkCompatiable(Build.Version.NAME, Build.Version.SUPPORT_U4_MIN);
            }
            iStartupController.checkAuthorization(EnvInfo.getContext(), strArr);
            if (scoped == null) {
                return;
            }
            scoped.close();
        } catch (Throwable th) {
            if (scoped != null) {
                try {
                    scoped.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public static boolean a(int i) {
        return i == 0;
    }

    public static boolean a(File file, File file2, int i, ClassLoader classLoader, boolean z) {
        return a(file, file2, null, i, classLoader, z, false, null);
    }

    public static boolean a(File file, File file2, int i, ClassLoader classLoader, Object[] objArr) {
        return a(file, PathUtils.getDirCoreLib(file), file2, i, classLoader, false, true, objArr);
    }

    private static boolean a(File file, File file2, File file3, int i, ClassLoader classLoader, boolean z, boolean z2, Object[] objArr) {
        boolean z3;
        synchronized (a(file)) {
            if (i == 0) {
                Log.d("Verifier", "checkLib disabled");
                return true;
            }
            TraceEvent scoped = TraceEvent.scoped((int) StartupTimingKeys.CHECK_LIB_VALIDITY);
            String str = null;
            a aVar = file3 == null ? new a(PathUtils.getFileCoreLib(file2), b(i)) : null;
            boolean a2 = aVar != null ? aVar.a() : false;
            if (a2 && !z2) {
                com.uc.webview.base.io.c b = file != null ? PathUtils.b(file) : null;
                if (b != null && b.c()) {
                    if (b != null) {
                        b.b();
                    }
                }
                Log.d("Verifier", "checkLibFull: no wvFlag");
                a2 = false;
            }
            if (!a2) {
                if (objArr == null) {
                    objArr = new Object[2];
                }
                z3 = b.a(file2, file3, classLoader, z, objArr);
                if (aVar != null) {
                    aVar.a(z3);
                }
            } else {
                com.uc.webview.base.timing.a.a((int) StartupTimingKeys.CHECK_LIB_VALIDITY_QUICK, 1L);
                z3 = a2;
            }
            StringBuilder sb = new StringBuilder("checkLib ");
            sb.append(z3 ? "success" : "failed");
            sb.append(" [");
            sb.append(file2.getAbsolutePath());
            sb.append("] hitQuick:");
            sb.append(a2);
            Log.i("Verifier", sb.toString());
            if (!z3) {
                if (objArr != null && objArr.length > 0 && objArr[0] != null) {
                    str = "vrfError=" + String.valueOf(objArr[0]);
                }
                ErrorCode.VERIFY_LIB_FAILED.report(str);
            }
            if (scoped != null) {
                scoped.close();
            }
            return z3;
        }
    }

    public static void b(j jVar) {
        Log.d("Verifier", "forceVerify");
        a(jVar);
        GlobalSettings.set(135, 2);
    }

    private static boolean b(int i) {
        return 2 == i;
    }
}
