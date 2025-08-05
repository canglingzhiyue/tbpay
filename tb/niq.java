package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.phenix.cache.memory.MemOnlyFailedException;
import com.taobao.phenix.cache.memory.e;
import com.taobao.phenix.intf.PhenixCreator;
import com.taobao.phenix.intf.event.FailPhenixEvent;
import com.taobao.phenix.intf.event.SuccPhenixEvent;
import com.taobao.phenix.intf.event.d;
import com.taobao.phenix.intf.event.f;
import com.taobao.phenix.loader.network.HttpCodeResponseException;
import com.taobao.phenix.request.ImageStatistics;
import com.taobao.phenix.request.a;
import com.taobao.phenix.request.b;
import com.taobao.rxm.schedule.j;
import com.taobao.rxm.schedule.k;
import java.util.HashMap;
import java.util.Map;
import mtopsdk.network.impl.ResponseProtocolType;

/* loaded from: classes7.dex */
public class niq extends nms<e, b> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final PhenixCreator c;
    private final a d;
    private final k e;

    static {
        kge.a(2128536470);
    }

    public static /* synthetic */ Object ipc$super(niq niqVar, String str, Object... objArr) {
        if (str.hashCode() == -1197312157) {
            return super.a((j) objArr[0]);
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public niq(b bVar, PhenixCreator phenixCreator, a aVar, k kVar, nio nioVar) {
        super(bVar);
        this.c = phenixCreator;
        this.d = aVar;
        this.e = kVar;
        bVar.a(new nir(bVar, phenixCreator.getMemCacheMissListener(), nioVar));
    }

    @Override // tb.nms
    public void a(e eVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2ea272d", new Object[]{this, eVar, new Boolean(z)});
            return;
        }
        gvt.a("phenix_ui " + b().H());
        long currentTimeMillis = System.currentTimeMillis();
        if (!com.taobao.phenix.intf.b.h().F()) {
            niw.a("Phenix", "UI Thread Process CallBack Started.", b());
        }
        com.taobao.phenix.intf.event.a<SuccPhenixEvent> successListener = this.c.getSuccessListener();
        niw.a("PhenixConsumer", b(), "received new result=%s, isLast=%b", eVar, Boolean.valueOf(z));
        nhx.d(b().b());
        if (successListener != null) {
            SuccPhenixEvent succPhenixEvent = new SuccPhenixEvent(b().m());
            succPhenixEvent.setDrawable(eVar);
            succPhenixEvent.setUrl(b().p());
            succPhenixEvent.setImmediate(eVar.m());
            succPhenixEvent.setIntermediate(!z);
            succPhenixEvent.fromDisk(eVar.n());
            succPhenixEvent.fromSecondary(eVar.o());
            succPhenixEvent.setNeedRefresh(eVar.s());
            successListener.onHappen(succPhenixEvent);
        }
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        if (com.taobao.phenix.intf.b.h().F()) {
            niw.a("Phenix", "UI Thread Process CallBack End. callback duration = " + currentTimeMillis2, b());
        } else {
            niw.a("Phenix", "UI Thread Process CallBack End.", b());
        }
        gvt.a();
        nhx.f(b().b());
        if (!z) {
            return;
        }
        a(currentTimeMillis);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0041, code lost:
        if (android.text.TextUtils.isEmpty(r0) != false) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean a(com.taobao.phenix.request.b r10, java.lang.Throwable r11) {
        /*
            r9 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = tb.niq.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 2
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L1f
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r4] = r9
            r1[r3] = r10
            r1[r2] = r11
            java.lang.String r10 = "11062e16"
            java.lang.Object r10 = r0.ipc$dispatch(r10, r1)
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            return r10
        L1f:
            boolean r0 = r10.F()
            if (r0 == 0) goto L26
            return r4
        L26:
            r0 = 0
            com.taobao.phenix.request.c r1 = r10.y()
            java.lang.String r1 = r1.g()
            com.taobao.phenix.intf.PhenixCreator r5 = r9.c
            com.taobao.phenix.intf.event.b r5 = r5.getRetryHandlerOnFailure()
            if (r5 == 0) goto L43
            com.taobao.phenix.intf.PhenixCreator r0 = r9.c
            java.lang.String r0 = r5.getRetryUrl(r0, r11)
            boolean r5 = android.text.TextUtils.isEmpty(r0)
            if (r5 == 0) goto Laa
        L43:
            boolean r5 = r11 instanceof com.taobao.phenix.decode.DecodeException
            if (r5 == 0) goto Laa
            r5 = r11
            com.taobao.phenix.decode.DecodeException r5 = (com.taobao.phenix.decode.DecodeException) r5
            com.taobao.rxm.request.c r6 = r9.b()
            com.taobao.phenix.request.b r6 = (com.taobao.phenix.request.b) r6
            com.taobao.phenix.request.c r6 = r6.y()
            boolean r7 = r5.isDataFromDisk()
            if (r7 == 0) goto L6c
            com.taobao.phenix.decode.DecodeException$DecodedError r7 = com.taobao.phenix.decode.DecodeException.DecodedError.UNLINK_SO_ERROR
            com.taobao.phenix.decode.DecodeException$DecodedError r5 = r5.getDecodedError()
            if (r7 == r5) goto L6c
            boolean r5 = r6.h()
            if (r5 != 0) goto L6c
            r10.d()
            r0 = r1
        L6c:
            boolean r5 = android.text.TextUtils.isEmpty(r0)
            java.lang.String r6 = "_.avif"
            if (r5 != 0) goto L7a
            boolean r5 = r0.endsWith(r6)
            if (r5 == 0) goto Laa
        L7a:
            com.taobao.phenix.intf.PhenixCreator r5 = r9.c
            com.taobao.phenix.intf.event.b r5 = r5.getRetryHandlerOnFailure()
            if (r5 == 0) goto Laa
            android.util.Pair r5 = r5.getDefaultRetryUrlPair()
            if (r5 == 0) goto Laa
            java.lang.Object r7 = r5.first
            java.lang.String r7 = (java.lang.String) r7
            if (r7 == 0) goto Laa
            boolean r6 = r7.endsWith(r6)
            if (r6 == 0) goto Laa
            java.lang.Object r0 = r5.second
            java.lang.String r0 = (java.lang.String) r0
            com.taobao.rxm.request.c r5 = r9.b()
            com.taobao.phenix.request.b r5 = (com.taobao.phenix.request.b) r5
            java.lang.Object[] r6 = new java.lang.Object[r3]
            r6[r4] = r7
            java.lang.String r7 = "Phenix"
            java.lang.String r8 = "willRetry degrade avif loadingUrl=%s"
            tb.niw.d(r7, r5, r8, r6)
        Laa:
            boolean r5 = android.text.TextUtils.isEmpty(r0)
            if (r5 == 0) goto Lb1
            return r4
        Lb1:
            r10.c(r0)
            java.lang.Object[] r0 = new java.lang.Object[r2]
            r0[r4] = r11
            r0[r3] = r1
            java.lang.String r11 = "PhenixConsumer"
            java.lang.String r1 = "retry to load when received failure=%s, raw=%s"
            tb.niw.c(r11, r10, r1, r0)
            com.taobao.phenix.intf.PhenixCreator r10 = r9.c
            r10.fetch()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.niq.a(com.taobao.phenix.request.b, java.lang.Throwable):boolean");
    }

    @Override // tb.nms
    public void a(Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb9ad88d", new Object[]{this, th});
            return;
        }
        b b = b();
        if (a(b, th)) {
            return;
        }
        if (th instanceof MemOnlyFailedException) {
            niw.a("PhenixConsumer", b(), "ignored MemOnlyFailedException(%s)", th);
            return;
        }
        niw.d("PhenixConsumer", b(), "received failure=%s", th);
        if (niw.a(3) && th != null) {
            th.printStackTrace();
        }
        nhx.d(b().b());
        if (this.c.getFailureListener() != null) {
            FailPhenixEvent failPhenixEvent = new FailPhenixEvent(b.m());
            if (th != null && (th instanceof HttpCodeResponseException)) {
                HttpCodeResponseException httpCodeResponseException = (HttpCodeResponseException) th;
                failPhenixEvent.setHttpCode(httpCodeResponseException.getHttpCode());
                failPhenixEvent.setHttpMessage(httpCodeResponseException.getMessage());
            }
            failPhenixEvent.setResultCode(404);
            failPhenixEvent.setUrl(b().p());
            this.c.getFailureListener().onHappen(failPhenixEvent);
        }
        nhx.f(b().b());
        a aVar = this.d;
        if (aVar == null) {
            return;
        }
        aVar.a(b.b(), th);
    }

    @Override // tb.nms
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        String p = b().p();
        niw.a("PhenixConsumer", b(), "received cancellation, cost=%dms", Long.valueOf(System.currentTimeMillis() - b().s()));
        nhx.e(b().b());
        nhx.d(b().b());
        if (this.c.getCancelListener() != null) {
            this.c.getCancelListener().onHappen(new d(p, b().m()));
        }
        nhx.f(b().b());
        a aVar = this.d;
        if (aVar != null) {
            aVar.c(b().b());
        }
        niw.a(6, "Phenix", "Cancelled | requestId:" + b().H() + "| url:" + p);
    }

    @Override // tb.nms
    public void a(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8218858", new Object[]{this, new Float(f)});
        } else if (this.c.getProgressListener() == null) {
        } else {
            f fVar = new f(b().m(), f);
            fVar.setUrl(b().p());
            this.c.getProgressListener().onHappen(fVar);
        }
    }

    @Override // tb.nms
    public nmv<e, b> a(j jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nmv) ipChange.ipc$dispatch("b8a27763", new Object[]{this, jVar});
        }
        super.a(jVar);
        nnb P = b().P();
        if (P != null) {
            ((nir) P).a(jVar);
        }
        return this;
    }

    private void a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821975c", new Object[]{this, new Long(j)});
        } else if (this.d == null) {
        } else {
            ImageStatistics b = b().b();
            b.c(a(j, false, true, b().H()));
            this.d.a(b);
        }
    }

    private Map<String, Integer> a(long j, boolean z, boolean z2, int i) {
        StringBuilder sb;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("64e5659c", new Object[]{this, new Long(j), new Boolean(z), new Boolean(z2), new Integer(i)});
        }
        HashMap hashMap = null;
        if (!z && !z2) {
            return null;
        }
        int s = (int) (j - b().s());
        int t = b().t() <= 0 ? 0 : (int) (j - b().t());
        if (z) {
            sb = new StringBuilder(150);
            sb.append("User-Callback: ");
            sb.append(System.currentTimeMillis() - j);
            sb.append('\n');
            sb.append("Total-Time: ");
            sb.append(s);
            sb.append('\n');
            sb.append("Wait-Main: ");
            sb.append(t);
            sb.append('\n');
        } else {
            sb = null;
        }
        if (z2) {
            hashMap = new HashMap();
        }
        int i2 = 0;
        for (Map.Entry<String, Long> entry : b().E().entrySet()) {
            String key = entry.getKey();
            int intValue = entry.getValue().intValue();
            if (z) {
                sb.append(key);
                sb.append(ResponseProtocolType.COMMENT);
                if (intValue < 0) {
                    sb.append("Unknown(cause interrupted)");
                } else {
                    sb.append(intValue);
                }
                sb.append('\n');
            }
            if (intValue >= 0) {
                i2 += intValue;
                if (z2) {
                    hashMap.put(key, Integer.valueOf(intValue));
                }
            }
        }
        int i3 = i2 + t;
        if (s >= i3) {
            i3 = s;
        }
        int i4 = (i3 - i2) - t;
        if (z2) {
            hashMap.put("totalTime", Integer.valueOf(i3));
            hashMap.put(ImageStatistics.KEY_SCHEDULE_TIME, Integer.valueOf(i4));
            a aVar = this.d;
            if (aVar != null && this.e != null && i4 >= aVar.f()) {
                hashMap.put(ImageStatistics.KEY_MASTER_WAIT_SIZE, Integer.valueOf(this.e.d().c()));
                hashMap.put(ImageStatistics.KEY_NETWORK_WAIT_SIZE, Integer.valueOf(this.e.b().c()));
                hashMap.put(ImageStatistics.KEY_DECODE_WAIT_SIZE, Integer.valueOf(this.e.c().c()));
            }
            hashMap.put(ImageStatistics.KEY_WAIT_FOR_MAIN, Integer.valueOf(t));
        }
        if (z) {
            sb.append("Schedule-Time: ");
            sb.append(i4);
            niw.a("PhenixConsumer", b(), "Detail-Cost:\n%s\n", sb.substring(0));
        }
        if (com.taobao.phenix.intf.b.h().F()) {
            int c = this.e.e().c();
            if (c >= 5) {
                niw.d("Phenix", "requestId=%d,UI_QUEUE_SIZE=%d", Integer.valueOf(i), Integer.valueOf(c));
            }
        } else {
            niw.d("Phenix", "requestId=%d,UI_QUEUE_SIZE=%d", Integer.valueOf(i), Integer.valueOf(this.e.e().c()));
        }
        return hashMap;
    }
}
