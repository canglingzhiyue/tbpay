package com.taobao.taolive.uikit.api;

import android.content.Context;
import android.widget.RelativeLayout;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes8.dex */
public class TBLiveBaseComponentView extends RelativeLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-332572735);
    }

    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
        }
    }

    public TBLiveBaseComponentView(Context context) {
        super(context);
    }
}
