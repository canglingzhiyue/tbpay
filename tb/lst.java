package tb;

import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.webkit.WebView;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.a;
import kotlin.jvm.internal.q;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fJ\u0012\u0010\r\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/taobao/android/lightvane/LightVaneSDK;", "", "()V", "initialized", "Ljava/util/concurrent/atomic/AtomicBoolean;", "settedDataDirSuffix", "", "init", "", "context", "Landroid/content/Context;", "params", "Lcom/taobao/android/lightvane/config/LVAppParams;", "webviewTarget28Support", "lightvane_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes5.dex */
public final class lst {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final lst INSTANCE;

    /* renamed from: a  reason: collision with root package name */
    private static final AtomicBoolean f30901a;
    private static boolean b;

    static {
        kge.a(391419116);
        INSTANCE = new lst();
        f30901a = new AtomicBoolean(false);
    }

    private lst() {
    }

    public final void a(Context context, mty mtyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("874551de", new Object[]{this, context, mtyVar});
            return;
        }
        q.d(context, "context");
        if (f30901a.get()) {
            return;
        }
        Application application = (Application) (!(context instanceof Application) ? null : context);
        Application applicationContext = application != null ? application : context.getApplicationContext();
        if (!(applicationContext instanceof Application)) {
            applicationContext = null;
        }
        Application application2 = (Application) applicationContext;
        if (application2 == null) {
            throw new IllegalArgumentException("init error, context should be Application or its subclass");
        }
        a(context);
        f30901a.set(gwi.a(application2, mtyVar));
    }

    private final void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{this, context});
            return;
        }
        try {
            if (Build.VERSION.SDK_INT < 28) {
                return;
            }
            String b2 = gwl.b(context);
            q.b(b2, "CommonUtils.getProcessName(context)");
            if (TextUtils.isEmpty(b2)) {
                return;
            }
            WebView.setDataDirectorySuffix(b2);
            b = true;
        } catch (Throwable th) {
            if (b) {
                return;
            }
            AndroidRuntimeException androidRuntimeException = new AndroidRuntimeException("WebView Android P Support Error");
            a.a(androidRuntimeException, th);
            androidRuntimeException.printStackTrace();
        }
    }
}
