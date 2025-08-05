package org.webrtc;

import android.taobao.util.b;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.UnsupportedEncodingException;
import java.util.Map;
import tb.kge;

/* loaded from: classes9.dex */
public class JniHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-2104568228);
    }

    public static byte[] getStringBytes(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("bd056648", new Object[]{str});
        }
        try {
            return str.getBytes(b.ISO88591);
        } catch (UnsupportedEncodingException unused) {
            throw new RuntimeException("ISO-8859-1 is unsupported");
        }
    }

    public static Object getStringClass() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("3171977a", new Object[0]) : String.class;
    }

    public static Object getKey(Map.Entry entry) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("51653eeb", new Object[]{entry}) : entry.getKey();
    }

    public static Object getValue(Map.Entry entry) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("db9650fd", new Object[]{entry}) : entry.getValue();
    }
}
