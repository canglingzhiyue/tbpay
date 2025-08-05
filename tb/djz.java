package tb;

import android.content.Context;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ab.api.c;
import java.io.File;
import java.io.FilenameFilter;
import java.util.Map;

/* loaded from: classes.dex */
public class djz implements dkf {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final boolean f26799a = new File("/data/local/tmp", ".dag_top_level_switcher").exists();

    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : "Local";
    }

    @Override // tb.dkf
    public void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{this, context});
        }
    }

    @Override // tb.dkf
    public void a(Context context, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8df32b25", new Object[]{this, context, map});
        }
    }

    @Override // tb.dkf
    public Boolean a(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("3961d127", new Object[]{this, context, str});
        }
        if (!f26799a) {
            return null;
        }
        File file = new File("/data/local/tmp", ".age");
        File file2 = new File(file, "." + str);
        File file3 = new File(file, "." + str + ".off");
        File file4 = new File(file, ".all");
        File file5 = new File(file, ".all.off");
        if (file4.exists() || file2.exists()) {
            return true;
        }
        return (file5.exists() || file3.exists()) ? false : null;
    }

    @Override // tb.dkf
    public void a(Context context, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d51141ea", new Object[]{this, context, str, new Boolean(z)});
        } else {
            Log.e("LocalSwitchesImpl", "unimplemented for local switches", new UnsupportedOperationException());
        }
    }

    @Override // tb.dkf
    public c b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("be53a6fd", new Object[]{this, context});
        }
        File file = new File("/data/local/tmp", ".age");
        if (file.isDirectory() && file.exists()) {
            String[] list = file.list(new FilenameFilter() { // from class: tb.djz.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.io.FilenameFilter
                public boolean accept(File file2, String str) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("6696dd14", new Object[]{this, file2, str})).booleanValue() : str.startsWith(".");
                }
            });
            dkk a2 = dko.a(a(), -1L, -1L, -1L, -1L);
            for (String str : list) {
                a2.a(dko.a(str.substring(1), Boolean.TRUE.toString(), a()));
            }
            return a2;
        }
        return dkl.EMPTY;
    }

    @Override // tb.dkf
    public Map<String, dkl> c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("8ab12153", new Object[]{this, context});
        }
        throw new UnsupportedOperationException("unsupported operation");
    }
}
