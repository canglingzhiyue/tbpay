package tb;

import android.content.Intent;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.utils.i;

/* loaded from: classes4.dex */
public class ecp {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1118932286);
        emu.a("com.taobao.android.detail.core.detail.utils.IntentUtils");
    }

    public static String a(Intent intent, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f0dec1d1", new Object[]{intent, str});
        }
        if (intent == null) {
            return null;
        }
        try {
            return intent.getStringExtra(str);
        } catch (Exception e) {
            i.a("IntentUtils", "getStringExtra", e);
            return null;
        }
    }

    public static int a(Intent intent, String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e99fc227", new Object[]{intent, str, new Integer(i)})).intValue();
        }
        if (intent == null) {
            return i;
        }
        try {
            return intent.getIntExtra(str, i);
        } catch (Exception e) {
            i.a("IntentUtils", "getIntExtra", e);
            return i;
        }
    }
}
