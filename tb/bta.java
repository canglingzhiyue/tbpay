package tb;

import android.content.Context;
import android.text.TextUtils;
import com.alipay.android.msp.framework.db.MspDBHelper;
import com.android.alibaba.ip.runtime.IpChange;
import com.meizu.cloud.pushsdk.notification.model.AdvertisementOption;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public class bta {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final Map<String, String> f26119a;

    public static Map<String, String> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("a014a89d", new Object[0]);
        }
        Context k = aob.a().k();
        if (k != null) {
            if (!f26119a.containsKey(AdvertisementOption.PRIORITY_VALID_TIME)) {
                String a2 = a(k, "package_type");
                if (!TextUtils.isEmpty(a2)) {
                    f26119a.put(AdvertisementOption.PRIORITY_VALID_TIME, a2);
                } else {
                    f26119a.put(AdvertisementOption.PRIORITY_VALID_TIME, "");
                }
            }
            if (!f26119a.containsKey(MspDBHelper.BizEntry.COLUMN_NAME_PID)) {
                String a3 = a(k, "project_id");
                if (!TextUtils.isEmpty(a3)) {
                    f26119a.put(MspDBHelper.BizEntry.COLUMN_NAME_PID, a3);
                } else {
                    f26119a.put(MspDBHelper.BizEntry.COLUMN_NAME_PID, "");
                }
            }
            if (!f26119a.containsKey("bid")) {
                String a4 = a(k, "build_id");
                if (!TextUtils.isEmpty(a4)) {
                    f26119a.put("bid", a4);
                } else {
                    f26119a.put("bid", "");
                }
            }
            if (!f26119a.containsKey("bv")) {
                String a5 = a(k, "base_version");
                if (!TextUtils.isEmpty(a5)) {
                    f26119a.put("bv", a5);
                } else {
                    f26119a.put("bv", "");
                }
            }
        }
        String b = b();
        if (!TextUtils.isEmpty(b)) {
            f26119a.put("hv", b);
        } else {
            f26119a.put("hv", "");
        }
        if (!f26119a.containsKey("sdk-version")) {
            f26119a.put("sdk-version", aqj.a().b());
        }
        return f26119a;
    }

    private static String b() {
        Object a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("367c9fd7", new Object[0]);
        }
        try {
            Object a3 = apz.a("com.taobao.updatecenter.hotpatch.HotPatchManager", "getInstance");
            if (a3 == null || (a2 = apz.a(a3, "getPatchSuccessedVersion")) == null) {
                return null;
            }
            return a2 + "";
        } catch (Throwable unused) {
            return null;
        }
    }

    static {
        kge.a(154724394);
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        f26119a = concurrentHashMap;
        concurrentHashMap.put("sdk-version", aqj.a().b());
    }

    public static String a(Context context, String str) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cfe597b6", new Object[]{context, str});
        }
        if (context == null) {
            return null;
        }
        try {
            i = context.getResources().getIdentifier(str, "string", context.getPackageName());
        } catch (Throwable th) {
            apr.c("SdkMeta", "getString Id error", th);
        }
        if (i == 0) {
            return null;
        }
        return context.getString(i);
    }
}
