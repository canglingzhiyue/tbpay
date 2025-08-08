package com.taobao.phenix.compat.mtop;

import mtopsdk.common.util.StringUtils;
import anet.channel.util.ErrorConstant;
import anet.channel.util.HttpConstant;
import anetwork.channel.NetworkCallBack;
import anetwork.channel.NetworkEvent;
import anetwork.channel.statist.StatisticData;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.phenix.loader.network.HttpCodeResponseException;
import com.taobao.phenix.loader.network.IncompleteResponseException;
import com.taobao.phenix.loader.network.NetworkResponseException;
import com.taobao.phenix.loader.network.b;
import java.io.ByteArrayOutputStream;
import java.util.List;
import java.util.Map;
import tb.njf;

/* loaded from: classes7.dex */
public class c implements NetworkCallBack.FinishListener, NetworkCallBack.ProgressListener, NetworkCallBack.ResponseCodeListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final b.a b;
    private final Map<String, String> c;
    private boolean d;
    private njf e;
    private int f;

    /* renamed from: a  reason: collision with root package name */
    public ByteArrayOutputStream f18909a = null;
    private boolean g = false;
    private boolean h = false;

    public c(b.a aVar, Map<String, String> map) {
        this.b = aVar;
        this.c = map;
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
        if (this.c != null && finishEvent != null && (statisticData = finishEvent.getStatisticData()) != null) {
            this.c.put(b.MTOP_EXTRA_CONNECT_TYPE, statisticData.connectionType);
            this.c.put(b.MTOP_EXTRA_CDN_IP_PORT, statisticData.ip_port);
            this.c.put(b.MTOP_EXTRA_FIRST_DATA, String.valueOf(statisticData.firstDataTime));
            this.c.put(b.MTOP_EXTRA_SEND_BEFORE, String.valueOf(statisticData.sendBeforeTime));
            this.c.put(b.MTOP_EXTRA_SERVER_RT, String.valueOf(statisticData.serverRT));
        }
        if (this.d) {
            return;
        }
        this.d = true;
        njf njfVar = this.e;
        if (njfVar != null && this.f >= njfVar.l) {
            this.b.a(this.e, false, true);
            return;
        }
        ByteArrayOutputStream byteArrayOutputStream = this.f18909a;
        if (byteArrayOutputStream != null) {
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            this.e = new njf(byteArray, 0, byteArray.length);
            this.b.a(this.e, false, true);
            return;
        }
        this.b.a(a(finishEvent));
    }

    @Override // anetwork.channel.NetworkCallBack.ProgressListener
    public void onDataReceived(NetworkEvent.ProgressEvent progressEvent, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e27ec0e9", new Object[]{this, progressEvent, obj});
        } else if (this.d || progressEvent == null) {
        } else {
            if (progressEvent.getTotal() == 0 && this.f18909a == null) {
                this.f18909a = new ByteArrayOutputStream(32768);
                this.g = true;
            }
            if (this.f18909a == null && this.e == null) {
                this.e = new njf(com.taobao.phenix.intf.b.h().q().a().a(progressEvent.getTotal()), 0, progressEvent.getTotal());
                this.f = 0;
                this.g = true;
            }
            ByteArrayOutputStream byteArrayOutputStream = this.f18909a;
            if (byteArrayOutputStream != null) {
                byteArrayOutputStream.write(progressEvent.getBytedata(), 0, progressEvent.getSize());
            } else {
                int size = progressEvent.getSize();
                System.arraycopy(progressEvent.getBytedata(), 0, this.e.m, this.f, size);
                this.f += size;
            }
            if (!this.g) {
                return;
            }
            this.b.a(this.e, true, false);
            this.g = false;
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
        if (StringUtils.isEmpty(str) || (split = str.replace(" ", "").split(",")) == null || split.length <= 0) {
            return "";
        }
        for (int i = 0; i < split.length; i++) {
            if (!StringUtils.isEmpty(split[i]) && (split2 = split[i].split("=")) != null && split2.length > 1 && "max-age".equals(split2[0])) {
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
        if (this.c != null) {
            if (!StringUtils.isEmpty(str)) {
                this.c.put(b.MTOP_EXTRA_HIT_CDN_CACHE, str.contains(",H]") ? "1" : "0");
            }
            if (!StringUtils.isEmpty(str3)) {
                this.c.put(HttpConstant.EAGLE_EYE_ID_3, str3);
            }
            String a2 = a(str2);
            if (!StringUtils.isEmpty(a2)) {
                this.c.put("max-age", a2);
            }
            String str4 = this.c.get("inner_network_start_time");
            if (str4 != null) {
                this.c.put(b.MTOP_EXTRA_RESPONSE_CODE, String.valueOf(System.currentTimeMillis() - Long.parseLong(str4)));
            }
            this.c.put("via", str);
            if (!StringUtils.isEmpty(str2)) {
                this.c.put(HttpConstant.CACHE_CONTROL, str2);
            }
        }
        if (!this.d && i != 200) {
            this.d = true;
            this.b.a(new HttpCodeResponseException(i));
        }
        return true;
    }
}
