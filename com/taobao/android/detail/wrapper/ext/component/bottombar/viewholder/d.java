package com.taobao.android.detail.wrapper.ext.component.bottombar.viewholder;

import android.content.Context;
import android.net.Uri;
import android.text.Html;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.event.params.h;
import com.taobao.android.detail.core.request.market.MarketBagPrice;
import com.taobao.android.detail.core.utils.i;
import com.taobao.android.detail.wrapper.activity.DetailFloatActivity;
import com.taobao.android.trade.event.ThreadMode;
import com.taobao.android.trade.event.j;
import com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.e;
import com.taobao.taobao.R;
import mtopsdk.mtop.domain.MtopResponse;
import tb.dzf;
import tb.eac;
import tb.edw;
import tb.edz;
import tb.eft;
import tb.egv;
import tb.emu;
import tb.emx;
import tb.eno;
import tb.epj;
import tb.epo;
import tb.fah;
import tb.kge;

/* loaded from: classes5.dex */
public class d extends eac<fah> implements com.taobao.android.trade.boost.request.mtop.a<MarketBagPrice> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private TextView g;
    private LinearLayout h;
    private boolean i;
    private boolean j;
    private a k;
    private b l;

    static {
        kge.a(-1243707357);
        kge.a(1595456606);
    }

    public static /* synthetic */ Object ipc$super(d dVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -422543804) {
            super.a((d) ((egv) objArr[0]));
            return null;
        } else if (hashCode != 90991720) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.a();
            return null;
        }
    }

    public static /* synthetic */ Context a(d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("cefa93bb", new Object[]{dVar}) : dVar.f9568a;
    }

    public static /* synthetic */ boolean a(d dVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8597dd75", new Object[]{dVar, new Boolean(z)})).booleanValue();
        }
        dVar.i = z;
        return z;
    }

    public static /* synthetic */ void b(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b2890c44", new Object[]{dVar});
        } else {
            dVar.c();
        }
    }

    @Override // com.taobao.android.trade.boost.request.mtop.c
    public /* synthetic */ void onFailure(MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1cc110e", new Object[]{this, mtopResponse});
        } else {
            a(mtopResponse);
        }
    }

    @Override // com.taobao.android.trade.boost.request.mtop.c
    public /* synthetic */ void onSuccess(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea580ec7", new Object[]{this, obj});
        } else {
            a((MarketBagPrice) obj);
        }
    }

    public d(Context context) {
        super(context);
        this.i = false;
        this.j = false;
        this.k = new a();
        this.l = new b();
        com.taobao.android.trade.event.f.a(context).a(eno.a(edw.class), this.l);
        com.taobao.android.trade.event.f.a(context).a(eno.a(eft.class), this.k);
        emu.a("com.taobao.android.detail.wrapper.ext.component.bottombar.viewholder.BottomBarSMCartViewHolder");
    }

    @Override // com.taobao.android.detail.core.detail.kit.view.holder.c
    public View a(Context context, ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("f1543f21", new Object[]{this, context, viewGroup});
        }
        this.h = (LinearLayout) View.inflate(context, R.layout.x_detail_vh_bottom_bar_sm_cart, null);
        this.g = (TextView) this.h.findViewById(R.id.tv_bottombar_total_price);
        this.g.setText(context.getResources().getString(R.string.detail_cart));
        return this.h;
    }

    @Override // tb.eac
    public void a(fah fahVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e82a6cab", new Object[]{this, fahVar});
            return;
        }
        super.a((d) fahVar);
        this.j = fahVar.f27714a;
        c();
    }

    @Override // com.taobao.android.detail.core.detail.kit.view.holder.c
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        super.a();
        com.taobao.android.trade.event.d a2 = com.taobao.android.trade.event.f.a(this.f9568a);
        a2.b(eno.a(edw.class), this.l);
        a2.b(eno.a(eft.class), this.k);
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else if (this.c == 0 || !epo.g().b()) {
        } else {
            ((fah) this.c).a(epo.f(), this);
            i.d("BottomBarSMCartVH", "queryBagPrice");
        }
    }

    public void a(final MarketBagPrice marketBagPrice) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("31ed3f0c", new Object[]{this, marketBagPrice});
        } else if (marketBagPrice == null || marketBagPrice.model == null || StringUtils.isEmpty(marketBagPrice.model.price)) {
            this.g.setText(this.f9568a.getString(R.string.detail_cart));
        } else {
            i.d("BottomBarSMCartVH", "updateSMCartPriceSuccess");
            this.g.setText(Html.fromHtml(String.format(this.f9568a.getString(R.string.detail_total_price), marketBagPrice.model.price)));
            if (!this.j || !this.i || marketBagPrice.couDanShow == null || StringUtils.isEmpty(marketBagPrice.couDanShow.URL)) {
                i.d("BottomBarSMCartVH", "wouldn't show coudan");
            } else {
                com.taobao.android.trade.event.f.a(this.f9568a).a(new edz(new h.a().b(marketBagPrice.couDanShow.buttonMsg).a(marketBagPrice.couDanShow.msg).c(marketBagPrice.couDanShow.URL).a(new View.OnClickListener() { // from class: com.taobao.android.detail.wrapper.ext.component.bottombar.viewholder.d.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                            return;
                        }
                        Uri.Builder buildUpon = Uri.parse(DetailFloatActivity.URI).buildUpon();
                        buildUpon.appendQueryParameter("type", "H5Fragment");
                        buildUpon.appendQueryParameter(e.REQUEST_ID, "detail");
                        buildUpon.appendQueryParameter("targetUrl", marketBagPrice.couDanShow.URL);
                        epj.f().navigateTo(d.a(d.this), buildUpon.build());
                    }
                }).a()));
            }
        }
    }

    public void a(MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab3bce2d", new Object[]{this, mtopResponse});
        } else {
            b(mtopResponse);
        }
    }

    @Override // com.taobao.android.trade.boost.request.mtop.a
    public void onSystemFailure(MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8463ea48", new Object[]{this, mtopResponse});
        } else {
            b(mtopResponse);
        }
    }

    private void b(MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("743cc56e", new Object[]{this, mtopResponse});
            return;
        }
        this.g.setText(this.f9568a.getString(R.string.detail_cart));
        if (mtopResponse == null) {
            Toast.makeText(this.f9568a, this.f9568a.getString(R.string.detail_query_error), 0).show();
            return;
        }
        if (mtopResponse.isSessionInvalid()) {
            if (!StringUtils.isEmpty(mtopResponse.getRetMsg())) {
                Toast.makeText(this.f9568a, mtopResponse.getRetMsg(), 0).show();
            } else {
                Toast.makeText(this.f9568a, this.f9568a.getString(R.string.detail_query_error), 0).show();
            }
        }
        dzf.a(emx.c(this.f9568a), this.c != 0 ? ((fah) this.c).n : "");
    }

    /* loaded from: classes5.dex */
    public class a implements j<eft> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(2123853035);
            kge.a(-1453870097);
        }

        private a() {
        }

        @Override // com.taobao.android.trade.event.j
        public /* synthetic */ com.taobao.android.trade.event.i handleEvent(eft eftVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (com.taobao.android.trade.event.i) ipChange.ipc$dispatch("caa7474e", new Object[]{this, eftVar}) : a(eftVar);
        }

        public com.taobao.android.trade.event.i a(eft eftVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (com.taobao.android.trade.event.i) ipChange.ipc$dispatch("128dd3ca", new Object[]{this, eftVar});
            }
            d.a(d.this, true);
            d.b(d.this);
            return com.taobao.android.detail.core.event.a.SUCCESS;
        }

        @Override // com.taobao.android.trade.event.j
        public ThreadMode getThreadMode() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (ThreadMode) ipChange.ipc$dispatch("6de50c9b", new Object[]{this}) : ThreadMode.MainThread;
        }
    }

    /* loaded from: classes5.dex */
    public class b implements j<edw> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(1406588620);
            kge.a(-1453870097);
        }

        private b() {
        }

        @Override // com.taobao.android.trade.event.j
        public /* synthetic */ com.taobao.android.trade.event.i handleEvent(edw edwVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (com.taobao.android.trade.event.i) ipChange.ipc$dispatch("caa7474e", new Object[]{this, edwVar}) : a(edwVar);
        }

        public com.taobao.android.trade.event.i a(edw edwVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (com.taobao.android.trade.event.i) ipChange.ipc$dispatch("8ae0150f", new Object[]{this, edwVar});
            }
            d.a(d.this, false);
            d.b(d.this);
            return com.taobao.android.detail.core.event.a.SUCCESS;
        }

        @Override // com.taobao.android.trade.event.j
        public ThreadMode getThreadMode() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (ThreadMode) ipChange.ipc$dispatch("6de50c9b", new Object[]{this}) : ThreadMode.MainThread;
        }
    }
}
