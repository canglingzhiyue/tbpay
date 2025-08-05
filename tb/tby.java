package tb;

import android.taobao.windvane.util.m;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.profile.LiveAvatarNewFrame;
import com.taobao.taolive.room.utils.ai;
import com.taobao.taolive.sdk.model.common.LiveItem;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;

/* loaded from: classes8.dex */
public class tby {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1275201144);
    }

    public static String a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("457cf91a", new Object[]{str, str2, str3});
        }
        return str.replaceAll("([?&])" + str2 + "=[^&]*", str3);
    }

    public static String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{str});
        }
        StringBuilder sb = new StringBuilder();
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(str.getBytes());
            for (byte b : messageDigest.digest()) {
                sb.append(Integer.toHexString(b & 255));
            }
        } catch (NoSuchAlgorithmException unused) {
            sb = null;
        }
        return sb == null ? "" : sb.toString();
    }

    public static String b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6111438d", new Object[]{str});
        }
        try {
            String[] split = str.split("\\?");
            if (split.length > 1 && split[1] != null) {
                for (String str2 : split[1].split("&")) {
                    String[] split2 = str2.split("=");
                    if (split2.length > 1 && "newtonParams".equals(split2[0])) {
                        return split2[1];
                    }
                }
            }
        } catch (Throwable th) {
            m.e("TaoLiveAdapterUriUtils", "getNewtonParamForUrl error msg=" + th.toString());
        }
        return "";
    }

    public static void a(String str, String str2, LiveItem liveItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6278697", new Object[]{str, str2, liveItem});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(LiveAvatarNewFrame.LIVE_AVATAR_LIVE_ID, liveItem.liveId);
        hashMap.put("itemId", liveItem.itemId + "");
        hashMap.put("scene", str2);
        hashMap.put("jumpUrl", str);
        ai.b("liveNewtonExceptionMonitor", hashMap);
    }
}
