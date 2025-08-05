package com.taobao.android.detail.mainpic;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.alibaba.android.ultron.vfw.instance.UltronInstanceConfig;
import com.alibaba.android.ultron.vfw.instance.d;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.AliUrlImageView;
import com.taobao.android.detail.mainpic.holder.i;
import com.taobao.android.detail.mainpic.holder.j;
import com.taobao.android.detail.mainpic.holder.k;
import com.taobao.android.detail.mainpic.holder.l;
import com.taobao.android.detail.mainpic.holder.m;
import com.taobao.android.detail.mainpic.holder.o;
import com.taobao.android.detail.mainpic.widget.DetailMainViewPager;
import com.taobao.android.detail.ttdetail.handler.bizhandlers.ae;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.android.ultron.common.utils.UnifyLog;
import com.taobao.android.ultron.datamodel.imp.DMEvent;
import com.taobao.ptr.PullBase;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MtopResponse;
import tb.bnv;
import tb.bny;
import tb.boq;
import tb.etw;
import tb.etx;
import tb.eui;
import tb.euj;
import tb.eul;
import tb.eum;
import tb.euo;
import tb.euq;
import tb.eur;
import tb.euu;
import tb.euv;
import tb.euw;
import tb.eux;

/* loaded from: classes4.dex */
public class f {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public g f10146a;
    public Context b;
    public View c;
    public FrameLayout d;
    public DetailMainViewPager e;
    public LinearLayout f;
    public com.alibaba.android.ultron.vfw.instance.d g;
    public List<IDMComponent> i;
    public IDMComponent j;
    public IDMComponent k;
    public TextView l;
    public LinearLayout m;
    public TextView p;
    public PullBase q;
    private List<etw> v;
    public Map<Integer, com.alibaba.android.ultron.vfw.viewholder.h> h = new HashMap();
    public int n = -1;
    public int o = 0;
    public List<a> r = new ArrayList();
    public List<b> s = new ArrayList();
    public DetailMainViewPager.a t = new DetailMainViewPager.a() { // from class: com.taobao.android.detail.mainpic.f.5
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.taobao.android.detail.mainpic.widget.DetailMainViewPager.a
        public void a(int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c1152c8", new Object[]{this, new Integer(i), new Integer(i2)});
                return;
            }
            f.a(f.this, i, i2);
            f.a(f.this, i);
        }
    };
    public d.c u = new d.c() { // from class: com.taobao.android.detail.mainpic.f.8
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.alibaba.android.ultron.vfw.instance.d.c
        public void a(List<IDMComponent> list, bnv bnvVar, com.taobao.android.ultron.datamodel.imp.b bVar) {
            LinearLayout linearLayout;
            int paddingLeft;
            int paddingTop;
            int paddingRight;
            Context context;
            float f;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("57c33db", new Object[]{this, list, bnvVar, bVar});
                return;
            }
            IDMComponent f2 = bVar.f();
            euw.a(f2, f.this.f10146a);
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            int i = 0;
            int i2 = -1;
            for (IDMComponent iDMComponent : f2.getChildren()) {
                if (iDMComponent != null) {
                    if (TextUtils.isEmpty(iDMComponent.getPosition())) {
                        arrayList.add(iDMComponent);
                    }
                    if (f.this.f10146a.o().c() && TextUtils.equals("bottom", iDMComponent.getPosition())) {
                        arrayList2.add(iDMComponent);
                        try {
                            JSONObject fields = iDMComponent.getFields();
                            if (fields != null) {
                                i2 = fields.getInteger(com.taobao.android.detail.mainpic.holder.g.f).intValue();
                            }
                        } catch (Exception e) {
                            UnifyLog.d("MainPicViewManager", "bottomPaddingParseError: " + Log.getStackTraceString(e));
                            euw.b(f.this.f10146a, "bottomPaddingParseError", Log.getStackTraceString(e));
                            e.printStackTrace();
                        }
                        i = (int) f.this.b.getResources().getDimension(R.dimen.main_pic_bottombar_height);
                    }
                }
            }
            f.this.i = arrayList;
            bnvVar.b(arrayList);
            if (f.this.f10146a.o().c()) {
                if (arrayList2.size() > 0) {
                    bnvVar.e(arrayList2);
                } else {
                    bnvVar.b();
                }
            }
            int a2 = euu.a(bVar.f(), f.this.f10146a);
            if (a2 < 0) {
                return;
            }
            if (f.this.f10146a.o().c()) {
                f.this.e.getLayoutParams().height = a2;
                f.this.f.getLayoutParams().height = i;
                f.this.c.getLayoutParams().width = -1;
                f.this.c.getLayoutParams().height = a2 + i;
                UnifyLog.d("MainPicViewManager", "主图整体高度: " + f.this.c.getLayoutParams().height);
            } else {
                f.this.c.getLayoutParams().width = -1;
                f.this.c.getLayoutParams().height = a2;
                UnifyLog.d("MainPicViewManager", "主图整体高度: " + f.this.c.getLayoutParams().height);
            }
            f.this.e.getLayoutParams().height = a2;
            if (i <= 0) {
                linearLayout = f.this.m;
                paddingLeft = f.this.m.getPaddingLeft();
                paddingTop = f.this.m.getPaddingTop();
                paddingRight = f.this.m.getPaddingRight();
                context = f.this.b;
                f = 9.5f;
            } else if (i2 < 0) {
                linearLayout = f.this.m;
                paddingLeft = f.this.m.getPaddingLeft();
                paddingTop = f.this.m.getPaddingTop();
                paddingRight = f.this.m.getPaddingRight();
                context = f.this.b;
                f = 6.5f;
            } else {
                linearLayout = f.this.m;
                paddingLeft = f.this.m.getPaddingLeft();
                paddingTop = f.this.m.getPaddingTop();
                paddingRight = f.this.m.getPaddingRight();
                context = f.this.b;
                f = i2;
            }
            linearLayout.setPadding(paddingLeft, paddingTop, paddingRight, eur.a(context, f));
            f.this.c.requestLayout();
            f.this.c.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.taobao.android.detail.mainpic.f.8.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public void onGlobalLayout() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("df7e7eb3", new Object[]{this});
                        return;
                    }
                    f.a(f.this);
                    f.this.c.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                    if (f.this.n < 0) {
                        f.c(f.this, f.this.o);
                    } else {
                        f.c(f.this, f.this.i.indexOf(f.this.j));
                    }
                }
            });
        }
    };
    private etx w = new etx() { // from class: com.taobao.android.detail.mainpic.f.3
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.etx
        public void b(IDMComponent iDMComponent, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("94e6e227", new Object[]{this, iDMComponent, obj});
            }
        }

        @Override // tb.etx
        public void a(IDMComponent iDMComponent, Object obj) {
            List<com.taobao.android.ultron.common.model.b> list;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("52cfb4c8", new Object[]{this, iDMComponent, obj});
            } else if (!euv.a(f.this.f10146a) && iDMComponent.getEventMap() != null && (list = iDMComponent.getEventMap().get("itemClick")) != null) {
                for (com.taobao.android.ultron.common.model.b bVar : list) {
                    if (bVar != null) {
                        com.alibaba.android.ultron.event.base.e a2 = f.this.g.d().a().a(bVar.getType());
                        a2.a(bVar);
                        a2.a(iDMComponent);
                        f.this.g.d().a(a2);
                    }
                }
            }
        }
    };

    /* loaded from: classes4.dex */
    public interface a {
        void a(int i, int i2, IDMComponent iDMComponent);
    }

    /* loaded from: classes4.dex */
    public interface b {
        void a();
    }

    public static /* synthetic */ void a(f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("200db71c", new Object[]{fVar});
        } else {
            fVar.m();
        }
    }

    public static /* synthetic */ void a(f fVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1a99f67", new Object[]{fVar, new Integer(i)});
        } else {
            fVar.a(i);
        }
    }

    public static /* synthetic */ void a(f fVar, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("538ac07c", new Object[]{fVar, new Integer(i), new Integer(i2)});
        } else {
            fVar.a(i, i2);
        }
    }

    public static /* synthetic */ com.alibaba.android.ultron.vfw.viewholder.h b(f fVar, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.alibaba.android.ultron.vfw.viewholder.h) ipChange.ipc$dispatch("fbdb9b4d", new Object[]{fVar, new Integer(i)}) : fVar.c(i);
    }

    public static /* synthetic */ void c(f fVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac2c7ce9", new Object[]{fVar, new Integer(i)});
        } else {
            fVar.b(i);
        }
    }

    public f(g gVar) {
        this.f10146a = gVar;
        this.b = gVar.e();
    }

    public void a(etw etwVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e7882430", new Object[]{this, etwVar});
        } else if (etwVar == null) {
        } else {
            if (this.v == null) {
                this.v = new ArrayList();
            }
            if (this.v.contains(etwVar)) {
                return;
            }
            this.v.add(etwVar);
        }
    }

    public void a(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a1860a7", new Object[]{this, viewGroup});
            return;
        }
        this.c = LayoutInflater.from(this.b).inflate(R.layout.main_pic_instance_layout, viewGroup, false);
        this.d = (FrameLayout) this.c.findViewById(R.id.mainpic_float_layout);
        this.q = (PullBase) this.c.findViewById(R.id.mainpic_viewpager_pullbase);
        euo.a(this.f10146a, this.q);
        this.q.addOnPullListener(new PullBase.b() { // from class: com.taobao.android.detail.mainpic.f.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.ptr.PullBase.b
            public void b(PullBase pullBase, PullBase.Mode mode, float f, int i) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("c06f3ca3", new Object[]{this, pullBase, mode, new Float(f), new Integer(i)});
                }
            }

            @Override // com.taobao.ptr.PullBase.b
            public void c(PullBase pullBase, PullBase.Mode mode, float f, int i) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("54adac42", new Object[]{this, pullBase, mode, new Float(f), new Integer(i)});
                }
            }

            @Override // com.taobao.ptr.PullBase.b
            public void a(PullBase pullBase, PullBase.Mode mode, float f, int i) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("2c30cd04", new Object[]{this, pullBase, mode, new Float(f), new Integer(i)});
                } else if (f <= 0.2f || f.this.f10146a.h() == null) {
                } else {
                    JSONObject o = f.this.f10146a.o().o();
                    if (o != null) {
                        f.this.b(o);
                        return;
                    }
                    f.this.f10146a.h().a(pullBase, f);
                    HashMap hashMap = new HashMap();
                    hashMap.put("item_id", f.this.f10146a.o().d());
                    hashMap.put("seller_id", f.this.f10146a.o().h());
                    hashMap.put("user_id", f.this.f10146a.o().k());
                    eux.a(hashMap, false);
                }
            }
        });
        this.p = (TextView) this.q.findViewById(R.id.main_pic_scroll_limit_tip_text);
        String f = this.f10146a.k().f();
        if (!TextUtils.isEmpty(f)) {
            this.p.setText(f);
        }
        this.l = (TextView) this.c.findViewById(R.id.mainpic_text_indicator);
        this.m = (LinearLayout) this.c.findViewById(R.id.mainpic_indicator_container);
        this.e = (DetailMainViewPager) this.c.findViewById(R.id.mainpic_view_pager);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this.b) { // from class: com.taobao.android.detail.mainpic.f.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.support.v7.widget.LinearLayoutManager, android.support.v7.widget.RecyclerView.LayoutManager
            public boolean supportsPredictiveItemAnimations() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("c4fda0d0", new Object[]{this})).booleanValue();
                }
                return false;
            }
        };
        linearLayoutManager.setOrientation(0);
        this.e.setLayoutManager(linearLayoutManager);
        this.e.addOnPageChangedListener(this.t);
        this.f = (LinearLayout) this.c.findViewById(R.id.mainpic_bottom_view);
        UltronInstanceConfig ultronInstanceConfig = new UltronInstanceConfig();
        ultronInstanceConfig.c(true);
        ultronInstanceConfig.a("detail_main_pic");
        ultronInstanceConfig.a(true);
        ultronInstanceConfig.c(true);
        ultronInstanceConfig.d(true);
        this.g = com.alibaba.android.ultron.vfw.instance.d.a(ultronInstanceConfig, this.b);
        this.g.a((LinearLayout) null, this.e, this.f);
        this.g.a(com.taobao.android.detail.mainpic.holder.h.f, com.taobao.android.detail.mainpic.holder.h.b(this.w, this.f10146a));
        if (euo.b()) {
            this.g.a(j.e, i.a(this.w, this.f10146a));
        } else {
            this.g.a(j.e, j.b(this.w, this.f10146a));
        }
        this.g.a(m.f, m.b(this.w, this.f10146a));
        this.g.a(com.taobao.android.detail.mainpic.holder.g.e, com.taobao.android.detail.mainpic.holder.g.a(this.f10146a));
        this.g.a(k.e, k.a(this.f10146a));
        this.g.a(l.e, l.a(this.f10146a));
        this.g.d().a("openLightOff", new euj(this));
        this.g.d().a("locate", new eui(this));
        this.g.d().a(ae.EVENT_TYPE, new eum(this));
        this.g.d().a(this.f10146a.k().e());
        this.g.d().a(this.f10146a.p());
        o.a aVar = new o.a(this.f10146a);
        this.g.a("h5", aVar);
        this.g.a("weex", aVar);
        this.g.a(new eul(this.f10146a));
    }

    public String a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("15c87a18", new Object[]{this, jSONObject});
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("mainPic");
        return jSONObject2 == null ? "" : jSONObject2.getString("text");
    }

    public void b(JSONObject jSONObject) {
        JSONArray jSONArray;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63b99827", new Object[]{this, jSONObject});
            return;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("mainPic");
        if (jSONObject2 == null || (jSONArray = jSONObject2.getJSONArray("action")) == null) {
            return;
        }
        for (int i = 0; i < jSONArray.size(); i++) {
            JSONObject jSONObject3 = jSONArray.getJSONObject(i);
            if (jSONObject3 != null) {
                com.alibaba.android.ultron.event.base.e a2 = this.f10146a.n().d().a().a(jSONObject3.getString("type"));
                a2.a(new DMEvent(jSONObject3.getString("type"), jSONObject3.getJSONObject("fields"), new ArrayList()));
                a2.a((IDMComponent) null);
                this.f10146a.n().d().a(a2);
            }
        }
    }

    public void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5251583f", new Object[]{this, aVar});
        } else {
            this.r.add(aVar);
        }
    }

    public void a(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5251cc9e", new Object[]{this, bVar});
        } else {
            this.s.add(bVar);
        }
    }

    private void k() {
        com.alibaba.android.ultron.vfw.viewholder.b b2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f95772", new Object[]{this});
            return;
        }
        com.alibaba.android.ultron.vfw.viewholder.h c = c(this.n);
        if (c == null || (b2 = c.b()) == null) {
            return;
        }
        b2.c();
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        k();
        this.h.clear();
    }

    private void a(final int i, final int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c1152c8", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        this.c.post(new Runnable() { // from class: com.taobao.android.detail.mainpic.f.6
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                com.alibaba.android.ultron.vfw.viewholder.b b2;
                com.alibaba.android.ultron.vfw.viewholder.b b3;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                com.alibaba.android.ultron.vfw.viewholder.h b4 = f.b(f.this, i);
                if (b4 != null && (b3 = b4.b()) != null) {
                    b3.c();
                }
                com.alibaba.android.ultron.vfw.viewholder.h b5 = f.b(f.this, i2);
                if (b5 == null || (b2 = b5.b()) == null) {
                    return;
                }
                b2.b();
            }
        });
        if (i2 >= 0 && i2 < this.i.size()) {
            this.n = i2;
        } else {
            this.n = 0;
        }
        if (this.n >= this.i.size()) {
            return;
        }
        this.j = this.i.get(this.n);
        d(this.n);
        for (a aVar : this.r) {
            int i3 = this.n;
            aVar.a(i, i3, this.i.get(i3));
        }
    }

    private void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else if (i < 0 || i >= this.i.size()) {
        } else {
            HashMap hashMap = new HashMap();
            IDMComponent iDMComponent = this.i.get(i);
            IDMComponent b2 = euq.b(iDMComponent);
            if (b2 != null) {
                hashMap.put("type", "video");
                hashMap.put(com.taobao.android.fluid.business.usertrack.track.b.PROPERTY_VIDEO_ID, b2.getFields().getString("url"));
            } else {
                IDMComponent c = euq.c(iDMComponent);
                if (c == null) {
                    UnifyLog.d("MainPicViewManager", "currMediaComp is null");
                    return;
                } else {
                    hashMap.put("type", "pic");
                    hashMap.put("image_id", c.getFields().getString("url"));
                }
            }
            hashMap.put("item_id", this.f10146a.o().d());
            hashMap.put("seller_id", this.f10146a.o().h());
            hashMap.put("user_id", this.f10146a.o().k());
            hashMap.put("index", String.valueOf(i));
            eux.a(hashMap);
        }
    }

    public void c(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c50c34c6", new Object[]{this, jSONObject});
            return;
        }
        this.g.a(new boq() { // from class: com.taobao.android.detail.mainpic.f.7
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.boq
            public boolean a(bny bnyVar, List<IDMComponent> list, IDMComponent iDMComponent) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("7035fbdc", new Object[]{this, bnyVar, list, iDMComponent})).booleanValue();
                }
                if (list == null || list.size() == 0) {
                    return false;
                }
                f.this.g.a(f.this.u);
                bnyVar.l().b(bnyVar.d().f());
                bnyVar.l().notifyDataSetChanged();
                return true;
            }

            @Override // tb.boq
            public boolean b(bny bnyVar, List<IDMComponent> list) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("9ef4f181", new Object[]{this, bnyVar, list})).booleanValue();
                }
                if (list == null || list.size() == 0) {
                    return false;
                }
                f.this.g.a(f.this.u);
                return true;
            }

            @Override // tb.boq
            public boolean a(bny bnyVar, List<IDMComponent> list) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("75a50d00", new Object[]{this, bnyVar, list})).booleanValue();
                }
                if (list == null || list.size() == 0) {
                    return false;
                }
                bnyVar.a(list);
                return true;
            }
        });
        this.g.a(jSONObject, this.u);
        l();
        JSONObject o = this.f10146a.o().o();
        if (o == null) {
            return;
        }
        this.p.setText(a(o));
    }

    private void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6076ef3", new Object[]{this});
            return;
        }
        List<etw> list = this.v;
        if (list == null || list.isEmpty()) {
            return;
        }
        for (etw etwVar : this.v) {
            etwVar.a(this.e);
        }
    }

    private void m() {
        com.alibaba.android.ultron.vfw.viewholder.b n;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6158674", new Object[]{this});
        } else if (!com.taobao.android.detail.mainpic.a11y.a.b(this.b) || (n = n()) == null) {
        } else {
            if (n instanceof j) {
                a(n);
            } else if (!(n instanceof m)) {
            } else {
                b(n);
            }
        }
    }

    private void a(com.alibaba.android.ultron.vfw.viewholder.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("13a8193", new Object[]{this, bVar});
        } else if (!com.taobao.android.detail.mainpic.a11y.a.a()) {
        } else {
            AliUrlImageView e = ((j) bVar).e();
            a(e);
            c(e);
        }
    }

    private void b(com.alibaba.android.ultron.vfw.viewholder.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2e427b2", new Object[]{this, bVar});
        } else if (!com.taobao.android.detail.mainpic.a11y.a.b()) {
        } else {
            View e = ((m) bVar).e();
            b(e);
            d(e);
        }
    }

    private void a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9501e36a", new Object[]{this, view});
        } else if (view == null) {
        } else {
            view.setContentDescription("宝贝图片，图片识别中");
        }
    }

    private void b(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91037249", new Object[]{this, view});
        } else if (view == null) {
        } else {
            view.setContentDescription("宝贝视频，视频识别中");
        }
    }

    private void c(final View view) {
        List<IDMComponent> list;
        IDMComponent c;
        JSONObject data;
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d050128", new Object[]{this, view});
        } else if (view == null || (list = this.i) == null || list.isEmpty() || (c = euq.c(this.i.get(0))) == null || (data = c.getData()) == null || (jSONObject = data.getJSONObject("fields")) == null) {
        } else {
            final com.taobao.android.detail.mainpic.a11y.b bVar = new com.taobao.android.detail.mainpic.a11y.b();
            final String a2 = bVar.a(jSONObject.getString("url"));
            bVar.a(a2, new IRemoteBaseListener() { // from class: com.taobao.android.detail.mainpic.MainPicViewManager$7
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
                public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                    } else {
                        view.setContentDescription("宝贝图片，图片识别失败");
                    }
                }

                @Override // com.taobao.tao.remotebusiness.IRemoteListener
                public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                        return;
                    }
                    String a3 = bVar.a(mtopResponse, a2);
                    if (TextUtils.isEmpty(a3)) {
                        view.setContentDescription("宝贝图片");
                        return;
                    }
                    View view2 = view;
                    view2.setContentDescription("宝贝图片，" + a3);
                }

                @Override // com.taobao.tao.remotebusiness.IRemoteListener
                public void onError(int i, MtopResponse mtopResponse, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                    } else {
                        view.setContentDescription("宝贝图片，图片识别失败");
                    }
                }
            });
        }
    }

    private void d(final View view) {
        List<IDMComponent> list;
        IDMComponent b2;
        JSONObject data;
        JSONObject jSONObject;
        e o;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89069007", new Object[]{this, view});
        } else if (view == null || (list = this.i) == null || list.isEmpty() || (b2 = euq.b(this.i.get(0))) == null || (data = b2.getData()) == null || (jSONObject = data.getJSONObject("fields")) == null) {
        } else {
            final com.taobao.android.detail.mainpic.a11y.c cVar = new com.taobao.android.detail.mainpic.a11y.c();
            String a2 = cVar.a(jSONObject.getString("url"));
            g gVar = this.f10146a;
            cVar.a((gVar == null || (o = gVar.o()) == null) ? "" : o.d(), a2, new IRemoteBaseListener() { // from class: com.taobao.android.detail.mainpic.MainPicViewManager$8
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
                public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                    } else {
                        view.setContentDescription("宝贝视频，视频识别失败");
                    }
                }

                @Override // com.taobao.tao.remotebusiness.IRemoteListener
                public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                        return;
                    }
                    String a3 = cVar.a(mtopResponse);
                    if (TextUtils.isEmpty(a3)) {
                        view.setContentDescription("宝贝视频");
                        return;
                    }
                    View view2 = view;
                    view2.setContentDescription("宝贝视频，" + a3);
                }

                @Override // com.taobao.tao.remotebusiness.IRemoteListener
                public void onError(int i, MtopResponse mtopResponse, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                    } else {
                        view.setContentDescription("宝贝视频，视频识别失败");
                    }
                }
            });
        }
    }

    private com.alibaba.android.ultron.vfw.viewholder.b n() {
        com.alibaba.android.ultron.vfw.viewholder.h c;
        com.alibaba.android.ultron.vfw.viewholder.b b2;
        List<com.alibaba.android.ultron.vfw.viewholder.h> e;
        com.alibaba.android.ultron.vfw.viewholder.h hVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.alibaba.android.ultron.vfw.viewholder.b) ipChange.ipc$dispatch("e6756ae0", new Object[]{this});
        }
        if (this.e.getAdapter().getItemCount() > 0 && (c = c(0)) != null && (b2 = c.b()) != null && (b2 instanceof com.taobao.android.detail.mainpic.holder.h) && (e = ((com.taobao.android.detail.mainpic.holder.h) b2).e()) != null && !e.isEmpty() && (hVar = e.get(0)) != null) {
            return hVar.b();
        }
        return null;
    }

    public View b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("639153eb", new Object[]{this}) : this.c;
    }

    public void a(final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        List<IDMComponent> list = this.i;
        if (list == null) {
            this.c.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() { // from class: com.taobao.android.detail.mainpic.f.9
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.ViewTreeObserver.OnPreDrawListener
                public boolean onPreDraw() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Boolean) ipChange2.ipc$dispatch("5acfbc33", new Object[]{this})).booleanValue();
                    }
                    f.this.c.getViewTreeObserver().removeOnPreDrawListener(this);
                    if (f.this.k != null && f.this.i != null) {
                        Iterator<IDMComponent> it = f.this.i.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            IDMComponent next = it.next();
                            if (euq.a(str, next)) {
                                f.c(f.this, f.this.i.indexOf(next));
                                break;
                            }
                        }
                    }
                    return true;
                }
            });
            return;
        }
        for (IDMComponent iDMComponent : list) {
            if (euq.a(str, iDMComponent)) {
                b(this.i.indexOf(iDMComponent));
                return;
            }
        }
    }

    public void a(IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e66567ec", new Object[]{this, iDMComponent});
            return;
        }
        this.k = iDMComponent;
        List<IDMComponent> list = this.i;
        if (list == null) {
            this.c.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() { // from class: com.taobao.android.detail.mainpic.f.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.ViewTreeObserver.OnPreDrawListener
                public boolean onPreDraw() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Boolean) ipChange2.ipc$dispatch("5acfbc33", new Object[]{this})).booleanValue();
                    }
                    f.this.c.getViewTreeObserver().removeOnPreDrawListener(this);
                    if (f.this.k != null && f.this.i != null) {
                        for (IDMComponent iDMComponent2 : f.this.i) {
                            if (euq.a(f.this.k, iDMComponent2)) {
                                f.c(f.this, f.this.i.indexOf(iDMComponent2));
                            }
                        }
                    }
                    return true;
                }
            });
            return;
        }
        for (IDMComponent iDMComponent2 : list) {
            if (euq.a(this.k, iDMComponent2)) {
                b(this.i.indexOf(iDMComponent2));
            }
        }
    }

    private void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
            return;
        }
        int i2 = this.n;
        if (i < 0 || i >= this.i.size()) {
            i = 0;
        }
        this.e.forceResetPosition(i);
        this.e.scrollToPosition(i);
        a(i2, i);
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        for (com.alibaba.android.ultron.vfw.viewholder.h hVar : this.h.values()) {
            com.alibaba.android.ultron.vfw.viewholder.b b2 = hVar.b();
            if (b2 instanceof com.taobao.android.detail.mainpic.holder.b) {
                ((com.taobao.android.detail.mainpic.holder.b) b2).H_();
            }
        }
        Iterator<b> it = this.s.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        int itemCount = this.e.getAdapter().getItemCount();
        for (int i = 0; i < itemCount; i++) {
            com.alibaba.android.ultron.vfw.viewholder.h c = c(i);
            if (c != null) {
                com.alibaba.android.ultron.vfw.viewholder.b b2 = c.b();
                if (b2 instanceof com.taobao.android.detail.mainpic.holder.b) {
                    ((com.taobao.android.detail.mainpic.holder.b) b2).I_();
                }
            }
        }
        for (b bVar : this.s) {
            bVar.a();
        }
    }

    private com.alibaba.android.ultron.vfw.viewholder.h c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.alibaba.android.ultron.vfw.viewholder.h) ipChange.ipc$dispatch("42a94c7e", new Object[]{this, new Integer(i)});
        }
        if (i < 0) {
            return null;
        }
        com.alibaba.android.ultron.vfw.viewholder.h hVar = this.h.get(Integer.valueOf(i));
        if (hVar != null) {
            return hVar;
        }
        RecyclerView.ViewHolder findViewHolderForAdapterPosition = this.e.findViewHolderForAdapterPosition(i);
        if (!(findViewHolderForAdapterPosition instanceof com.alibaba.android.ultron.vfw.viewholder.h)) {
            return hVar;
        }
        com.alibaba.android.ultron.vfw.viewholder.h hVar2 = (com.alibaba.android.ultron.vfw.viewholder.h) findViewHolderForAdapterPosition;
        this.h.put(Integer.valueOf(i), hVar2);
        return hVar2;
    }

    private void d(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad401d78", new Object[]{this, new Integer(i)});
            return;
        }
        int size = this.i.size();
        if (i > size) {
            return;
        }
        TextView textView = this.l;
        textView.setText((i + 1) + "/" + size);
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        com.alibaba.android.ultron.vfw.instance.d dVar = this.g;
        if (dVar != null) {
            dVar.m();
        }
        this.r.clear();
        this.s.clear();
        List<etw> list = this.v;
        if (list == null) {
            return;
        }
        list.clear();
    }

    public com.alibaba.android.ultron.vfw.instance.d f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.alibaba.android.ultron.vfw.instance.d) ipChange.ipc$dispatch("ed983cd2", new Object[]{this}) : this.g;
    }

    public com.taobao.android.ultron.datamodel.imp.b g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.ultron.datamodel.imp.b) ipChange.ipc$dispatch("e01f3878", new Object[]{this}) : this.g.x();
    }

    public int h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5cf10e2", new Object[]{this})).intValue() : this.n;
    }

    public IDMComponent i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IDMComponent) ipChange.ipc$dispatch("d9522c74", new Object[]{this}) : this.j;
    }

    public g j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (g) ipChange.ipc$dispatch("3ac57cc4", new Object[]{this}) : this.f10146a;
    }
}
