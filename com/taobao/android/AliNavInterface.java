package com.taobao.android;

import android.net.Uri;
import android.os.Bundle;
import com.alibaba.fastjson.JSONObject;

/* loaded from: classes4.dex */
public interface AliNavInterface {
    Uri a(String str, JSONObject jSONObject);

    AliNavInterface a(int i);

    AliNavInterface a(Bundle bundle);

    boolean a(Uri uri);

    boolean a(String str);

    AliNavInterface b(int i);
}
