package com.taobao.android.detail2.core.framework.data.model;

import java.io.Serializable;
import java.util.List;
import tb.kge;

/* loaded from: classes5.dex */
public class PreloadInfo implements Serializable {
    public List<ImagePreloadInfo> images;
    public List<VideoPreloadInfo> videos;

    /* loaded from: classes5.dex */
    public static class ImagePreloadInfo implements Serializable {
        public String url;

        static {
            kge.a(-1138816908);
            kge.a(1028243835);
        }
    }

    /* loaded from: classes5.dex */
    public static class VideoPreloadInfo implements Serializable {
        public String url;
        public String videoId;
        public String videoThumbnailURL;

        static {
            kge.a(-560109228);
            kge.a(1028243835);
        }
    }

    static {
        kge.a(1715255116);
        kge.a(1028243835);
    }
}
