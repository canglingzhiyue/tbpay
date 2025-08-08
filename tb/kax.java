package tb;

import android.content.Context;
import android.content.SharedPreferences;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.augecore.data.GroupData;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class kax {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String AUGE_VERSION = "version";
    public static final String SHARE_PREFERENCE_NAME = "auge_group_cache";

    /* renamed from: a  reason: collision with root package name */
    public static SharedPreferences f29930a;

    public static void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{context});
            return;
        }
        f29930a = context.getSharedPreferences(SHARE_PREFERENCE_NAME, 0);
        kbd.a(kaw.LOG_TAG, "AugeCache init success");
    }

    public static void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{str, str2});
        } else if (StringUtils.isEmpty(str) || str2 == null) {
        } else {
            try {
                SharedPreferences.Editor edit = f29930a.edit();
                edit.putString(str, str2);
                edit.apply();
            } catch (Exception e) {
                kbd.b(kaw.LOG_TAG, "AugeCache === putCache异常了：" + e.getMessage());
            }
        }
    }

    public static String b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4204a5c3", new Object[]{str, str2});
        }
        if (StringUtils.isEmpty(str)) {
            return "";
        }
        try {
            return f29930a.getString(str, str2);
        } catch (Exception e) {
            kbd.b(kaw.LOG_TAG, "AugeCache === getCache异常了：" + e.getMessage());
            return str2;
        }
    }

    public static void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{str});
        } else if (StringUtils.isEmpty(str)) {
        } else {
            try {
                SharedPreferences.Editor edit = f29930a.edit();
                edit.remove(str);
                edit.apply();
            } catch (Exception e) {
                kbd.b(kaw.LOG_TAG, e.getMessage());
            }
        }
    }

    public static void a(String str, List<GroupData> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1aa3523", new Object[]{str, list});
        } else if (StringUtils.isEmpty(str) || list == null) {
        } else {
            String jSONString = JSON.toJSONString(list);
            SharedPreferences.Editor edit = f29930a.edit();
            edit.putString(str, jSONString);
            edit.apply();
        }
    }

    public static List<GroupData> b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("89cdf874", new Object[]{str});
        }
        ArrayList arrayList = new ArrayList();
        try {
            String string = f29930a.getString(str, null);
            return string == null ? arrayList : JSON.parseArray(string, GroupData.class);
        } catch (Throwable th) {
            kbd.b(kaw.LOG_TAG, "AugeCache === getDataList异常了：" + th.getMessage());
            return arrayList;
        }
    }
}
