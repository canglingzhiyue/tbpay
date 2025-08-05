package tb;

import com.alibaba.mtl.appmonitor.AppMonitor;
import com.alibaba.mtl.appmonitor.model.DimensionSet;
import com.alibaba.mtl.appmonitor.model.DimensionValueSet;
import com.alibaba.mtl.appmonitor.model.MeasureSet;
import com.alibaba.mtl.appmonitor.model.MeasureValueSet;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.MUSAppMonitor;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public class rfn {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int PATCH_ERROR_DOWNLOAD = 1;
    public static final int PATCH_ERROR_INSTALL_EMPTY = 2;
    public static final int PATCH_ERROR_NO = 0;
    public static final int PATCH_ERROR_OTHER = 4;
    public static final int PATCH_ERROR_UNINSTALL = 3;
    private static rfn b;

    /* renamed from: a  reason: collision with root package name */
    private final List<a> f33119a = new CopyOnWriteArrayList();

    /* loaded from: classes.dex */
    public interface a {
        void onPatchFailure(String str, boolean z);

        void onPatchSuccess(String str, boolean z);
    }

    public void registerCPPInlinePatchListener(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ab51783", new Object[]{this, aVar});
        } else {
            this.f33119a.add(aVar);
        }
    }

    private rfn() {
    }

    public static rfn sharedInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rfn) ipChange.ipc$dispatch("4cd5b64b", new Object[0]);
        }
        if (b == null) {
            synchronized (rfn.class) {
                if (b == null) {
                    b = new rfn();
                }
            }
        }
        return b;
    }

    static {
        kge.a(-112314498);
        AppMonitor.register("update_cppinlinepatch", "cppinlinepatch", MeasureSet.create(), DimensionSet.create().addDimension("toVersion").addDimension("stage").addDimension("cost").addDimension("success").addDimension("error_code").addDimension(MUSAppMonitor.ERROR_MSG));
    }

    private static void a(boolean z, String str, long j, int i, String str2, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("240446a5", new Object[]{new Boolean(z), str, new Long(j), new Integer(i), str2, new Long(j2)});
        } else {
            AppMonitor.Stat.commit("update_cppinlinepatch", "cppinlinepatch", DimensionValueSet.create().setValue("toVersion", String.valueOf(j2)).setValue("stage", str).setValue("cost", String.valueOf(j)).setValue("success", z ? "true" : "false").setValue("error_code", String.valueOf(i)).setValue(MUSAppMonitor.ERROR_MSG, str2), MeasureValueSet.create());
        }
    }

    public static void onPatchStageFailure(String str, long j, int i, String str2, long j2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b89a005f", new Object[]{str, new Long(j), new Integer(i), str2, new Long(j2), new Boolean(z)});
        } else {
            a(false, str, j, i, str2, j2);
        }
    }

    public static void onPatchStageSuccess(String str, long j, int i, String str2, long j2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d931fd58", new Object[]{str, new Long(j), new Integer(i), str2, new Long(j2), new Boolean(z)});
        } else {
            a(true, str, j, i, str2, j2);
        }
    }

    public static void onPatchSuccess(long j, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a74ef9f1", new Object[]{new Long(j), new Boolean(z)});
            return;
        }
        List<a> list = sharedInstance().f33119a;
        if (list == null) {
            return;
        }
        for (a aVar : list) {
            aVar.onPatchSuccess(String.valueOf(j), z);
        }
    }
}
