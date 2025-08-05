package tb;

import android.content.Context;
import android.view.ViewGroup;
import com.alibaba.android.ultron.event.base.d;
import com.alibaba.android.ultron.vfw.viewholder.e;
import com.alibaba.fastjson.JSONObject;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.order.core.c;
import com.taobao.android.order.core.h;
import com.taobao.android.ultron.common.model.a;
import java.util.Map;

/* loaded from: classes6.dex */
public interface hzc {
    jnl a(jnk jnkVar);

    void a();

    void a(int i);

    void a(Context context);

    void a(JSONObject jSONObject, c cVar);

    void a(DXRootView dXRootView, JSONObject jSONObject);

    void a(h hVar, c cVar);

    void a(Long l, DXWidgetNode dXWidgetNode);

    void a(Long l, fuf fufVar);

    void a(String str);

    void a(String str, d dVar);

    void a(String str, e eVar);

    void a(String str, JSONObject jSONObject);

    void a(String str, dln dlnVar);

    void a(Map<String, ViewGroup> map);

    JSONObject b(String str);

    void b();

    a c(String str);
}
