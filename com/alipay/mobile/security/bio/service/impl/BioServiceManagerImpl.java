package com.alipay.mobile.security.bio.service.impl;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.alipay.mobile.security.bio.api.BioDetector;
import com.alipay.mobile.security.bio.common.record.impl.BioRecordServiceImpl;
import com.alipay.mobile.security.bio.common.record.impl.ZimRecordServiceImpl;
import com.alipay.mobile.security.bio.config.Constant;
import com.alipay.mobile.security.bio.exception.BioIllegalArgumentException;
import com.alipay.mobile.security.bio.module.MicroModule;
import com.alipay.mobile.security.bio.runtime.Runtime;
import com.alipay.mobile.security.bio.service.BioAppDescription;
import com.alipay.mobile.security.bio.service.BioAppManager;
import com.alipay.mobile.security.bio.service.BioExtService;
import com.alipay.mobile.security.bio.service.BioMetaInfo;
import com.alipay.mobile.security.bio.service.BioRecordService;
import com.alipay.mobile.security.bio.service.BioService;
import com.alipay.mobile.security.bio.service.BioServiceDescription;
import com.alipay.mobile.security.bio.service.BioServiceManager;
import com.alipay.mobile.security.bio.service.BioStoreService;
import com.alipay.mobile.security.bio.service.BioTaskService;
import com.alipay.mobile.security.bio.service.BioUploadService;
import com.alipay.mobile.security.bio.service.ZimRecordService;
import com.alipay.mobile.security.bio.service.local.LocalService;
import com.alipay.mobile.security.bio.utils.BioLog;
import com.alipay.mobile.security.bio.utils.StringUtil;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Collection;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

/* loaded from: classes3.dex */
public class BioServiceManagerImpl extends BioServiceManager {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static boolean h = false;
    private Hashtable<String, BioService> c;
    private final HashMap<String, BioService> d;
    private Hashtable<String, BioAppDescription> e;
    private HashMap<String, LocalService> f;
    private HashMap<String, BioServiceDescription> g;

    public static /* synthetic */ Object ipc$super(BioServiceManagerImpl bioServiceManagerImpl, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ HashMap a(BioServiceManagerImpl bioServiceManagerImpl) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (HashMap) ipChange.ipc$dispatch("85c986b1", new Object[]{bioServiceManagerImpl}) : bioServiceManagerImpl.d;
    }

    public static /* synthetic */ boolean a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a821d370", new Object[]{new Boolean(z)})).booleanValue();
        }
        h = z;
        return z;
    }

    public BioServiceManagerImpl(Context context, String str) {
        super(context, str);
        this.c = new Hashtable<>();
        this.d = new HashMap<>();
        this.e = new Hashtable<>();
        this.f = new HashMap<>();
        this.g = new HashMap<>();
        a(context);
        a();
        b(this.f5806a);
    }

    private void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{this, context});
            return;
        }
        Runtime.getLocalService(context, this.f, this.g);
        for (LocalService localService : this.f.values()) {
            localService.create(this);
        }
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        BioStoreServiceImpl bioStoreServiceImpl = new BioStoreServiceImpl();
        this.c.put(BioStoreService.class.getName(), bioStoreServiceImpl);
        BioTaskServiceImpl bioTaskServiceImpl = new BioTaskServiceImpl(this.f5806a);
        this.c.put(BioTaskService.class.getName(), bioTaskServiceImpl);
        BioRecordServiceImpl bioRecordServiceImpl = new BioRecordServiceImpl();
        this.c.put(BioRecordService.class.getName(), bioRecordServiceImpl);
        ZimRecordServiceImpl zimRecordServiceImpl = new ZimRecordServiceImpl();
        this.c.put(ZimRecordService.class.getName(), zimRecordServiceImpl);
        BioUploadServiceImpl bioUploadServiceImpl = new BioUploadServiceImpl();
        this.c.put(BioUploadService.class.getName(), bioUploadServiceImpl);
        BioAppManager bioAppManager = new BioAppManager();
        this.c.put(BioAppManager.class.getName(), bioAppManager);
        bioStoreServiceImpl.create(this);
        bioTaskServiceImpl.create(this);
        bioRecordServiceImpl.create(this);
        zimRecordServiceImpl.create(this);
        bioUploadServiceImpl.create(this);
        bioAppManager.create(this);
    }

    private void b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9eca0fff", new Object[]{this, context});
            return;
        }
        for (BioMetaInfo bioMetaInfo : Runtime.getBioMetaInfoList()) {
            for (BioServiceDescription bioServiceDescription : bioMetaInfo.getExtServices()) {
                a(bioServiceDescription);
            }
            for (BioAppDescription bioAppDescription : bioMetaInfo.getApplications()) {
                a(bioAppDescription);
            }
        }
        synchronized (this.d) {
            for (String str : this.d.keySet()) {
                this.d.get(str).create(this);
            }
        }
    }

    private void a(BioServiceDescription bioServiceDescription) {
        try {
            BioService bioService = (BioService) bioServiceDescription.getClazz().newInstance();
            synchronized (this.d) {
                this.d.put(bioServiceDescription.getInterfaceName(), bioService);
            }
        } catch (IllegalAccessException e) {
            BioLog.e(bioServiceDescription.getInterfaceName() + e.toString());
        } catch (InstantiationException e2) {
            BioLog.e(bioServiceDescription.getInterfaceName() + e2.toString());
        } catch (Throwable th) {
            BioLog.e(bioServiceDescription.getInterfaceName() + th.toString());
        }
    }

    private void a(BioAppDescription bioAppDescription) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0d7e6e", new Object[]{this, bioAppDescription});
        } else if (bioAppDescription == null) {
        } else {
            String str = "bio_type_" + bioAppDescription.getBioType() + "_" + bioAppDescription.getBioAction();
            if (!this.e.containsKey(str)) {
                this.e.put(str, bioAppDescription);
                return;
            }
            BioLog.d("app exist:" + this.e.get(str).toString());
            BioLog.d("app input:" + bioAppDescription.toString());
        }
    }

    @Override // com.alipay.mobile.security.bio.service.BioServiceManager
    public <T> T getBioService(Class<T> cls) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (T) ipChange.ipc$dispatch("e6bc0a9f", new Object[]{this, cls}) : (T) getBioService(cls.getName());
    }

    @Override // com.alipay.mobile.security.bio.service.BioServiceManager
    public <T> T getBioService(String str) {
        LocalService localService;
        try {
            localService = this.f.get(str);
        } catch (Throwable th) {
            BioLog.w("Failed to call mLocalServices.get(" + str + "): " + th.toString());
            localService = null;
        }
        if (localService == null) {
            try {
                BioServiceDescription remove = this.g.remove(str);
                if (remove != null) {
                    LocalService localService2 = (LocalService) remove.getClazz().newInstance();
                    localService2.create(this);
                    this.f.put(remove.getInterfaceName(), localService2);
                    localService = localService2;
                }
            } catch (Throwable th2) {
                BioLog.w("Failed to call create LazyLocalService(" + str + "): " + th2.toString());
            }
        }
        if (localService == null) {
            try {
                localService = this.c.get(str);
            } catch (Throwable th3) {
                BioLog.w("Failed to call mSystemServices.get(" + str + "): " + th3.toString());
            }
        }
        if (localService == null) {
            try {
                synchronized (this.d) {
                    localService = (T) this.d.get(str);
                }
            } catch (Throwable th4) {
                BioLog.w("Failed to call mExtServices.get(" + str + "): " + th4.toString());
            }
        }
        return (T) localService;
    }

    @Override // com.alipay.mobile.security.bio.service.BioServiceManager
    public <T extends BioService> T putBioService(String str, Class<T> cls) {
        T t;
        try {
            t = cls.newInstance();
        } catch (Throwable th) {
            th = th;
            t = null;
        }
        try {
            t.create(this);
            this.c.put(str, t);
        } catch (Throwable th2) {
            th = th2;
            BioLog.e(th);
            return t;
        }
        return t;
    }

    @Override // com.alipay.mobile.security.bio.service.BioServiceManager
    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        HashMap<String, BioService> hashMap = this.d;
        if (hashMap != null) {
            synchronized (hashMap) {
                for (String str : this.d.keySet()) {
                    this.d.get(str).destroy();
                }
                this.d.clear();
            }
        }
        Hashtable<String, BioService> hashtable = this.c;
        if (hashtable != null) {
            for (String str2 : hashtable.keySet()) {
                this.c.get(str2).destroy();
            }
            this.c.clear();
        }
        HashMap<String, LocalService> hashMap2 = this.f;
        if (hashMap2 != null) {
            for (String str3 : hashMap2.keySet()) {
                this.f.get(str3).destroy();
            }
            this.f.clear();
        }
        HashMap<String, BioServiceDescription> hashMap3 = this.g;
        if (hashMap3 != null) {
            hashMap3.clear();
        }
        Hashtable<String, BioAppDescription> hashtable2 = this.e;
        if (hashtable2 == null) {
            return;
        }
        hashtable2.clear();
    }

    @Override // com.alipay.mobile.security.bio.service.BioServiceManager
    public String startBioActivity(BioAppDescription bioAppDescription, MicroModule microModule) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("226dec4e", new Object[]{this, bioAppDescription, microModule});
        }
        if (bioAppDescription == null) {
            return "";
        }
        String str = "bio_type_" + bioAppDescription.getBioType() + "_" + bioAppDescription.getBioAction();
        BioLog.i("appID:" + str);
        if (!this.e.containsKey(str)) {
            return "";
        }
        BioAppDescription bioAppDescription2 = this.e.get(str);
        bioAppDescription.setAppName(bioAppDescription2.getAppName());
        bioAppDescription.setAppInterfaceName(bioAppDescription2.getAppInterfaceName());
        bioAppDescription.setAppType(bioAppDescription2.getAppType());
        a(bioAppDescription, microModule);
        return str;
    }

    private boolean b(BioAppDescription bioAppDescription) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fd9d02b3", new Object[]{this, bioAppDescription})).booleanValue();
        }
        Map<String, String> extProperty = bioAppDescription.getExtProperty();
        return extProperty != null && !extProperty.isEmpty() && extProperty.containsKey(BioDetector.EXT_KEY_AUTH_IN_BACKGROUND) && Boolean.parseBoolean(extProperty.get(BioDetector.EXT_KEY_AUTH_IN_BACKGROUND));
    }

    private void a(BioAppDescription bioAppDescription, MicroModule microModule) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b736226", new Object[]{this, bioAppDescription, microModule});
            return;
        }
        String appInterfaceName = bioAppDescription.getAppInterfaceName();
        if (StringUtil.isNullorEmpty(appInterfaceName)) {
            throw new BioIllegalArgumentException();
        }
        Intent intent = new Intent();
        intent.setClassName(this.f5806a, appInterfaceName);
        int i = 805306368;
        if (b(bioAppDescription)) {
            i = 805339136;
        }
        intent.setFlags(i);
        intent.putExtra(Constant.BIOLOGY_INTENT_ACTION_INFO, bioAppDescription.getTag());
        intent.putExtra(Constant.BIOLOGY_INTENT_BIODETECTOR_ID, bioAppDescription.getDetectorId());
        if (Runtime.isRunningOnQuinox(this.f5806a)) {
            Map<String, String> extProperty = bioAppDescription.getExtProperty();
            if ((extProperty == null || extProperty.isEmpty() || !extProperty.containsKey(BioDetector.EXT_KEY_USE_CONTEXT)) ? false : Boolean.parseBoolean(extProperty.remove(BioDetector.EXT_KEY_USE_CONTEXT))) {
                if (this.f5806a instanceof Activity) {
                    intent.setFlags(0);
                } else {
                    intent.setFlags(268435456);
                }
                this.f5806a.startActivity(intent);
                z = true;
            } else {
                try {
                    z = Runtime.startActivity(intent);
                } catch (Throwable th) {
                    BioLog.w(th);
                    z = false;
                }
                BioLog.d("Runtime.startActivity(intent=" + intent + ") : bRet=" + z);
            }
        } else {
            z = false;
        }
        if (z) {
            return;
        }
        if (bioAppDescription.getAppType() == 1) {
            this.f5806a.startService(intent);
        } else {
            this.f5806a.startActivity(intent);
        }
    }

    @Override // com.alipay.mobile.security.bio.service.BioServiceManager
    public int preLoad() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("dd8c2a23", new Object[]{this})).intValue();
        }
        BioLog.i("preload:" + h);
        if (h) {
            return 0;
        }
        h = true;
        new Thread(new Runnable() { // from class: com.alipay.mobile.security.bio.service.impl.BioServiceManagerImpl.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                Collection<BioService> values;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                synchronized (BioServiceManagerImpl.a(BioServiceManagerImpl.this)) {
                    values = BioServiceManagerImpl.a(BioServiceManagerImpl.this).values();
                }
                for (BioService bioService : values) {
                    if (bioService instanceof BioExtService) {
                        BioExtService bioExtService = (BioExtService) bioService;
                        if (!bioExtService.isPreparing()) {
                            BioLog.i("loadingResource:" + bioExtService.getClass().getName());
                            bioExtService.loadingResource();
                        }
                    }
                }
                BioServiceManagerImpl.a(false);
            }
        }, "loadingResource").start();
        return 1;
    }
}
