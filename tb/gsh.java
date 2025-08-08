package tb;

import mtopsdk.common.util.StringUtils;
import com.alibaba.security.realidentity.o;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.api.Login;
import java.math.BigInteger;
import java.security.MessageDigest;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public class gsh {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1934984318);
    }

    public static int a(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8123ad04", new Object[]{str, new Integer(i)})).intValue();
        }
        if (str != null && i > 0) {
            try {
                byte[] digest = MessageDigest.getInstance("MD5").digest(str.getBytes());
                byte[] bArr = new byte[8];
                for (int i2 = 0; i2 < 8; i2++) {
                    bArr[i2] = digest[i2];
                }
                return new BigInteger(1, bArr).mod(BigInteger.valueOf(i)).intValue();
            } catch (Exception unused) {
            }
        }
        return -1;
    }

    public static boolean a(int i, int i2, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9d025a96", new Object[]{new Integer(i), new Integer(i2), str})).booleanValue();
        }
        if (!StringUtils.isEmpty(str) && i > 0 && i2 > 0) {
            try {
                byte[] digest = MessageDigest.getInstance("MD5").digest(str.getBytes());
                byte[] bArr = new byte[8];
                for (int i3 = 0; i3 < 8; i3++) {
                    bArr[i3] = digest[i3];
                }
                if (Math.abs(new BigInteger(1, bArr).intValue()) % i2 < i) {
                    return true;
                }
            } catch (Exception unused) {
            }
        }
        return false;
    }

    public static String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aff6e538", new Object[0]);
        }
        try {
            return Login.getNick();
        } catch (Throwable unused) {
            return "";
        }
    }

    public static boolean a(JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1b6e96a4", new Object[]{jSONObject, str})).booleanValue();
        }
        Object opt = jSONObject.opt("l");
        Object opt2 = jSONObject.opt(o.b);
        Object opt3 = jSONObject.opt("r");
        if (opt == null || opt2 == null || opt3 == null) {
            return false;
        }
        if (opt2.equals("&") || opt2.equals("|")) {
            boolean a2 = opt.getClass() == JSONObject.class ? a((JSONObject) opt, str) : false;
            boolean a3 = opt3.getClass() == JSONObject.class ? a((JSONObject) opt3, str) : false;
            return opt2.equals("&") ? a2 && a3 : a2 || a3;
        }
        if (opt.getClass().equals(String.class) && opt.equals("app_ver") && opt3.getClass().equals(String.class)) {
            long b = gsj.b(str, 0);
            String str2 = (String) opt3;
            long b2 = gsj.b(str2, 0);
            if ("=".equals(opt2)) {
                if (b == b2) {
                    return true;
                }
            } else if (">".equals(opt2)) {
                if (b > b2) {
                    return true;
                }
            } else if ("<".equals(opt2)) {
                if (b < b2) {
                    return true;
                }
            } else if (">=".equals(opt2)) {
                if (b >= b2) {
                    return true;
                }
            } else if ("<=".equals(opt2)) {
                if (b <= b2) {
                    return true;
                }
            } else if ("~=".equals(opt2)) {
                if (str.startsWith(str2)) {
                    return true;
                }
            } else if ("!=".equals(opt2)) {
                if (b != b2) {
                    return true;
                }
            } else if ("!~".equals(opt2) && !str.startsWith(str2)) {
                return true;
            }
        }
        return false;
    }

    public static boolean a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d9378d80", new Object[]{str, str2})).booleanValue();
        }
        try {
            String[] split = str.split(":");
            return b(Integer.parseInt(split[0]), Integer.parseInt(split[1]), str2);
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean b(int i, int i2, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2132a797", new Object[]{new Integer(i), new Integer(i2), str})).booleanValue();
        }
        return a(i, i2, rkq.d().g() + str);
    }
}
