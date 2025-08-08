package tb;

import android.net.Uri;
import android.os.Bundle;
import android.taobao.windvane.config.a;
import mtopsdk.common.util.StringUtils;
import com.alipay.android.msp.constants.MspFlybirdDefine;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import com.taobao.share.globalmodel.TBShareContent;
import com.taobao.share.globalmodel.e;
import com.taobao.share.taopassword.b;
import com.taobao.statistic.TBS;
import com.taobao.tao.util.UriUtil;
import com.ut.share.business.ShareTargetType;
import java.util.Map;

/* loaded from: classes8.dex */
public class oil implements oiq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1266601858);
        kge.a(-2068678803);
    }

    @Override // tb.oiq
    public void a(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20476513", new Object[]{this, str, map});
            return;
        }
        b.a(str);
        if (ShareTargetType.Share2IShopping.getValue().equals(str)) {
            b();
        } else if (!ShareTargetType.Share2IPresent.getValue().equals(str)) {
        } else {
            TBS.Ext.commitEvent("Page_Extend", 19999, "ClickGiftFromShare");
            a();
        }
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        TBShareContent j = e.b().j();
        Uri build = new Uri.Builder().scheme(Uri.parse(a.p()).getHost()).path("tbshare/gifts/index.html").appendQueryParameter(MspFlybirdDefine.FLYBIRD_MINIWIN, "share").appendQueryParameter("itemId", e.b().f()).build();
        Bundle bundle = new Bundle();
        bundle.putString(MspFlybirdDefine.FLYBIRD_MINIWIN, "share");
        Map<String, String> queryUrlParams = UriUtil.queryUrlParams(j.url);
        if (queryUrlParams != null) {
            for (Map.Entry<String, String> entry : queryUrlParams.entrySet()) {
                bundle.putString(entry.getKey(), entry.getValue());
            }
        }
        if (j.extraParams != null) {
            for (Map.Entry<String, String> entry2 : queryUrlParams.entrySet()) {
                bundle.putString(entry2.getKey(), entry2.getValue());
            }
        }
        bundle.putString("itemId", e.b().f());
        Nav.from(nym.a()).withExtras(bundle).toUri(build);
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        Map<String, String> map = e.b().j().extraParams;
        String str = map != null ? map.get("guangShareUrl") : null;
        if (StringUtils.isEmpty(str)) {
            Nav.from(nym.a()).toUri(new Uri.Builder().scheme(Uri.parse(a.p()).getHost()).path("guang/publish.html").appendQueryParameter(MspFlybirdDefine.FLYBIRD_MINIWIN, "share").appendQueryParameter("itemId", e.b().f()).build());
        } else {
            Nav.from(nym.a()).toUri(a(a(str, MspFlybirdDefine.FLYBIRD_MINIWIN, "share"), "itemId", e.b().f()));
        }
    }

    public static String a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("457cf91a", new Object[]{str, str2, str3});
        }
        if (StringUtils.isEmpty(str) || StringUtils.isEmpty(str2) || StringUtils.isEmpty(str3)) {
            return str;
        }
        String str4 = str.indexOf("?") >= 0 ? "&" : "?";
        StringBuilder sb = new StringBuilder();
        if (!str2.endsWith("=")) {
            str2 = str2 + "=";
        }
        int indexOf = str.indexOf(str2);
        if (indexOf > 0) {
            int i = indexOf - 1;
            if (str.startsWith("&", i) || str.startsWith("?", i)) {
                sb.append(str.substring(0, indexOf));
                sb.append(str2);
                sb.append(str3);
                int indexOf2 = str.indexOf("&", indexOf);
                if (indexOf2 > indexOf) {
                    sb.append(str.substring(indexOf2));
                }
                return sb.toString();
            }
        }
        sb.append(str);
        sb.append(str4);
        sb.append(str2);
        sb.append(str3);
        return sb.toString();
    }
}
