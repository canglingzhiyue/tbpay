package tb;

import android.content.SharedPreferences;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.launcher.common.LauncherRuntime;
import com.taobao.tao.log.TLog;
import java.util.Locale;
import mtopsdk.common.util.SymbolExpUtil;

/* loaded from: classes.dex */
public class gvq implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final int f28521a;
    private final long b;
    private final String c;
    private final String d;

    public gvq(String str, String str2, int i, long j) {
        this.d = str;
        this.c = str2;
        this.f28521a = i;
        this.b = j;
    }

    @Override // java.lang.Runnable
    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
            return;
        }
        SharedPreferences sharedPreferences = LauncherRuntime.h.getSharedPreferences(this.c, 0);
        String string = sharedPreferences.getString(this.d, null);
        if (StringUtils.isEmpty(string)) {
            return;
        }
        if (string.split(SymbolExpUtil.SYMBOL_VERTICALBAR).length < 3) {
            TLog.loge(gve.MODULE, "StageEndTask", "it seems that no stage was started before, please check");
            return;
        }
        String format = String.format(Locale.US, "%d:%d>", Integer.valueOf(this.f28521a), Long.valueOf(this.b));
        sharedPreferences.edit().putString(this.d, string + format).commit();
    }
}
