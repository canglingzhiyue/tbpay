package com.etao.feimagesearch.cip.camera;

import android.hardware.Camera;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes3.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static int f6613a;
    private volatile boolean b;
    private volatile boolean c;
    private int d = 0;

    static {
        kge.a(-1506418830);
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : this.c;
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.c = z;
        }
    }

    public int b() {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("57a83dc", new Object[]{this})).intValue();
        }
        if (this.d <= 0) {
            try {
                i = Camera.getNumberOfCameras();
            } catch (Exception unused) {
            }
            this.d = i;
        }
        return this.d;
    }

    private Camera c() {
        Camera open;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Camera) ipChange.ipc$dispatch("f255c76f", new Object[]{this});
        }
        int b = b();
        int i = 0;
        while (true) {
            if (i >= b) {
                break;
            }
            Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
            Camera.getCameraInfo(i, cameraInfo);
            if (a()) {
                if (cameraInfo.facing == 1) {
                    this.b = true;
                    break;
                }
                i++;
            } else if (cameraInfo.facing == 0) {
                this.b = false;
                break;
            } else {
                i++;
            }
        }
        if (i < b) {
            open = Camera.open(i);
            f6613a = i;
        } else {
            open = Camera.open(0);
            f6613a = 0;
        }
        return open == null ? Camera.open() : open;
    }

    public boolean d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue() : this.b;
    }

    public Camera a(int i, int i2) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return (Camera) ipChange.ipc$dispatch("41a5c4cd", new Object[]{this, new Integer(i), new Integer(i2)});
        }
        long currentTimeMillis = System.currentTimeMillis();
        Camera camera = null;
        while (true) {
            if (!z && System.currentTimeMillis() - currentTimeMillis > i2) {
                return null;
            }
            try {
                camera = c();
            } catch (Exception unused) {
            }
            if (camera != null) {
                return camera;
            }
            try {
                Thread.sleep(i);
            } catch (InterruptedException unused2) {
            }
            z = false;
        }
    }
}
