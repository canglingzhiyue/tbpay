package com.taobao.trtc.impl;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.trtc.api.ITrtcInputStream;
import com.taobao.trtc.api.TrtcDefines;
import com.taobao.trtc.api.c;
import com.taobao.trtc.impl.TrtcInnerDefines;
import com.taobao.trtc.utils.TrtcLog;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import tb.kge;

/* loaded from: classes9.dex */
public class TrtcStreamProcessorImpl implements com.taobao.trtc.api.c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final TrtcEngineImpl f23095a;
    private c.a b;
    private final Object c;
    private CopyOnWriteArrayList<b> d;

    /* loaded from: classes9.dex */
    public enum ProcessTaskStats {
        E_STARTING,
        E_SUCCESS
    }

    /* loaded from: classes9.dex */
    public enum ProcessType {
        E_NONE,
        E_PUB,
        E_SUB
    }

    /* loaded from: classes9.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public String f23096a;
        public String b;
        public ProcessType c;
        public int d;
        public String e;

        static {
            kge.a(1646143117);
        }
    }

    /* loaded from: classes9.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public i f23097a;
        public ITrtcInputStream b;
        public ProcessTaskStats c;
        public ProcessTaskStats d;
        public ProcessTaskStats e;
        public String f;
        public TrtcInnerDefines.TrtcStreamProcessParams g;

        static {
            kge.a(1382772725);
        }
    }

    static {
        kge.a(336615941);
        kge.a(-1832538464);
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        synchronized (this.c) {
            Iterator<b> it = this.d.iterator();
            while (it.hasNext()) {
                a(it.next());
            }
            this.d.clear();
            TrtcLog.d("StreamProcess", "task list clear");
        }
    }

    public void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a10b6055", new Object[]{this, aVar});
            return;
        }
        TrtcLog.d("StreamProcess", "update result: type: " + aVar.c + ", input id:" + aVar.f23096a + ", remote id:" + aVar.b + ", code: " + aVar.d + ", msg: " + aVar.e);
        synchronized (this.c) {
            b a2 = a(aVar.f23096a, aVar.b);
            if (a2 == null) {
                TrtcLog.d("StreamProcess", "update process result error, can not find task by id");
                return;
            }
            a2.f = aVar.b;
            if (aVar.d != 0) {
                TrtcLog.a("StreamProcess", "task error, code:" + aVar.d + ", msg: " + aVar.e + ", input id:" + a2.g.streamId + ", remote id:" + a2.f);
                if (this.b != null) {
                    this.b.a(a2.f, aVar.d, aVar.e);
                }
                a(a2);
                return;
            }
            if (aVar.c == ProcessType.E_PUB) {
                a2.c = ProcessTaskStats.E_SUCCESS;
                TrtcInputStreamImpl.a(a2.b, true, TrtcDefines.TrtcFrameType.E_FRAME_STREAM);
            } else if (aVar.c == ProcessType.E_SUB) {
                a2.d = ProcessTaskStats.E_SUCCESS;
                if (a2.f23097a != null) {
                    a2.f23097a.a(true);
                }
            }
            if ((a2.b != null && a2.d == ProcessTaskStats.E_SUCCESS && a2.c == ProcessTaskStats.E_SUCCESS) || (a2.b == null && a2.d == ProcessTaskStats.E_SUCCESS)) {
                a2.e = ProcessTaskStats.E_SUCCESS;
                com.taobao.trtc.utils.h.a("StreamProcess", "stream process, task success, input id:" + a2.g.streamId + ", remote id:" + a2.f);
                if (this.b != null) {
                    this.b.c(aVar.b);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private com.taobao.trtc.impl.TrtcStreamProcessorImpl.b a(java.lang.String r4, java.lang.String r5) {
        /*
            r3 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.trtc.impl.TrtcStreamProcessorImpl.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L1b
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r3
            r2 = 1
            r1[r2] = r4
            r4 = 2
            r1[r4] = r5
            java.lang.String r4 = "292766"
            java.lang.Object r4 = r0.ipc$dispatch(r4, r1)
            com.taobao.trtc.impl.TrtcStreamProcessorImpl$b r4 = (com.taobao.trtc.impl.TrtcStreamProcessorImpl.b) r4
            return r4
        L1b:
            java.util.concurrent.CopyOnWriteArrayList<com.taobao.trtc.impl.TrtcStreamProcessorImpl$b> r0 = r3.d
            java.util.Iterator r0 = r0.iterator()
        L21:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L4f
            java.lang.Object r1 = r0.next()
            com.taobao.trtc.impl.TrtcStreamProcessorImpl$b r1 = (com.taobao.trtc.impl.TrtcStreamProcessorImpl.b) r1
            com.taobao.trtc.impl.TrtcInnerDefines$TrtcStreamProcessParams r2 = r1.g
            java.lang.String r2 = r2.streamId
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L46
            boolean r2 = r5.isEmpty()
            if (r2 != 0) goto L45
            java.lang.String r2 = r1.f
            boolean r2 = r2.equals(r5)
            if (r2 == 0) goto L46
        L45:
            return r1
        L46:
            java.lang.String r2 = r1.f
            boolean r2 = r2.equals(r5)
            if (r2 == 0) goto L21
            return r1
        L4f:
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.trtc.impl.TrtcStreamProcessorImpl.a(java.lang.String, java.lang.String):com.taobao.trtc.impl.TrtcStreamProcessorImpl$b");
    }

    private void a(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a10bd4b4", new Object[]{this, bVar});
        } else if (bVar == null) {
        } else {
            TrtcInputStreamImpl.a(bVar.b, false);
            if (bVar.f23097a != null) {
                bVar.f23097a.a(false);
                this.f23095a.i(bVar.f);
                bVar.f23097a = null;
            }
            com.taobao.trtc.utils.h.a("StreamProcess", "streamProcess remove task | input id: " + bVar.g.streamId + " remote id:" + bVar.f);
            this.d.remove(bVar);
        }
    }
}
