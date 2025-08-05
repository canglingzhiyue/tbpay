package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.job.core.task.e;
import com.taobao.android.job.core.task.g;
import com.taobao.android.launcher.biz.launcher.ai;
import com.taobao.android.launcher.biz.launcher.ak;
import com.taobao.android.launcher.biz.launcher.at;
import com.taobao.android.launcher.biz.launcher.bb;
import com.taobao.android.launcher.biz.launcher.bn;
import com.taobao.android.launcher.biz.launcher.bv;
import com.taobao.android.launcher.biz.launcher.dc;
import com.taobao.android.launcher.biz.launcher.dj;
import com.taobao.android.launcher.biz.launcher.dn;
import com.taobao.android.launcher.biz.launcher.dz;
import com.taobao.android.launcher.biz.launcher.ea;
import com.taobao.android.launcher.biz.launcher.ej;
import com.taobao.android.launcher.biz.launcher.ek;
import com.taobao.android.launcher.biz.launcher.ep;
import com.taobao.android.launcher.biz.launcher.er;
import com.taobao.android.launcher.biz.launcher.gr;
import com.taobao.android.launcher.biz.launcher.hl;
import com.taobao.android.launcher.biz.launcher.hm;
import com.taobao.android.launcher.biz.launcher.hu;
import com.taobao.android.launcher.biz.launcher.i;
import com.taobao.android.launcher.biz.launcher.ii;
import com.taobao.android.launcher.biz.launcher.j;
import com.taobao.android.launcher.biz.launcher.p;
import com.taobao.android.launcher.biz.launcher.t;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class guk implements g<String, Void> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, e<String, Void>> f28461a;

    public guk() {
        gvt.a("ChannelKALauncherProvider");
        this.f28461a = new HashMap(24);
        this.f28461a.put("InitAccsInAppConnection", new p("InitAccsInAppConnection"));
        this.f28461a.put("InitAgooLifeCycle", new t("InitAgooLifeCycle"));
        this.f28461a.put("InitAtlasServiceFinder", new ai("InitAtlasServiceFinder"));
        this.f28461a.put("InitAUS", new i("InitAUS"));
        this.f28461a.put("InitAVFS", new j("InitAVFS"));
        this.f28461a.put("InitBasicParam", new ak("InitBasicParam"));
        this.f28461a.put("InitChannelCookieManager", new at("InitChannelCookieManager"));
        this.f28461a.put("InitCookieManager", new bb("InitCookieManager"));
        this.f28461a.put("InitDesktopTaskTrigger", new bn("InitDesktopTaskTrigger"));
        this.f28461a.put("InitEnv", new bv("InitEnv"));
        this.f28461a.put("InitLauncher", new dc("InitLauncher"));
        this.f28461a.put("InitLinkSmart", new dj("InitLinkSmart"));
        this.f28461a.put("InitLogin", new dn("InitLogin"));
        this.f28461a.put("InitMotuCrash", new dz("InitMotuCrash"));
        this.f28461a.put("InitMsgKeepAlive", new ea("InitMsgKeepAlive"));
        this.f28461a.put("InitNetwork", new ej("InitNetwork"));
        this.f28461a.put("InitNetworkStrategy", new ek("InitNetworkStrategy"));
        this.f28461a.put("InitOrangeAfterLogin", new ep("InitOrangeAfterLogin"));
        this.f28461a.put("InitOrangeConfig", new er("InitOrangeConfig"));
        this.f28461a.put("InitSecurityManager", new gr("InitSecurityManager"));
        this.f28461a.put("InitTaoLog", new hl("InitTaoLog"));
        this.f28461a.put("InitTaoLogForAccs", new hm("InitTaoLogForAccs"));
        this.f28461a.put("InitTurboBootChannel", new hu("InitTurboBootChannel"));
        this.f28461a.put("InitUt", new ii("InitUt"));
        gvt.a();
    }

    @Override // com.taobao.android.job.core.task.g
    public e<String, Void> a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (e) ipChange.ipc$dispatch("31278f8d", new Object[]{this, str}) : this.f28461a.get(str);
    }
}
