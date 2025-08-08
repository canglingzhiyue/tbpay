package com.taobao.android.live.plugin.atype.flexalocal.comments.chat.sale;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.os.Handler;
import android.os.Message;
import mtopsdk.common.util.StringUtils;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import com.taobao.taolive.sdk.adapter.network.NetResponse;
import com.taobao.taolive.sdk.adapter.network.d;
import com.taobao.taolive.sdk.model.f;
import com.taobao.taolive.sdk.utils.q;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;
import tb.ddv;
import tb.kge;

/* loaded from: classes5.dex */
public class b implements c, d, com.taobao.taolive.sdk.model.a, ddv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a */
    private final Context f13621a;
    private final com.taobao.alilive.aliliveframework.frame.a b;
    private final com.taobao.android.live.plugin.atype.flexalocal.comments.chat.c c;
    private ViewGroup d;
    private LinkedBlockingQueue<HotSaleItem> e;
    private a g;
    private String h;
    private String i;
    private final Handler f = new f(this);
    private long j = 120;
    private long k = 2000;
    private StringBuilder l = new StringBuilder();

    static {
        kge.a(2040839109);
        kge.a(-797454141);
        kge.a(1538752924);
        kge.a(191318335);
        kge.a(-1905361424);
    }

    /* renamed from: lambda$CL8Wdcz1-ctvUcqGOzT8RBHQUF4 */
    public static /* synthetic */ void m945lambda$CL8Wdcz1ctvUcqGOzT8RBHQUF4(b bVar) {
        bVar.f();
    }

    @Override // tb.ddv
    public String bizCode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("36951559", new Object[]{this}) : "BottomHotSaleController";
    }

    public b(Context context, com.taobao.alilive.aliliveframework.frame.a aVar, com.taobao.android.live.plugin.atype.flexalocal.comments.chat.c cVar) {
        this.f13621a = context;
        this.b = aVar;
        this.c = cVar;
        b();
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.comments.chat.sale.c
    public void a(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a1860a7", new Object[]{this, viewGroup});
            return;
        }
        this.d = viewGroup;
        this.e = new LinkedBlockingQueue<>();
        this.g = new a(this);
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.comments.chat.sale.c
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        Handler handler = this.f;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        ViewGroup viewGroup = this.d;
        if (viewGroup != null && viewGroup.getChildCount() > 0) {
            this.c.a(com.taobao.android.live.plugin.atype.flexalocal.comments.chat.a.KEY_HOT_SALE_VIEW, Boolean.FALSE);
            this.d.removeAllViews();
            this.d.setVisibility(8);
        }
        LinkedBlockingQueue<HotSaleItem> linkedBlockingQueue = this.e;
        if (linkedBlockingQueue != null && !linkedBlockingQueue.isEmpty()) {
            this.e.clear();
        }
        com.taobao.alilive.aliliveframework.frame.a aVar = this.b;
        if (aVar != null && aVar.e() != null) {
            this.b.e().b(this);
        }
        this.l = new StringBuilder();
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else if (this.g == null || StringUtils.isEmpty(this.h)) {
        } else {
            this.g.a(this.h, this.i, "hotSale", z, z ? null : this.l.toString());
        }
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.comments.chat.sale.c
    public void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
            return;
        }
        this.h = str;
        this.i = str2;
        a(true);
        this.f.sendEmptyMessage(2);
        a("BottomHotSaleController start");
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        com.taobao.alilive.aliliveframework.frame.a aVar = this.b;
        if (aVar == null || aVar.e() == null) {
            return;
        }
        this.b.e().a(this);
    }

    @Override // com.taobao.taolive.sdk.adapter.network.d
    public void onSuccess(int i, NetResponse netResponse, NetBaseOutDo netBaseOutDo, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb090915", new Object[]{this, new Integer(i), netResponse, netBaseOutDo, obj});
            return;
        }
        if ((netBaseOutDo instanceof BottomHotSaleResponse) && (netBaseOutDo.mo1437getData() instanceof BottomHotSaleDo)) {
            BottomHotSaleDo bottomHotSaleDo = (BottomHotSaleDo) netBaseOutDo.mo1437getData();
            this.j = bottomHotSaleDo.pullInterval > 0 ? bottomHotSaleDo.pullInterval : this.j;
            this.k = bottomHotSaleDo.disappearTime > 0 ? bottomHotSaleDo.disappearTime : this.k;
            List<HotSaleItem> list = bottomHotSaleDo.itemsList;
            if (list != null && !list.isEmpty()) {
                this.e.addAll(list);
                this.l = new StringBuilder();
                for (int i2 = 0; i2 < list.size(); i2++) {
                    this.l.append(list.get(i2).itemId);
                    if (i2 != list.size() - 1) {
                        this.l.append(",");
                    }
                }
            }
        }
        a(this.j);
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        LinkedBlockingQueue<HotSaleItem> linkedBlockingQueue = this.e;
        if (linkedBlockingQueue == null || linkedBlockingQueue.isEmpty()) {
            ViewGroup viewGroup = this.d;
            if (viewGroup == null || viewGroup.getChildCount() <= 0) {
                return;
            }
            this.c.a(com.taobao.android.live.plugin.atype.flexalocal.comments.chat.a.KEY_HOT_SALE_VIEW, Boolean.FALSE);
            this.d.removeAllViews();
        } else if (!this.c.a(com.taobao.android.live.plugin.atype.flexalocal.comments.chat.a.KEY_HOT_SALE_VIEW)) {
        } else {
            a(this.e.poll());
        }
    }

    private void a(HotSaleItem hotSaleItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7cd7d690", new Object[]{this, hotSaleItem});
        } else if (hotSaleItem == null) {
        } else {
            this.d.setVisibility(0);
            DXRootView createDX = com.taobao.android.live.plugin.proxy.f.m().createDX(this.d.getContext(), hotSaleItem.templateName);
            if (createDX != null) {
                this.d.removeAllViews();
                this.d.addView(createDX);
                this.c.a(com.taobao.android.live.plugin.atype.flexalocal.comments.chat.a.KEY_HOT_SALE_VIEW, Boolean.TRUE);
                b(hotSaleItem);
                com.taobao.android.live.plugin.proxy.f.m().renderDX(createDX, hotSaleItem.dataMessage);
            }
            d();
        }
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.d, "translationY", this.d.getMeasuredHeight(), 0.0f).setDuration(300L);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(duration);
        animatorSet.start();
    }

    @Override // com.taobao.taolive.sdk.adapter.network.d
    public void onError(int i, NetResponse netResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6dfe77ca", new Object[]{this, new Integer(i), netResponse, obj});
        } else {
            a(this.j);
        }
    }

    @Override // com.taobao.taolive.sdk.adapter.network.d
    public void onSystemError(int i, NetResponse netResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9bfdbcd9", new Object[]{this, new Integer(i), netResponse, obj});
        } else {
            a(this.j);
        }
    }

    private void a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821975c", new Object[]{this, new Long(j)});
            return;
        }
        Handler handler = this.f;
        if (handler == null) {
            return;
        }
        handler.sendEmptyMessageDelayed(1, j * 1000);
    }

    @Override // tb.ddv
    public void onEvent(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3897928", new Object[]{this, str, obj});
        } else if ((!com.taobao.android.live.plugin.atype.flexalocal.comments.chat.a.KEY_ANCHOR_RESPONSE_VIEW.equals(str) && !com.taobao.android.live.plugin.atype.flexalocal.comments.chat.a.KEY_SAYS_CLUSTER_VIEW.equals(str)) || !(obj instanceof String) || !StringUtils.equals((String) obj, "true")) {
        } else {
            e();
        }
    }

    private void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
        } else if (this.d == null) {
        } else {
            com.taobao.android.live.plugin.atype.flexalocal.comments.chat.b.a(new Runnable() { // from class: com.taobao.android.live.plugin.atype.flexalocal.comments.chat.sale.-$$Lambda$b$CL8Wdcz1-ctvUcqGOzT8RBHQUF4
                {
                    b.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    b.m945lambda$CL8Wdcz1ctvUcqGOzT8RBHQUF4(b.this);
                }
            });
        }
    }

    public /* synthetic */ void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        if (this.d.getChildCount() > 0) {
            this.d.removeAllViews();
        }
        this.d.setVisibility(8);
    }

    @Override // tb.ddv
    public String[] observeEvents() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String[]) ipChange.ipc$dispatch("37b2602b", new Object[]{this}) : new String[]{com.taobao.android.live.plugin.atype.flexalocal.comments.chat.a.KEY_ANCHOR_RESPONSE_VIEW, com.taobao.android.live.plugin.atype.flexalocal.comments.chat.a.KEY_SAYS_CLUSTER_VIEW};
    }

    @Override // tb.ddv
    public String observeUniqueIdentification() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4914bdfe", new Object[]{this});
        }
        com.taobao.alilive.aliliveframework.frame.a aVar = this.b;
        if (aVar != null) {
            return aVar.G();
        }
        return null;
    }

    @Override // com.taobao.taolive.sdk.model.a
    public void handleMessage(Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
            return;
        }
        int i = message.what;
        if (i == 1) {
            a(false);
        } else if (i != 2) {
        } else {
            this.f.removeMessages(2);
            this.f.sendEmptyMessageDelayed(2, this.k);
            c();
        }
    }

    private void b(HotSaleItem hotSaleItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("34c44411", new Object[]{this, hotSaleItem});
            return;
        }
        HashMap<String, String> hashMap = new HashMap<>();
        if (hotSaleItem != null) {
            hashMap.put("item_id", String.valueOf(hotSaleItem.itemId));
            if (hotSaleItem.dataMessage != null) {
                hashMap.put("recom_reason", hotSaleItem.dataMessage.getString("desc"));
            }
        }
        if (com.taobao.android.live.plugin.atype.flexalocal.good.a.a().j() == null) {
            return;
        }
        com.taobao.android.live.plugin.atype.flexalocal.good.a.a().j().b("Show-commentBuyAtmosphere", hashMap);
    }

    private void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else if (this.b == null) {
        } else {
            q.b("ChatWarmOpt", this.b.j() + " " + str);
        }
    }
}
