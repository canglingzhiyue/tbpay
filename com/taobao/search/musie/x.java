package com.taobao.search.musie;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.Globals;
import java.util.Observable;
import java.util.Observer;
import kotlin.jvm.JvmStatic;
import tb.kge;
import tb.ntn;

/* loaded from: classes7.dex */
public final class x {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion;

    /* renamed from: a  reason: collision with root package name */
    private static String f19296a;
    private static boolean b;

    static {
        kge.a(1909901466);
        Companion = new a(null);
    }

    /* loaded from: classes7.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(1495284578);
        }

        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.o oVar) {
            this();
        }

        private final void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            } else if (x.a()) {
            } else {
                x.a(true);
                ntn.INSTANCE.a("TaoPP", C0773a.INSTANCE);
            }
        }

        /* renamed from: com.taobao.search.musie.x$a$a  reason: collision with other inner class name */
        /* loaded from: classes7.dex */
        public static final class C0773a implements Observer {
            public static volatile transient /* synthetic */ IpChange $ipChange;
            public static final C0773a INSTANCE = new C0773a();

            @Override // java.util.Observer
            public final void update(Observable observable, Object obj) {
                String str;
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("9292f698", new Object[]{this, observable, obj});
                } else if (!(obj instanceof JSONObject)) {
                } else {
                    JSONObject jSONObject = ((JSONObject) obj).getJSONObject("data");
                    if (jSONObject == null || (str = jSONObject.getString("cacheParams")) == null) {
                        str = "";
                    }
                    x.a(str);
                    com.etao.feimagesearch.k.a(Globals.getApplication(), "tbsearch:tpp_params", x.b());
                }
            }
        }

        @JvmStatic
        public final String a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this});
            }
            b();
            if (x.b() == null) {
                x.a(com.etao.feimagesearch.k.b(Globals.getApplication(), "tbsearch:tpp_params"));
            }
            String b = x.b();
            return b == null ? "" : b;
        }
    }

    public static final /* synthetic */ void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{str});
        } else {
            f19296a = str;
        }
    }

    public static final /* synthetic */ void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{new Boolean(z)});
        } else {
            b = z;
        }
    }

    public static final /* synthetic */ boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue() : b;
    }

    public static final /* synthetic */ String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[0]) : f19296a;
    }
}
