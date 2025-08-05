package com.alibaba.android.aura;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Collection;
import java.util.Map;
import tb.kge;

/* loaded from: classes2.dex */
public class w {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final String f2218a;
    private final String b;
    private final Map<String, Object> c;
    private final IAURAPluginCenter[] d;
    private final IAURAInputField<Object> e;
    private boolean f;
    private Collection<String> g;

    static {
        kge.a(-1016375355);
    }

    public w(a aVar) {
        this.f2218a = aVar.f2219a;
        this.c = a.a(aVar);
        this.d = a.b(aVar);
        this.e = a.c(aVar);
        this.b = a.d(aVar);
        this.g = a.e(aVar);
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.f = z;
        }
    }

    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : this.f2218a;
    }

    public Map<String, Object> b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("6dbf0a5e", new Object[]{this}) : this.c;
    }

    public IAURAPluginCenter[] c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IAURAPluginCenter[]) ipChange.ipc$dispatch("2b617e75", new Object[]{this}) : this.d;
    }

    public IAURAInputField<Object> d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IAURAInputField) ipChange.ipc$dispatch("11aca269", new Object[]{this}) : this.e;
    }

    public String e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[]{this}) : this.b;
    }

    public Collection<String> f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Collection) ipChange.ipc$dispatch("fabc0fa", new Object[]{this}) : this.g;
    }

    /* loaded from: classes2.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public String f2219a;
        private String b;
        private Map<String, Object> c;
        private IAURAPluginCenter[] d;
        private IAURAInputField<Object> e;
        private Collection<String> f;

        static {
            kge.a(-1888183908);
        }

        public static /* synthetic */ Map a(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("e4cf3863", new Object[]{aVar}) : aVar.c;
        }

        public static /* synthetic */ IAURAPluginCenter[] b(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (IAURAPluginCenter[]) ipChange.ipc$dispatch("2a985dfa", new Object[]{aVar}) : aVar.d;
        }

        public static /* synthetic */ IAURAInputField c(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (IAURAInputField) ipChange.ipc$dispatch("54418c4", new Object[]{aVar}) : aVar.e;
        }

        public static /* synthetic */ String d(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("43e1c6cf", new Object[]{aVar}) : aVar.b;
        }

        public static /* synthetic */ Collection e(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Collection) ipChange.ipc$dispatch("185b255", new Object[]{aVar}) : aVar.f;
        }

        public a a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("216c5eaa", new Object[]{this, str});
            }
            this.f2219a = str;
            return this;
        }

        public a a(Map<String, Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("e344449f", new Object[]{this, map});
            }
            this.c = map;
            return this;
        }

        public a a(IAURAPluginCenter[] iAURAPluginCenterArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("ed296b49", new Object[]{this, iAURAPluginCenterArr});
            }
            this.d = iAURAPluginCenterArr;
            return this;
        }

        public a b(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("4f44f909", new Object[]{this, str});
            }
            this.b = str;
            return this;
        }

        public a a(Collection<String> collection) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("269f6c23", new Object[]{this, collection});
            }
            this.f = collection;
            return this;
        }

        private void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            } else if (TextUtils.isEmpty(this.f2219a)) {
                throw new IllegalArgumentException("bizName not null");
            } else {
                if (TextUtils.isEmpty(this.b)) {
                    throw new IllegalArgumentException("configAssetFileName not null");
                }
            }
        }

        public w a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (w) ipChange.ipc$dispatch("3c3eacd1", new Object[]{this});
            }
            b();
            return new w(this);
        }
    }
}
