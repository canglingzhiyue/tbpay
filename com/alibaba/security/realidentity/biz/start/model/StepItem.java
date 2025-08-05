package com.alibaba.security.realidentity.biz.start.model;

import com.alibaba.security.realidentity.b;
import com.alibaba.security.realidentity.biz.start.StartHttpResponse;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.List;

/* loaded from: classes3.dex */
public class StepItem implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String jsonAssist;
    public List<StartHttpResponse.Property> properties;
    public StepType stepType;

    /* loaded from: classes3.dex */
    public static class JsonAssist implements Serializable {
        public String bioColorfulConf;
        public List<Integer> bioStepsEx;
        public String livenessConfig;
        public boolean needActionImage = true;
        public boolean needFailVideo;
        public boolean needGaze;
        public boolean needOriginalImage;
        public boolean needSuccessVideo;
        public boolean needUserConfirm;
        public boolean onlyGaze;
        public int retryCount;
        public boolean showNav;
    }

    /* loaded from: classes3.dex */
    public static class StepTypeBean implements Serializable {
        public String code;
        public String desc;
        public String name;
    }

    public JsonAssist getJsonAssistBean() {
        IpChange ipChange = $ipChange;
        return (JsonAssist) (ipChange instanceof IpChange ? ipChange.ipc$dispatch("58dc408d", new Object[]{this}) : b.b(this.jsonAssist, JsonAssist.class));
    }
}
