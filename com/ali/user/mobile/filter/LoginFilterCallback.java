package com.ali.user.mobile.filter;

import java.util.Map;

/* loaded from: classes2.dex */
public interface LoginFilterCallback {
    void onFail(int i, Map<String, String> map);

    void onSuccess();
}
