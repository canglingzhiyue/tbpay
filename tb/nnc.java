package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.rxm.request.a;
import com.taobao.rxm.request.c;
import com.taobao.rxm.schedule.f;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import tb.nmq;

/* loaded from: classes.dex */
public class nnc<OUT extends nmq, CONTEXT extends c> extends nmx<OUT, OUT, CONTEXT> implements a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public Class<OUT> f31584a;
    private Map<String, Integer> b;
    private Map<Integer, ArrayList<nmv<OUT, CONTEXT>>> c;

    public static /* synthetic */ Object ipc$super(nnc nncVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public nnc(Class<OUT> cls) {
        super(1, 29);
        this.b = new ConcurrentHashMap();
        this.c = new ConcurrentHashMap();
        this.f31584a = cls;
    }

    @Override // tb.nmy
    public Type g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Type) ipChange.ipc$dispatch("20b61717", new Object[]{this}) : this.f31584a;
    }

    @Override // tb.nmy
    public Type h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Type) ipChange.ipc$dispatch("11871e76", new Object[]{this}) : this.f31584a;
    }

    @Override // tb.nmy
    public boolean a(nmv<OUT, CONTEXT> nmvVar) {
        ArrayList<nmv<OUT, CONTEXT>> arrayList;
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f680a8e5", new Object[]{this, nmvVar})).booleanValue();
        }
        CONTEXT e = nmvVar.e();
        String o = e.o();
        synchronized (this) {
            Integer num = this.b.get(o);
            if (num == null) {
                num = Integer.valueOf(e.H());
                this.b.put(o, num);
                arrayList = new ArrayList<>(2);
                this.c.put(num, arrayList);
            } else {
                arrayList = this.c.get(num);
                z = true;
            }
            e.g(num.intValue());
            e.a(this);
            a(arrayList, nmvVar);
        }
        return z;
    }

    private void a(ArrayList<nmv<OUT, CONTEXT>> arrayList, nmv<OUT, CONTEXT> nmvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab6940bb", new Object[]{this, arrayList, nmvVar});
            return;
        }
        arrayList.add(nmvVar);
        int I = nmvVar.e().I();
        CONTEXT e = a(arrayList).e();
        if (I > e.I()) {
            e.f(I);
        }
        if (!e.K() || nmvVar.e().L()) {
            return;
        }
        e.f(false);
    }

    private nmv<OUT, CONTEXT> a(ArrayList<nmv<OUT, CONTEXT>> arrayList) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (nmv) ipChange.ipc$dispatch("1d20524d", new Object[]{this, arrayList}) : arrayList.get(0);
    }

    private void a(nmv<OUT, CONTEXT> nmvVar, f<OUT> fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6a83457", new Object[]{this, nmvVar, fVar});
            return;
        }
        CONTEXT e = nmvVar.e();
        ArrayList<nmv<OUT, CONTEXT>> arrayList = this.c.get(Integer.valueOf(e.H()));
        String o = e.o();
        int i = 4;
        if (arrayList == null) {
            qol.g("RxSysLog", "[RequestMultiplex] group has been removed from multiplex, but pipeline is still producing new result(multiplex:%s, id:%d, pipeline:%d, type:%d)", o, Integer.valueOf(e.H()), Integer.valueOf(e.N()), Integer.valueOf(fVar.f19010a));
            return;
        }
        synchronized (this) {
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                nmv<OUT, CONTEXT> nmvVar2 = arrayList.get(i2);
                CONTEXT e2 = nmvVar2.e();
                if (nmvVar2 != nmvVar) {
                    e2.a(e);
                }
                if (!e2.L()) {
                    int i3 = fVar.f19010a;
                    if (i3 == 1) {
                        nmvVar2.b(fVar.c, fVar.b);
                    } else if (i3 == i) {
                        nmvVar2.b(fVar.d);
                    } else if (i3 == 8) {
                        qol.h("RxSysLog", "[RequestMultiplex] ID=%d consumers of the group were not all cancelled, but pipeline dispatched cancellation result", Integer.valueOf(e2.H()));
                        nmvVar2.d();
                    } else if (i3 == 16) {
                        nmvVar2.b(fVar.e);
                    }
                } else {
                    if (fVar.f19010a == 16) {
                        qol.f("RxSysLog", "[RequestMultiplex] ID=%d received error after cancellation, throwable=%s", Integer.valueOf(e2.H()), fVar.e);
                    }
                    nmvVar2.d();
                }
                i2++;
                i = 4;
            }
            if (fVar.b) {
                if (!TextUtils.isEmpty(o)) {
                    this.b.remove(o);
                }
                this.c.remove(Integer.valueOf(e.H()));
            }
        }
    }

    private boolean b(ArrayList<nmv<OUT, CONTEXT>> arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e188d165", new Object[]{this, arrayList})).booleanValue();
        }
        for (int i = 0; i < arrayList.size(); i++) {
            if (!arrayList.get(i).e().L()) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0052 A[Catch: all -> 0x006f, TryCatch #0 {, blocks: (B:13:0x0036, B:15:0x0046, B:21:0x0052, B:22:0x0062), top: B:29:0x0036 }] */
    @Override // com.taobao.rxm.request.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(com.taobao.rxm.request.c r8) {
        /*
            r7 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = tb.nnc.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L15
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r2] = r7
            r1[r3] = r8
            java.lang.String r8 = "5ebd0ef"
            r0.ipc$dispatch(r8, r1)
            return
        L15:
            java.lang.String r0 = r8.o()
            java.util.Map<java.lang.String, java.lang.Integer> r1 = r7.b
            boolean r1 = r1.containsKey(r0)
            if (r1 != 0) goto L22
            return
        L22:
            java.util.Map<java.lang.Integer, java.util.ArrayList<tb.nmv<OUT extends tb.nmq, CONTEXT extends com.taobao.rxm.request.c>>> r1 = r7.c
            int r8 = r8.N()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            java.lang.Object r8 = r1.get(r8)
            java.util.ArrayList r8 = (java.util.ArrayList) r8
            if (r8 != 0) goto L35
            return
        L35:
            monitor-enter(r7)
            tb.nmv r1 = r7.a(r8)     // Catch: java.lang.Throwable -> L6f
            java.lang.Object r4 = r1.e()     // Catch: java.lang.Throwable -> L6f
            com.taobao.rxm.request.c r4 = (com.taobao.rxm.request.c) r4     // Catch: java.lang.Throwable -> L6f
            boolean r4 = r4.K()     // Catch: java.lang.Throwable -> L6f
            if (r4 != 0) goto L4f
            boolean r8 = r7.b(r8)     // Catch: java.lang.Throwable -> L6f
            if (r8 == 0) goto L4d
            goto L4f
        L4d:
            r8 = 0
            goto L50
        L4f:
            r8 = 1
        L50:
            if (r8 == 0) goto L62
            java.util.Map<java.lang.String, java.lang.Integer> r4 = r7.b     // Catch: java.lang.Throwable -> L6f
            r4.remove(r0)     // Catch: java.lang.Throwable -> L6f
            java.lang.String r4 = "RxSysLog"
            java.lang.String r5 = "[RequestMultiplex] all of context in group[key:%s] were cancelled, remove it from KeyToGroupId"
            java.lang.Object[] r6 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L6f
            r6[r2] = r0     // Catch: java.lang.Throwable -> L6f
            tb.qol.e(r4, r5, r6)     // Catch: java.lang.Throwable -> L6f
        L62:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L6f
            if (r8 == 0) goto L6e
            java.lang.Object r8 = r1.e()
            com.taobao.rxm.request.c r8 = (com.taobao.rxm.request.c) r8
            r8.f(r3)
        L6e:
            return
        L6f:
            r8 = move-exception
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L6f
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.nnc.a(com.taobao.rxm.request.c):void");
    }

    @Override // tb.nmx
    public void a(nmv<OUT, CONTEXT> nmvVar, boolean z, OUT out) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a09441b1", new Object[]{this, nmvVar, new Boolean(z), out});
            return;
        }
        f<OUT> fVar = new f<>(1, z);
        fVar.c = out;
        a(nmvVar, fVar);
    }

    @Override // tb.nmx
    public void a(nmv<OUT, CONTEXT> nmvVar, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d994daff", new Object[]{this, nmvVar, new Float(f)});
            return;
        }
        f<OUT> fVar = new f<>(4, false);
        fVar.d = f;
        a(nmvVar, fVar);
    }

    @Override // tb.nmx
    public void c(nmv<OUT, CONTEXT> nmvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d386b5e3", new Object[]{this, nmvVar});
        } else {
            a(nmvVar, new f<>(8, true));
        }
    }

    @Override // tb.nmx
    public void a(nmv<OUT, CONTEXT> nmvVar, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2bf951b4", new Object[]{this, nmvVar, th});
            return;
        }
        f<OUT> fVar = new f<>(16, true);
        fVar.e = th;
        a(nmvVar, fVar);
    }
}
