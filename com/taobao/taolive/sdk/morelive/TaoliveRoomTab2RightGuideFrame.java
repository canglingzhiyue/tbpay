package com.taobao.taolive.sdk.morelive;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.BaseFrame;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import tb.kge;

/* loaded from: classes8.dex */
public abstract class TaoliveRoomTab2RightGuideFrame extends BaseFrame {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-817247988);
    }

    public abstract void showMoreLiveFrame(boolean z);

    public TaoliveRoomTab2RightGuideFrame(Context context, com.taobao.alilive.aliliveframework.frame.a aVar) {
        super(context, aVar);
    }

    public TaoliveRoomTab2RightGuideFrame(Context context, boolean z, TBLiveDataModel tBLiveDataModel) {
        super(context, z, tBLiveDataModel);
    }

    public TaoliveRoomTab2RightGuideFrame(Context context, boolean z, TBLiveDataModel tBLiveDataModel, com.taobao.alilive.aliliveframework.frame.a aVar) {
        super(context, z, tBLiveDataModel, aVar);
    }
}
