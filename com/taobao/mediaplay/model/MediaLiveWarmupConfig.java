package com.taobao.mediaplay.model;

import java.io.Serializable;
import tb.kge;

/* loaded from: classes7.dex */
public class MediaLiveWarmupConfig implements Serializable {
    public static final int MEDIA_DECODER_WARMUP_LEVEL_BUFFER = 2;
    public static final int MEDIA_DECODER_WARMUP_LEVEL_SETUP = 1;
    public int mWarmupLevel = 1;
    public boolean mWarmupFlag = true;

    static {
        kge.a(2133964034);
        kge.a(1028243835);
    }
}
