package tb;

import android.content.Context;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex.WeexInstance;
import com.taobao.android.weex.WeexInstanceMode;
import com.taobao.android.weex.WeexRenderType;
import com.taobao.android.weex.WeexValue;
import com.taobao.android.weex.config.WeexUnicornConfig;
import com.taobao.android.weex.config.b;
import com.taobao.android.weex.e;

/* loaded from: classes8.dex */
public class irn {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final Context f29257a;
    private final String b;
    private WeexInstance c;

    static {
        kge.a(-2059426023);
    }

    public irn(Context context, String str) {
        this(context, str, true);
    }

    public irn(Context context, String str, boolean z) {
        this.f29257a = context;
        this.b = str;
        WeexUnicornConfig weexUnicornConfig = new WeexUnicornConfig();
        weexUnicornConfig.a(WeexUnicornConfig.RenderMode.texture);
        b bVar = new b();
        bVar.a(weexUnicornConfig);
        this.c = e.a(this.f29257a, str, WeexInstanceMode.DOM, WeexRenderType.UNICORN, null, bVar);
        if (z) {
            this.c.initWithURL(str);
        }
    }

    public View a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("195fbaaa", new Object[]{this}) : a(true);
    }

    public View a(boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("1cd2e8ae", new Object[]{this, new Boolean(z)}) : a(null, z);
    }

    public View a(WeexValue weexValue, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("97df8272", new Object[]{this, weexValue, new Boolean(z)});
        }
        if (z) {
            this.c.render(weexValue);
        }
        return this.c.getRootView();
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        WeexInstance weexInstance = this.c;
        if (weexInstance == null) {
            return;
        }
        weexInstance.onActivityResume();
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        WeexInstance weexInstance = this.c;
        if (weexInstance == null) {
            return;
        }
        weexInstance.onActivityStart();
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        WeexInstance weexInstance = this.c;
        if (weexInstance == null) {
            return;
        }
        weexInstance.onActivityPause();
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        WeexInstance weexInstance = this.c;
        if (weexInstance == null) {
            return;
        }
        weexInstance.onActivityStop();
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        WeexInstance weexInstance = this.c;
        if (weexInstance == null) {
            return;
        }
        weexInstance.destroy();
    }

    public String g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("d71944f2", new Object[]{this}) : this.b;
    }
}
