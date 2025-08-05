package com.alipay.zoloz.hardware.camera.preview;

import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.opengl.Matrix;
import com.alipay.zoloz.hardware.camera.abs.AbsCamera;
import com.alipay.zoloz.hardware.log.Log;
import com.android.alibaba.ip.runtime.IpChange;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

/* loaded from: classes3.dex */
public class CameraTextureRender {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static volatile float ANIMRATION = 1.0f;
    public static int BEAUTY_LEVEL = 2;
    public static final int BEAUTY_LEVEL_1 = 1;
    public static final int BEAUTY_LEVEL_2 = 2;
    public static final int BEAUTY_LEVEL_3 = 3;
    public static final String TAG = "CameraTextureRender";
    private int c;
    private int d;
    private int e;
    private int f;
    private int g;
    private int h;
    private int i;
    private int j;
    private SurfaceTexture m;
    private FloatBuffer q;

    /* renamed from: a  reason: collision with root package name */
    private RectF f6242a = new RectF();
    private PointF b = new PointF();
    private float[] k = new float[16];
    private float[] l = new float[16];
    private boolean n = false;
    private float[] o = {-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f};
    private FloatBuffer p = a(this.o);

    public SurfaceTexture getSurfaceTexture() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SurfaceTexture) ipChange.ipc$dispatch("c7ae716a", new Object[]{this}) : this.m;
    }

    public Rect create(boolean z, AbsCamera.PreviewTexture previewTexture, Rect rect, int i, int i2, int i3, int i4, int i5, float f, float f2) {
        float f3;
        float f4;
        float f5;
        float[] fArr;
        float f6;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Rect) ipChange.ipc$dispatch("9435fcff", new Object[]{this, new Boolean(z), previewTexture, rect, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Float(f), new Float(f2)});
        }
        float f7 = 1.0f;
        if (i5 == 90) {
            float f8 = i2;
            float f9 = i;
            f6 = i3 / i4;
            if (f8 / f9 >= f6) {
                f3 = ((f8 - (f9 * f6)) * 0.5f) / f8;
                f4 = 1.0f - f3;
                f5 = 0.0f;
            } else {
                float f10 = ((f9 - (f8 / f6)) * 0.5f) / f9;
                f7 = 1.0f - f10;
                f5 = f10;
                f4 = 1.0f;
                f3 = 0.0f;
            }
            fArr = new float[]{f7, f3, f7, f4, f5, f3, f5, f4};
        } else {
            float f11 = i;
            float f12 = i2;
            float f13 = i3 / i4;
            if (f11 / f12 >= f13) {
                float f14 = ((f11 - (f12 * f13)) * 0.5f) / f11;
                f7 = 1.0f - f14;
                f5 = f14;
                f4 = 1.0f;
                f3 = 0.0f;
            } else {
                f3 = ((f12 - (f11 / f13)) * 0.5f) / f12;
                f4 = 1.0f - f3;
                f5 = 0.0f;
            }
            fArr = new float[]{f5, f3, f7, f3, f5, f4, f7, f4};
            f6 = f13;
        }
        float f15 = f3;
        float f16 = f7;
        Log.d(TAG, "colorWidth=" + i + ", colorHeight=" + i2 + ", rotate=" + i5 + ", uiWidth=" + i3 + ", uiHeight=" + i4 + ", uiScale=" + f6 + ", left=" + f5 + ", top=" + f4 + ", right=" + f16 + ", bottom=" + f15);
        this.q = a(fArr);
        this.j = previewTexture.textureId;
        this.m = previewTexture.surfaceTexture;
        a(z);
        this.f6242a.set(f5, f4, f16, f15);
        this.b.set(f, f2);
        Rect rect2 = new Rect();
        float f17 = (float) i;
        rect2.left = (int) (f5 * f17);
        rect2.right = (int) (f16 * f17);
        float f18 = (float) i2;
        rect2.top = (int) (f4 * f18);
        rect2.bottom = (int) (f15 * f18);
        return rect2;
    }

    public void setMirror(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5728d0c", new Object[]{this, new Boolean(z)});
        } else {
            this.n = z;
        }
    }

    public void draw() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cea46fcb", new Object[]{this});
            return;
        }
        float f = ANIMRATION;
        SurfaceTexture surfaceTexture = this.m;
        if (surfaceTexture == null) {
            return;
        }
        surfaceTexture.getTransformMatrix(this.k);
        Matrix.setIdentityM(this.l, 0);
        if (this.n) {
            Matrix.scaleM(this.l, 0, -1.0f, 1.0f, 1.0f);
        }
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
        GLES20.glClear(16384);
        if (ANIMRATION < 0.0f) {
            return;
        }
        GLES20.glUseProgram(this.c);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(36197, this.j);
        GLES20.glUniformMatrix4fv(this.f, 1, false, this.l, 0);
        GLES20.glUniformMatrix4fv(this.g, 1, false, this.k, 0);
        GLES20.glUniform4f(this.h, this.f6242a.left, this.f6242a.right, this.f6242a.top, this.f6242a.bottom);
        GLES20.glUniform2f(this.i, this.b.x / f, this.b.y / f);
        GLES20.glEnableVertexAttribArray(this.d);
        for (int i = 0; i < 8; i++) {
            this.p.put(i, this.o[i] * f);
        }
        GLES20.glVertexAttribPointer(this.d, 2, 5126, false, 8, (Buffer) this.p);
        GLES20.glEnableVertexAttribArray(this.e);
        GLES20.glVertexAttribPointer(this.e, 2, 5126, false, 8, (Buffer) this.q);
        GLES20.glDrawArrays(5, 0, 4);
        GLES20.glDisableVertexAttribArray(this.d);
        GLES20.glDisableVertexAttribArray(this.e);
        GLES20.glUseProgram(0);
    }

    private void a(boolean z) {
        int a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        int a3 = a(35633, "uniform mat4 uMVPMatrix;\nuniform mat4 uTexMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 textureCoordinate;\nvoid main() {\n    gl_Position = uMVPMatrix * aPosition;\n    textureCoordinate = (uTexMatrix * aTextureCoord).xy;\n}\n");
        if (z) {
            int i = BEAUTY_LEVEL;
            String str = "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nuniform samplerExternalOES vTexture;\nvarying mediump vec2 textureCoordinate;\nuniform vec4 uUVRange;\nuniform vec2 uCornerRation;\nconst mediump vec4 params = vec4(0.6, 0.8, 0.25, 0.15); \nconst mediump vec3 W = vec3(0.299,0.587,0.114);\nconst mat3 saturateMatrix = mat3(\n1.1102,-0.0598,-0.061,\n-0.0774,1.0826,-0.1186,\n-0.0228,-0.0228,1.1772);\nvoid main(){\nfloat testResult = 1.0;\nif(uCornerRation.x > 0.0 || uCornerRation.y > 0.0){\nvec2 uvcenter = vec2(uUVRange.x+uUVRange.y,uUVRange.z+uUVRange.w)*0.5;\nvec2 roiSize = abs(vec2(uUVRange.x - uUVRange.y,uUVRange.z - uUVRange.w));\nvec2 uvcornerSize = roiSize*uCornerRation;\nvec2 relativeuv = abs(textureCoordinate - uvcenter);\nvec2 roiHalfSizeWithoutCorner = abs(roiSize - uvcornerSize*2.0)*0.5;\nfloat rx = relativeuv.x - roiHalfSizeWithoutCorner.x;\nfloat ry = relativeuv.y - roiHalfSizeWithoutCorner.y;\nfloat mx = step(roiHalfSizeWithoutCorner.x, relativeuv.x);\nfloat my = step(roiHalfSizeWithoutCorner.y, relativeuv.y);\nfloat ecclipse = step(1.0,rx*rx/(uvcornerSize.x*uvcornerSize.x) + ry*ry/(uvcornerSize.y*uvcornerSize.y));\nif(mx*my*ecclipse > 0.5) \ndiscard;}\nvec3 centralColor = texture2D(vTexture, textureCoordinate).rgb;\nfloat lumance = dot(centralColor, W);\n\nfloat alpha = pow(lumance, params.r);\nvec3 smoothColor = centralColor;\n\nsmoothColor.r = clamp(pow(smoothColor.r, params.g),0.0,1.0);\nsmoothColor.g = clamp(pow(smoothColor.g, params.g),0.0,1.0);\nsmoothColor.b = clamp(pow(smoothColor.b, params.g),0.0,1.0);\n\nvec3 lvse = vec3(1.0)-(vec3(1.0)-smoothColor)*(vec3(1.0)-centralColor);\nvec3 bianliang = max(smoothColor, centralColor);\nvec3 rouguang = 2.0*centralColor*smoothColor + centralColor*centralColor - 2.0*centralColor*centralColor*smoothColor;\n\ngl_FragColor = vec4(mix(centralColor, lvse, alpha), 1.0);\ngl_FragColor.rgb = mix(gl_FragColor.rgb, bianliang, alpha);\ngl_FragColor.rgb = mix(gl_FragColor.rgb, rouguang, params.b);\ngl_FragColor.r = log(centralColor.r*(3.0) + 1.0)/log(3.5);\ngl_FragColor.g = log(centralColor.g*(3.0) + 1.0)/log(3.5);\ngl_FragColor.b = log(centralColor.b*(3.0) + 1.0)/log(3.5);\n}\n";
            if (i != 1) {
                if (i == 2) {
                    str = "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 textureCoordinate;\nuniform samplerExternalOES vTexture;\nuniform vec4 uUVRange;\nuniform vec2 uCornerRation;\nvoid main() {\nfloat testResult = 1.0;\nif(uCornerRation.x > 0.0 || uCornerRation.y > 0.0){\nvec2 uvcenter = vec2(uUVRange.x+uUVRange.y,uUVRange.z+uUVRange.w)*0.5;\nvec2 roiSize = abs(vec2(uUVRange.x - uUVRange.y,uUVRange.z - uUVRange.w));\nvec2 uvcornerSize = roiSize*uCornerRation;\nvec2 relativeuv = abs(textureCoordinate - uvcenter);\nvec2 roiHalfSizeWithoutCorner = abs(roiSize - uvcornerSize*2.0)*0.5;\nfloat rx = relativeuv.x - roiHalfSizeWithoutCorner.x;\nfloat ry = relativeuv.y - roiHalfSizeWithoutCorner.y;\nfloat mx = step(roiHalfSizeWithoutCorner.x, relativeuv.x);\nfloat my = step(roiHalfSizeWithoutCorner.y, relativeuv.y);\nfloat ecclipse = step(1.0,rx*rx/(uvcornerSize.x*uvcornerSize.x) + ry*ry/(uvcornerSize.y*uvcornerSize.y));\nif(mx*my*ecclipse > 0.5) \ndiscard;}\nvec3 centralColor;\nfloat sampleColor;\nvec2 blurCoordinates[20];\n\nfloat mul = 2.0;\n\nfloat mul_x = mul / 720.0;\nfloat mul_y = mul / 1280.0;\n\n\nblurCoordinates[0] = textureCoordinate + vec2(0.0 * mul_x,-10.0 * mul_y);\nblurCoordinates[1] = textureCoordinate + vec2(6.0 * mul_x,-6.0 * mul_y);\nblurCoordinates[2] = textureCoordinate + vec2(10.0 * mul_x,0.0 * mul_y);\nblurCoordinates[3] = textureCoordinate + vec2(6.0 * mul_x,6.0 * mul_y);\nblurCoordinates[4] = textureCoordinate + vec2(0.0 * mul_x,10.0 * mul_y);\nblurCoordinates[5] = textureCoordinate + vec2(-6.0 * mul_x,6.0 * mul_y);\nblurCoordinates[6] = textureCoordinate + vec2(-10.0 * mul_x,0.0 * mul_y);\nblurCoordinates[7] = textureCoordinate + vec2(-6.0 * mul_x,-6.0 * mul_y);\n\n\nsampleColor = texture2D(vTexture, textureCoordinate).g * 22.0;\n\nsampleColor += texture2D(vTexture, blurCoordinates[0]).g;\nsampleColor += texture2D(vTexture, blurCoordinates[1]).g;\nsampleColor += texture2D(vTexture, blurCoordinates[2]).g;\nsampleColor += texture2D(vTexture, blurCoordinates[3]).g;\nsampleColor += texture2D(vTexture, blurCoordinates[4]).g;\nsampleColor += texture2D(vTexture, blurCoordinates[5]).g;\nsampleColor += texture2D(vTexture, blurCoordinates[6]).g;\nsampleColor += texture2D(vTexture, blurCoordinates[7]).g;\n\n\n\nsampleColor = sampleColor/30.0;\ncentralColor = texture2D(vTexture, textureCoordinate).rgb;\n\nfloat dis = centralColor.g - sampleColor + 0.5;\n\n\nif(dis <= 0.5)\n{\ndis = dis * dis * 2.0;\n}\nelse\n{\ndis = 1.0 - ((1.0 - dis)*(1.0 - dis) * 2.0);\n}\n\nif(dis <= 0.5)\n{\ndis = dis * dis * 2.0;\n}\nelse\n{\ndis = 1.0 - ((1.0 - dis)*(1.0 - dis) * 2.0);\n}\n\nif(dis <= 0.5)\n{\ndis = dis * dis * 2.0;\n}\nelse\n{\ndis = 1.0 - ((1.0 - dis)*(1.0 - dis) * 2.0);\n}\n\nif(dis <= 0.5)\n{\ndis = dis * dis * 2.0;\n}\nelse\n{\ndis = 1.0 - ((1.0 - dis)*(1.0 - dis) * 2.0);\n}\n\nif(dis <= 0.5)\n{\ndis = dis * dis * 2.0;\n}\nelse\n{\ndis = 1.0 - ((1.0 - dis)*(1.0 - dis) * 2.0);\n}\n\n\nfloat aa= 1.03;\nvec3 smoothColor = centralColor*aa - vec3(dis)*(aa-1.0);\n\nfloat hue = dot(smoothColor, vec3(0.299,0.587,0.114));\n\naa = 1.0 + pow(hue, 0.6)*0.1;\nsmoothColor = centralColor*aa - vec3(dis)*(aa-1.0);\n\nsmoothColor.r = clamp(pow(smoothColor.r, 0.6),0.0,1.0);\nsmoothColor.g = clamp(pow(smoothColor.g, 0.6),0.0,1.0);\nsmoothColor.b = clamp(pow(smoothColor.b, 0.6),0.0,1.0);\n\n\nvec3 lvse = vec3(1.0)-(vec3(1.0)-smoothColor)*(vec3(1.0)-centralColor);\nvec3 bianliang = max(smoothColor, centralColor);\nvec3 rouguang = 2.0*centralColor*smoothColor + centralColor*centralColor - 2.0*centralColor*centralColor*smoothColor;\n\n\ngl_FragColor = vec4(mix(centralColor, lvse, pow(hue, 0.6)), 1.0);\ngl_FragColor.rgb = mix(gl_FragColor.rgb, bianliang, pow(hue, 0.6));\ngl_FragColor.rgb = mix(gl_FragColor.rgb, rouguang, 0.25);\n\n\n\nmat3 saturateMatrix = mat3(\n1.1102,\n-0.0598,\n-0.061,\n-0.0774,\n1.0826,\n-0.1186,\n-0.0228,\n-0.0228,\n1.1772);\n\nvec3 satcolor = gl_FragColor.rgb * saturateMatrix;\ngl_FragColor.rgb = mix(gl_FragColor.rgb, satcolor, 0.18);\n}\n";
                } else if (i == 3) {
                    str = "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 textureCoordinate;\nuniform samplerExternalOES vTexture;\nuniform vec4 uUVRange;\nuniform vec2 uCornerRation;\nvoid main() {\nfloat testResult = 1.0;\nif(uCornerRation.x > 0.0 || uCornerRation.y > 0.0){\nvec2 uvcenter = vec2(uUVRange.x+uUVRange.y,uUVRange.z+uUVRange.w)*0.5;\nvec2 roiSize = abs(vec2(uUVRange.x - uUVRange.y,uUVRange.z - uUVRange.w));\nvec2 uvcornerSize = roiSize*uCornerRation;\nvec2 relativeuv = abs(textureCoordinate - uvcenter);\nvec2 roiHalfSizeWithoutCorner = abs(roiSize - uvcornerSize*2.0)*0.5;\nfloat rx = relativeuv.x - roiHalfSizeWithoutCorner.x;\nfloat ry = relativeuv.y - roiHalfSizeWithoutCorner.y;\nfloat mx = step(roiHalfSizeWithoutCorner.x, relativeuv.x);\nfloat my = step(roiHalfSizeWithoutCorner.y, relativeuv.y);\nfloat ecclipse = step(1.0,rx*rx/(uvcornerSize.x*uvcornerSize.x) + ry*ry/(uvcornerSize.y*uvcornerSize.y));\nif(mx*my*ecclipse > 0.5) \ndiscard;}\nvec3 centralColor;\nfloat sampleColor;\nvec2 blurCoordinates[20];\n\nfloat mul = 2.0;\n\nfloat mul_x = mul / 720.0;\nfloat mul_y = mul / 1280.0;\n\n\nblurCoordinates[0] = textureCoordinate + vec2(0.0 * mul_x,-10.0 * mul_y);\nblurCoordinates[1] = textureCoordinate + vec2(5.0 * mul_x,-8.0 * mul_y);\nblurCoordinates[2] = textureCoordinate + vec2(8.0 * mul_x,-5.0 * mul_y);\nblurCoordinates[3] = textureCoordinate + vec2(10.0 * mul_x,0.0 * mul_y);\nblurCoordinates[4] = textureCoordinate + vec2(8.0 * mul_x,5.0 * mul_y);\nblurCoordinates[5] = textureCoordinate + vec2(5.0 * mul_x,8.0 * mul_y);\nblurCoordinates[6] = textureCoordinate + vec2(0.0 * mul_x,10.0 * mul_y);\nblurCoordinates[7] = textureCoordinate + vec2(-5.0 * mul_x,8.0 * mul_y);\nblurCoordinates[8] = textureCoordinate + vec2(-8.0 * mul_x,5.0 * mul_y);\nblurCoordinates[9] = textureCoordinate + vec2(-10.0 * mul_x,0.0 * mul_y);\nblurCoordinates[10] = textureCoordinate + vec2(-8.0 * mul_x,-5.0 * mul_y);\nblurCoordinates[11] = textureCoordinate + vec2(-5.0 * mul_x,-8.0 * mul_y);\nblurCoordinates[12] = textureCoordinate + vec2(0.0 * mul_x,-6.0 * mul_y);\nblurCoordinates[13] = textureCoordinate + vec2(-4.0 * mul_x,-4.0 * mul_y);\nblurCoordinates[14] = textureCoordinate + vec2(-6.0 * mul_x,0.0 * mul_y);\nblurCoordinates[15] = textureCoordinate + vec2(-4.0 * mul_x,4.0 * mul_y);\nblurCoordinates[16] = textureCoordinate + vec2(0.0 * mul_x,6.0 * mul_y);\nblurCoordinates[17] = textureCoordinate + vec2(4.0 * mul_x,4.0 * mul_y);\nblurCoordinates[18] = textureCoordinate + vec2(6.0 * mul_x,0.0 * mul_y);\nblurCoordinates[19] = textureCoordinate + vec2(4.0 * mul_x,-4.0 * mul_y);\n\n\nsampleColor = texture2D(vTexture, textureCoordinate).g * 22.0;\n\nsampleColor += texture2D(vTexture, blurCoordinates[0]).g;\nsampleColor += texture2D(vTexture, blurCoordinates[1]).g;\nsampleColor += texture2D(vTexture, blurCoordinates[2]).g;\nsampleColor += texture2D(vTexture, blurCoordinates[3]).g;\nsampleColor += texture2D(vTexture, blurCoordinates[4]).g;\nsampleColor += texture2D(vTexture, blurCoordinates[5]).g;\nsampleColor += texture2D(vTexture, blurCoordinates[6]).g;\nsampleColor += texture2D(vTexture, blurCoordinates[7]).g;\nsampleColor += texture2D(vTexture, blurCoordinates[8]).g;\nsampleColor += texture2D(vTexture, blurCoordinates[9]).g;\nsampleColor += texture2D(vTexture, blurCoordinates[10]).g;\nsampleColor += texture2D(vTexture, blurCoordinates[11]).g;\nsampleColor += texture2D(vTexture, blurCoordinates[12]).g * 2.0;\nsampleColor += texture2D(vTexture, blurCoordinates[13]).g * 2.0;\nsampleColor += texture2D(vTexture, blurCoordinates[14]).g * 2.0;\nsampleColor += texture2D(vTexture, blurCoordinates[15]).g * 2.0;\nsampleColor += texture2D(vTexture, blurCoordinates[16]).g * 2.0;\nsampleColor += texture2D(vTexture, blurCoordinates[17]).g * 2.0;\nsampleColor += texture2D(vTexture, blurCoordinates[18]).g * 2.0;\nsampleColor += texture2D(vTexture, blurCoordinates[19]).g * 2.0;\n\n\n\nsampleColor = sampleColor/50.0;\ncentralColor = texture2D(vTexture, textureCoordinate).rgb;\n\nfloat dis = centralColor.g - sampleColor + 0.5;\n\n\nif(dis <= 0.5)\n{\ndis = dis * dis * 2.0;\n}\nelse\n{\ndis = 1.0 - ((1.0 - dis)*(1.0 - dis) * 2.0);\n}\n\nif(dis <= 0.5)\n{\ndis = dis * dis * 2.0;\n}\nelse\n{\ndis = 1.0 - ((1.0 - dis)*(1.0 - dis) * 2.0);\n}\n\nif(dis <= 0.5)\n{\ndis = dis * dis * 2.0;\n}\nelse\n{\ndis = 1.0 - ((1.0 - dis)*(1.0 - dis) * 2.0);\n}\n\nif(dis <= 0.5)\n{\ndis = dis * dis * 2.0;\n}\nelse\n{\ndis = 1.0 - ((1.0 - dis)*(1.0 - dis) * 2.0);\n}\n\nif(dis <= 0.5)\n{\ndis = dis * dis * 2.0;\n}\nelse\n{\ndis = 1.0 - ((1.0 - dis)*(1.0 - dis) * 2.0);\n}\n\n\nfloat aa= 1.03;\nvec3 smoothColor = centralColor*aa - vec3(dis)*(aa-1.0);\n\nfloat hue = dot(smoothColor, vec3(0.299,0.587,0.114));\n\naa = 1.0 + pow(hue, 0.6)*0.1;\nsmoothColor = centralColor*aa - vec3(dis)*(aa-1.0);\n\nsmoothColor.r = clamp(pow(smoothColor.r, 0.6),0.0,1.0);\nsmoothColor.g = clamp(pow(smoothColor.g, 0.6),0.0,1.0);\nsmoothColor.b = clamp(pow(smoothColor.b, 0.6),0.0,1.0);\n\n\nvec3 lvse = vec3(1.0)-(vec3(1.0)-smoothColor)*(vec3(1.0)-centralColor);\nvec3 bianliang = max(smoothColor, centralColor);\nvec3 rouguang = 2.0*centralColor*smoothColor + centralColor*centralColor - 2.0*centralColor*centralColor*smoothColor;\n\n\ngl_FragColor = vec4(mix(centralColor, lvse, pow(hue, 0.6)), 1.0);\ngl_FragColor.rgb = mix(gl_FragColor.rgb, bianliang, pow(hue, 0.6));\ngl_FragColor.rgb = mix(gl_FragColor.rgb, rouguang, 0.25);\n\n\n\nmat3 saturateMatrix = mat3(\n1.1102,\n-0.0598,\n-0.061,\n-0.0774,\n1.0826,\n-0.1186,\n-0.0228,\n-0.0228,\n1.1772);\n\nvec3 satcolor = gl_FragColor.rgb * saturateMatrix;\ngl_FragColor.rgb = mix(gl_FragColor.rgb, satcolor, 0.18);\n}\n";
                }
            }
            Log.d(TAG, "beauty_level : " + BEAUTY_LEVEL);
            a2 = a(35632, str);
        } else {
            a2 = a(35632, "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 textureCoordinate;\nuniform samplerExternalOES vTexture;\nuniform vec4 uUVRange;\nuniform vec2 uCornerRation;\nvoid main() {\nfloat testResult = 1.0;\nif(uCornerRation.x > 0.0 || uCornerRation.y > 0.0){\nvec2 uvcenter = vec2(uUVRange.x+uUVRange.y,uUVRange.z+uUVRange.w)*0.5;\nvec2 roiSize = abs(vec2(uUVRange.x - uUVRange.y,uUVRange.z - uUVRange.w));\nvec2 uvcornerSize = roiSize*uCornerRation;\nvec2 relativeuv = abs(textureCoordinate - uvcenter);\nvec2 roiHalfSizeWithoutCorner = abs(roiSize - uvcornerSize*2.0)*0.5;\nfloat rx = relativeuv.x - roiHalfSizeWithoutCorner.x;\nfloat ry = relativeuv.y - roiHalfSizeWithoutCorner.y;\nfloat mx = step(roiHalfSizeWithoutCorner.x, relativeuv.x);\nfloat my = step(roiHalfSizeWithoutCorner.y, relativeuv.y);\nfloat ecclipse = step(1.0,rx*rx/(uvcornerSize.x*uvcornerSize.x) + ry*ry/(uvcornerSize.y*uvcornerSize.y));\nif(mx*my*ecclipse > 0.5) \ndiscard;}\ngl_FragColor = texture2D(vTexture, textureCoordinate)  ;\n}\n");
        }
        this.c = GLES20.glCreateProgram();
        a("glCreateProgram");
        GLES20.glAttachShader(this.c, a3);
        a("glAttachVertShader");
        GLES20.glAttachShader(this.c, a2);
        a("glAttachFragShader");
        GLES20.glLinkProgram(this.c);
        a("glLinkProgram");
        GLES20.glDeleteShader(a3);
        GLES20.glDeleteShader(a2);
        Log.d(TAG, " mProgram = " + this.c);
        this.d = GLES20.glGetAttribLocation(this.c, "aPosition");
        this.e = GLES20.glGetAttribLocation(this.c, "aTextureCoord");
        this.f = GLES20.glGetUniformLocation(this.c, "uMVPMatrix");
        this.g = GLES20.glGetUniformLocation(this.c, "uTexMatrix");
        this.h = GLES20.glGetUniformLocation(this.c, "uUVRange");
        this.i = GLES20.glGetUniformLocation(this.c, "uCornerRation");
    }

    public static int a(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("20f12c98", new Object[]{new Integer(i), str})).intValue();
        }
        int glCreateShader = GLES20.glCreateShader(i);
        GLES20.glShaderSource(glCreateShader, str);
        GLES20.glCompileShader(glCreateShader);
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        if (iArr[0] != 0) {
            return glCreateShader;
        }
        Log.e(TAG, "Could not compile shader : " + i + " source :" + str);
        StringBuilder sb = new StringBuilder();
        sb.append(" ");
        sb.append(GLES20.glGetShaderInfoLog(glCreateShader));
        Log.e(TAG, sb.toString());
        GLES20.glDeleteShader(glCreateShader);
        return 0;
    }

    private void a(String str) {
        int glGetError;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        if (GLES20.glGetError() == 0) {
            return;
        }
        String str2 = str + ": glError 0x" + Integer.toHexString(glGetError);
        Log.d(TAG, str2);
        throw new RuntimeException(str2);
    }

    public static FloatBuffer a(float[] fArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FloatBuffer) ipChange.ipc$dispatch("a82fb3fe", new Object[]{fArr});
        }
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(fArr.length << 2);
        allocateDirect.order(ByteOrder.nativeOrder());
        FloatBuffer asFloatBuffer = allocateDirect.asFloatBuffer();
        asFloatBuffer.put(fArr);
        asFloatBuffer.position(0);
        return asFloatBuffer;
    }
}
