package com.taobao.media;

import tb.ddb;
import tb.ddc;
import tb.ddf;
import tb.kge;
import tb.mjw;

/* loaded from: classes7.dex */
public class MediaAdapteManager {
    public static ddb mABTestAdapter;
    public static ddc mConfigAdapter;
    public static mjw mMeasureAdapter;
    public static ddf mMediaNetworkUtilsAdapter;

    static {
        kge.a(1706334340);
        mConfigAdapter = new MediaConfigAdapter();
        mMeasureAdapter = new MediaMeasureAdapter();
        mMediaNetworkUtilsAdapter = new MediaNetworkUtilsAdapter();
        mABTestAdapter = new MediaABTestAdapter();
    }
}
