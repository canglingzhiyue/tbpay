package com.taobao.themis.utils.io;

import com.alipay.android.msp.framework.dynfun.TplMsg;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.q;
import tb.kge;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00042\u0006\u0010\b\u001a\u00020\tH\u0007J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0004H\u0007J\u0014\u0010\f\u001a\u0004\u0018\u00010\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004H\u0007¨\u0006\r"}, d2 = {"Lcom/taobao/themis/utils/io/HexUtils;", "", "()V", "byteArrayToHex", "", "bytes", "", "byteToHex", TplMsg.VALUE_T_NATIVE_RETURN, "", "hexToByte", "hex", "hexToByteArray", "themis_utils_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class e {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final e INSTANCE;

    static {
        kge.a(-1611726709);
        INSTANCE = new e();
    }

    private e() {
    }

    @JvmStatic
    public static final String a(byte[] bytes) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4b03f151", new Object[]{bytes});
        }
        q.d(bytes, "bytes");
        StringBuilder sb = new StringBuilder();
        for (byte b : bytes) {
            String hexString = Integer.toHexString(b & 255);
            q.b(hexString, "Integer.toHexString(bytes[i].toInt() and 0xFF)");
            if (hexString.length() < 2) {
                sb.append(0);
            }
            sb.append(hexString);
        }
        String sb2 = sb.toString();
        q.b(sb2, "sb.toString()");
        return sb2;
    }
}
