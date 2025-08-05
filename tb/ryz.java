package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.LinkedList;
import java.util.List;

/* loaded from: classes.dex */
public class ryz implements rzl {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final List<rzk> f33431a = new LinkedList();
    public final List<rzj> b = new LinkedList();

    public void a(rzk rzkVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe063cd5", new Object[]{this, rzkVar});
        } else {
            this.f33431a.add(rzkVar);
        }
    }

    public void a(rzj rzjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe05c876", new Object[]{this, rzjVar});
        } else {
            this.b.add(rzjVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(java.lang.String r11, mtopsdk.ssrcore.c r12) {
        /*
            r10 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = tb.ryz.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L18
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r10
            r2 = 1
            r1[r2] = r11
            r11 = 2
            r1[r11] = r12
            java.lang.String r11 = "160d66e7"
            r0.ipc$dispatch(r11, r1)
            return
        L18:
            java.util.List<tb.rzk> r11 = r10.f33431a
            java.util.Iterator r11 = r11.iterator()
        L1e:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L96
            java.lang.Object r0 = r11.next()
            tb.rzk r0 = (tb.rzk) r0
            long r1 = java.lang.System.currentTimeMillis()
            java.lang.String r3 = r0.a(r12)
            mtopsdk.common.util.TBSdkLog$LogEnable r4 = mtopsdk.common.util.TBSdkLog.LogEnable.DebugEnable
            boolean r4 = mtopsdk.common.util.TBSdkLog.isLogEnable(r4)
            java.lang.String r5 = "[start]execute BeforeFilter: "
            java.lang.String r6 = "ssr.AbstractSsrFilterManager"
            if (r4 == 0) goto L64
            java.lang.String r4 = r12.b
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r5)
            java.lang.String r8 = r0.a()
            r7.append(r8)
            java.lang.String r8 = ",time(ms)= "
            r7.append(r8)
            long r8 = java.lang.System.currentTimeMillis()
            long r8 = r8 - r1
            r7.append(r8)
            java.lang.String r1 = r7.toString()
            mtopsdk.common.util.TBSdkLog.d(r6, r4, r1)
        L64:
            if (r3 == 0) goto L6e
            java.lang.String r1 = "STOP"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L1e
        L6e:
            mtopsdk.common.util.TBSdkLog$LogEnable r11 = mtopsdk.common.util.TBSdkLog.LogEnable.InfoEnable
            boolean r11 = mtopsdk.common.util.TBSdkLog.isLogEnable(r11)
            if (r11 == 0) goto L96
            java.lang.String r11 = r12.b
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r5)
            java.lang.String r0 = r0.a()
            r12.append(r0)
            java.lang.String r0 = ",result="
            r12.append(r0)
            r12.append(r3)
            java.lang.String r12 = r12.toString()
            mtopsdk.common.util.TBSdkLog.i(r6, r11, r12)
        L96:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.ryz.a(java.lang.String, mtopsdk.ssrcore.c):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    @Override // tb.rzl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void b(java.lang.String r11, mtopsdk.ssrcore.c r12) {
        /*
            r10 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = tb.ryz.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L18
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r10
            r2 = 1
            r1[r2] = r11
            r11 = 2
            r1[r11] = r12
            java.lang.String r11 = "1d729c06"
            r0.ipc$dispatch(r11, r1)
            return
        L18:
            java.util.List<tb.rzj> r11 = r10.b
            java.util.Iterator r11 = r11.iterator()
        L1e:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L96
            java.lang.Object r0 = r11.next()
            tb.rzj r0 = (tb.rzj) r0
            long r1 = java.lang.System.currentTimeMillis()
            java.lang.String r3 = r0.b(r12)
            mtopsdk.common.util.TBSdkLog$LogEnable r4 = mtopsdk.common.util.TBSdkLog.LogEnable.DebugEnable
            boolean r4 = mtopsdk.common.util.TBSdkLog.isLogEnable(r4)
            java.lang.String r5 = "[callback]execute AfterFilter: "
            java.lang.String r6 = "ssr.AbstractSsrFilterManager"
            if (r4 == 0) goto L64
            java.lang.String r4 = r12.b
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r5)
            java.lang.String r8 = r0.a()
            r7.append(r8)
            java.lang.String r8 = ",time(ms)= "
            r7.append(r8)
            long r8 = java.lang.System.currentTimeMillis()
            long r8 = r8 - r1
            r7.append(r8)
            java.lang.String r1 = r7.toString()
            mtopsdk.common.util.TBSdkLog.d(r6, r4, r1)
        L64:
            if (r3 == 0) goto L6e
            java.lang.String r1 = "STOP"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L1e
        L6e:
            mtopsdk.common.util.TBSdkLog$LogEnable r11 = mtopsdk.common.util.TBSdkLog.LogEnable.InfoEnable
            boolean r11 = mtopsdk.common.util.TBSdkLog.isLogEnable(r11)
            if (r11 == 0) goto L96
            java.lang.String r11 = r12.b
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r5)
            java.lang.String r0 = r0.a()
            r12.append(r0)
            java.lang.String r0 = ",result="
            r12.append(r0)
            r12.append(r3)
            java.lang.String r12 = r12.toString()
            mtopsdk.common.util.TBSdkLog.i(r6, r11, r12)
        L96:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.ryz.b(java.lang.String, mtopsdk.ssrcore.c):void");
    }
}
