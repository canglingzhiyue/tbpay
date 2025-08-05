package com.taobao.android.live.plugin.atype.flexalocal.topbar;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.BaseFrame;
import com.taobao.taobao.R;
import com.taobao.taolive.room.openarchitecture.entity.ATaoLiveOpenEntity;
import tb.kge;
import tb.phg;

/* loaded from: classes6.dex */
public class TopFakeBarFrame extends BaseFrame {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1920627809);
    }

    public static /* synthetic */ Object ipc$super(TopFakeBarFrame topFakeBarFrame, String str, Object... objArr) {
        if (str.hashCode() == 91531079) {
            super.onViewCreated((View) objArr[0]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public TopFakeBarFrame(Context context, com.taobao.alilive.aliliveframework.frame.a aVar) {
        super(context, aVar);
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onViewCreated(View view) {
        ATaoLiveOpenEntity o;
        Float aR_;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("574a747", new Object[]{this, view});
            return;
        }
        super.onViewCreated(view);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) getComponentView().getLayoutParams();
        marginLayoutParams.topMargin = 0;
        float f = 0.0f;
        if (!phg.d().a() && this.mFrameContext != null && (o = this.mFrameContext.o()) != null && o.uiCompontent != null && o.uiCompontent.a() != null && (aR_ = o.uiCompontent.a().aR_()) != null && aR_.floatValue() > 0.0f && aR_.floatValue() <= 500.0f) {
            f = aR_.floatValue();
        }
        marginLayoutParams.topMargin = (int) (marginLayoutParams.topMargin + f);
        getComponentView().setLayoutParams(marginLayoutParams);
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame
    public int getLayoutResId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("f1151e95", new Object[]{this})).intValue() : R.layout.taolive_top_fake_bar_layout_flexalocal;
    }
}
