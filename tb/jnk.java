package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import kotlin.jvm.internal.q;
import kotlin.t;
import tv.danmaku.ijk.media.player.MonitorMediaPlayer;

/* loaded from: classes6.dex */
public final class jnk {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final DXTemplateItem f29643a;
    private boolean b;
    private boolean c;
    private boolean d;
    private boolean e;

    static {
        kge.a(-488326048);
    }

    public final DXTemplateItem a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DXTemplateItem) ipChange.ipc$dispatch("57849a57", new Object[]{this}) : this.f29643a;
    }

    public final boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : this.b;
    }

    public final boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue() : this.c;
    }

    public final boolean d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue() : this.d;
    }

    public final boolean e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[]{this})).booleanValue() : this.e;
    }

    public jnk(JSONObject jSONObject) {
        this.c = true;
        DXTemplateItem dXTemplateItem = new DXTemplateItem();
        JSONObject a2 = dmo.a(jSONObject, "template", (JSONObject) null);
        if (a2 != null) {
            dXTemplateItem.f11925a = a2.getString("name");
            Long l = a2.getLong("version");
            q.b(l, "it.getLong(\"version\")");
            dXTemplateItem.b = l.longValue();
            dXTemplateItem.c = a2.getString("url");
        }
        t tVar = t.INSTANCE;
        this.f29643a = dXTemplateItem;
        this.c = dmo.a(jSONObject, "sharedEngine", true);
        JSONObject a3 = dmo.a(jSONObject, "engineConfig", (JSONObject) null);
        if (a3 != null) {
            this.d = q.a((Object) MonitorMediaPlayer.ABTEST_USE_CACHE_ENABLE, (Object) dmo.a(a3, "downgradeType", (String) null));
            this.e = dmo.a(a3, "enableStrategy", false);
        }
        this.b = q.a((Object) "downloadFirst", (Object) dmo.a(jSONObject, "refreshType", (String) null));
    }
}
