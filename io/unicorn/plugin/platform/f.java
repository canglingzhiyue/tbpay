package io.unicorn.plugin.platform;

import android.view.View;
import java.util.Map;

/* loaded from: classes9.dex */
public interface f {
    void dispose();

    View getView();

    void onActivityDestroy();

    void onActivityPause();

    void onActivityResume();

    void onActivityStart();

    void onActivityStop();

    void onFlutterViewAttached(View view);

    void onFlutterViewDetached();

    void onUpdateAttrs(Map<String, String> map);
}
