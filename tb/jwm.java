package tb;

import android.app.Activity;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.j;
import com.taobao.android.weex_plugin.component.VideoPlatformView;
import com.taobao.avplayer.DWInstance;
import io.unicorn.plugin.platform.WeexPlatformView;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes6.dex */
public class jwm implements j {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final jwm f29833a = new jwm();
    private final WeakHashMap<WeexPlatformView, Boolean> b = new WeakHashMap<>();
    private WeakReference<WeexPlatformView> c = new WeakReference<>(null);
    private final WeakHashMap<Activity, Object> d = new WeakHashMap<>();

    public static jwm b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (jwm) ipChange.ipc$dispatch("16b845bd", new Object[0]) : f29833a;
    }

    /* loaded from: classes6.dex */
    public static class a extends j.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private final WeakReference<WeexPlatformView> d;

        public a(j.c cVar, WeexPlatformView weexPlatformView) {
            this.f15991a = true;
            this.c = cVar;
            this.d = new WeakReference<>(weexPlatformView);
        }

        public a(String str) {
            this.f15991a = false;
            this.b = str;
            this.d = null;
        }

        public WeexPlatformView d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (WeexPlatformView) ipChange.ipc$dispatch("3ce938a3", new Object[]{this});
            }
            WeakReference<WeexPlatformView> weakReference = this.d;
            if (weakReference == null) {
                return null;
            }
            return weakReference.get();
        }
    }

    public void a(WeexPlatformView weexPlatformView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d611420", new Object[]{this, weexPlatformView});
        } else {
            this.b.put(weexPlatformView, Boolean.FALSE);
        }
    }

    public void b(WeexPlatformView weexPlatformView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f0aba3f", new Object[]{this, weexPlatformView});
            return;
        }
        this.b.remove(weexPlatformView);
        if (this.c.get() != weexPlatformView) {
            return;
        }
        this.c = new WeakReference<>(null);
    }

    public void a(WeexPlatformView weexPlatformView, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ec222b4", new Object[]{this, weexPlatformView, new Boolean(z)});
        } else if (!this.b.containsKey(weexPlatformView)) {
        } else {
            this.b.put(weexPlatformView, Boolean.valueOf(z));
            if (!z) {
                return;
            }
            this.c = new WeakReference<>(weexPlatformView);
        }
    }

    private WeexPlatformView c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeexPlatformView) ipChange.ipc$dispatch("3d5f9ea2", new Object[]{this});
        }
        WeexPlatformView weexPlatformView = this.c.get();
        if (weexPlatformView != null) {
            return weexPlatformView;
        }
        for (Map.Entry<WeexPlatformView, Boolean> entry : this.b.entrySet()) {
            WeexPlatformView key = entry.getKey();
            if (entry.getValue().booleanValue()) {
                return key;
            }
        }
        return null;
    }

    @Override // com.taobao.android.weex_framework.j
    public j.b a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (j.b) ipChange.ipc$dispatch("81e3fc2d", new Object[]{this});
        }
        WeexPlatformView c = c();
        if (c == null) {
            return new a("No video component");
        }
        jwk jwkVar = new jwk();
        if (c instanceof VideoPlatformView) {
            jwkVar.a(((VideoPlatformView) c).extractVideoInstance());
        }
        if (jwkVar.f() == null) {
            return new a("Can't extract dw instance");
        }
        return new a(jwkVar, c);
    }

    @Override // com.taobao.android.weex_framework.j
    public void a(j.b bVar) {
        a aVar;
        WeexPlatformView d;
        j.c a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f2858ad", new Object[]{this, bVar});
        } else if (!bVar.b() || (d = (aVar = (a) bVar).d()) == null || (a2 = aVar.a()) == null || a2.f() == null || !(d instanceof VideoPlatformView)) {
        } else {
            ((VideoPlatformView) d).recoverVideoInstance((DWInstance) a2.f());
        }
    }
}
