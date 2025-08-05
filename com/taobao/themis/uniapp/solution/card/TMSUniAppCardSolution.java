package com.taobao.themis.uniapp.solution.card;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.f;
import com.taobao.themis.uniapp.solution.TMSBaseUniAppSolution;
import com.taobao.themis.uniapp.solution.tab.a;
import kotlin.Metadata;
import kotlin.jvm.internal.q;
import tb.kge;
import tb.qqg;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0014¨\u0006\u0007"}, d2 = {"Lcom/taobao/themis/uniapp/solution/card/TMSUniAppCardSolution;", "Lcom/taobao/themis/uniapp/solution/TMSBaseUniAppSolution;", "instance", "Lcom/taobao/themis/kernel/TMSInstance;", "(Lcom/taobao/themis/kernel/TMSInstance;)V", "createRenderFactory", "Lcom/taobao/themis/kernel/render_factory/ITMSRenderFactory;", "themis_uniapp_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class TMSUniAppCardSolution extends TMSBaseUniAppSolution {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-950571709);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TMSUniAppCardSolution(f instance) {
        super(instance);
        q.d(instance, "instance");
    }

    @Override // com.taobao.themis.kernel.solution.TMSBaseSolution
    public qqg createRenderFactory() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (qqg) ipChange.ipc$dispatch("405c48c0", new Object[]{this}) : new a(this.mInstance);
    }
}
