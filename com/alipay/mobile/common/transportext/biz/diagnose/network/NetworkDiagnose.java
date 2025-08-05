package com.alipay.mobile.common.transportext.biz.diagnose.network;

import com.alipay.mobile.common.amnet.api.AmnetNetworkDiagnoseListener;
import com.alipay.mobile.common.netsdkextdependapi.deviceinfo.DeviceInfoUtil;
import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.alipay.mobile.common.transportext.amnet.Storage;
import com.alipay.mobile.common.transportext.biz.diagnose.network.Configuration;
import com.alipay.mobile.common.transportext.biz.diagnose.network.Traceroute;
import com.alipay.mobile.common.transportext.biz.shared.ExtTransportStrategy;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class NetworkDiagnose {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "DIAGNOSE-NETWORKDIAGNOSE";
    private static NetworkDiagnose h;

    /* renamed from: a  reason: collision with root package name */
    private Storage f5667a = null;
    private AmnetNetworkDiagnoseListener b = null;
    private Configuration.DetectInf[] c = null;
    private Traceroute.PingInf[] d = null;
    private int e = 0;
    private long f = 0;
    private boolean g = false;

    public static final NetworkDiagnose instance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (NetworkDiagnose) ipChange.ipc$dispatch("19cefa8a", new Object[0]);
        }
        if (h == null) {
            h = new NetworkDiagnose();
        }
        return h;
    }

    public void register(Storage storage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e903683", new Object[]{this, storage});
        } else {
            this.f5667a = storage;
        }
    }

    public void register(AmnetNetworkDiagnoseListener amnetNetworkDiagnoseListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74afe47", new Object[]{this, amnetNetworkDiagnoseListener});
        } else {
            this.b = amnetNetworkDiagnoseListener;
        }
    }

    public void register(long j, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9feebbe9", new Object[]{this, new Long(j), new Integer(i)});
            return;
        }
        this.f = j;
        this.e = i;
    }

    public void launch() {
        NetworkDiagnoseManager networkDiagnoseManager;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("207f96ba", new Object[]{this});
            return;
        }
        LogCatUtil.info(TAG, "[launch]begin.");
        try {
            a();
            if (this.c == null || this.c[0] == null) {
                LogCatUtil.info(TAG, "[launch]the configuration is null, now get default address.");
                this.c = new Configuration.DetectInf[1];
                this.c[0] = new Configuration.DetectInf();
                this.c[0].domain = "www.taobao.com";
                this.c[0].protocol = 0;
                this.c[0].request = "HEAD / HTTP/1.1\r\nHost: www.taobao.com\r\nContent-Length: 0\r\n\r\n";
                this.c[0].response = "HTTP/1.1 200 ";
                this.c[0].waiting = 30;
                this.c[0].trying = 1;
                this.d = new Traceroute.PingInf[1];
                this.d[0] = new Traceroute.PingInf();
                this.d[0].domain = "www.taobao.com";
                this.d[0].type = 3;
                this.d[0].threshold = 6000;
                this.d[0].waiting = 5;
                if (1 == this.e) {
                    this.d[0].timeoutNum = 8;
                }
            }
            if (2 == this.e) {
                this.g = ExtTransportStrategy.isEnableDiagnoseBySystem(DeviceInfoUtil.getDeviceId());
            } else if (1 == this.e) {
                this.g = ExtTransportStrategy.isEnableDiagnoseByUser(DeviceInfoUtil.getDeviceId());
            }
            LogCatUtil.info(TAG, "flag=" + this.e + ", tracerouteAllow=" + this.g);
            if (this.g) {
                networkDiagnoseManager = new NetworkDiagnoseManager(this.c, this.d);
            } else {
                networkDiagnoseManager = new NetworkDiagnoseManager(this.c, null);
            }
            networkDiagnoseManager.register(this.b);
            networkDiagnoseManager.register(this.e, this.f);
            networkDiagnoseManager.start();
        } catch (Throwable th) {
            LogCatUtil.warn(TAG, "[launch]" + th.toString());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0193 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x018f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void a() {
        /*
            Method dump skipped, instructions count: 516
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.mobile.common.transportext.biz.diagnose.network.NetworkDiagnose.a():void");
    }
}
