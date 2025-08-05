package com.taobao.mytaobao.basement.weex;

import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import tb.ruk;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/view/View$OnLayoutChangeListener;", "invoke"}, k = 3, mv = {1, 1, 15})
/* loaded from: classes7.dex */
public final class BasementWeexView$layoutChangeListener$2 extends Lambda implements ruk<View.OnLayoutChangeListener> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ BasementWeexView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BasementWeexView$layoutChangeListener$2(BasementWeexView basementWeexView) {
        super(0);
        this.this$0 = basementWeexView;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // tb.ruk
    /* renamed from: invoke */
    public final View.OnLayoutChangeListener mo2427invoke() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View.OnLayoutChangeListener) ipChange.ipc$dispatch("2aee9844", new Object[]{this}) : new View.OnLayoutChangeListener() { // from class: com.taobao.mytaobao.basement.weex.BasementWeexView$layoutChangeListener$2.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("899df952", new Object[]{this, view, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6), new Integer(i7), new Integer(i8)});
                } else {
                    BasementWeexView.access$processOnLayoutChange(BasementWeexView$layoutChangeListener$2.this.this$0, i, i2, i3, i4);
                }
            }
        };
    }
}
