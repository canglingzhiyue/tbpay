package com.taobao.themis.uniapp.solution.extension.instance;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.metaInfo.manifest.DataPrefetch;
import com.taobao.themis.uniapp.solution.extension.instance.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.q;
import tb.rul;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003¨\u0006\u0005"}, d2 = {"<anonymous>", "", "originData", "invoke", "com/taobao/themis/uniapp/solution/extension/instance/MTOPPrefetchExtension$generateRequestParams$2$1$1", "com/taobao/themis/uniapp/solution/extension/instance/MTOPPrefetchExtension$$special$$inlined$apply$lambda$1"}, k = 3, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class MTOPPrefetchExtension$generateRequestParams$$inlined$mapNotNull$lambda$1 extends Lambda implements rul<String, String> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ DataPrefetch $dataPrefetch$inlined;
    public final /* synthetic */ b.C0981b $dataProvider$inlined;
    public final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MTOPPrefetchExtension$generateRequestParams$$inlined$mapNotNull$lambda$1(DataPrefetch dataPrefetch, b bVar, b.C0981b c0981b) {
        super(1);
        this.$dataPrefetch$inlined = dataPrefetch;
        this.this$0 = bVar;
        this.$dataProvider$inlined = c0981b;
    }

    @Override // tb.rul
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final String mo2421invoke(String originData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3bed32b7", new Object[]{this, originData});
        }
        q.d(originData, "originData");
        b bVar = this.this$0;
        b.C0981b c0981b = this.$dataProvider$inlined;
        return b.$ipChange;
    }
}
