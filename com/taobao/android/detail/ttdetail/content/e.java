package com.taobao.android.detail.ttdetail.content;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.bizmessage.l;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import com.taobao.android.dinamicx.widget.DXRecyclerLayout;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import tb.eyx;
import tb.ezh;
import tb.ezi;
import tb.gbg;
import tb.hjs;
import tb.kge;

/* loaded from: classes4.dex */
public class e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private FrameLayout f10585a;
    private Context b;
    private eyx c;
    private DXRootView d;
    private DXRecyclerLayout e;

    static {
        kge.a(-1605483816);
    }

    public static /* synthetic */ DXRootView a(e eVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DXRootView) ipChange.ipc$dispatch("f9edb3bc", new Object[]{eVar}) : eVar.d;
    }

    public static /* synthetic */ DXRootView a(e eVar, DXRootView dXRootView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXRootView) ipChange.ipc$dispatch("db73b61b", new Object[]{eVar, dXRootView});
        }
        eVar.d = dXRootView;
        return dXRootView;
    }

    public static /* synthetic */ DXRecyclerLayout a(e eVar, DXRecyclerLayout dXRecyclerLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXRecyclerLayout) ipChange.ipc$dispatch("8ebc292d", new Object[]{eVar, dXRecyclerLayout});
        }
        eVar.e = dXRecyclerLayout;
        return dXRecyclerLayout;
    }

    public static /* synthetic */ FrameLayout b(e eVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FrameLayout) ipChange.ipc$dispatch("c97e97dd", new Object[]{eVar}) : eVar.f10585a;
    }

    public e(Context context, eyx eyxVar) {
        this.b = context;
        this.c = eyxVar;
        this.f10585a = new FrameLayout(context);
        this.f10585a.setLayoutParams(new ViewGroup.MarginLayoutParams(-1, -1));
        this.f10585a.setBackgroundColor(-1);
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        Integer num = (Integer) com.taobao.android.detail.ttdetail.communication.c.b(this.b, new l());
        if (num == null || num.intValue() < 0 || this.f10585a.getPaddingTop() == num.intValue()) {
            return;
        }
        this.f10585a.setPadding(0, num.intValue(), 0, 0);
    }

    public View b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("639153eb", new Object[]{this}) : this.f10585a;
    }

    private boolean a(DXTemplateItem dXTemplateItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3a042615", new Object[]{this, dXTemplateItem})).booleanValue();
        }
        DXRootView dXRootView = this.d;
        return dXRootView != null && dXRootView.getDxTemplateItem() != null && this.d.getParent() == this.f10585a && this.d.getDxTemplateItem().b == dXTemplateItem.b;
    }

    public void a(DXTemplateItem dXTemplateItem, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b62daff", new Object[]{this, dXTemplateItem, jSONObject});
        } else if (dXTemplateItem == null) {
        } else {
            int c = c();
            if (a(dXTemplateItem)) {
                a(this.d, jSONObject, c);
            } else {
                a(dXTemplateItem, jSONObject, c);
            }
        }
    }

    public void b(DXTemplateItem dXTemplateItem, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ef9b5e", new Object[]{this, dXTemplateItem, jSONObject});
        } else if (dXTemplateItem == null) {
        } else {
            int c = c();
            if (a(dXTemplateItem)) {
                a(this.d, jSONObject, c);
            } else {
                a(dXTemplateItem, jSONObject, c);
            }
        }
    }

    public int c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5889b5d", new Object[]{this})).intValue() : this.f10585a.getHeight() - this.f10585a.getPaddingTop();
    }

    public void c(DXTemplateItem dXTemplateItem, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc7c5bbd", new Object[]{this, dXTemplateItem, jSONObject});
        } else if (dXTemplateItem == null) {
        } else {
            if (a(dXTemplateItem)) {
                a(jSONObject);
            } else {
                a(dXTemplateItem, jSONObject, c());
            }
        }
    }

    public void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
        } else if (jSONObject == null || this.e == null) {
        } else {
            JSONArray jSONArray = jSONObject.getJSONArray(hjs.UNDER_TAKE_GOODS_LIST);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("data", (Object) jSONArray);
            d.a(DXRecyclerLayout.MSG_METHOD_REFRESH_DATA, jSONObject2, this.e);
        }
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        this.d = null;
        this.e = null;
        this.f10585a.removeAllViews();
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else if (this.e == null) {
        } else {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("status", (Object) str);
            d.a(DXRecyclerLayout.MSG_METHOD_LOAD_MORE, jSONObject, this.e);
        }
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            return;
        }
        DXRecyclerLayout dXRecyclerLayout = this.e;
        if (dXRecyclerLayout == null) {
            return;
        }
        dXRecyclerLayout.a(false, i);
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
        } else {
            j();
        }
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
        } else {
            i();
        }
    }

    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
        } else {
            j();
        }
    }

    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
        } else {
            i();
        }
    }

    public void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
        } else if (this.e == null) {
        } else {
            this.c.f().a(this.d);
        }
    }

    public void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb3ff1", new Object[]{this});
        } else if (this.e == null) {
        } else {
            this.c.f().b(this.d);
        }
    }

    public void a(ViewGroup viewGroup, JSONObject jSONObject, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da7f0cfa", new Object[]{this, viewGroup, jSONObject, new Integer(i)});
        } else {
            a(viewGroup, jSONObject, gbg.b(com.taobao.android.detail.ttdetail.utils.f.a()), i);
        }
    }

    private void a(final ViewGroup viewGroup, JSONObject jSONObject, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75630549", new Object[]{this, viewGroup, jSONObject, new Integer(i), new Integer(i2)});
        } else {
            this.c.f().a(viewGroup, DXWidgetNode.DXMeasureSpec.a(i, 1073741824), DXWidgetNode.DXMeasureSpec.a(i2, 1073741824), jSONObject, new ezh.d() { // from class: com.taobao.android.detail.ttdetail.content.e.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.ezh.d
                public void a(ViewGroup viewGroup2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("9a1860a7", new Object[]{this, viewGroup2});
                    } else if (!(viewGroup2 instanceof DXRootView)) {
                    } else {
                        e.a(e.this, (DXRecyclerLayout) ((DXRootView) viewGroup2).getExpandWidgetNode().queryWidgetNodeByUserId("recyclerContentList"));
                    }
                }

                @Override // tb.ezh.d
                public void a(String str) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("f3a64c32", new Object[]{this, str});
                        return;
                    }
                    com.taobao.android.detail.ttdetail.utils.i.a("ContentViewManager", "render dxView( " + viewGroup + " ) failed, error: " + str);
                }
            });
        }
    }

    public void a(DXTemplateItem dXTemplateItem, final JSONObject jSONObject, final int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20f8f7e4", new Object[]{this, dXTemplateItem, jSONObject, new Integer(i)});
        } else if (dXTemplateItem == null || a(dXTemplateItem)) {
        } else {
            final ezi c = new ezi().a(dXTemplateItem.f()).b(String.valueOf(dXTemplateItem.g())).c(dXTemplateItem.c);
            this.c.f().a(c, this.f10585a, new ezh.b() { // from class: com.taobao.android.detail.ttdetail.content.e.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.ezh.b
                public void a(ViewGroup viewGroup) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("9a1860a7", new Object[]{this, viewGroup});
                    } else if (!(viewGroup instanceof DXRootView)) {
                    } else {
                        e.a(e.this, (DXRootView) viewGroup);
                        ViewParent parent = e.a(e.this).getParent();
                        if (parent != e.b(e.this)) {
                            if (parent instanceof ViewGroup) {
                                ((ViewGroup) parent).removeView(e.a(e.this));
                            }
                            e.b(e.this).removeAllViews();
                            e.b(e.this).addView(e.a(e.this));
                        }
                        e eVar = e.this;
                        eVar.a(e.a(eVar), jSONObject, i);
                    }
                }

                @Override // tb.ezh.b
                public void a(String str) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("f3a64c32", new Object[]{this, str});
                        return;
                    }
                    com.taobao.android.detail.ttdetail.utils.i.a("ContentViewManager", "create dx( name:" + c.a() + " version:" + c.b() + " url:" + c.c() + " ) failed, error: " + str);
                }
            });
        }
    }
}
