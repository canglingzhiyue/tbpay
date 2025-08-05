package com.taobao.android.remoteso.tbadapter.ext;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.remoteso.api.RSoException;
import com.taobao.android.remoteso.log.RSoLog;
import tb.iij;
import tb.iik;
import tb.iim;
import tb.iin;
import tb.kml;
import tb.kmm;
import tb.kmo;
import tb.kmq;

/* loaded from: classes6.dex */
public class d implements iik {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // tb.iik
    public iin a(iim iimVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (iin) ipChange.ipc$dispatch("5c04722d", new Object[]{this, iimVar});
        }
        RSoLog.d(iimVar.d() + " -- start Download Task request=" + iimVar);
        kmm kmmVar = new kmm();
        kmmVar.b.h = iimVar.c();
        kmmVar.b.f30169a = iimVar.h() ? "remoteso_preload" : "remoteso";
        kmo kmoVar = new kmo();
        kmoVar.f30167a = iimVar.b();
        kmoVar.c = iimVar.f();
        kmoVar.d = iimVar.d();
        long g = iimVar.g();
        if (g >= 0) {
            kmoVar.b = g;
        }
        kmmVar.f30166a.add(kmoVar);
        return new iin(iimVar, Integer.valueOf(com.taobao.downloader.b.a().a(kmmVar, new a(iimVar))));
    }

    @Override // tb.iik
    public void a(iin iinVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("edbc6cca", new Object[]{this, iinVar});
        } else {
            com.taobao.downloader.b.a().c(b(iinVar));
        }
    }

    private int b(iin iinVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("dc3f733e", new Object[]{this, iinVar})).intValue();
        }
        Object b = iinVar.b();
        if (b instanceof Integer) {
            int intValue = ((Integer) b).intValue();
            if (intValue == -100) {
                throw new RuntimeException("taskDesc == DownloadErrorCode.ERROR_PARAM, it should be taskId");
            }
            return intValue;
        }
        throw new RuntimeException("taskDesc is not an integer, it should be taobao downloader taskId");
    }

    /* loaded from: classes6.dex */
    public static class a implements kml {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private boolean f14858a = false;
        private final iim b;

        public a(iim iimVar) {
            this.b = iimVar;
        }

        @Override // tb.kml
        public void onDownloadProgress(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("49af8908", new Object[]{this, new Integer(i)});
                return;
            }
            if (i % 5 == 0) {
                RSoLog.d(this.b.d() + " -- onDownloadProgress  progress=" + i);
            }
            this.b.i().a(this.b, i);
        }

        @Override // tb.kml
        public void onDownloadError(String str, int i, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cc722e3b", new Object[]{this, str, new Integer(i), str2});
                return;
            }
            RSoLog.d(this.b.d() + " -- onDownloadError  url=" + str + ", errorCode=" + i + ", msg = " + str2);
            iij i2 = this.b.i();
            iim iimVar = this.b;
            i2.a(iimVar, RSoException.error(3001, i + ":" + str2 + "->" + str));
        }

        @Override // tb.kml
        public void onDownloadFinish(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("43d7a315", new Object[]{this, str, str2});
                return;
            }
            RSoLog.d(this.b.d() + " -- onDownloadFinish  url=" + str + ", filePath" + str2);
            this.b.i().a(this.b, (RSoException) null);
        }

        @Override // tb.kml
        public void onDownloadStateChange(String str, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("98fdb789", new Object[]{this, str, new Boolean(z)});
            } else if (!z || this.f14858a) {
            } else {
                this.f14858a = true;
                RSoLog.c(this.b.d() + " -- onDownloadBegin  url=" + str);
                this.b.i().a(this.b);
            }
        }

        @Override // tb.kml
        public void onFinish(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6a109f1b", new Object[]{this, new Boolean(z)});
                return;
            }
            RSoLog.c(this.b.d() + " -- onFinish  allSuccess=" + z);
        }

        @Override // tb.kml
        public void onNetworkLimit(int i, kmq kmqVar, kml.a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6919023a", new Object[]{this, new Integer(i), kmqVar, aVar});
                return;
            }
            RSoLog.c(this.b.d() + " -- onNetworkLimit  netType=" + i);
        }
    }
}
