package tb;

import android.app.Activity;
import android.os.Bundle;
import java.util.Map;

/* loaded from: classes2.dex */
public interface bni {
    Map<String, String> getParams();

    boolean prefetch(Activity activity, Bundle bundle);

    boolean process(Activity activity, Bundle bundle, int i);
}
