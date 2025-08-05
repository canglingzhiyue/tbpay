package com.alibaba.security.realidentity.biz.uploadresult;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.security.common.http.model.HttpRequest;
import com.alibaba.security.common.http.model.HttpResponse;
import com.alibaba.security.realidentity.RPResult;
import com.alibaba.security.realidentity.a;
import com.alibaba.security.realidentity.algo.wrapper.entity.result.ALBiometricsResult;
import com.alibaba.security.realidentity.b;
import com.alibaba.security.realidentity.biz.base.chain.BusinessHeadParams;
import com.alibaba.security.realidentity.biz.bucket.BucketParams;
import com.alibaba.security.realidentity.biz.config.RPBizConfig;
import com.alibaba.security.realidentity.biz.entity.ClientInfo;
import com.alibaba.security.realidentity.biz.uploadresult.UploadResultRequest;
import com.alibaba.security.realidentity.c;
import com.alibaba.security.realidentity.c2;
import com.alibaba.security.realidentity.e2;
import com.alibaba.security.realidentity.f2;
import com.alibaba.security.realidentity.h1;
import com.alibaba.security.realidentity.o1;
import com.alibaba.security.realidentity.r;
import com.alibaba.security.realidentity.v1;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public class UploadResultParams extends o1 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String l = "UploadResultParams";
    public static final String[] m = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
    public UploadResultHttpResponse g;
    public ALBiometricsResult h;
    public List<c2> i;
    public v1 j;
    public BusinessHeadParams k;

    /* loaded from: classes3.dex */
    public static class EdgeDetectResult implements Serializable {
        public String stare = null;
        public String actionZero = null;
        public String actionOne = null;
        public String actionTwo = null;
        public String actionThree = null;
        public String actionFour = null;
        public String actionFive = null;
        public String actionSix = null;
        public String actionSeven = null;
        public String actionEight = null;
        public String actionNine = null;
    }

    public UploadResultParams(Context context, RPBizConfig rPBizConfig) {
        super(context, rPBizConfig);
    }

    private UploadResultRequest.Elements f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UploadResultRequest.Elements) ipChange.ipc$dispatch("a5e09a04", new Object[]{this});
        }
        UploadResultRequest.Elements elements = new UploadResultRequest.Elements();
        elements.name = "RISK_ACTION";
        UploadResultRequest.Data data = new UploadResultRequest.Data();
        if (!TextUtils.isEmpty(this.h.collectedData)) {
            data.sensorActionLog = this.h.collectedData;
        }
        if (!TextUtils.isEmpty(this.h.bh)) {
            data.flActionLog = this.h.bh;
        }
        if (!TextUtils.isEmpty(this.h.wukongData)) {
            data.wukong = this.h.wukongData;
        }
        elements.value = data;
        return elements;
    }

    public static /* synthetic */ Object ipc$super(UploadResultParams uploadResultParams, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.alibaba.security.realidentity.o1
    public o1 a(HttpResponse httpResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (o1) ipChange.ipc$dispatch("97ba3285", new Object[]{this, httpResponse});
        }
        if (httpResponse instanceof UploadResultHttpResponse) {
            this.g = (UploadResultHttpResponse) httpResponse;
        }
        return this;
    }

    @Override // com.alibaba.security.realidentity.biz.bucket.BucketParams
    public boolean b(h1 h1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("87f3572e", new Object[]{this, h1Var})).booleanValue();
        }
        this.j = h1Var.c;
        this.h = h1Var.d.h;
        this.k = h1Var.b;
        this.i = h1Var.e.e;
        return true;
    }

    @Override // com.alibaba.security.realidentity.biz.bucket.BucketParams
    public BucketParams.ErrorCode c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BucketParams.ErrorCode) ipChange.ipc$dispatch("838b0e76", new Object[]{this});
        }
        UploadResultHttpResponse uploadResultHttpResponse = this.g;
        if (uploadResultHttpResponse == null) {
            return new BucketParams.ErrorCode(RPResult.AUDIT_NOT, String.valueOf((int) e2.A), "start api fail, response is null", e2.A);
        }
        if (uploadResultHttpResponse.isSuccessful()) {
            return new BucketParams.ErrorCode(RPResult.AUDIT_PASS, String.valueOf(0), "upload result success", 0);
        }
        if (!TextUtils.isEmpty(this.g.retCode)) {
            return new BucketParams.ErrorCode(RPResult.AUDIT_NOT, String.valueOf((int) e2.D), this.g.retMsg, e2.D);
        }
        return new BucketParams.ErrorCode(RPResult.AUDIT_NOT, String.valueOf((int) e2.D), b.a(this.g), e2.D);
    }

    @Override // com.alibaba.security.realidentity.biz.bucket.BucketParams
    public HttpRequest a() {
        ArrayList arrayList = new ArrayList();
        UploadResultRequest.Elements elements = new UploadResultRequest.Elements();
        UploadResultRequest.Data data = new UploadResultRequest.Data();
        data.bigImagePath = a(this.i, f2.f);
        data.v = 2;
        data.isGaze = this.j.k;
        data.idCardAuthData = (this.k == null || this.d.getCtidConfig() == null) ? null : this.d.getCtidConfig().ctidParams;
        data.useCtid = (this.k == null || this.d.getCtidConfig() == null) ? false : this.d.getCtidConfig().isCtidCalled;
        if (this.j.o) {
            for (int i = 0; i < this.h.actionList.size(); i++) {
                String a2 = a(this.h.actionList.get(i).actionType);
                UploadResultRequest.ActionType actionType = new UploadResultRequest.ActionType();
                actionType.type = a2;
                actionType.image_1 = a(this.i, "action" + i);
                try {
                    data.getClass().getField(String.format("movement_%d", Integer.valueOf(i + 1))).set(data, actionType);
                } catch (IllegalAccessException e) {
                    a.a(l, e);
                } catch (NoSuchFieldException e2) {
                    a.a(l, e2);
                }
            }
        }
        data.bigSmallPath = a(this.i, f2.h);
        data.bigSmallLocalPath = a(this.i, f2.g);
        data.originalImage = a(this.i, f2.i);
        int[] faceRect = this.h.qualityImage.getFaceRect();
        if (faceRect != null && faceRect.length == 4) {
            data.faceRect = String.format("%d,%d,%d,%d", Integer.valueOf(faceRect[0]), Integer.valueOf(faceRect[1]), Integer.valueOf(faceRect[2]), Integer.valueOf(faceRect[3]));
        }
        String bgDetectResult = this.h.getBgDetectResult();
        if (bgDetectResult != null) {
            EdgeDetectResult edgeDetectResult = new EdgeDetectResult();
            String[] split = bgDetectResult.split(";");
            for (int i2 = 0; i2 < split.length; i2++) {
                try {
                    edgeDetectResult.getClass().getField(i2 == 0 ? "stare" : "action" + m[i2]).set(edgeDetectResult, split[i2]);
                } catch (IllegalAccessException e3) {
                    a.a(l, e3);
                } catch (NoSuchFieldException e4) {
                    a.a(l, e4);
                }
            }
            data.backgroundDetectResult = b.a(edgeDetectResult);
        }
        data.processDetail = this.h.toJson();
        String a3 = c.a(r.a().a(this.c, this.b));
        ClientInfo clientInfo = new ClientInfo(this.c);
        clientInfo.setVersionTag(a3);
        UploadResultRequest uploadResultRequest = new UploadResultRequest(this.b, b.a(clientInfo));
        elements.value = data;
        arrayList.add(elements);
        if (!TextUtils.isEmpty(this.h.dazzleVideoPath)) {
            UploadResultRequest.Elements elements2 = new UploadResultRequest.Elements();
            elements2.name = "BIOMETRIC_COLORFUL";
            UploadResultRequest.Data data2 = new UploadResultRequest.Data();
            UploadResultRequest.a aVar = new UploadResultRequest.a();
            ALBiometricsResult aLBiometricsResult = this.h;
            aVar.f3371a = aLBiometricsResult.dazzleVideoOssUrl;
            aVar.c = aLBiometricsResult.videoHash;
            UploadResultRequest.b bVar = new UploadResultRequest.b();
            bVar.f3372a = this.h.dazzleDataConfigs;
            aVar.b = bVar;
            String a4 = b.a(aVar);
            if (!TextUtils.isEmpty(a4)) {
                data2.data = c.a(r.a().a(a4.getBytes(), String.valueOf(System.currentTimeMillis()), this.d.getBasicsConfig().umidToken));
            }
            elements2.value = data2;
            arrayList.add(elements2);
        }
        arrayList.add(f());
        uploadResultRequest.setElements(b.a(arrayList));
        a(uploadResultRequest);
        return uploadResultRequest;
    }

    private String a(List<c2> list, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fe45281d", new Object[]{this, list, str});
        }
        if (list == null) {
            return "";
        }
        for (c2 c2Var : list) {
            if (TextUtils.equals(str, c2Var.b())) {
                return c2Var.c();
            }
        }
        return "";
    }

    private String a(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9064aa65", new Object[]{this, new Integer(i)}) : i != 1 ? i != 2 ? i != 3 ? i != 10 ? i != 11 ? String.valueOf(i) : "KeepStill" : "RaiseHeadDown" : "ShakeHead" : "OpenMouth" : "Blink";
    }
}
