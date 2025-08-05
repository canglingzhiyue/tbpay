package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;

/* loaded from: classes5.dex */
public class fcc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public c f27782a;
    public List<a> b;

    static {
        kge.a(510631460);
    }

    public fcc() {
        emu.a("com.taobao.android.detail.wrapper.ext.component.main.viewmodel.KAPViewModel");
    }

    /* loaded from: classes5.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public boolean f27784a;
        public String b;
        public String c;
        public String d;
        public String e;

        static {
            kge.a(-467391123);
        }

        public /* synthetic */ Object clone() throws CloneNotSupportedException {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ipChange.ipc$dispatch("78b3604e", new Object[]{this}) : a();
        }

        public b a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("5fedf25a", new Object[]{this});
            }
            try {
                return (b) super.clone();
            } catch (CloneNotSupportedException e) {
                e.printStackTrace();
                b bVar = new b();
                bVar.f27784a = this.f27784a;
                bVar.b = this.b;
                bVar.c = this.c;
                bVar.d = this.d;
                return bVar;
            }
        }

        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            return "KAPItem{selected=" + this.f27784a + ", icon='" + this.b + "', selectIcon='" + this.c + "', title='" + this.d + "', key='" + this.e + "'}";
        }
    }

    /* loaded from: classes5.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public String f27783a;
        public String b;
        public String c;

        static {
            kge.a(1249795693);
        }

        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            return "KAPContainItem{title='" + this.f27783a + "', icon='" + this.b + "', action='" + this.c + "'}";
        }
    }

    /* loaded from: classes5.dex */
    public static class c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public List<b> f27785a;
        public int b;
        public String c;
        public String d;

        static {
            kge.a(1296799802);
        }

        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            return "KapContain{KAPList=" + this.f27785a + ", count=" + this.b + ", likeList='" + this.c + "', suffix='" + this.d + "'}";
        }
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "KAPViewModel{kapContain=" + this.f27782a + ", bubbles=" + this.b + '}';
    }
}
