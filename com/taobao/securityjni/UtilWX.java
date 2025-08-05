package com.taobao.securityjni;

import android.content.ContextWrapper;
import com.alibaba.wireless.security.open.SecException;
import com.alibaba.wireless.security.open.SecurityGuardManager;
import com.alibaba.wireless.security.open.dynamicdataencrypt.IDynamicDataEncryptComponent;
import com.alibaba.wireless.security.open.staticdataencrypt.IStaticDataEncryptComponent;
import com.alibaba.wireless.security.open.staticdatastore.IStaticDataStoreComponent;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.securityjni.tools.DataContext;
import tb.kge;

@Deprecated
/* loaded from: classes8.dex */
public class UtilWX {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private ContextWrapper context;

    static {
        kge.a(-1628507424);
    }

    public UtilWX(ContextWrapper contextWrapper) {
        this.context = contextWrapper;
    }

    public String Put(String str, DataContext dataContext) {
        String appKeyByIndex;
        IStaticDataEncryptComponent staticDataEncryptComp;
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d8017025", new Object[]{this, str, dataContext});
        }
        if (str == null || str.length() <= 0 || dataContext == null) {
            return null;
        }
        try {
            IStaticDataStoreComponent staticDataStoreComp = SecurityGuardManager.getInstance(this.context).getStaticDataStoreComp();
            if (staticDataStoreComp == null) {
                return null;
            }
            if (dataContext.extData != null) {
                appKeyByIndex = new String(dataContext.extData);
            } else {
                if (dataContext.index >= 0) {
                    i = dataContext.index;
                }
                appKeyByIndex = staticDataStoreComp.getAppKeyByIndex(i, "");
            }
            if (appKeyByIndex != null && (staticDataEncryptComp = SecurityGuardManager.getInstance(this.context).getStaticDataEncryptComp()) != null) {
                return staticDataEncryptComp.staticSafeEncrypt(16, appKeyByIndex, str, "");
            }
            return null;
        } catch (SecException e) {
            e.printStackTrace();
            return null;
        }
    }

    public String Get(String str, DataContext dataContext) {
        String appKeyByIndex;
        IStaticDataEncryptComponent staticDataEncryptComp;
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d84982be", new Object[]{this, str, dataContext});
        }
        if (str == null || str.length() <= 0 || dataContext == null) {
            return null;
        }
        try {
            IStaticDataStoreComponent staticDataStoreComp = SecurityGuardManager.getInstance(this.context).getStaticDataStoreComp();
            if (staticDataStoreComp == null) {
                return null;
            }
            if (dataContext.extData != null) {
                appKeyByIndex = new String(dataContext.extData);
            } else {
                if (dataContext.index >= 0) {
                    i = dataContext.index;
                }
                appKeyByIndex = staticDataStoreComp.getAppKeyByIndex(i, "");
            }
            if (appKeyByIndex != null && (staticDataEncryptComp = SecurityGuardManager.getInstance(this.context).getStaticDataEncryptComp()) != null) {
                return staticDataEncryptComp.staticSafeDecrypt(16, appKeyByIndex, str, "");
            }
            return null;
        } catch (SecException e) {
            e.printStackTrace();
            return null;
        }
    }

    public byte[] Put(byte[] bArr, DataContext dataContext) {
        String appKeyByIndex;
        IStaticDataEncryptComponent staticDataEncryptComp;
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("9dfe9345", new Object[]{this, bArr, dataContext});
        }
        if (bArr == null || bArr.length <= 0 || dataContext == null) {
            return null;
        }
        try {
            IStaticDataStoreComponent staticDataStoreComp = SecurityGuardManager.getInstance(this.context).getStaticDataStoreComp();
            if (staticDataStoreComp == null) {
                return null;
            }
            if (dataContext.extData != null) {
                appKeyByIndex = new String(dataContext.extData);
            } else {
                if (dataContext.index >= 0) {
                    i = dataContext.index;
                }
                appKeyByIndex = staticDataStoreComp.getAppKeyByIndex(i, "");
            }
            if (appKeyByIndex != null && (staticDataEncryptComp = SecurityGuardManager.getInstance(this.context).getStaticDataEncryptComp()) != null) {
                return staticDataEncryptComp.staticBinarySafeEncrypt(16, appKeyByIndex, bArr, "");
            }
            return null;
        } catch (SecException e) {
            e.printStackTrace();
            return null;
        }
    }

    public byte[] Get(byte[] bArr, DataContext dataContext) {
        String appKeyByIndex;
        IStaticDataEncryptComponent staticDataEncryptComp;
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("c8af49de", new Object[]{this, bArr, dataContext});
        }
        if (bArr == null || bArr.length <= 0 || dataContext == null) {
            return null;
        }
        try {
            IStaticDataStoreComponent staticDataStoreComp = SecurityGuardManager.getInstance(this.context).getStaticDataStoreComp();
            if (staticDataStoreComp == null) {
                return null;
            }
            if (dataContext.extData != null) {
                appKeyByIndex = new String(dataContext.extData);
            } else {
                if (dataContext.index >= 0) {
                    i = dataContext.index;
                }
                appKeyByIndex = staticDataStoreComp.getAppKeyByIndex(i, "");
            }
            if (appKeyByIndex != null && (staticDataEncryptComp = SecurityGuardManager.getInstance(this.context).getStaticDataEncryptComp()) != null) {
                return staticDataEncryptComp.staticBinarySafeDecrypt(16, appKeyByIndex, bArr, "");
            }
            return null;
        } catch (SecException e) {
            e.printStackTrace();
            return null;
        }
    }

    public String EncryptData(String str, String str2) {
        byte[] staticBinarySafeEncrypt;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d3839336", new Object[]{this, str, str2});
        }
        if (str == null || str.length() <= 0 || str2 == null || str2.length() <= 0) {
            return null;
        }
        try {
            IStaticDataEncryptComponent staticDataEncryptComp = SecurityGuardManager.getInstance(this.context).getStaticDataEncryptComp();
            if (staticDataEncryptComp != null && (staticBinarySafeEncrypt = staticDataEncryptComp.staticBinarySafeEncrypt(16, str2, str.getBytes(), "")) != null) {
                return new String(staticBinarySafeEncrypt);
            }
            return null;
        } catch (SecException e) {
            e.printStackTrace();
            return null;
        }
    }

    public String DecryptData(String str, String str2) {
        byte[] staticBinarySafeDecrypt;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7d483d0e", new Object[]{this, str, str2});
        }
        if (str == null || str.length() <= 0 || str2 == null || str2.length() <= 0) {
            return null;
        }
        try {
            IStaticDataEncryptComponent staticDataEncryptComp = SecurityGuardManager.getInstance(this.context).getStaticDataEncryptComp();
            if (staticDataEncryptComp != null && (staticBinarySafeDecrypt = staticDataEncryptComp.staticBinarySafeDecrypt(16, str2, str.getBytes(), "")) != null) {
                return new String(staticBinarySafeDecrypt);
            }
            return null;
        } catch (SecException e) {
            e.printStackTrace();
            return null;
        }
    }

    public byte[] EncryptData(byte[] bArr, byte[] bArr2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("73f8ebf9", new Object[]{this, bArr, bArr2});
        }
        if (bArr == null || bArr.length <= 0 || bArr2 == null || bArr2.length <= 0) {
            return null;
        }
        try {
            IStaticDataEncryptComponent staticDataEncryptComp = SecurityGuardManager.getInstance(this.context).getStaticDataEncryptComp();
            if (staticDataEncryptComp == null) {
                return null;
            }
            return staticDataEncryptComp.staticBinarySafeEncrypt(16, new String(bArr2), bArr, "");
        } catch (SecException e) {
            e.printStackTrace();
            return null;
        }
    }

    public byte[] DecryptData(byte[] bArr, byte[] bArr2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("5159a5d1", new Object[]{this, bArr, bArr2});
        }
        if (bArr == null || bArr.length <= 0 || bArr2 == null || bArr2.length <= 0) {
            return null;
        }
        try {
            IStaticDataEncryptComponent staticDataEncryptComp = SecurityGuardManager.getInstance(this.context).getStaticDataEncryptComp();
            if (staticDataEncryptComp == null) {
                return null;
            }
            return staticDataEncryptComp.staticBinarySafeDecrypt(16, new String(bArr2), bArr, "");
        } catch (SecException e) {
            e.printStackTrace();
            return null;
        }
    }

    public String Put(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("16007460", new Object[]{this, str});
        }
        if (str == null || str.length() <= 0) {
            return null;
        }
        try {
            IDynamicDataEncryptComponent dynamicDataEncryptComp = SecurityGuardManager.getInstance(this.context).getDynamicDataEncryptComp();
            if (dynamicDataEncryptComp == null) {
                return null;
            }
            return dynamicDataEncryptComp.dynamicEncrypt(str);
        } catch (SecException e) {
            e.printStackTrace();
            return null;
        }
    }

    public String Get(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("96ee639", new Object[]{this, str});
        }
        if (str == null || str.length() <= 0) {
            return null;
        }
        try {
            IDynamicDataEncryptComponent dynamicDataEncryptComp = SecurityGuardManager.getInstance(this.context).getDynamicDataEncryptComp();
            if (dynamicDataEncryptComp == null) {
                return null;
            }
            return dynamicDataEncryptComp.dynamicDecrypt(str);
        } catch (SecException e) {
            e.printStackTrace();
            return null;
        }
    }

    public byte[] Put(byte[] bArr) {
        String dynamicEncrypt;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("f703e940", new Object[]{this, bArr});
        }
        if (bArr == null || bArr.length <= 0) {
            return null;
        }
        try {
            IDynamicDataEncryptComponent dynamicDataEncryptComp = SecurityGuardManager.getInstance(this.context).getDynamicDataEncryptComp();
            if (dynamicDataEncryptComp != null && (dynamicEncrypt = dynamicDataEncryptComp.dynamicEncrypt(new String(bArr))) != null && dynamicEncrypt.length() > 0) {
                return dynamicEncrypt.getBytes();
            }
            return null;
        } catch (SecException e) {
            e.printStackTrace();
            return null;
        }
    }

    public byte[] Get(byte[] bArr) {
        String dynamicDecrypt;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("1c27ff19", new Object[]{this, bArr});
        }
        if (bArr == null || bArr.length <= 0) {
            return null;
        }
        try {
            IDynamicDataEncryptComponent dynamicDataEncryptComp = SecurityGuardManager.getInstance(this.context).getDynamicDataEncryptComp();
            if (dynamicDataEncryptComp != null && (dynamicDecrypt = dynamicDataEncryptComp.dynamicDecrypt(new String(bArr))) != null && dynamicDecrypt.length() > 0) {
                return dynamicDecrypt.getBytes();
            }
            return null;
        } catch (SecException e) {
            e.printStackTrace();
            return null;
        }
    }
}
