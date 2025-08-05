package com.uc.webview.internal.setup;

import android.text.TextUtils;
import com.uc.webview.base.EnvInfo;
import com.uc.webview.base.ErrorCode;
import com.uc.webview.base.Log;
import com.uc.webview.base.UCKnownException;
import com.uc.webview.base.b;
import com.uc.webview.base.io.PathUtils;
import com.uc.webview.base.task.c;
import com.uc.webview.base.timing.StartupTimingKeys;
import com.uc.webview.export.Build;
import com.uc.webview.export.extension.ICoreVersion;
import java.util.Arrays;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes9.dex */
public final class f extends com.uc.webview.base.task.c {
    private static final String f = "f";
    k c;
    j d;
    UCKnownException e;
    private final String g;

    private f(String str) {
        this.g = str;
    }

    public static String a(ClassLoader classLoader) {
        String[][] a2;
        if (classLoader == null || (a2 = EnvInfo.a(classLoader)) == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder("[name, length, md5, sha1, sha256]\n");
        for (String[] strArr : a2) {
            sb.append(Arrays.toString(strArr));
            sb.append("\n");
        }
        return sb.toString();
    }

    public static f h() {
        return new f("ucbsinit");
    }

    private b.a i() {
        String th;
        String str;
        String str2;
        String str3 = null;
        if (TextUtils.isEmpty(this.g)) {
            str = f;
            str2 = "buildLogInfo invalid type";
        } else {
            UCKnownException uCKnownException = this.e;
            if (uCKnownException == null) {
                j jVar = this.d;
                uCKnownException = (jVar == null || jVar.failedInfo() == null) ? null : this.d.failedInfo().exception();
            }
            if (uCKnownException != null) {
                Throwable rootCause = uCKnownException.getRootCause();
                b.a aVar = new b.a(this.g, rootCause);
                ICoreVersion iCoreVersion = ICoreVersion.Instance.get();
                if (iCoreVersion != null) {
                    aVar.a("coreVersion", iCoreVersion.version()).a("coreTimestamp", iCoreVersion.buildTimestamp());
                }
                int errCode = uCKnownException.errCode();
                String errMsg = uCKnownException.errMsg();
                if (rootCause instanceof UCKnownException) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(errCode);
                    if (!TextUtils.isEmpty(uCKnownException.errCodeDescription())) {
                        sb.append(":");
                        sb.append(uCKnownException.errCodeDescription());
                    }
                    if (!TextUtils.isEmpty(errMsg)) {
                        sb.append(":");
                        sb.append(errMsg);
                    }
                    th = sb.toString();
                    aVar.a("stackFunc", th);
                } else {
                    th = rootCause.toString();
                }
                aVar.a("ucbsVersion", Build.Version.NAME).a("supportMin", Build.Version.SUPPORT_U4_MIN).a("apiLevel", String.valueOf(Build.Version.API_LEVEL)).a("errorCode", String.valueOf(errCode)).a("errorMessage", errMsg).a("k_reason", th);
                if (!ErrorCode.COMPATIABLE_NOT_SUPPORT_ARCH.equals(errCode)) {
                    k kVar = this.c;
                    String str4 = "null";
                    b.a b = aVar.b("setupConfigs", kVar != null ? kVar.toString() : str4);
                    j jVar2 = this.d;
                    if (jVar2 != null) {
                        str4 = jVar2.toString();
                    }
                    b.b("runningCore", str4).b("rootDirFiles", com.uc.webview.base.io.d.a(EnvInfo.getContext()));
                    j jVar3 = this.d;
                    if (jVar3 != null) {
                        str3 = a(jVar3.coreClassLoader());
                    }
                    if (!TextUtils.isEmpty(str3)) {
                        aVar.b("nativeLibsInfo", str3);
                    }
                    if (PathUtils.f23784a != null) {
                        aVar.b("namesMap", PathUtils.f23784a.toString());
                    }
                }
                StringBuilder sb2 = new StringBuilder();
                try {
                    Log.a(sb2);
                } catch (Throwable th2) {
                    sb2.append("flushCachedLogs failed:" + Log.a(th2));
                }
                aVar.b("init logs", sb2.toString());
                return aVar;
            }
            str = f;
            str2 = "buildLogInfo invalid exception";
        }
        Log.w(str, str2);
        return null;
    }

    @Override // com.uc.webview.base.task.c
    public final com.uc.webview.base.task.c a() {
        return a(1000L);
    }

    @Override // com.uc.webview.base.task.c, java.util.concurrent.Callable
    public final /* synthetic */ c.C1036c call() throws Exception {
        return super.call();
    }

    @Override // com.uc.webview.base.task.c
    public final void d() {
        b.a i = i();
        if (i != null) {
            com.uc.webview.base.b.a(i);
        }
    }

    @Override // com.uc.webview.base.task.c
    public final String e() {
        return f;
    }

    @Override // com.uc.webview.base.task.c
    public final int f() {
        return StartupTimingKeys.FAILURE_REPORTER;
    }
}
