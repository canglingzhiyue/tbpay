package tb;

import android.net.Uri;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.share.multiapp.ShareBizAdapter;
import com.taobao.share.taopassword.busniess.model.f;

/* loaded from: classes8.dex */
public class nyt {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1296917004);
    }

    public static String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[0]) : String.format("%s_%d", ShareBizAdapter.getInstance().getLogin().a(), Long.valueOf(System.currentTimeMillis()));
    }

    public static String a(f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ab5f7db7", new Object[]{fVar});
        }
        String queryParameter = Uri.parse(fVar.z).getQueryParameter("ut_sk");
        if (StringUtils.isEmpty(queryParameter)) {
            return "";
        }
        String[] split = queryParameter.split("\\.");
        return split.length < 3 ? "" : split[2];
    }

    public static String a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b5178ea4", new Object[]{str, str2});
        }
        try {
            int indexOf = str.indexOf("_", str.indexOf("_", str.indexOf("_") + 1) + 1);
            if (indexOf > 0) {
                StringBuilder sb = new StringBuilder(str);
                StringBuilder insert = sb.insert(indexOf, "#" + str2);
                insert.append("_0");
                return insert.toString();
            }
            nyy.c("AmpUtil", "index invalid");
            return null;
        } catch (Exception e) {
            nyy.c("AmpUtil", e.toString());
            return null;
        }
    }
}
