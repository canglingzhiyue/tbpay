package com.taobao.android.weex_framework.module.builtin.stream;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import tb.kge;

/* loaded from: classes6.dex */
public class Options {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private String f16059a;
    private String b;
    private Map<String, String> c;
    private String d;
    private Type e;
    private int f;

    /* loaded from: classes6.dex */
    public enum Type {
        json,
        text,
        jsonp
    }

    static {
        kge.a(617529634);
    }

    private Options(String str, String str2, Map<String, String> map, String str3, Type type, int i) {
        this.e = Type.text;
        this.f = 3000;
        this.f16059a = str;
        this.b = str2;
        this.c = map;
        this.d = str3;
        this.e = type;
        this.f = i == 0 ? 3000 : i;
    }

    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : this.f16059a;
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

    public Type e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Type) ipChange.ipc$dispatch("80d330fd", new Object[]{this}) : this.e;
    }

    public int f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5b2e1e0", new Object[]{this})).intValue() : this.f;
    }

    /* loaded from: classes6.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private String f16060a;
        private String b;
        private Map<String, String> c = new HashMap();
        private String d;
        private Type e;
        private int f;

        static {
            kge.a(-868526599);
        }

        public a a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("915c48e4", new Object[]{this, str});
            }
            this.f16060a = str;
            return this;
        }

        public a b(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("7a640de5", new Object[]{this, str});
            }
            this.b = str;
            return this;
        }

        public a a(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("f5070fae", new Object[]{this, str, str2});
            }
            this.c.put(str, str2);
            return this;
        }

        public a c(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("636bd2e6", new Object[]{this, str});
            }
            this.d = str;
            return this;
        }

        public a d(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("4c7397e7", new Object[]{this, str});
            }
            if (Type.json.name().equals(str)) {
                this.e = Type.json;
            } else if (Type.jsonp.name().equals(str)) {
                this.e = Type.jsonp;
            } else {
                this.e = Type.text;
            }
            return this;
        }

        public a a(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("86c5920d", new Object[]{this, new Integer(i)});
            }
            this.f = i;
            return this;
        }

        public Options a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Options) ipChange.ipc$dispatch("6d63dfb7", new Object[]{this}) : new Options(this.f16060a, this.b, this.c, this.d, this.e, this.f);
        }
    }
}
