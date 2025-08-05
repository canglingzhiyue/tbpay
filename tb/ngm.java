package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.InputStream;
import java.io.StringBufferInputStream;
import java.util.Map;

/* loaded from: classes7.dex */
public class ngm implements nge {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final String f31446a;
    private String b;
    private String c;
    private int d;
    private String e;
    private Map<String, String> f;
    private InputStream g;

    static {
        kge.a(-864386915);
        kge.a(-848562368);
        f31446a = ngm.class.getName();
    }

    public ngm(String str, String str2, InputStream inputStream) {
        this.b = str;
        this.c = str2;
        a(inputStream);
    }

    public ngm(String str, String str2, int i, String str3, Map<String, String> map, InputStream inputStream) {
        this(str, str2, inputStream);
        a(i, str3);
        a(map);
    }

    @Override // tb.nge
    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : this.b;
    }

    @Override // tb.nge
    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            this.b = str;
        }
    }

    @Override // tb.nge
    public String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : this.c;
    }

    @Override // tb.nge
    public void a(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20f12ca5", new Object[]{this, new Integer(i), str});
            return;
        }
        this.d = i;
        this.e = str;
        if (str == null) {
            ngr.b(f31446a, "reasonPhrase can't be null.");
            return;
        }
        if (i < 100) {
            ngr.b(f31446a, "statusCode can't be less than 100.");
        }
        if (i > 599) {
            ngr.b(f31446a, "statusCode can't be greater than 599.");
        }
        if (i > 299 && i < 400) {
            ngr.b(f31446a, "statusCode can't be in the [300, 399] range.");
        }
        if (str.trim().isEmpty()) {
            ngr.b(f31446a, "reasonPhrase can't be empty.");
        }
        for (int i2 = 0; i2 < str.length(); i2++) {
            if (str.charAt(i2) > 127) {
                ngr.b(f31446a, "reasonPhrase can't contain non-ASCII characters.");
            }
        }
    }

    @Override // tb.nge
    public int c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5889b5d", new Object[]{this})).intValue() : this.d;
    }

    @Override // tb.nge
    public Map<String, String> d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("913cde0", new Object[]{this}) : this.f;
    }

    @Override // tb.nge
    public void a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
        } else {
            this.f = map;
        }
    }

    @Override // tb.nge
    public InputStream e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (InputStream) ipChange.ipc$dispatch("2480976f", new Object[]{this}) : this.g;
    }

    public void a(InputStream inputStream) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e528af2b", new Object[]{this, inputStream});
        } else if (inputStream != null && StringBufferInputStream.class.isAssignableFrom(inputStream.getClass())) {
            throw new IllegalArgumentException("StringBufferInputStream is deprecated and must not be passed to a WebResourceResponse");
        } else {
            this.g = inputStream;
        }
    }
}
