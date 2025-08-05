package com.taobao.mytaobao.basement;

import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import tb.ruk;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/view/View$OnTouchListener;", "invoke"}, k = 3, mv = {1, 1, 15})
/* loaded from: classes7.dex */
public final class BasementScrollTraceHelper$onTouchListener$2 extends Lambda implements ruk<View.OnTouchListener> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ h this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BasementScrollTraceHelper$onTouchListener$2(h hVar) {
        super(0);
        this.this$0 = hVar;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // tb.ruk
    /* renamed from: invoke */
    public final View.OnTouchListener mo2427invoke() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View.OnTouchListener) ipChange.ipc$dispatch("e21264d1", new Object[]{this}) : new View.OnTouchListener() { // from class: com.taobao.mytaobao.basement.BasementScrollTraceHelper$onTouchListener$2.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Code restructure failed: missing block: B:9:0x002e, code lost:
                if (r7 != 3) goto L10;
             */
            @Override // android.view.View.OnTouchListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final boolean onTouch(android.view.View r7, android.view.MotionEvent r8) {
                /*
                    r6 = this;
                    com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.mytaobao.basement.BasementScrollTraceHelper$onTouchListener$2.AnonymousClass1.$ipChange
                    boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
                    r2 = 3
                    r3 = 2
                    r4 = 1
                    r5 = 0
                    if (r1 == 0) goto L1f
                    java.lang.Object[] r1 = new java.lang.Object[r2]
                    r1[r5] = r6
                    r1[r4] = r7
                    r1[r3] = r8
                    java.lang.String r7 = "d4aa3aa4"
                    java.lang.Object r7 = r0.ipc$dispatch(r7, r1)
                    java.lang.Boolean r7 = (java.lang.Boolean) r7
                    boolean r7 = r7.booleanValue()
                    return r7
                L1f:
                    java.lang.String r7 = "event"
                    kotlin.jvm.internal.q.a(r8, r7)
                    int r7 = r8.getAction()
                    r0 = -1082130432(0xffffffffbf800000, float:-1.0)
                    if (r7 == r4) goto L69
                    if (r7 == r3) goto L31
                    if (r7 == r2) goto L69
                    goto L77
                L31:
                    com.taobao.mytaobao.basement.BasementScrollTraceHelper$onTouchListener$2 r7 = com.taobao.mytaobao.basement.BasementScrollTraceHelper$onTouchListener$2.this
                    com.taobao.mytaobao.basement.h r7 = r7.this$0
                    boolean r7 = com.taobao.mytaobao.basement.h.a(r7)
                    if (r7 == 0) goto L3c
                    return r5
                L3c:
                    com.taobao.mytaobao.basement.BasementScrollTraceHelper$onTouchListener$2 r7 = com.taobao.mytaobao.basement.BasementScrollTraceHelper$onTouchListener$2.this
                    com.taobao.mytaobao.basement.h r7 = r7.this$0
                    float r7 = com.taobao.mytaobao.basement.h.b(r7)
                    int r7 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
                    if (r7 != 0) goto L54
                    com.taobao.mytaobao.basement.BasementScrollTraceHelper$onTouchListener$2 r7 = com.taobao.mytaobao.basement.BasementScrollTraceHelper$onTouchListener$2.this
                    com.taobao.mytaobao.basement.h r7 = r7.this$0
                    float r8 = r8.getY()
                    com.taobao.mytaobao.basement.h.a(r7, r8)
                    goto L77
                L54:
                    float r7 = r8.getY()
                    com.taobao.mytaobao.basement.BasementScrollTraceHelper$onTouchListener$2 r8 = com.taobao.mytaobao.basement.BasementScrollTraceHelper$onTouchListener$2.this
                    com.taobao.mytaobao.basement.h r8 = r8.this$0
                    float r8 = com.taobao.mytaobao.basement.h.b(r8)
                    float r7 = r7 - r8
                    com.taobao.mytaobao.basement.BasementScrollTraceHelper$onTouchListener$2 r8 = com.taobao.mytaobao.basement.BasementScrollTraceHelper$onTouchListener$2.this
                    com.taobao.mytaobao.basement.h r8 = r8.this$0
                    com.taobao.mytaobao.basement.h.b(r8, r7)
                    goto L77
                L69:
                    com.taobao.mytaobao.basement.BasementScrollTraceHelper$onTouchListener$2 r7 = com.taobao.mytaobao.basement.BasementScrollTraceHelper$onTouchListener$2.this
                    com.taobao.mytaobao.basement.h r7 = r7.this$0
                    com.taobao.mytaobao.basement.h.a(r7, r5)
                    com.taobao.mytaobao.basement.BasementScrollTraceHelper$onTouchListener$2 r7 = com.taobao.mytaobao.basement.BasementScrollTraceHelper$onTouchListener$2.this
                    com.taobao.mytaobao.basement.h r7 = r7.this$0
                    com.taobao.mytaobao.basement.h.a(r7, r0)
                L77:
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.taobao.mytaobao.basement.BasementScrollTraceHelper$onTouchListener$2.AnonymousClass1.onTouch(android.view.View, android.view.MotionEvent):boolean");
            }
        };
    }
}
