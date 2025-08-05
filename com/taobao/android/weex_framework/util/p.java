package com.taobao.android.weex_framework.util;

import com.alibaba.idst.nls.restapi.HttpRequest;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.zcache.ResourceRequest;
import com.taobao.zcache.ResourceResponse;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.HashMap;
import java.util.Scanner;
import tb.kge;

/* loaded from: classes6.dex */
public class p {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1163502315);
    }

    public static String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[0]) : "weex21,weex20";
    }

    public static String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[0]) : "application/vnd.weex.v21,application/vnd.weex.v20";
    }

    public static boolean a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{str})).booleanValue() : "application/vnd.weex.v21".equals(str) || "application/vnd.weex.v20".equals(str);
    }

    public static String b(String str) {
        byte[] data;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6111438d", new Object[]{str});
        }
        try {
            HashMap hashMap = new HashMap();
            hashMap.put(HttpRequest.HEADER_ACCEPT, b());
            ResourceResponse a2 = com.taobao.zcache.n.a(new ResourceRequest(str, hashMap));
            return (a2 == null || (data = a2.getData()) == null) ? "" : a(data).get(a.ATOM_stack);
        } catch (Throwable th) {
            if (g.a()) {
                g.f("WeexBinaryUtil", "get getResourceForUrl:" + th.getMessage());
            }
        }
    }

    public static HashMap<String, String> a(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("8510ced2", new Object[]{bArr});
        }
        try {
            ByteBuffer wrap = ByteBuffer.wrap(bArr);
            wrap.order(ByteOrder.LITTLE_ENDIAN);
            int i = wrap.getInt(16);
            if (i > 0) {
                wrap.position(i + 1 + 4 + 24);
                HashMap<String, String> hashMap = new HashMap<>(3);
                short s = wrap.getShort();
                while (true) {
                    short s2 = (short) (s - 1);
                    if (s <= 0) {
                        return hashMap;
                    }
                    short s3 = wrap.getShort();
                    String str = new String(bArr, wrap.position(), (int) s3);
                    wrap.position(wrap.position() + s3);
                    short s4 = wrap.getShort();
                    String str2 = new String(bArr, wrap.position(), (int) s4);
                    wrap.position(wrap.position() + s4);
                    hashMap.put(str, str2);
                    s = s2;
                }
            }
        } catch (IndexOutOfBoundsException unused) {
        }
        return new HashMap<>();
    }

    public static int a(String str, String str2) {
        int nextInt;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d9378d6f", new Object[]{str, str2})).intValue();
        }
        int lastIndexOf = str.lastIndexOf(44);
        if (lastIndexOf >= 0) {
            str = str.substring(0, lastIndexOf);
        }
        int lastIndexOf2 = str2.lastIndexOf(44);
        if (lastIndexOf2 >= 0) {
            str2 = str2.substring(0, lastIndexOf2);
        }
        Scanner useDelimiter = new Scanner(str).useDelimiter("\\.|\\s+");
        Scanner useDelimiter2 = new Scanner(str2).useDelimiter("\\.|\\s+");
        do {
            int nextInt2 = useDelimiter.hasNextInt() ? useDelimiter.nextInt() : -1;
            nextInt = useDelimiter2.hasNextInt() ? useDelimiter2.nextInt() : -1;
            if (nextInt2 >= nextInt) {
                if (nextInt2 <= nextInt) {
                    if (nextInt2 < 0) {
                        break;
                    }
                } else {
                    return 1;
                }
            } else {
                return -1;
            }
        } while (nextInt >= 0);
        return 0;
    }
}
