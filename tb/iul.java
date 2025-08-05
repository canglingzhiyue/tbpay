package tb;

import com.android.alibaba.ip.runtime.IpChange;
import de.greenrobot.event.c;

/* loaded from: classes6.dex */
public interface iul {

    /* loaded from: classes6.dex */
    public static abstract class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(1972210171);
        }

        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            }
        }

        public abstract boolean a(iul iulVar);

        public void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            }
        }
    }

    void destroyAndRemoveFromParent();

    ium getParent();

    String getScopeTag();

    c obtainScopeEventBus();

    void onCtxDestroyInternal();

    void onCtxPauseInternal();

    void onCtxResumeInternal();

    void onCtxStopInternal();

    void printTree(StringBuilder sb, int i);

    <T> T searchWidgetInSubTree(Class<T> cls);

    boolean travel(a aVar);
}
