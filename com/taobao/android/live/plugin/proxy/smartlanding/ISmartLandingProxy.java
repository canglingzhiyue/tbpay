package com.taobao.android.live.plugin.proxy.smartlanding;

import android.content.Context;
import com.alibaba.fastjson.JSONObject;
import com.taobao.android.live.plugin.proxy.IProxy;
import com.taobao.taolive.sdk.model.TBLiveDataModel;

/* loaded from: classes6.dex */
public interface ISmartLandingProxy extends IProxy {
    public static final String KEY = "ISmartLandingProxy";

    /* loaded from: classes6.dex */
    public interface a {
    }

    /* loaded from: classes6.dex */
    public interface b {
        void a();

        void a(TBLiveDataModel tBLiveDataModel);

        void a(String str, String str2);

        void a(boolean z, String str, d dVar);

        void a(boolean z, String str, String str2, String str3, String str4, JSONObject jSONObject);

        void a(boolean z, String str, boolean z2, JSONObject jSONObject);

        boolean a(String str, a aVar);

        void c();

        boolean f();

        boolean g();
    }

    /* loaded from: classes6.dex */
    public interface c {
        void a();

        boolean a(Context context, String str, String str2, JSONObject jSONObject);
    }

    /* loaded from: classes6.dex */
    public interface d {
        boolean a(String str, JSONObject jSONObject, JSONObject jSONObject2);
    }

    b createSmartLanding(Context context, String str, String str2, String str3, c cVar);

    b createSmartLanding(Context context, String str, String str2, String str3, String str4, String str5, String str6, String str7, JSONObject jSONObject, c cVar);
}
