package com.taobao.tao.remotebusiness;

import mtopsdk.mtop.domain.MtopResponse;

/* loaded from: classes.dex */
public interface IRemoteBaseListener extends IRemoteListener {
    void onSystemError(int i, MtopResponse mtopResponse, Object obj);
}
