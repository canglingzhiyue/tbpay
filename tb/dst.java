package tb;

import android.content.Intent;
import android.view.View;
import com.alibaba.android.aura.datamodel.parse.AURAParseIO;
import com.alibaba.fastjson.JSONObject;
import com.taobao.android.buy.internal.b;

/* loaded from: classes4.dex */
public interface dst {

    /* loaded from: classes4.dex */
    public interface a<T, E> {
        T a(E e);
    }

    void a();

    void a(int i, int i2, Intent intent);

    void a(AURAParseIO aURAParseIO, a<Void, View> aVar);

    void a(JSONObject jSONObject);

    void a(JSONObject jSONObject, a aVar);

    void a(b bVar);

    void a(String str, JSONObject jSONObject);

    void a(a<Void, View> aVar);

    void b();

    void b(a<Void, AURAParseIO> aVar);
}
