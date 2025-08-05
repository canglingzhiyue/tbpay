package com.taobao.android.abilitykit.ability.pop.render;

import android.content.Context;
import android.view.View;
import android.widget.RelativeLayout;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilitykit.ability.pop.model.c;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.component.TBErrorView;
import tb.kge;

/* loaded from: classes4.dex */
public class PopErrorView<PARAMS extends com.taobao.android.abilitykit.ability.pop.model.c> extends RelativeLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-15055550);
    }

    public PopErrorView(Context context, PARAMS params) {
        super(context);
        init(context, params);
    }

    private void init(Context context, final PARAMS params) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8726f46", new Object[]{this, context, params});
            return;
        }
        setBackgroundColor(-1);
        TBErrorView tBErrorView = new TBErrorView(context);
        tBErrorView.setNotShowNetworkDiagnosisView(true);
        tBErrorView.setTitle(com.alibaba.ability.localization.b.a(R.string.taobao_app_1012_1_21180));
        tBErrorView.setSubTitle(com.alibaba.ability.localization.b.a(R.string.taobao_app_1012_1_21179));
        tBErrorView.setButton(TBErrorView.ButtonType.BUTTON_LEFT, com.alibaba.ability.localization.b.a(R.string.app_i_know), new View.OnClickListener() { // from class: com.taobao.android.abilitykit.ability.pop.render.PopErrorView.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    return;
                }
                com.taobao.android.abilitykit.ability.pop.model.c cVar = params;
                com.taobao.android.abilitykit.ability.pop.presenter.a.a(PopErrorView.this.getContext(), cVar == null ? null : cVar.b, (JSONObject) null);
            }
        });
        tBErrorView.setButtonVisibility(TBErrorView.ButtonType.BUTTON_RIGHT, 8);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(13);
        addView(tBErrorView, layoutParams);
    }
}
