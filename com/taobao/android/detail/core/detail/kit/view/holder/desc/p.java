package com.taobao.android.detail.core.detail.kit.view.holder.desc;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.datasdk.model.datamodel.sku.SkuPageModel;
import com.taobao.android.trade.event.ThreadMode;
import com.taobao.taobao.R;
import tb.ead;
import tb.edo;
import tb.eno;
import tb.eog;
import tb.eqg;
import tb.kge;

/* loaded from: classes4.dex */
public class p extends b<com.taobao.android.detail.core.model.viewmodel.desc.m> implements View.OnClickListener, com.taobao.android.trade.event.j<eog> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private float k;
    private float l;
    private LinearLayout m;
    private TextView n;
    private String o;
    private String p;
    private boolean q;
    private int r;
    private int s;

    static {
        kge.a(-569166406);
        kge.a(-1201612728);
        kge.a(-1453870097);
    }

    public static /* synthetic */ Object ipc$super(p pVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    /* renamed from: c  reason: avoid collision after fix types in other method */
    public boolean c2(com.taobao.android.detail.core.model.viewmodel.desc.m mVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9a6d0916", new Object[]{this, mVar})).booleanValue();
        }
        return false;
    }

    @Override // com.taobao.android.detail.core.detail.kit.view.holder.desc.b, com.taobao.android.detail.core.detail.kit.view.holder.c
    public String q() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("18528f28", new Object[]{this}) : "com.taobao.android.detail.core.detail.kit.view.holder.desc.SkuBarViewHolder";
    }

    @Override // com.taobao.android.detail.core.detail.kit.view.holder.desc.b, com.taobao.android.detail.core.detail.kit.view.holder.c
    public /* synthetic */ void a(com.taobao.android.detail.datasdk.model.viewmodel.main.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64aa4550", new Object[]{this, bVar});
        } else {
            b((com.taobao.android.detail.core.model.viewmodel.desc.m) bVar);
        }
    }

    @Override // com.taobao.android.detail.core.detail.kit.view.holder.desc.b
    public /* synthetic */ boolean a(com.taobao.android.detail.core.model.viewmodel.desc.m mVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("e7480be1", new Object[]{this, mVar})).booleanValue() : c2(mVar);
    }

    @Override // com.taobao.android.detail.core.detail.kit.view.holder.desc.b
    public /* synthetic */ View c(com.taobao.android.detail.core.model.viewmodel.desc.m mVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("55e1d761", new Object[]{this, mVar}) : a2(mVar);
    }

    @Override // com.taobao.android.trade.event.j
    public /* synthetic */ com.taobao.android.trade.event.i handleEvent(eog eogVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.trade.event.i) ipChange.ipc$dispatch("caa7474e", new Object[]{this, eogVar}) : a(eogVar);
    }

    public float c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5889b5a", new Object[]{this})).floatValue() : this.k;
    }

    public float d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("596b2db", new Object[]{this})).floatValue() : this.l;
    }

    public p(Activity activity) {
        super(activity);
        this.r = R.drawable.detail_desc_skubar_checked_bg;
        this.s = R.drawable.detail_desc_skubar_unchecked_bg;
        this.m = (LinearLayout) View.inflate(activity, R.layout.x_detail_desc_skubar, null);
        com.taobao.android.trade.event.f.a(this.g).a(eno.a(eog.class), this);
    }

    private void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        this.q = z;
        this.m.setBackgroundResource(this.q ? this.r : this.s);
        if (TextUtils.isEmpty(this.p)) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(com.alibaba.ability.localization.b.a(this.q ? R.string.x_detail_app_sku_selected : R.string.x_detail_app_sku_select));
        sb.append(this.p);
        String sb2 = sb.toString();
        if (this.n == null) {
            this.n = new TextView(this.g);
            this.n.setTextColor(this.i.getColor(R.color.detail_ff));
            this.n.setTextSize(1, 12.0f);
            this.n.setGravity(16);
            this.n.setLayoutParams(new ViewGroup.LayoutParams((int) Math.ceil(this.n.getPaint().measureText(sb2)), -2));
            this.m.addView(this.n);
        }
        this.n.setText(sb2);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
        } else if (TextUtils.isEmpty(this.o)) {
        } else {
            com.taobao.android.detail.core.event.params.i iVar = new com.taobao.android.detail.core.event.params.i();
            iVar.b = this.o;
            iVar.f9723a = !this.q;
            com.taobao.android.trade.event.f.a(this.g).a(new edo(iVar));
            if (((com.taobao.android.detail.core.model.viewmodel.desc.m) this.c).events == null || ((com.taobao.android.detail.core.model.viewmodel.desc.m) this.c).events.isEmpty()) {
                return;
            }
            ead.a(this.g, ((com.taobao.android.detail.core.model.viewmodel.desc.m) this.c).events);
        }
    }

    public com.taobao.android.trade.event.i a(eog eogVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.trade.event.i) ipChange.ipc$dispatch("7eef97d4", new Object[]{this, eogVar});
        }
        if (eogVar == null || eogVar.f27498a == null) {
            return com.taobao.android.detail.core.event.a.FAILURE;
        }
        SkuPageModel.SkuChoiceVO skuChoiceVO = eogVar.f27498a;
        if (!eqg.a(skuChoiceVO.checkedPropValueIdList)) {
            a(skuChoiceVO.checkedPropValueIdList.contains(this.o));
        } else {
            a(false);
        }
        return com.taobao.android.detail.core.event.a.SUCCESS;
    }

    @Override // com.taobao.android.trade.event.j
    public ThreadMode getThreadMode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ThreadMode) ipChange.ipc$dispatch("6de50c9b", new Object[]{this}) : ThreadMode.MainThread;
    }

    /* renamed from: a  reason: avoid collision after fix types in other method */
    public View a2(com.taobao.android.detail.core.model.viewmodel.desc.m mVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("a3139d96", new Object[]{this, mVar});
        }
        if (TextUtils.isEmpty(mVar.f9761a)) {
            this.m.setVisibility(8);
            return new View(this.g);
        }
        this.m.setVisibility(0);
        this.o = mVar.f9761a;
        this.p = mVar.b;
        this.k = mVar.c;
        this.l = mVar.d;
        a(false);
        return this.m;
    }

    @Override // com.taobao.android.detail.core.detail.kit.view.holder.desc.b
    public void b(com.taobao.android.detail.core.model.viewmodel.desc.m mVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94693db3", new Object[]{this, mVar});
        } else {
            this.m.setOnClickListener(this);
        }
    }
}
