package com.taobao.android.remoteso.resolver2;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.remoteso.api.RSoException;
import com.taobao.android.remoteso.index.SoIndexData;
import com.taobao.android.remoteso.log.RSoLog;
import com.taobao.android.remoteso.resolver2.RemoteResolver;
import com.taobao.android.remoteso.resolver2.c;
import java.io.File;
import tb.iit;
import tb.ijd;
import tb.iju;
import tb.ijv;
import tb.ika;
import tb.ikq;
import tb.ikt;

/* loaded from: classes6.dex */
public class e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final iju f14825a;
    private final ijv b;
    private final iit c;
    private final ijd d;

    public static /* synthetic */ void a(e eVar, j jVar, RemoteResolver.RemoteAdvancedInfo remoteAdvancedInfo, c.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9eee851", new Object[]{eVar, jVar, remoteAdvancedInfo, aVar});
        } else {
            eVar.b(jVar, remoteAdvancedInfo, aVar);
        }
    }

    public static /* synthetic */ void a(e eVar, j jVar, c.a aVar, RSoException rSoException) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("517ac81a", new Object[]{eVar, jVar, aVar, rSoException});
        } else {
            eVar.a(jVar, aVar, rSoException);
        }
    }

    public e(iju ijuVar, ijv ijvVar, iit iitVar, ijd ijdVar) {
        this.f14825a = ijuVar;
        this.b = ijvVar;
        this.c = iitVar;
        this.d = ijdVar;
    }

    public void a(final j jVar, final RemoteResolver.RemoteAdvancedInfo remoteAdvancedInfo, final c.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a902abba", new Object[]{this, jVar, remoteAdvancedInfo, aVar});
        } else if (this.d.a("switch_diff_patch_disabled", false)) {
            ikq.a("diff-patch, switch off", "switch force disable diff patch , libName=" + jVar.a());
            a(jVar, aVar, RSoException.error(6202, "switch off"));
        } else {
            ika.a(new Runnable() { // from class: com.taobao.android.remoteso.resolver2.e.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        e.a(e.this, jVar, remoteAdvancedInfo, aVar);
                    } catch (Throwable th) {
                        ikq.a("diff-patch, error", th);
                        e.a(e.this, jVar, aVar, RSoException.error(6203, th));
                    }
                }
            });
        }
    }

    private void b(j jVar, RemoteResolver.RemoteAdvancedInfo remoteAdvancedInfo, c.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba017fd9", new Object[]{this, jVar, remoteAdvancedInfo, aVar});
            return;
        }
        RSoLog.c("InApkDiffPatchResolver -> start resolve by diff patch , lib=" + jVar.a());
        SoIndexData.SoFileInfo soFileInfo = remoteAdvancedInfo.diffBase;
        SoIndexData.SoFileInfo soFileInfo2 = remoteAdvancedInfo.diffPatch;
        if (soFileInfo == null || soFileInfo2 == null) {
            a(jVar, aVar, RSoException.error(6208, "diffBase == null || patchInfo == null"));
            return;
        }
        String a2 = jVar.a();
        File a3 = l.a(a2, jVar.f(), soFileInfo, this.b);
        if (a3 == null) {
            a(jVar, aVar, RSoException.error(6204, "base file not found"));
            return;
        }
        RSoLog.c("InApkDiffPatchResolver -> found baseFile, " + a3);
        File a4 = a(a2, soFileInfo2);
        if (a4 == null) {
            a(jVar, aVar, RSoException.error(6205, "patch file not found"));
            return;
        }
        RSoLog.c("InApkDiffPatchResolver -> found patchFile, " + a4);
        File file = new File(this.b.a(jVar.i(), jVar.e().provideStorageKey()));
        RSoLog.c("InApkDiffPatchResolver -> do apply patch to newLibFile, " + file);
        iit.a a5 = this.c.a(this.f14825a.a(), a3, a4, file);
        if (!a5.f29060a) {
            throw RSoException.error(6206, "patchSuccess = false, resultCode = " + a5.b);
        } else if (!this.f14825a.a(jVar.c(), file.getPath())) {
            throw RSoException.error(6207, "newLibFile md5 not match, newLibFile.length = " + file.length() + "newLibFile.path = " + file.getPath());
        } else {
            RSoLog.c("InApkDiffPatchResolver -> resolve successfully from diff patch , lib=" + a2);
            aVar.a(k.a(jVar, file.getPath(), "diff-patch"));
        }
    }

    private File a(String str, SoIndexData.SoFileInfo soFileInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("4ed8f14d", new Object[]{this, str, soFileInfo});
        }
        String uri = soFileInfo.getUri();
        String a2 = this.b.a(soFileInfo.provideStorageKey());
        File file = new File(a2, "tmp-diff/" + str + ".patch");
        if (!ikt.a(this.f14825a.a(), uri, file)) {
            ikq.a("diff-patch, copyPatchFileResult = false", "");
            return null;
        } else if (!file.isFile()) {
            ikq.a("diff-patch, patchFile.isFile = false", "");
            return null;
        } else if (this.f14825a.a(soFileInfo.getMd5(), file.getPath())) {
            return file;
        } else {
            ikq.a("diff-patch, patchFile md5 not match", "");
            return null;
        }
    }

    private void a(j jVar, c.a aVar, RSoException rSoException) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6be45a51", new Object[]{this, jVar, aVar, rSoException});
        } else {
            aVar.a(k.a(jVar, "diff-patch", rSoException));
        }
    }
}
