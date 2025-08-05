package com.alipay.zoloz.toyger.util;

import android.graphics.RectF;
import com.alibaba.fastjson.JSONObject;
import com.alipay.zoloz.toyger.algorithm.TGFaceAttr;
import com.alipay.zoloz.toyger.algorithm.TGFaceState;
import com.alipay.zoloz.toyger.bean.ToygerFrame;
import com.alipay.zoloz.toyger.face.ToygerFaceService;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public class ToygerFrameUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static Map<String, String> getFaceParam(ToygerFrame toygerFrame, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("e302ab56", new Object[]{toygerFrame, str, str2, str3});
        }
        HashMap hashMap = new HashMap();
        JSONObject jSONObject = new JSONObject();
        jSONObject.putAll(getFaceState(toygerFrame.tgFaceState));
        hashMap.put("toygerRetParam", jSONObject.toJSONString());
        hashMap.put("algoType", "zface");
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.putAll(getFaceParam(toygerFrame.tgFaceAttr));
        hashMap.put("algorithmDetails", jSONObject2.toJSONString());
        hashMap.put(ToygerFaceService.KEY_TOYGER_TIME_CONSUMING, (toygerFrame.extInfo == null || !toygerFrame.extInfo.containsKey(ToygerFaceService.KEY_TOYGER_TIME_CONSUMING)) ? "" : (String) toygerFrame.extInfo.remove(ToygerFaceService.KEY_TOYGER_TIME_CONSUMING));
        hashMap.put("algoInitTime", str);
        hashMap.put("duraPerFrameList", str2);
        hashMap.put("qualifyPerFrameList", str3);
        return hashMap;
    }

    public static Map<String, String> getFaceParam(ToygerFrame toygerFrame) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("b3cf8638", new Object[]{toygerFrame});
        }
        HashMap hashMap = new HashMap();
        JSONObject jSONObject = new JSONObject();
        jSONObject.putAll(getFaceState(toygerFrame.tgFaceState));
        hashMap.put("toygerRetParam", jSONObject.toJSONString());
        hashMap.put("algoType", "zface");
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.putAll(getFaceParam(toygerFrame.tgFaceAttr));
        hashMap.put("algorithmDetails", jSONObject2.toJSONString());
        hashMap.put(ToygerFaceService.KEY_TOYGER_TIME_CONSUMING, (toygerFrame.extInfo == null || !toygerFrame.extInfo.containsKey(ToygerFaceService.KEY_TOYGER_TIME_CONSUMING)) ? "" : (String) toygerFrame.extInfo.remove(ToygerFaceService.KEY_TOYGER_TIME_CONSUMING));
        return hashMap;
    }

    public static Map<String, String> getFaceState(TGFaceState tGFaceState) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("93363e05", new Object[]{tGFaceState});
        }
        if (tGFaceState == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("progress", tGFaceState.progress + "");
        hashMap.put("goodYaw", tGFaceState.goodYaw + "");
        hashMap.put("isMoving", tGFaceState.isMoving + "");
        hashMap.put("messageCode", tGFaceState.messageCode + "");
        hashMap.put("brightness", tGFaceState.brightness + "");
        hashMap.put("distance", tGFaceState.distance + "");
        hashMap.put("goodQuality", tGFaceState.goodQuality + "");
        hashMap.put("hasFace", tGFaceState.hasFace + "");
        hashMap.put("faceInCenter", tGFaceState.faceInCenter + "");
        hashMap.put("goodPitch", tGFaceState.goodPitch + "");
        return hashMap;
    }

    public static Map<String, String> getFaceParam(TGFaceAttr tGFaceAttr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("82f0c68f", new Object[]{tGFaceAttr});
        }
        HashMap hashMap = null;
        if (tGFaceAttr != null) {
            hashMap = new HashMap();
            hashMap.put("hasFace", Boolean.toString(tGFaceAttr.hasFace));
            hashMap.put("faceId", Integer.toString(tGFaceAttr.faceId));
            hashMap.put("eyeBlink", Boolean.toString(tGFaceAttr.eyeBlink));
            hashMap.put("eyeOpen", Boolean.toString(tGFaceAttr.eyeOpen));
            RectF rectF = tGFaceAttr.faceRegion;
            if (rectF != null) {
                hashMap.put("frectwidth", rectF.width() + "");
                hashMap.put("frectheight", rectF.height() + "");
                hashMap.put("frectX", rectF.left + "");
                hashMap.put("frectY", rectF.top + "");
            } else {
                hashMap.put("frectwidth", "");
                hashMap.put("frectheight", "");
                hashMap.put("frectX", "");
                hashMap.put("frectY", "");
            }
            hashMap.put("fquality", tGFaceAttr.quality + "");
            hashMap.put("flight", tGFaceAttr.brightness + "");
            hashMap.put("facePitch", tGFaceAttr.pitch + "");
            hashMap.put("faceYaw", tGFaceAttr.yaw + "");
            hashMap.put("faceEyeLeftHwratio", tGFaceAttr.leftEyeBlinkRatio + "");
            hashMap.put("faceEyeLeftHwratioMin", tGFaceAttr.leftEyeBlinkRatioMin + "");
            hashMap.put("faceEyeLeftHwratioMax", tGFaceAttr.leftEyeBlinkRatioMax + "");
            hashMap.put("faceEyeRightHwratio", tGFaceAttr.rightEyeBlinkRatio + "");
            hashMap.put("faceEyeRightHwratioMin", tGFaceAttr.rightEyeBlinkRatioMin + "");
            hashMap.put("faceEyeRightHwratioMax", tGFaceAttr.rightEyeBlinkRatioMax + "");
            hashMap.put("faceGaussian", tGFaceAttr.gaussian + "");
            hashMap.put("faceMotion", tGFaceAttr.motion + "");
            hashMap.put("integrity", tGFaceAttr.integrity + "");
            hashMap.put("deviceLight", tGFaceAttr.brightness + "");
            hashMap.put("distance", ((int) tGFaceAttr.distance) + "");
            hashMap.put("faceKeyPoints", Arrays.toString(tGFaceAttr.keypts10));
            hashMap.put("confidence", tGFaceAttr.confidence + "");
            hashMap.put("roll", tGFaceAttr.roll + "");
            hashMap.put("iodRatio", tGFaceAttr.iodRatio + "");
            hashMap.put("deepLiveness", tGFaceAttr.deepLiveness + "");
            hashMap.put("leftEyeOcclusionScore", tGFaceAttr.leftEyeOcclusionScore + "");
            hashMap.put("rightEyeOcclusionScore", tGFaceAttr.rightEyeOcclusionScore + "");
        }
        return hashMap;
    }
}
