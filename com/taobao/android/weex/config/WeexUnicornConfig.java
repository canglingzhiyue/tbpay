package com.taobao.android.weex.config;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.ui.i;
import java.util.HashMap;
import tb.kge;

/* loaded from: classes6.dex */
public class WeexUnicornConfig {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private i d;

    /* renamed from: a  reason: collision with root package name */
    private boolean f15858a = false;
    private RenderMode b = RenderMode.surface;
    private final HashMap<String, String> c = new HashMap<>();
    private boolean e = false;

    /* loaded from: classes6.dex */
    public enum RenderMode {
        surface,
        texture,
        image,
        offscreen
    }

    static {
        kge.a(792506919);
    }

    public boolean e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[]{this})).booleanValue() : this.e;
    }

    public void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
        } else {
            this.e = z;
        }
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.f15858a = z;
        }
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : this.f15858a;
    }

    public RenderMode b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RenderMode) ipChange.ipc$dispatch("5c2cc344", new Object[]{this}) : this.b;
    }

    public void a(RenderMode renderMode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f8b9203", new Object[]{this, renderMode});
        } else {
            this.b = renderMode;
        }
    }

    public HashMap<String, String> c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (HashMap) ipChange.ipc$dispatch("52df8a4d", new Object[]{this}) : this.c;
    }

    public i d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (i) ipChange.ipc$dispatch("41a6c10", new Object[]{this}) : this.d;
    }

    public void a(i iVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ecc246d", new Object[]{this, iVar});
        } else {
            this.d = iVar;
        }
    }
}
