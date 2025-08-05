package tb;

import com.alibaba.evo.EVOExperiment;
import com.alibaba.ut.abtest.VariationSet;
import com.alibaba.ut.abtest.internal.debug.Debug;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public interface cfc {
    VariationSet a(String str);

    VariationSet a(String str, String str2, Map<String, Object> map, Object obj);

    VariationSet a(String str, String str2, Map<String, Object> map, boolean z, Object obj);

    String a();

    List<EVOExperiment> a(String str, Map<String, Object> map);

    void a(Debug debug);

    void a(String str, String str2, String str3, String str4);

    boolean a(String str, Object obj);

    boolean a(String str, Map<String, Object> map, Object obj);
}
