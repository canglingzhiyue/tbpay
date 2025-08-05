package com.taobao.alimama.click.extend;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import tb.kge;

/* loaded from: classes4.dex */
public class ExtendClickLink {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f8418a;
    private String b;
    private String c;
    private CustomClickType d;

    /* loaded from: classes4.dex */
    public enum CustomClickType {
        CPM,
        CPC,
        NONE
    }

    static {
        kge.a(433925206);
    }

    public ExtendClickLink(a aVar) {
        if (aVar != null) {
            this.b = a.a(aVar);
            this.c = a.b(aVar);
            this.d = a.c(aVar);
        }
    }

    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : this.b;
    }

    public String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : this.c;
    }

    public CustomClickType c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (CustomClickType) ipChange.ipc$dispatch("3249c7f8", new Object[]{this}) : this.d;
    }

    /* loaded from: classes4.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private String f8419a;
        private String b;
        private CustomClickType c;

        static {
            kge.a(-1223785727);
        }

        public static /* synthetic */ String a(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("a5129fba", new Object[]{aVar}) : aVar.f8419a;
        }

        public static /* synthetic */ String b(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6c1e86bb", new Object[]{aVar}) : aVar.b;
        }

        public static /* synthetic */ CustomClickType c(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (CustomClickType) ipChange.ipc$dispatch("1e8d97f2", new Object[]{aVar}) : aVar.c;
        }

        public a a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("29e2f130", new Object[]{this, str});
            }
            this.f8419a = str;
            return this;
        }

        public a b(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("f0eed831", new Object[]{this, str});
            }
            this.b = str;
            return this;
        }

        public a a(CustomClickType customClickType) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("2bc24974", new Object[]{this, customClickType});
            }
            this.c = customClickType;
            return this;
        }

        public ExtendClickLink a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (ExtendClickLink) ipChange.ipc$dispatch("b35703", new Object[]{this}) : new ExtendClickLink(this);
        }
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        try {
            this.f8418a = URLDecoder.decode(str, "utf-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }
}
