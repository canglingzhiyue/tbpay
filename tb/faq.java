package tb;

import android.app.Activity;
import android.content.Context;
import mtopsdk.common.util.StringUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.kit.view.holder.desc.b;
import com.taobao.android.detail.core.event.basic.m;
import com.taobao.android.detail.core.utils.c;
import com.taobao.android.detail.datasdk.protocol.image.DetailImageView;
import com.taobao.android.detail.wrapper.ext.video.a;
import com.taobao.avplayer.av;
import com.taobao.avplayer.common.x;
import com.taobao.taobao.R;

/* loaded from: classes5.dex */
public class faq extends b<fbf> implements dyq {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private RelativeLayout k;
    private ImageView l;
    private fbf m;
    private dyr n;
    private a o;
    private int p;
    private View q;
    private boolean r;
    private m.a s;
    private av t;
    private x u;

    static {
        kge.a(1895561937);
        kge.a(-1260374780);
    }

    public static /* synthetic */ Object ipc$super(faq faqVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 90991720) {
            super.a();
            return null;
        } else if (hashCode == 1545161960) {
            super.a(((Boolean) objArr[0]).booleanValue(), ((Boolean) objArr[1]).booleanValue());
            return null;
        } else if (hashCode != 2121814399) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.G_();
            return null;
        }
    }

    private boolean j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5eb3ff5", new Object[]{this})).booleanValue();
        }
        return true;
    }

    @Override // com.taobao.android.detail.core.detail.kit.view.holder.desc.b, com.taobao.android.detail.core.detail.kit.view.holder.c
    public /* bridge */ /* synthetic */ void a(com.taobao.android.detail.datasdk.model.viewmodel.main.b bVar) {
    }

    @Override // com.taobao.android.detail.core.detail.kit.view.holder.desc.b
    public /* bridge */ /* synthetic */ void b(fbf fbfVar) {
    }

    /* renamed from: b  reason: avoid collision after fix types in other method */
    public boolean b2(fbf fbfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d6baa1f3", new Object[]{this, fbfVar})).booleanValue();
        }
        return false;
    }

    public static /* synthetic */ int a(faq faqVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1da26f34", new Object[]{faqVar, new Integer(i)})).intValue();
        }
        faqVar.p = i;
        return i;
    }

    public static /* synthetic */ boolean a(faq faqVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("e82e8406", new Object[]{faqVar})).booleanValue() : faqVar.i();
    }

    public static /* synthetic */ boolean a(faq faqVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1da2af16", new Object[]{faqVar, new Boolean(z)})).booleanValue();
        }
        faqVar.r = z;
        return z;
    }

    public static /* synthetic */ dyr b(faq faqVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (dyr) ipChange.ipc$dispatch("8e20cbc6", new Object[]{faqVar}) : faqVar.n;
    }

    public static /* synthetic */ Activity c(faq faqVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Activity) ipChange.ipc$dispatch("5656d424", new Object[]{faqVar}) : faqVar.g;
    }

    public static /* synthetic */ boolean d(faq faqVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("b3b79789", new Object[]{faqVar})).booleanValue() : faqVar.j();
    }

    public static /* synthetic */ int e(faq faqVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a23a9df9", new Object[]{faqVar})).intValue() : faqVar.p;
    }

    public static /* synthetic */ a f(faq faqVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("a594d840", new Object[]{faqVar}) : faqVar.o;
    }

    @Override // com.taobao.android.detail.core.detail.kit.view.holder.desc.b
    public /* synthetic */ boolean a(fbf fbfVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("e7480be1", new Object[]{this, fbfVar})).booleanValue() : b2(fbfVar);
    }

    @Override // com.taobao.android.detail.core.detail.kit.view.holder.desc.b
    public /* synthetic */ View c(fbf fbfVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("55e1d761", new Object[]{this, fbfVar}) : a2(fbfVar);
    }

    public faq(Activity activity) {
        super(activity);
        this.p = -1;
        this.r = false;
        this.t = new av() { // from class: tb.faq.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.avplayer.av
            public void onVideoFullScreen() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5dcccbde", new Object[]{this});
                }
            }

            @Override // com.taobao.avplayer.av
            public void onVideoInfo(Object obj, int i, int i2) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("4b7a5aed", new Object[]{this, obj, new Integer(i), new Integer(i2)});
                }
            }

            @Override // com.taobao.avplayer.av
            public void onVideoNormalScreen() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("ff4b0936", new Object[]{this});
                }
            }

            @Override // com.taobao.avplayer.av
            public void onVideoPause(boolean z) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("ee9d05f3", new Object[]{this, new Boolean(z)});
                }
            }

            @Override // com.taobao.avplayer.av
            public void onVideoPlay() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("931007b7", new Object[]{this});
                }
            }

            @Override // com.taobao.avplayer.av
            public void onVideoProgressChanged(int i, int i2, int i3) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("91a8a811", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
                }
            }

            @Override // com.taobao.avplayer.av
            public void onVideoSeekTo(int i) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("dd6694ad", new Object[]{this, new Integer(i)});
                }
            }

            @Override // com.taobao.avplayer.av
            public void onVideoStart() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("c2b2d56d", new Object[]{this});
                }
            }

            @Override // com.taobao.avplayer.av
            public void onVideoPrepared(Object obj) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("3faee61c", new Object[]{this, obj});
                } else if (!faq.d(faq.this) || faq.e(faq.this) <= 0) {
                } else {
                    faq.f(faq.this).a(faq.e(faq.this));
                }
            }

            @Override // com.taobao.avplayer.av
            public void onVideoError(Object obj, int i, int i2) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("a7a1a1cf", new Object[]{this, obj, new Integer(i), new Integer(i2)});
                    return;
                }
                faq.a(faq.this, 0);
                faq.a(faq.this, false);
            }

            @Override // com.taobao.avplayer.av
            public void onVideoComplete() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("d3c2c53c", new Object[]{this});
                    return;
                }
                if (faq.b(faq.this) != null) {
                    faq.b(faq.this).b(faq.this.h());
                }
                faq.a(faq.this, 0);
                faq.a(faq.this, false);
            }

            @Override // com.taobao.avplayer.av
            public void onVideoClose() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("24db3403", new Object[]{this});
                } else {
                    faq.a(faq.this, false);
                }
            }
        };
        this.u = new x() { // from class: tb.faq.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.avplayer.common.x
            public void a() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                }
            }

            @Override // com.taobao.avplayer.common.x
            public void b() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("57a83e9", new Object[]{this});
                }
            }
        };
        emu.a("com.taobao.android.detail.wrapper.ext.component.desc.viewholder.NBVideoViewHolder");
    }

    /* renamed from: a  reason: avoid collision after fix types in other method */
    public View a2(fbf fbfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("195b7430", new Object[]{this, fbfVar});
        }
        if (fbfVar == null || !ecu.d) {
            return null;
        }
        if (!StringUtils.isEmpty(fbfVar.b)) {
            float f = fbfVar.c / ((fbf) this.c).d;
            int i = epo.b;
            int i2 = (int) (f * epo.b);
            this.k = new RelativeLayout(this.g);
            this.k.setLayoutParams(new AbsListView.LayoutParams(-1, i2));
            DetailImageView detailImageView = new DetailImageView(this.g);
            detailImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            this.k.addView(detailImageView, new RelativeLayout.LayoutParams(-1, -1));
            if (!StringUtils.isEmpty(fbfVar.f27741a)) {
                a(detailImageView, fbfVar.f27741a, new epm(i, i2), null, null);
            } else {
                detailImageView.setBackgroundColor(c.a("#000000"));
            }
            c2(fbfVar);
            this.l = new ImageView(this.g);
            this.l.setImageResource(R.drawable.detail_tbavsdk_video_play);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams.addRule(13);
            this.k.addView(this.l, layoutParams);
            this.l.setOnClickListener(new View.OnClickListener() { // from class: tb.faq.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                        return;
                    }
                    if (faq.a(faq.this)) {
                        faq.this.G_();
                    }
                    if (faq.b(faq.this) == null && !faq.a(faq.this)) {
                        return;
                    }
                    com.taobao.android.detail.core.event.video.c.a((Context) faq.c(faq.this), (com.taobao.android.trade.event.c) null, true);
                    faq.this.a(-1);
                }
            });
            this.k.setContentDescription("视频");
            this.m = fbfVar;
        }
        return this.k;
    }

    private boolean i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5dd2874", new Object[]{this})).booleanValue();
        }
        Object a2 = ehj.a(this.g.hashCode() + "");
        if ((a2 instanceof Boolean) && ((Boolean) a2).booleanValue()) {
            return true;
        }
        View findViewById = this.g.findViewById(R.id.ll_filter);
        return findViewById != null && findViewById.getVisibility() == 0;
    }

    /* renamed from: c  reason: avoid collision after fix types in other method */
    private void c2(fbf fbfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c53da870", new Object[]{this, fbfVar});
            return;
        }
        this.q = LayoutInflater.from(this.g).inflate(R.layout.x_detail_desc_video_text_info, (ViewGroup) null);
        TextView textView = (TextView) this.q.findViewById(R.id.desc_video_text_info_title);
        TextView textView2 = (TextView) this.q.findViewById(R.id.desc_video_text_info_desc);
        if (!StringUtils.isEmpty(fbfVar.f) && !StringUtils.isEmpty(fbfVar.g)) {
            textView.setText(fbfVar.f);
            textView2.setText(fbfVar.g);
        }
        if (this.q.getParent() != null) {
            ((ViewGroup) this.q.getParent()).removeView(this.q);
        }
        this.k.addView(this.q, new RelativeLayout.LayoutParams(-1, -1));
    }

    @Override // com.taobao.android.detail.core.detail.kit.view.holder.desc.b, com.taobao.android.detail.core.detail.kit.view.holder.c, com.taobao.android.detail.core.detail.kit.view.holder.a
    public void G_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e78517f", new Object[]{this});
        } else if (this.c == 0 || StringUtils.isEmpty(((fbf) this.c).b)) {
        } else {
            if (this.o == null) {
                m mVar = new m(this.m.r, this.m.b, this.m.f27741a, this.k, this.m.d, this.m.c);
                mVar.b(this.m.z);
                mVar.a(((fbf) this.c).y);
                mVar.a(false);
                mVar.c(this.m.e);
                this.s = (m.a) mVar.getParam();
                this.o = new a();
            }
            super.G_();
        }
    }

    @Override // com.taobao.android.detail.core.detail.kit.view.holder.desc.b, com.taobao.android.detail.core.detail.kit.view.holder.c, com.taobao.android.detail.core.detail.kit.view.holder.a
    public void a(boolean z, boolean z2) {
        a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c194ce8", new Object[]{this, new Boolean(z), new Boolean(z2)});
            return;
        }
        super.a(z, z2);
        Object a2 = ehj.a(this.g.hashCode() + "");
        if (!(a2 instanceof Boolean) || !((Boolean) a2).booleanValue() || (aVar = this.o) == null) {
            return;
        }
        aVar.c();
    }

    @Override // com.taobao.android.detail.core.detail.kit.view.holder.desc.b, com.taobao.android.detail.core.detail.kit.view.holder.c
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        this.n = null;
        a aVar = this.o;
        if (aVar != null) {
            aVar.a((av) null);
            this.o.a((x) null);
            this.o.b();
            this.o = null;
        }
        super.a();
    }

    @Override // tb.dyq
    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else if (this.o == null || this.r) {
        } else {
            dyr dyrVar = this.n;
            if (dyrVar != null) {
                dyrVar.a(h(), this.p);
            }
            this.o.a(this.g, this.s, true);
            this.o.a(this.t);
            this.o.a(this.u);
            this.o.a();
            this.r = true;
            Object a2 = ehj.a(this.g.hashCode() + "");
            if (!(a2 instanceof Boolean) || !((Boolean) a2).booleanValue()) {
                return;
            }
            this.o.d();
        }
    }

    @Override // tb.dyq
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        a aVar = this.o;
        if (aVar == null) {
            return;
        }
        this.p = aVar.f();
        this.o.b();
        dyr dyrVar = this.n;
        if (dyrVar != null) {
            dyrVar.a(h());
        }
        this.r = false;
    }

    @Override // tb.dyq
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        a aVar = this.o;
        if (aVar == null) {
            return;
        }
        aVar.a();
    }

    @Override // tb.dyq
    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        a aVar = this.o;
        if (aVar == null) {
            return;
        }
        aVar.c();
    }

    @Override // tb.dyq
    public void b(boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90ff8829", new Object[]{this, new Boolean(z), new Boolean(z2)});
            return;
        }
        a aVar = this.o;
        if (aVar == null) {
            return;
        }
        aVar.a(z, z2);
    }

    @Override // tb.dyq
    public boolean f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[]{this})).booleanValue() : this.p < 0;
    }

    @Override // tb.dyq
    public void a(dyr dyrVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e6177b3b", new Object[]{this, dyrVar});
        } else {
            this.n = dyrVar;
        }
    }
}
