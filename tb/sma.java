package tb;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.framework.performance.a;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes5.dex */
public class sma implements slz {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final FluidContext b;
    private final knj e;

    /* renamed from: a  reason: collision with root package name */
    private final List<spx> f33714a = new ArrayList();
    private final Handler c = new Handler(Looper.getMainLooper()) { // from class: tb.sma.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
                return;
            }
            spy spyVar = (spy) message.obj;
            if (spyVar.c != null) {
                sma.a(sma.this, spyVar);
                return;
            }
            spz.c("MessageCenter", "The message name is null, message: " + spyVar);
        }
    };
    private boolean f = false;
    private boolean d = false;

    static {
        kge.a(689457789);
        kge.a(-103174606);
    }

    public static /* synthetic */ void a(sma smaVar, spy spyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("82679a65", new Object[]{smaVar, spyVar});
        } else {
            smaVar.a(spyVar);
        }
    }

    public sma(FluidContext fluidContext, knj knjVar) {
        this.b = fluidContext;
        this.e = knjVar;
    }

    @Override // tb.slz
    public void sendMessage(spy spyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec3eb99a", new Object[]{this, spyVar});
        } else if (this.d) {
            spz.c("MessageCenter", "sendMessage, THe MessageCenter is destroyed, message: " + spyVar);
        } else if (spyVar.d == null && !"VSMSG_registerFilter".equals(spyVar.c)) {
            spz.c("MessageCenter", "sendMessage, The message id is null, message: " + spyVar);
        } else if (spy.MSG_DATA_CHANGE.equals(spyVar.c) && sjt.a("msgcenter")) {
            a(spyVar);
        } else {
            Message obtain = Message.obtain();
            obtain.obj = spyVar;
            this.c.sendMessage(obtain);
            this.e.a(spyVar);
        }
    }

    @Override // tb.slz
    public void registerMessageHandler(spx spxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b16ee22", new Object[]{this, spxVar});
        } else if (spxVar == null || this.f33714a.contains(spxVar)) {
        } else {
            this.f33714a.add(spxVar);
        }
    }

    @Override // tb.slz
    public void unRegisterMessageHandler(spx spxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1925929b", new Object[]{this, spxVar});
        } else if (this.f || spxVar == null) {
        } else {
            this.f33714a.remove(spxVar);
        }
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        this.f = true;
        for (spx spxVar : this.f33714a) {
            spxVar.cI_();
        }
        this.d = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00f0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void a(tb.spy r13) {
        /*
            Method dump skipped, instructions count: 265
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.sma.a(tb.spy):void");
    }

    private static void a(final spy spyVar, final spx spxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("697ba71", new Object[]{spyVar, spxVar});
            return;
        }
        final String a2 = a.a(spxVar, spyVar);
        ihi.a(new Runnable() { // from class: tb.sma.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                hnb a3 = new hnb(a2).a();
                spxVar.a(spyVar);
                a3.b();
            }
        }, a.b(spxVar), a.a(spxVar), a2);
    }
}
