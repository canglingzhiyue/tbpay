package tb;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import com.taobao.weex.appfram.navigator.a;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public class rgz implements a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Context f33151a;

    static {
        kge.a(1465314039);
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

    public rgz(Context context) {
        this.f33151a = context;
    }

    @Override // com.taobao.weex.appfram.navigator.a
    public boolean push(String str) {
        String optString;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("68dc3a2f", new Object[]{this, str})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
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
        return Nav.from(this.f33151a).toUri(buildUpon.toString());
    }
}
