package tb;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.util.a;
import java.util.Map;

/* loaded from: classes6.dex */
public final class hyo {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static DisplayMetrics f28843a;

    static {
        kge.a(-304533401);
    }

    public static String a(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9e721362", new Object[]{str, jSONObject});
        }
        if (TextUtils.isEmpty(str) || jSONObject == null || jSONObject.isEmpty()) {
            return str;
        }
        StringBuilder sb = new StringBuilder(str);
        if (!str.contains("?")) {
            sb.append("?");
        } else {
            sb.append("&");
        }
        for (Map.Entry<String, Object> entry : jSONObject.entrySet()) {
            if (entry != null && !TextUtils.isEmpty(entry.getKey()) && entry.getValue() != null) {
                sb.append(entry.getKey());
                sb.append("=");
                sb.append(entry.getValue());
                sb.append("&");
            }
        }
        return sb.deleteCharAt(sb.length() - 1).toString();
    }

    public static int a(Context context, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("258f8f53", new Object[]{context, new Float(f)})).intValue();
        }
        if (context != null) {
            return (int) (context.getResources().getDisplayMetrics().density * f);
        }
        return 0;
    }

    public static int a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9e1d6453", new Object[]{context})).intValue();
        }
        if (context == null) {
            return 0;
        }
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        return context.getResources().getConfiguration().orientation == 1 ? displayMetrics.widthPixels : displayMetrics.heightPixels;
    }

    public static int b(Context context, float f) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("3a785794", new Object[]{context, new Float(f)})).intValue() : (int) (f / context.getResources().getDisplayMetrics().density);
    }

    public static DisplayMetrics b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DisplayMetrics) ipChange.ipc$dispatch("ac51d8a2", new Object[]{context});
        }
        if (f28843a == null) {
            Display defaultDisplay = ((WindowManager) context.getSystemService(a.ATOM_EXT_window)).getDefaultDisplay();
            f28843a = new DisplayMetrics();
            defaultDisplay.getMetrics(f28843a);
        }
        return f28843a;
    }

    public static Bitmap a(Resources resources, int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("f43ecce8", new Object[]{resources, new Integer(i), new Integer(i2), new Integer(i3)});
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        try {
            BitmapFactory.decodeResource(resources, i, options);
            options.inSampleSize = a(options, i2, i3);
            options.inJustDecodeBounds = false;
        } catch (Throwable unused) {
        }
        try {
            return BitmapFactory.decodeResource(resources, i, options);
        } catch (Throwable th) {
            hyq.a(null, "decodeSampledBitmapFromResource", hyq.UMB_FEATURE_ORDER_MONITOR, "decodeSampledBitmapFromResource", "DECODE_SKELETON_ERROR", th.toString(), null);
            return null;
        }
    }

    public static int a(BitmapFactory.Options options, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("860e8a99", new Object[]{options, new Integer(i), new Integer(i2)})).intValue();
        }
        int i3 = options.outHeight;
        int i4 = options.outWidth;
        if (i3 <= i2 && i4 <= i) {
            return 1;
        }
        return Math.min(Math.round(i3 / i2), Math.round(i4 / i));
    }

    public static void a(RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("46606596", new Object[]{recyclerView});
            return;
        }
        String c = bxd.c();
        if (TextUtils.isEmpty(c) || recyclerView == null || !"vivo".equalsIgnoreCase(Build.BRAND)) {
            return;
        }
        String lowerCase = c.toLowerCase();
        if (!lowerCase.contains(Build.MODEL.toLowerCase() + ",") || recyclerView.getItemAnimator() == null) {
            return;
        }
        recyclerView.getItemAnimator().setAddDuration(0L);
        recyclerView.getItemAnimator().setChangeDuration(0L);
        recyclerView.getItemAnimator().setMoveDuration(0L);
        hyq.a(null, "disableRecyclerAnim", hyq.UMB_FEATURE_ORDER_MONITOR, "disableRecyclerAnim", "DISABLE_RECYCLER_ANIM", "disabled-recycler-anim", null);
    }

    public static String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{str});
        }
        if (!bgd.a()) {
            return str;
        }
        try {
            JSONObject parseObject = JSONObject.parseObject(str);
            parseObject.put("inner", (Object) "1");
            return parseObject.toJSONString();
        } catch (JSONException unused) {
            return str;
        }
    }
}
