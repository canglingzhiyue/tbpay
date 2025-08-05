package tb;

import android.view.View;
import java.util.Map;

/* loaded from: classes9.dex */
public interface rgu {
    void onDowngrade(rgy rgyVar, Map<String, Object> map);

    void onLoadError(rgy rgyVar);

    void onLoadFinish(View view);

    void onLoadStart();
}
