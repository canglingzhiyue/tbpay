package com.taobao.themis.kernel.metaInfo.appinfo.core.requestConfig;

import com.alibaba.ariver.resource.api.models.AppInfoScene;
import com.alibaba.fastjson.JSONArray;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import tb.kge;

/* loaded from: classes9.dex */
public abstract class AbsAppInfoRequestConfig {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public AppInfoScene f22551a = AppInfoScene.ONLINE;
    public boolean b = true;
    public AppInfoRequestScene c;
    public boolean d;

    /* loaded from: classes9.dex */
    public enum AppInfoRequestScene {
        PRELOAD("preload"),
        ASYNCLOAD("asyncload"),
        SYNCLOAD("syncload");
        
        private String name;

        AppInfoRequestScene(String str) {
            this.name = str;
        }

        public String getName() {
            return this.name;
        }
    }

    static {
        kge.a(488194534);
    }

    public abstract JSONArray a();

    /* loaded from: classes9.dex */
    public static class BasicRequestParam implements Serializable {
        public String appId;
        public String templateId;
        public String url;
        public String version;

        static {
            kge.a(-266032338);
            kge.a(1028243835);
        }

        public BasicRequestParam(String str, String str2, String str3) {
            this.version = "*";
            this.templateId = "";
            this.url = "";
            this.appId = str;
            this.version = str2;
            this.url = str3;
        }

        public BasicRequestParam(String str, String str2) {
            this.version = "*";
            this.templateId = "";
            this.url = "";
            this.appId = str;
            this.version = str2;
        }

        public BasicRequestParam(String str) {
            this.version = "*";
            this.templateId = "";
            this.url = "";
            this.appId = str;
        }

        public BasicRequestParam() {
            this.version = "*";
            this.templateId = "";
            this.url = "";
        }
    }
}
