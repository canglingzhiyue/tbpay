package com.taobao.android.remoteso.component;

import android.content.Context;
import android.support.v4.util.Pair;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes6.dex */
public class k {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final a f14803a;

    public k(a aVar) {
        this.f14803a = aVar;
    }

    public static a a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("c36adfdd", new Object[0]) : new a();
    }

    /* loaded from: classes6.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final List<Pair<String, List<String>>> f14804a = new ArrayList();
        public Context b;
        public boolean c;
        public boolean d;
        public e e;
        public b f;
        public g g;
        public d h;

        public k a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (k) ipChange.ipc$dispatch("62c470ba", new Object[]{this}) : new k(this);
        }

        public a a(String str, String... strArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("1694e4e2", new Object[]{this, str, strArr});
            }
            this.f14804a.add(Pair.create(str, Arrays.asList(strArr)));
            return this;
        }

        public a a(Context context) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("b95a61d5", new Object[]{this, context});
            }
            this.b = context;
            return this;
        }

        public a a(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("1c7541e1", new Object[]{this, new Boolean(z)});
            }
            this.c = z;
            return this;
        }

        public a a(g gVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("761123b3", new Object[]{this, gVar});
            }
            this.g = gVar;
            return this;
        }

        public a a(d dVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("49aa7ad6", new Object[]{this, dVar});
            }
            this.h = dVar;
            return this;
        }

        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            return "Builder{modules=" + this.f14804a + ", showUI=" + this.c + ", ignoreRemoErrorView=" + this.d + ", loadingViewCreator=" + this.e + '}';
        }
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "RemoRequest{builder=" + this.f14803a + '}';
    }
}
