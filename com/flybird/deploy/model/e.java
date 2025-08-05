package com.flybird.deploy.model;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.flybird.deploy.model.FBUpdatePolicy;
import tb.cun;

/* loaded from: classes4.dex */
public class e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public Context f7226a;
    public String b;
    public com.flybird.deploy.callback.e c;
    public com.flybird.deploy.callback.d d;
    @Deprecated
    public com.flybird.deploy.callback.c e;
    @Deprecated
    public com.flybird.deploy.callback.b f;
    public FBUpdatePolicy.DeploymentType g;

    /* loaded from: classes4.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final e f7227a = new e();

        public a a(Context context) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("a6b666a0", new Object[]{this, context});
            }
            this.f7227a.f7226a = context.getApplicationContext();
            return this;
        }

        @Deprecated
        public a a(com.flybird.deploy.callback.b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("a534c596", new Object[]{this, bVar});
            }
            this.f7227a.f = bVar;
            return this;
        }

        @Deprecated
        public a a(com.flybird.deploy.callback.c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("230c8197", new Object[]{this, cVar});
            }
            this.f7227a.e = cVar;
            return this;
        }

        public a a(com.flybird.deploy.callback.d dVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("a0e43d98", new Object[]{this, dVar});
            }
            this.f7227a.d = dVar;
            return this;
        }

        public a a(com.flybird.deploy.callback.e eVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("1ebbf999", new Object[]{this, eVar});
            }
            this.f7227a.c = eVar;
            return this;
        }

        public a a(FBUpdatePolicy.DeploymentType deploymentType) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("e1dfa218", new Object[]{this, deploymentType});
            }
            this.f7227a.g = deploymentType;
            return this;
        }

        public a a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("faafa80e", new Object[]{this, str});
            }
            this.f7227a.b = str;
            return this;
        }

        public e a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (e) ipChange.ipc$dispatch("bfccff35", new Object[]{this});
            }
            cun.a(this.f7227a.f7226a, "missing appCtx");
            cun.a((Object) this.f7227a.b, "missing bundlePath");
            e eVar = this.f7227a;
            if (eVar.c == null) {
                eVar.c = com.flybird.deploy.callback.e.alwaysFalse;
            }
            cun.a(eVar.g, "missing deployment type");
            return this.f7227a;
        }
    }

    public Context a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("75941360", new Object[]{this}) : this.f7226a;
    }

    public String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : this.b;
    }

    public com.flybird.deploy.callback.e c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.flybird.deploy.callback.e) ipChange.ipc$dispatch("6f0f1d49", new Object[]{this}) : this.c;
    }

    public com.flybird.deploy.callback.d d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.flybird.deploy.callback.d) ipChange.ipc$dispatch("d5e7dceb", new Object[]{this}) : this.d;
    }

    @Deprecated
    public com.flybird.deploy.callback.c e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.flybird.deploy.callback.c) ipChange.ipc$dispatch("3cc09c8d", new Object[]{this}) : this.e;
    }

    @Deprecated
    public com.flybird.deploy.callback.b f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.flybird.deploy.callback.b) ipChange.ipc$dispatch("a3995c2f", new Object[]{this}) : this.f;
    }

    public FBUpdatePolicy.DeploymentType g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FBUpdatePolicy.DeploymentType) ipChange.ipc$dispatch("a2c2e268", new Object[]{this}) : this.g;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "FBTemplateDeciderCreateOptions{applicationContext=" + this.f7226a + ", bundlePath='" + this.b + "', shouldRetryHandler=" + this.c + ", statusListener=" + this.d + ", errorLogListener=" + this.e + '}';
    }

    private e() {
    }
}
