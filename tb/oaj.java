package tb;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* loaded from: classes8.dex */
public class oaj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private String f31876a;

    static {
        kge.a(58366939);
        kge.a(-310365642);
    }

    public String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{this, str});
        }
        if (str == null) {
            return null;
        }
        this.f31876a = a(str, "2138079021646297");
        if (StringUtils.isEmpty(this.f31876a)) {
            return null;
        }
        if (str.contains("?")) {
            return str.concat("&sm=".concat(this.f31876a));
        }
        return str.concat("?sm=".concat(this.f31876a));
    }

    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : this.f31876a;
    }

    private String a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b5178ea4", new Object[]{this, str, str2});
        }
        if (StringUtils.isEmpty(str) || StringUtils.isEmpty(str2)) {
            return null;
        }
        try {
            byte[] digest = MessageDigest.getInstance("MD5").digest(str.concat(str2).getBytes("UTF-8"));
            StringBuilder sb = new StringBuilder(digest.length << 1);
            for (byte b : digest) {
                int i = b & 255;
                if (i < 16) {
                    sb.append("0");
                }
                sb.append(Integer.toHexString(i));
            }
            String sb2 = sb.toString();
            if (!StringUtils.isEmpty(sb2)) {
                return sb2.substring(0, 6);
            }
            return null;
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("Huh, UTF-8 should be supported?", e);
        } catch (NoSuchAlgorithmException e2) {
            throw new RuntimeException("Huh, MD5 should be supported?", e2);
        }
    }
}
