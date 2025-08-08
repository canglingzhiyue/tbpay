package com.taobao.android.sku.data;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.datasdk.model.datamodel.node.SkuCoreNode;
import com.taobao.android.sku.utils.b;
import java.io.Serializable;
import tb.kge;

/* loaded from: classes6.dex */
public class AliXSkuDataContext implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String mJavaScriptMd5;
    private String mJavaScriptUrl;
    private JSONObject mOriginData;
    private String mUltronTemplateMd5;
    private String mUltronTemplateUrl;
    private JSONObject mStaticExtInput = new JSONObject();
    private JSONObject mStoredState = new JSONObject();
    private JSONObject mOpState = new JSONObject();
    private JSONObject mBizState = new JSONObject();
    private JSONObject mExtInput = new JSONObject();
    private JSONObject mTimeExtInput = new JSONObject();

    static {
        kge.a(508179298);
        kge.a(1028243835);
    }

    public JSONObject getJsH5SkuInfo() {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("8bec4586", new Object[]{this});
        }
        JSONObject jSONObject2 = this.mBizState;
        if (jSONObject2 != null && (jSONObject = jSONObject2.getJSONObject("id_biz_first_exe_holder")) != null) {
            return jSONObject.getJSONObject("h5_sku");
        }
        return null;
    }

    public String getItemId() {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("beb1faf5", new Object[]{this});
        }
        JSONObject jSONObject2 = this.mOriginData;
        if (jSONObject2 != null && (jSONObject = jSONObject2.getJSONObject("item")) != null) {
            return jSONObject.getString("itemId");
        }
        return null;
    }

    public String getSellerId() {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("822c6289", new Object[]{this});
        }
        JSONObject jSONObject2 = this.mOriginData;
        if (jSONObject2 != null && (jSONObject = jSONObject2.getJSONObject("seller")) != null) {
            return jSONObject.getString("userId");
        }
        return null;
    }

    public String getH5Url(String str) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a65c6d03", new Object[]{this, str});
        }
        if (b.a(str)) {
            JSONObject jSONObject2 = this.mOriginData;
            if (jSONObject2 == null) {
                return null;
            }
            JSONObject jSONObject3 = jSONObject2.getJSONObject(SkuCoreNode.TAG);
            if (jSONObject3 == null || (jSONObject = jSONObject3.getJSONObject("skuItem")) == null) {
                return "";
            }
            String string = jSONObject.getString("optionalSkuH5Url");
            return StringUtils.isEmpty(string) ? getH5Url() : string;
        }
        return getH5Url();
    }

    public String getH5Url() {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("abc85acd", new Object[]{this});
        }
        JSONObject jSONObject2 = this.mOriginData;
        if (jSONObject2 == null) {
            return null;
        }
        JSONObject jSONObject3 = jSONObject2.getJSONObject(SkuCoreNode.TAG);
        return (jSONObject3 == null || (jSONObject = jSONObject3.getJSONObject("skuItem")) == null) ? "" : jSONObject.getString("skuH5Url");
    }

    public String getDegradeSkuH5Url() {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9c473df4", new Object[]{this});
        }
        JSONObject jSONObject2 = this.mOriginData;
        if (jSONObject2 == null) {
            return null;
        }
        JSONObject jSONObject3 = jSONObject2.getJSONObject(SkuCoreNode.TAG);
        return (jSONObject3 == null || (jSONObject = jSONObject3.getJSONObject("skuItem")) == null) ? "" : jSONObject.getString("degradeSkuH5Url");
    }

    public String getWeexUrl() {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b9b36c81", new Object[]{this});
        }
        JSONObject jSONObject3 = this.mOriginData;
        if (jSONObject3 != null && (jSONObject = jSONObject3.getJSONObject(SkuCoreNode.TAG)) != null && (jSONObject2 = jSONObject.getJSONObject("skuItem")) != null) {
            return jSONObject2.getString("skuWeexUrl");
        }
        return null;
    }

    public String getSkuV3WeexUrl() {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1b7c26ef", new Object[]{this});
        }
        JSONObject jSONObject3 = this.mOriginData;
        if (jSONObject3 != null && (jSONObject = jSONObject3.getJSONObject(SkuCoreNode.TAG)) != null && (jSONObject2 = jSONObject.getJSONObject("skuItem")) != null) {
            return jSONObject2.getString("skuV3WeexUrl");
        }
        return null;
    }

    public void initOriginalData(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8b707de", new Object[]{this, jSONObject});
        } else {
            this.mOriginData = jSONObject;
        }
    }

    public void initOriginalData(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69ec137a", new Object[]{this, str, str2, str3, str4});
            return;
        }
        this.mUltronTemplateUrl = str;
        this.mUltronTemplateMd5 = str2;
        this.mJavaScriptUrl = str3;
        this.mJavaScriptMd5 = str4;
    }

    public JSONObject getExtInput() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("b53477c6", new Object[]{this}) : this.mExtInput;
    }

    public void setExtInput(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f1997e", new Object[]{this, jSONObject});
            return;
        }
        this.mExtInput = jSONObject;
        if (this.mExtInput == null) {
            this.mExtInput = new JSONObject();
        }
        this.mExtInput.putAll(this.mStaticExtInput);
    }

    public void setStaticExtInput(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37798f30", new Object[]{this, jSONObject});
            return;
        }
        if (jSONObject != null) {
            this.mStaticExtInput.putAll(jSONObject);
        }
        this.mExtInput.putAll(this.mStaticExtInput);
    }

    public JSONObject getOriginalData() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("2b45ceb8", new Object[]{this}) : this.mOriginData;
    }

    public String getUltronTemplateUrl() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7774768e", new Object[]{this}) : this.mUltronTemplateUrl;
    }

    public String getUltronTemplateMd5() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("a1f685df", new Object[]{this}) : this.mUltronTemplateMd5;
    }

    public String getJavaScriptUrl() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("408a7d8d", new Object[]{this}) : this.mJavaScriptUrl;
    }

    public String getJavaScriptMd5() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6b0c8cde", new Object[]{this}) : this.mJavaScriptMd5;
    }

    public String getSkuParams() {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("157c86cc", new Object[]{this});
        }
        JSONObject jSONObject3 = this.mOriginData;
        if (jSONObject3 != null && (jSONObject = jSONObject3.getJSONObject(SkuCoreNode.TAG)) != null && (jSONObject2 = jSONObject.getJSONObject("skuItem")) != null) {
            return jSONObject2.getString("skuParams");
        }
        return null;
    }

    public boolean getShowSkuFeature() {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("75e0a577", new Object[]{this})).booleanValue();
        }
        JSONObject jSONObject2 = this.mOriginData;
        if (jSONObject2 != null && (jSONObject = jSONObject2.getJSONObject("feature")) != null) {
            return "true".equals(jSONObject.getString("showSku"));
        }
        return true;
    }

    public boolean getNewbuyShowSkuFeature() {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fbc8547d", new Object[]{this})).booleanValue();
        }
        JSONObject jSONObject2 = this.mOriginData;
        if (jSONObject2 != null && (jSONObject = jSONObject2.getJSONObject("feature")) != null) {
            return "true".equals(jSONObject.getString("newbuyShowSku"));
        }
        return true;
    }

    public boolean getSkuSilentActionFeature() {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1846d6af", new Object[]{this})).booleanValue();
        }
        JSONObject jSONObject2 = this.mOriginData;
        if (jSONObject2 != null && (jSONObject = jSONObject2.getJSONObject("feature")) != null) {
            return "true".equals(jSONObject.getString("skuSilentAction"));
        }
        return false;
    }

    public boolean isTradeCartOrBuyEnable(String str) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("90d7d1a1", new Object[]{this, str})).booleanValue();
        }
        JSONObject jSONObject = this.mOriginData;
        if (jSONObject == null) {
            return true;
        }
        try {
            str2 = jSONObject.getJSONObject("trade").getString(str);
        } catch (Exception e) {
            e.printStackTrace();
            str2 = "true";
        }
        return "true".equals(str2);
    }

    public JSONObject getBizData() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("f2bc674e", new Object[]{this}) : this.mBizState;
    }

    public void setBizData(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45a1cf8e", new Object[]{this, jSONObject});
        } else if (jSONObject == null || jSONObject.isEmpty()) {
        } else {
            this.mBizState.putAll(jSONObject);
        }
    }

    public void cleanBizData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a92075b", new Object[]{this});
        } else {
            this.mBizState.clear();
        }
    }

    public void cleanExtInputData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc520ce3", new Object[]{this});
            return;
        }
        this.mExtInput.clear();
        this.mExtInput.putAll(this.mStaticExtInput);
    }

    public JSONObject getStoredData() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("57c7140a", new Object[]{this}) : this.mStoredState;
    }

    public void setStoredData(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5426b8ba", new Object[]{this, jSONObject});
        } else if (jSONObject == null || jSONObject.isEmpty()) {
        } else {
            this.mStoredState.putAll(jSONObject);
        }
    }

    public void cleanStoredData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a46129d", new Object[]{this});
        } else {
            this.mStoredState.clear();
        }
    }

    public JSONObject getOperationData() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("18681c22", new Object[]{this}) : this.mOpState;
    }

    public void setOperationData(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2733c3a", new Object[]{this, jSONObject});
        } else if (jSONObject == null || jSONObject.isEmpty()) {
        } else {
            this.mOpState.putAll(jSONObject);
        }
    }

    public void cleanOperationData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b784366f", new Object[]{this});
        } else {
            this.mOpState.clear();
        }
    }

    public JSONObject getTimeExtInput() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("a2383433", new Object[]{this}) : this.mTimeExtInput;
    }

    public void cleanTimeExtInput() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70607606", new Object[]{this});
        } else {
            this.mTimeExtInput.clear();
        }
    }
}
