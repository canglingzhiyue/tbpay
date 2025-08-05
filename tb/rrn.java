package tb;

import android.content.Context;
import android.hardware.Camera;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraManager;
import android.os.Build;
import android.util.SizeF;
import com.alipay.zoloz.toyger.blob.BlobManager;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* loaded from: classes9.dex */
public class rrn {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static rrn b;

    /* renamed from: a  reason: collision with root package name */
    private b f33336a = new b();

    static {
        kge.a(404381763);
        b = null;
    }

    private rrn() {
    }

    public static synchronized rrn a() {
        synchronized (rrn.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (rrn) ipChange.ipc$dispatch("f0a30b0", new Object[0]);
            } else if (b == null) {
                rrn rrnVar = new rrn();
                b = rrnVar;
                return rrnVar;
            } else {
                return b;
            }
        }
    }

    public Camera.Size a(List<Camera.Size> list, float f, final int i, final int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Camera.Size) ipChange.ipc$dispatch("10e0c45", new Object[]{this, list, new Float(f), new Integer(i), new Integer(i2)});
        }
        if (list == null) {
            return null;
        }
        Collections.sort(list, this.f33336a);
        List a2 = a(list, new rro<Camera.Size>() { // from class: tb.rrn.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.rro
            public boolean a(Camera.Size size) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("cdae1822", new Object[]{this, size})).booleanValue() : size.width <= i2 && size.height <= i2 && size.width >= i && size.height >= i;
            }
        });
        if (a2.isEmpty()) {
            return list.get(list.size() - 1);
        }
        for (int size = a2.size() - 1; size >= 0; size--) {
            Camera.Size size2 = (Camera.Size) a2.get(size);
            if (Math.min(Math.abs((size2.width / size2.height) - f), Math.abs((size2.height / size2.width) - f)) <= 0.2f) {
                return size2;
            }
        }
        return (Camera.Size) a2.get(a2.size() - 1);
    }

    private static <T> List<T> a(List<T> list, rro<T> rroVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("e383c8cd", new Object[]{list, rroVar});
        }
        ArrayList arrayList = new ArrayList();
        for (T t : list) {
            if (rroVar.a(t)) {
                arrayList.add(t);
            }
        }
        return arrayList;
    }

    /* loaded from: classes9.dex */
    public class b implements Comparator<Camera.Size> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(1238013981);
            kge.a(-2099169482);
        }

        public b() {
        }

        @Override // java.util.Comparator
        public /* synthetic */ int compare(Camera.Size size, Camera.Size size2) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6a9be197", new Object[]{this, size, size2})).intValue() : a(size, size2);
        }

        public int a(Camera.Size size, Camera.Size size2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("c970e147", new Object[]{this, size, size2})).intValue();
            }
            if (size.width == size2.width) {
                return 0;
            }
            return size.width > size2.width ? 1 : -1;
        }
    }

    public static int b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("57a83dc", new Object[0])).intValue();
        }
        try {
            int numberOfCameras = Camera.getNumberOfCameras();
            Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
            for (int i = 0; i < numberOfCameras; i++) {
                Camera.getCameraInfo(i, cameraInfo);
                if (cameraInfo.facing == 0) {
                    return i;
                }
            }
        } catch (Throwable unused) {
        }
        return 0;
    }

    public static int a(Context context, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8c642cb3", new Object[]{context, new Integer(i), new Integer(i2)})).intValue();
        }
        if (i2 <= 1) {
            return 0;
        }
        return (i2 > 2 && Build.VERSION.SDK_INT >= 21) ? b(context, i, i2) : i;
    }

    private static int b(Context context, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("14946c92", new Object[]{context, new Integer(i), new Integer(i2)})).intValue();
        }
        if (Build.VERSION.SDK_INT < 21) {
            return 0;
        }
        try {
            CameraManager cameraManager = (CameraManager) context.getSystemService(BlobManager.BLOB_ELEM_TYPE_CAMERA);
            String[] cameraIdList = cameraManager.getCameraIdList();
            ArrayList arrayList = new ArrayList();
            for (String str : cameraIdList) {
                CameraCharacteristics cameraCharacteristics = cameraManager.getCameraCharacteristics(str);
                if (((Integer) cameraCharacteristics.get(CameraCharacteristics.LENS_FACING)).intValue() == (i == 0 ? 1 : 0)) {
                    arrayList.add(new a(Integer.parseInt(str), (SizeF) cameraCharacteristics.get(CameraCharacteristics.SENSOR_INFO_PHYSICAL_SIZE)));
                }
            }
            Collections.sort(arrayList);
            return ((a) arrayList.get(0)).f33338a >= i2 ? i : ((a) arrayList.get(0)).f33338a;
        } catch (Exception e) {
            e.printStackTrace();
            return i;
        }
    }

    /* loaded from: classes9.dex */
    public static class a implements Comparable<a> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public int f33338a;
        public SizeF b;

        static {
            kge.a(1143963385);
            kge.a(415966670);
        }

        @Override // java.lang.Comparable
        public /* synthetic */ int compareTo(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6a4672d6", new Object[]{this, aVar})).intValue() : a(aVar);
        }

        public a(int i, SizeF sizeF) {
            this.f33338a = i;
            this.b = sizeF;
        }

        public long a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("56c6c5c", new Object[]{this})).longValue();
            }
            if (Build.VERSION.SDK_INT < 21) {
                return 1080L;
            }
            return this.b.getWidth() * 100000.0f * this.b.getHeight() * 100000.0f;
        }

        public int a(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("f22c0380", new Object[]{this, aVar})).intValue();
            }
            int i = ((aVar.a() - a()) > 0L ? 1 : ((aVar.a() - a()) == 0L ? 0 : -1));
            if (i == 0) {
                return this.f33338a - aVar.f33338a;
            }
            return i > 0 ? 1 : -1;
        }
    }
}
