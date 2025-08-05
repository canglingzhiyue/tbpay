package com.alibaba.wireless.security.framework;

import android.content.pm.PackageInfo;
import android.content.res.AssetManager;
import com.alibaba.wireless.security.framework.utils.FLOG;
import com.alibaba.wireless.security.open.initialize.ISecurityGuardPlugin;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes.dex */
public class c implements ISGPluginInfo {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private String f4275a;
    private String b;
    private ClassLoader c;
    private AssetManager d;
    private a e;
    private ISecurityGuardPlugin f;
    private ISGPluginManager g;

    static {
        kge.a(501567635);
        kge.a(1176299246);
    }

    public c(String str, ISGPluginManager iSGPluginManager, String str2, ClassLoader classLoader, a aVar, ISecurityGuardPlugin iSecurityGuardPlugin) {
        this.f4275a = str;
        this.g = iSGPluginManager;
        this.b = str2;
        this.c = classLoader;
        this.e = aVar;
        this.f = iSecurityGuardPlugin;
    }

    public String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{this, str});
        }
        a aVar = this.e;
        PackageInfo packageInfo = aVar.c;
        return packageInfo != null ? packageInfo.applicationInfo.metaData.getString(str) : aVar.a(str);
    }

    @Override // com.alibaba.wireless.security.framework.ISGPluginInfo
    public AssetManager getAssetManager() {
        AssetManager assetManager = this.d;
        if (assetManager != null) {
            return assetManager;
        }
        try {
            AssetManager assetManager2 = (AssetManager) AssetManager.class.newInstance();
            com.alibaba.wireless.security.framework.utils.c.a(assetManager2).a("addAssetPath", this.f4275a);
            this.d = assetManager2;
            return this.d;
        } catch (Exception e) {
            FLOG.w("", e);
            return null;
        }
    }

    @Override // com.alibaba.wireless.security.framework.ISGPluginInfo
    public ClassLoader getClassLoader() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ClassLoader) ipChange.ipc$dispatch("8d8cecd6", new Object[]{this}) : this.c;
    }

    @Override // com.alibaba.wireless.security.framework.ISGPluginInfo
    public PackageInfo getPackageInfo() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (PackageInfo) ipChange.ipc$dispatch("4454a4a8", new Object[]{this}) : this.e.c;
    }

    @Override // com.alibaba.wireless.security.framework.ISGPluginInfo
    public String getPluginName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("fd12a725", new Object[]{this}) : this.b;
    }

    @Override // com.alibaba.wireless.security.framework.ISGPluginInfo
    public String getPluginPath() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("a05fa1cb", new Object[]{this}) : this.f4275a;
    }

    @Override // com.alibaba.wireless.security.framework.ISGPluginInfo
    public ISecurityGuardPlugin getSGPluginEntry() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ISecurityGuardPlugin) ipChange.ipc$dispatch("491dc341", new Object[]{this}) : this.f;
    }

    @Override // com.alibaba.wireless.security.framework.ISGPluginInfo
    public ISGPluginManager getSGPluginManager() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ISGPluginManager) ipChange.ipc$dispatch("efc343a1", new Object[]{this}) : this.g;
    }

    @Override // com.alibaba.wireless.security.framework.ISGPluginInfo
    public String getVersion() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2a8fef97", new Object[]{this});
        }
        a aVar = this.e;
        PackageInfo packageInfo = aVar.c;
        return packageInfo != null ? packageInfo.versionName : aVar.a("version");
    }
}
