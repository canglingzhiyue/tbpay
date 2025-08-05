package com.taobao.pha.core.rescache;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import tb.kge;

/* loaded from: classes7.dex */
public class Package {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1010815856);
    }

    public static String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{str});
        }
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(str.getBytes());
            byte[] digest = messageDigest.digest();
            if (digest == null) {
                return null;
            }
            StringBuilder sb = new StringBuilder();
            for (byte b : digest) {
                String hexString = Integer.toHexString(b & 255);
                while (hexString.length() < 2) {
                    hexString = "0" + hexString;
                }
                sb.append(hexString);
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return String.valueOf(str.hashCode());
        }
    }

    /* loaded from: classes7.dex */
    public static class Info implements Serializable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public byte[] bytes;
        public String code;
        public String from;
        public String key;
        public String name;
        public String path;
        public String relpath;
        public long requestTime;
        public String version;

        static {
            kge.a(1659435394);
            kge.a(1028243835);
        }

        public static Info cloneInstance(Info info) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Info) ipChange.ipc$dispatch("2655d575", new Object[]{info});
            }
            Info info2 = new Info();
            info2.name = info.name;
            info2.relpath = info.relpath;
            info2.path = info.path;
            info2.key = info.key;
            info2.version = info.version;
            info2.code = info.code;
            info2.bytes = info.bytes;
            info2.from = info.from;
            info2.requestTime = info.requestTime;
            return info2;
        }

        public String getMD5CacheKey() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("b3eb9614", new Object[]{this});
            }
            if (TextUtils.isEmpty(this.key) && !TextUtils.isEmpty(this.path)) {
                this.key = Package.a(this.path);
            }
            return this.key;
        }
    }
}
