package com.taobao.android.msoa.callback;

import java.util.Map;

/* loaded from: classes6.dex */
public interface MSOAServiceListener {
    void onFail(String str, String str2, boolean z, Map<String, Object> map);

    void onSuccess(Map<String, Object> map);
}
