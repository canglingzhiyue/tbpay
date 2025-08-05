package com.taobao.android.detail.core.detail.content;

import android.app.Application;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.request.MtopRequestParams;
import com.taobao.avplayer.TBPlayerConst;
import java.util.HashMap;
import tb.emu;
import tb.epo;
import tb.kge;

/* loaded from: classes4.dex */
public class ContentRequestParams implements MtopRequestParams {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "ContentRequestParams";
    private String mItemId;
    private String mSceneName;
    private String mSeeIds;
    private String mTab;
    private String mUniqueId;

    static {
        kge.a(1852493899);
        kge.a(-1214933880);
    }

    public ContentRequestParams(String str, String str2, String str3) {
        Application a2 = epo.a();
        this.mItemId = str;
        this.mUniqueId = str2;
        this.mSceneName = str3;
        if (this.mItemId == null || this.mUniqueId == null) {
            com.taobao.android.detail.core.utils.i.a(TAG, "create ContentRequestParams error");
            if (com.taobao.android.detail.core.debug.a.a(a2)) {
                throw new IllegalArgumentException("create ContentRequestParams error, itemId : " + str + " uniqueId : " + str2);
            }
        }
        this.mTab = "all";
        emu.a("com.taobao.android.detail.core.detail.content.ContentRequestParams");
    }

    @Override // com.taobao.android.detail.core.request.MtopRequestParams
    public HashMap<String, String> toMap() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("1c79404b", new Object[]{this});
        }
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("id", this.mItemId);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(TBPlayerConst.TBPlayerMethodSwitchPlayerScene_SceneName, (Object) this.mSceneName);
        jSONObject.put("tab", (Object) this.mTab);
        jSONObject.put("pvUuid", (Object) this.mUniqueId);
        String str = this.mSeeIds;
        if (str == null) {
            str = "";
        }
        jSONObject.put("seeIds", (Object) str);
        hashMap.put("exParams", JSONObject.toJSONString(jSONObject));
        return hashMap;
    }

    public void setSeeIds(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19e8d7b8", new Object[]{this, str});
        } else {
            this.mSeeIds = str;
        }
    }

    public void setTab(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bba3e224", new Object[]{this, str});
        } else {
            this.mTab = str;
        }
    }
}
