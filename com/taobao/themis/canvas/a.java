package com.taobao.themis.canvas;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fcanvas.integration.FCanvas;
import com.taobao.themis.kernel.page.ITMSPage;
import com.taobao.themis.kernel.utils.n;
import kotlin.Metadata;
import kotlin.jvm.internal.q;
import tb.kge;
import tb.qqa;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\b"}, d2 = {"Lcom/taobao/themis/canvas/ImageProviderLifecycleListener;", "Lcom/taobao/themis/kernel/page/ITMSPage$LifeCycleListener;", "()V", "onPause", "", "page", "Lcom/taobao/themis/kernel/page/ITMSPage;", "onResume", "themis_canvas_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class a implements qqa.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1305246317);
        kge.a(1997770974);
    }

    @Override // tb.qqa.b
    public void b(ITMSPage page) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("95f55494", new Object[]{this, page});
        } else {
            q.d(page, "page");
        }
    }

    @Override // tb.qqa.b
    public void c(ITMSPage page) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30961715", new Object[]{this, page});
            return;
        }
        q.d(page, "page");
        qqa.b.a.c(this, page);
    }

    @Override // tb.qqa.b
    public void d(ITMSPage page) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb36d996", new Object[]{this, page});
            return;
        }
        q.d(page, "page");
        qqa.b.a.d(this, page);
    }

    @Override // tb.qqa.b
    public void e(ITMSPage page) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65d79c17", new Object[]{this, page});
            return;
        }
        q.d(page, "page");
        qqa.b.a.a(this, page);
    }

    @Override // tb.qqa.b
    public void f(ITMSPage page) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("785e98", new Object[]{this, page});
            return;
        }
        q.d(page, "page");
        qqa.b.a.b(this, page);
    }

    @Override // tb.qqa.b
    public void a(ITMSPage page) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb549213", new Object[]{this, page});
            return;
        }
        q.d(page, "page");
        com.taobao.themis.canvas.canvas.c.a().a(page.b().f());
        if (!n.cc()) {
            return;
        }
        FCanvas.installImageProviderOnce(com.taobao.themis.canvas.canvas.c.a());
    }
}
