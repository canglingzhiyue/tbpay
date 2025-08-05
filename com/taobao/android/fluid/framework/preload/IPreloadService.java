package com.taobao.android.fluid.framework.preload;

import android.content.Context;
import android.net.Uri;
import com.alibaba.fastjson.JSONObject;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.core.FluidInstance;
import com.taobao.android.fluid.core.FluidService;
import com.taobao.android.fluid.framework.preload.dwinstance.PreRenderDWInstance;
import com.taobao.android.fluid.framework.preload.dwinstance.b;
import com.taobao.android.fluid.framework.preload.task.IPreloadTask;
import com.taobao.tao.flexbox.layoutmanager.core.TNodeView;
import tb.sjq;
import tb.sor;

/* loaded from: classes5.dex */
public interface IPreloadService extends FluidService {
    void clearMemoryData();

    void clearPreloadTaskForContext(FluidInstance fluidInstance, Context context);

    void doPreload(FluidInstance fluidInstance, Context context, JSONObject jSONObject);

    void doPreloadForInactive(FluidInstance fluidInstance, Context context, JSONObject jSONObject);

    IPreloadTask getCurrentPreloadTask();

    sjq getPreLoadVideoCommentSizeObject();

    PreRenderDWInstance getPreRenderDWInstance();

    sor getPreloadVideoData();

    b getPreloadVideoTrackerManager();

    sor getPreloadedVideo(FluidContext fluidContext);

    boolean isInactiveUnexposedCacheVideo();

    boolean isPreloadedVideoAdded(FluidContext fluidContext);

    void setPreloadABConfig(JSONObject jSONObject);

    JSONObject startRender(FluidInstance fluidInstance, Context context, TNodeView tNodeView, Uri uri, String str, boolean z);

    void startWarmUp(FluidInstance fluidInstance, Context context, Uri uri);
}
