package com.taobao.android.live.plugin.proxy.bclink;

import android.content.Context;
import android.view.ViewStub;
import com.taobao.alilive.aliliveframework.frame.BaseFrame;
import com.taobao.alilive.aliliveframework.frame.a;
import com.taobao.android.live.plugin.proxy.IBTypeProxy;
import com.taobao.taolive.sdk.model.TBLiveDataModel;

/* loaded from: classes6.dex */
public interface IBCLinkProxy extends IBTypeProxy {
    public static final String KEY = "IBCLinkProxy";

    BaseFrame createLiveLinkFrame3AndCreateView(Context context, a aVar, TBLiveDataModel tBLiveDataModel, ViewStub viewStub);

    Object createSEIDispatcher(a aVar);

    boolean enableJianBao(a aVar, TBLiveDataModel tBLiveDataModel);

    boolean enableLinkLive3();

    boolean enableLiveLink(a aVar, TBLiveDataModel tBLiveDataModel);

    Class<? extends BaseFrame> getLiveLinkEntranceFrame();

    Class<? extends BaseFrame> getLiveLinkFrame3Class();

    void liveLinkFrame3ShowStopLinkDialog(Object obj);

    void seiDispatcherDispatch(Object obj, String str);

    void seiDispatcherInitialize(Object obj);

    void seiDispatcherQuit(Object obj);
}
