package com.taobao.monitor.procedure;

import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.monitor.procedure.IPage;
import java.util.Map;

/* loaded from: classes7.dex */
public class c implements IPage {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final C0726c f18221a = new C0726c();
    private static final a b = new a();
    private static final d c = new d();
    private static final b d = new b();

    /* loaded from: classes7.dex */
    public static class a implements IPage.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.taobao.monitor.procedure.IPage.b
        public void i(long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b5c85c54", new Object[]{this, new Long(j)});
            }
        }
    }

    /* loaded from: classes7.dex */
    public static class b implements IPage.c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.taobao.monitor.procedure.IPage.c
        public void a(String str, long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8123b0d2", new Object[]{this, str, new Long(j)});
            }
        }

        @Override // com.taobao.monitor.procedure.IPage.c
        public void a(String str, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8bb6538e", new Object[]{this, str, obj});
            }
        }

        @Override // com.taobao.monitor.procedure.IPage.c
        public void a(String str, Map<String, Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("20476513", new Object[]{this, str, map});
            }
        }

        @Override // com.taobao.monitor.procedure.IPage.c
        public void b(String str, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("18567e8f", new Object[]{this, str, obj});
            }
        }
    }

    /* renamed from: com.taobao.monitor.procedure.c$c  reason: collision with other inner class name */
    /* loaded from: classes7.dex */
    public static class C0726c implements IPage.d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.taobao.monitor.procedure.IPage.d
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            }
        }

        @Override // com.taobao.monitor.procedure.IPage.d
        public void a(String str, String str2, Map<String, Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("84162689", new Object[]{this, str, str2, map});
            }
        }

        @Override // com.taobao.monitor.procedure.IPage.d
        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            }
        }

        @Override // com.taobao.monitor.procedure.IPage.d
        public void d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            }
        }
    }

    /* loaded from: classes7.dex */
    public static class d implements IPage.e {
    }

    @Override // com.taobao.monitor.procedure.IPage
    public void a(View view, IPage.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9913208", new Object[]{this, view, aVar});
        }
    }

    @Override // com.taobao.monitor.procedure.IPage
    public String c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bd025a76", new Object[]{this}) : "non-PageSession";
    }

    @Override // com.taobao.monitor.procedure.IPage
    public String i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("e424ba30", new Object[]{this}) : "DefaultPage";
    }

    @Override // com.taobao.monitor.procedure.IPage
    public IPage.d d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IPage.d) ipChange.ipc$dispatch("8e1302c6", new Object[]{this}) : f18221a;
    }

    @Override // com.taobao.monitor.procedure.IPage
    public IPage.b e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IPage.b) ipChange.ipc$dispatch("957837a7", new Object[]{this}) : b;
    }

    @Override // com.taobao.monitor.procedure.IPage
    public IPage.c g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IPage.c) ipChange.ipc$dispatch("a442a204", new Object[]{this}) : d;
    }
}
