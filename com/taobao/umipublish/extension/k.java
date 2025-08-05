package com.taobao.umipublish.extension;

import android.content.Context;
import android.view.View;
import com.alibaba.ability.localization.b;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.component.TBErrorView;
import tb.kge;

/* loaded from: classes9.dex */
public class k implements h {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1696948956);
        kge.a(1706385047);
    }

    @Override // com.taobao.umipublish.extension.h
    public View a(Context context, final Runnable runnable, Runnable runnable2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("d311679e", new Object[]{this, context, runnable, runnable2});
        }
        TBErrorView tBErrorView = new TBErrorView(context);
        tBErrorView.setTitle(b.a(R.string.gg_pub_load_failed));
        tBErrorView.setSubTitle(b.a(R.string.gg_pub_try_refresh_page));
        tBErrorView.setButtonVisibility(TBErrorView.ButtonType.BUTTON_LEFT, 0);
        tBErrorView.setButtonVisibility(TBErrorView.ButtonType.BUTTON_RIGHT, 0);
        tBErrorView.setButton(TBErrorView.ButtonType.BUTTON_LEFT, b.a(R.string.gg_pub_refresh), new View.OnClickListener() { // from class: com.taobao.umipublish.extension.k.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                } else {
                    runnable.run();
                }
            }
        });
        return tBErrorView;
    }
}
