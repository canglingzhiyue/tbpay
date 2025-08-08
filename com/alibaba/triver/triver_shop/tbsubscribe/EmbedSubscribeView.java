package com.alibaba.triver.triver_shop.tbsubscribe;

import android.app.Activity;
import android.graphics.Bitmap;
import android.support.v4.app.FragmentActivity;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import android.widget.FrameLayout;
import com.alibaba.ariver.app.api.App;
import com.alibaba.ariver.app.api.point.app.AppDestroyPoint;
import com.alibaba.ariver.app.api.point.app.AppResumePoint;
import com.alibaba.ariver.app.api.point.app.AppStartPoint;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback;
import com.alibaba.ariver.integration.embedview.BaseEmbedView;
import com.alibaba.ariver.kernel.common.RVProxy;
import com.alibaba.ariver.kernel.common.service.RVEnvironmentService;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.triver.triver_shop.newShop.event.broadcast.c;
import com.alibaba.triver.triver_shop.weexview.TRNestedRenderContainer;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.subscribe.protocol.b;
import com.taobao.android.dinamicx.subscribe.protocol.shop.a;
import com.ut.mini.UTAnalytics;
import java.util.Map;
import tb.ccx;
import tb.kge;
import tb.rir;
import tb.ris;

/* loaded from: classes3.dex */
public class EmbedSubscribeView extends BaseEmbedView implements AppDestroyPoint, AppResumePoint, AppStartPoint {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TYPE = "tb-subscribe-view";

    /* renamed from: a  reason: collision with root package name */
    private FragmentActivity f4146a;
    private FrameLayout b;
    private Map c;
    private String d;
    private String e;
    private volatile boolean f = false;
    private ris g;
    private a h;
    private String i;
    private String j;

    static {
        kge.a(1341891601);
        kge.a(985272245);
        kge.a(-1968005700);
        kge.a(2033524132);
    }

    public static /* synthetic */ Object ipc$super(EmbedSubscribeView embedSubscribeView, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1504501726) {
            super.onDestroy();
            return null;
        } else if (hashCode != 1664325763) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.onCreate((Map) objArr[0]);
            return null;
        }
    }

    @Override // com.alibaba.ariver.engine.api.embedview.IEmbedView
    public Bitmap getSnapshot() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("a92c69f", new Object[]{this});
        }
        return null;
    }

    @Override // com.alibaba.ariver.engine.api.embedview.IEmbedView
    public String getType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("13e5e549", new Object[]{this}) : TYPE;
    }

    @Override // com.alibaba.ariver.app.api.point.app.AppResumePoint
    public void onAppResume(App app) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af37acaa", new Object[]{this, app});
        }
    }

    @Override // com.alibaba.ariver.app.api.point.app.AppStartPoint
    public void onAppStart(App app) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88a9c35b", new Object[]{this, app});
        }
    }

    @Override // com.alibaba.ariver.engine.api.embedview.IEmbedView
    public void onAttachedToWebView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1bdbec2", new Object[]{this});
        }
    }

    @Override // com.alibaba.ariver.engine.api.embedview.IEmbedView
    public void onDetachedToWebView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("850d0fb4", new Object[]{this});
        }
    }

    @Override // com.alibaba.ariver.engine.api.embedview.IEmbedView
    public void onEmbedViewVisibilityChanged(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48c81239", new Object[]{this, new Integer(i)});
        }
    }

    @Override // com.alibaba.ariver.kernel.api.extension.Extension
    public void onFinalized() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd1b9dee", new Object[]{this});
        }
    }

    @Override // com.alibaba.ariver.kernel.api.extension.Extension
    public void onInitialized() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94f2f17c", new Object[]{this});
        }
    }

    @Override // com.alibaba.ariver.integration.embedview.BaseEmbedView, com.alibaba.ariver.engine.api.embedview.IEmbedView
    public void onParamChanged(String[] strArr, String[] strArr2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ddb624d", new Object[]{this, strArr, strArr2});
        }
    }

    @Override // com.alibaba.ariver.engine.api.embedview.IEmbedView
    public void onRequestPermissionResult(int i, String[] strArr, int[] iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("43aa2a2d", new Object[]{this, new Integer(i), strArr, iArr});
        }
    }

    public static /* synthetic */ a access$000(EmbedSubscribeView embedSubscribeView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("38e86e23", new Object[]{embedSubscribeView}) : embedSubscribeView.h;
    }

    public static /* synthetic */ String access$102(EmbedSubscribeView embedSubscribeView, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c0319500", new Object[]{embedSubscribeView, str});
        }
        embedSubscribeView.d = str;
        return str;
    }

    public static /* synthetic */ void access$200(EmbedSubscribeView embedSubscribeView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9af3b37", new Object[]{embedSubscribeView});
        } else {
            embedSubscribeView.b();
        }
    }

    public static /* synthetic */ Map access$302(EmbedSubscribeView embedSubscribeView, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("56a704e6", new Object[]{embedSubscribeView, map});
        }
        embedSubscribeView.c = map;
        return map;
    }

    public static /* synthetic */ void access$400(EmbedSubscribeView embedSubscribeView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b6ffc75", new Object[]{embedSubscribeView});
        } else {
            embedSubscribeView.c();
        }
    }

    public static /* synthetic */ String access$502(EmbedSubscribeView embedSubscribeView, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ce502104", new Object[]{embedSubscribeView, str});
        }
        embedSubscribeView.e = str;
        return str;
    }

    public static /* synthetic */ void access$600(EmbedSubscribeView embedSubscribeView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d30bdb3", new Object[]{embedSubscribeView});
        } else {
            embedSubscribeView.d();
        }
    }

    @Override // com.alibaba.ariver.integration.embedview.BaseEmbedView, com.alibaba.ariver.engine.api.embedview.IEmbedView
    public void onCreate(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63339883", new Object[]{this, map});
            return;
        }
        super.onCreate(map);
        try {
            a();
            this.g = new ris(((RVEnvironmentService) RVProxy.get(RVEnvironmentService.class)).getApplicationContext(), "mashop_broadcast", new rir() { // from class: com.alibaba.triver.triver_shop.tbsubscribe.EmbedSubscribeView.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.rir
                public void a(Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("a6251244", new Object[]{this, obj});
                        return;
                    }
                    try {
                        if (!(obj instanceof String)) {
                            return;
                        }
                        JSONObject parseObject = JSON.parseObject(obj.toString());
                        if (!StringUtils.equals(c.MSG_SHOP_FOLLOW_SETSTATUS, parseObject.getString("_msg_name"))) {
                            return;
                        }
                        String string = parseObject.getString("status");
                        if (StringUtils.equals("followed", string)) {
                            EmbedSubscribeView.access$000(EmbedSubscribeView.this).a((Object) null);
                        } else if (!StringUtils.equals(c.MSG_UNFOLLOWED, string)) {
                        } else {
                            EmbedSubscribeView.access$000(EmbedSubscribeView.this).a((Object) null);
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            });
            this.h = new a(this.f4146a, new b() { // from class: com.alibaba.triver.triver_shop.tbsubscribe.EmbedSubscribeView.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.dinamicx.subscribe.protocol.b
                public void a(String str) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("f3a64c32", new Object[]{this, str});
                        return;
                    }
                    EmbedSubscribeView.access$102(EmbedSubscribeView.this, str);
                    EmbedSubscribeView.access$200(EmbedSubscribeView.this);
                }

                @Override // com.taobao.android.dinamicx.subscribe.protocol.b
                public void a(Map<String, String> map2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5a42121d", new Object[]{this, map2});
                        return;
                    }
                    EmbedSubscribeView.access$302(EmbedSubscribeView.this, map2);
                    EmbedSubscribeView.access$400(EmbedSubscribeView.this);
                }

                @Override // com.taobao.android.dinamicx.subscribe.protocol.b
                public void b(String str) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("3dd7e573", new Object[]{this, str});
                        return;
                    }
                    EmbedSubscribeView.access$502(EmbedSubscribeView.this, str);
                    EmbedSubscribeView.access$600(EmbedSubscribeView.this);
                }
            });
        } catch (Exception unused) {
        }
    }

    @Override // com.alibaba.ariver.engine.api.embedview.IEmbedView
    public View getView(int i, int i2, String str, String str2, Map<String, String> map) {
        a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("bcdbb931", new Object[]{this, new Integer(i), new Integer(i2), str, str2, map});
        }
        if (this.f4146a == null || (aVar = this.h) == null) {
            return null;
        }
        View a2 = aVar.a(map);
        a(map);
        this.b = ccx.A() ? new FrameLayout(this.f4146a) : new TRNestedRenderContainer(this.f4146a);
        this.b.addView(a2, new FrameLayout.LayoutParams(-1, -1));
        return this.b;
    }

    @Override // com.alibaba.ariver.engine.api.embedview.IEmbedView
    public void onReceivedMessage(String str, JSONObject jSONObject, BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("231420a4", new Object[]{this, str, jSONObject, bridgeCallback});
        } else if (this.h == null) {
        } else {
            a(jSONObject);
        }
    }

    @Override // com.alibaba.ariver.integration.embedview.BaseEmbedView, com.alibaba.ariver.engine.api.embedview.IEmbedView
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        this.g = null;
        a aVar = this.h;
        if (aVar == null) {
            return;
        }
        aVar.c();
        this.h = null;
    }

    @Override // com.alibaba.ariver.engine.api.embedview.IEmbedView
    public void onReceivedRender(JSONObject jSONObject, BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7cb20669", new Object[]{this, jSONObject, bridgeCallback});
        } else if (this.h == null) {
        } else {
            a(jSONObject);
        }
    }

    @Override // com.alibaba.ariver.engine.api.embedview.IEmbedView
    public void onWebViewResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb053b0e", new Object[]{this});
        } else if (this.h == null || !this.f) {
        } else {
            this.h.a();
            UTAnalytics.getInstance().getDefaultTracker().updatePageName(this.f4146a, e());
            Map map = this.c;
            if (map == null || map.size() <= 0) {
                return;
            }
            UTAnalytics.getInstance().getDefaultTracker().updatePageProperties(this.f4146a, this.c);
        }
    }

    @Override // com.alibaba.ariver.engine.api.embedview.IEmbedView
    public void onWebViewPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b457ef63", new Object[]{this});
        } else if (this.h == null || !this.f) {
        } else {
            this.h.b();
        }
    }

    @Override // com.alibaba.ariver.app.api.point.app.AppDestroyPoint
    public void onAppDestroy(App app) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ffc9373", new Object[]{this, app});
            return;
        }
        a aVar = this.h;
        if (aVar == null) {
            return;
        }
        aVar.c();
        this.h = null;
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (this.mOuterPage == null || this.mOuterPage.getPageContext() == null) {
        } else {
            Activity activity = this.mOuterPage.getPageContext().getActivity();
            this.f4146a = activity instanceof FragmentActivity ? (FragmentActivity) activity : null;
        }
    }

    private void a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
            return;
        }
        try {
            if (map.containsKey("subscribeData")) {
                JSONObject parseObject = JSONObject.parseObject(map.get("subscribeData"));
                this.i = parseObject.getString("weexShopToken");
                this.j = parseObject.getString("weexShopTabId");
            }
            if (map.containsKey("visible")) {
                a("true".equalsIgnoreCase(map.get("visible")));
            } else {
                this.h.a();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
            return;
        }
        try {
            if (jSONObject.containsKey("subscribeData")) {
                Object obj = jSONObject.get("subscribeData");
                if (obj instanceof String) {
                    JSONObject parseObject = JSONObject.parseObject((String) obj);
                    this.i = parseObject.getString("weexShopToken");
                    this.j = parseObject.getString("weexShopTabId");
                } else if (obj instanceof JSONObject) {
                    this.i = ((JSONObject) obj).getString("weexShopToken");
                    this.j = ((JSONObject) obj).getString("weexShopTabId");
                }
            }
            if (!jSONObject.containsKey("visible")) {
                return;
            }
            a(jSONObject.getBooleanValue("visible"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        this.f = z;
        a aVar = this.h;
        if (aVar == null) {
            return;
        }
        if (z) {
            aVar.a();
        } else {
            aVar.b();
        }
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("_msg_type", (Object) "aplus.enter");
        jSONObject.put("_msg_token", (Object) this.i);
        jSONObject.put("_msg_source", (Object) this.j);
        jSONObject.put("_msg_target", (Object) c.MSG_SOURCE_PARENT);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("isonepage", (Object) true);
        jSONObject2.put("pageName", (Object) e());
        jSONObject.put("pageConfig", (Object) jSONObject2);
        jSONObject.put("params", (Object) this.c);
        ris risVar = this.g;
        if (risVar == null) {
            return;
        }
        risVar.a(jSONObject);
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("_msg_type", (Object) "aplus.updatePageProperties");
        jSONObject.put("_msg_token", (Object) this.i);
        jSONObject.put("_msg_source", (Object) this.j);
        jSONObject.put("_msg_target", (Object) c.MSG_SOURCE_PARENT);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("pageName", (Object) e());
        jSONObject2.put("isonepage", (Object) true);
        jSONObject.put("pageConfig", (Object) jSONObject2);
        jSONObject.put("params", (Object) this.c);
        ris risVar = this.g;
        if (risVar == null) {
            return;
        }
        risVar.a(jSONObject);
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("_msg_type", (Object) "aplus.updateNextPageProperties");
        jSONObject.put("_msg_token", (Object) this.i);
        jSONObject.put("_msg_source", (Object) this.j);
        jSONObject.put("_msg_target", (Object) c.MSG_SOURCE_PARENT);
        jSONObject.put("pageConfig", (Object) null);
        jSONObject.put("params", (Object) null);
        ris risVar = this.g;
        if (risVar == null) {
            return;
        }
        risVar.a(jSONObject);
    }

    private String e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[]{this}) : StringUtils.isEmpty(this.d) ? "Page_DingYueShopIndexAll" : this.d;
    }
}
