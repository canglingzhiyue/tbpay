package com.taobao.mytaobao.pagev2;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.mtz;
import tb.nwv;
import tb.rul;
import tb.xol;
import tb.xoq;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "dxNameList", "", "", "invoke"}, k = 3, mv = {1, 1, 15})
/* loaded from: classes7.dex */
public final class MtbBizProxyV2$initData$1 extends Lambda implements rul<List<? extends String>, t> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MtbBizProxyV2$initData$1(a aVar) {
        super(1);
        this.this$0 = aVar;
    }

    @Override // tb.rul
    /* renamed from: invoke */
    public /* bridge */ /* synthetic */ t mo2421invoke(List<? extends String> list) {
        invoke2((List<String>) list);
        return t.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(final List<String> dxNameList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("166b7bf0", new Object[]{this, dxNameList});
            return;
        }
        q.c(dxNameList, "dxNameList");
        mtz.a(new Runnable() { // from class: com.taobao.mytaobao.pagev2.MtbBizProxyV2$initData$1.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public final void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                nwv.f("listenDxDownload callback");
                List<xol> a2 = a.c(MtbBizProxyV2$initData$1.this.this$0).a();
                a.a(MtbBizProxyV2$initData$1.this.this$0, a2, new xoq(a2, dxNameList));
            }
        });
    }
}
