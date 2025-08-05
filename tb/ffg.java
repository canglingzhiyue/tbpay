package tb;

import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.taobao.alilive.aliliveframework.context.atmo.bean.AtmosphereResListResponseData;
import com.taobao.alilive.aliliveframework.context.atmo.bean.AtmosphereResListResponseDataNew;
import com.taobao.alilive.aliliveframework.context.atmo.bean.EffectResConfig;
import com.taobao.alilive.aliliveframework.context.atmo.bean.StickerConfig;
import com.taobao.alilive.aliliveframework.context.atmo.bean.StickerGroup;
import com.taobao.android.detail.wrapper.activity.DetailActivity;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes4.dex */
public interface ffg {

    /* loaded from: classes5.dex */
    public interface a {
        DetailActivity af();

        View ag();

        double ah();
    }

    List<EffectResConfig> a(String str);

    List<JSONObject> a(List<EffectResConfig> list);

    void a();

    void a(com.taobao.alilive.aliliveframework.frame.a aVar, AtmosphereResListResponseData.AtmosphereResItem atmosphereResItem, gwy gwyVar);

    void a(com.taobao.alilive.aliliveframework.frame.a aVar, String str, String str2, String str3);

    void a(String str, boolean z);

    void a(fht fhtVar);

    List<List<StickerGroup>> b();

    void b(String str);

    HashMap<String, StickerConfig> c();

    HashMap<String, StickerConfig> d();

    HashMap<String, StickerConfig> e();

    HashMap<Integer, String> f();

    List<StickerGroup> g();

    List<StickerGroup> h();

    List<StickerGroup> i();

    List<String> j();

    List<AtmosphereResListResponseDataNew.TabInfo> k();

    HashMap<String, String> p();
}
