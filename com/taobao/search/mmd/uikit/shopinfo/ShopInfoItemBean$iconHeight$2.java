package com.taobao.search.mmd.uikit.shopinfo;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.mmd.util.d;
import java.util.Map;
import kotlin.jvm.internal.Lambda;
import tb.ruk;

/* loaded from: classes7.dex */
public final class ShopInfoItemBean$iconHeight$2 extends Lambda implements ruk<Integer> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ Map $props;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShopInfoItemBean$iconHeight$2(Map map) {
        super(0);
        this.$props = map;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.lang.Integer] */
    @Override // tb.ruk
    /* renamed from: invoke  reason: collision with other method in class */
    public /* synthetic */ Integer mo2427invoke() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("5a980813", new Object[]{this}) : Integer.valueOf(mo2427invoke());
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [int, java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r0v9, types: [int, java.lang.Integer] */
    @Override // tb.ruk
    /* renamed from: invoke */
    public final Integer mo2427invoke() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7560ccf2", new Object[]{this})).intValue();
        }
        Object obj = this.$props.get("iconHeight");
        if (!(obj instanceof String)) {
            obj = null;
        }
        return d.b((String) obj, 0);
    }
}
