package tb;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.constraint.ConstraintLayout;
import android.support.transition.ae;
import mtopsdk.common.util.StringUtils;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.behavior.b;
import com.taobao.android.detail.ttdetail.bizmessage.ShowLightOffMessage;
import com.taobao.android.detail.ttdetail.communication.ThreadMode;
import com.taobao.android.detail.ttdetail.communication.c;
import com.taobao.android.detail.ttdetail.communication.g;
import com.taobao.android.detail.ttdetail.component.module.DataEntry;
import com.taobao.android.detail.ttdetail.component.module.h;
import com.taobao.android.detail.ttdetail.component.module.n;
import com.taobao.android.detail.ttdetail.data.meta.Feature;
import com.taobao.android.detail.ttdetail.handler.event.RuntimeAbilityParam;
import com.taobao.android.detail.ttdetail.minivideo.MiniVideoType;
import com.taobao.android.detail.ttdetail.performance.d;
import com.taobao.android.detail.ttdetail.utils.av;
import com.taobao.android.detail.ttdetail.utils.bh;
import com.taobao.android.detail.ttdetail.utils.br;
import com.taobao.android.detail.ttdetail.utils.e;
import com.taobao.android.detail.ttdetail.utils.f;
import com.taobao.android.detail.ttdetail.utils.i;
import com.taobao.android.detail.ttdetail.utils.j;
import com.taobao.android.detail.ttdetail.utils.k;
import com.taobao.android.detail.ttdetail.utils.l;
import com.taobao.android.detail.ttdetail.utils.m;
import com.taobao.android.detail.ttdetail.utils.o;
import com.taobao.android.detail.ttdetail.utils.q;
import com.taobao.android.detail.ttdetail.widget.PendingPopulateViewPager;
import com.taobao.android.detail.ttdetail.widget.TTObservedImageView;
import com.taobao.android.detail.ttdetail.widget.TTViewPager;
import com.taobao.android.detail.ttdetail.widget.video.VideoView;
import com.taobao.ptr.PtrBase;
import com.taobao.tao.util.TaobaoImageUrlStrategy;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.List;
import tb.ezs;

/* loaded from: classes4.dex */
public class eyq implements g<ShowLightOffMessage> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private long A;
    private int B;
    private TTViewPager.e C;
    private final n D;
    private VideoView.b E;
    private ezs.c F;
    private ezs.b G;
    private ezs.a H;
    private Runnable I;
    private volatile boolean J;
    private volatile boolean K;
    private volatile boolean L;
    private boolean M;
    private boolean N;
    private String O;
    private JSONObject P;

    /* renamed from: a  reason: collision with root package name */
    private Context f27647a;
    private eyx b;
    private eze c;
    private ConstraintLayout d;
    private a e;
    private ezs f;
    private com.taobao.android.detail.ttdetail.minivideo.a g;
    private PtrBase h;
    private PendingPopulateViewPager i;
    private eyu j;
    private int k;
    private View l;
    private TextView m;
    private TextView n;
    private TextView o;
    private iyw p;
    private ValueAnimator q;
    private ValueAnimator r;
    private float s;
    private volatile boolean t;
    private volatile boolean u;
    private float v;
    private float w;
    private int x;
    private volatile boolean y;
    private Boolean z;

    /* loaded from: classes4.dex */
    public interface a {
        void a(h hVar);
    }

    static {
        kge.a(-664628432);
        kge.a(-767194759);
    }

    private boolean a(float f) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a821885c", new Object[]{this, new Float(f)})).booleanValue() : f > 0.0f;
    }

    public static /* synthetic */ float a(eyq eyqVar, int i, float f) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("246041c8", new Object[]{eyqVar, new Integer(i), new Float(f)})).floatValue() : eyqVar.b(i, f);
    }

    public static /* synthetic */ long a(eyq eyqVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("11b0869d", new Object[]{eyqVar, new Long(j)})).longValue();
        }
        eyqVar.A = j;
        return j;
    }

    public static /* synthetic */ void a(eyq eyqVar, float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("245ee4bb", new Object[]{eyqVar, new Float(f), new Float(f2)});
        } else {
            eyqVar.a(f, f2);
        }
    }

    public static /* synthetic */ void a(eyq eyqVar, float f, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("245f2fcf", new Object[]{eyqVar, new Float(f), new Boolean(z)});
        } else {
            eyqVar.a(f, z);
        }
    }

    public static /* synthetic */ void a(eyq eyqVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11b082e8", new Object[]{eyqVar, new Integer(i)});
        } else {
            eyqVar.b(i);
        }
    }

    public static /* synthetic */ void a(eyq eyqVar, h hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3a3ad3c", new Object[]{eyqVar, hVar});
        } else {
            eyqVar.a(hVar);
        }
    }

    public static /* synthetic */ void a(eyq eyqVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69d44085", new Object[]{eyqVar, str});
        } else {
            eyqVar.f(str);
        }
    }

    public static /* synthetic */ boolean a(eyq eyqVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("e7cbdf7f", new Object[]{eyqVar})).booleanValue() : eyqVar.l();
    }

    public static /* synthetic */ boolean a(eyq eyqVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("11b0c2bd", new Object[]{eyqVar, new Boolean(z)})).booleanValue();
        }
        eyqVar.u = z;
        return z;
    }

    public static /* synthetic */ Rect b(eyq eyqVar, h hVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Rect) ipChange.ipc$dispatch("398384a4", new Object[]{eyqVar, hVar}) : eyqVar.b(hVar);
    }

    public static /* synthetic */ void b(eyq eyqVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f38e4c87", new Object[]{eyqVar, new Integer(i)});
        } else {
            eyqVar.c(i);
        }
    }

    public static /* synthetic */ void b(eyq eyqVar, int i, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e3bac19", new Object[]{eyqVar, new Integer(i), new Float(f)});
        } else {
            eyqVar.a(i, f);
        }
    }

    public static /* synthetic */ void b(eyq eyqVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ebd08c6", new Object[]{eyqVar, str});
        } else {
            eyqVar.h(str);
        }
    }

    public static /* synthetic */ boolean b(eyq eyqVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d64ee600", new Object[]{eyqVar})).booleanValue() : eyqVar.q();
    }

    public static /* synthetic */ boolean b(eyq eyqVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f38e8c5c", new Object[]{eyqVar, new Boolean(z)})).booleanValue();
        }
        eyqVar.t = z;
        return z;
    }

    public static /* synthetic */ int c(eyq eyqVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d56c1619", new Object[]{eyqVar, new Integer(i)})).intValue();
        }
        eyqVar.B = i;
        return i;
    }

    public static /* synthetic */ PendingPopulateViewPager c(eyq eyqVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (PendingPopulateViewPager) ipChange.ipc$dispatch("73d08cf3", new Object[]{eyqVar}) : eyqVar.i;
    }

    public static /* synthetic */ void c(eyq eyqVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d56c55f7", new Object[]{eyqVar, new Boolean(z)});
        } else {
            eyqVar.a(z);
        }
    }

    public static /* synthetic */ boolean d(eyq eyqVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("b354f302", new Object[]{eyqVar})).booleanValue() : eyqVar.u;
    }

    public static /* synthetic */ boolean e(eyq eyqVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a1d7f983", new Object[]{eyqVar})).booleanValue() : eyqVar.M;
    }

    public static /* synthetic */ eyu f(eyq eyqVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (eyu) ipChange.ipc$dispatch("f6cd1465", new Object[]{eyqVar}) : eyqVar.j;
    }

    public static /* synthetic */ void g(eyq eyqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ede0681", new Object[]{eyqVar});
        } else {
            eyqVar.s();
        }
    }

    public static /* synthetic */ Context h(eyq eyqVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("f6b705fa", new Object[]{eyqVar}) : eyqVar.f27647a;
    }

    public static /* synthetic */ int i(eyq eyqVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5be41376", new Object[]{eyqVar})).intValue() : eyqVar.B;
    }

    public static /* synthetic */ long j(eyq eyqVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("4a6719f8", new Object[]{eyqVar})).longValue() : eyqVar.A;
    }

    public static /* synthetic */ int k(eyq eyqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("38ea2078", new Object[]{eyqVar})).intValue();
        }
        int i = eyqVar.B + 1;
        eyqVar.B = i;
        return i;
    }

    public static /* synthetic */ eyx l(eyq eyqVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (eyx) ipChange.ipc$dispatch("64981afc", new Object[]{eyqVar}) : eyqVar.b;
    }

    public static /* synthetic */ float n(eyq eyqVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("47333f8", new Object[]{eyqVar})).floatValue() : eyqVar.s;
    }

    public static /* synthetic */ boolean o(eyq eyqVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f2f63a8d", new Object[]{eyqVar})).booleanValue() : eyqVar.t;
    }

    public static /* synthetic */ TextView p(eyq eyqVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TextView) ipChange.ipc$dispatch("ecf1eb7e", new Object[]{eyqVar}) : eyqVar.o;
    }

    public static /* synthetic */ com.taobao.android.detail.ttdetail.minivideo.a q(eyq eyqVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.detail.ttdetail.minivideo.a) ipChange.ipc$dispatch("ed425557", new Object[]{eyqVar}) : eyqVar.g;
    }

    public static /* synthetic */ void r(eyq eyqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be7f4e0c", new Object[]{eyqVar});
        } else {
            eyqVar.r();
        }
    }

    @Override // com.taobao.android.detail.ttdetail.communication.g
    public /* synthetic */ boolean receiveMessage(ShowLightOffMessage showLightOffMessage) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("318750e6", new Object[]{this, showLightOffMessage})).booleanValue() : a(showLightOffMessage);
    }

    public eyq(Context context, eyx eyxVar) {
        this.s = e.e() ? 2.0f : 1.0f;
        this.j = new eyu();
        this.k = -1;
        this.u = true;
        this.v = 0.0f;
        this.w = 0.0f;
        this.y = true;
        this.J = false;
        this.z = com.taobao.android.detail.ttdetail.feature.a.mFeature.get(com.taobao.android.detail.ttdetail.feature.a.sHeaderFlingMode);
        this.C = new TTViewPager.e() { // from class: tb.eyq.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.detail.ttdetail.widget.TTViewPager.e
            public void a(int i, int i2, float f, int i3) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("9d14c40b", new Object[]{this, new Integer(i), new Integer(i2), new Float(f), new Integer(i3)});
                } else if (eyq.a(eyq.this) || eyq.b(eyq.this)) {
                } else {
                    boolean z = ((float) i2) * 0.5f == ((float) i3);
                    if (eyq.c(eyq.this).getScrollState() == 0 && z) {
                        float a2 = eyq.a(eyq.this, i, 1.0f);
                        eyq eyqVar = eyq.this;
                        eyq.a(eyqVar, a2, !eyq.d(eyqVar));
                    } else {
                        eyq.b(eyq.this, a(i, f), a(f));
                    }
                    eyq.a(eyq.this, false);
                }
            }

            private int a(int i, float f) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Number) ipChange.ipc$dispatch("5c114778", new Object[]{this, new Integer(i), new Float(f)})).intValue();
                }
                if (Float.compare(f - 0.5f, 0.0f) < 0) {
                    i--;
                }
                if (eyq.e(eyq.this) && i < 0) {
                    i += eyq.f(eyq.this).getCount();
                }
                return Math.max(0, Math.min(i, eyq.f(eyq.this).getCount() - 1));
            }

            private float a(float f) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Number) ipChange.ipc$dispatch("a8218848", new Object[]{this, new Float(f)})).floatValue();
                }
                float f2 = f - 0.5f;
                return Float.compare(f2, 0.0f) >= 0 ? f2 : f2 + 1.0f;
            }

            @Override // com.taobao.android.detail.ttdetail.widget.TTViewPager.e
            public void onPageSelected(int i) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("184d6f33", new Object[]{this, new Integer(i)});
                } else {
                    eyq.a(eyq.this, i);
                }
            }

            @Override // com.taobao.android.detail.ttdetail.widget.TTViewPager.e
            public void a(int i) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
                } else if (i != 0) {
                } else {
                    eyq eyqVar = eyq.this;
                    eyq.b(eyqVar, eyq.c(eyqVar).getCurrentItem());
                }
            }
        };
        this.D = new eys(this);
        this.E = new VideoView.b() { // from class: tb.eyq.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass3 anonymousClass3, String str, Object... objArr) {
                if (str.hashCode() == -742210244) {
                    super.onVideoComplete();
                    return null;
                }
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            }

            @Override // com.taobao.android.detail.ttdetail.widget.video.VideoView.b, com.taobao.avplayer.av
            public void onVideoComplete() {
                int currentItem;
                h a2;
                int i;
                h a3;
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("d3c2c53c", new Object[]{this});
                    return;
                }
                super.onVideoComplete();
                if (!eyq.o(eyq.this) || (a2 = eyq.f(eyq.this).a((currentItem = eyq.c(eyq.this).getCurrentItem()))) == null || !a2.k() || (a3 = eyq.f(eyq.this).a((i = currentItem + 1))) == null || !a3.k()) {
                    return;
                }
                eyq.c(eyq.this).setCurrentItem(i, true);
            }
        };
        this.F = new ezs.c() { // from class: tb.eyq.11
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.ezs.c
            public void a(ezs ezsVar, h hVar) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("fb13121d", new Object[]{this, ezsVar, hVar});
                } else if (hVar == null) {
                } else {
                    String b = ((ezc) hVar.getComponentData()).b();
                    if (eyq.q(eyq.this).a()) {
                        eyq.q(eyq.this).b(hVar.i());
                    }
                    eyq eyqVar = eyq.this;
                    if (!hVar.j()) {
                        b = null;
                    }
                    eyq.b(eyqVar, b);
                }
            }

            @Override // tb.ezs.c
            public void b(ezs ezsVar, h hVar) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("97810e7c", new Object[]{this, ezsVar, hVar});
                    return;
                }
                b.a(eyq.h(eyq.this), "GalleryLightoffContainer", 2);
                if (hVar == null) {
                    return;
                }
                if (eyq.q(eyq.this).a()) {
                    eyq.q(eyq.this).c(hVar.i());
                }
                eyq.r(eyq.this);
            }
        };
        this.G = new ezs.b() { // from class: tb.eyq.12
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.ezs.b
            public void a(h hVar) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("b6a059af", new Object[]{this, hVar});
                } else if (hVar != null) {
                    String b = ((ezc) hVar.getComponentData()).b();
                    int count = eyq.f(eyq.this).getCount();
                    for (int i = 0; i < count; i++) {
                        h a2 = eyq.f(eyq.this).a(i);
                        if (a2 != null && StringUtils.equals(b, ((ezc) a2.getComponentData()).b()) && i != eyq.c(eyq.this).getCurrentItem()) {
                            eyq.c(eyq.this).setCurrentItem(i, false);
                            eyq.a(eyq.this, a2);
                            return;
                        }
                    }
                }
            }
        };
        this.H = new ezs.a() { // from class: tb.eyq.13
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.ezs.a
            public Rect a(h hVar) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (Rect) ipChange.ipc$dispatch("e6ce2db8", new Object[]{this, hVar});
                }
                Rect b = eyq.b(eyq.this, hVar);
                if (b != null && !b.isEmpty()) {
                    return b;
                }
                int a2 = (int) (f.a(eyq.h(eyq.this)) / 2.0f);
                return new Rect(a2 - 1, -1, a2 + 1, 0);
            }
        };
        this.I = new Runnable() { // from class: tb.eyq.14
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                View findViewById;
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else if (!(eyq.h(eyq.this) instanceof Activity) || (findViewById = ((Activity) eyq.h(eyq.this)).findViewById(R.id.cl_image_holder_container)) == null) {
                } else {
                    findViewById.setVisibility(8);
                }
            }
        };
        this.P = new JSONObject();
        this.f27647a = context;
        if (!bh.a(context)) {
            context.setTheme(R.style.Theme_AppCompat_Wrapper);
        }
        this.b = eyxVar;
        com.taobao.android.detail.ttdetail.widget.video.a.a().a(context);
        c.a(this.f27647a, ShowLightOffMessage.class, this);
        k();
    }

    private void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f95772", new Object[]{this});
            return;
        }
        this.x = (int) TypedValue.applyDimension(1, 2.0f, this.f27647a.getResources().getDisplayMetrics());
        this.g = new com.taobao.android.detail.ttdetail.minivideo.a(this.f27647a, this.b);
        d a2 = d.a(this.f27647a);
        if (a2 != null) {
            this.d = (ConstraintLayout) a2.a(this.f27647a, R.layout.tt_detail_gallery_container, null, true);
        } else {
            this.d = (ConstraintLayout) LayoutInflater.from(this.f27647a).inflate(R.layout.tt_detail_gallery_container, (ViewGroup) null);
        }
        this.h = (PtrBase) this.d.findViewById(R.id.ptr_base);
        this.i = (PendingPopulateViewPager) this.d.findViewById(R.id.ptr_main_container);
        this.l = this.d.findViewById(R.id.ll_index_container);
        Drawable a3 = br.a();
        if (a3 != null) {
            this.l.setBackground(a3);
        }
        ((ViewGroup.MarginLayoutParams) this.l.getLayoutParams()).rightMargin = br.b();
        this.l.requestLayout();
        this.m = (TextView) this.d.findViewById(R.id.tv_current_index);
        this.n = (TextView) this.d.findViewById(R.id.tv_total_size);
        this.o = (TextView) this.d.findViewById(R.id.tv_sku_desc);
        Drawable d = br.d();
        if (d != null) {
            this.o.setBackground(d);
        }
        this.h.setEndLoadingDelegate(new eyv(this.f27647a));
        this.h.setStartLoadingDelegate(new eyw(this.f27647a));
        this.h.freezeStart(true, "");
        this.h.setOnRefreshListener(new PtrBase.a() { // from class: tb.eyq.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.ptr.PtrBase.a
            public void onPullStartToRefresh(PtrBase ptrBase) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("da00fd4d", new Object[]{this, ptrBase});
                }
            }

            @Override // com.taobao.ptr.PtrBase.a
            public void onPullEndToRefresh(PtrBase ptrBase) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("dc9b6974", new Object[]{this, ptrBase});
                    return;
                }
                ptrBase.refreshComplete("加载更多内容");
                eyq.g(eyq.this);
            }
        });
        this.l.setOnClickListener(new View.OnClickListener() { // from class: tb.eyq.5
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                } else if (eyq.c(eyq.this).getCurrentItem() != 3 && !o.a(eyq.h(eyq.this))) {
                } else {
                    if (eyq.i(eyq.this) <= 0 || eyq.i(eyq.this) >= 7) {
                        eyq.c(eyq.this, 1);
                        eyq.a(eyq.this, System.currentTimeMillis());
                        return;
                    }
                    long currentTimeMillis = System.currentTimeMillis();
                    if (currentTimeMillis - eyq.j(eyq.this) > 468) {
                        eyq.c(eyq.this, 0);
                        return;
                    }
                    eyq.a(eyq.this, currentTimeMillis);
                    if (eyq.k(eyq.this) < 7) {
                        return;
                    }
                    com.taobao.android.detail.ttdetail.feature.a.a(eyq.h(eyq.this));
                    i.a("GalleryCore", "user showDevFeature Manually");
                }
            }
        });
        this.i.addOnItemVisibleChangeListener(new TTViewPager.d() { // from class: tb.eyq.6
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.detail.ttdetail.widget.TTViewPager.d
            public void a(int i) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
                    return;
                }
                com.taobao.android.detail.ttdetail.utils.a.c(i, eyq.f(eyq.this).a());
                if (eyq.l(eyq.this).a().c()) {
                    return;
                }
                com.taobao.android.detail.ttdetail.component.module.d b = com.taobao.android.detail.ttdetail.utils.a.b(i, eyq.f(eyq.this).a());
                if (!(b instanceof h)) {
                    return;
                }
                ((h) b).b(1);
            }

            @Override // com.taobao.android.detail.ttdetail.widget.TTViewPager.d
            public void b(int i) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
                    return;
                }
                com.taobao.android.detail.ttdetail.utils.a.d(i, eyq.f(eyq.this).a());
                if (eyq.l(eyq.this).a().c()) {
                    return;
                }
                com.taobao.android.detail.ttdetail.component.module.d b = com.taobao.android.detail.ttdetail.utils.a.b(i, eyq.f(eyq.this).a());
                if (!(b instanceof h)) {
                    return;
                }
                ((h) b).b(2);
            }
        });
        this.i.addOnPageChangeListener(this.C);
        this.i.setOnTouchListener(new View.OnTouchListener() { // from class: tb.eyq.7
            public static volatile transient /* synthetic */ IpChange $ipChange;
            private float b;

            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("d4aa3aa4", new Object[]{this, view, motionEvent})).booleanValue();
                }
                int action = motionEvent.getAction();
                if (action == 0) {
                    this.b = motionEvent.getX();
                } else if (action == 1 || action == 3) {
                    this.b = Math.abs(motionEvent.getX() - this.b);
                    if (this.b > view.getWidth() / 4.0f) {
                        eyq.b(eyq.this, false);
                    }
                }
                return false;
            }
        });
    }

    private boolean l() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6076ef7", new Object[]{this})).booleanValue() : this.v > 0.0f;
    }

    private boolean o() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("631b57a", new Object[]{this})).booleanValue() : this.i.getModeScroll() == 1;
    }

    public void a(iyw iywVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eea1fc31", new Object[]{this, iywVar});
        } else {
            this.p = iywVar;
        }
    }

    public void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{this, str});
        } else {
            e(str);
        }
    }

    private void e(String str) {
        eyy l;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c6cb136", new Object[]{this, str});
        } else if (StringUtils.isEmpty(str) || (l = this.c.l()) == null) {
        } else {
            try {
                l.d().getJSONObject("bottomBar").put(iok.KEY_PRICE_SECTION, (Object) JSON.parseObject(str).getJSONObject(iok.KEY_PRICE_SECTION));
            } catch (Exception e) {
                i.a("GalleryCore", "lightofflayer price parse error", e);
            }
            ezs ezsVar = this.f;
            if (ezsVar == null || !ezsVar.isShowing()) {
                return;
            }
            this.f.b(l);
        }
    }

    private void a(int i, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c114785", new Object[]{this, new Integer(i), new Float(f)});
        } else if (l() || q()) {
        } else {
            ValueAnimator valueAnimator = this.q;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.q.cancel();
                this.q = null;
            }
            float b = b(i, 1.0f);
            int i2 = i + 1;
            if (this.M && i2 >= this.j.getCount()) {
                i2 %= this.j.getCount();
            }
            String d = d(b + ((b(i2, b) - b) * f));
            ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) this.h.getLayoutParams();
            if (!StringUtils.equals(d, layoutParams.B)) {
                layoutParams.B = d;
                this.h.requestLayout();
            }
            f(d);
        }
    }

    private void f(String str) {
        Activity activity;
        View findViewById;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("669e4a77", new Object[]{this, str});
            return;
        }
        Context context = this.f27647a;
        if (!(context instanceof Activity) || (findViewById = (activity = (Activity) context).findViewById(R.id.cl_image_holder_container)) == null || findViewById.getVisibility() != 0) {
            return;
        }
        final ViewGroup viewGroup = (ViewGroup) activity.findViewById(R.id.ll_header_image_container);
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) viewGroup.getLayoutParams();
        if (StringUtils.equals(str, layoutParams.B)) {
            return;
        }
        layoutParams.B = str;
        if (Build.VERSION.SDK_INT >= 18 && viewGroup.isInLayout()) {
            viewGroup.post(new Runnable() { // from class: tb.eyq.8
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        viewGroup.requestLayout();
                    }
                }
            });
        } else {
            viewGroup.requestLayout();
        }
    }

    private void a(float f, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c10357c", new Object[]{this, new Float(f), new Boolean(z)});
        } else if (l() || q()) {
        } else {
            ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) this.h.getLayoutParams();
            float a2 = f.a(layoutParams.B);
            String d = d(f);
            if (StringUtils.equals(d, d(a2))) {
                return;
            }
            ValueAnimator valueAnimator = this.q;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.q.cancel();
                this.q = null;
            }
            if (!z) {
                layoutParams.B = d;
                this.h.requestLayout();
                f(d);
                return;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(a2, f);
            this.q = ofFloat;
            ofFloat.addUpdateListener(new eyt(this));
            ofFloat.start();
        }
    }

    private void a(final boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c194ce8", new Object[]{this, new Boolean(z), new Boolean(z2)});
        } else if (z && o()) {
        } else {
            ValueAnimator valueAnimator = this.r;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.r.cancel();
                this.r = null;
            }
            float f = 1.0f;
            if (!z2) {
                this.w = z ? 1.0f : 0.0f;
            }
            float f2 = this.w;
            if (!z) {
                f = 0.0f;
            }
            if (Float.compare(f2, f) == 0) {
                a(z);
                return;
            }
            final ValueAnimator ofFloat = ValueAnimator.ofFloat(f2, f);
            this.r = ofFloat;
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: tb.eyq.9
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator2});
                    } else {
                        eyq.a(eyq.this, ((Float) ofFloat.getAnimatedValue()).floatValue(), z ? eyq.n(eyq.this) : 0.0f);
                    }
                }
            });
            ofFloat.addListener(new AnimatorListenerAdapter() { // from class: tb.eyq.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(AnonymousClass2 anonymousClass2, String str, Object... objArr) {
                    if (str.hashCode() == -2145066406) {
                        super.onAnimationEnd((Animator) objArr[0]);
                        return null;
                    }
                    throw new InstantReloadException(String.format("String switch could not find '%s'", str));
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8024e25a", new Object[]{this, animator});
                        return;
                    }
                    super.onAnimationEnd(animator);
                    eyq.c(eyq.this, z);
                }
            });
            ofFloat.start();
        }
    }

    private void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        this.y = false;
        this.i.setModeScroll(z ? 1 : 0);
        float f = 0.0f;
        this.w = z ? 1.0f : 0.0f;
        if (z) {
            f = this.s;
        }
        b(f);
    }

    public void c(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b3996", new Object[]{this, new Float(f)});
        } else {
            a(f, 0.0f);
        }
    }

    private void a(float f, float f2) {
        String d;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0fea68", new Object[]{this, new Float(f), new Float(f2)});
            return;
        }
        float max = Math.max(0.0f, Math.min(f, 1.0f));
        float f3 = this.w;
        this.w = max;
        if (!l() && !a(f2)) {
            return;
        }
        float b = b(this.i.getCurrentItem(), 1.0f);
        if (l()) {
            f2 = this.v;
        }
        int pageMargin = this.i.getPageMargin();
        int i = (int) (this.x * max);
        if (Float.compare(f3, this.w) == 0 && Float.compare(b, f2) == 0 && pageMargin == i) {
            return;
        }
        this.j.b(f2);
        this.j.a(max);
        this.i.setPageMargin(i);
        this.i.updateItemsWidth();
        m();
        int width = this.i.getWidth();
        if (width <= 0) {
            d = d(b + ((f2 - b) * max));
        } else {
            float f4 = width;
            float f5 = f4 / b;
            d = d(f4 / (f5 + (((f4 / f2) - f5) * max)));
        }
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) this.h.getLayoutParams();
        if (StringUtils.equals(d, layoutParams.B)) {
            return;
        }
        layoutParams.B = d;
        this.h.requestLayout();
        e(max);
        f(d);
    }

    private boolean q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("64de47c", new Object[]{this})).booleanValue();
        }
        ValueAnimator valueAnimator = this.r;
        return valueAnimator != null && valueAnimator.isRunning();
    }

    public void b(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d660f7", new Object[]{this, new Float(f)});
        } else if (Float.compare(this.v, f) == 0) {
        } else {
            if (!a(f) || f == Float.NEGATIVE_INFINITY || f == Float.POSITIVE_INFINITY) {
                this.v = 0.0f;
                this.w = 0.0f;
                this.j.b(this.v);
                this.j.a(this.w);
                this.i.setPageMargin((int) (this.x * this.w));
                this.i.updateItemsWidth();
                m();
                String d = d(b(this.i.getCurrentItem(), 1.0f));
                ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) this.h.getLayoutParams();
                if (!StringUtils.equals(d, layoutParams.B)) {
                    layoutParams.B = d;
                    this.h.requestLayout();
                }
                f(d);
                return;
            }
            this.v = f;
            c(this.w);
        }
    }

    private String d(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b813f30b", new Object[]{this, new Float(f)});
        }
        return f + ":1";
    }

    private float b(int i, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("90f782b6", new Object[]{this, new Integer(i), new Float(f)})).floatValue();
        }
        h a2 = this.j.a(i);
        return a2 != null ? a2.d() : f;
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        ezs ezsVar = this.f;
        if (ezsVar != null && ezsVar.isShowing()) {
            return;
        }
        for (h hVar : this.j.a()) {
            hVar.h();
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        ezs ezsVar = this.f;
        if (ezsVar != null && ezsVar.isShowing()) {
            return;
        }
        for (h hVar : this.j.a()) {
            hVar.g();
        }
    }

    public com.taobao.android.detail.ttdetail.minivideo.a c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.detail.ttdetail.minivideo.a) ipChange.ipc$dispatch("a834a398", new Object[]{this}) : this.g;
    }

    public void a(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a1860a7", new Object[]{this, viewGroup});
        } else {
            this.g.a(viewGroup);
        }
    }

    public void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2326e4de", new Object[]{this, aVar});
        } else {
            this.e = aVar;
        }
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else if (!StringUtils.equals(str, com.taobao.android.detail.ttdetail.utils.a.a(this.j.a(this.i.getCurrentItem())))) {
            int count = this.j.getCount();
            for (int i = 0; i < count; i++) {
                if (StringUtils.equals(com.taobao.android.detail.ttdetail.utils.a.a(this.j.a(i)), str) && i != this.i.getCurrentItem()) {
                    this.i.setCurrentItem(i, o());
                    ezs ezsVar = this.f;
                    if (ezsVar == null || !ezsVar.isShowing()) {
                        return;
                    }
                    this.f.a(str);
                    return;
                }
            }
        }
    }

    private void b(int i) {
        IpChange ipChange = $ipChange;
        int i2 = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
            return;
        }
        h a2 = this.j.a(i);
        if (a2 == null || a2 == null) {
            return;
        }
        a2.a(this.D);
        a2.a(this.E);
        if (this.k == i) {
            return;
        }
        this.k = i;
        final String a3 = k.a(this.j.a(), this.k);
        TextView textView = this.o;
        if (StringUtils.isEmpty(a3)) {
            i2 = 8;
        }
        textView.setVisibility(i2);
        this.i.post(new Runnable() { // from class: tb.eyq.10
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    eyq.p(eyq.this).setText(a3);
                }
            }
        });
        a(a2, this.k);
        i(i());
        a(this.k, a2);
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [tb.eyy] */
    private void a(int i, h hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0bdd51c", new Object[]{this, new Integer(i), hVar});
        } else {
            c.a(this.f27647a, new com.taobao.android.detail.ttdetail.bizmessage.n(i, hVar.getComponentData()));
        }
    }

    private void c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b44d9", new Object[]{this, new Integer(i)});
            return;
        }
        a(this.j.a(i));
        b(i);
    }

    private void a(h hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6a059af", new Object[]{this, hVar});
            return;
        }
        a aVar = this.e;
        if (aVar == null) {
            return;
        }
        aVar.a(hVar);
    }

    @Override // com.taobao.android.detail.ttdetail.communication.g
    public ThreadMode onRunThreadMode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ThreadMode) ipChange.ipc$dispatch("e1b5ec98", new Object[]{this}) : ThreadMode.MainThread;
    }

    public boolean a(ShowLightOffMessage showLightOffMessage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("585ecd34", new Object[]{this, showLightOffMessage})).booleanValue();
        }
        a(showLightOffMessage.a(), showLightOffMessage.b(), showLightOffMessage.c());
        return true;
    }

    private void g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0cfe3b8", new Object[]{this, str});
            return;
        }
        for (int i = 0; i < this.j.getCount(); i++) {
            h a2 = this.j.a(i);
            if (StringUtils.equals(((ezc) a2.getComponentData()).b(), str) && a2.k()) {
                a2.f();
                return;
            }
        }
    }

    private void a(ShowLightOffMessage.Source source, String str, Rect rect) {
        List<com.taobao.android.detail.ttdetail.component.module.i> a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6622550e", new Object[]{this, source, str, rect});
            return;
        }
        ezs ezsVar = this.f;
        if ((ezsVar != null && ezsVar.isShowing()) || (a2 = a(source)) == null || a2.isEmpty()) {
            return;
        }
        if (source == ShowLightOffMessage.Source.VIDEO_COMPONENT) {
            g(str);
        }
        eyy l = this.c.l();
        boolean w = w();
        this.t = false;
        this.f = new ezs(this.f27647a, this.b, a2, w, str, rect);
        if (w) {
            a(l, source);
            this.f.a(l);
            this.f.a();
        }
        this.f.a(this.F);
        this.f.a(this.G);
        this.f.a(this.H);
        this.f.show();
        b.a(this.f27647a, "GalleryLightoffContainer", 1);
        m.a(2201, "DarkPage_industry", m.a(this.b.a()));
    }

    private static void a(eyy eyyVar, ShowLightOffMessage.Source source) {
        JSONObject d;
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("82d645ec", new Object[]{eyyVar, source});
        } else if (eyyVar == null || (d = eyyVar.d()) == null) {
        } else {
            if (source != ShowLightOffMessage.Source.MINI_VIDEO) {
                z = false;
            }
            d.put("hideSkuBar", (Object) Boolean.toString(z));
        }
    }

    private void r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65bfbf9", new Object[]{this});
            return;
        }
        int count = this.j.getCount();
        for (int i = 0; i < count; i++) {
            h a2 = this.j.a(i);
            if (a2 != null && a2.k()) {
                a2.e();
            }
        }
    }

    private void h(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb017cf9", new Object[]{this, str});
            return;
        }
        int count = this.j.getCount();
        for (int i = 0; i < count; i++) {
            h a2 = this.j.a(i);
            if (a2 != null && a2.k()) {
                a2.a(StringUtils.equals(str, ((ezc) a2.getComponentData()).b()));
            }
        }
    }

    private Rect b(h hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Rect) ipChange.ipc$dispatch("157f97d7", new Object[]{this, hVar});
        }
        if (hVar == null) {
            return null;
        }
        String b = ((ezc) hVar.getComponentData()).b();
        if (hVar.k() && this.g.a() && this.g.a(b)) {
            return this.g.d();
        }
        h a2 = this.j.a(this.i.getCurrentItem());
        if (a2 != null && StringUtils.equals(b, ((ezc) a2.getComponentData()).b())) {
            return a2.b();
        }
        return null;
    }

    private List<com.taobao.android.detail.ttdetail.component.module.i> a(ShowLightOffMessage.Source source) {
        com.taobao.android.detail.ttdetail.component.module.i iVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("50a6286", new Object[]{this, source});
        }
        List<ezc> a2 = com.taobao.android.detail.ttdetail.utils.d.a(this.c);
        if (source == ShowLightOffMessage.Source.MINI_VIDEO && this.g.a(MiniVideoType.INDEPENDENT)) {
            a2 = com.taobao.android.detail.ttdetail.utils.d.b(this.c);
        }
        if (a2 == null) {
            i.a("GalleryCore", "getLightOffComponents return null");
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (ezc ezcVar : a2) {
            if (ezcVar.l() && (iVar = (com.taobao.android.detail.ttdetail.component.module.i) this.b.d().a(ezcVar, new DataEntry(com.taobao.android.detail.ttdetail.constant.a.KEY_IS_LIGHT_OFF, "true"))) != null) {
                arrayList.add(iVar);
            }
        }
        return arrayList;
    }

    private void i(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4533163a", new Object[]{this, str});
            return;
        }
        iyw iywVar = this.p;
        if (iywVar == null) {
            return;
        }
        iywVar.a(str);
    }

    public String h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("5d9eff91", new Object[]{this}) : d(this.i.getCurrentItem());
    }

    public int j() {
        ezc ezcVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5eb3fe4", new Object[]{this})).intValue();
        }
        h a2 = this.j.a(this.i.getCurrentItem());
        if (a2 == null || (ezcVar = (ezc) a2.getComponentData()) == null || StringUtils.isEmpty(ezcVar.j())) {
            return 0;
        }
        ezg a3 = ezcVar.a();
        if (a3 != null) {
            return a3.m().size();
        }
        return 1;
    }

    private String d(int i) {
        ezc ezcVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6ef97628", new Object[]{this, new Integer(i)});
        }
        h a2 = this.j.a(Math.min(Math.max(i, 0), this.j.getCount()));
        if (a2 != null && (ezcVar = (ezc) a2.getComponentData()) != null) {
            return ezcVar.j();
        }
        return null;
    }

    public String i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("e424ba30", new Object[]{this}) : e(this.i.getCurrentItem());
    }

    private String e(int i) {
        ezc ezcVar;
        ezd ezdVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b92b0f69", new Object[]{this, new Integer(i)});
        }
        h a2 = this.j.a(Math.min(Math.max(i, 0), this.j.getCount()));
        if (a2 != null && (ezcVar = (ezc) a2.getComponentData()) != null && (ezdVar = (ezd) ezcVar.a()) != null) {
            return ezdVar.i();
        }
        return null;
    }

    public void b(String str) {
        ezd ezdVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
        } else if (!StringUtils.equals(str, i())) {
            JSONObject a2 = m.a(this.b.a());
            a2.put("locatorId", (Object) str);
            m.a(2101, "DetailLocator_industry", a2);
            List<h> a3 = this.j.a();
            int size = a3.size();
            for (int i = 0; i < size; i++) {
                ezc ezcVar = (ezc) a3.get(i).getComponentData();
                if (ezcVar != null && (ezdVar = (ezd) ezcVar.a()) != null && StringUtils.equals(str, ezdVar.i())) {
                    this.i.setCurrentItem(i, o());
                    return;
                }
            }
        }
    }

    private void s() {
        eyy h;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66a137a", new Object[]{this});
            return;
        }
        eze ezeVar = this.c;
        if (ezeVar == null || (h = ezeVar.h()) == null) {
            return;
        }
        this.b.c().a(h.a("dragEvent"), new RuntimeAbilityParam[0]);
    }

    public View d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("f7f4866d", new Object[]{this}) : this.d;
    }

    public void e() {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        av.c(this.b, this.b.a().c() ? "preRenderHeader" : "renderHeader", System.currentTimeMillis());
        eze ezeVar = (eze) this.b.a().a(pho.PARSER_ID);
        if (this.c == ezeVar) {
            return;
        }
        this.c = ezeVar;
        List<ezc> a2 = com.taobao.android.detail.ttdetail.utils.d.a(this.c);
        if (a2 == null) {
            i.a("GalleryCore", "onDataUpdate DataUtils.extractFramesData() return null");
            return;
        }
        ezs ezsVar = this.f;
        if (ezsVar != null && ezsVar.isShowing()) {
            this.f.a(false);
        }
        Feature feature = (Feature) this.b.a().a(Feature.class);
        this.K = com.taobao.android.detail.ttdetail.utils.d.a(feature);
        this.L = com.taobao.android.detail.ttdetail.utils.d.c(feature);
        if (!com.taobao.android.detail.ttdetail.utils.n.a(this.f27647a, feature) || com.taobao.android.detail.ttdetail.utils.n.a(feature)) {
            z = false;
        }
        this.t = z;
        this.g.a(this.c);
        ArrayList arrayList = new ArrayList();
        for (ezc ezcVar : a2) {
            h hVar = (h) this.b.d().a(ezcVar, new DataEntry[0]);
            if (hVar != null) {
                arrayList.add(hVar);
            }
        }
        x();
        t();
        v();
        a(arrayList);
    }

    private void t() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6782afb", new Object[]{this});
            return;
        }
        eze ezeVar = this.c;
        if (ezeVar != null && a(ezeVar.h()) && !this.L) {
            z = true;
        }
        this.h.freezeEnd(!z, "");
    }

    private boolean a(eyy eyyVar) {
        JSONObject d;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e7cf8277", new Object[]{this, eyyVar})).booleanValue();
        }
        if (eyyVar != null && (d = eyyVar.d()) != null) {
            return StringUtils.equals("right", d.getString("position"));
        }
        return false;
    }

    private List<ezf> u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("7b1ac84b", new Object[]{this});
        }
        eze ezeVar = this.c;
        if (ezeVar != null) {
            return ezeVar.i();
        }
        return null;
    }

    private void v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69459fd", new Object[]{this});
            return;
        }
        iyw iywVar = this.p;
        if (iywVar == null) {
            return;
        }
        iywVar.a(u());
    }

    private void a(h hVar, int i) {
        int i2;
        int i3;
        ezg a2;
        IpChange ipChange = $ipChange;
        int i4 = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1d6b4f34", new Object[]{this, hVar, new Integer(i)});
            return;
        }
        if (hVar == null || (a2 = ((ezc) hVar.getComponentData()).a()) == null) {
            i2 = 0;
            i3 = 0;
        } else {
            List m = a2.m();
            i3 = m.size();
            i2 = m.indexOf(hVar.getComponentData());
        }
        View view = this.l;
        if (i3 <= 0) {
            i4 = 8;
        }
        view.setVisibility(i4);
        if (this.K) {
            this.m.setText(String.valueOf(i + 1));
            this.n.setText(String.valueOf(n()));
            return;
        }
        this.m.setText(String.valueOf(i2 + 1));
        this.n.setText(String.valueOf(i3));
    }

    private int n() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6239de8", new Object[]{this})).intValue() : this.j.getCount();
    }

    private void x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b088ff", new Object[]{this});
            return;
        }
        android.support.constraint.c cVar = new android.support.constraint.c();
        cVar.b(this.d);
        if (this.K) {
            cVar.a(R.id.ll_index_container, 3);
            cVar.a(R.id.ll_index_container, 4, 0, 4, f.a(this.f27647a, 10.0f));
        } else {
            int i = ((ViewGroup.MarginLayoutParams) this.l.getLayoutParams()).topMargin;
            if (i <= 0) {
                i = f.a(this.f27647a, 86.0f);
            }
            cVar.a(R.id.ll_index_container, 4);
            cVar.a(R.id.ll_index_container, 3, 0, 3, i);
        }
        ae.a(this.d);
        cVar.c(this.d);
    }

    public <C extends com.taobao.android.detail.ttdetail.component.module.d> C d(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (C) ipChange.ipc$dispatch("e2267b00", new Object[]{this, str}) : (C) this.j.a(str);
    }

    public <C extends com.taobao.android.detail.ttdetail.component.module.d> C j(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (C) ipChange.ipc$dispatch("e6fd7206", new Object[]{this, str}) : (C) this.j.b(str);
    }

    public List<h> g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("d0410f19", new Object[]{this}) : this.j.a();
    }

    private ViewGroup p() {
        View findViewById;
        ViewGroup viewGroup;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("a8b0a73e", new Object[]{this});
        }
        Context context = this.f27647a;
        if ((context instanceof Activity) && (findViewById = ((Activity) context).findViewById(R.id.cl_image_holder_container)) != null && findViewById.getVisibility() == 0 && (viewGroup = (ViewGroup) ((Activity) this.f27647a).findViewById(R.id.ll_header_image_container)) != null) {
            return viewGroup;
        }
        return null;
    }

    private void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6158674", new Object[]{this});
            return;
        }
        ViewGroup p = p();
        if (p == null) {
            return;
        }
        int childCount = p.getChildCount();
        for (int i = 0; i < childCount; i++) {
            TTObservedImageView tTObservedImageView = (TTObservedImageView) p.getChildAt(i);
            Object tag = tTObservedImageView.getTag(R.id.tt_detail_preload_adapter_position);
            if (tag instanceof Integer) {
                ((ViewGroup.MarginLayoutParams) tTObservedImageView.getLayoutParams()).rightMargin = (int) (this.x * this.w);
                tTObservedImageView.setWidthRatio(this.j.getPageWidth(((Integer) tag).intValue()));
            }
        }
    }

    private boolean a(int i, ViewGroup viewGroup, int i2) {
        IpChange ipChange = $ipChange;
        int i3 = 0;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("85d46f6d", new Object[]{this, new Integer(i), viewGroup, new Integer(i2)})).booleanValue();
        }
        int i4 = i2;
        int i5 = i > 1 ? (int) (this.x * this.w) : 0;
        boolean z = false;
        while (i3 < i) {
            h a2 = this.j.a(i4);
            if (a2 != null) {
                String q = a2.q();
                TTObservedImageView tTObservedImageView = new TTObservedImageView(this.f27647a);
                tTObservedImageView.setTag(R.id.tt_detail_preload_adapter_position, Integer.valueOf(i4));
                tTObservedImageView.setWidthRatio(this.j.getPageWidth(i4));
                if (!StringUtils.isEmpty(q)) {
                    q.a(tTObservedImageView, 480, 480, l.a(q), -1, true, q.a(TaobaoImageUrlStrategy.ImageQuality.q30), false);
                    ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -1);
                    marginLayoutParams.rightMargin = i5;
                    viewGroup.addView(tTObservedImageView, marginLayoutParams);
                }
                z = true;
            }
            i3++;
            i4++;
        }
        return z;
    }

    private void y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6bea080", new Object[]{this});
            return;
        }
        com.taobao.android.detail.ttdetail.component.module.d dVar = null;
        if (this.b.a().c()) {
            h a2 = this.j.a(0);
            if (a2 != null) {
                dVar = a2.a(0);
            }
            if (!(dVar instanceof com.taobao.android.detail.ttdetail.component.module.k)) {
                return;
            }
            this.O = ((com.taobao.android.detail.ttdetail.component.module.k) dVar).r();
            this.P.put("preloadFrameUrl", (Object) this.O);
            this.P.put("preloadTraceId", this.b.e().a("traceId"));
            this.P.put("preloadItemId", this.b.e().a("requestItemId"));
        } else if (this.N || StringUtils.isEmpty(this.O)) {
        } else {
            h a3 = this.j.a(0);
            if (a3 != null) {
                dVar = a3.a(0);
            }
            if (!(dVar instanceof com.taobao.android.detail.ttdetail.component.module.k)) {
                return;
            }
            String r = ((com.taobao.android.detail.ttdetail.component.module.k) dVar).r();
            if (!StringUtils.equals(this.O, r)) {
                this.P.put("realFrameUrl", (Object) r);
                this.P.put("realTraceId", this.b.e().a("traceId"));
                this.P.put("realItemId", this.b.e().a("requestItemId"));
                m.b(19999, "Page_Detail_First_Frame_Different", this.P);
            }
            this.N = true;
        }
    }

    private void a(List<h> list) {
        IpChange ipChange = $ipChange;
        int i = 2;
        int i2 = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
        } else if (list == null || list.isEmpty()) {
        } else {
            int currentItem = this.i.getCurrentItem();
            this.k = -1;
            this.j.a(list);
            y();
            boolean z = this.L && this.j.getCount() > 1;
            this.i.setScrollCycle(z);
            if (z != this.M) {
                this.i.setAdapter(this.j);
            } else if (this.i.getAdapter() == null) {
                this.i.setAdapter(this.j);
            }
            this.M = z;
            int max = Math.max(0, Math.min(currentItem, this.j.getCount() - 1));
            this.j.notifyDataSetChanged();
            this.i.setCurrentItem(max, false);
            Boolean bool = this.z;
            boolean booleanValue = bool != null ? bool.booleanValue() : com.taobao.android.detail.ttdetail.utils.d.b((Feature) this.b.a().a(Feature.class));
            h a2 = this.j.a(max);
            a(a2, max);
            if (!this.J) {
                a(booleanValue, !this.y);
                this.y = false;
            }
            a(max, 0.0f);
            ViewGroup p = p();
            if (p != null && a2 != null && this.b.a().c()) {
                if (Float.compare(1.0f, this.j.getPageWidth(max)) == 0) {
                    i = 1;
                }
                if (a(i, p, max)) {
                    this.b.b().a(this.I, 1375L);
                }
            }
            String a3 = k.a(this.j.a(), max);
            TextView textView = this.o;
            if (StringUtils.isEmpty(a3)) {
                i2 = 8;
            }
            textView.setVisibility(i2);
            this.o.setText(a3);
        }
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        ezs ezsVar = this.f;
        if (ezsVar != null && ezsVar.isShowing()) {
            this.f.a(false);
        }
        com.taobao.android.detail.ttdetail.widget.video.a.a().e(this.f27647a);
        c.a(this.f27647a, this);
        this.g.e();
        this.i.destroy();
        com.taobao.android.detail.ttdetail.utils.a.a((int[]) null, this.j.a());
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        int i2 = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            return;
        }
        this.J = true;
        this.i.setMode(i);
        if (i == 1) {
            i2 = 1;
        }
        this.i.setModeScroll(i2);
    }

    private void e(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aef4ead4", new Object[]{this, new Float(f)});
        } else if (this.i.getMode() != 1) {
        } else {
            float f2 = 1.0f - f;
            iyw iywVar = this.p;
            if (iywVar != null) {
                iywVar.getIndicatorView().setAlpha(f2);
            }
            this.o.setAlpha(f2);
            if (this.K) {
                return;
            }
            float a2 = f.a(this.f27647a, 50.0f);
            ((ViewGroup.MarginLayoutParams) this.l.getLayoutParams()).topMargin = (int) (a2 + (f2 * a2));
            this.l.requestLayout();
        }
    }

    private boolean w() {
        Feature feature;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6a27182", new Object[]{this})).booleanValue();
        }
        if (!j.c() || (feature = (Feature) this.b.a().a(Feature.class)) == null) {
            return false;
        }
        return feature.isDetailNewLightOff();
    }
}
