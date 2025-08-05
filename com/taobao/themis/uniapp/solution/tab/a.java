package com.taobao.themis.uniapp.solution.tab;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.f;
import com.taobao.themis.kernel.page.ITMSPage;
import kotlin.Metadata;
import kotlin.jvm.internal.q;
import tb.kge;
import tb.nfc;
import tb.qqh;
import tb.qqq;
import tb.tmk;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"Lcom/taobao/themis/uniapp/solution/tab/TMSUniAppRenderFactory;", "Lcom/taobao/themis/kernel/render_factory/TMSBaseRenderFactory;", "instance", "Lcom/taobao/themis/kernel/TMSInstance;", "(Lcom/taobao/themis/kernel/TMSInstance;)V", nfc.PHA_MONITOR_MODULE_POINT_CREATE_RENDER, "Lcom/taobao/themis/kernel/runtime/TMSRenderProtocol;", "page", "Lcom/taobao/themis/kernel/page/ITMSPage;", "themis_uniapp_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class a extends qqh {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1378515599);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(f instance) {
        super(instance);
        q.d(instance, "instance");
    }

    @Override // tb.qqg
    public qqq createRender(ITMSPage page) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return (qqq) ipChange.ipc$dispatch("877603f1", new Object[]{this, page});
        }
        q.d(page, "page");
        if (page.e().length() != 0) {
            z = false;
        }
        if (z || page.c().e().h()) {
            return new b(page);
        }
        String e = page.c().e().e();
        if (e != null) {
            int hashCode = e.hashCode();
            if (hashCode == 117588) {
                if (e.equals("web")) {
                    return new com.taobao.themis.web.runtime.b(page);
                }
            } else if (hashCode == 3645441 && e.equals("weex")) {
                return new tmk(page);
            }
        }
        return new com.taobao.themis.web.runtime.b(page);
    }
}
