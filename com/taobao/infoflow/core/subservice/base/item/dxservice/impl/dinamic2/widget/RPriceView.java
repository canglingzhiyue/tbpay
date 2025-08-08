package com.taobao.infoflow.core.subservice.base.item.dxservice.impl.dinamic2.widget;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import mtopsdk.common.util.StringUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.util.a;
import com.taobao.taobao.R;
import tb.fpn;
import tb.fpr;
import tb.kge;
import tb.ldf;
import tb.nog;

/* loaded from: classes7.dex */
public class RPriceView extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "RPriceView";
    private LinearLayout llContainer;
    private TextView tvCentUnit;
    private TextView tvSymbol;
    private TextView tvYuanSeparator;

    static {
        kge.a(410648180);
    }

    public RPriceView(Context context) {
        super(context);
        build();
    }

    public RPriceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        build();
    }

    public RPriceView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        build();
    }

    public void build() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac6c63f5", new Object[]{this});
            return;
        }
        LayoutInflater.from(getContext()).inflate(R.layout.info_flow_price_view, (ViewGroup) this, true);
        this.llContainer = (LinearLayout) findViewById(R.id.ll_container);
        this.tvSymbol = (TextView) findViewById(R.id.tv_symbol);
        this.tvYuanSeparator = (TextView) findViewById(R.id.tv_yuan_and_separator);
        this.tvCentUnit = (TextView) findViewById(R.id.tv_cent_and_unit);
    }

    public void setPrice(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f03f236a", new Object[]{this, obj});
            return;
        }
        String str = "";
        if (obj == null) {
            this.tvSymbol.setText(str);
            this.tvYuanSeparator.setText(str);
            this.tvCentUnit.setText(str);
            return;
        }
        try {
            JSONObject parseObject = JSON.parseObject(obj.toString());
            TextView textView = this.tvSymbol;
            if (parseObject.get(a.ATOM_symbol) != null) {
                str = parseObject.get(a.ATOM_symbol).toString();
            }
            textView.setText(str);
            this.tvYuanSeparator.setText(String.format("%s%s", parseObject.get("yuan"), parseObject.get("separator")));
            this.tvCentUnit.setText(String.format("%s%s", parseObject.get("cent"), parseObject.get(nog.PRICE_UNIT)));
        } catch (Throwable th) {
            ldf.a(TAG, "price json data error. originData=" + obj.toString(), th);
        }
        invalidate();
    }

    public void setPriceTextSize(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("22a904d8", new Object[]{this, obj});
            return;
        }
        int a2 = fpr.a(getContext(), obj, 0);
        this.tvYuanSeparator.setTextSize(0, a2);
        float f = (int) (a2 * 0.625d);
        this.tvSymbol.setTextSize(0, f);
        this.tvCentUnit.setTextSize(0, f);
    }

    public void setPriceTextColor(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84f54140", new Object[]{this, str});
            return;
        }
        int a2 = fpn.a(str, Color.parseColor("#ff5500"));
        this.tvSymbol.setTextColor(a2);
        this.tvCentUnit.setTextColor(a2);
        this.tvYuanSeparator.setTextColor(a2);
    }

    public void setPriceTextAlignment(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4c2dc0", new Object[]{this, str});
            return;
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        if ("left".equals(str)) {
            layoutParams.gravity = 19;
        } else if ("center".equals(str)) {
            layoutParams.gravity = 17;
        } else if ("right".equals(str)) {
            layoutParams.gravity = 21;
        } else {
            layoutParams.gravity = 19;
        }
        this.llContainer.setLayoutParams(layoutParams);
    }

    public void setPriceTextStyle(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("212f610e", new Object[]{this, str});
        } else if (StringUtils.equals(str, "normal")) {
            this.tvCentUnit.setTypeface(Typeface.defaultFromStyle(0));
            this.tvYuanSeparator.setTypeface(Typeface.defaultFromStyle(0));
        } else if (StringUtils.equals(str, "bold")) {
            this.tvCentUnit.setTypeface(Typeface.defaultFromStyle(1));
            this.tvYuanSeparator.setTypeface(Typeface.defaultFromStyle(1));
        } else if (StringUtils.equals(str, "italic")) {
            this.tvCentUnit.setTypeface(Typeface.defaultFromStyle(2));
            this.tvYuanSeparator.setTypeface(Typeface.defaultFromStyle(2));
        } else if (!StringUtils.equals(str, "bold_italic")) {
        } else {
            this.tvCentUnit.setTypeface(Typeface.defaultFromStyle(3));
            this.tvYuanSeparator.setTypeface(Typeface.defaultFromStyle(3));
        }
    }
}
