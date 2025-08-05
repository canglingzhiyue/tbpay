package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import com.taobao.taolive.sdk.adapter.network.NetResponse;
import com.taobao.taolive.sdk.adapter.network.d;

/* loaded from: classes8.dex */
public class pbn {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private com.taobao.taolive.dinamicext.view.tbliveFllowContent.mtop.dxConfig.a f32554a;
    private com.taobao.taolive.dinamicext.view.tbliveFllowContent.mtop.homePageDetail.a b;

    /* loaded from: classes8.dex */
    public interface a {
        void a(int i, NetResponse netResponse, NetBaseOutDo netBaseOutDo, Object obj);

        void a(int i, NetResponse netResponse, Object obj);
    }

    static {
        kge.a(578862587);
    }

    public void a(final a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d405f5bf", new Object[]{this, aVar});
            return;
        }
        this.f32554a = new com.taobao.taolive.dinamicext.view.tbliveFllowContent.mtop.dxConfig.a(new d() { // from class: tb.pbn.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.taolive.sdk.adapter.network.d
            public void onSuccess(int i, NetResponse netResponse, NetBaseOutDo netBaseOutDo, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("fb090915", new Object[]{this, new Integer(i), netResponse, netBaseOutDo, obj});
                    return;
                }
                a aVar2 = aVar;
                if (aVar2 == null) {
                    return;
                }
                aVar2.a(i, netResponse, netBaseOutDo, obj);
            }

            @Override // com.taobao.taolive.sdk.adapter.network.d
            public void onError(int i, NetResponse netResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("6dfe77ca", new Object[]{this, new Integer(i), netResponse, obj});
                    return;
                }
                a aVar2 = aVar;
                if (aVar2 == null) {
                    return;
                }
                aVar2.a(i, netResponse, obj);
            }

            @Override // com.taobao.taolive.sdk.adapter.network.d
            public void onSystemError(int i, NetResponse netResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("9bfdbcd9", new Object[]{this, new Integer(i), netResponse, obj});
                    return;
                }
                a aVar2 = aVar;
                if (aVar2 == null) {
                    return;
                }
                aVar2.a(i, netResponse, obj);
            }
        });
        this.f32554a.b();
    }

    public void a(String str, final a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c32a2109", new Object[]{this, str, aVar});
            return;
        }
        this.b = new com.taobao.taolive.dinamicext.view.tbliveFllowContent.mtop.homePageDetail.a(new d() { // from class: tb.pbn.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.taolive.sdk.adapter.network.d
            public void onSuccess(int i, NetResponse netResponse, NetBaseOutDo netBaseOutDo, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("fb090915", new Object[]{this, new Integer(i), netResponse, netBaseOutDo, obj});
                    return;
                }
                a aVar2 = aVar;
                if (aVar2 == null) {
                    return;
                }
                aVar2.a(i, netResponse, netBaseOutDo, obj);
            }

            @Override // com.taobao.taolive.sdk.adapter.network.d
            public void onError(int i, NetResponse netResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("6dfe77ca", new Object[]{this, new Integer(i), netResponse, obj});
                    return;
                }
                a aVar2 = aVar;
                if (aVar2 == null) {
                    return;
                }
                aVar2.a(i, netResponse, obj);
            }

            @Override // com.taobao.taolive.sdk.adapter.network.d
            public void onSystemError(int i, NetResponse netResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("9bfdbcd9", new Object[]{this, new Integer(i), netResponse, obj});
                    return;
                }
                a aVar2 = aVar;
                if (aVar2 == null) {
                    return;
                }
                aVar2.a(i, netResponse, obj);
            }
        });
        this.b.a(str);
    }
}
