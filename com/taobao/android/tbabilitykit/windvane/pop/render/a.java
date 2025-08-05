package com.taobao.android.tbabilitykit.windvane.pop.render;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.taobao.windvane.extra.uc.WVUCWebChromeClient;
import android.taobao.windvane.extra.uc.WVUCWebView;
import android.taobao.windvane.extra.uc.WVUCWebViewClient;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilitykit.ability.pop.model.c;
import com.taobao.android.abilitykit.ability.pop.render.ActivityLifeCycleCbRender;
import com.taobao.android.abilitykit.ability.pop.render.IAKPopRender;
import com.taobao.android.abilitykit.ability.pop.render.PopErrorView;
import com.taobao.android.abilitykit.ability.pop.render.d;
import com.taobao.android.tbabilitykit.pop.b;
import com.taobao.browser.BrowserHybridWebView;
import com.taobao.taobao.R;
import tb.dkv;
import tb.dlr;
import tb.dmr;
import tb.kge;

/* loaded from: classes6.dex */
public class a<PARAMS extends c, CONTEXT extends dlr> extends ActivityLifeCycleCbRender<PARAMS, CONTEXT> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public CONTEXT b;
    public WVUCWebView c;
    public boolean d = false;
    public com.taobao.android.tbabilitykit.pop.c e = null;

    static {
        kge.a(597503782);
    }

    public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1795038358) {
            super.a((View) objArr[0]);
            return null;
        } else if (hashCode != 1714797822) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.a((String) objArr[0], (JSONObject) objArr[1]);
            return null;
        }
    }

    @Override // com.taobao.android.abilitykit.ability.pop.render.IAKPopRender
    public void a(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c1152c8", new Object[]{this, new Integer(i), new Integer(i2)});
        }
    }

    @Override // com.taobao.android.abilitykit.ability.pop.render.ActivityLifeCycleCbRender
    public void b(CONTEXT context, PARAMS params, View view, d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e62ce5b", new Object[]{this, context, params, view, dVar});
            return;
        }
        this.b = context;
        if (this.f8938a == null || TextUtils.isEmpty(this.f8938a.c)) {
            dVar.a(new dkv(10015, "WindVane url is empty"), null);
            return;
        }
        Context a2 = this.b.a();
        if (a2 == null) {
            dVar.a(new dkv(90001, "WV render context is null"), null);
            return;
        }
        this.c = new BrowserHybridWebView(a2) { // from class: com.taobao.android.tbabilitykit.windvane.pop.render.TAKWindvaneRender$1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(TAKWindvaneRender$1 tAKWindvaneRender$1, String str, Object... objArr) {
                int hashCode = str.hashCode();
                if (hashCode != -1253202540) {
                    if (hashCode != 143825882) {
                        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
                    }
                    return new Boolean(super.coreOverScrollBy(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue(), ((Number) objArr[4]).intValue(), ((Number) objArr[5]).intValue(), ((Number) objArr[6]).intValue(), ((Number) objArr[7]).intValue(), ((Boolean) objArr[8]).booleanValue()));
                }
                return new Boolean(super.coreDispatchTouchEvent((MotionEvent) objArr[0]));
            }

            @Override // android.taobao.windvane.extra.uc.WVUCWebView, com.uc.webview.export.WebView, com.uc.webview.internal.interfaces.IWebViewOverride
            public boolean coreDispatchTouchEvent(MotionEvent motionEvent) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("b54da594", new Object[]{this, motionEvent})).booleanValue();
                }
                if (motionEvent.getActionMasked() == 0 || motionEvent.getPointerCount() > 1) {
                    a.this.d = true;
                }
                return super.coreDispatchTouchEvent(motionEvent);
            }

            @Override // android.taobao.windvane.extra.uc.WVUCWebView, com.uc.webview.export.WebView, com.uc.webview.internal.interfaces.IWebViewOverride
            public boolean coreOverScrollBy(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z) {
                IpChange ipChange2 = $ipChange;
                boolean z2 = true;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("8929bda", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6), new Integer(i7), new Integer(i8), new Boolean(z)})).booleanValue();
                }
                a aVar = a.this;
                if (i6 <= 0 || i4 <= 0) {
                    z2 = false;
                }
                aVar.d = z2;
                requestDisallowInterceptTouchEvent(a.this.d);
                return super.coreOverScrollBy(i, i2, i3, i4, i5, i6, i7, i8, z);
            }
        };
        this.c.getView().setTag(R.id.tak_pop_ability_engine_tag, context.e());
        this.c.getWvUIModel().setLoadingView(View.inflate(context.a(), R.layout.ability_kit_loading, null));
        this.c.setWebChromeClient(new WVUCWebChromeClient());
        this.c.setWebViewClient(new WVUCWebViewClient(a2));
        this.c.loadUrl(this.f8938a.c);
        dVar.a(this.c);
        this.c.getWvUIModel().setErrorView(new PopErrorView(a2, params));
        if (a2 instanceof b) {
            this.e = new com.taobao.android.tbabilitykit.pop.c() { // from class: com.taobao.android.tbabilitykit.windvane.pop.render.a.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.tbabilitykit.pop.c
                public void a(int i, int i2, Intent intent) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("79f30285", new Object[]{this, new Integer(i), new Integer(i2), intent});
                    } else {
                        a.this.c.onActivityResult(i, i2, intent);
                    }
                }
            };
            ((b) a2).b(this.e);
        }
        if (params.f8913a.t()) {
            return;
        }
        this.c.getView().setBackgroundColor(0);
    }

    @Override // com.taobao.android.abilitykit.ability.pop.render.IAKPopRender
    public boolean a(View view, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("b3afcdd", new Object[]{this, view, new Integer(i)})).booleanValue() : this.d;
    }

    @Override // com.taobao.android.abilitykit.ability.pop.render.ActivityLifeCycleCbRender, com.taobao.android.abilitykit.ability.pop.render.IAKPopRender
    public void a(View view) {
        CONTEXT context;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9501e36a", new Object[]{this, view});
            return;
        }
        super.a(view);
        WVUCWebView wVUCWebView = this.c;
        if (wVUCWebView != null) {
            wVUCWebView.destroy();
        }
        if (this.e == null || (context = this.b) == null) {
            return;
        }
        Context a2 = context.a();
        if (!(a2 instanceof b)) {
            return;
        }
        ((b) a2).a(this.e);
    }

    @Override // com.taobao.android.abilitykit.ability.pop.render.b, com.taobao.android.abilitykit.ability.pop.render.IAKPopRender
    public void a(String str, JSONObject jSONObject) {
        WVUCWebView wVUCWebView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6635bcfe", new Object[]{this, str, jSONObject});
            return;
        }
        super.a(str, jSONObject);
        if (IAKPopRender.LifecycleType.ANIMATION_POSITION_CHANGE.equals(str) || (wVUCWebView = this.c) == null) {
            return;
        }
        wVUCWebView.fireEvent(str, jSONObject != null ? jSONObject.toJSONString() : null);
    }

    @Override // com.taobao.android.abilitykit.ability.pop.render.ActivityLifeCycleCbRender
    public void a(String str, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("17fd7762", new Object[]{this, str, bundle});
        } else if (this.c == null || !dmr.o()) {
        } else {
            char c = 65535;
            int hashCode = str.hashCode();
            if (hashCode != 1403088877) {
                if (hashCode == 1463983852 && str.equals("onResume")) {
                    c = 0;
                }
            } else if (str.equals("onPaused")) {
                c = 1;
            }
            if (c == 0) {
                this.c.onResume();
            } else if (c != 1) {
            } else {
                this.c.onPause();
            }
        }
    }
}
