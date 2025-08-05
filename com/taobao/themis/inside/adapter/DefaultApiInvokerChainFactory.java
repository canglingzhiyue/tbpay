package com.taobao.themis.inside.adapter;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.ability.base.ApiContext;
import com.taobao.themis.kernel.ability.register.b;
import com.taobao.themis.kernel.adapter.IApiInvokerChainFactory;
import com.taobao.themis.kernel.d;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.q;
import tb.kge;
import tb.qox;
import tb.qoy;
import tb.qpa;
import tb.qpb;
import tb.qpc;
import tb.qpd;
import tb.qph;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J(\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016¨\u0006\r"}, d2 = {"Lcom/taobao/themis/inside/adapter/DefaultApiInvokerChainFactory;", "Lcom/taobao/themis/kernel/adapter/IApiInvokerChainFactory;", "()V", "createApiInvokerChain", "Lcom/taobao/themis/kernel/ability/invoker/ApiInvoker;", "node", "Lcom/taobao/themis/kernel/Node;", "abilityInstance", "Lcom/taobao/themis/kernel/ability/base/TMSAbility;", "apiMeta", "Lcom/taobao/themis/kernel/ability/register/ApiMeta;", "params", "Lcom/alibaba/fastjson/JSONObject;", "themis_inside_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public class DefaultApiInvokerChainFactory implements IApiInvokerChainFactory {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J.\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00072\u0006\u0010\b\u001a\u00020\tH\u0096\u0002¢\u0006\u0002\u0010\n¨\u0006\u000b"}, d2 = {"com/taobao/themis/inside/adapter/DefaultApiInvokerChainFactory$createApiInvokerChain$finalApiInvoker$1", "Lcom/taobao/themis/kernel/ability/invoker/ApiMiddleware;", "invoke", "", "context", "Lcom/taobao/themis/kernel/ability/base/ApiContext;", "args", "", "callback", "Lcom/taobao/themis/kernel/ability/callback/AbilityCallback;", "(Lcom/taobao/themis/kernel/ability/base/ApiContext;[Ljava/lang/Object;Lcom/taobao/themis/kernel/ability/callback/AbilityCallback;)Ljava/lang/Object;", "themis_inside_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class a extends qpb {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ b b;
        public final /* synthetic */ com.taobao.themis.kernel.ability.base.a c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(b bVar, com.taobao.themis.kernel.ability.base.a aVar, b bVar2) {
            super(bVar2);
            this.b = bVar;
            this.c = aVar;
        }

        @Override // tb.qpa
        public Object a(ApiContext context, Object[] args, qox callback) {
            q.d(context, "context");
            q.d(args, "args");
            q.d(callback, "callback");
            try {
                return this.b.c.invoke(this.c, Arrays.copyOf(args, args.length));
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                q.a((Object) cause);
                callback.a(qoy.a("6", cause.getMessage()), false);
                return null;
            }
        }
    }

    static {
        kge.a(2001268141);
        kge.a(-251738026);
    }

    @Override // com.taobao.themis.kernel.adapter.IApiInvokerChainFactory
    public qpa createApiInvokerChain(d node, com.taobao.themis.kernel.ability.base.a abilityInstance, b apiMeta, JSONObject params) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (qpa) ipChange.ipc$dispatch("5fded9f4", new Object[]{this, node, abilityInstance, apiMeta, params});
        }
        q.d(node, "node");
        q.d(abilityInstance, "abilityInstance");
        q.d(apiMeta, "apiMeta");
        q.d(params, "params");
        qph qphVar = new qph(apiMeta);
        ArrayList<qpa> arrayList = new ArrayList();
        arrayList.add(new qpd(apiMeta, params));
        arrayList.add(new qpc(apiMeta));
        arrayList.add(new a(apiMeta, abilityInstance, apiMeta));
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
