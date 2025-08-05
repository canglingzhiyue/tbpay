package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;

/* loaded from: classes.dex */
public class fmh {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG_MODULE = "AliNewDetailExtend";
    private static fmj e;

    /* renamed from: a  reason: collision with root package name */
    private fmo f28061a = new fmo();
    private fmp b = new fmp();
    private fmn c = new fmn();
    private fmq d = new fmq();
    private final String f;

    public fmh(String str) {
        this.f = str.concat(String.valueOf(hashCode()));
        d();
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : this.b.a();
    }

    public void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{this, context});
        } else {
            this.b.a(context);
        }
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.c.a(z);
        }
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        fmj fmjVar = e;
        if (fmjVar == null) {
            TLog.loge("AliNewDetailExtend", "NewDetailController", "initNewDetailExtendHelper sNewDetailExtendHandler is null!");
        } else {
            fmjVar.a(this);
        }
    }

    public void a(fml fmlVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8d55833", new Object[]{this, fmlVar});
            return;
        }
        fmp fmpVar = this.b;
        if (fmpVar == null) {
            TLog.loge("AliNewDetailExtend", "NewDetailController", "registerPreloadWeexHandler mPreLoadWeexManager is null!");
        } else {
            fmpVar.a(fmlVar);
        }
    }

    public void a(fmk fmkVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8d4e3d4", new Object[]{this, fmkVar});
            return;
        }
        fmo fmoVar = this.f28061a;
        if (fmoVar == null) {
            TLog.loge("AliNewDetailExtend", "NewDetailController", "registerPreloadMtopHandler mPreLoadMtopManager is null!");
        } else {
            fmoVar.a(fmkVar);
        }
    }

    public void a(fmm fmmVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8d5cc92", new Object[]{this, fmmVar});
            return;
        }
        fmq fmqVar = this.d;
        if (fmqVar == null) {
            TLog.loge("AliNewDetailExtend", "NewDetailController", "registerScreenValueHandler mScreenValueManager is null!");
        } else {
            fmqVar.a(fmmVar);
        }
    }

    public static void a(fmj fmjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8d46f75", new Object[]{fmjVar});
        } else {
            e = fmjVar;
        }
    }

    public String c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bd025a76", new Object[]{this}) : this.f;
    }
}
