package com.taobao.downloader.manager;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import java.util.concurrent.ConcurrentHashMap;
import tb.kln;
import tb.klo;
import tb.kmr;
import tb.kmv;
import tb.knd;

/* loaded from: classes7.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private ConcurrentHashMap<kmr, kln> f17086a = new ConcurrentHashMap<>();

    public static /* synthetic */ ConcurrentHashMap a(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ConcurrentHashMap) ipChange.ipc$dispatch("65911a45", new Object[]{aVar}) : aVar.f17086a;
    }

    public void a(final kmr kmrVar, final klo kloVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8619a0a", new Object[]{this, kmrVar, kloVar});
            return;
        }
        kmv.d("Downloader.DownManager", "startDownload", "url", kmrVar.e.f30167a);
        final kln a2 = com.taobao.downloader.a.j.a(kmrVar.f);
        if (kmrVar.i && this.f17086a.get(kmrVar) != null) {
            kmv.d("Downloader.DownManager", "startDownload 分包任务未完成 return", "url", kmrVar.e.f30167a);
            return;
        }
        this.f17086a.put(kmrVar, a2);
        knd.a(new Runnable() { // from class: com.taobao.downloader.manager.a.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                if (a.a(a.this).get(kmrVar) == null) {
                    kmv.d("Downloader.DownManager", "startDownload 任务在下载前已经被删除了", "url", kmrVar.e.f30167a);
                }
                if (!kmrVar.f30170a) {
                    kmr kmrVar2 = kmrVar;
                    kmrVar2.b = 0;
                    kmrVar2.c = null;
                }
                File file = new File(kmrVar.g);
                if (!file.exists()) {
                    file.mkdirs();
                }
                a2.a(kmrVar, kloVar);
                if (kmrVar.i) {
                    return;
                }
                a.a(a.this).remove(kmrVar);
            }
        }, false);
    }

    public void a(kmr kmrVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1604d88", new Object[]{this, kmrVar});
        } else {
            a(kmrVar, true);
        }
    }

    public void a(kmr kmrVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3aaa164c", new Object[]{this, kmrVar, new Boolean(z)});
            return;
        }
        if (!z) {
            try {
                if (kmrVar.i) {
                    kmv.d("Downloader.DownManager", "stopDownload failed 分包任务不取消", "url", kmrVar.e.f30167a);
                    return;
                }
            } catch (Throwable th) {
                kmv.d("Downloader.DownManager", "stopDownload exception 分包任务不取消", "url", kmrVar.e.f30167a, th);
            }
        }
        kmv.d("Downloader.DownManager", "stopDownload", "url", kmrVar.e.f30167a);
        kln klnVar = this.f17086a.get(kmrVar);
        if (klnVar == null) {
            return;
        }
        klnVar.b();
        this.f17086a.remove(kmrVar);
    }

    public void b(kmr kmrVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dfe35409", new Object[]{this, kmrVar});
            return;
        }
        kmv.d("Downloader.DownManager", "cancelDownload", "url", kmrVar.e.f30167a);
        kln klnVar = this.f17086a.get(kmrVar);
        if (klnVar == null) {
            return;
        }
        klnVar.a();
        this.f17086a.remove(kmrVar);
    }

    public void c(kmr kmrVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce665a8a", new Object[]{this, kmrVar});
        } else if (kmrVar == null || !kmrVar.i || this.f17086a.get(kmrVar) == null) {
        } else {
            kmv.d("Downloader.DownManager", "removeBoostTask", "url", kmrVar.e.f30167a);
            this.f17086a.remove(kmrVar);
        }
    }
}
