package com.alipay.zoloz.toyger.face;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;
import com.alipay.zoloz.toyger.ToygerLog;
import com.alipay.zoloz.toyger.algorithm.ToygerBlobConfig;
import com.alipay.zoloz.toyger.blob.BlobManager;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public class ToygerFaceBlobConfig extends ToygerBlobConfig {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public List<String> dataCollection;
    public String uploadImageType;
    public float upload_compress_rate = 0.7f;
    public float color_nano_compress_rate = 0.95f;
    public float gray_nano_compress_rate = 0.95f;
    public int desiredWidth = 480;
    public List<String> collection = new ArrayList();

    public ToygerFaceBlobConfig() {
        this.collection.add(BlobManager.SUB_TYPE_PANO);
        this.dataCollection = new ArrayList();
        this.uploadImageType = BlobManager.UPLOAD_IMAGE_TYPE_JPEG;
    }

    @Override // com.alipay.zoloz.toyger.algorithm.ToygerBlobConfig
    public float getCompressRate(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c747a874", new Object[]{this, new Integer(i)})).floatValue();
        }
        if (4 == i) {
            return this.color_nano_compress_rate;
        }
        if (5 == i) {
            return this.gray_nano_compress_rate;
        }
        return this.upload_compress_rate;
    }

    @Override // com.alipay.zoloz.toyger.algorithm.ToygerBlobConfig
    public String getUploadImageType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("72279dbb", new Object[]{this}) : this.uploadImageType;
    }

    @Override // com.alipay.zoloz.toyger.algorithm.ToygerBlobConfig
    public Integer getDesiredWidth() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Integer) ipChange.ipc$dispatch("cbf35430", new Object[]{this}) : Integer.valueOf(this.desiredWidth);
    }

    public static ToygerFaceBlobConfig from(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ToygerFaceBlobConfig) ipChange.ipc$dispatch("3d9dfa07", new Object[]{str, str2});
        }
        if (str == null || str2 == null) {
            return new ToygerFaceBlobConfig();
        }
        ToygerFaceBlobConfig toygerFaceBlobConfig = new ToygerFaceBlobConfig();
        try {
            toygerFaceBlobConfig = (ToygerFaceBlobConfig) JSON.parseObject(str, ToygerFaceBlobConfig.class);
        } catch (JSONException e) {
            ToygerLog.i("TOYGER_FLOW_ANDROID", "ToygerFaceBlobConfig parse jsonstring failed" + e.getMessage() + ", jsonString: " + str);
        }
        if (toygerFaceBlobConfig.desiredWidth <= 0) {
            toygerFaceBlobConfig.desiredWidth = 1280;
        }
        if (toygerFaceBlobConfig.collection == null) {
            toygerFaceBlobConfig.collection = new ArrayList();
        }
        toygerFaceBlobConfig.pubkey = str2;
        if (toygerFaceBlobConfig.uploadImageType == null) {
            toygerFaceBlobConfig.uploadImageType = BlobManager.UPLOAD_IMAGE_TYPE_JPEG;
        }
        return toygerFaceBlobConfig;
    }

    public int getMinWidth(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("82adfd85", new Object[]{this, new Integer(i)})).intValue();
        }
        int i2 = this.desiredWidth;
        return i2 > i ? i : i2;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "ToygerFaceBlobConfig{upload_compress_rate=" + this.upload_compress_rate + ", color_nano_compress_rate=" + this.color_nano_compress_rate + ", desiredWidth=" + this.desiredWidth + ", collection=" + this.collection + ", uploadImageType='" + this.uploadImageType + "'}";
    }
}
