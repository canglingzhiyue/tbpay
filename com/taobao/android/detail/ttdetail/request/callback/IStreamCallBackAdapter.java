package com.taobao.android.detail.ttdetail.request.callback;

import com.alibaba.fastjson.JSONObject;
import com.taobao.android.detail.ttdetail.request.MtopInfo;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.stream.d;
import mtopsdk.mtop.domain.BaseOutDo;

/* loaded from: classes5.dex */
public interface IStreamCallBackAdapter extends IRemoteBaseListener {
    String getItemId();

    void handleExceptionDowngrade(int i, Object obj);

    void handleReceiveData(d dVar, BaseOutDo baseOutDo, int i, Object obj);

    boolean handleRequestDowngrade(JSONObject jSONObject, String str);

    void setMtopInfo(MtopInfo mtopInfo);
}
