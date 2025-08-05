package tb;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.phone.iifaa.did.api.DIDResult;
import com.alipay.android.phone.iifaa.did.common.DigitalEnvelopeModel;
import com.alipay.android.phone.iifaa.did.model.PublicKeyJwk;

/* loaded from: classes2.dex */
public class irh extends iqz {

    /* renamed from: a  reason: collision with root package name */
    public PublicKeyJwk f29248a;

    public irh(PublicKeyJwk publicKeyJwk) {
        this.f29248a = publicKeyJwk;
    }

    @Override // tb.iqz
    public DIDResult a(Context context, String str, String str2) {
        String kty = this.f29248a.getKty();
        String crv = this.f29248a.getCrv();
        if (ifh.a(kty, crv) || !"EC".equalsIgnoreCase(kty) || !"sm2p256v1".equalsIgnoreCase(crv)) {
            return new DIDResult(DIDResult.a.NOT_SUPPORT).setMessage("暂不支持非国密 jwk");
        }
        try {
            DigitalEnvelopeModel digitalEnvelopeModel = (DigitalEnvelopeModel) JSONObject.parseObject(str2, DigitalEnvelopeModel.class);
            if (digitalEnvelopeModel == null || ifh.a(digitalEnvelopeModel.getAlgorithm(), digitalEnvelopeModel.getCipher(), digitalEnvelopeModel.getKeyCipher())) {
                return new DIDResult(DIDResult.a.WRONG_PARAMS);
            }
            String a2 = ifh.a("SM2_SM4_CBC_PKCS5", digitalEnvelopeModel, str);
            return TextUtils.isEmpty(a2) ? new DIDResult(DIDResult.a.FAILED_OPT_CRYPTO) : new DIDResult(DIDResult.a.SUCCESS).setData(a2);
        } catch (Exception e) {
            e.printStackTrace();
            return new DIDResult(DIDResult.a.FAILED_EXCP);
        }
    }

    @Override // tb.iqz
    public DIDResult b(Context context, String str, String str2) {
        String kty = this.f29248a.getKty();
        String crv = this.f29248a.getCrv();
        if (ifh.a(kty, crv) || !"EC".equalsIgnoreCase(kty) || !"sm2p256v1".equalsIgnoreCase(crv)) {
            return new DIDResult(DIDResult.a.NOT_SUPPORT).setMessage("暂不支持非国密 jwk");
        }
        byte[] a2 = ifj.a().d.a(str, str2.getBytes(), "1234567812345678".getBytes());
        return (a2 == null || a2.length == 0) ? new DIDResult(DIDResult.a.FAILED_OPT_CRYPTO) : new DIDResult(DIDResult.a.SUCCESS).setData(ifh.a(a2));
    }
}
