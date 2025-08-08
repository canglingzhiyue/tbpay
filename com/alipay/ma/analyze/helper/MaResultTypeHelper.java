package com.alipay.ma.analyze.helper;

import android.net.Uri;
import mtopsdk.common.util.StringUtils;
import com.alipay.ma.common.result.ResultMaType;
import com.alipay.ma.decode.DecodeResult;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class MaResultTypeHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    private static boolean a(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a821939f", new Object[]{new Integer(i)})).booleanValue() : i == 32768;
    }

    private static boolean a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{str})).booleanValue() : !StringUtils.isEmpty(str) && ((str.startsWith("8") && str.length() == 20) || ((str.startsWith("10") || str.startsWith("11")) && str.length() == 16));
    }

    private static boolean b(String str) {
        Uri parse;
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3dd7e577", new Object[]{str})).booleanValue() : !StringUtils.isEmpty(str) && (parse = Uri.parse(str)) != null && !StringUtils.isEmpty(parse.getHost()) && StringUtils.equals("s.tb.cn", parse.getHost().toLowerCase());
    }

    public static ResultMaType getMaType(DecodeResult decodeResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ResultMaType) ipChange.ipc$dispatch("201ec69a", new Object[]{decodeResult});
        }
        int i = decodeResult.type;
        if (i == 0) {
            return ResultMaType.PRODUCT;
        }
        if (i == 1) {
            if (b(decodeResult.strCode)) {
                return ResultMaType.TB_ANTI_FAKE;
            }
            if (a(decodeResult.subType)) {
                return ResultMaType.GEN3;
            }
            return ResultMaType.QR;
        } else if (i == 2) {
            if (a(decodeResult.strCode)) {
                return ResultMaType.MEDICINE;
            }
            return ResultMaType.EXPRESS;
        } else if (i == 1024) {
            return ResultMaType.DM;
        } else {
            if (i == 2048) {
                return ResultMaType.PDF417;
            }
            if (i == 32768) {
                return ResultMaType.GEN3;
            }
            if (i == 65536) {
                if (!isARCode(decodeResult.type, decodeResult.subType)) {
                    return null;
                }
                return ResultMaType.ARCODE;
            } else if (i == 131072) {
                return ResultMaType.NARROW;
            } else {
                if (i == 262144) {
                    return ResultMaType.HMCODE;
                }
                if (i == 524288) {
                    return ResultMaType.WXTINYCODE;
                }
                return null;
            }
        }
    }

    public static boolean isARCode(int i, int i2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6ab46093", new Object[]{new Integer(i), new Integer(i2)})).booleanValue() : i == ResultMaType.ARCODE.getType() && i2 == ResultMaType.ARCODE.getDiscernType();
    }
}
