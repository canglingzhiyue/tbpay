package com.taobao.themis.kernel.network;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import kotlin.t;
import tb.kge;
import tb.rul;

/* loaded from: classes9.dex */
public interface IMtopInnerAdapter extends com.taobao.themis.kernel.basic.a {

    /* loaded from: classes9.dex */
    public interface b {
        void a(Response response);

        void b(Response response);
    }

    void requestAsync(RequestParams requestParams, b bVar);

    void requestAsync(String str, String str2, Map<String, Object> map, String str3, boolean z, String str4, Map<String, String> map2, String str5, String str6, rul<? super Response, t> rulVar);

    Response requestSync(RequestParams requestParams);

    Response requestSync(String str, String str2, Map<String, Object> map, String str3, boolean z, String str4, Map<String, String> map2, String str5, String str6);

    /* loaded from: classes9.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(1342380393);
        }

        public static /* synthetic */ Response a(IMtopInnerAdapter iMtopInnerAdapter, String str, String str2, Map map, String str3, boolean z, String str4, Map map2, String str5, String str6, int i, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Response) ipChange.ipc$dispatch("524324ec", new Object[]{iMtopInnerAdapter, str, str2, map, str3, new Boolean(z), str4, map2, str5, str6, new Integer(i), obj});
            }
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: requestSync");
            }
            return iMtopInnerAdapter.requestSync(str, str2, (i & 4) != 0 ? null : map, (i & 8) != 0 ? "GET" : str3, (i & 16) != 0 ? false : z, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? null : map2, (i & 128) != 0 ? null : str5, (i & 256) != 0 ? null : str6);
        }

        public static /* synthetic */ void a(IMtopInnerAdapter iMtopInnerAdapter, String str, String str2, Map map, String str3, boolean z, String str4, Map map2, String str5, String str6, rul rulVar, int i, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7e5bcb2c", new Object[]{iMtopInnerAdapter, str, str2, map, str3, new Boolean(z), str4, map2, str5, str6, rulVar, new Integer(i), obj});
            } else if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: requestAsync");
            } else {
                iMtopInnerAdapter.requestAsync(str, str2, (i & 4) != 0 ? null : map, (i & 8) != 0 ? "GET" : str3, (i & 16) != 0 ? false : z, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? null : map2, (i & 128) != 0 ? null : str5, (i & 256) != 0 ? null : str6, rulVar);
            }
        }
    }

    /* loaded from: classes9.dex */
    public static final class Response implements Serializable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private JSONObject data;
        private String errorCode;
        private String errorMsg;
        private Map<String, ? extends List<String>> headers;
        private byte[] rawData;
        private boolean success;

        static {
            kge.a(-1559538536);
            kge.a(1028243835);
        }

        public final boolean getSuccess() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("8e2b51d8", new Object[]{this})).booleanValue() : this.success;
        }

        public final void setSuccess(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6d88968c", new Object[]{this, new Boolean(z)});
            } else {
                this.success = z;
            }
        }

        public final String getErrorCode() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("f72feefa", new Object[]{this}) : this.errorCode;
        }

        public final void setErrorCode(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("710bac24", new Object[]{this, str});
            } else {
                this.errorCode = str;
            }
        }

        public final String getErrorMsg() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("e1cc388a", new Object[]{this}) : this.errorMsg;
        }

        public final void setErrorMsg(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e298332c", new Object[]{this, str});
            } else {
                this.errorMsg = str;
            }
        }

        public final JSONObject getData() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("b8351bc7", new Object[]{this}) : this.data;
        }

        public final void setData(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d09acf9d", new Object[]{this, jSONObject});
            } else {
                this.data = jSONObject;
            }
        }

        public final byte[] getRawData() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (byte[]) ipChange.ipc$dispatch("25ccfefa", new Object[]{this}) : this.rawData;
        }

        public final void setRawData(byte[] bArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("26bfa0be", new Object[]{this, bArr});
            } else {
                this.rawData = bArr;
            }
        }

        public final Map<String, List<String>> getHeaders() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("cf4415cc", new Object[]{this}) : this.headers;
        }

        public final void setHeaders(Map<String, ? extends List<String>> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("bf00da", new Object[]{this, map});
            } else {
                this.headers = map;
            }
        }
    }
}
