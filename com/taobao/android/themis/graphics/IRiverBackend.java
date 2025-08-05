package com.taobao.android.themis.graphics;

import android.view.MotionEvent;
import com.alibaba.fastjson.JSONObject;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes6.dex */
public interface IRiverBackend {

    /* loaded from: classes6.dex */
    public enum EngineType {
        Qking,
        V8
    }

    void a(String str, JSONObject jSONObject, boolean z);

    void a(String str, String str2);

    void a(HashMap<String, String> hashMap);

    void a(Map<String, String> map);

    void a(byte[] bArr, String str);

    boolean a();

    boolean a(MotionEvent motionEvent);

    boolean a(String str);

    void b();

    void b(String str, String str2);

    void b(byte[] bArr, String str);

    void c(byte[] bArr, String str);
}
