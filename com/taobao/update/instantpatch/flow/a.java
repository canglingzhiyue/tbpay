package com.taobao.update.instantpatch.flow;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.update.instantpatch.d;
import com.taobao.update.instantpatch.model.InstantUpdateInfo;
import java.io.File;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import tb.kge;
import tb.kml;
import tb.kmm;
import tb.kmo;
import tb.kmq;
import tb.rfx;
import tb.rgp;

/* loaded from: classes9.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private d f23435a;

    static {
        kge.a(350201873);
    }

    public static /* synthetic */ d a(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (d) ipChange.ipc$dispatch("41bbe6d2", new Object[]{aVar}) : aVar.f23435a;
    }

    public a(d dVar) {
        this.f23435a = dVar;
    }

    public void download(InstantUpdateInfo instantUpdateInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f66b21e1", new Object[]{this, instantUpdateInfo});
            return;
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        kmm kmmVar = new kmm();
        kmo kmoVar = new kmo(instantUpdateInfo.patchUrl);
        kmoVar.c = instantUpdateInfo.md5;
        kmoVar.b = Long.valueOf(instantUpdateInfo.size).longValue();
        kmq kmqVar = new kmq();
        kmqVar.h = this.f23435a.getPatchPath();
        kmqVar.f30169a = rfx.HOTPATCH;
        kmqVar.c = 20;
        kmmVar.b = kmqVar;
        kmmVar.f30166a = new ArrayList();
        kmmVar.f30166a.add(kmoVar);
        com.taobao.downloader.b.a().a(kmmVar, new C1010a(countDownLatch));
        try {
            countDownLatch.await();
            if (this.f23435a.success && !rgp.isMd5Same(instantUpdateInfo.md5, this.f23435a.path)) {
                this.f23435a.success = false;
                this.f23435a.errorMsg = "download fail: md5 mismatch";
            }
        } catch (Throwable th) {
            th.printStackTrace();
            d dVar = this.f23435a;
            dVar.success = false;
            dVar.errorMsg = th.getMessage();
        }
        if (!StringUtils.isEmpty(this.f23435a.path) && new File(this.f23435a.path).exists()) {
            return;
        }
        d dVar2 = this.f23435a;
        dVar2.success = false;
        dVar2.errorMsg = "download fail";
    }

    /* renamed from: com.taobao.update.instantpatch.flow.a$a  reason: collision with other inner class name */
    /* loaded from: classes9.dex */
    public class C1010a implements kml {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public CountDownLatch f23436a;

        static {
            kge.a(-1485618845);
            kge.a(1882102659);
        }

        @Override // tb.kml
        public void onDownloadProgress(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("49af8908", new Object[]{this, new Integer(i)});
            }
        }

        @Override // tb.kml
        public void onDownloadStateChange(String str, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("98fdb789", new Object[]{this, str, new Boolean(z)});
            }
        }

        @Override // tb.kml
        public void onNetworkLimit(int i, kmq kmqVar, kml.a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6919023a", new Object[]{this, new Integer(i), kmqVar, aVar});
            }
        }

        private C1010a(CountDownLatch countDownLatch) {
            this.f23436a = countDownLatch;
        }

        @Override // tb.kml
        public void onDownloadError(String str, int i, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cc722e3b", new Object[]{this, str, new Integer(i), str2});
                return;
            }
            a.a(a.this).success = false;
            a.a(a.this).errorMsg = str2;
            a.a(a.this).errorCode = i;
            CountDownLatch countDownLatch = this.f23436a;
            if (countDownLatch == null) {
                return;
            }
            countDownLatch.countDown();
        }

        @Override // tb.kml
        public void onDownloadFinish(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("43d7a315", new Object[]{this, str, str2});
            } else {
                a.a(a.this).path = str2;
            }
        }

        @Override // tb.kml
        public void onFinish(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6a109f1b", new Object[]{this, new Boolean(z)});
                return;
            }
            CountDownLatch countDownLatch = this.f23436a;
            if (countDownLatch != null) {
                countDownLatch.countDown();
            }
            a.a(a.this).success = z;
        }
    }
}
