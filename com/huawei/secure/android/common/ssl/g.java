package com.huawei.secure.android.common.ssl;

import android.content.Context;
import java.io.IOException;
import java.io.InputStream;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import tb.cyp;
import tb.cyr;
import tb.cyt;
import tb.cyu;

/* loaded from: classes4.dex */
public class g implements X509TrustManager {
    private static final String b = "g";
    public static final String d = "hmsrootcas.bks";

    /* renamed from: a  reason: collision with root package name */
    protected List<X509TrustManager> f7611a;
    private X509Certificate[] c;

    public g(Context context) throws IOException, NoSuchAlgorithmException, CertificateException, KeyStoreException, IllegalArgumentException {
        this(context, false);
    }

    public g(Context context, boolean z) throws IOException, NoSuchAlgorithmException, CertificateException, KeyStoreException, IllegalArgumentException {
        this.f7611a = new ArrayList();
        if (context != null) {
            cyr.a(context);
            if (z) {
                a();
            }
            a(context);
            if (this.f7611a.isEmpty()) {
                throw new CertificateException("X509TrustManager is empty");
            }
            return;
        }
        throw new IllegalArgumentException("context is null");
    }

    public g(InputStream inputStream, String str) throws IllegalArgumentException {
        this.f7611a = new ArrayList();
        a(inputStream, str);
    }

    private void a() {
        cyu.a(b, "loadSystemCA");
        long currentTimeMillis = System.currentTimeMillis();
        try {
            KeyStore keyStore = KeyStore.getInstance("AndroidCAStore");
            keyStore.load(null, null);
            TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance("X509");
            trustManagerFactory.init(keyStore);
            TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
            for (int i = 0; i < trustManagers.length; i++) {
                if (trustManagers[i] instanceof X509TrustManager) {
                    this.f7611a.add((X509TrustManager) trustManagers[i]);
                }
            }
        } catch (IOException | NegativeArraySizeException | KeyStoreException | NoSuchAlgorithmException | CertificateException e) {
            cyu.c(b, "loadSystemCA: exception : " + e.getMessage());
        }
        String str = "loadSystemCA: cost : " + (System.currentTimeMillis() - currentTimeMillis) + " ms";
    }

    private void a(Context context) throws CertificateException, NoSuchAlgorithmException, KeyStoreException, IOException {
        boolean z;
        cyu.a(b, "loadBksCA");
        long currentTimeMillis = System.currentTimeMillis();
        InputStream b2 = cyp.b(context);
        if (b2 != null) {
            try {
                cyu.a(b, "get bks not from assets");
                a(b2);
            } catch (IOException | KeyStoreException | NoSuchAlgorithmException | CertificateException e) {
                cyu.c(b, "loadBksCA: exception : " + e.getMessage());
                z = false;
            }
        }
        z = true;
        if (!z || b2 == null) {
            cyu.a(b, " get bks from assets ");
            a(context.getAssets().open(d));
        }
        String str = "loadBksCA: cost : " + (System.currentTimeMillis() - currentTimeMillis) + " ms";
    }

    private void a(InputStream inputStream) throws NoSuchAlgorithmException, KeyStoreException, CertificateException, IOException {
        try {
            TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance("X509");
            KeyStore keyStore = KeyStore.getInstance("bks");
            keyStore.load(inputStream, "".toCharArray());
            trustManagerFactory.init(keyStore);
            TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
            for (int i = 0; i < trustManagers.length; i++) {
                if (trustManagers[i] instanceof X509TrustManager) {
                    this.f7611a.add((X509TrustManager) trustManagers[i]);
                }
            }
        } finally {
            cyt.a(inputStream);
        }
    }

    private void a(InputStream inputStream, String str) {
        if (inputStream == null || str == null) {
            throw new IllegalArgumentException("inputstream or trustPwd is null");
        }
        long currentTimeMillis = System.currentTimeMillis();
        try {
            try {
                TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance("X509");
                KeyStore keyStore = KeyStore.getInstance("bks");
                keyStore.load(inputStream, str.toCharArray());
                trustManagerFactory.init(keyStore);
                TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
                for (int i = 0; i < trustManagers.length; i++) {
                    if (trustManagers[i] instanceof X509TrustManager) {
                        this.f7611a.add((X509TrustManager) trustManagers[i]);
                    }
                }
            } catch (IOException | NegativeArraySizeException | KeyStoreException | NoSuchAlgorithmException | CertificateException e) {
                cyu.c(b, "loadInputStream: exception : " + e.getMessage());
            }
            String str2 = "loadInputStream: cost : " + (System.currentTimeMillis() - currentTimeMillis) + " ms";
        } finally {
            cyt.a(inputStream);
        }
    }

    public void a(X509Certificate[] x509CertificateArr) {
        this.c = x509CertificateArr;
    }

    @Override // javax.net.ssl.X509TrustManager
    public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
        cyu.a(b, "checkClientTrusted: ");
        for (X509TrustManager x509TrustManager : this.f7611a) {
            try {
                x509TrustManager.checkServerTrusted(x509CertificateArr, str);
                return;
            } catch (CertificateException e) {
                String str2 = b;
                cyu.c(str2, "checkServerTrusted CertificateException" + e.getMessage());
            }
        }
        throw new CertificateException("checkServerTrusted CertificateException");
    }

    @Override // javax.net.ssl.X509TrustManager
    public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
        a(x509CertificateArr);
        cyu.a(b, "checkServerTrusted begin ,server ca chain size is : " + x509CertificateArr.length + " ,auth type is : " + str);
        long currentTimeMillis = System.currentTimeMillis();
        for (X509Certificate x509Certificate : x509CertificateArr) {
            String str2 = "server ca chain: getSubjectDN is :" + x509Certificate.getSubjectDN();
            String str3 = "IssuerDN :" + x509Certificate.getIssuerDN();
            String str4 = "SerialNumber : " + x509Certificate.getSerialNumber();
        }
        int size = this.f7611a.size();
        for (int i = 0; i < size; i++) {
            try {
                cyu.a(b, "check server i : " + i);
                X509TrustManager x509TrustManager = this.f7611a.get(i);
                X509Certificate[] acceptedIssuers = x509TrustManager.getAcceptedIssuers();
                if (acceptedIssuers != null) {
                    cyu.a(b, "client root ca size is : " + acceptedIssuers.length);
                    for (int i2 = 0; i2 < acceptedIssuers.length; i2++) {
                        String str5 = "client root ca getIssuerDN :" + acceptedIssuers[i2].getIssuerDN();
                    }
                }
                x509TrustManager.checkServerTrusted(x509CertificateArr, str);
                cyu.a(b, "checkServerTrusted succeed ,root ca issuer is : " + x509CertificateArr[x509CertificateArr.length - 1].getIssuerDN());
                return;
            } catch (CertificateException e) {
                cyu.c(b, "checkServerTrusted error :" + e.getMessage() + " , time : " + i);
                if (i == size - 1) {
                    if (x509CertificateArr != null && x509CertificateArr.length > 0) {
                        cyu.c(b, "root ca issuer : " + x509CertificateArr[x509CertificateArr.length - 1].getIssuerDN());
                    }
                    throw e;
                }
            }
        }
        String str6 = "checkServerTrusted: cost : " + (System.currentTimeMillis() - currentTimeMillis) + " ms";
    }

    @Override // javax.net.ssl.X509TrustManager
    public X509Certificate[] getAcceptedIssuers() {
        try {
            ArrayList arrayList = new ArrayList();
            for (X509TrustManager x509TrustManager : this.f7611a) {
                arrayList.addAll(Arrays.asList(x509TrustManager.getAcceptedIssuers()));
            }
            return (X509Certificate[]) arrayList.toArray(new X509Certificate[arrayList.size()]);
        } catch (Exception e) {
            String str = b;
            cyu.c(str, "getAcceptedIssuers exception : " + e.getMessage());
            return new X509Certificate[0];
        }
    }
}
