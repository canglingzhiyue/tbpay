package tb;

import android.os.AsyncTask;
import android.os.SystemClock;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.downloader.b;
import com.taobao.taopai.material.request.materialfile.a;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.List;
import tb.kml;

/* loaded from: classes8.dex */
public class qbq implements kml {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a */
    public String f32884a;
    public String b;
    public String c;
    public a d;
    private int e;
    private int f;
    private String g;
    private long h;
    private boolean i = false;
    private Runnable j = new Runnable() { // from class: tb.qbq.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        {
            qbq.this = this;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            b.a().a(qbq.a(qbq.this));
            qbq.this.d.a(qbq.this.f32884a, String.valueOf(-103), "timeout");
        }
    };

    static {
        kge.a(-1754930055);
        kge.a(1882102659);
    }

    public static /* synthetic */ void lambda$6tETgxWHs35xHEltIKk_Lzt8RrI(qbq qbqVar, String str) {
        qbqVar.d(str);
    }

    public static /* synthetic */ void lambda$93Mj4XFJizIfx94hhn5rCEr9O4g(qbq qbqVar) {
        qbqVar.f();
    }

    /* renamed from: lambda$bbftuQe0lWT-cokfFRQOs40myjI */
    public static /* synthetic */ void m2476lambda$bbftuQe0lWTcokfFRQOs40myjI(qbq qbqVar, String str) {
        qbqVar.e(str);
    }

    /* renamed from: lambda$m5Nvkl5AoE5mLyHK3F-v2-qN_VU */
    public static /* synthetic */ void m2477lambda$m5Nvkl5AoE5mLyHK3Fv2qN_VU(qbq qbqVar, String str) {
        qbqVar.c(str);
    }

    public static /* synthetic */ void lambda$o9nRCDZEKRQZkiES0pi0K_MFDxs(qbq qbqVar) {
        qbqVar.g();
    }

    public static /* synthetic */ void lambda$ocf_Jg4qSNoM9tjtTEhkrtVUms4(qbq qbqVar) {
        qbqVar.e();
    }

    @Override // tb.kml
    public void onDownloadStateChange(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("98fdb789", new Object[]{this, str, new Boolean(z)});
        }
    }

    @Override // tb.kml
    public void onFinish(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a109f1b", new Object[]{this, new Boolean(z)});
        }
    }

    @Override // tb.kml
    public void onNetworkLimit(int i, kmq kmqVar, kml.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6919023a", new Object[]{this, new Integer(i), kmqVar, aVar});
        }
    }

    public static /* synthetic */ int a(qbq qbqVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("fb01ea4b", new Object[]{qbqVar})).intValue() : qbqVar.f;
    }

    public static /* synthetic */ void a(qbq qbqVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f722e22", new Object[]{qbqVar, str});
        } else {
            qbqVar.b(str);
        }
    }

    public static /* synthetic */ void a(qbq qbqVar, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7e8d36c", new Object[]{qbqVar, str, str2});
        } else {
            qbqVar.b(str, str2);
        }
    }

    public static /* synthetic */ String b(qbq qbqVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7bdbb0e7", new Object[]{qbqVar}) : qbqVar.g;
    }

    public static /* synthetic */ void b(qbq qbqVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a45af663", new Object[]{qbqVar, str});
        } else {
            qbqVar.a(str);
        }
    }

    public static /* synthetic */ int c(qbq qbqVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("d807f74d", new Object[]{qbqVar})).intValue() : qbqVar.e;
    }

    public qbq(int i, a aVar) {
        this.e = i;
        this.d = aVar;
    }

    public qbq(a aVar) {
        this.d = aVar;
    }

    public void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb2e8942", new Object[]{this, aVar});
        } else {
            this.d = aVar;
        }
    }

    public void a(String str, String str2, String str3, int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("573676f7", new Object[]{this, str, str2, str3, new Integer(i), new Boolean(z)});
        } else {
            a(str, str2, str3, i, z, "");
        }
    }

    public void a(String str, String str2, String str3, int i, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d41d007", new Object[]{this, str, str2, str3, new Integer(i), str4});
        } else {
            a(str, str2, str3, i, TextUtils.isEmpty(str4), str4);
        }
    }

    public void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
        } else if (com.taobao.taopai2.material.task.a.a().a(str2)) {
            com.taobao.taopai2.material.task.a.a().a(str2, this.d);
        } else if (TextUtils.isEmpty(str2) && this.d != null) {
            pzc.a(new Runnable() { // from class: tb.-$$Lambda$qbq$o9nRCDZEKRQZkiES0pi0K_MFDxs
                @Override // java.lang.Runnable
                public final void run() {
                    qbq.lambda$o9nRCDZEKRQZkiES0pi0K_MFDxs(qbq.this);
                }
            });
        } else if (TextUtils.isEmpty(str)) {
            pzc.a(new Runnable() { // from class: tb.-$$Lambda$qbq$93Mj4XFJizIfx94hhn5rCEr9O4g
                @Override // java.lang.Runnable
                public final void run() {
                    qbq.lambda$93Mj4XFJizIfx94hhn5rCEr9O4g(qbq.this);
                }
            });
        } else {
            this.g = str2;
            this.b = str;
            d();
        }
    }

    public /* synthetic */ void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
        } else {
            this.d.a(this.f32884a, String.valueOf(-102), "url empty");
        }
    }

    public /* synthetic */ void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
        } else {
            this.d.a(this.f32884a, String.valueOf(-102), "file path empty");
        }
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        File file = new File(this.b);
        File file2 = new File(this.b + File.separator + file.getName() + qbs.c());
        kmm kmmVar = new kmm();
        kmmVar.b.f30169a = "taopai_material_download";
        kmo kmoVar = new kmo();
        kmoVar.d = file2.getName();
        kmoVar.f30167a = this.g;
        kmmVar.b.h = file2.getParent();
        kmmVar.b.j = false;
        kmmVar.f30166a.add(kmoVar);
        this.f = b.a().a(kmmVar, this);
        if (this.f == -100) {
            if (this.d == null) {
                return;
            }
            pzc.a(new Runnable() { // from class: tb.-$$Lambda$qbq$ocf_Jg4qSNoM9tjtTEhkrtVUms4
                @Override // java.lang.Runnable
                public final void run() {
                    qbq.lambda$ocf_Jg4qSNoM9tjtTEhkrtVUms4(qbq.this);
                }
            });
            return;
        }
        com.taobao.taopai2.material.task.a.a().a(this.g, null);
    }

    public /* synthetic */ void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
        } else {
            this.d.a(this.f32884a, String.valueOf(-100), "download fail");
        }
    }

    public void a(String str, final String str2, String str3, int i, boolean z, String str4) {
        File a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0ee7101", new Object[]{this, str, str2, str3, new Integer(i), new Boolean(z), str4});
            return;
        }
        this.h = SystemClock.elapsedRealtime();
        this.c = str;
        this.f32884a = str2;
        if (TextUtils.isEmpty(str3) && this.d != null) {
            pzc.a(new Runnable() { // from class: tb.-$$Lambda$qbq$bbftuQe0lWT-cokfFRQOs40myjI
                @Override // java.lang.Runnable
                public final void run() {
                    qbq.m2476lambda$bbftuQe0lWTcokfFRQOs40myjI(qbq.this, str2);
                }
            });
            return;
        }
        this.g = str3;
        String a3 = qbr.a(str2, i, str3, true);
        if (!TextUtils.isEmpty(str4)) {
            a2 = new File(a3 + File.separator + str4);
        } else if (str3.endsWith(".png")) {
            a2 = new File(a3 + File.separator + qcg.e(str3));
        } else {
            a2 = a(str2, i, str3);
        }
        if (a2 == null) {
            if (this.d == null) {
                return;
            }
            pzc.a(new Runnable() { // from class: tb.-$$Lambda$qbq$6tETgxWHs35xHEltIKk_Lzt8RrI
                @Override // java.lang.Runnable
                public final void run() {
                    qbq.lambda$6tETgxWHs35xHEltIKk_Lzt8RrI(qbq.this, str2);
                }
            });
            return;
        }
        kmm kmmVar = new kmm();
        kmmVar.b.f30169a = "taopai_material_download";
        kmo kmoVar = new kmo();
        kmoVar.d = a2.getName();
        kmoVar.f30167a = str3;
        kmmVar.b.h = a2.getParent();
        kmmVar.b.j = z;
        kmmVar.f30166a.add(kmoVar);
        this.f = b.a().a(kmmVar, this);
        if (this.f == -100) {
            if (this.d != null) {
                pzc.a(new Runnable() { // from class: tb.-$$Lambda$qbq$m5Nvkl5AoE5mLyHK3F-v2-qN_VU
                    @Override // java.lang.Runnable
                    public final void run() {
                        qbq.m2477lambda$m5Nvkl5AoE5mLyHK3Fv2qN_VU(qbq.this, str2);
                    }
                });
            }
            a(str, str2, str3, i);
        }
        com.taobao.taopai2.material.task.a.a().a(this.g, null);
    }

    public /* synthetic */ void e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c6cb136", new Object[]{this, str});
        } else {
            this.d.a(str, String.valueOf(-102), "url empty");
        }
    }

    public /* synthetic */ void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d23b17f5", new Object[]{this, str});
        } else {
            this.d.a(str, String.valueOf(-101), "获取保存路径失败，请检查是否初始化");
        }
    }

    public /* synthetic */ void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{this, str});
        } else {
            this.d.a(str, String.valueOf(-100), "download fail");
        }
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            pzc.b(this.j);
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        com.taobao.taopai2.material.task.a.a().c(this.g);
        pzc.b(this.j);
        b.a().a(this.f);
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else {
            this.d = null;
        }
    }

    public File a(String str, int i, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("87a54452", new Object[]{this, str, new Integer(i), str2});
        }
        this.b = qbr.a(str, i, str2, true);
        if (this.b == null) {
            return null;
        }
        return new File(this.b + File.separator + str + qbs.c());
    }

    @Override // tb.kml
    public void onDownloadProgress(final int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49af8908", new Object[]{this, new Integer(i)});
        } else {
            pzc.a(new Runnable() { // from class: tb.qbq.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                {
                    qbq.this = this;
                }

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    if (qbq.this.d != null) {
                        qbq.this.d.a(qbq.this.f32884a, i);
                    }
                    List<WeakReference<Object>> b = com.taobao.taopai2.material.task.a.a().b(qbq.b(qbq.this));
                    if (b == null) {
                        return;
                    }
                    for (WeakReference<Object> weakReference : b) {
                        if (weakReference.get() != null && (weakReference.get() instanceof a)) {
                            ((a) weakReference.get()).a(qbq.this.f32884a, i);
                        }
                    }
                }
            });
        }
    }

    @Override // tb.kml
    public void onDownloadError(String str, int i, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc722e3b", new Object[]{this, str, new Integer(i), str2});
            return;
        }
        String str3 = "onDownloadError " + str2;
        b(String.valueOf(i), str2);
        qcf.a(this.c, "file", "", String.valueOf(i), str2, SystemClock.elapsedRealtime() - this.h, String.valueOf(this.f32884a));
        a();
    }

    @Override // tb.kml
    public void onDownloadFinish(String str, final String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("43d7a315", new Object[]{this, str, str2});
            return;
        }
        String str3 = "onDownloadSuccess " + str2;
        qcf.a(this.c, "file", SystemClock.elapsedRealtime() - this.h);
        pzc.b(this.j);
        AsyncTask.THREAD_POOL_EXECUTOR.execute(new Runnable() { // from class: tb.qbq.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            {
                qbq.this = this;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else if (qbq.this.d == null) {
                } else {
                    if (!qcg.a(str2)) {
                        qbq.a(qbq.this, "file_not_exist", "file not exist");
                    } else if (str2.endsWith(qbs.c())) {
                        qbq.b(qbq.this, str2);
                    } else {
                        qcf.a(qbq.c(qbq.this), qbq.this.f32884a, new File(str2).length());
                        qbq.a(qbq.this, str2);
                    }
                }
            }
        });
    }

    private void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        try {
            qcg.b(str, this.b);
            qcf.a(this.e, this.f32884a, new File(str).length());
            qcg.c(str);
            if (izg.c() && qcg.b(this.b) && !this.i) {
                this.i = true;
                d();
                qcf.a(this.c, this.f32884a, "empty after unzip");
                return;
            }
            b(this.b);
        }
    }

    private void b(final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
        } else {
            pzc.a(new Runnable() { // from class: tb.qbq.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                {
                    qbq.this = this;
                }

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    if (qbq.this.d != null) {
                        qbq.this.d.a(qbq.this.f32884a, str);
                    }
                    List<WeakReference<Object>> b = com.taobao.taopai2.material.task.a.a().b(qbq.b(qbq.this));
                    if (b != null) {
                        for (WeakReference<Object> weakReference : b) {
                            if (weakReference.get() != null && (weakReference.get() instanceof a)) {
                                ((a) weakReference.get()).a(qbq.this.f32884a, str);
                            }
                        }
                    }
                    com.taobao.taopai2.material.task.a.a().c(qbq.b(qbq.this));
                }
            });
        }
    }

    private void b(final String str, final String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65d7b87d", new Object[]{this, str, str2});
        } else {
            pzc.a(new Runnable() { // from class: tb.qbq.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                {
                    qbq.this = this;
                }

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    if (qbq.this.d != null) {
                        qbq.this.d.a(qbq.this.f32884a, str, str2);
                    }
                    List<WeakReference<Object>> b = com.taobao.taopai2.material.task.a.a().b(qbq.b(qbq.this));
                    if (b != null) {
                        for (WeakReference<Object> weakReference : b) {
                            if (weakReference.get() != null && (weakReference.get() instanceof a)) {
                                ((a) weakReference.get()).a(qbq.this.f32884a, str, str2);
                            }
                        }
                    }
                    com.taobao.taopai2.material.task.a.a().c(qbq.b(qbq.this));
                }
            });
        }
    }

    private void a(String str, String str2, String str3, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0bfab7d", new Object[]{this, str, str2, str3, new Integer(i)});
            return;
        }
        qcf.a(str, "file", "tid=" + str2 + "url=" + str3 + "version=" + i, String.valueOf(-100), "start fail", SystemClock.elapsedRealtime() - this.h);
    }
}
