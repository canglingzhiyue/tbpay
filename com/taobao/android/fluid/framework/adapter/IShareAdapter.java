package com.taobao.android.fluid.framework.adapter;

import android.app.Activity;
import com.taobao.android.fluid.core.FluidContext;
import com.ut.share.business.ShareBusinessListener;
import java.util.Map;

/* loaded from: classes5.dex */
public interface IShareAdapter extends IAdapter {
    public static final String ADAPTER_NAME = "IShareAdapter";

    boolean isShareContentContainerShowing();

    void share(FluidContext fluidContext, Activity activity, String str, Map map, ShareBusinessListener shareBusinessListener);
}
