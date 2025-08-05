package com.taobao.themis.open.ability.network;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.network.http.HttpType;
import java.util.HashMap;
import java.util.Map;
import tb.kge;

/* loaded from: classes9.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int DEFAULT_TIMEOUT_MS = 3000;

    /* renamed from: a  reason: collision with root package name */
    private String f22660a;
    private String b;
    private Map<String, String> c;
    private String d;
    private HttpType e;
    private int f;

    static {
        kge.a(274108101);
    }

    private a(String str, String str2, Map<String, String> map, String str3, HttpType httpType, int i) {
        this.e = HttpType.text;
        this.f = 3000;
        this.f22660a = str;
        this.b = str2;
        this.c = map;
        this.d = str3;
        this.e = httpType;
        this.f = i == 0 ? 3000 : i;
    }

    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : this.f22660a;
    }

    public String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : this.b;
    }

    public Map<String, String> c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("3b696c1f", new Object[]{this}) : this.c;
    }

    public String d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("43881515", new Object[]{this}) : this.d;
    }

    public HttpType e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (HttpType) ipChange.ipc$dispatch("cedde9cd", new Object[]{this}) : this.e;
    }

    public int f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5b2e1e0", new Object[]{this})).intValue() : this.f;
    }

    /* renamed from: com.taobao.themis.open.ability.network.a$a  reason: collision with other inner class name */
    /* loaded from: classes9.dex */
    public static class C0957a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private String f22661a;
        private String b;
        private Map<String, String> c = new HashMap();
        private String d;
        private HttpType e;
        private int f;

        static {
            kge.a(1966657692);
        }

        public C0957a a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (C0957a) ipChange.ipc$dispatch("3a9e2a4a", new Object[]{this, str});
            }
            this.f22661a = str;
            return this;
        }

        public C0957a b(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (C0957a) ipChange.ipc$dispatch("a4cdb269", new Object[]{this, str});
            }
            this.b = str;
            return this;
        }

        public C0957a a(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (C0957a) ipChange.ipc$dispatch("4384bec0", new Object[]{this, str, str2});
            }
            this.c.put(str, str2);
            return this;
        }

        public C0957a c(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (C0957a) ipChange.ipc$dispatch("efd3a88", new Object[]{this, str});
            }
            this.d = str;
            return this;
        }

        public C0957a d(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (C0957a) ipChange.ipc$dispatch("792cc2a7", new Object[]{this, str});
            }
            if (HttpType.json.name().equals(str)) {
                this.e = HttpType.json;
            } else if (HttpType.jsonp.name().equals(str)) {
                this.e = HttpType.jsonp;
            } else if (HttpType.base64.name().equals(str)) {
                this.e = HttpType.base64;
            } else if (HttpType.arraybuffer.name().equals(str)) {
                this.e = HttpType.arraybuffer;
            } else {
                this.e = HttpType.text;
            }
            return this;
        }

        public C0957a a(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (C0957a) ipChange.ipc$dispatch("2b73bb41", new Object[]{this, new Integer(i)});
            }
            this.f = i;
            return this;
        }

        public a a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("1c2886f1", new Object[]{this}) : new a(this.f22661a, this.b, this.c, this.d, this.e, this.f);
        }
    }
}
