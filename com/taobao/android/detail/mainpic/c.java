package com.taobao.android.detail.mainpic;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import mtopsdk.common.util.StringUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.alibaba.android.aura.datamodel.render.AURARenderOutput;
import com.alibaba.android.ultron.vfw.instance.UltronInstanceConfig;
import com.alibaba.android.ultron.vfw.instance.d;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.mainpic.widget.DetailMainViewPager;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.android.ultron.common.utils.UnifyLog;
import com.taobao.android.ultron.datamodel.imp.b;
import com.taobao.avplayer.DWInstance;
import com.taobao.ptr.PullBase;
import com.taobao.taobao.R;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import tb.bau;
import tb.bnv;
import tb.dut;
import tb.epo;
import tb.etx;
import tb.euh;
import tb.euk;
import tb.eul;
import tb.eun;
import tb.euo;
import tb.euq;
import tb.euu;
import tb.euw;
import tb.eux;

/* loaded from: classes4.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public g f10129a;
    public Activity b;
    public View c;
    public FrameLayout d;
    public PullBase e;
    public FrameLayout f;
    public DetailMainViewPager g;
    public com.alibaba.android.ultron.vfw.instance.d h;
    public List<IDMComponent> i;
    public IDMComponent j;
    public TextView l;
    public IDMComponent n;
    public Dialog o;
    public b p;
    public long r;
    private final eun u;
    public Map<Integer, com.alibaba.android.ultron.vfw.viewholder.h> k = new HashMap();
    public int m = -1;
    public boolean q = false;
    public d.c s = new d.c() { // from class: com.taobao.android.detail.mainpic.c.10
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.alibaba.android.ultron.vfw.instance.d.c
        public void a(List<IDMComponent> list, bnv bnvVar, b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("57c33db", new Object[]{this, list, bnvVar, bVar});
                return;
            }
            IDMComponent iDMComponent = null;
            Iterator<IDMComponent> it = bVar.f().getChildren().iterator();
            while (true) {
                if (it.hasNext()) {
                    IDMComponent next = it.next();
                    if (next != null && "lightoff".equals(next.getPosition())) {
                        iDMComponent = next;
                        break;
                    }
                } else {
                    break;
                }
            }
            c.this.i = iDMComponent.getChildren();
            bnvVar.b(iDMComponent.getChildren());
            if (euu.a(bVar.f(), c.this.f10129a) < 0) {
            }
        }
    };
    public DetailMainViewPager.a t = new DetailMainViewPager.a() { // from class: com.taobao.android.detail.mainpic.c.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.taobao.android.detail.mainpic.widget.DetailMainViewPager.a
        public void a(int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c1152c8", new Object[]{this, new Integer(i), new Integer(i2)});
                return;
            }
            c.a(c.this, i, i2);
            c.b(c.this, i);
        }
    };
    private etx v = new etx() { // from class: com.taobao.android.detail.mainpic.c.3
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.etx
        public void a(IDMComponent iDMComponent, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("52cfb4c8", new Object[]{this, iDMComponent, obj});
            } else if ((obj instanceof DWInstance) && ((DWInstance) obj).getVideoState() == 1) {
            } else {
                c.a(c.this, iDMComponent, "itemClick");
            }
        }

        @Override // tb.etx
        public void b(IDMComponent iDMComponent, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("94e6e227", new Object[]{this, iDMComponent, obj});
            } else if ((obj instanceof DWInstance) && ((DWInstance) obj).getVideoState() == 1) {
            } else {
                c.a(c.this, iDMComponent, "itemLongClick");
            }
        }
    };

    public static /* synthetic */ TextView a(c cVar, Context context, RelativeLayout relativeLayout) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TextView) ipChange.ipc$dispatch("34a1d54b", new Object[]{cVar, context, relativeLayout}) : cVar.a(context, relativeLayout);
    }

    public static /* synthetic */ void a(c cVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e17f58e4", new Object[]{cVar, new Integer(i)});
        } else {
            cVar.b(i);
        }
    }

    public static /* synthetic */ void a(c cVar, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e6c369f", new Object[]{cVar, new Integer(i), new Integer(i2)});
        } else {
            cVar.a(i, i2);
        }
    }

    public static /* synthetic */ void a(c cVar, IDMComponent iDMComponent, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a055113f", new Object[]{cVar, iDMComponent, str});
        } else {
            cVar.a(iDMComponent, str);
        }
    }

    public static /* synthetic */ void b(c cVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6c0c7a5", new Object[]{cVar, new Integer(i)});
        } else {
            cVar.a(i);
        }
    }

    public static /* synthetic */ com.alibaba.android.ultron.vfw.viewholder.h c(c cVar, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.alibaba.android.ultron.vfw.viewholder.h) ipChange.ipc$dispatch("6bc5de8b", new Object[]{cVar, new Integer(i)}) : cVar.c(i);
    }

    public c(g gVar) {
        this.f10129a = gVar;
        this.b = (Activity) gVar.e();
        this.u = new eun(this.b);
    }

    public void a(IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e66567ec", new Object[]{this, iDMComponent});
            return;
        }
        Activity activity = this.b;
        if (activity == null || activity.isFinishing()) {
            return;
        }
        ViewGroup viewGroup = (ViewGroup) this.b.getWindow().getDecorView();
        if (this.c == null) {
            a(viewGroup);
            this.o = new Dialog(this.b, R.style.Theme_lightOffDialog);
            this.o.setContentView(this.c);
            this.o.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.taobao.android.detail.mainpic.c.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.content.DialogInterface.OnDismissListener
                public void onDismiss(DialogInterface dialogInterface) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7c9109f4", new Object[]{this, dialogInterface});
                        return;
                    }
                    int i = c.this.m;
                    if (i < 0 || i > c.this.i.size() - 1) {
                        return;
                    }
                    IDMComponent iDMComponent2 = c.this.i.get(i);
                    c.this.f10129a.b(iDMComponent2);
                    c.this.f10129a.c(iDMComponent2);
                    c.this.q = false;
                }
            });
            Window window = this.o.getWindow();
            window.setWindowAnimations(R.style.Theme_lightOffDialogAnim);
            window.setType(1000);
        }
        this.e.setMode(this.f10129a.l() ? PullBase.Mode.DISABLED : PullBase.Mode.PULL_FROM_END);
        g();
        if (this.f10129a.w() != this.r) {
            h();
        }
        try {
            this.o.show();
        } catch (Exception e) {
            euw.c(this.f10129a, "lightOffShow", Log.getStackTraceString(e));
        }
        this.j = iDMComponent;
        this.c.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.taobao.android.detail.mainpic.c.5
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("df7e7eb3", new Object[]{this});
                    return;
                }
                c.this.c.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                if (c.this.j == null) {
                    c.a(c.this, 0);
                    return;
                }
                for (IDMComponent iDMComponent2 : c.this.i) {
                    if (euq.a(c.this.j, iDMComponent2)) {
                        c.a(c.this, c.this.i.indexOf(iDMComponent2));
                        return;
                    }
                }
            }
        });
        this.q = true;
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        try {
            if (this.o == null || !this.o.isShowing() || this.b.isFinishing()) {
                return;
            }
            this.o.dismiss();
        } catch (Exception e) {
            euw.c(this.f10129a, "lightOffDismiss", Log.getStackTraceString(e));
        }
    }

    private void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
        } else if (this.f10129a.k().j()) {
        } else {
            JSONObject B = this.f10129a.B();
            if (bau.a(B)) {
                return;
            }
            this.u.a().a(new dut(eun.WORK_FLOW_RENDER, this.u.a(B), new dut.a<AURARenderOutput>() { // from class: com.taobao.android.detail.mainpic.c.6
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.dut.a
                public void onComplete() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5cbffcbf", new Object[]{this});
                    }
                }

                @Override // tb.dut.a
                public /* synthetic */ void onData(AURARenderOutput aURARenderOutput) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("ab9e6644", new Object[]{this, aURARenderOutput});
                    } else {
                        a(aURARenderOutput);
                    }
                }

                public void a(AURARenderOutput aURARenderOutput) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("37a7d3ff", new Object[]{this, aURARenderOutput});
                        return;
                    }
                    final View view = aURARenderOutput.getView();
                    if (view == null) {
                        return;
                    }
                    FrameLayout frameLayout = (FrameLayout) c.this.c.findViewById(R.id.buy_inside);
                    frameLayout.removeAllViews();
                    frameLayout.addView(view);
                    if (c.this.c instanceof RelativeLayout) {
                        c cVar = c.this;
                        cVar.l = c.a(cVar, cVar.b, (RelativeLayout) c.this.c);
                        view.post(new Runnable() { // from class: com.taobao.android.detail.mainpic.c.6.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // java.lang.Runnable
                            public void run() {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                } else if (c.this.d == null || view == null) {
                                } else {
                                    c.this.d.setPadding(0, 0, 0, view.getHeight());
                                }
                            }
                        });
                        return;
                    }
                    UnifyLog.d("LightOffViewManager", "root view is not relativeLayout");
                }

                @Override // tb.dut.a
                public void onError(String str, String str2, com.alibaba.android.aura.b bVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("82182f9c", new Object[]{this, str, str2, bVar});
                    } else {
                        UnifyLog.d("LightOffViewManager", bVar.b());
                    }
                }
            }));
        }
    }

    private TextView a(Context context, RelativeLayout relativeLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TextView) ipChange.ipc$dispatch("f3d22db4", new Object[]{this, context, relativeLayout});
        }
        LinearLayout a2 = a(context);
        relativeLayout.findViewById(R.id.lightoff_indicator_container).setVisibility(8);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(11, -1);
        layoutParams.addRule(10, -1);
        layoutParams.setMargins(0, epo.b(53), epo.b(15), 0);
        relativeLayout.addView(a2, layoutParams);
        return (TextView) a2.findViewById(R.id.light_off_indicator_inside_mode);
    }

    private LinearLayout a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LinearLayout) ipChange.ipc$dispatch("319105b7", new Object[]{this, context});
        }
        LinearLayout linearLayout = new LinearLayout(context);
        TextView textView = new TextView(context);
        textView.setBackgroundResource(R.drawable.main_pic_indicator_bar_pic_index_bg);
        textView.setPadding(epo.h, 0, epo.h, 0);
        textView.setGravity(17);
        textView.setTextColor(-1);
        textView.setTextSize(1, 12.0f);
        textView.setId(R.id.light_off_indicator_inside_mode);
        linearLayout.addView(textView, new LinearLayout.LayoutParams(epo.b(42), epo.b(25)));
        linearLayout.setGravity(17);
        return linearLayout;
    }

    private void a(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a1860a7", new Object[]{this, viewGroup});
            return;
        }
        this.c = LayoutInflater.from(this.b).inflate(R.layout.main_pic_light_off_layout, viewGroup, false);
        this.c.setBackgroundColor(-16777216);
        this.c.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.android.detail.mainpic.c.7
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                }
            }
        });
        this.l = (TextView) this.c.findViewById(R.id.lightoff_text_indicator);
        ((ImageView) this.c.findViewById(R.id.iv_close)).setOnClickListener(new View.OnClickListener() { // from class: com.taobao.android.detail.mainpic.c.8
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                } else {
                    c.this.a();
                }
            }
        });
        this.f = (FrameLayout) this.c.findViewById(R.id.mainpic_lightoff_float_layout);
        this.d = (FrameLayout) this.c.findViewById(R.id.mainpic_lightoff_main_layout);
        this.e = (PullBase) this.c.findViewById(R.id.mainpic_lightoff_viewpager_pullbase);
        euo.a(this.f10129a, this.e);
        this.e.addOnPullListener(new PullBase.b() { // from class: com.taobao.android.detail.mainpic.c.9
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
                } else if (f <= 0.2f || c.this.f10129a.h() == null || !c.this.f10129a.h().a(pullBase, f)) {
                } else {
                    HashMap hashMap = new HashMap();
                    hashMap.put("item_id", c.this.f10129a.o().d());
                    hashMap.put("seller_id", c.this.f10129a.o().h());
                    hashMap.put("user_id", c.this.f10129a.o().k());
                    eux.a(hashMap, true);
                    pullBase.post(new Runnable() { // from class: com.taobao.android.detail.mainpic.c.9.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                            } else {
                                c.this.a();
                            }
                        }
                    });
                }
            }
        });
        TextView textView = (TextView) this.e.findViewById(R.id.main_pic_scroll_limit_tip_text);
        String f = this.f10129a.k().f();
        if (!StringUtils.isEmpty(f)) {
            textView.setText(f);
        }
        ((ImageView) this.c.findViewById(R.id.main_pic_scroll_limit_tip_image)).setImageResource(R.drawable.main_pic_scroll_limit_arrow);
        ((TextView) this.c.findViewById(R.id.main_pic_scroll_limit_tip_text)).setTextColor(-1);
        this.g = (DetailMainViewPager) this.c.findViewById(R.id.mainpic_lightoff_view_pager);
        a aVar = new a(this.b);
        aVar.setOrientation(0);
        this.g.setLayoutManager(aVar);
        this.g.addOnPageChangedListener(this.t);
        UltronInstanceConfig ultronInstanceConfig = new UltronInstanceConfig();
        ultronInstanceConfig.c(true);
        ultronInstanceConfig.a("detail_lightoff");
        ultronInstanceConfig.a(true);
        ultronInstanceConfig.c(true);
        ultronInstanceConfig.d(true);
        this.h = com.alibaba.android.ultron.vfw.instance.d.a(ultronInstanceConfig, this.b);
        this.h.a((LinearLayout) null, this.g, (LinearLayout) null);
        this.h.a(com.taobao.android.detail.mainpic.holder.d.e, com.taobao.android.detail.mainpic.holder.d.a(this.v, this.f10129a));
        this.h.a(com.taobao.android.detail.mainpic.holder.e.e, com.taobao.android.detail.mainpic.holder.e.a(this.v, this.f10129a));
        this.h.a(com.taobao.android.detail.mainpic.holder.f.e, com.taobao.android.detail.mainpic.holder.f.a(this.v, this.f10129a));
        this.h.d().a("closeLightOff", new euh(this));
        this.h.d().a("openShareFloat", new euk(this));
        this.h.d().a(this.f10129a.k().e());
        this.h.d().a(this.f10129a.p());
        this.h.a(new eul(this.f10129a));
    }

    private void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
            return;
        }
        this.h.a(this.p);
        this.h.a(this.s);
        this.h.a(63);
    }

    private void a(final int i, final int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c1152c8", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        this.c.post(new Runnable() { // from class: com.taobao.android.detail.mainpic.c.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                com.alibaba.android.ultron.vfw.viewholder.b b;
                com.alibaba.android.ultron.vfw.viewholder.b b2;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                com.alibaba.android.ultron.vfw.viewholder.h c = c.c(c.this, i);
                if (c != null && (b2 = c.b()) != null) {
                    b2.c();
                }
                com.alibaba.android.ultron.vfw.viewholder.h c2 = c.c(c.this, i2);
                if (c2 == null || (b = c2.b()) == null) {
                    return;
                }
                b.b();
            }
        });
        List<IDMComponent> list = this.i;
        if (list == null || i2 < 0 || i2 >= list.size()) {
            return;
        }
        d(i2);
        this.m = i2;
        this.n = this.i.get(this.m);
    }

    private void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else if (i < 0 || i >= this.i.size()) {
        } else {
            HashMap hashMap = new HashMap();
            IDMComponent iDMComponent = this.i.get(i);
            IDMComponent b = euq.b(iDMComponent);
            if (b != null) {
                hashMap.put("type", "video");
                hashMap.put(com.taobao.android.fluid.business.usertrack.track.b.PROPERTY_VIDEO_ID, b.getFields().getString("url"));
            } else {
                IDMComponent c = euq.c(iDMComponent);
                if (c == null) {
                    UnifyLog.d("LightOffViewManager", "currMediaComp is null");
                    return;
                } else {
                    hashMap.put("type", "pic");
                    hashMap.put("image_id", c.getFields().getString("url"));
                }
            }
            hashMap.put("item_id", this.f10129a.o().d());
            hashMap.put("seller_id", this.f10129a.o().h());
            hashMap.put("user_id", this.f10129a.o().k());
            hashMap.put("index", String.valueOf(i));
            eux.b(hashMap);
        }
    }

    private void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
            return;
        }
        int i2 = this.m;
        this.g.scrollToPosition(i);
        a(i2, i);
    }

    private void a(IDMComponent iDMComponent, String str) {
        List<com.taobao.android.ultron.common.model.b> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a050eeb6", new Object[]{this, iDMComponent, str});
        } else if (iDMComponent.getEventMap() != null && (list = iDMComponent.getEventMap().get(str)) != null) {
            for (com.taobao.android.ultron.common.model.b bVar : list) {
                if (bVar != null) {
                    com.alibaba.android.ultron.event.base.e a2 = this.h.d().a().a(bVar.getType());
                    a2.a(bVar);
                    a2.a(iDMComponent);
                    this.h.d().a(a2);
                }
            }
        }
    }

    public void a(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f99a0b2", new Object[]{this, bVar});
        } else {
            this.p = bVar;
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
        com.alibaba.android.ultron.vfw.viewholder.h hVar = this.k.get(Integer.valueOf(i));
        if (hVar != null) {
            return hVar;
        }
        RecyclerView.ViewHolder findViewHolderForAdapterPosition = this.g.findViewHolderForAdapterPosition(i);
        if (!(findViewHolderForAdapterPosition instanceof com.alibaba.android.ultron.vfw.viewholder.h)) {
            return hVar;
        }
        com.alibaba.android.ultron.vfw.viewholder.h hVar2 = (com.alibaba.android.ultron.vfw.viewholder.h) findViewHolderForAdapterPosition;
        this.k.put(Integer.valueOf(i), hVar2);
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

    /* loaded from: classes4.dex */
    public class a extends LinearLayoutManager {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            if (str.hashCode() == -574012007) {
                return new Boolean(super.canScrollHorizontally());
            }
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        @Override // android.support.v7.widget.LinearLayoutManager, android.support.v7.widget.RecyclerView.LayoutManager
        public boolean supportsPredictiveItemAnimations() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("c4fda0d0", new Object[]{this})).booleanValue();
            }
            return false;
        }

        public a(Context context) {
            super(context);
        }

        @Override // android.support.v7.widget.LinearLayoutManager, android.support.v7.widget.RecyclerView.LayoutManager
        public boolean canScrollHorizontally() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("ddc94599", new Object[]{this})).booleanValue();
            }
            c cVar = c.this;
            com.alibaba.android.ultron.vfw.viewholder.h c = c.c(cVar, cVar.m);
            if (c != null && (c.b() instanceof com.taobao.android.detail.mainpic.holder.c)) {
                return ((com.taobao.android.detail.mainpic.holder.c) c.b()).a(c.this.g.getDx());
            }
            return super.canScrollHorizontally();
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        for (com.alibaba.android.ultron.vfw.viewholder.h hVar : this.k.values()) {
            if (hVar != null && hVar.b() != null) {
                hVar.b().d();
            }
        }
        com.alibaba.android.ultron.vfw.instance.d dVar = this.h;
        if (dVar != null) {
            dVar.m();
        }
        eun eunVar = this.u;
        if (eunVar == null) {
            return;
        }
        eunVar.b();
    }

    public com.alibaba.android.ultron.vfw.instance.d c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.alibaba.android.ultron.vfw.instance.d) ipChange.ipc$dispatch("8d29ca0f", new Object[]{this}) : this.h;
    }

    public boolean d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue() : this.q;
    }

    public int e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5a4ca5f", new Object[]{this})).intValue() : this.m;
    }

    public List<IDMComponent> f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("e89f38ba", new Object[]{this}) : this.i;
    }
}
