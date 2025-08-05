package com.taobao.android.detail.wrapper.ext.event.subscriber.desc;

import android.content.Context;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.taobao.TBActionBar;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.activity.DetailCoreActivity;
import com.taobao.android.detail.core.event.video.c;
import com.taobao.android.detail.core.ultronengine.DetailRecyclerView;
import com.taobao.android.detail.core.ultronengine.e;
import com.taobao.android.detail.core.ultronengine.f;
import com.taobao.android.detail.core.ultronengine.g;
import com.taobao.android.detail.wrapper.activity.DetailActivity;
import com.taobao.android.detail.wrapper.ext.event.subscriber.desc.FloatDescFilterFragment;
import com.taobao.android.trade.event.ThreadMode;
import com.taobao.android.trade.event.i;
import com.taobao.android.trade.event.j;
import com.taobao.taobao.R;
import com.taobao.uikit.actionbar.TBActionView;
import java.util.HashMap;
import tb.dxz;
import tb.dya;
import tb.ect;
import tb.emu;
import tb.enq;
import tb.eoa;
import tb.epo;
import tb.epp;
import tb.eps;
import tb.fgg;
import tb.kge;

/* loaded from: classes5.dex */
public class a implements FloatDescFilterFragment.a, j<eoa> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String DETAIL_COMMENT_FRAGMENT_TAG = "FloatDescFloatFragment";

    /* renamed from: a  reason: collision with root package name */
    private DetailCoreActivity f11283a;
    private View b;
    private View c;
    private e d;
    private dxz e;

    static {
        kge.a(1397142113);
        kge.a(-1453870097);
        kge.a(-188080002);
    }

    public static /* synthetic */ DetailCoreActivity a(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DetailCoreActivity) ipChange.ipc$dispatch("6d93ebc4", new Object[]{aVar}) : aVar.f11283a;
    }

    @Override // com.taobao.android.trade.event.j
    public /* synthetic */ i handleEvent(eoa eoaVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (i) ipChange.ipc$dispatch("caa7474e", new Object[]{this, eoaVar}) : a(eoaVar);
    }

    public a(DetailCoreActivity detailCoreActivity) {
        this.f11283a = detailCoreActivity;
        emu.a("com.taobao.android.detail.wrapper.ext.event.subscriber.desc.OpenFilterDescViewSubscriber");
    }

    public i a(eoa eoaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (i) ipChange.ipc$dispatch("900a2ce", new Object[]{this, eoaVar});
        }
        d();
        c();
        return com.taobao.android.detail.core.event.a.SUCCESS;
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        this.b = this.f11283a.findViewById(R.id.ll_filter);
        this.c = this.f11283a.findViewById(R.id.rl_desc_actionbar);
        TBActionView tBActionView = (TBActionView) this.f11283a.findViewById(R.id.btn_desc_menu);
        tBActionView.setTitle(this.f11283a.getString(R.string.detail_menu_more_text));
        tBActionView.switchActionStyle(TBActionBar.ActionBarStyle.NORMAL);
        ((DetailActivity) this.f11283a).getPublicMenu().setCustomOverflow(tBActionView);
        if (this.f11283a.findViewById(R.id.btn_desc_back) == null) {
            return;
        }
        this.f11283a.findViewById(R.id.btn_desc_back).setOnClickListener(new View.OnClickListener() { // from class: com.taobao.android.detail.wrapper.ext.event.subscriber.desc.a.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                } else {
                    new com.taobao.android.detail.wrapper.ext.event.subscriber.basic.a(a.a(a.this)).a(new enq());
                }
            }
        });
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        a(true);
        dya y = this.f11283a.y();
        if (y == null || y.k == null) {
            return;
        }
        DialogFragment dialogFragment = y.k.d;
        if (dialogFragment == null) {
            dialogFragment = FloatDescFilterFragment.newDialogInstance(this.f11283a);
            y.k.d = dialogFragment;
        }
        FloatDescFilterFragment floatDescFilterFragment = (FloatDescFilterFragment) dialogFragment;
        FragmentManager supportFragmentManager = this.f11283a.getSupportFragmentManager();
        FragmentTransaction beginTransaction = supportFragmentManager.beginTransaction();
        beginTransaction.add(R.id.fl_filter_container, floatDescFilterFragment, DETAIL_COMMENT_FRAGMENT_TAG);
        beginTransaction.addToBackStack(null);
        floatDescFilterFragment.setDescCallBack(this);
        beginTransaction.commitAllowingStateLoss();
        try {
            supportFragmentManager.executePendingTransactions();
        } catch (IllegalStateException e) {
            epp.a(e);
        }
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        View view = this.b;
        int i = 8;
        if (view != null) {
            view.setVisibility(z ? 0 : 8);
        }
        View view2 = this.c;
        if (view2 == null) {
            return;
        }
        if (z) {
            i = 0;
        }
        view2.setVisibility(i);
    }

    @Override // com.taobao.android.detail.wrapper.ext.event.subscriber.desc.FloatDescFilterFragment.a
    public void a() {
        DetailRecyclerView e;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        c.c(this.f11283a, null);
        dya y = this.f11283a.y();
        if (y != null && this.f11283a.C().f10055a.b) {
            f f = y.f();
            if (f != null && (e = f.e()) != null) {
                int lastVisibleItem = e.getLastVisibleItem();
                int i = 0;
                while (true) {
                    if (i > lastVisibleItem) {
                        break;
                    }
                    this.d = g.a(e, i);
                    e eVar = this.d;
                    if (eVar instanceof fgg) {
                        eVar.a(false, false);
                        break;
                    }
                    i++;
                }
            }
        } else if (y != null && y.k != null) {
            this.e = y.k.l();
            dxz dxzVar = this.e;
            if (dxzVar != null) {
                dxzVar.a(false, false);
            }
        }
        c.a((Context) this.f11283a, (com.taobao.android.trade.event.c) null, true);
        b(true);
    }

    @Override // com.taobao.android.detail.wrapper.ext.event.subscriber.desc.FloatDescFilterFragment.a
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        a(false);
        e eVar = this.d;
        if (eVar instanceof fgg) {
            eVar.G_();
        } else {
            dxz dxzVar = this.e;
            if (dxzVar != null) {
                dxzVar.b();
            }
        }
        b(false);
    }

    @Override // com.taobao.android.trade.event.j
    public ThreadMode getThreadMode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ThreadMode) ipChange.ipc$dispatch("6de50c9b", new Object[]{this}) : ThreadMode.MainThread;
    }

    private void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
            return;
        }
        com.taobao.android.detail.datasdk.model.datamodel.node.c z2 = this.f11283a.z();
        if (z2 == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("spm", "a2141.7631564.newproductdetail");
        hashMap.put("item_id", z2.i());
        hashMap.put("user_id", epo.g().e());
        hashMap.put("seller_id", z2.h());
        eps.a(this.f11283a, "Page_Detail", 2201, z ? "Page_Detaill_Show_NewProductDetail" : "Page_Detaill_Close_NewProductDetail", null, null, ect.a(hashMap));
    }
}
