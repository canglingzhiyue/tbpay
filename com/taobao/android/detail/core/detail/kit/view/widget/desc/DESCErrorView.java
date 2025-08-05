package com.taobao.android.detail.core.detail.kit.view.widget.desc;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.kit.utils.b;
import com.taobao.android.detail.core.detail.kit.utils.c;
import com.taobao.android.detail.core.detail.kit.view.widget.base.uikit.TIconFontTextView;
import com.taobao.taobao.R;
import tb.emu;
import tb.kge;

/* loaded from: classes4.dex */
public class DESCErrorView extends RelativeLayout implements View.OnClickListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private TIconFontTextView errorIcon;
    private TextView mErrorTipView;
    private TextView mErrorTitleView;
    private a mListener;
    private Button reloadButton;

    /* loaded from: classes4.dex */
    public interface a {
        void a(View view);
    }

    static {
        kge.a(107999217);
        kge.a(-1201612728);
    }

    public DESCErrorView(Context context) {
        super(context);
        init(context);
    }

    public DESCErrorView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init(context);
    }

    public DESCErrorView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init(context);
    }

    public DESCErrorView setOnReloadButtonClickListener(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DESCErrorView) ipChange.ipc$dispatch("2ed8b41c", new Object[]{this, aVar});
        }
        this.mListener = aVar;
        return this;
    }

    private void init(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("609fd211", new Object[]{this, context});
            return;
        }
        LayoutInflater.from(context).inflate(R.layout.x_detail_desc_errorview, (ViewGroup) this, true);
        this.errorIcon = (TIconFontTextView) findViewById(R.id.detail_fulldesc_errorview_erroricon);
        this.mErrorTitleView = (TextView) findViewById(R.id.detail_fulldesc_errorview_title);
        this.mErrorTipView = (TextView) findViewById(R.id.detail_fulldesc_errorview_tip);
        this.reloadButton = (Button) findViewById(R.id.reloadButton);
        this.reloadButton.setOnClickListener(this);
        if (c.c()) {
            this.mErrorTitleView.setVisibility(0);
        } else {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.mErrorTipView.getLayoutParams();
            layoutParams.topMargin = b.a(context, 20.0f);
            this.mErrorTipView.setLayoutParams(layoutParams);
        }
        emu.a("com.taobao.android.detail.core.detail.kit.view.widget.desc.DESCErrorView");
    }

    public DESCErrorView setErrorTip(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DESCErrorView) ipChange.ipc$dispatch("8e4b652e", new Object[]{this, str});
        }
        this.mErrorTipView.setText(str);
        return this;
    }

    public DESCErrorView setErrorTitle(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DESCErrorView) ipChange.ipc$dispatch("e24fb251", new Object[]{this, str});
        }
        this.mErrorTitleView.setText(str);
        return this;
    }

    public DESCErrorView setErrorIconRes(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DESCErrorView) ipChange.ipc$dispatch("3d3f8d59", new Object[]{this, new Integer(i)});
        }
        this.errorIcon.setText(getContext().getText(i));
        return this;
    }

    public DESCErrorView setButtonText(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DESCErrorView) ipChange.ipc$dispatch("aae18e22", new Object[]{this, str});
        }
        this.reloadButton.setText(str);
        return this;
    }

    public DESCErrorView showButton(boolean z) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return (DESCErrorView) ipChange.ipc$dispatch("d32a9cf6", new Object[]{this, new Boolean(z)});
        }
        if (!z) {
            i = 8;
        }
        this.reloadButton.setVisibility(i);
        return this;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            return;
        }
        a aVar = this.mListener;
        if (aVar == null) {
            return;
        }
        aVar.a(view);
    }
}
