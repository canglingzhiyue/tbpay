package com.taobao.android.live.plugin.atype.flexalocal.comments.chat.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.alilive.adapter.uikit.AliUrlImageView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.comments.chat.ChatTopMessage;
import com.taobao.android.live.plugin.atype.flexalocal.comments.chat.view.TopMessageView2;
import tb.kge;

/* loaded from: classes5.dex */
public abstract class BaseTopMessageView extends LinearLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(165840650);
    }

    public abstract void hideWithAnimation(TopMessageView2.a aVar);

    public abstract boolean isHighRank(ChatTopMessage chatTopMessage);

    public abstract void releaseAnimation();

    public abstract void setBelovedFansBGView(AliUrlImageView aliUrlImageView);

    public abstract void setHideRank();

    public abstract void setShowStatusLisener(TopMessageView2.b bVar);

    public abstract void setTopViewStyle(ChatTopMessage chatTopMessage);

    public void setTopViewStyleDX(ChatTopMessage chatTopMessage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60388411", new Object[]{this, chatTopMessage});
        }
    }

    public abstract void showWithAnimation();

    public BaseTopMessageView(Context context) {
        super(context);
    }

    public BaseTopMessageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public BaseTopMessageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
