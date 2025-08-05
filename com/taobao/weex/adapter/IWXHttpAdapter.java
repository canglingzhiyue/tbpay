package com.taobao.weex.adapter;

import com.taobao.weex.common.WXRequest;
import com.taobao.weex.common.WXResponse;
import java.util.List;
import java.util.Map;

/* loaded from: classes9.dex */
public interface IWXHttpAdapter {

    /* loaded from: classes9.dex */
    public interface OnHttpListener {
        void onHeadersReceived(int i, Map<String, List<String>> map);

        void onHttpFinish(WXResponse wXResponse);

        void onHttpResponseProgress(int i);

        void onHttpStart();

        void onHttpUploadProgress(int i);
    }

    void sendRequest(WXRequest wXRequest, OnHttpListener onHttpListener);
}
