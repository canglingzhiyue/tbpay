package com.alibaba.android.nextrpc.stream.internal.response;

import anet.channel.util.HttpConstant;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.stream.d;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import mtopsdk.common.util.StringUtils;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MtopResponse;

/* loaded from: classes2.dex */
public class StreamRemoteMainResponse extends AbsStreamResponse {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String MAIN_RESPONSE_HEADER_REQ_ID = "mtop-nextrpc-req-id";
    private static final String MAIN_RESPONSE_HEADER_REQ_ID_UPPER_CASE = "MTOP-nextrpc-req-id";
    private static final String RESPONSE_HEADER_ATTACHED_RESPONSE_STAT = "mtop-nextrpc-attached-responses-stat";
    private static final String RESPONSE_HEADER_ATTACHED_RESPONSE_STAT_HIGH_CASE = "MTOP-nextrpc-attached-responses-stat";
    private String attachedResponseStat;
    private boolean isBizSuccess;
    private final b mStatistics;
    private final BaseOutDo mtopBaseOutDo;
    private final d mtopStreamResponse;

    private JSONObject getMeta() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("ec4670a2", new Object[]{this});
        }
        return null;
    }

    public static /* synthetic */ Object ipc$super(StreamRemoteMainResponse streamRemoteMainResponse, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public StreamRemoteMainResponse(int i, d dVar, BaseOutDo baseOutDo, Object obj) {
        super(dVar != null ? dVar.g : new HashMap(), i, obj);
        this.mStatistics = new b();
        this.mtopStreamResponse = dVar;
        this.mtopBaseOutDo = baseOutDo;
    }

    public d getMtopStreamResponse() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (d) ipChange.ipc$dispatch("2437d682", new Object[]{this}) : this.mtopStreamResponse;
    }

    public BaseOutDo getMtopBaseOutDo() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (BaseOutDo) ipChange.ipc$dispatch("36c3ccdb", new Object[]{this}) : this.mtopBaseOutDo;
    }

    public String getReqId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1604a36", new Object[]{this});
        }
        Map<String, List<String>> map = this.mtopStreamResponse.g;
        if (map == null) {
            return null;
        }
        List<String> list = map.get("mtop-nextrpc-req-id");
        if (list == null) {
            list = map.get("MTOP-nextrpc-req-id");
        }
        if (list != null && list.size() != 0) {
            return list.get(0);
        }
        return null;
    }

    public String getTraceId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9afc202f", new Object[]{this}) : getHeaders() == null ? "" : com.alibaba.android.nextrpc.internal.utils.b.a(getHeaders().get(HttpConstant.EAGLE_EYE_ID_2));
    }

    public String getAttachedResponseStat() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("11311bea", new Object[]{this});
        }
        if (this.attachedResponseStat == null) {
            JSONObject meta = getMeta();
            if (meta != null) {
                return meta.getString("attached-responses-stat");
            }
            String str = null;
            if (getMainNum() != 1) {
                return null;
            }
            List<String> list = getHeaders().get("mtop-nextrpc-attached-responses-stat");
            if (list == null || list.isEmpty()) {
                list = getHeaders().get("MTOP-nextrpc-attached-responses-stat");
            }
            if (list != null && !list.isEmpty()) {
                str = list.get(0);
            }
            if (str != null) {
                try {
                    str = URLDecoder.decode(str, "UTF-8");
                } catch (UnsupportedEncodingException e) {
                    e.printStackTrace();
                }
            }
            this.attachedResponseStat = str;
        }
        return this.attachedResponseStat;
    }

    @Override // com.alibaba.android.nextrpc.stream.internal.response.AbsStreamResponse
    public MtopResponse createMtopResponse() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopResponse) ipChange.ipc$dispatch("6994c98f", new Object[]{this});
        }
        MtopResponse mtopResponse = new MtopResponse();
        mtopResponse.setApi(this.mtopStreamResponse.c);
        mtopResponse.setBytedata(this.mtopStreamResponse.e);
        mtopResponse.setRetCode(this.mtopStreamResponse.f21113a);
        mtopResponse.setRetMsg(this.mtopStreamResponse.b);
        mtopResponse.setV(this.mtopStreamResponse.d);
        mtopResponse.setHeaderFields(this.mtopStreamResponse.g);
        return mtopResponse;
    }

    public boolean isBizSuccess() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("b3b7e3c5", new Object[]{this})).booleanValue() : this.isBizSuccess;
    }

    public void parseBizSuccess(String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d0ea755", new Object[]{this, strArr});
        } else {
            this.isBizSuccess = isRetSuccess(strArr);
        }
    }

    public boolean isRetSuccess(String[] strArr) {
        String[] split;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("64b72ed0", new Object[]{this, strArr})).booleanValue();
        }
        if (strArr != null && strArr.length > 0) {
            String str = strArr[0];
            if (StringUtils.isNotBlank(str) && (split = str.split("::")) != null && split.length > 1) {
                String str2 = split[0];
                this.retCode = str2;
                this.retMsg = split[1];
                return "SUCCESS".equals(str2);
            }
        }
        return false;
    }

    public b getStatistics() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("33257bd0", new Object[]{this}) : this.mStatistics;
    }
}
