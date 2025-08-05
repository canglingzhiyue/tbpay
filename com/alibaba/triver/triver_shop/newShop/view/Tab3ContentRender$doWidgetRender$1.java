package com.alibaba.triver.triver_shop.newShop.view;

import android.net.Uri;
import android.support.v4.app.FragmentActivity;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.triver.cannal_engine.TRWidgetInstance;
import com.alibaba.triver.cannal_engine.common.TRWidgetConstant;
import com.alibaba.triver.cannal_engine.scene.WidgetStartParams;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import kotlin.t;
import tb.ceg;
import tb.ruk;
import tb.rul;

/* loaded from: classes3.dex */
public final class Tab3ContentRender$doWidgetRender$1 extends Lambda implements rul<JSONObject, t> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ TRWidgetInstance $instance;
    public final /* synthetic */ o this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Tab3ContentRender$doWidgetRender$1(o oVar, TRWidgetInstance tRWidgetInstance) {
        super(1);
        this.this$0 = oVar;
        this.$instance = tRWidgetInstance;
    }

    @Override // tb.rul
    /* renamed from: invoke */
    public /* bridge */ /* synthetic */ t mo2421invoke(JSONObject jSONObject) {
        invoke2(jSONObject);
        return t.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(JSONObject jSONObject) {
        JSONObject jSONObject2;
        JSONObject jSONObject3;
        JSONObject jSONObject4;
        String queryParameter;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("583b49d1", new Object[]{this, jSONObject});
        } else if (jSONObject == null) {
            ceg.Companion.b("shop tab3 request widget Render info null");
        } else {
            o oVar = this.this$0;
            com.alibaba.triver.triver_shop.newShop.data.d dVar = o.$ipChange;
            o oVar2 = this.this$0;
            JSONObject jSONObject5 = o.$ipChange;
            if (jSONObject5 != null) {
                JSONObject jSONObject6 = jSONObject5;
                jSONObject6.put((JSONObject) "shop_id", dVar.T());
                jSONObject6.put((JSONObject) "sellerId", dVar.U());
                jSONObject6.put((JSONObject) "pageUrl", "https://shop" + ((Object) dVar.T()) + ".m.taobao.com");
                Uri Y = dVar.Y();
                if (Y != null && (queryParameter = Y.getQueryParameter("widgetShareParams")) != null) {
                    jSONObject6.put((JSONObject) "widgetShareParams", queryParameter);
                }
            }
            WidgetStartParams widgetStartParams = new WidgetStartParams();
            JSONObject jSONObject7 = jSONObject.getJSONObject("data");
            String str = null;
            if (jSONObject7 != null && (jSONObject2 = jSONObject7.getJSONObject("module")) != null) {
                o oVar3 = this.this$0;
                JSONObject jSONObject8 = jSONObject2.getJSONObject("bizRenderVO");
                widgetStartParams.setWidgetInfo(jSONObject8 == null ? null : jSONObject8.toString());
                o.a(oVar3, jSONObject2.getJSONObject("bizRenderVO").getString("widgetId"));
                JSONObject jSONObject9 = jSONObject2.getJSONObject("globalData");
                if (jSONObject9 != null && (jSONObject3 = jSONObject9.getJSONObject("sceneParams")) != null && (jSONObject4 = o.$ipChange) != null) {
                    jSONObject4.putAll(jSONObject3);
                }
            }
            o oVar4 = this.this$0;
            JSONObject jSONObject10 = o.$ipChange;
            if (jSONObject10 != null) {
                str = jSONObject10.toString();
            }
            widgetStartParams.setSceneParams(str);
            o oVar5 = this.this$0;
            widgetStartParams.setWidth(String.valueOf(com.alibaba.triver.triver_shop.newShop.ext.o.f(Integer.valueOf(((FragmentActivity) o.$ipChange).getWindow().getDecorView().getWidth()))));
            o oVar6 = this.this$0;
            widgetStartParams.setHeight(String.valueOf(com.alibaba.triver.triver_shop.newShop.ext.o.f(Integer.valueOf(((FragmentActivity) o.$ipChange).getWindow().getDecorView().getHeight()))));
            o oVar7 = this.this$0;
            if (o.$ipChange) {
                widgetStartParams.setRenderMode(TRWidgetConstant.WidgetRenderMode.texture.name());
            }
            com.alibaba.triver.triver_shop.newShop.ext.b.b(new AnonymousClass3(this.$instance, widgetStartParams, this.this$0));
        }
    }

    /* renamed from: com.alibaba.triver.triver_shop.newShop.view.Tab3ContentRender$doWidgetRender$1$3  reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass3 extends Lambda implements ruk<t> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ TRWidgetInstance $instance;
        public final /* synthetic */ WidgetStartParams $widgetStartParams;
        public final /* synthetic */ o this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(TRWidgetInstance tRWidgetInstance, WidgetStartParams widgetStartParams, o oVar) {
            super(0);
            this.$instance = tRWidgetInstance;
            this.$widgetStartParams = widgetStartParams;
            this.this$0 = oVar;
        }

        @Override // tb.ruk
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ t mo2427invoke() {
            mo2427invoke();
            return t.INSTANCE;
        }

        @Override // tb.ruk
        /* renamed from: invoke  reason: collision with other method in class */
        public final void mo2427invoke() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7560ccff", new Object[]{this});
                return;
            }
            this.$instance.render(this.$widgetStartParams);
            o oVar = this.this$0;
            o.$ipChange.addView(this.$instance.getRootView());
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, com.alibaba.triver.triver_shop.newShop.ext.o.c((Number) 370), 48);
            o oVar2 = this.this$0;
            FrameLayout frameLayout = o.$ipChange;
            o oVar3 = this.this$0;
            frameLayout.addView(o.$ipChange, layoutParams);
        }
    }
}
