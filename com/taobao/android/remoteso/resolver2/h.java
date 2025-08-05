package com.taobao.android.remoteso.resolver2;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.remoteso.api.RSoException;
import com.taobao.android.remoteso.index.SoIndexData;
import com.taobao.android.remoteso.log.RSoLog;
import com.taobao.android.remoteso.resolver2.RemoteResolver;
import com.taobao.android.remoteso.resolver2.c;
import tb.iii;
import tb.iim;
import tb.iio;
import tb.iir;
import tb.iis;
import tb.ijd;
import tb.ijv;
import tb.ikq;
import tb.ikw;

/* loaded from: classes.dex */
public class h {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final ijd f14831a;
    private final iio b;
    private final iis c;
    private final ijv d;

    public static /* synthetic */ void a(h hVar, j jVar, SoIndexData.SoFileInfo soFileInfo, c.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("712d258a", new Object[]{hVar, jVar, soFileInfo, aVar});
        } else {
            hVar.a(jVar, soFileInfo, aVar);
        }
    }

    public static /* synthetic */ void a(h hVar, j jVar, c.a aVar, RSoException rSoException) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40de81f7", new Object[]{hVar, jVar, aVar, rSoException});
        } else {
            hVar.a(jVar, aVar, rSoException);
        }
    }

    public h(ijd ijdVar, iio iioVar, iis iisVar, ijv ijvVar) {
        this.f14831a = ijdVar;
        this.b = iioVar;
        this.c = iisVar;
        this.d = ijvVar;
    }

    public void a(j jVar, RemoteResolver.RemoteAdvancedInfo remoteAdvancedInfo, c.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a902abba", new Object[]{this, jVar, remoteAdvancedInfo, aVar});
        } else if (this.f14831a.a("switch_compressed_remote_disabled", false)) {
            ikq.a("RemoteCompressedResolver -> ", "switch force disable diff patch , libName=" + jVar.a());
            a(jVar, aVar, RSoException.error(6102, "switch off"));
        } else {
            b(jVar, remoteAdvancedInfo, aVar);
        }
    }

    private void b(final j jVar, RemoteResolver.RemoteAdvancedInfo remoteAdvancedInfo, final c.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba017fd9", new Object[]{this, jVar, remoteAdvancedInfo, aVar});
            return;
        }
        SoIndexData.SoFileInfo soFileInfo = remoteAdvancedInfo.compressedRemote;
        final SoIndexData.SoFileInfo soFileInfo2 = remoteAdvancedInfo.compressedLocal;
        if (soFileInfo == null || soFileInfo2 == null) {
            ikq.a("RemoteCompressedResolver -> info == null", "downloadSoInfo == null || extractSoInfo == null");
            a(jVar, aVar, RSoException.error(6103, "illegal arguments"));
            return;
        }
        final String a2 = jVar.a();
        this.b.a(l.a(a2, soFileInfo, jVar.g(), this.d), new iii() { // from class: com.taobao.android.remoteso.resolver2.h.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass1 anonymousClass1, String str, Object... objArr) {
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
                if (rSoException != null) {
                    h.a(h.this, jVar, aVar, rSoException);
                    return;
                }
                String e = iimVar.e();
                if (!ikw.a((CharSequence) e)) {
                    RSoLog.c("RemoteCompressedResolver -> resolve successfully from [downloader in diff patch] , lib=" + a2);
                    soFileInfo2.setUri(e);
                    h.a(h.this, jVar, soFileInfo2, aVar);
                    return;
                }
                RSoLog.c("RemoteCompressedResolver -> download file path is empty , lib=" + a2);
                RSoException error = RSoException.error(5004);
                h.a(h.this, jVar, aVar, error);
                ikq.a("download-extract,error", error);
            }
        });
    }

    private void a(final j jVar, SoIndexData.SoFileInfo soFileInfo, final c.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a43f46e4", new Object[]{this, jVar, soFileInfo, aVar});
            return;
        }
        final String a2 = jVar.a();
        this.c.a(a2, jVar.i(), this.d.a(jVar.e().provideStorageKey()), soFileInfo, new iis.a() { // from class: com.taobao.android.remoteso.resolver2.h.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.iis.a
            public void a(iir iirVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("edbe3e46", new Object[]{this, iirVar});
                    return;
                }
                String c = iirVar.c();
                RSoException f = iirVar.f();
                if (f != null) {
                    h.a(h.this, jVar, aVar, f);
                } else if (!ikw.a((CharSequence) c)) {
                    aVar.a(k.a(jVar, c, "download-extract"));
                } else {
                    RSoLog.c("RemoteCompressedResolver -> extractedPath is empty , lib=" + a2);
                    RSoException error = RSoException.error(5004);
                    h.a(h.this, jVar, aVar, error);
                    ikq.a("download-extract,extract,error", error);
                }
            }
        });
    }

    private void a(j jVar, c.a aVar, RSoException rSoException) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6be45a51", new Object[]{this, jVar, aVar, rSoException});
            return;
        }
        jVar.a();
        aVar.a(k.a(jVar, "download-extract", rSoException));
    }
}
