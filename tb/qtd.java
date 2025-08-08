package tb;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes8.dex */
public final class qtd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private String f33055a = "";

    static {
        kge.a(-403775630);
    }

    public final void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
        } else if (StringUtils.isEmpty(str)) {
        } else {
            if (str2 == null || StringUtils.isEmpty(str2)) {
                str2 = "";
            }
            if (!StringUtils.isEmpty(this.f33055a)) {
                String str3 = this.f33055a;
                this.f33055a = str3 + ",";
            }
            String str4 = this.f33055a;
            this.f33055a = str4 + '\"' + str + "\":\"" + str2 + '\"';
        }
    }

    public final String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this});
        }
        if (StringUtils.isEmpty(this.f33055a)) {
            return "";
        }
        return "[{" + this.f33055a + "}]";
    }
}
