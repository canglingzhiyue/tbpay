package tb;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.share.taopassword.constants.TPTargetType;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes8.dex */
public class obc {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String QQ_LITE_PKG = "com.tencent.qqlite";
    public static final String QQ_PKG = "com.tencent.mobileqq";
    public static final String QZONE_PKG = "com.qzone";
    public static final String TAO_PASSWORD_FROM_PIC_SAVE_KEY = "tb_taopassword_from_pic_save_key";
    public static final String WEIXIN_PKG = "com.tencent.mm";

    static {
        kge.a(-1495720525);
    }

    public static Map<String, String> a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("bf3e1ee7", new Object[]{str});
        }
        if (str != null) {
            return a(Uri.parse(str));
        }
        return null;
    }

    public static Map<String, String> a(Uri uri) {
        int indexOf;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("e82965d4", new Object[]{uri});
        }
        if (uri == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        String fragment = uri.getFragment();
        String query = uri.getQuery();
        String[] split = (fragment == null || !fragment.contains("?")) ? null : fragment.split("\\?");
        if (split != null && split.length > 0) {
            fragment = split[0];
            query = !StringUtils.isEmpty(query) ? query + "&" + split[1] : split[1];
        }
        if (fragment != null && fragment.contains("&") && (indexOf = fragment.indexOf("&")) > 0) {
            if (!StringUtils.isEmpty(query)) {
                String str = query + "&" + fragment.substring(indexOf + 1);
            } else {
                fragment.substring(indexOf + 1);
            }
            fragment.substring(0, indexOf);
        }
        try {
            Set<String> queryParameterNames = uri.getQueryParameterNames();
            String[] strArr = (String[]) queryParameterNames.toArray(new String[queryParameterNames.size()]);
            if (strArr != null && strArr.length > 0) {
                for (String str2 : strArr) {
                    hashMap.put(str2, uri.getQueryParameter(str2));
                }
            }
            return hashMap;
        } catch (NullPointerException | UnsupportedOperationException unused) {
            return null;
        }
    }

    public static void a(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61b6362a", new Object[]{context, str});
            return;
        }
        SharedPreferences.Editor edit = context.getApplicationContext().getSharedPreferences("tb_share_copy_content", 0).edit();
        edit.putString("tb_taopassword_save_key", str);
        edit.apply();
    }

    public static String b(Context context, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("1da50fb7", new Object[]{context, str}) : context.getApplicationContext().getSharedPreferences("tb_share_copy_content", 0).getString(str, null);
    }

    public static void a(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d18de974", new Object[]{context, str, str2});
        } else if (StringUtils.isEmpty(str)) {
        } else {
            SharedPreferences.Editor edit = context.getApplicationContext().getSharedPreferences("tb_share_copy_content", 0).edit();
            edit.putString(str, str2);
            edit.apply();
        }
    }

    public static String a(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bbc5dc40", new Object[]{context}) : context.getApplicationContext().getSharedPreferences("tb_share_copy_content", 0).getString("tb_taopassword_save_key", null);
    }

    public static String a(TPTargetType tPTargetType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("295a7823", new Object[]{tPTargetType});
        }
        if (tPTargetType == null) {
            return null;
        }
        if (TPTargetType.WEIXIN.getInfo().equals(tPTargetType.getInfo())) {
            return "com.tencent.mm";
        }
        if (TPTargetType.QZONE.getInfo().equals(tPTargetType.getInfo())) {
            return "com.qzone";
        }
        if (!TPTargetType.QQFRIEND.getInfo().equals(tPTargetType.getInfo())) {
            return null;
        }
        return "com.tencent.mobileqq";
    }

    public static boolean c(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d54b79ec", new Object[]{context, str})).booleanValue();
        }
        if (StringUtils.isEmpty(str)) {
            return false;
        }
        try {
            context.getPackageManager().getPackageInfo(str, 0);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0030, code lost:
        if (c(r4, r5) == false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean d(android.content.Context r4, java.lang.String r5) {
        /*
            com.android.alibaba.ip.runtime.IpChange r0 = tb.obc.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L1c
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r3] = r4
            r1[r2] = r5
            java.lang.String r4 = "f161bcb"
            java.lang.Object r4 = r0.ipc$dispatch(r4, r1)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            return r4
        L1c:
            boolean r0 = c(r4, r5)
            if (r0 != 0) goto L33
            java.lang.String r0 = "com.tencent.mobileqq"
            boolean r5 = r0.equals(r5)
            if (r5 == 0) goto L32
            java.lang.String r5 = "com.tencent.qqlite"
            boolean r0 = c(r4, r5)
            if (r0 != 0) goto L33
        L32:
            return r3
        L33:
            android.content.pm.PackageManager r0 = r4.getPackageManager()
            android.content.Intent r5 = r0.getLaunchIntentForPackage(r5)     // Catch: java.lang.Exception -> L4d
            java.lang.String r0 = "visa"
            java.lang.String r1 = "5abd4435a4075ad0"
            r5.putExtra(r0, r1)     // Catch: java.lang.Exception -> L4d
            if (r5 == 0) goto L4c
            com.ut.share.utils.IFlowOutHelper r0 = com.ut.share.utils.FlowOutFacade.getInstance()     // Catch: java.lang.Exception -> L4d
            r0.startActivity(r4, r5)     // Catch: java.lang.Exception -> L4d
        L4c:
            return r2
        L4d:
            r4 = move-exception
            r4.printStackTrace()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r0 = "openApp failed: "
            r5.append(r0)
            java.lang.String r4 = r4.toString()
            r5.append(r4)
            r5.toString()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.obc.d(android.content.Context, java.lang.String):boolean");
    }
}
