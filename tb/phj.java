package tb;

import android.content.Context;
import com.alibaba.fastjson.JSONObject;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.DinamicXEngine;

/* loaded from: classes8.dex */
public interface phj {

    /* loaded from: classes8.dex */
    public interface a {
        void onCreateView(DXRootView dXRootView);
    }

    DinamicXEngine a();

    void a(Context context, String str, a aVar);

    void a(DXRootView dXRootView, JSONObject jSONObject);
}
