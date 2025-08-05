package com.taobao.tao.remotebusiness;

import mtopsdk.mtop.common.MtopListener;
import mtopsdk.mtop.domain.MtopResponse;

/* loaded from: classes.dex */
public interface IRemoteParserListener extends MtopListener {
    void parseResponse(MtopResponse mtopResponse);
}
