package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.behavir.BehaviR;
import com.taobao.umipublish.draft.DraftMediaHelper;
import com.ut.mini.UTAnalytics;
import com.ut.mini.internal.UTOriginalCustomHitBuilder;
import java.util.Map;

/* loaded from: classes4.dex */
public class eux {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    public static String f27590a = "Page_Detail";
    public static String b = "Detail_MainImg_Sku";

    public static void a(String str, int i, String str2, String str3, String str4, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b903f76", new Object[]{str, new Integer(i), str2, str3, str4, map});
            return;
        }
        try {
            UTAnalytics.getInstance().getDefaultTracker().send(new UTOriginalCustomHitBuilder(str, i, str2, str3, str4, map).build());
            if (i == 2101) {
                BehaviR.getInstance().commitNewTap(str, str2, null, eul.a(map));
            } else if (i == 2201) {
                BehaviR.getInstance().trackAppear(str, str2, null, null, eul.a(map));
            }
        } catch (Throwable unused) {
        }
    }

    public static void a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{map});
            return;
        }
        map.put(jiq.TYPE_EDITION_CHANGE, "new");
        map.put("spm", "a2141.7631564.movepic");
        a(f27590a, 2101, f27590a + "_Button_MovePic", null, null, map);
    }

    public static void b(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41e3e87c", new Object[]{map});
            return;
        }
        map.put(jiq.TYPE_EDITION_CHANGE, "new");
        map.put("spm", "a2141.7631564.picypage");
        a(f27590a, 2101, f27590a + "_Button_PicPage_Slide", null, null, map);
    }

    public static void a(Map<String, String> map, boolean z) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee00e457", new Object[]{map, new Boolean(z)});
            return;
        }
        String str2 = f27590a;
        if (z) {
            str = f27590a + "_Button_SlideToLightOff";
        } else {
            str = f27590a + "_Button_SlideTo";
        }
        map.put(jiq.TYPE_EDITION_CHANGE, "new");
        map.put("spm", "a2141.7631564.slidetol");
        map.put("type", DraftMediaHelper.DraftType.PRODUCT);
        a(str2, 2101, str, null, null, map);
    }

    public static void c(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2985bedb", new Object[]{map});
            return;
        }
        map.put(jiq.TYPE_EDITION_CHANGE, "new");
        map.put("spm", "a2141.7631564.picypage");
        a(f27590a, 2101, f27590a + "_Button_PicPage_LongPress", null, null, map);
    }

    public static void d(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1127953a", new Object[]{map});
            return;
        }
        map.put(jiq.TYPE_EDITION_CHANGE, "new");
        map.put("spm", "a2141.7631564.picypage");
        a(f27590a, 2101, f27590a + "_Button_PicPage_View", null, null, map);
    }

    public static void e(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8c96b99", new Object[]{map});
            return;
        }
        map.put(jiq.TYPE_EDITION_CHANGE, "new");
        map.put("spm", "a2141.7631564.picypage");
        a(f27590a, 2101, f27590a + "_Button_PicPage_Save", null, null, map);
    }

    public static void f(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e06b41f8", new Object[]{map});
            return;
        }
        map.put(jiq.TYPE_EDITION_CHANGE, "new");
        map.put("spm", "a2141.7631564.picypage");
        a(f27590a, 2101, f27590a + "_Button_PicPage_Query", null, null, map);
    }

    public static void g(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c80d1857", new Object[]{map});
            return;
        }
        map.put(jiq.TYPE_EDITION_CHANGE, "new");
        map.put("spm", "a2141.7631564.picypage");
        a(f27590a, 2201, f27590a + "_Show_PicPage_Query", null, null, map);
    }
}
