package tb;

import com.taobao.android.searchbaseframe.datasource.a;
import com.taobao.android.searchbaseframe.datasource.c;
import com.taobao.android.searchbaseframe.datasource.result.SearchResult;
import com.taobao.android.searchbaseframe.track.d;
import java.util.Map;

/* loaded from: classes6.dex */
public interface ism<RESULT extends SearchResult> {
    void a(RESULT result, Object obj, d dVar);

    void a(Map<String, String> map, a.C0571a c0571a, isl<RESULT> islVar);

    boolean a(RESULT result, Map<String, String> map, d dVar, c.a aVar, a.C0571a c0571a, boolean z, Runnable runnable);
}
