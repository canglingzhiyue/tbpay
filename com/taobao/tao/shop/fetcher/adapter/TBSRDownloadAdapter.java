package com.taobao.tao.shop.fetcher.adapter;

import anetwork.channel.Response;
import anetwork.channel.degrade.DegradableNetwork;
import anetwork.channel.entity.RequestImpl;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.parser.Feature;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.shop.e;
import tb.kge;
import tb.ouu;
import tb.ouv;
import tb.oux;

/* loaded from: classes8.dex */
public class TBSRDownloadAdapter {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int ERROR_KNOWN_EXCEPTION = -2005;
    public static final int ERROR_RESPONSE_DATA_NULL = -2003;
    public static final int ERROR_RESPONSE_MD5_NOT_MATCH = -2004;
    public static final int ERROR_RESPONSE_NULL = -2001;
    public static final int ERROR_RESPONSE_STATUS_NOT_200 = -2002;

    /* renamed from: a  reason: collision with root package name */
    private a f21079a;

    /* loaded from: classes8.dex */
    public interface a {
        void a(Object obj, TBSRDownloadException tBSRDownloadException);
    }

    static {
        kge.a(1440230297);
    }

    public void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2401c743", new Object[]{this, aVar});
        } else {
            this.f21079a = aVar;
        }
    }

    public <DATA> DATA a(String str, String str2, Class<DATA> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DATA) ipChange.ipc$dispatch("2686b011", new Object[]{this, str, str2, cls});
        }
        Response syncSend = new DegradableNetwork(e.b).syncSend(new RequestImpl(str), null);
        if (syncSend == null) {
            ouu.b("[download] response is null");
            a(null, new TBSRDownloadException(-2001, "ERROR_RESPONSE_NULL"));
            return null;
        }
        int statusCode = syncSend.getStatusCode();
        if (statusCode != 200) {
            Throwable error = syncSend.getError();
            String message = error == null ? "" : error.getMessage();
            ouu.b("[download]  status:" + statusCode + "      error: " + message);
            a(null, new TBSRDownloadException(-2002, "statusCode:" + statusCode + "  msg:" + message));
            return null;
        }
        try {
            byte[] bytedata = syncSend.getBytedata();
            if (bytedata == null) {
                ouu.b("[download]  response bytedata is null");
                a(null, new TBSRDownloadException(-2003, "ERROR_RESPONSE_DATA_NULL"));
                return null;
            }
            String b = ouv.b(bytedata);
            if (!oux.a(b) && b.equals(str2)) {
                DATA data = (DATA) JSON.parseObject(bytedata, cls, new Feature[0]);
                a(data, null);
                return data;
            }
            ouu.b("[download]  download data md5:" + b + " not match expect:" + str2);
            a(null, new TBSRDownloadException(-2004, "wantMd5: " + str2 + "  downloadMd5:" + b));
            return null;
        } catch (Exception e) {
            ouu.a(e, "[download]  download byte data parse error");
            a(null, new TBSRDownloadException(-2005, e.getMessage()));
            return null;
        }
    }

    private void a(Object obj, TBSRDownloadException tBSRDownloadException) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("33ae46ce", new Object[]{this, obj, tBSRDownloadException});
            return;
        }
        a aVar = this.f21079a;
        if (aVar == null) {
            ouu.c("TBSRDownloadAdapter is null !!!!");
        } else {
            aVar.a(obj, tBSRDownloadException);
        }
    }

    /* loaded from: classes8.dex */
    public static class TBSRDownloadException extends Exception {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private final int errorCode;
        private final String errorMsg;

        static {
            kge.a(-1543818225);
        }

        public TBSRDownloadException(int i, String str) {
            this.errorCode = i;
            this.errorMsg = str;
        }

        public int getErrorCode() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5461de59", new Object[]{this})).intValue() : this.errorCode;
        }

        public String getErrorMsg() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("e1cc388a", new Object[]{this}) : this.errorMsg;
        }

        @Override // java.lang.Throwable
        public synchronized Throwable fillInStackTrace() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Throwable) ipChange.ipc$dispatch("6c8bc0b1", new Object[]{this});
            }
            return this;
        }
    }
}
