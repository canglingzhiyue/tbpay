package tb;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.performance.e;
import com.taobao.android.detail.core.performance.l;
import com.taobao.android.detail.core.performance.preload.h;
import com.taobao.android.detail.core.performance.preload.k;
import com.taobao.android.detail.core.utils.i;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public final class feq implements fel {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private ebx f27865a;

    static {
        kge.a(838214946);
        kge.a(-178837752);
    }

    public feq() {
        emu.a("com.taobao.android.detail.wrapper.ext.request.mainParams.impl.PreloadParamsAppender");
    }

    public void a(ebx ebxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e68af17d", new Object[]{this, ebxVar});
        } else {
            this.f27865a = ebxVar;
        }
    }

    @Override // tb.fel
    public Map<String, String> a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("4d84e95", new Object[]{this, context});
        }
        HashMap hashMap = new HashMap();
        h b = b();
        if (b == null) {
            hashMap.put("preload_v", "industry");
            return hashMap;
        }
        hashMap.put("preload_v", b.f);
        hashMap.put("industryFailReason", b.i);
        return hashMap;
    }

    public String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this});
        }
        h b = b();
        return b == null ? "" : b.f;
    }

    private h b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (h) ipChange.ipc$dispatch("c20c351e", new Object[]{this});
        }
        ebx ebxVar = this.f27865a;
        if (ebxVar == null) {
            return null;
        }
        String str = ebxVar.q;
        String str2 = this.f27865a.f27180a;
        if (!e.a(str, str2)) {
            return null;
        }
        h a2 = a(str, str2);
        if (a2 == null) {
            i.c(l.a("PreloadParamsAppender"), "预缓存数据无效：为空");
            return null;
        } else if (a2.a()) {
            i.c(l.a("PreloadParamsAppender"), "预缓存数据无效：CacheExpired");
            return null;
        } else if (!a2.c()) {
            i.c(l.a("PreloadParamsAppender"), "预缓存数据无效：CacheDataNotCanBeUse");
            return null;
        } else if (a2.b()) {
            return a2;
        } else {
            i.c(l.a("PreloadParamsAppender"), "预缓存数据无效：NotAllowableProtocol");
            return null;
        }
    }

    private h a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (h) ipChange.ipc$dispatch("3fac816b", new Object[]{this, str, str2});
        }
        if (StringUtils.isEmpty(str2)) {
            String a2 = l.a("PreloadParamsAppender");
            i.a(a2, "预加载缓存获取本：fromSource:" + str + "itemId:" + str2);
            return null;
        } else if (!e.b(str) && !e.a(str)) {
            String a3 = l.a("PreloadParamsAppender");
            i.a(a3, "预加载缓存获取本：fromSource:" + str + "预加载能力未开启");
            return null;
        } else {
            return k.a().b(str2);
        }
    }
}
