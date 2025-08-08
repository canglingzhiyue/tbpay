package com.alibaba.security.realidentity.ui.widgets;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.alibaba.security.realidentity.ui.view.ALBiometricsActivityParentView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;

/* loaded from: classes3.dex */
public class GuideWidget extends BaseWidget {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String d = "GuideWidget";
    public LinearLayout b;
    public TextView c;

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
                return;
            }
            GuideWidget.this.b();
            GuideWidget.this.setVisibility(8);
            ALBiometricsActivityParentView.d dVar = GuideWidget.this.f3574a;
            if (dVar == null) {
                return;
            }
            dVar.a(true);
        }
    }

    public GuideWidget(Context context) {
        super(context);
        c();
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        }
    }

    @Override // com.alibaba.security.realidentity.ui.widgets.BaseWidget
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        }
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        if (!StringUtils.isEmpty(str)) {
            this.b.setVisibility(0);
            this.c.setText(str);
        } else {
            this.b.setVisibility(8);
        }
        setVisibility(0);
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
        this.b = (LinearLayout) findViewById(R.id.abfl_widget_guide_subtext_parent);
        this.c = (TextView) findViewById(R.id.abfl_widget_guide_subtext_center);
        ((Button) findViewById(R.id.abfl_widget_guide_btn)).setOnClickListener(new a());
    }

    public GuideWidget(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        c();
    }

    public GuideWidget(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        c();
    }

    @Override // com.alibaba.security.realidentity.ui.widgets.BaseWidget, com.alibaba.security.realidentity.d5
    public void a(String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b26fb7", new Object[]{this, strArr});
            return;
        }
        String str = null;
        if (strArr != null && strArr.length > 0) {
            str = strArr[0];
        }
        a(str);
    }
}
