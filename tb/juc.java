package tb;

import android.content.Context;
import com.alibaba.fastjson.JSONObject;
import com.taobao.android.weex.WeexInstance;
import com.taobao.android.weex.config.b;

/* loaded from: classes6.dex */
public interface juc {
    WeexInstance a(Context context, String str, JSONObject jSONObject, b bVar);

    WeexInstance a(Context context, String str, JSONObject jSONObject, b bVar, WeexInstance weexInstance, int i);

    void registerSourceMapURL(String str, String str2);
}
