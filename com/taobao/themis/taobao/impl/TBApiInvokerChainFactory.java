package com.taobao.themis.taobao.impl;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.inside.adapter.DefaultApiInvokerChainFactory;
import com.taobao.themis.kernel.page.ITMSPage;
import com.taobao.themis.kernel.solution.TMSSolutionType;
import com.taobao.themis.kernel.utils.o;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.q;
import tb.kge;
import tb.qpa;
import tb.qpb;
import tb.qph;
import tb.tlo;
import tb.tlr;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J(\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016¨\u0006\r"}, d2 = {"Lcom/taobao/themis/taobao/impl/TBApiInvokerChainFactory;", "Lcom/taobao/themis/inside/adapter/DefaultApiInvokerChainFactory;", "()V", "createApiInvokerChain", "Lcom/taobao/themis/kernel/ability/invoker/ApiInvoker;", "node", "Lcom/taobao/themis/kernel/Node;", "abilityInstance", "Lcom/taobao/themis/kernel/ability/base/TMSAbility;", "apiMeta", "Lcom/taobao/themis/kernel/ability/register/ApiMeta;", "params", "Lcom/alibaba/fastjson/JSONObject;", "themis_taobao_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class TBApiInvokerChainFactory extends DefaultApiInvokerChainFactory {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-941828421);
    }

    public static /* synthetic */ Object ipc$super(TBApiInvokerChainFactory tBApiInvokerChainFactory, String str, Object... objArr) {
        if (str.hashCode() == 1608440308) {
            return super.createApiInvokerChain((com.taobao.themis.kernel.d) objArr[0], (com.taobao.themis.kernel.ability.base.a) objArr[1], (com.taobao.themis.kernel.ability.register.b) objArr[2], (JSONObject) objArr[3]);
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.themis.inside.adapter.DefaultApiInvokerChainFactory, com.taobao.themis.kernel.adapter.IApiInvokerChainFactory
    public qpa createApiInvokerChain(com.taobao.themis.kernel.d node, com.taobao.themis.kernel.ability.base.a abilityInstance, com.taobao.themis.kernel.ability.register.b apiMeta, JSONObject params) {
        com.taobao.themis.kernel.f fVar;
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (qpa) ipChange.ipc$dispatch("5fded9f4", new Object[]{this, node, abilityInstance, apiMeta, params});
        }
        q.d(node, "node");
        q.d(abilityInstance, "abilityInstance");
        q.d(apiMeta, "apiMeta");
        q.d(params, "params");
        qpa createApiInvokerChain = super.createApiInvokerChain(node, abilityInstance, apiMeta, params);
        qph qphVar = new qph(apiMeta);
        if (node instanceof ITMSPage) {
            fVar = ((ITMSPage) node).b();
        } else {
            fVar = (com.taobao.themis.kernel.f) node;
        }
        ArrayList<qpa> arrayList = new ArrayList();
        TMSSolutionType j = fVar.j();
        if (j != null && ((i = h.$EnumSwitchMapping$0[j.ordinal()]) == 1 || i == 2 || i == 3)) {
            arrayList.add(0, new tlo(apiMeta, params));
        }
        if (o.f(fVar)) {
            arrayList.add(new tlr(apiMeta));
        }
        arrayList.add(createApiInvokerChain);
        qpb qpbVar = qphVar;
        for (qpa qpaVar : arrayList) {
            if (qpaVar == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.taobao.themis.kernel.ability.invoker.ApiMiddleware");
            }
            qpbVar = qpbVar.a((qpb) qpaVar);
            q.b(qpbVar, "next.setNext(middleware as ApiMiddleware)");
        }
        return qphVar;
    }
}
