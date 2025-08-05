package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;

/* loaded from: classes.dex */
public class ciu {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private List<cix> f26297a;
    private int b = 0;

    static {
        kge.a(1390265090);
        kge.a(-19652221);
    }

    public ciu(List<cix> list) {
        this.f26297a = list;
    }

    public String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{this, str});
        }
        if (this.b + 1 > this.f26297a.size()) {
            this.b = 0;
            return str;
        }
        List<cix> list = this.f26297a;
        int i = this.b;
        this.b = i + 1;
        return list.get(i).a(str, this);
    }
}
