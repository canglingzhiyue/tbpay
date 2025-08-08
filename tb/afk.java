package tb;

import android.content.Intent;
import android.net.Uri;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.cachecleaner.autoclear.biz.data.BizTaskData;
import java.util.HashMap;

/* loaded from: classes5.dex */
public class afk {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-2134657019);
    }

    public static void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{str, str2});
            return;
        }
        HashMap hashMap = new HashMap();
        if (str2 != null) {
            hashMap.put("c1", str2);
        }
        bap.b("下单降级H5监控", BizTaskData.MANUAL_TIME, "26607-tracker", "taobao.lightbuy.monitor", "downgrade_native_android", "1", hashMap, str);
    }

    public static void a(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8033c25", new Object[]{intent});
            return;
        }
        HashMap hashMap = new HashMap();
        String b = b(intent);
        if (b == null) {
            b = "";
        }
        bap.b("light-buy曝光", BizTaskData.MANUAL_TIME, "26607-tracker", "taobao.lightbuy.monitor", "lightbuy_exposure_android", "1", hashMap, b);
    }

    public static void b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65d7b87d", new Object[]{str, str2});
            return;
        }
        HashMap hashMap = new HashMap();
        if (str2 != null) {
            hashMap.put("c1", str2);
        }
        bap.b("light-buy异常", BizTaskData.MANUAL_TIME, "26607-tracker", "taobao.lightbuy.monitor", "lightbuy_exception_android", "1", hashMap, str);
    }

    public static void c(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f277e37e", new Object[]{str, str2});
            return;
        }
        HashMap hashMap = new HashMap();
        if (str2 != null) {
            hashMap.put("c1", str2);
        }
        bap.b("light-buy实例预热", BizTaskData.MANUAL_TIME, "26607-tracker", "taobao.lightbuy.monitor", "lightbuy_instance_preload_android", "1", hashMap, str);
    }

    private static String b(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6b2374ba", new Object[]{intent});
        }
        String stringExtra = intent.getStringExtra("openFrom");
        Uri data = intent.getData();
        if (data == null) {
            return stringExtra;
        }
        return StringUtils.isEmpty(stringExtra) ? data.getQueryParameter("openFrom") : null;
    }
}
