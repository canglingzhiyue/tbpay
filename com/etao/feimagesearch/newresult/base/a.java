package com.etao.feimagesearch.newresult.base;

import android.os.Bundle;
import android.view.KeyEvent;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import tb.cog;
import tb.kge;

/* loaded from: classes3.dex */
public abstract class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final C0234a Companion;

    /* renamed from: a  reason: collision with root package name */
    private cog f6814a;

    static {
        kge.a(1865676405);
        Companion = new C0234a(null);
    }

    public abstract void a();

    public abstract void a(Bundle bundle, boolean z);

    public abstract void a(Integer num);

    public abstract boolean a(int i, KeyEvent keyEvent);

    public abstract void b();

    public abstract void c();

    public abstract void d();

    public abstract void e();

    public abstract void f();

    public abstract String g();

    public abstract b h();

    public abstract void i();

    public boolean j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5eb3ff5", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public a(cog activityAdapter) {
        q.c(activityAdapter, "activityAdapter");
        this.f6814a = activityAdapter;
    }

    public final cog k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (cog) ipChange.ipc$dispatch("5bf3c8b9", new Object[]{this}) : this.f6814a;
    }

    /* renamed from: com.etao.feimagesearch.newresult.base.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C0234a {
        static {
            kge.a(-1722936451);
        }

        private C0234a() {
        }

        public /* synthetic */ C0234a(o oVar) {
            this();
        }
    }
}
