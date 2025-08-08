package com.alibaba.aliweex.bundle;

import mtopsdk.common.util.StringUtils;
import com.alibaba.aliweex.bundle.k;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes2.dex */
public class c implements k.c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final a f2010a = new a();

    static {
        kge.a(1722271996);
        kge.a(-1596367684);
    }

    @Override // com.alibaba.aliweex.bundle.k.c
    public void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
        } else if (StringUtils.isEmpty(str2)) {
        } else {
            b(str, str2);
        }
    }

    private void b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65d7b87d", new Object[]{this, str, str2});
            return;
        }
        this.f2010a.c();
        a aVar = this.f2010a;
        aVar.f2011a = str;
        aVar.c = str2;
    }

    @Override // com.alibaba.aliweex.bundle.k.c
    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : this.f2010a.a();
    }

    @Override // com.alibaba.aliweex.bundle.k.c
    public String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : this.f2010a.f2011a;
    }

    @Override // com.alibaba.aliweex.bundle.k.c
    public String c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bd025a76", new Object[]{this}) : this.f2010a.b();
    }

    @Override // com.alibaba.aliweex.bundle.k.c
    public String d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("43881515", new Object[]{this}) : this.f2010a.c;
    }

    /* loaded from: classes2.dex */
    public class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public String f2011a;
        public String b;
        public String c;
        public String d;
        public String e;

        static {
            kge.a(779502325);
        }

        private a() {
        }

        public String a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : StringUtils.isEmpty(this.b) ? this.f2011a : this.b;
        }

        public String b() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : StringUtils.isEmpty(this.d) ? this.c : this.d;
        }

        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5889b6a", new Object[]{this});
                return;
            }
            this.c = null;
            this.c = null;
            this.b = null;
            this.d = null;
            this.e = null;
        }
    }
}
