package com.taobao.android.detail2.core.optimize.prerender;

import android.content.Context;
import android.util.AttributeSet;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.ptr.PullBase;
import com.taobao.ptr.PullLayout;
import tb.kge;

/* loaded from: classes5.dex */
public class NDFeedsPullBase extends PullBase {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-446533444);
    }

    public NDFeedsPullBase(Context context) {
        super(context);
    }

    public NDFeedsPullBase(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public NDFeedsPullBase(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // com.taobao.ptr.PullBase
    /* renamed from: createEndPullLayout */
    public PullLayout mo1209createEndPullLayout(Context context, PullBase.Mode mode, AttributeSet attributeSet) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (PullLayout) ipChange.ipc$dispatch("aca86d37", new Object[]{this, context, mode, attributeSet}) : new NDFeedsPullEndLayout(context, mode, 0);
    }
}
