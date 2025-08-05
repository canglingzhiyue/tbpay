package com.alibaba.security.realidentity.ui.widgets;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.alibaba.security.realidentity.e;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;

/* loaded from: classes3.dex */
public class TitleBarWidget extends BaseWidget {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String g = "TitleBarWidget";
    public ImageView b;
    public LinearLayout c;
    public TextView d;
    public boolean e;
    public View.OnClickListener f;

    /* loaded from: classes3.dex */
    public class a implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else if (TitleBarWidget.a(TitleBarWidget.this) == null) {
            } else {
                TitleBarWidget.a(TitleBarWidget.this).onClick(view);
            }
        }
    }

    public TitleBarWidget(Context context) {
        super(context);
    }

    public static /* synthetic */ View.OnClickListener a(TitleBarWidget titleBarWidget) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View.OnClickListener) ipChange.ipc$dispatch("5c369e8d", new Object[]{titleBarWidget}) : titleBarWidget.f;
    }

    @Override // com.alibaba.security.realidentity.ui.widgets.BaseWidget
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        }
    }

    @Override // com.alibaba.security.realidentity.ui.widgets.BaseWidget
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        this.b = (ImageView) findViewById(R.id.abfl_widget_tb_close);
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.abfl_widget_tb_close_parent);
        this.c = linearLayout;
        linearLayout.setOnClickListener(new a());
        this.d = (TextView) findViewById(R.id.tvTitle);
    }

    @Override // com.alibaba.security.realidentity.ui.widgets.BaseWidget
    public void e() {
        RelativeLayout.LayoutParams layoutParams;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
        } else if (e.c(getContext()) <= 0 || (layoutParams = (RelativeLayout.LayoutParams) getLayoutParams()) == null) {
        } else {
            layoutParams.setMargins(0, e.c(getContext()), 0, 0);
            setLayoutParams(layoutParams);
        }
    }

    public void setOnCloseListener(View.OnClickListener onClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cbdc8587", new Object[]{this, onClickListener});
        } else {
            this.f = onClickListener;
        }
    }

    public void setTitle(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c820927", new Object[]{this, str});
            return;
        }
        TextView textView = this.d;
        if (textView == null) {
            return;
        }
        textView.setText(str);
    }

    public TitleBarWidget(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.alibaba.security.realidentity.ui.widgets.BaseWidget
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            this.b.setImageResource(R.drawable.rp_face_top_back);
        }
    }

    public TitleBarWidget(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
