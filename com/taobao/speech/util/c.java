package com.taobao.speech.util;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import kotlin.jvm.internal.q;
import org.json.JSONObject;
import tb.npp;
import tb.nul;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u001c\u0010\u0004\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0014J\b\u0010\t\u001a\u00020\u0002H\u0014¨\u0006\n"}, d2 = {"Lcom/taobao/speech/util/NlsSpeechTokenConverter;", "Lcom/taobao/search/rx/network/mtop/SearchRxMtopConverter;", "Lcom/taobao/speech/util/NlsSpeechTokenBean;", "()V", "convertJson2Bean", "jsonObject", "Lorg/json/JSONObject;", "tLogTrackTask", "Lcom/taobao/search/sf/util/tlog/SearchTLogTrackTask;", "getDefaultBean", "tbspeech_android_release"}, k = 1, mv = {1, 1, 11})
/* loaded from: classes8.dex */
public final class c extends npp<NlsSpeechTokenBean> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* JADX WARN: Type inference failed for: r0v2, types: [com.taobao.speech.util.NlsSpeechTokenBean, java.lang.Object] */
    @Override // tb.npp
    public /* synthetic */ NlsSpeechTokenBean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("43b9c269", new Object[]{this}) : a();
    }

    /* JADX WARN: Type inference failed for: r4v4, types: [com.taobao.speech.util.NlsSpeechTokenBean, java.lang.Object] */
    @Override // tb.npp
    public /* synthetic */ NlsSpeechTokenBean b(JSONObject jSONObject, nul nulVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("6b4445f2", new Object[]{this, jSONObject, nulVar}) : a(jSONObject, nulVar);
    }

    public NlsSpeechTokenBean a(JSONObject jSONObject, nul nulVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (NlsSpeechTokenBean) ipChange.ipc$dispatch("8273adcd", new Object[]{this, jSONObject, nulVar});
        }
        NlsSpeechTokenBean a2 = a();
        if (jSONObject != null) {
            try {
                Object parseObject = JSON.parseObject(jSONObject.toString(), NlsSpeechTokenBean.class);
                q.a(parseObject, "JSON.parseObject(it.toSt…echTokenBean::class.java)");
                return (NlsSpeechTokenBean) parseObject;
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return a2;
    }

    public NlsSpeechTokenBean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (NlsSpeechTokenBean) ipChange.ipc$dispatch("94845c54", new Object[]{this}) : new NlsSpeechTokenBean();
    }
}
