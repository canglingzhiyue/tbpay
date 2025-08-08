package tb;

import android.content.Context;
import android.os.Build;
import android.os.Process;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.AliLoginInterface;
import com.taobao.android.detail2.core.framework.data.global.NewDetailScreenConfig;
import com.taobao.android.detail2.core.framework.data.model.d;
import com.taobao.android.o;
import com.taobao.application.common.c;
import com.taobao.taobao.R;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public class fjm {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_MEMORY_OPT_LEVEL = "memory-opt-level";
    public static final String KEY_NEW_DETAIL_VISIBLE_BLOCK_RATIO = "screenRatio";

    static {
        kge.a(-754095649);
    }

    public static int b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9eca0ff2", new Object[]{context})).intValue();
        }
        if (context != null) {
            return context.getResources().getDimensionPixelSize(R.dimen.new_detail_nav_bar_height);
        }
        return 0;
    }

    public static int a(Context context, String str, String str2, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("602fb802", new Object[]{context, str, str2, new Integer(i)})).intValue();
        }
        if (context != null && !StringUtils.isEmpty(str2)) {
            try {
                str2 = URLDecoder.decode(str2, "utf-8");
            } catch (UnsupportedEncodingException unused) {
            }
            int a2 = fky.a(context, str, str2);
            if (a2 != -1) {
                return a2;
            }
        }
        return i;
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue() : c.a().a("deviceLevel", -1) == 2;
    }

    public static String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("367c9fd7", new Object[0]);
        }
        AliLoginInterface a2 = o.a();
        if (a2 == null) {
            return null;
        }
        return a2.e();
    }

    public static Map<String, String> a(fkr fkrVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("191a1e60", new Object[]{fkrVar});
        }
        HashMap hashMap = new HashMap();
        NewDetailScreenConfig K = fkrVar.K();
        if (K == null) {
            return hashMap;
        }
        hashMap.put("screenHeight", String.valueOf(K.a()));
        hashMap.put(d.KEY_NEW_DETAIL_VISIBLE_BLOCK_WIDTH, String.valueOf(K.b()));
        hashMap.put(KEY_NEW_DETAIL_VISIBLE_BLOCK_RATIO, String.valueOf(K.c()));
        return hashMap;
    }

    public static boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[0])).booleanValue();
        }
        if ("0".equals(fkr.u())) {
            return false;
        }
        if ("1".equals(fkr.u())) {
            return !d();
        } else if (!"2".equals(fkr.u())) {
            return false;
        } else {
            return !d() || a();
        }
    }

    public static boolean d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[0])).booleanValue() : Build.VERSION.SDK_INT >= 23 && Process.is64Bit();
    }

    public static int a(Context context) {
        int identifier;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9e1d6453", new Object[]{context})).intValue();
        }
        if (context == null || (identifier = context.getResources().getIdentifier("status_bar_height", "dimen", "android")) <= 0) {
            return 0;
        }
        return context.getResources().getDimensionPixelSize(identifier);
    }
}
