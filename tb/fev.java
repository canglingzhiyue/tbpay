package tb;

import android.app.Activity;
import android.content.Context;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.kit.view.holder.c;
import com.taobao.android.detail.core.event.basic.m;
import com.taobao.android.detail.core.utils.i;
import com.taobao.android.detail.datasdk.protocol.adapter.optional.ITrackAdapter;
import com.taobao.android.detail.datasdk.protocol.image.DetailImageView;
import com.taobao.android.detail.datasdk.protocol.image.b;
import com.taobao.android.detail.wrapper.ext.video.a;
import com.taobao.avplayer.av;
import com.taobao.avplayer.common.x;
import com.taobao.taobao.R;
import java.lang.reflect.Method;
import java.util.Map;
import tb.epl;

/* loaded from: classes5.dex */
public class fev extends c<few> implements dyq {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private RelativeLayout g;
    private ImageView h;
    private few i;
    private a j;
    private int k;
    private boolean l;
    private m.a m;
    private int n;
    private int o;
    private Method p;
    private av q;

    static {
        kge.a(-206360533);
        kge.a(-1260374780);
    }

    private boolean i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5dd2874", new Object[]{this})).booleanValue();
        }
        return true;
    }

    public static /* synthetic */ Object ipc$super(fev fevVar, String str, Object... objArr) {
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

    @Override // tb.dyq
    public void a(dyr dyrVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e6177b3b", new Object[]{this, dyrVar});
        }
    }

    public static /* synthetic */ int a(fev fevVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("24bc4735", new Object[]{fevVar, new Integer(i)})).intValue();
        }
        fevVar.k = i;
        return i;
    }

    public static /* synthetic */ Context a(fev fevVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("e7a433d9", new Object[]{fevVar}) : fevVar.f9568a;
    }

    public static /* synthetic */ void a(fev fevVar, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d005c075", new Object[]{fevVar, str, str2});
        } else {
            fevVar.a(str, str2);
        }
    }

    public static /* synthetic */ boolean a(fev fevVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("24bc8717", new Object[]{fevVar, new Boolean(z)})).booleanValue();
        }
        fevVar.l = z;
        return z;
    }

    public static /* synthetic */ boolean b(fev fevVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d6ec2e66", new Object[]{fevVar})).booleanValue() : fevVar.i();
    }

    public static /* synthetic */ int c(fev fevVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("c56f34d6", new Object[]{fevVar})).intValue() : fevVar.k;
    }

    public static /* synthetic */ a d(fev fevVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("4aa5f45d", new Object[]{fevVar}) : fevVar.j;
    }

    public fev(Activity activity) {
        super(activity);
        this.k = -1;
        this.l = false;
        this.q = new av() { // from class: tb.fev.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.avplayer.av
            public void onVideoInfo(Object obj, int i, int i2) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("4b7a5aed", new Object[]{this, obj, new Integer(i), new Integer(i2)});
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
                    return;
                }
                fev fevVar = fev.this;
                fev.a(fevVar, "vacation_detail_video_play", eps.a(ITrackAdapter.TrackExtra.SPM_AB) + ".video.d1");
            }

            @Override // com.taobao.avplayer.av
            public void onVideoPause(boolean z) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("ee9d05f3", new Object[]{this, new Boolean(z)});
                    return;
                }
                fev fevVar = fev.this;
                fev.a(fevVar, "vacation_detail_video_pause", eps.a(ITrackAdapter.TrackExtra.SPM_AB) + ".video.d2");
            }

            @Override // com.taobao.avplayer.av
            public void onVideoPlay() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("931007b7", new Object[]{this});
                    return;
                }
                fev fevVar = fev.this;
                fev.a(fevVar, "vacation_detail_video_play", eps.a(ITrackAdapter.TrackExtra.SPM_AB) + ".video.d1");
            }

            @Override // com.taobao.avplayer.av
            public void onVideoPrepared(Object obj) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("3faee61c", new Object[]{this, obj});
                } else if (!fev.b(fev.this) || fev.c(fev.this) <= 0) {
                } else {
                    fev.d(fev.this).a(fev.c(fev.this));
                }
            }

            @Override // com.taobao.avplayer.av
            public void onVideoError(Object obj, int i, int i2) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("a7a1a1cf", new Object[]{this, obj, new Integer(i), new Integer(i2)});
                    return;
                }
                fev.a(fev.this, 0);
                fev.a(fev.this, false);
            }

            @Override // com.taobao.avplayer.av
            public void onVideoComplete() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("d3c2c53c", new Object[]{this});
                    return;
                }
                fev.a(fev.this, 0);
                fev.a(fev.this, false);
            }

            @Override // com.taobao.avplayer.av
            public void onVideoClose() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("24db3403", new Object[]{this});
                } else {
                    fev.a(fev.this, false);
                }
            }

            @Override // com.taobao.avplayer.av
            public void onVideoFullScreen() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5dcccbde", new Object[]{this});
                    return;
                }
                fev fevVar = fev.this;
                fev.a(fevVar, "vacation_detail_video_fullscreen", eps.a(ITrackAdapter.TrackExtra.SPM_AB) + ".video.d3");
            }

            @Override // com.taobao.avplayer.av
            public void onVideoNormalScreen() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("ff4b0936", new Object[]{this});
                    return;
                }
                fev fevVar = fev.this;
                fev.a(fevVar, "vacation_detail_video_normal_screen", eps.a(ITrackAdapter.TrackExtra.SPM_AB) + ".video.d4");
            }
        };
        emu.a("com.taobao.android.detail.wrapper.ext.video.simplevideo.SimpleVideoViewHolder");
    }

    @Override // com.taobao.android.detail.core.detail.kit.view.holder.c
    public void a(few fewVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8699c40", new Object[]{this, fewVar});
            return;
        }
        this.i = fewVar;
        if (this.i == null) {
            return;
        }
        h();
    }

    @Override // com.taobao.android.detail.core.detail.kit.view.holder.c
    public View a(Context context, ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("f1543f21", new Object[]{this, context, viewGroup});
        }
        if (!ecu.d) {
            return null;
        }
        this.g = new RelativeLayout(this.f9568a);
        this.n = epo.b;
        this.o = (int) (epo.b * 0.5625f);
        this.g.setLayoutParams(new AbsListView.LayoutParams(-1, this.o));
        return this.g;
    }

    private void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
        } else if (StringUtils.isEmpty(this.i.b)) {
        } else {
            DetailImageView detailImageView = new DetailImageView(this.f9568a);
            detailImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            this.g.addView(detailImageView, new RelativeLayout.LayoutParams(-1, -1));
            if (!StringUtils.isEmpty(this.i.f27874a)) {
                a(detailImageView, this.i.f27874a, new epm(this.n, this.o), null, null);
            } else {
                detailImageView.setBackgroundColor(com.taobao.android.detail.core.utils.c.a("#000000"));
            }
            this.h = new ImageView(this.f9568a);
            this.h.setImageResource(R.drawable.detail_tbavsdk_video_play);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams.addRule(13);
            this.g.addView(this.h, layoutParams);
            this.h.setOnClickListener(new View.OnClickListener() { // from class: tb.fev.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                        return;
                    }
                    com.taobao.android.detail.core.event.video.c.a(fev.a(fev.this), (com.taobao.android.trade.event.c) null, true);
                    fev.this.a(-1);
                }
            });
            this.g.setContentDescription("视频");
        }
    }

    @Override // com.taobao.android.detail.core.detail.kit.view.holder.c, com.taobao.android.detail.core.detail.kit.view.holder.a
    public void G_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e78517f", new Object[]{this});
            return;
        }
        few fewVar = this.i;
        if (fewVar == null || StringUtils.isEmpty(fewVar.b)) {
            return;
        }
        if (this.j == null) {
            m mVar = new m(this.i.g, this.i.b, this.i.f27874a, this.g, this.i.d, this.i.c);
            mVar.a(false);
            mVar.c(this.i.e);
            this.m = (m.a) mVar.getParam();
            this.j = new a();
        }
        super.G_();
    }

    @Override // com.taobao.android.detail.core.detail.kit.view.holder.c, com.taobao.android.detail.core.detail.kit.view.holder.a
    public void a(boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c194ce8", new Object[]{this, new Boolean(z), new Boolean(z2)});
            return;
        }
        e();
        super.a(z, z2);
    }

    @Override // com.taobao.android.detail.core.detail.kit.view.holder.c
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        a aVar = this.j;
        if (aVar != null) {
            aVar.a((av) null);
            this.j.a((x) null);
            this.j.b();
            this.j = null;
        }
        super.a();
    }

    @Override // tb.dyq
    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            return;
        }
        a aVar = this.j;
        if (aVar == null || this.l) {
            return;
        }
        aVar.a(this.f9568a, this.m, true);
        this.j.a(this.q);
        this.j.a();
        this.l = true;
    }

    @Override // tb.dyq
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        a aVar = this.j;
        if (aVar == null) {
            return;
        }
        this.k = aVar.f();
        this.j.b();
        this.l = false;
    }

    @Override // tb.dyq
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        a aVar = this.j;
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
        a aVar = this.j;
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
        a aVar = this.j;
        if (aVar == null) {
            return;
        }
        aVar.a(z, z2);
    }

    @Override // tb.dyq
    public boolean f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[]{this})).booleanValue() : this.k < 0;
    }

    private void a(String str, String str2) {
        try {
            if (this.p == null) {
                this.p = Class.forName("com.taobao.android.detail.fliggy.common.FliggyUtils").getDeclaredMethod("uploadClickProps", Context.class, String.class, Map.class, String.class);
            }
            if (this.p == null) {
                return;
            }
            this.p.invoke(null, this.f9568a, str, null, str2);
        } catch (Exception e) {
            i.a("FVideoViewHolder", e.getMessage());
        }
    }

    public void a(DetailImageView detailImageView, String str, epm epmVar, b bVar, epl eplVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ecdd69e", new Object[]{this, detailImageView, str, epmVar, bVar, eplVar});
        } else if (detailImageView == null || StringUtils.isEmpty(str)) {
        } else {
            epl eplVar2 = null;
            if (eplVar != null) {
                epl.a c = new epl.a().b(eplVar.a()).b(eplVar.e()).a(eplVar.c()).a(eplVar.d()).c(eplVar.b());
                if (epmVar != null) {
                    c.c(epmVar.f27510a).d(epmVar.b);
                }
                eplVar2 = c.a();
            }
            com.taobao.android.detail.datasdk.protocol.adapter.core.c b = epj.b();
            if (b == null) {
                return;
            }
            b.a(str, detailImageView, eplVar2, bVar);
        }
    }
}
