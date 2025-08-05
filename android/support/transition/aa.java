package android.support.transition;

import android.view.View;
import android.view.ViewGroup;
import com.taobao.taobao.R;

/* loaded from: classes2.dex */
public class aa {

    /* renamed from: a  reason: collision with root package name */
    private ViewGroup f1270a;
    private Runnable b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static aa a(View view) {
        return (aa) view.getTag(R.id.transition_current_scene);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(View view, aa aaVar) {
        view.setTag(R.id.transition_current_scene, aaVar);
    }

    public void a() {
        Runnable runnable;
        if (a(this.f1270a) != this || (runnable = this.b) == null) {
            return;
        }
        runnable.run();
    }
}
