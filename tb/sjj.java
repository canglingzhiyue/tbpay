package tb;

import android.app.Activity;
import android.text.TextUtils;
import android.widget.ImageView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.business.usertrack.ITrackService;
import com.taobao.android.fluid.business.usertrack.track.ut.videotracker.b;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.core.FluidInstance;
import com.taobao.android.fluid.core.exception.FluidException;
import com.taobao.android.fluid.framework.mute.helper.f;
import com.taobao.android.fluid.framework.scene.ISceneConfigService;
import com.taobao.avplayer.DWAspectRatio;
import com.taobao.avplayer.DWInstanceType;
import com.taobao.tao.flexbox.layoutmanager.player.videodecide.c;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
import tb.snt;
import tb.snv;
import tb.sny;

/* loaded from: classes5.dex */
public class sjj {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_START_MEDIA_SET_KEEP_SCREEN_ON = "keepScreenOnDoNotCarePlayerState";

    /* renamed from: a  reason: collision with root package name */
    private final FluidContext f33624a;
    private final sii b;

    static {
        kge.a(-472425101);
        kge.a(-2078734836);
    }

    public sjj(sii siiVar) {
        this.f33624a = siiVar.z();
        this.b = siiVar;
    }

    public snv a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (snv) ipChange.ipc$dispatch("f0a9703", new Object[]{this}) : b();
    }

    private snv b() {
        snv.a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (snv) ipChange.ipc$dispatch("16bc3c62", new Object[]{this});
        }
        spz.c("DWInstanceCreateManager", "PickPreloadController创建播放器" + this.b.af().i() + "，url：" + this.b.af().m() + "id:" + this.b.w());
        int a2 = this.b.v().a();
        String str = null;
        if (!(this.b.y() instanceof Activity)) {
            FluidException.throwException(this.f33624a, FluidInstance.INSTANCE_ANDROID_CONTEXT_NOT_ACTIVITY);
            spz.c("DWInstanceCreateManager", "创建 DWInstance 播放器失败，context 不是 activity");
            return null;
        }
        if (sns.a()) {
            aVar = new sny.a((Activity) this.b.y());
        } else {
            aVar = new snt.a((Activity) this.b.y());
        }
        if (!c()) {
            aVar.a(this.b.af().l());
        }
        f.a(aVar, this.b.z());
        aVar.a(this.b.ah().b().d);
        aVar.b(this.b.ah().b().c);
        aVar.a(this.b.ah().b().g == ImageView.ScaleType.CENTER_CROP ? DWAspectRatio.DW_CENTER_CROP : DWAspectRatio.DW_FIT_CENTER);
        aVar.a(DWInstanceType.PIC);
        aVar.c(true);
        aVar.d(true);
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("keepScreenOnDoNotCarePlayerState", String.valueOf(!sjt.n()));
        aVar.c(hashMap);
        boolean isFirstSetUTParams = ((ITrackService) this.f33624a.getService(ITrackService.class)).isFirstSetUTParams();
        ((ITrackService) this.f33624a.getService(ITrackService.class)).setFirstSetUTParams(false);
        aVar.b(ljm.a(this.b.z(), ljm.a(this.b.z(), a2, this.b.af().f12530a), isFirstSetUTParams));
        this.b.ac().a(a2);
        String playScenes = this.f33624a.getInstanceConfig().getPlayScenes();
        sps sessionParams = ((ISceneConfigService) this.b.z().getService(ISceneConfigService.class)).getSessionParams();
        if (sessionParams != null) {
            str = sessionParams.c;
        }
        if (this.b.af().k()) {
            aVar.a(true);
            aVar.c(this.b.af().m());
        } else if (!c()) {
            String i = this.b.af().i();
            if (!TextUtils.isEmpty(i)) {
                spz.c("DWInstanceCreateManager", "PickPreloadController创建播放器使用播控");
                try {
                    HashMap hashMap2 = new HashMap();
                    hashMap2.put("playScene", playScenes);
                    hashMap2.put("source", str);
                    hashMap2.put("index", String.valueOf(this.b.r()));
                    JSONObject a3 = c.a(new JSONObject(i), false, (Map<String, String>) hashMap2);
                    b.a(this.b, "init", hashMap2);
                    if (a3 != null) {
                        aVar.a(a3);
                    }
                } catch (Exception e) {
                    spz.a("DWInstanceCreateManager", "", e);
                }
            } else {
                spz.c("DWInstanceCreateManager", "PickPreloadController创建播放器播控为null");
            }
        } else if (c()) {
            aVar.c(this.b.af().m());
            aVar.b(d());
        }
        aVar.d(playScenes);
        if (str != null) {
            aVar.e(str);
        }
        aVar.a(this.b.ac().a(this.b.af()));
        return aVar.a();
    }

    public boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue();
        }
        sii siiVar = this.b;
        return (siiVar == null || siiVar.af() == null || !TextUtils.equals(this.b.af().p(), "url")) ? false : true;
    }

    private String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("43881515", new Object[]{this});
        }
        sii siiVar = this.b;
        if (siiVar == null || siiVar.af() == null) {
            return "";
        }
        return c() ? sku.VALUE_TB_VIDEO_URL : this.b.af().q();
    }
}
