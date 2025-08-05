package com.taobao.mytaobao.basement;

import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import tb.ruk;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/view/View$OnTouchListener;", "invoke"}, k = 3, mv = {1, 1, 15})
/* loaded from: classes7.dex */
public final class BasementCeilingHelper$onTouchListener$2 extends Lambda implements ruk<View.OnTouchListener> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BasementCeilingHelper$onTouchListener$2(c cVar) {
        super(0);
        this.this$0 = cVar;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // tb.ruk
    /* renamed from: invoke */
    public final View.OnTouchListener mo2427invoke() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View.OnTouchListener) ipChange.ipc$dispatch("e21264d1", new Object[]{this}) : new View.OnTouchListener() { // from class: com.taobao.mytaobao.basement.BasementCeilingHelper$onTouchListener$2.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Code restructure failed: missing block: B:21:0x0064, code lost:
                if (r7.getAction() == 3) goto L13;
             */
            @Override // android.view.View.OnTouchListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final boolean onTouch(android.view.View r6, android.view.MotionEvent r7) {
                /*
                    r5 = this;
                    com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.mytaobao.basement.BasementCeilingHelper$onTouchListener$2.AnonymousClass1.$ipChange
                    boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
                    r2 = 3
                    r3 = 1
                    r4 = 0
                    if (r1 == 0) goto L1f
                    java.lang.Object[] r1 = new java.lang.Object[r2]
                    r1[r4] = r5
                    r1[r3] = r6
                    r6 = 2
                    r1[r6] = r7
                    java.lang.String r6 = "d4aa3aa4"
                    java.lang.Object r6 = r0.ipc$dispatch(r6, r1)
                    java.lang.Boolean r6 = (java.lang.Boolean) r6
                    boolean r6 = r6.booleanValue()
                    return r6
                L1f:
                    com.taobao.mytaobao.basement.BasementCeilingHelper$onTouchListener$2 r6 = com.taobao.mytaobao.basement.BasementCeilingHelper$onTouchListener$2.this
                    com.taobao.mytaobao.basement.c r6 = r6.this$0
                    java.lang.String r0 = "event"
                    kotlin.jvm.internal.q.a(r7, r0)
                    int r0 = r7.getAction()
                    if (r0 == r3) goto L36
                    int r0 = r7.getAction()
                    if (r0 == r2) goto L36
                    r0 = 1
                    goto L37
                L36:
                    r0 = 0
                L37:
                    com.taobao.mytaobao.basement.c.a(r6, r0)
                    int r6 = r7.getAction()
                    if (r6 != 0) goto L48
                L40:
                    com.taobao.mytaobao.basement.BasementCeilingHelper$onTouchListener$2 r6 = com.taobao.mytaobao.basement.BasementCeilingHelper$onTouchListener$2.this
                    com.taobao.mytaobao.basement.c r6 = r6.this$0
                    com.taobao.mytaobao.basement.c.a(r6, r4)
                    goto L67
                L48:
                    int r6 = r7.getAction()
                    if (r6 != r3) goto L60
                    com.taobao.mytaobao.basement.BasementCeilingHelper$onTouchListener$2 r6 = com.taobao.mytaobao.basement.BasementCeilingHelper$onTouchListener$2.this
                    com.taobao.mytaobao.basement.c r6 = r6.this$0
                    int r6 = com.taobao.mytaobao.basement.c.b(r6)
                    if (r6 != r3) goto L40
                    com.taobao.mytaobao.basement.BasementCeilingHelper$onTouchListener$2 r6 = com.taobao.mytaobao.basement.BasementCeilingHelper$onTouchListener$2.this
                    com.taobao.mytaobao.basement.c r6 = r6.this$0
                    com.taobao.mytaobao.basement.c.c(r6)
                    goto L40
                L60:
                    int r6 = r7.getAction()
                    if (r6 != r2) goto L67
                    goto L40
                L67:
                    return r4
                */
                throw new UnsupportedOperationException("Method not decompiled: com.taobao.mytaobao.basement.BasementCeilingHelper$onTouchListener$2.AnonymousClass1.onTouch(android.view.View, android.view.MotionEvent):boolean");
            }
        };
    }
}
