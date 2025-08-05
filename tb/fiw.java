package tb;

import android.app.Activity;
import android.view.ViewGroup;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.avplayer.DWAspectRatio;
import com.taobao.avplayer.DWInstanceType;
import com.taobao.avplayer.TBPlayerConst;
import com.taobao.avplayer.av;
import com.taobao.avplayer.aw;
import com.taobao.avplayer.ax;
import com.taobao.avplayer.ba;
import com.taobao.avplayer.common.z;
import com.taobao.avplayer.s;
import java.util.HashMap;
import tb.fix;

/* loaded from: classes5.dex */
public class fiw implements fix {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private s f27987a;

    static {
        kge.a(1431249351);
        kge.a(2059703436);
    }

    public fiw(s sVar) {
        this.f27987a = sVar;
    }

    @Override // tb.fix
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        fjt.a(fjt.TAG_MEDIA_CONTROLLER, "videotrack video start");
        this.f27987a.a();
    }

    @Override // tb.fix
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        fjt.a(fjt.TAG_MEDIA_CONTROLLER, "videotrack video playVideo");
        this.f27987a.g();
    }

    @Override // tb.fix
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        fjt.a(fjt.TAG_MEDIA_CONTROLLER, "videotrack video pauseVideo");
        this.f27987a.b();
    }

    @Override // tb.fix
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        fjt.a(fjt.TAG_MEDIA_CONTROLLER, "videotrack video closeVideo");
        this.f27987a.c();
    }

    @Override // tb.fix
    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        fjt.a(fjt.TAG_MEDIA_CONTROLLER, "videotrack video destroy");
        this.f27987a.f();
    }

    @Override // tb.fix
    public void a(boolean z, JSONObject jSONObject) {
        boolean z2;
        IpChange ipChange = $ipChange;
        boolean z3 = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b98504", new Object[]{this, new Boolean(z), jSONObject});
            return;
        }
        fjt.a(fjt.TAG_MEDIA_CONTROLLER, "videotrack video mute=" + z);
        if (jSONObject != null) {
            z2 = "true".equals(jSONObject.getString("skipCallMuteFunc"));
            if ("true".equals(jSONObject.getString("autoCheckMuteState")) && this.f27987a.i()) {
                z3 = true;
            }
        } else {
            z2 = false;
        }
        if (z2) {
            fjt.a(fjt.TAG_TIP, "渐大音效，skipCallMuteFuncTrue ， 跳过 mute 函数调用。");
        } else {
            this.f27987a.a(z);
        }
        if (jSONObject == null || !jSONObject.containsKey("initialVolume") || !jSONObject.containsKey("finalVolume")) {
            return;
        }
        if (z3) {
            fjt.a(fjt.TAG_TIP, "渐大音效，检查到函数调用前 mute 为 true，自动跳过渐大音效。gradualVolumeConfig: " + jSONObject.toJSONString());
            return;
        }
        float a2 = fjs.a(jSONObject.getString("initialVolume"), 0.0f);
        float a3 = fjs.a(jSONObject.getString("finalVolume"), 1.0f);
        int a4 = fjs.a(jSONObject.getString("gradualTime"), 3000);
        int a5 = fjs.a(jSONObject.getString(TBPlayerConst.TBPlayerMethodVolumeFadeInWithCustomParams_FadeInInterval), 100);
        fjt.a(fjt.TAG_TIP, "渐大音效，gradualVolumeConfig: " + jSONObject.toJSONString());
        this.f27987a.a(a2, a3, a4, a5);
    }

    @Override // tb.fix
    public int f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5b2e1e0", new Object[]{this})).intValue() : this.f27987a.j();
    }

    @Override // tb.fix
    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            return;
        }
        fjt.a(fjt.TAG_MEDIA_CONTROLLER, "videotrack video seekto " + i);
        this.f27987a.d(i);
    }

    @Override // tb.fix
    public void a(av avVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("173676bc", new Object[]{this, avVar});
        } else {
            this.f27987a.a(avVar);
        }
    }

    @Override // tb.fix
    public void a(aw awVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1736eb1b", new Object[]{this, awVar});
        } else {
            this.f27987a.a(awVar);
        }
    }

    @Override // tb.fix
    public void a(z zVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("410de73b", new Object[]{this, zVar});
        } else {
            this.f27987a.a(zVar);
        }
    }

    @Override // tb.fix
    public void a(ba baVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("173b0272", new Object[]{this, baVar});
        } else {
            this.f27987a.a(baVar);
        }
    }

    @Override // tb.fix
    public void a(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8218858", new Object[]{this, new Float(f)});
            return;
        }
        fjt.a(fjt.TAG_MEDIA_CONTROLLER, "setPlayRate playRate=" + f);
        this.f27987a.a(f);
    }

    @Override // tb.fix
    public void a(ax axVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("17375f7a", new Object[]{this, axVar});
        } else {
            this.f27987a.a(axVar);
        }
    }

    @Override // tb.fix
    public ViewGroup g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ViewGroup) ipChange.ipc$dispatch("315764e7", new Object[]{this}) : this.f27987a.e();
    }

    @Override // tb.fix
    public void a(DWInstanceType dWInstanceType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4086ecaf", new Object[]{this, dWInstanceType});
        } else {
            this.f27987a.a(dWInstanceType);
        }
    }

    @Override // tb.fix
    public void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
        } else {
            this.f27987a.d(z);
        }
    }

    @Override // tb.fix
    public void a(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c1152c8", new Object[]{this, new Integer(i), new Integer(i2)});
        } else {
            this.f27987a.a(i, i2);
        }
    }

    @Override // tb.fix
    public void a(HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("656bbc4b", new Object[]{this, hashMap});
        } else {
            this.f27987a.d(hashMap);
        }
    }

    @Override // tb.fix
    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
            return;
        }
        fjt.a(fjt.TAG_MEDIA_CONTROLLER, "videotrack video prepareToFirstFrame");
        this.f27987a.d();
    }

    @Override // tb.fix
    public void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
        } else {
            this.f27987a.s();
        }
    }

    @Override // tb.fix
    public void b(HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("616d4b2a", new Object[]{this, hashMap});
        } else if (hashMap == null || hashMap.isEmpty()) {
        } else {
            this.f27987a.b(hashMap);
        }
    }

    /* loaded from: classes5.dex */
    public static class a implements fix.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public s.a f27988a;

        static {
            kge.a(-1333905193);
            kge.a(688136035);
        }

        public a(Activity activity) {
            this.f27988a = new s.a(activity);
        }

        @Override // tb.fix.a
        public void e(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1c6cb136", new Object[]{this, str});
            } else {
                this.f27988a.d(str);
            }
        }

        @Override // tb.fix.a
        public fix.a a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (fix.a) ipChange.ipc$dispatch("1db04e82", new Object[]{this, str});
            }
            this.f27988a.c(str);
            return this;
        }

        @Override // tb.fix.a
        public fix.a a(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (fix.a) ipChange.ipc$dispatch("d4144d39", new Object[]{this, new Integer(i)});
            }
            this.f27988a.b(i);
            return this;
        }

        @Override // tb.fix.a
        public fix.a b(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (fix.a) ipChange.ipc$dispatch("2defb77a", new Object[]{this, new Integer(i)});
            }
            this.f27988a.c(i);
            return this;
        }

        @Override // tb.fix.a
        public fix.a a(DWAspectRatio dWAspectRatio) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (fix.a) ipChange.ipc$dispatch("2005a275", new Object[]{this, dWAspectRatio});
            }
            this.f27988a.a(dWAspectRatio);
            return this;
        }

        @Override // tb.fix.a
        public fix.a a(DWInstanceType dWInstanceType) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (fix.a) ipChange.ipc$dispatch("7b5feaa5", new Object[]{this, dWInstanceType});
            }
            this.f27988a.a(dWInstanceType);
            return this;
        }

        @Override // tb.fix.a
        public fix.a a(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (fix.a) ipChange.ipc$dispatch("56e04888", new Object[]{this, new Boolean(z)});
            }
            this.f27988a.f(z);
            return this;
        }

        @Override // tb.fix.a
        public fix.a b(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (fix.a) ipChange.ipc$dispatch("b0bbb2c9", new Object[]{this, new Boolean(z)});
            }
            this.f27988a.e(z);
            return this;
        }

        @Override // tb.fix.a
        public fix.a a(org.json.JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (fix.a) ipChange.ipc$dispatch("7747acde", new Object[]{this, jSONObject});
            }
            this.f27988a.a(jSONObject);
            return this;
        }

        @Override // tb.fix.a
        public fix.a d(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (fix.a) ipChange.ipc$dispatch("b6410e1f", new Object[]{this, str});
            }
            this.f27988a.a(str);
            return this;
        }

        @Override // tb.fix.a
        public fix.a b(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (fix.a) ipChange.ipc$dispatch("a5e08e61", new Object[]{this, str});
            }
            this.f27988a.f(str);
            return this;
        }

        @Override // tb.fix.a
        public fix.a c(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (fix.a) ipChange.ipc$dispatch("2e10ce40", new Object[]{this, str});
            }
            this.f27988a.b(str);
            return this;
        }

        @Override // tb.fix.a
        public fix.a c(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (fix.a) ipChange.ipc$dispatch("a971d0a", new Object[]{this, new Boolean(z)});
            }
            this.f27988a.j(z);
            return this;
        }

        @Override // tb.fix.a
        public fix a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (fix) ipChange.ipc$dispatch("f049ba9", new Object[]{this}) : new fiw(this.f27988a.a());
        }
    }
}
