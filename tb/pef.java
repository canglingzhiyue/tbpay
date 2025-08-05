package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.model.message.TLiveMsg;
import java.util.Map;
import tv.danmaku.ijk.media.player.IMediaPlayer;

/* loaded from: classes8.dex */
public class pef implements peg {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    private static final String f32565a = "pef";
    private pel b;
    private pen c;
    private pee d;
    private peq e;
    private pep f;
    private pei g;

    public pef(String str, boolean z, boolean z2, pej pejVar) {
        String str2 = f32565a;
        pex.a(str2, "LiveMessageManager[init]:" + z + " " + z2);
        this.d = new pee(str);
        this.b = new pel(this.d);
        this.c = new pen(this.d);
        this.e = new peq(this.d, this);
        if (this.d.b.q) {
            pex.a(f32565a, "useCDNabTest[true]");
        } else {
            pex.a(f32565a, "useCDNabTest[false]");
        }
        if (this.d.b.c && z && this.d.b.q) {
            this.f = new pep(this.d, this);
        }
        if (!this.d.b.m || !z2) {
            return;
        }
        this.g = new pei(this.d, pejVar);
        this.g.a(this.d.b.k);
    }

    @Override // tb.peg
    public void a(String str, TLiveMsg tLiveMsg) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("956b0157", new Object[]{this, str, tLiveMsg});
        } else if (!this.b.a(str, tLiveMsg) || !this.c.a(str, tLiveMsg)) {
        } else {
            String str2 = f32565a;
            pex.a(str2, "OnReceiveListener[分发成功(" + str + ")]:" + tLiveMsg);
            this.d.i.a(100, str, tLiveMsg, this.d);
        }
    }

    @Override // tb.peg
    public void a(int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d36ff2b7", new Object[]{this, new Integer(i), obj});
        } else {
            this.c.a(i, obj);
        }
    }

    public void a(peh pehVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f97340e5", new Object[]{this, pehVar});
            return;
        }
        String str = f32565a;
        pex.a(str, "subscribe[订阅]:" + pehVar);
        this.d.a(pehVar);
        this.b.a(pehVar);
        pep pepVar = this.f;
        if (pepVar != null) {
            pepVar.a(pehVar);
        }
        this.e.a(pehVar);
        pei peiVar = this.g;
        if (peiVar == null) {
            return;
        }
        peiVar.a(pehVar);
    }

    public void b(peh pehVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e7f64766", new Object[]{this, pehVar});
            return;
        }
        String str = f32565a;
        pex.a(str, "unSubscribe[取消订阅]:" + this.d);
        this.d.b(pehVar);
        this.e.b(pehVar);
        pep pepVar = this.f;
        if (pepVar != null) {
            pepVar.b(pehVar);
        }
        this.b.b(pehVar);
        this.c.a(pehVar);
        pei peiVar = this.g;
        if (peiVar == null) {
            return;
        }
        peiVar.b(pehVar);
    }

    public void a(pnr pnrVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9f6a024", new Object[]{this, pnrVar});
            return;
        }
        String str = f32565a;
        pex.a(str, "registerDispatcher[注册回调]:" + pnrVar + " " + this.d);
        this.c.a(pnrVar);
    }

    public void b(pnr pnrVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e879a6a5", new Object[]{this, pnrVar});
            return;
        }
        String str = f32565a;
        pex.a(str, "unRegisterDispatcher[取消注册回调]:" + pnrVar + " " + this.d);
        this.c.b(pnrVar);
    }

    public void a(TLiveMsg tLiveMsg, pnq pnqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b4fbcbe", new Object[]{this, tLiveMsg, pnqVar});
        } else if (!a("sendMessage", tLiveMsg, pnqVar)) {
        } else {
            String str = f32565a;
            pex.a(str, "sendMessage[发送消息]:" + tLiveMsg + " " + this.d);
            this.e.a(tLiveMsg, pnqVar);
        }
    }

    public void a(Map<String, Double> map, boolean z, pnq pnqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a0744b4", new Object[]{this, map, new Boolean(z), pnqVar});
        } else if (!a("countValue", map, pnqVar)) {
        } else {
            String str = f32565a;
            pex.a(str, "sendMessage[计数上报]:" + map + " " + z + " " + this.d);
            this.e.a(map, z, pnqVar);
        }
    }

    public void a(int i, int i2, int i3, pnq pnqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("873eb598", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), pnqVar});
        } else if (!a("sendRequest", Integer.valueOf(i), pnqVar)) {
        } else {
            String str = f32565a;
            pex.a(str, "sendMessage[发送请求]:" + i + " " + i2 + " " + i3 + " " + this.d);
            this.e.a(i, i2, i3, pnqVar);
        }
    }

    private boolean a(String str, Object obj, pnq pnqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e9918cef", new Object[]{this, str, obj, pnqVar})).booleanValue();
        }
        if (this.d.c()) {
            return true;
        }
        String str2 = f32565a;
        pex.a(str2, "checkIsSend[" + str + riy.BRACKET_START_STR + this.d.f32564a + ")]:" + obj);
        pnqVar.a(IMediaPlayer.MEDIA_INFO_VIDEO_FOV_CHANGE, null, str, obj);
        return false;
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        pex.a(f32565a, "onAppInBackgroud[进入后台]");
        this.d.a();
        this.e.a();
        pep pepVar = this.f;
        if (pepVar != null) {
            pepVar.a();
        }
        pei peiVar = this.g;
        if (peiVar == null) {
            return;
        }
        peiVar.a();
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        pex.a(f32565a, "onAppInBackgroud[恢复前台]");
        this.d.b();
        this.e.b();
        pep pepVar = this.f;
        if (pepVar != null) {
            pepVar.b();
        }
        pei peiVar = this.g;
        if (peiVar == null) {
            return;
        }
        peiVar.b();
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        pex.a(f32565a, "onResume[直播间可见]");
        pei peiVar = this.g;
        if (peiVar == null) {
            return;
        }
        peiVar.c();
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        pex.a(f32565a, "onPause[直播间不可见]");
        pei peiVar = this.g;
        if (peiVar == null) {
            return;
        }
        peiVar.d();
    }
}
