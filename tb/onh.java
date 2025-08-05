package tb;

import android.support.v4.util.ArrayMap;
import android.support.v4.util.Pair;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.messagekit.base.c;
import com.taobao.tao.messagekit.core.model.a;
import com.taobao.tao.messagekit.core.model.b;
import com.taobao.tao.messagekit.core.utils.MsgLog;
import com.taobao.tao.messagekit.core.utils.d;
import com.taobao.tao.powermsg.model.Request;
import java.util.concurrent.TimeUnit;
import tao.reactivex.e;
import tao.reactivex.f.k;
import tb.mto;

/* loaded from: classes8.dex */
public class onh {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static ArrayMap<String, ong> f32203a;

    static {
        kge.a(927128276);
        f32203a = new ArrayMap<>();
    }

    public static /* synthetic */ void a(String str, long j, int i, int i2, String str2, int i3, int i4, a aVar, String str3, Long l) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75b20589", new Object[]{str, new Long(j), new Integer(i), new Integer(i2), str2, new Integer(i3), new Integer(i4), aVar, str3, l});
        } else {
            b(str, j, i, i2, str2, i3, i4, aVar, str3, l);
        }
    }

    private static void a(final ong ongVar) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f83cc770", new Object[]{ongVar});
        } else if (ongVar.d == 1) {
        } else {
            ongVar.m.set(0);
            final int a2 = c.a("pull_timeout", 20);
            if (ongVar.n != null && !ongVar.n.b()) {
                return;
            }
            if (a(ongVar.d)) {
                i = ongVar.e;
            }
            ongVar.n = e.a(i, 1L, TimeUnit.SECONDS).b(k.a()).c(new jew<Long>() { // from class: tb.onh.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* renamed from: a  reason: collision with root package name */
                public int f32204a = 0;

                public void a(Long l) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5ed6d4a7", new Object[]{this, l});
                        return;
                    }
                    try {
                        if (ong.this.b()) {
                            MsgLog.b("PullManager", "last pull", "topic:", ong.this.b, com.taobao.tao.powermsg.model.a.COL_BTAG, ong.this.c);
                            if (ong.this.n != null) {
                                ong.this.n.b_();
                            }
                            com.taobao.tao.powermsg.model.a aVar = new com.taobao.tao.powermsg.model.a(com.taobao.tao.messagekit.base.monitor.c.a((String) null, (String) null), 5, ong.this.f32202a, ong.this.b, ong.this.c, -1, ong.this.d);
                            aVar.f = 2;
                            aVar.h = "" + ong.this.f;
                            com.taobao.tao.messagekit.base.monitor.c.a(aVar);
                        } else if (onh.a(ong.this.d) && ong.this.j.get() == 1) {
                            ong.this.j.set(0);
                            ong.this.f = 0L;
                            if (ong.this.h > 1) {
                                ong.this.h = 1;
                            }
                            this.f32204a = 0;
                        } else if (ong.this.e <= 0) {
                        } else {
                            if (ong.this.h > 0) {
                                ong ongVar2 = ong.this;
                                int i2 = ongVar2.h;
                                ongVar2.h = i2 + 1;
                                if (i2 < ong.this.e) {
                                    return;
                                }
                            }
                            if (ong.this.m.get() == -1) {
                                return;
                            }
                            Pair<Integer, Integer> b = com.taobao.tao.powermsg.managers.e.b(ong.this.b, ong.this.c);
                            ong.this.a(b.first.intValue(), b.second.intValue());
                            if (ong.this.h == 0) {
                                com.taobao.tao.powermsg.model.a aVar2 = new com.taobao.tao.powermsg.model.a(com.taobao.tao.messagekit.base.monitor.c.a((String) null, (String) null), 5, ong.this.f32202a, ong.this.b, ong.this.c, 1, ong.this.d);
                                aVar2.f = 2;
                                aVar2.h = "" + ong.this.f;
                                com.taobao.tao.messagekit.base.monitor.c.a(aVar2);
                            }
                            ong.this.h = 1;
                            ong.this.g = Long.valueOf(System.nanoTime());
                            ong.this.m.set(-1);
                            onh.a(ong.this.b, ong.this.f, ong.this.e, ong.this.f32202a, ong.this.c, ong.this.d, a2, ong.this.o, null, ong.this.g);
                        }
                    } catch (Throwable th) {
                        MsgLog.c("PullManager", th, "pull_interval_error", "topic:", ong.this.b, com.taobao.tao.powermsg.model.a.COL_BTAG, ong.this.c);
                        d.a("MKT", "pull_interval_error", th.getMessage(), (double) mto.a.GEO_NOT_SUPPORT);
                    }
                }

                @Override // tb.jew
                public /* synthetic */ void accept(Long l) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("b028bfab", new Object[]{this, l});
                    } else {
                        a(l);
                    }
                }
            });
        }
    }

    public static boolean a(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a821939f", new Object[]{new Integer(i)})).booleanValue() : i == 3 || i == 5;
    }

    private static void b(String str, long j, int i, int i2, String str2, int i3, int i4, final a aVar, String str3, Long l) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d521e068", new Object[]{str, new Long(j), new Integer(i), new Integer(i2), str2, new Integer(i3), new Integer(i4), aVar, str3, l});
            return;
        }
        MsgLog.b("PullManager", "pullMsgInterval >", Integer.valueOf(i3), "offset:", Long.valueOf(j), "duration:", Integer.valueOf(i), "timeout:", Integer.valueOf(i4), "topic:", str, com.taobao.tao.powermsg.model.a.COL_BTAG, str2);
        final Request create = Request.create();
        create.bizCode = i2;
        create.header.f31524a = str;
        create.header.g = 405;
        create.body.f31520a = j;
        create.body.b = i;
        create.body.c = i3;
        create.setBizTag(str2);
        b bVar = new b(create);
        bVar.l = i4;
        bVar.n = l;
        e.a(bVar).b(new jew<jdz>() { // from class: tb.onh.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public void a(jdz jdzVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("ef304458", new Object[]{this, jdzVar});
                } else {
                    com.taobao.tao.messagekit.base.d.a().e().a(Request.this.header.f, aVar);
                }
            }

            @Override // tb.jew
            public /* synthetic */ void accept(jdz jdzVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("b028bfab", new Object[]{this, jdzVar});
                } else {
                    a(jdzVar);
                }
            }
        }).b(com.taobao.tao.messagekit.base.d.a().b());
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x007a, code lost:
        r0.a();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized int a(int r10, java.lang.String r11, java.lang.String r12, int r13, int r14) {
        /*
            r9 = this;
            monitor-enter(r9)
            com.android.alibaba.ip.runtime.IpChange r0 = tb.onh.$ipChange     // Catch: java.lang.Throwable -> L97
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange     // Catch: java.lang.Throwable -> L97
            r2 = 3
            r3 = 1
            if (r1 == 0) goto L39
            java.lang.String r1 = "8d69a7c2"
            r4 = 6
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> L97
            r5 = 0
            r4[r5] = r9     // Catch: java.lang.Throwable -> L97
            java.lang.Integer r5 = new java.lang.Integer     // Catch: java.lang.Throwable -> L97
            r5.<init>(r10)     // Catch: java.lang.Throwable -> L97
            r4[r3] = r5     // Catch: java.lang.Throwable -> L97
            r10 = 2
            r4[r10] = r11     // Catch: java.lang.Throwable -> L97
            r4[r2] = r12     // Catch: java.lang.Throwable -> L97
            r10 = 4
            java.lang.Integer r11 = new java.lang.Integer     // Catch: java.lang.Throwable -> L97
            r11.<init>(r13)     // Catch: java.lang.Throwable -> L97
            r4[r10] = r11     // Catch: java.lang.Throwable -> L97
            r10 = 5
            java.lang.Integer r11 = new java.lang.Integer     // Catch: java.lang.Throwable -> L97
            r11.<init>(r14)     // Catch: java.lang.Throwable -> L97
            r4[r10] = r11     // Catch: java.lang.Throwable -> L97
            java.lang.Object r10 = r0.ipc$dispatch(r1, r4)     // Catch: java.lang.Throwable -> L97
            java.lang.Number r10 = (java.lang.Number) r10     // Catch: java.lang.Throwable -> L97
            int r10 = r10.intValue()     // Catch: java.lang.Throwable -> L97
            monitor-exit(r9)
            return r10
        L39:
            if (r14 > 0) goto L4e
            boolean r14 = a(r13)     // Catch: java.lang.Throwable -> L97
            if (r14 == 0) goto L48
            java.lang.String r14 = "push_aside_pull_duration"
            int r14 = com.taobao.tao.messagekit.base.c.a(r14, r2)     // Catch: java.lang.Throwable -> L97
            goto L4e
        L48:
            java.lang.String r14 = "pull_duration"
            int r14 = com.taobao.tao.messagekit.base.c.a(r14, r3)     // Catch: java.lang.Throwable -> L97
        L4e:
            java.lang.String r6 = tb.ong.a(r11, r12)     // Catch: java.lang.Throwable -> L97
            android.support.v4.util.ArrayMap<java.lang.String, tb.ong> r0 = tb.onh.f32203a     // Catch: java.lang.Throwable -> L97
            java.lang.Object r0 = r0.get(r6)     // Catch: java.lang.Throwable -> L97
            tb.ong r0 = (tb.ong) r0     // Catch: java.lang.Throwable -> L97
            if (r3 != r13) goto L68
            if (r0 == 0) goto L66
            r0.a()     // Catch: java.lang.Throwable -> L97
            android.support.v4.util.ArrayMap<java.lang.String, tb.ong> r10 = tb.onh.f32203a     // Catch: java.lang.Throwable -> L97
            r10.remove(r6)     // Catch: java.lang.Throwable -> L97
        L66:
            monitor-exit(r9)
            return r3
        L68:
            if (r0 == 0) goto L78
            boolean r1 = r0.b()     // Catch: java.lang.Throwable -> L97
            if (r1 == 0) goto L71
            goto L78
        L71:
            com.taobao.tao.powermsg.managers.e.b(r11, r12, r13, r14)     // Catch: java.lang.Throwable -> L97
            int r10 = r0.d     // Catch: java.lang.Throwable -> L97
            monitor-exit(r9)
            return r10
        L78:
            if (r0 == 0) goto L7d
            r0.a()     // Catch: java.lang.Throwable -> L97
        L7d:
            android.support.v4.util.ArrayMap<java.lang.String, tb.ong> r7 = tb.onh.f32203a     // Catch: java.lang.Throwable -> L97
            tb.ong r8 = new tb.ong     // Catch: java.lang.Throwable -> L97
            r0 = r8
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            r0.<init>(r1, r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L97
            r7.put(r6, r8)     // Catch: java.lang.Throwable -> L97
            com.taobao.tao.powermsg.managers.e.b(r11, r12, r13, r14)     // Catch: java.lang.Throwable -> L97
            a(r8)     // Catch: java.lang.Throwable -> L97
            int r10 = r8.d     // Catch: java.lang.Throwable -> L97
            monitor-exit(r9)
            return r10
        L97:
            r10 = move-exception
            monitor-exit(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.onh.a(int, java.lang.String, java.lang.String, int, int):int");
    }

    public synchronized void a(String str, String str2, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4dba9507", new Object[]{this, str, str2, new Integer(i)});
            return;
        }
        ong ongVar = f32203a.get(ong.a(str, str2));
        if (ongVar != null) {
            ongVar.j.set(i);
        }
    }
}
