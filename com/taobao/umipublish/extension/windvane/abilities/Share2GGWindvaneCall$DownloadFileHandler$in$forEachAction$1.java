package com.taobao.umipublish.extension.windvane.abilities;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import com.taobao.android.litecreator.util.m;
import com.taobao.weex.common.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import kotlin.t;
import tb.keu;
import tb.rul;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", AdvanceSetting.NETWORK_TYPE, "", "invoke"}, k = 3, mv = {1, 4, 0})
/* loaded from: classes9.dex */
public final class Share2GGWindvaneCall$DownloadFileHandler$in$forEachAction$1 extends Lambda implements rul<Object, t> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ JSONArray $downloadList;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Share2GGWindvaneCall$DownloadFileHandler$in$forEachAction$1(JSONArray jSONArray) {
        super(1);
        this.$downloadList = jSONArray;
    }

    @Override // tb.rul
    /* renamed from: invoke */
    public /* bridge */ /* synthetic */ t mo2421invoke(Object obj) {
        mo2421invoke(obj);
        return t.INSTANCE;
    }

    @Override // tb.rul
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void mo2421invoke(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5411b1b", new Object[]{this, obj});
        } else if (obj != null) {
            JSONObject jSONObject = (JSONObject) obj;
            String a2 = m.a(jSONObject, "type", "");
            String str = TextUtils.equals("video", a2) ? "video" : "image";
            String str2 = TextUtils.equals("video", a2) ? keu.SUFFIX_MP4 : ".jpg";
            String a3 = m.a(jSONObject, "tag", "");
            JSONObject jSONObject2 = new JSONObject();
            JSONObject jSONObject3 = jSONObject2;
            jSONObject3.put((JSONObject) "url", m.a(jSONObject, "url", ""));
            jSONObject3.put((JSONObject) "type", str);
            jSONObject3.put((JSONObject) Constants.Name.SUFFIX, str2);
            jSONObject3.put((JSONObject) "optional", m.a(jSONObject, "optional", "true"));
            if (!TextUtils.isEmpty(a3)) {
                jSONObject3.put((JSONObject) "tag", a3);
            }
            this.$downloadList.add(jSONObject2);
        } else {
            throw new NullPointerException("null cannot be cast to non-null type com.alibaba.fastjson.JSONObject");
        }
    }
}
