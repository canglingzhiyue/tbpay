package android.taobao.windvane.extra.uc;

import android.text.TextUtils;
import anet.channel.util.HttpConstant;
import com.alibaba.security.realidentity.p1;
import com.alipay.mobile.common.amnet.biz.AmnetOperationManager;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.monitor.DXMonitorConstant;
import com.taobao.weex.utils.WXUtils;
import java.net.URI;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;
import org.android.agoo.common.AgooConstants;
import tb.ils;
import tb.kge;
import tb.noa;

/* loaded from: classes2.dex */
public class Escape {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final String[] hex;
    private static final byte[] val;

    static {
        kge.a(-905363521);
        hex = new String[]{"00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "0A", "0B", "0C", "0D", "0E", "0F", "10", "11", "12", AgooConstants.ACK_FLAG_NULL, AgooConstants.ACK_PACK_NOBIND, AgooConstants.ACK_PACK_ERROR, "16", "17", "18", "19", "1A", "1B", "1C", "1D", "1E", "1F", "20", AgooConstants.REPORT_MESSAGE_NULL, AgooConstants.REPORT_ENCRYPT_FAIL, AgooConstants.REPORT_DUPLICATE_FAIL, AgooConstants.REPORT_NOT_ENCRYPT, "25", "26", "27", "28", "29", "2A", "2B", "2C", "2D", "2E", "2F", "30", "31", ils.ARCH_BIT32, "33", "34", "35", "36", "37", "38", "39", "3A", "3B", "3C", "3D", "3E", "3F", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "4A", "4B", "4C", "4D", "4E", "4F", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59", "5A", "5B", "5C", "5D", "5E", "5F", "60", "61", "62", "63", ils.ARCH_BIT64, "65", noa.VALUE_TPP_MAIN_SEARCH_APP_ID, "67", "68", "69", "6A", "6B", "6C", "6D", "6E", "6F", "70", "71", "72", "73", "74", "75", "76", "77", "78", "79", "7A", "7B", "7C", "7D", "7E", "7F", AmnetOperationManager.AMNET_PORT_SHORT, "81", "82", "83", "84", "85", "86", "87", "88", "89", "8A", "8B", "8C", "8D", "8E", "8F", "90", "91", "92", "93", "94", "95", "96", "97", "98", "99", "9A", "9B", "9C", "9D", "9E", "9F", "A0", "A1", "A2", "A3", "A4", "A5", "A6", "A7", "A8", "A9", "AA", "AB", "AC", "AD", "AE", "AF", "B0", "B1", "B2", "B3", "B4", "B5", "B6", "B7", "B8", "B9", "BA", "BB", p1.h, "BD", "BE", "BF", "C0", "C1", "C2", "C3", "C4", "C5", "C6", "C7", "C8", "C9", "CA", "CB", "CC", "CD", "CE", "CF", "D0", "D1", "D2", "D3", "D4", "D5", "D6", "D7", "D8", "D9", "DA", DXMonitorConstant.DX_MONITOR_DB, "DC", "DD", "DE", "DF", "E0", "E1", "E2", "E3", "E4", "E5", "E6", "E7", "E8", "E9", "EA", "EB", "EC", "ED", "EE", "EF", "F0", "F1", "F2", "F3", "F4", "F5", "F6", "F7", "F8", "F9", "FA", "FB", "FC", "FD", "FE", "FF"};
        val = new byte[]{63, 63, 63, 63, 63, 63, 63, 63, 63, 63, 63, 63, 63, 63, 63, 63, 63, 63, 63, 63, 63, 63, 63, 63, 63, 63, 63, 63, 63, 63, 63, 63, 63, 63, 63, 63, 63, 63, 63, 63, 63, 63, 63, 63, 63, 63, 63, 63, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 63, 63, 63, 63, 63, 63, 63, 10, 11, 12, 13, 14, 15, 63, 63, 63, 63, 63, 63, 63, 63, 63, 63, 63, 63, 63, 63, 63, 63, 63, 63, 63, 63, 63, 63, 63, 63, 63, 63, 10, 11, 12, 13, 14, 15, 63, 63, 63, 63, 63, 63, 63, 63, 63, 63, 63, 63, 63, 63, 63, 63, 63, 63, 63, 63, 63, 63, 63, 63, 63, 63, 63, 63, 63, 63, 63, 63, 63, 63, 63, 63, 63, 63, 63, 63, 63, 63, 63, 63, 63, 63, 63, 63, 63, 63, 63, 63, 63, 63, 63, 63, 63, 63, 63, 63, 63, 63, 63, 63, 63, 63, 63, 63, 63, 63, 63, 63, 63, 63, 63, 63, 63, 63, 63, 63, 63, 63, 63, 63, 63, 63, 63, 63, 63, 63, 63, 63, 63, 63, 63, 63, 63, 63, 63, 63, 63, 63, 63, 63, 63, 63, 63, 63, 63, 63, 63, 63, 63, 63, 63, 63, 63, 63, 63, 63, 63, 63, 63, 63, 63, 63, 63, 63, 63, 63, 63, 63, 63, 63, 63, 63, 63, 63, 63, 63, 63, 63, 63, 63, 63, 63, 63, 63, 63, 63, 63, 63, 63};
    }

    public static String escape(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f3c4ee8e", new Object[]{str});
        }
        StringBuffer stringBuffer = new StringBuffer();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (charAt == ' ') {
                stringBuffer.append('+');
            } else if ('A' <= charAt && charAt <= 'Z') {
                stringBuffer.append(charAt);
            } else if ('a' <= charAt && charAt <= 'z') {
                stringBuffer.append(charAt);
            } else if ('0' <= charAt && charAt <= '9') {
                stringBuffer.append(charAt);
            } else if (charAt == '-' || charAt == '_' || charAt == '.' || charAt == '!' || charAt == '~' || charAt == '*' || charAt == '/' || charAt == '(' || charAt == ')') {
                stringBuffer.append(charAt);
            } else if (charAt <= 127) {
                stringBuffer.append(WXUtils.PERCENT);
                stringBuffer.append(hex[charAt]);
            } else {
                stringBuffer.append(WXUtils.PERCENT);
                stringBuffer.append('u');
                stringBuffer.append(hex[charAt >>> '\b']);
                stringBuffer.append(hex[charAt & 255]);
            }
        }
        return stringBuffer.toString();
    }

    public static String unescape(String str) {
        int i;
        byte b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("55f74495", new Object[]{str});
        }
        StringBuffer stringBuffer = new StringBuffer();
        int length = str.length();
        int i2 = 0;
        while (i2 < length) {
            char charAt = str.charAt(i2);
            if (charAt == '+') {
                stringBuffer.append(' ');
            } else if ('A' <= charAt && charAt <= 'Z') {
                stringBuffer.append(charAt);
            } else if ('a' <= charAt && charAt <= 'z') {
                stringBuffer.append(charAt);
            } else if ('0' <= charAt && charAt <= '9') {
                stringBuffer.append(charAt);
            } else if (charAt == '-' || charAt == '_' || charAt == '.' || charAt == '!' || charAt == '~' || charAt == '*' || charAt == '/' || charAt == '(' || charAt == ')') {
                stringBuffer.append(charAt);
            } else if (charAt == '%') {
                int i3 = i2 + 1;
                if ('u' != str.charAt(i3)) {
                    i = (val[str.charAt(i3)] | 0) << 4;
                    i2 += 2;
                    b = val[str.charAt(i2)];
                } else {
                    i = (((((val[str.charAt(i2 + 2)] | 0) << 4) | val[str.charAt(i2 + 3)]) << 4) | val[str.charAt(i2 + 4)]) << 4;
                    i2 += 5;
                    b = val[str.charAt(i2)];
                }
                stringBuffer.append((char) (i | b));
            }
            i2++;
        }
        return stringBuffer.toString();
    }

    public static String tryDecodeUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ebe7c249", new Object[]{str});
        }
        try {
            URI.create(str);
            return str;
        } catch (Throwable unused) {
            return decodeUrl(str);
        }
    }

    private static String tryDecode(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("55dd4e86", new Object[]{str});
        }
        String str2 = "";
        if (TextUtils.isEmpty(str)) {
            return str2;
        }
        try {
            str2 = URLDecoder.decode(str, "utf-8");
        } catch (Throwable unused) {
        }
        if (TextUtils.isEmpty(str2)) {
            try {
                str2 = URLDecoder.decode(str, "gbk");
            } catch (Throwable unused2) {
            }
        }
        if (TextUtils.isEmpty(str2)) {
            try {
                str2 = unescape(str);
            } catch (Throwable unused3) {
            }
        }
        return TextUtils.isEmpty(str2) ? str : str2;
    }

    private static String decodeUrl(String str) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("249cbe6e", new Object[]{str});
        }
        try {
            URL url = new URL(str);
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(url.getProtocol());
            stringBuffer.append(HttpConstant.SCHEME_SPLIT);
            stringBuffer.append(url.getHost());
            int port = url.getPort();
            if (port != 80 && port != -1) {
                stringBuffer.append(":" + port);
            }
            String path = url.getPath();
            String query = url.getQuery();
            if (!TextUtils.isEmpty(path)) {
                if (path.length() <= 1 || path.lastIndexOf("/") != path.length() - 1) {
                    z = false;
                }
                String[] split = path.split("/");
                if (split != null) {
                    stringBuffer.append("/");
                    int length = split.length;
                    for (int i = 0; i < length; i++) {
                        if (!TextUtils.isEmpty(split[i])) {
                            stringBuffer.append(URLEncoder.encode(tryDecode(split[i]), "utf-8"));
                            if (i < length - 1) {
                                stringBuffer.append("/");
                            }
                        }
                    }
                }
                if (z) {
                    stringBuffer.append("/");
                }
            }
            if (!TextUtils.isEmpty(query)) {
                stringBuffer.append("?");
                String[] split2 = query.split("&");
                if (split2 != null) {
                    int length2 = split2.length;
                    for (int i2 = 0; i2 < length2; i2++) {
                        int indexOf = split2[i2].indexOf(61);
                        if (-1 != indexOf) {
                            String substring = split2[i2].substring(0, indexOf);
                            String encode = URLEncoder.encode(tryDecode(split2[i2].substring(indexOf + 1)), "utf-8");
                            stringBuffer.append(substring + "=" + encode);
                            if (i2 < length2 - 1) {
                                stringBuffer.append("&");
                            }
                        }
                    }
                }
            }
            return stringBuffer.toString();
        } catch (Throwable unused) {
            return str;
        }
    }
}
