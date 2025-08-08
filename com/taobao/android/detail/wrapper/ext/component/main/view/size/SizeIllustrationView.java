package com.taobao.android.detail.wrapper.ext.component.main.view.size;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.kit.utils.f;
import com.taobao.android.detail.datasdk.protocol.image.DetailImageView;
import com.taobao.android.detail.datasdk.protocol.image.a;
import com.taobao.android.detail.datasdk.protocol.image.b;
import com.taobao.android.detail.wrapper.request.size.model.SizeChart;
import com.taobao.taobao.R;
import tb.emu;
import tb.epm;
import tb.kge;

/* loaded from: classes5.dex */
public class SizeIllustrationView extends LinearLayout implements b {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private f.a imageLoaderDecor;
    private DetailImageView mImageView;
    private TextView mTvTitle;

    static {
        kge.a(1918581865);
        kge.a(128859412);
    }

    public SizeIllustrationView(Context context) {
        super(context);
        init(context);
    }

    public SizeIllustrationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init(context);
    }

    public SizeIllustrationView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init(context);
    }

    public void init(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("609fd211", new Object[]{this, context});
            return;
        }
        emu.a("com.taobao.android.detail.wrapper.ext.component.main.view.size.SizeIllustrationView");
        setOrientation(1);
        View inflate = View.inflate(context, R.layout.x_detail_include_my_size_chart_illustration, this);
        this.mTvTitle = (TextView) inflate.findViewById(R.id.tv_my_size_chart_illustration_title);
        this.mImageView = (DetailImageView) inflate.findViewById(R.id.ll_my_size_chart_illustration_content);
    }

    public void fillData(SizeChart sizeChart) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d1025f3", new Object[]{this, sizeChart});
        } else if (sizeChart == null) {
            setVisibility(8);
        } else if (StringUtils.isEmpty(sizeChart.sketchMap)) {
            setVisibility(8);
        } else {
            this.mTvTitle.setText(StringUtils.isEmpty(sizeChart.picTitle) ? "" : sizeChart.picTitle);
            epm epmVar = new epm(-1, -1);
            epmVar.d = true;
            this.imageLoaderDecor.a(this.mImageView, sizeChart.sketchMap, epmVar, this);
        }
    }

    public void setImageLoaderDecor(f.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7243100e", new Object[]{this, aVar});
        } else {
            this.imageLoaderDecor = aVar;
        }
    }

    @Override // com.taobao.android.detail.datasdk.protocol.image.b
    public void onSuccess(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a8e27a", new Object[]{this, aVar});
        } else {
            setVisibility(0);
        }
    }

    @Override // com.taobao.android.detail.datasdk.protocol.image.b
    public void onFailure(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15b99301", new Object[]{this, aVar});
        } else {
            setVisibility(8);
        }
    }
}
