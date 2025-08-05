package com.alibaba.android.ultron.vfw.storage;

import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import tb.jap;
import tb.ruk;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/taobao/android/abilityidl/abilitynative/MegaUserKVStorage;", "invoke"}, k = 3, mv = {1, 4, 1})
/* loaded from: classes2.dex */
public final class TradeCache$localCache$2 extends Lambda implements ruk<jap> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final TradeCache$localCache$2 INSTANCE = new TradeCache$localCache$2();

    public TradeCache$localCache$2() {
        super(0);
    }

    @Override // tb.ruk
    /* renamed from: invoke  reason: collision with other method in class */
    public final jap mo2427invoke() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (jap) ipChange.ipc$dispatch("3b3765ae", new Object[]{this}) : jap.a();
    }
}
