package com.vivo.push.e;

import android.content.Context;
import android.os.Build;
import android.security.KeyPairGeneratorSpec;
import mtopsdk.common.util.StringUtils;
import android.util.Base64;
import com.ali.user.mobile.rpc.safe.AES;
import com.vivo.push.util.u;
import java.math.BigInteger;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.Signature;
import java.security.UnrecoverableEntryException;
import java.util.Calendar;
import javax.security.auth.x500.X500Principal;
import tb.jhy;

/* loaded from: classes9.dex */
public final class c implements a {

    /* renamed from: a  reason: collision with root package name */
    private PrivateKey f24189a = null;
    private PublicKey b = null;
    private KeyStore c;
    private X500Principal d;
    private Context e;

    public c(Context context) {
        this.e = context;
        a(this.e);
    }

    private synchronized void a(Context context) {
        try {
            b();
            if (!b("PushRsaKeyAlias")) {
                b(context);
            }
        } catch (Exception e) {
            e.printStackTrace();
            u.a("RsaSecurity", "init error" + e.getMessage());
        }
    }

    private void b() {
        try {
            this.c = KeyStore.getInstance(AES.ANDROID_KEYSTORE);
            this.c.load(null);
            this.d = new X500Principal("CN=Push SDK, OU=VIVO, O=VIVO PUSH, C=CN");
        } catch (Exception e) {
            e.printStackTrace();
            u.a("RsaSecurity", "initKeyStore error" + e.getMessage());
        }
    }

    private void b(Context context) {
        try {
            if (context == null) {
                u.d("RsaSecurity", " generateRSAKeyPairSign context == null ");
                return;
            }
            Calendar calendar = Calendar.getInstance();
            Calendar calendar2 = Calendar.getInstance();
            calendar2.add(1, 999);
            if (Build.VERSION.SDK_INT < 18) {
                return;
            }
            KeyPairGeneratorSpec build = new KeyPairGeneratorSpec.Builder(context.getApplicationContext()).setAlias("PushRsaKeyAlias").setSubject(this.d).setSerialNumber(BigInteger.valueOf(1337L)).setStartDate(calendar.getTime()).setEndDate(calendar2.getTime()).build();
            KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance(jhy.KEY_ALGORITHM, AES.ANDROID_KEYSTORE);
            keyPairGenerator.initialize(build);
            keyPairGenerator.generateKeyPair();
        } catch (Exception e) {
            e.printStackTrace();
            u.a("RsaSecurity", "generateRSAKeyPairSign error" + e.getMessage());
        }
    }

    private boolean b(String str) {
        if (StringUtils.isEmpty(str)) {
            return false;
        }
        try {
            if (this.c == null) {
                b();
            }
            return this.c.containsAlias(str);
        } catch (Exception e) {
            e.printStackTrace();
            u.a("RsaSecurity", "getPrivateKeySigin error" + e.getMessage());
            return false;
        }
    }

    private PrivateKey c(Context context) {
        try {
        } catch (Exception e) {
            e.printStackTrace();
            u.a("RsaSecurity", "getPrivateKeySigin error" + e.getMessage());
        }
        if (this.f24189a != null) {
            return this.f24189a;
        }
        if (context == null) {
            u.d("RsaSecurity", " getPrivateKeySigin context == null ");
            return null;
        }
        KeyStore.Entry d = d(context);
        if (d instanceof KeyStore.PrivateKeyEntry) {
            this.f24189a = ((KeyStore.PrivateKeyEntry) d).getPrivateKey();
            return this.f24189a;
        }
        return null;
    }

    private KeyStore.Entry d(Context context) throws UnrecoverableEntryException, NoSuchAlgorithmException, KeyStoreException {
        try {
            if (context == null) {
                u.d("RsaSecurity", " getPrivateKeySigin context == null ");
                return null;
            }
            if (!b("PushRsaKeyAlias")) {
                b(context);
            }
            return this.c.getEntry("PushRsaKeyAlias", null);
        } catch (Exception e) {
            b(context);
            KeyStore.Entry entry = this.c.getEntry("PushRsaKeyAlias", null);
            e.printStackTrace();
            u.a("RsaSecurity", "getPrivateKeySigin error" + e.getMessage());
            return entry;
        }
    }

    @Override // com.vivo.push.e.a
    public final String a(String str) {
        try {
            if (StringUtils.isEmpty(str) || c(this.e) == null) {
                return null;
            }
            byte[] bytes = str.getBytes("UTF-8");
            PrivateKey c = c(this.e);
            Signature signature = Signature.getInstance("SHA256withRSA");
            signature.initSign(c);
            signature.update(bytes);
            String encodeToString = Base64.encodeToString(signature.sign(), 2);
            u.d("RsaSecurity", str.hashCode() + " = " + encodeToString);
            return encodeToString;
        } catch (Exception e) {
            e.printStackTrace();
            u.a("RsaSecurity", "signClientSDK error" + e.getMessage());
            return null;
        }
    }

    @Override // com.vivo.push.e.a
    public final PublicKey a() {
        try {
            if (this.b != null) {
                return this.b;
            }
            KeyStore.Entry d = d(this.e);
            if (!(d instanceof KeyStore.PrivateKeyEntry)) {
                return null;
            }
            this.b = ((KeyStore.PrivateKeyEntry) d).getCertificate().getPublicKey();
            return this.b;
        } catch (Exception e) {
            e.printStackTrace();
            u.a("RsaSecurity", "getPublicKeySign error" + e.getMessage());
            return null;
        }
    }

    @Override // com.vivo.push.e.a
    public final boolean a(byte[] bArr, PublicKey publicKey, byte[] bArr2) {
        try {
            Signature signature = Signature.getInstance("SHA256withRSA");
            signature.initVerify(publicKey);
            signature.update(bArr);
            return signature.verify(bArr2);
        } catch (Exception e) {
            e.printStackTrace();
            u.a("RsaSecurity", "verifyClientSDK error" + e.getMessage());
            return false;
        }
    }
}
