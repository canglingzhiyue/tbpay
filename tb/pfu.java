package tb;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.a;
import com.taobao.taobao.R;
import com.taobao.taolive.movehighlight.bundle.timeshiftContent.b;
import com.taobao.taolive.sdk.adapter.network.NetResponse;
import java.util.List;
import tb.pft;

/* loaded from: classes8.dex */
public class pfu {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public View f32610a;
    public pft b;
    private Context c;
    private JSONArray d;
    private RecyclerView e;
    private a f;

    static {
        kge.a(245191006);
    }

    public pfu(Context context, JSONArray jSONArray, a aVar) {
        this.c = context;
        this.d = jSONArray;
        this.f = aVar;
        a();
        b();
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        this.f32610a = LayoutInflater.from(this.c).inflate(R.layout.taolive_highligt_dx_content_list_layout, (ViewGroup) null);
        this.e = (RecyclerView) this.f32610a.findViewById(R.id.taolive_higlight_dx_content_list);
        this.e.setLayoutManager(new LinearLayoutManager(this.c, 0, false));
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        List parseArray = JSONArray.parseArray(this.d.toJSONString(), JSONObject.class);
        final pfb a2 = pfb.a(this.f);
        if (parseArray == null || parseArray.size() <= 0) {
            return;
        }
        this.b = new pft(this.c, parseArray, this.f);
        this.e.setAdapter(this.b);
        this.e.addItemDecoration(new pfv());
        this.b.a(new pft.a() { // from class: tb.pfu.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.pft.a
            public void a() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                } else if (a2.e() == null || a2.e().c() == null) {
                } else {
                    a2.e().c().a(new b.a() { // from class: tb.pfu.1.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // com.taobao.taolive.movehighlight.bundle.timeshiftContent.b.a
                        public void a() {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("56c6c68", new Object[]{this});
                            }
                        }

                        @Override // com.taobao.taolive.movehighlight.bundle.timeshiftContent.b.a
                        public void a(NetResponse netResponse) {
                            JSONObject jSONObject;
                            JSONArray jSONArray;
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("734351c3", new Object[]{this, netResponse});
                                return;
                            }
                            if (pfu.this.b != null) {
                                pfu.this.b.f32606a = false;
                            }
                            JSONObject jSONObject2 = (JSONObject) pqj.a(netResponse.getDataJsonObject().toString());
                            if (jSONObject2 == null || (jSONObject = jSONObject2.getJSONObject("model")) == null || (jSONArray = jSONObject.getJSONArray("timeMovingList")) == null || jSONArray.size() <= 0) {
                                return;
                            }
                            a2.e().c().a(jSONArray.size());
                            List<JSONObject> parseArray2 = JSONArray.parseArray(jSONArray.toJSONString(), JSONObject.class);
                            if (parseArray2 == null || pfu.this.b == null) {
                                return;
                            }
                            pfu.this.b.a(parseArray2);
                        }
                    });
                }
            }
        }, 3);
    }
}
