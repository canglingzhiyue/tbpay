package tb;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.kit.view.holder.desc.b;
import com.taobao.android.detail.core.utils.i;
import com.taobao.android.detail.wrapper.nav.c;
import com.taobao.avplayer.au;
import com.taobao.avplayer.bj;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.util.HashMap;

/* loaded from: classes5.dex */
public class fam extends b<com.taobao.android.detail.core.model.viewmodel.main.a> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static String k;
    private FrameLayout l;
    private TUrlImageView m;
    private com.taobao.android.detail.core.model.viewmodel.main.a n;
    private bj o;

    public static /* synthetic */ Object ipc$super(fam famVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.android.detail.core.detail.kit.view.holder.desc.b, com.taobao.android.detail.core.detail.kit.view.holder.c
    public /* bridge */ /* synthetic */ void a(com.taobao.android.detail.datasdk.model.viewmodel.main.b bVar) {
    }

    @Override // com.taobao.android.detail.core.detail.kit.view.holder.desc.b
    public /* bridge */ /* synthetic */ void b(com.taobao.android.detail.core.model.viewmodel.main.a aVar) {
    }

    /* renamed from: b  reason: avoid collision after fix types in other method */
    public boolean b2(com.taobao.android.detail.core.model.viewmodel.main.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2d0dfb1b", new Object[]{this, aVar})).booleanValue();
        }
        return false;
    }

    public static /* synthetic */ bj a(fam famVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (bj) ipChange.ipc$dispatch("83578a71", new Object[]{famVar}) : famVar.o;
    }

    public static /* synthetic */ FrameLayout b(fam famVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FrameLayout) ipChange.ipc$dispatch("6373e372", new Object[]{famVar}) : famVar.l;
    }

    public static /* synthetic */ String c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bd025a76", new Object[0]) : k;
    }

    @Override // com.taobao.android.detail.core.detail.kit.view.holder.desc.b
    public /* synthetic */ boolean a(com.taobao.android.detail.core.model.viewmodel.main.a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("e7480be1", new Object[]{this, aVar})).booleanValue() : b2(aVar);
    }

    @Override // com.taobao.android.detail.core.detail.kit.view.holder.desc.b
    public /* synthetic */ View c(com.taobao.android.detail.core.model.viewmodel.main.a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("55e1d761", new Object[]{this, aVar}) : a2(aVar);
    }

    static {
        kge.a(-505969667);
        k = fam.class.getSimpleName();
    }

    public fam(Activity activity) {
        super(activity);
        emu.a("com.taobao.android.detail.wrapper.ext.component.desc.viewholder.DescGifViewHolder");
    }

    /* renamed from: a  reason: avoid collision after fix types in other method */
    public View a2(com.taobao.android.detail.core.model.viewmodel.main.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("fb7149fa", new Object[]{this, aVar});
        }
        if (aVar == null) {
            return null;
        }
        this.n = aVar;
        this.l = (FrameLayout) View.inflate(this.g, R.layout.x_detail_main_gif, null);
        this.m = (TUrlImageView) this.l.findViewById(R.id.detail_gif_image);
        this.m.setPlaceHoldImageResId(R.drawable.detail_img_load_fail);
        this.m.setSkipAutoSize(false);
        this.m.setScaleType(ImageView.ScaleType.CENTER_CROP);
        this.m.getLayoutParams().height = (int) ((aVar.d / ((com.taobao.android.detail.core.model.viewmodel.main.a) this.c).e) * epo.b);
        this.m.getLayoutParams().width = epo.b;
        this.m.setImageUrl(aVar.f9762a);
        d();
        f();
        this.o.c();
        return this.l;
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        bj.a aVar = new bj.a(this.g);
        aVar.c(this.n.c);
        aVar.a(this.n.b);
        aVar.b(this.n.f9762a);
        aVar.c(true);
        aVar.d(c.STDPOP_POP_ID_DETAIL);
        aVar.d(true);
        aVar.a(e());
        aVar.b(true);
        aVar.a(epo.b);
        aVar.b((int) ((this.n.d / ((com.taobao.android.detail.core.model.viewmodel.main.a) this.c).e) * epo.b));
        aVar.a(true);
        this.o = aVar.a();
        this.o.a(new a());
        this.o.a();
    }

    private HashMap<String, String> e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("e742bccf", new Object[]{this});
        }
        HashMap<String, String> hashMap = new HashMap<>();
        if (this.n.f != null) {
            for (String str : this.n.f.keySet()) {
                Object obj = this.n.f.get(str);
                if (obj instanceof String) {
                    hashMap.put(str, obj.toString());
                }
            }
        }
        return hashMap;
    }

    /* loaded from: classes5.dex */
    public class a implements au {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(495738678);
            kge.a(1497191039);
        }

        private a() {
        }

        @Override // com.taobao.avplayer.au
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            } else {
                i.d(fam.c(), "video start");
            }
        }

        @Override // com.taobao.avplayer.au
        public void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            } else {
                i.d(fam.c(), "video pause");
            }
        }

        @Override // com.taobao.avplayer.au
        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            } else {
                i.d(fam.c(), "video play");
            }
        }

        @Override // com.taobao.avplayer.au
        public void a(Object obj, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b137f1a4", new Object[]{this, obj, new Integer(i), new Integer(i2)});
                return;
            }
            i.a(fam.c(), "video error");
            if (fam.a(fam.this) == null || fam.a(fam.this).b() == null) {
                return;
            }
            fam.b(fam.this).removeView(fam.a(fam.this).b());
            fam.a(fam.this).f();
        }

        @Override // com.taobao.avplayer.au
        public void d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            } else {
                i.d(fam.c(), "video complete");
            }
        }
    }

    private void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        View b = this.o.b();
        if (b.getParent() != null) {
            ((ViewGroup) b).removeView(b);
        }
        this.l.addView(b, new FrameLayout.LayoutParams(epo.b, (int) ((this.n.d / ((com.taobao.android.detail.core.model.viewmodel.main.a) this.c).e) * epo.b)));
    }

    private void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
            return;
        }
        FrameLayout frameLayout = this.l;
        if (frameLayout == null) {
            return;
        }
        frameLayout.removeAllViews();
        this.l = null;
    }

    @Override // com.taobao.android.detail.core.detail.kit.view.holder.desc.b, com.taobao.android.detail.core.detail.kit.view.holder.c, com.taobao.android.detail.core.detail.kit.view.holder.a
    public void G_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e78517f", new Object[]{this});
            return;
        }
        bj bjVar = this.o;
        if (bjVar == null) {
            return;
        }
        bjVar.d();
    }

    @Override // com.taobao.android.detail.core.detail.kit.view.holder.desc.b, com.taobao.android.detail.core.detail.kit.view.holder.c
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        bj bjVar = this.o;
        if (bjVar != null && bjVar.b() != null) {
            this.o.e();
            this.l.removeView(this.o.b());
            this.o.f();
        }
        i();
    }
}
