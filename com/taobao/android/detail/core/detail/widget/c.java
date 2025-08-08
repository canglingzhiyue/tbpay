package com.taobao.android.detail.core.detail.widget;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.activity.DetailCoreActivity;
import com.taobao.android.detail.core.detail.content.f;
import com.taobao.android.detail.core.detail.content.h;
import com.taobao.android.detail.core.performance.BTags;
import com.taobao.android.detail.core.performance.i;
import com.taobao.android.detail.core.standard.widget.a;
import com.taobao.android.detail.core.utils.s;
import com.taobao.android.dinamicx.DXResult;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import com.taobao.message.lab.comfrm.support.list.AbsListWidgetInstance;
import tb.ecf;
import tb.ehc;
import tb.eip;
import tb.emu;
import tb.gbg;
import tb.iuy;
import tb.kge;

/* loaded from: classes4.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public FrameLayout f9659a;
    private Context b;
    private DXTemplateItem c;
    private com.taobao.android.detail.core.standard.widget.a d;
    private ehc e;
    private JSONObject f;
    private DXRootView g;
    private boolean h = true;

    static {
        kge.a(137334157);
    }

    public static /* synthetic */ DXRootView a(c cVar, DXRootView dXRootView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXRootView) ipChange.ipc$dispatch("d6bca230", new Object[]{cVar, dXRootView});
        }
        cVar.g = dXRootView;
        return dXRootView;
    }

    public c(Context context, ehc ehcVar) {
        this.b = context;
        this.d = new com.taobao.android.detail.core.standard.widget.a(context);
        this.e = ehcVar;
        this.f9659a = new FrameLayout(context);
        emu.a("com.taobao.android.detail.core.detail.widget.TTElevatorFloatViewHolder");
    }

    private void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        ViewGroup viewGroup = (ViewGroup) this.f9659a.getParent();
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f9659a.getLayoutParams();
        if (viewGroup == null) {
            return;
        }
        if (s.a() && eip.F) {
            DinamicXEngine a2 = this.d.a();
            a2.b().a(iuy.d);
            layoutParams.width = gbg.a(a2, this.b, this.e.f);
            layoutParams.height = gbg.a(a2, this.b, this.e.g);
        } else {
            layoutParams.width = gbg.b(this.b, this.e.f);
            layoutParams.height = gbg.b(this.b, this.e.g);
        }
        layoutParams.gravity = 85;
        viewGroup.updateViewLayout(this.f9659a, layoutParams);
    }

    public void a(FrameLayout frameLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f363e3eb", new Object[]{this, frameLayout});
        } else if (((DetailCoreActivity) this.b).m() || this.e == null) {
        } else {
            String a2 = i.a("TTElevator", BTags.TTFloat);
            com.taobao.android.detail.core.utils.i.d(a2, "addView:" + JSON.toJSONString(this.e));
            this.c = new DXTemplateItem();
            this.c.c = this.e.c;
            this.c.f11925a = this.e.f27305a;
            this.c.b = f.a(this.e.b);
            this.f = this.e.d;
            if (this.f9659a.getParent() != null) {
                ((ViewGroup) this.f9659a.getParent()).removeView(this.f9659a);
            }
            frameLayout.addView(this.f9659a);
            f();
            this.d.a(h.DX_EVENT_DCEVENT, new h());
            this.d.a(this.c, this.f, new a.InterfaceC0381a() { // from class: com.taobao.android.detail.core.detail.widget.c.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.detail.core.standard.widget.a.InterfaceC0381a
                public void a(DXTemplateItem dXTemplateItem, DXResult<DXRootView> dXResult) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("489f219c", new Object[]{this, dXTemplateItem, dXResult});
                    } else if (dXResult.b()) {
                        String a3 = i.a("TTElevator", BTags.TTFloat);
                        com.taobao.android.detail.core.utils.i.a(a3, "renderDX onRenderSuccess hasErrror:" + dXResult.a().toString());
                    } else {
                        c.a(c.this, dXResult.f11780a);
                        c.this.f9659a.addView(dXResult.f11780a, new FrameLayout.LayoutParams(-2, -2));
                        c.this.f9659a.setVisibility(8);
                        String a4 = i.a("TTElevator", BTags.TTFloat);
                        com.taobao.android.detail.core.utils.i.d(a4, "renderDX onRenderSuccess:" + dXResult.f11780a.getChildAt(0).getWidth() + "," + dXResult.f11780a.getChildAt(0).getMeasuredHeight());
                    }
                }

                @Override // com.taobao.android.detail.core.standard.widget.a.InterfaceC0381a
                public void a(DXTemplateItem dXTemplateItem, com.taobao.android.dinamicx.s sVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7d32a2d0", new Object[]{this, dXTemplateItem, sVar});
                        return;
                    }
                    String a3 = i.a("TTElevator", BTags.TTFloat);
                    com.taobao.android.detail.core.utils.i.a(a3, "onRenderFailure:" + sVar.toString());
                }
            });
        }
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        if (this.f9659a.getParent() != null) {
            ((ViewGroup) this.f9659a.getParent()).removeView(this.f9659a);
        }
        this.f9659a.removeAllViews();
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else if (this.f9659a.getParent() == null || this.g == null || this.f == null || StringUtils.isEmpty(str) || str.equals(this.f.getString("selectedLocationId"))) {
        } else {
            String a2 = i.a("TTElevator", BTags.TTFloat);
            com.taobao.android.detail.core.utils.i.d(a2, "highlightElevator:" + str);
            this.f = new JSONObject(this.f);
            this.f.put("selectedLocationId", (Object) str);
            g();
        }
    }

    private void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
        } else {
            this.d.a(this.g, this.f, new a.InterfaceC0381a() { // from class: com.taobao.android.detail.core.detail.widget.c.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.detail.core.standard.widget.a.InterfaceC0381a
                public void a(DXTemplateItem dXTemplateItem, DXResult<DXRootView> dXResult) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("489f219c", new Object[]{this, dXTemplateItem, dXResult});
                        return;
                    }
                    String a2 = i.a("TTElevator", BTags.TTFloat);
                    com.taobao.android.detail.core.utils.i.d(a2, "updateDXView onRenderSuccess hasErrror:" + dXResult.a().toString());
                }

                @Override // com.taobao.android.detail.core.standard.widget.a.InterfaceC0381a
                public void a(DXTemplateItem dXTemplateItem, com.taobao.android.dinamicx.s sVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7d32a2d0", new Object[]{this, dXTemplateItem, sVar});
                        return;
                    }
                    String a2 = i.a("TTElevator", BTags.TTFloat);
                    com.taobao.android.detail.core.utils.i.a(a2, "updateDXView onRenderFailure:" + sVar.toString());
                }
            });
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (this.f9659a.getParent() == null) {
        } else {
            if (this.h) {
                this.h = false;
                ecf.e(this.b, "detailV3");
            }
            if (this.f9659a.getVisibility() != 8) {
                return;
            }
            this.f9659a.setVisibility(0);
            com.taobao.android.detail.core.utils.i.d(i.a("TTElevator", BTags.TTFloat), "showElevetor");
        }
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else if (this.f9659a.getParent() == null || this.f9659a.getVisibility() != 0) {
        } else {
            this.f9659a.setVisibility(8);
            com.taobao.android.detail.core.utils.i.d(i.a("TTElevator", BTags.TTFloat), "hideElevetor");
        }
    }

    public void d() {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else if (this.f9659a.getParent() == null || this.f9659a.getVisibility() != 0 || (jSONObject = this.f) == null || !"true".equalsIgnoreCase(jSONObject.getString(AbsListWidgetInstance.KEY_SECTION_EXPAND))) {
        } else {
            this.f = new JSONObject(this.f);
            this.f.put(AbsListWidgetInstance.KEY_SECTION_EXPAND, (Object) "false");
            this.e.h = "false";
            g();
            f();
            com.taobao.android.detail.core.utils.i.d(i.a("TTElevator", BTags.TTFloat), "shrinkElevetor");
        }
    }

    public void e() {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
        } else if (this.f9659a.getParent() == null || this.f9659a.getVisibility() != 0 || (jSONObject = this.f) == null || "true".equalsIgnoreCase(jSONObject.getString(AbsListWidgetInstance.KEY_SECTION_EXPAND))) {
        } else {
            this.f = new JSONObject(this.f);
            this.f.put(AbsListWidgetInstance.KEY_SECTION_EXPAND, (Object) "true");
            this.e.h = "true";
            g();
            f();
            com.taobao.android.detail.core.utils.i.d(i.a("TTElevator", BTags.TTFloat), "expandElevetor");
        }
    }

    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
        } else if (this.f9659a.getParent() == null || this.f9659a.getVisibility() != 0) {
        } else {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("locatorId", (Object) str);
            com.taobao.android.trade.event.f.a(this.b).a(new com.taobao.android.detail.core.event.basic.a(jSONObject));
        }
    }

    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
            return;
        }
        com.taobao.android.detail.core.standard.widget.a aVar = this.d;
        if (aVar == null) {
            return;
        }
        aVar.b();
    }
}
