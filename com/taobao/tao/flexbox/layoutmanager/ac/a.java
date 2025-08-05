package com.taobao.tao.flexbox.layoutmanager.ac;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.i;
import java.io.UnsupportedEncodingException;
import tb.kge;

/* loaded from: classes8.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static a f19920a;

    /* renamed from: com.taobao.tao.flexbox.layoutmanager.ac.a$a  reason: collision with other inner class name */
    /* loaded from: classes8.dex */
    public interface InterfaceC0829a {
        void a();

        void a(String str);
    }

    /* loaded from: classes8.dex */
    public interface b {
        void a();

        void a(byte[] bArr);
    }

    static {
        kge.a(-662544204);
    }

    public static synchronized a a() {
        synchronized (a.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("33e34c3c", new Object[0]);
            }
            if (f19920a == null) {
                f19920a = new a();
            }
            return f19920a;
        }
    }

    public void a(String str, final InterfaceC0829a interfaceC0829a) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e332b915", new Object[]{this, str, interfaceC0829a});
            return;
        }
        final boolean[] zArr = {false};
        com.taobao.tao.flexbox.layoutmanager.adapter.a.a().p().a(str, new i.a() { // from class: com.taobao.tao.flexbox.layoutmanager.ac.a.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.i.a
            public void a(byte[] bArr) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c19672f", new Object[]{this, bArr});
                    return;
                }
                boolean[] zArr2 = zArr;
                if (zArr2[0]) {
                    return;
                }
                zArr2[0] = true;
                if (interfaceC0829a == null) {
                    return;
                }
                String str2 = null;
                if (bArr != null) {
                    try {
                        str2 = new String(bArr, 0, bArr.length, "utf-8");
                    } catch (UnsupportedEncodingException e) {
                        e.printStackTrace();
                    }
                }
                interfaceC0829a.a(str2);
            }

            @Override // com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.i.a
            public void a(String str2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("f3a64c32", new Object[]{this, str2});
                    return;
                }
                boolean[] zArr2 = zArr;
                if (zArr2[0]) {
                    return;
                }
                zArr2[0] = true;
                InterfaceC0829a interfaceC0829a2 = interfaceC0829a;
                if (interfaceC0829a2 == null) {
                    return;
                }
                interfaceC0829a2.a();
            }
        });
    }

    public void a(String str, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3332d74", new Object[]{this, str, bVar});
        } else {
            a(str, true, bVar);
        }
    }

    public void a(String str, boolean z, final b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d78aeac4", new Object[]{this, str, new Boolean(z), bVar});
            return;
        }
        final boolean[] zArr = {false};
        com.taobao.tao.flexbox.layoutmanager.adapter.a.a().p().a(str, z, new i.a() { // from class: com.taobao.tao.flexbox.layoutmanager.ac.a.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.i.a
            public void a(byte[] bArr) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c19672f", new Object[]{this, bArr});
                    return;
                }
                boolean[] zArr2 = zArr;
                if (zArr2[0]) {
                    return;
                }
                zArr2[0] = true;
                b bVar2 = bVar;
                if (bVar2 == null) {
                    return;
                }
                bVar2.a(bArr);
            }

            @Override // com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.i.a
            public void a(String str2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("f3a64c32", new Object[]{this, str2});
                    return;
                }
                boolean[] zArr2 = zArr;
                if (zArr2[0]) {
                    return;
                }
                zArr2[0] = true;
                b bVar2 = bVar;
                if (bVar2 == null) {
                    return;
                }
                bVar2.a();
            }
        });
    }
}
