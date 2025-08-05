package tb;

import android.graphics.Rect;
import android.util.Pair;
import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.taobao.android.dinamicx.widget.DXWidgetNode;

/* loaded from: classes7.dex */
public interface mwp {
    void a(String str, JSONObject jSONObject);

    Pair<Rect, Boolean> findBasementLocalInWindow();

    JSONObject findWeexNodeLocal(String str);

    DXWidgetNode findWidgetNodeByUserId(String str);

    View getRootView();
}
