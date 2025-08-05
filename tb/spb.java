package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes5.dex */
public interface spb {

    /* loaded from: classes5.dex */
    public static class a implements spb {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(2075245476);
            kge.a(883776025);
        }

        @Override // tb.spb
        public void onAnimationEnd() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7c281bbd", new Object[]{this});
            }
        }

        @Override // tb.spb
        public void onAnimationStart() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("771cb104", new Object[]{this});
            }
        }
    }

    void onAnimationEnd();

    void onAnimationStart();
}
