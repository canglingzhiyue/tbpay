package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes.dex */
public class rqa implements rpw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private String f33317a;
    private String b;
    private rpx c;

    static {
        kge.a(-1937259291);
        kge.a(-1932247209);
    }

    @Override // tb.rpw
    public String getAppkey() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("c9396be5", new Object[]{this}) : this.f33317a;
    }

    public String getAuthcode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("c81d9ece", new Object[]{this}) : this.b;
    }

    public rqa(String str, String str2) {
        this.f33317a = null;
        this.b = "";
        this.c = null;
        this.f33317a = str;
        this.b = str2;
        this.c = new rpx(str, str2);
    }

    @Override // tb.rpw
    public String getSign(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("5b4a049c", new Object[]{this, str}) : this.c.a(str);
    }
}
