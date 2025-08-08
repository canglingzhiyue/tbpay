package com.taobao.android.miniLive.smallwindow;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.room.utils.aw;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import com.taobao.taolive.sdk.model.d;
import com.taobao.taolive.sdk.model.k;
import com.taobao.taolive.sdk.ui.media.IMediaPlayer;
import com.taobao.taolive.sdk.utils.p;
import java.util.Map;
import tb.hub;
import tb.hue;
import tb.ipz;
import tb.kge;
import tb.pmd;
import tb.pnn;

/* loaded from: classes6.dex */
public class a implements d.a, pnn {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final String f14366a;
    public com.taobao.android.miniLive.ui.d A;
    public View.OnClickListener B;
    private k b;
    private String c;
    public e d;
    private String e;
    public IMediaPlayer f;
    public Context t;
    public ipz z;

    public void a(View.OnClickListener onClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7931bad1", new Object[]{this, onClickListener});
        }
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        }
    }

    public boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        }
    }

    public View d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("f7f4866d", new Object[]{this});
        }
        return null;
    }

    @Override // com.taobao.taolive.sdk.core.c
    public void onMessageReceived(int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b152aef", new Object[]{this, new Integer(i), obj});
        }
    }

    static {
        kge.a(489520753);
        kge.a(1815627080);
        kge.a(-2101054629);
        f14366a = a.class.getSimpleName();
    }

    public void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d23b17f5", new Object[]{this, str});
        } else {
            this.c = str;
        }
    }

    public void e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c6cb136", new Object[]{this, str});
        } else {
            this.e = str;
        }
    }

    public void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6076ef3", new Object[]{this});
        } else if (!p.r() || this.z == null) {
        } else {
            hue.a(f14366a, "startSubscribePM");
            this.b = new k(1, this.z.c, null, this.z.f29228a, false, true, false, false, this.z.b, false, false, this);
            this.b.c(this.z.d);
            this.b.a((pnn) this);
            this.b.d();
            this.b.a();
        }
    }

    public void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6158674", new Object[]{this});
        } else if (!p.r() || this.z == null) {
        } else {
            hue.a(f14366a, "stopSubscribePM");
            k kVar = this.b;
            if (kVar == null) {
                return;
            }
            kVar.c();
            this.b.g();
            this.b = null;
        }
    }

    public void a(View view, VideoInfo videoInfo) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5778e623", new Object[]{this, view, videoInfo});
            return;
        }
        e eVar = this.d;
        if (eVar != null) {
            eVar.a(this.f);
        }
        View.OnClickListener onClickListener = this.B;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        } else if (pmd.a().r() != null && this.t != null) {
            if (videoInfo == null || videoInfo.liveId == null) {
                str = null;
            } else {
                str = videoInfo.isOfficialType() ? videoInfo.officialLiveInfo.officialLiveId : videoInfo.liveId;
            }
            if (StringUtils.isEmpty(str)) {
                return;
            }
            StringBuilder sb = new StringBuilder(hub.a(str));
            sb.append("&entrySource=");
            sb.append("miniLive");
            sb.append("&livesource=");
            sb.append("miniLive");
            sb.append("&spm=");
            sb.append(this.c);
            sb.append("&trackInfo=");
            sb.append(this.e);
            if (this.f != null) {
                sb.append("&isLiveMute=");
                sb.append(this.f.x());
            }
            pmd.a().r().a(view.getContext(), sb.toString(), null, 67108864);
        }
        a("liveroom");
    }

    public void a(com.taobao.android.miniLive.ui.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce69a3b5", new Object[]{this, dVar});
        } else {
            this.A = dVar;
        }
    }

    @Override // tb.pnn
    public Map<String, String> getHeartParams() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("ab918d32", new Object[]{this});
        }
        ipz ipzVar = this.z;
        if (ipzVar == null || ipzVar.e == null) {
            return null;
        }
        this.z.e.put(aw.PARAM_IGNORE_PV, "true");
        return this.z.e;
    }
}
