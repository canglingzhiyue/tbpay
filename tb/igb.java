package tb;

import android.os.Bundle;
import com.taobao.android.change.app.icon.core.Constrant;

/* loaded from: classes4.dex */
public interface igb {

    /* renamed from: tb.igb$-CC  reason: invalid class name */
    /* loaded from: classes9.dex */
    public final /* synthetic */ class CC {
        public static Bundle a(boolean z, boolean z2, int i) {
            Bundle bundle = new Bundle();
            bundle.putBoolean("result", z);
            boolean z3 = true;
            if (i <= 1) {
                z3 = false;
            }
            bundle.putBoolean(Constrant.KEY_MORE_ICONS, z3);
            bundle.putInt(Constrant.KEY_ENABLE_LAUNCHER, i);
            bundle.putBoolean(Constrant.KEY_TIME_OUT, z2);
            return bundle;
        }
    }

    void a(int i);

    void a(Bundle bundle);
}
