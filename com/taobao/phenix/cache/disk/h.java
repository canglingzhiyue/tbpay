package com.taobao.phenix.cache.disk;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;
import tb.njc;
import tb.njf;

/* loaded from: classes7.dex */
public class h implements b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final int f18872a;

    static {
        kge.a(-1585678032);
        kge.a(1186089228);
    }

    @Override // com.taobao.phenix.cache.disk.b
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        }
    }

    @Override // com.taobao.phenix.cache.disk.b
    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        }
    }

    @Override // com.taobao.phenix.cache.disk.b
    public boolean a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9e1d6464", new Object[]{this, context})).booleanValue();
        }
        return false;
    }

    @Override // com.taobao.phenix.cache.disk.b
    public boolean a(String str, int i, byte[] bArr, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("12cf7bfc", new Object[]{this, str, new Integer(i), bArr, new Integer(i2), new Integer(i3)})).booleanValue();
        }
        return false;
    }

    @Override // com.taobao.phenix.cache.disk.b
    public long b(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7d253be4", new Object[]{this, str, new Integer(i)})).longValue();
        }
        return -1L;
    }

    public njc c(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (njc) ipChange.ipc$dispatch("50212f90", new Object[]{this, str, new Integer(i)});
        }
        return null;
    }

    @Override // com.taobao.phenix.cache.disk.b
    public boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // com.taobao.phenix.cache.disk.b
    public /* synthetic */ njf a(String str, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (njf) ipChange.ipc$dispatch("264f9f6b", new Object[]{this, str, new Integer(i)}) : c(str, i);
    }

    public h(int i) {
        this.f18872a = i;
    }

    @Override // com.taobao.phenix.cache.disk.b
    public int b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("57a83dc", new Object[]{this})).intValue() : this.f18872a;
    }

    @Override // com.taobao.phenix.cache.disk.b
    public int[] a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (int[]) ipChange.ipc$dispatch("81233af2", new Object[]{this, str}) : new int[0];
    }
}
