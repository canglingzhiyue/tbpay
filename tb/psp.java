package tb;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.res.Configuration;
import android.net.Uri;
import android.taobao.windvane.util.m;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.taolivecontainer.TBLiveH5Container;
import com.taobao.taolivecontainer.b;

/* loaded from: classes8.dex */
public class psp {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final String b;

    /* renamed from: a  reason: collision with root package name */
    public String f32866a;
    private int c;
    private ComponentCallbacks d;

    public static /* synthetic */ String d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("43881515", new Object[0]) : b;
    }

    static {
        kge.a(1988304972);
        b = psp.class.getSimpleName();
    }

    public boolean a(String str, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f2b4237a", new Object[]{this, str, bVar})).booleanValue();
        }
        float b2 = akt.b();
        if (b2 >= 0.0f && b2 <= 20.0f) {
            String str2 = b;
            m.e(str2, "score: " + b2 + ",低端机取消预渲染!");
            return false;
        }
        TBLiveH5Container b3 = bVar.b();
        if (b3 == null) {
            m.e(b, "预渲染失败，没有预创建WebView!");
            return false;
        }
        b3.setTag(R.id.taolive_container_prerender_status, true);
        Uri.Builder buildUpon = Uri.parse(str).buildUpon();
        buildUpon.appendQueryParameter("tl-x-prerender-enabled", "true");
        String uri = buildUpon.build().toString();
        this.f32866a = uri;
        b3.loadUrl(uri);
        this.d = new a(b3);
        b3.getContext().registerComponentCallbacks(this.d);
        this.c = 1;
        this.f32866a = uri;
        return true;
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else if (z) {
            this.c = 2;
        } else {
            this.c = 3;
        }
    }

    public boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{this, str})).booleanValue();
        }
        if (this.c == 2 && !StringUtils.isEmpty(str) && !StringUtils.isEmpty(this.f32866a)) {
            Uri parse = Uri.parse(this.f32866a);
            Uri parse2 = Uri.parse(str);
            String str2 = "";
            String host = parse.getHost() != null ? parse.getHost() : str2;
            String host2 = parse2.getHost() != null ? parse2.getHost() : str2;
            String scheme = parse.getScheme() != null ? parse.getScheme() : str2;
            String scheme2 = parse2.getScheme() != null ? parse2.getScheme() : str2;
            String path = parse.getPath() != null ? parse.getPath() : str2;
            String path2 = parse2.getPath() != null ? parse2.getPath() : str2;
            String queryParameter = parse.getQueryParameter("wh_pid") != null ? parse.getQueryParameter("wh_pid") : str2;
            if (parse2.getQueryParameter("wh_pid") != null) {
                str2 = parse2.getQueryParameter("wh_pid");
            }
            if (host.equals(host2) && scheme.equals(scheme2) && path.equals(path2) && queryParameter.equals(str2)) {
                return true;
            }
        }
        return false;
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : 3 == this.c;
    }

    public boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : 1 == this.c;
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        this.c = 0;
        this.f32866a = null;
    }

    public void a(TBLiveH5Container tBLiveH5Container) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7eb2088", new Object[]{this, tBLiveH5Container});
        } else if (tBLiveH5Container == null || tBLiveH5Container.getContext() == null) {
        } else {
            tBLiveH5Container.getContext().unregisterComponentCallbacks(this.d);
        }
    }

    /* loaded from: classes8.dex */
    public static final class a implements ComponentCallbacks {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private TBLiveH5Container f32867a;

        static {
            kge.a(-1106313645);
            kge.a(-706226841);
        }

        @Override // android.content.ComponentCallbacks
        public void onConfigurationChanged(Configuration configuration) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("eb2f300c", new Object[]{this, configuration});
            }
        }

        private a(TBLiveH5Container tBLiveH5Container) {
            this.f32867a = tBLiveH5Container;
        }

        @Override // android.content.ComponentCallbacks
        public void onLowMemory() {
            Context context;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4bbd23dd", new Object[]{this});
            } else if (this.f32867a.isDestroied() || this.f32867a.isAttachedToWindow() || (context = this.f32867a.getContext()) == null || !(this.f32867a.getTag(R.id.taolive_container_prerender_status) instanceof Boolean) || !((Boolean) this.f32867a.getTag(R.id.taolive_container_prerender_status)).booleanValue()) {
            } else {
                this.f32867a.destroy();
                context.unregisterComponentCallbacks(this);
                m.e(psp.d(), "系统资源紧张，释放没有上屏的WebView");
            }
        }
    }
}
