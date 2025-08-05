package com.taobao.mytaobao.scroll;

import android.view.MotionEvent;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.q;
import tb.ruk;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/view/View$OnTouchListener;", "invoke"}, k = 3, mv = {1, 1, 15})
/* loaded from: classes7.dex */
public final class WeexNestedScrollHelper$onTouchListener$2 extends Lambda implements ruk<View.OnTouchListener> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WeexNestedScrollHelper$onTouchListener$2(a aVar) {
        super(0);
        this.this$0 = aVar;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // tb.ruk
    /* renamed from: invoke */
    public final View.OnTouchListener mo2427invoke() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View.OnTouchListener) ipChange.ipc$dispatch("e21264d1", new Object[]{this}) : new View.OnTouchListener() { // from class: com.taobao.mytaobao.scroll.WeexNestedScrollHelper$onTouchListener$2.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent event) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("d4aa3aa4", new Object[]{this, view, event})).booleanValue();
                }
                a aVar = WeexNestedScrollHelper$onTouchListener$2.this.this$0;
                q.a((Object) event, "event");
                a.a(aVar, event);
                return true;
            }
        };
    }
}
