package com.taobao.android.behavir.decision;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.behavir.BehaviR;
import com.taobao.android.behavir.config.BHRTaskConfig;
import com.taobao.android.behavir.event.BHREvent;
import com.taobao.android.behavir.event.b;
import com.taobao.android.behavir.event.c;
import com.taobao.android.behavir.util.UtUtils;
import com.taobao.android.behavir.util.i;
import com.taobao.android.behavix.d;
import com.taobao.android.ucp.bridge.NativeBroadcast;
import com.taobao.search.sf.util.tlog.TLogTracker;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Queue;
import tb.kge;

/* loaded from: classes.dex */
public class BHRDecisionEngine implements com.taobao.android.behavir.event.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private c f9135a = new c();
    private b b = new b();
    private final Queue<BHREvent> c = new ArrayDeque();

    /* loaded from: classes4.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static final BHRDecisionEngine f9137a;

        static {
            kge.a(202416890);
            f9137a = BHRDecisionEngine.f();
        }

        public static /* synthetic */ BHRDecisionEngine a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (BHRDecisionEngine) ipChange.ipc$dispatch("2bb99da3", new Object[0]) : f9137a;
        }
    }

    static {
        kge.a(1272021814);
        kge.a(1047112157);
    }

    public static /* synthetic */ BHRDecisionEngine f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (BHRDecisionEngine) ipChange.ipc$dispatch("7f469d68", new Object[0]) : g();
    }

    public static BHRDecisionEngine a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (BHRDecisionEngine) ipChange.ipc$dispatch("2bb99da3", new Object[0]) : a.a();
    }

    public void a(BHREvent bHREvent, List<BHRTaskConfig> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8cc385c8", new Object[]{this, bHREvent, list});
        } else if (bHREvent == null) {
        } else {
            if (!d.e()) {
                UtUtils.a("UCP", 19999, TLogTracker.SCENE_EXCEPTION, NativeBroadcast.MAKE_DECISION, bHREvent.actionName, "");
            } else {
                NativeBroadcast.sendMessageFromJava(NativeBroadcast.MAKE_DECISION, bHREvent.toJsonObject(), null);
            }
        }
    }

    public BHREvent c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (BHREvent) ipChange.ipc$dispatch("73b1cad9", new Object[]{this}) : this.b.a();
    }

    private BHRDecisionEngine() {
    }

    private static BHRDecisionEngine g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (BHRDecisionEngine) ipChange.ipc$dispatch("8ffc6a29", new Object[0]) : new BHRDecisionEngine();
    }

    public BHREvent e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (BHREvent) ipChange.ipc$dispatch("5ea6175b", new Object[]{this}) : c();
    }

    @Override // com.taobao.android.behavir.event.a
    public void a(BHREvent bHREvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f786d7", new Object[]{this, bHREvent});
        } else {
            a(bHREvent, false);
        }
    }

    private void a(final BHREvent bHREvent, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7fa06dd", new Object[]{this, bHREvent, new Boolean(z)});
        } else if (bHREvent == null) {
        } else {
            i.a aVar = new i.a() { // from class: com.taobao.android.behavir.decision.BHRDecisionEngine.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.behavix.utils.b
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                        return;
                    }
                    com.taobao.android.behavir.config.a configCenter = BehaviR.getInstance().getConfigCenter();
                    bHREvent.addBrMark();
                    BHRDecisionEngine.this.a(bHREvent, configCenter.c());
                }
            };
            if (z) {
                i.b(aVar);
            } else {
                i.a(aVar);
            }
        }
    }
}
