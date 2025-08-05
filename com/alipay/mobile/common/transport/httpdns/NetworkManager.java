package com.alipay.mobile.common.transport.httpdns;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.NetworkInfo;
import android.text.TextUtils;
import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.alipay.mobile.common.transport.utils.MiscUtils;
import com.alipay.mobile.common.transport.utils.NetworkAsyncTaskExecutor;
import com.alipay.mobile.common.transport.utils.NetworkUtils;
import com.alipay.mobile.common.transport.utils.SharedPreUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.TimeUnit;
import tb.riy;

/* loaded from: classes3.dex */
public class NetworkManager {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "HDNS_NetManager";
    public static final long changeInterval = 3600000;
    public static final long maxTimesLimit = 12;

    /* renamed from: a  reason: collision with root package name */
    private Context f5586a;
    private BroadcastReceiver b;
    private byte c;
    public long changeBegin;
    public int changeCount;
    private String d;
    private String e;
    public Boolean lastConnected;
    public int netSubType;
    public int netType;
    public boolean neverReceive;

    /* loaded from: classes3.dex */
    public static class Singleton {
        public static NetworkManager instance = new NetworkManager();

        private Singleton() {
        }
    }

    public static /* synthetic */ void access$200(NetworkManager networkManager, Context context, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("62b7ef73", new Object[]{networkManager, context, new Boolean(z)});
        }
    }

    public static /* synthetic */ boolean access$100(NetworkManager networkManager, Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3d04aac4", new Object[]{networkManager, context})).booleanValue() : networkManager.a(context);
    }

    public static NetworkManager getInstance() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (NetworkManager) ipChange.ipc$dispatch("67335042", new Object[0]) : Singleton.instance;
    }

    private NetworkManager() {
        this.changeBegin = -1L;
        this.changeCount = -1;
        this.f5586a = null;
        this.b = null;
        this.lastConnected = null;
        this.neverReceive = true;
        this.netType = -1;
        this.netSubType = -1;
        this.c = (byte) -1;
        this.d = "";
        this.e = "";
    }

    public synchronized void setNetworkContext(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7fb2b5e", new Object[]{this, context});
        } else if (!b(context)) {
        } else {
            this.f5586a = context;
            c();
            this.b = new BroadcastReceiver() { // from class: com.alipay.mobile.common.transport.httpdns.NetworkManager.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.content.BroadcastReceiver
                public void onReceive(final Context context2, Intent intent) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("3c04d85a", new Object[]{this, context2, intent});
                    } else if (intent == null || !TextUtils.equals(intent.getAction(), "android.net.conn.CONNECTIVITY_CHANGE")) {
                    } else {
                        LogCatUtil.info(NetworkManager.TAG, "onReceive at: " + getClass().getName() + ", Intent: " + intent);
                        try {
                            NetworkAsyncTaskExecutor.executeIO(new Runnable() { // from class: com.alipay.mobile.common.transport.httpdns.NetworkManager.1.1
                                public static volatile transient /* synthetic */ IpChange $ipChange;

                                @Override // java.lang.Runnable
                                public void run() {
                                    IpChange ipChange3 = $ipChange;
                                    if (ipChange3 instanceof IpChange) {
                                        ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                    } else {
                                        if (NetworkManager.access$100(NetworkManager.this, context2)) {
                                        }
                                    }
                                }
                            });
                        } catch (Throwable th) {
                            LogCatUtil.error(NetworkManager.TAG, "setNetworkContext exception= " + th.toString());
                        }
                    }
                }
            };
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            context.registerReceiver(this.b, intentFilter);
        }
    }

    private boolean a(final Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9e1d6464", new Object[]{this, context})).booleanValue();
        }
        if (c(context) == 1) {
            HttpDns.getInstance().getGetAllByNameHelper().clearCache();
            LogCatUtil.debug(TAG, "NetworkManager#onReceive 网络变化");
            if (this.neverReceive) {
                LogCatUtil.debug(TAG, "NetworkManager#onReceive first receive,ignore");
                this.neverReceive = false;
                NetworkAsyncTaskExecutor.schedule(new Runnable() { // from class: com.alipay.mobile.common.transport.httpdns.NetworkManager.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            NetworkManager.access$200(NetworkManager.this, context, true);
                        }
                    }
                }, 10L, TimeUnit.SECONDS);
                return true;
            }
            NetworkAsyncTaskExecutor.executeIO(new Runnable() { // from class: com.alipay.mobile.common.transport.httpdns.NetworkManager.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    NetworkManager networkManager = NetworkManager.this;
                    NetworkManager.access$200(networkManager, context, networkManager.neverReceive);
                }
            });
            if (!a()) {
                return true;
            }
            LogCatUtil.info(TAG, "网络切换，发送强请求");
            HttpDns.getInstance().delayRequestStrong(1);
        }
        return false;
    }

    private boolean b(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9eca1003", new Object[]{this, context})).booleanValue() : context != null && this.f5586a == null && AlipayHttpDnsClient.getDnsClient().getFlag() == 0;
    }

    private boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        if (MiscUtils.isAtFrontDesk(this.f5586a)) {
            return b();
        }
        LogCatUtil.warn(TAG, "wallet isn't at front desk,httpdns ignore netchange");
        return false;
    }

    private boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
        }
        this.changeCount = d();
        int i = this.changeCount + 1;
        this.changeCount = i;
        a(i);
        if (this.changeCount > 12) {
            this.changeBegin = f();
            if (this.changeBegin + 3600000 < System.currentTimeMillis()) {
                a(1);
                e();
                LogCatUtil.info(TAG, "interval more than one hour,set changeCount 1");
            } else {
                LogCatUtil.info(TAG, "netchange exceeds 12 ,ignore it");
                return false;
            }
        }
        this.changeCount = d();
        LogCatUtil.info(TAG, "httpdns network change,changeCount= " + this.changeCount);
        return true;
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        this.changeBegin = f();
        if (this.changeBegin == -1) {
            e();
        }
        this.changeCount = d();
        if (this.changeCount != -1) {
            return;
        }
        a(0);
    }

    public void close() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e32ba67f", new Object[]{this});
        } else if (this.f5586a == null) {
        } else {
            LogCatUtil.info(TAG, "httpdns manager close");
            try {
                this.f5586a.unregisterReceiver(this.b);
            } catch (IllegalArgumentException e) {
                LogCatUtil.warn(TAG, "httpdns exception: " + e.toString());
            }
            this.b = null;
        }
    }

    private int c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9f76bb91", new Object[]{this, context})).intValue();
        }
        NetworkInfo activeNetworkInfo = NetworkUtils.getActiveNetworkInfo(context);
        if (activeNetworkInfo == null) {
            LogCatUtil.info(TAG, "当前无网络!");
            this.lastConnected = false;
            return 0;
        }
        boolean isAvailable = activeNetworkInfo.isAvailable();
        boolean isConnected = activeNetworkInfo.isConnected();
        int type = activeNetworkInfo.getType();
        int subtype = activeNetworkInfo.getSubtype();
        String extraInfo = activeNetworkInfo.getExtraInfo();
        if (!a(isConnected, type, subtype)) {
            return 2;
        }
        this.lastConnected = Boolean.valueOf(isConnected);
        this.netType = type;
        this.netSubType = subtype;
        LogCatUtil.info(TAG, " type=[" + type + "] subType=[" + subtype + "]  available=[" + isAvailable + "] connected=[" + isConnected + "] detailedState=[" + activeNetworkInfo.getDetailedState() + "] extraInfo=[" + extraInfo + riy.ARRAY_END_STR);
        StringBuilder sb = new StringBuilder();
        sb.append(" activeNetworkInfo hashcode=");
        sb.append(activeNetworkInfo.hashCode());
        sb.append("  activeNetworkInfo = [");
        sb.append(activeNetworkInfo.toString());
        sb.append("]\n");
        LogCatUtil.info(TAG, sb.toString());
        return !this.lastConnected.booleanValue() ? 0 : 1;
    }

    private boolean a(boolean z, int i, int i2) {
        Boolean bool;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("270908d0", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2)})).booleanValue();
        }
        if (this.netType == -1 || this.netSubType == -1 || (bool = this.lastConnected) == null) {
            LogCatUtil.info(TAG, " New contivity broadcast！");
        } else if (bool.booleanValue() == z && this.netType == i && this.netSubType == i2) {
            LogCatUtil.info(TAG, " Old contivity broadcast！");
            return false;
        }
        return true;
    }

    private void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else {
            SharedPreUtils.putData(this.f5586a, "http_dns_netchangecount", i);
        }
    }

    private int d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("596b2de", new Object[]{this})).intValue() : SharedPreUtils.getIntData(this.f5586a, "http_dns_netchangecount");
    }

    private void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
        } else {
            SharedPreUtils.putData(this.f5586a, "dns_netchange_begin", System.currentTimeMillis());
        }
    }

    private long f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5b2e1e1", new Object[]{this})).longValue() : SharedPreUtils.getLonggData(this.f5586a, "dns_netchange_begin");
    }
}
