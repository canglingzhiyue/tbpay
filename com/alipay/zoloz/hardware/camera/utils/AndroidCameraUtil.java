package com.alipay.zoloz.hardware.camera.utils;

import android.hardware.Camera;
import android.text.TextUtils;
import com.alipay.zoloz.hardware.camera.abs.AbsCamera;
import com.alipay.zoloz.hardware.log.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.adapter.internal.CommonCode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import tb.gbk;
import tb.riy;

/* loaded from: classes3.dex */
public class AndroidCameraUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static AndroidCameraUtil b;

    /* renamed from: a  reason: collision with root package name */
    private CameraSizeComparator f6251a = new CameraSizeComparator();

    public static int findFacingCamera() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ba19f872", new Object[0])).intValue();
        }
        return 1;
    }

    public static String imageFormatToString(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e9e7d802", new Object[]{new Integer(i)});
        }
        if (i == 4) {
            return "ImageFormat.RGB_565";
        }
        if (i == 20) {
            return "ImageFormat.YUY2";
        }
        if (i == 32) {
            return "ImageFormat.RAW_SENSOR";
        }
        if (i == 842094169) {
            return "ImageFormat.YV12";
        }
        if (i == 1144402265) {
            return "ImageFormat.DEPTH16";
        }
        if (i == 16) {
            return "ImageFormat.NV16";
        }
        if (i == 17) {
            return "ImageFormat.NV21";
        }
        if (i == 256) {
            return "ImageFormat.JPEG";
        }
        if (i == 257) {
            return "ImageFormat.DEPTH_POINT_CLOUD";
        }
        switch (i) {
            case 34:
                return "ImageFormat.PRIVATE";
            case 35:
                return "ImageFormat.YUV_420_888";
            case 36:
                return "ImageFormat.RAW_PRIVATE";
            case 37:
                return "ImageFormat.RAW10";
            case 38:
                return "ImageFormat.RAW12";
            case 39:
                return "ImageFormat.YUV_422_888";
            case 40:
                return "ImageFormat.YUV_444_888";
            case 41:
                return "ImageFormat.FLEX_RGB_888";
            case 42:
                return "ImageFormat.FLEX_RGBA_8888";
            default:
                return "ImageFormat.UNKNOWN";
        }
    }

    private AndroidCameraUtil() {
    }

    public static synchronized AndroidCameraUtil getInstance() {
        synchronized (AndroidCameraUtil.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (AndroidCameraUtil) ipChange.ipc$dispatch("3de0abe2", new Object[0]);
            } else if (b == null) {
                AndroidCameraUtil androidCameraUtil = new AndroidCameraUtil();
                b = androidCameraUtil;
                return androidCameraUtil;
            } else {
                return b;
            }
        }
    }

    public Camera.Size getPropPreviewSize(List<Camera.Size> list, int i, double d) {
        int i2;
        IpChange ipChange = $ipChange;
        int i3 = 0;
        if (ipChange instanceof IpChange) {
            return (Camera.Size) ipChange.ipc$dispatch("25e9489", new Object[]{this, list, new Integer(i), new Double(d)});
        }
        if (list == null) {
            return null;
        }
        Collections.sort(list, this.f6251a);
        Log.i("fovration:" + d + ",minWidth:" + i);
        Iterator<Camera.Size> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                i2 = 0;
                break;
            }
            Camera.Size next = it.next();
            if (next.width >= i) {
                i2 = list.indexOf(next);
                Log.i("beyondminWidth:" + list.get(i2).width + "--" + list.get(i2).height);
                break;
            }
        }
        double d2 = 1.0d;
        for (int i4 = i2; i4 < list.size(); i4++) {
            double d3 = list.get(i4).width / list.get(i4).height;
            double abs = Math.abs(d3 - d);
            if (abs < d2) {
                Log.i("fovnow:" + d3 + ",beyondminWidth:" + list.get(i2).width + "--" + list.get(i2).height);
                i3 = i4;
                d2 = abs;
            }
        }
        return list.get(i3);
    }

    public Camera.Size getPropPreviewSize(List<Camera.Size> list, float f, int i) {
        IpChange ipChange = $ipChange;
        int i2 = 0;
        if (ipChange instanceof IpChange) {
            return (Camera.Size) ipChange.ipc$dispatch("31c89fe1", new Object[]{this, list, new Float(f), new Integer(i)});
        }
        if (list == null) {
            return null;
        }
        Collections.sort(list, this.f6251a);
        Iterator<Camera.Size> it = list.iterator();
        int i3 = 0;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Camera.Size next = it.next();
            if (next.width >= i && equalRate(next, f)) {
                Log.i("PreviewSize:w = " + next.width + "h = " + next.height);
                break;
            }
            i3++;
        }
        if (i3 == list.size()) {
            i3 = list.size() - 1;
        }
        HashMap hashMap = new HashMap();
        for (Camera.Size size : list) {
            String str = CommonCode.MapKey.HAS_RESOLUTION + i2;
            hashMap.put(str, size.width + "*" + size.height);
            i2++;
        }
        hashMap.put(gbk.TYPE_SELECTED, list.get(i3).width + "*" + list.get(i3).height);
        RecordUtil.getInstance().write(RecordUtil.CAMERA_RESOLUTION, hashMap);
        return list.get(i3);
    }

    public Camera.Size getPropPreviewSizeWithServerConfig(List<Camera.Size> list, float f, int i) {
        IpChange ipChange = $ipChange;
        int i2 = 0;
        if (ipChange instanceof IpChange) {
            return (Camera.Size) ipChange.ipc$dispatch("c26e9596", new Object[]{this, list, new Float(f), new Integer(i)});
        }
        if (list == null) {
            return null;
        }
        Collections.sort(list, this.f6251a);
        HashMap hashMap = new HashMap();
        int i3 = -1;
        int i4 = -1;
        for (Camera.Size size : list) {
            String str = CommonCode.MapKey.HAS_RESOLUTION + i2;
            hashMap.put(str, size.width + "*" + size.height);
            if (size.height < i) {
                i4++;
            } else if (equalRate(size, f)) {
                Log.i("PreviewSize:w = " + size.width + "h = " + size.height);
                if (i3 < 0) {
                    i3 = i2;
                }
            }
            i2++;
        }
        if (i3 < 0) {
            i3 = i4 >= 0 ? i4 : list.size() - 1;
        }
        hashMap.put("selected1", list.get(i3).width + "*" + list.get(i3).height);
        RecordUtil.getInstance().write(RecordUtil.CAMERA_RESOLUTION, hashMap);
        return list.get(i3);
    }

    public Camera.Size getPropPreviewSize(List<Camera.Size> list, int i) {
        Camera.Size next;
        IpChange ipChange = $ipChange;
        int i2 = 0;
        if (ipChange instanceof IpChange) {
            return (Camera.Size) ipChange.ipc$dispatch("8f85e6b1", new Object[]{this, list, new Integer(i)});
        }
        if (list == null) {
            return null;
        }
        Collections.sort(list, this.f6251a);
        Iterator<Camera.Size> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            if (it.next().height >= i) {
                Log.i("PreviewSize:w = " + next.width + "h = " + next.height);
                break;
            }
            i2++;
        }
        if (i2 == list.size()) {
            i2 = list.size() - 1;
        }
        return list.get(i2);
    }

    public Camera.Size getPropPreviewSize(List<Camera.Size> list, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Camera.Size) ipChange.ipc$dispatch("ab4fd3e4", new Object[]{this, list, new Integer(i), new Integer(i2)});
        }
        if (list == null) {
            return null;
        }
        Collections.sort(list, this.f6251a);
        for (Camera.Size size : list) {
            if (size.width >= i && size.height >= i2) {
                Log.i("PreviewSize:w = " + size.width + "h = " + size.height);
                return size;
            }
        }
        return null;
    }

    public Camera.Size getPropPictureSize(List<Camera.Size> list, float f, int i) {
        IpChange ipChange = $ipChange;
        int i2 = 0;
        if (ipChange instanceof IpChange) {
            return (Camera.Size) ipChange.ipc$dispatch("e40281eb", new Object[]{this, list, new Float(f), new Integer(i)});
        }
        if (list == null) {
            return null;
        }
        Collections.sort(list, this.f6251a);
        int i3 = 0;
        float f2 = 0.0f;
        for (Camera.Size size : list) {
            if (size.width >= i) {
                if (i2 == 0) {
                    f2 = a(size, f);
                    i2 = i3;
                }
                if (f2 > a(size, f)) {
                    f2 = a(size, f);
                    i2 = i3;
                }
            }
            i3++;
        }
        return list.get(i2);
    }

    private float a(Camera.Size size, float f) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("e8155352", new Object[]{this, size, new Float(f)})).floatValue() : Math.abs((size.width / size.height) - f);
    }

    public boolean equalRate(Camera.Size size, float f) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("67753cb3", new Object[]{this, size, new Float(f)})).booleanValue() : ((double) Math.abs((((float) size.width) / ((float) size.height)) - f)) <= 0.03d;
    }

    /* loaded from: classes3.dex */
    public class CameraSizeComparator implements Comparator<Camera.Size> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public CameraSizeComparator() {
        }

        @Override // java.util.Comparator
        public int compare(Camera.Size size, Camera.Size size2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("40f1fdcb", new Object[]{this, size, size2})).intValue();
            }
            if (size.width == size2.width) {
                return 0;
            }
            return size.width > size2.width ? 1 : -1;
        }
    }

    public void printSupportPreviewSize(Camera.Parameters parameters) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d674801b", new Object[]{this, parameters});
            return;
        }
        List<Camera.Size> supportedPreviewSizes = parameters.getSupportedPreviewSizes();
        if (supportedPreviewSizes == null) {
            return;
        }
        for (int i = 0; i < supportedPreviewSizes.size(); i++) {
            Camera.Size size = supportedPreviewSizes.get(i);
            Log.i("previewSizes:width = " + size.width + " height = " + size.height);
        }
    }

    public void printSupportPictureSize(Camera.Parameters parameters) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2538051", new Object[]{this, parameters});
            return;
        }
        List<Camera.Size> supportedPictureSizes = parameters.getSupportedPictureSizes();
        if (supportedPictureSizes == null) {
            return;
        }
        for (int i = 0; i < supportedPictureSizes.size(); i++) {
            Camera.Size size = supportedPictureSizes.get(i);
            Log.i("pictureSizes:width = " + size.width + " height = " + size.height);
        }
    }

    public void printSupportFocusMode(Camera.Parameters parameters) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27a8204d", new Object[]{this, parameters});
            return;
        }
        List<String> supportedFocusModes = parameters.getSupportedFocusModes();
        if (supportedFocusModes == null) {
            return;
        }
        Iterator<String> it = supportedFocusModes.iterator();
        while (it.hasNext()) {
            Log.i("focusModes--" + it.next());
        }
    }

    public static Map<String, String> getCameraResolution() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("fd5ad7e3", new Object[0]);
        }
        HashMap hashMap = new HashMap();
        new ArrayList();
        try {
            int numberOfCameras = Camera.getNumberOfCameras();
            for (int i = 0; i < numberOfCameras; i++) {
                Camera open = Camera.open(i);
                Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
                Camera.getCameraInfo(i, cameraInfo);
                if (cameraInfo.facing == 1) {
                    Camera.Size size = open.getParameters().getSupportedPictureSizes().get(0);
                    hashMap.put("frontCamera", size.width + "*" + size.height);
                } else if (cameraInfo.facing == 0) {
                    Camera.Size size2 = open.getParameters().getSupportedPictureSizes().get(0);
                    hashMap.put("backCamera", size2.width + "*" + size2.height);
                }
                if (open != null) {
                    open.release();
                }
            }
        } catch (Exception unused) {
        }
        return hashMap;
    }

    public static void dumpCameraParameters(Camera.Parameters parameters) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("940b6ef7", new Object[]{parameters});
            return;
        }
        List<Camera.Size> supportedPreviewSizes = parameters.getSupportedPreviewSizes();
        int size = supportedPreviewSizes.size();
        for (int i = 0; i < size; i++) {
            Camera.Size size2 = supportedPreviewSizes.get(i);
            Log.v(AbsCamera.TAG, "supportedPreviewSize[" + i + "] = [width=" + size2.width + ", height=" + size2.height + riy.ARRAY_END_STR);
        }
        List<Integer> supportedPreviewFormats = parameters.getSupportedPreviewFormats();
        int size3 = supportedPreviewFormats.size();
        for (int i2 = 0; i2 < size3; i2++) {
            int intValue = supportedPreviewFormats.get(i2).intValue();
            Log.v(AbsCamera.TAG, "supportedPreviewFormat[" + i2 + "] = " + imageFormatToString(intValue));
        }
        parameters.getPreviewFpsRange(new int[2]);
        Log.d(AbsCamera.TAG, "previewFpsRange=[" + TextUtils.join(" - ", supportedPreviewFormats) + riy.ARRAY_END_STR);
    }
}
