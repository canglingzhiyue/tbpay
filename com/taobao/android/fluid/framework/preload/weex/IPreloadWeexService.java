package com.taobao.android.fluid.framework.preload.weex;

import android.content.Context;
import android.view.ViewGroup;
import com.taobao.android.fluid.core.FluidService;
import com.taobao.android.fluid.framework.data.datamodel.a;
import com.taobao.android.fluid.framework.preload.data.PreloadWeexData;

/* loaded from: classes5.dex */
public interface IPreloadWeexService extends FluidService {
    void createWeexInstance(Context context, a aVar);

    PreloadWeexData getPreloadWeexData();

    void removePreAttachedWeexInstance();

    void startRender(Context context, ViewGroup viewGroup, a aVar);

    boolean tryAddWeexViewToContainer(ViewGroup viewGroup);
}
