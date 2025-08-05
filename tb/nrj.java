package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.searchdoor.searchbar.data.SearchBarHintBean;

/* loaded from: classes7.dex */
public class nrj {

    /* loaded from: classes7.dex */
    public static class f {
        static {
            kge.a(1952514434);
        }
    }

    static {
        kge.a(1869325183);
    }

    /* loaded from: classes7.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public String f31688a;

        static {
            kge.a(1604231841);
        }

        private b(String str) {
            this.f31688a = str;
        }

        public static b a(String str) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("2bcf89f0", new Object[]{str}) : new b(str);
        }

        public boolean a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : TextUtils.isEmpty(this.f31688a) || this.f31688a.length() == 0;
        }
    }

    /* loaded from: classes7.dex */
    public static class d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public SearchBarHintBean f31690a;

        static {
            kge.a(852651993);
        }

        private d(SearchBarHintBean searchBarHintBean) {
            this.f31690a = searchBarHintBean;
        }

        public static d a(SearchBarHintBean searchBarHintBean) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (d) ipChange.ipc$dispatch("5fd682ed", new Object[]{searchBarHintBean}) : new d(searchBarHintBean);
        }
    }

    /* loaded from: classes7.dex */
    public static class e {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public SearchBarHintBean f31691a;

        static {
            kge.a(1411206535);
        }

        private e(SearchBarHintBean searchBarHintBean) {
            this.f31691a = searchBarHintBean;
        }

        public static e a(SearchBarHintBean searchBarHintBean) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (e) ipChange.ipc$dispatch("5fd6830c", new Object[]{searchBarHintBean}) : new e(searchBarHintBean);
        }
    }

    /* loaded from: classes7.dex */
    public static class c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public String f31689a;
        public SearchBarHintBean b;

        static {
            kge.a(834861832);
        }

        private c(String str, SearchBarHintBean searchBarHintBean) {
            this.f31689a = str;
            this.b = searchBarHintBean;
        }

        public static c a(String str, SearchBarHintBean searchBarHintBean) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("2aada898", new Object[]{str, searchBarHintBean}) : new c(str, searchBarHintBean);
        }
    }

    /* loaded from: classes7.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(124962616);
        }

        private a() {
        }

        public static a a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("6e6b465b", new Object[0]) : new a();
        }
    }
}
