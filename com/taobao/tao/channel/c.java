package com.taobao.tao.channel;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.share.core.share.mtop.a;
import com.taobao.share.globalmodel.TBShareContent;
import com.taobao.tao.channel.b;
import com.ut.share.business.ShareBusiness;
import tb.kge;
import tb.nyl;
import tb.nyy;

/* loaded from: classes8.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private a f19860a;
    private boolean b;
    private boolean c;
    private TBShareContent d;
    private com.taobao.tao.channel.a e;
    private b.a f;
    private boolean g;
    private boolean h;
    private String i;
    private final boolean j;

    /* loaded from: classes8.dex */
    public interface a {
        void a(TBShareContent tBShareContent, com.taobao.tao.channel.a aVar, b.a aVar2);

        void a(TBShareContent tBShareContent, com.taobao.tao.channel.a aVar, b.a aVar2, boolean z, boolean z2, String str);
    }

    /* loaded from: classes8.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static c f19863a;

        static {
            kge.a(-1030587284);
            f19863a = new c();
        }

        public static /* synthetic */ c a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("6b48eba6", new Object[0]) : f19863a;
        }
    }

    static {
        kge.a(-480303719);
    }

    public static /* synthetic */ void a(c cVar, b.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7634b5c", new Object[]{cVar, aVar});
        } else {
            cVar.a(aVar);
        }
    }

    public static /* synthetic */ boolean a(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("27907224", new Object[]{cVar})).booleanValue() : cVar.b;
    }

    public static /* synthetic */ boolean a(c cVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ca7e84b8", new Object[]{cVar, new Boolean(z)})).booleanValue();
        }
        cVar.c = z;
        return z;
    }

    private c() {
        this.j = nyl.j();
    }

    public static c a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("6b48eba6", new Object[0]) : b.a();
    }

    public void a(TBShareContent tBShareContent, final com.taobao.tao.channel.a aVar, final b.a aVar2, final boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9138dbb9", new Object[]{this, tBShareContent, aVar, aVar2, new Boolean(z)});
        } else if (tBShareContent == null) {
        } else {
            if (nyl.h()) {
                if (nyl.i()) {
                    nyy.b("GetChannelProcessor", "isGetBizConfigBeforeActivity: true");
                    ShareBusiness.sShareUTArgs.put(ShareBusiness.IS_GET_BIZ_CONFIG_BEFORE_ACTIVITY, (Object) true);
                    final String str = tBShareContent.businessId;
                    final String str2 = tBShareContent.url;
                    new com.taobao.share.core.share.mtop.a().a(new a.InterfaceC0805a() { // from class: com.taobao.tao.channel.c.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // com.taobao.share.core.share.mtop.a.InterfaceC0805a
                        public void a(TBShareContent tBShareContent2) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("ea4f7f05", new Object[]{this, tBShareContent2});
                            } else if (!StringUtils.equals(tBShareContent2.businessId, str) || !StringUtils.equals(tBShareContent2.url, str2)) {
                                com.taobao.tao.channel.b.a().a(tBShareContent2, aVar, aVar2, z, true);
                            } else {
                                c.a(c.this, false);
                                if (!c.a(c.this)) {
                                    return;
                                }
                                c.a(c.this, aVar2);
                            }
                        }
                    }, tBShareContent);
                    com.taobao.tao.channel.b.a().a(tBShareContent, aVar, aVar2, z, false);
                    return;
                }
                nyy.b("GetChannelProcessor", "isGetBizConfigBeforeActivity: false");
                ShareBusiness.sShareUTArgs.put(ShareBusiness.IS_GET_BIZ_CONFIG_BEFORE_ACTIVITY, (Object) false);
                new com.taobao.share.core.share.mtop.a().a(new a.InterfaceC0805a() { // from class: com.taobao.tao.channel.c.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.share.core.share.mtop.a.InterfaceC0805a
                    public void a(TBShareContent tBShareContent2) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("ea4f7f05", new Object[]{this, tBShareContent2});
                        } else {
                            com.taobao.tao.channel.b.a().a(tBShareContent2, aVar, aVar2, z, false);
                        }
                    }
                }, tBShareContent);
                return;
            }
            nyy.b("GetChannelProcessor", "isGetBizConfigBeforeActivity: false");
            ShareBusiness.sShareUTArgs.put(ShareBusiness.IS_GET_BIZ_CONFIG_BEFORE_ACTIVITY, (Object) false);
            com.taobao.tao.channel.b.a().a(tBShareContent, aVar, aVar2, z, false);
        }
    }

    public void a(TBShareContent tBShareContent, com.taobao.tao.channel.a aVar, b.a aVar2, boolean z, boolean z2, boolean z3, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb0a983", new Object[]{this, tBShareContent, aVar, aVar2, new Boolean(z), new Boolean(z2), new Boolean(z3), str});
        } else if (tBShareContent == null) {
        } else {
            this.b = true;
            a(tBShareContent, aVar, aVar2, z, z3, str);
            if (nyl.h() && nyl.i()) {
                if (!z2 && this.c) {
                    return;
                }
                a(aVar2);
                return;
            }
            a(aVar2);
        }
    }

    private void a(b.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("825c89a4", new Object[]{this, aVar});
            return;
        }
        if (!this.j) {
            aVar = this.f;
        }
        b.a aVar2 = aVar;
        if (StringUtils.isEmpty(this.i)) {
            this.f19860a.a(this.d, this.e, aVar2);
        } else {
            this.f19860a.a(this.d, this.e, aVar2, this.g, this.h, this.i);
        }
    }

    private void a(TBShareContent tBShareContent, com.taobao.tao.channel.a aVar, b.a aVar2, boolean z, boolean z2, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5f57f45", new Object[]{this, tBShareContent, aVar, aVar2, new Boolean(z), new Boolean(z2), str});
            return;
        }
        this.d = tBShareContent;
        this.e = aVar;
        if (!this.j) {
            this.f = aVar2;
        }
        this.g = z;
        this.h = z2;
        this.i = str;
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        this.b = false;
        this.c = true;
    }

    public void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84116243", new Object[]{this, aVar});
        } else if (this.f19860a != null) {
        } else {
            this.f19860a = aVar;
        }
    }
}
