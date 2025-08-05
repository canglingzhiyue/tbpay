package mtopsdk.mtop.global;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import mtopsdk.common.util.StringUtils;
import mtopsdk.common.util.TBSdkLog;
import mtopsdk.mtop.intf.Mtop;
import mtopsdk.xstate.a;
import tb.kge;

/* loaded from: classes.dex */
public class SDKUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "mtopsdk.SDKUtils";

    static {
        kge.a(1585624025);
    }

    public static long getCorrectionTime() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("98c6503c", new Object[0])).longValue() : getTimeOffset() + (System.currentTimeMillis() / 1000);
    }

    public static long getCorrectionTimeMillis() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ef1e9ee2", new Object[0])).longValue() : getCorrectionTime() * 1000;
    }

    public static long getTimeOffset() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6f970731", new Object[0])).longValue();
        }
        String a2 = a.a();
        if (StringUtils.isNotBlank(a2)) {
            try {
                return Long.parseLong(a2);
            } catch (NumberFormatException unused) {
                TBSdkLog.e(TAG, "[getTimeOffset]parse t_offset failed");
                return 0L;
            }
        }
        a.c("t_offset", "0");
        return 0L;
    }

    @Deprecated
    public static void registerSessionInfo(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce03d2dc", new Object[]{str, str2});
        } else {
            Mtop.instance(Mtop.Id.INNER, (Context) null).registerSessionInfo(str, str2);
        }
    }

    @Deprecated
    public static void registerSessionInfo(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78a47da6", new Object[]{str, str2, str3});
        } else {
            Mtop.instance(Mtop.Id.INNER, (Context) null).registerSessionInfo(str, str3);
        }
    }

    @Deprecated
    public static void logOut() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("456c5cf1", new Object[0]);
        } else {
            Mtop.instance(Mtop.Id.INNER, (Context) null).logout();
        }
    }

    @Deprecated
    public static void registerTtid(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b8d34ef", new Object[]{str});
        } else {
            Mtop.instance(Mtop.Id.INNER, (Context) null).registerTtid(str);
        }
    }

    @Deprecated
    public static void registerMtopSdkProperty(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a46eee3f", new Object[]{str, str2});
        } else {
            Mtop.instance(Mtop.Id.INNER, (Context) null).getMtopConfig().registerMtopSdkProperty(str, str2);
        }
    }

    @Deprecated
    public static boolean removeCacheBlock(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("cde6eb24", new Object[]{str})).booleanValue() : Mtop.instance(Mtop.Id.INNER, (Context) null).removeCacheBlock(str);
    }

    @Deprecated
    public static boolean unintallCacheBlock(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("dd87b5cb", new Object[]{str})).booleanValue() : Mtop.instance(Mtop.Id.INNER, (Context) null).unintallCacheBlock(str);
    }

    @Deprecated
    public static boolean removeCacheItem(String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("931b26b0", new Object[]{str, str2})).booleanValue() : Mtop.instance(Mtop.Id.INNER, (Context) null).removeCacheItem(str, str2);
    }
}
