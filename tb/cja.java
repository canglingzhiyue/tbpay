package tb;

import android.text.TextUtils;
import android.util.SparseIntArray;
import com.android.alibaba.ip.runtime.IpChange;
import com.android.taobao.safeclean.g;

/* loaded from: classes3.dex */
public class cja {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static SparseIntArray f26298a;

    static {
        kge.a(1955594448);
        f26298a = new SparseIntArray();
        try {
            String string = g.a().f6400a.getString("retry_count", "");
            if (TextUtils.isEmpty(string) || string.equals("{}")) {
                return;
            }
            a(string);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    private static void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{str});
            return;
        }
        String[] split = str.substring(1, str.lastIndexOf(riy.BLOCK_END_STR)).split(",");
        for (int i = 0; i < split.length; i++) {
            f26298a.put(Integer.valueOf(split[i].split("=")[0].trim()).intValue(), Integer.valueOf(split[i].split("=")[1].trim()).intValue());
        }
    }

    public static void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{new Integer(i)});
            return;
        }
        f26298a.put(i, f26298a.get(i) + 1);
        g.a().f6400a.edit().putString("retry_count", f26298a.toString().replaceAll(" ", "")).apply();
    }

    public static int b(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a9d66c2d", new Object[]{new Integer(i)})).intValue() : f26298a.get(i);
    }
}
