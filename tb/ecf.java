package tb;

import android.content.Context;
import android.util.Pair;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* loaded from: classes4.dex */
public class ecf {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int EVENT_ID_CLICK = 2101;
    public static final int EVENT_ID_SHOW = 2201;
    public static final String PAGE_NAME = "Page_Detail";

    static {
        kge.a(-1631242010);
        emu.a("com.taobao.android.detail.core.detail.profile.TBPathTracker");
    }

    public static void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{context});
        } else {
            eps.a(context, "BackToTop", new Pair[0]);
        }
    }

    public static void b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9eca0fff", new Object[]{context});
        } else {
            eps.a(context, "Back", new Pair[0]);
        }
    }

    public static void c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f76bb9e", new Object[]{context});
        } else {
            eps.a(context, "CopyTitle", new Pair("spm", "a2141.7631564.title"));
        }
    }

    public static void d(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a023673d", new Object[]{context});
        } else {
            eps.a(context, "CopyUrl", new Pair("spm", "a2141.7631564.title"));
        }
    }

    public static void e(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0d012dc", new Object[]{context});
        } else {
            eps.a(context, "GoodsTitleShare", new Pair("spm", "a2141.7631564.title"));
        }
    }

    public static void a(Context context, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("258f9aa3", new Object[]{context, new Integer(i)});
            return;
        }
        eps.a(context, "MovePic", new Pair("spm", "a2141.7631564.1999020712." + i));
    }

    public static void f(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a17cbe7b", new Object[]{context});
        } else {
            eps.a(context, "ItemDetail3", new Pair[0]);
        }
    }

    public static void a(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61b6362a", new Object[]{context, str});
        } else {
            eps.a(context, "PlayPagePlay", new Pair("sourcetype", str));
        }
    }

    public static void g(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2296a1a", new Object[]{context});
        } else {
            eps.a(context, "MiniVideoClick", new Pair[0]);
        }
    }

    public static void b(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b80d809", new Object[]{context, str});
        } else {
            eps.a(context, "MiniVideoClose", new Pair("sourcetype", str));
        }
    }

    public static void h(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2d615b9", new Object[]{context});
        } else {
            eps.a(context, "Promotion", new Pair[0]);
        }
    }

    public static void c(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d54b79e8", new Object[]{context, str});
        } else {
            eps.a(context, "FetchCoupon", new Pair("type", str));
        }
    }

    public static void d(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f161bc7", new Object[]{context, str});
        } else {
            eps.a(context, "CouponActivity", new Pair("type", str), new Pair("spm", "a2141.7631564.2209828"));
        }
    }

    public static void a(Context context, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8df32b25", new Object[]{context, map});
        } else {
            eps.a(context, "Page_Detail", 2101, "Page_Detail_Button-NPS", null, null, ect.a(map));
        }
    }

    public static void b(Context context, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2893eda6", new Object[]{context, map});
        } else {
            eps.a(context, "Page_Detail", 2201, "Page_Detail_Show-NPS", null, null, ect.a(map));
        }
    }

    public static void c(Context context, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c334b027", new Object[]{context, map});
        } else {
            eps.a(context, "Page_Detail", 2101, "Page_Detail_Button-Discuss", null, null, ect.a(map));
        }
    }

    public static void d(Context context, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd572a8", new Object[]{context, map});
        } else {
            eps.a(context, "Page_Detail", 2201, "Page_Detail_Show-Discuss", null, null, ect.a(map));
        }
    }

    public static void e(Context context, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8763529", new Object[]{context, map});
        } else {
            eps.a(context, "Page_Detail", 2201, "Page_Detail_detail_hintq_exposure", null, null, ect.a(map));
        }
    }

    public static void f(Context context, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9316f7aa", new Object[]{context, map});
        } else {
            eps.a(context, "Page_Detail", 2101, "Page_Detail_detail_hintq_click", null, null, ect.a(map));
        }
    }

    public static void g(Context context, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2db7ba2b", new Object[]{context, map});
        } else {
            eps.a(context, "Page_Detail", 2101, "Page_Detail_Button_MuteButton_Industry", null, null, ect.a(map));
        }
    }

    public static void h(Context context, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8587cac", new Object[]{context, map});
        } else {
            eps.a(context, "Page_Detail", 2201, "Page_Detail_Preload_Consist", null, null, ect.a(map));
        }
    }

    public static void i(Context context, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("62f93f2d", new Object[]{context, map});
        } else {
            eps.a(context, "Page_Detail", 2101, "Page_Detail_Button_ContentTab_Card", null, null, ect.b(map));
        }
    }

    public static void j(Context context, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd9a01ae", new Object[]{context, map});
        } else {
            eps.a(context, "Page_Detail", 2101, "Page_Detail_Button_ContentTab_Filter", null, null, ect.b(map));
        }
    }

    public static void k(Context context, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("983ac42f", new Object[]{context, map});
        } else {
            eps.a(context, "Page_Detail", 2201, "Page_Detail_Consist", null, null, ect.a(map));
        }
    }

    public static void e(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48e0bda6", new Object[]{context, str});
        } else {
            eps.a(context, "Page_Detail", 2201, "Page_Detail_Show_Lift", str, null, new String[0]);
        }
    }

    public static void a(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d18de974", new Object[]{context, str, str2});
        } else {
            eps.a(context, "Page_Detail", 2101, "Page_Detail_Button-".concat(str2), str, null, new String[0]);
        }
    }

    public static void l(Context context, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32db86b0", new Object[]{context, map});
        } else {
            eps.a(context, "Page_Detail", 2201, "Page_Detail_Show-ItemFeature-Adjusted", null, null, ect.a(map));
        }
    }

    public static void i(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a382c158", new Object[]{context});
        } else {
            eps.a(context, "Page_Detail", 2201, "Page_Detail_Show_Shop", "detailV3", null, new String[0]);
        }
    }

    public static void j(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a42f6cf7", new Object[]{context});
        } else {
            eps.a(context, "Page_Detail", 2101, "Page_Detail_Button_Shop", "detailV3", null, new String[0]);
        }
    }

    public static void f(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("82ab5f85", new Object[]{context, str});
            return;
        }
        eps.a(context, "Page_Detail", 2101, "Page_Detail_Button_SlideLeft", "detailV3", null, "slideBefore=" + str, "slideAfter=店铺");
    }

    public static void a(Context context, String str, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a974c1b", new Object[]{context, str, map});
        } else {
            eps.a(context, "Page_Detail", 2101, str, null, null, ect.b(map));
        }
    }
}
