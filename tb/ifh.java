package tb;

import a.a.a.a.a.a.b.a.c.a;
import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.phone.iifaa.did.api.DIDResult;
import com.alipay.android.phone.iifaa.did.common.DigitalEnvelopeModel;
import com.alipay.android.phone.iifaa.did.model.DecentralizedID;
import com.alipay.android.phone.iifaa.did.model.DocumentSignData;
import com.alipay.android.phone.iifaa.did.model.VerifiableCredential;
import com.alipay.android.phone.iifaa.did.model.VerifiableCredentialBasicInfo;
import com.alipay.android.phone.iifaa.did.model.VerificationMethod;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import tb.ifj;

/* loaded from: classes2.dex */
public class ifh {
    public static int a(int i, int i2) {
        return i + (i2 << 8);
    }

    public static DIDResult a(Context context, String str, DecentralizedID decentralizedID) {
        if (TextUtils.isEmpty(str)) {
            return new DIDResult(DIDResult.a.WRONG_PARAMS).setMessage("数据异常，无法解密");
        }
        DigitalEnvelopeModel digitalEnvelopeModel = (DigitalEnvelopeModel) JSON.parseObject(str, DigitalEnvelopeModel.class);
        if (digitalEnvelopeModel == null || DigitalEnvelopeModel.isInValidEncEnvelope(digitalEnvelopeModel)) {
            return new DIDResult(DIDResult.a.WRONG_PARAMS).setMessage("数据异常，信封加密数据不完整，无法解密");
        }
        VerificationMethod verificationMethod = null;
        for (VerificationMethod verificationMethod2 : decentralizedID.getVerificationMethods()) {
            if (verificationMethod2.getId().equalsIgnoreCase(digitalEnvelopeModel.getKeyAlias())) {
                verificationMethod = verificationMethod2;
            }
        }
        if (verificationMethod == null) {
            return new DIDResult(DIDResult.a.FAILED_PARSE_DATA).setMessage("该DID下 无对应的VMID");
        }
        if (VerificationMethod.VM_JWK2020.equals(verificationMethod.getType())) {
            return new irh(verificationMethod.getPublicKeyJwk()).a(context, digitalEnvelopeModel.getKeyAlias(), str, "vcDecrypt");
        }
        DIDResult dIDResult = new DIDResult(DIDResult.a.NOT_SUPPORT);
        return dIDResult.setMessage("暂不支持该类型的DID授权，type：" + verificationMethod.getType());
    }

    public static DIDResult a(String str, String str2) {
        String str3;
        try {
            if (((str.hashCode() != 82200 || !str.equals(VerificationMethod.VM_SM2)) ? (char) 65535 : (char) 0) != 0) {
                return new DIDResult(DIDResult.a.WRONG_PARAMS);
            }
            a a2 = ifj.a().d.a();
            if (a2 == null) {
                g("genDIDKeyInfo, 秘钥对创建失败，algorithm：" + str);
                return new DIDResult(DIDResult.a.FAILED_OPT_CRYPTO).setMessage("秘钥对创建失败");
            }
            g("genDIDKeyInfo, 公钥 Der1：" + a2.f1044a);
            String k = k(a2.f1044a);
            g("genDIDKeyInfo, 公钥 Der2：" + k);
            String n = n(k);
            if (TextUtils.isEmpty(n)) {
                return new DIDResult(DIDResult.a.FAILED_OPT_CRYPTO).setMessage("公钥Hash异常");
            }
            g("genDIDKeyInfo, 秘钥索引：" + n);
            ifk ifkVar = ifj.a().c;
            StringBuilder sb = new StringBuilder();
            sb.append(a2.b);
            if (TextUtils.isEmpty(str2)) {
                str3 = "";
            } else {
                str3 = "_" + str2;
            }
            sb.append(str3);
            if (((ifj.a) ifkVar).a("my_did_appid", n, sb.toString())) {
                return new DIDResult(DIDResult.a.SUCCESS).setPublicKey(k);
            }
            g("genDIDKeyInfo, 秘钥存储异常");
            return new DIDResult(DIDResult.a.FAILED_WRITE_FILE).setMessage("秘钥存储异常");
        } catch (Exception e) {
            g("genDIDKeyInfo, RSA 秘钥长度 参数异常，e:" + e.getMessage());
            return new DIDResult(DIDResult.a.FAILED_OPT_CRYPTO).setMessage("RSA 秘钥长度 参数异常，e:" + e.getMessage());
        }
    }

    public static String a() {
        List parseArray = JSONObject.parseArray(((ifj.a) ifj.a().c).a("my_did_appid", "did_alias"), String.class);
        if (parseArray == null || parseArray.size() <= 0) {
            return null;
        }
        return (String) parseArray.get(0);
    }

    public static String a(String str) {
        return str + "_vclist";
    }

    public static String a(String str, DigitalEnvelopeModel digitalEnvelopeModel, String str2) {
        char c;
        String str3;
        int hashCode = str.hashCode();
        if (hashCode != -1089186788) {
            if (hashCode == -40278557 && str.equals("SM2_SM4_CBC_PKCS5")) {
                c = 0;
            }
            c = 65535;
        } else {
            if (str.equals("ENVELOP_IIFAA")) {
                c = 1;
            }
            c = 65535;
        }
        String str4 = null;
        if (c != 0) {
            c("Not support envelop type:" + str);
            return null;
        }
        String keyCipher = digitalEnvelopeModel.getKeyCipher();
        String cipher = digitalEnvelopeModel.getCipher();
        try {
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (a(str2, keyCipher, cipher)) {
            str3 = "wrong params";
        } else {
            byte[] a2 = ifj.a().d.a(VerificationMethod.VM_SM2, str2, l(keyCipher));
            if (a2.length == 32) {
                str4 = new String(ifj.a().d.a("SM4_CBC_PKCS7Padding", Arrays.copyOfRange(a2, 0, 16), Arrays.copyOfRange(a2, 16, 32), l(cipher)), Charset.defaultCharset());
                return str4;
            }
            str3 = "wrong key cipher, should be  { Key 16byte + IV 16byte }";
        }
        c(str3);
        return str4;
    }

    public static String a(byte[] bArr) {
        return new String(Base64.encode(bArr, 0), Charset.defaultCharset()).replace("\n", "").replace("\r", "");
    }

    public static List<VerifiableCredentialBasicInfo> a(String str, List<String> list, String str2) {
        ArrayList arrayList = new ArrayList();
        String a2 = ((ifj.a) ifj.a().c).a("my_did_appid", a(str));
        if (TextUtils.isEmpty(a2)) {
            return arrayList;
        }
        List<VerifiableCredentialBasicInfo> parseArray = JSONObject.parseArray(a2, VerifiableCredentialBasicInfo.class);
        if ((list == null || list.size() == 0) && TextUtils.isEmpty(str2)) {
            return parseArray;
        }
        if (list != null && list.size() != 0) {
            ArrayList arrayList2 = new ArrayList();
            for (String str3 : list) {
                for (VerifiableCredentialBasicInfo verifiableCredentialBasicInfo : parseArray) {
                    if (verifiableCredentialBasicInfo.getType().contains(str3)) {
                        arrayList2.add(verifiableCredentialBasicInfo);
                    }
                }
            }
            parseArray = arrayList2;
        }
        if (TextUtils.isEmpty(str2)) {
            return parseArray;
        }
        ArrayList arrayList3 = new ArrayList();
        for (VerifiableCredentialBasicInfo verifiableCredentialBasicInfo2 : parseArray) {
            if (str2.equals(verifiableCredentialBasicInfo2.getIssuer())) {
                arrayList3.add(verifiableCredentialBasicInfo2);
            }
        }
        return arrayList3;
    }

    public static boolean a(String... strArr) {
        for (String str : strArr) {
            if (TextUtils.isEmpty(str)) {
                return true;
            }
        }
        return false;
    }

    public static String b(String str) {
        return str + "_key_alias";
    }

    public static String b(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        for (byte b : bArr) {
            String hexString = Integer.toHexString(b & 255);
            if (hexString.length() == 1) {
                sb.append('0');
            }
            sb.append(hexString);
        }
        return sb.toString();
    }

    public static void c(String str) {
        iqh.a().c("EnvelopCryptoUtils", str);
    }

    public static String d(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(str.getBytes("UTF-8"));
            StringBuilder sb = new StringBuilder();
            for (byte b : messageDigest.digest()) {
                String hexString = Integer.toHexString(b & 255);
                if (hexString.length() == 1) {
                    sb.append("0");
                }
                sb.append(hexString);
            }
            return sb.toString();
        } catch (UnsupportedEncodingException | NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    public static DecentralizedID e(String str) {
        DocumentSignData h = h(str);
        if (h == null || TextUtils.isEmpty(h.getDocument())) {
            g("getDIDModel,本地对应DID Document数据");
            return null;
        }
        DecentralizedID fromJson = DecentralizedID.fromJson(h.getDocument());
        if (fromJson != null) {
            return fromJson;
        }
        g("getDIDModel,本地对应DID Document 结构异常");
        return fromJson;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0169 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean f(java.lang.String r10) {
        /*
            Method dump skipped, instructions count: 369
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.ifh.f(java.lang.String):boolean");
    }

    public static void g(String str) {
        iqh.a().a("DIDDataHelper", str);
    }

    public static DocumentSignData h(String str) {
        String a2 = ((ifj.a) ifj.a().c).a("my_did_appid", str);
        if (!TextUtils.isEmpty(a2)) {
            return (DocumentSignData) JSONObject.parseObject(a2, DocumentSignData.class);
        }
        return null;
    }

    public static DIDResult i(String str) {
        DocumentSignData documentSignData = (DocumentSignData) JSONObject.parseObject(str, DocumentSignData.class);
        if (documentSignData == null || TextUtils.isEmpty(documentSignData.getDocument())) {
            g("importDID, DocumentSignData 格式异常");
            return new DIDResult(DIDResult.a.FAILED_PARSE_DATA).setMessage("did Document 格式异常");
        }
        DecentralizedID fromJson = DecentralizedID.fromJson(documentSignData.getDocument());
        if (fromJson == null || TextUtils.isEmpty(fromJson.getId())) {
            g("importDID, did Document 格式异常");
            return new DIDResult(DIDResult.a.FAILED_PARSE_DATA).setMessage("did Document 格式异常");
        }
        for (VerificationMethod verificationMethod : fromJson.getVerificationMethods()) {
            if (TextUtils.isEmpty(((ifj.a) ifj.a().c).a("my_did_appid", b(verificationMethod.getId())))) {
                String derPubKey = VerificationMethod.getDerPubKey(verificationMethod);
                if (TextUtils.isEmpty(derPubKey)) {
                    g("importDID, 计算临时索引时，公钥解析异常");
                    return new DIDResult(DIDResult.a.FAILED_PARSE_DATA).setMessage("公钥解析异常");
                }
                String n = n(derPubKey);
                String a2 = ((ifj.a) ifj.a().c).a("my_did_appid", n);
                g("importDID,VM ID：" + verificationMethod.getId());
                g("importDID,临时秘钥索引：" + n);
                ((ifj.a) ifj.a().c).b("my_did_appid", n);
                if (TextUtils.isEmpty(a2)) {
                    g("importDID, 本地秘钥查询异常");
                    return new DIDResult(DIDResult.a.FAILED_READ_FILE).setMessage("本地秘钥查询异常");
                }
                if (!((ifj.a) ifj.a().c).a("my_did_appid", b(verificationMethod.getId()), a2)) {
                    g("importDID, 本地秘钥索引更新失败");
                    return new DIDResult(DIDResult.a.FAILED_WRITE_FILE).setMessage("本地秘钥索引更新失败");
                }
            }
        }
        List parseArray = JSONObject.parseArray(((ifj.a) ifj.a().c).a("my_did_appid", "did_alias"), String.class);
        if (parseArray == null) {
            parseArray = new ArrayList();
        }
        if (!parseArray.contains(fromJson.getId())) {
            parseArray.add(fromJson.getId());
        }
        if (((ifj.a) ifj.a().c).a("my_did_appid", "did_alias", JSONObject.toJSONString(parseArray))) {
            if (((ifj.a) ifj.a().c).a("my_did_appid", fromJson.getId(), str)) {
                return new DIDResult(DIDResult.a.SUCCESS).setDid(fromJson.getId());
            }
        }
        g("importDID, 更新DID索引数据 或 写入DID Document 异常");
        f(fromJson.getId());
        return new DIDResult(DIDResult.a.FAILED_WRITE_FILE).setMessage("更新DID索引数据 或 写入DID Document 异常");
    }

    public static DIDResult j(String str) {
        JSONObject parseObject = JSONObject.parseObject(str);
        if (parseObject == null || (!parseObject.containsKey("vc") && !parseObject.containsKey("credentialSubject"))) {
            return new DIDResult(DIDResult.a.FAILED_PARSE_DATA.ordinal(), "VC数据格式异常，解析失败");
        }
        if (!parseObject.containsKey("credentialSubject")) {
            if (!parseObject.containsKey("vc")) {
                return new DIDResult(DIDResult.a.FAILED_PARSE_DATA.ordinal(), "VC数据格式异常，解析失败");
            }
            str = parseObject.getString("vc");
        }
        VerifiableCredential verifiableCredential = (VerifiableCredential) JSONObject.parseObject(str, VerifiableCredential.class);
        return verifiableCredential == null ? new DIDResult(DIDResult.a.FAILED_PARSE_DATA.ordinal(), "VC Json解析异常") : new DIDResult(DIDResult.a.SUCCESS).setVcModel(verifiableCredential);
    }

    public static String k(String str) {
        return str.replace("-----BEGIN PUBLIC KEY-----\n", "").replace("-----END PUBLIC KEY-----\n", "").replace("\n", "").replace("\r", "");
    }

    public static byte[] l(String str) {
        return Base64.decode(str.getBytes(Charset.defaultCharset()), 0);
    }

    public static byte[] m(String str) {
        if (str == null || str.isEmpty()) {
            return new byte[0];
        }
        String lowerCase = str.toLowerCase();
        byte[] bArr = new byte[lowerCase.length() / 2];
        int i = 0;
        for (int i2 = 0; i2 < bArr.length; i2++) {
            bArr[i2] = (byte) ((((byte) Character.digit(lowerCase.charAt(i), 16)) << 4) | ((byte) Character.digit(lowerCase.charAt(i + 1), 16)));
            i += 2;
        }
        return bArr;
    }

    public static String n(String str) {
        try {
            return b(MessageDigest.getInstance("MD5").digest(str.getBytes()));
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return null;
        }
    }
}
