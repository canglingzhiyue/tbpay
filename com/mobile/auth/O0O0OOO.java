package com.mobile.auth;

import android.content.Context;
import android.telephony.TelephonyManager;
import mtopsdk.common.util.StringUtils;
import com.cmic.sso.sdk.a;

/* loaded from: classes4.dex */
public class O0O0OOO {
    private static O0O0OOO O00000Oo;
    private final Context O000000o;

    private O0O0OOO(Context context) {
        this.O000000o = context;
    }

    public static O0O0OOO O000000o() {
        return O00000Oo;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private String O000000o(String str) {
        char c;
        int hashCode = str.hashCode();
        if (hashCode == 49679479) {
            if (str.equals("46009")) {
                c = 6;
            }
            c = 65535;
        } else if (hashCode != 49679502) {
            switch (hashCode) {
                case 49679470:
                    if (str.equals("46000")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case 49679471:
                    if (str.equals("46001")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case 49679472:
                    if (str.equals("46002")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 49679473:
                    if (str.equals("46003")) {
                        c = 7;
                        break;
                    }
                    c = 65535;
                    break;
                case 49679474:
                    if (str.equals("46004")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case 49679475:
                    if (str.equals("46005")) {
                        c = '\b';
                        break;
                    }
                    c = 65535;
                    break;
                case 49679476:
                    if (str.equals("46006")) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case 49679477:
                    if (str.equals("46007")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
        } else {
            if (str.equals("46011")) {
                c = '\t';
            }
            c = 65535;
        }
        switch (c) {
            case 0:
            case 1:
            case 2:
            case 3:
                O0O000o.O000000o("SIMUtils", "中国移动");
                return "1";
            case 4:
            case 5:
            case 6:
                O0O000o.O000000o("SIMUtils", "中国联通");
                return "2";
            case 7:
            case '\b':
            case '\t':
                O0O000o.O000000o("SIMUtils", "中国电信");
                return "3";
            default:
                return "0";
        }
    }

    public static void O000000o(Context context) {
        O00000Oo = new O0O0OOO(context);
    }

    public String O000000o(String str, boolean z) {
        if (StringUtils.isEmpty(str)) {
            str = O000000o(z);
        }
        return O000000o(str);
    }

    public String O000000o(boolean z) {
        TelephonyManager telephonyManager;
        if (!z || (telephonyManager = (TelephonyManager) this.O000000o.getSystemService("phone")) == null) {
            return "";
        }
        String simOperator = telephonyManager.getSimOperator();
        O0O000o.O00000Oo("SIMUtils", "getSimOperator SysOperator= " + simOperator);
        return simOperator;
    }

    public void O000000o(a aVar) {
        TelephonyManager telephonyManager = (TelephonyManager) this.O000000o.getSystemService("phone");
        if (telephonyManager != null) {
            String networkOperator = telephonyManager.getNetworkOperator();
            O0O000o.O00000Oo("SIMUtils", "NetworkOperator= " + networkOperator);
            aVar.a("networkOperator", O000000o(networkOperator));
        }
    }

    public String O00000Oo() {
        try {
            int O000000o = O00O00o.O000000o().O00000Oo().O000000o();
            return O000000o >= 0 ? Integer.toString(O000000o) : "";
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }
}
