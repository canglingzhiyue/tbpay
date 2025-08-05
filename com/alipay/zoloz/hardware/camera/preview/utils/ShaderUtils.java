package com.alipay.zoloz.hardware.camera.preview.utils;

import android.content.res.Resources;
import android.opengl.GLES20;
import com.alipay.zoloz.hardware.log.Log;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.InputStream;

/* loaded from: classes3.dex */
public class ShaderUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    private ShaderUtils() {
    }

    public static void checkGLError(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("181f666c", new Object[]{str});
        } else {
            Log.e("wuwang", str);
        }
    }

    public static int loadShader(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("21ddd4e", new Object[]{new Integer(i), str})).intValue();
        }
        int glCreateShader = GLES20.glCreateShader(i);
        if (glCreateShader == 0) {
            return glCreateShader;
        }
        GLES20.glShaderSource(glCreateShader, str);
        GLES20.glCompileShader(glCreateShader);
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        if (iArr[0] != 0) {
            return glCreateShader;
        }
        Log.e("ShaderUtils", "Could not compile shader:" + i);
        Log.e("ShaderUtils", "GLES20 Error:" + GLES20.glGetShaderInfoLog(glCreateShader));
        GLES20.glDeleteShader(glCreateShader);
        return 0;
    }

    public static int loadShader(Resources resources, int i, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("e29c69f1", new Object[]{resources, new Integer(i), str})).intValue() : loadShader(i, loadFromAssetsFile(str, resources));
    }

    public static int createProgram(String str, String str2) {
        int loadShader;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f20f7bf6", new Object[]{str, str2})).intValue();
        }
        int loadShader2 = loadShader(35633, str);
        if (loadShader2 == 0 || (loadShader = loadShader(35632, str2)) == 0) {
            return 0;
        }
        int glCreateProgram = GLES20.glCreateProgram();
        if (glCreateProgram == 0) {
            return glCreateProgram;
        }
        GLES20.glAttachShader(glCreateProgram, loadShader2);
        checkGLError("Attach Vertex Shader");
        GLES20.glAttachShader(glCreateProgram, loadShader);
        checkGLError("Attach Fragment Shader");
        GLES20.glLinkProgram(glCreateProgram);
        int[] iArr = new int[1];
        GLES20.glGetProgramiv(glCreateProgram, 35714, iArr, 0);
        if (iArr[0] == 1) {
            return glCreateProgram;
        }
        Log.e("ShaderUtils", "Could not link program:" + GLES20.glGetProgramInfoLog(glCreateProgram));
        GLES20.glDeleteProgram(glCreateProgram);
        return 0;
    }

    public static int createProgram(Resources resources, String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("f6c16119", new Object[]{resources, str, str2})).intValue() : createProgram(loadFromAssetsFile(str, resources), loadFromAssetsFile(str2, resources));
    }

    public static String loadFromAssetsFile(String str, Resources resources) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("27a9141f", new Object[]{str, resources});
        }
        StringBuilder sb = new StringBuilder();
        try {
            InputStream open = resources.getAssets().open(str);
            byte[] bArr = new byte[1024];
            while (true) {
                int read = open.read(bArr);
                if (-1 != read) {
                    sb.append(new String(bArr, 0, read));
                } else {
                    return sb.toString().replaceAll("\\r\\n", "\n");
                }
            }
        } catch (Exception unused) {
            return null;
        }
    }
}
