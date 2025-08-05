package com.taobao.android.detail.wrapper.ext.request.client.search;

import android.app.Activity;
import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.request.MtopRequestListener;
import com.taobao.android.detail.wrapper.ext.request.client.search.SearchInfoApiRequestClient;
import mtopsdk.mtop.domain.MtopResponse;
import tb.ecn;
import tb.emu;
import tb.epo;
import tb.kge;

/* loaded from: classes5.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private Context d;
    private SearchInfoApiRequestClient e;
    private InterfaceC0447a f;
    private boolean g;
    private SearchInfoApiRequestClient.a i;
    private final String b = "SearchInfoController";
    private boolean h = false;

    /* renamed from: a  reason: collision with root package name */
    public MtopRequestListener f11366a = new MtopRequestListener<SearchInfoApiRequestClient.a>() { // from class: com.taobao.android.detail.wrapper.ext.request.client.search.a.2
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.taobao.android.detail.core.request.c
        public /* bridge */ /* synthetic */ void a(MtopResponse mtopResponse) {
        }

        @Override // com.taobao.android.detail.core.request.c
        public /* synthetic */ void b(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f056ab85", new Object[]{this, obj});
            } else {
                a((SearchInfoApiRequestClient.a) obj);
            }
        }

        public void a(SearchInfoApiRequestClient.a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3b50a4cc", new Object[]{this, aVar});
                return;
            }
            a.b(a.this, aVar);
            a.a(a.this, aVar);
        }
    };
    private String c = "asyncLoadSearchInfo_" + epo.g().e();

    /* renamed from: com.taobao.android.detail.wrapper.ext.request.client.search.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public interface InterfaceC0447a {
        void a(SearchInfoApiRequestClient.a aVar);
    }

    static {
        kge.a(1539465034);
    }

    public static /* synthetic */ SearchInfoApiRequestClient.a a(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SearchInfoApiRequestClient.a) ipChange.ipc$dispatch("13bff1aa", new Object[]{aVar}) : aVar.i;
    }

    public static /* synthetic */ void a(a aVar, SearchInfoApiRequestClient.a aVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10aa7f74", new Object[]{aVar, aVar2});
        } else {
            aVar.a(aVar2);
        }
    }

    public static /* synthetic */ SearchInfoApiRequestClient.a b(a aVar, SearchInfoApiRequestClient.a aVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SearchInfoApiRequestClient.a) ipChange.ipc$dispatch("cd181107", new Object[]{aVar, aVar2});
        }
        aVar.i = aVar2;
        return aVar2;
    }

    public a(Context context) {
        this.d = context;
        this.g = ecn.b(context, this.c);
        emu.a("com.taobao.android.detail.wrapper.ext.request.client.search.SearchInfoController");
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        this.e = new SearchInfoApiRequestClient(this.d);
        this.e.a(str, this.f11366a);
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (!this.g) {
        } else {
            if (this.i != null) {
                Context context = this.d;
                if (!(context instanceof Activity)) {
                    return;
                }
                ((Activity) context).runOnUiThread(new Runnable() { // from class: com.taobao.android.detail.wrapper.ext.request.client.search.a.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        a aVar = a.this;
                        a.a(aVar, a.a(aVar));
                    }
                });
            } else if (this.h) {
            } else {
                this.h = true;
                this.e.a();
            }
        }
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            ecn.a(this.d, this.c, z);
        }
    }

    private void a(SearchInfoApiRequestClient.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b50a4cc", new Object[]{this, aVar});
            return;
        }
        InterfaceC0447a interfaceC0447a = this.f;
        if (interfaceC0447a == null) {
            return;
        }
        interfaceC0447a.a(aVar);
    }

    public void a(InterfaceC0447a interfaceC0447a) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6be7d33", new Object[]{this, interfaceC0447a});
        } else {
            this.f = interfaceC0447a;
        }
    }
}
