package mtopsdk.mtop.global.init;

import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Constructor;
import mtopsdk.common.util.TBSdkLog;
import mtopsdk.mtop.intf.Mtop;
import tb.kge;

/* loaded from: classes.dex */
public class MtopInitTaskFactory {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String CUTE_MTOP_INIT_TASK = "qmtopsdk.mtop.global.init.QMtopInitTask";
    private static final String INNER_MTOP_INIT_TASK = "mtopsdk.mtop.global.init.InnerMtopInitTask";
    private static final String OPEN_MTOP_INIT_TASK = "mtopsdk.mtop.global.init.OpenMtopInitTask";
    private static final String PRODUCT_MTOP_INIT_TASK = "mtopsdk.mtop.global.init.ProductMtopInitTask";
    private static final String SSR_TOP_INIT_TASK = "mtopsdk.ssrcore.SsrMtopInitTask";
    private static final String TAG = "mtopsdk.MtopInitTaskFactory";

    static {
        kge.a(-1818194640);
    }

    public static IMtopInitTask getMtopInitTask(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IMtopInitTask) ipChange.ipc$dispatch("51c7a158", new Object[]{str});
        }
        if (str == null) {
            return null;
        }
        char c = 65535;
        switch (str.hashCode()) {
            case 82418:
                if (str.equals(Mtop.Id.SSR)) {
                    c = 4;
                    break;
                }
                break;
            case 2080355:
                if (str.equals(Mtop.Id.CUTE)) {
                    c = 3;
                    break;
                }
                break;
            case 2432586:
                if (str.equals("OPEN")) {
                    c = 1;
                    break;
                }
                break;
            case 69817910:
                if (str.equals(Mtop.Id.INNER)) {
                    c = 0;
                    break;
                }
                break;
            case 408508623:
                if (str.equals(Mtop.Id.PRODUCT)) {
                    c = 2;
                    break;
                }
                break;
        }
        if (c == 0) {
            return newInstance(INNER_MTOP_INIT_TASK);
        }
        if (c == 1) {
            return newInstance(OPEN_MTOP_INIT_TASK);
        }
        if (c == 2) {
            return newInstance(PRODUCT_MTOP_INIT_TASK);
        }
        if (c == 3) {
            return newInstance(CUTE_MTOP_INIT_TASK);
        }
        if (c == 4) {
            return newInstance(SSR_TOP_INIT_TASK);
        }
        return newInstance(INNER_MTOP_INIT_TASK);
    }

    public static IMtopInitTask getMtopInitTask(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IMtopInitTask) ipChange.ipc$dispatch("d190b03d", new Object[]{str, new Integer(i)});
        }
        if (str == null) {
            return null;
        }
        char c = 65535;
        switch (str.hashCode()) {
            case 82418:
                if (str.equals(Mtop.Id.SSR)) {
                    c = 4;
                    break;
                }
                break;
            case 2080355:
                if (str.equals(Mtop.Id.CUTE)) {
                    c = 3;
                    break;
                }
                break;
            case 2432586:
                if (str.equals("OPEN")) {
                    c = 1;
                    break;
                }
                break;
            case 69817910:
                if (str.equals(Mtop.Id.INNER)) {
                    c = 0;
                    break;
                }
                break;
            case 408508623:
                if (str.equals(Mtop.Id.PRODUCT)) {
                    c = 2;
                    break;
                }
                break;
        }
        if (c == 0) {
            return newInstance(INNER_MTOP_INIT_TASK);
        }
        if (c == 1) {
            return newInstance(OPEN_MTOP_INIT_TASK);
        }
        if (c == 2) {
            return newInstance(PRODUCT_MTOP_INIT_TASK);
        }
        if (c == 3) {
            return newInstance(CUTE_MTOP_INIT_TASK);
        }
        if (c == 4) {
            return newInstance(SSR_TOP_INIT_TASK);
        }
        if (i == 0) {
            return newInstance(INNER_MTOP_INIT_TASK);
        }
        if (1 == i) {
            return newInstance(OPEN_MTOP_INIT_TASK);
        }
        if (2 == i) {
            return newInstance(PRODUCT_MTOP_INIT_TASK);
        }
        if (3 == i) {
            return newInstance(CUTE_MTOP_INIT_TASK);
        }
        if (4 == i) {
            return newInstance(SSR_TOP_INIT_TASK);
        }
        return newInstance(INNER_MTOP_INIT_TASK);
    }

    private static IMtopInitTask newInstance(String str) {
        try {
            Constructor<?> declaredConstructor = Class.forName(str).getDeclaredConstructor(new Class[0]);
            declaredConstructor.setAccessible(true);
            return (IMtopInitTask) declaredConstructor.newInstance(new Object[0]);
        } catch (Throwable unused) {
            TBSdkLog.e(TAG, "reflect IMtopInitTask instance error.clazzName=" + str);
            return null;
        }
    }
}
