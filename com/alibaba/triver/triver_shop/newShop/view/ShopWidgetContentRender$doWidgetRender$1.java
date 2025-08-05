package com.alibaba.triver.triver_shop.newShop.view;

import android.net.Uri;
import android.support.v4.app.FragmentActivity;
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
public final class ShopWidgetContentRender$doWidgetRender$1 extends Lambda implements rul<JSONObject, t> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ TRWidgetInstance $instance;
    public final /* synthetic */ m this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShopWidgetContentRender$doWidgetRender$1(m mVar, TRWidgetInstance tRWidgetInstance) {
        super(1);
        this.this$0 = mVar;
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
            m mVar = this.this$0;
            com.alibaba.triver.triver_shop.newShop.data.d g = m.$ipChange.g();
            kotlin.jvm.internal.q.a(g);
            m mVar2 = this.this$0;
            JSONObject jSONObject5 = m.$ipChange;
            if (jSONObject5 != null) {
                JSONObject jSONObject6 = jSONObject5;
                jSONObject6.put((JSONObject) "shop_id", g.T());
                jSONObject6.put((JSONObject) "sellerId", g.U());
                jSONObject6.put((JSONObject) "pageUrl", "https://shop" + ((Object) g.T()) + ".m.taobao.com");
                Uri Y = g.Y();
                if (Y != null && (queryParameter = Y.getQueryParameter("widgetShareParams")) != null) {
                    jSONObject6.put((JSONObject) "widgetShareParams", queryParameter);
                }
            }
            WidgetStartParams widgetStartParams = new WidgetStartParams();
            JSONObject jSONObject7 = jSONObject.getJSONObject("data");
            String str = null;
            if (jSONObject7 != null && (jSONObject2 = jSONObject7.getJSONObject("module")) != null) {
                m mVar3 = this.this$0;
                JSONObject jSONObject8 = jSONObject2.getJSONObject("bizRenderVO");
                widgetStartParams.setWidgetInfo(jSONObject8 == null ? null : jSONObject8.toString());
                m.a(mVar3, jSONObject2.getJSONObject("bizRenderVO").getString("widgetId"));
                JSONObject jSONObject9 = jSONObject2.getJSONObject("globalData");
                if (jSONObject9 != null && (jSONObject3 = jSONObject9.getJSONObject("sceneParams")) != null && (jSONObject4 = m.$ipChange) != null) {
                    jSONObject4.putAll(jSONObject3);
                }
            }
            m mVar4 = this.this$0;
            JSONObject jSONObject10 = m.$ipChange;
            if (jSONObject10 != null) {
                str = jSONObject10.toString();
            }
            widgetStartParams.setSceneParams(str);
            m mVar5 = this.this$0;
            widgetStartParams.setWidth(String.valueOf(com.alibaba.triver.triver_shop.newShop.ext.o.f(Integer.valueOf(((FragmentActivity) m.$ipChange).getWindow().getDecorView().getWidth()))));
            m mVar6 = this.this$0;
            widgetStartParams.setHeight(String.valueOf(com.alibaba.triver.triver_shop.newShop.ext.o.f(Integer.valueOf(((FragmentActivity) m.$ipChange).getWindow().getDecorView().getHeight()))));
            m mVar7 = this.this$0;
            if (m.$ipChange) {
                widgetStartParams.setRenderMode(TRWidgetConstant.WidgetRenderMode.texture.name());
            }
            com.alibaba.triver.triver_shop.newShop.ext.b.b(new AnonymousClass3(this.$instance, widgetStartParams, this.this$0));
        }
    }

    /* renamed from: com.alibaba.triver.triver_shop.newShop.view.ShopWidgetContentRender$doWidgetRender$1$3  reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass3 extends Lambda implements ruk<t> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ TRWidgetInstance $instance;
        public final /* synthetic */ WidgetStartParams $widgetStartParams;
        public final /* synthetic */ m this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(TRWidgetInstance tRWidgetInstance, WidgetStartParams widgetStartParams, m mVar) {
            super(0);
            this.$instance = tRWidgetInstance;
            this.$widgetStartParams = widgetStartParams;
            this.this$0 = mVar;
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
            m mVar = this.this$0;
            m.$ipChange.addView(this.$instance.getRootView());
        }
    }
}
