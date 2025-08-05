package com.taobao.android.fluid.framework.media;

import android.renderscript.RenderScript;
import com.taobao.android.fluid.core.FluidService;
import java.util.Map;
import tb.hjl;
import tb.hna;
import tb.hnh;
import tb.hni;
import tb.snd;
import tb.sns;
import tb.snv;
import tb.snz;

/* loaded from: classes5.dex */
public interface IMediaService extends FluidService, hjl, hna, hnh, hni, snd, snz {

    /* loaded from: classes5.dex */
    public interface a {
        void a();
    }

    sns getConfig();

    snv getCurrentPlayInstance();

    RenderScript getRenderScript();

    int getVideoLength();

    int getVideoProgress();

    boolean isFirstFrameSuccess();

    boolean isUseDefaultValueCreateDW();

    void pauseCurrentVideo();

    void resumeCurrentVideo();

    void setCurrentPlayInstance(snv snvVar);

    void setFirstFrameSuccess(boolean z);

    void setNeedFloatWindow(boolean z);

    void setOnStateChangeFromSmallWindowToNormal(a aVar);

    void setRenderScript(RenderScript renderScript);

    void setUseDefaultValueCreateDW(boolean z);

    boolean shouldVideoStay();

    void update12003UtParams(Map<String, String> map);
}
