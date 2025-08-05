package com.taobao.infoflow.protocol.subservice.biz;

import android.content.Context;
import android.content.res.Configuration;
import com.taobao.infoflow.protocol.subservice.ISubService;

/* loaded from: classes7.dex */
public interface IFoldDeviceAndPadService extends ISubService {
    public static final String SERVICE_NAME = "FoldDeviceAndPadService";

    /* loaded from: classes7.dex */
    public interface a {
        void onScreenChanged(boolean z, boolean z2, Configuration configuration);
    }

    void addOnScreenChangeListener(a aVar);

    int getInfoFlowAdaptiveColumn(Context context);

    boolean isAdaptHudScreen();

    void removeOnScreenChangeListener(a aVar);
}
