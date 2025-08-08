package com.uc.webview.internal.setup;

import mtopsdk.common.util.StringUtils;
import com.uc.webview.base.EnvInfo;
import com.uc.webview.base.GlobalSettings;
import com.uc.webview.base.UCKnownException;
import com.uc.webview.base.io.PathUtils;
import com.uc.webview.internal.interfaces.IStartupController;
import com.uc.webview.internal.setup.component.t;
import com.uc.webview.internal.setup.component.u;
import java.io.File;
import java.util.ArrayList;

/* loaded from: classes9.dex */
public final class m {

    /* renamed from: a  reason: collision with root package name */
    public static File f23979a;
    static boolean b;

    /* loaded from: classes9.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static final int f23981a;

        static {
            int a2 = com.uc.webview.internal.d.a("debug.uc.patch.mode");
            if (a2 == -1) {
                a2 = GlobalSettings.get(132, 0);
            }
            f23981a = a2;
        }
    }

    /* loaded from: classes9.dex */
    public static class b implements u {
        private b() {
        }

        public /* synthetic */ b(byte b) {
            this();
        }

        @Override // com.uc.webview.internal.setup.component.u
        public final int a(String str, String str2, String str3) {
            return m.a(str, str2, str3);
        }

        @Override // com.uc.webview.internal.setup.component.u
        public final boolean a(com.uc.webview.internal.setup.component.i iVar) {
            com.uc.webview.base.io.c c = PathUtils.c(b(iVar));
            return c != null && c.c();
        }

        @Override // com.uc.webview.internal.setup.component.u
        public final File b(com.uc.webview.internal.setup.component.i iVar) {
            String parent = m.f23979a.getParent();
            return new File(parent, PathUtils.b(iVar.h + "." + iVar.i));
        }
    }

    static int a(String str, String str2, String str3) {
        File file = new File(str3);
        k kVar = new k();
        kVar.a(EnvInfo.getContext());
        UCKnownException uCKnownException = null;
        kVar.d = null;
        kVar.e = null;
        kVar.i = true;
        kVar.g = null;
        kVar.j = true;
        kVar.f = file;
        kVar.c = !PathUtils.getFileCoreDex(file).exists();
        j b2 = j.b(kVar);
        try {
            try {
                b2.a(str, str2);
                File q = b2.q();
                File o = b2.o();
                File m = b2.m();
                File n = b2.n();
                ClassLoader classLoader = l.class.getClassLoader();
                com.uc.webview.internal.setup.verify.d.a(EnvInfo.getContext(), q, m, 1);
                com.uc.webview.base.i iVar = new com.uc.webview.base.i(m.getAbsolutePath(), n.getAbsolutePath(), o.getAbsolutePath(), classLoader);
                Class.forName(IStartupController.CORE_CLASS_STARTUP_CONTROLLER, true, iVar);
                b2.t = iVar;
                com.uc.webview.internal.setup.verify.d.a(q, o, 1, (ClassLoader) iVar, false);
            } catch (UCKnownException e) {
                uCKnownException = e;
            } catch (Exception e2) {
                UCKnownException uCKnownException2 = new UCKnownException(e2);
                a(b2, uCKnownException2);
                uCKnownException = uCKnownException2;
            }
            if (uCKnownException != null) {
                return uCKnownException.errCode();
            }
            return 0;
        } finally {
            a(b2, null);
        }
    }

    public static void a(j jVar) {
        if (b) {
            com.uc.webview.internal.setup.component.l.a(4, "U4Patch", "切核模式，不升级", (Throwable) null);
        } else if (jVar != l.b().e()) {
        } else {
            com.uc.webview.base.task.c.a("U4Patch", new Runnable() { // from class: com.uc.webview.internal.setup.m.1
                @Override // java.lang.Runnable
                public final void run() {
                    t.a();
                }
            }, null);
        }
    }

    private static void a(j jVar, UCKnownException uCKnownException) {
        boolean z = uCKnownException == null;
        com.uc.webview.internal.setup.component.l.b("U4Patch", "onFinished, success: %s, coreInfo: %s", Boolean.valueOf(z), jVar.i(), uCKnownException);
        if (z) {
            com.uc.webview.base.io.c c = PathUtils.c(jVar.q());
            if (c != null) {
                c.a();
            }
            g.a(jVar, jVar.coreClassLoader());
            g.a(EnvInfo.getContext(), jVar);
        }
    }

    public static boolean b(final j jVar) {
        if (jVar != null && jVar.j != null) {
            String str = jVar.e() + "." + jVar.f();
            if (!StringUtils.isEmpty(str)) {
                boolean isAccessible = GlobalSettings.isAccessible(224, str);
                if (isAccessible) {
                    com.uc.webview.internal.setup.component.l.c("U4Patch", "core(%s) is in black list, delete it, dir: %s", str, com.uc.webview.internal.setup.component.l.a(jVar.j.getAbsolutePath()));
                    com.uc.webview.base.task.c.a("U4Patch", new Runnable() { // from class: com.uc.webview.internal.setup.m.2
                        @Override // java.lang.Runnable
                        public final void run() {
                            com.uc.webview.base.io.d.a("U4Patch", j.this.j, true, (ArrayList<File>) null);
                        }
                    }, null, 60000L);
                }
                return isAccessible;
            }
        }
        return false;
    }
}
