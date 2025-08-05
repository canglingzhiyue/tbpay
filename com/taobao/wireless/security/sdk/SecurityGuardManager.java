package com.taobao.wireless.security.sdk;

import android.content.Context;
import com.alibaba.wireless.security.open.SecException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.wireless.security.sdk.atlasencrypt.IAtlasEncryptComponent;
import com.taobao.wireless.security.sdk.datacollection.IDataCollectionComponent;
import com.taobao.wireless.security.sdk.dynamicdataencrypt.IDynamicDataEncryptComponent;
import com.taobao.wireless.security.sdk.dynamicdatastore.IDynamicDataStoreComponent;
import com.taobao.wireless.security.sdk.indiekit.IIndieKitComponent;
import com.taobao.wireless.security.sdk.initialize.IInitializeComponent;
import com.taobao.wireless.security.sdk.initialize.a;
import com.taobao.wireless.security.sdk.nocaptcha.INoCaptchaComponent;
import com.taobao.wireless.security.sdk.pkgvaliditycheck.IPkgValidityCheckComponent;
import com.taobao.wireless.security.sdk.rootdetect.IRootDetectComponent;
import com.taobao.wireless.security.sdk.safetoken.ISafeTokenComponent;
import com.taobao.wireless.security.sdk.securesignature.ISecureSignatureComponent;
import com.taobao.wireless.security.sdk.securityDNS.ISecurityDNSComponent;
import com.taobao.wireless.security.sdk.securitybody.ISecurityBodyComponent;
import com.taobao.wireless.security.sdk.simulatordetect.ISimulatorDetectComponent;
import com.taobao.wireless.security.sdk.staticdataencrypt.IStaticDataEncryptComponent;
import com.taobao.wireless.security.sdk.staticdatastore.IStaticDataStoreComponent;
import java.lang.reflect.GenericDeclaration;
import tb.kge;

/* loaded from: classes.dex */
public class SecurityGuardManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static volatile SecurityGuardManager b;
    private static volatile IInitializeComponent c;
    private static final Object d;

    /* renamed from: a  reason: collision with root package name */
    private com.alibaba.wireless.security.open.SecurityGuardManager f23628a;

    static {
        kge.a(925289390);
        d = new Object();
    }

    private SecurityGuardManager(Context context) {
        try {
            this.f23628a = com.alibaba.wireless.security.open.SecurityGuardManager.getInstance(context);
        } catch (SecException e) {
            e.printStackTrace();
        }
    }

    private <T> T a(Class<T> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("bd4d3fd", new Object[]{this, cls});
        }
        try {
            if (this.f23628a == null) {
                return null;
            }
            return (T) this.f23628a.getInterface(cls);
        } catch (SecException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static IInitializeComponent getInitializer() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IInitializeComponent) ipChange.ipc$dispatch("de4e8e15", new Object[0]);
        }
        if (c == null) {
            synchronized (d) {
                if (c == null) {
                    c = new a();
                }
            }
        }
        return c;
    }

    public static SecurityGuardManager getInstance(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SecurityGuardManager) ipChange.ipc$dispatch("f061ec39", new Object[]{context});
        }
        if (b == null) {
            synchronized (SecurityGuardManager.class) {
                if (context == null) {
                    return null;
                }
                if (b == null && getInitializer().initialize(context) == 0) {
                    b = new SecurityGuardManager(context);
                }
            }
        }
        return b;
    }

    public IAtlasEncryptComponent getAtlasEncryptComp() {
        IpChange ipChange = $ipChange;
        return (IAtlasEncryptComponent) (ipChange instanceof IpChange ? ipChange.ipc$dispatch("b40dfc56", new Object[]{this}) : getComponent(15));
    }

    public IComponent getComponent(int i) {
        GenericDeclaration genericDeclaration;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IComponent) ipChange.ipc$dispatch("7dc3774c", new Object[]{this, new Integer(i)});
        }
        switch (i) {
            case 1:
                genericDeclaration = ISecureSignatureComponent.class;
                break;
            case 2:
                genericDeclaration = IDynamicDataStoreComponent.class;
                break;
            case 3:
                genericDeclaration = IIndieKitComponent.class;
                break;
            case 4:
                genericDeclaration = IStaticDataStoreComponent.class;
                break;
            case 5:
                genericDeclaration = IRootDetectComponent.class;
                break;
            case 6:
                genericDeclaration = IDataCollectionComponent.class;
                break;
            case 7:
                genericDeclaration = IStaticDataEncryptComponent.class;
                break;
            case 8:
                genericDeclaration = ISecurityBodyComponent.class;
                break;
            case 9:
                genericDeclaration = IDynamicDataEncryptComponent.class;
                break;
            case 10:
                genericDeclaration = ISimulatorDetectComponent.class;
                break;
            case 11:
                genericDeclaration = ISecurityDNSComponent.class;
                break;
            case 12:
                genericDeclaration = IPkgValidityCheckComponent.class;
                break;
            case 13:
            default:
                return null;
            case 14:
                genericDeclaration = INoCaptchaComponent.class;
                break;
            case 15:
                genericDeclaration = IAtlasEncryptComponent.class;
                break;
            case 16:
                genericDeclaration = ISafeTokenComponent.class;
                break;
        }
        return (IComponent) a(genericDeclaration);
    }

    public IDataCollectionComponent getDataCollectionComp() {
        IpChange ipChange = $ipChange;
        return (IDataCollectionComponent) (ipChange instanceof IpChange ? ipChange.ipc$dispatch("c8c03ce4", new Object[]{this}) : getComponent(6));
    }

    public IDynamicDataEncryptComponent getDynamicDataEncryptComp() {
        IpChange ipChange = $ipChange;
        return (IDynamicDataEncryptComponent) (ipChange instanceof IpChange ? ipChange.ipc$dispatch("5240a178", new Object[]{this}) : getComponent(9));
    }

    public IDynamicDataStoreComponent getDynamicDataStoreComp() {
        IpChange ipChange = $ipChange;
        return (IDynamicDataStoreComponent) (ipChange instanceof IpChange ? ipChange.ipc$dispatch("ce040e34", new Object[]{this}) : getComponent(2));
    }

    public IIndieKitComponent getIndieKitComp() {
        IpChange ipChange = $ipChange;
        return (IIndieKitComponent) (ipChange instanceof IpChange ? ipChange.ipc$dispatch("45a10277", new Object[]{this}) : getComponent(3));
    }

    public <T> T getInterface(Class<T> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("9842089f", new Object[]{this, cls});
        }
        try {
            return (T) this.f23628a.getInterface(cls);
        } catch (SecException e) {
            e.printStackTrace();
            return null;
        }
    }

    public INoCaptchaComponent getNoCaptchaComp() {
        IpChange ipChange = $ipChange;
        return (INoCaptchaComponent) (ipChange instanceof IpChange ? ipChange.ipc$dispatch("2ea66e7b", new Object[]{this}) : getComponent(14));
    }

    public IPkgValidityCheckComponent getPackageValidityCheckComp() {
        IpChange ipChange = $ipChange;
        return (IPkgValidityCheckComponent) (ipChange instanceof IpChange ? ipChange.ipc$dispatch("5008a7a0", new Object[]{this}) : getComponent(12));
    }

    public IRootDetectComponent getRootDetectComp() {
        IpChange ipChange = $ipChange;
        return (IRootDetectComponent) (ipChange instanceof IpChange ? ipChange.ipc$dispatch("b0fc2bc1", new Object[]{this}) : getComponent(5));
    }

    public String getSDKVerison() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("76412af1", new Object[]{this});
        }
        com.alibaba.wireless.security.open.SecurityGuardManager securityGuardManager = this.f23628a;
        if (securityGuardManager == null) {
            return null;
        }
        return securityGuardManager.getSDKVerison();
    }

    public ISafeTokenComponent getSafeTokenComp() {
        IpChange ipChange = $ipChange;
        return (ISafeTokenComponent) (ipChange instanceof IpChange ? ipChange.ipc$dispatch("b066f048", new Object[]{this}) : getComponent(16));
    }

    public ISecureSignatureComponent getSecureSignatureComp() {
        IpChange ipChange = $ipChange;
        return (ISecureSignatureComponent) (ipChange instanceof IpChange ? ipChange.ipc$dispatch("a1ac5833", new Object[]{this}) : getComponent(1));
    }

    public ISecurityBodyComponent getSecurityBodyComp() {
        IpChange ipChange = $ipChange;
        return (ISecurityBodyComponent) (ipChange instanceof IpChange ? ipChange.ipc$dispatch("1f8fc8be", new Object[]{this}) : getComponent(8));
    }

    public ISecurityDNSComponent getSecurityDNSComp() {
        IpChange ipChange = $ipChange;
        return (ISecurityDNSComponent) (ipChange instanceof IpChange ? ipChange.ipc$dispatch("f4c5820b", new Object[]{this}) : getComponent(11));
    }

    public ISimulatorDetectComponent getSimulatorDetectComp() {
        IpChange ipChange = $ipChange;
        return (ISimulatorDetectComponent) (ipChange instanceof IpChange ? ipChange.ipc$dispatch("a7a7cead", new Object[]{this}) : getComponent(10));
    }

    public IStaticDataEncryptComponent getStaticDataEncryptComp() {
        IpChange ipChange = $ipChange;
        return (IStaticDataEncryptComponent) (ipChange instanceof IpChange ? ipChange.ipc$dispatch("f13a43c7", new Object[]{this}) : getComponent(7));
    }

    public IStaticDataStoreComponent getStaticDataStoreComp() {
        IpChange ipChange = $ipChange;
        return (IStaticDataStoreComponent) (ipChange instanceof IpChange ? ipChange.ipc$dispatch("121d2a8b", new Object[]{this}) : getComponent(4));
    }

    public Boolean isOpen() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("78f53dd8", new Object[]{this});
        }
        return false;
    }
}
