package com.taobao.themis.utils.io;

import android.util.Log;
import com.alipay.mobile.common.transport.monitor.RPCDataItems;
import com.android.alibaba.ip.runtime.IpChange;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.q;
import tb.kge;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0012\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0010\u001a\u00020\u0004H\u0007J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u0012H\u0007J\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0010\u001a\u00020\u00042\b\b\u0002\u0010\u0013\u001a\u00020\u0004H\u0007J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0010\u001a\u00020\u0012H\u0007J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0010\u001a\u00020\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u0015"}, d2 = {"Lcom/taobao/themis/utils/io/MD5Util;", "", "()V", "ALGORITHM_MD5", "", "DEFAULT_CHARSET", "READ_BUFFER_SIZE", "", RPCDataItems.SWITCH_TAG_LOG, "hexDigits", "", "mD5Digest", "Ljava/security/MessageDigest;", "getMD5Digest", "()Ljava/security/MessageDigest;", "getMD5Base64", "source", "getMD5Byte", "", "format", "getMD5String", "themis_utils_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class g {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final g INSTANCE;

    /* renamed from: a  reason: collision with root package name */
    private static final char[] f22884a;

    static {
        kge.a(-1054625301);
        INSTANCE = new g();
        f22884a = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    }

    private g() {
    }

    private final MessageDigest a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MessageDigest) ipChange.ipc$dispatch("cb93ce30", new Object[]{this});
        }
        try {
            return MessageDigest.getInstance("MD5");
        } catch (Exception e) {
            Log.e("MD5Util", "can't get instance of md5 algorithm， message: " + e.getMessage());
            return null;
        }
    }

    @JvmStatic
    public static final byte[] a(byte[] source) {
        byte[] digest;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("27137f8e", new Object[]{source});
        }
        q.d(source, "source");
        MessageDigest a2 = INSTANCE.a();
        if (a2 != null) {
            a2.update(source);
        }
        return (a2 == null || (digest = a2.digest()) == null) ? new byte[0] : digest;
    }

    @JvmStatic
    public static final String a(String source) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{source});
        }
        q.d(source, "source");
        try {
            Charset forName = Charset.forName("UTF-8");
            q.b(forName, "Charset.forName(charsetName)");
            byte[] bytes = source.getBytes(forName);
            q.b(bytes, "(this as java.lang.String).getBytes(charset)");
            return d.b(a(bytes));
        } catch (Throwable th) {
            Log.e("MD5Util", th.getMessage(), th);
            return null;
        }
    }
}
