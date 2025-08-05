package tb;

import com.alibaba.evo.EVOExperiment;
import com.alibaba.evo.internal.bucketing.model.ExperimentV5;
import com.alibaba.ut.abtest.VariationSet;
import com.alibaba.ut.abtest.d;
import com.alibaba.ut.abtest.internal.bucketing.model.a;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public interface cer {
    VariationSet a(String str, String str2, Map<String, Object> map, Object obj);

    VariationSet a(String str, String str2, Map<String, Object> map, boolean z, Object obj);

    a a(ExperimentV5 experimentV5, Map<String, Object> map, ceq ceqVar, boolean z);

    List<EVOExperiment> a(String str, Map<String, Object> map);

    void a();

    void a(String str);

    void a(String str, String str2, d dVar);

    void a(List<ExperimentV5> list, Set<Long> set, long j, String str);

    void a(boolean z, String str);

    void b();

    void b(String str);

    void b(String str, String str2, d dVar);

    long c();

    VariationSet c(String str);

    String d();

    void d(String str);

    int e();

    String f();

    String g();

    long h();
}
