package com.alibaba.android.aura.taobao.adapter.extension.linkage.event;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.support.v4.content.LocalBroadcastManager;
import com.alibaba.android.aura.AURAFlowData;
import com.alibaba.android.aura.AURAGlobalData;
import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.android.aura.b;
import com.alibaba.android.aura.datamodel.c;
import com.alibaba.android.aura.datamodel.linkage.UMFLinkageTrigger;
import com.alibaba.android.aura.f;
import com.alibaba.android.aura.q;
import com.alibaba.android.aura.s;
import com.alibaba.android.aura.service.event.AURAEventIO;
import com.alibaba.android.umf.node.service.parse.state.tree.MultiTreeNode;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.aqq;
import tb.aqs;
import tb.arc;
import tb.ard;
import tb.arv;
import tb.ayj;
import tb.ayl;
import tb.aym;
import tb.baz;
import tb.hif;
import tb.kge;

@AURAExtensionImpl(code = "aura.impl.event.submit")
/* loaded from: classes2.dex */
public final class AURASubmitEvent extends arv {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EVENT_TYPE = "submit";
    public static final String RPC_ENDPOINT = "endpoint";
    public static final String RPC_SERVICE_NAME = "service_name";
    private static volatile boolean d;
    private static long f;

    /* renamed from: a  reason: collision with root package name */
    private ayl f2204a;
    private AURAGlobalData b;
    private PayStateBroadcast c;
    private boolean e = baz.a("enablePaySandbox", true);

    /* loaded from: classes2.dex */
    interface a {
        void a();
    }

    public static /* synthetic */ Object ipc$super(AURASubmitEvent aURASubmitEvent, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1504501726) {
            super.onDestroy();
            return null;
        } else if (hashCode == -1219783041) {
            super.onCreate((q) objArr[0], (f) objArr[1]);
            return null;
        } else if (hashCode != 563256106) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.onDataChanged((AURAFlowData) objArr[0], (AURAGlobalData) objArr[1], (aqs) objArr[2]);
            return null;
        }
    }

    @Override // tb.arv
    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        return true;
    }

    @Override // tb.arw
    public String e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[]{this}) : "submit";
    }

    public static /* synthetic */ boolean a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a821d370", new Object[]{new Boolean(z)})).booleanValue();
        }
        d = z;
        return z;
    }

    static {
        kge.a(392852762);
        d = false;
    }

    @Override // tb.arv
    public void b(AURAEventIO aURAEventIO) {
        MultiTreeNode multiTreeNode;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("186833d5", new Object[]{this, aURAEventIO});
            return;
        }
        s b = b().b();
        if (b == null || this.f2204a == null || this.b == null || c(aURAEventIO)) {
            return;
        }
        if ((d && this.e) || (multiTreeNode = (MultiTreeNode) this.b.get(ayj.GLOBAL_DATA_STATE_TREE, MultiTreeNode.class)) == null) {
            return;
        }
        ard a2 = arc.a();
        a2.a("执行submit事件@" + Integer.toHexString(hashCode()), arc.a.a().a("AURA/ability").b());
        UMFLinkageTrigger a3 = aym.a(aURAEventIO);
        a3.setStateTree(multiTreeNode);
        final aqq a4 = this.f2204a.a();
        b.a("aura.workflow.submit", a3, new aqq() { // from class: com.alibaba.android.aura.taobao.adapter.extension.linkage.event.AURASubmitEvent.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.aqq
            public void a(c cVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("6b8a7af", new Object[]{this, cVar});
                    return;
                }
                a4.a(cVar);
                AURASubmitEvent.a(true);
            }

            @Override // tb.aqq, tb.aqs
            public void a(b bVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("2c671180", new Object[]{this, bVar});
                    return;
                }
                a4.a(bVar);
                AURASubmitEvent.a(false);
            }

            @Override // tb.aqq
            public void a() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                } else {
                    a4.a();
                }
            }
        });
    }

    @Override // tb.arv
    public void a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821975c", new Object[]{this, new Long(j)});
        } else {
            f = j;
        }
    }

    @Override // tb.arv
    public long k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5f95766", new Object[]{this})).longValue() : f;
    }

    private boolean c(AURAEventIO aURAEventIO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3dfc3cda", new Object[]{this, aURAEventIO})).booleanValue();
        }
        for (hif hifVar : c().b(hif.class)) {
            if (hifVar.a(aURAEventIO)) {
                return true;
            }
        }
        return false;
    }

    @Override // tb.arv, tb.ark
    public void onDataChanged(AURAFlowData aURAFlowData, AURAGlobalData aURAGlobalData, aqs aqsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21929b2a", new Object[]{this, aURAFlowData, aURAGlobalData, aqsVar});
            return;
        }
        super.onDataChanged(aURAFlowData, aURAGlobalData, aqsVar);
        this.b = aURAGlobalData;
    }

    @Override // tb.arv, tb.arl
    public void onCreate(q qVar, f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b74b967f", new Object[]{this, qVar, fVar});
            return;
        }
        super.onCreate(qVar, fVar);
        ard a2 = arc.a();
        a2.a("submit事件初始化@" + Integer.toHexString(hashCode()), arc.a.a().a("AURA/ability").b());
        this.f2204a = (ayl) fVar.a(ayl.class);
        if (!this.e) {
            return;
        }
        this.c = new PayStateBroadcast(new a() { // from class: com.alibaba.android.aura.taobao.adapter.extension.linkage.event.AURASubmitEvent.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alibaba.android.aura.taobao.adapter.extension.linkage.event.AURASubmitEvent.a
            public void a() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                } else {
                    AURASubmitEvent.a(false);
                }
            }
        });
        a(qVar.e(), this.c);
    }

    @Override // tb.arv, tb.arl
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        ard a2 = arc.a();
        a2.a("submit事件destroy@" + Integer.toHexString(hashCode()), arc.a.a().a("AURA/ability").b());
        d = false;
        b(b().e(), this.c);
    }

    /* loaded from: classes2.dex */
    public static class PayStateBroadcast extends BroadcastReceiver {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final a f2207a;

        static {
            kge.a(-2053227314);
        }

        public PayStateBroadcast(a aVar) {
            this.f2207a = aVar;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                return;
            }
            ard a2 = arc.a();
            a2.b("PayStateBroadcast 接收到action " + intent.getAction(), arc.a.a().a("AURA/ability").b());
            this.f2207a.a();
        }
    }

    private void a(Context context, BroadcastReceiver broadcastReceiver) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3a954e7", new Object[]{this, context, broadcastReceiver});
        } else if (broadcastReceiver == null) {
        } else {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("onPagePause");
            intentFilter.addAction("com.alipay.android.app.pay.ACTION_PAY_SUCCESS");
            intentFilter.addAction("com.alipay.android.app.pay.ACTION_PAY_FAILED");
            intentFilter.addCategory("android.intent.category.DEFAULT");
            b(context, broadcastReceiver);
            LocalBroadcastManager.getInstance(context).registerReceiver(broadcastReceiver, intentFilter);
        }
    }

    private void b(Context context, BroadcastReceiver broadcastReceiver) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3168cce8", new Object[]{this, context, broadcastReceiver});
        } else if (broadcastReceiver == null) {
        } else {
            LocalBroadcastManager.getInstance(context).unregisterReceiver(broadcastReceiver);
        }
    }
}
