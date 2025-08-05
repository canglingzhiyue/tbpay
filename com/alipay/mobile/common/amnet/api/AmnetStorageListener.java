package com.alipay.mobile.common.amnet.api;

import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Base64;
import com.alipay.mobile.common.netsdkextdependapi.security.SecurityUtil;
import com.alipay.mobile.common.transport.utils.FileUtils;
import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.alipay.mobile.common.transport.utils.NetworkAsyncTaskExecutor;
import com.alipay.mobile.common.transportext.amnet.Storage;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public class AmnetStorageListener implements Storage {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String SHARED_FILE_NAME = "amnetStorage";
    public static final String TAG = "AmnetStorageManager";

    /* renamed from: a  reason: collision with root package name */
    private static AmnetStorageListener f5353a;
    private HashMap<String, SharedPreferences.Editor> b = new HashMap<>(1);

    public static /* synthetic */ void access$000(AmnetStorageListener amnetStorageListener, String str, byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a4784dc", new Object[]{amnetStorageListener, str, bArr});
        } else {
            amnetStorageListener.a(str, bArr);
        }
    }

    public static /* synthetic */ HashMap access$100(AmnetStorageListener amnetStorageListener) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (HashMap) ipChange.ipc$dispatch("df77870d", new Object[]{amnetStorageListener}) : amnetStorageListener.b;
    }

    public static final AmnetStorageListener getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AmnetStorageListener) ipChange.ipc$dispatch("e5e684a4", new Object[0]);
        }
        AmnetStorageListener amnetStorageListener = f5353a;
        if (amnetStorageListener != null) {
            return amnetStorageListener;
        }
        synchronized (AmnetStorageListener.class) {
            if (f5353a != null) {
                return f5353a;
            }
            f5353a = new AmnetStorageListener();
            return f5353a;
        }
    }

    private AmnetStorageListener() {
    }

    @Override // com.alipay.mobile.common.transportext.amnet.Storage
    public byte[] getCommon(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("633ede6b", new Object[]{this, str});
        }
        try {
            LogCatUtil.info(TAG, "getCommon.key= " + str);
            String string = AmnetEnvHelper.getAppContext().getSharedPreferences(SHARED_FILE_NAME, 0).getString(str, null);
            if (!TextUtils.isEmpty(string)) {
                return Base64.decode(string, 2);
            }
            return null;
        } catch (Throwable th) {
            LogCatUtil.error(TAG, "getCommon ex= " + th.toString());
            removeCommon(str);
            return null;
        }
    }

    @Override // com.alipay.mobile.common.transportext.amnet.Storage
    public byte[] getSecure(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("1235af5f", new Object[]{this, str});
        }
        try {
            byte[] common = getCommon(str);
            if (common != null && common.length > 0) {
                byte[] decrypt = SecurityUtil.decrypt(common);
                StringBuilder sb = new StringBuilder();
                sb.append("get Secure. key= ");
                sb.append(str);
                sb.append(".result=");
                sb.append((decrypt == null || decrypt.length <= 0) ? "is null" : new String(decrypt));
                LogCatUtil.printInfo(TAG, sb.toString());
                return decrypt;
            }
            return null;
        } catch (Exception e) {
            LogCatUtil.error(TAG, " getSecure exception: " + e.toString());
            return null;
        }
    }

    @Override // com.alipay.mobile.common.transportext.amnet.Storage
    public void putCommon(String str, byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f44ce2f2", new Object[]{this, str, bArr});
            return;
        }
        LogCatUtil.info(TAG, "put Common,key= " + str + ",val= " + bArr);
        if (TextUtils.isEmpty(str)) {
            LogCatUtil.error(TAG, "put Common,key= " + str + " ,val is null");
            return;
        }
        try {
            SharedPreferences.Editor edit = AmnetEnvHelper.getAppContext().getSharedPreferences(SHARED_FILE_NAME, 0).edit();
            edit.putString(str, Base64.encodeToString(bArr, 2));
            edit.commit();
        } catch (Exception e) {
            LogCatUtil.error(TAG, e);
        }
    }

    @Override // com.alipay.mobile.common.transportext.amnet.Storage
    public void putSecure(String str, byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2430307e", new Object[]{this, str, bArr});
            return;
        }
        LogCatUtil.printInfo(TAG, "put Secure,key= " + str + ",value= " + bArr);
        try {
            putCommon(str, SecurityUtil.encrypt(bArr));
        } catch (Exception e) {
            LogCatUtil.error(TAG, e);
        }
    }

    @Override // com.alipay.mobile.common.transportext.amnet.Storage
    public void putCommonAsync(final String str, final byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce21d1da", new Object[]{this, str, bArr});
        } else {
            NetworkAsyncTaskExecutor.executeIO(new Runnable() { // from class: com.alipay.mobile.common.amnet.api.AmnetStorageListener.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        AmnetStorageListener.this.putCommon(str, bArr);
                    }
                }
            });
        }
    }

    @Override // com.alipay.mobile.common.transportext.amnet.Storage
    public void putSecureAsync(final String str, final byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("682d1bce", new Object[]{this, str, bArr});
        } else {
            NetworkAsyncTaskExecutor.executeIO(new Runnable() { // from class: com.alipay.mobile.common.amnet.api.AmnetStorageListener.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        AmnetStorageListener.this.putSecure(str, bArr);
                    }
                }
            });
        }
    }

    @Override // com.alipay.mobile.common.transportext.amnet.Storage
    public void putCommonTransmit(String str, byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("12002fc2", new Object[]{this, str, bArr});
            return;
        }
        if (bArr != null) {
            try {
                if (bArr.length != 0) {
                    LogCatUtil.debug(TAG, "putCommonTransmit,key=" + str);
                    SharedPreferences.Editor editor = this.b.get("KEY_EDITOR");
                    if (editor != null) {
                        editor.putString(str, Base64.encodeToString(bArr, 2));
                        return;
                    }
                    SharedPreferences.Editor edit = AmnetEnvHelper.getAppContext().getSharedPreferences(SHARED_FILE_NAME, 0).edit();
                    this.b.put("KEY_EDITOR", edit);
                    edit.putString(str, Base64.encodeToString(bArr, 2));
                    return;
                }
            } catch (Throwable th) {
                LogCatUtil.error(TAG, th);
                return;
            }
        }
        LogCatUtil.error(TAG, "putCommonTransmit,key=" + str + ",val is null");
    }

    @Override // com.alipay.mobile.common.transportext.amnet.Storage
    public void putSecureTransmit(final String str, final byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59b3314e", new Object[]{this, str, bArr});
        } else if (bArr == null) {
        } else {
            try {
                if (bArr.length == 0) {
                    return;
                }
                LogCatUtil.debug(TAG, "putSecureTransmit,key=" + str);
                NetworkAsyncTaskExecutor.executeIO(new Runnable() { // from class: com.alipay.mobile.common.amnet.api.AmnetStorageListener.3
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            AmnetStorageListener.access$000(AmnetStorageListener.this, str, bArr);
                        }
                    }
                });
            } catch (Throwable th) {
                LogCatUtil.error(TAG, th);
            }
        }
    }

    private void a(String str, byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a35a7c79", new Object[]{this, str, bArr});
            return;
        }
        try {
            putCommonTransmit(str, SecurityUtil.encrypt(bArr));
        } catch (Exception e) {
            LogCatUtil.error(TAG, e);
        }
    }

    @Override // com.alipay.mobile.common.transportext.amnet.Storage
    public void putCommit() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89582ad", new Object[]{this});
            return;
        }
        try {
            LogCatUtil.debug(TAG, "put commit");
            NetworkAsyncTaskExecutor.executeIO(new Runnable() { // from class: com.alipay.mobile.common.amnet.api.AmnetStorageListener.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    SharedPreferences.Editor editor = (SharedPreferences.Editor) AmnetStorageListener.access$100(AmnetStorageListener.this).get("KEY_EDITOR");
                    if (editor != null) {
                        editor.commit();
                    } else {
                        LogCatUtil.error(AmnetStorageListener.TAG, "editor is null,you must use putCommit() after Transmit");
                    }
                }
            });
        } catch (Throwable th) {
            LogCatUtil.error(TAG, th);
        }
    }

    @Override // com.alipay.mobile.common.transportext.amnet.Storage
    public void removeCommon(final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77a530e0", new Object[]{this, str});
            return;
        }
        try {
            if (TextUtils.isEmpty(str)) {
                LogCatUtil.debug(TAG, "removeCommon,key is null");
                return;
            }
            LogCatUtil.debug(TAG, "removeCommon,key=" + str);
            NetworkAsyncTaskExecutor.executeIO(new Runnable() { // from class: com.alipay.mobile.common.amnet.api.AmnetStorageListener.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    SharedPreferences.Editor edit = AmnetEnvHelper.getAppContext().getSharedPreferences(AmnetStorageListener.SHARED_FILE_NAME, 0).edit();
                    edit.remove(str);
                    edit.commit();
                }
            });
        } catch (Throwable th) {
            LogCatUtil.error(TAG, th);
        }
    }

    @Override // com.alipay.mobile.common.transportext.amnet.Storage
    public byte[] getBigData(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("66cda36e", new Object[]{this, str, new Boolean(z)});
        }
        try {
            byte[] readFile = FileUtils.readFile(new File(AmnetEnvHelper.getAppContext().getFilesDir(), str));
            return !z ? SecurityUtil.decrypt(readFile) : readFile;
        } catch (Throwable th) {
            LogCatUtil.error(TAG, "getBigData ex:" + th.toString());
            return null;
        }
    }

    @Override // com.alipay.mobile.common.transportext.amnet.Storage
    public void getBigDataAsync(final String str, final boolean z, int i, final Storage.Result result) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa2f1a4a", new Object[]{this, str, new Boolean(z), new Integer(i), result});
        } else if (TextUtils.isEmpty(str) || result == null) {
            LogCatUtil.warn(TAG, "getBigDataAsync error, key is null or callback is null.");
        } else {
            LogCatUtil.info(TAG, "getBigDataAsync key=" + str + ", first=" + System.currentTimeMillis());
            if (i <= 0) {
                NetworkAsyncTaskExecutor.executeIO(new Runnable() { // from class: com.alipay.mobile.common.amnet.api.AmnetStorageListener.6
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        result.callbackData(str, AmnetStorageListener.this.getBigData(str, z));
                        LogCatUtil.info(AmnetStorageListener.TAG, "getBigDataAsync callback ok");
                    }
                });
            } else {
                NetworkAsyncTaskExecutor.schedule(new Runnable() { // from class: com.alipay.mobile.common.amnet.api.AmnetStorageListener.7
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        LogCatUtil.info(AmnetStorageListener.TAG, "getBigDataAsync key=" + str + ", now=" + System.currentTimeMillis());
                        result.callbackData(str, AmnetStorageListener.this.getBigData(str, z));
                        LogCatUtil.info(AmnetStorageListener.TAG, "getBigDataAsync callback ok");
                    }
                }, i, TimeUnit.SECONDS);
            }
        }
    }

    @Override // com.alipay.mobile.common.transportext.amnet.Storage
    public void putBigDataAsync(final String str, final byte[] bArr, final boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bba5a15b", new Object[]{this, str, bArr, new Boolean(z)});
        } else {
            NetworkAsyncTaskExecutor.executeIO(new Runnable() { // from class: com.alipay.mobile.common.amnet.api.AmnetStorageListener.8
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        File file = new File(AmnetEnvHelper.getAppContext().getFilesDir(), str);
                        FileUtils.deleteFileNotDir(file);
                        byte[] bArr2 = bArr;
                        if (!z) {
                            bArr2 = SecurityUtil.encrypt(bArr);
                        }
                        boolean saveByte2File = FileUtils.saveByte2File(file, bArr2);
                        LogCatUtil.debug(AmnetStorageListener.TAG, "putBigDataAsync result:" + saveByte2File);
                    } catch (Throwable th) {
                        LogCatUtil.error(AmnetStorageListener.TAG, "putBigDataAsync ex:" + th.toString());
                    }
                }
            });
        }
    }

    @Override // com.alipay.mobile.common.transportext.amnet.Storage
    public void removeBigData(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7957db7", new Object[]{this, str});
            return;
        }
        try {
            FileUtils.deleteFileNotDir(new File(AmnetEnvHelper.getAppContext().getFilesDir(), str));
            LogCatUtil.debug(TAG, "removeBigData " + str);
        } catch (Throwable th) {
            LogCatUtil.error(TAG, "removeBigData ex:" + th.toString());
        }
    }
}
