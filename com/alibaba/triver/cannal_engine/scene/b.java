package com.alibaba.triver.cannal_engine.scene;

import android.app.Activity;
import android.view.ViewGroup;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.external.embed.TMSEmbed;
import com.taobao.themis.external.embed.TMSEmbedSolutionType;
import com.taobao.themis.external.embed.a;
import com.taobao.themis.widget.e;
import com.taobao.themis.widget.event.GestureMode;
import com.taobao.weex.common.Constants;
import tb.kge;

/* loaded from: classes3.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private TMSEmbed.EmbedRootView f3677a;
    private TMSEmbed b;

    static {
        kge.a(1349625658);
    }

    public ViewGroup a(JSONObject jSONObject, Activity activity, TMSEmbed.EmbedRootView embedRootView, a.C0936a c0936a) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("49556178", new Object[]{this, jSONObject, activity, embedRootView, c0936a});
        }
        try {
            com.taobao.themis.external.embed.WidgetStartParams widgetStartParams = (com.taobao.themis.external.embed.WidgetStartParams) JSON.parseObject(jSONObject.toJSONString(), com.taobao.themis.external.embed.WidgetStartParams.class);
            widgetStartParams.build();
            this.f3677a = embedRootView;
            this.f3677a.setBackgroundColor(0);
            this.b = new TMSEmbed(activity, TMSEmbedSolutionType.WIDGET, this.f3677a, false);
            this.b.a(c0936a);
            this.b.a(widgetStartParams);
            this.b.a();
        } catch (Exception e) {
            RVLogger.e("", e);
        }
        return this.f3677a;
    }

    public static GestureMode a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (GestureMode) ipChange.ipc$dispatch("446fddbb", new Object[]{jSONObject});
        }
        if (jSONObject == null) {
            return GestureMode.DEFAULT;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("sceneParams");
        if (jSONObject2 == null || jSONObject2.getString("gestureMode") == null) {
            return GestureMode.DEFAULT;
        }
        String string = jSONObject2.getString("gestureMode");
        char c = 65535;
        switch (string.hashCode()) {
            case -1984141450:
                if (string.equals("vertical")) {
                    c = 0;
                    break;
                }
                break;
            case 96673:
                if (string.equals("all")) {
                    c = 2;
                    break;
                }
                break;
            case 3387192:
                if (string.equals("none")) {
                    c = 3;
                    break;
                }
                break;
            case 1387629604:
                if (string.equals(Constants.Value.HORIZONTAL)) {
                    c = 1;
                    break;
                }
                break;
        }
        if (c == 0) {
            return GestureMode.VERTICAL;
        }
        if (c == 1) {
            return GestureMode.HORIZONTAL;
        }
        if (c == 2) {
            return GestureMode.ALL;
        }
        if (c == 3) {
            return GestureMode.NONE;
        }
        return GestureMode.DEFAULT;
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        TMSEmbed tMSEmbed = this.b;
        if (tMSEmbed == null) {
            return;
        }
        tMSEmbed.h();
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        TMSEmbed tMSEmbed = this.b;
        if (tMSEmbed == null) {
            return;
        }
        tMSEmbed.i();
    }

    public void a(e.a aVar) {
        e eVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2a23e8a", new Object[]{this, aVar});
            return;
        }
        TMSEmbed tMSEmbed = this.b;
        if (tMSEmbed == null || (eVar = (e) tMSEmbed.a(e.class)) == null) {
            return;
        }
        eVar.a(aVar);
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        TMSEmbed tMSEmbed = this.b;
        if (tMSEmbed == null) {
            return;
        }
        tMSEmbed.c();
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        TMSEmbed tMSEmbed = this.b;
        if (tMSEmbed == null) {
            return;
        }
        tMSEmbed.f();
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        TMSEmbed tMSEmbed = this.b;
        if (tMSEmbed == null) {
            return;
        }
        tMSEmbed.g();
    }
}
