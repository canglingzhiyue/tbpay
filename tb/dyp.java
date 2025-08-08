package tb;

import android.support.v4.app.FragmentManager;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.activity.DetailCoreActivity;
import com.taobao.android.detail.core.detail.activity.base.TaobaoBaseActivity;
import com.taobao.android.detail.core.detail.kit.utils.f;
import com.taobao.android.detail.core.detail.kit.view.widget.FoldableButton;
import com.taobao.android.detail.datasdk.event.params.SkuBottomBarStyleDTO;
import com.taobao.android.detail.datasdk.event.params.a;
import com.taobao.android.detail.datasdk.event.sku.OpenSkuEvent;
import com.taobao.android.detail.datasdk.model.datamodel.node.c;
import com.taobao.android.detail.datasdk.model.datamodel.sku.SkuPageModel;
import com.taobao.android.detail.datasdk.model.datamodel.template.ActionModel;
import com.taobao.android.trade.event.Event;
import com.taobao.android.trade.event.d;

/* loaded from: classes4.dex */
public class dyp {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private TaobaoBaseActivity f27117a;
    private FragmentManager b;
    private FoldableButton c;
    private egw d;
    private c e;
    private boolean f = false;

    static {
        kge.a(545599847);
    }

    public static /* synthetic */ FragmentManager a(dyp dypVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FragmentManager) ipChange.ipc$dispatch("53a6422a", new Object[]{dypVar}) : dypVar.b;
    }

    public static /* synthetic */ FoldableButton b(dyp dypVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FoldableButton) ipChange.ipc$dispatch("b7c14887", new Object[]{dypVar}) : dypVar.c;
    }

    public static /* synthetic */ void c(dyp dypVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c31c9f7f", new Object[]{dypVar});
        } else {
            dypVar.f();
        }
    }

    public dyp(TaobaoBaseActivity taobaoBaseActivity, FoldableButton foldableButton, egw egwVar, c cVar) {
        egw egwVar2;
        this.d = egwVar;
        this.e = cVar;
        this.f27117a = taobaoBaseActivity;
        this.c = foldableButton;
        this.b = this.f27117a.getSupportFragmentManager();
        emu.a("com.taobao.android.detail.core.detail.controller.subcontroller.BubbleButtonController");
        if (this.b == null || this.c == null || (egwVar2 = this.d) == null || this.f27117a == null || this.e == null) {
            return;
        }
        if (!StringUtils.isEmpty(egwVar2.f27300a)) {
            this.c.setContentText(this.d.f27300a);
        }
        if (!StringUtils.isEmpty(this.d.c)) {
            f.a(this.f27117a).a(this.c.getIconView(), this.d.c);
        }
        a(this.d.d);
        b();
        this.b.addOnBackStackChangedListener(new FragmentManager.OnBackStackChangedListener() { // from class: tb.dyp.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.support.v4.app.FragmentManager.OnBackStackChangedListener
            public void onBackStackChanged() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("2062519", new Object[]{this});
                } else if (dyp.a(dyp.this).getBackStackEntryCount() == 0) {
                    dyp.this.b();
                } else {
                    dyp.this.a();
                }
            }
        });
        this.c.setOnClickListener(new FoldableButton.c() { // from class: tb.dyp.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.detail.core.detail.kit.view.widget.FoldableButton.c
            public void a(FoldableButton foldableButton2) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("9a063c97", new Object[]{this, foldableButton2});
                    return;
                }
                if (!dyp.b(dyp.this).isFolded()) {
                    dyp.b(dyp.this).startFold();
                }
                dyp.c(dyp.this);
                dyp.this.d();
            }
        });
    }

    private void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        if (str.equals("1")) {
            this.c.postDelayed(new Runnable() { // from class: tb.dyp.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        dyp.b(dyp.this).startUnFold();
                    }
                }
            }, 1000L);
            this.c.postDelayed(new Runnable() { // from class: tb.dyp.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        dyp.b(dyp.this).startFold();
                    }
                }
            }, sad.DEFAULT_TCP_CONNECT_TIMEOUT_MS);
        } else if (str.equals("2")) {
            this.c.startUnFold();
        } else if (str.equals("3")) {
            this.c.startFold();
        } else {
            a();
            return;
        }
        if (this.f) {
            return;
        }
        c();
        this.f = true;
    }

    private void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        try {
            if (eqb.f(this.e.f10055a).hasSku && eqb.f(this.e.f10055a).showSku) {
                OpenSkuEvent openSkuEvent = new OpenSkuEvent(SkuBottomBarStyleDTO.CONFIRM);
                openSkuEvent.f = OpenSkuEvent.BIZ_TYPE_SEND_GIFT;
                openSkuEvent.h = this.d.e;
                openSkuEvent.g = this.d.b;
                com.taobao.android.trade.event.f.a(this.f27117a, openSkuEvent);
            } else {
                e();
            }
        } catch (Exception unused) {
        }
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        FoldableButton foldableButton = this.c;
        if (foldableButton == null) {
            return;
        }
        foldableButton.setVisibility(8);
    }

    public void b() {
        egw egwVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (this.c == null || (egwVar = this.d) == null || StringUtils.isEmpty(egwVar.b)) {
        } else {
            this.c.setVisibility(0);
        }
    }

    public void c() {
        Event a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else if (this.d.g == null || (a2 = ehs.a(this.f27117a, new ActionModel(this.d.g), this.e.f10055a, null, null)) == null) {
        } else {
            com.taobao.android.trade.event.f.a(this.f27117a).a(a2);
        }
    }

    public void d() {
        Event a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else if (this.d.f == null || (a2 = ehs.a(this.f27117a, new ActionModel(this.d.f), this.e.f10055a, null, null)) == null) {
        } else {
            com.taobao.android.trade.event.f.a(this.f27117a).a(a2);
        }
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        d a2 = com.taobao.android.trade.event.f.a(this.f27117a);
        if (a2 == null) {
            return;
        }
        TaobaoBaseActivity taobaoBaseActivity = this.f27117a;
        if (!(taobaoBaseActivity instanceof DetailCoreActivity)) {
            return;
        }
        efu efuVar = new efu(a(((DetailCoreActivity) taobaoBaseActivity).y().h()));
        efuVar.f27286a = this.d.b;
        a2.a(efuVar);
    }

    private com.taobao.android.detail.datasdk.event.params.c a(SkuPageModel skuPageModel) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.detail.datasdk.event.params.c) ipChange.ipc$dispatch("1c7f8b84", new Object[]{this, skuPageModel}) : new com.taobao.android.detail.datasdk.event.params.c(new a(skuPageModel.getTradeVO(), skuPageModel.getBuyParams()), skuPageModel.isJhsJoin());
    }
}
