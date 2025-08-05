package com.taobao.android.detail.core.performance.preload;

import android.os.Looper;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.performance.l;
import com.taobao.android.detail.core.performance.preload.core.task.PreloadTaskEntity;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import tb.ecg;
import tb.eiu;
import tb.emu;
import tb.kge;

/* loaded from: classes4.dex */
public class j {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final ConcurrentHashMap<String, eiu> f9802a;
    private final d b;
    private final com.taobao.android.detail.core.performance.preload.core.task.d c;
    private final ConcurrentHashMap<String, DetailPreloadBucket> d;

    /* loaded from: classes4.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static final j f9807a;

        static {
            kge.a(-1127701927);
            f9807a = new j();
        }

        public static /* synthetic */ j a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (j) ipChange.ipc$dispatch("351f1e3d", new Object[0]) : f9807a;
        }
    }

    static {
        kge.a(-236289865);
    }

    public static /* synthetic */ com.taobao.android.detail.core.performance.preload.core.task.d a(j jVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.detail.core.performance.preload.core.task.d) ipChange.ipc$dispatch("e4f505ee", new Object[]{jVar}) : jVar.c;
    }

    public static /* synthetic */ void a(j jVar, String str, com.taobao.android.detail.core.performance.preload.core.task.f fVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8932e4e6", new Object[]{jVar, str, fVar, new Boolean(z)});
        } else {
            jVar.b(str, fVar, z);
        }
    }

    public static /* synthetic */ ConcurrentHashMap b(j jVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ConcurrentHashMap) ipChange.ipc$dispatch("4a41ceae", new Object[]{jVar}) : jVar.d;
    }

    private j() {
        this.f9802a = new ConcurrentHashMap<>();
        this.b = new d();
        this.c = new com.taobao.android.detail.core.performance.preload.core.task.d();
        this.d = new ConcurrentHashMap<>();
        emu.a("com.taobao.android.detail.core.performance.preload.PreloadTaskLoader");
    }

    public static j a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (j) ipChange.ipc$dispatch("351f1e3d", new Object[0]) : a.a();
    }

    private ExecutorService b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ExecutorService) ipChange.ipc$dispatch("1a7854d2", new Object[]{this}) : this.b.a(1, 60, "Detail Preload Loader");
    }

    public void a(final String str, final com.taobao.android.detail.core.performance.preload.core.task.f fVar, final boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0535655", new Object[]{this, str, fVar, new Boolean(z)});
        } else if (TextUtils.isEmpty(str)) {
            com.taobao.android.detail.core.utils.i.c(l.a("PreloadTaskLoader"), "params is null");
        } else {
            com.taobao.android.detail.core.utils.i.a(l.a("PreloadTaskLoader"), "preloadTaskLoader load");
            if (Looper.myLooper() == Looper.getMainLooper()) {
                b().execute(new Runnable() { // from class: com.taobao.android.detail.core.performance.preload.j.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            j.a(j.this, str, fVar, z);
                        }
                    }
                });
            } else {
                b(str, fVar, z);
            }
        }
    }

    public void a(String str, com.taobao.android.detail.core.performance.preload.core.task.f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1efa685f", new Object[]{this, str, fVar});
        } else {
            a(str, fVar, false);
        }
    }

    private boolean a(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8123ece6", new Object[]{this, str, new Boolean(z)})).booleanValue();
        }
        if (com.taobao.android.detail.core.performance.e.b(str)) {
            String a2 = l.a("PreloadTaskLoader");
            com.taobao.android.detail.core.utils.i.a(a2, "进入导航预加载判断:" + z);
            return z;
        }
        com.taobao.android.detail.core.utils.i.a(l.a("PreloadTaskLoader"), "进入批量预加载判断");
        return com.taobao.android.detail.core.performance.e.a(str);
    }

    private void b(String str, com.taobao.android.detail.core.performance.preload.core.task.f fVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("22ae6d34", new Object[]{this, str, fVar, new Boolean(z)});
            return;
        }
        com.taobao.android.detail.core.utils.i.a(l.a("PreloadTaskLoader"), "preloadTaskLoader executorService loadTask");
        try {
            PreloadTaskEntity parser = PreloadTaskEntity.parser(str);
            String str2 = parser.sourceFrom;
            if (TextUtils.isEmpty(str2)) {
                com.taobao.android.detail.core.utils.i.a(l.a("PreloadTaskLoader"), "sourceFrom is null");
            } else if (!a(str2, z)) {
                com.taobao.android.detail.core.utils.i.a(l.a("PreloadTaskLoader"), "detailPreload is unEnable");
            } else {
                ArrayList<PreloadTaskEntity.a> arrayList = parser.items;
                if (arrayList != null && !arrayList.isEmpty()) {
                    com.taobao.android.detail.core.performance.preload.core.task.e.a(parser, fVar).a(this.c);
                    return;
                }
                com.taobao.android.detail.core.utils.i.a(l.a("PreloadTaskLoader"), "preloadTaskEntity items is null");
            }
        } catch (Exception e) {
            com.taobao.android.detail.core.utils.i.a(l.a("PreloadTaskLoader"), "预加载批量接口任务执行失败", e);
            ecg.a(com.taobao.android.detail.core.performance.preload.core.task.c.c(null), e.getMessage(), com.taobao.android.detail.core.performance.preload.core.task.c.a(null));
        }
    }

    public void a(final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else if (TextUtils.isEmpty(str)) {
            com.taobao.android.detail.core.utils.i.c(l.a("PreloadTaskLoader"), "dataSourceParams is null");
        } else {
            b().execute(new Runnable() { // from class: com.taobao.android.detail.core.performance.preload.j.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        j.a(j.this).a(str);
                    }
                }
            });
        }
    }

    public void b(final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
        } else if (TextUtils.isEmpty(str)) {
            com.taobao.android.detail.core.utils.i.c(l.a("PreloadTaskLoader"), "params is null");
        } else {
            b().execute(new Runnable() { // from class: com.taobao.android.detail.core.performance.preload.j.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        j.a(j.this).b(str);
                    }
                }
            });
        }
    }

    public void c(final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{this, str});
        } else if (TextUtils.isEmpty(str)) {
            com.taobao.android.detail.core.utils.i.c(l.a("PreloadTaskLoader"), "params is null");
        } else {
            b().execute(new Runnable() { // from class: com.taobao.android.detail.core.performance.preload.j.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    DetailPreloadBucket parser = DetailPreloadBucket.parser(str);
                    if (parser == null || TextUtils.isEmpty(parser.sourceFrom)) {
                        return;
                    }
                    j.b(j.this).put(parser.sourceFrom, parser);
                }
            });
        }
    }

    public DetailPreloadBucket d(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DetailPreloadBucket) ipChange.ipc$dispatch("dd3cda18", new Object[]{this, str}) : this.d.get(str);
    }

    public void a(String str, eiu eiuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26d6aeb1", new Object[]{this, str, eiuVar});
        } else {
            this.f9802a.put(str, eiuVar);
        }
    }

    public eiu e(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (eiu) ipChange.ipc$dispatch("7f217e5f", new Object[]{this, str}) : this.f9802a.get(str);
    }
}
