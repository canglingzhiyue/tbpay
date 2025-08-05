package com.alipay.mobile.monitor.track.spm;

import com.alipay.mobile.common.logging.api.behavor.Behavor;
import com.alipay.mobile.framework.MpaasClassInfo;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.image.d;
import com.taobao.umipublish.draft.DraftMediaHelper;
import java.util.Map;
import tb.fxb;
import tb.riy;

@MpaasClassInfo(BundleName = "android-phone-wallet-spmtracker", ExportJarName = "unknown", Level = DraftMediaHelper.DraftType.PRODUCT, Product = ":android-phone-wallet-spmtracker")
/* loaded from: classes3.dex */
public class SpmUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final char[] f5763a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', d.LEVEL_D, d.LEVEL_E, 'F', 'G', 'H', d.LEVEL_I, 'J', 'K', d.LEVEL_L, 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', d.LEVEL_V, d.LEVEL_W, 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '+', fxb.DIR};
    public static boolean isDebug;

    public static String objectToString(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a8a00532", new Object[]{obj});
        }
        if (obj == null) {
            return "";
        }
        if (obj instanceof String) {
            return obj.toString() + '@' + Integer.toHexString(obj.hashCode());
        }
        return obj.getClass().getName() + '@' + Integer.toHexString(obj.hashCode());
    }

    public static void printBehaviour(String str, Behavor.Builder builder, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9c9a18b", new Object[]{str, builder, str2});
        } else if (isDebug) {
            Behavor build = builder.build();
            StringBuilder sb = new StringBuilder(str2);
            sb.append(", [seedId]");
            sb.append(build.getSeedID());
            sb.append(", [pageId]");
            sb.append(build.getPageId());
            if (build.getParam1() != null) {
                sb.append(", [param1]");
                sb.append(build.getParam1());
            }
            if (build.getParam2() != null) {
                sb.append(", [param2]");
                sb.append(build.getParam2());
            }
            if (build.getParam3() != null) {
                sb.append(", [param3]");
                sb.append(build.getParam3());
            }
            for (Map.Entry<String, String> entry : build.getExtParams().entrySet()) {
                sb.append(", [");
                sb.append(entry.getKey());
                sb.append(riy.ARRAY_END_STR);
                sb.append(entry.getValue());
            }
            SpmLogCator.debug(str, sb.toString());
        }
    }

    public static String getViewKey(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6672e099", new Object[]{obj});
        }
        if (obj == null) {
            return null;
        }
        if (obj instanceof String) {
            return obj.toString() + obj.hashCode();
        }
        return obj.getClass().getName() + obj.hashCode();
    }

    public static String c10to64(long j) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("8e28ac1e", new Object[]{new Long(j)}) : a(j);
    }

    private static String a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("780680c4", new Object[]{new Long(j)});
        }
        int pow = (int) Math.pow(2.0d, 6.0d);
        char[] cArr = new char[pow];
        long j2 = j;
        int i = pow;
        do {
            i--;
            cArr[i] = f5763a[(int) (63 & j2)];
            j2 >>>= 6;
        } while (j2 != 0);
        return new String(cArr, i, pow - i);
    }
}
