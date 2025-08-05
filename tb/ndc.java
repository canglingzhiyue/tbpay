package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes7.dex */
public class ndc extends lhc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static /* synthetic */ Object ipc$super(ndc ndcVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode != -1342773960) {
            if (hashCode != 996764703) {
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            }
            return super.c();
        }
        return super.a();
    }

    public ndc(ljs ljsVar) {
        super(ljsVar);
    }

    @Override // tb.lhc, com.taobao.infoflow.protocol.engine.invoke.biz.l
    public String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this});
        }
        String a2 = super.a();
        return TextUtils.isEmpty(a2) ? "Page_TMGTaote" : a2;
    }

    @Override // tb.lhc, com.taobao.infoflow.protocol.engine.invoke.biz.l
    public Map<String, String> c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("3b696c1f", new Object[]{this});
        }
        Map<String, String> c = super.c();
        if (c == null) {
            c = new HashMap<>(16);
        }
        c.put("spm-cnt", "a2141.26469588.0.0");
        return c;
    }
}
