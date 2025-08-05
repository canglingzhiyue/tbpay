package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Collections;
import java.util.List;

/* loaded from: classes6.dex */
public class kpp {
    public static final ijd EMPTY_CONFIG = new ijd() { // from class: tb.kpp.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.ijd
        public long a(String str, long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("8123b0c6", new Object[]{this, str, new Long(j)})).longValue();
            }
            return 0L;
        }

        @Override // tb.ijd
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            }
        }

        @Override // tb.ijd
        public boolean a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{this, str})).booleanValue();
            }
            return false;
        }

        @Override // tb.ijd
        public boolean a(String str, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("8123ece6", new Object[]{this, str, new Boolean(z)})).booleanValue();
            }
            return false;
        }

        @Override // tb.ijd
        public String b(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("4204a5c3", new Object[]{this, str, str2});
            }
            return null;
        }

        @Override // tb.ijd
        public boolean b(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("3dd7e577", new Object[]{this, str})).booleanValue();
            }
            return false;
        }

        @Override // tb.ijd
        public String d(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("f4d254b", new Object[]{this, str});
            }
            return null;
        }

        @Override // tb.ijd
        public List<String> c(String str) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("eb209513", new Object[]{this, str}) : Collections.emptyList();
        }

        @Override // tb.ijd
        public List<String> a(String str, String str2) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("8c4a1d4b", new Object[]{this, str, str2}) : Collections.emptyList();
        }
    };
}
