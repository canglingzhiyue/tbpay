package com.taobao.mytaobao.scroll;

import android.support.v7.widget.RecyclerView;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import tb.ruk;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\t\n\u0000\n\u0002\b\u0003*\u0001\u0001\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "com/taobao/mytaobao/scroll/WeexNestedScrollHelper$flingListener$2$1", "invoke", "()Lcom/taobao/mytaobao/scroll/WeexNestedScrollHelper$flingListener$2$1;"}, k = 3, mv = {1, 1, 15})
/* loaded from: classes7.dex */
public final class WeexNestedScrollHelper$flingListener$2 extends Lambda implements ruk<AnonymousClass1> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WeexNestedScrollHelper$flingListener$2(a aVar) {
        super(0);
        this.this$0 = aVar;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    /* JADX WARN: Type inference failed for: r0v1, types: [com.taobao.mytaobao.scroll.WeexNestedScrollHelper$flingListener$2$1] */
    @Override // tb.ruk
    /* renamed from: invoke */
    public final AnonymousClass1 mo2427invoke() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AnonymousClass1) ipChange.ipc$dispatch("26cccf16", new Object[]{this}) : new RecyclerView.OnFlingListener() { // from class: com.taobao.mytaobao.scroll.WeexNestedScrollHelper$flingListener$2.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.support.v7.widget.RecyclerView.OnFlingListener
            public boolean onFling(int i, int i2) {
                int i3;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("8af30028", new Object[]{this, new Integer(i), new Integer(i2)})).booleanValue();
                }
                int computeVerticalScrollRange = a.a(WeexNestedScrollHelper$flingListener$2.this.this$0).computeVerticalScrollRange();
                int computeVerticalScrollOffset = a.a(WeexNestedScrollHelper$flingListener$2.this.this$0).computeVerticalScrollOffset();
                if (i2 > 0 && (i3 = computeVerticalScrollOffset + i2) >= computeVerticalScrollRange) {
                    a.a(WeexNestedScrollHelper$flingListener$2.this.this$0, i3 - computeVerticalScrollRange);
                }
                return false;
            }
        };
    }
}
