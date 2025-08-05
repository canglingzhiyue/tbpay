package com.heytap.mspsdk.proxy;

import android.os.Bundle;
import com.heytap.msp.b;
import java.lang.reflect.InvocationHandler;
import java.util.concurrent.ConcurrentHashMap;
import tb.cwg;
import tb.kge;

/* loaded from: classes4.dex */
public class b<T> {

    /* renamed from: a  reason: collision with root package name */
    public ConcurrentHashMap f7250a = new ConcurrentHashMap();
    public Object b = new Object();
    public volatile Bundle c = new Bundle();

    /* loaded from: classes4.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static final b f7251a;

        static {
            kge.a(-1172213223);
            f7251a = new b();
        }
    }

    /* renamed from: com.heytap.mspsdk.proxy.b$b  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public class C0261b<T> implements InvocationHandler {

        /* renamed from: a  reason: collision with root package name */
        public T f7252a;

        /* renamed from: com.heytap.mspsdk.proxy.b$b$a */
        /* loaded from: classes4.dex */
        public class a extends b.a {
            static {
                kge.a(-1215473577);
            }

            public a() {
            }
        }

        /* renamed from: com.heytap.mspsdk.proxy.b$b$b  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public class RunnableC0262b implements Runnable {
            static {
                kge.a(-1215473576);
                kge.a(-1390502639);
            }

            public RunnableC0262b() {
            }

            /* JADX WARN: Removed duplicated region for block: B:24:0x0094  */
            /* JADX WARN: Removed duplicated region for block: B:26:0x0098  */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public void run() {
                /*
                    r7 = this;
                    com.heytap.mspsdk.proxy.b$b r0 = com.heytap.mspsdk.proxy.b.C0261b.this
                    com.heytap.mspsdk.proxy.b r1 = com.heytap.mspsdk.proxy.b.this
                    T r0 = r0.f7252a
                    r2 = 0
                    if (r1 == 0) goto Laa
                    android.content.Intent r3 = new android.content.Intent
                    java.lang.String r4 = "com.heytap.msp.action.CORE"
                    r3.<init>(r4)
                    com.heytap.mspsdk.proxy.a r4 = new com.heytap.mspsdk.proxy.a
                    r4.<init>(r1, r2)
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    r5 = 0
                    r4.writeToParcel(r1, r5)
                    r1.setDataPosition(r5)
                    android.os.Parcelable$Creator r4 = android.os.ResultReceiver.CREATOR
                    java.lang.Object r4 = r4.createFromParcel(r1)
                    android.os.ResultReceiver r4 = (android.os.ResultReceiver) r4
                    r1.recycle()
                    java.lang.String r1 = "msp_result_receiver"
                    r3.putExtra(r1, r4)
                    boolean r1 = r0 instanceof tb.dbk
                    java.lang.String r4 = "ApiProxy"
                    if (r1 == 0) goto L5e
                    tb.dbk r0 = (tb.dbk) r0
                    java.lang.String r1 = r0.i     // Catch: com.opos.process.bridge.provider.BridgeExecuteException -> L5c
                    boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: com.opos.process.bridge.provider.BridgeExecuteException -> L5c
                    if (r1 == 0) goto L45
                    android.content.Context r1 = r0.f26657a     // Catch: com.opos.process.bridge.provider.BridgeExecuteException -> L5c
                    r0.a(r1)     // Catch: com.opos.process.bridge.provider.BridgeExecuteException -> L5c
                L45:
                    java.lang.String r0 = r0.i     // Catch: com.opos.process.bridge.provider.BridgeExecuteException -> L5c
                    java.lang.String r1 = "target_authority"
                    r3.putExtra(r1, r0)     // Catch: com.opos.process.bridge.provider.BridgeExecuteException -> L5c
                    java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: com.opos.process.bridge.provider.BridgeExecuteException -> L5c
                    r1.<init>()     // Catch: com.opos.process.bridge.provider.BridgeExecuteException -> L5c
                    java.lang.String r5 = "target_authority, "
                    r1.append(r5)     // Catch: com.opos.process.bridge.provider.BridgeExecuteException -> L5c
                L58:
                    r1.append(r0)     // Catch: com.opos.process.bridge.provider.BridgeExecuteException -> L5c
                    goto L7e
                L5c:
                    r0 = move-exception
                    goto L86
                L5e:
                    boolean r1 = r0 instanceof tb.dbl
                    if (r1 == 0) goto L8c
                    tb.dbl r0 = (tb.dbl) r0
                    android.content.Intent r0 = r0.b()     // Catch: com.opos.process.bridge.provider.BridgeExecuteException -> L5c
                    java.lang.String r1 = "target_service_intent"
                    r3.putExtra(r1, r0)     // Catch: com.opos.process.bridge.provider.BridgeExecuteException -> L5c
                    java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: com.opos.process.bridge.provider.BridgeExecuteException -> L5c
                    r1.<init>()     // Catch: com.opos.process.bridge.provider.BridgeExecuteException -> L5c
                    java.lang.String r6 = "target_service_intent, "
                    r1.append(r6)     // Catch: com.opos.process.bridge.provider.BridgeExecuteException -> L5c
                    java.lang.String r0 = r0.toUri(r5)     // Catch: com.opos.process.bridge.provider.BridgeExecuteException -> L5c
                    goto L58
                L7e:
                    java.lang.String r0 = r1.toString()     // Catch: com.opos.process.bridge.provider.BridgeExecuteException -> L5c
                    tb.cwn.b(r4, r0)     // Catch: com.opos.process.bridge.provider.BridgeExecuteException -> L5c
                    goto L8c
                L86:
                    r0.printStackTrace()
                    tb.cwn.a(r4, r0)
                L8c:
                    tb.cwe r0 = tb.cwe.a.f26564a
                    android.app.Activity r0 = r0.a()
                    if (r0 == 0) goto L98
                    r0.startActivity(r3)
                    return
                L98:
                    r0 = 276824064(0x10800000, float:5.0487098E-29)
                    r3.addFlags(r0)
                    tb.cwg r0 = tb.cwg.a()
                    if (r0 == 0) goto La9
                    android.content.Context r0 = tb.cwg.f26565a
                    r0.startActivity(r3)
                    return
                La9:
                    throw r2
                Laa:
                    throw r2
                */
                throw new UnsupportedOperationException("Method not decompiled: com.heytap.mspsdk.proxy.b.C0261b.RunnableC0262b.run():void");
            }
        }

        static {
            kge.a(-1172213222);
            kge.a(16938580);
        }

        public C0261b(T t) {
            this.f7252a = t;
        }

        /* JADX WARN: Removed duplicated region for block: B:104:0x024d  */
        /* JADX WARN: Removed duplicated region for block: B:105:0x025a  */
        /* JADX WARN: Removed duplicated region for block: B:107:0x025e  */
        /* JADX WARN: Removed duplicated region for block: B:141:0x033d  */
        /* JADX WARN: Removed duplicated region for block: B:148:0x00b0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:88:0x0210  */
        /* JADX WARN: Removed duplicated region for block: B:95:0x0231  */
        @Override // java.lang.reflect.InvocationHandler
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.Object invoke(java.lang.Object r13, java.lang.reflect.Method r14, java.lang.Object[] r15) {
            /*
                Method dump skipped, instructions count: 840
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.heytap.mspsdk.proxy.b.C0261b.invoke(java.lang.Object, java.lang.reflect.Method, java.lang.Object[]):java.lang.Object");
        }
    }

    static {
        kge.a(722801756);
    }

    public b() {
        this.c.putInt("msp_sdk_version_code", 2000007);
        this.c.putString("msp_sdk_verison_name", "2.0.101.7");
        this.c.putString("msp_sdk_calling_pkg", cwg.a().b().getPackageName());
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0042 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ boolean a(com.heytap.mspsdk.proxy.b r4, android.content.Context r5, android.util.Pair r6) {
        /*
            java.lang.String r5 = "ApiProxy"
            r6 = 0
            if (r4 == 0) goto L44
            r4 = 0
            java.lang.String r0 = "com.heytap.mspsdk.guide.MspCoreInstaller"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Exception -> L30
            java.lang.String r1 = "getInstance"
            java.lang.Class[] r2 = new java.lang.Class[r4]     // Catch: java.lang.Exception -> L2e
            java.lang.reflect.Method r1 = r0.getMethod(r1, r2)     // Catch: java.lang.Exception -> L2e
            java.lang.Object[] r2 = new java.lang.Object[r4]     // Catch: java.lang.Exception -> L2e
            java.lang.Object r1 = r1.invoke(r0, r2)     // Catch: java.lang.Exception -> L2e
            boolean r1 = r1 instanceof tb.cwj
            if (r1 == 0) goto L28
            tb.cwg r1 = tb.cwg.a()     // Catch: java.lang.Exception -> L2e
            if (r1 == 0) goto L27
            android.content.Context r6 = tb.cwg.f26565a     // Catch: java.lang.Exception -> L2e
            goto L3a
        L27:
            throw r6     // Catch: java.lang.Exception -> L2e
        L28:
            java.lang.String r6 = "object is not IMspCoreInstaller"
            tb.cwn.c(r5, r6)     // Catch: java.lang.Exception -> L2e
            goto L3a
        L2e:
            r6 = move-exception
            goto L34
        L30:
            r0 = move-exception
            r3 = r0
            r0 = r6
            r6 = r3
        L34:
            r6.printStackTrace()
            tb.cwn.a(r5, r6)
        L3a:
            if (r0 != 0) goto L42
            java.lang.String r6 = "MspCoreInstaller dos not exist"
            tb.cwn.c(r5, r6)
            goto L43
        L42:
            r4 = 1
        L43:
            return r4
        L44:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.heytap.mspsdk.proxy.b.a(com.heytap.mspsdk.proxy.b, android.content.Context, android.util.Pair):boolean");
    }
}
