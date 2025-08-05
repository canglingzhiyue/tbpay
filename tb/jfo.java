package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes6.dex */
public class jfo implements jfl {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final List<b> f29524a = new ArrayList();

    /* loaded from: classes6.dex */
    public interface a {
        void accept(String str, String str2, String str3);
    }

    /* loaded from: classes6.dex */
    public class b {

        /* renamed from: a  reason: collision with root package name */
        public String f29525a;
        public String b;
        public String c;

        private b(String str, String str2, String str3) {
            this.f29525a = str;
            this.b = str2;
            this.c = str3;
        }
    }

    @Override // tb.jfl
    public void a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("929ad046", new Object[]{this, str, str2, str3});
            return;
        }
        synchronized (this.f29524a) {
            this.f29524a.add(new b(str, str2, str3));
        }
    }

    public void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a0cae28", new Object[]{this, aVar});
            return;
        }
        synchronized (this.f29524a) {
            for (b bVar : this.f29524a) {
                aVar.accept(bVar.f29525a, bVar.b, bVar.c);
            }
        }
    }
}
