package com.taobao.tao.infoflow.multitab.viewprovider.viewpager;

import com.alibaba.fastjson.JSONObject;
import com.taobao.uikit.extend.component.refresh.TBRefreshHeader;
import java.util.List;
import tb.ksi;

/* loaded from: classes8.dex */
public interface a extends ksi {
    public static final String KEY = "IMultiSubTabContainerProtocol";

    /* renamed from: com.taobao.tao.infoflow.multitab.viewprovider.viewpager.a$a  reason: collision with other inner class name */
    /* loaded from: classes8.dex */
    public interface InterfaceC0865a {
        void a(int i);

        void a(int i, float f, int i2);

        void n_(int i);
    }

    /* loaded from: classes8.dex */
    public interface b {
        void a();

        void a(int i);

        void a(TBRefreshHeader.RefreshState refreshState, TBRefreshHeader.RefreshState refreshState2);
    }

    /* loaded from: classes8.dex */
    public interface c {
        void a(int i);
    }

    void a(int i);

    void a(int i, boolean z);

    void a(InterfaceC0865a interfaceC0865a);

    void a(b bVar);

    void a(c cVar);

    void a(boolean z);

    MultiTabViewPager b();

    void b(boolean z);

    List<JSONObject> c();

    void c(boolean z);
}
