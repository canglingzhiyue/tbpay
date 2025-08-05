package com.alibaba.android.split.core.plugin;

import android.content.Context;
import android.content.res.Resources;
import com.alibaba.android.split.manager.IPluginContext;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import tb.bgy;
import tb.kge;

/* loaded from: classes2.dex */
public class e implements IPluginContext {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private String f2442a;
    private IPluginContext.Status b;
    private File c;
    private bgy d;
    private final String e;
    private Resources f;

    static {
        kge.a(-2055901478);
        kge.a(725541547);
    }

    @Override // com.alibaba.android.split.manager.IPluginContext
    public File a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (File) ipChange.ipc$dispatch("a060c1a5", new Object[]{this}) : this.c;
    }

    public e(String str, File file, bgy bgyVar) {
        this.b = IPluginContext.Status.VERIFIED;
        this.f2442a = str;
        this.c = file;
        this.d = bgyVar;
        this.b = this.d.h(this.f2442a) ? IPluginContext.Status.EMULATED : IPluginContext.Status.VERIFIED;
        this.e = bgyVar.b();
    }

    @Override // com.alibaba.android.split.manager.IPluginContext
    public String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : this.e;
    }

    @Override // com.alibaba.android.split.manager.IPluginContext
    public boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue() : this.b.ordinal() > IPluginContext.Status.VERIFIED.ordinal();
    }

    public boolean a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9e1d6464", new Object[]{this, context})).booleanValue();
        }
        try {
            this.f = h.a().a(context, this.c.getAbsolutePath());
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override // com.alibaba.android.split.manager.IPluginContext
    public void a(IPluginContext.Status status) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa0c394e", new Object[]{this, status});
            return;
        }
        if (status.ordinal() > IPluginContext.Status.VERIFIED.ordinal()) {
            this.d.g(this.f2442a);
        }
        this.b = status;
    }

    @Override // com.alibaba.android.split.manager.IPluginContext
    public boolean d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue() : this.b.ordinal() > IPluginContext.Status.EMULATED.ordinal();
    }
}
