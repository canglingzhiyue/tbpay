package tb;

import android.os.Bundle;
import android.webkit.ValueCallback;
import com.taobao.android.tcrash.UncaughtCrashHeader;
import java.util.concurrent.Callable;

/* loaded from: classes6.dex */
public interface jef {
    UncaughtCrashHeader a();

    void a(ValueCallback<Bundle> valueCallback);

    void a(Callable<String> callable);
}
