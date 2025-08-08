package com.taobao.themis.utils.io;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.security.MessageDigest;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.q;
import tb.kge;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00042\u0006\u0010\b\u001a\u00020\u0004H\u0007J\u0012\u0010\t\u001a\u0004\u0018\u00010\u00042\u0006\u0010\b\u001a\u00020\u0004H\u0007¨\u0006\n"}, d2 = {"Lcom/taobao/themis/utils/io/FileSecurityUtils;", "", "()V", "bytes2Hex", "", "bytes", "", "getMD5", "text", "getSHA1", "themis_utils_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final b INSTANCE;

    static {
        kge.a(-1984092512);
        INSTANCE = new b();
    }

    private b() {
    }

    @JvmStatic
    public static final String a(String text) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{text});
        }
        q.d(text, "text");
        if (StringUtils.isEmpty(text)) {
            return null;
        }
        MessageDigest messageDigest = null;
        try {
            messageDigest = MessageDigest.getInstance("MD5");
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (messageDigest == null) {
            return null;
        }
        char[] charArray = text.toCharArray();
        q.b(charArray, "(this as java.lang.String).toCharArray()");
        byte[] bArr = new byte[charArray.length];
        int length = charArray.length;
        for (int i = 0; i < length; i++) {
            bArr[i] = (byte) charArray[i];
        }
        byte[] md5Bytes = messageDigest.digest(bArr);
        StringBuffer stringBuffer = new StringBuffer();
        q.b(md5Bytes, "md5Bytes");
        for (byte b : md5Bytes) {
            int i2 = b & 255;
            if (i2 < 16) {
                stringBuffer.append("0");
            }
            stringBuffer.append(Integer.toHexString(i2));
        }
        return stringBuffer.toString();
    }
}
