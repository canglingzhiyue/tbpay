package com.taobao.android.live.plugin.atype.flexalocal.bottom.control.share;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Comparator;
import java.util.LinkedList;
import tb.kge;

/* loaded from: classes5.dex */
public class OrderList<E> extends LinkedList<E> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private Comparator<? super E> mNameComparator;
    private Comparator<? super E> mOrderComparator;

    static {
        kge.a(2092584402);
    }

    public OrderList(Comparator<? super E> comparator, Comparator<? super E> comparator2) {
        this.mNameComparator = comparator;
        this.mOrderComparator = comparator2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0047, code lost:
        r0.add(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004a, code lost:
        return true;
     */
    @Override // java.util.LinkedList, java.util.Deque, java.util.Queue
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean offer(E r5) {
        /*
            r4 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.android.live.plugin.atype.flexalocal.bottom.control.share.OrderList.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 1
            if (r1 == 0) goto L1c
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r3 = 0
            r1[r3] = r4
            r1[r2] = r5
            java.lang.String r5 = "4209ae03"
            java.lang.Object r5 = r0.ipc$dispatch(r5, r1)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            return r5
        L1c:
            java.util.Iterator r0 = r4.iterator()
            java.util.ListIterator r0 = (java.util.ListIterator) r0
        L22:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L47
            java.lang.Object r1 = r0.next()
            java.util.Comparator<? super E> r3 = r4.mNameComparator
            if (r3 == 0) goto L3a
            int r3 = r3.compare(r1, r5)
            if (r3 != 0) goto L3a
            r0.set(r5)
            return r2
        L3a:
            java.util.Comparator<? super E> r3 = r4.mOrderComparator
            if (r3 == 0) goto L22
            int r1 = r3.compare(r1, r5)
            if (r1 >= 0) goto L22
            r0.previous()
        L47:
            r0.add(r5)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.live.plugin.atype.flexalocal.bottom.control.share.OrderList.offer(java.lang.Object):boolean");
    }
}
