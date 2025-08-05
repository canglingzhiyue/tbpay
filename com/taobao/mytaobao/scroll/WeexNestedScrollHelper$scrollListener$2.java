package com.taobao.mytaobao.scroll;

import android.support.v7.widget.RecyclerView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.p;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.q;
import tb.ruk;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\t\n\u0000\n\u0002\b\u0003*\u0001\u0001\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "com/taobao/mytaobao/scroll/WeexNestedScrollHelper$scrollListener$2$1", "invoke", "()Lcom/taobao/mytaobao/scroll/WeexNestedScrollHelper$scrollListener$2$1;"}, k = 3, mv = {1, 1, 15})
/* loaded from: classes7.dex */
public final class WeexNestedScrollHelper$scrollListener$2 extends Lambda implements ruk<AnonymousClass1> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WeexNestedScrollHelper$scrollListener$2(a aVar) {
        super(0);
        this.this$0 = aVar;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    /* JADX WARN: Type inference failed for: r0v1, types: [com.taobao.mytaobao.scroll.WeexNestedScrollHelper$scrollListener$2$1] */
    @Override // tb.ruk
    /* renamed from: invoke */
    public final AnonymousClass1 mo2427invoke() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AnonymousClass1) ipChange.ipc$dispatch("9ead5379", new Object[]{this}) : new RecyclerView.OnScrollListener() { // from class: com.taobao.mytaobao.scroll.WeexNestedScrollHelper$scrollListener$2.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass1 anonymousClass1, String str, Object... objArr) {
                if (str.hashCode() == 806944192) {
                    super.onScrolled((RecyclerView) objArr[0], ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue());
                    return null;
                }
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            }

            @Override // android.support.v7.widget.RecyclerView.OnScrollListener
            public void onScrolled(RecyclerView recyclerView, int i, int i2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3018fdc0", new Object[]{this, recyclerView, new Integer(i), new Integer(i2)});
                    return;
                }
                q.c(recyclerView, "recyclerView");
                super.onScrolled(recyclerView, i, i2);
                if (i2 == 0) {
                    return;
                }
                if (!a.a(WeexNestedScrollHelper$scrollListener$2.this.this$0).canScrollVertically(2)) {
                    WeexNestedScrollHelper$scrollListener$2.this.this$0.a(true);
                } else {
                    WeexNestedScrollHelper$scrollListener$2.this.this$0.a(false);
                }
                if (i2 <= 0 || a.a(WeexNestedScrollHelper$scrollListener$2.this.this$0).canScrollVertically(2)) {
                    return;
                }
                a aVar = WeexNestedScrollHelper$scrollListener$2.this.this$0;
                if (a.$ipChange <= 0) {
                    return;
                }
                a aVar2 = WeexNestedScrollHelper$scrollListener$2.this.this$0;
                p mInstance = a.$ipChange.getMInstance();
                if (mInstance != null) {
                    a aVar3 = WeexNestedScrollHelper$scrollListener$2.this.this$0;
                    mInstance.scrollToDecelerate((int) (a.$ipChange * 0.5f));
                }
                a.a(WeexNestedScrollHelper$scrollListener$2.this.this$0, 0);
            }
        };
    }
}
