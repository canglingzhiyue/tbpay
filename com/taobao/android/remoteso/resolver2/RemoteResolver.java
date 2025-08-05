package com.taobao.android.remoteso.resolver2;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.remoteso.api.RSoException;
import com.taobao.android.remoteso.index.SoIndexData;
import com.taobao.android.remoteso.index.SoInfo2;
import com.taobao.android.remoteso.log.RSoLog;
import com.taobao.android.remoteso.resolver2.c;
import tb.iii;
import tb.iim;
import tb.iio;
import tb.ijd;
import tb.ijv;
import tb.ikq;
import tb.ikw;

/* loaded from: classes.dex */
public class RemoteResolver implements c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final ijd f14817a;
    private final ijv b;
    private final iio c;
    private final e d;
    private final i e;
    private final h f;

    /* loaded from: classes6.dex */
    public static class RemoteAdvancedInfo {
        public SoIndexData.SoFileInfo compressedLocal;
        public SoIndexData.SoFileInfo compressedRemote;
        public SoIndexData.SoFileInfo diffBase;
        public SoIndexData.SoFileInfo diffPatch;
    }

    @Override // com.taobao.android.remoteso.resolver2.c
    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : "Remote";
    }

    public static /* synthetic */ void a(RemoteResolver remoteResolver, j jVar, SoInfo2.Ext ext, RemoteAdvancedInfo remoteAdvancedInfo, c.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a563ce1b", new Object[]{remoteResolver, jVar, ext, remoteAdvancedInfo, aVar});
        } else {
            remoteResolver.b(jVar, ext, remoteAdvancedInfo, aVar);
        }
    }

    public static /* synthetic */ void a(RemoteResolver remoteResolver, j jVar, c.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("95060a98", new Object[]{remoteResolver, jVar, aVar});
        } else {
            remoteResolver.b(jVar, aVar);
        }
    }

    public RemoteResolver(ijd ijdVar, ijv ijvVar, iio iioVar, e eVar, i iVar, h hVar) {
        this.f14817a = ijdVar;
        this.b = ijvVar;
        this.c = iioVar;
        this.d = eVar;
        this.e = iVar;
        this.f = hVar;
    }

    @Override // com.taobao.android.remoteso.resolver2.c
    public void a(j jVar, c.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1d284eb2", new Object[]{this, jVar, aVar});
            return;
        }
        jVar.a();
        if (l.a(this.f14817a, jVar, aVar)) {
            return;
        }
        if (this.f14817a.a("switch_force_disable_advanced", false)) {
            ikq.a("RemoteResolver -> ", "SWITCH_FORCE_DISABLE_ADVANCED=true , libName=" + jVar.a());
            b(jVar, aVar);
            return;
        }
        SoInfo2 f = jVar.f();
        if (f == null) {
            RSoLog.c("RemoteResolver -> fallback raw download, soInfo2 == null");
            b(jVar, aVar);
            return;
        }
        RemoteAdvancedInfo a2 = l.a(f);
        if (a2 == null) {
            RSoLog.c("RemoteResolver -> fallback raw download, advancedInfo == null");
            b(jVar, aVar);
            return;
        }
        try {
            a(jVar, f.ext, a2, aVar);
        } catch (Throwable th) {
            ikq.a("RemoteResolver -> tryRemoteDiffPatchResolve error", th);
            b(jVar, aVar);
        }
    }

    private void a(final j jVar, final SoInfo2.Ext ext, final RemoteAdvancedInfo remoteAdvancedInfo, final c.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7f52c35", new Object[]{this, jVar, ext, remoteAdvancedInfo, aVar});
            return;
        }
        RSoLog.c("RemoteResolver -> tryRemoteDiffPatchResolve start, lib=" + jVar.a());
        c.a aVar2 = new c.a() { // from class: com.taobao.android.remoteso.resolver2.RemoteResolver.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.remoteso.resolver2.c.a
            public void a(k kVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("bc3202ab", new Object[]{this, kVar});
                    return;
                }
                String c = kVar.c();
                if (kVar.e() != null || ikw.a((CharSequence) c)) {
                    RSoLog.c("RemoteResolver -> remoteDiffPatch failed, will tryRemoteCompressedResolve");
                    RemoteResolver.a(RemoteResolver.this, jVar, ext, remoteAdvancedInfo, aVar);
                    return;
                }
                RSoLog.c("RemoteResolver -> tryRemoteDiffPatchResolve complete, lib=" + jVar.a());
                aVar.a(kVar);
            }
        };
        if (ext.remoteDiffPatch) {
            this.e.a(jVar, remoteAdvancedInfo, aVar2);
        } else if (ext.inApkDiffPatch) {
            this.d.a(jVar, remoteAdvancedInfo, aVar2);
        } else {
            RSoLog.c("RemoteResolver -> skip diff patch;  ext.remoteDiffPatch == false, lib=" + jVar.a());
            b(jVar, ext, remoteAdvancedInfo, aVar);
        }
    }

    private void b(final j jVar, SoInfo2.Ext ext, RemoteAdvancedInfo remoteAdvancedInfo, final c.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30cd7236", new Object[]{this, jVar, ext, remoteAdvancedInfo, aVar});
        } else if (!ext.remoteCompressed) {
            RSoLog.c("RemoteResolver -> skip remote compressed;  ext.remoteCompressed == false, lib=" + jVar.a());
            b(jVar, aVar);
        } else {
            RSoLog.c("RemoteResolver -> tryRemoteCompressedResolve start, lib=" + jVar.a());
            this.f.a(jVar, remoteAdvancedInfo, new c.a() { // from class: com.taobao.android.remoteso.resolver2.RemoteResolver.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.remoteso.resolver2.c.a
                public void a(k kVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("bc3202ab", new Object[]{this, kVar});
                        return;
                    }
                    String c = kVar.c();
                    if (kVar.e() != null || ikw.a((CharSequence) c)) {
                        RSoLog.c("RemoteResolver -> remoteCompressed failed, will doRawDownload");
                        RemoteResolver.a(RemoteResolver.this, jVar, aVar);
                        return;
                    }
                    RSoLog.c("RemoteResolver -> tryRemoteCompressedResolve complete, lib=" + jVar.a());
                    aVar.a(kVar);
                }
            });
        }
    }

    private void b(final j jVar, final c.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63013b3", new Object[]{this, jVar, aVar});
            return;
        }
        final String a2 = jVar.a();
        this.c.a(l.a(a2, jVar.e(), jVar.g(), this.b), new iii() { // from class: com.taobao.android.remoteso.resolver2.RemoteResolver.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass3 anonymousClass3, String str, Object... objArr) {
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
                if (rSoException == null) {
                    RSoLog.c("download -> resolve successfully , lib=" + a2);
                    aVar.a(k.a(jVar, iimVar.e(), "download"));
                    return;
                }
                RSoLog.c("download -> resolve failed , lib=" + a2);
                aVar.a(k.a(jVar, "download", rSoException));
            }
        });
    }
}
