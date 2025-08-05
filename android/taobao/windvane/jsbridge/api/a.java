package android.taobao.windvane.jsbridge.api;

import android.media.AudioRecord;
import android.os.Handler;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.support.api.entity.core.JosStatusCodes;
import java.util.Timer;
import java.util.TimerTask;
import tb.kge;

/* loaded from: classes2.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int BLOW_HANDLER_BLOWING = 4101;
    public static final int BLOW_HANDLER_FAIL = 4102;

    /* renamed from: a  reason: collision with root package name */
    private Handler f1659a;
    private Timer b;
    private AudioRecord c;
    private int d;
    private byte[] g;
    private int e = JosStatusCodes.RTN_CODE_COMMON_ERROR;
    private int f = 1;
    private long h = 1;
    private int i = 3000;

    static {
        kge.a(-262831462);
    }

    public static /* synthetic */ void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7dc05f04", new Object[]{aVar});
        } else {
            aVar.c();
        }
    }

    public a(Handler handler) {
        this.d = 100;
        this.f1659a = handler;
        this.d = AudioRecord.getMinBufferSize(this.e, 16, 2);
        this.c = new AudioRecord(1, this.e, 16, 2, this.d);
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        try {
            this.f++;
            Thread.sleep(8L);
            long currentTimeMillis = System.currentTimeMillis();
            int read = this.c.read(this.g, 0, this.d) + 1;
            int i = 0;
            for (int i2 = 0; i2 < this.g.length; i2++) {
                i += this.g[i2] * this.g[i2];
            }
            int i3 = i / read;
            this.h += System.currentTimeMillis() - currentTimeMillis;
            if ((this.h < 500 && this.f <= 5) || i3 <= this.i) {
                return;
            }
            this.f1659a.sendEmptyMessage(4101);
            this.f = 1;
            this.h = 1L;
        } catch (Exception unused) {
            this.f1659a.sendEmptyMessage(4102);
            b();
        }
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        try {
            this.c.startRecording();
            this.g = new byte[this.d];
            this.b = new Timer("WVBlowTimer");
            this.b.scheduleAtFixedRate(new TimerTask() { // from class: android.taobao.windvane.jsbridge.api.a.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.util.TimerTask, java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        a.a(a.this);
                    }
                }
            }, 0L, 100L);
        } catch (Exception unused) {
            b();
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        try {
            if (this.c != null) {
                this.c.stop();
                this.c.release();
                this.d = 100;
            }
        } catch (Exception unused) {
        }
        Timer timer = this.b;
        if (timer == null) {
            return;
        }
        timer.cancel();
    }
}
