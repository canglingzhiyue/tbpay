package tb;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.alibaba.fastjson.JSONObject;
import com.taobao.tbliveinteractive.view.system_component.IntimacyParams;
import java.util.Map;

/* loaded from: classes8.dex */
public interface qmo {
    ViewGroup a(Context context);

    Map<String, String> a();

    void a(Context context, String str);

    void a(Context context, String str, boolean z);

    void a(JSONObject jSONObject);

    void a(String str);

    void a(ppr pprVar);

    View b(String str);

    IntimacyParams b();

    void b(ppr pprVar);

    boolean b(Context context);

    boolean c();

    boolean c(Context context);

    int d(Context context);

    String d();
}
