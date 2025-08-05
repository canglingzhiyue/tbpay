package com.taobao.android.layoutmanager.adapter.impl;

import android.os.AsyncTask;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import anetwork.channel.NetworkEvent;
import anetwork.channel.aidl.ParcelableInputStream;
import anetwork.channel.degrade.DegradableNetwork;
import anetwork.channel.entity.RequestImpl;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.i;
import com.taobao.tao.flexbox.layoutmanager.core.ab;
import tb.kge;
import tb.oec;
import tb.ohg;

/* loaded from: classes5.dex */
public class q extends com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.i {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Handler f13135a = new Handler(Looper.getMainLooper());

    static {
        kge.a(1464833299);
    }

    public static /* synthetic */ Handler a(q qVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Handler) ipChange.ipc$dispatch("969bb6ae", new Object[]{qVar}) : qVar.f13135a;
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.i
    public void a(String str, boolean z, i.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3ea9365", new Object[]{this, str, new Boolean(z), aVar});
        } else if (TextUtils.isEmpty(str)) {
            aVar.a("download url is empty!");
        } else {
            DegradableNetwork degradableNetwork = new DegradableNetwork(ab.a());
            RequestImpl requestImpl = new RequestImpl(str);
            int a2 = oec.a((Object) ohg.a().a("tnode", "tnode_download_timeout", "2000"), 2000);
            requestImpl.setReadTimeout(a2);
            requestImpl.setConnectTimeout(a2);
            degradableNetwork.asyncSend(requestImpl, null, null, new AnonymousClass1(str, aVar, z));
        }
    }

    /* renamed from: com.taobao.android.layoutmanager.adapter.impl.q$1  reason: invalid class name */
    /* loaded from: classes5.dex */
    public class AnonymousClass1 implements r {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f13136a;
        public final /* synthetic */ i.a b;
        public final /* synthetic */ boolean c;

        public AnonymousClass1(String str, i.a aVar, boolean z) {
            this.f13136a = str;
            this.b = aVar;
            this.c = z;
        }

        @Override // anetwork.channel.NetworkCallBack.FinishListener
        public void onFinished(final NetworkEvent.FinishEvent finishEvent, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a00910e8", new Object[]{this, finishEvent, obj});
            } else if (finishEvent != null && finishEvent.getHttpCode() == 200) {
            } else {
                if (this.f13136a.startsWith("https") && finishEvent.getHttpCode() == -402) {
                    q.this.a(android.taobao.windvane.util.p.c(this.f13136a), this.b);
                } else if (this.c) {
                    q.a(q.this).post(new Runnable() { // from class: com.taobao.android.layoutmanager.adapter.impl.q.1.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            } else if (AnonymousClass1.this.b == null) {
                            } else {
                                AnonymousClass1.this.b.a(finishEvent.getDesc());
                            }
                        }
                    });
                } else {
                    i.a aVar = this.b;
                    if (aVar == null) {
                        return;
                    }
                    aVar.a(finishEvent.getDesc());
                }
            }
        }

        @Override // anetwork.channel.NetworkCallBack.InputStreamListener
        public void onInputStreamGet(final ParcelableInputStream parcelableInputStream, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("91cf6995", new Object[]{this, parcelableInputStream, obj});
            } else {
                AsyncTask.THREAD_POOL_EXECUTOR.execute(new Runnable() { // from class: com.taobao.android.layoutmanager.adapter.impl.q.1.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    /* JADX WARN: Removed duplicated region for block: B:49:0x0098 A[EXC_TOP_SPLITTER, SYNTHETIC] */
                    @Override // java.lang.Runnable
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    public void run() {
                        /*
                            r5 = this;
                            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.android.layoutmanager.adapter.impl.q.AnonymousClass1.AnonymousClass2.$ipChange
                            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
                            r2 = 0
                            if (r1 == 0) goto L12
                            r1 = 1
                            java.lang.Object[] r1 = new java.lang.Object[r1]
                            r1[r2] = r5
                            java.lang.String r2 = "5c510192"
                            r0.ipc$dispatch(r2, r1)
                            return
                        L12:
                            r0 = 0
                            anetwork.channel.aidl.ParcelableInputStream r1 = r2     // Catch: java.lang.Throwable -> L60 java.lang.Exception -> L64
                            int r1 = r1.length()     // Catch: java.lang.Throwable -> L60 java.lang.Exception -> L64
                            java.io.ByteArrayOutputStream r3 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L60 java.lang.Exception -> L64
                            r3.<init>(r1)     // Catch: java.lang.Throwable -> L60 java.lang.Exception -> L64
                            r0 = 2048(0x800, float:2.87E-42)
                            byte[] r0 = new byte[r0]     // Catch: java.lang.Exception -> L5e java.lang.Throwable -> L95
                        L22:
                            anetwork.channel.aidl.ParcelableInputStream r1 = r2     // Catch: java.lang.Exception -> L5e java.lang.Throwable -> L95
                            int r1 = r1.read(r0)     // Catch: java.lang.Exception -> L5e java.lang.Throwable -> L95
                            r4 = -1
                            if (r1 == r4) goto L2f
                            r3.write(r0, r2, r1)     // Catch: java.lang.Exception -> L5e java.lang.Throwable -> L95
                            goto L22
                        L2f:
                            r3.flush()     // Catch: java.lang.Exception -> L5e java.lang.Throwable -> L95
                            byte[] r0 = r3.toByteArray()     // Catch: java.lang.Exception -> L5e java.lang.Throwable -> L95
                            com.taobao.android.layoutmanager.adapter.impl.q$1 r1 = com.taobao.android.layoutmanager.adapter.impl.q.AnonymousClass1.this     // Catch: java.lang.Exception -> L5e java.lang.Throwable -> L95
                            boolean r1 = r1.c     // Catch: java.lang.Exception -> L5e java.lang.Throwable -> L95
                            if (r1 == 0) goto L4d
                            com.taobao.android.layoutmanager.adapter.impl.q$1 r1 = com.taobao.android.layoutmanager.adapter.impl.q.AnonymousClass1.this     // Catch: java.lang.Exception -> L5e java.lang.Throwable -> L95
                            com.taobao.android.layoutmanager.adapter.impl.q r1 = com.taobao.android.layoutmanager.adapter.impl.q.this     // Catch: java.lang.Exception -> L5e java.lang.Throwable -> L95
                            android.os.Handler r1 = com.taobao.android.layoutmanager.adapter.impl.q.a(r1)     // Catch: java.lang.Exception -> L5e java.lang.Throwable -> L95
                            com.taobao.android.layoutmanager.adapter.impl.q$1$2$1 r2 = new com.taobao.android.layoutmanager.adapter.impl.q$1$2$1     // Catch: java.lang.Exception -> L5e java.lang.Throwable -> L95
                            r2.<init>()     // Catch: java.lang.Exception -> L5e java.lang.Throwable -> L95
                            r1.post(r2)     // Catch: java.lang.Exception -> L5e java.lang.Throwable -> L95
                            goto L5a
                        L4d:
                            com.taobao.android.layoutmanager.adapter.impl.q$1 r1 = com.taobao.android.layoutmanager.adapter.impl.q.AnonymousClass1.this     // Catch: java.lang.Exception -> L5e java.lang.Throwable -> L95
                            com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.i$a r1 = r1.b     // Catch: java.lang.Exception -> L5e java.lang.Throwable -> L95
                            if (r1 == 0) goto L5a
                            com.taobao.android.layoutmanager.adapter.impl.q$1 r1 = com.taobao.android.layoutmanager.adapter.impl.q.AnonymousClass1.this     // Catch: java.lang.Exception -> L5e java.lang.Throwable -> L95
                            com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.i$a r1 = r1.b     // Catch: java.lang.Exception -> L5e java.lang.Throwable -> L95
                            r1.a(r0)     // Catch: java.lang.Exception -> L5e java.lang.Throwable -> L95
                        L5a:
                            r3.close()     // Catch: java.io.IOException -> L5d
                        L5d:
                            return
                        L5e:
                            r0 = move-exception
                            goto L67
                        L60:
                            r1 = move-exception
                            r3 = r0
                            r0 = r1
                            goto L96
                        L64:
                            r1 = move-exception
                            r3 = r0
                            r0 = r1
                        L67:
                            com.taobao.android.layoutmanager.adapter.impl.q$1 r1 = com.taobao.android.layoutmanager.adapter.impl.q.AnonymousClass1.this     // Catch: java.lang.Throwable -> L95
                            boolean r1 = r1.c     // Catch: java.lang.Throwable -> L95
                            if (r1 == 0) goto L7e
                            com.taobao.android.layoutmanager.adapter.impl.q$1 r1 = com.taobao.android.layoutmanager.adapter.impl.q.AnonymousClass1.this     // Catch: java.lang.Throwable -> L95
                            com.taobao.android.layoutmanager.adapter.impl.q r1 = com.taobao.android.layoutmanager.adapter.impl.q.this     // Catch: java.lang.Throwable -> L95
                            android.os.Handler r1 = com.taobao.android.layoutmanager.adapter.impl.q.a(r1)     // Catch: java.lang.Throwable -> L95
                            com.taobao.android.layoutmanager.adapter.impl.q$1$2$2 r2 = new com.taobao.android.layoutmanager.adapter.impl.q$1$2$2     // Catch: java.lang.Throwable -> L95
                            r2.<init>()     // Catch: java.lang.Throwable -> L95
                            r1.post(r2)     // Catch: java.lang.Throwable -> L95
                            goto L8f
                        L7e:
                            com.taobao.android.layoutmanager.adapter.impl.q$1 r1 = com.taobao.android.layoutmanager.adapter.impl.q.AnonymousClass1.this     // Catch: java.lang.Throwable -> L95
                            com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.i$a r1 = r1.b     // Catch: java.lang.Throwable -> L95
                            if (r1 == 0) goto L8f
                            com.taobao.android.layoutmanager.adapter.impl.q$1 r1 = com.taobao.android.layoutmanager.adapter.impl.q.AnonymousClass1.this     // Catch: java.lang.Throwable -> L95
                            com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.i$a r1 = r1.b     // Catch: java.lang.Throwable -> L95
                            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L95
                            r1.a(r0)     // Catch: java.lang.Throwable -> L95
                        L8f:
                            if (r3 == 0) goto L94
                            r3.close()     // Catch: java.io.IOException -> L94
                        L94:
                            return
                        L95:
                            r0 = move-exception
                        L96:
                            if (r3 == 0) goto L9b
                            r3.close()     // Catch: java.io.IOException -> L9b
                        L9b:
                            throw r0
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.layoutmanager.adapter.impl.q.AnonymousClass1.AnonymousClass2.run():void");
                    }
                });
            }
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.i
    public void a(String str, i.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf977615", new Object[]{this, str, aVar});
        } else {
            a(str, true, aVar);
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.i
    public byte[] a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (byte[]) ipChange.ipc$dispatch("81233aeb", new Object[]{this, str}) : oec.a(android.taobao.windvane.packageapp.zipapp.utils.c.getInputStreamByUrl(str));
    }
}
