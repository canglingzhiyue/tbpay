package tb;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import com.alibaba.fastjson.JSONObject;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.informationflowdataservice.dataservice.core.datasource.model.card.SectionModel;
import com.taobao.tao.recommend3.gateway.model.response.AwesomeGetPageData;
import java.util.List;

/* loaded from: classes8.dex */
public interface osm {

    /* loaded from: classes8.dex */
    public interface a {
        void a(otf otfVar);
    }

    otc a();

    void a(JSONObject jSONObject);

    void a(kso ksoVar, JSONObject jSONObject);

    ksn b();

    void b(JSONObject jSONObject);

    void c();

    void d();

    ksk f();

    String g();

    Context h();

    RecyclerView i();

    List<SectionModel> j();

    boolean k();

    DinamicXEngine n();

    boolean o();

    int p();

    int q();

    AwesomeGetPageData s();

    JSONObject t();
}
