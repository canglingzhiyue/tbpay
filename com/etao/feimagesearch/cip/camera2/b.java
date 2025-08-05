package com.etao.feimagesearch.cip.camera2;

import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.support.v4.math.MathUtils;
import com.android.alibaba.ip.runtime.IpChange;
import tb.cot;
import tb.kge;

/* loaded from: classes3.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final float f6656a;
    public final boolean b;
    private final Rect d;
    private final Rect c = new Rect();
    private float e = -1.0f;

    static {
        kge.a(-337217974);
    }

    public b(CameraCharacteristics cameraCharacteristics) {
        this.d = (Rect) cameraCharacteristics.get(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
        boolean z = false;
        if (this.d == null) {
            this.f6656a = 1.0f;
            this.b = false;
            cot.c("Camera2_Camera2Zoom", "mSensorSize is null");
            return;
        }
        Float f = (Float) cameraCharacteristics.get(CameraCharacteristics.SCALER_AVAILABLE_MAX_DIGITAL_ZOOM);
        this.f6656a = (f == null || f.floatValue() < 1.0f) ? 1.0f : f.floatValue();
        cot.c("Camera2_Camera2Zoom", "maxZoom: " + this.f6656a);
        this.b = Float.compare(this.f6656a, 1.0f) > 0 ? true : z;
    }

    public void a(CaptureRequest.Builder builder, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d49f7670", new Object[]{this, builder, new Float(f)});
        } else if (!this.b) {
            cot.c("Camera2_Camera2Zoom", "setZoom: not supported");
        } else {
            float f2 = this.f6656a;
            float clamp = MathUtils.clamp(f * f2, 1.0f, f2);
            int width = this.d.width() / 2;
            int height = this.d.height() / 2;
            int width2 = (int) ((this.d.width() * 0.5f) / clamp);
            int height2 = (int) ((this.d.height() * 0.5f) / clamp);
            this.c.set(width - width2, height - height2, width + width2, height + height2);
            builder.set(CaptureRequest.SCALER_CROP_REGION, this.c);
        }
    }

    public void a(CaptureRequest.Builder builder, float f, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf4fca93", new Object[]{this, builder, new Float(f), new Integer(i)});
        } else if (!this.b) {
            cot.c("Camera2_Camera2Zoom", "setZoom: not supported");
        } else {
            float min = f < 0.0f ? 0.0f : Math.min(f, this.f6656a);
            if (i == 1) {
                float f2 = this.e;
                if (f2 >= 0.0f && min <= f2) {
                    return;
                }
            } else if (i == 2) {
                float f3 = this.e;
                if (f3 >= 0.0f && min >= f3) {
                    return;
                }
            } else {
                float f4 = this.e;
                if (f4 >= 0.0f && min == f4) {
                    return;
                }
            }
            int width = this.d.width() / 2;
            int height = this.d.height() / 2;
            int width2 = (int) ((this.d.width() * 0.5f) / min);
            int height2 = (int) ((this.d.height() * 0.5f) / min);
            this.c.set(width - width2, height - height2, width + width2, height + height2);
            builder.set(CaptureRequest.SCALER_CROP_REGION, this.c);
        }
    }
}
