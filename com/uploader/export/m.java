package com.uploader.export;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes.dex */
public abstract class m implements IUploaderEnvironment {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final int f24061a;

    @Override // com.uploader.export.IUploaderEnvironment
    @Deprecated
    public abstract int getEnvironment();

    public m(int i) {
        this.f24061a = i;
    }

    @Override // com.uploader.export.IUploaderEnvironment
    public final int getInstanceType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a67e1df", new Object[]{this})).intValue() : this.f24061a;
    }

    public b a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("3ffbd71f", new Object[]{this}) : UploaderGlobal.a(getEnvironment(), getInstanceType());
    }

    @Override // com.uploader.export.IUploaderEnvironment
    @Deprecated
    public final String getAppKey() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("49079005", new Object[]{this}) : a().b;
    }

    @Override // com.uploader.export.IUploaderEnvironment
    @Deprecated
    public final String getDomain() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6fba2f7f", new Object[]{this}) : a().c;
    }
}
