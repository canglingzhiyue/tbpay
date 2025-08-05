package com.taobao.android.fluid.framework.card.cards.web;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import tb.kge;

/* loaded from: classes5.dex */
public class TBVideoErrorView extends LinearLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private TextView tvSubtitle;
    private TextView tvTitle;
    private View vErrorAction;

    static {
        kge.a(-1708980675);
    }

    public TBVideoErrorView(Context context) {
        super(context);
        initView(context);
    }

    public TBVideoErrorView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        initView(context);
    }

    public TBVideoErrorView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        initView(context);
    }

    public void setErrorAction(View.OnClickListener onClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1dcee36", new Object[]{this, onClickListener});
            return;
        }
        View view = this.vErrorAction;
        if (view == null) {
            return;
        }
        view.setOnClickListener(onClickListener);
    }

    public void setSubtitle(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("13c7d5ab", new Object[]{this, str});
            return;
        }
        TextView textView = this.tvSubtitle;
        if (textView == null) {
            return;
        }
        textView.setText(str);
    }

    public void setTitle(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c820927", new Object[]{this, str});
            return;
        }
        TextView textView = this.tvTitle;
        if (textView == null) {
            return;
        }
        textView.setText(str);
    }

    private void initView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f359fd6c", new Object[]{this, context});
            return;
        }
        View inflate = LayoutInflater.from(context).inflate(R.layout.fluid_sdk_layout_tbvideo_error, this);
        this.tvTitle = (TextView) inflate.findViewById(R.id.tv_error_title);
        this.tvSubtitle = (TextView) inflate.findViewById(R.id.tv_error_subtitle);
        this.vErrorAction = inflate.findViewById(R.id.v_error_action);
        setClickable(true);
        setGravity(17);
        setOrientation(1);
    }
}
