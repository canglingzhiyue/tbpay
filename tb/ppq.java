package tb;

import com.taobao.taolive.sdk.business.IRemoteExtendListener;
import com.taobao.taolive.sdk.model.common.FandomInfo;
import com.taobao.taolive.sdk.model.common.VideoInfo;

/* loaded from: classes8.dex */
public interface ppq {

    /* loaded from: classes8.dex */
    public interface a {
        void onGetFandomInfoSuccess(FandomInfo fandomInfo, String str);

        void onGetVideoInfoFail(String str);

        void onGetVideoInfoSuccess(VideoInfo videoInfo, String str);
    }

    void destroy();

    void getVideoInfo(com.taobao.taolive.sdk.business.detail.a aVar, String str, a aVar2);

    void setIRemoteExtendListener(IRemoteExtendListener iRemoteExtendListener);
}
