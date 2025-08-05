package com.taobao.taolive.taolivemorelive.morelive.ui;

import android.content.Context;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.live.home.business.BaseListRequest;
import tb.mei;
import tb.mej;

/* loaded from: classes8.dex */
public class a extends mej {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private InterfaceC0913a b;

    /* renamed from: com.taobao.taolive.taolivemorelive.morelive.ui.a$a  reason: collision with other inner class name */
    /* loaded from: classes8.dex */
    public interface InterfaceC0913a {
        void a(BaseListRequest baseListRequest);

        void b(BaseListRequest baseListRequest);
    }

    public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1509249649) {
            super.onLoadMore((BaseListRequest) objArr[0]);
            return null;
        } else if (hashCode != 861426897) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.onReload((BaseListRequest) objArr[0]);
            return null;
        }
    }

    public a(Context context, mei meiVar) {
        super(context, meiVar);
    }

    public void a(InterfaceC0913a interfaceC0913a) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19d4645a", new Object[]{this, interfaceC0913a});
        } else {
            this.b = interfaceC0913a;
        }
    }

    @Override // tb.mej, com.taobao.live.home.business.b
    public void onLoadMore(BaseListRequest baseListRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a60aad8f", new Object[]{this, baseListRequest});
            return;
        }
        super.onLoadMore(baseListRequest);
        InterfaceC0913a interfaceC0913a = this.b;
        if (interfaceC0913a == null) {
            return;
        }
        interfaceC0913a.a(baseListRequest);
    }

    @Override // tb.mej, com.taobao.live.home.business.b
    public void onReload(BaseListRequest baseListRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("335854d1", new Object[]{this, baseListRequest});
            return;
        }
        super.onReload(baseListRequest);
        InterfaceC0913a interfaceC0913a = this.b;
        if (interfaceC0913a == null) {
            return;
        }
        interfaceC0913a.b(baseListRequest);
    }
}
