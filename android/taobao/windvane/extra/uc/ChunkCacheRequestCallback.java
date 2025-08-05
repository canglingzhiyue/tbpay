package android.taobao.windvane.extra.uc;

import java.util.List;
import java.util.Map;
import tb.mtc;

/* loaded from: classes2.dex */
public interface ChunkCacheRequestCallback extends mtc {
    void onCustomCallback(int i, Object... objArr);

    void onNetworkResponse(int i, Map<String, List<String>> map);
}
