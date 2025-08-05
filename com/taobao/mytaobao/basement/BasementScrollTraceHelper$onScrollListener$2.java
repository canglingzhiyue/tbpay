package com.taobao.mytaobao.basement;

import android.support.v7.widget.RecyclerView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import tb.ruk;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\t\n\u0000\n\u0002\b\u0003*\u0001\u0001\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "com/taobao/mytaobao/basement/BasementScrollTraceHelper$onScrollListener$2$1", "invoke", "()Lcom/taobao/mytaobao/basement/BasementScrollTraceHelper$onScrollListener$2$1;"}, k = 3, mv = {1, 1, 15})
/* loaded from: classes7.dex */
public final class BasementScrollTraceHelper$onScrollListener$2 extends Lambda implements ruk<AnonymousClass1> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ h this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BasementScrollTraceHelper$onScrollListener$2(h hVar) {
        super(0);
        this.this$0 = hVar;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    /* JADX WARN: Type inference failed for: r0v1, types: [com.taobao.mytaobao.basement.BasementScrollTraceHelper$onScrollListener$2$1] */
    @Override // tb.ruk
    /* renamed from: invoke */
    public final AnonymousClass1 mo2427invoke() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AnonymousClass1) ipChange.ipc$dispatch("b5130cca", new Object[]{this}) : new RecyclerView.OnScrollListener() { // from class: com.taobao.mytaobao.basement.BasementScrollTraceHelper$onScrollListener$2.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass1 anonymousClass1, String str, Object... objArr) {
                int hashCode = str.hashCode();
                if (hashCode == 806944192) {
                    super.onScrolled((RecyclerView) objArr[0], ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue());
                    return null;
                } else if (hashCode != 2142696127) {
                    throw new InstantReloadException(String.format("String switch could not find '%s'", str));
                } else {
                    super.onScrollStateChanged((RecyclerView) objArr[0], ((Number) objArr[1]).intValue());
                    return null;
                }
            }

            @Override // android.support.v7.widget.RecyclerView.OnScrollListener
            public void onScrolled(RecyclerView recyclerView, int i, int i2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3018fdc0", new Object[]{this, recyclerView, new Integer(i), new Integer(i2)});
                    return;
                }
                super.onScrolled(recyclerView, i, i2);
                if (i2 < 0) {
                    h.a(BasementScrollTraceHelper$onScrollListener$2.this.this$0, 0);
                } else if (i2 > 0) {
                    h.a(BasementScrollTraceHelper$onScrollListener$2.this.this$0, 1);
                    h.c(BasementScrollTraceHelper$onScrollListener$2.this.this$0);
                }
                if (!BasementScrollTraceHelper$onScrollListener$2.this.this$0.c().canScrollVertically(1)) {
                    return;
                }
                h.b(BasementScrollTraceHelper$onScrollListener$2.this.this$0, false);
            }

            @Override // android.support.v7.widget.RecyclerView.OnScrollListener
            public void onScrollStateChanged(RecyclerView recyclerView, int i) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7fb6f2bf", new Object[]{this, recyclerView, new Integer(i)});
                    return;
                }
                super.onScrollStateChanged(recyclerView, i);
                if (i == 1 || i == 2) {
                    h.d(BasementScrollTraceHelper$onScrollListener$2.this.this$0);
                } else if (i != 0) {
                } else {
                    h.e(BasementScrollTraceHelper$onScrollListener$2.this.this$0);
                }
            }
        };
    }
}
