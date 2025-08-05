package com.taobao.android.remoteso.resolver2;

import android.app.Application;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.remoteso.api.RSoException;
import com.taobao.android.remoteso.config.RSoConfig;
import com.taobao.android.remoteso.log.RSoLog;
import com.taobao.android.remoteso.resolver2.c;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import tb.iju;
import tb.ijv;
import tb.ika;
import tb.iku;
import tb.ikw;
import tb.iky;

/* loaded from: classes.dex */
public class f implements c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final iju f14827a;
    private final ijv b;

    @Override // com.taobao.android.remoteso.resolver2.c
    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : "InApk";
    }

    public static /* synthetic */ String a(f fVar, j jVar) throws IOException {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("62bfc63c", new Object[]{fVar, jVar}) : fVar.a(jVar);
    }

    public f(iju ijuVar, ijv ijvVar) {
        this.f14827a = ijuVar;
        this.b = ijvVar;
    }

    @Override // com.taobao.android.remoteso.resolver2.c
    public void a(final j jVar, final c.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1d284eb2", new Object[]{this, jVar, aVar});
        } else {
            ika.a(new Runnable() { // from class: com.taobao.android.remoteso.resolver2.f.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        aVar.a(k.a(jVar, f.a(f.this, jVar), RSoConfig.TYPE_INAPK));
                    } catch (Throwable th) {
                        aVar.a(k.a(jVar, RSoConfig.TYPE_INAPK, RSoException.error(5006, th)));
                    }
                }
            });
        }
    }

    private String a(j jVar) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9be547d4", new Object[]{this, jVar});
        }
        RSoLog.c("InApkSoResolver -> resolve(), - start ");
        Application a2 = this.f14827a.a();
        String str = a2.getApplicationInfo().nativeLibraryDir + File.separator + jVar.d();
        String a3 = this.b.a(jVar.i(), jVar.e().provideStorageKey());
        if (ikw.a((CharSequence) a3)) {
            throw new NullPointerException("InApkSoResolver -> resolve(), targetSoFilePath == null");
        }
        FileInputStream fileInputStream = new FileInputStream(str);
        try {
            String str2 = a3 + ".tmp";
            File file = new File(str2);
            iku.a(fileInputStream, file);
            if (!this.f14827a.a(jVar.c(), str2)) {
                throw new RuntimeException("md5 not matched, delete=" + iky.a(file));
            }
            File file2 = new File(a3);
            if (!file.renameTo(file2)) {
                throw new RuntimeException("rename failed,  from=" + file + ", to=" + file2);
            }
            RSoLog.c("InApkSoResolver -> resolve(), success, soPathInApk=" + str + ", tmpFilePath=" + str2 + ", targetSoFilePath=" + a3);
            fileInputStream.close();
            return a3;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                if (th != null) {
                    try {
                        fileInputStream.close();
                    } catch (Throwable th3) {
                        th.addSuppressed(th3);
                    }
                } else {
                    fileInputStream.close();
                }
                throw th2;
            }
        }
    }
}
