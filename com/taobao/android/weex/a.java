package com.taobao.android.weex;

import android.content.Context;
import android.util.Log;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex.e;
import tb.kge;

/* loaded from: classes6.dex */
public abstract class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final a INST;

    public abstract WeexInstance createInstance(Context context, String str, WeexInstanceMode weexInstanceMode, WeexRenderType weexRenderType, JSONObject jSONObject, com.taobao.android.weex.config.b bVar);

    public abstract q createInstanceAsync(Context context, String str, WeexInstanceMode weexInstanceMode, WeexRenderType weexRenderType, JSONObject jSONObject, com.taobao.android.weex.config.b bVar);

    public abstract void destroyPreInstanceWithUrl(String str);

    public abstract j getDownloader();

    public abstract c getEngine();

    public abstract WeexInstance getPreInstance(Context context, String str);

    public abstract l getValueFactory();

    public abstract e.a preCreateInstance(Context context, String str, JSONObject jSONObject, JSONObject jSONObject2, com.taobao.android.weex.config.b bVar, h hVar);

    static {
        a aVar;
        kge.a(-1297450260);
        try {
            aVar = (a) Class.forName("com.taobao.android.weex.WeexFactoryImpl").newInstance();
        } catch (Throwable th) {
            Log.e(com.taobao.android.weex_framework.util.g.TAG, "WeexFactory Init failed", th);
            aVar = null;
        }
        INST = aVar;
    }

    public static a getInstance() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("cce8e59d", new Object[0]) : INST;
    }
}
