package com.alipay.mobile.security.bio.workspace;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import com.alibaba.fastjson.JSON;
import com.alipay.bis.common.service.facade.gw.model.common.BisJson.BioAppConfig;
import com.alipay.bis.common.service.facade.gw.model.common.BisJson.BisClientConfig;
import com.alipay.bis.common.service.facade.gw.model.common.BisJson.BisClientConfigContent;
import com.alipay.mobile.security.bio.api.BioDetector;
import com.alipay.mobile.security.bio.api.BioParameter;
import com.alipay.mobile.security.bio.exception.BioIllegalArgumentException;
import com.alipay.mobile.security.bio.service.BioAppDescription;
import com.alipay.mobile.security.bio.service.BioServiceManager;
import com.alipay.mobile.security.bio.utils.BioLog;
import com.alipay.mobile.security.bio.utils.InputStreamUtils;
import com.alipay.mobile.security.bio.utils.RSASign;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.InputStream;
import java.util.Map;

/* loaded from: classes3.dex */
public class JsonToBioApp extends BaseBioParameterToBioApp {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public JsonToBioApp(Context context, BioTransfer bioTransfer) {
        super(context, bioTransfer);
    }

    @Override // com.alipay.mobile.security.bio.workspace.BaseBioParameterToBioApp
    public BioAppDescription toBioApp(BioParameter bioParameter) {
        int i;
        String remove;
        boolean doCheck;
        int i2;
        String remove2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BioAppDescription) ipChange.ipc$dispatch("8e3525cc", new Object[]{this, bioParameter});
        }
        if (bioParameter == null) {
            throw new BioIllegalArgumentException();
        }
        String protocol = bioParameter.getProtocol();
        BioLog.e("JsonToBioApp", "JsonToBioApp parse protocol " + protocol);
        BioAppDescription bioAppDescription = new BioAppDescription();
        bioAppDescription.setRemoteURL(bioParameter.getRemoteURL());
        bioAppDescription.setHeadImageURL(bioParameter.getHeadImageUrl());
        try {
            Map<String, String> extProperty = bioParameter.getExtProperty();
            String str = "N";
            if (extProperty != null && extProperty.containsKey("isThinProtocol")) {
                str = extProperty.remove("isThinProtocol");
            }
            BioLog.i("protocolType is Thin：" + str);
            if ("Y".equalsIgnoreCase(str)) {
                BisClientConfig bisClientConfig = (BisClientConfig) JSON.parseObject(protocol, BisClientConfig.class);
                BisClientConfigContent bisClientConfigContent = (BisClientConfigContent) JSON.parseObject(bisClientConfig.getContent(), BisClientConfigContent.class);
                String content = bisClientConfig.getContent();
                if ((extProperty == null || !extProperty.containsKey("mock")) ? false : Boolean.parseBoolean(extProperty.remove("mock"))) {
                    if (TextUtils.isEmpty(bisClientConfig.getSign())) {
                        BioLog.e("config.getSign() is empty.");
                    } else {
                        int parseInt = Integer.parseInt(bisClientConfigContent.getEnv());
                        if (2 != parseInt) {
                            InputStream a2 = a(parseInt);
                            RSASign.doCheck(bisClientConfig.getContent().getBytes(), Base64.decode(bisClientConfig.getSign(), 8), a2);
                            InputStreamUtils.close(a2);
                        }
                    }
                }
                bioAppDescription.setBioType(bisClientConfigContent.getType());
                int parseInt2 = Integer.parseInt(bisClientConfigContent.getUi());
                if (extProperty == null || extProperty.isEmpty() || !extProperty.containsKey(BioDetector.EXT_KEY_RETRY_UI_TYPE) || parseInt2 == (i2 = Integer.parseInt((remove2 = extProperty.remove(BioDetector.EXT_KEY_RETRY_UI_TYPE))))) {
                    bioAppDescription.setCfg(content);
                    i2 = parseInt2;
                } else {
                    bioAppDescription.setCfg(content.replace("" + parseInt2, remove2));
                }
                bioAppDescription.setBioAction(i2);
                bioAppDescription.setBistoken(bisClientConfigContent.getToken());
                bioAppDescription.setAutoClose(bioParameter.isAutoClose());
                bioAppDescription.setBundle(bioParameter.getBundle());
                if (extProperty != null && !extProperty.isEmpty()) {
                    for (Map.Entry<String, String> entry : extProperty.entrySet()) {
                        bioAppDescription.addExtProperty(entry.getKey(), entry.getValue());
                    }
                }
            } else {
                BisClientConfig bisClientConfig2 = (BisClientConfig) JSON.parseObject(protocol, BisClientConfig.class);
                BisClientConfigContent bisClientConfigContent2 = (BisClientConfigContent) JSON.parseObject(bisClientConfig2.getContent(), BisClientConfigContent.class);
                String androidcfg = bisClientConfigContent2.getAndroidcfg();
                BioAppConfig bioAppConfig = (BioAppConfig) JSON.parseObject(androidcfg, BioAppConfig.class);
                if ((extProperty == null || !extProperty.containsKey("mock")) ? false : Boolean.parseBoolean(extProperty.remove("mock"))) {
                    if (TextUtils.isEmpty(bisClientConfig2.getSign())) {
                        BioLog.e("config.getSign() is empty.");
                        doCheck = false;
                    } else {
                        int env = bioAppConfig.getEnv();
                        if (2 == env) {
                            doCheck = true;
                        } else {
                            InputStream a3 = a(env);
                            doCheck = RSASign.doCheck(bisClientConfig2.getContent().getBytes(), Base64.decode(bisClientConfig2.getSign(), 8), a3);
                            InputStreamUtils.close(a3);
                        }
                    }
                    if (!doCheck) {
                        throw new RuntimeException("protocol check sign failed. env=" + BioServiceManager.getEnv());
                    }
                }
                bioAppDescription.setBioType(bisClientConfigContent2.getType());
                int parseInt3 = Integer.parseInt(bioAppConfig.getUi());
                if (extProperty == null || extProperty.isEmpty() || !extProperty.containsKey(BioDetector.EXT_KEY_RETRY_UI_TYPE) || parseInt3 == (i = Integer.parseInt((remove = extProperty.remove(BioDetector.EXT_KEY_RETRY_UI_TYPE))))) {
                    bioAppDescription.setCfg(androidcfg);
                    i = parseInt3;
                } else {
                    bioAppDescription.setCfg(androidcfg.replace("" + parseInt3, remove));
                }
                bioAppDescription.setBioAction(i);
                bioAppDescription.setBistoken(bisClientConfigContent2.getToken());
                bioAppDescription.setAutoClose(bioParameter.isAutoClose());
                bioAppDescription.setBundle(bioParameter.getBundle());
                if (extProperty != null && !extProperty.isEmpty()) {
                    for (Map.Entry<String, String> entry2 : extProperty.entrySet()) {
                        bioAppDescription.addExtProperty(entry2.getKey(), entry2.getValue());
                    }
                }
            }
        } catch (Throwable th) {
            BioLog.e(th);
        }
        BioLog.e("JsonToBioApp return app:" + bioAppDescription.toString());
        return bioAppDescription;
    }
}
