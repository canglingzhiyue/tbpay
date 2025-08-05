package com.taobao.android.remoteso.component;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.uikit.extend.component.TBErrorView;

/* loaded from: classes6.dex */
public class RemoErrorView extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public RemoErrorView(Context context) {
        super(context);
        init(context);
    }

    public RemoErrorView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init(context);
    }

    public RemoErrorView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init(context);
    }

    public RemoErrorView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        init(context);
    }

    private void init(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("609fd211", new Object[]{this, context});
            return;
        }
        final o oVar = (o) context;
        TBErrorView tBErrorView = new TBErrorView(context);
        tBErrorView.setTitle("加载失败，请重试");
        tBErrorView.setNotShowNetworkDiagnosisView(false);
        tBErrorView.setButton(TBErrorView.ButtonType.BUTTON_LEFT, "重试", new View.OnClickListener() { // from class: com.taobao.android.remoteso.component.RemoErrorView.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    return;
                }
                oVar.a("retry");
                view.setEnabled(false);
            }
        });
        tBErrorView.setButtonVisibility(TBErrorView.ButtonType.BUTTON_RIGHT, 8);
        addView(tBErrorView);
    }
}
