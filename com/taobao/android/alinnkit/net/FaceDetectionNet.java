package com.taobao.android.alinnkit.net;

import android.content.Context;
import android.os.Debug;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.alinnkit.core.AliNNFlipType;
import com.taobao.android.alinnkit.entity.FaceDetectionReport;
import com.taobao.android.alinnkit.entity.NativeFaceInfo;
import com.taobao.android.alinnkit.exception.AliNNKitLibraryLoadException;
import com.taobao.android.alinnkit.json.ModelConfig;
import com.taobao.orange.OrangeConfig;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import tb.dpn;
import tb.dpo;
import tb.dpq;
import tb.dpr;
import tb.dpt;
import tb.dpu;
import tb.ihq;
import tb.iju;
import tb.kge;

/* loaded from: classes4.dex */
public class FaceDetectionNet extends AliNNKitBaseNet {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String BIZ_NAME = "FaceDetection";

    /* renamed from: a  reason: collision with root package name */
    private static boolean f9024a;
    private long b;
    private long c;
    private long d;
    private long e;
    private long f;
    private boolean g;
    private boolean h;
    private final int[] i = new int[5];
    private final float[] j = new float[FaceDetectionReport.NATIVE_FLOAT_OUT_LENGTH];
    private final float[] k;
    private final float[] l;

    /* loaded from: classes4.dex */
    public enum DetectParamType {
        FACE_PARAM_DETECT_INTERVAL(1),
        FACE_PARAM_SMOOTH_THRESHOLD(2),
        FACE_PARAM_POSE_SMOOTH_THRESHOLD(4),
        FACE_PARAM_DETECT_THRESHOLD(5),
        FACE_ACTION_EYE_BLINK(6),
        FACE_ACTION_MOUTH_AH(7),
        FACE_ACTION_HEAD_YAW(8),
        FACE_ACTION_HEAD_PITCH(9),
        FACE_ACTION_BROW_JUMP(10),
        FACE_PARAM_ALIGNMENT_INTERVAL(11),
        FACE_PARAM_MAX_FACE_SUPPORT(12),
        FACE_PARAM_DETECT_IMG_SIZE(13);
        
        public int type;

        DetectParamType(int i) {
            this.type = i;
        }
    }

    /* loaded from: classes4.dex */
    public enum FaceDetectMode {
        MOBILE_DETECT_MODE_VIDEO,
        MOBILE_DETECT_MODE_IMAGE,
        SCOPE_DETECT_MODE_VIDEO,
        SCOPE_DETECT_MODE_IMAGE,
        CAT_DETECT_MODE_VIDEO,
        CAT_DETECT_MODE_IMAGE
    }

    /* loaded from: classes4.dex */
    public enum FacePixelFormat {
        FACE_PIXEL_FORMAT_Y(1),
        FACE_PIXEL_FORMAT_RGBA8888(2),
        FACE_PIXEL_FORMAT_BGRA8888(3),
        FACE_PIXEL_FORMAT_RGB888(4),
        FACE_PIXEL_FORMAT_BGR888(5),
        FACE_PIXEL_FORMAT_YUV420(6),
        FACE_PIXEL_FORMAT_NV21(7);
        
        public int format;

        FacePixelFormat(int i) {
            this.format = i;
        }
    }

    /* loaded from: classes4.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public FaceDetectMode f9026a = FaceDetectMode.MOBILE_DETECT_MODE_VIDEO;
        public boolean b = false;
        public boolean c = false;
        public boolean d = false;
        public boolean e = false;
        public boolean f = false;
        public boolean g = false;

        static {
            kge.a(1095615060);
        }
    }

    public static /* synthetic */ Object ipc$super(FaceDetectionNet faceDetectionNet, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    private static native long nativeAttributeCreateFrom(String str);

    private static native void nativeAttributeRelease(long j);

    private static native long nativeCreateFrom(int i, String str, String str2, int i2, int i3);

    private static native int nativeFaceAdd240SubNet(long j, String str);

    private static native int nativeFaceAddEyeballSubNet(long j, String str);

    private static native long nativeFaceLivenessCreateFrom(String str);

    private static native void nativeFaceLivenessRelease(long j);

    private static native long nativeFaceRecognitionCreateFrom(String str);

    private static native void nativeFaceRecognitionRelease(long j);

    private static native float nativeFaceRecognitionSimilarity(long j, float[] fArr, float[] fArr2);

    private static native String nativeGetBizCodeFace240SubNet(long j);

    private static native String nativeGetBizCodeFaceAlignment(long j);

    private static native String nativeGetBizCodeFaceAttribute(long j);

    private static native String nativeGetBizCodeFaceDetection(long j);

    private static native String nativeGetBizCodeFaceEyeballSubNet(long j);

    private static native String nativeGetBizCodeFaceLiveness(long j);

    private static native String nativeGetBizCodeFaceRecognition(long j);

    private static native String nativeGetBizCodeFaceSmile(long j);

    private static native FaceDetectionReport[] nativeInference(long j, ByteBuffer byteBuffer, int i, int i2, int i3, int i4, int i5, long j2, int i6, int i7, int[] iArr, float[] fArr, float[] fArr2, float[] fArr3, boolean z, long[] jArr);

    private static native FaceDetectionReport[] nativeInference(long j, byte[] bArr, int i, int i2, int i3, int i4, int i5, long j2, int i6, int i7, int[] iArr, float[] fArr, float[] fArr2, float[] fArr3, boolean z, long[] jArr);

    private static native FaceDetectionReport[] nativeInferenceARGB(long j, int[] iArr, int i, int i2, int i3, long j2, int i4, int i5, int[] iArr2, float[] fArr, float[] fArr2, float[] fArr3, boolean z, long[] jArr);

    public static native String nativeInferenceFaceAttribute(long j, ByteBuffer byteBuffer, int i, int i2, int i3, long j2, int[][] iArr, float[][] fArr);

    private static native String nativeInferenceFaceAttribute(long j, byte[] bArr, int i, int i2, int i3, long j2, int[][] iArr, float[][] fArr);

    private static native String nativeInferenceFaceLiveness(long j, byte[] bArr, int i, int i2, int i3, int i4, int[] iArr, float[] fArr, long j2);

    private static native float[] nativeInferenceFaceRecognition(long j, byte[] bArr, int i, int i2, int i3, int i4, int[] iArr, float[] fArr, long j2);

    private static native float[] nativeInferenceFaceRecognition(long j, int[] iArr, int i, int i2, int i3, int[] iArr2, float[] fArr, long j2);

    public static native String nativeInferenceFaceSmile(long j, ByteBuffer byteBuffer, int i, int i2, int i3, int[] iArr, float[] fArr, long j2);

    public static native String nativeInferenceFaceSmile(long j, byte[] bArr, int i, int i2, int i3, int[] iArr, float[] fArr, long j2);

    private static native void nativeRelease(long j);

    private static native int nativeResetTracking(long j);

    private static native void nativeSetParamThreshold(long j, int i, float f);

    public static native void nativeSetSmileThreshold(long j, float f);

    @Deprecated
    public static native void nativeSetSmoothThreshold(long j, float f);

    private static native long nativeSmileCreateFrom(String str);

    private static native void nativeSmileRelease(long j);

    public static native FaceDetectionReport nativeTransformDetectResult(long j, int i, int i2, int[] iArr, float[] fArr, float[] fArr2, float[] fArr3, long j2, int[] iArr2, float[] fArr4, float[] fArr5, float[] fArr6, int i3, int i4);

    public static /* synthetic */ int a(long j, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("2d8a2219", new Object[]{new Long(j), str})).intValue() : nativeFaceAdd240SubNet(j, str);
    }

    public static /* synthetic */ long a(int i, String str, String str2, int i2, int i3) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("8d69a7c3", new Object[]{new Integer(i), str, str2, new Integer(i2), new Integer(i3)})).longValue() : nativeCreateFrom(i, str, str2, i2, i3);
    }

    public static /* synthetic */ long a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("f3a64c26", new Object[]{str})).longValue() : nativeSmileCreateFrom(str);
    }

    public static /* synthetic */ Boolean a(Context context, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Boolean) ipChange.ipc$dispatch("28767f3e", new Object[]{context, str, str2, str3, str4, str5, str6, str7, str8, str9, aVar}) : b(context, str, str2, str3, str4, str5, str6, str7, str8, str9, aVar);
    }

    public static /* synthetic */ String a(long j) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("780680c4", new Object[]{new Long(j)}) : nativeGetBizCodeFaceDetection(j);
    }

    public static /* synthetic */ int b(long j, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("298bb0f8", new Object[]{new Long(j), str})).intValue() : nativeFaceAddEyeballSubNet(j, str);
    }

    public static /* synthetic */ long b(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("3dd7e567", new Object[]{str})).longValue() : nativeAttributeCreateFrom(str);
    }

    public static /* synthetic */ String b(long j) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("c2381a05", new Object[]{new Long(j)}) : nativeGetBizCodeFaceAlignment(j);
    }

    public static /* synthetic */ long c(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("88097ea8", new Object[]{str})).longValue() : nativeFaceRecognitionCreateFrom(str);
    }

    public static /* synthetic */ String c(long j) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("c69b346", new Object[]{new Long(j)}) : nativeGetBizCodeFace240SubNet(j);
    }

    public static /* synthetic */ long d(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("d23b17e9", new Object[]{str})).longValue() : nativeFaceLivenessCreateFrom(str);
    }

    public static /* synthetic */ String d(long j) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("569b4c87", new Object[]{new Long(j)}) : nativeGetBizCodeFaceEyeballSubNet(j);
    }

    public static /* synthetic */ String e(long j) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("a0cce5c8", new Object[]{new Long(j)}) : nativeGetBizCodeFaceSmile(j);
    }

    public static /* synthetic */ String f(long j) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("eafe7f09", new Object[]{new Long(j)}) : nativeGetBizCodeFaceAttribute(j);
    }

    public static /* synthetic */ String g(long j) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("3530184a", new Object[]{new Long(j)}) : nativeGetBizCodeFaceRecognition(j);
    }

    public static /* synthetic */ String h(long j) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7f61b18b", new Object[]{new Long(j)}) : nativeGetBizCodeFaceLiveness(j);
    }

    public static /* synthetic */ void i(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5c85c54", new Object[]{new Long(j)});
        } else {
            nativeRelease(j);
        }
    }

    public static /* synthetic */ void j(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b77d34f3", new Object[]{new Long(j)});
        } else {
            nativeSmileRelease(j);
        }
    }

    public static /* synthetic */ void k(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9320d92", new Object[]{new Long(j)});
        } else {
            nativeAttributeRelease(j);
        }
    }

    public static /* synthetic */ void l(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bae6e631", new Object[]{new Long(j)});
        } else {
            nativeFaceRecognitionRelease(j);
        }
    }

    public static /* synthetic */ void m(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc9bbed0", new Object[]{new Long(j)});
        } else {
            nativeFaceLivenessRelease(j);
        }
    }

    private static boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue() : !f9024a || !isNativeLibAvailable();
    }

    static {
        kge.a(1542688683);
        try {
            if (!isCpuAbiSupported(iju.ABI_ARM) && !isCpuAbiSupported(iju.ABI_ARM64)) {
                return;
            }
            f9024a = ihq.a().c("mnnface").g();
            dpq.b(BIZ_NAME, "Load Lib With RemoteSo -" + f9024a, new Object[0]);
        } catch (Throwable th) {
            dpq.d("AliNNJava", "load libmnnface.so exception=%s", th);
        }
    }

    private static Boolean b(Context context, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("455977dd", new Object[]{context, str, str2, str3, str4, str5, str6, str7, str8, str9, aVar});
        }
        ArrayList arrayList = new ArrayList();
        if (str2 == null) {
            str2 = "";
        }
        arrayList.add(str2);
        if (str3 == null) {
            str3 = "";
        }
        arrayList.add(str3);
        if (aVar.d) {
            if (str4 == null) {
                str4 = "";
            }
            arrayList.add(str4);
        }
        if (aVar.e) {
            if (str5 == null) {
                str5 = "";
            }
            arrayList.add(str5);
        }
        if (aVar.b) {
            if (str6 == null) {
                str6 = "";
            }
            arrayList.add(str6);
        }
        if (aVar.c) {
            if (str7 == null) {
                str7 = "";
            }
            arrayList.add(str7);
        }
        if (aVar.g) {
            if (str8 == null) {
                str8 = "";
            }
            arrayList.add(str8);
        }
        if (aVar.f) {
            if (str9 == null) {
                str9 = "";
            }
            arrayList.add(str9);
        }
        String[] strArr = new String[arrayList.size()];
        arrayList.toArray(strArr);
        return dpo.a(context, str, strArr);
    }

    public static void a(final Context context, a aVar, final String str, dpu<FaceDetectionNet> dpuVar) throws IllegalArgumentException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("86944c58", new Object[]{context, aVar, str, dpuVar});
        } else if (context == null || dpuVar == null) {
            throw new IllegalArgumentException("context or listener cannot be null");
        } else {
            if (a()) {
                dpuVar.a(new AliNNKitLibraryLoadException());
                return;
            }
            final a aVar2 = aVar == null ? new a() : aVar;
            ArrayList arrayList = new ArrayList();
            arrayList.add(BIZ_NAME);
            if (FaceDetectMode.MOBILE_DETECT_MODE_VIDEO == aVar2.f9026a || FaceDetectMode.MOBILE_DETECT_MODE_IMAGE == aVar2.f9026a) {
                arrayList.add("fd_00002_1");
                arrayList.add("fd_00002_12");
            } else if (FaceDetectMode.SCOPE_DETECT_MODE_VIDEO == aVar2.f9026a || FaceDetectMode.SCOPE_DETECT_MODE_IMAGE == aVar2.f9026a) {
                arrayList.add("fd_00002_3");
                arrayList.add("fd_00002_12");
            } else if (FaceDetectMode.CAT_DETECT_MODE_VIDEO == aVar2.f9026a || FaceDetectMode.CAT_DETECT_MODE_IMAGE == aVar2.f9026a) {
                arrayList.add("fd_00002_21");
                arrayList.add("fd_00002_22");
            }
            if (aVar2.b) {
                arrayList.add("fd_00002_4");
            }
            if (aVar2.c) {
                arrayList.add("fd_00002_5");
            }
            if (aVar2.d) {
                arrayList.add("fd_00002_6");
            }
            if (aVar2.e) {
                arrayList.add("fd_00002_7");
            }
            if (aVar2.g) {
                arrayList.add("fd_00002_9");
            }
            if (aVar2.f) {
                arrayList.add("fd_00002_10");
            }
            String[] strArr = new String[arrayList.size()];
            arrayList.toArray(strArr);
            ModelConfig modelConfig = new ModelConfig();
            modelConfig.m = "946";
            modelConfig.s = "";
            modelConfig.t = "";
            modelConfig.allNet = "1";
            modelConfig.md5 = "e41b79f771cca9875e41b62bd374deee";
            modelConfig.url = "https://ossgw.alicdn.com/fregata-open/static/files/946/0_3.zip";
            modelConfig.unpacked = "1";
            modelConfig.urlPrefix = "https://ossgw.alicdn.com/fregata-open/";
            HashMap hashMap = new HashMap();
            hashMap.put("fd_00002_21", "af1297797c4b0341647bea1f4c753148");
            hashMap.put("fd_00002_12", "a0bbd6d2de593f798f1f05adf848d8df");
            hashMap.put("fd_00002_22", "9827b634b874c527932cdce494c4b435");
            hashMap.put("resource", "0b3d248490210348a473be203e2a1de8");
            hashMap.put("fd_00002_6", "01a1d9398985985b7d726e489dfb4633");
            hashMap.put("fd_00002_7", "851124c6406df62ea53a9e5a2e4e9ddb");
            hashMap.put("fd_00002_8", "bcdd54266d616b7dc29923f6e09422d3");
            hashMap.put("fd_00002_2", "3ba4d6202642dee4a8fa657093a4dacb");
            hashMap.put("fd_00002_3", "d692868b6845bbab338c37cab3e0f358");
            hashMap.put("fd_00002_4", "cf62eca50aafdce97cd57607cde826c9");
            hashMap.put("fd_00002_5", "8baac51f8eb90cd2976c1a0c75c42d2d");
            hashMap.put("fd_00002_1", "080cc7a62e1633e155a7829b77c3dd41");
            modelConfig.models = hashMap;
            new dpr(context.getApplicationContext(), dpuVar, new dpt<FaceDetectionNet>() { // from class: com.taobao.android.alinnkit.net.FaceDetectionNet.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* JADX WARN: Type inference failed for: r4v4, types: [com.taobao.android.alinnkit.net.AliNNKitBaseNet, com.taobao.android.alinnkit.net.FaceDetectionNet] */
                @Override // tb.dpt
                public /* synthetic */ FaceDetectionNet a(File file) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? (AliNNKitBaseNet) ipChange2.ipc$dispatch("4098cc92", new Object[]{this, file}) : b(file);
                }

                public FaceDetectionNet b(File file) {
                    String str2;
                    String str3;
                    long j;
                    String str4;
                    long j2;
                    String str5;
                    long j3;
                    String str6;
                    String str7;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return (FaceDetectionNet) ipChange2.ipc$dispatch("e189db1a", new Object[]{this, file});
                    }
                    String path = new File(file, "fd_00002_1").getPath();
                    String path2 = new File(file, "fd_00002_12").getPath();
                    if (FaceDetectMode.MOBILE_DETECT_MODE_VIDEO != a.this.f9026a && FaceDetectMode.MOBILE_DETECT_MODE_IMAGE != a.this.f9026a) {
                        if (FaceDetectMode.SCOPE_DETECT_MODE_VIDEO == a.this.f9026a || FaceDetectMode.SCOPE_DETECT_MODE_IMAGE == a.this.f9026a) {
                            path = new File(file, "fd_00002_3").getPath();
                        } else if (FaceDetectMode.CAT_DETECT_MODE_VIDEO == a.this.f9026a || FaceDetectMode.CAT_DETECT_MODE_IMAGE == a.this.f9026a) {
                            path = new File(file, "fd_00002_21").getPath();
                            path2 = new File(file, "fd_00002_22").getPath();
                        }
                    }
                    File file2 = new File(path);
                    File file3 = new File(path2);
                    if (!file2.exists() || !file3.exists()) {
                        return null;
                    }
                    long a2 = FaceDetectionNet.a(a.this.f9026a.ordinal(), path, path2, 4, 0);
                    long j4 = 0;
                    if (a2 == 0) {
                        dpq.d("AliNNJava", "create face net return null ptr", new Object[0]);
                        return null;
                    }
                    String a3 = FaceDetectionNet.a(a2);
                    String b = FaceDetectionNet.b(a2);
                    if (a.this.d) {
                        String path3 = new File(file, "fd_00002_6").getPath();
                        if (!new File(path3).exists()) {
                            return null;
                        }
                        if (FaceDetectionNet.a(a2, path3) != 0) {
                            dpq.a("AliNNJava", "create face 240 sub net return null ptr", new Object[0]);
                            return null;
                        }
                        str2 = FaceDetectionNet.c(a2);
                    } else {
                        str2 = "";
                    }
                    if (a.this.e) {
                        String path4 = new File(file, "fd_00002_7").getPath();
                        if (!new File(path4).exists()) {
                            return null;
                        }
                        if (FaceDetectionNet.b(a2, path4) != 0) {
                            dpq.a("AliNNJava", "create face eyeball detect net return null ptr", new Object[0]);
                            return null;
                        }
                        str3 = FaceDetectionNet.d(a2);
                    } else {
                        str3 = "";
                    }
                    if (a.this.b) {
                        String path5 = new File(file, "fd_00002_4").getPath();
                        if (!new File(path5).exists()) {
                            return null;
                        }
                        long a4 = FaceDetectionNet.a(path5);
                        if (a4 == 0) {
                            dpq.a("AliNNJava", "create face smile net return null ptr", new Object[0]);
                            return null;
                        }
                        str4 = FaceDetectionNet.e(a4);
                        j = a4;
                    } else {
                        j = 0;
                        str4 = "";
                    }
                    if (a.this.c) {
                        String path6 = new File(file, "fd_00002_5").getPath();
                        if (!new File(path6).exists()) {
                            return null;
                        }
                        long b2 = FaceDetectionNet.b(path6);
                        if (b2 == 0) {
                            dpq.a("AliNNJava", "create face attribute net return null ptr", new Object[0]);
                            return null;
                        }
                        str5 = FaceDetectionNet.f(b2);
                        j2 = b2;
                    } else {
                        j2 = 0;
                        str5 = "";
                    }
                    if (a.this.g) {
                        String path7 = new File(file, "fd_00002_9").getPath();
                        if (!new File(path7).exists()) {
                            return null;
                        }
                        long c = FaceDetectionNet.c(path7);
                        if (c == 0) {
                            dpq.a("AliNNJava", "create face recognition net return null ptr", new Object[0]);
                            return null;
                        }
                        str6 = FaceDetectionNet.g(c);
                        j3 = c;
                    } else {
                        j3 = 0;
                        str6 = "";
                    }
                    if (a.this.f) {
                        String path8 = new File(file, "fd_00002_10").getPath();
                        if (!new File(path8).exists()) {
                            return null;
                        }
                        long d = FaceDetectionNet.d(path8);
                        if (d == 0) {
                            dpq.a("AliNNJava", "create face liveness net return null ptr", new Object[0]);
                            return null;
                        }
                        str7 = FaceDetectionNet.h(d);
                        j4 = d;
                    } else {
                        str7 = "";
                    }
                    if (!FaceDetectionNet.a(context.getApplicationContext(), str, a3, b, str2, str3, str4, str5, str6, str7, a.this).booleanValue()) {
                        dpq.d("AliNNJava", "license code or model not match, please input the correct code or models", new Object[0]);
                        FaceDetectionNet.i(a2);
                        if (a.this.b) {
                            FaceDetectionNet.j(j);
                        }
                        if (a.this.c) {
                            FaceDetectionNet.k(j2);
                        }
                        if (a.this.g) {
                            FaceDetectionNet.l(j3);
                        }
                        if (a.this.f) {
                            FaceDetectionNet.m(j4);
                        }
                        return null;
                    }
                    return new FaceDetectionNet(a2, j, j2, j3, j4, a.this.d, a.this.e);
                }
            }, modelConfig).execute(strArr);
        }
    }

    public FaceDetectionNet(long j, long j2, long j3, long j4, long j5, boolean z, boolean z2) {
        this.b = j;
        this.c = j2;
        this.d = j3;
        this.e = j4;
        this.f = j5;
        this.g = z;
        this.h = z2;
        float[] fArr = null;
        this.k = z ? new float[FaceDetectionReport.NATIVE_EXTRA_FLOAT_OUT_LENGTH] : null;
        this.l = z2 ? new float[82] : fArr;
    }

    public FaceDetectionReport[] a(byte[] bArr, int i, int i2, int i3, long j, int i4, AliNNFlipType aliNNFlipType, boolean z, NativeFaceInfo nativeFaceInfo) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FaceDetectionReport[]) ipChange.ipc$dispatch("d043c22c", new Object[]{this, bArr, new Integer(i), new Integer(i2), new Integer(i3), new Long(j), new Integer(i4), aliNNFlipType, new Boolean(z), nativeFaceInfo}) : a(bArr, FacePixelFormat.FACE_PIXEL_FORMAT_Y, i, i2, i3, j, i4, aliNNFlipType, z, nativeFaceInfo);
    }

    public FaceDetectionReport[] a(int[] iArr, int i, int i2, int i3, long j, int i4, AliNNFlipType aliNNFlipType, boolean z, NativeFaceInfo nativeFaceInfo) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FaceDetectionReport[]) ipChange.ipc$dispatch("687bbcc5", new Object[]{this, iArr, new Integer(i), new Integer(i2), new Integer(i3), new Long(j), new Integer(i4), aliNNFlipType, new Boolean(z), nativeFaceInfo}) : b(iArr, i, i2, i3, j, i4, aliNNFlipType, z, nativeFaceInfo);
    }

    public synchronized FaceDetectionReport[] a(byte[] bArr, FacePixelFormat facePixelFormat, int i, int i2, int i3, long j, int i4, AliNNFlipType aliNNFlipType, boolean z, NativeFaceInfo nativeFaceInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FaceDetectionReport[]) ipChange.ipc$dispatch("16afd7c4", new Object[]{this, bArr, facePixelFormat, new Integer(i), new Integer(i2), new Integer(i3), new Long(j), new Integer(i4), aliNNFlipType, new Boolean(z), nativeFaceInfo});
        } else if (this.b == 0) {
            return null;
        } else {
            long[] a2 = nativeFaceInfo != null ? nativeFaceInfo.a() : null;
            if (!z && a2 == null) {
                return null;
            }
            dpn.a aVar = new dpn.a();
            long nativeHeapAllocatedSize = Debug.getNativeHeapAllocatedSize();
            long currentTimeMillis = System.currentTimeMillis();
            FaceDetectionReport[] nativeInference = nativeInference(this.b, bArr, facePixelFormat.format, i, i2, 0, i3, j, i4, aliNNFlipType.type, this.i, this.j, this.k, this.l, z, a2);
            if (nativeInference != null && nativeInference.length > 0) {
                aVar.b = (float) (System.currentTimeMillis() - currentTimeMillis);
                aVar.f26892a = (float) ((Debug.getNativeHeapAllocatedSize() - nativeHeapAllocatedSize) / 1024);
                aVar.a(BIZ_NAME, this.mModelId, this.mModelFiles, "0", 1.0f, 0.0f, false);
            }
            return nativeInference;
        }
    }

    private synchronized FaceDetectionReport[] b(int[] iArr, int i, int i2, int i3, long j, int i4, AliNNFlipType aliNNFlipType, boolean z, NativeFaceInfo nativeFaceInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FaceDetectionReport[]) ipChange.ipc$dispatch("53ecbda4", new Object[]{this, iArr, new Integer(i), new Integer(i2), new Integer(i3), new Long(j), new Integer(i4), aliNNFlipType, new Boolean(z), nativeFaceInfo});
        } else if (this.b == 0) {
            return null;
        } else {
            long[] a2 = nativeFaceInfo != null ? nativeFaceInfo.a() : null;
            if (!z && a2 == null) {
                return null;
            }
            dpn.a aVar = new dpn.a();
            long nativeHeapAllocatedSize = Debug.getNativeHeapAllocatedSize();
            long currentTimeMillis = System.currentTimeMillis();
            FaceDetectionReport[] nativeInferenceARGB = nativeInferenceARGB(this.b, iArr, i, i2, i3, j, i4, aliNNFlipType.type, this.i, this.j, this.k, this.l, z, a2);
            if (nativeInferenceARGB != null && nativeInferenceARGB.length > 0) {
                aVar.b = (float) (System.currentTimeMillis() - currentTimeMillis);
                aVar.f26892a = (float) ((Debug.getNativeHeapAllocatedSize() - nativeHeapAllocatedSize) / 1024);
                aVar.a(BIZ_NAME, this.mModelId, this.mModelFiles, "0", 1.0f, 0.0f, false);
            }
            return nativeInferenceARGB;
        }
    }

    public synchronized void a(DetectParamType detectParamType, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a3074b4", new Object[]{this, detectParamType, new Float(f)});
            return;
        }
        if (!a() && this.b != 0) {
            nativeSetParamThreshold(this.b, detectParamType.type, f);
        }
    }

    public synchronized void a(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8218858", new Object[]{this, new Float(f)});
            return;
        }
        if (!a() && this.c != 0) {
            nativeSetSmileThreshold(this.c, f);
        }
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (this.b == 0) {
            throw new RuntimeException("FaceDetectionNet native pointer is null");
        }
    }

    @Override // com.taobao.android.alinnkit.net.AliNNKitBaseNet
    public synchronized void release() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca5510e", new Object[]{this});
            return;
        }
        b();
        nativeRelease(this.b);
        this.b = 0L;
        if (this.c != 0) {
            nativeSmileRelease(this.c);
            this.c = 0L;
        }
        if (this.d != 0) {
            nativeAttributeRelease(this.d);
            this.d = 0L;
        }
        if (this.e != 0) {
            nativeFaceRecognitionRelease(this.e);
            this.e = 0L;
        }
        if (this.f != 0) {
            nativeFaceLivenessRelease(this.f);
            this.f = 0L;
        }
        OrangeConfig.getInstance().unregisterListener(new String[]{"android_alinn_FaceDetection_v01_config"});
    }

    @Deprecated
    public static void a(Context context, FaceDetectMode faceDetectMode, boolean z, boolean z2, String str, dpu<FaceDetectionNet> dpuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ffc6fb6", new Object[]{context, faceDetectMode, new Boolean(z), new Boolean(z2), str, dpuVar});
            return;
        }
        a aVar = new a();
        aVar.f9026a = faceDetectMode;
        aVar.d = false;
        aVar.b = z;
        aVar.c = z2;
        a(context, aVar, str, dpuVar);
    }
}
