package tb;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CountDownLatch;
import tb.dbl;

/* loaded from: classes4.dex */
public class dbm {
    public static final dbm b;

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, b> f26659a = new ConcurrentHashMap();

    /* loaded from: classes4.dex */
    public class a implements ServiceConnection {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f26660a;
        public final /* synthetic */ dbl.b b;
        public final /* synthetic */ CountDownLatch c;

        /* renamed from: tb.dbm$a$a  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public class C1101a implements IBinder.DeathRecipient {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ ComponentName f26661a;

            static {
                kge.a(1882487109);
                kge.a(1219188865);
            }

            public C1101a(ComponentName componentName) {
                this.f26661a = componentName;
            }

            @Override // android.os.IBinder.DeathRecipient
            public void binderDied() {
                a aVar = a.this;
                b remove = dbm.this.f26659a.remove(aVar.f26660a);
                if (remove != null) {
                    ComponentName componentName = this.f26661a;
                    for (dbl.b bVar : remove.b) {
                        if (bVar != null) {
                            bVar.b(componentName);
                        }
                    }
                }
            }
        }

        static {
            kge.a(-1504184696);
            kge.a(808545181);
        }

        public a(String str, dbl.b bVar, CountDownLatch countDownLatch) {
            this.f26660a = str;
            this.b = bVar;
            this.c = countDownLatch;
        }

        @Override // android.content.ServiceConnection
        public void onNullBinding(ComponentName componentName) {
            String str = "onNullBinding:" + componentName;
            this.c.countDown();
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            try {
                iBinder.linkToDeath(new C1101a(componentName), 0);
            } catch (RemoteException unused) {
            }
            b bVar = new b(iBinder, this);
            bVar.b.add(this.b);
            if (dbm.this.f26659a.put(this.f26660a, bVar) != null) {
                for (dbl.b bVar2 : bVar.b) {
                    if (bVar2 != null) {
                        bVar2.a(componentName);
                    }
                }
            }
            this.c.countDown();
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            b remove = dbm.this.f26659a.remove(this.f26660a);
            if (remove != null) {
                for (dbl.b bVar : remove.b) {
                    if (bVar != null) {
                        bVar.b(componentName);
                    }
                }
            }
        }
    }

    /* loaded from: classes4.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public IBinder f26662a;
        public List<dbl.b> b = new CopyOnWriteArrayList();

        static {
            kge.a(-1504184695);
        }

        public b(IBinder iBinder, ServiceConnection serviceConnection) {
            this.f26662a = iBinder;
        }
    }

    static {
        kge.a(-1833965429);
        b = new dbm();
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x007a, code lost:
        return r1.f26662a;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized android.os.IBinder a(android.content.Context r5, android.content.Intent r6, int r7, tb.dbl.b r8) {
        /*
            r4 = this;
            monitor-enter(r4)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L8d
            r0.<init>()     // Catch: java.lang.Throwable -> L8d
            java.lang.String r1 = r6.getPackage()     // Catch: java.lang.Throwable -> L8d
            r0.append(r1)     // Catch: java.lang.Throwable -> L8d
            java.lang.String r1 = "/"
            r0.append(r1)     // Catch: java.lang.Throwable -> L8d
            java.lang.String r1 = r6.getAction()     // Catch: java.lang.Throwable -> L8d
            r0.append(r1)     // Catch: java.lang.Throwable -> L8d
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L8d
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L8d
            r1.<init>()     // Catch: java.lang.Throwable -> L8d
            java.lang.String r2 = "key:"
            r1.append(r2)     // Catch: java.lang.Throwable -> L8d
            r1.append(r0)     // Catch: java.lang.Throwable -> L8d
            r1.toString()     // Catch: java.lang.Throwable -> L8d
            java.util.Map<java.lang.String, tb.dbm$b> r1 = r4.f26659a     // Catch: java.lang.Throwable -> L8d
            java.lang.Object r1 = r1.get(r0)     // Catch: java.lang.Throwable -> L8d
            tb.dbm$b r1 = (tb.dbm.b) r1     // Catch: java.lang.Throwable -> L8d
            if (r1 == 0) goto L41
            android.os.IBinder r2 = r1.f26662a     // Catch: java.lang.Throwable -> L8d
            if (r2 == 0) goto L41
            java.util.List<tb.dbl$b> r5 = r1.b     // Catch: java.lang.Throwable -> L8d
            r5.add(r8)     // Catch: java.lang.Throwable -> L8d
            goto L75
        L41:
            java.util.concurrent.CountDownLatch r1 = new java.util.concurrent.CountDownLatch     // Catch: java.lang.Throwable -> L8d
            r2 = 1
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L8d
            tb.dbm$a r3 = new tb.dbm$a     // Catch: java.lang.Throwable -> L8d
            r3.<init>(r0, r8, r1)     // Catch: java.lang.Throwable -> L8d
            boolean r5 = r5.bindService(r6, r3, r2)     // Catch: java.lang.Throwable -> L8d
            r6 = 101005(0x18a8d, float:1.41538E-40)
            if (r5 == 0) goto L85
            long r7 = (long) r7
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.lang.InterruptedException -> L7e java.lang.Throwable -> L8d
            boolean r5 = r1.await(r7, r5)     // Catch: java.lang.InterruptedException -> L7e java.lang.Throwable -> L8d
            java.util.Map<java.lang.String, tb.dbm$b> r6 = r4.f26659a     // Catch: java.lang.Throwable -> L8d
            java.lang.Object r6 = r6.get(r0)     // Catch: java.lang.Throwable -> L8d
            r1 = r6
            tb.dbm$b r1 = (tb.dbm.b) r1     // Catch: java.lang.Throwable -> L8d
            if (r1 != 0) goto L75
            if (r5 == 0) goto L6a
            goto L75
        L6a:
            com.opos.process.bridge.provider.BridgeExecuteException r5 = new com.opos.process.bridge.provider.BridgeExecuteException     // Catch: java.lang.Throwable -> L8d
            java.lang.String r6 = "service refused"
            r7 = 101004(0x18a8c, float:1.41537E-40)
            r5.<init>(r6, r7)     // Catch: java.lang.Throwable -> L8d
            throw r5     // Catch: java.lang.Throwable -> L8d
        L75:
            if (r1 == 0) goto L7b
            android.os.IBinder r5 = r1.f26662a     // Catch: java.lang.Throwable -> L8d
            monitor-exit(r4)
            return r5
        L7b:
            r5 = 0
            monitor-exit(r4)
            return r5
        L7e:
            r5 = move-exception
            com.opos.process.bridge.provider.BridgeExecuteException r7 = new com.opos.process.bridge.provider.BridgeExecuteException     // Catch: java.lang.Throwable -> L8d
            r7.<init>(r5, r6)     // Catch: java.lang.Throwable -> L8d
            throw r7     // Catch: java.lang.Throwable -> L8d
        L85:
            com.opos.process.bridge.provider.BridgeExecuteException r5 = new com.opos.process.bridge.provider.BridgeExecuteException     // Catch: java.lang.Throwable -> L8d
            java.lang.String r7 = "bindService failed"
            r5.<init>(r7, r6)     // Catch: java.lang.Throwable -> L8d
            throw r5     // Catch: java.lang.Throwable -> L8d
        L8d:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.dbm.a(android.content.Context, android.content.Intent, int, tb.dbl$b):android.os.IBinder");
    }
}
