package com.alipay.ma.decode;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.Rect;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.alipay.ma.MaBuryRecord;
import com.alipay.ma.MaLogger;
import com.alipay.ma.analyze.api.MaEngineAPI;
import com.alipay.ma.analyze.helper.MaResultTypeHelper;
import com.alipay.ma.common.result.ResultMaType;
import com.alipay.ma.util.ImageTool;
import com.alipay.ma.util.StringEncodeUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import java.io.FileDescriptor;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import tb.riy;

/* loaded from: classes3.dex */
public class MaDecode {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String AVOID_DESTROY_ENGINE_LOCK = "avoid_destroy_engine_lock";
    public static final String CAMERA2_UPLOAD_IMAGE = "camera2_upload_image";
    public static final String DIAGNOSE_SCAN_FOCUS = "diagnose_scan_focus";
    public static final String FRAME_READ_INFO_BINARIZE_ID = "BINARIZE_ID";
    public static final String FRAME_READ_INFO_FRAME_ID = "FRAME_ID";
    public static final String FRAME_READ_INFO_READ_STEPS = "READ_STEPS";
    public static final String IMAGE_INFO_BLOCK_MAX_STDDEV = "imageInfoBlockMaxStdDev";
    public static final String IMAGE_INFO_ENTROPY = "imageInfoEntropy";
    public static final String IMAGE_INFO_GLOBAL_STDDEV = "imageInfoGlobalStdDev";
    public static final String KEY_CONFIG_JPEG_QUALITY = "config_jpeg_quality";
    public static final String KEY_SCANNOTHINGDURATION = "scanNothingDuration";
    public static final int QR_PARTITION_SOURCE_TRADITION = 0;
    public static final int QR_PARTITION_SOURCE_XNN = 1;
    public static final String SCAN_UPLOAD_IMAGE = "scan_upload_image";
    public static final String SCAN_USE_KEY_INFO = "useKeyDecodeInfo";
    public static final String SO_NAME = "decode100260";
    public static final String TAG = "MaDecode_LOG";

    /* renamed from: a  reason: collision with root package name */
    private static boolean f5313a = false;
    public static int decodeThreadTID = 0;
    public static boolean dynamicCodeDev = false;
    public static long firstFrameIn = -1;
    public static long frameEngineIn = -1;
    public static String loadSoName = "decode100260";
    public static long sEngineSoLoadedTimestamp = 0;
    public static boolean sEngineUseKeyInfo = false;
    public static String scanActivity = "null";
    public static String scanInnerToken = "null";
    public static String scanSourceId = "null";
    public static String scanUIType = "oldUI";

    public static native int AISetup(String str, String str2, String str3, String str4, String str5);

    private static native int AISetupQRToMixed(boolean z);

    public static native int AIUninstall();

    public static native void MultiCodeSwitch(boolean z);

    public static native long RegistDSLReader(String str, boolean z);

    public static native long UnRegistDSLReader(boolean z);

    private static native DecodeResult[] bitmapDecode(Bitmap bitmap, int i, int i2, boolean z);

    public static native int cameraDecodeInit();

    public static native int cameraDecodeUnInit();

    private static native DecodeResult[] codeDecodeWithQr(byte[] bArr, int i, int i2, int i3, int i4, int i5, boolean z);

    private static native Object enableFastBitmapDecode();

    public static native String genDslCodeSvg(String str, String str2, int i, float f, int i2, float f2, int i3, float f3);

    public static native Map getDecodeInfo();

    public static native Map getFrameReadInfo();

    public static native byte[] getImageDataWithToken(String str, String str2, int i);

    public static native Map getImageInfo(byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7);

    public static native Map getImportantDecodeInfo();

    public static native int getLastFrameAvgGray();

    public static native float getLimitZoomFactor();

    public static native float getMaProportion();

    public static native int getMaProportionSource();

    public static native int getQrSizeAndCenter(float[] fArr);

    private static native void materialModelCleanup(long j);

    private static native String materialModelRecognize(long j, byte[] bArr, Rect rect, int i, int i2, int i3, int i4);

    private static native long materialModelSetup(String str, String str2, String str3, String str4, String str5);

    private static native String materialNDAnalyze(byte[] bArr, Rect rect, int i, int i2, int i3, String str, String str2, String str3, String str4, String str5, int i4, List<String> list);

    public static native String needA();

    public static native void needDownGradeSdkMemoryAllocate();

    public static native boolean pushCyclerStream(byte[] bArr, String str, int i);

    public static native long pushCyclerStreamNew(byte[] bArr, String str, String str2, int i);

    public static native void refreshTinyCodeBizConfig(boolean z, int i, String str);

    public static native void setFilterConfig(String str);

    public static native int setReaderParams(String str, String str2);

    public static native String statisticsCodeMainColorV1(byte[] bArr, int i, int i2, int i3, int[] iArr, int i4);

    public static native String statisticsCodeMainColorV2(byte[] bArr, int i, byte[] bArr2, int i2, byte[] bArr3, int i3, int i4, int i5, int i6, int[] iArr, int i7);

    private static native DecodeResult[] yuvcodeDecode(byte[] bArr, int i, int i2, int i3, Rect rect, int i4, String str, String[] strArr, float f);

    static {
        init("static");
        f5313a = false;
    }

    public static void init(String str) {
        long currentTimeMillis = System.currentTimeMillis();
        try {
            int i = 0;
            boolean booleanValue = ((Boolean) Class.forName("com.alipay.ma.dynamic.SoDynamicManager").getDeclaredMethod("loadSo", null).invoke(null, new Object[0])).booleanValue();
            long currentTimeMillis2 = System.currentTimeMillis();
            sEngineSoLoadedTimestamp = currentTimeMillis2;
            long j = currentTimeMillis2 - currentTimeMillis;
            if (!booleanValue) {
                i = 2;
            }
            MaBuryRecord.reportSoLoadResult(i, str, j);
            MaEngineAPI.sEngineSoLoaded = true;
            Log.e(TAG, "decode so load duration " + j);
            MaLogger.w(TAG, "decode so load duration " + j);
        } catch (Throwable th) {
            MaLogger.w(TAG, "so load with framework failed, fall back: decode100260, error: " + th.getMessage());
            try {
                System.loadLibrary(SO_NAME);
                long currentTimeMillis3 = System.currentTimeMillis();
                sEngineSoLoadedTimestamp = currentTimeMillis3;
                MaBuryRecord.reportSoLoadResult(1, str, currentTimeMillis3 - currentTimeMillis);
                MaEngineAPI.sEngineSoLoaded = true;
            } catch (UnsatisfiedLinkError e) {
                MaLogger.e(TAG, "Failed to load decode100260, " + e.getMessage());
                MaBuryRecord.reportSoLoadResult(-1, str, -1L);
            }
        }
    }

    public static void recordScanDecodeTrack(String str, String str2, HashMap hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("299cdda9", new Object[]{str, str2, hashMap});
            return;
        }
        if (hashMap != null) {
            hashMap.put("scanUIType", scanUIType);
            hashMap.put("scan_SourceId", scanSourceId);
            hashMap.put("innerToken", scanInnerToken);
            hashMap.put("loadSoName", loadSoName);
            hashMap.put("isDynamicSo", Boolean.valueOf(!SO_NAME.equals(loadSoName)));
        }
        MaBuryRecord.recordScanDecodeTrack(str, str2, hashMap);
    }

    public static void recordScanDecodeLog(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4ea09c3", new Object[]{str, str2});
        } else {
            MaLogger.d(str, str2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0096 A[Catch: all -> 0x013c, TryCatch #4 {, blocks: (B:4:0x0003, B:10:0x000b, B:12:0x000f, B:16:0x0019, B:17:0x0044, B:21:0x0056, B:33:0x0092, B:35:0x0096, B:37:0x00a3, B:39:0x00ab, B:47:0x010b, B:50:0x010f, B:52:0x0112, B:20:0x0055, B:29:0x0067, B:32:0x0073, B:40:0x00d7), top: B:61:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x010b A[Catch: all -> 0x013c, TRY_ENTER, TryCatch #4 {, blocks: (B:4:0x0003, B:10:0x000b, B:12:0x000f, B:16:0x0019, B:17:0x0044, B:21:0x0056, B:33:0x0092, B:35:0x0096, B:37:0x00a3, B:39:0x00ab, B:47:0x010b, B:50:0x010f, B:52:0x0112, B:20:0x0055, B:29:0x0067, B:32:0x0073, B:40:0x00d7), top: B:61:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0112 A[Catch: all -> 0x013c, TRY_LEAVE, TryCatch #4 {, blocks: (B:4:0x0003, B:10:0x000b, B:12:0x000f, B:16:0x0019, B:17:0x0044, B:21:0x0056, B:33:0x0092, B:35:0x0096, B:37:0x00a3, B:39:0x00ab, B:47:0x010b, B:50:0x010f, B:52:0x0112, B:20:0x0055, B:29:0x0067, B:32:0x0073, B:40:0x00d7), top: B:61:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static synchronized com.alipay.ma.decode.DecodeResult[] codeDecode(byte[] r6, int r7, int r8, int r9, android.graphics.Rect r10, int r11, java.lang.String r12, java.lang.String[] r13, float r14) {
        /*
            Method dump skipped, instructions count: 319
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.ma.decode.MaDecode.codeDecode(byte[], int, int, int, android.graphics.Rect, int, java.lang.String, java.lang.String[], float):com.alipay.ma.decode.DecodeResult[]");
    }

    private static DecodeResult a(DecodeResult decodeResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DecodeResult) ipChange.ipc$dispatch("281d9d3a", new Object[]{decodeResult});
        }
        if (decodeResult == null || decodeResult.bytes == null || decodeResult.bytes.length <= 0) {
            return null;
        }
        try {
            if (decodeResult.strLen > 0) {
                int length = decodeResult.bytes.length;
                byte[] bArr = new byte[length];
                System.arraycopy(decodeResult.bytes, 0, bArr, 0, length);
                String stringEncode = StringEncodeUtils.getStringEncode(bArr, false);
                if (TextUtils.isEmpty(stringEncode)) {
                    decodeResult.strCode = new String(bArr, "utf-8");
                    decodeResult.encodeCharset = "utf-8";
                } else {
                    decodeResult.strCode = new String(bArr, stringEncode);
                    decodeResult.encodeCharset = stringEncode;
                    if (decodeResult.strCode != null && TextUtils.equals(stringEncode, "UTF8") && decodeResult.strCode.charAt(0) == 65279) {
                        decodeResult.strCode = decodeResult.strCode.substring(1);
                    }
                }
                if (TextUtils.isEmpty(decodeResult.strCode)) {
                    decodeResult = null;
                }
            } else if (decodeResult.strLen == 0) {
                if (MaResultTypeHelper.getMaType(decodeResult) == ResultMaType.QR) {
                    decodeResult.strCode = "null";
                    decodeResult.encodeCharset = null;
                }
                MaBuryRecord.recodeDecodeFailedMaInfo(MaResultTypeHelper.getMaType(decodeResult) != null ? MaResultTypeHelper.getMaType(decodeResult).name() : null);
            }
            return decodeResult;
        } catch (UnsupportedEncodingException | Exception unused) {
            return null;
        }
    }

    public static synchronized DecodeResult[] codeDecodePictureWithQr(String str, int i, int i2, boolean z) {
        synchronized (MaDecode.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (DecodeResult[]) ipChange.ipc$dispatch("73470f41", new Object[]{str, new Integer(i), new Integer(i2), new Boolean(z)});
            }
            try {
                MaLogger.w(TAG, "codeDecodePictureWithQr called, path= " + str);
                if (TextUtils.isEmpty(str)) {
                    a(-1, str, i, 0, 0);
                    return null;
                }
                File file = new File(str);
                if (!file.exists()) {
                    a(-2, str, i, 0, 0);
                    return null;
                }
                ImageTool.ImageSampleOutInfo imageSampleOutInfo = new ImageTool.ImageSampleOutInfo();
                DecodeResult[] codeDecodePictureWithQr = codeDecodePictureWithQr(ImageTool.createThumbnail(file, 1500, 1500, imageSampleOutInfo), i, str, i2, z);
                adjustMaPositionCoordinate(codeDecodePictureWithQr, imageSampleOutInfo);
                return codeDecodePictureWithQr;
            } catch (Exception unused) {
                return null;
            }
        }
    }

    public static synchronized void adjustMaPositionCoordinate(DecodeResult[] decodeResultArr, ImageTool.ImageSampleOutInfo imageSampleOutInfo) {
        synchronized (MaDecode.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a34151c1", new Object[]{decodeResultArr, imageSampleOutInfo});
                return;
            }
            MaLogger.w(TAG, "adjustMaPositionCoordinate called");
            if (decodeResultArr != null && imageSampleOutInfo != null && decodeResultArr.length > 0) {
                for (int i = 0; i < decodeResultArr.length; i++) {
                    if (imageSampleOutInfo.sampleSize > 1) {
                        int i2 = decodeResultArr[i].x;
                        int i3 = decodeResultArr[i].y;
                        int i4 = decodeResultArr[i].width;
                        int i5 = decodeResultArr[i].height;
                        decodeResultArr[i].x = imageSampleOutInfo.sampleSize * i2;
                        decodeResultArr[i].y = imageSampleOutInfo.sampleSize * i3;
                        decodeResultArr[i].width = imageSampleOutInfo.sampleSize * i4;
                        decodeResultArr[i].height = imageSampleOutInfo.sampleSize * i5;
                        MaLogger.d(TAG, "adjustMaPositionCoordinate sample outInfo=" + imageSampleOutInfo.toString() + ", Coordinate change from [" + i2 + "," + i3 + "," + i4 + "," + i5 + "] to [" + decodeResultArr[i].x + "," + decodeResultArr[i].y + "," + decodeResultArr[i].width + "," + decodeResultArr[i].height + riy.ARRAY_END_STR);
                    }
                }
            }
        }
    }

    public static synchronized DecodeResult[] codeDecodePictureWithQr(String str, Context context, int i, int i2, boolean z) {
        ParcelFileDescriptor parcelFileDescriptor;
        synchronized (MaDecode.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (DecodeResult[]) ipChange.ipc$dispatch("7b541473", new Object[]{str, context, new Integer(i), new Integer(i2), new Boolean(z)});
            }
            ParcelFileDescriptor parcelFileDescriptor2 = null;
            if (TextUtils.isEmpty(str)) {
                a(-1, str, i, 0, 0);
                return null;
            }
            try {
                MaLogger.d(TAG, "codeDecodePictureWithQr called, uriStr=" + str);
                parcelFileDescriptor = context.getContentResolver().openFileDescriptor(Uri.parse(str), "r");
            } catch (Exception unused) {
                parcelFileDescriptor = null;
            } catch (Throwable th) {
                th = th;
            }
            try {
                if (parcelFileDescriptor == null) {
                    a(-2, str, i, 0, 0);
                    if (parcelFileDescriptor != null) {
                        try {
                            parcelFileDescriptor.close();
                        } catch (Exception e) {
                            MaLogger.e(TAG, "error:" + e.getMessage());
                        }
                    }
                    return null;
                }
                FileDescriptor fileDescriptor = parcelFileDescriptor.getFileDescriptor();
                ImageTool.ImageSampleOutInfo imageSampleOutInfo = new ImageTool.ImageSampleOutInfo();
                DecodeResult[] codeDecodePictureWithQr = codeDecodePictureWithQr(ImageTool.createThumbnail(fileDescriptor, 1500, 1500, imageSampleOutInfo), i, str, i2, z);
                adjustMaPositionCoordinate(codeDecodePictureWithQr, imageSampleOutInfo);
                if (parcelFileDescriptor != null) {
                    try {
                        parcelFileDescriptor.close();
                    } catch (Exception e2) {
                        MaLogger.e(TAG, "error:" + e2.getMessage());
                    }
                }
                return codeDecodePictureWithQr;
            } catch (Exception unused2) {
                if (parcelFileDescriptor != null) {
                    try {
                        parcelFileDescriptor.close();
                    } catch (Exception e3) {
                        MaLogger.e(TAG, "error:" + e3.getMessage());
                    }
                }
                return null;
            } catch (Throwable th2) {
                th = th2;
                parcelFileDescriptor2 = parcelFileDescriptor;
                if (parcelFileDescriptor2 != null) {
                    try {
                        parcelFileDescriptor2.close();
                    } catch (Exception e4) {
                        MaLogger.e(TAG, "error:" + e4.getMessage());
                    }
                }
                throw th;
            }
        }
    }

    private static void a(int i, String str, int i2, int i3, int i4) {
        Map hashMap;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("837873de", new Object[]{new Integer(i), str, new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        if (i == -1 || i == -2 || i == -3) {
            hashMap = new HashMap();
        } else {
            hashMap = getDecodeInfoJ();
        }
        if (hashMap == null) {
            return;
        }
        hashMap.put("scanMode", Integer.valueOf(i2));
        hashMap.put("resultCode", Integer.valueOf(i));
        if (str != null) {
            hashMap.put("path", str);
        }
        if (i3 > 0 && i4 > 0) {
            hashMap.put("originWidth", Integer.valueOf(i3));
            hashMap.put("originHeight", Integer.valueOf(i4));
        }
        if (i == 0) {
            MaBuryRecord.recordScanDecodeTrack("SCAN_IMAGE_CODE", "SCAN_IMAGE_SUCCEED", hashMap);
        } else {
            MaBuryRecord.recordScanDecodeTrack("SCAN_IMAGE_CODE", "SCAN_IMAGE_FAILED", hashMap);
        }
    }

    public static synchronized DecodeResult[] codeDecodePictureWithQr(Bitmap bitmap, int i, boolean z) {
        synchronized (MaDecode.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (DecodeResult[]) ipChange.ipc$dispatch("3cf76bec", new Object[]{bitmap, new Integer(i), new Boolean(z)});
            }
            return codeDecodePictureWithQr(bitmap, i, 4, z);
        }
    }

    public static synchronized DecodeResult[] codeDecodePictureWithQr(Bitmap bitmap, int i, int i2, boolean z) {
        synchronized (MaDecode.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (DecodeResult[]) ipChange.ipc$dispatch("3b1a0f23", new Object[]{bitmap, new Integer(i), new Integer(i2), new Boolean(z)});
            }
            return codeDecodePictureWithQr(bitmap, i, (String) null, i2, z);
        }
    }

    private static boolean a() {
        try {
            return ((Boolean) Class.forName("com.alipay.mobile.mascanengine.AlipayMaEngineUtils").getMethod("isNeedBitmapInterfaceOpt", null).invoke(null, new Object[0])).booleanValue();
        } catch (Throwable unused) {
            return false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x0122, code lost:
        a(-6, r16, r15, r14.getWidth(), r14.getHeight());
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static synchronized com.alipay.ma.decode.DecodeResult[] codeDecodePictureWithQr(android.graphics.Bitmap r14, int r15, java.lang.String r16, int r17, boolean r18) {
        /*
            Method dump skipped, instructions count: 359
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.ma.decode.MaDecode.codeDecodePictureWithQr(android.graphics.Bitmap, int, java.lang.String, int, boolean):com.alipay.ma.decode.DecodeResult[]");
    }

    public static int getLastFrameAverageGray() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("30599299", new Object[0])).intValue();
        }
        try {
            return getLastFrameAvgGray();
        } catch (Exception e) {
            MaLogger.e(TAG, e.getMessage());
            return 0;
        } catch (UnsatisfiedLinkError e2) {
            MaLogger.e(TAG, "Failed to load decode100260, " + e2.getMessage());
            init("getLastFrameAverageGray");
            return 0;
        }
    }

    public static void markFirstFrameIn(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea787a6e", new Object[]{new Long(j)});
        } else {
            firstFrameIn = j;
        }
    }

    public static void markEngineFrameIn(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a5a53fa", new Object[]{new Long(j)});
        } else {
            frameEngineIn = j;
        }
    }

    public static void decodeInit() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dca909a5", new Object[0]);
            return;
        }
        MaLogger.d(TAG, "decodeInit()");
        firstFrameIn = -1L;
        frameEngineIn = -1L;
        cameraDecodeInitJ();
    }

    public static void decodeUnInit() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f95207de", new Object[0]);
            return;
        }
        MaLogger.d(TAG, "decodeUnInit()");
        firstFrameIn = -1L;
        frameEngineIn = -1L;
        cameraDecodeUnInitJ();
    }

    public static synchronized DecodeResult[] bitmapDecodeJ(Bitmap bitmap, int i, int i2, boolean z) {
        synchronized (MaDecode.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (DecodeResult[]) ipChange.ipc$dispatch("64864200", new Object[]{bitmap, new Integer(i), new Integer(i2), new Boolean(z)});
            }
            MaLogger.d(TAG, "bitmap_scan_opt()");
            return bitmapDecode(bitmap, i, i2, z);
        }
    }

    public static Object enableFastBitmapDecodeJ() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("46be9c9d", new Object[0]);
        }
        MaLogger.d(TAG, "enableFastBitmapDecodeJ()");
        try {
            enableFastBitmapDecode();
            return null;
        } catch (Throwable th) {
            MaLogger.e(TAG, "enableFastBitmapDecodeJ call native exception", th);
            return null;
        }
    }

    public static void needDownGradeSdkMemoryAllocateJ() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8d763d8", new Object[0]);
            return;
        }
        MaLogger.d(TAG, "needDownGradeSdkMemoryAllocate()");
        try {
            needDownGradeSdkMemoryAllocate();
        } catch (Throwable th) {
            MaLogger.e(TAG, "needDownGradeSdkMemoryAllocate call native exception", th);
        }
    }

    public static float getMaProportionJ() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6796f27d", new Object[0])).floatValue();
        }
        try {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            float maProportion = getMaProportion();
            a("getMaProportionJ", SystemClock.elapsedRealtime() - elapsedRealtime);
            return maProportion;
        } catch (UnsatisfiedLinkError e) {
            MaLogger.e(TAG, "getMaProportionJ: " + e.getMessage());
            return -1.0f;
        } catch (Error e2) {
            MaLogger.e(TAG, "getMaProportionJ: " + e2.getMessage());
            return -1.0f;
        }
    }

    public static int getMaProportionSourceJ() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("80960e25", new Object[0])).intValue();
        }
        try {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            int maProportionSource = getMaProportionSource();
            a("getMaProportionSourceJ", SystemClock.elapsedRealtime() - elapsedRealtime);
            return maProportionSource;
        } catch (UnsatisfiedLinkError e) {
            MaLogger.e(TAG, "getMaProportionSourceJ: " + e.getMessage());
            return -1;
        } catch (Error e2) {
            MaLogger.e(TAG, "getMaProportionSourceJ: " + e2.getMessage());
            return -1;
        }
    }

    public static int setReaderParamsJ(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("66aedf0d", new Object[]{str, str2})).intValue();
        }
        try {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            int readerParams = setReaderParams(str, str2);
            a("setReaderParamsJ", SystemClock.elapsedRealtime() - elapsedRealtime);
            return readerParams;
        } catch (UnsatisfiedLinkError e) {
            MaLogger.e(TAG, "setReaderParams: " + e.getMessage());
            return 0;
        } catch (Error e2) {
            MaLogger.e(TAG, "setReaderParams: " + e2.getMessage());
            return 0;
        }
    }

    public static int cameraDecodeInitJ() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a5151481", new Object[0])).intValue();
        }
        try {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            int cameraDecodeInit = cameraDecodeInit();
            a("cameraDecodeInitJ", SystemClock.elapsedRealtime() - elapsedRealtime);
            return cameraDecodeInit;
        } catch (UnsatisfiedLinkError e) {
            MaLogger.e(TAG, "cameraDecodeInitJ: " + e.getMessage());
            return 0;
        } catch (Error e2) {
            MaLogger.e(TAG, "cameraDecodeInitJ: " + e2.getMessage());
            return 0;
        }
    }

    public static int cameraDecodeUnInitJ() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("983ac2a8", new Object[0])).intValue();
        }
        try {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            int cameraDecodeUnInit = cameraDecodeUnInit();
            a("cameraDecodeUnInitJ", SystemClock.elapsedRealtime() - elapsedRealtime);
            return cameraDecodeUnInit;
        } catch (UnsatisfiedLinkError e) {
            MaLogger.e(TAG, "cameraDecodeUnInitJ: " + e);
            return 0;
        } catch (Error e2) {
            MaLogger.e(TAG, "cameraDecodeUnInitJ: " + e2);
            return 0;
        }
    }

    public static String needAJ() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("63c8391a", new Object[0]);
        }
        try {
            return needA();
        } catch (UnsatisfiedLinkError e) {
            MaLogger.e(TAG, "needAJ: " + e.getMessage());
            return null;
        } catch (Error e2) {
            MaLogger.e(TAG, "needAJ: " + e2.getMessage());
            return null;
        }
    }

    public static Map getDecodeInfoJ() {
        Map decodeInfo;
        String str = "getImportantDecodeInfo: ";
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("ebbd9354", new Object[0]);
        }
        try {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (sEngineUseKeyInfo) {
                decodeInfo = getImportantDecodeInfo();
            } else {
                decodeInfo = getDecodeInfo();
            }
            a(sEngineUseKeyInfo ? "getImportantDecodeInfo" : "getDecodeInfo", SystemClock.elapsedRealtime() - elapsedRealtime);
            return decodeInfo;
        } catch (UnsatisfiedLinkError e) {
            if (!sEngineUseKeyInfo) {
                str = "getDecodeInfo: " + e.getMessage();
            }
            MaLogger.e(TAG, str);
            return null;
        } catch (Error e2) {
            if (!sEngineUseKeyInfo) {
                str = "getDecodeInfo: " + e2.getMessage();
            }
            MaLogger.e(TAG, str);
            return null;
        }
    }

    public static int getQrSizeAndCenterJ(float[] fArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f668c99b", new Object[]{fArr})).intValue();
        }
        try {
            return getQrSizeAndCenter(fArr);
        } catch (UnsatisfiedLinkError e) {
            MaLogger.e(TAG, "getQrSizeAndCenterJ: " + e.getMessage());
            return 0;
        } catch (Error e2) {
            MaLogger.e(TAG, "getQrSizeAndCenterJ: " + e2.getMessage());
            return 0;
        }
    }

    public static Map getFrameReadInfoJ() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("195f442b", new Object[0]);
        }
        try {
            return getFrameReadInfo();
        } catch (UnsatisfiedLinkError e) {
            MaLogger.e(TAG, "getFrameReadInfoJ: " + e);
            return null;
        } catch (Error e2) {
            MaLogger.e(TAG, "getFrameReadInfoJ: " + e2);
            return null;
        }
    }

    public static Map getImageInfoJ(byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("8ed48cf3", new Object[]{bArr, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6), new Integer(i7)});
        }
        try {
            return getImageInfo(bArr, i, i2, i3, i4, i5, i6, i7);
        } catch (UnsatisfiedLinkError e) {
            MaLogger.e(TAG, "getImageInfoJ: " + e.getMessage());
            return null;
        } catch (Error e2) {
            MaLogger.e(TAG, "getImageInfoJ: " + e2.getMessage());
            return null;
        }
    }

    public static float getLimitZoomFactorJ() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5bf79d3a", new Object[0])).floatValue();
        }
        try {
            return getLimitZoomFactor();
        } catch (Throwable unused) {
            return -1.0f;
        }
    }

    public static synchronized int AISetupJ(String str, String str2, String str3, String str4, String str5) {
        synchronized (MaDecode.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("bd94faa1", new Object[]{str, str2, str3, str4, str5})).intValue();
            }
            MaLogger.w(TAG, "AISetupJ called");
            return AISetup(str, str2, str3, str4, str5);
        }
    }

    public static long materialModelSetupJ(String str, String str2, String str3, String str4, String str5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f0c563bc", new Object[]{str, str2, str3, str4, str5})).longValue();
        }
        try {
            MaLogger.d(TAG, String.format("xNNModelUrl: %s, xNNConfig: %s, xNNFrameworkUrl: %s, cvEngineFrameworkUrl: %s, codeType: %s", str, str2, str3, str4, str5));
            return materialModelSetup(str, str2, str3, str4, str5);
        } catch (Throwable th) {
            MaLogger.e(TAG, "materialModelSetupJ: ", th);
            return 0L;
        }
    }

    public static void materialModelCleanupJ(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b2761195", new Object[]{new Long(j)});
            return;
        }
        try {
            materialModelCleanup(j);
        } catch (Throwable th) {
            MaLogger.e(TAG, "materialModelCleanupJ: ", th);
        }
    }

    public static String materialModelRecognizeJ(long j, byte[] bArr, Rect rect, Point point, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cc75c58a", new Object[]{new Long(j), bArr, rect, point, new Integer(i), new Integer(i2)});
        }
        if (i2 != 17 && i2 != 842094169 && i2 != 35) {
            return null;
        }
        try {
            return materialModelRecognize(j, bArr, rect, point.x, point.y, i, 1);
        } catch (Throwable th) {
            MaLogger.e(TAG, "materialModelCleanupJ: ", th);
            return null;
        }
    }

    public static String materialNDAnalyzeJ(byte[] bArr, Rect rect, int i, int i2, int i3, String str, String str2, String str3, String str4, String str5, int i4, List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cb75651", new Object[]{bArr, rect, new Integer(i), new Integer(i2), new Integer(i3), str, str2, str3, str4, str5, new Integer(i4), list});
        }
        if (i4 != 17 && i4 != 842094169 && i4 != 35) {
            return null;
        }
        try {
            return materialNDAnalyze(bArr, rect, i, i2, i3, str, str2, str3, str4, str5, 1, list);
        } catch (Throwable th) {
            MaLogger.e(TAG, "materialNDAnalyzeJ: ", th);
            return null;
        }
    }

    public static int AIUninstallJ() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d893d26a", new Object[0])).intValue();
        }
        try {
            return AIUninstall();
        } catch (Throwable th) {
            MaLogger.e(TAG, "AIUninstallJ: ", th);
            return 0;
        }
    }

    public static synchronized long RegistDSLReaderJ(String str, boolean z) {
        synchronized (MaDecode.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("aa1ef2b7", new Object[]{str, new Boolean(z)})).longValue();
            }
            MaLogger.w(TAG, "RegistDSLReaderJ called");
            return RegistDSLReader(str, z);
        }
    }

    public static long RegistDSLReaderJ(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("dc328625", new Object[]{str})).longValue() : RegistDSLReaderJ(str, false);
    }

    public static synchronized long UnRegistDSLReaderJ(boolean z) {
        synchronized (MaDecode.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("50975268", new Object[]{new Boolean(z)})).longValue();
            }
            MaLogger.w(TAG, "UnRegistDSLReaderJ called");
            return UnRegistDSLReader(z);
        }
    }

    public static long UnRegistDSLReaderJWithNoLock(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d61575d6", new Object[]{new Boolean(z)})).longValue();
        }
        try {
            MaLogger.w(TAG, "UnRegistDSLReaderJWithNoLock called");
            return UnRegistDSLReader(z);
        } catch (Throwable th) {
            MaLogger.e(TAG, "UnRegistDSLReaderJWithNoLock", th);
            return 0L;
        }
    }

    public static long UnRegistDSLReaderJ(long j) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("50971658", new Object[]{new Long(j)})).longValue() : UnRegistDSLReaderJ(false);
    }

    public static void setFilterConfigJ(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e78d17f", new Object[]{str});
            return;
        }
        try {
            setFilterConfig(str);
        } catch (Exception e) {
            MaLogger.e(TAG, e.getMessage());
        } catch (UnsatisfiedLinkError e2) {
            MaLogger.e(TAG, "Failed to load decode100260, " + e2.getMessage());
            init("MultiCodeConfigJ");
        }
    }

    public static long pushCyclerStreamJNew(byte[] bArr, String str, String str2, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("63b4bef9", new Object[]{bArr, str, str2, new Integer(i)})).longValue();
        }
        try {
            return pushCyclerStreamNew(bArr, str, str2, i);
        } catch (Exception e) {
            MaLogger.e(TAG, e.getMessage());
            return -1L;
        } catch (UnsatisfiedLinkError e2) {
            MaLogger.e(TAG, "Failed to load decode100260, " + e2.getMessage());
            init("pushCyclerStreamJ");
            return -1L;
        }
    }

    public static boolean pushCyclerStreamJ(byte[] bArr, String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d29adecb", new Object[]{bArr, str, new Integer(i)})).booleanValue();
        }
        try {
            return pushCyclerStream(bArr, str, i);
        } catch (Exception e) {
            MaLogger.e(TAG, e.getMessage());
            return false;
        } catch (UnsatisfiedLinkError e2) {
            MaLogger.e(TAG, "Failed to load decode100260, " + e2.getMessage());
            init("pushCyclerStreamJ");
            return false;
        }
    }

    public static byte[] getImageDataWithTokenJ(String str, String str2, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("9f74923b", new Object[]{str, str2, new Integer(i)});
        }
        try {
            return getImageDataWithToken(str, str2, i);
        } catch (Exception e) {
            MaLogger.e(TAG, e.getMessage());
            return null;
        } catch (UnsatisfiedLinkError e2) {
            MaLogger.e(TAG, "Failed to load decode100260, " + e2.getMessage());
            init("getImageDataWithTokenJ");
            return null;
        }
    }

    public static String genDslCodeSvgJ(String str, String str2, int i, float f, int i2, float f2, int i3, float f3) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c7454e0e", new Object[]{str, str2, new Integer(i), new Float(f), new Integer(i2), new Float(f2), new Integer(i3), new Float(f3)});
        }
        try {
            if ("fu2022".equals(str)) {
                z = Pattern.compile("[A-Z0-9\\$\\.\\+\\%\\*\\- /:]{1,7}").matcher(str2).matches();
            } else if ("miniapp".equals(str)) {
                z = Pattern.compile("[0-9A-Z]{20}").matcher(str2).matches();
            }
            if (z) {
                return genDslCodeSvg(str, str2, i, f, i2, f2, i3, f3);
            }
            return null;
        } catch (Exception e) {
            MaLogger.e(TAG, e.getMessage());
            return null;
        } catch (UnsatisfiedLinkError e2) {
            MaLogger.e(TAG, "Failed to load decode100260, " + e2.getMessage());
            return null;
        }
    }

    private static void a(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8123b0d2", new Object[]{str, new Long(j)});
        } else if (!MaLogger.isDebuggable()) {
        } else {
            try {
                StringBuilder sb = new StringBuilder(128);
                String name = Thread.currentThread().getName();
                sb.append("id=");
                sb.append(Process.myTid());
                sb.append("^name=");
                sb.append(name);
                sb.append("^function=");
                sb.append(str);
                sb.append("^duration=");
                sb.append(j);
            } catch (Exception e) {
                MaLogger.e(TAG, "buryInformation: " + e.getMessage());
            }
        }
    }

    public static void refreshTinyCodeBizConfigJ(boolean z, int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e278d29d", new Object[]{new Boolean(z), new Integer(i), str});
            return;
        }
        try {
            refreshTinyCodeBizConfig(z, i, str);
        } catch (Exception e) {
            MaLogger.e(TAG, "refreshTinyCodeBizConfig: " + e.getMessage());
        }
    }

    public static String statisticsCodeMainColorV1J(byte[] bArr, int i, int i2, int[] iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1286a58f", new Object[]{bArr, new Integer(i), new Integer(i2), iArr});
        }
        if (bArr == null || iArr == null) {
            return null;
        }
        try {
            return statisticsCodeMainColorV1(bArr, bArr.length, i, i2, iArr, iArr.length);
        } catch (Exception e) {
            MaLogger.e(TAG, "statisticsCodeMainColorV1: " + e.getMessage());
            return null;
        }
    }

    public static String statisticsCodeMainColorV2J(byte[] bArr, byte[] bArr2, byte[] bArr3, int i, int i2, int i3, int[] iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f21a88bf", new Object[]{bArr, bArr2, bArr3, new Integer(i), new Integer(i2), new Integer(i3), iArr});
        }
        if (bArr2 == null || bArr3 == null || iArr == null) {
            return null;
        }
        try {
            return statisticsCodeMainColorV2(bArr, i2 * i3, bArr2, bArr2.length, bArr3, bArr3.length, i, i2, i3, iArr, iArr.length);
        } catch (Exception e) {
            MaLogger.e(TAG, "statisticsCodeMainColorV1: " + e.getMessage());
            return null;
        }
    }
}
