package tb;

import android.support.v4.util.LongSparseArray;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.bn;
import com.taobao.android.dinamicx.widget.ak;

/* loaded from: classes.dex */
public class lms {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "DxRegisterUtils";

    static {
        kge.a(-867359875);
    }

    public static void a(DinamicXEngine dinamicXEngine, LongSparseArray<ak> longSparseArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41e260c7", new Object[]{dinamicXEngine, longSparseArray});
        } else if (longSparseArray == null || longSparseArray.size() == 0) {
            ldf.d(TAG, "widgetNodes is empty");
        } else {
            for (int i = 0; i < longSparseArray.size(); i++) {
                long keyAt = longSparseArray.keyAt(i);
                dinamicXEngine.a(keyAt, longSparseArray.get(keyAt));
            }
        }
    }

    public static void b(DinamicXEngine dinamicXEngine, LongSparseArray<fut> longSparseArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79d33be6", new Object[]{dinamicXEngine, longSparseArray});
        } else if (longSparseArray == null || longSparseArray.size() == 0) {
            ldf.d(TAG, "registerDataParsers parsers is empty");
        } else {
            for (int i = 0; i < longSparseArray.size(); i++) {
                long keyAt = longSparseArray.keyAt(i);
                fut futVar = longSparseArray.get(keyAt);
                if (futVar != null) {
                    dinamicXEngine.a(keyAt, new lfo(futVar));
                }
            }
        }
    }

    public static void c(DinamicXEngine dinamicXEngine, LongSparseArray<bn> longSparseArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1c41705", new Object[]{dinamicXEngine, longSparseArray});
        } else if (longSparseArray == null || longSparseArray.size() == 0) {
            ldf.d(TAG, "registerEventHandlers eventHandlers is empty");
        } else {
            for (int i = 0; i < longSparseArray.size(); i++) {
                long keyAt = longSparseArray.keyAt(i);
                if (longSparseArray.get(keyAt) != null) {
                    dinamicXEngine.a(keyAt, longSparseArray.get(keyAt));
                }
            }
        }
    }

    public static void d(DinamicXEngine dinamicXEngine, LongSparseArray<dln> longSparseArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9b4f224", new Object[]{dinamicXEngine, longSparseArray});
        } else if (longSparseArray == null || longSparseArray.size() == 0) {
            ldf.d(TAG, "registerAbilities abilities is empty");
        } else {
            for (int i = 0; i < longSparseArray.size(); i++) {
                long keyAt = longSparseArray.keyAt(i);
                dinamicXEngine.a(keyAt, longSparseArray.get(keyAt));
            }
        }
    }
}
