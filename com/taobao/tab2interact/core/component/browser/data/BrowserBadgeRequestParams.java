package com.taobao.tab2interact.core.component.browser.data;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.layoutmanager.module.MtopModule;
import com.taobao.tab2interact.core.utils.c;
import java.util.HashMap;
import java.util.Map;
import tb.kge;
import tb.oeb;

/* loaded from: classes8.dex */
public class BrowserBadgeRequestParams extends c.b<JSONObject> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String SECURITY_CODE_KEY = "asac";
    private static final String SECURITY_CODE_VALUE = "2A23327TCD1APQSMKC8CEK";

    /* renamed from: a  reason: collision with root package name */
    private String f19740a = "mtop.cogman.container.center.login";
    private String b = "1.0";
    private boolean c = true;
    private JSONObject data = new JSONObject();
    private Map<String, String> d = new HashMap();

    /* loaded from: classes8.dex */
    public static class BizParams {
        public static final String ACTION_REFRESH = "refresh";
        public static final String ACTION_RENDER = "render";
        public static final String ACTION_WATCH = "watch";

        /* renamed from: a  reason: collision with root package name */
        public String f19741a;
        public long b;

        static {
            kge.a(2090800618);
        }
    }

    static {
        kge.a(653857653);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, com.alibaba.fastjson.JSONObject] */
    @Override // com.taobao.tab2interact.core.utils.c.b
    public /* synthetic */ JSONObject f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("5dd0ace5", new Object[]{this}) : getData();
    }

    public BrowserBadgeRequestParams() {
        this.d.put("asac", SECURITY_CODE_VALUE);
        if (oeb.aP()) {
            MtopModule.appendHeaderXBizInfo(this.d, "ci_bucket=" + oeb.x());
            this.d.put(MtopModule.KEY_MTOP_HEADER_XBIZTYPE, "guangguang");
        }
    }

    @Override // com.taobao.tab2interact.core.utils.c.b
    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : this.f19740a;
    }

    @Override // com.taobao.tab2interact.core.utils.c.b
    public void setApi(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b780bae9", new Object[]{this, str});
        } else {
            this.f19740a = str;
        }
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
        } else {
            this.b = str;
        }
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
        } else {
            this.d = map;
        }
    }

    public JSONObject getData() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("b8351bc7", new Object[]{this}) : this.data;
    }

    @Override // com.taobao.tab2interact.core.utils.c.b
    public void setData(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d09acf9d", new Object[]{this, jSONObject});
        } else {
            this.data = jSONObject;
        }
    }
}
