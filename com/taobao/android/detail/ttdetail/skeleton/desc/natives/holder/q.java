package com.taobao.android.detail.ttdetail.skeleton.desc.natives.holder;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import mtopsdk.common.util.StringUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.skeleton.desc.natives.viewmodel.QualityViewModel;
import com.taobao.taobao.R;
import java.util.List;
import tb.kge;
import tb.syn;

/* loaded from: classes5.dex */
public class q extends e<QualityViewModel> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private RecyclerView g;
    private View h;
    private TextView i;
    private TextView j;
    private View k;

    static {
        kge.a(-1746115825);
    }

    /* renamed from: c  reason: avoid collision after fix types in other method */
    public boolean c2(QualityViewModel qualityViewModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("899af529", new Object[]{this, qualityViewModel})).booleanValue();
        }
        return false;
    }

    @Override // com.taobao.android.detail.ttdetail.skeleton.desc.natives.holder.e
    public /* synthetic */ boolean a(QualityViewModel qualityViewModel) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("cded6523", new Object[]{this, qualityViewModel})).booleanValue() : c2(qualityViewModel);
    }

    @Override // com.taobao.android.detail.ttdetail.skeleton.desc.natives.holder.e
    public /* synthetic */ View c(QualityViewModel qualityViewModel) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("a0b54ca3", new Object[]{this, qualityViewModel}) : a2(qualityViewModel);
    }

    public q(Context context) {
        super(context);
        this.k = LayoutInflater.from(this.f10821a).inflate(R.layout.tt_detail_desc_quality, (ViewGroup) null);
        this.j = (TextView) this.k.findViewById(R.id.tv_desc_quality_title);
        this.h = this.k.findViewById(R.id.ll_quality_desc);
        this.i = (TextView) this.k.findViewById(R.id.tv_quality_desc);
        this.g = (RecyclerView) this.k.findViewById(R.id.rv_quality_image_container);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this.f10821a);
        linearLayoutManager.setOrientation(0);
        this.g.setLayoutManager(linearLayoutManager);
    }

    /* renamed from: a  reason: avoid collision after fix types in other method */
    public View a2(QualityViewModel qualityViewModel) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("fe628b69", new Object[]{this, qualityViewModel}) : this.k;
    }

    @Override // com.taobao.android.detail.ttdetail.skeleton.desc.natives.holder.e
    public void b(QualityViewModel qualityViewModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51aa1a06", new Object[]{this, qualityViewModel});
            return;
        }
        if (!StringUtils.isEmpty(qualityViewModel.c)) {
            this.j.setText(qualityViewModel.c);
        }
        if (!StringUtils.isEmpty(qualityViewModel.d)) {
            this.j.setTextColor(com.taobao.android.detail.ttdetail.utils.w.a(qualityViewModel.d));
        }
        List<String> list = qualityViewModel.f10866a;
        if (list == null || list.isEmpty()) {
            this.h.setVisibility(8);
        } else {
            this.i.setText(com.taobao.android.detail.ttdetail.skeleton.desc.natives.structure.b.a(list, "    "));
            this.h.setVisibility(0);
        }
        this.g.setAdapter(new syn(this.f10821a, qualityViewModel));
    }
}
