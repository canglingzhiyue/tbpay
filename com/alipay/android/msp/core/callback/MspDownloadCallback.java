package com.alipay.android.msp.core.callback;

import java.util.Map;

/* loaded from: classes3.dex */
public interface MspDownloadCallback {
    void onCancel(Map map);

    void onFailed(Map map);

    void onFinish(Map map);

    void onPrepare(Map map);

    void onProgress(Map map);
}
