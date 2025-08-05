package com.taobao.taolive.movehighlight.bundle.timeshiftContent;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;
import com.taobao.taolive.movehighlight.bundle.timeshiftContent.b;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import com.taobao.taolive.sdk.adapter.network.NetResponse;
import com.taobao.taolive.sdk.business.d;
import tb.kge;

/* loaded from: classes8.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private com.taobao.taolive.movehighlight.bussiness.highlight.contentListModel.a f21457a;
    private com.taobao.alilive.aliliveframework.frame.a b;

    static {
        kge.a(-1982320505);
    }

    public a(com.taobao.alilive.aliliveframework.frame.a aVar) {
        this.b = aVar;
    }

    public void a(String str, String str2, int i, int i2, String str3, final b.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd3ba2b4", new Object[]{this, str, str2, new Integer(i), new Integer(i2), str3, aVar});
            return;
        }
        this.f21457a = new com.taobao.taolive.movehighlight.bussiness.highlight.contentListModel.a(new d() { // from class: com.taobao.taolive.movehighlight.bundle.timeshiftContent.a.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass1 anonymousClass1, String str4, Object... objArr) {
                if (str4.hashCode() == -83293931) {
                    super.onSuccess(((Number) objArr[0]).intValue(), (NetResponse) objArr[1], (NetBaseOutDo) objArr[2], objArr[3]);
                    return null;
                }
                throw new InstantReloadException(String.format("String switch could not find '%s'", str4));
            }

            @Override // com.taobao.taolive.sdk.business.d, com.taobao.taolive.sdk.adapter.network.d
            public void onSuccess(int i3, NetResponse netResponse, NetBaseOutDo netBaseOutDo, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("fb090915", new Object[]{this, new Integer(i3), netResponse, netBaseOutDo, obj});
                    return;
                }
                super.onSuccess(i3, netResponse, netBaseOutDo, obj);
                aVar.a(netResponse);
            }

            @Override // com.taobao.taolive.sdk.business.d, com.taobao.taolive.sdk.adapter.network.d
            public void onError(int i3, NetResponse netResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("6dfe77ca", new Object[]{this, new Integer(i3), netResponse, obj});
                } else {
                    onSystemError(i3, netResponse, obj);
                }
            }

            @Override // com.taobao.taolive.sdk.business.d, com.taobao.taolive.sdk.adapter.network.d
            public void onSystemError(int i3, NetResponse netResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("9bfdbcd9", new Object[]{this, new Integer(i3), netResponse, obj});
                    return;
                }
                String simpleName = b.class.getSimpleName();
                TLog.loge(simpleName, "TimeShiftContentModel.requestContentList error" + netResponse.getRetMsg());
                aVar.a();
            }
        });
        this.f21457a.a(this.b, str, str2, i, i2, str3);
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        com.taobao.taolive.movehighlight.bussiness.highlight.contentListModel.a aVar = this.f21457a;
        if (aVar == null) {
            return;
        }
        aVar.a();
        this.f21457a = null;
    }
}
