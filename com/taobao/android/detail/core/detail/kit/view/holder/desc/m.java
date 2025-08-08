package com.taobao.android.detail.core.detail.kit.view.holder.desc;

import android.app.Activity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.model.viewmodel.desc.QualityViewModel;
import com.taobao.taobao.R;
import java.util.List;
import tb.dzm;
import tb.eqh;
import tb.kge;

/* loaded from: classes4.dex */
public class m extends b<QualityViewModel> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private RecyclerView k;
    private View l;
    private TextView m;
    private TextView n;
    private View o;

    static {
        kge.a(1348475581);
    }

    /* renamed from: c  reason: avoid collision after fix types in other method */
    public boolean c2(QualityViewModel qualityViewModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6fc1c890", new Object[]{this, qualityViewModel})).booleanValue();
        }
        return false;
    }

    @Override // com.taobao.android.detail.core.detail.kit.view.holder.desc.b, com.taobao.android.detail.core.detail.kit.view.holder.c
    public String q() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("18528f28", new Object[]{this}) : "com.taobao.android.detail.core.detail.kit.view.holder.desc.QualityViewHolder";
    }

    @Override // com.taobao.android.detail.core.detail.kit.view.holder.desc.b, com.taobao.android.detail.core.detail.kit.view.holder.c
    public /* synthetic */ void a(com.taobao.android.detail.datasdk.model.viewmodel.main.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64aa4550", new Object[]{this, bVar});
        } else {
            b((QualityViewModel) bVar);
        }
    }

    @Override // com.taobao.android.detail.core.detail.kit.view.holder.desc.b
    public /* synthetic */ boolean a(QualityViewModel qualityViewModel) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("e7480be1", new Object[]{this, qualityViewModel})).booleanValue() : c2(qualityViewModel);
    }

    @Override // com.taobao.android.detail.core.detail.kit.view.holder.desc.b
    public /* synthetic */ View c(QualityViewModel qualityViewModel) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("55e1d761", new Object[]{this, qualityViewModel}) : a2(qualityViewModel);
    }

    public m(Activity activity) {
        super(activity);
        this.o = View.inflate(this.g, R.layout.x_detail_desc_quality, null);
        this.n = (TextView) this.o.findViewById(R.id.tv_desc_quality_title);
        this.l = this.o.findViewById(R.id.ll_quality_desc);
        this.m = (TextView) this.o.findViewById(R.id.tv_quality_desc);
        this.k = (RecyclerView) this.o.findViewById(R.id.rv_quality_image_container);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this.g);
        linearLayoutManager.setOrientation(0);
        this.k.setLayoutManager(linearLayoutManager);
    }

    /* renamed from: a  reason: avoid collision after fix types in other method */
    public View a2(QualityViewModel qualityViewModel) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("d4351ccc", new Object[]{this, qualityViewModel}) : this.o;
    }

    @Override // com.taobao.android.detail.core.detail.kit.view.holder.desc.b
    public void b(QualityViewModel qualityViewModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c139dcb", new Object[]{this, qualityViewModel});
            return;
        }
        if (!StringUtils.isEmpty(qualityViewModel.c)) {
            this.n.setText(qualityViewModel.c);
        }
        if (!StringUtils.isEmpty(qualityViewModel.d)) {
            this.n.setTextColor(com.taobao.android.detail.core.utils.c.a(qualityViewModel.d));
        }
        List<String> list = qualityViewModel.f9742a;
        if (list == null || list.isEmpty()) {
            this.l.setVisibility(8);
        } else {
            this.m.setText(eqh.a(list, "    "));
            this.l.setVisibility(0);
        }
        this.k.setAdapter(new dzm(this.g, qualityViewModel));
    }
}
