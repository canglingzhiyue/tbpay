package com.taobao.tbdeviceevaluator;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.application.common.impl.d;

/* loaded from: classes.dex */
public final class c {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_CPU_ARCH = "cpuArch";
    public static final String KEY_CPU_BRAND = "cpuBrand";
    public static final String KEY_CPU_COUNT = "cpuCount";
    public static final String KEY_CPU_MAX_FREQ = "cpuMaxFreq";
    public static final String KEY_CPU_MIN_FREQ = "cpuMinFreq";
    public static final String KEY_CPU_NAME = "cpuName";
    public static final String KEY_CPU_SCORE = "cpuScore";
    public static final String KEY_DEVICE_LEVEL = "deviceLevel";
    public static final String KEY_DISPLAY_DENSITY = "displayDensity";
    public static final String KEY_DISPLAY_HEIGHT = "displayHeight";
    public static final String KEY_DISPLAY_WIDTH = "displayWidth";
    public static final String KEY_EGL_SCORE = "eglScore";
    public static final String KEY_EGL_VERSION = "eglVersion";
    public static final String KEY_GPU_BRAND = "gpuBrand";
    public static final String KEY_GPU_FREQ = "gpuFreq";
    public static final String KEY_GPU_NAME = "gpuName";
    public static final String KEY_GPU_SCORE = "gpuScore";
    public static final String KEY_MEM_DEVICE_TOTAL = "memDeviceTotal";
    public static final String KEY_MEM_LIMITED_HEAP = "memLimitedHeap";
    public static final String KEY_MEM_LIMITED_LARGE_HEAP = "memLimitedLargeHeap";
    public static final String KEY_MEM_SCORE = "memScore";
    public static final String KEY_MOBILE_MODEL = "mobileModel";
    public static final String KEY_NEW_SCORE = "newDeviceScore";
    public static final String KEY_OLD_SCORE = "oldDeviceScore";

    /* renamed from: a  reason: collision with root package name */
    private final d f22098a = d.a();

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            this.f22098a.b("mobileModel", str);
        }
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else {
            this.f22098a.b("deviceLevel", i);
        }
    }

    public void a(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8218858", new Object[]{this, new Float(f)});
        } else {
            this.f22098a.b(KEY_DISPLAY_DENSITY, f);
        }
    }

    public void b(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d660f7", new Object[]{this, new Float(f)});
        } else {
            this.f22098a.b(KEY_DISPLAY_HEIGHT, f);
        }
    }

    public void c(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b3996", new Object[]{this, new Float(f)});
        } else {
            this.f22098a.b(KEY_DISPLAY_WIDTH, f);
        }
    }

    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
        } else {
            this.f22098a.b(KEY_CPU_BRAND, str);
        }
    }

    public void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{this, str});
        } else {
            this.f22098a.b("cpuName", str);
        }
    }

    public void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
        } else {
            this.f22098a.b(KEY_CPU_COUNT, i);
        }
    }

    public void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d23b17f5", new Object[]{this, str});
        } else {
            this.f22098a.b("cpuArch", str);
        }
    }

    public void d(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad401235", new Object[]{this, new Float(f)});
        } else {
            this.f22098a.b(KEY_CPU_MAX_FREQ, f);
        }
    }

    public void e(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aef4ead4", new Object[]{this, new Float(f)});
        } else {
            this.f22098a.b(KEY_CPU_MIN_FREQ, f);
        }
    }

    public void e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c6cb136", new Object[]{this, str});
        } else {
            this.f22098a.b(KEY_GPU_NAME, str);
        }
    }

    public void f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("669e4a77", new Object[]{this, str});
        } else {
            this.f22098a.b(KEY_GPU_BRAND, str);
        }
    }

    public void f(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0a9c373", new Object[]{this, new Float(f)});
        } else {
            this.f22098a.b(KEY_GPU_FREQ, f);
        }
    }

    public void a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821975c", new Object[]{this, new Long(j)});
        } else {
            this.f22098a.b(KEY_MEM_DEVICE_TOTAL, j);
        }
    }

    public void c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b44d9", new Object[]{this, new Integer(i)});
        } else {
            this.f22098a.b(KEY_MEM_LIMITED_HEAP, i);
        }
    }

    public void d(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad401d78", new Object[]{this, new Integer(i)});
        } else {
            this.f22098a.b(KEY_MEM_LIMITED_LARGE_HEAP, i);
        }
    }

    public void g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0cfe3b8", new Object[]{this, str});
        } else {
            this.f22098a.b(KEY_EGL_VERSION, str);
        }
    }

    public void e(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aef4f617", new Object[]{this, new Integer(i)});
        } else {
            this.f22098a.b(KEY_CPU_SCORE, i);
        }
    }

    public void f(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0a9ceb6", new Object[]{this, new Integer(i)});
        } else {
            this.f22098a.b(KEY_GPU_SCORE, i);
        }
    }

    public void g(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b25ea755", new Object[]{this, new Integer(i)});
        } else {
            this.f22098a.b(KEY_MEM_SCORE, i);
        }
    }

    public void h(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4137ff4", new Object[]{this, new Integer(i)});
        } else {
            this.f22098a.b(KEY_EGL_SCORE, i);
        }
    }

    public void g(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b25e9c12", new Object[]{this, new Float(f)});
        } else {
            this.f22098a.b(KEY_NEW_SCORE, f);
        }
    }

    public void i(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5c85893", new Object[]{this, new Integer(i)});
        } else {
            this.f22098a.b(KEY_OLD_SCORE, i);
        }
    }
}
