package tb;

import android.content.Context;
import android.graphics.Color;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamic.e;
import com.taobao.android.dinamic.j;
import java.util.Map;

/* loaded from: classes5.dex */
public class fpn {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int HEIGHT = 1;
    public static final int MARGINBOTTOM = 5;
    public static final int MARGINLEFT = 2;
    public static final int MARGINRIGHT = 4;
    public static final int MARGINTOP = 3;
    public static final int WIDTH = 0;

    static {
        kge.a(-480891037);
    }

    public static void a(View view, ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76d971a9", new Object[]{view, viewGroup});
            return;
        }
        fpq fpqVar = (fpq) view.getTag(j.PROPERTY_KEY);
        if (fpqVar == null || !(view instanceof ViewGroup)) {
            return;
        }
        int[] a2 = a(view.getContext(), fpqVar.b);
        if (viewGroup == null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(a2[0], a2[1]);
            marginLayoutParams.setMargins(a2[2], a2[3], a2[4], a2[5]);
            view.setLayoutParams(marginLayoutParams);
            if (!e.a()) {
                return;
            }
            fpa.a(e.TAG, "reflect layout params fail");
            return;
        }
        ViewGroup.LayoutParams layoutParams = (ViewGroup.LayoutParams) fpk.a(viewGroup, "generateDefaultLayoutParams", new Object[0]);
        if (layoutParams != null) {
            layoutParams.width = a2[0];
            layoutParams.height = a2[1];
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ((ViewGroup.MarginLayoutParams) layoutParams).setMargins(a2[2], a2[3], a2[4], a2[5]);
            }
            view.setLayoutParams(layoutParams);
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams2 = new ViewGroup.MarginLayoutParams(a2[0], a2[1]);
        marginLayoutParams2.setMargins(a2[2], a2[3], a2[4], a2[5]);
        view.setLayoutParams(marginLayoutParams2);
        if (!e.a()) {
            return;
        }
        fpa.a(e.TAG, "reflect layout params fail");
    }

    public static int[] a(Context context, Map<String, Object> map) {
        int a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (int[]) ipChange.ipc$dispatch("30723a5f", new Object[]{context, map});
        }
        String str = (String) map.get("dWidth");
        String str2 = (String) map.get("dHeight");
        int i = -1;
        if (StringUtils.equals(str, "match_content")) {
            a2 = -2;
        } else {
            a2 = StringUtils.equals(str, "match_parent") ? -1 : fpr.a(context, str, 0);
        }
        if (StringUtils.equals(str2, "match_content")) {
            i = -2;
        } else if (!StringUtils.equals(str2, "match_parent")) {
            i = fpr.a(context, str2, 0);
        }
        return new int[]{a2, i, fpr.a(context, map.get("dMarginLeft"), 0), fpr.a(context, map.get("dMarginTop"), 0), fpr.a(context, map.get("dMarginRight"), 0), fpr.a(context, map.get("dMarginBottom"), 0)};
    }

    public static int a(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5a421210", new Object[]{map})).intValue();
        }
        if (!map.containsKey("dGravity")) {
            return -1;
        }
        switch (Integer.valueOf((String) map.get("dGravity")).intValue()) {
            case 0:
                return 48;
            case 1:
                return 16;
            case 2:
                return 80;
            case 3:
                return 49;
            case 4:
                return 17;
            case 5:
                return 81;
            case 6:
                return 53;
            case 7:
                return 21;
            case 8:
                return 85;
            default:
                return -1;
        }
    }

    public static int a(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8123ad04", new Object[]{str, new Integer(i)})).intValue();
        }
        if (StringUtils.isEmpty(str)) {
            return i;
        }
        try {
            return Color.parseColor(str);
        } catch (Throwable th) {
            if (e.a()) {
                fpa.a(e.TAG, th, str, "写法错误，解析出错");
            }
            return i;
        }
    }
}
