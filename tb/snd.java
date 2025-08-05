package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes5.dex */
public interface snd {
    public static final int CREATED = 0;
    public static final int DESTROYED = 5;
    public static final int PAUSED = 3;
    public static final int RESUMED = 2;
    public static final int STARTED = 1;
    public static final int STOPED = 4;
    public static final int UNKNOWN = -1;

    /* loaded from: classes5.dex */
    public static class a implements snd {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-432594507);
            kge.a(1755210026);
        }

        @Override // tb.snd
        public void cI_() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f6eaece0", new Object[]{this});
            }
        }

        @Override // tb.snd
        public void onCreate() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("18a7a6c2", new Object[]{this});
            }
        }

        @Override // tb.snd
        public void onPause() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            }
        }

        @Override // tb.snd
        public void onResume() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            }
        }

        @Override // tb.snd
        public void onStart() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
            }
        }

        @Override // tb.snd
        public void onStop() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b3dde88", new Object[]{this});
            }
        }
    }

    void cI_();

    void onCreate();

    void onPause();

    void onResume();

    void onStart();

    void onStop();
}
