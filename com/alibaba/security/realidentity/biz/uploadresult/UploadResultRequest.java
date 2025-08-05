package com.alibaba.security.realidentity.biz.uploadresult;

import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.security.common.http.model.HttpRequest;
import com.alibaba.security.realidentity.f2;
import com.alibaba.security.realidentity.g4;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;

/* loaded from: classes3.dex */
public class UploadResultRequest extends HttpRequest {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String elements;

    /* loaded from: classes3.dex */
    public static class ActionType implements Serializable {
        @JSONField(name = "image_1")
        public String image_1;
        @JSONField(name = "type")
        public String type;
    }

    /* loaded from: classes3.dex */
    public static class Data implements Serializable {
        @JSONField(name = f2.f)
        public String bigImagePath;
        @JSONField(name = f2.g)
        public String bigSmallLocalPath;
        @JSONField(name = "refImage")
        public String bigSmallPath;
        @JSONField(name = "data")
        public String data;
        @JSONField(name = "faceRect")
        public String faceRect;
        @JSONField(name = "flActionLog")
        public String flActionLog;
        @JSONField(name = "idCardAuthData")
        public String idCardAuthData;
        @JSONField(name = "isGaze")
        public boolean isGaze;
        @JSONField(name = f2.i)
        public String originalImage;
        @JSONField(name = "processDetail")
        public String processDetail;
        @JSONField(name = "sensorActionLog")
        public String sensorActionLog;
        @JSONField(name = "useCtid")
        public boolean useCtid;
        @JSONField(name = g4.c.i)
        public String wukong;
        @JSONField(name = "smallImageMode")
        public int smallImageModel = 1;
        @JSONField(name = "K_FACE_R_ENABLE")
        public Integer localRecognize = null;
        @JSONField(name = "recognizeResultScore")
        public float recognizeResultScore = 0.0f;
        @JSONField(name = "v")
        public int v = 1;
        @JSONField(name = "backgroundDetectResult")
        public String backgroundDetectResult = "";
        @JSONField(name = "movement_1")
        public ActionType movement_1 = null;
        @JSONField(name = "movement_2")
        public ActionType movement_2 = null;
        @JSONField(name = "movement_3")
        public ActionType movement_3 = null;
        @JSONField(name = "movement_4")
        public ActionType movement_4 = null;
        @JSONField(name = "movement_5")
        public ActionType movement_5 = null;
        @JSONField(name = "movement_6")
        public ActionType movement_6 = null;
        @JSONField(name = "movement_7")
        public ActionType movement_7 = null;
        @JSONField(name = "movement_8")
        public ActionType movement_8 = null;
    }

    /* loaded from: classes3.dex */
    public static class Elements implements Serializable {
        @JSONField(name = "value")
        public Data value;
        @JSONField(name = "name")
        public String name = "Biometric";
        @JSONField(name = "valueMeta")
        public String valueMeta = "JsonType";
    }

    /* loaded from: classes3.dex */
    public static class a {
        @JSONField(name = "url")

        /* renamed from: a  reason: collision with root package name */
        public String f3371a;
        @JSONField(name = "videoExtra")
        public b b;
        @JSONField(name = "videoHash")
        public String c;
    }

    /* loaded from: classes3.dex */
    public static class b {
        @JSONField(name = "conf")

        /* renamed from: a  reason: collision with root package name */
        public Object f3372a;
        @JSONField(name = "osName")
        public String b = "android";
    }

    public UploadResultRequest(String str, String str2) {
        super(str, str2);
    }

    @Override // com.alibaba.security.common.http.model.HttpRequest
    public String apiName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("3948e054", new Object[]{this}) : "mtop.verifycenter.rp.upload";
    }

    @Override // com.alibaba.security.common.http.model.HttpRequest
    public Class classType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Class) ipChange.ipc$dispatch("ac7cbb06", new Object[]{this}) : UploadResultHttpResponse.class;
    }

    public String getElements() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ae4b66ac", new Object[]{this}) : this.elements;
    }

    public void setElements(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5fec94a", new Object[]{this, str});
        } else {
            this.elements = str;
        }
    }
}
