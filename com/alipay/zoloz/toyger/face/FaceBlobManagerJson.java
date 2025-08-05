package com.alipay.zoloz.toyger.face;

import android.util.Base64;
import android.util.Log;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alipay.zoloz.toyger.ToygerBaseService;
import com.alipay.zoloz.toyger.ToygerLog;
import com.alipay.zoloz.toyger.algorithm.TGFrame;
import com.alipay.zoloz.toyger.blob.Blob;
import com.alipay.zoloz.toyger.blob.BlobElem;
import com.alipay.zoloz.toyger.blob.BlobManager;
import com.alipay.zoloz.toyger.blob.Content;
import com.alipay.zoloz.toyger.blob.FaceInfo;
import com.alipay.zoloz.toyger.blob.Meta;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import mtopsdk.mtop.upload.domain.UploadConstants;

/* loaded from: classes3.dex */
public class FaceBlobManagerJson extends FaceBlobManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private List<BlobElem> f6277a;

    public static /* synthetic */ Object ipc$super(FaceBlobManagerJson faceBlobManagerJson, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.alipay.zoloz.toyger.face.FaceBlobManager, com.alipay.zoloz.toyger.blob.BlobManager
    public boolean isUTF8() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("20ca7ec6", new Object[]{this})).booleanValue();
        }
        return true;
    }

    public FaceBlobManagerJson() {
    }

    public FaceBlobManagerJson(ToygerFaceBlobConfig toygerFaceBlobConfig, boolean z) {
        super(toygerFaceBlobConfig, z);
    }

    @Override // com.alipay.zoloz.toyger.face.FaceBlobManager
    public byte[] generateLocalMatchingBlob(String str, byte[] bArr, byte[] bArr2, String str2) {
        String[] split;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("dfce5ac4", new Object[]{this, str, bArr, bArr2, str2});
        }
        Meta meta = new Meta();
        meta.type = "zface";
        HashMap hashMap = new HashMap(2);
        if (bArr2 != null) {
            hashMap.put(BlobManager.META_COLL_KEY_IMAGE_SIG, bArr2);
        }
        if (str != null) {
            hashMap.put(BlobManager.META_COLL_KEY_AUTH_INFO, str);
        }
        hashMap.put(BlobManager.BLOB_ELEM_IMAGE_TYPE, BlobManager.UPLOAD_IMAGE_TYPE_JPEG);
        meta.collectInfo = hashMap;
        meta.serialize = 1;
        ArrayList arrayList = new ArrayList();
        Blob blob = new Blob();
        if (bArr != null) {
            FaceInfo faceInfo = new FaceInfo();
            if (str2 != null && (split = str2.split(",")) != null && split.length != 4) {
                faceInfo.rect.left = Integer.parseInt(split[0]);
                faceInfo.rect.top = Integer.parseInt(split[1]);
                faceInfo.rect.right = Integer.parseInt(split[2]);
                faceInfo.rect.bottom = Integer.parseInt(split[3]);
            }
            BlobElem blobElem = new BlobElem();
            blobElem.type = "face";
            blobElem.subType = BlobManager.SUB_TYPE_PANO;
            blobElem.content = bArr;
            blobElem.version = "1.0";
            blobElem.idx = 0;
            blobElem.faceInfos = new ArrayList();
            blobElem.faceInfos.add(faceInfo);
            arrayList.add(blobElem);
        }
        blob.blobElem = arrayList;
        blob.blobVersion = "1.0";
        Content content = new Content();
        content.blob = blob;
        content.meta = meta;
        return JSON.toJSONString(content).getBytes();
    }

    @Override // com.alipay.zoloz.toyger.face.FaceBlobManager, com.alipay.zoloz.toyger.blob.BlobManager
    public byte[] generateBlob(List<ToygerFaceInfo> list, Map<String, Object> map) {
        byte[] processFrame;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("83c7cf22", new Object[]{this, list, map});
        }
        ArrayList arrayList = new ArrayList();
        boolean z = this.isMirror;
        String str = this.compressFormat == null ? BlobManager.UPLOAD_IMAGE_TYPE_JPEG : this.compressFormat;
        for (ToygerFaceInfo toygerFaceInfo : list) {
            BlobElem blobElem = new BlobElem();
            blobElem.type = "face";
            blobElem.subType = a(toygerFaceInfo);
            ToygerLog.i("TOYGER_FLOW_ANDROID", "upload_content_type " + blobElem.subType);
            blobElem.version = "1.0";
            blobElem.idx = 0;
            if (!this.isNano && this.bestLightImage != null) {
                processFrame = encryptFrame(this.bestLightImage);
                blobElem.subType = BlobManager.SUB_TYPE_PANO;
                blobElem.type = BlobManager.convertUploadImageTypeToBlobElemType(str);
            } else {
                processFrame = processFrame(toygerFaceInfo.frame, str, !z);
                blobElem.type = BlobManager.convertUploadImageTypeToBlobElemType(str);
            }
            if (processFrame == null) {
                Log.e(BlobManager.TAG, "failed to generateBlob processFrame");
                return null;
            }
            blobElem.content = processFrame;
            if (blobElem.content == null) {
                Log.e(BlobManager.TAG, "failed to generate element content");
                return null;
            }
            blobElem.faceInfos = new ArrayList();
            blobElem.faceInfos.add(a(toygerFaceInfo, z));
            arrayList.add(blobElem);
        }
        Object remove = map.remove("sensorData");
        if (this.isGyroNeeded && remove != null) {
            BlobElem blobElem2 = new BlobElem();
            blobElem2.type = "sensor";
            blobElem2.subType = BlobManager.BLOB_ELEM_SUBTYPE_GYRO;
            blobElem2.version = "1.0";
            blobElem2.idx = 1;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("sensorData", remove);
            jSONObject.put("sensorResult", (Object) false);
            blobElem2.content = processSensorData(jSONObject.toJSONString());
            arrayList.add(blobElem2);
        }
        Object remove2 = map.remove("depthInfo");
        if (remove2 != null) {
            BlobElem blobElem3 = new BlobElem();
            blobElem3.type = "face";
            blobElem3.subType = BlobManager.SUB_TYPE_DEPTH;
            blobElem3.content = Base64.encode(processDepthInfo((ToygerDepthInfo) remove2), 0);
            blobElem3.version = "1.0";
            blobElem3.idx = 2;
            arrayList.add(blobElem3);
        }
        Meta a2 = a(list, map);
        Blob blob = new Blob();
        blob.blobElem = arrayList;
        blob.blobVersion = "1.0";
        Content content = new Content();
        content.blob = blob;
        content.meta = a2;
        return JSON.toJSONString(content).getBytes();
    }

    @Override // com.alipay.zoloz.toyger.face.FaceBlobManager
    public void addMonitorImage(TGFrame tGFrame) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dddfab93", new Object[]{this, tGFrame});
            return;
        }
        BlobElem a2 = a(tGFrame);
        if (this.f6277a == null) {
            this.f6277a = new ArrayList();
        }
        if (a2 == null) {
            return;
        }
        synchronized (this) {
            a2.idx = this.f6277a.size();
            this.f6277a.add(a2);
        }
    }

    @Override // com.alipay.zoloz.toyger.face.FaceBlobManager
    public void addMonitorImage(TGFrame tGFrame, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de1679a1", new Object[]{this, tGFrame, new Boolean(z)});
            return;
        }
        BlobElem a2 = a(tGFrame);
        if (this.f6277a == null) {
            this.f6277a = new ArrayList();
        }
        if (a2 == null) {
            return;
        }
        synchronized (this) {
            a2.idx = this.f6277a.size();
            this.f6277a.add(a2);
        }
    }

    @Override // com.alipay.zoloz.toyger.face.FaceBlobManager
    public byte[] getMonitorBlob(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("94b32571", new Object[]{this, new Boolean(z)});
        }
        List<BlobElem> list = this.f6277a;
        byte[] bArr = null;
        if (list != null && !list.isEmpty()) {
            Meta a2 = a((List<ToygerFaceInfo>) null, (Map<String, Object>) null);
            Blob blob = new Blob();
            blob.blobElem = this.f6277a;
            blob.blobVersion = "1.0";
            Content content = new Content();
            content.blob = blob;
            content.meta = a2;
            synchronized (this) {
                bArr = JSON.toJSONString(content).getBytes();
            }
        }
        return bArr;
    }

    @Override // com.alipay.zoloz.toyger.face.FaceBlobManager
    public byte[] generateFaceBlob(TGFrame tGFrame, ToygerFaceAttr toygerFaceAttr) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (byte[]) ipChange.ipc$dispatch("58c2aaa3", new Object[]{this, tGFrame, toygerFaceAttr}) : new byte[0];
    }

    @Override // com.alipay.zoloz.toyger.face.FaceBlobManager
    public byte[] getFileIdBlob(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("9c8e9942", new Object[]{this, str});
        }
        HashMap hashMap = new HashMap();
        hashMap.put(UploadConstants.FILE_ID, str);
        Meta a2 = a((List<ToygerFaceInfo>) null, hashMap);
        Content content = new Content();
        content.meta = a2;
        content.blob = new Blob();
        return JSON.toJSONString(content).getBytes();
    }

    private BlobElem a(TGFrame tGFrame) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return (BlobElem) ipChange.ipc$dispatch("f2598abc", new Object[]{this, tGFrame});
        }
        BlobElem blobElem = new BlobElem();
        blobElem.type = "face";
        blobElem.subType = BlobManager.SUB_TYPE_SURVEILLANCE;
        blobElem.version = "1.0";
        try {
            blobElem.content = processFrame(tGFrame, 160, 30, BlobManager.UPLOAD_IMAGE_TYPE_JPEG, !this.isMirror);
            if (blobElem.content == null) {
                Log.e(BlobManager.TAG, "failed to generate element content");
                return null;
            }
            if (blobElem.content != null) {
                i = blobElem.content.length;
            }
            ToygerLog.i("TOYGER_FLOW_ANDROID", "FaceBlobManagerJson.generateMonitorBlob size:" + i);
            return blobElem;
        } catch (Throwable unused) {
            ToygerLog.e(BlobManager.TAG, "FaceBlobManagerPb.generateMonitorBlob(), content is null");
            return null;
        }
    }

    private Content a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Content) ipChange.ipc$dispatch("cf69eb7", new Object[]{this, str});
        }
        if (str == null) {
            return null;
        }
        return (Content) JSON.parseObject(str, Content.class);
    }

    @Override // com.alipay.zoloz.toyger.face.FaceBlobManager
    public Map<String, Object> generateBlob(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("e7858561", new Object[]{this, map});
        }
        Content content = null;
        if (map == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        Blob blob = new Blob();
        blob.blobElem = new ArrayList();
        blob.blobVersion = "1.0";
        Content content2 = new Content();
        Map map2 = (Map) map.remove(ToygerBaseService.KEY_COMPLETE_BLOB);
        Map map3 = (Map) map.remove(ToygerBaseService.KEY_NINE_SHOT_BLOB);
        Map map4 = (Map) map.remove(ToygerBaseService.KEY_ASYNC_BLOB);
        byte[] bArr = map2 != null ? (byte[]) map2.get("content") : null;
        byte[] bArr2 = map3 != null ? (byte[]) map3.get("content") : null;
        byte[] bArr3 = map4 != null ? (byte[]) map4.get("content") : null;
        Content a2 = bArr != null ? a(new String(bArr)) : null;
        Content a3 = bArr2 != null ? a(new String(bArr2)) : null;
        if (bArr3 != null) {
            content = a(new String(bArr3));
        }
        if (a2 != null) {
            content2.meta = a2.meta;
            blob.blobElem.addAll(a2.blob.blobElem);
        }
        if (a3 != null) {
            if (content2.meta == null) {
                content2.meta = a3.meta;
            }
            blob.blobElem.addAll(a3.blob.blobElem);
        }
        if (content != null) {
            if (content2.meta == null) {
                content2.meta = content.meta;
            }
            blob.blobElem.addAll(content.blob.blobElem);
        }
        content2.blob = blob;
        hashMap.put("content", JSON.toJSONString(content2).getBytes());
        hashMap.putAll(map);
        StringBuilder sb = new StringBuilder();
        sb.append("generateBlob blobSize ");
        if (JSON.toJSONString(content2).getBytes() != null) {
            i = JSON.toJSONString(content2).getBytes().length;
        }
        sb.append(i);
        ToygerLog.i("TOYGER_FLOW_ANDROID", sb.toString());
        return hashMap;
    }

    public FaceInfo a(ToygerFaceInfo toygerFaceInfo, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FaceInfo) ipChange.ipc$dispatch("2b1050e2", new Object[]{this, toygerFaceInfo, new Boolean(z)});
        }
        FaceInfo faceInfo = new FaceInfo();
        int i = toygerFaceInfo.frame.rotation % 180 == 0 ? toygerFaceInfo.frame.width : toygerFaceInfo.frame.height;
        int i2 = i == toygerFaceInfo.frame.width ? toygerFaceInfo.frame.height : toygerFaceInfo.frame.width;
        int intValue = (i <= this.config.getDesiredWidth().intValue() || this.config.getDesiredWidth().intValue() <= 0) ? i : this.config.getDesiredWidth().intValue();
        faceInfo.rect = convertFaceRegion(((ToygerFaceAttr) toygerFaceInfo.attr).region(), intValue, (int) ((intValue / i) * i2), toygerFaceInfo.frame.rotation, z);
        faceInfo.quality = ((ToygerFaceAttr) toygerFaceInfo.attr).quality();
        return faceInfo;
    }

    private Meta a(List<ToygerFaceInfo> list, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Meta) ipChange.ipc$dispatch("df8b17b", new Object[]{this, list, map});
        }
        Meta meta = new Meta();
        meta.type = "zface";
        if (map != null) {
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                Float valueOf = Float.valueOf(Float.parseFloat(entry.getValue().toString()));
                if (valueOf != null) {
                    map.put(entry.getKey(), valueOf);
                }
            }
        }
        meta.score = map;
        meta.serialize = 1;
        HashMap hashMap = new HashMap();
        hashMap.put(BlobManager.BLOB_ELEM_IMAGE_TYPE, BlobManager.UPLOAD_IMAGE_TYPE_JPEG);
        HashMap hashMap2 = new HashMap();
        if (this.grayModelParamDetect != "") {
            hashMap2.put(BlobManager.BLOB_ELEM_GRAYMODEL_DETECT, this.grayModelParamDetect);
        }
        if (this.grayModelParamLiveness != "") {
            hashMap2.put(BlobManager.BLOB_ELEM_GRAYMODEL_LIVENESS, this.grayModelParamLiveness);
        }
        hashMap.put("usedModels", hashMap2);
        if (this.runtimeInfo != null) {
            hashMap.put("runtimeInfo", this.runtimeInfo);
        }
        if (list != null && !list.isEmpty()) {
            ToygerFaceInfo toygerFaceInfo = list.get(0);
            if (toygerFaceInfo.attr != 0) {
                hashMap.put("faceCount", Integer.valueOf(((ToygerFaceAttr) toygerFaceInfo.attr).faceCount));
            }
        }
        meta.collectInfo = hashMap;
        return meta;
    }
}
