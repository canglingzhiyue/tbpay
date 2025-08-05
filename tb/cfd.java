package tb;

import com.alibaba.evo.EVOExperiment;
import com.alibaba.ut.abtest.VariationSet;
import com.alibaba.ut.abtest.internal.debug.Debug;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class cfd implements cfc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1290999084);
        kge.a(1451628205);
    }

    @Override // tb.cfc
    public VariationSet a(String str, String str2, Map<String, Object> map, boolean z, Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (VariationSet) ipChange.ipc$dispatch("552a0562", new Object[]{this, str, str2, map, new Boolean(z), obj}) : cex.a().i().a(str, str2, map, z, obj);
    }

    @Override // tb.cfc
    public VariationSet a(String str, String str2, Map<String, Object> map, Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (VariationSet) ipChange.ipc$dispatch("927b304", new Object[]{this, str, str2, map, obj}) : cex.a().i().a(str, str2, map, obj);
    }

    @Override // tb.cfc
    public VariationSet a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (VariationSet) ipChange.ipc$dispatch("f9d869d7", new Object[]{this, str}) : cex.a().i().c(str);
    }

    @Override // tb.cfc
    public List<EVOExperiment> a(String str, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("f3bb44d4", new Object[]{this, str, map}) : cex.a().i().a(str, map);
    }

    @Override // tb.cfc
    public boolean a(String str, Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("8bb65392", new Object[]{this, str, obj})).booleanValue() : cex.a().k().a(str, obj);
    }

    @Override // tb.cfc
    public boolean a(String str, Map<String, Object> map, Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ee015633", new Object[]{this, str, map, obj})).booleanValue() : cex.a().k().a(str, map, obj);
    }

    @Override // tb.cfc
    public void a(Debug debug) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("393829e5", new Object[]{this, debug});
        } else {
            cex.a().n().a(debug);
        }
    }

    @Override // tb.cfc
    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : cex.a().k().b();
    }

    @Override // tb.cfc
    public void a(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee2b490", new Object[]{this, str, str2, str3, str4});
        } else {
            cex.a().n().a(0, str, str2, str3, str4);
        }
    }
}
