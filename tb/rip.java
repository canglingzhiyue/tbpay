package tb;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.mobile.auth.gatewayauth.utils.EncryptUtils;
import com.taobao.login4android.api.Login;
import com.taobao.tao.image.d;
import com.taobao.vpm.utils.a;
import com.ut.device.UTDevice;
import java.security.MessageDigest;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes9.dex */
public class rip {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static AtomicInteger f33168a = new AtomicInteger(1000);

    public String a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bbc5dc40", new Object[]{this, context});
        }
        if (!a.c()) {
            return "";
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(System.currentTimeMillis());
        stringBuffer.append(b(context));
        stringBuffer.append(a());
        return stringBuffer.toString();
    }

    private String b(Context context) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("31400281", new Object[]{this, context});
        }
        String str2 = EncryptUtils.IV_PARAMETER_SPEC;
        if (context == null) {
            return str2;
        }
        String userId = Login.getUserId();
        if (!StringUtils.isEmpty(userId)) {
            String hexString = Long.toHexString(Long.parseLong(userId));
            return str2.substring(0, 16 - hexString.length()) + hexString;
        }
        String utdid = UTDevice.getUtdid(context);
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(utdid.getBytes());
            str = a(messageDigest.digest());
        } catch (Throwable th) {
            th.printStackTrace();
            str = "";
        }
        if (str.length() >= 25) {
            str2 = str.substring(8, 24);
        }
        return str2;
    }

    private int a() {
        int i;
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[]{this})).intValue();
        }
        do {
            i = f33168a.get();
            i2 = i > 9000 ? 1000 : i + 1;
        } while (!f33168a.compareAndSet(i, i2));
        return i2;
    }

    private String a(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4b03f151", new Object[]{this, bArr});
        }
        char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', d.LEVEL_D, d.LEVEL_E, 'F'};
        char[] cArr2 = new char[bArr.length << 1];
        int i = 0;
        for (byte b : bArr) {
            int i2 = i + 1;
            cArr2[i] = cArr[(b >>> 4) & 15];
            i = i2 + 1;
            cArr2[i2] = cArr[b & 15];
        }
        return new String(cArr2);
    }
}
