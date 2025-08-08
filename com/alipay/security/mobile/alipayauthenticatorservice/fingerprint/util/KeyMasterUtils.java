package com.alipay.security.mobile.alipayauthenticatorservice.fingerprint.util;

import android.os.Build;
import android.security.keystore.KeyGenParameterSpec;
import android.security.keystore.KeyInfo;
import mtopsdk.common.util.StringUtils;
import com.ali.user.mobile.rpc.safe.AES;
import com.alipay.security.mobile.auth.AuthenticatorLOG;
import com.android.alibaba.ip.runtime.IpChange;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.Signature;
import java.security.cert.Certificate;
import java.security.spec.ECGenParameterSpec;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

/* loaded from: classes3.dex */
public class KeyMasterUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "KeyMasterUtils";
    private static KeyMasterUtils instance;

    private KeyMasterUtils() {
    }

    public static synchronized KeyMasterUtils getInstance() {
        synchronized (KeyMasterUtils.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (KeyMasterUtils) ipChange.ipc$dispatch("ecfb109f", new Object[0]);
            }
            if (instance == null) {
                instance = new KeyMasterUtils();
            }
            return instance;
        }
    }

    public List<String> getAliasList() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("36277b88", new Object[]{this});
        }
        try {
            KeyStore keyStore = KeyStore.getInstance(AES.ANDROID_KEYSTORE);
            keyStore.load(null);
            Enumeration<String> aliases = keyStore.aliases();
            ArrayList arrayList = new ArrayList();
            while (aliases.hasMoreElements()) {
                arrayList.add(aliases.nextElement());
            }
            return arrayList;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public boolean isKeyContains(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7c7f9a9", new Object[]{this, str})).booleanValue();
        }
        if (StringUtils.isEmpty(str)) {
            return false;
        }
        try {
            AuthenticatorLOG.debug(TAG, "isKeyContains alias:" + str);
            KeyStore keyStore = KeyStore.getInstance(AES.ANDROID_KEYSTORE);
            keyStore.load(null);
            return keyStore.containsAlias(str);
        } catch (Exception e) {
            AuthenticatorLOG.error(TAG, "exception:" + e.getMessage());
            return false;
        }
    }

    public boolean generateKey(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("44d1fbf", new Object[]{this, str})).booleanValue();
        }
        AuthenticatorLOG.debug(TAG, "generateKey alias:" + str);
        KeyPair keyPair = null;
        try {
            KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("EC", AES.ANDROID_KEYSTORE);
            keyPairGenerator.initialize(new KeyGenParameterSpec.Builder(str, 12).setDigests("SHA-256", "SHA-512").setAlgorithmParameterSpec(new ECGenParameterSpec("prime256v1")).setUserAuthenticationRequired(true).build());
            keyPair = keyPairGenerator.generateKeyPair();
        } catch (Exception e) {
            AuthenticatorLOG.error(TAG, "exception:" + e.getMessage());
        }
        return keyPair != null;
    }

    public boolean generateKey(String str, boolean z, byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8db54504", new Object[]{this, str, new Boolean(z), bArr})).booleanValue();
        }
        AuthenticatorLOG.debug(TAG, "generateKey alias:" + str);
        KeyPair keyPair = null;
        try {
            KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("EC", AES.ANDROID_KEYSTORE);
            KeyGenParameterSpec.Builder userAuthenticationRequired = new KeyGenParameterSpec.Builder(str, 12).setDigests("SHA-256", "SHA-512").setAlgorithmParameterSpec(new ECGenParameterSpec("prime256v1")).setUserAuthenticationRequired(z);
            if (Build.VERSION.SDK_INT >= 24 && bArr != null && bArr.length > 0) {
                userAuthenticationRequired.setAttestationChallenge(bArr);
            }
            keyPairGenerator.initialize(userAuthenticationRequired.build());
            keyPair = keyPairGenerator.generateKeyPair();
        } catch (Exception e) {
            AuthenticatorLOG.error(TAG, "exception:" + e.getMessage());
        }
        return keyPair != null;
    }

    public Certificate[] getCertificateChain(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Certificate[]) ipChange.ipc$dispatch("b473a57", new Object[]{this, str});
        }
        if (Build.VERSION.SDK_INT < 24) {
            return null;
        }
        try {
            if (!isKeyContains(str)) {
                return null;
            }
            KeyStore keyStore = KeyStore.getInstance(AES.ANDROID_KEYSTORE);
            keyStore.load(null);
            return keyStore.getCertificateChain(str);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public PublicKey loadPublicKey(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PublicKey) ipChange.ipc$dispatch("6f86e51e", new Object[]{this, str});
        }
        try {
            AuthenticatorLOG.debug(TAG, "loadPublicKey  alias:" + str);
            KeyStore keyStore = KeyStore.getInstance(AES.ANDROID_KEYSTORE);
            keyStore.load(null);
            return ((KeyStore.PrivateKeyEntry) keyStore.getEntry(str, null)).getCertificate().getPublicKey();
        } catch (Exception e) {
            AuthenticatorLOG.error(TAG, "Failed to load publickey." + e.getMessage());
            return null;
        }
    }

    public boolean isInsideSecureHardware(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e19dcaba", new Object[]{this, str})).booleanValue();
        }
        try {
            KeyStore keyStore = KeyStore.getInstance(AES.ANDROID_KEYSTORE);
            keyStore.load(null);
            PrivateKey privateKey = ((KeyStore.PrivateKeyEntry) keyStore.getEntry(str, null)).getPrivateKey();
            if (privateKey != null) {
                return ((KeyInfo) KeyFactory.getInstance(privateKey.getAlgorithm(), AES.ANDROID_KEYSTORE).getKeySpec(privateKey, KeyInfo.class)).isInsideSecureHardware();
            }
            return false;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public Signature initSignature(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Signature) ipChange.ipc$dispatch("3d7aba74", new Object[]{this, str});
        }
        AuthenticatorLOG.debug(TAG, "initSign alias:" + str);
        try {
            KeyStore keyStore = KeyStore.getInstance(AES.ANDROID_KEYSTORE);
            keyStore.load(null);
            Signature signature = Signature.getInstance("SHA256withECDSA");
            signature.initSign((PrivateKey) keyStore.getKey(str, null));
            return signature;
        } catch (Exception e) {
            AuthenticatorLOG.error(TAG, "Failed to init Signature." + e.getMessage());
            return null;
        }
    }

    public boolean deleteKey(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a1c43849", new Object[]{this, str})).booleanValue();
        }
        try {
            AuthenticatorLOG.debug(TAG, "deleteKey alias:" + str);
            KeyStore keyStore = KeyStore.getInstance(AES.ANDROID_KEYSTORE);
            keyStore.load(null);
            keyStore.deleteEntry(str);
            return true;
        } catch (Exception e) {
            AuthenticatorLOG.error(TAG, "Could not delete key." + e.getMessage());
            return false;
        }
    }
}
