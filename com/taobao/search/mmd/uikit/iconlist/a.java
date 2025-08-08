package com.taobao.search.mmd.uikit.iconlist;

import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.phenix.animate.b;
import com.taobao.phenix.intf.PhenixCreator;
import com.taobao.phenix.intf.c;
import com.taobao.phenix.intf.event.FailPhenixEvent;
import com.taobao.phenix.intf.event.SuccPhenixEvent;
import tb.esr;
import tb.kge;

/* loaded from: classes7.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String b;
    public String c;
    public c d;
    private final Context j;
    private final InterfaceC0770a k;
    private final int l;
    private final int m;
    private final int n;
    private boolean o;

    /* renamed from: a  reason: collision with root package name */
    public int f19184a = 0;
    public int e = 0;
    public boolean f = true;
    public final com.taobao.phenix.intf.event.a<SuccPhenixEvent> g = new com.taobao.phenix.intf.event.a<SuccPhenixEvent>() { // from class: com.taobao.search.mmd.uikit.iconlist.a.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.taobao.phenix.intf.event.a
        public /* synthetic */ boolean onHappen(SuccPhenixEvent succPhenixEvent) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d1090e38", new Object[]{this, succPhenixEvent})).booleanValue() : a(succPhenixEvent);
        }

        public boolean a(SuccPhenixEvent succPhenixEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("3b4dd374", new Object[]{this, succPhenixEvent})).booleanValue();
            }
            String url = succPhenixEvent.getUrl();
            a aVar = a.this;
            aVar.e = 3;
            if (url != null && aVar.c != null && !url.startsWith(a.this.c)) {
                return true;
            }
            BitmapDrawable drawable = succPhenixEvent.getDrawable();
            if (drawable != null && (drawable.getBitmap() != null || (drawable instanceof b))) {
                boolean isIntermediate = succPhenixEvent.isIntermediate();
                a.a(a.this, drawable);
                if (!isIntermediate) {
                    succPhenixEvent.getTicket().a(true);
                    a.this.e = 2;
                }
            } else {
                a.a(a.this, null);
            }
            return true;
        }
    };
    public final com.taobao.phenix.intf.event.a<com.taobao.phenix.intf.event.c> h = new com.taobao.phenix.intf.event.a<com.taobao.phenix.intf.event.c>() { // from class: com.taobao.search.mmd.uikit.iconlist.a.2
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.taobao.phenix.intf.event.a
        public /* synthetic */ boolean onHappen(com.taobao.phenix.intf.event.c cVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d1090e38", new Object[]{this, cVar})).booleanValue() : a(cVar);
        }

        public boolean a(com.taobao.phenix.intf.event.c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("fa9f0059", new Object[]{this, cVar})).booleanValue();
            }
            a.a(a.this, null);
            return false;
        }
    };
    public final com.taobao.phenix.intf.event.a<FailPhenixEvent> i = new com.taobao.phenix.intf.event.a<FailPhenixEvent>() { // from class: com.taobao.search.mmd.uikit.iconlist.a.3
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.taobao.phenix.intf.event.a
        public /* synthetic */ boolean onHappen(FailPhenixEvent failPhenixEvent) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d1090e38", new Object[]{this, failPhenixEvent})).booleanValue() : a(failPhenixEvent);
        }

        public boolean a(FailPhenixEvent failPhenixEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("64c1ef50", new Object[]{this, failPhenixEvent})).booleanValue();
            }
            int resultCode = failPhenixEvent.getResultCode();
            if (resultCode == -1 || resultCode == 404) {
                a.this.f = true;
            } else {
                a.this.f = false;
            }
            failPhenixEvent.getTicket().a(true);
            a.a(a.this, null);
            a.this.e = 3;
            return true;
        }
    };

    /* renamed from: com.taobao.search.mmd.uikit.iconlist.a$a  reason: collision with other inner class name */
    /* loaded from: classes7.dex */
    public interface InterfaceC0770a {
        boolean isLayoutRequested();

        void onDrawableLoaded(BitmapDrawable bitmapDrawable, int i, String str);
    }

    static {
        kge.a(-1576977814);
    }

    public static /* synthetic */ void a(a aVar, BitmapDrawable bitmapDrawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1932c737", new Object[]{aVar, bitmapDrawable});
        } else {
            aVar.a(bitmapDrawable);
        }
    }

    public a(Context context, InterfaceC0770a interfaceC0770a, int i, int i2, int i3) {
        this.j = context;
        this.k = interfaceC0770a;
        this.l = i;
        this.m = i2;
        this.n = i3;
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.o = z;
        }
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            this.f19184a = 1;
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (this.f19184a != 1) {
        } else {
            this.f19184a = 0;
            if (this.e == 2) {
                return;
            }
            this.e = 0;
            d();
        }
    }

    private void a(BitmapDrawable bitmapDrawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d0084d5d", new Object[]{this, bitmapDrawable});
            return;
        }
        InterfaceC0770a interfaceC0770a = this.k;
        if (interfaceC0770a == null) {
            return;
        }
        interfaceC0770a.onDrawableLoaded(bitmapDrawable, this.n, this.b);
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else if (this.e == 2 || this.l <= 0 || this.m <= 0) {
        } else {
            if (StringUtils.isEmpty(this.b)) {
                com.taobao.phenix.intf.b.h().a(this.d);
                a((BitmapDrawable) null);
                return;
            }
            c cVar = this.d;
            if (cVar != null && !cVar.b(this.b)) {
                this.d.b();
            }
            if (this.f || this.f19184a == 1 || this.e != 0) {
                return;
            }
            this.e = 1;
            this.c = this.b;
            PhenixCreator failListener = com.taobao.phenix.intf.b.h().a(this.c).memOnly(false).addLoaderExtra(esr.BUNDLE_BIZ_CODE, "8920").succListener(this.g).limitSize(null, this.l, this.m).memCacheMissListener(this.h).failListener(this.i);
            if (this.o) {
                failListener.bitmapProcessors(new com.taobao.phenix.compat.effects.c());
            }
            this.d = failListener.fetch();
            this.d.a(this.b);
        }
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        if (!StringUtils.equals(this.b, str)) {
            this.f = false;
        }
        this.b = str;
        this.e = 0;
        InterfaceC0770a interfaceC0770a = this.k;
        if (interfaceC0770a == null || interfaceC0770a.isLayoutRequested()) {
            return;
        }
        d();
    }

    public void c() {
        c cVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else if (this.e == 2 || (cVar = this.d) == null) {
        } else {
            cVar.b();
        }
    }
}
