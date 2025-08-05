package com.taobao.android.detail.wrapper.ext.video;

import android.app.Activity;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.activity.DetailCoreActivity;
import com.taobao.android.detail.core.detail.fragment.desc.video.view.PopDialogSource;
import com.taobao.android.detail.core.event.video.DetailVideoSource;
import com.taobao.android.detail.core.utils.i;
import com.taobao.android.detail.datasdk.event.video.GallerySourceType;
import com.taobao.android.trade.event.Event;
import com.taobao.android.trade.event.ThreadMode;
import com.taobao.android.trade.event.j;
import com.taobao.avplayer.DWInstance;
import com.taobao.taobao.R;
import java.util.HashMap;
import java.util.Map;
import tb.dyy;
import tb.ecf;
import tb.ecu;
import tb.edg;
import tb.eie;
import tb.emu;
import tb.eno;
import tb.kge;

/* loaded from: classes5.dex */
public class b implements View.OnClickListener, j, eie {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Activity f11389a;
    private HashMap<String, String> b;
    private HashMap<String, String> c;
    private dyy d;
    private DWInstance e;
    private View f;
    private f g;
    private c h;
    private boolean i;
    private boolean j;
    private boolean k;

    static {
        kge.a(-1019839009);
        kge.a(-1453870097);
        kge.a(-1201612728);
        kge.a(1664497163);
    }

    public b() {
        emu.a("com.taobao.android.detail.wrapper.ext.video.DetailMinVideoController");
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        Activity activity = this.f11389a;
        if (!(activity instanceof DetailCoreActivity) || ((DetailCoreActivity) activity).y() == null || ((DetailCoreActivity) this.f11389a).y().t == null) {
            return;
        }
        com.taobao.android.detail.datasdk.model.datamodel.node.c cVar = ((DetailCoreActivity) this.f11389a).y().t;
        this.b = new HashMap<>();
        this.b.put("item_id", cVar.i());
        this.b.put("shop_id", cVar.o());
        this.b.put("seller_id", cVar.h());
        Map<String, String> g = cVar.g();
        if (g == null) {
            return;
        }
        this.b.putAll(g);
    }

    private void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        if (this.c == null) {
            this.c = new HashMap<>();
            if (this.b == null) {
                d();
            }
            HashMap<String, String> hashMap = this.b;
            if (hashMap != null) {
                this.c.putAll(hashMap);
            }
            this.c.put("spm", "a2141.7631564.5040675");
        }
        this.c.put("sourcetype", str);
        com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.core.c.a(this.f11389a, "Page_Detail_Show_MiniVideo", this.c);
    }

    private void a(f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8599c0bc", new Object[]{this, fVar});
        } else if (this.d == null || fVar == null || fVar.b == null || fVar.f11393a == null) {
        } else {
            if (fVar.c == DetailVideoSource.GALLERY) {
                a(com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.subitem.d.V_SOURCE_TYPE);
            } else {
                a("Product");
            }
            this.e = fVar.f11393a;
            this.f = fVar.b;
            this.k = false;
            if (e()) {
                this.d.j();
            }
            if (this.e != null) {
                if (ecu.e) {
                    this.e.showOrHideInteractive(false);
                }
                this.e.setFrame(fVar.d, fVar.e);
                this.e.hideController();
                try {
                    this.d.a(fVar.b, fVar.d, fVar.e);
                } catch (Exception unused) {
                }
            }
            if (this.d.i() != null) {
                this.d.i().setOnClickListener(this);
            }
            if (this.d.h() == null) {
                return;
            }
            this.d.h().setOnClickListener(this);
        }
    }

    private void a(boolean z) {
        com.taobao.android.trade.event.d a2;
        edg edgVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        dyy dyyVar = this.d;
        if (dyyVar == null || this.e == null) {
            return;
        }
        dyyVar.j();
        try {
            try {
                if (ecu.e && this.e != null) {
                    this.e.showOrHideInteractive(true);
                }
                if (this.e != null && z) {
                    this.e.pauseVideo();
                }
                if (this.e != null) {
                    this.e.showController();
                }
                a2 = com.taobao.android.trade.event.f.a(this.f11389a);
                edgVar = new edg();
            } catch (Exception e) {
                i.a("DetailMinVideoController", "", e);
                a2 = com.taobao.android.trade.event.f.a(this.f11389a);
                edgVar = new edg();
            }
            a2.a(edgVar);
            if (this.d.i() != null) {
                this.d.i().setOnClickListener(null);
            }
            if (this.d.h() != null && this.f != null) {
                this.d.h().setOnClickListener(null);
            }
            this.e = null;
            this.k = false;
        } catch (Throwable th) {
            com.taobao.android.trade.event.f.a(this.f11389a).a(new edg());
            throw th;
        }
    }

    private boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[]{this})).booleanValue();
        }
        dyy dyyVar = this.d;
        return (dyyVar == null || dyyVar.h() == null || this.d.h().getChildCount() <= 1) ? false : true;
    }

    @Override // tb.eie
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        DWInstance dWInstance = this.e;
        if (dWInstance == null) {
            return;
        }
        this.j = dWInstance.isMute();
        i.d("MyLog", "DetailMiniVideoController--> onPause. mIsInited == " + this.i + ", mIsMute == " + this.j);
    }

    @Override // tb.eie
    public void a(Activity activity, dyy dyyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c5af126", new Object[]{this, activity, dyyVar});
            return;
        }
        this.f11389a = activity;
        this.d = dyyVar;
        this.i = false;
        com.taobao.android.trade.event.d a2 = com.taobao.android.trade.event.f.a(activity);
        if (a2 == null) {
            return;
        }
        a2.a(eno.a(f.class), this);
        a2.a(eno.a(com.taobao.android.detail.core.event.video.a.class), this);
        a2.a(eno.a(com.taobao.android.detail.core.event.video.i.class), this);
        a2.a(eno.a(com.taobao.android.detail.core.event.video.d.class), this);
        a2.a(eno.a(com.taobao.android.detail.core.event.video.b.class), this);
    }

    @Override // tb.eie
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        if (this.i && this.e != null) {
            i.d("MyLog", "DetailMiniVideoController--> onResume. mIsInited == " + this.i + ", mIsMute == " + this.j);
            this.e.mute(this.j);
        }
        this.i = true;
    }

    @Override // tb.eie
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        com.taobao.android.trade.event.d a2 = com.taobao.android.trade.event.f.a(this.f11389a);
        if (a2 == null) {
            return;
        }
        a2.b(eno.a(f.class), this);
        a2.b(eno.a(com.taobao.android.detail.core.event.video.a.class), this);
        a2.b(eno.a(com.taobao.android.detail.core.event.video.i.class), this);
        a2.b(eno.a(com.taobao.android.detail.core.event.video.d.class), this);
        a2.b(eno.a(com.taobao.android.detail.core.event.video.b.class), this);
    }

    @Override // com.taobao.android.trade.event.j
    public com.taobao.android.trade.event.i handleEvent(Event event) {
        f fVar;
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.trade.event.i) ipChange.ipc$dispatch("caa7474e", new Object[]{this, event});
        }
        if (eno.a(f.class) == event.getEventId()) {
            f fVar2 = (f) event;
            this.g = fVar2;
            a(fVar2);
            return com.taobao.android.trade.event.i.SUCCESS;
        } else if (eno.a(com.taobao.android.detail.core.event.video.a.class) == event.getEventId()) {
            a(((com.taobao.android.detail.core.event.video.a) event).f9737a);
            return com.taobao.android.trade.event.i.SUCCESS;
        } else if (eno.a(com.taobao.android.detail.core.event.video.d.class) == event.getEventId()) {
            com.taobao.android.detail.core.event.video.e eVar = new com.taobao.android.detail.core.event.video.e();
            eVar.f9738a = e();
            return eVar;
        } else if (eno.a(com.taobao.android.detail.core.event.video.b.class) == event.getEventId()) {
            this.k = true;
            DWInstance dWInstance = this.e;
            if (dWInstance != null) {
                dWInstance.showController();
            }
            return com.taobao.android.trade.event.i.SUCCESS;
        } else if (eno.a(com.taobao.android.detail.core.event.video.i.class) == event.getEventId()) {
            boolean z2 = this.k;
            if (this.e != null) {
                z = true;
            }
            if ((z2 & z) && (fVar = this.g) != null) {
                if (fVar.f11393a.getVideoState() == 1) {
                    a(this.g);
                } else {
                    a(true);
                }
            } else if (this.k && this.e == null) {
                a(true);
            }
            return com.taobao.android.trade.event.i.SUCCESS;
        } else {
            return com.taobao.android.trade.event.i.FAILURE;
        }
    }

    @Override // com.taobao.android.trade.event.j
    public ThreadMode getThreadMode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ThreadMode) ipChange.ipc$dispatch("6de50c9b", new Object[]{this}) : ThreadMode.MainThread;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
        } else if (view == this.d.i()) {
            f fVar = this.g;
            if (fVar != null && fVar.c == DetailVideoSource.GALLERY) {
                ecf.b(this.f11389a, com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.subitem.d.V_SOURCE_TYPE);
            } else {
                ecf.b(this.f11389a, "Product");
            }
            a(true);
        } else if (view != this.d.h() || !e()) {
        } else {
            ecf.g(this.f11389a);
            f fVar2 = this.g;
            if (fVar2 != null && fVar2.c == DetailVideoSource.GALLERY) {
                if (ecu.e) {
                    this.e.showOrHideInteractive(true);
                }
                com.taobao.android.detail.core.event.video.c.a(this.f11389a, (com.taobao.android.trade.event.c) null, GallerySourceType.MIN_VIDEO);
                this.e.mute(false);
                this.e.showController();
                this.k = true;
                this.d.j();
            } else if (this.g == null) {
            } else {
                if (this.h == null) {
                    this.h = new c(this.f11389a, R.style.Dialog_Fullscreen, this.e);
                }
                if (ecu.e) {
                    this.e.showOrHideInteractive(true);
                }
                this.h.a(this.e, PopDialogSource.MIN_VIDEO, this.f, this.g.f, this.g.f);
                this.k = true;
            }
        }
    }
}
