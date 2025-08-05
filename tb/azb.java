package tb;

import com.alibaba.android.aura.datamodel.nextrpc.a;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import java.util.Map;
import mtopsdk.mtop.domain.MtopResponse;

/* loaded from: classes2.dex */
public class azb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1037596786);
    }

    public static String a(a aVar) {
        MtopResponse g;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9dfa4f92", new Object[]{aVar});
        }
        if (aVar == null || (g = aVar.g()) == null) {
            return null;
        }
        Map<String, List<String>> headerFields = g.getHeaderFields();
        if (bau.a(headerFields)) {
            return null;
        }
        List<String> list = headerFields.get("eagleeye-traceid");
        if (!bau.a(list)) {
            return list.get(0);
        }
        return null;
    }

    public static int b(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a8fdf882", new Object[]{aVar})).intValue();
        }
        MtopResponse g = aVar.g();
        if (g == null) {
            return 200;
        }
        return g.getResponseCode();
    }

    public static String c(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d6d64850", new Object[]{aVar});
        }
        MtopResponse g = aVar.g();
        if (g == null) {
            return null;
        }
        return g.getMappingCode();
    }
}
