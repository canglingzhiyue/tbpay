package com.taobao.android.live.plugin.atype.flexalocal.good.view.liveGoodsList.liveStateView;

import android.os.Handler;
import android.os.Message;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.good.business.ItemlistV2Request2;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import com.taobao.taolive.sdk.adapter.network.NetResponse;
import java.util.ArrayDeque;
import tb.kge;

/* loaded from: classes6.dex */
public class c implements com.taobao.taolive.sdk.adapter.network.d, com.taobao.taolive.sdk.model.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Handler f13866a = new com.taobao.taolive.sdk.model.f(this);
    private ArrayDeque<b> b = new ArrayDeque<>();
    private com.taobao.android.live.plugin.atype.flexalocal.good.business.e c;
    private a d;

    /* loaded from: classes6.dex */
    public interface a {
        void a(b bVar);

        void a(NetResponse netResponse, b bVar);

        void a(NetResponse netResponse, NetBaseOutDo netBaseOutDo, b bVar);

        void b(NetResponse netResponse, b bVar);
    }

    /* loaded from: classes6.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public ItemlistV2Request2 f13867a;
        public boolean b;
        public long c;
        public long d;
        public long e;

        static {
            kge.a(1021109943);
        }
    }

    static {
        kge.a(993463966);
        kge.a(-1905361424);
        kge.a(-797454141);
    }

    public c(a aVar) {
        this.d = aVar;
        if (this.d != null) {
            return;
        }
        throw new RuntimeException("IGoodDataObserver can not be null.");
    }

    @Override // com.taobao.taolive.sdk.adapter.network.d
    public void onSuccess(int i, NetResponse netResponse, NetBaseOutDo netBaseOutDo, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb090915", new Object[]{this, new Integer(i), netResponse, netBaseOutDo, obj});
            return;
        }
        if (this.c != null && obj != null) {
            ((com.taobao.android.live.plugin.atype.flexalocal.good.business.e) obj).f13754a.e = this.c.b();
        }
        this.d.a(netResponse, netBaseOutDo, ((com.taobao.android.live.plugin.atype.flexalocal.good.business.e) obj).f13754a);
        this.f13866a.sendEmptyMessage(1);
    }

    @Override // com.taobao.taolive.sdk.adapter.network.d
    public void onError(int i, NetResponse netResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6dfe77ca", new Object[]{this, new Integer(i), netResponse, obj});
            return;
        }
        this.d.a(netResponse, ((com.taobao.android.live.plugin.atype.flexalocal.good.business.e) obj).f13754a);
        this.f13866a.sendEmptyMessage(1);
    }

    @Override // com.taobao.taolive.sdk.adapter.network.d
    public void onSystemError(int i, NetResponse netResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9bfdbcd9", new Object[]{this, new Integer(i), netResponse, obj});
            return;
        }
        this.d.b(netResponse, ((com.taobao.android.live.plugin.atype.flexalocal.good.business.e) obj).f13754a);
        this.f13866a.sendEmptyMessage(1);
    }

    public void a(ItemlistV2Request2 itemlistV2Request2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5d98436", new Object[]{this, itemlistV2Request2, new Boolean(z)});
            return;
        }
        b bVar = new b();
        bVar.f13867a = itemlistV2Request2;
        bVar.b = z;
        bVar.d = System.currentTimeMillis();
        this.b.push(bVar);
        if (this.b.size() > 3) {
            this.d.a(this.b.removeLast());
        }
        this.f13866a.sendEmptyMessage(1);
    }

    @Override // com.taobao.taolive.sdk.model.a
    public void handleMessage(Message message) {
        b pop;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
        } else if (1 != message.what || this.b.isEmpty() || (pop = this.b.pop()) == null || pop.f13867a == null) {
        } else {
            pop.c = System.currentTimeMillis();
            this.c = new com.taobao.android.live.plugin.atype.flexalocal.good.business.e(this, pop);
            this.c.a(pop.f13867a);
        }
    }
}
