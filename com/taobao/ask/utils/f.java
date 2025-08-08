package com.taobao.ask.utils;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.ask.utils.f;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.remotebusiness.IRemoteListener;
import com.taobao.tao.remotebusiness.RemoteBusiness;
import java.util.Map;
import mtopsdk.common.util.TBSdkLog;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MtopRequest;
import mtopsdk.mtop.domain.MtopResponse;
import mtopsdk.mtop.domain.ProtocolEnum;
import tb.kge;
import tb.riy;

/* loaded from: classes6.dex */
public class f {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* loaded from: classes6.dex */
    public interface a {
        void a(JSONObject jSONObject);

        void a(String str, String str2);
    }

    static {
        kge.a(-590746767);
    }

    public static RemoteBusiness a(String str, String str2, Map<String, String> map, final a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RemoteBusiness) ipChange.ipc$dispatch("5ac2ad9a", new Object[]{str, str2, map, aVar});
        }
        MtopRequest mtopRequest = new MtopRequest();
        mtopRequest.setApiName(str);
        if (StringUtils.isEmpty(str2)) {
            str2 = "1.0";
        }
        mtopRequest.setVersion(str2);
        mtopRequest.setNeedEcode(true);
        mtopRequest.setNeedSession(true);
        mtopRequest.dataParams = map;
        mtopRequest.setData(a(map));
        RemoteBusiness build = RemoteBusiness.build(mtopRequest);
        build.mo1303protocol(ProtocolEnum.HTTPSECURE);
        build.mo1335useWua();
        build.mo1334useCache();
        build.mo1341setErrorNotifyAfterCache(true);
        build.registerListener((IRemoteListener) new IRemoteBaseListener() { // from class: com.taobao.ask.utils.MtopUtil$1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
            public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                    return;
                }
                f.a aVar2 = f.a.this;
                if (aVar2 == null) {
                    return;
                }
                aVar2.a(mtopResponse.getRetCode(), mtopResponse.getRetMsg());
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                    return;
                }
                JSONObject parseObject = JSON.parseObject(new String(mtopResponse.getBytedata()));
                f.a aVar2 = f.a.this;
                if (aVar2 == null) {
                    return;
                }
                aVar2.a(parseObject);
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onError(int i, MtopResponse mtopResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                    return;
                }
                f.a aVar2 = f.a.this;
                if (aVar2 == null) {
                    return;
                }
                aVar2.a(mtopResponse.getRetCode(), mtopResponse.getRetMsg());
            }
        });
        return build;
    }

    public static RemoteBusiness b(String str, String str2, Map<String, String> map, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RemoteBusiness) ipChange.ipc$dispatch("cdcfa9db", new Object[]{str, str2, map, aVar});
        }
        RemoteBusiness a2 = a(str, str2, map, aVar);
        a2.startRequest();
        return a2;
    }

    public static String a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1a4c023", new Object[]{map});
        }
        StringBuilder sb = new StringBuilder(64);
        sb.append(riy.BLOCK_START_STR);
        if (map != null && !map.isEmpty()) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                if (key != null && value != null) {
                    try {
                        sb.append(JSON.toJSONString(key));
                        sb.append(":");
                        sb.append(JSON.toJSONString(value));
                        sb.append(",");
                    } catch (Throwable th) {
                        StringBuilder sb2 = new StringBuilder(64);
                        sb2.append("[convertMapToDataStr] convert key=");
                        sb2.append(key);
                        sb2.append(",value=");
                        sb2.append(value);
                        sb2.append(" to dataStr error.");
                        TBSdkLog.e("mtopsdk.ReflectUtil", sb2.toString(), th);
                    }
                }
            }
            int length = sb.length();
            if (length > 1) {
                sb.deleteCharAt(length - 1);
            }
        }
        sb.append(riy.BLOCK_END_STR);
        return sb.toString();
    }
}
