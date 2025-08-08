package tb;

import android.content.Intent;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.favorite.FavoriteConstants;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes4.dex */
public class ebw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1774581252);
        emu.a("com.taobao.android.detail.core.detail.model.ItemIdUtils");
    }

    public static String a(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b1abe71b", new Object[]{intent});
        }
        String a2 = ecp.a(intent, "id");
        if (!StringUtils.isEmpty(a2)) {
            return a2;
        }
        String a3 = ecp.a(intent, "item_id");
        return !StringUtils.isEmpty(a3) ? a3 : b(intent);
    }

    private static String b(Intent intent) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6b2374ba", new Object[]{intent});
        }
        String str2 = "";
        String str3 = null;
        if (StringUtils.isEmpty(str2)) {
            try {
                str = ecp.a(intent, FavoriteConstants.DetailConstants_DETAIL_URL);
            } catch (Exception unused) {
                str = null;
            }
            if (str != null) {
                str2 = a(str);
            }
        }
        if (!StringUtils.isEmpty(str2)) {
            return str2;
        }
        try {
            str3 = intent.getDataString();
        } catch (Exception unused2) {
        }
        return str3 != null ? a(str3) : str2;
    }

    private static String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{str});
        }
        String b = b(str);
        return b != null ? b : c(str);
    }

    private static String b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6111438d", new Object[]{str});
        }
        Matcher matcher = Pattern.compile("//a\\.(?:m|wapa|waptest)\\.(?:taobao|tmall)\\.com/i(\\d+)\\.htm").matcher(str);
        if (matcher.find()) {
            return matcher.group(1);
        }
        Matcher matcher2 = Pattern.compile("//a\\.(?:m|wapa|waptest)\\.(?:taobao|tmall)\\.com.*[?|&](?:id|item_id)=(\\d+)").matcher(str);
        if (!matcher2.find()) {
            return null;
        }
        return matcher2.group(1);
    }

    private static String c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b82f346c", new Object[]{str});
        }
        for (String str2 : new String[]{"[?|&]item_id=(\\d+)", "[?|&]itemId=(\\d+)", "[?|&]item_num_id=(\\d+)", "[?|&]itemNumId=(\\d+)", "[?|&]id=(\\d+)"}) {
            Matcher matcher = Pattern.compile(str2).matcher(str);
            if (matcher.find()) {
                return matcher.group(1);
            }
        }
        return null;
    }
}
