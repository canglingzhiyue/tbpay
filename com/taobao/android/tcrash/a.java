package com.taobao.android.tcrash;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tcrash.a;
import java.io.File;
import tb.jdo;
import tb.jdp;
import tb.jdt;
import tb.jdy;
import tb.jej;
import tb.jfj;
import tb.jfv;
import tb.jgd;
import tb.jgh;
import tb.jgl;

/* loaded from: classes6.dex */
public class a implements jej {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a */
    private final b f15506a;
    private final jdy b;
    private final jgh c;

    /* renamed from: com.taobao.android.tcrash.a$a */
    /* loaded from: classes6.dex */
    private interface InterfaceC0597a {
        void a();
    }

    /* loaded from: classes6.dex */
    public interface b {
        void intercept(File file, boolean z);
    }

    public static /* synthetic */ jdy a(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (jdy) ipChange.ipc$dispatch("fb23f3c6", new Object[]{aVar}) : aVar.b;
    }

    public static /* synthetic */ void a(a aVar, File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("971f58b8", new Object[]{aVar, file});
        } else {
            aVar.a(file);
        }
    }

    public static /* synthetic */ jgh b(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (jgh) ipChange.ipc$dispatch("87c427fb", new Object[]{aVar}) : aVar.c;
    }

    public a(jdy jdyVar, jgh jghVar, b bVar) {
        this.b = jdyVar;
        this.c = jghVar;
        this.f15506a = bVar;
    }

    @Override // tb.jej
    public void onCompleted(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d93484bd", new Object[]{this, str});
        } else if (StringUtils.isEmpty(str)) {
            jfj.b("AnrCompletedAction", "path is null");
        } else {
            File file = new File(str);
            b bVar = this.f15506a;
            if (bVar != null) {
                bVar.intercept(file, false);
            }
            (str.endsWith("traces.txt") ? new c(file) : new d(file)).a();
        }
    }

    private void a(File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a979fdf", new Object[]{this, file});
            return;
        }
        b bVar = this.f15506a;
        if (bVar == null) {
            return;
        }
        bVar.intercept(file, true);
    }

    /* loaded from: classes6.dex */
    public class c implements InterfaceC0597a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a */
        public final File f15507a;

        public c(File file) {
            a.this = r1;
            this.f15507a = file;
        }

        @Override // com.taobao.android.tcrash.a.InterfaceC0597a
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                return;
            }
            String a2 = jfv.a.a(a.a(a.this), "anr", "scan");
            File file = new File(new jgd(a.a(a.this).a(), a.a(a.this).c()).a(), a2);
            jgl.a(file, a(this.f15507a, a2));
            a.a(a.this, file);
        }

        private String a(File file, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("7e8673d7", new Object[]{this, file, str});
            }
            jdt jdtVar = new jdt();
            jdtVar.a(a.a(a.this), str, "anr").a("traces starts.\n").a(file).a("traces end.\n").d().e();
            return jdtVar.toString();
        }
    }

    /* loaded from: classes6.dex */
    public class d implements InterfaceC0597a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a */
        public final File f15508a;

        /* renamed from: lambda$GiYv5jJc8w-SeBMIkrDn9k8BhXg */
        public static /* synthetic */ void m1031lambda$GiYv5jJc8wSeBMIkrDn9k8BhXg(d dVar, boolean z) {
            dVar.a(z);
        }

        public d(File file) {
            a.this = r1;
            this.f15508a = file;
        }

        @Override // com.taobao.android.tcrash.a.InterfaceC0597a
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            } else {
                jdo.a(a.a(a.this), a.b(a.this)).a(new jdo.a() { // from class: com.taobao.android.tcrash.-$$Lambda$a$d$GiYv5jJc8w-SeBMIkrDn9k8BhXg
                    @Override // tb.jdo.a
                    public final void onAnrHappened(boolean z) {
                        a.d.m1031lambda$GiYv5jJc8wSeBMIkrDn9k8BhXg(a.d.this, z);
                    }
                });
            }
        }

        public /* synthetic */ void a(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
                return;
            }
            if (z) {
                jfj.a("AnrCompletedAction", "my process anr");
                a.a(a.this, this.f15508a);
            } else {
                jfj.a("AnrCompletedAction", "other process anr");
                jgl.c(this.f15508a);
            }
            jdp.a(a.a(a.this)).c();
        }
    }
}
