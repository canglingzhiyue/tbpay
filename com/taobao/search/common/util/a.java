package com.taobao.search.common.util;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import tb.kge;

/* loaded from: classes7.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final String f19027a;
    private static a b;
    private Map<String, C0757a> c = new HashMap();

    public static /* synthetic */ String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[0]) : f19027a;
    }

    static {
        kge.a(-1901171813);
        f19027a = a.class.getSimpleName();
        b = new a();
    }

    public static a a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("b42d2855", new Object[0]) : b;
    }

    public String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{this, str});
        }
        C0757a c = c(str);
        return c == null ? "" : c.a();
    }

    public void a(String str, String str2, int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6998bead", new Object[]{this, str, str2, new Integer(i), new Boolean(z)});
            return;
        }
        String str3 = "record search behavior:" + str + " " + str2 + " " + i + " " + z;
        C0757a c = c(str);
        if (c == null) {
            c = b(str);
        } else {
            c.b();
        }
        c.a(str2, i, z);
    }

    public void a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("929ad046", new Object[]{this, str, str2, str3});
            return;
        }
        String str4 = "record click behavior:" + str + " " + str2 + " " + str3;
        C0757a c = c(str);
        if (c == null) {
            c = b(str);
        }
        c.a(str2, str3);
    }

    private C0757a b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (C0757a) ipChange.ipc$dispatch("99219303", new Object[]{this, str});
        }
        if (StringUtils.isEmpty(str)) {
            str = "all";
        }
        C0757a c0757a = new C0757a();
        this.c.put(str, c0757a);
        return c0757a;
    }

    private C0757a c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (C0757a) ipChange.ipc$dispatch("beb59c04", new Object[]{this, str});
        }
        if (StringUtils.isEmpty(str)) {
            str = "all";
        }
        return this.c.get(str);
    }

    /* renamed from: com.taobao.search.common.util.a$a  reason: collision with other inner class name */
    /* loaded from: classes7.dex */
    public static class C0757a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private LinkedList<String> f19028a;
        private String b;
        private String c;
        private String d;

        static {
            kge.a(-556147154);
        }

        private C0757a() {
            this.f19028a = new LinkedList<>();
            this.b = "";
            this.c = "";
            this.d = "";
        }

        public String a() {
            String str;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this});
            }
            String str2 = "";
            if (this.f19028a.size() == 0) {
                return str2;
            }
            StringBuilder sb = new StringBuilder();
            Iterator<String> it = this.f19028a.iterator();
            String str3 = str2;
            while (it.hasNext()) {
                sb.append(str3);
                sb.append(it.next());
                str3 = ",";
            }
            try {
                str = URLEncoder.encode(this.b, "UTF-8");
            } catch (UnsupportedEncodingException unused) {
                str = this.b;
            }
            try {
                str2 = String.format("q:%s;page_n:%s;nid:%s;time_stamp:%s", str, this.c, sb.toString(), this.d);
            } catch (Exception unused2) {
            }
            a.b();
            String str4 = "behavior content:" + str2;
            return str2;
        }

        public void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("57a83e9", new Object[]{this});
                return;
            }
            this.f19028a.clear();
            this.b = "";
            this.c = "";
            this.d = "";
        }

        public void a(String str, int i, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a352a7e3", new Object[]{this, str, new Integer(i), new Boolean(z)});
                return;
            }
            a.b();
            String str2 = "record search behavior:" + str + " " + i + " " + z;
            if (str == null) {
                str = "";
            }
            this.b = str;
            this.c = String.valueOf(i);
        }

        public void a(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
                return;
            }
            a.b();
            String str3 = "record click behavior:" + str + " " + str2;
            if (this.f19028a.size() > 10) {
                this.f19028a.poll();
            }
            this.f19028a.offer(str);
            this.d = str2;
        }
    }
}
