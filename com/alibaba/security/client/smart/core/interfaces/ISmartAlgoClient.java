package com.alibaba.security.client.smart.core.interfaces;

import android.content.Context;
import android.os.Bundle;
import com.alibaba.security.client.smart.core.algo.AlgoInitResult;
import com.alibaba.security.client.smart.core.algo.ClientAlgoResult;
import com.alibaba.security.wukong.interfaces.IContentRiskPlatform;
import java.util.Map;

/* loaded from: classes3.dex */
public interface ISmartAlgoClient<T> {

    /* loaded from: classes3.dex */
    public interface OnAlgoResultListener {
        void onInit(AlgoInitResult algoInitResult);

        void onResult(ClientAlgoResult clientAlgoResult);
    }

    String algoCode();

    ClientAlgoResult detect(T t);

    int init(Context context, Bundle bundle, OnAlgoResultListener onAlgoResultListener, IContentRiskPlatform iContentRiskPlatform);

    boolean release();

    void setParams(String str, Object obj);

    void setParams(Map<String, Object> map);
}
