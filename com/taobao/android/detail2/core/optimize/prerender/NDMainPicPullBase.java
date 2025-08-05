package com.taobao.android.detail2.core.optimize.prerender;

import android.content.Context;
import android.util.AttributeSet;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.ptr.PullBase;
import com.taobao.ptr.PullLayout;
import tb.kge;

/* loaded from: classes5.dex */
public class NDMainPicPullBase extends PullBase {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-439500040);
    }

    public NDMainPicPullBase(Context context) {
        super(context);
    }

    public NDMainPicPullBase(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public NDMainPicPullBase(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // com.taobao.ptr.PullBase
    /* renamed from: createEndPullLayout */
    public PullLayout mo1209createEndPullLayout(Context context, PullBase.Mode mode, AttributeSet attributeSet) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (PullLayout) ipChange.ipc$dispatch("aca86d37", new Object[]{this, context, mode, attributeSet}) : new NDMainPicNativePullEndLayout(context, mode, 1);
    }
}
