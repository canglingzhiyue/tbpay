package com.alibaba.triver.triver_shop.extension.accs;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.ACCSClient;
import com.taobao.accs.ACCSManager;
import com.taobao.accs.base.AccsAbstractDataListener;
import com.taobao.accs.base.TaoBaseService;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Result;
import kotlin.i;
import kotlin.jvm.internal.q;
import kotlin.t;
import kotlin.text.d;
import tb.ceg;
import tb.kge;

/* loaded from: classes3.dex */
public final class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a INSTANCE;

    /* renamed from: a  reason: collision with root package name */
    private static final CopyOnWriteArrayList<InterfaceC0131a> f3764a;

    /* renamed from: com.alibaba.triver.triver_shop.extension.accs.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public interface InterfaceC0131a {
        void a(String str);
    }

    private a() {
    }

    public static final /* synthetic */ CopyOnWriteArrayList a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (CopyOnWriteArrayList) ipChange.ipc$dispatch("7d480d95", new Object[0]) : f3764a;
    }

    static {
        kge.a(1645360664);
        INSTANCE = new a();
        f3764a = new CopyOnWriteArrayList<>();
        ACCSClient.getAccsClient().registerDataListener("shop_taobao_accs", new AccsAbstractDataListener() { // from class: com.alibaba.triver.triver_shop.extension.accs.a.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.accs.base.AccsDataListener
            public void onResponse(String str, String str2, int i, byte[] bArr, TaoBaseService.ExtraInfo extraInfo) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("d5239c42", new Object[]{this, str, str2, new Integer(i), bArr, extraInfo});
                }
            }

            @Override // com.taobao.accs.base.AccsDataListener
            public void onData(String str, String str2, String str3, byte[] bArr, TaoBaseService.ExtraInfo extraInfo) {
                Object m2371constructorimpl;
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("694255fc", new Object[]{this, str, str2, str3, bArr, extraInfo});
                } else if (!q.a((Object) "shop_taobao_accs", (Object) str) || bArr == null) {
                } else {
                    ceg.Companion.a(q.a("ShopAccsClient onData : ", (Object) new String(bArr, d.UTF_8)));
                    Iterator it = a.a().iterator();
                    while (it.hasNext()) {
                        InterfaceC0131a interfaceC0131a = (InterfaceC0131a) it.next();
                        try {
                            Result.a aVar = Result.Companion;
                            interfaceC0131a.a(new String(bArr, d.UTF_8));
                            m2371constructorimpl = Result.m2371constructorimpl(t.INSTANCE);
                        } catch (Throwable th) {
                            Result.a aVar2 = Result.Companion;
                            m2371constructorimpl = Result.m2371constructorimpl(i.a(th));
                        }
                        Throwable m2374exceptionOrNullimpl = Result.m2374exceptionOrNullimpl(m2371constructorimpl);
                        if (m2374exceptionOrNullimpl != null) {
                            ceg.Companion.a("catching block has error", m2374exceptionOrNullimpl);
                        }
                    }
                }
            }

            @Override // com.taobao.accs.base.AccsDataListener
            public void onBind(String str, int i, TaoBaseService.ExtraInfo extraInfo) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("3fa398db", new Object[]{this, str, new Integer(i), extraInfo});
                } else {
                    ceg.Companion.a("ShopAccsClient onBind.");
                }
            }

            @Override // com.taobao.accs.base.AccsDataListener
            public void onUnbind(String str, int i, TaoBaseService.ExtraInfo extraInfo) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("7b4e074", new Object[]{this, str, new Integer(i), extraInfo});
                } else {
                    ceg.Companion.a("ShopAccsClient onUnbind.");
                }
            }

            @Override // com.taobao.accs.base.AccsDataListener
            public void onSendData(String str, String str2, int i, TaoBaseService.ExtraInfo extraInfo) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("f29e89fa", new Object[]{this, str, str2, new Integer(i), extraInfo});
                    return;
                }
                ceg.a aVar = ceg.Companion;
                aVar.a("ShopAccsClient onSendData. dataId:" + ((Object) str2) + ", errorCode:" + i);
            }
        });
    }

    public final void a(String userId, String data) {
        Object m2371constructorimpl;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, userId, data});
            return;
        }
        q.d(userId, "userId");
        q.d(data, "data");
        ceg.Companion.a(q.a("ShopAccsClient sendData : ", (Object) data));
        try {
            Result.a aVar = Result.Companion;
            ACCSClient accsClient = ACCSClient.getAccsClient();
            byte[] bytes = data.getBytes(d.UTF_8);
            q.b(bytes, "(this as java.lang.String).getBytes(charset)");
            accsClient.sendData(new ACCSManager.AccsRequest(userId, "shop_taobao_accs", bytes, null));
            m2371constructorimpl = Result.m2371constructorimpl(t.INSTANCE);
        } catch (Throwable th) {
            Result.a aVar2 = Result.Companion;
            m2371constructorimpl = Result.m2371constructorimpl(i.a(th));
        }
        Throwable m2374exceptionOrNullimpl = Result.m2374exceptionOrNullimpl(m2371constructorimpl);
        if (m2374exceptionOrNullimpl == null) {
            return;
        }
        ceg.Companion.a("catching block has error", m2374exceptionOrNullimpl);
    }

    public final void a(ShopAccsUpStreamData upStreamData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5fa86585", new Object[]{this, upStreamData});
            return;
        }
        q.d(upStreamData, "upStreamData");
        a(upStreamData.a(), upStreamData.toString());
    }

    public final void a(InterfaceC0131a listener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("13311160", new Object[]{this, listener});
            return;
        }
        q.d(listener, "listener");
        f3764a.add(listener);
    }

    public final void b(InterfaceC0131a listener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1467643f", new Object[]{this, listener});
            return;
        }
        q.d(listener, "listener");
        f3764a.remove(listener);
    }
}
