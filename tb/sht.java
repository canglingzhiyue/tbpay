package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes5.dex */
public interface sht {

    /* loaded from: classes5.dex */
    public static class a implements sht {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-1182636614);
            kge.a(-1514374609);
        }

        @Override // tb.sht
        public void onDoubleClick(float f, float f2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7f84119f", new Object[]{this, new Float(f), new Float(f2)});
            }
        }

        @Override // tb.sht
        public boolean onLongClick(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("5f358e04", new Object[]{this, new Boolean(z)})).booleanValue();
            }
            return false;
        }

        @Override // tb.sht
        public void onLongClickCancel() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("70b73f2e", new Object[]{this});
            }
        }

        @Override // tb.sht
        public void onPendingClick() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7bcd6a37", new Object[]{this});
            }
        }

        @Override // tb.sht
        public void onSingleClick(float f, float f2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e461e8c8", new Object[]{this, new Float(f), new Float(f2)});
            }
        }

        @Override // tb.sht
        public void onTripleClick(float f, float f2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("52af96f2", new Object[]{this, new Float(f), new Float(f2)});
            }
        }
    }

    void onDoubleClick(float f, float f2);

    boolean onLongClick(boolean z);

    void onLongClickCancel();

    void onPendingClick();

    void onSingleClick(float f, float f2);

    void onTripleClick(float f, float f2);
}
