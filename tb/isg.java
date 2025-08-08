package tb;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes6.dex */
public class isg {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Map<String, isf> f29277a = new HashMap();
    private isf b = new ish();

    static {
        kge.a(-1793353608);
    }

    public isg() {
        this.f29277a.put("standard", new ish());
    }

    public isf a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (isf) ipChange.ipc$dispatch("7c70c518", new Object[]{this, str});
        }
        if (StringUtils.isEmpty(str)) {
            return this.b;
        }
        isf isfVar = this.f29277a.get(str);
        return isfVar == null ? this.b : isfVar;
    }

    public void a(isf isfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee45b4dc", new Object[]{this, isfVar});
        } else {
            this.b = isfVar;
        }
    }

    public void a(String str, isf isfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e302aa6", new Object[]{this, str, isfVar});
        } else {
            this.f29277a.put(str, isfVar);
        }
    }
}
