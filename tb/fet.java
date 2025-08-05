package tb;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import com.taobao.weex.appfram.navigator.a;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public class fet implements a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Context f27866a;
    private boolean b = true;

    static {
        kge.a(1682464970);
        kge.a(684822686);
    }

    @Override // com.taobao.weex.appfram.navigator.a
    public boolean clearNavBarLeftItem(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("afd47acc", new Object[]{this, str})).booleanValue();
        }
        return false;
    }

    @Override // com.taobao.weex.appfram.navigator.a
    public boolean clearNavBarMoreItem(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3bac709a", new Object[]{this, str})).booleanValue();
        }
        return false;
    }

    @Override // com.taobao.weex.appfram.navigator.a
    public boolean clearNavBarRightItem(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("43b81447", new Object[]{this, str})).booleanValue();
        }
        return false;
    }

    @Override // com.taobao.weex.appfram.navigator.a
    public boolean pop(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("665cea26", new Object[]{this, str})).booleanValue();
        }
        return false;
    }

    @Override // com.taobao.weex.appfram.navigator.a
    public boolean setNavBarLeftItem(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("37e9da61", new Object[]{this, str})).booleanValue();
        }
        return false;
    }

    @Override // com.taobao.weex.appfram.navigator.a
    public boolean setNavBarMoreItem(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c3c1d02f", new Object[]{this, str})).booleanValue();
        }
        return false;
    }

    @Override // com.taobao.weex.appfram.navigator.a
    public boolean setNavBarRightItem(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("be4ea752", new Object[]{this, str})).booleanValue();
        }
        return false;
    }

    @Override // com.taobao.weex.appfram.navigator.a
    public boolean setNavBarTitle(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("832309b", new Object[]{this, str})).booleanValue();
        }
        return false;
    }

    public fet(Context context) {
        this.f27866a = context;
        emu.a("com.taobao.android.detail.wrapper.ext.service.NavigatorBarSetter");
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            this.b = true;
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else {
            this.b = false;
        }
    }

    @Override // com.taobao.weex.appfram.navigator.a
    public boolean push(String str) {
        String optString;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("68dc3a2f", new Object[]{this, str})).booleanValue();
        }
        if (!this.b || TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            optString = new JSONObject(str).optString("url", "");
        } catch (Exception unused) {
        }
        if (TextUtils.isEmpty(optString)) {
            return false;
        }
        Uri parse = Uri.parse(optString);
        String scheme = parse.getScheme();
        Uri.Builder buildUpon = parse.buildUpon();
        if (!TextUtils.equals(scheme, "http") && !TextUtils.equals(scheme, "https")) {
            buildUpon.scheme("http");
        }
        return Nav.from(fpz.b(this.f27866a)).toUri(buildUpon.toString());
    }
}
