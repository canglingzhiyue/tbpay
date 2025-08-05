package com.taobao.android.detail.sdk.factory.manager;

import android.util.Pair;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.sdk.model.node.NodeBundle;
import com.taobao.android.detail.sdk.model.template.ActionModel;
import com.taobao.android.trade.event.Event;
import java.util.ArrayList;
import java.util.Iterator;
import tb.evy;
import tb.ewg;
import tb.kge;
import tb.tpc;

/* loaded from: classes4.dex */
public class a extends AbsFactoryManager<evy> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private ArrayList<Pair<Integer, evy>> b;

    /* renamed from: com.taobao.android.detail.sdk.factory.manager.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static class C0394a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static final a f10246a;

        static {
            kge.a(-762228945);
            f10246a = new a();
        }

        public static /* synthetic */ a a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("b6d1959f", new Object[0]) : f10246a;
        }
    }

    static {
        kge.a(202100214);
        a().a(new ewg(), 5);
    }

    private a() {
        this.b = new ArrayList<>();
        tpc.a("com.taobao.android.detail.sdk.factory.manager.EventFactoryManager");
    }

    public static a a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("b6d1959f", new Object[0]) : C0394a.a();
    }

    public void a(evy evyVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d02b513", new Object[]{this, evyVar, new Integer(i)});
        } else {
            a(evyVar, i, this.b);
        }
    }

    public Event a(ActionModel actionModel, NodeBundle nodeBundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Event) ipChange.ipc$dispatch("f5d82f3b", new Object[]{this, actionModel, nodeBundle});
        }
        Iterator<Pair<Integer, evy>> it = this.b.iterator();
        while (it.hasNext()) {
            Event a2 = ((evy) it.next().second).a(actionModel, nodeBundle);
            if (a2 != null) {
                return a2;
            }
        }
        return null;
    }
}
