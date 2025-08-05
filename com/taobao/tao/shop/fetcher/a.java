package com.taobao.tao.shop.fetcher;

import android.content.Context;
import android.os.AsyncTask;
import android.os.Handler;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.shop.e;
import com.taobao.tao.shop.fetcher.adapter.TBSRDownloadAdapter;
import com.taobao.tao.shop.rule.mtop.MtopTaobaoWirelessShopRouteProcessResponseData;
import tb.kge;
import tb.ous;
import tb.out;
import tb.ouu;
import tb.oux;

/* loaded from: classes8.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final com.taobao.tao.shop.fetcher.adapter.a f21074a;
    private final com.taobao.tao.shop.fetcher.adapter.b b;
    private final TBSRDownloadAdapter c;
    private final Handler d = new Handler(e.b.getMainLooper());
    private Context e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.taobao.tao.shop.fetcher.a$a  reason: collision with other inner class name */
    /* loaded from: classes8.dex */
    public interface InterfaceC0879a<DATA> {
        void a(DATA data);
    }

    static {
        kge.a(-1117552383);
    }

    public static /* synthetic */ com.taobao.tao.shop.fetcher.adapter.a a(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.tao.shop.fetcher.adapter.a) ipChange.ipc$dispatch("b3ef258a", new Object[]{aVar}) : aVar.f21074a;
    }

    public static /* synthetic */ void a(a aVar, InterfaceC0879a interfaceC0879a, MtopTaobaoWirelessShopRouteProcessResponseData mtopTaobaoWirelessShopRouteProcessResponseData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67f83ed2", new Object[]{aVar, interfaceC0879a, mtopTaobaoWirelessShopRouteProcessResponseData});
        } else {
            aVar.a(interfaceC0879a, mtopTaobaoWirelessShopRouteProcessResponseData);
        }
    }

    public static /* synthetic */ com.taobao.tao.shop.fetcher.adapter.b b(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.tao.shop.fetcher.adapter.b) ipChange.ipc$dispatch("ce601ec8", new Object[]{aVar}) : aVar.b;
    }

    public static /* synthetic */ TBSRDownloadAdapter c(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TBSRDownloadAdapter) ipChange.ipc$dispatch("7a901b2f", new Object[]{aVar}) : aVar.c;
    }

    public a(Context context, com.taobao.tao.shop.fetcher.adapter.a aVar, com.taobao.tao.shop.fetcher.adapter.b bVar, TBSRDownloadAdapter tBSRDownloadAdapter) {
        this.e = context;
        this.f21074a = aVar;
        this.b = bVar;
        this.c = tBSRDownloadAdapter;
    }

    public MtopTaobaoWirelessShopRouteProcessResponseData a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopTaobaoWirelessShopRouteProcessResponseData) ipChange.ipc$dispatch("3c603a4b", new Object[]{this, str});
        }
        if (this.b.c()) {
            return this.f21074a.a(str, this.b.f());
        }
        return null;
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            out.b(new Runnable() { // from class: com.taobao.tao.shop.fetcher.a.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        a.a(a.this).b();
                    }
                }
            }, "loadMemoryCacheData");
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else {
            AsyncTask.execute(new Runnable() { // from class: com.taobao.tao.shop.fetcher.a.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    String d = a.b(a.this).d();
                    String e = a.b(a.this).e();
                    if (oux.a(e) || oux.a(d)) {
                        ouu.b("[cache not update] : remote cdnUrl or remoteMd5 is empty");
                    } else if (d.equals(a.a(a.this).a())) {
                        ouu.a("[cache not update] : localMd5 equal to remoteMd5  , cache is up to date");
                    } else {
                        TBSRCacheData tBSRCacheData = (TBSRCacheData) a.c(a.this).a(e, d, TBSRCacheData.class);
                        if (tBSRCacheData != null) {
                            if (a.a(a.this).a(tBSRCacheData, d)) {
                                return;
                            }
                            ouu.b("[cache not update] :  update cache failure ");
                            return;
                        }
                        ouu.a(new IllegalStateException("cache download error,  cdnUrl=" + e + "  md5=" + d), "[cache not update] : download new data error");
                    }
                }
            });
        }
    }

    public void a(String str, String str2, MtopTaobaoWirelessShopRouteProcessResponseData mtopTaobaoWirelessShopRouteProcessResponseData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b480a23", new Object[]{this, str, str2, mtopTaobaoWirelessShopRouteProcessResponseData});
        } else if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
        } else {
            long f = this.b.f();
            if (mtopTaobaoWirelessShopRouteProcessResponseData.isMiniAppRenderStyle()) {
                f = this.b.j();
            }
            long j = f;
            if (this.b.b()) {
                ous.a(this.e).a(str, str2, mtopTaobaoWirelessShopRouteProcessResponseData, j);
            }
            if (!this.b.c()) {
                return;
            }
            ous.a(this.e).a(str, str2, mtopTaobaoWirelessShopRouteProcessResponseData);
        }
    }

    public void a(final String str, final String str2, final InterfaceC0879a<MtopTaobaoWirelessShopRouteProcessResponseData> interfaceC0879a) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2daf4d08", new Object[]{this, str, str2, interfaceC0879a});
        } else {
            out.b(new Runnable() { // from class: com.taobao.tao.shop.fetcher.a.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    boolean z;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (!a.b(a.this).b()) {
                        ouu.a("[cache consume] readCacheEnabled] : readCacheEnabled not open");
                        a.a(a.this, interfaceC0879a, (MtopTaobaoWirelessShopRouteProcessResponseData) null);
                    } else {
                        String a2 = a.a(a.this).a();
                        String d = a.b(a.this).d();
                        if (a2 == null || !a2.equals(d)) {
                            ouu.a("[cache consume] md5 not matched] : localMd5 is " + a2);
                            z = false;
                        } else {
                            z = true;
                        }
                        MtopTaobaoWirelessShopRouteProcessResponseData a3 = a.a(a.this).a(str, str2, z, a.b(a.this).f());
                        ouu.a("[cache consume] data] : data=" + a3);
                        a.a(a.this, interfaceC0879a, a3);
                    }
                }
            }, "consumeCache");
        }
    }

    private void a(final InterfaceC0879a<MtopTaobaoWirelessShopRouteProcessResponseData> interfaceC0879a, final MtopTaobaoWirelessShopRouteProcessResponseData mtopTaobaoWirelessShopRouteProcessResponseData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db7b4043", new Object[]{this, interfaceC0879a, mtopTaobaoWirelessShopRouteProcessResponseData});
        } else {
            this.d.post(new Runnable() { // from class: com.taobao.tao.shop.fetcher.a.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        interfaceC0879a.a(mtopTaobaoWirelessShopRouteProcessResponseData);
                    }
                }
            });
        }
    }
}
