package com.taobao.tao.flexbox.layoutmanager.player.videoquickopen;

import com.alibaba.fastjson.JSONArray;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.layoutmanager.module.MtopModule;
import com.taobao.tao.flexbox.layoutmanager.ac.g;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import java.util.HashMap;
import java.util.Map;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MtopResponse;
import tb.kge;
import tb.oeb;
import tb.ogg;

/* loaded from: classes8.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "ShortVideoQuickOpenManager";
    public static final long UPDATE_CONFIG_INTERNAL = 5000;

    /* renamed from: a  reason: collision with root package name */
    public static long f20482a;
    public static Map<String, String> b;

    static {
        kge.a(1904498019);
        f20482a = 0L;
        HashMap hashMap = new HashMap();
        b = hashMap;
        hashMap.put("guangguangdouble", "guangguang");
    }

    public static void a(final IRemoteBaseListener iRemoteBaseListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c2600e", new Object[]{iRemoteBaseListener});
            return;
        }
        GlobalConfigRequest globalConfigRequest = new GlobalConfigRequest();
        JSONArray jSONArray = new JSONArray();
        jSONArray.addAll(b.values());
        globalConfigRequest.sourceList = jSONArray;
        if (oeb.bJ()) {
            globalConfigRequest.buildExtendParams();
        }
        ogg.d(TAG, "开始请求");
        MtopModule.requestWithParser(new g.c(null, globalConfigRequest.toJsonObject(), null), new IRemoteBaseListener() { // from class: com.taobao.tao.flexbox.layoutmanager.player.videoquickopen.ShortVideoQuickOpenManager$1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onError(int i, MtopResponse mtopResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                }
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
            public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                    return;
                }
                IRemoteBaseListener iRemoteBaseListener2 = IRemoteBaseListener.this;
                if (iRemoteBaseListener2 == null) {
                    return;
                }
                iRemoteBaseListener2.onSystemError(i, mtopResponse, obj);
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                    return;
                }
                try {
                    if (IRemoteBaseListener.this == null) {
                        return;
                    }
                    IRemoteBaseListener.this.onSuccess(i, mtopResponse, baseOutDo, obj);
                } catch (Throwable th) {
                    ogg.a(a.TAG, "requestVideoInfo failed: " + th);
                }
            }
        }, null);
    }
}
