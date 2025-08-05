package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes.dex */
public interface bhv {

    /* loaded from: classes2.dex */
    public static final class a implements bhv {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(1879377935);
            kge.a(1147299969);
        }

        @Override // tb.bhv
        public boolean a(Context context, String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("d18de978", new Object[]{this, context, str, str2})).booleanValue();
            }
            return false;
        }

        @Override // tb.bhv
        public boolean a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{this, str})).booleanValue();
            }
            return false;
        }

        @Override // tb.bhv
        public String b(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("6111438d", new Object[]{this, str});
            }
            return null;
        }
    }

    boolean a(Context context, String str, String str2);

    boolean a(String str);

    String b(String str);
}
