package com.taobao.android.diagnose.collector;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.support.v4.app.ActivityCompat;
import android.telephony.TelephonyManager;
import com.alipay.mobile.common.transport.monitor.RPCDataItems;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.diagnose.collector.NetworkObserver;
import com.taobao.android.diagnose.model.NetInfo;
import com.taobao.android.diagnose.v;
import com.taobao.tao.log.logger.EventLogger;
import tb.kge;

/* loaded from: classes.dex */
public class NetworkObserver {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-434627964);
    }

    /* loaded from: classes5.dex */
    public static class NetworkStatusListener extends BroadcastReceiver {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(74568276);
        }

        /* renamed from: lambda$-hVOZ80OebDzzPBnmaFX-nbdpNo */
        public static /* synthetic */ void m904lambda$hVOZ80OebDzzPBnmaFXnbdpNo(Context context) {
            a(context);
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(final Context context, Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
            } else {
                com.taobao.android.diagnose.common.c.a().a(new Runnable() { // from class: com.taobao.android.diagnose.collector.-$$Lambda$NetworkObserver$NetworkStatusListener$-hVOZ80OebDzzPBnmaFX-nbdpNo
                    @Override // java.lang.Runnable
                    public final void run() {
                        NetworkObserver.NetworkStatusListener.m904lambda$hVOZ80OebDzzPBnmaFXnbdpNo(context);
                    }
                });
            }
        }

        public static /* synthetic */ void a(Context context) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9e1d6460", new Object[]{context});
            } else {
                NetworkObserver.a(com.taobao.android.diagnose.common.e.a(context));
            }
        }
    }

    /* loaded from: classes.dex */
    public static class a extends ConnectivityManager.NetworkCallback {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a */
        public Application f11687a;
        public ConnectivityManager b;
        public TelephonyManager c;

        static {
            kge.a(-1443811867);
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            int hashCode = str.hashCode();
            if (hashCode == 838841652) {
                super.onAvailable((Network) objArr[0]);
                return null;
            } else if (hashCode != 2071672155) {
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            } else {
                super.onLost((Network) objArr[0]);
                return null;
            }
        }

        public static /* synthetic */ void lambda$vtuIT0cfbA3DI3yvGaPA0C_9_bM(a aVar, Network network) {
            aVar.b(network);
        }

        public a(Application application) {
            this.f11687a = application;
            this.c = (TelephonyManager) application.getSystemService("phone");
            this.b = (ConnectivityManager) application.getSystemService("connectivity");
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onAvailable(final Network network) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("31ffb534", new Object[]{this, network});
                return;
            }
            super.onAvailable(network);
            com.taobao.android.diagnose.common.c.a().a(new Runnable() { // from class: com.taobao.android.diagnose.collector.-$$Lambda$NetworkObserver$a$vtuIT0cfbA3DI3yvGaPA0C_9_bM
                {
                    NetworkObserver.a.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    NetworkObserver.a.lambda$vtuIT0cfbA3DI3yvGaPA0C_9_bM(NetworkObserver.a.this, network);
                }
            });
        }

        public /* synthetic */ void b(Network network) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("914e3b7c", new Object[]{this, network});
            } else {
                NetworkObserver.a(2, a(network), this.c.getSimOperator());
            }
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(Network network) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7b7b355b", new Object[]{this, network});
                return;
            }
            super.onLost(network);
            com.taobao.android.diagnose.common.c.a().a($$Lambda$NetworkObserver$a$8kpW8P9pEYL_k0Dk7FHPLBT8wLA.INSTANCE);
        }

        public static /* synthetic */ void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("57a83e9", new Object[0]);
            } else {
                NetworkObserver.a(3, 0, "");
            }
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onUnavailable() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("390e04f8", new Object[]{this});
                return;
            }
            super.onUnavailable();
            com.taobao.android.diagnose.common.c.a().a($$Lambda$NetworkObserver$a$iZRPdkT6kJcyffhrakrOaF82csk.INSTANCE);
        }

        public static /* synthetic */ void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[0]);
            } else {
                NetworkObserver.a(4, 0, "");
            }
        }

        private int a(Network network) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("8f74e850", new Object[]{this, network})).intValue();
            }
            try {
                NetworkCapabilities networkCapabilities = this.b.getNetworkCapabilities(network);
                if (networkCapabilities != null && networkCapabilities.hasCapability(12)) {
                    if (!networkCapabilities.hasTransport(1) && !networkCapabilities.hasTransport(5)) {
                        if (!networkCapabilities.hasTransport(0)) {
                            return networkCapabilities.hasTransport(3) ? 8 : 9;
                        } else if (ActivityCompat.checkSelfPermission(this.f11687a, "android.permission.READ_PHONE_STATE") == 0) {
                            return com.taobao.android.diagnose.common.e.a(this.c.getDataNetworkType());
                        } else {
                            return 1;
                        }
                    }
                    return 7;
                }
            } catch (Exception e) {
                v.a("NetworkStatusCallback", "getNetType", e);
            }
            return 0;
        }
    }

    public static void a(int i, int i2, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d025a92", new Object[]{new Integer(i), new Integer(i2), str});
            return;
        }
        try {
            com.taobao.android.diagnose.c.a().d().a(new NetInfo(i, i2, str));
            EventLogger.builder(4).setPageID(com.taobao.android.diagnose.c.a().d().c()).setData("status", String.valueOf(i)).setData("type", String.valueOf(i2)).setData("operate", str).log(com.taobao.android.diagnose.common.c.a().b());
            v.a(RPCDataItems.SWITCH_TAG_LOG, String.format("Network status changed: Status: %d, Type:%d", Integer.valueOf(i), Integer.valueOf(i2)));
        } catch (Exception e) {
            v.a("NetworkStatusCallback", "updateNetStatus", e);
        }
    }

    public static void a(NetInfo netInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88cdb2d2", new Object[]{netInfo});
        } else {
            a(netInfo.getStatus(), netInfo.getType(), netInfo.getOperator());
        }
    }
}
