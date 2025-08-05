package com.taobao.android.fluid.business.intelligence;

import android.content.BroadcastReceiver;
import android.content.IntentFilter;
import android.os.Build;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.framework.data.IDataService;
import com.taobao.android.fluid.framework.data.datamodel.a;
import com.taobao.android.fluid.framework.deprecated.message.IMessageService;
import com.tmall.android.dai.DAI;
import com.uc.webview.export.media.MessageID;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.jcs;
import tb.kge;
import tb.snd;
import tb.spz;

/* loaded from: classes5.dex */
public class b implements snd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a */
    private static final String[] f12401a;
    private final FluidContext d;
    private IMessageService e;
    private final AtomicBoolean b = new AtomicBoolean(false);
    private final HashMap<String, Integer> c = new HashMap<>();
    private Boolean f = false;
    private Boolean g = false;
    private Boolean h = true;
    private int i = 1000;
    private final BroadcastReceiver j = new BroadcastReceiver() { // from class: com.taobao.android.fluid.business.intelligence.SmartMobileBroadcastHandler$1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* JADX WARN: Code restructure failed: missing block: B:27:0x00aa, code lost:
            tb.spz.c("SmartMobileBroadcastHandler", r1 + "模型的广播未处理");
         */
        /* JADX WARN: Code restructure failed: missing block: B:43:?, code lost:
            return;
         */
        @Override // android.content.BroadcastReceiver
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void onReceive(android.content.Context r8, android.content.Intent r9) {
            /*
                Method dump skipped, instructions count: 265
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.fluid.business.intelligence.SmartMobileBroadcastHandler$1.onReceive(android.content.Context, android.content.Intent):void");
        }
    };

    @Override // tb.snd
    public void onCreate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18a7a6c2", new Object[]{this});
        }
    }

    @Override // tb.snd
    public void onStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
        }
    }

    @Override // tb.snd
    public void onStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
        }
    }

    public static /* synthetic */ a.c a(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a.c) ipChange.ipc$dispatch("c5c5458b", new Object[]{bVar}) : bVar.c();
    }

    public static /* synthetic */ HashMap b(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (HashMap) ipChange.ipc$dispatch("22162592", new Object[]{bVar}) : bVar.c;
    }

    public static /* synthetic */ int c(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("c5bf4323", new Object[]{bVar})).intValue() : bVar.i;
    }

    public static /* synthetic */ IMessageService d(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IMessageService) ipChange.ipc$dispatch("bb19e206", new Object[]{bVar}) : bVar.e;
    }

    static {
        kge.a(118298107);
        kge.a(1755210026);
        f12401a = new String[]{"g2_dynamic_rec_boradcast"};
    }

    public b(FluidContext fluidContext) {
        this.d = fluidContext;
    }

    @Override // tb.snd
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        this.f = true;
        d();
        a();
    }

    @Override // tb.snd
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        this.f = false;
        b();
    }

    @Override // tb.snd
    public void cI_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6eaece0", new Object[]{this});
            return;
        }
        this.e = null;
        spz.a("SmartMobileBroadcastHandler", MessageID.onDestroy);
    }

    public void a() {
        String[] strArr;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        spz.a("SmartMobileBroadcastHandler", "registerSmartMobileReceiver");
        if (!this.h.booleanValue()) {
            return;
        }
        try {
            this.c.clear();
            if (!this.b.compareAndSet(false, true)) {
                return;
            }
            IntentFilter intentFilter = new IntentFilter(DAI.ACTION_COMPUTE_COMPLETE);
            for (String str : f12401a) {
                intentFilter.addDataScheme("DAI_" + str);
            }
            if (Build.VERSION.SDK_INT >= 19) {
                intentFilter.addDataSchemeSpecificPart("com.tmall.android.dai", 0);
            }
            this.d.getContext().registerReceiver(this.j, intentFilter);
            spz.a("SmartMobileBroadcastHandler", "registerSmartMobileReceiverDone");
        } catch (Throwable th) {
            spz.c("SmartMobileBroadcastHandler", "注册端智能广播:" + th.getMessage());
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        spz.a("SmartMobileBroadcastHandler", "unregisterSmartMobileReceiver");
        if (!this.h.booleanValue()) {
            return;
        }
        try {
            if (!this.b.compareAndSet(true, false)) {
                return;
            }
            this.d.getContext().unregisterReceiver(this.j);
            spz.a("SmartMobileBroadcastHandler", "unregisterSmartMobileReceiverDone");
        } catch (Throwable th) {
            spz.c("SmartMobileBroadcastHandler", "解注册:" + th.getMessage());
        }
    }

    private a.c c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a.c) ipChange.ipc$dispatch("d1506347", new Object[]{this});
        }
        com.taobao.android.fluid.framework.data.datamodel.a currentMediaSetData = ((IDataService) this.d.getService(IDataService.class)).getCurrentMediaSetData();
        if (currentMediaSetData != null) {
            return currentMediaSetData.a();
        }
        return null;
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        this.e = (IMessageService) this.d.getService(IMessageService.class);
        if (this.g.booleanValue()) {
            return;
        }
        this.h = Boolean.valueOf(jcs.b());
        this.i = jcs.c();
        this.g = true;
    }
}
