package com.alibaba.security.realidentity;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Point;
import android.hardware.Camera;
import android.os.Build;
import android.preference.PreferenceManager;
import android.view.Display;
import android.view.WindowManager;
import com.alibaba.security.realidentity.service.camera.utils.FrontLightMode;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import java.util.Locale;

/* loaded from: classes3.dex */
public class a3 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String f = "a3";

    /* renamed from: a  reason: collision with root package name */
    public final Context f3357a;
    public Point b;
    public Point c;
    public int d = 90;
    public Point e;

    public a3(Context context) {
        this.f3357a = context;
    }

    public void a(Camera camera, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26a7f847", new Object[]{this, camera, new Boolean(z)});
            return;
        }
        Camera.Parameters parameters = camera.getParameters();
        Display defaultDisplay = ((WindowManager) this.f3357a.getSystemService(com.taobao.android.weex_framework.util.a.ATOM_EXT_window)).getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getSize(point);
        this.b = point;
        this.c = f3.a(parameters, point);
        String str = Build.MODEL;
        if ((!str.contains("HTC") || !str.contains("One")) && !str.contains("GT-N7100") && !str.contains("GT-I9300")) {
            if (str.equals("u8800")) {
                this.c = new Point(720, 480);
            } else if (str.equals("MI PAD")) {
                this.c = new Point(2048, 1536);
            }
        } else {
            this.c = new Point(1280, 720);
        }
        this.e = f3.a(parameters, this.d, z);
        if (!str.contains("ASUS_Z00ADB")) {
            return;
        }
        this.e = new Point(1280, 720);
    }

    public void b(Camera camera, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b90c088", new Object[]{this, camera, new Boolean(z)});
            return;
        }
        Camera.Parameters parameters = camera.getParameters();
        if (parameters == null) {
            a.e(f, "Device error: no camera parameters are available. Proceeding without configuration.");
            return;
        }
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(this.f3357a);
        a(parameters, defaultSharedPreferences, z);
        f3.a(parameters, defaultSharedPreferences.getBoolean(g3.f3422a, true), defaultSharedPreferences.getBoolean(g3.c, true), z);
        if (!z) {
            if (defaultSharedPreferences.getBoolean(g3.d, false)) {
                f3.e(parameters);
            }
            if (!defaultSharedPreferences.getBoolean(g3.e, true)) {
                f3.b(parameters);
            }
            if (!defaultSharedPreferences.getBoolean(g3.f, true)) {
                f3.g(parameters);
                f3.d(parameters);
                f3.f(parameters);
            }
        }
        try {
            if (Build.MODEL != null) {
                if (Build.MODEL.contains("M9") && Build.BRAND.contains("Meizu")) {
                    this.d += 90;
                } else {
                    if (Build.MODEL.toLowerCase(Locale.US).replace(" ", "").contains("nexus5x")) {
                        this.d += 180;
                    }
                    this.d %= 360;
                }
            }
            camera.setDisplayOrientation(this.d);
        } catch (Exception e) {
            parameters.setRotation(90);
            a.e(f, "method error" + e.getLocalizedMessage());
        } catch (NoSuchMethodError e2) {
            parameters.setRotation(90);
            a.e(f, "method error" + e2.getLocalizedMessage());
        }
        int a2 = a(parameters);
        int b = b(parameters);
        if (b >= 0) {
            parameters.setPreviewFormat(b);
        }
        if (Build.MODEL.contains("HTC") && Build.MODEL.contains("801e") && Build.MODEL.contains("One")) {
            parameters.setZoom(30);
        } else if (Build.MODEL.contains("GT-I9300")) {
            parameters.setZoom(20);
        }
        parameters.setPictureFormat(a2);
        Point point = this.e;
        parameters.setPictureSize(point.x, point.y);
        Point point2 = this.c;
        parameters.setPreviewSize(point2.x, point2.y);
        camera.setParameters(parameters);
        Camera.Size previewSize = camera.getParameters().getPreviewSize();
        if (previewSize == null) {
            return;
        }
        Point point3 = this.c;
        if (point3.x == previewSize.width && point3.y == previewSize.height) {
            return;
        }
        Point point4 = this.c;
        point4.x = previewSize.width;
        point4.y = previewSize.height;
    }

    private int a(Camera.Parameters parameters) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ce49ac48", new Object[]{this, parameters})).intValue();
        }
        List<Integer> supportedPictureFormats = parameters.getSupportedPictureFormats();
        if (supportedPictureFormats.contains(256)) {
            return 256;
        }
        if (supportedPictureFormats.contains(4)) {
            return 4;
        }
        return supportedPictureFormats.contains(17) ? 17 : 0;
    }

    private void a(Camera.Parameters parameters, SharedPreferences sharedPreferences, boolean z) {
        IpChange ipChange = $ipChange;
        boolean z2 = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("72d36645", new Object[]{this, parameters, sharedPreferences, new Boolean(z)});
            return;
        }
        if (FrontLightMode.readPref(sharedPreferences) != FrontLightMode.ON) {
            z2 = false;
        }
        a(parameters, z2, z);
    }

    private void a(Camera.Parameters parameters, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("62a64595", new Object[]{this, parameters, new Boolean(z), new Boolean(z2)});
            return;
        }
        f3.b(parameters, z);
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(this.f3357a);
        if (z2 || defaultSharedPreferences.getBoolean(g3.g, true)) {
            return;
        }
        f3.a(parameters, z);
    }

    private int b(Camera.Parameters parameters) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5ae9d749", new Object[]{this, parameters})).intValue();
        }
        List<Integer> supportedPreviewFormats = parameters.getSupportedPreviewFormats();
        if (supportedPreviewFormats.contains(17)) {
            return 17;
        }
        return supportedPreviewFormats.contains(842094169) ? 842094169 : -1;
    }
}
