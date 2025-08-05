package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes5.dex */
public interface smr {

    /* loaded from: classes5.dex */
    public static class a implements smr {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(229111742);
            kge.a(-855224269);
        }

        @Override // tb.smr
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            }
        }

        @Override // tb.smr
        public void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            }
        }
    }

    void a();

    void b();
}
