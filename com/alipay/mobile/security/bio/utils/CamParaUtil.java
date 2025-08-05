package com.alipay.mobile.security.bio.utils;

import android.hardware.Camera;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public class CamParaUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static CamParaUtil b;

    /* renamed from: a  reason: collision with root package name */
    private CameraSizeComparator f5824a = new CameraSizeComparator();

    private CamParaUtil() {
    }

    public static synchronized CamParaUtil getInstance() {
        synchronized (CamParaUtil.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (CamParaUtil) ipChange.ipc$dispatch("c1a42820", new Object[0]);
            } else if (b == null) {
                CamParaUtil camParaUtil = new CamParaUtil();
                b = camParaUtil;
                return camParaUtil;
            } else {
                return b;
            }
        }
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
        Collections.sort(list, this.f5824a);
        Iterator<Camera.Size> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Camera.Size next = it.next();
            if (next.width >= i && equalRate(next, f)) {
                BioLog.i("PreviewSize:w = " + next.width + "h = " + next.height);
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
        Collections.sort(list, this.f5824a);
        for (Camera.Size size : list) {
            if (size.width >= i && size.height >= i2) {
                BioLog.i("PreviewSize:w = " + size.width + "h = " + size.height);
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
        Collections.sort(list, this.f5824a);
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
            BioLog.i("previewSizes:width = " + size.width + " height = " + size.height);
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
            BioLog.i("pictureSizes:width = " + size.width + " height = " + size.height);
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
            BioLog.i("focusModes--" + it.next());
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
}
