package com.taobao.live.ubee.utils;

import android.util.Log;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.ut.abtest.UTABTest;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import java.util.List;
import java.util.Map;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MtopResponse;
import tb.kge;

/* loaded from: classes7.dex */
public class ABDyeRemoteBaseListener implements IRemoteBaseListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private IRemoteBaseListener listener;

    static {
        kge.a(2034237290);
        kge.a(-525336021);
    }

    public ABDyeRemoteBaseListener(IRemoteBaseListener iRemoteBaseListener) {
        this.listener = iRemoteBaseListener;
    }

    @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
    public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
            return;
        }
        IRemoteBaseListener iRemoteBaseListener = this.listener;
        if (iRemoteBaseListener == null) {
            return;
        }
        iRemoteBaseListener.onSystemError(i, mtopResponse, obj);
    }

    @Override // com.taobao.tao.remotebusiness.IRemoteListener
    public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
            return;
        }
        IRemoteBaseListener iRemoteBaseListener = this.listener;
        if (iRemoteBaseListener != null) {
            iRemoteBaseListener.onSuccess(i, mtopResponse, baseOutDo, obj);
        }
        if (mtopResponse == null || mtopResponse.getHeaderFields() == null) {
            return;
        }
        try {
            Map<String, List<String>> headerFields = mtopResponse.getHeaderFields();
            if (headerFields != null && !headerFields.isEmpty()) {
                List<String> list = headerFields.get("mtop-mdepyixiu");
                if (list == null) {
                    list = headerFields.get("MTOP-mdepYixiu");
                }
                if (list != null && !list.isEmpty()) {
                    for (String str : list) {
                        JSONArray parseArray = JSON.parseArray(str);
                        if (parseArray != null && !parseArray.isEmpty()) {
                            for (int i2 = 0; i2 < parseArray.size(); i2++) {
                                UTABTest.activateServer(String.valueOf(parseArray.get(i2)));
                            }
                        }
                    }
                }
            }
        } catch (Exception e) {
            Log.e("ABDyeRemoteBaseListener", "", e);
        }
    }

    @Override // com.taobao.tao.remotebusiness.IRemoteListener
    public void onError(int i, MtopResponse mtopResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
            return;
        }
        IRemoteBaseListener iRemoteBaseListener = this.listener;
        if (iRemoteBaseListener == null) {
            return;
        }
        iRemoteBaseListener.onError(i, mtopResponse, obj);
    }
}
