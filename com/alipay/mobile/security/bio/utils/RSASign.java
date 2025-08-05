package com.alipay.mobile.security.bio.utils;

import android.util.Base64;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.Signature;
import java.security.SignatureException;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import tb.jhy;

/* loaded from: classes3.dex */
public class RSASign {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String SIGN_ALGORITHMS = "SHA1WithRSA";

    public static boolean doCheck(byte[] bArr, byte[] bArr2, InputStream inputStream) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("262f12c5", new Object[]{bArr, bArr2, inputStream})).booleanValue();
        }
        try {
            RSAPublicKey a2 = a(inputStream);
            Signature signature = Signature.getInstance("SHA1WithRSA");
            signature.initVerify(a2);
            signature.update(bArr);
            return signature.verify(bArr2);
        } catch (SignatureException e) {
            BioLog.e(e);
            return false;
        } catch (Exception e2) {
            BioLog.e(e2);
            return false;
        }
    }

    private static RSAPublicKey a(InputStream inputStream) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RSAPublicKey) ipChange.ipc$dispatch("2d5148b3", new Object[]{inputStream});
        }
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            StringBuilder sb = new StringBuilder();
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine != null) {
                    if (readLine.charAt(0) != '-') {
                        sb.append(readLine);
                        sb.append('\r');
                    }
                } else {
                    return a(sb.toString());
                }
            }
        } catch (IOException unused) {
            throw new Exception("公钥数据流读取错误");
        } catch (NullPointerException unused2) {
            throw new Exception("公钥输入流为空");
        }
    }

    private static RSAPublicKey a(String str) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RSAPublicKey) ipChange.ipc$dispatch("8cb7e87a", new Object[]{str});
        }
        try {
            return (RSAPublicKey) KeyFactory.getInstance(jhy.KEY_ALGORITHM).generatePublic(new X509EncodedKeySpec(Base64.decode(str, 0)));
        } catch (NullPointerException unused) {
            throw new Exception("公钥数据为空");
        } catch (NoSuchAlgorithmException unused2) {
            throw new Exception("无此算法");
        } catch (InvalidKeySpecException unused3) {
            throw new Exception("公钥非法");
        }
    }
}
