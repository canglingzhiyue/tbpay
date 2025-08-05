package com.alibaba.ability.impl.audio;

import com.alibaba.ability.impl.audio.AudioService;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.avplayer.n;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.ruw;

/* loaded from: classes2.dex */
public final class AudioService$setupPlayer$3$2 extends Lambda implements ruw<k, i, t> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ int $it;
    public final /* synthetic */ AudioService.e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AudioService$setupPlayer$3$2(AudioService.e eVar, int i) {
        super(2);
        this.this$0 = eVar;
        this.$it = i;
    }

    @Override // tb.ruw
    /* renamed from: invoke */
    public /* bridge */ /* synthetic */ t mo2423invoke(k kVar, i iVar) {
        invoke2(kVar, iVar);
        return t.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(k listener, i info) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("177b1e0d", new Object[]{this, listener, info});
            return;
        }
        q.d(listener, "listener");
        q.d(info, "info");
        n instance = this.this$0.b;
        q.b(instance, "instance");
        if (instance.i() == 1) {
            z = true;
        }
        l lVar = new l(z);
        lVar.b = this.$it;
        n instance2 = this.this$0.b;
        q.b(instance2, "instance");
        lVar.d = instance2.q();
        t tVar = t.INSTANCE;
        listener.a(info, lVar);
    }
}
