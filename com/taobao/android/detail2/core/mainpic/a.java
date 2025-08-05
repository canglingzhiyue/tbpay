package com.taobao.android.detail2.core.mainpic;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail2.core.mainpic.MainPicHorizontalRecyclerView;
import com.taobao.android.detail2.core.mainpic.b;
import com.taobao.ptr.PullBase;
import com.taobao.taobao.R;
import tb.esr;
import tb.fjt;
import tb.fln;
import tb.kge;
import tb.ojz;
import tb.okb;
import tb.okd;
import tb.onl;
import tb.ova;
import tb.ovb;
import tb.pig;
import tb.qnk;
import tb.rbv;

/* loaded from: classes5.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ACTIVE_SCROLL = "MainPicScroll";
    public static final String ACTIVE_SUPPLEMENT = "MainPicSupplement";
    public static final String DIS_ACTIVE_SCROLL = "MainPicScroll";
    public static final String WILL_ACTIVE_CONTAINER = "MainPicContainer";
    public static final String WILL_ACTIVE_SCROLL = "MainPicScroll";
    public static final String WILL_DIS_ACTIVE_CONTAINER = "MainPicContainer";
    public static final String WILL_DIS_ACTIVE_SCROLL = "MainPicScroll";

    /* renamed from: a  reason: collision with root package name */
    private MainPicHorizontalRecyclerView f11654a;
    private c b;
    private b.a c;
    private Context d;
    private PullBase f;
    private TextView g;
    private okb h;
    private d l;
    private boolean e = true;
    private pig.a i = new pig.a() { // from class: com.taobao.android.detail2.core.mainpic.a.2
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.pig.a
        public void a(ojz.b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("27d13ebb", new Object[]{this, bVar});
            } else if (bVar == null || a.b(a.this) == null) {
            } else {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("position", (Object) String.valueOf(bVar.f32131a));
                jSONObject.put("clickArea", (Object) bVar.b);
                a.b(a.this).a("onMainPicClick", jSONObject);
            }
        }

        @Override // tb.pig.a
        public void b(ojz.b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("81aca8fc", new Object[]{this, bVar});
            } else if (bVar == null || a.b(a.this) == null) {
            } else {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("position", (Object) String.valueOf(bVar.f32131a));
                jSONObject.put("clickArea", (Object) bVar.b);
                a.b(a.this).a("onMainPicLongClick", jSONObject);
            }
        }

        @Override // tb.pig.a
        public void c(ojz.b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("db88133d", new Object[]{this, bVar});
            } else if (bVar == null || a.b(a.this) == null) {
            } else {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("position", (Object) String.valueOf(bVar.f32131a));
                jSONObject.put("clickArea", (Object) bVar.b);
                jSONObject.put("coordinateX", (Object) bVar.c);
                jSONObject.put("coordinateY", (Object) bVar.d);
                a.b(a.this).a("onMainPicDoubleClick", jSONObject);
            }
        }

        @Override // tb.pig.a
        public void d(ojz.b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("35637d7e", new Object[]{this, bVar});
            } else if (bVar == null || a.b(a.this) == null) {
            } else {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("position", (Object) String.valueOf(bVar.f32131a));
                jSONObject.put("clickArea", (Object) bVar.b);
                jSONObject.put("status", (Object) bVar.e);
                a.b(a.this).a("onMainPicScaleGesture", jSONObject);
            }
        }
    };
    private MainPicHorizontalRecyclerView.b j = new MainPicHorizontalRecyclerView.b() { // from class: com.taobao.android.detail2.core.mainpic.a.3
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.taobao.android.detail2.core.mainpic.MainPicHorizontalRecyclerView.b
        public void a(MotionEvent motionEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5f37b47d", new Object[]{this, motionEvent});
            } else if (a.b(a.this).b().k() != null && a.b(a.this).b().k().b()) {
            } else {
                if (motionEvent != null && motionEvent.getActionMasked() == 3) {
                    return;
                }
                a.this.a();
            }
        }
    };
    private MainPicHorizontalRecyclerView.a k = new MainPicHorizontalRecyclerView.a() { // from class: com.taobao.android.detail2.core.mainpic.a.4
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.taobao.android.detail2.core.mainpic.MainPicHorizontalRecyclerView.a
        public void a(int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c1152c8", new Object[]{this, new Integer(i), new Integer(i2)});
                return;
            }
            pig a2 = a.this.a(i);
            pig a3 = a.this.a(i2);
            if (a.b(a.this) != null) {
                JSONObject jSONObject = new JSONObject();
                if (a2 != null) {
                    jSONObject.put("fromPosition", (Object) Integer.valueOf(a2.a()));
                }
                if (a3 != null) {
                    jSONObject.put("targetPosition", (Object) Integer.valueOf(a3.a()));
                }
                jSONObject.put("isAuto", (Object) Boolean.valueOf(a.c(a.this)));
                a.b(a.this).a("onMainPicFrameChange", jSONObject);
            }
            if (a2 != null) {
                a2.b("MainPicScroll");
            }
            if (a3 != null) {
                a3.a("MainPicScroll");
            }
            if (i2 < a.d(a.this).a() || a3 == null) {
                return;
            }
            a.e(a.this).scrollToPosition(a3.a());
            fjt.a(fjt.TAG_MAIN_PIC, "无限滚动超过真实数据大小调整 scrollTo: " + a3.a());
        }

        @Override // com.taobao.android.detail2.core.mainpic.MainPicHorizontalRecyclerView.a
        public void b(int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("90f78e09", new Object[]{this, new Integer(i), new Integer(i2)});
                return;
            }
            pig a2 = a.this.a(i2);
            if (a2 != null) {
                a2.a("MainPicScroll");
            }
            if (i2 < a.d(a.this).a() || a2 == null) {
                return;
            }
            a.e(a.this).scrollToPosition(a2.a());
            fjt.a(fjt.TAG_MAIN_PIC, "无限滚动超过真实数据大小调整 scrollTo: " + a2.a());
        }
    };

    static {
        kge.a(-310334051);
    }

    public static /* synthetic */ TextView a(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TextView) ipChange.ipc$dispatch("7dc4cb19", new Object[]{aVar}) : aVar.g;
    }

    public static /* synthetic */ b.a b(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b.a) ipChange.ipc$dispatch("2077e683", new Object[]{aVar}) : aVar.c;
    }

    public static /* synthetic */ boolean c(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("8562c567", new Object[]{aVar})).booleanValue() : aVar.e;
    }

    public static /* synthetic */ c d(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("78709f3d", new Object[]{aVar}) : aVar.b;
    }

    public static /* synthetic */ MainPicHorizontalRecyclerView e(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MainPicHorizontalRecyclerView) ipChange.ipc$dispatch("7708bb66", new Object[]{aVar}) : aVar.f11654a;
    }

    public a(View view, b.a aVar) {
        this.d = view.getContext();
        this.h = new okb(this.d);
        this.f11654a = (MainPicHorizontalRecyclerView) view.findViewById(R.id.mainpic_layout);
        this.f11654a.addOnPageChangedListener(this.k);
        this.c = aVar;
        this.f11654a.addOnScrollStatusListener(this.j);
        this.f11654a.setScrollSpeedPerPixel(this.h.b / this.c.b().h().K().b());
        this.f = (PullBase) view.findViewById(R.id.mainpic_feeds_pullbase);
        this.g = (TextView) view.findViewById(R.id.image_content_feeds_pull_end_text);
        this.f.addOnPullListener(new PullBase.b() { // from class: com.taobao.android.detail2.core.mainpic.a.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.ptr.PullBase.b
            public void c(PullBase pullBase, PullBase.Mode mode, float f, int i) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("54adac42", new Object[]{this, pullBase, mode, new Float(f), new Integer(i)});
                }
            }

            @Override // com.taobao.ptr.PullBase.b
            public void b(PullBase pullBase, PullBase.Mode mode, float f, int i) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("c06f3ca3", new Object[]{this, pullBase, mode, new Float(f), new Integer(i)});
                } else if (a.this.i().d) {
                    if (i < a.this.i().e) {
                        a.a(a.this).setText(a.this.i().f);
                    } else {
                        a.a(a.this).setText(a.this.i().g);
                    }
                } else {
                    a.a(a.this).setText("");
                }
            }

            @Override // com.taobao.ptr.PullBase.b
            public void a(PullBase pullBase, PullBase.Mode mode, float f, int i) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("2c30cd04", new Object[]{this, pullBase, mode, new Float(f), new Integer(i)});
                } else if (i < a.this.i().e || a.b(a.this) == null) {
                } else {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("direction", (Object) "right");
                    a.b(a.this).a("onMainPicScrollToEnd", jSONObject);
                }
            }
        });
    }

    public void a() {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (!this.e) {
        } else {
            this.e = false;
            JSONObject jSONObject = new JSONObject();
            pig d = d();
            if (d != null) {
                i = d.a();
            }
            jSONObject.put("position", (Object) String.valueOf(i));
            this.c.a("onMainPicInteractive", jSONObject);
        }
    }

    public void a(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f37b47d", new Object[]{this, motionEvent});
        } else if (this.c.b().k() != null && this.c.b().k().b()) {
        } else {
            if (motionEvent != null && motionEvent.getActionMasked() == 3) {
                return;
            }
            a();
        }
    }

    public void a(JSONObject jSONObject) {
        JSONObject jSONObject2;
        pig a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
        } else if (jSONObject == null || (jSONObject2 = jSONObject.getJSONObject("extra")) == null) {
        } else {
            String string = jSONObject2.getString("position");
            if (TextUtils.isEmpty(string) || (a2 = a(Integer.parseInt(string))) == null) {
                return;
            }
            a2.a(jSONObject);
        }
    }

    public void c() {
        pig d;
        c cVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else if (!this.e || (d = d()) == null || (cVar = this.b) == null || cVar.a() <= 0) {
        } else {
            this.c.b();
            this.f11654a.smoothScrollToPosition(d.getPosition() + 1);
        }
    }

    public pig a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (pig) ipChange.ipc$dispatch("e6660ebd", new Object[]{this, new Integer(i)});
        }
        RecyclerView.ViewHolder holder = this.f11654a.getHolder(i);
        if (!(holder instanceof pig)) {
            return null;
        }
        return (pig) holder;
    }

    public void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
            return;
        }
        MainPicHorizontalRecyclerView mainPicHorizontalRecyclerView = this.f11654a;
        if (mainPicHorizontalRecyclerView != null) {
            mainPicHorizontalRecyclerView.setVisibility(i);
        }
        PullBase pullBase = this.f;
        if (pullBase == null) {
            return;
        }
        pullBase.setVisibility(i);
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        c cVar = this.b;
        if (cVar == null) {
            return;
        }
        cVar.e();
    }

    public boolean a(onl onlVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f83f0d4f", new Object[]{this, onlVar})).booleanValue();
        }
        if (onlVar == null || onlVar.f32210a == null) {
            b();
            return false;
        }
        this.h = onlVar.c;
        b(onlVar);
        c cVar = this.b;
        if (cVar == null) {
            this.b = new c(this, this.c, this.i);
            this.l = new d(this.c.b(), this.c.c());
            this.f11654a.setMainPicScrollDeviceHelper(this.l);
            this.b.a(onlVar.f32210a, onlVar.d);
            this.f11654a.setAdapter(this.b);
        } else {
            int b = cVar.b(onlVar.f32210a, onlVar.d);
            int a2 = this.b.a(onlVar.f32210a, onlVar.d);
            if (a2 > b) {
                this.b.notifyItemRangeChanged(0, b, onlVar);
                this.b.notifyItemRangeRemoved(b, a2 - b);
            } else if (a2 < b) {
                this.b.notifyItemRangeChanged(0, a2, onlVar);
                this.b.notifyItemRangeInserted(a2, b - a2);
            } else {
                this.b.notifyItemRangeChanged(0, b, onlVar);
            }
        }
        return true;
    }

    private void b(onl onlVar) {
        ova ovaVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e6c213cc", new Object[]{this, onlVar});
        } else if (onlVar.f32210a.size() <= 1 || (ovaVar = onlVar.f32210a.get(1)) == null) {
        } else {
            if (qnk.f.equals(ovaVar.a()) && (ovaVar instanceof okd)) {
                String a2 = fln.a(this.d, ((okd) ovaVar).f32136a);
                if (TextUtils.isEmpty(a2)) {
                    return;
                }
                com.taobao.phenix.intf.b.h().a(a2).addLoaderExtra(esr.BUNDLE_BIZ_CODE, fln.PHENIX_PLAVEHOLDER_PIC_BIZ_CODE).fetch();
                if (this.h.h) {
                    com.taobao.phenix.intf.b.h().a(a2).bitmapProcessors(true, new com.taobao.phenix.compat.effects.b(this.d, this.c.b().n().p(), 2)).fetch();
                }
                fjt.a(fjt.TAG_RENDER, "发起第二张图片预加载: " + a2);
            } else if (!(ovaVar instanceof ovb)) {
            } else {
                ovb ovbVar = (ovb) ovaVar;
                if (ovbVar.b() == null || ovbVar.b().data == null) {
                    return;
                }
                String a3 = fln.a(this.d, ovbVar.b().data.videoThumbnailURL);
                if (TextUtils.isEmpty(a3)) {
                    return;
                }
                com.taobao.phenix.intf.b.h().a(a3).addLoaderExtra(esr.BUNDLE_BIZ_CODE, fln.PHENIX_PLAVEHOLDER_PIC_BIZ_CODE).fetch();
                if (this.h.h) {
                    com.taobao.phenix.intf.b.h().a(a3).bitmapProcessors(true, new com.taobao.phenix.compat.effects.b(this.d, this.c.b().n().p(), 2)).fetch();
                }
                fjt.a(fjt.TAG_RENDER, "发起视频第二张图片预加载: " + a3);
            }
        }
    }

    public pig d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (pig) ipChange.ipc$dispatch("261e156d", new Object[]{this});
        }
        RecyclerView.ViewHolder holder = this.f11654a.getHolder(this.f11654a.getCurrentDisplayPosition());
        if (!(holder instanceof pig)) {
            return null;
        }
        return (pig) holder;
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        this.e = true;
        pig d = d();
        if (d == null) {
            return;
        }
        d.a(str);
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
        } else {
            this.f11654a.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.taobao.android.detail2.core.mainpic.a.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public void onGlobalLayout() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("df7e7eb3", new Object[]{this});
                        return;
                    }
                    a.e(a.this).getViewTreeObserver().removeOnGlobalLayoutListener(this);
                    pig d = a.this.d();
                    if (d == null) {
                        return;
                    }
                    d.a(a.ACTIVE_SUPPLEMENT);
                }
            });
        }
    }

    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
            return;
        }
        pig d = d();
        if (d != null) {
            d.b(str);
        }
        this.f11654a.scrollToPosition(0);
        this.f11654a.clearHolders();
        this.e = false;
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        pig d = d();
        if (d == null) {
            return;
        }
        d.c("MainPicContainer");
    }

    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        pig d = d();
        if (d == null) {
            return;
        }
        d.d("MainPicContainer");
    }

    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
            return;
        }
        c cVar = this.b;
        if (cVar != null) {
            cVar.c();
        }
        this.e = false;
    }

    public okb i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (okb) ipChange.ipc$dispatch("4c95e2d0", new Object[]{this}) : this.h;
    }

    public void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb3ff1", new Object[]{this});
            return;
        }
        for (RecyclerView.ViewHolder viewHolder : this.f11654a.getAllHolders().values()) {
            if (viewHolder instanceof rbv) {
                ((rbv) viewHolder).b();
            }
        }
    }
}
