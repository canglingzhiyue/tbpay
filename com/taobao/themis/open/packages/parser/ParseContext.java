package com.taobao.themis.open.packages.parser;

import com.alibaba.ariver.resource.api.models.AppModel;
import com.alibaba.ariver.resource.api.models.TemplateConfigModel;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import java.util.regex.Pattern;
import tb.kge;

/* loaded from: classes9.dex */
public class ParseContext {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String appId;
    public List<Pattern> ignorePatterns;
    public String mainFileName;
    public String onlineHost;
    public String packagePath;
    public String templateAppId;
    public String templateVersion;
    public boolean needVerify = true;
    public boolean needCache = false;
    public boolean fromCache = false;

    static {
        kge.a(-1619509063);
    }

    public void adaptAppModel(AppModel appModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1fd7da96", new Object[]{this, appModel});
        } else if (appModel == null || appModel.getAppInfoModel() == null) {
        } else {
            this.appId = appModel.getAppId();
            this.onlineHost = appModel.getAppInfoModel().getVhost();
            TemplateConfigModel templateConfig = appModel.getAppInfoModel().getTemplateConfig();
            if (templateConfig == null || !templateConfig.isTemplateValid()) {
                return;
            }
            this.mainFileName = templateConfig.getTemplateId() + ".tar";
            this.templateAppId = templateConfig.getTemplateId();
            this.templateVersion = templateConfig.getTemplateVersion();
        }
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "ParseContext{packagePath='" + this.packagePath + "', mainFileName='" + this.mainFileName + "', appId='" + this.appId + "', onlineHost='" + this.onlineHost + "', templateAppId='" + this.templateAppId + "', ignorePatterns=" + this.ignorePatterns + '}';
    }
}
