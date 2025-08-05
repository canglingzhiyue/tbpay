package com.taobao.android.launch.turbo.profile;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import tb.kge;

/* loaded from: classes.dex */
public class TurboBoot {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int POLICY_COPY_COMPILE = 1;
    public static final int POLICY_COPY_ONLY = 0;

    /* renamed from: a  reason: collision with root package name */
    private final c f13008a;
    private final Context b;

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes5.dex */
    public @interface CompilePolicy {
    }

    static {
        kge.a(1848474800);
    }

    private TurboBoot(Context context, c cVar) {
        this.b = context;
        this.f13008a = cVar;
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            new b().a(this.b, this.f13008a);
        }
    }

    /* loaded from: classes.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public int f13009a = 0;
        public int b = 0;
        public boolean c;
        private final String d;
        private final int e;
        private final Context f;

        static {
            kge.a(312779655);
        }

        public a(Context context, String str, int i) {
            this.f = context;
            this.d = str;
            this.e = i;
        }

        public a a(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("bb2e357f", new Object[]{this, new Integer(i)});
            }
            this.f13009a = i;
            return this;
        }

        public a b(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("481b4c9e", new Object[]{this, new Integer(i)});
            }
            this.b = Math.max(i, 0);
            return this;
        }

        public a a(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("79c7ded0", new Object[]{this, new Boolean(z)});
            }
            this.c = z;
            return this;
        }

        public TurboBoot a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (TurboBoot) ipChange.ipc$dispatch("27907269", new Object[]{this}) : new TurboBoot(this.f, new c(this.d, this.e, this.f13009a, this.b, this.c));
        }
    }
}
