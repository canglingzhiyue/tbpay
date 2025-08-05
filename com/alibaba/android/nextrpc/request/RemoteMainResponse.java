package com.alibaba.android.nextrpc.request;

import anet.channel.util.HttpConstant;
import com.alibaba.android.nextrpc.internal.utils.UnifyLog;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MtopResponse;

/* loaded from: classes2.dex */
public class RemoteMainResponse extends AbsResponse {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String MAIN_RESPONSE_HEADER_HAS_ATTACHED_RESPONSE = "mtop-nextrpc-has-attached-response";
    public static final String MAIN_RESPONSE_HEADER_HAS_ATTACHED_RESPONSE_UPPER_CASE = "MTOP-nextrpc-has-attached-response";
    public static final String MAIN_RESPONSE_HEADER_REQ_ID = "mtop-nextrpc-req-id";
    public static final String MAIN_RESPONSE_HEADER_REQ_ID_UPPER_CASE = "MTOP-nextrpc-req-id";
    public static final String RESPONSE_HEADER_ATTACHED_RESPONSE_STAT = "mtop-nextrpc-attached-responses-stat";
    public static final String RESPONSE_HEADER_ATTACHED_RESPONSE_STAT_HIGH_CASE = "MTOP-nextrpc-attached-responses-stat";
    private String attachedResponseStat;
    private final BaseOutDo mtopBaseOutDo;
    private final Object mtopRequestContext;
    private final int mtopRequestType;
    private final MtopResponse mtopResponse;

    public RemoteMainResponse(String str, int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
        super(str, mtopResponse != null ? mtopResponse.getHeaderFields() : new HashMap<>());
        String str2 = "";
        if (mtopResponse == null) {
            setBody(str2);
        } else {
            UnifyLog.a("purchase-nextrpc", "start parse body", new Object[0]);
            JSONObject originFastJsonObject = mtopResponse.getOriginFastJsonObject();
            if (originFastJsonObject != null) {
                UnifyLog.a("purchase-nextrpc", "parse body,mtop流式解析JSON", new Object[0]);
                setOriginBody(originFastJsonObject);
            } else {
                setBody(mtopResponse.getBytedata() != null ? new String(mtopResponse.getBytedata()) : str2);
            }
            UnifyLog.a("purchase-nextrpc", "end parse body", new Object[0]);
        }
        this.mtopRequestType = i;
        this.mtopResponse = mtopResponse;
        this.mtopBaseOutDo = baseOutDo;
        this.mtopRequestContext = obj;
    }

    public int getMtopRequestType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("dbd03c45", new Object[]{this})).intValue() : this.mtopRequestType;
    }

    public MtopResponse getMtopResponse() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MtopResponse) ipChange.ipc$dispatch("5c6f0275", new Object[]{this}) : this.mtopResponse;
    }

    public BaseOutDo getMtopBaseOutDo() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (BaseOutDo) ipChange.ipc$dispatch("36c3ccdb", new Object[]{this}) : this.mtopBaseOutDo;
    }

    public Object getMtopRequestContext() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("7c97b24d", new Object[]{this}) : this.mtopRequestContext;
    }

    public boolean hasAttachedResponse() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cd0881ca", new Object[]{this})).booleanValue();
        }
        Map<String, List<String>> headerFields = this.mtopResponse.getHeaderFields();
        if (headerFields == null) {
            return false;
        }
        List<String> list = headerFields.get(MAIN_RESPONSE_HEADER_HAS_ATTACHED_RESPONSE);
        if (list == null) {
            list = headerFields.get(MAIN_RESPONSE_HEADER_HAS_ATTACHED_RESPONSE_UPPER_CASE);
        }
        if (list != null && list.size() != 0) {
            return Boolean.parseBoolean(list.get(0));
        }
        return false;
    }

    @Override // com.alibaba.android.nextrpc.request.AbsResponse
    public String getReqId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1604a36", new Object[]{this});
        }
        Map<String, List<String>> headerFields = this.mtopResponse.getHeaderFields();
        if (headerFields == null) {
            return null;
        }
        List<String> list = headerFields.get(MAIN_RESPONSE_HEADER_REQ_ID);
        if (list == null) {
            list = headerFields.get(MAIN_RESPONSE_HEADER_REQ_ID_UPPER_CASE);
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
            List<String> list = getHeaders().get(RESPONSE_HEADER_ATTACHED_RESPONSE_STAT);
            if (list == null || list.isEmpty()) {
                list = getHeaders().get(RESPONSE_HEADER_ATTACHED_RESPONSE_STAT_HIGH_CASE);
            }
            String str = null;
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
}
