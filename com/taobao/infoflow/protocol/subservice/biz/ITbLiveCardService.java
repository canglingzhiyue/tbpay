package com.taobao.infoflow.protocol.subservice.biz;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.taobao.infoflow.protocol.subservice.ISubService;

/* loaded from: classes.dex */
public interface ITbLiveCardService extends ISubService {
    public static final String SERVICE_NAME = "TbLiveCardService";

    /* loaded from: classes7.dex */
    public interface a {
        Rect a();

        Rect b();
    }

    /* loaded from: classes7.dex */
    public interface b {
        JSONObject a();

        String b();
    }

    /* loaded from: classes7.dex */
    public interface c {
        void onVideoPrepare();

        void onVideoStart();

        void onVideoStop();
    }

    /* loaded from: classes7.dex */
    public interface d {
        public static final int MEDIA_PLAY_CLOSE = 2;
        public static final int MEDIA_PLAY_ERROR = 1;
    }

    void destroy();

    View getVideoView();

    boolean isPlaying();

    void setMediaStatusListener(d dVar);

    boolean startVideo(Context context, b bVar, a aVar, c cVar);

    void stopVideo();
}
