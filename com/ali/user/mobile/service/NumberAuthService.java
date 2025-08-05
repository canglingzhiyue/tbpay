package com.ali.user.mobile.service;

import com.ali.user.mobile.callback.CommonDataCallback;
import com.ali.user.mobile.model.NumAuthTokenCallback;
import java.util.Map;

/* loaded from: classes2.dex */
public interface NumberAuthService {

    /* loaded from: classes2.dex */
    public interface PrefetchResultObserver {
        void onResult(Map<String, String> map);
    }

    void addPrefetchResultObserver(PrefetchResultObserver prefetchResultObserver);

    Map<String, String> getAuthInfoMap();

    void getLoginMaskPhone(int i, CommonDataCallback commonDataCallback);

    void getLoginMaskPhone(int i, String str, CommonDataCallback commonDataCallback);

    void getLoginToken(String str, NumAuthTokenCallback numAuthTokenCallback);

    void getToken(NumAuthTokenCallback numAuthTokenCallback);

    boolean hasPreFecthMaskPhone();

    boolean isSupport4G();

    boolean needPrefetch();

    void preFecth();

    void preFecth(String str);

    void removePrefetchResultObserver(PrefetchResultObserver prefetchResultObserver);
}
