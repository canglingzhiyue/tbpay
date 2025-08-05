package tao.reactivex.d.h;

import com.android.alibaba.ip.runtime.IpChange;
import tb.jrg;
import tb.kge;

/* loaded from: classes9.dex */
public class a<T> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final int f25143a;
    public final Object[] b;
    public Object[] c;
    public int d;

    /* renamed from: tao.reactivex.d.h.a$a  reason: collision with other inner class name */
    /* loaded from: classes9.dex */
    public interface InterfaceC1082a<T> extends jrg<T> {
        @Override // tb.jrg
        boolean test(T t);
    }

    static {
        kge.a(-1471011214);
    }

    public a(int i) {
        this.f25143a = i;
        this.b = new Object[i + 1];
        this.c = this.b;
    }

    public void a(T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6251244", new Object[]{this, t});
            return;
        }
        int i = this.f25143a;
        int i2 = this.d;
        if (i2 == i) {
            Object[] objArr = new Object[i + 1];
            this.c[i] = objArr;
            this.c = objArr;
            i2 = 0;
        }
        this.c[i2] = t;
        this.d = i2 + 1;
    }

    public void a(InterfaceC1082a<? super T> interfaceC1082a) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6bd7008a", new Object[]{this, interfaceC1082a});
            return;
        }
        int i = this.f25143a;
        for (Object[] objArr = this.b; objArr != null; objArr = objArr[i]) {
            for (int i2 = 0; i2 < i; i2++) {
                Object obj = objArr[i2];
                if (obj != null && !interfaceC1082a.test(obj)) {
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0033, code lost:
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public <U> boolean a(tao.reactivex.j<? super U> r7) {
        /*
            r6 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = tao.reactivex.d.h.a.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L1c
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r3] = r6
            r1[r2] = r7
            java.lang.String r7 = "aac18b30"
            java.lang.Object r7 = r0.ipc$dispatch(r7, r1)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            return r7
        L1c:
            java.lang.Object[] r0 = r6.b
            int r1 = r6.f25143a
        L20:
            if (r0 == 0) goto L38
            r4 = 0
        L23:
            if (r4 >= r1) goto L33
            r5 = r0[r4]
            if (r5 == 0) goto L33
            boolean r5 = tao.reactivex.d.h.g.a(r5, r7)
            if (r5 == 0) goto L30
            return r2
        L30:
            int r4 = r4 + 1
            goto L23
        L33:
            r0 = r0[r1]
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            goto L20
        L38:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: tao.reactivex.d.h.a.a(tao.reactivex.j):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0033, code lost:
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public <U> boolean a(tb.muz<? super U> r7) {
        /*
            r6 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = tao.reactivex.d.h.a.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L1c
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r3] = r6
            r1[r2] = r7
            java.lang.String r7 = "f53e5dca"
            java.lang.Object r7 = r0.ipc$dispatch(r7, r1)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            return r7
        L1c:
            java.lang.Object[] r0 = r6.b
            int r1 = r6.f25143a
        L20:
            if (r0 == 0) goto L38
            r4 = 0
        L23:
            if (r4 >= r1) goto L33
            r5 = r0[r4]
            if (r5 == 0) goto L33
            boolean r5 = tao.reactivex.d.h.g.a(r5, r7)
            if (r5 == 0) goto L30
            return r2
        L30:
            int r4 = r4 + 1
            goto L23
        L33:
            r0 = r0[r1]
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            goto L20
        L38:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: tao.reactivex.d.h.a.a(tb.muz):boolean");
    }

    public void b(T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f056ab85", new Object[]{this, t});
        } else {
            this.b[0] = t;
        }
    }
}
