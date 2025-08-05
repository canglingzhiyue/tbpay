package com.taobao.mediaplay.playercontrol;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.media.DWViewUtil;
import com.taobao.mediaplay.MediaContext;
import com.taobao.mediaplay.MediaLifecycleType;
import com.taobao.mediaplay.playercontrol.MediaPlayNormalController;
import com.taobao.taobao.R;
import tb.kge;

/* loaded from: classes7.dex */
public class d implements com.taobao.mediaplay.b, b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private MediaContext f18061a;
    private FrameLayout b;
    private MediaPlayNormalController c;
    private e d;
    private ImageView e;
    private int f;
    private int g;
    private boolean h;
    private b i;

    static {
        kge.a(1124600643);
        kge.a(-41757031);
        kge.a(793014661);
    }

    @Override // com.taobao.mediaplay.playercontrol.b
    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        }
    }

    @Override // com.taobao.mediaplay.playercontrol.b
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        }
    }

    public static /* synthetic */ MediaContext a(d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MediaContext) ipChange.ipc$dispatch("417bf44c", new Object[]{dVar}) : dVar.f18061a;
    }

    public d(MediaContext mediaContext, boolean z) {
        this.f18061a = mediaContext;
        n();
        if (z) {
            o();
        }
    }

    private void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6239df5", new Object[]{this});
            return;
        }
        this.b = new FrameLayout(this.f18061a.getContext());
        this.f = R.drawable.mediaplay_sdk_pause;
        this.g = R.drawable.mediaplay_sdk_play;
        this.e = new ImageView(this.f18061a.getContext());
        this.e.setVisibility(8);
        this.e.setImageResource(R.drawable.mediaplay_sdk_play);
        this.b.addView(this.e, new FrameLayout.LayoutParams(DWViewUtil.dip2px(this.f18061a.getContext(), 62.0f), DWViewUtil.dip2px(this.f18061a.getContext(), 62.0f), 17));
        this.e.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.mediaplay.playercontrol.d.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                } else if (d.a(d.this) != null && d.a(d.this).getVideo() != null && d.a(d.this).getVideo().f() == 1) {
                    d.a(d.this).getVideo().c();
                } else if (d.a(d.this) != null && d.a(d.this).getVideo() != null && d.a(d.this).getVideo().f() == 2) {
                    d.a(d.this).getVideo().b();
                } else if (d.a(d.this) == null || d.a(d.this).getVideo() == null || d.a(d.this).getVideo().f() == 2) {
                } else {
                    d.a(d.this).getVideo().a();
                }
            }
        });
    }

    private void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("631b576", new Object[]{this});
        } else if (this.c != null) {
        } else {
            this.d = new e(this.f18061a, this.b);
            this.c = new MediaPlayNormalController(this.f18061a);
            this.c.setIMediaPlayControlListener(this.i);
            this.b.addView(this.c.getView(), new FrameLayout.LayoutParams(-1, -2, 80));
            this.f18061a.getVideo().a(this.d);
            this.f18061a.getVideo().a(this.c);
            this.c.setNormalControllerListener(new MediaPlayNormalController.a() { // from class: com.taobao.mediaplay.playercontrol.d.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.mediaplay.playercontrol.MediaPlayNormalController.a
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    } else {
                        d.this.a();
                    }
                }

                @Override // com.taobao.mediaplay.playercontrol.MediaPlayNormalController.a
                public void b() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("57a83e9", new Object[]{this});
                    } else {
                        d.this.b();
                    }
                }
            });
        }
    }

    public void a(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a42d9512", new Object[]{this, bVar});
            return;
        }
        this.i = bVar;
        MediaPlayNormalController mediaPlayNormalController = this.c;
        if (mediaPlayNormalController == null) {
            return;
        }
        mediaPlayNormalController.setIMediaPlayControlListener(bVar);
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        ImageView imageView = this.e;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        this.e.setVisibility(8);
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        ImageView imageView = this.e;
        if (imageView == null || imageView.getVisibility() == 0) {
            return;
        }
        this.e.setVisibility(0);
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        MediaPlayNormalController mediaPlayNormalController = this.c;
        if (mediaPlayNormalController == null) {
            return;
        }
        mediaPlayNormalController.showControllerInner();
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        MediaPlayNormalController mediaPlayNormalController = this.c;
        if (mediaPlayNormalController == null) {
            return;
        }
        mediaPlayNormalController.showControllerView();
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        MediaPlayNormalController mediaPlayNormalController = this.c;
        if (mediaPlayNormalController == null) {
            return;
        }
        mediaPlayNormalController.hideControllerView();
    }

    public void a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9501e36a", new Object[]{this, view});
            return;
        }
        MediaPlayNormalController mediaPlayNormalController = this.c;
        if (mediaPlayNormalController == null) {
            return;
        }
        mediaPlayNormalController.addFullScreenCustomView(view);
    }

    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        MediaPlayNormalController mediaPlayNormalController = this.c;
        if (mediaPlayNormalController == null) {
            return;
        }
        mediaPlayNormalController.removeFullScreenCustomView();
    }

    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
            return;
        }
        ImageView imageView = this.e;
        if (imageView == null) {
            return;
        }
        imageView.setImageResource(this.f);
    }

    public void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
            return;
        }
        ImageView imageView = this.e;
        if (imageView == null) {
            return;
        }
        imageView.setImageResource(this.g);
    }

    public void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb3ff1", new Object[]{this});
            return;
        }
        MediaPlayNormalController mediaPlayNormalController = this.c;
        if (mediaPlayNormalController == null) {
            return;
        }
        mediaPlayNormalController.hideControllerInner();
    }

    public boolean k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5f95776", new Object[]{this})).booleanValue();
        }
        MediaPlayNormalController mediaPlayNormalController = this.c;
        if (mediaPlayNormalController != null) {
            return mediaPlayNormalController.showing();
        }
        return false;
    }

    public ViewGroup l() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ViewGroup) ipChange.ipc$dispatch("e56c89c2", new Object[]{this}) : this.b;
    }

    public void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6158674", new Object[]{this});
            return;
        }
        this.h = true;
        MediaPlayNormalController mediaPlayNormalController = this.c;
        if (mediaPlayNormalController == null) {
            return;
        }
        mediaPlayNormalController.destroy();
    }

    @Override // com.taobao.mediaplay.b
    public void onLifecycleChanged(MediaLifecycleType mediaLifecycleType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a0fa27", new Object[]{this, mediaLifecycleType});
        } else if (MediaLifecycleType.PLAY != mediaLifecycleType || this.c != null || this.h) {
        } else {
            o();
        }
    }
}
