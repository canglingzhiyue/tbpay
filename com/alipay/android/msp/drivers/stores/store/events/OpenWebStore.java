package com.alipay.android.msp.drivers.stores.store.events;

import android.content.Context;
import com.alipay.android.msp.core.context.MspContext;
import com.alipay.android.msp.drivers.actions.EventAction;
import com.alipay.android.msp.drivers.stores.store.LocalEventStore;
import com.alipay.android.msp.framework.statisticsv2.model.StEvent;
import com.alipay.android.msp.framework.taskscheduler.TaskHelper;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class OpenWebStore extends LocalEventStore {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static /* synthetic */ MspContext a(OpenWebStore openWebStore) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MspContext) ipChange.ipc$dispatch("e3515f55", new Object[]{openWebStore}) : openWebStore.f4584a;
    }

    public static /* synthetic */ MspContext b(OpenWebStore openWebStore) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MspContext) ipChange.ipc$dispatch("2fff88d6", new Object[]{openWebStore}) : openWebStore.f4584a;
    }

    public static /* synthetic */ MspContext c(OpenWebStore openWebStore) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MspContext) ipChange.ipc$dispatch("7cadb257", new Object[]{openWebStore}) : openWebStore.f4584a;
    }

    public static /* synthetic */ MspContext d(OpenWebStore openWebStore) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MspContext) ipChange.ipc$dispatch("c95bdbd8", new Object[]{openWebStore}) : openWebStore.f4584a;
    }

    public static /* synthetic */ MspContext e(OpenWebStore openWebStore) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MspContext) ipChange.ipc$dispatch("160a0559", new Object[]{openWebStore}) : openWebStore.f4584a;
    }

    public static /* synthetic */ int f(OpenWebStore openWebStore) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("21f9b6e5", new Object[]{openWebStore})).intValue() : openWebStore.e;
    }

    public static /* synthetic */ Context g(OpenWebStore openWebStore) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("32d1389", new Object[]{openWebStore}) : openWebStore.d;
    }

    public static /* synthetic */ int h(OpenWebStore openWebStore) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("93ba7823", new Object[]{openWebStore})).intValue() : openWebStore.e;
    }

    public static /* synthetic */ MspContext i(OpenWebStore openWebStore) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MspContext) ipChange.ipc$dispatch("48c2ab5d", new Object[]{openWebStore}) : openWebStore.f4584a;
    }

    public static /* synthetic */ StEvent j(OpenWebStore openWebStore) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (StEvent) ipChange.ipc$dispatch("34dc68cf", new Object[]{openWebStore}) : openWebStore.f;
    }

    public static /* synthetic */ StEvent k(OpenWebStore openWebStore) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (StEvent) ipChange.ipc$dispatch("c8fb78ee", new Object[]{openWebStore}) : openWebStore.f;
    }

    public static /* synthetic */ StEvent l(OpenWebStore openWebStore) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (StEvent) ipChange.ipc$dispatch("5d1a890d", new Object[]{openWebStore}) : openWebStore.f;
    }

    public static /* synthetic */ MspContext m(OpenWebStore openWebStore) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MspContext) ipChange.ipc$dispatch("7b7b5161", new Object[]{openWebStore}) : openWebStore.f4584a;
    }

    public static /* synthetic */ MspContext n(OpenWebStore openWebStore) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MspContext) ipChange.ipc$dispatch("c8297ae2", new Object[]{openWebStore}) : openWebStore.f4584a;
    }

    public static /* synthetic */ MspContext o(OpenWebStore openWebStore) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MspContext) ipChange.ipc$dispatch("14d7a463", new Object[]{openWebStore}) : openWebStore.f4584a;
    }

    public static /* synthetic */ MspContext p(OpenWebStore openWebStore) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MspContext) ipChange.ipc$dispatch("6185cde4", new Object[]{openWebStore}) : openWebStore.f4584a;
    }

    public static /* synthetic */ MspContext q(OpenWebStore openWebStore) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MspContext) ipChange.ipc$dispatch("ae33f765", new Object[]{openWebStore}) : openWebStore.f4584a;
    }

    public static /* synthetic */ MspContext r(OpenWebStore openWebStore) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MspContext) ipChange.ipc$dispatch("fae220e6", new Object[]{openWebStore}) : openWebStore.f4584a;
    }

    public static /* synthetic */ MspContext s(OpenWebStore openWebStore) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MspContext) ipChange.ipc$dispatch("47904a67", new Object[]{openWebStore}) : openWebStore.f4584a;
    }

    public static /* synthetic */ MspContext t(OpenWebStore openWebStore) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MspContext) ipChange.ipc$dispatch("943e73e8", new Object[]{openWebStore}) : openWebStore.f4584a;
    }

    public OpenWebStore(int i) {
        super(i);
    }

    @Override // com.alipay.android.msp.drivers.stores.store.LocalEventStore
    public String onMspAction(EventAction eventAction, final EventAction.MspEvent mspEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("719dcfee", new Object[]{this, eventAction, mspEvent});
        }
        if (this.f4584a == null) {
            return "";
        }
        TaskHelper.execute(new Runnable() { // from class: com.alipay.android.msp.drivers.stores.store.events.OpenWebStore.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
                jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:22:0x009a
                	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:82)
                	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:48)
                	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:40)
                */
            @Override // java.lang.Runnable
            public void run() {
                /*
                    Method dump skipped, instructions count: 1274
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: com.alipay.android.msp.drivers.stores.store.events.OpenWebStore.AnonymousClass1.run():void");
            }
        });
        return "";
    }
}
