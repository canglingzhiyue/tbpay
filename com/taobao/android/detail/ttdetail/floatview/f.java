package com.taobao.android.detail.ttdetail.floatview;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.utils.i;
import com.taobao.android.detail.ttdetail.utils.j;
import com.taobao.android.detail.ttdetail.utils.p;
import com.taobao.android.detail.ttdetail.widget.ObserverFrameLayout;
import com.taobao.android.dinamicx.DXRootView;
import tb.eyx;
import tb.ezh;
import tb.ezi;
import tb.gbg;
import tb.kge;

/* loaded from: classes4.dex */
public class f {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_BOTTOM_DX = "bottomDX";
    public static final String KEY_FLOAT_VIEW = "detail3FloatView";

    /* renamed from: a  reason: collision with root package name */
    private DXRootView f10655a;
    private eyx b;

    static {
        kge.a(1276800190);
    }

    public static /* synthetic */ DXRootView a(f fVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DXRootView) ipChange.ipc$dispatch("c1a28185", new Object[]{fVar}) : fVar.f10655a;
    }

    public static /* synthetic */ DXRootView a(f fVar, DXRootView dXRootView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXRootView) ipChange.ipc$dispatch("8b5946e4", new Object[]{fVar, dXRootView});
        }
        fVar.f10655a = dXRootView;
        return dXRootView;
    }

    public static /* synthetic */ void a(f fVar, ezh ezhVar, JSONObject jSONObject, JSONObject jSONObject2, FrameLayout frameLayout, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b7272b1", new Object[]{fVar, ezhVar, jSONObject, jSONObject2, frameLayout, new Integer(i)});
        } else {
            fVar.a(ezhVar, jSONObject, jSONObject2, frameLayout, i);
        }
    }

    public f(eyx eyxVar) {
        this.b = eyxVar;
    }

    public void a(final ObserverFrameLayout observerFrameLayout, final JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("401cfd20", new Object[]{this, observerFrameLayout, jSONObject});
        } else if (observerFrameLayout == null) {
        } else {
            if (this.f10655a != null) {
                i.a("TTDBottomFloatDXController", "addToParent removeView");
                observerFrameLayout.removeView(this.f10655a);
            }
            final JSONObject jSONObject2 = jSONObject.getJSONObject("data");
            if (jSONObject2 == null || jSONObject2.isEmpty()) {
                return;
            }
            final ezh f = this.b.f();
            if (com.taobao.android.detail.ttdetail.utils.e.b()) {
                observerFrameLayout.setOnSizeChangedListener(new ObserverFrameLayout.a() { // from class: com.taobao.android.detail.ttdetail.floatview.f.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.android.detail.ttdetail.widget.ObserverFrameLayout.a
                    public void a(int i) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
                        } else {
                            f.a(f.this, f, jSONObject, jSONObject2, observerFrameLayout, i);
                        }
                    }
                });
            } else {
                a(f, jSONObject, jSONObject2, observerFrameLayout, 0);
            }
        }
    }

    private void a(final ezh ezhVar, JSONObject jSONObject, final JSONObject jSONObject2, final FrameLayout frameLayout, final int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8449f59b", new Object[]{this, ezhVar, jSONObject, jSONObject2, frameLayout, new Integer(i)});
        } else {
            p.a(ezhVar, jSONObject, new ezh.c() { // from class: com.taobao.android.detail.ttdetail.floatview.f.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.ezh.c
                public void a(ezi eziVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("e7d65404", new Object[]{this, eziVar});
                        return;
                    }
                    if (f.a(f.this) != null) {
                        frameLayout.removeView(f.a(f.this));
                    }
                    int a2 = gbg.a();
                    int i2 = i;
                    if (i2 != 0) {
                        a2 = View.MeasureSpec.makeMeasureSpec(i2, 1073741824);
                    }
                    ViewGroup a3 = p.a(ezhVar, jSONObject2, eziVar, a2, gbg.b());
                    if (!(a3 instanceof DXRootView)) {
                        return;
                    }
                    f.a(f.this, (DXRootView) a3);
                    frameLayout.addView(f.a(f.this));
                    ezhVar.a(f.a(f.this));
                }

                @Override // tb.ezh.c
                public void a(ezi eziVar, String str) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7fd804ce", new Object[]{this, eziVar, str});
                        return;
                    }
                    i.a("TTDBottomFloatDXController", "onRenderFailure:" + str);
                }
            });
        }
    }

    public static JSONObject a(eyx eyxVar) {
        JSONObject a2;
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("85306934", new Object[]{eyxVar});
        }
        if (j.q() && (a2 = eyxVar.a().a()) != null && (jSONObject = a2.getJSONObject("detail3FloatView")) != null) {
            return jSONObject.getJSONObject("bottomDX");
        }
        return null;
    }
}
