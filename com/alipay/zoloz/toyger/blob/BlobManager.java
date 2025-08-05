package com.alipay.zoloz.toyger.blob;

import com.alipay.zoloz.image.ToygerImageUtil;
import com.alipay.zoloz.toyger.ToygerBiometricInfo;
import com.alipay.zoloz.toyger.ToygerLog;
import com.alipay.zoloz.toyger.algorithm.TGFrame;
import com.alipay.zoloz.toyger.algorithm.ToygerBlobConfig;
import com.alipay.zoloz.toyger.face.ToygerDepthInfo;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public abstract class BlobManager<Info extends ToygerBiometricInfo> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String BLOB_ELEM_GRAYMODEL_DETECT = "toyger_detect";
    public static final String BLOB_ELEM_GRAYMODEL_LIVENESS = "toyger_liveness";
    public static final String BLOB_ELEM_IMAGE_TYPE = "ImageType";
    public static final String BLOB_ELEM_SUBTYPE_GYRO = "gyro";
    public static final String BLOB_ELEM_TYPE_CAMERA = "camera";
    public static final String BLOB_ELEM_TYPE_DOC = "doc";
    public static final String BLOB_ELEM_TYPE_FACE = "face";
    public static final String BLOB_ELEM_TYPE_FACE_HEVC = "face-hevc";
    public static final String BLOB_ELEM_TYPE_FACE_WEBP = "face-webp";
    public static final String BLOB_ELEM_TYPE_SENSOR = "sensor";
    public static final String BLOB_VERSION = "1.0";
    public static final int META_ALGRESULT_BAT = 3;
    public static final int META_ALGRESULT_DRAGONFLY = 2;
    public static final int META_ALGRESULT_VERIFY = 1;
    public static final String META_COLL_KEY_AUTH_INFO = "authInfo";
    public static final String META_COLL_KEY_IMAGE_SIG = "imageSig";
    public static final int META_SERIALIZER_JSON = 1;
    public static final int META_SERIALIZER_PB = 2;
    public static final String META_TYPE_DOC = "zdoc";
    public static final String META_TYPE_FACE = "zface";
    public static final String SUB_TYPE_DARK = "Dark";
    public static final String SUB_TYPE_DEPTH = "Depth";
    public static final String SUB_TYPE_DOC_IMAGE = "docimage";
    public static final String SUB_TYPE_GRAY_NANO = "GrayNano";
    public static final String SUB_TYPE_GYRO = "Gyro";
    public static final String SUB_TYPE_IR = "SLIR";
    public static final String SUB_TYPE_NANO = "Nano";
    public static final String SUB_TYPE_PANO = "Pano";
    public static final String SUB_TYPE_PEGASUS = "Pegasus";
    public static final String SUB_TYPE_SURVEILLANCE = "Surveillance";
    public static final String SUB_TYPE_VERSION = "1.0";
    public static final String TAG = "TOYGER_FLOW_BlobManager";
    public static final String UPLOAD_IMAGE_TYPE_HEVC = "hevc";
    public static final String UPLOAD_IMAGE_TYPE_JPEG = "jpeg";
    public static final String UPLOAD_IMAGE_TYPE_WEBP = "webp";
    public ToygerBlobConfig config;
    public CryptoManager crypto;

    public abstract byte[] generateBlob(List<Info> list, Map<String, Object> map);

    public abstract byte[] getKey();

    public abstract boolean isUTF8();

    public static String convertUploadImageTypeToBlobElemType(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9028454d", new Object[]{str}) : UPLOAD_IMAGE_TYPE_JPEG.equalsIgnoreCase(str) ? "face" : UPLOAD_IMAGE_TYPE_HEVC.equalsIgnoreCase(str) ? BLOB_ELEM_TYPE_FACE_HEVC : UPLOAD_IMAGE_TYPE_WEBP.equalsIgnoreCase(str) ? BLOB_ELEM_TYPE_FACE_WEBP : "face";
    }

    public byte[] processSensorData(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (byte[]) ipChange.ipc$dispatch("3e0764b9", new Object[]{this, str}) : this.crypto.encrypt(str.getBytes());
    }

    public byte[] processFrame(TGFrame tGFrame, String str, boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (byte[]) ipChange.ipc$dispatch("e7136d8a", new Object[]{this, tGFrame, str, new Boolean(z)}) : processFrame(tGFrame, this.config.getDesiredWidth().intValue(), (int) (this.config.getCompressRate(tGFrame.frameType) * 100.0f), str, z);
    }

    public byte[] processIRFrameInfo(TGFrame tGFrame, boolean z) {
        IpChange ipChange = $ipChange;
        boolean z2 = true;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("ae31861b", new Object[]{this, tGFrame, new Boolean(z)});
        }
        int intValue = this.config.getDesiredWidth().intValue();
        int compressRate = (int) (this.config.getCompressRate(tGFrame.frameType) * 100.0f);
        if (tGFrame != null && tGFrame.data != null) {
            z2 = false;
        }
        if (z2) {
            ToygerLog.e(TAG, "BlobManager.processFrame(), frame data is null");
        } else {
            byte[] tgFrameToBlob = ToygerImageUtil.tgFrameToBlob(tGFrame, intValue, compressRate, UPLOAD_IMAGE_TYPE_JPEG, z);
            if (tgFrameToBlob == null) {
                ToygerLog.e(TAG, "ToygerImageUtil frameToBlob return null");
            } else {
                byte[] encrypt = this.crypto.encrypt(tgFrameToBlob);
                if (encrypt != null) {
                    return encrypt;
                }
                ToygerLog.e(TAG, "failed to encrypt");
            }
        }
        return null;
    }

    public byte[] processDepthInfo(ToygerDepthInfo toygerDepthInfo) {
        byte[] encrypt;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("1bada4e3", new Object[]{this, toygerDepthInfo});
        }
        if (toygerDepthInfo == null) {
            return null;
        }
        String str = "before length " + toygerDepthInfo.depthInfo.length + "after length " + encrypt.length;
        return this.crypto.encrypt(toygerDepthInfo.depthInfo);
    }

    public byte[] encryptFrame(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("7ca3e807", new Object[]{this, bArr});
        }
        if (bArr == null) {
            ToygerLog.e(TAG, "ToygerImageUtil frameToBlob return null");
        } else {
            byte[] encrypt = this.crypto.encrypt(bArr);
            if (encrypt != null) {
                return encrypt;
            }
            ToygerLog.e(TAG, "failed to encrypt");
        }
        return null;
    }

    public byte[] processFrame(TGFrame tGFrame, int i, int i2, String str, boolean z) {
        IpChange ipChange = $ipChange;
        boolean z2 = true;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("a22b4c2a", new Object[]{this, tGFrame, new Integer(i), new Integer(i2), str, new Boolean(z)});
        }
        if (tGFrame != null && (tGFrame.data != null || tGFrame.byteBuffer != null)) {
            z2 = false;
        }
        if (z2) {
            ToygerLog.e(TAG, "BlobManager.processFrame(), frame data is null");
        } else {
            if (tGFrame.data == null) {
                tGFrame.byteBuffer.clear();
                tGFrame.data = new byte[tGFrame.byteBuffer.remaining()];
                tGFrame.byteBuffer.get(tGFrame.data);
            }
            ToygerLog.e(TAG, "BlobManager.processFrame(), frame data is null" + i2);
            byte[] tgFrameToBlob = ToygerImageUtil.tgFrameToBlob(tGFrame, i, (float) i2, str, z);
            if (tgFrameToBlob == null) {
                ToygerLog.e(TAG, "ToygerImageUtil frameToBlob return null");
            } else {
                byte[] encrypt = this.crypto.encrypt(tgFrameToBlob);
                if (encrypt != null) {
                    return encrypt;
                }
                ToygerLog.e(TAG, "failed to encrypt");
            }
        }
        return null;
    }
}
