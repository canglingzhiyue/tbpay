package com.taobao.themis.web.solution;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.f;
import com.taobao.themis.kernel.page.ITMSPage;
import kotlin.jvm.internal.q;
import tb.kge;
import tb.tmf;

/* loaded from: classes9.dex */
public final class b extends com.taobao.themis.kernel.page.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-885928795);
    }

    public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
        if (str.hashCode() == -1779084140) {
            super.b((ITMSPage) objArr[0]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(f instance) {
        super(instance);
        q.d(instance, "instance");
    }

    @Override // com.taobao.themis.kernel.page.b
    public void b(ITMSPage page) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("95f55494", new Object[]{this, page});
            return;
        }
        q.d(page, "page");
        super.b(page);
        page.a(new tmf(page));
    }
}
