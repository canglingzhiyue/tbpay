package com.taobao.message.message_open_api;

import android.content.Context;
import com.alibaba.fastjson.JSONObject;
import com.taobao.message.kit.core.IObserver;
import java.util.Map;

/* loaded from: classes7.dex */
public interface ICallService {
    public static final String KEY_DURATION = "duration";
    public static final String KEY_IDENTITY = "identity";
    public static final String KEY_NEED_BC_LOGIN = "needBCLogin";
    public static final String KEY_NEED_ECODE = "needEcode";
    public static final String KEY_NEED_INIT = "needInit";
    public static final String KEY_NEED_LOGIN = "needLogin";
    public static final String KEY_TIMEOUT = "timeout";

    <T> void call(Context context, String str, JSONObject jSONObject, Map<String, Object> map, Map<String, Object> map2, IObserver<T> iObserver);

    void unsubscribe(String str);
}
