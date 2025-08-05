package com.taobao.android.remoteso.resolver2;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.remoteso.api.RSoException;
import com.taobao.android.remoteso.index.SoIndexData;
import com.taobao.android.remoteso.log.RSoLog;
import com.taobao.android.remoteso.resolver2.RemoteResolver;
import com.taobao.android.remoteso.resolver2.c;
import java.io.File;
import tb.iii;
import tb.iim;
import tb.iio;
import tb.iit;
import tb.ijd;
import tb.iju;
import tb.ijv;
import tb.ika;
import tb.ikq;
import tb.ikw;

/* loaded from: classes.dex */
public class i {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final iju f14834a;
    private final iio b;
    private final ijv c;
    private final iit d;
    private final ijd e;

    public static /* synthetic */ void a(i iVar, j jVar, RemoteResolver.RemoteAdvancedInfo remoteAdvancedInfo, c.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1499855", new Object[]{iVar, jVar, remoteAdvancedInfo, aVar});
        } else {
            iVar.b(jVar, remoteAdvancedInfo, aVar);
        }
    }

    public static /* synthetic */ void a(i iVar, j jVar, c.a aVar, RSoException rSoException) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90aa6a96", new Object[]{iVar, jVar, aVar, rSoException});
        } else {
            iVar.a(jVar, aVar, rSoException);
        }
    }

    public static /* synthetic */ void a(i iVar, iim iimVar, RSoException rSoException, j jVar, c.a aVar, File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4c50a90", new Object[]{iVar, iimVar, rSoException, jVar, aVar, file});
        } else {
            iVar.a(iimVar, rSoException, jVar, aVar, file);
        }
    }

    public i(iju ijuVar, iio iioVar, ijv ijvVar, iit iitVar, ijd ijdVar) {
        this.f14834a = ijuVar;
        this.b = iioVar;
        this.c = ijvVar;
        this.d = iitVar;
        this.e = ijdVar;
    }

    public void a(final j jVar, final RemoteResolver.RemoteAdvancedInfo remoteAdvancedInfo, final c.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a902abba", new Object[]{this, jVar, remoteAdvancedInfo, aVar});
        } else if (this.e.a("switch_diff_patch_disabled", false)) {
            ikq.a("diff-patch, switch off", "switch force disable diff patch , libName=" + jVar.a());
            a(jVar, aVar, RSoException.error(6202, "switch off"));
        } else {
            ika.a(new Runnable() { // from class: com.taobao.android.remoteso.resolver2.i.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        i.a(i.this, jVar, remoteAdvancedInfo, aVar);
                    } catch (Throwable th) {
                        ikq.a("diff-patch, error", th);
                        i.a(i.this, jVar, aVar, RSoException.error(6203, th));
                    }
                }
            });
        }
    }

    private void b(final j jVar, RemoteResolver.RemoteAdvancedInfo remoteAdvancedInfo, final c.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba017fd9", new Object[]{this, jVar, remoteAdvancedInfo, aVar});
            return;
        }
        RSoLog.c("RemoteDiffPatchResolver -> start resolve by diff patch , lib=" + jVar.a());
        SoIndexData.SoFileInfo soFileInfo = remoteAdvancedInfo.diffBase;
        SoIndexData.SoFileInfo soFileInfo2 = remoteAdvancedInfo.diffPatch;
        if (soFileInfo == null || soFileInfo2 == null) {
            a(jVar, aVar, RSoException.error(6208, "diffBase == null || patchInfo == null"));
            return;
        }
        String a2 = jVar.a();
        final File a3 = l.a(a2, jVar.f(), soFileInfo, this.c);
        if (a3 == null) {
            a(jVar, aVar, RSoException.error(6204, "base file not found"));
        } else {
            this.b.a(l.a(a2, soFileInfo2, jVar.g(), this.c), new iii() { // from class: com.taobao.android.remoteso.resolver2.i.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(AnonymousClass2 anonymousClass2, String str, Object... objArr) {
                    if (str.hashCode() == -1145182134) {
                        super.a((iim) objArr[0], (RSoException) objArr[1]);
                        return null;
                    }
                    throw new InstantReloadException(String.format("String switch could not find '%s'", str));
                }

                @Override // tb.iii, tb.iij
                public void a(iim iimVar, RSoException rSoException) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("bbbde84a", new Object[]{this, iimVar, rSoException});
                        return;
                    }
                    super.a(iimVar, rSoException);
                    try {
                        i.a(i.this, iimVar, rSoException, jVar, aVar, a3);
                    } catch (Throwable th) {
                        i.a(i.this, jVar, aVar, RSoException.error(6210, th));
                    }
                }
            });
        }
    }

    private void a(iim iimVar, RSoException rSoException, j jVar, c.a aVar, File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f8cac0b", new Object[]{this, iimVar, rSoException, jVar, aVar, file});
            return;
        }
        String a2 = jVar.a();
        String e = iimVar.e();
        if (rSoException != null || ikw.a((CharSequence) e)) {
            a(jVar, aVar, RSoException.error(6205, "patch file not found"));
            return;
        }
        File file2 = new File(e);
        if (!file2.isFile()) {
            a(jVar, aVar, RSoException.error(6205, "patch file not found"));
            return;
        }
        File file3 = new File(this.c.a(jVar.i(), jVar.e().provideStorageKey()));
        iit.a a3 = this.d.a(this.f14834a.a(), file, file2, file3);
        if (!a3.f29060a) {
            a(jVar, aVar, RSoException.error(6206, "patchSuccess = false, resultCode = " + a3.b));
        } else if (!this.f14834a.a(jVar.c(), file3.getPath())) {
            a(jVar, aVar, RSoException.error(6207, "newLibFile md5 not match, newLibFile.length = " + file3.length() + "newLibFile.path = " + file3.getPath()));
        } else {
            RSoLog.c("RemoteDiffPatchResolver -> resolve successfully from diff patch , lib=" + a2);
            aVar.a(k.a(jVar, file3.getPath(), "diff-patch"));
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
