package com.taobao.android.searchbaseframe.datasource;

import com.taobao.android.searchbaseframe.datasource.LocalDataManager;
import com.taobao.android.searchbaseframe.datasource.param.SearchParam;
import com.taobao.android.searchbaseframe.datasource.result.SearchResult;
import java.util.Map;

/* loaded from: classes6.dex */
public interface c<RESULT extends SearchResult, PARAM extends SearchParam, LOCAL extends LocalDataManager> {

    /* loaded from: classes6.dex */
    public interface a {
        String a();
    }

    void addParam(String str, String str2);

    void clearParam(String str);

    String getTrackingName();

    void removeAllParams();

    void removeParam(String str, String str2);

    void setParam(String str, String str2);

    void setParams(Map<String, String> map);
}
