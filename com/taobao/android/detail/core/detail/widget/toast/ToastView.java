package com.taobao.android.detail.core.detail.widget.toast;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.kit.view.widget.base.uikit.TIconFontTextView;
import com.taobao.taobao.R;
import tb.emu;
import tb.epo;
import tb.kge;

/* loaded from: classes4.dex */
public class ToastView extends RelativeLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private TIconFontTextView mIcon;
    private TextView mText;

    static {
        kge.a(1488561074);
    }

    public ToastView(Context context) {
        super(context);
        init(context);
    }

    public ToastView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init(context);
    }

    public ToastView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init(context);
    }

    private void init(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("609fd211", new Object[]{this, context});
            return;
        }
        setBackgroundResource(R.drawable.detail_toast_bg);
        setPadding(epo.b(15), epo.b(6), epo.b(15), epo.b(9));
        View inflate = View.inflate(context, R.layout.x_detail_view_toast, this);
        this.mIcon = (TIconFontTextView) inflate.findViewById(R.id.detail_toast_icon);
        this.mText = (TextView) inflate.findViewById(R.id.detail_toast_tip);
        emu.a("com.taobao.android.detail.core.detail.widget.toast.ToastView");
    }

    public void showTip(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2305b06f", new Object[]{this, str});
            return;
        }
        this.mText.setText(str);
        this.mIcon.setText(R.string.taodetail_iconfont_check);
    }

    public void showError(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce476d5c", new Object[]{this, str});
            return;
        }
        this.mText.setText(str);
        this.mIcon.setText(R.string.taodetail_iconfont_info);
    }
}
