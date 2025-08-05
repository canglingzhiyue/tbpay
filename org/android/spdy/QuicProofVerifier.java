package org.android.spdy;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.ByteArrayInputStream;
import java.nio.charset.StandardCharsets;
import java.security.cert.CertPathValidator;
import java.security.cert.CertPathValidatorException;
import java.security.cert.CertificateFactory;
import java.security.cert.PKIXParameters;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Set;
import tb.sad;

/* loaded from: classes.dex */
public class QuicProofVerifier {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "tnetsdk.QuicProofVerifier";

    public static int VerifyProof(String str, String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b9324716", new Object[]{str, strArr})).intValue();
        }
        if (!b.f25074a) {
            return (!sad.K() || !SpdyAgent.isInAllowLaunchTimePass(3000L)) ? 0 : 1;
        }
        try {
            CertificateFactory f = b.a().f();
            if (f == null) {
                return 0;
            }
            ArrayList arrayList = new ArrayList();
            PKIXParameters pKIXParametersFromPresetCA = getPKIXParametersFromPresetCA();
            CertPathValidator d = b.a().d();
            if (pKIXParametersFromPresetCA == null || d == null) {
                spduLog.Logd(TAG, "Initialize fail, params = " + pKIXParametersFromPresetCA + " validator = " + d);
                return 0;
            }
            for (String str2 : strArr) {
                arrayList.add((X509Certificate) f.generateCertificate(new ByteArrayInputStream(str2.getBytes(StandardCharsets.ISO_8859_1))));
            }
            try {
                d.validate(f.generateCertPath(arrayList), pKIXParametersFromPresetCA);
            } catch (CertPathValidatorException e) {
                spduLog.Tloge(TAG, null, "validator excetion", "e", e);
            }
            return 1;
        } catch (Throwable th) {
            th.printStackTrace();
            return 0;
        }
    }

    private static PKIXParameters getPKIXParametersFromPresetCA() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PKIXParameters) ipChange.ipc$dispatch("e475b4cc", new Object[0]);
        }
        PKIXParameters c = b.a().c();
        if (c != null) {
            return c;
        }
        Set<TrustAnchor> e = b.a().e();
        if (e != null) {
            return b.a().a(e);
        }
        return null;
    }
}
