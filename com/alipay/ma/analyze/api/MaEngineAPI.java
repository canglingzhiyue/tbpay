package com.alipay.ma.analyze.api;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import com.alipay.ma.EngineType;
import com.alipay.ma.MaBuryRecord;
import com.alipay.ma.MaLogger;
import com.alipay.ma.decode.DecodeResult;
import com.alipay.ma.decode.DecodeType;
import com.alipay.ma.decode.MaDecode;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* loaded from: classes3.dex */
public class MaEngineAPI {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "MaEngineAPI";
    public static boolean sEngineSoLoaded;

    /* renamed from: a  reason: collision with root package name */
    public EngineType f5312a;
    public String b;
    public int c;
    private DecodeType e;
    private float[] d = {-1.0f, -1.0f, -1.0f};
    public int classicFrameCount = 0;

    public boolean init(Context context, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("48838558", new Object[]{this, context, map})).booleanValue();
        }
        MaDecode.decodeInit();
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = map.get(str);
                if (obj != null) {
                    MaDecode.setReaderParamsJ(str, obj.toString());
                }
            }
        }
        this.e = null;
        return true;
    }

    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        this.e = null;
        MaDecode.decodeUnInit();
    }

    public void setSubScanType(EngineType engineType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37c8ae0b", new Object[]{this, engineType});
            return;
        }
        this.f5312a = engineType;
        this.b = null;
    }

    public void setSubScanType(EngineType engineType, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd508b15", new Object[]{this, engineType, str});
            return;
        }
        this.f5312a = engineType;
        this.b = str;
    }

    public DecodeResult[] doProcess(byte[] bArr, Rect rect, Point point, int i, int i2, float f) {
        Rect rect2;
        DecodeType decodeType;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DecodeResult[]) ipChange.ipc$dispatch("68864de4", new Object[]{this, bArr, rect, point, new Integer(i), new Integer(i2), new Float(f)});
        }
        DecodeResult[] decodeResultArr = null;
        if (bArr == null) {
            MaLogger.d(TAG, "doProcess mData == null");
            MaBuryRecord.reportUnusualScanCase(1, "mData is null");
            return null;
        }
        this.classicFrameCount++;
        if (rect != null) {
            if (rect.left < 0) {
                rect.left = 0;
            }
            if (rect.top < 0) {
                rect.top = 0;
            }
            if (rect.right > point.x) {
                rect.right = point.x;
            }
            if (rect.bottom > point.y) {
                rect.bottom = point.y;
            }
            rect2 = rect;
        } else {
            rect2 = null;
        }
        if (rect2 == null) {
            MaBuryRecord.reportUnusualScanCase(3, "scanRect is null");
            MaLogger.d(TAG, "doProcess maResults = null");
        } else {
            if (this.f5312a == EngineType.DEFAULT) {
                decodeType = DecodeType.DEFAULTCODE;
            } else if (this.f5312a == EngineType.ALL) {
                decodeType = DecodeType.ALLCODE;
            } else if (this.f5312a == EngineType.QRCODE) {
                decodeType = DecodeType.ALLQRCODE;
            } else if (this.f5312a == EngineType.BAR) {
                decodeType = DecodeType.ALLBARCODE;
            } else if (this.f5312a == EngineType.LOTTERY) {
                decodeType = DecodeType.ALLLOTTERYCODE;
            } else {
                decodeType = this.b == null ? DecodeType.DEFAULTCODE : null;
            }
            if (this.e == null) {
                this.e = decodeType;
                MaLogger.d(TAG, "doProcess: recognizeType=" + this.f5312a + ", typeSet=" + this.b);
            }
            DecodeResult[] decodeScanMode = MaAnalyzeAPI.decodeScanMode(bArr, point.x, point.y, i, rect2, DecodeType.getCode(decodeType, this.b), f);
            if (decodeScanMode != null) {
                if (decodeScanMode.length == 0) {
                    MaBuryRecord.reportUnusualScanCase(4, "maResults.length is 0");
                    MaLogger.d(TAG, "doProcess maResults.length == 0");
                } else {
                    MaLogger.d(TAG, "total get " + decodeScanMode.length + " codes");
                    for (DecodeResult decodeResult : decodeScanMode) {
                        MaLogger.d(TAG, decodeResult.toString());
                    }
                }
            }
            decodeResultArr = decodeScanMode;
        }
        if (decodeResultArr == null) {
            this.c = a();
        } else {
            this.c = -1;
        }
        return decodeResultArr;
    }

    public float getMaProportion() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("7f299a3b", new Object[]{this})).floatValue() : MaDecode.getMaProportionJ();
    }

    public float getMaLimitFactor() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("84600f77", new Object[]{this})).floatValue() : MaDecode.getLimitZoomFactorJ();
    }

    public float[] getQRSizeAndCednter() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (float[]) ipChange.ipc$dispatch("2d9db1e4", new Object[]{this});
        }
        float[] fArr = new float[4];
        MaDecode.getQrSizeAndCenterJ(fArr);
        return fArr;
    }

    public int getMaProportionSource() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("77b5f5f9", new Object[]{this})).intValue() : MaDecode.getMaProportionSourceJ();
    }

    public int getAvgGray() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("901f5919", new Object[]{this})).intValue() : this.c;
    }

    public int a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[]{this})).intValue() : MaDecode.getLastFrameAverageGray();
    }
}
