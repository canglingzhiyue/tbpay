package com.taobao.android.detail.wrapper.ext.component.main.view.size;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.wrapper.request.size.model.RateInfo;
import com.taobao.taobao.R;
import java.util.List;
import tb.emu;
import tb.kge;

/* loaded from: classes5.dex */
public class RateInfoView extends LinearLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private LinearLayout llContent;
    private TextView tvRateSize;
    private TextView tvTitle;

    static {
        kge.a(18288294);
    }

    public RateInfoView(Context context) {
        super(context);
        init(context);
    }

    public RateInfoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init(context);
    }

    public RateInfoView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init(context);
    }

    private void init(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("609fd211", new Object[]{this, context});
            return;
        }
        emu.a("com.taobao.android.detail.wrapper.ext.component.main.view.size.RateInfoView");
        setOrientation(1);
        View inflate = View.inflate(context, R.layout.x_detail_include_my_size_chart_rate_info, this);
        this.tvTitle = (TextView) inflate.findViewById(R.id.tv_my_size_chart_rate_title);
        this.llContent = (LinearLayout) inflate.findViewById(R.id.ll_my_size_chart_rate_content);
        this.tvRateSize = (TextView) inflate.findViewById(R.id.tv_my_size_chart_rate_content_size);
    }

    public void fillData(RateInfo rateInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60d214b2", new Object[]{this, rateInfo});
        } else if (rateInfo == null) {
            setVisibility(8);
        } else {
            List<String> list = rateInfo.data;
            if (list == null || list.isEmpty()) {
                setVisibility(8);
                return;
            }
            setVisibility(0);
            if (!TextUtils.isEmpty(rateInfo.title)) {
                this.tvTitle.setText(rateInfo.title);
            } else {
                this.tvTitle.setText("");
            }
            String str = list.get(0);
            if (!TextUtils.isEmpty(str)) {
                this.tvRateSize.setText(str);
                this.tvRateSize.setVisibility(0);
            } else {
                this.tvRateSize.setVisibility(8);
            }
            int childCount = this.llContent.getChildCount();
            if (childCount > 1) {
                this.llContent.removeViews(1, childCount - 1);
            }
            for (int i = 1; i < list.size(); i++) {
                this.llContent.addView(makeRateItemView(list.get(i)));
            }
        }
    }

    public View makeRateItemView(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("a39ff0f9", new Object[]{this, str});
        }
        TextView textView = new TextView(getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -1);
        layoutParams.weight = 1.0f;
        textView.setLayoutParams(layoutParams);
        textView.setTextColor(getResources().getColor(R.color.detail_text_bold));
        textView.setTextSize(1, 12.0f);
        textView.setBackgroundColor(getResources().getColor(R.color.detail_f9));
        textView.setGravity(17);
        textView.setMaxLines(2);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setText(str);
        return textView;
    }
}
