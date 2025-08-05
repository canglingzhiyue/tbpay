package com.taobao.android.order.bundle.weex2;

import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import tb.iro;
import tb.ruk;
import tb.spk;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 4, 1})
/* loaded from: classes6.dex */
public final class TBRefundInstanceManager$enableImagePrefetch$2 extends Lambda implements ruk<Boolean> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final TBRefundInstanceManager$enableImagePrefetch$2 INSTANCE = new TBRefundInstanceManager$enableImagePrefetch$2();

    public TBRefundInstanceManager$enableImagePrefetch$2() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Boolean, java.lang.Object] */
    @Override // tb.ruk
    /* renamed from: invoke */
    public /* synthetic */ Boolean mo2427invoke() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("5a980813", new Object[]{this}) : Boolean.valueOf(mo2427invoke());
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Boolean, boolean] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Boolean, boolean] */
    @Override // tb.ruk
    /* renamed from: invoke  reason: collision with other method in class */
    public final Boolean mo2427invoke() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("7560cd03", new Object[]{this})).booleanValue() : spk.a(iro.ORANGE_KEY_MY_TAOBAO, "enableImagePrefetch", true);
    }
}
