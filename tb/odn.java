package tb;

import android.content.Context;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public class odn {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ZIP_COMMENT_TTID_TYPE = "zipComment";

    /* renamed from: a  reason: collision with root package name */
    private static boolean f31953a;
    private static String b;

    static {
        kge.a(-1514448599);
        f31953a = false;
    }

    public static final String a(Context context) {
        JSONObject a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bbc5dc40", new Object[]{context});
        }
        if (f31953a) {
            return b;
        }
        synchronized (odn.class) {
            if (f31953a) {
                return b;
            }
            String str = "zipTtid  json" + a2.toString();
            String optString = odo.a(context).optString("t");
            if (!TextUtils.isEmpty(optString)) {
                String a3 = odl.a(optString, "Y9RxCqWwTJeLK3n7DkLoR5JcDonJfYsr");
                b = a3;
                if (a3 != null) {
                    b = b.trim();
                }
                String str2 = "zipTtid " + b;
            }
            f31953a = true;
            return b;
        }
    }
}
