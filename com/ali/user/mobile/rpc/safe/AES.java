package com.ali.user.mobile.rpc.safe;

import android.security.keystore.KeyGenParameterSpec;
import android.security.keystore.KeyPermanentlyInvalidatedException;
import com.ali.user.mobile.log.UserTrackAdapter;
import com.ali.user.mobile.model.CommonCallback;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.constants.LoginStatus;
import com.taobao.login4android.log.LoginTLogAdapter;
import java.security.Key;
import java.security.KeyStore;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import tb.kge;

/* loaded from: classes2.dex */
public class AES {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ALGORITHM = "AES";
    public static final String ANDROID_KEYSTORE = "AndroidKeyStore";
    public static final String BLOCK_MODE = "CBC";
    public static int Error_invalid = 0;
    public static int Error_other = 0;
    public static final String MY_KEY = "com.ali.user.sdk.fingerprint";
    public static final String PADDING = "PKCS7Padding";
    public static final String TAG = "AES";
    public final KeyStore mKeyStore = KeyStore.getInstance(ANDROID_KEYSTORE);

    public AES() throws Exception {
        this.mKeyStore.load(null);
    }

    public Cipher getCipher(boolean z) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Cipher) ipChange.ipc$dispatch("bd5f327d", new Object[]{this, new Boolean(z)});
        }
        Key key = getKey();
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
        try {
            cipher.init(3, key);
            LoginStatus.resetFingerPrintEntrolled();
        } catch (Exception e) {
            e.printStackTrace();
            this.mKeyStore.deleteEntry(MY_KEY);
            if (z) {
                getCipher(false);
                LoginStatus.compareAndSetNewFingerPrintEntrolled(false, true);
            } else {
                try {
                    UserTrackAdapter.sendUT("KeyPermanentlyInvalidatedException", e.getLocalizedMessage());
                    LoginTLogAdapter.e("AES", e);
                } catch (Throwable th) {
                    th.printStackTrace();
                }
                throw new Exception("create cipher failed", e);
            }
        }
        return cipher;
    }

    static {
        kge.a(1925436735);
        Error_invalid = 5001;
        Error_other = 5002;
    }

    public void checkValid(CommonCallback commonCallback) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e9b858c", new Object[]{this, commonCallback});
        } else if (commonCallback == null) {
        } else {
            try {
                Cipher.getInstance("AES/CBC/PKCS7Padding").init(3, getKey());
                commonCallback.onSuccess();
            } catch (KeyPermanentlyInvalidatedException e) {
                try {
                    UserTrackAdapter.sendExtendUT("CheckValidException", e.getMessage(), String.valueOf(Error_invalid), null);
                } catch (Throwable th) {
                    th.printStackTrace();
                }
                try {
                    this.mKeyStore.deleteEntry(MY_KEY);
                } catch (Throwable th2) {
                    th2.printStackTrace();
                }
                commonCallback.onFail(Error_invalid, "指纹变更");
            } catch (Exception e2) {
                try {
                    UserTrackAdapter.sendExtendUT("CheckValidException", e2.getMessage(), String.valueOf(Error_other), null);
                } catch (Throwable th3) {
                    th3.printStackTrace();
                }
                try {
                    this.mKeyStore.deleteEntry(MY_KEY);
                } catch (Throwable th4) {
                    th4.printStackTrace();
                }
                commonCallback.onFail(Error_other, "指纹失败");
            }
        }
    }

    public boolean checkValid() throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2b6d1a5f", new Object[]{this})).booleanValue();
        }
        Cipher.getInstance("AES/CBC/PKCS7Padding").init(3, getKey());
        return true;
    }

    public Key getKey() throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Key) ipChange.ipc$dispatch("205f27c4", new Object[]{this});
        }
        if (!this.mKeyStore.isKeyEntry(MY_KEY)) {
            createKey();
        }
        LoginTLogAdapter.e("AES", "getKeyFromCache");
        return this.mKeyStore.getKey(MY_KEY, null);
    }

    public boolean hasKey() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("48769f70", new Object[]{this})).booleanValue();
        }
        try {
            return this.mKeyStore.isKeyEntry(MY_KEY);
        } catch (Throwable th) {
            th.printStackTrace();
            return false;
        }
    }

    public void createKey() throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5539feca", new Object[]{this});
            return;
        }
        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", ANDROID_KEYSTORE);
        keyGenerator.init(new KeyGenParameterSpec.Builder(MY_KEY, 3).setBlockModes(BLOCK_MODE).setEncryptionPaddings(PADDING).setUserAuthenticationRequired(true).build());
        keyGenerator.generateKey();
        LoginTLogAdapter.e("AES", "createKey");
    }
}
