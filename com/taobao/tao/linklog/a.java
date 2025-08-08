package com.taobao.tao.linklog;

import mtopsdk.common.util.StringUtils;
import com.alibaba.android.umbrella.link.export.UMDimKey;
import com.alibaba.android.umbrella.link.i;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import tb.kge;

/* loaded from: classes.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CHILD_BIZ = "homepage_track";
    public static final String MAIN_BIZ = "Page_Home";
    public static final String MAIN_BIZ_COUNT = "Page_Home_Count";

    /* renamed from: a  reason: collision with root package name */
    private static ILinkLogAdapter f20680a;

    static {
        kge.a(-43335867);
    }

    public static void a(ILinkLogAdapter iLinkLogAdapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1ae084e", new Object[]{iLinkLogAdapter});
        } else {
            f20680a = iLinkLogAdapter;
        }
    }

    public static void a(String str, String str2, String str3, i iVar, Map<UMDimKey, Object> map, com.alibaba.android.umbrella.link.export.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fbab50a6", new Object[]{str, str2, str3, iVar, map, aVar});
            return;
        }
        ILinkLogAdapter iLinkLogAdapter = f20680a;
        if (iLinkLogAdapter == null) {
            return;
        }
        iLinkLogAdapter.logInfo(str, str2, str3, iVar, map, aVar);
    }

    public static void a(String str, String str2, String str3, String str4, String str5, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19b0c1eb", new Object[]{str, str2, str3, str4, str5, map});
            return;
        }
        ILinkLogAdapter iLinkLogAdapter = f20680a;
        if (iLinkLogAdapter == null) {
            return;
        }
        iLinkLogAdapter.commitSuccess(str, str2, str3, str4, str5, map);
    }

    public static void a(String str, String str2, String str3, String str4, String str5, Map<String, String> map, String str6, String str7) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3969d7f", new Object[]{str, str2, str3, str4, str5, map, str6, str7});
            return;
        }
        ILinkLogAdapter iLinkLogAdapter = f20680a;
        if (iLinkLogAdapter == null) {
            return;
        }
        iLinkLogAdapter.commitFailure(str, str2, str3, str4, str5, map, str6, str7);
    }

    public static void a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("929ad046", new Object[]{str, str2, str3});
        } else if (f20680a == null) {
        } else {
            a("Page_Home", "homepage_track", str, str2, str3);
        }
    }

    public static void a(String str, String str2, String str3, String str4, String str5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9b9da5a", new Object[]{str, str2, str3, str4, str5});
        } else if (f20680a == null || StringUtils.isEmpty(str) || StringUtils.isEmpty(str2) || StringUtils.isEmpty(str3) || StringUtils.isEmpty(str4) || StringUtils.isEmpty(str5)) {
        } else {
            a(str, str2, str3, (i) null, (Map<UMDimKey, Object>) null, com.alibaba.android.umbrella.link.export.a.a(str4, str5));
        }
    }

    public static void b(String str, String str2, String str3, String str4, String str5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2001a9b", new Object[]{str, str2, str3, str4, str5});
        } else if (f20680a == null) {
        } else {
            a("Page_Home", "homepage_track", str, str2, str3, str4, str5);
        }
    }

    public static void a(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54b86a6e", new Object[]{str, str2, str3, str4, str5, str6, str7});
        } else if (f20680a == null || StringUtils.isEmpty(str) || StringUtils.isEmpty(str2) || StringUtils.isEmpty(str3) || StringUtils.isEmpty(str4) || StringUtils.isEmpty(str5)) {
        } else {
            com.alibaba.android.umbrella.link.export.a aVar = null;
            if (!StringUtils.isEmpty(str6) && !StringUtils.isEmpty(str7)) {
                aVar = com.alibaba.android.umbrella.link.export.a.a(str6, str7);
            }
            a(str, str2, str3, (i) null, (Map<UMDimKey, Object>) null, aVar);
        }
    }
}
