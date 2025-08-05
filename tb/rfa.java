package tb;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.update.dialog.b;
import com.taobao.update.framework.UpdateRuntime;
import com.taobao.update.framework.a;

/* loaded from: classes9.dex */
public class rfa implements res {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private b f33099a;
    private ret b = (ret) a.getInstance(ret.class);

    static {
        kge.a(-1488184327);
        kge.a(2100940464);
    }

    @Override // tb.res
    public void notifyDownloadError(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("edfd84e8", new Object[]{this, str});
            return;
        }
        b bVar = this.f33099a;
        if (bVar != null) {
            bVar.dismiss();
        }
        a();
        ret retVar = this.b;
        if (retVar == null) {
            Toast.makeText(UpdateRuntime.getContext(), str, 0).show();
        } else {
            retVar.toast(str);
        }
    }

    @Override // tb.res
    public void notifyDownloadFinish(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("909a6275", new Object[]{this, str});
            return;
        }
        try {
            if (this.f33099a != null) {
                this.f33099a.dismiss();
            }
        } catch (Throwable unused) {
        }
        a();
    }

    @Override // tb.res
    public void notifyDownloadProgress(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2646e5de", new Object[]{this, new Integer(i)});
            return;
        }
        try {
            if (this.f33099a == null) {
                Activity peekTopActivity = ren.getInstance().peekTopActivity();
                if (peekTopActivity != null && !peekTopActivity.isFinishing()) {
                    LayoutInflater from = LayoutInflater.from(peekTopActivity);
                    this.f33099a = new b(peekTopActivity, "正在更新", "", false);
                    this.f33099a.setContentView(from.inflate(R.layout.update_coerce, (ViewGroup) null));
                    this.f33099a.show();
                }
                return;
            }
            ((ProgressBar) this.f33099a.getContentView().findViewById(R.id.pb1)).setProgress(i);
            ((TextView) this.f33099a.getContentView().findViewById(R.id.tvUpdatePercent)).setText(i + riy.MOD);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            this.f33099a = null;
        }
    }
}
