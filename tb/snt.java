package tb;

import android.app.Activity;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.FluidSDK;
import com.taobao.avplayer.DWAspectRatio;
import com.taobao.avplayer.DWInstanceType;
import com.taobao.avplayer.TBPlayerConst;
import com.taobao.avplayer.av;
import com.taobao.avplayer.aw;
import com.taobao.avplayer.ax;
import com.taobao.avplayer.ba;
import com.taobao.avplayer.bb;
import com.taobao.avplayer.bl;
import com.taobao.avplayer.common.z;
import com.taobao.avplayer.s;
import com.taobao.mediaplay.k;
import com.taobao.mediaplay.model.MediaLiveWarmupConfig;
import com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.t;
import com.taobao.taobao.R;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
import tb.snv;

/* loaded from: classes5.dex */
public class snt implements snv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final s f33754a;
    private boolean b;
    private bb c;
    private boolean d;
    private boolean e = false;

    static {
        kge.a(363085913);
        kge.a(2128766238);
    }

    public static /* synthetic */ bb a(snt sntVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (bb) ipChange.ipc$dispatch("683af920", new Object[]{sntVar}) : sntVar.c;
    }

    public static /* synthetic */ boolean a(snt sntVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e3acf7f9", new Object[]{sntVar, new Boolean(z)})).booleanValue();
        }
        sntVar.b = z;
        return z;
    }

    public snt(s sVar) {
        this.f33754a = sVar;
        this.f33754a.a(new bb() { // from class: tb.snt.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.avplayer.bb
            public void a() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                    return;
                }
                snt.a(snt.this, true);
                if (snt.a(snt.this) == null) {
                    return;
                }
                snt.a(snt.this).a();
            }
        });
        if (sVar.e() != null) {
            sVar.e().setTag(R.id.fluid_sdk_tag_is_video_view, true);
        }
        spz.c(sny.TAG, "videotrack video create dwHashCode:" + this.f33754a.hashCode() + " activityHashCode:" + m());
    }

    @Override // tb.snv
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        spz.c(sny.TAG, "videotrack video start: " + this.f33754a);
        ogh.a("startVideo");
        this.f33754a.a();
        ogh.b();
    }

    @Override // tb.snv
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        spz.c(sny.TAG, "videotrack video playVideo: " + this.f33754a);
        ogh.a("playVideo");
        this.f33754a.g();
        ogh.b();
    }

    @Override // tb.snv
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        spz.c(sny.TAG, "videotrack video pauseVideo: " + this.f33754a);
        ogh.a("pauseVideo");
        this.f33754a.b();
        ogh.b();
    }

    @Override // tb.snv
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        spz.c(sny.TAG, "videotrack video destroy, dwinstance: " + this.f33754a + " dwHashCode: " + this.f33754a.hashCode() + " activityHashCode:" + m());
        ogh.a("destroyVideo");
        this.f33754a.f();
        ogh.b();
    }

    @Override // tb.snv
    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        spz.c(sny.TAG, "videotrack video mute=" + z + " :" + this.f33754a);
        this.f33754a.a(z);
    }

    @Override // tb.snv
    public int e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5a4ca5f", new Object[]{this})).intValue() : this.f33754a.j();
    }

    @Override // tb.snv
    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            return;
        }
        spz.c(sny.TAG, "videotrack video seekto " + i + " :" + this.f33754a);
        this.f33754a.d(i);
    }

    @Override // tb.snv
    public void a(int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c119299", new Object[]{this, new Integer(i), new Boolean(z)});
            return;
        }
        spz.c(sny.TAG, "videotrack video seekto " + i + " :" + this.f33754a);
        this.f33754a.a(i, z);
    }

    @Override // tb.snv
    public void a(ImageView imageView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("83f7c622", new Object[]{this, imageView});
            return;
        }
        spz.c(sny.TAG, "setPicImageView()调用，imageView:" + imageView);
        this.f33754a.a(imageView);
    }

    @Override // tb.snv
    public void a(av avVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("173676bc", new Object[]{this, avVar});
        } else {
            this.f33754a.a(avVar);
        }
    }

    @Override // tb.snv
    public void a(aw awVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1736eb1b", new Object[]{this, awVar});
        } else {
            this.f33754a.a(awVar);
        }
    }

    @Override // tb.snv
    public void a(z zVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("410de73b", new Object[]{this, zVar});
        } else {
            this.f33754a.a(zVar);
        }
    }

    @Override // tb.snv
    public void a(ba baVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("173b0272", new Object[]{this, baVar});
        } else {
            this.f33754a.a(baVar);
        }
    }

    @Override // tb.snv
    public void a(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8218858", new Object[]{this, new Float(f)});
            return;
        }
        spz.c(sny.TAG, "setPlayRate playRate=" + f + "  :" + this.f33754a);
        this.f33754a.a(f);
    }

    @Override // tb.snv
    public void b(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d660f7", new Object[]{this, new Float(f)});
            return;
        }
        spz.c(sny.TAG, "setVolume volume=" + f + " :" + this.f33754a);
        this.f33754a.b(f);
    }

    @Override // tb.snv
    public void a(ax axVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("17375f7a", new Object[]{this, axVar});
        } else {
            this.f33754a.a(axVar);
        }
    }

    @Override // tb.snv
    public ViewGroup f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ViewGroup) ipChange.ipc$dispatch("40865d88", new Object[]{this}) : this.f33754a.e();
    }

    @Override // tb.snv
    public void a(DWInstanceType dWInstanceType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4086ecaf", new Object[]{this, dWInstanceType});
        } else {
            this.f33754a.a(dWInstanceType);
        }
    }

    @Override // tb.snv
    public void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
        } else {
            this.f33754a.d(z);
        }
    }

    @Override // tb.snv
    public void a(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c1152c8", new Object[]{this, new Integer(i), new Integer(i2)});
        } else {
            this.f33754a.a(i, i2);
        }
    }

    @Override // tb.snv
    public void a(HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("656bbc4b", new Object[]{this, hashMap});
            return;
        }
        if (hashMap == null) {
            hashMap = new HashMap<>();
        }
        hashMap.put(FluidSDK.FLUID_SDK_FLAG, "1");
        this.f33754a.d(hashMap);
    }

    @Override // tb.snv
    public void b(HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("616d4b2a", new Object[]{this, hashMap});
            return;
        }
        if (hashMap == null) {
            hashMap = new HashMap<>();
        }
        t c = tjy.c();
        if (c != null) {
            hashMap.putAll(c.a());
        }
        hashMap.put(FluidSDK.FLUID_SDK_FLAG, "1");
        this.f33754a.a(hashMap);
    }

    @Override // tb.snv
    public void a(dde ddeVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4e9a4d3", new Object[]{this, ddeVar});
        } else {
            this.f33754a.a(ddeVar);
        }
    }

    @Override // tb.snv
    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        spz.c(sny.TAG, "videotrack video prepareToFirstFrame: " + this.f33754a);
        ogh.a(TBPlayerConst.TBPlayerMethodPrepareToFirstFrame);
        this.f33754a.d();
        ogh.b();
    }

    @Override // tb.snv
    public String h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("5d9eff91", new Object[]{this}) : this.f33754a.r();
    }

    @Override // tb.snv
    public void c(HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d6eda09", new Object[]{this, hashMap});
        } else if (hashMap == null || hashMap.isEmpty()) {
        } else {
            this.f33754a.c(hashMap);
        }
    }

    @Override // tb.snv
    public void a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
        } else if (map == null || map.isEmpty()) {
        } else {
            this.f33754a.a(map);
        }
    }

    @Override // tb.snv
    public Map<String, String> i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("d67b6a5", new Object[]{this}) : this.f33754a.m();
    }

    @Override // tb.snv
    public void a(String str, boolean z, HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96a46591", new Object[]{this, str, new Boolean(z), hashMap});
        } else {
            this.f33754a.a(str, z, hashMap);
        }
    }

    @Override // tb.snv
    public void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb3ff1", new Object[]{this});
            return;
        }
        spz.c("PickPreloadControllerNew", "DWInstancePlusProxy：commitEndForMultiplexing，补报12003, :" + this.f33754a);
        this.f33754a.s();
    }

    @Override // tb.snv
    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            this.f33754a.a(str);
        }
    }

    @Override // tb.snv
    public void a(bb bbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("173b76d1", new Object[]{this, bbVar});
        } else {
            this.c = bbVar;
        }
    }

    @Override // tb.snv
    public boolean k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5f95776", new Object[]{this})).booleanValue() : this.b;
    }

    @Override // tb.snv
    public boolean l() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6076ef7", new Object[]{this})).booleanValue() : this.d;
    }

    @Override // tb.snv
    public void c(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b84aa", new Object[]{this, new Boolean(z)});
        } else {
            this.d = z;
        }
    }

    @Override // tb.snv
    public void a(float f, float f2, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97cd50c8", new Object[]{this, new Float(f), new Float(f2), new Integer(i), new Integer(i2)});
        } else {
            this.f33754a.a(f, f2, i, i2);
        }
    }

    @Override // tb.snv
    public void d(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad405d49", new Object[]{this, new Boolean(z)});
            return;
        }
        spz.c("DWInstancePlusProxy", "setOpenVolumeFadeIn: isFadein:" + z);
        this.f33754a.c(z);
    }

    @Override // tb.snv
    public void e(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aef535e8", new Object[]{this, new Boolean(z)});
        } else if (z && !this.e) {
            this.e = true;
            spz.c("DWInstancePlusProxy", "controlAudioFocus: 获取音频焦点:" + z);
            this.f33754a.f(z);
        } else if (z) {
            spz.c("DWInstancePlusProxy", "controlAudioFocus: 已经获取过音频焦点了:" + z);
        } else {
            this.e = false;
            spz.c("DWInstancePlusProxy", "controlAudioFocus: 释放音频焦点:" + z);
            this.f33754a.f(z);
        }
    }

    @Override // tb.snv
    public k n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (k) ipChange.ipc$dispatch("3b65a4ef", new Object[]{this});
        }
        spz.c("DWInstancePlusProxy", "getMediaPlayProxyInstance");
        return this.f33754a.h();
    }

    @Override // tb.snv
    public boolean o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("631b57a", new Object[]{this})).booleanValue();
        }
        spz.c("DWInstancePlusProxy", TBPlayerConst.TBPlayerMethodUnbindViewProxyFromDWLiveInstance);
        return this.f33754a.t();
    }

    @Override // tb.snv
    public void a(MediaLiveWarmupConfig mediaLiveWarmupConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0d69515", new Object[]{this, mediaLiveWarmupConfig});
            return;
        }
        spz.c("DWInstancePlusProxy", "videotrack video warmupLiveStream: " + mediaLiveWarmupConfig);
        this.f33754a.a(mediaLiveWarmupConfig);
    }

    private int m() {
        ViewGroup e;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6158667", new Object[]{this})).intValue();
        }
        s sVar = this.f33754a;
        if (sVar != null && (e = sVar.e()) != null) {
            return e.getContext().hashCode();
        }
        return 0;
    }

    /* loaded from: classes5.dex */
    public static class a implements snv.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final s.a f33756a;

        static {
            kge.a(796171525);
            kge.a(-380027403);
        }

        @Override // tb.snv.a
        public snv a(bl blVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (snv) ipChange.ipc$dispatch("5e66b004", new Object[]{this, blVar});
            }
            return null;
        }

        public a(Activity activity) {
            this.f33756a = new s.a(activity);
        }

        @Override // tb.snv.a
        public snv.a a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (snv.a) ipChange.ipc$dispatch("3424db5c", new Object[]{this, str});
            }
            this.f33756a.c(str);
            return this;
        }

        @Override // tb.snv.a
        public snv.a a(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (snv.a) ipChange.ipc$dispatch("6d54d562", new Object[]{this, new Boolean(z)});
            }
            this.f33756a.b(z);
            return this;
        }

        @Override // tb.snv.a
        public snv.a b(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (snv.a) ipChange.ipc$dispatch("bc551b3b", new Object[]{this, str});
            }
            this.f33756a.d(str);
            return this;
        }

        @Override // tb.snv.a
        public snv.a a(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (snv.a) ipChange.ipc$dispatch("ea88da13", new Object[]{this, new Integer(i)});
            }
            this.f33756a.b(i);
            return this;
        }

        @Override // tb.snv.a
        public snv.a b(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (snv.a) ipChange.ipc$dispatch("c7303fa3", new Object[]{this, new Boolean(z)});
            }
            spz.c(sny.TAG, "setDisableSurfaceView， disableSurfaceView=" + z);
            this.f33756a.i(z);
            return this;
        }

        @Override // tb.snv.a
        public snv.a c(HashMap<String, String> hashMap) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (snv.a) ipChange.ipc$dispatch("e858ef65", new Object[]{this, hashMap});
            }
            this.f33756a.c(hashMap);
            return this;
        }

        @Override // tb.snv.a
        public snv.a b(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (snv.a) ipChange.ipc$dispatch("44644454", new Object[]{this, new Integer(i)});
            }
            this.f33756a.c(i);
            return this;
        }

        @Override // tb.snv.a
        public snv.a a(DWAspectRatio dWAspectRatio) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (snv.a) ipChange.ipc$dispatch("367a2f4f", new Object[]{this, dWAspectRatio});
            }
            this.f33756a.a(dWAspectRatio);
            return this;
        }

        @Override // tb.snv.a
        public snv.a a(DWInstanceType dWInstanceType) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (snv.a) ipChange.ipc$dispatch("91d4777f", new Object[]{this, dWInstanceType});
            }
            this.f33756a.a(dWInstanceType);
            return this;
        }

        @Override // tb.snv.a
        public snv.a a(HashMap<String, String> hashMap) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (snv.a) ipChange.ipc$dispatch("eca97763", new Object[]{this, hashMap});
            }
            this.f33756a.b(hashMap);
            return this;
        }

        @Override // tb.snv.a
        public snv.a c(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (snv.a) ipChange.ipc$dispatch("210ba9e4", new Object[]{this, new Boolean(z)});
            }
            this.f33756a.f(z);
            return this;
        }

        @Override // tb.snv.a
        public snv.a d(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (snv.a) ipChange.ipc$dispatch("7ae71425", new Object[]{this, new Boolean(z)});
            }
            this.f33756a.e(z);
            return this;
        }

        @Override // tb.snv.a
        public snv.a b(HashMap<String, String> hashMap) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (snv.a) ipChange.ipc$dispatch("6a813364", new Object[]{this, hashMap});
            }
            this.f33756a.a(hashMap);
            return this;
        }

        @Override // tb.snv.a
        public snv.a a(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (snv.a) ipChange.ipc$dispatch("8dbc39b8", new Object[]{this, jSONObject});
            }
            this.f33756a.a(jSONObject);
            return this;
        }

        @Override // tb.snv.a
        public snv.a c(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (snv.a) ipChange.ipc$dispatch("44855b1a", new Object[]{this, str});
            }
            this.f33756a.a(str);
            return this;
        }

        @Override // tb.snv.a
        public snv.a d(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (snv.a) ipChange.ipc$dispatch("ccb59af9", new Object[]{this, str});
            }
            this.f33756a.f(str);
            return this;
        }

        @Override // tb.snv.a
        public snv.a e(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (snv.a) ipChange.ipc$dispatch("54e5dad8", new Object[]{this, str});
            }
            this.f33756a.b(str);
            return this;
        }

        @Override // tb.snv.a
        public snv.a e(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (snv.a) ipChange.ipc$dispatch("d4c27e66", new Object[]{this, new Boolean(z)});
            }
            this.f33756a.a(z);
            return this;
        }

        @Override // tb.snv.a
        public snv a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (snv) ipChange.ipc$dispatch("f0a9703", new Object[]{this});
            }
            ogh.a("createDWInstance");
            snt sntVar = new snt(this.f33756a.a());
            ogh.b();
            return sntVar;
        }

        @Override // tb.snv.a
        public snv.a f(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (snv.a) ipChange.ipc$dispatch("2e9de8a7", new Object[]{this, new Boolean(z)});
            }
            spz.c("DWInstancePlusProxy", "setUseShortAudioFocus:" + z);
            this.f33756a.j(z);
            return this;
        }

        @Override // tb.snv.a
        public snv.a g(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (snv.a) ipChange.ipc$dispatch("887952e8", new Object[]{this, new Boolean(z)});
            }
            spz.c("DWInstancePlusProxy", "setReleaseShortFocusWhenPause: releaseShortFocusWhenPause:" + z);
            this.f33756a.k(z);
            return this;
        }

        @Override // tb.snv.a
        public snv a(s sVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (snv) ipChange.ipc$dispatch("1e3c6edf", new Object[]{this, sVar}) : new snt(sVar);
        }
    }
}
