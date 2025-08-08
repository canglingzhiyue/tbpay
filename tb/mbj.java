package tb;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.taobao.safemode.k;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.launcher.bootstrap.tao.ability.LinkRule;
import com.taobao.android.launcher.bootstrap.tao.ability.h;
import com.taobao.android.launcher.common.LauncherRuntime;
import com.taobao.android.nav.Nav;
import com.taobao.flowcustoms.afc.a;
import com.taobao.flowcustoms.afc.utils.c;
import com.taobao.linkmanager.afc.utils.e;

/* loaded from: classes7.dex */
public class mbj extends mbn {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1304678870);
    }

    public static /* synthetic */ Object ipc$super(mbj mbjVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // tb.mbn
    public boolean a(Context context, a aVar, String str, Bundle bundle) {
        boolean uri;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("62acc361", new Object[]{this, context, aVar, str, bundle})).booleanValue();
        }
        Bundle bundle2 = new Bundle(bundle);
        if (StringUtils.equals(aVar.f, "h5")) {
            if (e.b(Uri.parse(str))) {
                c.a("linkx", "TbNavCenter === A方案，跳转首页");
                uri = Nav.from(context).withExtras(bundle2).withFlags(65536).disableTransition().toUri(str);
            } else {
                c.a("linkx", "TbNavCenter === A方案，跳其他页面");
                uri = Nav.from(context).withExtras(bundle).withFlags(4259840).disableTransition().toUri(a(context, bundle, true, aVar, str));
            }
            if (uri) {
                return uri;
            }
            bundle2.remove("cold_startup_h5");
            return Nav.from(context).withExtras(bundle2).withFlags(65536).disableTransition().withCategory(mbn.BROWSER_ONLY_CATEGORY).toUri(str);
        }
        bundle.remove("cold_startup_h5");
        return Nav.from(context).withExtras(bundle).toUri(str);
    }

    private Uri a(Context context, Bundle bundle, boolean z, a aVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Uri) ipChange.ipc$dispatch("5d4317ce", new Object[]{this, context, bundle, new Boolean(z), aVar, str});
        }
        if (a.a(bundle)) {
            String str2 = z ? "afc_nav_merge" : "afc_nav_native";
            bundle.putBoolean(str2, true);
            Uri.Builder appendQueryParameter = Uri.parse(aVar.o).buildUpon().clearQuery().appendQueryParameter("h5Url", str);
            try {
                Uri parse = Uri.parse(str);
                for (String str3 : parse.getQueryParameterNames()) {
                    appendQueryParameter.appendQueryParameter(str3, parse.getQueryParameter(str3));
                }
            } catch (Throwable unused) {
            }
            Uri build = appendQueryParameter.build();
            a(build, str, str2);
            return build;
        }
        return Uri.parse(str);
    }

    private void a(Uri uri, String str, String str2) {
        k d;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9187773", new Object[]{this, uri, str, str2});
            return;
        }
        LinkRule b = h.b();
        if ((b != null && !b.nonModule) || (d = LauncherRuntime.d()) == null || d.e == null) {
            return;
        }
        d.e.putExtra(str2, true);
        if (b == null || !b.nonModule) {
            d.e.setData(uri);
        } else if (!StringUtils.isEmpty(str)) {
            d.e.setData(Uri.parse(str));
        } else {
            d.e.setData(null);
        }
    }
}
