package com.taobao.android.fluid.framework.mute.helper;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.os.AsyncTask;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;
import tb.spz;

/* loaded from: classes5.dex */
public class i {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a */
    private static int f12609a;
    private BroadcastReceiver b;
    private a c;
    private Context d;

    /* loaded from: classes5.dex */
    public interface a {
        void a(int i, int i2);
    }

    public static /* synthetic */ int a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a821938e", new Object[]{new Integer(i)})).intValue();
        }
        f12609a = i;
        return i;
    }

    public static /* synthetic */ a a(i iVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("8fabb6d1", new Object[]{iVar}) : iVar.c;
    }

    public static /* synthetic */ int b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("57a83dc", new Object[0])).intValue() : f12609a;
    }

    public static /* synthetic */ Context b(i iVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("a6af587b", new Object[]{iVar}) : iVar.d;
    }

    static {
        kge.a(-1542852148);
        f12609a = -1;
    }

    public i(Context context) {
        if (context != null) {
            this.d = context;
        }
    }

    public void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e827ece5", new Object[]{this, aVar});
        } else if (aVar == null || this.d == null) {
        } else {
            this.c = aVar;
            this.b = new BroadcastReceiver() { // from class: com.taobao.android.fluid.framework.mute.helper.VolumeChangeHelper$1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.content.BroadcastReceiver
                public void onReceive(Context context, Intent intent) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                    } else if (intent.getIntExtra("android.media.EXTRA_VOLUME_STREAM_TYPE", -1) != 3) {
                    } else {
                        int intExtra = intent.getIntExtra("android.media.EXTRA_VOLUME_STREAM_VALUE", -1);
                        if (intExtra != i.b()) {
                            i.a(i.this).a(i.b(), intExtra);
                        }
                        i.a(intExtra);
                    }
                }
            };
            if (this.b != null) {
                try {
                    IntentFilter intentFilter = new IntentFilter();
                    intentFilter.addAction("android.media.VOLUME_CHANGED_ACTION");
                    this.d.registerReceiver(this.b, intentFilter);
                } catch (Throwable th) {
                    spz.a("VolumeChangeHelper", "", th);
                }
            }
            AsyncTask.THREAD_POOL_EXECUTOR.execute(new Runnable() { // from class: com.taobao.android.fluid.framework.mute.helper.i.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                {
                    i.this = this;
                }

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        i.a(((AudioManager) i.b(i.this).getSystemService("audio")).getStreamVolume(3));
                    }
                }
            });
        }
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        BroadcastReceiver broadcastReceiver = this.b;
        if (broadcastReceiver == null) {
            return;
        }
        try {
            this.d.unregisterReceiver(broadcastReceiver);
            this.b = null;
        } catch (Throwable th) {
            spz.a("VolumeChangeHelper", "", th);
        }
    }
}
