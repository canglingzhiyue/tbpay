package tb;

import com.android.alibaba.ip.runtime.IpChange;
import mtopsdk.common.util.StringUtils;

/* loaded from: classes8.dex */
public class otx {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f32420a;
    public String b;
    public boolean c;
    public String d;
    public String e;

    static {
        kge.a(2039677351);
    }

    public otx(String str, String str2, boolean z) {
        this.f32420a = "DEFAULT_AUTH";
        if (StringUtils.isNotBlank(str)) {
            this.f32420a = str;
        }
        this.b = str2;
        this.c = z;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        StringBuilder sb = new StringBuilder(64);
        sb.append("AuthParam{ openAppKey=");
        sb.append(this.f32420a);
        sb.append(", bizParam=");
        sb.append(this.b);
        sb.append(", showAuthUI=");
        sb.append(this.c);
        sb.append(", apiInfo=");
        sb.append(this.d);
        sb.append(", failInfo=");
        sb.append(this.e);
        sb.append(riy.BLOCK_END_STR);
        return sb.toString();
    }
}
