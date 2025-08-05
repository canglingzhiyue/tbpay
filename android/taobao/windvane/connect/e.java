package android.taobao.windvane.connect;

import android.net.Uri;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import tb.kge;

/* loaded from: classes2.dex */
public class e {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String DEFAULT_HTTPS_ERROR_EXPIRED = "EXPIRED";
    public static final String DEFAULT_HTTPS_ERROR_INVALID = "INVALID";
    public static final String DEFAULT_HTTPS_ERROR_NONE = "NONE";
    public static final int DEFAULT_MAX_LENGTH = 5242880;
    public static final int DEFAULT_MAX_LENGTH1 = 104857600;
    public static final int DEFAULT_MAX_REDIRECT_TIMES = 5;

    /* renamed from: a  reason: collision with root package name */
    private Uri f1578a;
    private byte[] b;
    private String c = "GET";
    private Map<String, String> d = null;
    private boolean e = true;
    private int f = 1;
    private int g = 5000;
    private int h = 5000;
    private String i = "NONE";

    static {
        kge.a(237035742);
    }

    public e(String str) {
        if (str == null) {
            throw new NullPointerException("HttpRequest init error, url is null.");
        }
        this.f1578a = Uri.parse(str);
    }

    public Uri a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Uri) ipChange.ipc$dispatch("d258659f", new Object[]{this}) : this.f1578a;
    }

    public void a(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1a285df", new Object[]{this, uri});
        } else if (uri == null) {
        } else {
            this.f1578a = uri;
        }
    }

    public byte[] b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (byte[]) ipChange.ipc$dispatch("a9d5fa14", new Object[]{this}) : this.b;
    }

    public String c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bd025a76", new Object[]{this}) : this.c;
    }

    public Map<String, String> d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("913cde0", new Object[]{this}) : this.d;
    }

    public void a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
        } else {
            this.d = map;
        }
    }

    public int e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5a4ca5f", new Object[]{this})).intValue() : this.g;
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else {
            this.g = i;
        }
    }

    public int f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5b2e1e0", new Object[]{this})).intValue() : this.h;
    }

    public boolean g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5c0f972", new Object[]{this})).booleanValue() : this.e;
    }

    public int h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5cf10e2", new Object[]{this})).intValue() : this.f;
    }
}
