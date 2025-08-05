package com.taobao.wireless.link.pop.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.LinearLayout;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.agoo.TaobaoRegister;
import com.taobao.android.weex_framework.util.a;
import com.taobao.tao.image.ImageStrategyConfig;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import com.taobao.wireless.link.pop.PopMessageData;
import com.taobao.wireless.link.pop.d;
import tb.kge;
import tb.rki;
import tb.rkj;

/* loaded from: classes9.dex */
public class FullPopView extends LinearLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static TUrlImageView mIv_pop;
    public static int viewHeight;
    public static int viewWidth;

    static {
        kge.a(250563506);
    }

    public FullPopView(final Context context, final PopMessageData popMessageData) {
        super(context);
        LayoutInflater.from(context).inflate(R.layout.full_pop_window, this);
        View findViewById = findViewById(R.id.full_window_layout);
        WindowManager windowManager = (WindowManager) context.getSystemService(a.ATOM_EXT_window);
        findViewById.setLayoutParams(new LinearLayout.LayoutParams(windowManager.getDefaultDisplay().getWidth(), windowManager.getDefaultDisplay().getHeight()));
        mIv_pop = (TUrlImageView) findViewById.findViewById(R.id.iv_pop);
        viewHeight = findViewById.getLayoutParams().height;
        viewWidth = findViewById.getLayoutParams().width;
        TUrlImageView tUrlImageView = (TUrlImageView) findViewById(R.id.iv_pop_delete);
        tUrlImageView.setStrategyConfig(ImageStrategyConfig.a("1111", "1111").a());
        tUrlImageView.setImageUrl("https://gw.alicdn.com/tfs/TB1ikB8gAP2gK0jSZPxXXacQpXa-152-152.png");
        tUrlImageView.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.wireless.link.pop.view.FullPopView.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    return;
                }
                com.taobao.wireless.link.pop.a.b(context, popMessageData);
                rki.a(rki.ARG1_POP_DELETE, "desktop_pop", popMessageData.messageId, null);
                TaobaoRegister.dismissMessage(context, popMessageData.messageId, "");
            }
        });
        findViewById(R.id.iv_pop).setOnClickListener(new View.OnClickListener() { // from class: com.taobao.wireless.link.pop.view.FullPopView.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    return;
                }
                com.taobao.wireless.link.pop.a.b(context, popMessageData);
                rkj.a(context, d.f23618a + "growth_dhh_2200803434487_android-overlaycenter-1069565676&h5Url=" + popMessageData.clickUrl, popMessageData.clickUrl, "full_pop_activity", popMessageData.messageId);
                TaobaoRegister.clickMessage(context, popMessageData.messageId, "");
                rki.a(rki.ARG1_FULL_POP_CLICK, popMessageData.clickUrl, "", null);
            }
        });
    }

    public static void updatePopView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4f76194", new Object[0]);
            return;
        }
        TUrlImageView tUrlImageView = mIv_pop;
        if (tUrlImageView == null) {
            return;
        }
        tUrlImageView.setImageDrawable(com.taobao.wireless.link.controller.a.a().i);
    }
}
