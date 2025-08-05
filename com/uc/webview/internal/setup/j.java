package com.uc.webview.internal.setup;

import android.text.TextUtils;
import com.uc.webview.base.EnvInfo;
import com.uc.webview.base.ErrorCode;
import com.uc.webview.base.Log;
import com.uc.webview.base.UCKnownException;
import com.uc.webview.base.io.PathUtils;
import com.uc.webview.export.extension.ICoreVersion;
import com.uc.webview.export.extension.IRunningCoreInfo;
import com.uc.webview.internal.setup.b;
import java.io.File;
import mtopsdk.network.impl.ResponseProtocolType;
import tb.riy;

/* loaded from: classes9.dex */
public class j extends IRunningCoreInfo {
    static final /* synthetic */ boolean w = !j.class.desiredAssertionStatus();

    /* renamed from: a  reason: collision with root package name */
    public int f23970a;
    protected boolean b;
    protected int c;
    protected boolean d;
    protected boolean e;
    protected boolean f;
    protected boolean g;
    protected File h;
    protected File i;
    protected File j;
    protected File k;
    protected File l;
    protected com.uc.webview.base.io.c m;
    protected File n;
    protected String o;
    protected String p;
    protected String q;
    String r;
    protected String s;
    ClassLoader t;
    public b.a u;
    protected boolean v;
    private ClassLoader x;
    private IRunningCoreInfo.FailedInfo y;

    /* loaded from: classes9.dex */
    public interface a {

        /* renamed from: a  reason: collision with root package name */
        public static final String[] f23972a = {"小核", "大核", "旧小核", "旧大核"};
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public j() {
        this.f23970a = -1;
        this.y = null;
        this.u = null;
        this.v = false;
    }

    private j(k kVar) {
        this.f23970a = -1;
        this.y = null;
        this.u = null;
        boolean z = false;
        this.v = false;
        this.b = kVar.c;
        this.c = 1;
        this.f = false;
        this.h = null;
        this.i = null;
        this.j = null;
        this.k = null;
        this.l = null;
        this.o = null;
        this.v = kVar.i;
        if (kVar.j) {
            Log.i("RCI", "mIsThick set to false, shouldBeThinType: true");
            this.b = false;
        }
        g();
        int i = 3;
        if (kVar.d != null) {
            File file = kVar.d;
            File file2 = kVar.e;
            Log.i("RCI", "configCompressedCore: " + file.getAbsolutePath());
            if (file == null || !file.exists()) {
                ErrorCode.INVALID_COMPRESSED_LIB.report();
            }
            this.n = file;
            this.c = !this.b ? 2 : i;
            if (file2 != null) {
                this.j = file2;
            } else {
                this.j = new File(PathUtils.e(EnvInfo.getContext()), PathUtils.generateName(file));
            }
            a(this.j);
            this.f = (!this.l.exists() || !PathUtils.a(this.j).c()) ? true : z;
        } else if (kVar.f != null) {
            File file3 = kVar.f;
            Log.i("RCI", "configDecompressedCore: " + file3.getAbsolutePath());
            this.f = false;
            this.c = !this.b ? 2 : i;
            this.j = file3;
            a(this.j);
            File file4 = this.h;
            if ((file4 == null || file4.exists()) && this.l.exists()) {
                return;
            }
            ErrorCode.INVALID_DECOMPRESSED_DIR.report();
        } else if (!TextUtils.isEmpty(kVar.g)) {
            String str = kVar.g;
            Log.i("RCI", "configUpdateCore: ".concat(String.valueOf(str)));
            this.f = true;
            this.c = 4;
            this.o = str;
        } else {
            this.f = false;
            this.j = new File(EnvInfo.getContext().getApplicationInfo().nativeLibraryDir);
            this.k = this.j;
            this.l = PathUtils.getFileCoreLib(this.k);
            if (this.l.exists()) {
                return;
            }
            ErrorCode.INVALID_ALLIN_CORE.report();
        }
    }

    public static j a(UCKnownException uCKnownException) {
        return new j().b(uCKnownException);
    }

    public static j a(k kVar) {
        return g.a(kVar.f23973a);
    }

    private static void a(StringBuilder sb, String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        sb.append("\n  ");
        sb.append(str);
        sb.append(ResponseProtocolType.COMMENT);
        sb.append(str2);
    }

    public static j b(k kVar) {
        return new j(kVar);
    }

    private String x() {
        int i = this.c;
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? "UNKNOWN" : "UPDATE" : "THICK" : "THIN" : "NORMAL";
    }

    public final j a(ICoreVersion iCoreVersion) {
        a(iCoreVersion.version(), iCoreVersion.buildTimestamp());
        this.r = iCoreVersion.minSupportVersion();
        m.a(this);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void a(File file) {
        if (!this.b) {
            this.h = PathUtils.getFileCoreDex(file);
            this.i = file;
        }
        this.k = PathUtils.getDirCoreLib(file);
        this.l = PathUtils.getFileCoreLib(this.k);
        this.m = PathUtils.b(file);
    }

    public final void a(File file, File file2) {
        if (w || b()) {
            this.f = file != null;
            this.l = file;
            this.j = file2;
            a(this.j);
            if (TextUtils.isEmpty(this.o)) {
                return;
            }
            com.uc.webview.base.io.d.b("upd", new File(this.j, PathUtils.b(this.o)));
            return;
        }
        throw new AssertionError("Invalid integration type");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(String str, String str2) {
        this.p = str;
        this.q = str2;
        if ("240927172644".equals(this.q)) {
            this.f23970a = this.p.endsWith(".1") ? 1 : 0;
        } else {
            this.f23970a = this.p.endsWith(".1") ? 3 : 2;
        }
    }

    public final boolean a() {
        return this.v;
    }

    public final j b(final UCKnownException uCKnownException) {
        this.y = new IRunningCoreInfo.FailedInfo() { // from class: com.uc.webview.internal.setup.j.1
            @Override // com.uc.webview.export.extension.IRunningCoreInfo.FailedInfo
            public final int errorCode() {
                return uCKnownException.errCode();
            }

            @Override // com.uc.webview.export.extension.IRunningCoreInfo.FailedInfo
            public final UCKnownException exception() {
                return uCKnownException;
            }

            @Override // com.uc.webview.export.extension.IRunningCoreInfo.FailedInfo
            public final String reason() {
                return uCKnownException.errMsg();
            }

            public final String toString() {
                return errorCode() + ":" + reason() + ":" + Log.a(exception().getCause());
            }
        };
        return this;
    }

    public final boolean b() {
        return 4 == this.c;
    }

    public final boolean c() {
        return 1 == this.c;
    }

    @Override // com.uc.webview.export.extension.IRunningCoreInfo
    public ClassLoader coreClassLoader() {
        return this.t;
    }

    @Override // com.uc.webview.export.extension.IRunningCoreInfo
    public ICoreVersion coreVersion() {
        return ICoreVersion.Instance.get();
    }

    public final boolean d() {
        if (c() || this.d) {
            return true;
        }
        com.uc.webview.base.io.c cVar = this.m;
        return cVar != null && cVar.c();
    }

    public final String e() {
        return this.p;
    }

    public final String f() {
        return this.q;
    }

    @Override // com.uc.webview.export.extension.IRunningCoreInfo
    public IRunningCoreInfo.FailedInfo failedInfo() {
        return this.y;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void g() {
        this.x = j.class.getClassLoader();
        this.t = this.b ? this.x : null;
    }

    public final void h() {
        this.g = true;
    }

    public final String i() {
        return "RCI: {root: " + Log.a(this.j.toString()) + ", coreVer: " + this.p + '.' + this.q + riy.BLOCK_END_STR;
    }

    @Override // com.uc.webview.export.extension.IRunningCoreInfo
    public int integrationType() {
        return this.c;
    }

    @Override // com.uc.webview.export.extension.IRunningCoreInfo
    public boolean isFirstUsed() {
        return this.f;
    }

    @Override // com.uc.webview.export.extension.IRunningCoreInfo
    public boolean isReUsed() {
        return this.d;
    }

    public final String j() {
        StringBuilder sb = new StringBuilder();
        sb.append(x());
        sb.append(EnvInfo.is64Bit() ? ", 64bit" : ", 32bit");
        if (this.f) {
            sb.append(", first");
        }
        if (this.g) {
            sb.append(", retry");
        }
        if (this.d) {
            sb.append(", reuse");
        }
        if (this.e) {
            sb.append(", same");
        }
        return sb.toString();
    }

    public final boolean k() {
        return this.b;
    }

    public final String l() {
        return this.p;
    }

    @Override // com.uc.webview.export.extension.IRunningCoreInfo
    public String libPath() {
        return this.k.getAbsolutePath();
    }

    public final File m() {
        return this.h;
    }

    public final File n() {
        return this.i;
    }

    public final File o() {
        return this.k;
    }

    public final File p() {
        return this.l;
    }

    @Override // com.uc.webview.export.extension.IRunningCoreInfo
    public String path() {
        return this.j.getAbsolutePath();
    }

    public final File q() {
        return this.j;
    }

    public final com.uc.webview.base.io.c r() {
        return this.m;
    }

    public final File s() {
        return this.n;
    }

    @Override // com.uc.webview.export.extension.IRunningCoreInfo
    public ClassLoader sdkClassLoader() {
        return this.x;
    }

    public final String t() {
        return this.o;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("  IntegrationInfo : ");
        sb.append(x());
        sb.append(EnvInfo.is64Bit() ? ", 64bit" : ", 32bit");
        if (this.b != EnvInfo.c()) {
            sb.append(" thick->thin");
        }
        if (this.f) {
            sb.append(",first");
        }
        File file = this.h;
        String str = null;
        a(sb, "dex", file != null ? file.getAbsolutePath() : null);
        File file2 = this.i;
        a(sb, "odex", file2 != null ? file2.getAbsolutePath() : null);
        File file3 = this.j;
        a(sb, "rootDir", file3 != null ? file3.getAbsolutePath() : null);
        File file4 = this.k;
        a(sb, "libDir", file4 != null ? file4.getAbsolutePath() : null);
        File file5 = this.l;
        a(sb, "libFile", file5 != null ? file5.getAbsolutePath() : null);
        File file6 = this.n;
        a(sb, "compressFile", file6 != null ? file6.getAbsolutePath() : null);
        a(sb, "url", this.o);
        ClassLoader classLoader = this.x;
        a(sb, "sdkLoader", classLoader != null ? classLoader.toString() : null);
        if (!this.b) {
            ClassLoader classLoader2 = this.t;
            a(sb, "coreLoader", classLoader2 != null ? classLoader2.toString() : null);
        }
        IRunningCoreInfo.FailedInfo failedInfo = this.y;
        if (failedInfo != null) {
            str = failedInfo.toString();
        }
        a(sb, "failed", str);
        return sb.toString();
    }

    public final void u() {
        this.d = true;
    }

    public final boolean v() {
        return this.e;
    }

    public final void w() {
        this.e = true;
    }
}
