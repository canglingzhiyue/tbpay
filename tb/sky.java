package tb;

import android.text.TextUtils;
import android.util.Pair;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.framework.adapter.mtop.d;
import com.taobao.android.fluid.framework.data.datamodel.MediaContentDetailData;
import com.taobao.android.fluid.framework.data.datamodel.MediaMixContentDetail;
import com.taobao.android.fluid.framework.data.remote.a;
import com.taobao.android.fluid.framework.hostcontainer.tnode.component.b;
import com.taobao.android.fluid.framework.preload.IUsePreloadService;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Future;
import tb.skv;
import tb.sla;

/* loaded from: classes5.dex */
public class sky implements sla {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final FluidContext f33674a;
    private final skv b;

    static {
        kge.a(-914718513);
        kge.a(747573128);
    }

    public sky(FluidContext fluidContext, skv skvVar) {
        this.f33674a = fluidContext;
        this.b = skvVar;
    }

    @Override // tb.sla
    public Future a(sla.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Future) ipChange.ipc$dispatch("26a141e9", new Object[]{this, aVar});
        }
        a.C0494a b = aVar.b();
        skv.a a2 = aVar.a();
        if (a(b, a2)) {
            return null;
        }
        return aVar.a(b, a2);
    }

    private d<Pair<com.taobao.android.fluid.framework.data.datamodel.a, MediaMixContentDetail>> a(String str, JSONObject jSONObject, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d) ipChange.ipc$dispatch("1cfdfb9d", new Object[]{this, str, jSONObject, jSONObject2});
        }
        MediaContentDetailData mediaContentDetailData = null;
        try {
            mediaContentDetailData = sku.g(jSONObject2);
        } catch (Throwable th) {
            spz.c("CacheInterceptor", "buildSuccessResult failed:" + th.getMessage());
        }
        return sls.a(str, new Pair(new com.taobao.android.fluid.framework.data.datamodel.a(mediaContentDetailData, jSONObject2), slr.a(skk.a(this.f33674a), jSONObject).data));
    }

    private boolean a(a.C0494a c0494a, skv.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4eac4df", new Object[]{this, c0494a, aVar})).booleanValue();
        }
        if (c0494a == null) {
            return false;
        }
        spz.c("CacheInterceptor", "fetchWithCache");
        sor i = ((IUsePreloadService) this.f33674a.getService(IUsePreloadService.class)).getConfig().i();
        if (i != null) {
            if ((i.f instanceof JSONObject) && (i.e instanceof JSONObject) && a(c0494a.d(), c0494a.f(), i)) {
                spz.c("CacheInterceptor", "fetchWithCache，detail数据匹配");
                this.b.a(aVar, a((String) null, (JSONObject) i.f, (JSONObject) i.e));
                a(true);
                return true;
            } else if (a(c0494a.d(), c0494a.f(), i)) {
                spz.c("CacheInterceptor", "fetchWithCache，播控数据匹配");
                if (c0494a.f() == null) {
                    c0494a.a(new HashMap());
                }
                c0494a.f().put(a.KEY_NEED_REQUEST_CDN, false);
                a(true);
                return false;
            }
        }
        a(false);
        return false;
    }

    private boolean a(String str, Map map, sor sorVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f53c5f31", new Object[]{this, str, map, sorVar})).booleanValue();
        }
        String str2 = sorVar.b;
        if (b.a(map, sorVar.i)) {
            if (TextUtils.equals(str, str2)) {
                spz.c("CacheInterceptor", "preloadVideoMatched, 相同的内容Id:" + str);
                return true;
            } else if (!sorVar.s && !sorVar.k && TextUtils.equals(str, skw.FAKE_CONTENT_ID)) {
                spz.c("CacheInterceptor", "preloadVideoMatched, 预加载视频非缓存内容，请求推荐内容匹配");
                return true;
            }
        }
        return false;
    }

    private void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        String j = spj.j(this.f33674a);
        pil.a(this.b.a(), j, "gg_videoMutiTab_hitRate");
        HashMap hashMap = new HashMap();
        hashMap.put("hitCache", z ? "1" : "0");
        pil.a(this.b.a(), j, "gg_videoMutiTab_hitRate", hashMap);
    }
}
