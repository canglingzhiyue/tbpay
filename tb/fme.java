package tb;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail2.core.framework.b;
import com.taobao.android.detail2.core.framework.data.global.NewDetailScreenConfig;
import com.taobao.taobao.R;

/* loaded from: classes5.dex */
public class fme {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EXP_ITEM_ARTICLE = "labVideo";
    public static final String EXP_VERTICAL = "vertical";

    static {
        kge.a(746584704);
    }

    public static float c(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f2debd85", new Object[]{bVar})).floatValue();
        }
        return 40.0f;
    }

    public static Drawable a(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Drawable) ipChange.ipc$dispatch("2be14103", new Object[]{bVar});
        }
        Activity g = bVar.g();
        if (g == null || d(bVar) != NewDetailScreenConfig.ScreenType.NORMAL_PHONE) {
            return null;
        }
        String str = bVar.h().k().E;
        String str2 = bVar.h().k().F;
        if (EXP_ITEM_ARTICLE.equals(str2)) {
            return b(g, R.drawable.preload_bottom_itemarticle);
        }
        if ("vertical".equals(str2)) {
            return b(g, R.drawable.preload_bottom_vertical);
        }
        if ("content".equals(str)) {
            return b(g, R.drawable.preload_bottom_content);
        }
        return b(g, R.drawable.preload_bottom_superitem);
    }

    private static NewDetailScreenConfig.ScreenType d(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (NewDetailScreenConfig.ScreenType) ipChange.ipc$dispatch("f1a5a19f", new Object[]{bVar}) : bVar.h().K().f();
    }

    public static int b(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1351769", new Object[]{bVar})).intValue();
        }
        Activity g = bVar.g();
        if (g == null) {
            return -1;
        }
        String str = bVar.h().k().E;
        if ("vertical".equals(bVar.h().k().F)) {
            return a(g, R.color.new_detail_card_seeding_bg_color);
        }
        if ("content".equals(str)) {
            return a(g, R.color.new_detail_card_content_bg_color);
        }
        return a(g, R.color.new_detail_card_default_bg_color);
    }

    private static int a(Activity activity, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("cabb047c", new Object[]{activity, new Integer(i)})).intValue() : activity.getResources().getColor(i);
    }

    private static Drawable b(Activity activity, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Drawable) ipChange.ipc$dispatch("df9954d2", new Object[]{activity, new Integer(i)}) : activity.getResources().getDrawable(i);
    }
}
