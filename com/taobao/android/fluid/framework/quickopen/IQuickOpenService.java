package com.taobao.android.fluid.framework.quickopen;

import com.taobao.android.fluid.core.FluidService;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import tb.soz;
import tb.spb;

/* loaded from: classes5.dex */
public interface IQuickOpenService extends FluidService, soz, spb {
    TUrlImageView getLoadingImage();

    boolean isInQuickOpenMode();

    boolean isQuickOpenMode();

    boolean isUsePreSize();

    void setInQuickOpenMode(boolean z);

    void setLoadingImage(TUrlImageView tUrlImageView);

    void setQuickOpenMode(boolean z);

    void setUsePreSize(boolean z);
}
