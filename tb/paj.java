package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.media.MediaConstant;
import com.taobao.tao.log.TLog;

/* loaded from: classes8.dex */
public class paj implements pnj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1002857501);
        kge.a(-1708230038);
    }

    @Override // tb.pnj
    public void a(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bb6538e", new Object[]{this, str, obj});
        } else {
            TLog.loge(MediaConstant.LBLIVE_SOURCE, str, String.valueOf(obj));
        }
    }

    @Override // tb.pnj
    public void b(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18567e8f", new Object[]{this, str, obj});
        } else {
            TLog.logi(MediaConstant.LBLIVE_SOURCE, str, String.valueOf(obj));
        }
    }

    @Override // tb.pnj
    public void c(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4f6a990", new Object[]{this, str, obj});
        } else {
            TLog.logd(MediaConstant.LBLIVE_SOURCE, str, String.valueOf(obj));
        }
    }

    @Override // tb.pnj
    public void d(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3196d491", new Object[]{this, str, obj});
        } else {
            TLog.logw(MediaConstant.LBLIVE_SOURCE, str, String.valueOf(obj));
        }
    }

    @Override // tb.pnj
    public void e(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be36ff92", new Object[]{this, str, obj});
        } else {
            TLog.logv(MediaConstant.LBLIVE_SOURCE, str, String.valueOf(obj));
        }
    }

    @Override // tb.pnj
    public void a(String str, Object obj, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10310527", new Object[]{this, str, obj, th});
            return;
        }
        TLog.loge(MediaConstant.LBLIVE_SOURCE + str, String.valueOf(obj), th);
    }
}
