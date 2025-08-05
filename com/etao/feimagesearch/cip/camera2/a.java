package com.etao.feimagesearch.cip.camera2;

import android.content.Context;
import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import tb.coy;
import tb.cuj;
import tb.kge;

/* loaded from: classes3.dex */
public final class a {
    public static final C0223a Companion;

    static {
        kge.a(-337362311);
        Companion = new C0223a(null);
    }

    /* renamed from: com.etao.feimagesearch.cip.camera2.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C0223a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(849488513);
        }

        private C0223a() {
        }

        public /* synthetic */ C0223a(o oVar) {
            this();
        }

        public final boolean a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : Build.VERSION.SDK_INT >= 21;
        }

        public final boolean a(Context context) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("9e1d6464", new Object[]{this, context})).booleanValue();
            }
            q.c(context, "context");
            return cuj.b(context, "openCamera2Failed", false);
        }

        public final void a(Context context, String errorMsg) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("61b6362a", new Object[]{this, context, errorMsg});
                return;
            }
            q.c(context, "context");
            q.c(errorMsg, "errorMsg");
            cuj.a(context, "openCamera2Failed", true);
            coy.a(com.etao.feimagesearch.structure.capture.a.f6987a, "markOpenCamera2Failed", 19999, "errorMsg", errorMsg);
        }

        public final boolean a(int i, CameraCharacteristics cameraCharacteristics) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("335d7b04", new Object[]{this, new Integer(i), cameraCharacteristics})).booleanValue();
            }
            q.c(cameraCharacteristics, "cameraCharacteristics");
            int[] iArr = {2, 0, 1, 3};
            Integer num = (Integer) cameraCharacteristics.get(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
            if (num != null && i == num.intValue()) {
                return true;
            }
            for (int i2 : iArr) {
                if (i == i2) {
                    return true;
                }
                if (num != null && num.intValue() == i2) {
                    return false;
                }
            }
            return false;
        }
    }
}
