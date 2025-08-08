package tb;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes8.dex */
public class tea {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String INDICATOR_COLOR = "indicatorColor";
    public static final String MORE_IMAGE = "moreImage";
    public static final String SEARCH_BAR_BG_COLOR = "searchbarBgColor";
    public static final String SEARCH_BAR_BG_IMAGE = "searchbarBgImage";
    public static final String TAB_BG = "tabBg";
    public static final String TAB_IMAGE = "tabImage";
    public static final String TAB_TEXT_COLOR = "tabTextColor";
    public static final String TAB_TEXT_SIZE = "tabTextSize";

    /* renamed from: a  reason: collision with root package name */
    private static final Map<String, String> f34054a;

    static {
        kge.a(-896591421);
        f34054a = new ConcurrentHashMap();
    }

    public static boolean a(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8123ad15", new Object[]{str, new Integer(i)})).booleanValue();
        }
        if (!StringUtils.isEmpty(str)) {
            return b(str, String.valueOf(i));
        }
        return false;
    }

    public static boolean a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d9378d80", new Object[]{str, str2})).booleanValue();
        }
        if (!StringUtils.isEmpty(str)) {
            return b(str, str2);
        }
        return false;
    }

    private static boolean b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("65d7b881", new Object[]{str, str2})).booleanValue();
        }
        boolean equals = StringUtils.equals(f34054a.get(str), str2);
        if (!equals) {
            f34054a.put(str, str2);
        }
        return equals;
    }
}
