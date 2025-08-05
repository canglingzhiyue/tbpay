package com.taobao.android.preload;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.preload.core.task.PreloadTaskEntity;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import tb.icj;
import tb.icn;

/* loaded from: classes.dex */
public class h {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private icj c;
    private int e;
    private int f;
    private a g;
    private b h;

    /* renamed from: a  reason: collision with root package name */
    private final com.taobao.android.preload.a f14686a = new com.taobao.android.preload.a();
    private final com.taobao.android.preload.core.task.c b = new com.taobao.android.preload.core.task.c();
    private final ConcurrentHashMap<String, DetailPreloadBucket> d = new ConcurrentHashMap<>();
    private icn i = new icn();

    /* loaded from: classes6.dex */
    public interface a {
        boolean a(String str);
    }

    public static /* synthetic */ b a(h hVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("7f8f21b4", new Object[]{hVar}) : hVar.h;
    }

    public static /* synthetic */ void a(h hVar, String str, com.taobao.android.preload.core.task.e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e23e9a2f", new Object[]{hVar, str, eVar});
        } else {
            hVar.a(str, eVar);
        }
    }

    public static /* synthetic */ a b(h hVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("427f7cb0", new Object[]{hVar}) : hVar.g;
    }

    public static /* synthetic */ com.taobao.android.preload.core.task.c c(h hVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.preload.core.task.c) ipChange.ipc$dispatch("3e19bcab", new Object[]{hVar}) : hVar.b;
    }

    public static /* synthetic */ ConcurrentHashMap d(h hVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ConcurrentHashMap) ipChange.ipc$dispatch("e30bda3b", new Object[]{hVar}) : hVar.d;
    }

    private ExecutorService a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ExecutorService) ipChange.ipc$dispatch("13131fb3", new Object[]{this}) : this.f14686a.a(1, 60, "Detail Preload Loader");
    }

    public void a(final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else if (TextUtils.isEmpty(str)) {
            f.b(e.a("PreloadTaskLoader"), "params is null");
        } else {
            a().execute(new Runnable() { // from class: com.taobao.android.preload.h.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        h.a(h.this, str, null);
                    }
                }
            });
        }
    }

    private void a(String str, com.taobao.android.preload.core.task.e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42c7468f", new Object[]{this, str, eVar});
            return;
        }
        try {
            PreloadTaskEntity parser = PreloadTaskEntity.parser(str, this.h);
            String str2 = parser.sourceFrom;
            if (TextUtils.isEmpty(str2)) {
                f.a(e.a("PreloadTaskLoader"), "sourceFrom is null");
            } else if (this.g != null && this.g.a(str2)) {
            } else {
                ArrayList<PreloadTaskEntity.a> arrayList = parser.items;
                if (arrayList != null && !arrayList.isEmpty()) {
                    com.taobao.android.preload.core.task.d.a(parser, eVar, this.e, this.f).a(this.b, this.i.b(parser.bizName), this.c, this.f14686a);
                    return;
                }
                f.a(e.a("PreloadTaskLoader"), "preloadTaskEntity items is null");
            }
        } catch (Exception e) {
            f.a(e.a("PreloadTaskLoader"), "预加载批量接口任务执行失败", e);
            if (eVar == null) {
                return;
            }
            eVar.a((PreloadTaskEntity) null, e);
        }
    }

    public void b(final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
        } else if (TextUtils.isEmpty(str)) {
            f.b(e.a("PreloadTaskLoader"), "dataSourceParams is null");
        } else {
            a().execute(new Runnable() { // from class: com.taobao.android.preload.h.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    String str2 = PreloadTaskEntity.parser(str, h.a(h.this)).sourceFrom;
                    if (TextUtils.isEmpty(str2)) {
                        f.a(e.a("PreloadTaskLoader"), "sourceFrom is null");
                    } else if (h.b(h.this) != null && h.b(h.this).a(str2)) {
                    } else {
                        h.c(h.this).a(str, h.a(h.this));
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
            f.b(e.a("PreloadTaskLoader"), "params is null");
        } else {
            a().execute(new Runnable() { // from class: com.taobao.android.preload.h.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    String str2 = PreloadTaskEntity.parser(str, h.a(h.this)).sourceFrom;
                    if (TextUtils.isEmpty(str2)) {
                        f.a(e.a("PreloadTaskLoader"), "sourceFrom is null");
                    } else if (h.b(h.this) != null && h.b(h.this).a(str2)) {
                    } else {
                        h.c(h.this).b(str, h.a(h.this));
                    }
                }
            });
        }
    }

    public void d(final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d23b17f5", new Object[]{this, str});
        } else if (TextUtils.isEmpty(str)) {
            f.b(e.a("PreloadTaskLoader"), "params is null");
        } else {
            a().execute(new Runnable() { // from class: com.taobao.android.preload.h.4
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
                    h.d(h.this).put(parser.sourceFrom, parser);
                }
            });
        }
    }

    public DetailPreloadBucket e(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DetailPreloadBucket) ipChange.ipc$dispatch("e7e07a06", new Object[]{this, str}) : this.d.get(str);
    }

    public void a(icj icjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed660e48", new Object[]{this, icjVar});
        } else {
            this.c = icjVar;
        }
    }

    public void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
        } else {
            this.e = i;
        }
    }

    public void a(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5368cdce", new Object[]{this, bVar});
        } else {
            this.h = bVar;
        }
    }
}
