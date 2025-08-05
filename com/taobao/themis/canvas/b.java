package com.taobao.themis.canvas;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.f;
import com.taobao.themis.kernel.page.ITMSPage;
import com.taobao.themis.open.extension.IJSRuntimeFactoryExtension;
import kotlin.Metadata;
import kotlin.jvm.internal.q;
import tb.kge;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0014J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0014¨\u0006\n"}, d2 = {"Lcom/taobao/themis/canvas/TMSCanvasPageFactory;", "Lcom/taobao/themis/kernel/page/TMSBasePageFactory;", "instance", "Lcom/taobao/themis/kernel/TMSInstance;", "(Lcom/taobao/themis/kernel/TMSInstance;)V", "initLifeCycleListener", "", "page", "Lcom/taobao/themis/kernel/page/ITMSPage;", "registerExtension", "themis_canvas_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class b extends com.taobao.themis.kernel.page.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-295111510);
    }

    public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1779084140) {
            super.b((ITMSPage) objArr[0]);
            return null;
        } else if (hashCode != -78343661) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.a((ITMSPage) objArr[0]);
            return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(f instance) {
        super(instance);
        q.d(instance, "instance");
    }

    @Override // com.taobao.themis.kernel.page.b
    public void a(ITMSPage page) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb549213", new Object[]{this, page});
            return;
        }
        q.d(page, "page");
        super.a(page);
        page.a(new a());
    }

    @Override // com.taobao.themis.kernel.page.b
    public void b(ITMSPage page) {
        com.taobao.themis.open.extension.b a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("95f55494", new Object[]{this, page});
            return;
        }
        q.d(page, "page");
        super.b(page);
        IJSRuntimeFactoryExtension iJSRuntimeFactoryExtension = (IJSRuntimeFactoryExtension) page.b().b(IJSRuntimeFactoryExtension.class);
        if (iJSRuntimeFactoryExtension == null || (a2 = iJSRuntimeFactoryExtension.a(page)) == null) {
            return;
        }
        page.a(a2);
    }
}
