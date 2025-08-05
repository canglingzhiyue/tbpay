package com.alipay.android.app.cctemplate.model;

import com.alipay.mobile.framework.MpaasClassInfo;
import com.android.alibaba.ip.runtime.IpChange;
import com.flybird.deploy.model.FBTemplateContent;
import com.taobao.umipublish.draft.DraftMediaHelper;
import java.io.Serializable;
import org.json.JSONObject;

@MpaasClassInfo(ExportJarName = "unknown", Level = DraftMediaHelper.DraftType.PRODUCT, Product = ":android-phone-wallet-safepaybase")
/* loaded from: classes3.dex */
public class Template implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final long serialVersionUID = 1;
    public String crossTime;
    public String crossVersion;
    public String data;
    public String dataObserver;
    public String expId;
    public JSONObject expInfo;
    public JSONObject expLog;
    public String format;
    public String html;
    private FBTemplateContent modelFromDeployer;
    public String name;
    public String publishVersion = "";
    public String requireTime;
    public String rollbackString;
    public String sdkVersion;
    public String tag;
    public String time;
    public String tplHash;
    public String tplId;
    public String tplUrl;
    public String tplVersion;
    public String userId;

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "{ \"tplId\":\"" + this.tplId + "\",\"time\":\"" + this.time + "\",\"tag\":\"" + this.tag + "\",\"tplVersion\":\"" + this.tplVersion + "\",\"format\":\"" + this.format + "\",\"publishVersion\":\"" + this.publishVersion + "\",\"tplHash\":\"" + this.tplHash + "\",\"tplUrl\":\"" + this.tplUrl + "\",\"expId\":\"" + this.expId + "\",\"expInfo\":\"" + this.expInfo + "\",\"expLog\":\"" + this.expLog + "\",\"sdkVersion\":\"" + this.sdkVersion + "\",\"requireTime\":\"" + this.requireTime + "\"}";
    }

    public FBTemplateContent getAttachedFBTemplateContent() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FBTemplateContent) ipChange.ipc$dispatch("24ac8c0f", new Object[]{this}) : this.modelFromDeployer;
    }

    public static Template fromFBTemplateContent(FBTemplateContent fBTemplateContent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Template) ipChange.ipc$dispatch("8ee3c24c", new Object[]{fBTemplateContent});
        }
        if (fBTemplateContent == null) {
            return null;
        }
        Template template = new Template();
        template.tplId = fBTemplateContent.getTplId();
        template.format = "JSON";
        template.tag = fBTemplateContent.getTag();
        template.publishVersion = fBTemplateContent.getPublishVersion();
        template.rollbackString = fBTemplateContent.getRollBack();
        template.userId = fBTemplateContent.getUserId();
        template.tplUrl = fBTemplateContent.getTplUrl();
        template.tplHash = fBTemplateContent.getTplHash();
        template.time = fBTemplateContent.getTime();
        template.name = "";
        template.tplVersion = fBTemplateContent.getTplVersion();
        template.expId = fBTemplateContent.getTplId();
        template.tplHash = fBTemplateContent.getTplHash();
        template.data = fBTemplateContent.getData();
        template.modelFromDeployer = fBTemplateContent;
        return template;
    }
}
