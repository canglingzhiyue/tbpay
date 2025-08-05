package com.taobao.android.riverlogger.inspector;

import android.util.Base64;
import com.android.alibaba.ip.runtime.IpChange;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import tb.jhy;
import tb.kge;

/* loaded from: classes6.dex */
public class j {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static PublicKey f14919a;

    static {
        kge.a(-1727947644);
    }

    public static boolean a(byte[] bArr, byte[] bArr2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bb72cc3a", new Object[]{bArr, bArr2})).booleanValue();
        }
        try {
            Signature signature = Signature.getInstance("SHA256WithRSA");
            signature.initVerify(a());
            signature.update(bArr);
            return signature.verify(bArr2);
        } catch (Exception unused) {
            return false;
        }
    }

    private static PublicKey a() throws NoSuchAlgorithmException, InvalidKeySpecException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PublicKey) ipChange.ipc$dispatch("6297905", new Object[0]);
        }
        if (f14919a == null) {
            f14919a = KeyFactory.getInstance(jhy.KEY_ALGORITHM).generatePublic(new X509EncodedKeySpec(Base64.decode("MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEArlNJx85tVyR+jWmjFhwT7CAc2o0Fu8NGEhX/yHyJcJSrRgCdXiheAwaE6Nhex8y8uw4U1gIplq8tKqowMFcF7v67AXA4oS68yI6ci7wCSOSI58OsvW1ACD10mG7gmO/8/zphiSDYLZbQLzH29YSutnc5nAabSGZcZ4PG2JwcqefwWK9ei6RJKa10XcZ5e4qU0fQqBlOFSdy4MaBoDBJiGbvrkVfPuic2ApmbwP0vVLcml0WmP+vECpA18xoUAFpvjGgTUdZ9swTjzoQuO4adeWiZNO3lpG5/pZmVuUlufPb9rA8EZW/Tp9/10DCVu0wcga6IROtAiD8O/5xRBOXKDQIDAQAB", 0)));
        }
        return f14919a;
    }
}
