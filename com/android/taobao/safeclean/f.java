package com.android.taobao.safeclean;

import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import tb.kge;
import tb.kml;
import tb.kmm;
import tb.kmo;
import tb.kmq;

/* loaded from: classes3.dex */
public class f {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final f f6398a;

    static {
        kge.a(555108998);
        f6398a = new f();
    }

    private f() {
    }

    public static f a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (f) ipChange.ipc$dispatch("a9a5709d", new Object[0]) : f6398a;
    }

    public void a(List<e> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
            return;
        }
        CountDownLatch countDownLatch = new CountDownLatch(list.size());
        kmm kmmVar = new kmm();
        for (e eVar : list) {
            kmo kmoVar = new kmo(eVar.f6397a);
            kmoVar.c = eVar.c;
            kmoVar.b = Long.valueOf(eVar.b).longValue();
            kmq kmqVar = new kmq();
            kmqVar.h = eVar.g;
            kmqVar.f30169a = "AdditionFile";
            kmqVar.c = 10;
            kmmVar.b = kmqVar;
            kmmVar.f30166a = new ArrayList();
            kmmVar.f30166a.add(kmoVar);
            com.taobao.downloader.b.a().a(kmmVar, new a(countDownLatch, eVar));
        }
        try {
            countDownLatch.await();
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* loaded from: classes3.dex */
    public class a implements kml {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public CountDownLatch f6399a;
        private e c;

        static {
            kge.a(-870631005);
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

        private a(CountDownLatch countDownLatch, e eVar) {
            this.f6399a = countDownLatch;
            this.c = eVar;
        }

        @Override // tb.kml
        public void onDownloadError(String str, int i, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cc722e3b", new Object[]{this, str, new Integer(i), str2});
                return;
            }
            e eVar = this.c;
            eVar.d = false;
            eVar.f = str2;
            eVar.e = i;
            CountDownLatch countDownLatch = this.f6399a;
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
                return;
            }
            if (!new File(this.c.g, this.c.h).exists()) {
                Log.e("SimpleAdditioner", "download finish:" + str2);
                if (new File(str2).exists()) {
                    new File(str2).renameTo(new File(this.c.g, this.c.h));
                    Log.e("SimpleAdditioner", "renameTo sucess:" + new File(this.c.g, this.c.h).getPath());
                }
            }
            if (new File(this.c.g, this.c.h).exists()) {
                return;
            }
            e eVar = this.c;
            eVar.d = false;
            eVar.f = "download fail";
        }

        @Override // tb.kml
        public void onFinish(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6a109f1b", new Object[]{this, new Boolean(z)});
                return;
            }
            Log.e("SimpleAdditioner", "download finish:" + z);
            this.c.d = z;
            CountDownLatch countDownLatch = this.f6399a;
            if (countDownLatch == null) {
                return;
            }
            countDownLatch.countDown();
        }
    }
}
