package tb;

import com.android.alibaba.ip.runtime.IpChange;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes.dex */
public class rpy implements rpw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private boolean f33316a;
    private String b;
    private String c;
    private byte[] d;

    static {
        kge.a(18346879);
        kge.a(-1932247209);
    }

    @Override // tb.rpw
    public String getAppkey() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("c9396be5", new Object[]{this}) : this.b;
    }

    public String getAppSecret() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("96a305e", new Object[]{this}) : this.c;
    }

    public rpy(String str, String str2) {
        this.f33316a = false;
        this.b = null;
        this.c = null;
        this.d = null;
        this.b = str;
        this.c = str2;
    }

    public rpy(String str, String str2, boolean z) {
        this.f33316a = false;
        this.b = null;
        this.c = null;
        this.d = null;
        this.b = str;
        this.c = str2;
        this.f33316a = z;
    }

    public boolean isEncode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("63fdc46b", new Object[]{this})).booleanValue() : this.f33316a;
    }

    @Override // tb.rpw
    public String getSign(String str) {
        String str2;
        String calcHmac;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5b4a049c", new Object[]{this, str});
        }
        if (this.b == null || (str2 = this.c) == null) {
            apr.e("UTBaseRequestAuthentication", "There is no appkey,please check it!");
            return null;
        } else if (str == null) {
            return null;
        } else {
            try {
                if (this.f33316a) {
                    calcHmac = calcHmac(str2.getBytes(), str.getBytes());
                } else {
                    calcHmac = calcHmac(a(), str.getBytes());
                }
                return calcHmac;
            } catch (Exception unused) {
                return "";
            }
        }
    }

    private byte[] a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("a8212175", new Object[]{this});
        }
        if (this.d == null) {
            this.d = apy.a(new byte[]{66, 37, 42, -119, 118, -104, -30, 4, -95, 15, -26, -12, -75, -102, 71, 23, -3, -120, -1, -57, 42, 99, -16, -101, 103, -74, 93, -114, 112, -26, -24, -24});
        }
        return this.d;
    }

    public static String calcHmac(byte[] bArr, byte[] bArr2) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9391840f", new Object[]{bArr, bArr2});
        }
        Mac mac = Mac.getInstance("HmacSHA1");
        mac.init(new SecretKeySpec(bArr, mac.getAlgorithm()));
        return aps.a(mac.doFinal(bArr2));
    }
}
