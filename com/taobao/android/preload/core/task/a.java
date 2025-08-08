package com.taobao.android.preload.core.task;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.preload.f;
import tb.icj;
import tb.icl;

/* loaded from: classes6.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private e f14677a;
    private icl b;
    private PreloadTaskEntity c;
    private icj d;
    private com.taobao.android.preload.a e;

    public static /* synthetic */ void a(a aVar, PreloadTaskEntity preloadTaskEntity, Exception exc) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da5835cc", new Object[]{aVar, preloadTaskEntity, exc});
        } else {
            aVar.a(preloadTaskEntity, exc);
        }
    }

    public static /* synthetic */ void a(a aVar, PreloadTaskEntity preloadTaskEntity, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49335e56", new Object[]{aVar, preloadTaskEntity, obj});
        } else {
            aVar.a(preloadTaskEntity, obj);
        }
    }

    public a() {
    }

    public a(e eVar, icl iclVar, PreloadTaskEntity preloadTaskEntity, icj icjVar, com.taobao.android.preload.a aVar) {
        this.f14677a = eVar;
        this.b = iclVar;
        this.c = preloadTaskEntity;
        this.d = icjVar;
        this.e = aVar;
    }

    public PreloadTaskEntity a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (PreloadTaskEntity) ipChange.ipc$dispatch("6af3159f", new Object[]{this}) : this.c;
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        try {
            c();
        } catch (Exception e) {
            a(this.c, e);
        }
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else if (StringUtils.isEmpty(this.c.bizName)) {
            a(this.c, (Exception) null);
            f.b(com.taobao.android.preload.e.a("PreloadTask"), "acquire preloadTaskEntity bizName is null");
        } else {
            icj icjVar = this.d;
            if (icjVar == null) {
                a(this.c, (Exception) null);
                f.b(com.taobao.android.preload.e.a("PreloadTask"), "acquire requester is null");
                return;
            }
            icjVar.a(this.c, new e() { // from class: com.taobao.android.preload.core.task.a.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.preload.core.task.e
                public void a(PreloadTaskEntity preloadTaskEntity, Exception exc) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("def9730d", new Object[]{this, preloadTaskEntity, exc});
                        return;
                    }
                    try {
                        a.a(a.this, preloadTaskEntity, exc);
                    } catch (Exception e) {
                        f.a(com.taobao.android.preload.e.a("PreloadTask"), "requester taskCallback", e);
                    }
                }

                @Override // com.taobao.android.preload.core.task.e
                public void a(PreloadTaskEntity preloadTaskEntity, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("212810b5", new Object[]{this, preloadTaskEntity, obj});
                        return;
                    }
                    try {
                        a.a(a.this, preloadTaskEntity, obj);
                    } catch (Exception e) {
                        f.a(com.taobao.android.preload.e.a("PreloadTask"), "requester taskCallback", e);
                    }
                }
            });
        }
    }

    private void a(PreloadTaskEntity preloadTaskEntity, Exception exc) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("def9730d", new Object[]{this, preloadTaskEntity, exc});
            return;
        }
        new b().a(this.b, this, this.e);
        e eVar = this.f14677a;
        if (eVar == null) {
            return;
        }
        eVar.a(preloadTaskEntity, exc);
    }

    private void a(PreloadTaskEntity preloadTaskEntity, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("212810b5", new Object[]{this, preloadTaskEntity, obj});
            return;
        }
        new b().a(this.b, this, this.e);
        e eVar = this.f14677a;
        if (eVar == null) {
            return;
        }
        eVar.a(preloadTaskEntity, obj);
    }
}
