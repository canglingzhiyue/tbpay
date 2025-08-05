package com.alipay.zoloz.toyger.face;

import android.graphics.Rect;
import android.graphics.RectF;
import com.alipay.zoloz.toyger.algorithm.TGFrame;
import com.alipay.zoloz.toyger.blob.BlobManager;
import com.alipay.zoloz.toyger.blob.CryptoManager;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public abstract class FaceBlobManager extends BlobManager<ToygerFaceInfo> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public byte[] bestDepthImage;
    public byte[] bestIRImage;
    public byte[] bestLightImage;
    public String compressFormat;
    public float compressRate;
    public ToygerDepthInfo depthInfo;
    public int desireWidth;
    public TGFrame irFrame;
    public boolean isGyroNeeded;
    public boolean isMirror;
    public boolean isNano;
    public String grayModelParamDetect = "";
    public String grayModelParamLiveness = "";
    public Map<String, String> runtimeInfo = null;
    public List<ToygerDataInfo> dataInfos = new ArrayList();

    public abstract void addMonitorImage(TGFrame tGFrame);

    public abstract void addMonitorImage(TGFrame tGFrame, boolean z);

    public abstract Map<String, Object> generateBlob(Map<String, Object> map);

    @Override // com.alipay.zoloz.toyger.blob.BlobManager
    public abstract byte[] generateBlob(List<ToygerFaceInfo> list, Map<String, Object> map);

    @Deprecated
    public abstract byte[] generateFaceBlob(TGFrame tGFrame, ToygerFaceAttr toygerFaceAttr);

    public abstract byte[] generateLocalMatchingBlob(String str, byte[] bArr, byte[] bArr2, String str2);

    public abstract byte[] getFileIdBlob(String str);

    public abstract byte[] getMonitorBlob(boolean z);

    @Override // com.alipay.zoloz.toyger.blob.BlobManager
    public abstract boolean isUTF8();

    public FaceBlobManager() {
    }

    public FaceBlobManager(ToygerFaceBlobConfig toygerFaceBlobConfig, boolean z) {
        this.config = toygerFaceBlobConfig;
        this.desireWidth = toygerFaceBlobConfig.desiredWidth;
        this.crypto = new CryptoManager(toygerFaceBlobConfig.pubkey, z);
        this.isNano = toygerFaceBlobConfig.collection.contains(BlobManager.SUB_TYPE_NANO) || toygerFaceBlobConfig.collection.contains(BlobManager.SUB_TYPE_GRAY_NANO);
        this.isGyroNeeded = toygerFaceBlobConfig.collection.contains(BlobManager.SUB_TYPE_GYRO);
    }

    @Override // com.alipay.zoloz.toyger.blob.BlobManager
    public byte[] getKey() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (byte[]) ipChange.ipc$dispatch("96e2cfad", new Object[]{this}) : this.crypto.getAESCypher();
    }

    public static Rect convertFaceRegion(RectF rectF, int i, int i2, int i3, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Rect) ipChange.ipc$dispatch("41e42276", new Object[]{rectF, new Integer(i), new Integer(i2), new Integer(i3), new Boolean(z)});
        }
        if (z) {
            float f = i;
            float f2 = i2;
            return new Rect((int) ((1.0f - rectF.right) * f), (int) (rectF.top * f2), (int) ((1.0f - rectF.left) * f), (int) (rectF.bottom * f2));
        }
        float f3 = i;
        float f4 = i2;
        return new Rect((int) (rectF.left * f3), (int) (rectF.top * f4), (int) (rectF.right * f3), (int) (rectF.bottom * f4));
    }

    public String a(ToygerFaceInfo toygerFaceInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e01da665", new Object[]{this, toygerFaceInfo});
        }
        int i = toygerFaceInfo.frame.frameType;
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? (i == 4 || i == 5) ? BlobManager.SUB_TYPE_NANO : "" : BlobManager.SUB_TYPE_IR : BlobManager.SUB_TYPE_DEPTH : BlobManager.SUB_TYPE_DARK : BlobManager.SUB_TYPE_PANO;
    }
}
