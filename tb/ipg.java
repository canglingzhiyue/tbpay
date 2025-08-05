package tb;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.phone.iifaa.did.api.DIDResult;
import com.alipay.android.phone.iifaa.did.model.DecentralizedID;
import com.alipay.android.phone.iifaa.did.model.DocumentSignData;
import com.alipay.android.phone.iifaa.did.model.PublicKeyJwk;
import com.alipay.android.phone.iifaa.did.model.VerificationMethod;
import com.alipay.android.phone.iifaa.did.rpc.model.CredentialRpcData;
import com.alipay.android.phone.iifaa.did.rpc.model.DidIdpRpcRequest;
import com.alipay.android.phone.iifaa.did.rpc.model.DidIdpRpcResponse;
import com.alipay.android.phone.iifaa.did.rpc.service.IifaaDidService;
import com.alipay.mobile.framework.service.common.impl.MpaasRpcServiceImpl;
import com.taobao.orange.OrangeConfig;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes2.dex */
public class ipg implements ifi {

    /* loaded from: classes2.dex */
    public class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f29204a;
        public final /* synthetic */ DecentralizedID b;
        public final /* synthetic */ DIDResult c;
        public final /* synthetic */ CredentialRpcData d;

        public a(ipg ipgVar, Context context, DecentralizedID decentralizedID, DIDResult dIDResult, CredentialRpcData credentialRpcData) {
            this.f29204a = context;
            this.b = decentralizedID;
            this.c = dIDResult;
            this.d = credentialRpcData;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x004a  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x010c  */
        /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:9:0x003b  */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void run() {
            /*
                r11 = this;
                android.content.Context r0 = r11.f29204a
                com.alipay.android.phone.iifaa.did.model.DecentralizedID r1 = r11.b
                com.alipay.android.phone.iifaa.did.api.DIDResult r2 = r11.c
                com.alipay.android.phone.iifaa.did.model.VerifiableCredential r2 = r2.getVcModel()
                com.alipay.android.phone.iifaa.did.rpc.model.CredentialRpcData r3 = r11.d
                com.alipay.android.phone.iifaa.did.common.DigitalEnvelopeModel r3 = r3.vcData
                java.lang.String r3 = com.alibaba.fastjson.JSONObject.toJSONString(r3)
                java.lang.String r4 = r1.getId()
                java.lang.String r5 = r2.getId()
                java.lang.String r4 = tb.ifh.n(r4)
                java.lang.String r5 = tb.ifh.n(r5)
                r6 = 0
                android.content.SharedPreferences r4 = r0.getSharedPreferences(r4, r6)
                if (r4 == 0) goto L38
                android.content.SharedPreferences$Editor r4 = r4.edit()
                r4.putString(r5, r3)
                boolean r3 = r4.commit()
                if (r3 == 0) goto L38
                r3 = 1
                goto L39
            L38:
                r3 = 0
            L39:
                if (r3 != 0) goto L4a
                com.alipay.android.phone.iifaa.did.api.DIDResult r0 = new com.alipay.android.phone.iifaa.did.api.DIDResult
                com.alipay.android.phone.iifaa.did.api.DIDResult$a r1 = com.alipay.android.phone.iifaa.did.api.DIDResult.a.FAILED_WRITE_FILE
                int r1 = r1.ordinal()
                java.lang.String r2 = "VC 密文 持久化存储失败"
                r0.<init>(r1, r2)
                goto L106
            L4a:
                com.alipay.android.phone.iifaa.did.model.VerifiableCredentialBasicInfo r3 = new com.alipay.android.phone.iifaa.did.model.VerifiableCredentialBasicInfo
                r3.<init>(r2)
                tb.ifj r2 = tb.ifj.a()
                tb.ifk r2 = r2.c
                java.lang.String r4 = r1.getId()
                java.lang.String r4 = tb.ifh.a(r4)
                tb.ifj$a r2 = (tb.ifj.a) r2
                java.lang.String r5 = "my_did_appid"
                java.lang.String r2 = r2.a(r5, r4)
                java.lang.Class<com.alipay.android.phone.iifaa.did.model.VerifiableCredentialBasicInfo> r4 = com.alipay.android.phone.iifaa.did.model.VerifiableCredentialBasicInfo.class
                java.util.List r2 = com.alibaba.fastjson.JSONObject.parseArray(r2, r4)
                if (r2 != 0) goto L72
                java.util.ArrayList r2 = new java.util.ArrayList
                r2.<init>()
            L72:
                r4 = 0
                java.util.Iterator r7 = r2.iterator()
            L77:
                boolean r8 = r7.hasNext()
                if (r8 == 0) goto La2
                java.lang.Object r8 = r7.next()
                com.alipay.android.phone.iifaa.did.model.VerifiableCredentialBasicInfo r8 = (com.alipay.android.phone.iifaa.did.model.VerifiableCredentialBasicInfo) r8
                java.lang.String r9 = r3.getIssuer()
                java.lang.String r10 = r8.getIssuer()
                boolean r9 = r9.equals(r10)
                if (r9 == 0) goto L77
                java.util.List r9 = r3.getType()
                java.util.List r10 = r8.getType()
                boolean r9 = r9.equals(r10)
                if (r9 != 0) goto La0
                goto L77
            La0:
                r4 = r8
                goto L77
            La2:
                if (r4 == 0) goto La7
                r2.remove(r4)
            La7:
                boolean r7 = r2.contains(r3)
                if (r7 != 0) goto Lb0
                r2.add(r3)
            Lb0:
                tb.ifj r7 = tb.ifj.a()
                tb.ifk r7 = r7.c
                java.lang.String r8 = r1.getId()
                java.lang.String r8 = tb.ifh.a(r8)
                java.lang.String r2 = com.alibaba.fastjson.JSONObject.toJSONString(r2)
                tb.ifj$a r7 = (tb.ifj.a) r7
                boolean r2 = r7.a(r5, r8, r2)
                if (r2 != 0) goto Ld8
                com.alipay.android.phone.iifaa.did.api.DIDResult r0 = new com.alipay.android.phone.iifaa.did.api.DIDResult
                com.alipay.android.phone.iifaa.did.api.DIDResult$a r1 = com.alipay.android.phone.iifaa.did.api.DIDResult.a.FAILED_WRITE_FILE
                int r1 = r1.ordinal()
                java.lang.String r2 = "VC 持久化存储失败"
                r0.<init>(r1, r2)
                goto L106
            Ld8:
                if (r4 == 0) goto Lfb
                java.lang.String r1 = r1.getId()
                java.lang.String r2 = r4.getId()
                java.lang.String r1 = tb.ifh.n(r1)
                java.lang.String r2 = tb.ifh.n(r2)
                android.content.SharedPreferences r0 = r0.getSharedPreferences(r1, r6)
                if (r0 == 0) goto Lfb
                android.content.SharedPreferences$Editor r0 = r0.edit()
                android.content.SharedPreferences$Editor r0 = r0.remove(r2)
                r0.apply()
            Lfb:
                com.alipay.android.phone.iifaa.did.api.DIDResult r0 = new com.alipay.android.phone.iifaa.did.api.DIDResult
                com.alipay.android.phone.iifaa.did.api.DIDResult$a r1 = com.alipay.android.phone.iifaa.did.api.DIDResult.a.SUCCESS
                r0.<init>(r1)
                com.alipay.android.phone.iifaa.did.api.DIDResult r0 = r0.setVcBasicInfo(r3)
            L106:
                com.alipay.android.phone.iifaa.did.model.VerifiableCredentialBasicInfo r0 = r0.getVcBasicInfo()
                if (r0 != 0) goto L118
                tb.iqh r0 = tb.iqh.a()
                java.lang.String r1 = "TrustedCertServiceImpl"
                java.lang.String r2 = "凭证导入失败"
                r0.c(r1, r2)
            L118:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: tb.ipg.a.run():void");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:166:0x048f, code lost:
        r1 = r9;
     */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0624  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0634  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x06b8  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x06c6  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x02f1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.alibaba.fastjson.JSONObject a(android.content.Context r22, com.alibaba.fastjson.JSONObject r23) {
        /*
            Method dump skipped, instructions count: 2114
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.ipg.a(android.content.Context, com.alibaba.fastjson.JSONObject):com.alibaba.fastjson.JSONObject");
    }

    public final DecentralizedID a(Context context) {
        DocumentSignData documentSignData;
        try {
            VerificationMethod a2 = a();
            if (a2 == null) {
                iqh.a().c("TrustedCertServiceImpl", "SM2 VM 创建失败");
                return null;
            }
            DidIdpRpcResponse a3 = a(context, DidIdpRpcRequest.ACTION_CREATE, a2, null, null);
            if (a3 == null || (documentSignData = a3.signDocument) == null) {
                iqh.a().c("TrustedCertServiceImpl", "DID 创建失败");
                return null;
            }
            String did = ifh.i(JSONObject.toJSONString(documentSignData)).getDid();
            if (!TextUtils.isEmpty(did)) {
                return ifh.e(did);
            }
            iqh.a().c("TrustedCertServiceImpl", "DID 导入失败");
            return null;
        } catch (Exception e) {
            iqh.a().c("TrustedCertServiceImpl", "DID 创建异常");
            iqh.a().c("TrustedCertServiceImpl", e.getLocalizedMessage());
            return null;
        }
    }

    public final DecentralizedID a(Context context, String str, DocumentSignData documentSignData) {
        try {
            DidIdpRpcResponse a2 = a(context, DidIdpRpcRequest.ACTION_SYNC, null, str, documentSignData);
            if (a2 != null && a2.success && 100000 == a2.errCode) {
                return ifh.e(str);
            }
            if (a2 == null || 100120 != a2.errCode) {
                return null;
            }
            iqh.a().c("TrustedCertServiceImpl", "DID文档验签失败，删除后重新创建");
            ifh.f(str);
            return a(context);
        } catch (Exception e) {
            iqh.a().c("TrustedCertServiceImpl", "DID 同步异常");
            iqh.a().c("TrustedCertServiceImpl", e.getLocalizedMessage());
            return null;
        }
    }

    public final DecentralizedID a(Context context, String str, boolean z) {
        DocumentSignData documentSignData;
        VerificationMethod verificationMethod;
        try {
            iqh.a().b("TrustedCertServiceImpl", "进入 getAndCheckAvailableDID,vmType=" + str);
            String a2 = ifh.a();
            if (!TextUtils.isEmpty(a2)) {
                documentSignData = ifh.h(a2);
                if (documentSignData == null) {
                    ifh.f(a2);
                    a2 = null;
                }
            } else {
                documentSignData = null;
            }
            if (TextUtils.isEmpty(a2)) {
                if (z) {
                    return a(context);
                }
                iqh.a().c("TrustedCertServiceImpl", "本地无可用 DID");
                return null;
            }
            DecentralizedID e = ifh.e(a2);
            Iterator<VerificationMethod> it = e.getVerificationMethods().iterator();
            while (true) {
                if (!it.hasNext()) {
                    verificationMethod = null;
                    break;
                }
                verificationMethod = it.next();
                if (VerificationMethod.VM_JWK2020.equalsIgnoreCase(verificationMethod.getType()) && "EC".equalsIgnoreCase(verificationMethod.getPublicKeyJwk().getKty()) && "sm2p256v1".equalsIgnoreCase(verificationMethod.getPublicKeyJwk().getCrv())) {
                    break;
                }
            }
            if (verificationMethod != null) {
                return z ? a(context, a2, documentSignData) : e;
            } else if (z) {
                return b(context, a2, documentSignData);
            } else {
                iqh.a().c("TrustedCertServiceImpl", "本地没有满足条件的 VM，VM_TYPE=" + str);
                return null;
            }
        } catch (Exception e2) {
            iqh.a().c("TrustedCertServiceImpl", e2.getMessage());
            return null;
        }
    }

    public final VerificationMethod a() {
        try {
            DIDResult a2 = ifh.a(VerificationMethod.VM_SM2, "");
            if (TextUtils.isEmpty(a2.getPublicKey())) {
                return null;
            }
            VerificationMethod verificationMethod = new VerificationMethod();
            verificationMethod.setType(VerificationMethod.VM_JWK2020);
            PublicKeyJwk publicKeyJwk = new PublicKeyJwk("EC", "sm2p256v1");
            publicKeyJwk.parseRawPubKey(a2.getPublicKey());
            verificationMethod.setPublicKeyJwk(publicKeyJwk);
            verificationMethod.setSecurityLevel(ifh.a(0, 1));
            return verificationMethod;
        } catch (Exception e) {
            iqh.a().c("TrustedCertServiceImpl", e.getMessage());
            return null;
        }
    }

    public final DidIdpRpcResponse a(Context context, String str, VerificationMethod verificationMethod, String str2, DocumentSignData documentSignData) {
        try {
            MpaasRpcServiceImpl mpaasRpcServiceImpl = new MpaasRpcServiceImpl(context.getApplicationContext());
            IifaaDidService iifaaDidService = (IifaaDidService) mpaasRpcServiceImpl.getRpcProxy(IifaaDidService.class);
            mpaasRpcServiceImpl.getRpcInvokeContext(iifaaDidService).setGwUrl(iqg.a().b(context.getApplicationContext()));
            ArrayList arrayList = new ArrayList();
            arrayList.add(verificationMethod);
            DidIdpRpcRequest didIdpRpcRequest = new DidIdpRpcRequest();
            didIdpRpcRequest.action = str;
            didIdpRpcRequest.methods = arrayList;
            didIdpRpcRequest.did = str2;
            didIdpRpcRequest.signDocument = documentSignData;
            iqh a2 = iqh.a();
            a2.a("TrustedCertServiceImpl", "request: " + JSONObject.toJSONString(didIdpRpcRequest));
            DidIdpRpcResponse idpDispatch = iifaaDidService.idpDispatch(didIdpRpcRequest);
            iqh a3 = iqh.a();
            a3.a("TrustedCertServiceImpl", "resp: " + JSONObject.toJSONString(idpDispatch));
            return idpDispatch;
        } catch (Exception e) {
            iqh.a().c("TrustedCertServiceImpl", "接口请求异常");
            iqh.a().c("TrustedCertServiceImpl", e.getLocalizedMessage());
            return null;
        }
    }

    public JSONObject b(Context context, JSONObject jSONObject) {
        iqh.a().b("TrustedCertServiceImpl", "进入 initDID");
        if (!ifj.a().b()) {
            return DIDResult.genResult(DIDResult.a.FAILED_EXCP.ordinal(), "loadDIDSecuritySO failed");
        }
        ifj.a().b = context;
        if ("true".equals(OrangeConfig.getInstance().getCustomConfig("IIFAA_DID_FETCH_DISCLOSE_DEMOTED", ""))) {
            return DIDResult.genResult(DIDResult.a.FUNC_DEMOTED.ordinal(), "IIFAA客户端功能降级");
        }
        String string = jSONObject.getString("vmType");
        if (TextUtils.isEmpty(string)) {
            return DIDResult.genResult(DIDResult.a.WRONG_PARAMS);
        }
        DecentralizedID a2 = a(context, string, true);
        return a2 == null ? new DIDResult(DIDResult.a.FAILED_READ_FILE).setMessage("DID 身份状态异常").toJSONObject() : new DIDResult(DIDResult.a.SUCCESS).setDid(a2.getId()).toJSONObject();
    }

    public final DecentralizedID b(Context context, String str, DocumentSignData documentSignData) {
        try {
            VerificationMethod a2 = a();
            if (a2 == null) {
                iqh.a().c("TrustedCertServiceImpl", "SM2 VM 创建失败");
                return null;
            }
            DidIdpRpcResponse a3 = a(context, DidIdpRpcRequest.ACTION_ADD_VM, a2, str, documentSignData);
            if (a3 != null && a3.success && 100000 == a3.errCode) {
                if (!TextUtils.isEmpty(ifh.i(JSONObject.toJSONString(a3.signDocument)).getDid())) {
                    return ifh.e(str);
                }
                iqh.a().c("TrustedCertServiceImpl", "DID文档 insertOrUpdateDocument 失败");
                return null;
            } else if (a3 == null || 100120 != a3.errCode) {
                return null;
            } else {
                iqh.a().c("TrustedCertServiceImpl", "DID文档验签失败，删除后重新创建");
                ifh.f(str);
                return a(context);
            }
        } catch (Exception e) {
            iqh.a().c("TrustedCertServiceImpl", "DID 新增VM异常");
            iqh.a().c("TrustedCertServiceImpl", e.getLocalizedMessage());
            return null;
        }
    }
}
