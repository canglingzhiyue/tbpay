package com.taobao.themis.canvas;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.canvas.canvas.TMSCanvasRender;
import com.taobao.themis.kernel.f;
import com.taobao.themis.kernel.page.ITMSPage;
import com.taobao.themis.kernel.utils.m;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.q;
import tb.kge;
import tb.nfc;
import tb.qqh;
import tb.qqq;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\n"}, d2 = {"Lcom/taobao/themis/canvas/TMSGameRenderFactory;", "Lcom/taobao/themis/kernel/render_factory/TMSBaseRenderFactory;", "Ljava/io/Serializable;", "instance", "Lcom/taobao/themis/kernel/TMSInstance;", "(Lcom/taobao/themis/kernel/TMSInstance;)V", nfc.PHA_MONITOR_MODULE_POINT_CREATE_RENDER, "Lcom/taobao/themis/kernel/runtime/TMSRenderProtocol;", "page", "Lcom/taobao/themis/kernel/page/ITMSPage;", "themis_canvas_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class TMSGameRenderFactory extends qqh implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-542776983);
        kge.a(1028243835);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TMSGameRenderFactory(f instance) {
        super(instance);
        q.d(instance, "instance");
    }

    @Override // tb.qqg
    public qqq createRender(ITMSPage page) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (qqq) ipChange.ipc$dispatch("877603f1", new Object[]{this, page});
        }
        q.d(page, "page");
        if (m.a(page.e())) {
            return new com.taobao.themis.web.runtime.b(page);
        }
        if (m.b(page.e())) {
            return new com.taobao.themis.open.permission.auth.ui.c(page);
        }
        return new TMSCanvasRender(page);
    }
}
