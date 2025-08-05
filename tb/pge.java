package tb;

import android.content.Context;
import android.graphics.Color;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.taobao.R;
import com.taobao.taolive.movehighlight.utils.o;
import com.taobao.taolive.sdk.ui.component.VideoFrame2;
import com.taobao.taolive.sdk.ui.media.playercontrol.PlayerController2;
import com.taobao.taolive.sdk.ui.media.playercontrol.a;
import com.taobao.taolive.sdk.ui.media.playercontrol.b;
import com.taobao.taolive.sdk.ui.media.playercontrol.c;

/* loaded from: classes8.dex */
public class pge {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public a f32621a;
    public DXRootView b;
    public View c;
    public FrameLayout d;
    public LinearLayout e;
    private Context f;
    private VideoFrame2 g;
    private DXWidgetNode h;
    private PlayerController2 i;
    public pgf j;
    private com.taobao.alilive.aliliveframework.frame.a k;

    static {
        kge.a(247042816);
    }

    public static /* synthetic */ com.taobao.alilive.aliliveframework.frame.a a(pge pgeVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.alilive.aliliveframework.frame.a) ipChange.ipc$dispatch("b381127f", new Object[]{pgeVar}) : pgeVar.k;
    }

    public static /* synthetic */ void a(pge pgeVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3834b979", new Object[]{pgeVar, new Integer(i)});
        } else {
            pgeVar.b(i);
        }
    }

    public static /* synthetic */ VideoFrame2 b(pge pgeVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (VideoFrame2) ipChange.ipc$dispatch("5b9079e0", new Object[]{pgeVar}) : pgeVar.g;
    }

    public pge(DXWidgetNode dXWidgetNode, Context context, com.taobao.alilive.aliliveframework.frame.a aVar) {
        this.h = dXWidgetNode;
        this.k = aVar;
        this.f = context;
        c();
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        this.j = pfb.a(this.k).b();
        pgf pgfVar = this.j;
        if (pgfVar == null || pgfVar.c == null) {
            return;
        }
        this.c = LayoutInflater.from(this.f).inflate(R.layout.taolive_highlight_dx_play_controller_layout_new, (ViewGroup) null);
        this.d = (FrameLayout) this.c.findViewById(R.id.highlight_isSpeakingLayout);
        this.e = (LinearLayout) this.c.findViewById(R.id.highlight_playerLayout);
        this.f32621a = d();
        this.g = this.j.c;
        a();
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        this.i = this.g.getPlayerController();
        this.i.setControllerHolder(this.f32621a);
        this.i.defaultPlayRateViewText = "1.0X";
        this.d.removeAllViews();
        this.b = pfx.a().a(this.f, "higlight_room_living_state");
        this.d.addView(this.b);
        b();
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        com.taobao.alilive.aliliveframework.frame.a aVar = this.k;
        if (aVar != null && (aVar.H() instanceof ipx)) {
            a(((ipx) this.k.H()).c);
        } else {
            a(0);
        }
        boolean parseBoolean = Boolean.parseBoolean(str);
        if (this.b != null && this.h != null && parseBoolean) {
            pfx.a().a(this.b, this.h.getDXRuntimeContext().e(), this.k);
        }
        a(parseBoolean);
        b();
    }

    public void b() {
        a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (this.i == null || (aVar = this.f32621a) == null || aVar.h == null) {
        } else {
            this.i.setIPlayForwardListener(new b() { // from class: tb.pge.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.taolive.sdk.ui.media.playercontrol.b
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    } else {
                        o.a(pge.a(pge.this), "Forward", new String[0]);
                    }
                }

                @Override // com.taobao.taolive.sdk.ui.media.playercontrol.b
                public void b() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("57a83e9", new Object[]{this});
                    } else {
                        o.a(pge.a(pge.this), "Backword", new String[0]);
                    }
                }
            });
            this.i.setmPlayOrPauseButtonListener(new PlayerController2.a() { // from class: tb.pge.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.taolive.sdk.ui.media.playercontrol.PlayerController2.a
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    } else {
                        pge.b(pge.this).setSkipResumePlay(false);
                    }
                }

                @Override // com.taobao.taolive.sdk.ui.media.playercontrol.PlayerController2.a
                public void b() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("57a83e9", new Object[]{this});
                    } else {
                        pge.b(pge.this).setSkipResumePlay(true);
                    }
                }
            });
            this.i.setPlayRateListener(new c() { // from class: tb.pge.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.taolive.sdk.ui.media.playercontrol.c
                public boolean a(int i) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Boolean) ipChange2.ipc$dispatch("a821939f", new Object[]{this, new Integer(i)})).booleanValue();
                    }
                    pge.this.a(i);
                    pge.a(pge.this, i);
                    return false;
                }
            });
        }
    }

    private void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
            return;
        }
        com.taobao.alilive.aliliveframework.frame.a aVar = this.k;
        if (aVar == null || !(aVar.H() instanceof ipx)) {
            return;
        }
        ((ipx) this.k.H()).c = i;
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            return;
        }
        a aVar = this.f32621a;
        if (aVar == null || aVar.h == null) {
            return;
        }
        if (i != 0) {
            o.a(this.k, "HighlightPlayRate", new String[0]);
            if (i == 1) {
                this.f32621a.h.setText("1.5X");
            } else if (i == 2) {
                this.f32621a.h.setText("2.0X");
            }
            this.f32621a.h.setBackground(ContextCompat.getDrawable(this.f, R.drawable.taolive_highlight_dx_oval_bg_select));
            this.f32621a.h.setTextColor(Color.parseColor("#333333"));
            return;
        }
        this.f32621a.h.setText("1.0X");
        this.f32621a.h.setBackground(ContextCompat.getDrawable(this.f, R.drawable.taolive_highlight_dx_oval_bg));
        this.f32621a.h.setTextColor(Color.parseColor("#FFFFFF"));
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        FrameLayout frameLayout = this.d;
        if (frameLayout == null || this.e == null) {
            return;
        }
        if (z) {
            frameLayout.setVisibility(0);
            this.e.setVisibility(4);
            return;
        }
        frameLayout.setVisibility(4);
        this.e.setVisibility(0);
    }

    private a d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("9f4dd66b", new Object[]{this});
        }
        a aVar = new a();
        aVar.f21955a = this.c.findViewById(R.id.taolive_highlight_dx_play_layout);
        aVar.c = (ImageView) this.c.findViewById(R.id.taolive_highlight_dx_video_enter_btn);
        aVar.f = (SeekBar) this.c.findViewById(R.id.taolive_highlight_dx_video_seekbar);
        aVar.h = (TextView) this.c.findViewById(R.id.taolive_highlight_dx_controller_playrate_icon);
        aVar.i = R.drawable.taolive_highlight_video_play_new;
        aVar.j = R.drawable.taolive_highlight_video_pause_new;
        return aVar;
    }
}
