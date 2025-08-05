package tb;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Handler;
import android.os.Message;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.media.MediaConstant;
import com.taobao.orange.OrangeConfig;
import com.taobao.taobaoavsdk.util.b;
import java.util.Random;

/* loaded from: classes8.dex */
public class ozf implements ComponentCallbacks2, Handler.Callback {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static ozf c;
    private int b;
    private boolean e;
    private Handler f;
    private int g;

    /* renamed from: a  reason: collision with root package name */
    private final int f32507a = 100;
    private volatile boolean d = false;
    private int h = 2;

    static {
        kge.a(478754953);
        kge.a(-418195541);
        kge.a(-1043440182);
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb2f300c", new Object[]{this, configuration});
        }
    }

    public static synchronized ozf a() {
        synchronized (ozf.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ozf) ipChange.ipc$dispatch("f08f0a3", new Object[0]);
            }
            if (c == null) {
                c = new ozf();
            }
            return c;
        }
    }

    private ozf() {
        this.b = 120000;
        this.e = false;
        this.g = 2;
        this.e = b.a(OrangeConfig.getInstance().getConfig("DWInteractive", MediaConstant.ORANGE_ENABLE_MEMORY_MANAGER, "true"));
        if (this.e) {
            if (new Random().nextInt() % 10000 > b.b(OrangeConfig.getInstance().getConfig("DWInteractive", MediaConstant.ORANGE_ENABLE_MEMORY_MANAGER_PERCENT, "500"))) {
                this.e = false;
                return;
            }
            this.f = new Handler(this);
            this.b = b.b(OrangeConfig.getInstance().getConfig("DWInteractive", MediaConstant.ORANGE_ENABLE_MEMORY_MANAGER_RESTORE_PLAYER_NUM_TIME, "120000"));
            this.g = b.b(OrangeConfig.getInstance().getConfig("DWInteractive", MediaConstant.ORANGE_ENABLE_MEMORY_MANAGER_TRIM_NUM, "2"));
        }
    }

    public void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{this, context});
        } else if (!this.e || this.d) {
        } else {
            this.d = true;
            try {
                context.getApplicationContext().registerComponentCallbacks(this);
            } catch (Throwable unused) {
            }
        }
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c69db59a", new Object[]{this, new Integer(i)});
        } else if (i != 40 && i != 80 && i != 15) {
        } else {
            b();
        }
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4bbd23dd", new Object[]{this});
        } else {
            b();
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (!this.e) {
        } else {
            if (this.f.hasMessages(100)) {
                this.f.removeMessages(100);
                this.f.sendEmptyMessageDelayed(100, this.b);
                return;
            }
            int a2 = ozm.h().a();
            if (a2 <= 2) {
                return;
            }
            ozm.h().a(a2 - this.g);
            this.f.sendEmptyMessageDelayed(100, this.b);
        }
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("282a8c1d", new Object[]{this, message})).booleanValue();
        }
        if (message.what == 100) {
            ozm.h().a(ozm.h().g());
        }
        return false;
    }
}
