package com.taobao.infoflow.protocol.subservice.biz;

import android.content.Context;
import android.view.View;
import com.taobao.infoflow.protocol.subservice.ISubService;
import tb.lki;
import tb.lkj;
import tb.lkl;
import tb.lkm;

/* loaded from: classes.dex */
public interface ISceneService extends ISubService, lki, lkj, lkl, lkm {
    public static final String SERVICE_NAME = "SceneService";

    View createView(Context context);
}
