package com.taobao.browser.router;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.taobao.windvane.monitor.a;
import android.taobao.windvane.util.m;
import android.text.TextUtils;
import com.alibaba.android.split.core.splitcompat.j;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.launcher.bootstrap.tao.f;
import com.taobao.android.nav.Nav;
import com.taobao.android.nav.NavRouterActivity;
import com.taobao.android.order.bundle.constants.CoreConstants;
import com.taobao.browser.utils.BrowserUtil;
import com.taobao.statistic.TBS;
import com.taobao.tao.util.NavUrls;
import com.taobao.taobao.R;
import java.net.URISyntaxException;
import java.util.regex.Pattern;
import tb.alz;
import tb.kge;
import tb.mbn;

/* loaded from: classes6.dex */
public class FromH5RouterActivity extends NavRouterActivity {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String IN_PARAM_ORDER_ITEM_DATA_OBJECT = "orderItemDataObject";

    /* renamed from: a  reason: collision with root package name */
    private static String f16836a;
    private static String b;
    private static String c;
    private static String d;
    private static String e;
    private static String f;
    private static String g;
    private static String h;
    private static String i;
    private static String j;
    private static String k;
    private static String l;
    private static String m;
    private static String n;

    public static /* synthetic */ Object ipc$super(FromH5RouterActivity fromH5RouterActivity, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -641568046) {
            super.onCreate((Bundle) objArr[0]);
            return null;
        } else if (hashCode != 514894248) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.attachBaseContext((Context) objArr[0]);
            return null;
        }
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1eb0a9a8", new Object[]{this, context});
            return;
        }
        super.attachBaseContext(context);
        j.b(context);
    }

    public FromH5RouterActivity() {
        f.a("null", "com.taobao.browser.router.FromH5RouterActivity");
    }

    static {
        kge.a(1823110427);
        f16836a = "taobaointent";
        b = "/we/index.htm";
        c = "/my/index.htm";
        d = "/cart/index.htm";
        e = "/we/detail.htm";
        f = "cart";
        g = "myTaobao";
        h = "orderList-5/-Z1";
        i = alz.BizKeyOrderDetail;
        j = "h5.m.taobao.com";
        k = "tm.m.taobao.com";
        l = "/list.htm";
        m = "m.taobao.com";
        n = "5";
    }

    @Override // com.taobao.android.nav.NavRouterActivity, android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.support.v4.app.SupportActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        setContentView(R.layout.loading_mask_layout);
        BrowserUtil.a("FromH5RouterActivity", BrowserUtil.b, BrowserUtil.c, null, null);
    }

    private Intent c(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Intent) ipChange.ipc$dispatch("75b19156", new Object[]{this, uri});
        }
        Intent intent = new Intent();
        intent.setData(uri);
        return intent;
    }

    @Override // com.taobao.android.nav.NavRouterActivity
    public Uri a(Uri uri) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Uri) ipChange.ipc$dispatch("6832b116", new Object[]{this, uri}) : d(uri);
    }

    private Uri d(Uri uri) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Uri) ipChange.ipc$dispatch("8c2a86f3", new Object[]{this, uri});
        }
        String host = uri.getHost();
        Intent intent = getIntent();
        TBS.Ext.commitEvent(15311, "UseStat", "FromH5RouterActivity", uri.toString());
        try {
            str = intent.getStringExtra("share_trace_method");
        } catch (Exception unused) {
            str = "";
        }
        if ("client_direct".equals(str)) {
            TBS.Ext.commitEvent(5004, uri.toString());
        }
        if (uri.getScheme().equalsIgnoreCase(f16836a)) {
            b(uri);
            return null;
        }
        if (host.equals(j)) {
            String path = uri.getPath();
            if (c.equals(path)) {
                return h(uri);
            }
            if (d.equals(path)) {
                return g(uri);
            }
        } else if (host.equals(k)) {
            return f(uri);
        } else {
            if (host.equals(m)) {
                return e(uri);
            }
        }
        Nav.from(this).toUri(uri.toString());
        return null;
    }

    private Uri e(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Uri) ipChange.ipc$dispatch("ed7d2392", new Object[]{this, uri});
        }
        String queryParameter = uri.getQueryParameter("weburl");
        if (!TextUtils.isEmpty(queryParameter)) {
            Nav.from(this).toUri(queryParameter);
        } else {
            String uri2 = uri.toString();
            if (!TextUtils.isEmpty(uri2) && uri2.contains("/?")) {
                String substring = uri2.substring(uri2.indexOf("/?") + 1);
                Nav from = Nav.from(this);
                from.toUri("http://m.taobao.com/index.htm" + substring);
                m.b("parseMain", "http://m.taobao.com/index.htm" + substring);
            } else {
                m.b("parseMain", null);
                Nav.from(this).toUri("http://m.taobao.com/index.htm");
            }
        }
        return null;
    }

    private Uri f(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Uri) ipChange.ipc$dispatch("4ecfc031", new Object[]{this, uri});
        }
        String path = uri.getPath();
        if (path == null || path.indexOf(l) < 0 || !n.equals(uri.getQueryParameter("statusId"))) {
            return null;
        }
        Nav.from(this).toUri(uri);
        return null;
    }

    private Uri g(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Uri) ipChange.ipc$dispatch("b0225cd0", new Object[]{this, uri});
        }
        String fragment = uri.getFragment();
        c(uri);
        if (!TextUtils.isEmpty(fragment) && fragment.indexOf(f) < 0) {
            return null;
        }
        Nav.from(this).toUri(uri);
        return null;
    }

    private Uri h(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Uri) ipChange.ipc$dispatch("1174f96f", new Object[]{this, uri});
        }
        String fragment = uri.getFragment();
        if (!TextUtils.isEmpty(fragment) && fragment.indexOf(g) >= 0) {
            Nav.from(this).toUri(uri);
            return null;
        } else if (!TextUtils.isEmpty(fragment) && fragment.indexOf(h) >= 0) {
            Nav.from(this).disallowLoopback().toUri(uri);
            return null;
        } else if (!TextUtils.isEmpty(fragment) && fragment.indexOf(i) >= 0) {
            String[] split = fragment.split("-");
            if (split.length <= 2) {
                return null;
            }
            String str = split[1];
            Bundle bundle = new Bundle();
            bundle.putString(CoreConstants.IN_PARAM_BIZ_ORDER_ID, str);
            Nav.from(this).withExtras(bundle).toUri(NavUrls.NAV_URL_ORDER_DETAIL);
            return null;
        } else {
            Nav.from(this).disallowLoopback().toUri(uri);
            return null;
        }
    }

    private boolean i(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e5d05adb", new Object[]{this, uri})).booleanValue();
        }
        if (TextUtils.isEmpty("")) {
            return false;
        }
        return Pattern.compile("").matcher(uri.toString()).matches();
    }

    public void b(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3828407e", new Object[]{this, uri});
        } else if (!i(uri)) {
        } else {
            try {
                Intent parseUri = Intent.parseUri(uri.toString().trim().substring(15), 0);
                a.commitFail("parseUri", 2, "parseUri", uri.toString().trim());
                parseUri.addCategory("android.intent.category.BROWSABLE");
                parseUri.setComponent(null);
                parseUri.setSelector(null);
                if (parseUri.resolveActivityInfo(getPackageManager(), 65536) != null) {
                    startActivity(parseUri);
                    return;
                }
                Bundle extras = parseUri.getExtras();
                if (extras == null) {
                    return;
                }
                String string = extras.getString("outUrl");
                if (TextUtils.isEmpty(string)) {
                    return;
                }
                Intent c2 = c(uri);
                c2.putExtra("myBrowserUrl", string);
                c2.addCategory(mbn.BROWSER_ONLY_CATEGORY);
                startActivity(c2);
            } catch (URISyntaxException e2) {
                e2.printStackTrace();
            }
        }
    }
}
