package com.taobao.phenix.compat.mtop;

import android.os.RemoteException;
import android.text.TextUtils;
import anet.channel.util.ErrorConstant;
import anet.channel.util.HttpConstant;
import anetwork.channel.NetworkCallBack;
import anetwork.channel.NetworkEvent;
import anetwork.channel.aidl.ParcelableInputStream;
import anetwork.channel.statist.StatisticData;
import com.alipay.mobile.common.logging.strategy.LogStrategyManager;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.phenix.loader.network.HttpCodeResponseException;
import com.taobao.phenix.loader.network.IncompleteResponseException;
import com.taobao.phenix.loader.network.NetworkResponseException;
import com.taobao.phenix.loader.network.b;
import java.util.List;
import java.util.Map;
import tb.niw;
import tb.njf;

/* loaded from: classes7.dex */
public class e implements NetworkCallBack.FinishListener, NetworkCallBack.InputStreamListener, NetworkCallBack.ResponseCodeListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final b.a f18911a;
    private final Map<String, String> b;
    private boolean c;

    public e(b.a aVar, Map<String, String> map) {
        this.f18911a = aVar;
        this.b = map;
    }

    private NetworkResponseException a(NetworkEvent.FinishEvent finishEvent) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return (NetworkResponseException) ipChange.ipc$dispatch("d323259c", new Object[]{this, finishEvent});
        }
        if (finishEvent != null) {
            i = finishEvent.getHttpCode();
        }
        if (i == -205) {
            return new MtopBgForbiddenException(i);
        }
        if (i != -204) {
            if (i != -202) {
                if (i == -102) {
                    return new MtopInvalidUrlException(i);
                }
                if (i == 200) {
                    return new IncompleteResponseException();
                }
                switch (i) {
                    case ErrorConstant.ERROR_CONNECT_EXCEPTION /* -406 */:
                        return new MtopConnectException(i);
                    case ErrorConstant.ERROR_UNKNOWN_HOST_EXCEPTION /* -405 */:
                    case ErrorConstant.ERROR_HOST_NOT_VERIFY_ERROR /* -403 */:
                        return new MtopInvalidHostException(i);
                    case ErrorConstant.ERROR_IO_EXCEPTION /* -404 */:
                        return new MtopIOException(i);
                    case ErrorConstant.ERROR_SSL_ERROR /* -402 */:
                        return new MtopCertificateException(i);
                    case ErrorConstant.ERROR_SOCKET_TIME_OUT /* -401 */:
                    case -400:
                        break;
                    default:
                        return new MtopIndifferentException(i, finishEvent != null ? finishEvent.getDesc() : "unknown");
                }
            }
            return new MtopConnectTimeoutException(i);
        }
        return new MtopRequestCancelException(i);
    }

    @Override // anetwork.channel.NetworkCallBack.FinishListener
    public void onFinished(NetworkEvent.FinishEvent finishEvent, Object obj) {
        StatisticData statisticData;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a00910e8", new Object[]{this, finishEvent, obj});
            return;
        }
        if (this.b != null && finishEvent != null && (statisticData = finishEvent.getStatisticData()) != null) {
            this.b.put(b.MTOP_EXTRA_CONNECT_TYPE, statisticData.connectionType);
            this.b.put(b.MTOP_EXTRA_CDN_IP_PORT, statisticData.ip_port);
            this.b.put(b.MTOP_EXTRA_FIRST_DATA, String.valueOf(statisticData.firstDataTime));
            this.b.put(b.MTOP_EXTRA_SEND_BEFORE, String.valueOf(statisticData.sendBeforeTime));
            this.b.put(b.MTOP_EXTRA_SERVER_RT, String.valueOf(statisticData.serverRT));
        }
        if (this.c) {
            return;
        }
        this.c = true;
        this.f18911a.a(a(finishEvent));
    }

    @Override // anetwork.channel.NetworkCallBack.InputStreamListener
    public void onInputStreamGet(ParcelableInputStream parcelableInputStream, Object obj) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91cf6995", new Object[]{this, parcelableInputStream, obj});
        } else if (this.c || parcelableInputStream == null) {
        } else {
            d dVar = new d(parcelableInputStream);
            try {
                i = parcelableInputStream.length();
            } catch (RemoteException unused) {
                i = 0;
            }
            try {
                niw.a(LogStrategyManager.SP_STRATEGY_KEY_NETWORK, "%s get content length(%d) from stream success", b.MTOP_PREFIX, Integer.valueOf(i));
            } catch (RemoteException unused2) {
                niw.d(LogStrategyManager.SP_STRATEGY_KEY_NETWORK, "%s get content length from stream failed", b.MTOP_PREFIX);
                this.c = true;
                this.f18911a.a(new njf(dVar, i));
            }
            this.c = true;
            this.f18911a.a(new njf(dVar, i));
        }
    }

    private String a(Map<String, List<String>> map, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d0668d9", new Object[]{this, map, str});
        }
        List<String> list = map.get(str);
        String lowerCase = str.toLowerCase();
        if (list == null && !str.equals(lowerCase)) {
            list = map.get(lowerCase);
        }
        if (list != null && list.size() > 0) {
            return list.get(0);
        }
        return null;
    }

    private String a(String str) {
        String[] split;
        String[] split2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{this, str});
        }
        if (TextUtils.isEmpty(str) || (split = str.replace(" ", "").split(",")) == null || split.length <= 0) {
            return "";
        }
        for (int i = 0; i < split.length; i++) {
            if (!TextUtils.isEmpty(split[i]) && (split2 = split[i].split("=")) != null && split2.length > 1 && "max-age".equals(split2[0])) {
                return split2[1];
            }
        }
        return "";
    }

    @Override // anetwork.channel.NetworkCallBack.ResponseCodeListener
    public boolean onResponseCode(int i, Map<String, List<String>> map, Object obj) {
        String str;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("45b007d6", new Object[]{this, new Integer(i), map, obj})).booleanValue();
        }
        String str3 = null;
        if (map != null) {
            str3 = a(map, HttpConstant.EAGLE_EYE_ID_3);
            str2 = a(map, HttpConstant.CACHE_CONTROL);
            str = a(map, "via");
        } else {
            str = null;
            str2 = null;
        }
        if (this.b != null) {
            if (!TextUtils.isEmpty(str)) {
                this.b.put(b.MTOP_EXTRA_HIT_CDN_CACHE, str.contains(",H]") ? "1" : "0");
            }
            if (!TextUtils.isEmpty(str3)) {
                this.b.put(HttpConstant.EAGLE_EYE_ID_3, str3);
            }
            String a2 = a(str2);
            if (!TextUtils.isEmpty(a2)) {
                this.b.put("max-age", a2);
            }
            String str4 = this.b.get("inner_network_start_time");
            if (str4 != null) {
                this.b.put(b.MTOP_EXTRA_RESPONSE_CODE, String.valueOf(System.currentTimeMillis() - Long.parseLong(str4)));
            }
            this.b.put("via", str);
            if (!TextUtils.isEmpty(str2)) {
                this.b.put(HttpConstant.CACHE_CONTROL, str2);
            }
        }
        if (!this.c && i != 200) {
            this.c = true;
            this.f18911a.a(new HttpCodeResponseException(i));
        }
        return true;
    }
}
