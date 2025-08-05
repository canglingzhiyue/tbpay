package com.alibaba.security.realidentity;

import android.content.Context;
import com.alibaba.security.realidentity.biz.config.RPBizConfig;

/* loaded from: classes3.dex */
public interface n2 {
    void getRemoteModel(Context context, RPBizConfig rPBizConfig, o2 o2Var);

    void getRemoteSoAsync(o2 o2Var);

    boolean loadRemoteSo();

    boolean needDownloadModel(RPBizConfig rPBizConfig);

    boolean needLoadRemoteSo();
}
