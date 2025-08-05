package com.alipay.zoloz.hardware.camera.preview;

import android.opengl.GLES20;
import com.alipay.zoloz.hardware.log.Log;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class ShaderHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "ShaderHelper";

    public static int compileVertexShader(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ef4bba00", new Object[]{str})).intValue() : compileShaderCode(35633, str);
    }

    public static int compileFragmentShader(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("bbd757ec", new Object[]{str})).intValue() : compileShaderCode(35632, str);
    }

    public static int compileShaderCode(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6b952274", new Object[]{new Integer(i), str})).intValue();
        }
        int glCreateShader = GLES20.glCreateShader(i);
        if (glCreateShader == 0) {
            Log.i(TAG, "can not create shader");
            return 0;
        }
        GLES20.glShaderSource(glCreateShader, str);
        GLES20.glCompileShader(glCreateShader);
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        if (iArr[0] != 0) {
            return glCreateShader;
        }
        Log.i(TAG, "compile fail");
        return 0;
    }

    public static int linkProgram(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("98e3d0c4", new Object[]{new Integer(i), new Integer(i2)})).intValue();
        }
        int glCreateProgram = GLES20.glCreateProgram();
        if (glCreateProgram == 0) {
            Log.i(TAG, "create program fail");
            return 0;
        }
        GLES20.glAttachShader(glCreateProgram, i);
        GLES20.glAttachShader(glCreateProgram, i2);
        GLES20.glLinkProgram(glCreateProgram);
        int[] iArr = new int[1];
        GLES20.glGetProgramiv(glCreateProgram, 35714, iArr, 0);
        if (iArr[0] != 0) {
            return glCreateProgram;
        }
        Log.i(TAG, "link fail");
        return 0;
    }

    public static boolean validateProgram(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a3884f92", new Object[]{new Integer(i)})).booleanValue();
        }
        GLES20.glValidateProgram(i);
        int[] iArr = new int[1];
        GLES20.glGetProgramiv(i, 35715, iArr, 0);
        return iArr[0] != 0;
    }
}
