package com.alibaba.ability.env;

import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Pair;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.q;
import tb.rul;

/* loaded from: classes2.dex */
public final class PerfTracer$Companion$upload$1$5 extends Lambda implements rul<Pair<? extends String, ? extends Pair<? extends Long, ? extends Long>>, CharSequence> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final PerfTracer$Companion$upload$1$5 INSTANCE = new PerfTracer$Companion$upload$1$5();

    public PerfTracer$Companion$upload$1$5() {
        super(1);
    }

    @Override // tb.rul
    /* renamed from: invoke */
    public /* bridge */ /* synthetic */ CharSequence mo2421invoke(Pair<? extends String, ? extends Pair<? extends Long, ? extends Long>> pair) {
        return invoke2((Pair<String, Pair<Long, Long>>) pair);
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final CharSequence invoke2(Pair<String, Pair<Long, Long>> it) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CharSequence) ipChange.ipc$dispatch("dc43f720", new Object[]{this, it});
        }
        q.d(it, "it");
        return it.getFirst() + "=start:" + it.getSecond().getFirst().longValue() + "duration:" + it.getSecond().getSecond().longValue();
    }
}
