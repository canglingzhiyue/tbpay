package tb;

import mtopsdk.common.util.StringUtils;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail2.core.framework.view.manager.NavBarViewManager;
import com.taobao.android.detail2.core.mainpic.b;
import com.taobao.phenix.intf.event.FailPhenixEvent;
import com.taobao.phenix.intf.event.SuccPhenixEvent;
import com.taobao.taobao.R;
import tb.fmd;
import tb.pig;

/* loaded from: classes5.dex */
public class qnk extends pig<okd> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static String f;
    public static phy j;
    public ImageView g;
    public ImageView h;
    public String i;
    private fmd.d k;

    public static /* synthetic */ Object ipc$super(qnk qnkVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // tb.pig
    public void b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63b99827", new Object[]{this, jSONObject});
        }
    }

    @Override // tb.pig
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        }
    }

    @Override // tb.pig
    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
        }
    }

    @Override // tb.pig
    public void e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c6cb136", new Object[]{this, str});
        }
    }

    @Override // tb.pig
    public void f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("669e4a77", new Object[]{this, str});
        }
    }

    @Override // tb.pig
    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
        }
    }

    @Override // tb.pig
    public void g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0cfe3b8", new Object[]{this, str});
        }
    }

    @Override // tb.pig
    public void h(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb017cf9", new Object[]{this, str});
        }
    }

    public static /* synthetic */ void a(qnk qnkVar, okd okdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2fc1f92", new Object[]{qnkVar, okdVar});
        } else {
            qnkVar.b2(okdVar);
        }
    }

    @Override // tb.pig
    public /* synthetic */ void b(okd okdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e72dcfbf", new Object[]{this, okdVar});
        } else {
            a(okdVar);
        }
    }

    static {
        kge.a(-2034732276);
        f = "img";
        j = new phy() { // from class: tb.qnk.5
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.phy
            public pig a(ViewGroup viewGroup, com.taobao.android.detail2.core.mainpic.a aVar, b.a aVar2, pig.a aVar3) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (pig) ipChange.ipc$dispatch("7d43a62a", new Object[]{this, viewGroup, aVar, aVar2, aVar3}) : new qnk((ViewGroup) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mainpic_image_layout, viewGroup, false), aVar, aVar2, aVar3);
            }
        };
    }

    public qnk(ViewGroup viewGroup, com.taobao.android.detail2.core.mainpic.a aVar, b.a aVar2, pig.a aVar3) {
        super(viewGroup, aVar, aVar2, aVar3);
        this.k = new fmd.d() { // from class: tb.qnk.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.fmd.d
            public void a(int i, int i2, boolean z) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("2619b90c", new Object[]{this, new Integer(i), new Integer(i2), new Boolean(z)});
                } else if (qnk.this.d == 0) {
                    fjt.a("new_detail异常", "屏幕有变化，但是数据未准备好。不进行下沉主图重新绑定。");
                } else {
                    fjt.a(fjt.TAG_TIP, "屏幕有变化，下沉主图重新绑定中...");
                    qnk qnkVar = qnk.this;
                    qnk.a(qnkVar, (okd) qnkVar.d);
                }
            }
        };
        viewGroup.setOnTouchListener(new ojz(viewGroup, viewGroup.getContext(), this.b) { // from class: tb.qnk.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.ojz
            public String b() {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : "frame";
            }

            @Override // tb.ojz
            public int a() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[]{this})).intValue();
                }
                if (qnk.this.d == 0) {
                    return -1;
                }
                return ((okd) qnk.this.d).d;
            }
        });
        this.h = (ImageView) viewGroup.findViewById(R.id.image_gaussian);
        this.h.setHapticFeedbackEnabled(false);
        ojz ojzVar = new ojz(this.h, viewGroup.getContext(), this.b) { // from class: tb.qnk.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.ojz
            public String b() {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : "gaussian";
            }

            @Override // tb.ojz
            public int a() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[]{this})).intValue();
                }
                if (qnk.this.d == 0) {
                    return -1;
                }
                return ((okd) qnk.this.d).d;
            }
        };
        if (this.c.i().h) {
            this.h.setOnTouchListener(ojzVar);
        }
        this.g = (ImageView) viewGroup.findViewById(R.id.image);
        this.g.setHapticFeedbackEnabled(false);
        this.g.setOnTouchListener(new ojz(this.g, viewGroup.getContext(), this.b) { // from class: tb.qnk.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.ojz
            public String b() {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : "image";
            }

            @Override // tb.ojz
            public int a() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[]{this})).intValue();
                }
                if (qnk.this.d == 0) {
                    return -1;
                }
                return ((okd) qnk.this.d).d;
            }
        });
        h();
    }

    private void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
        } else if (this.f32680a == null) {
        } else {
            this.f32680a.c().a(this.k);
        }
    }

    public void a(okd okdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f81123d0", new Object[]{this, okdVar});
        } else {
            b2(okdVar);
        }
    }

    /* renamed from: b  reason: avoid collision after fix types in other method */
    private void b2(okd okdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e6942a51", new Object[]{this, okdVar});
            return;
        }
        ctu.a("mainPicImageOnBindData");
        if (this.d == 0) {
            ctu.a();
            return;
        }
        this.h.setScaleType(ImageView.ScaleType.CENTER_CROP);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.g.getLayoutParams();
        com.taobao.android.detail2.core.framework.base.media.frame.a a2 = oyn.a(this.f32680a.b(), this.f32680a.e(), ((okd) this.d).b, this.f32680a.a(), this.f32680a.d().c());
        layoutParams.topMargin = a2.g;
        layoutParams.leftMargin = a2.m;
        layoutParams.width = a2.b;
        layoutParams.height = a2.f11471a;
        this.g.setScaleType(a2.h);
        this.g.setLayoutParams(layoutParams);
        String str = "";
        if (!StringUtils.equals(okdVar.f32136a, this.i)) {
            ctu.a("mainPicImageFirstBind");
            ctu.a();
            if (StringUtils.isEmpty(str)) {
                str = fln.a(this.h.getContext(), okdVar.f32136a);
            }
            com.taobao.phenix.intf.b.h().a(str).addLoaderExtra(esr.BUNDLE_BIZ_CODE, fln.PHENIX_PLAVEHOLDER_PIC_BIZ_CODE).succListener(new a(this.f32680a, this.g, this.h, false, this.d)).failListener(new b(false)).fetch();
        }
        if (this.c.i().h && !StringUtils.equals(okdVar.f32136a, this.i)) {
            if (StringUtils.isEmpty(str)) {
                str = fln.a(this.h.getContext(), okdVar.f32136a);
            }
            fjt.a(fjt.TAG_RENDER, this + "MainPicImageViewHolder.bindGaussian, index: " + ((okd) this.d).d + ", url: " + str);
            com.taobao.phenix.intf.b.h().a(str).bitmapProcessors(true, new com.taobao.phenix.compat.effects.b(this.h.getContext(), this.f32680a.b().n().p(), 2)).addLoaderExtra(esr.BUNDLE_BIZ_CODE, fln.PHENIX_PLAVEHOLDER_PIC_BIZ_CODE).succListener(new a(this.f32680a, this.g, this.h, true, this.d)).failListener(new b(true)).fetch();
        }
        this.i = okdVar.f32136a;
        ctu.a();
    }

    /* loaded from: classes5.dex */
    public static class b implements com.taobao.phenix.intf.event.a<FailPhenixEvent> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private boolean f32960a;

        static {
            kge.a(-1902765424);
            kge.a(-1292221460);
        }

        @Override // com.taobao.phenix.intf.event.a
        public /* synthetic */ boolean onHappen(FailPhenixEvent failPhenixEvent) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d1090e38", new Object[]{this, failPhenixEvent})).booleanValue() : a(failPhenixEvent);
        }

        public b(boolean z) {
            this.f32960a = z;
        }

        public boolean a(FailPhenixEvent failPhenixEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("64c1ef50", new Object[]{this, failPhenixEvent})).booleanValue();
            }
            if (failPhenixEvent == null) {
                return false;
            }
            fjt.a(fjt.TAG_MAIN_PIC, "图片加载失败，是否是gaussian: " + this.f32960a + ", failCode" + failPhenixEvent.getResultCode() + ", url: " + failPhenixEvent.getUrl());
            return false;
        }
    }

    /* loaded from: classes5.dex */
    public static class a implements com.taobao.phenix.intf.event.a<SuccPhenixEvent> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private ImageView f32959a;
        private boolean b;
        private b.a c;
        private ova d;
        private ImageView e;

        static {
            kge.a(1512508494);
            kge.a(-1292221460);
        }

        @Override // com.taobao.phenix.intf.event.a
        public /* synthetic */ boolean onHappen(SuccPhenixEvent succPhenixEvent) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d1090e38", new Object[]{this, succPhenixEvent})).booleanValue() : a(succPhenixEvent);
        }

        public a(b.a aVar, ImageView imageView, ImageView imageView2, boolean z, ova ovaVar) {
            this.f32959a = imageView;
            this.b = z;
            this.c = aVar;
            this.d = ovaVar;
            this.e = imageView2;
        }

        public boolean a(SuccPhenixEvent succPhenixEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("3b4dd374", new Object[]{this, succPhenixEvent})).booleanValue();
            }
            if (succPhenixEvent == null) {
                return false;
            }
            if (this.b) {
                if (!"true".equals(this.f32959a.getTag("hasShowImage".hashCode()))) {
                    this.e.setAlpha(0.0f);
                }
                this.e.setImageDrawable(succPhenixEvent.getDrawable());
                fjt.a(fjt.TAG_RENDER, this.d.d + "gaussianView设置" + this.e);
                this.c.f();
            } else {
                this.f32959a.setImageDrawable(succPhenixEvent.getDrawable());
                this.f32959a.setTag("hasShowImage".hashCode(), "true");
                this.e.setAlpha(1.0f);
                this.c.f();
                fjt.a(fjt.TAG_RENDER, this.d.d + "mainPicImageViewHolder 图片设置,parent: " + this.c.e().f);
            }
            b(succPhenixEvent);
            return false;
        }

        private void b(SuccPhenixEvent succPhenixEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7ed8f131", new Object[]{this, succPhenixEvent});
                return;
            }
            fhi e = this.c.e();
            if (e == null || this.d == null) {
                return;
            }
            if (!this.b && e.f == 0 && this.d.d == 0 && !e.z && !this.d.e && this.c.b().h().ar()) {
                ctu.a("mainPicImageFirstSuccess");
                ctu.a();
                if (!e.ag) {
                    com.taobao.android.detail2.core.framework.a f = this.c.b().f();
                    fjp.b(f, fjp.SECTION_FIRST_NATIVE_PIC_VISIBLE, "nid=" + e.k);
                }
                if (e.ad) {
                    e.ad = false;
                    com.taobao.android.detail2.core.framework.a f2 = this.c.b().f();
                    fjp.b(f2, fjp.SECTION_FIRST_OPEN_IMMEDIATELY_NATIVE_PIC_VISIBLE, "nid=" + e.k);
                }
                if (this.c.b() != null && this.c.b().k() != null && this.c.b().k().a() && e.f == 0 && this.c.b().k().b() && !NavBarViewManager.c(this.c.b().h().G())) {
                    this.c.b().k().d();
                }
            }
            if (e.f == 1 && this.d.d == 0 && !e.z && !this.d.e && !this.b && this.c.b().h().an() && this.c.d().g()) {
                ctu.a("mainPicImageSecondSuccess");
                ctu.a();
                com.taobao.android.detail2.core.framework.a f3 = this.c.b().f();
                fjp.b(f3, fjp.SECTION_SECOND_NATIVE_PIC_VISIBLE, "nid=" + e.k);
            }
            fjt.a(fjt.TAG_MAIN_PIC, succPhenixEvent.getUrl() + "是否命中缓存:" + succPhenixEvent.isImmediate() + ", gaussian: " + this.b);
        }
    }
}
