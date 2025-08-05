package com.taobao.android.detail.wrapper.ext.component.main.view.size;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.datasdk.model.datamodel.template.ComponentModel;
import com.taobao.android.detail.wrapper.request.size.model.SizeChart;
import com.taobao.taobao.R;
import tb.emu;
import tb.epo;
import tb.fas;
import tb.fbg;
import tb.kge;

/* loaded from: classes5.dex */
public class RecommendSizeChartView extends LinearLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private Activity mActivity;
    private View mSizeChartView;
    public TextView mTvTip;
    public TextView mTvTitle;

    static {
        kge.a(-1088235847);
    }

    public RecommendSizeChartView(Context context) {
        super(context);
        init(context);
    }

    public RecommendSizeChartView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init(context);
    }

    public RecommendSizeChartView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init(context);
    }

    public void setActivity(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a989aea", new Object[]{this, activity});
        } else {
            this.mActivity = activity;
        }
    }

    public void init(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("609fd211", new Object[]{this, context});
            return;
        }
        emu.a("com.taobao.android.detail.wrapper.ext.component.main.view.size.RecommendSizeChartView");
        setOrientation(1);
        View inflate = View.inflate(context, R.layout.x_detail_include_recommend_size_chart, this);
        this.mTvTitle = (TextView) inflate.findViewById(R.id.tv_recommend_size_chart_title);
        this.mTvTip = (TextView) inflate.findViewById(R.id.tv_recommend_size_chart_tip);
    }

    public void fillData(SizeChart sizeChart) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d1025f3", new Object[]{this, sizeChart});
        } else if (sizeChart == null) {
            setVisibility(8);
        } else {
            this.mTvTitle.setText(sizeChart.title);
            this.mTvTip.setText(sizeChart.tip);
            View view = this.mSizeChartView;
            if (view != null) {
                removeView(view);
            }
            ComponentModel componentModel = new ComponentModel();
            componentModel.mapping = new JSONObject();
            componentModel.mapping.put("columnData", JSONArray.toJSON(sizeChart.data));
            fbg fbgVar = new fbg(componentModel);
            fas fasVar = new fas(this.mActivity);
            this.mSizeChartView = fasVar.d((fas) fbgVar);
            fasVar.e((fas) fbgVar);
            fasVar.a(sizeChart.recLine);
            fasVar.a(sizeChart.shadow);
            addView(this.mSizeChartView);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.mSizeChartView.getLayoutParams();
            if (marginLayoutParams == null) {
                return;
            }
            marginLayoutParams.topMargin = epo.b(6);
        }
    }
}
