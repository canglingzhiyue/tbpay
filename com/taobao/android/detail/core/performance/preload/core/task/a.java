package com.taobao.android.detail.core.performance.preload.core.task;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.performance.l;
import com.taobao.android.detail.core.performance.preload.j;
import com.taobao.android.detail.core.utils.i;
import tb.eiu;
import tb.eiw;
import tb.emu;
import tb.kge;

/* loaded from: classes4.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private f f9789a;
    private eiw b;
    private PreloadTaskEntity c;

    static {
        kge.a(-341093654);
    }

    public static /* synthetic */ void a(a aVar, PreloadTaskEntity preloadTaskEntity, Exception exc) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("694cdf2a", new Object[]{aVar, preloadTaskEntity, exc});
        } else {
            aVar.a(preloadTaskEntity, exc);
        }
    }

    public static /* synthetic */ void a(a aVar, PreloadTaskEntity preloadTaskEntity, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aba861b8", new Object[]{aVar, preloadTaskEntity, obj});
        } else {
            aVar.a(preloadTaskEntity, obj);
        }
    }

    public a() {
        emu.a("com.taobao.android.detail.core.performance.preload.core.task.PreloadTask");
    }

    public a(f fVar, eiw eiwVar, PreloadTaskEntity preloadTaskEntity) {
        this.f9789a = fVar;
        this.b = eiwVar;
        this.c = preloadTaskEntity;
        emu.a("com.taobao.android.detail.core.performance.preload.core.task.PreloadTask");
    }

    public PreloadTaskEntity a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (PreloadTaskEntity) ipChange.ipc$dispatch("49ec1e50", new Object[]{this}) : this.c;
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
        } else if (TextUtils.isEmpty(this.c.bizName)) {
            a(this.c, (Exception) null);
            i.c(l.a("PreloadTask"), "acquire preloadTaskEntity bizName is null");
        } else {
            eiu e = j.a().e(this.c.bizName);
            if (e == null) {
                a(this.c, (Exception) null);
                i.c(l.a("PreloadTask"), "acquire requester is null");
                return;
            }
            e.a(this.c, new f() { // from class: com.taobao.android.detail.core.performance.preload.core.task.a.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.detail.core.performance.preload.core.task.f
                public void a(PreloadTaskEntity preloadTaskEntity, Exception exc) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("ad4a8a3c", new Object[]{this, preloadTaskEntity, exc});
                    } else {
                        a.a(a.this, preloadTaskEntity, exc);
                    }
                }

                @Override // com.taobao.android.detail.core.performance.preload.core.task.f
                public void a(PreloadTaskEntity preloadTaskEntity, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7446dfe6", new Object[]{this, preloadTaskEntity, obj});
                    } else {
                        a.a(a.this, preloadTaskEntity, obj);
                    }
                }
            });
        }
    }

    private void a(PreloadTaskEntity preloadTaskEntity, Exception exc) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad4a8a3c", new Object[]{this, preloadTaskEntity, exc});
            return;
        }
        new b("Detail Preload Loader").a(this.b, this);
        f fVar = this.f9789a;
        if (fVar == null) {
            return;
        }
        fVar.a(preloadTaskEntity, exc);
    }

    private void a(PreloadTaskEntity preloadTaskEntity, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7446dfe6", new Object[]{this, preloadTaskEntity, obj});
            return;
        }
        new b("Detail Preload Loader").a(this.b, this);
        f fVar = this.f9789a;
        if (fVar == null) {
            return;
        }
        fVar.a(preloadTaskEntity, (PreloadTaskEntity) obj);
    }
}
