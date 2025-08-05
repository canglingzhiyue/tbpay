package com.taobao.search.musie.video;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.avplayer.DWAspectRatio;
import com.taobao.avplayer.av;
import com.taobao.avplayer.ax;
import com.taobao.search.musie.video.VideoControlView;
import java.util.HashMap;
import java.util.Map;
import tb.kge;

/* loaded from: classes7.dex */
public class a implements com.taobao.android.weex_uikit.widget.video.c, av, ax {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Context f19291a;
    private d b;
    private FrameLayout c;
    private FrameLayout d;
    private com.taobao.android.weex_uikit.widget.video.d e;
    private boolean f;
    private boolean g;
    private VideoControlView h;
    private String i;
    private boolean j;
    private String k;
    private int l;
    private int m;
    private com.taobao.android.weex_uikit.widget.video.e n;

    static {
        kge.a(-701362569);
        kge.a(1811845757);
        kge.a(688755897);
        kge.a(857599862);
    }

    @Override // com.taobao.avplayer.av
    public void onVideoClose() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24db3403", new Object[]{this});
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
    public void onVideoSeekTo(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd6694ad", new Object[]{this, new Integer(i)});
        }
    }

    public static /* synthetic */ d a(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (d) ipChange.ipc$dispatch("67f7b885", new Object[]{aVar}) : aVar.b;
    }

    public a(Context context) {
        this.f19291a = context;
    }

    public static DWAspectRatio a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DWAspectRatio) ipChange.ipc$dispatch("847e8ea9", new Object[]{str});
        }
        if (TextUtils.isEmpty(str)) {
            return DWAspectRatio.DW_FIT_CENTER;
        }
        char c = 65535;
        int hashCode = str.hashCode();
        if (hashCode != 3143043) {
            if (hashCode != 94852023) {
                if (hashCode == 951526612 && str.equals("contain")) {
                    c = 0;
                }
            } else if (str.equals("cover")) {
                c = 2;
            }
        } else if (str.equals(com.taobao.android.weex_framework.util.a.ATOM_EXT_fill)) {
            c = 1;
        }
        if (c == 0) {
            return DWAspectRatio.DW_FIT_CENTER;
        }
        if (c == 1) {
            return DWAspectRatio.DW_FIT_X_Y;
        }
        if (c == 2) {
            return DWAspectRatio.DW_CENTER_CROP;
        }
        return DWAspectRatio.DW_FIT_CENTER;
    }

    @Override // com.taobao.android.weex_uikit.widget.video.c
    public View a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("195fbaaa", new Object[]{this}) : this.c;
    }

    @Override // com.taobao.android.weex_uikit.widget.video.c
    public void a(String str, boolean z, boolean z2, String str2, com.taobao.android.weex_uikit.widget.video.e eVar, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("734efa4d", new Object[]{this, str, new Boolean(z), new Boolean(z2), str2, eVar, new Integer(i), new Integer(i2)});
            return;
        }
        this.i = str;
        this.j = z;
        this.g = z2;
        this.k = str2;
        this.l = i;
        this.m = i2;
        this.c = new FrameLayout(this.f19291a);
        this.d = new FrameLayout(this.f19291a);
        this.n = eVar;
        this.c.addView(this.d, -1, -1);
        if (!eVar.a()) {
            return;
        }
        FrameLayout frameLayout = new FrameLayout(this.f19291a);
        frameLayout.setTag(Boolean.TRUE);
        this.c.addView(frameLayout, -1, -1);
        this.h = new VideoControlView(this.f19291a);
        this.c.addView(this.h, -1, -1);
        this.h.setMuteState(z2);
        this.h.setShowCenterPlay(eVar.d());
        this.h.setShowMute(eVar.e());
        this.h.setPlayRateVisible(eVar.f());
        this.h.setShowPlay(eVar.c());
        this.h.setSeekBarEnabled(eVar.g());
        this.h.setShowFullScreen(eVar.b());
        this.h.setCallback(new VideoControlView.a() { // from class: com.taobao.search.musie.video.a.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.search.musie.video.VideoControlView.a
            public void a(boolean z3) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z3)});
                } else {
                    a.this.a(z3);
                }
            }

            @Override // com.taobao.search.musie.video.VideoControlView.a
            public void b(boolean z3) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z3)});
                } else if (z3) {
                    a.this.c();
                } else {
                    a.this.d();
                }
            }

            @Override // com.taobao.search.musie.video.VideoControlView.a
            public void a(int i3) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("a821939b", new Object[]{this, new Integer(i3)});
                } else {
                    a.this.a(i3);
                }
            }

            @Override // com.taobao.search.musie.video.VideoControlView.a
            public void a(float f) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("a8218858", new Object[]{this, new Float(f)});
                } else if (a.a(a.this) == null) {
                } else {
                    a.a(a.this).a(f);
                }
            }

            @Override // com.taobao.search.musie.video.VideoControlView.a
            public void a() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                } else if (a.a(a.this) == null) {
                } else {
                    a.a(a.this).h();
                }
            }
        });
    }

    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
        } else if (this.b != null) {
        } else {
            if (this.n.b()) {
                this.b = new e(this);
            } else {
                this.b = new c(this);
            }
            this.b.a(this.f19291a, this.i, this.g, this.j, this.k, this.n.i(), this.n.j(), this.n.k(), this.n.h(), this.l, this.m, this.n);
            this.d.addView(this.b.a(), -1, -1);
        }
    }

    @Override // com.taobao.android.weex_uikit.widget.video.c
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        this.f = false;
        this.c = null;
        this.d = null;
        this.h = null;
        d dVar = this.b;
        if (dVar == null) {
            return;
        }
        dVar.b();
        this.b.c();
        this.b = null;
    }

    @Override // com.taobao.android.weex_uikit.widget.video.c
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        if (this.b == null) {
            g();
        }
        VideoControlView videoControlView = this.h;
        if (videoControlView != null) {
            videoControlView.play();
        }
        if (!this.f) {
            this.b.d();
            this.f = true;
            return;
        }
        this.b.e();
    }

    @Override // com.taobao.android.weex_uikit.widget.video.c
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        d dVar = this.b;
        if (dVar == null) {
            return;
        }
        dVar.f();
        VideoControlView videoControlView = this.h;
        if (videoControlView == null) {
            return;
        }
        videoControlView.pause();
    }

    @Override // com.taobao.android.weex_uikit.widget.video.c
    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        d dVar = this.b;
        if (dVar == null) {
            return;
        }
        dVar.h();
    }

    @Override // com.taobao.android.weex_uikit.widget.video.c
    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            return;
        }
        d dVar = this.b;
        if (dVar == null) {
            return;
        }
        dVar.a(i);
    }

    @Override // com.taobao.android.weex_uikit.widget.video.c
    public void a(com.taobao.android.weex_uikit.widget.video.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b7f48ba", new Object[]{this, dVar});
        } else {
            this.e = dVar;
        }
    }

    @Override // com.taobao.android.weex_uikit.widget.video.c
    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        this.g = z;
        d dVar = this.b;
        if (dVar == null) {
            return;
        }
        dVar.a(z);
        VideoControlView videoControlView = this.h;
        if (videoControlView == null) {
            return;
        }
        videoControlView.setMuteState(z);
    }

    @Override // com.taobao.android.weex_uikit.widget.video.c
    public void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
        } else if (this.b == null || jSONObject == null) {
        } else {
            HashMap hashMap = new HashMap();
            String string = jSONObject.getString("FOV");
            if (string != null) {
                hashMap.put("FOV", string);
            }
            String string2 = jSONObject.getString("latitude");
            if (string2 != null) {
                hashMap.put("latitude", string2);
            }
            String string3 = jSONObject.getString("longitude");
            if (string3 != null) {
                hashMap.put("longitude", string3);
            }
            this.b.a(hashMap);
        }
    }

    @Override // com.taobao.android.weex_uikit.widget.video.c
    public JSONObject f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("d2e6990d", new Object[]{this});
        }
        d dVar = this.b;
        JSONObject jSONObject = null;
        if (dVar == null) {
            return null;
        }
        Map<String, String> g = dVar.g();
        if (g != null && !g.isEmpty()) {
            jSONObject = new JSONObject();
            for (Map.Entry<String, String> entry : g.entrySet()) {
                jSONObject.put(entry.getKey(), (Object) entry.getValue());
            }
        }
        return jSONObject;
    }

    @Override // com.taobao.avplayer.av
    public void onVideoStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2b2d56d", new Object[]{this});
            return;
        }
        com.taobao.android.weex_uikit.widget.video.d dVar = this.e;
        if (dVar == null) {
            return;
        }
        dVar.a();
    }

    @Override // com.taobao.avplayer.av
    public void onVideoPause(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee9d05f3", new Object[]{this, new Boolean(z)});
            return;
        }
        com.taobao.android.weex_uikit.widget.video.d dVar = this.e;
        if (dVar == null) {
            return;
        }
        dVar.b();
    }

    @Override // com.taobao.avplayer.av
    public void onVideoPlay() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("931007b7", new Object[]{this});
            return;
        }
        com.taobao.android.weex_uikit.widget.video.d dVar = this.e;
        if (dVar == null) {
            return;
        }
        dVar.a();
    }

    @Override // com.taobao.avplayer.av
    public void onVideoPrepared(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3faee61c", new Object[]{this, obj});
            return;
        }
        d dVar = this.b;
        if (dVar == null) {
            return;
        }
        dVar.a(this.g);
    }

    @Override // com.taobao.avplayer.av
    public void onVideoError(Object obj, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7a1a1cf", new Object[]{this, obj, new Integer(i), new Integer(i2)});
            return;
        }
        com.taobao.android.weex_uikit.widget.video.d dVar = this.e;
        if (dVar == null) {
            return;
        }
        dVar.d();
    }

    @Override // com.taobao.avplayer.av
    public void onVideoComplete() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3c2c53c", new Object[]{this});
            return;
        }
        com.taobao.android.weex_uikit.widget.video.d dVar = this.e;
        if (dVar == null) {
            return;
        }
        dVar.c();
    }

    @Override // com.taobao.avplayer.av
    public void onVideoFullScreen() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dcccbde", new Object[]{this});
            return;
        }
        d dVar = this.b;
        if (dVar == null) {
            return;
        }
        dVar.j();
    }

    @Override // com.taobao.avplayer.av
    public void onVideoNormalScreen() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff4b0936", new Object[]{this});
            return;
        }
        d dVar = this.b;
        if (dVar == null) {
            return;
        }
        dVar.i();
    }

    @Override // com.taobao.avplayer.av
    public void onVideoProgressChanged(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91a8a811", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
            return;
        }
        com.taobao.android.weex_uikit.widget.video.d dVar = this.e;
        if (dVar == null) {
            return;
        }
        dVar.a(i, i3);
        VideoControlView videoControlView = this.h;
        if (videoControlView == null) {
            return;
        }
        videoControlView.setProgress(i, i3, i2);
    }

    @Override // com.taobao.avplayer.ax
    public void onLoopCompletion() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a22ee66", new Object[]{this});
            return;
        }
        com.taobao.android.weex_uikit.widget.video.d dVar = this.e;
        if (dVar == null) {
            return;
        }
        dVar.c();
    }

    public com.taobao.android.weex_uikit.widget.video.d h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.weex_uikit.widget.video.d) ipChange.ipc$dispatch("c69f6419", new Object[]{this}) : this.e;
    }
}
