package com.alibaba.android.nextrpc;

import com.alibaba.android.nextrpc.streamv2.request.b;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilityidl.ability.ev;
import com.taobao.android.abilityidl.ability.ew;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import mtopsdk.mtop.domain.MtopRequest;
import tb.ruk;
import tb.xif;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"getStreamRequest", "Lcom/alibaba/android/nextrpc/streamv2/request/Request;", "invoke", "com/alibaba/android/nextrpc/NextRPCAbility$request$1$1"}, k = 3, mv = {1, 4, 1})
/* loaded from: classes2.dex */
public final class NextRPCAbility$request$$inlined$run$lambda$1 extends Lambda implements ruk<b> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ ew $params$inlined;
    public final /* synthetic */ Ref.ObjectRef $performance$inlined;
    public final /* synthetic */ Ref.ObjectRef $request$inlined;
    public final /* synthetic */ NextRPCAbility $this_run;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NextRPCAbility$request$$inlined$run$lambda$1(NextRPCAbility nextRPCAbility, Ref.ObjectRef objectRef, ew ewVar, Ref.ObjectRef objectRef2) {
        super(0);
        this.$this_run = nextRPCAbility;
        this.$performance$inlined = objectRef;
        this.$params$inlined = ewVar;
        this.$request$inlined = objectRef2;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // tb.ruk
    /* renamed from: invoke */
    public final b mo2427invoke() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("13f8819", new Object[]{this});
        }
        NextRPCAbility nextRPCAbility = this.$this_run;
        ew ewVar = this.$params$inlined;
        MtopRequest mtopRequest = NextRPCAbility.$ipChange;
        NextRPCAbility nextRPCAbility2 = this.$this_run;
        ew ewVar2 = this.$params$inlined;
        b bVar = new b(mtopRequest, NextRPCAbility.$ipChange, (xif) this.$performance$inlined.element, 0, null, null, 56, null);
        ev evVar = this.$params$inlined.c;
        if (evVar != null) {
            bVar.a(evVar.k);
        }
        bVar.a(Boolean.valueOf(this.$params$inlined.d));
        return bVar;
    }
}
