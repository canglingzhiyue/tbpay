package com.taobao.android.themis.graphics.inspector;

import android.os.Looper;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.themis.graphics.IRiverBackend;
import com.taobao.android.themis.graphics.inspector.InspectorRepository;
import java.lang.ref.WeakReference;

/* loaded from: classes6.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final InspectorRepository f15565a = InspectorRepository.a(InspectorRepository.HOST.DAILY, InspectorRepository.JSType.BINARY);
    private final WeakReference<IRiverBackend> b;

    /* renamed from: com.taobao.android.themis.graphics.inspector.a$a  reason: collision with other inner class name */
    /* loaded from: classes6.dex */
    public interface InterfaceC0601a {
        void a();
    }

    public static /* synthetic */ WeakReference a(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (WeakReference) ipChange.ipc$dispatch("5bbd4ca", new Object[]{aVar}) : aVar.b;
    }

    public a(WeakReference<IRiverBackend> weakReference) {
        this.b = weakReference;
    }

    public void a(final InterfaceC0601a interfaceC0601a) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("597d631f", new Object[]{this, interfaceC0601a});
        } else if (this.b != null) {
            this.f15565a.a(new InspectorRepository.c() { // from class: com.taobao.android.themis.graphics.inspector.a.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.themis.graphics.inspector.InspectorRepository.c
                public void a(InspectorRepository.d dVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("ff080fdc", new Object[]{this, dVar});
                    } else if (Looper.getMainLooper() != Looper.myLooper()) {
                        Log.e("themis:inspector", "failed to load resource: non ui thread");
                        InterfaceC0601a interfaceC0601a2 = interfaceC0601a;
                        if (interfaceC0601a2 == null) {
                            return;
                        }
                        interfaceC0601a2.a();
                    } else if (dVar == null || !dVar.a()) {
                        Log.e("themis:inspector", "failed to load resource: result invalid");
                        InterfaceC0601a interfaceC0601a3 = interfaceC0601a;
                        if (interfaceC0601a3 == null) {
                            return;
                        }
                        interfaceC0601a3.a();
                    } else {
                        IRiverBackend iRiverBackend = (IRiverBackend) a.a(a.this).get();
                        if (iRiverBackend == null) {
                            Log.e("themis:inspector", "failed to load resource: backend invalid");
                            return;
                        }
                        if (dVar.c == InspectorRepository.JSType.JS) {
                            iRiverBackend.a(new String(dVar.f15564a), dVar.b);
                        } else {
                            iRiverBackend.a(dVar.f15564a, dVar.b);
                        }
                        InterfaceC0601a interfaceC0601a4 = interfaceC0601a;
                        if (interfaceC0601a4 == null) {
                            return;
                        }
                        interfaceC0601a4.a();
                    }
                }
            });
        } else {
            interfaceC0601a.a();
        }
    }
}
