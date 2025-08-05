package tb;

import android.content.Context;
import android.net.Uri;
import android.taobao.util.j;
import android.text.TextUtils;
import android.widget.Toast;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.home.component.utils.e;
import com.taobao.android.home.component.utils.k;
import com.taobao.android.nav.Nav;
import com.taobao.android.task.Coordinator;
import com.taobao.taobao.R;

/* loaded from: classes5.dex */
public class gmp {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1857868017);
    }

    public static boolean a(Context context, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1cb6e294", new Object[]{context, jSONObject})).booleanValue();
        }
        if (jSONObject == null || TextUtils.isEmpty(jSONObject.getString("targetUrl"))) {
            String[] strArr = new String[1];
            StringBuilder sb = new StringBuilder();
            sb.append("item == null || TextUtils.isEmpty(item.getString(S_I_TARGET_URL))");
            if (jSONObject != null) {
                z = false;
            }
            sb.append(z);
            strArr[0] = sb.toString();
            e.e("onItemClick", strArr);
            return false;
        }
        fpa.b("HomePage-MainActivityPub", "onCardItemClick item = " + jSONObject);
        try {
            String a2 = j.a(jSONObject.getString("targetUrl"));
            e.e("onItemClick", "onCardItemClick unescapeUrl = " + a2);
            Uri parse = Uri.parse(a2);
            a(parse, jSONObject);
            e.e("onItemClick", "MainActivityPub common click", "" + parse);
            return a(context, parse);
        } catch (Throwable th) {
            e.e("onItemClick", "出现异常" + th);
            Toast.makeText(context, R.string.homepage_parse_data_error, 0).show();
            return false;
        }
    }

    private static void a(final Uri uri, final JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8dc2cf1", new Object[]{uri, jSONObject});
        } else if (com.taobao.android.home.component.utils.j.a("enableHomePageJumpToNextPageCostOpt", true)) {
            Coordinator.execute(new Runnable() { // from class: tb.gmp.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        k.a(uri, jSONObject);
                    }
                }
            });
        } else {
            k.a(uri, jSONObject);
        }
    }

    private static boolean a(Context context, Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bd717ceb", new Object[]{context, uri})).booleanValue();
        }
        fpa.b("HomePage-MainActivityPub", " openUriWithinWebview uri = " + uri);
        try {
            if (Nav.from(context).toUri(uri)) {
                return true;
            }
            fpa.b("MainActivity3", " openUriWithinWebview jump failed !");
            return Nav.from(context).skipPreprocess().withCategory(mbn.BROWSER_ONLY_CATEGORY).toUri(uri);
        } catch (Exception e) {
            e.printStackTrace();
            Toast.makeText(context, R.string.homepage_parse_data_error, 0).show();
            return false;
        }
    }
}
