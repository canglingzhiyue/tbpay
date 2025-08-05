package com.taobao.tab2interact.core.layer.h5.data;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tab2interact.core.utils.c;
import java.util.Map;
import kotlin.collections.ai;
import kotlin.jvm.internal.q;
import tb.kge;

/* loaded from: classes8.dex */
public final class H5InteractLayerRequestParams extends c.b<JSONObject> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private String f19771a = "mtop.taobao.content.detail.entity.get";
    private String b = "1.0";
    private boolean c = true;
    private Map<String, String> d = ai.a();
    private JSONObject e = new JSONObject();

    static {
        kge.a(-307979569);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, com.alibaba.fastjson.JSONObject] */
    @Override // com.taobao.tab2interact.core.utils.c.b
    public /* synthetic */ JSONObject f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("5dd0ace5", new Object[]{this}) : e();
    }

    @Override // com.taobao.tab2interact.core.utils.c.b
    public /* synthetic */ void setData(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4f836cf", new Object[]{this, jSONObject});
        } else {
            a(jSONObject);
        }
    }

    @Override // com.taobao.tab2interact.core.utils.c.b
    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : this.f19771a;
    }

    @Override // com.taobao.tab2interact.core.utils.c.b
    public void setApi(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b780bae9", new Object[]{this, str});
            return;
        }
        q.d(str, "<set-?>");
        this.f19771a = str;
    }

    @Override // com.taobao.tab2interact.core.utils.c.b
    public String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : this.b;
    }

    @Override // com.taobao.tab2interact.core.utils.c.b
    public void setVersion(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e718c27", new Object[]{this, str});
            return;
        }
        q.d(str, "<set-?>");
        this.b = str;
    }

    @Override // com.taobao.tab2interact.core.utils.c.b
    public boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue() : this.c;
    }

    @Override // com.taobao.tab2interact.core.utils.c.b
    public void setNeedSession(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d1d1128f", new Object[]{this, new Boolean(z)});
        } else {
            this.c = z;
        }
    }

    @Override // com.taobao.tab2interact.core.utils.c.b
    public Map<String, String> d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("913cde0", new Object[]{this}) : this.d;
    }

    @Override // com.taobao.tab2interact.core.utils.c.b
    public void setHeaders(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf00da", new Object[]{this, map});
            return;
        }
        q.d(map, "<set-?>");
        this.d = map;
    }

    public void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
            return;
        }
        q.d(jSONObject, "<set-?>");
        this.e = jSONObject;
    }

    public JSONObject e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("bf3ec58c", new Object[]{this}) : this.e;
    }
}
