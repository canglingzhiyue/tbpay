package com.meizu.cloud.pushsdk.c.c;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Base64;
import com.meizu.cloud.pushinternal.DebugLogger;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.json.JSONObject;
import tb.jhy;

/* loaded from: classes4.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private static a f7868a;
    private static final Object b = new Object();
    private byte[] c;
    private byte[] d;
    private byte[] e;
    private byte[] f;
    private byte[] g;
    private PublicKey h;
    private final SharedPreferences i;
    private final SharedPreferences j;
    private long k = 0;

    private a(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.x.y.1", 0);
        this.i = sharedPreferences;
        this.j = context.getSharedPreferences("com.x.y.2", 0);
        Integer.parseInt(sharedPreferences.getString("keyTimeout", "0"));
        sharedPreferences.getLong("createDate", 0L);
        h();
        byte[] bArr = this.c;
        if (bArr != null && bArr.length != 0) {
            byte[] bArr2 = this.d;
            if (bArr2 != null && bArr2.length != 0) {
                return;
            }
            PublicKey b2 = b(context);
            this.h = b2;
            if (b2 == null) {
                return;
            }
            b();
            return;
        }
        PublicKey b3 = b(context);
        this.h = b3;
        if (b3 != null) {
            c();
            return;
        }
        sharedPreferences.edit().clear().apply();
        try {
            a();
            PublicKey b4 = b(context);
            this.h = b4;
            if (b4 == null) {
                return;
            }
            c();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private String a(InputStream inputStream) {
        String str;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        while (true) {
            str = null;
            try {
                int read = inputStream.read();
                if (read == -1) {
                    break;
                }
                byteArrayOutputStream.write(read);
            } catch (IOException unused) {
            } catch (Throwable th) {
                try {
                    byteArrayOutputStream.close();
                } catch (IOException unused2) {
                }
                throw th;
            }
        }
        str = byteArrayOutputStream.toString();
        try {
            byteArrayOutputStream.close();
        } catch (IOException unused3) {
            return str;
        }
    }

    private void a() throws IOException {
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(PushConstants.URL_DOWNLOAD_PUBLIC_KEY).openConnection();
            httpURLConnection.setDoInput(true);
            httpURLConnection.setUseCaches(false);
            try {
                httpURLConnection.setRequestMethod("GET");
            } catch (ProtocolException e) {
                e.printStackTrace();
            }
            httpURLConnection.setRequestProperty("Charset", "UTF-8");
            InputStream inputStream = null;
            try {
                int responseCode = httpURLConnection.getResponseCode();
                a("code = " + responseCode);
                inputStream = httpURLConnection.getInputStream();
                if (inputStream != null) {
                    String a2 = a(inputStream);
                    a("body = " + a2);
                    if (!TextUtils.isEmpty(a2)) {
                        try {
                            JSONObject jSONObject = new JSONObject(a2);
                            if (jSONObject.getInt("code") == 200) {
                                String string = jSONObject.getString("value");
                                SharedPreferences.Editor edit = this.j.edit();
                                edit.putString("publicKey", string);
                                edit.apply();
                            }
                        } catch (Exception e2) {
                            b("downloadPublicKey message error " + e2.getMessage());
                        }
                    }
                }
            } finally {
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException unused) {
                    }
                }
                httpURLConnection.disconnect();
            }
        } catch (MalformedURLException unused2) {
        }
    }

    public static void a(Context context) {
        if (f7868a == null) {
            synchronized (b) {
                if (f7868a == null) {
                    f7868a = new a(context);
                }
            }
        }
    }

    private void a(String str) {
        DebugLogger.d("HttpKeyMgr", str);
    }

    private PublicKey b(Context context) {
        a("load publicKey from preference");
        String string = this.j.getString("publicKey", "");
        if (!TextUtils.isEmpty(string)) {
            try {
                return KeyFactory.getInstance(jhy.KEY_ALGORITHM).generatePublic(new X509EncodedKeySpec(Base64.decode(string, 2)));
            } catch (NoSuchAlgorithmException e) {
                e.printStackTrace();
                return null;
            } catch (InvalidKeySpecException e2) {
                e2.printStackTrace();
                return null;
            } catch (Exception e3) {
                e3.printStackTrace();
                return null;
            }
        }
        return null;
    }

    private void b() {
        try {
            Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
            cipher.init(1, this.h);
            byte[] doFinal = cipher.doFinal(this.c);
            this.d = doFinal;
            this.f = Base64.encode(doFinal, 2);
            a("***** aKey64: " + new String(this.f));
            SharedPreferences.Editor edit = this.i.edit();
            edit.putString("aKey64", new String(this.f));
            edit.apply();
        } catch (InvalidKeyException e) {
            e.printStackTrace();
        } catch (NoSuchAlgorithmException e2) {
            e2.printStackTrace();
        } catch (BadPaddingException e3) {
            e3.printStackTrace();
        } catch (IllegalBlockSizeException e4) {
            e4.printStackTrace();
        } catch (NoSuchPaddingException e5) {
            e5.printStackTrace();
        } catch (Exception e6) {
            e6.printStackTrace();
        }
    }

    private void b(String str) {
        DebugLogger.e("HttpKeyMgr", str);
    }

    private void c() {
        d();
        b();
    }

    private void d() {
        try {
            KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
            keyGenerator.init(128);
            byte[] encoded = keyGenerator.generateKey().getEncoded();
            this.c = encoded;
            this.e = Base64.encode(encoded, 2);
            a("***** rKey64: " + new String(this.e));
            SharedPreferences.Editor edit = this.i.edit();
            edit.putString("rKey64", new String(this.e));
            edit.apply();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static a e() {
        a aVar = f7868a;
        if (aVar != null) {
            return aVar;
        }
        throw new IllegalStateException("KeyMgr is not initialised - invoke at least once with parameterised init/get");
    }

    private void h() {
        a("loadKeys");
        String string = this.i.getString("sKey64", "");
        a("saved sKey64: " + string);
        if (!TextUtils.isEmpty(string)) {
            this.g = string.getBytes();
        }
        String string2 = this.i.getString("aKey64", "");
        a("saved aKey64: " + string2);
        if (!TextUtils.isEmpty(string2)) {
            byte[] bytes = string2.getBytes();
            this.f = bytes;
            this.d = Base64.decode(bytes, 2);
        }
        String string3 = this.i.getString("rKey64", "");
        a("saved rKey64: " + string3);
        if (!TextUtils.isEmpty(string3)) {
            byte[] bytes2 = string3.getBytes();
            this.e = bytes2;
            this.c = Base64.decode(bytes2, 2);
            a("saved rKey: " + new String(this.c));
        }
    }

    public byte[] a(byte[] bArr) {
        String str;
        byte[] bArr2 = this.c;
        if (bArr2 == null || bArr2.length == 0) {
            str = "rKey null!";
        } else if (bArr != null && bArr.length != 0) {
            a(">>>>>>>>>> encrypt input >>>>>>>>>>\n" + new String(Base64.encode(bArr, 2)));
            a("<<<<<<<<<< encrypt input <<<<<<<<<<");
            try {
                Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
                cipher.init(1, new SecretKeySpec(this.c, "AES"), new IvParameterSpec(this.c));
                byte[] doFinal = cipher.doFinal(bArr);
                a(">>>>>>>>>> encrypt output >>>>>>>>>>\n" + new String(Base64.encode(doFinal, 2)));
                a("<<<<<<<<<< encrypt output <<<<<<<<<<");
                return doFinal;
            } catch (InvalidAlgorithmParameterException e) {
                e.printStackTrace();
                return null;
            } catch (InvalidKeyException e2) {
                e2.printStackTrace();
                return null;
            } catch (NoSuchAlgorithmException e3) {
                e3.printStackTrace();
                return null;
            } catch (BadPaddingException e4) {
                e4.printStackTrace();
                return null;
            } catch (IllegalBlockSizeException e5) {
                e5.printStackTrace();
                return null;
            } catch (NoSuchPaddingException e6) {
                e6.printStackTrace();
                return null;
            } catch (Exception e7) {
                e7.printStackTrace();
                return null;
            }
        } else {
            str = "input null!";
        }
        b(str);
        return null;
    }

    public void c(String str) {
        this.g = str.getBytes();
        SharedPreferences.Editor edit = this.i.edit();
        edit.putString("sKey64", new String(this.g));
        edit.apply();
    }

    public byte[] f() {
        return this.f;
    }

    public byte[] g() {
        return this.g;
    }
}
