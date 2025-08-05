package com.alibaba.triver.triver_shop.container.shopLoft;

import android.content.Context;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.triver.cannal_engine.TRWidgetInstance;
import com.alibaba.triver.cannal_engine.common.TRWidgetConstant;
import com.alibaba.triver.cannal_engine.event.nativeembed.NativeWidgetNestedRenderContainer;
import com.alibaba.triver.cannal_engine.scene.WidgetStartParams;
import com.alibaba.triver.triver_shop.container.shopLoft.b;
import com.alibaba.triver.triver_shop.newShop.ext.m;
import com.android.alibaba.ip.runtime.IpChange;
import com.ut.share.business.ShareContent;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.q;
import tb.ceg;
import tb.kge;

/* loaded from: classes3.dex */
public final class i implements TRWidgetInstance.g, b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private TRWidgetInstance f3731a;
    private WidgetLoftData b;
    private TRWidgetInstance.i c;
    private boolean d;
    private View e;
    private Context f;
    private JSONObject g;
    private final kotlin.d h = kotlin.e.a(new WidgetLoftView$rootView$2(this));

    /* loaded from: classes3.dex */
    public static final class a implements TRWidgetInstance.c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.alibaba.triver.cannal_engine.TRWidgetInstance.c
        public void a(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
            } else {
                ceg.Companion.b(q.a("on widget js error : ", (Object) str2));
            }
        }
    }

    static {
        kge.a(1085255244);
        kge.a(-563039837);
        kge.a(410076142);
    }

    @Override // com.alibaba.triver.triver_shop.container.shopLoft.b
    public void endAnimation() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e1560f0", new Object[]{this});
        }
    }

    @Override // com.alibaba.triver.triver_shop.container.shopLoft.b
    public String getUTPageName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("34b6390a", new Object[]{this}) : "Page_Shop_2Fcontentfeed_marketcard";
    }

    @Override // com.alibaba.triver.triver_shop.container.shopLoft.b
    public void mute(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4254d4b4", new Object[]{this, new Boolean(z)});
        }
    }

    @Override // com.alibaba.triver.triver_shop.container.shopLoft.b
    public void startAnimation() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("579958c9", new Object[]{this});
        }
    }

    @Override // com.alibaba.triver.triver_shop.container.shopLoft.b
    public void willDisappear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6526ff8", new Object[]{this});
        }
    }

    public static final /* synthetic */ void a(i iVar, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b139250", new Object[]{iVar, view});
        } else {
            iVar.e = view;
        }
    }

    @Override // com.alibaba.triver.triver_shop.container.shopLoft.b
    public /* synthetic */ Map getUTProperties() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("16970404", new Object[]{this}) : a();
    }

    private final FrameLayout b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FrameLayout) ipChange.ipc$dispatch("cec35b50", new Object[]{this}) : (FrameLayout) this.h.getValue();
    }

    @Override // com.alibaba.triver.triver_shop.container.shopLoft.b
    public void initWithData(Context context, JSONObject jSONObject, b.c cVar, b.a aVar) {
        TRWidgetInstance.i iVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aac25571", new Object[]{this, context, jSONObject, cVar, aVar});
            return;
        }
        this.f = context;
        this.g = jSONObject;
        this.b = (WidgetLoftData) com.alibaba.triver.triver_shop.newShop.ext.d.a(jSONObject, WidgetLoftData.class);
        WidgetLoftData widgetLoftData = this.b;
        if (widgetLoftData == null) {
            ceg.Companion.b("widgetLoftData is null");
            iVar = new TRWidgetInstance.i(-1, -1);
        } else {
            JSONObject jSONObject2 = new JSONObject();
            if (widgetLoftData.sceneParams == null) {
                widgetLoftData.sceneParams = jSONObject2;
            }
            if (jSONObject != null) {
                Object obj = jSONObject.get("widgetShareParams");
                if (obj != null) {
                    widgetLoftData.sceneParams.put("widgetShareParams", obj);
                }
                widgetLoftData.sceneParams.put("pageUrl", (Object) jSONObject.getString("shareUrl"));
            }
            iVar = new TRWidgetInstance.i(widgetLoftData.width, widgetLoftData.height, widgetLoftData.visualX, widgetLoftData.visualY);
        }
        this.c = iVar;
        if (!(context instanceof FragmentActivity)) {
            return;
        }
        this.f3731a = new TRWidgetInstance((FragmentActivity) context);
    }

    private final void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else if (this.d) {
        } else {
            this.d = true;
            WidgetLoftData widgetLoftData = this.b;
            if (widgetLoftData == null) {
                return;
            }
            TRWidgetInstance tRWidgetInstance = this.f3731a;
            if (tRWidgetInstance != null) {
                Context context = this.f;
                q.a(context);
                tRWidgetInstance.setRootContainer(new NativeWidgetNestedRenderContainer(context));
            }
            TRWidgetInstance tRWidgetInstance2 = this.f3731a;
            if (tRWidgetInstance2 != null) {
                tRWidgetInstance2.registerWidgetRenderListener(this);
            }
            TRWidgetInstance tRWidgetInstance3 = this.f3731a;
            if (tRWidgetInstance3 != null) {
                tRWidgetInstance3.registerWidgetExceptionListener(new a());
            }
            WidgetStartParams widgetStartParams = new WidgetStartParams();
            JSONObject jSONObject = widgetLoftData.sceneParams;
            String str = null;
            widgetStartParams.setSceneParams(jSONObject == null ? null : jSONObject.toJSONString());
            widgetStartParams.setWidgetId(widgetLoftData.widgetId);
            widgetStartParams.setDebugUrl(widgetLoftData.debugUrl);
            widgetStartParams.setWidth(String.valueOf(widgetLoftData.width));
            widgetStartParams.setHeight(String.valueOf(widgetLoftData.height));
            widgetStartParams.setRelationUrl(widgetLoftData.relationUrl);
            widgetStartParams.setSpmUrl(widgetLoftData.spmUrl);
            widgetStartParams.setVersion(widgetLoftData.version);
            widgetStartParams.setVisualX(String.valueOf(widgetLoftData.visualX));
            widgetStartParams.setVisualY(String.valueOf(widgetLoftData.visualY));
            JSONObject jSONObject2 = widgetLoftData.initData;
            if (jSONObject2 != null) {
                str = jSONObject2.toString();
            }
            widgetStartParams.setInitData(str);
            TRWidgetInstance tRWidgetInstance4 = this.f3731a;
            if (tRWidgetInstance4 != null) {
                tRWidgetInstance4.render(widgetStartParams);
            }
            FrameLayout b = b();
            TRWidgetInstance tRWidgetInstance5 = this.f3731a;
            q.a(tRWidgetInstance5);
            b.addView(tRWidgetInstance5.getRootView());
        }
    }

    @Override // com.alibaba.triver.triver_shop.container.shopLoft.b
    public void willAppear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c314ed0e", new Object[]{this});
        } else {
            c();
        }
    }

    @Override // com.alibaba.triver.triver_shop.container.shopLoft.b
    public void didAppear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e328d7b", new Object[]{this});
            return;
        }
        HashMap<String, String> a2 = a();
        if (a2 != null) {
            a2.put("spm", "a2141.b91375813.c1638791681170.d1638791681170");
        }
        m.b("Page_Shop_2Fcontentfeed_marketcard", "Page_Shop_2Fcontentfeed_marketcard_exposure", a2);
        TRWidgetInstance tRWidgetInstance = this.f3731a;
        if (tRWidgetInstance == null) {
            return;
        }
        tRWidgetInstance.resume();
    }

    @Override // com.alibaba.triver.triver_shop.container.shopLoft.b
    public void didDisappear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3025c6b", new Object[]{this});
            return;
        }
        TRWidgetInstance tRWidgetInstance = this.f3731a;
        if (tRWidgetInstance == null) {
            return;
        }
        tRWidgetInstance.pause();
    }

    @Override // com.alibaba.triver.triver_shop.container.shopLoft.b
    public void play() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6fe955bb", new Object[]{this});
        } else {
            c();
        }
    }

    @Override // com.alibaba.triver.triver_shop.container.shopLoft.b
    public void pause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("315dbf7d", new Object[]{this});
            return;
        }
        TRWidgetInstance tRWidgetInstance = this.f3731a;
        if (tRWidgetInstance == null) {
            return;
        }
        tRWidgetInstance.pause();
    }

    @Override // com.alibaba.triver.triver_shop.container.shopLoft.b
    public void onDestroyed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf354a81", new Object[]{this});
            return;
        }
        TRWidgetInstance tRWidgetInstance = this.f3731a;
        if (tRWidgetInstance != null) {
            tRWidgetInstance.destroy();
        }
        this.f3731a = null;
    }

    @Override // com.alibaba.triver.triver_shop.container.shopLoft.b
    public void onActivityResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c4fa6e2", new Object[]{this});
            return;
        }
        TRWidgetInstance tRWidgetInstance = this.f3731a;
        if (tRWidgetInstance == null) {
            return;
        }
        tRWidgetInstance.resume();
    }

    @Override // com.alibaba.triver.triver_shop.container.shopLoft.b
    public void onActivityPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64e6b90f", new Object[]{this});
            return;
        }
        TRWidgetInstance tRWidgetInstance = this.f3731a;
        if (tRWidgetInstance == null) {
            return;
        }
        tRWidgetInstance.pause();
    }

    @Override // com.alibaba.triver.triver_shop.container.shopLoft.b
    public void onActivityStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3ac47b7", new Object[]{this});
            return;
        }
        TRWidgetInstance tRWidgetInstance = this.f3731a;
        if (tRWidgetInstance == null) {
            return;
        }
        tRWidgetInstance.stop();
    }

    @Override // com.alibaba.triver.triver_shop.container.shopLoft.b
    public void onPageStable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f36639f0", new Object[]{this});
        } else {
            c();
        }
    }

    public HashMap<String, String> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("be7c57cb", new Object[]{this});
        }
        HashMap<String, String> hashMap = new HashMap<>();
        HashMap<String, String> hashMap2 = hashMap;
        JSONObject jSONObject = this.g;
        String str = null;
        hashMap2.put("shop_id", jSONObject == null ? null : jSONObject.getString("shopId"));
        JSONObject jSONObject2 = this.g;
        hashMap2.put("seller_id", jSONObject2 == null ? null : jSONObject2.getString("sellerId"));
        hashMap2.put("spm-cnt", "a2141.b91375813.0.0");
        hashMap2.put("tag", "2FMarket");
        JSONObject jSONObject3 = this.g;
        if (jSONObject3 != null) {
            str = jSONObject3.getString("id");
        }
        hashMap2.put("widgetid", str);
        return hashMap;
    }

    @Override // com.alibaba.triver.triver_shop.container.shopLoft.b
    public View getView() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("576a35e4", new Object[]{this}) : b();
    }

    @Override // com.alibaba.triver.triver_shop.container.shopLoft.b
    public ShareContent getShareContent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ShareContent) ipChange.ipc$dispatch("897c4b17", new Object[]{this});
        }
        ShareContent shareContent = new ShareContent();
        JSONObject jSONObject = this.g;
        String str = null;
        shareContent.imageUrl = jSONObject == null ? null : jSONObject.getString("shareImage");
        JSONObject jSONObject2 = this.g;
        shareContent.title = jSONObject2 == null ? null : jSONObject2.getString("shareTitle");
        JSONObject jSONObject3 = this.g;
        if (jSONObject3 != null) {
            str = jSONObject3.getString("shareText");
        }
        shareContent.description = str;
        return shareContent;
    }

    @Override // com.alibaba.triver.cannal_engine.TRWidgetInstance.g
    public void a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9501e36a", new Object[]{this, view});
        } else {
            ceg.Companion.b("on widget render success");
        }
    }

    @Override // com.alibaba.triver.cannal_engine.TRWidgetInstance.g
    public void a(com.alibaba.triver.cannal_engine.common.a aVar, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af2eb696", new Object[]{this, aVar, map});
            return;
        }
        if (q.a((Object) TRWidgetConstant.CL_TRIVER_INITING.f3640a, (Object) (aVar == null ? null : aVar.f3640a))) {
            return;
        }
        if (aVar != null) {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = jSONObject;
            jSONObject2.put((JSONObject) "errorCode", aVar.f3640a);
            jSONObject2.put((JSONObject) "errorMessage", aVar.b);
            jSONObject2.put((JSONObject) "errorActionType", aVar.c);
            ceg.Companion.b(q.a("on widget render error : ", (Object) jSONObject));
        }
        com.alibaba.triver.triver_shop.newShop.ext.b.b(new WidgetLoftView$onRenderError$2(this));
    }
}
