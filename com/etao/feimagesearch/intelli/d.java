package com.etao.feimagesearch.intelli;

import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes3.dex */
public class d implements com.etao.feimagesearch.structure.capture.g {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public boolean f6696a = false;
    public Long b = null;
    public boolean c = false;
    public boolean d = false;

    static {
        kge.a(-1934144223);
        kge.a(-1650842726);
    }

    @Override // com.etao.feimagesearch.structure.capture.g
    public void a(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c1152c8", new Object[]{this, new Integer(i), new Integer(i2)});
        }
    }

    @Override // com.etao.feimagesearch.structure.capture.g
    public void a(com.etao.feimagesearch.structure.capture.e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea9c6ec6", new Object[]{this, eVar});
        }
    }

    @Override // com.etao.feimagesearch.structure.capture.g
    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        }
    }

    @Override // com.etao.feimagesearch.structure.capture.g
    public void a(byte[] bArr, boolean z, int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8acc2fe", new Object[]{this, bArr, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3)});
        }
    }

    public void b(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90f78e09", new Object[]{this, new Integer(i), new Integer(i2)});
        }
    }

    @Override // com.etao.feimagesearch.structure.capture.g
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        }
    }

    @Override // com.etao.feimagesearch.structure.capture.g
    public FrameLayout d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("df23db0e", new Object[]{this});
        }
        return null;
    }

    @Override // com.etao.feimagesearch.structure.capture.g
    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
        }
    }

    @Override // com.etao.feimagesearch.structure.capture.g
    public ClientModelType f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ClientModelType) ipChange.ipc$dispatch("3c5a970b", new Object[]{this});
        }
        return null;
    }

    @Override // com.etao.feimagesearch.structure.capture.g
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            this.d = false;
        }
    }

    @Override // com.etao.feimagesearch.structure.capture.g
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else {
            this.d = true;
        }
    }
}
