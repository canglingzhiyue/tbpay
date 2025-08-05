package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public class fzl {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public Object f28239a;
    public String b;
    public Map<Object, Object> c = new HashMap();

    static {
        kge.a(-1534193346);
    }

    public boolean a(fzl fzlVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("e98c89c4", new Object[]{this, fzlVar})).booleanValue() : fzlVar != null && !TextUtils.isEmpty(this.b) && this.b.equals(fzlVar.b) && this.f28239a == fzlVar.f28239a;
    }
}
