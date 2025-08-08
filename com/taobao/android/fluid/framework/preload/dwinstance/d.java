package com.taobao.android.fluid.framework.preload.dwinstance;

import android.content.Context;
import android.net.Uri;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.taobao.android.fluid.FluidSDK;
import java.util.Arrays;
import java.util.List;
import tb.kge;
import tb.occ;
import tb.sjt;
import tb.spz;

/* loaded from: classes5.dex */
public class d {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int CACHE = 0;
    public static final int LOCAL = 1;

    /* renamed from: a  reason: collision with root package name */
    private static final List f12639a;
    private static final List b;
    private static final List c;
    private static final List d;

    static {
        kge.a(-784133404);
        f12639a = Arrays.asList(0, 1);
        b = Arrays.asList(0);
        c = Arrays.asList(1);
        d = Arrays.asList(new Object[0]);
    }

    public static List a(Uri uri, boolean z) {
        IpChange ipChange = $ipChange;
        boolean z2 = false;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("2b8784d2", new Object[]{uri, new Boolean(z)});
        }
        if (uri != null) {
            String queryParameter = uri.getQueryParameter("videoStrategy");
            if (!StringUtils.isEmpty(queryParameter)) {
                char c2 = 65535;
                switch (queryParameter.hashCode()) {
                    case -1205353033:
                        if (queryParameter.equals(RemoteMessageConst.Notification.LOCAL_ONLY)) {
                            c2 = 2;
                            break;
                        }
                        break;
                    case -553733554:
                        if (queryParameter.equals("cacheOnly")) {
                            c2 = 1;
                            break;
                        }
                        break;
                    case 3387192:
                        if (queryParameter.equals("none")) {
                            c2 = 3;
                            break;
                        }
                        break;
                    case 5674062:
                        if (queryParameter.equals("cacheFirst")) {
                            c2 = 0;
                            break;
                        }
                        break;
                }
                if (c2 == 0) {
                    return f12639a;
                }
                if (c2 == 1) {
                    return b;
                }
                if (c2 == 2) {
                    return c;
                }
                if (c2 == 3) {
                    return d;
                }
                spz.c("PreloadCacheStrategy", "unknown strategy " + queryParameter);
            }
        }
        Context context = FluidSDK.getContext();
        if (occ.b(context, "inactive_crowd") && sjt.a(context) && z) {
            z2 = true;
        }
        if (!z) {
            return b;
        }
        return z2 ? f12639a : c;
    }

    public static String a(List<Integer> list) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("80c38867", new Object[]{list}) : f12639a.equals(list) ? "cacheFirst" : b.equals(list) ? "cacheOnly" : c.equals(list) ? RemoteMessageConst.Notification.LOCAL_ONLY : d.equals(list) ? "none" : "unknown";
    }
}
