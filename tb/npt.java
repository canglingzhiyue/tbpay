package tb;

import android.text.TextUtils;
import android.util.Base64;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.common.util.q;
import java.io.UnsupportedEncodingException;

/* loaded from: classes7.dex */
public class npt {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1338798537);
    }

    public static boolean a(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8bb65392", new Object[]{str, obj})).booleanValue();
        }
        if (obj == null) {
            q.f("SearchBase64CacheUtil", "content is null");
            return false;
        }
        return a(str, JSON.toJSONString(obj));
    }

    public static boolean a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d9378d80", new Object[]{str, str2})).booleanValue();
        }
        q.i("SearchBase64CacheUtil", "save file with encrypt " + str);
        if (str2 == null) {
            return false;
        }
        try {
            str2 = b(str2);
        } catch (Exception unused) {
            q.e("SearchBase64CacheUtil", "encode error");
        }
        if (str2 == null) {
            q.i("SearchBase64CacheUtil", "encode content is null");
            return false;
        }
        return npu.a(str, str2);
    }

    public static String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{str});
        }
        String a2 = npu.a(str);
        if (TextUtils.isEmpty(a2)) {
            q.a("SearchBase64CacheUtil", "encrypted content is empty");
            return "";
        }
        try {
            return c(a2);
        } catch (Exception unused) {
            q.e("SearchBase64CacheUtil", "decrypt error");
            return "";
        }
    }

    public static String b(String str) throws UnsupportedEncodingException {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6111438d", new Object[]{str}) : str == null ? "" : new String(Base64.encode(str.getBytes("UTF-8"), 2));
    }

    public static String c(String str) throws UnsupportedEncodingException {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("b82f346c", new Object[]{str}) : str == null ? "" : new String(Base64.decode(str.getBytes("UTF-8"), 2));
    }
}
