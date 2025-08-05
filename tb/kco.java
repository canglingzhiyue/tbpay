package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.shop.common.ShopConstants;
import java.util.Formatter;
import java.util.Locale;

/* loaded from: classes6.dex */
public class kco {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static Formatter f29962a;
    public static StringBuilder b;

    static {
        kge.a(-473598368);
        b = new StringBuilder();
        f29962a = new Formatter(b, Locale.getDefault());
    }

    public static String a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9064aa65", new Object[]{new Integer(i)});
        }
        int i2 = i / 1000;
        int i3 = i2 % 60;
        int i4 = (i2 / 60) % 60;
        int i5 = i2 / ShopConstants.K_ALL_WEEX_ENABLED_CACHE_TIME_DEFAULT;
        b.setLength(0);
        return i5 > 0 ? f29962a.format("%02d:%02d:%02d", Integer.valueOf(i5), Integer.valueOf(i4), Integer.valueOf(i3)).toString() : f29962a.format("%02d:%02d", Integer.valueOf(i4), Integer.valueOf(i3)).toString();
    }

    public static String b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("da9643a6", new Object[]{new Integer(i)});
        }
        int i2 = i % 60;
        int i3 = (i / 60) % 60;
        int i4 = i / ShopConstants.K_ALL_WEEX_ENABLED_CACHE_TIME_DEFAULT;
        b.setLength(0);
        return i4 > 0 ? f29962a.format("%02d:%02d:%02d", Integer.valueOf(i4), Integer.valueOf(i3), Integer.valueOf(i2)).toString() : f29962a.format("%02d:%02d", Integer.valueOf(i3), Integer.valueOf(i2)).toString();
    }
}
