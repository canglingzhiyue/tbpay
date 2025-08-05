package com.taobao.tinct.model;

import android.content.Context;
import android.preference.PreferenceManager;
import com.alibaba.fastjson.annotation.JSONField;
import com.alipay.android.msp.framework.db.MspDBHelper;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes.dex */
public class InstantPatchChangeInfo extends BaseChangeInfo {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String INSTANT_PATCH_EFFECTIVE_TYPE = "instantpatch_effective_type";
    public static final String INSTANT_PATCH_EFFECTIVE_VERSION = "instantpatch_effective_version";
    public static final String TYPE_BETA = "BETA";
    public static final String TYPE_RELEASE = "RELEASE";
    @JSONField(name = "type")
    public String verType;
    @JSONField(name = MspDBHelper.RecordEntry.COLUMN_NAME_VERSION)
    public String version;

    public InstantPatchChangeInfo() {
        this("", "");
    }

    public InstantPatchChangeInfo(String str, String str2) {
        this.version = str;
        this.verType = str2;
        this.changeType = ChangeType.PATCH_INSTANT;
    }

    public String getVersion() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("2a8fef97", new Object[]{this}) : this.version;
    }

    public String getVerType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("784d9412", new Object[]{this}) : this.verType;
    }

    public static String getPatchVersion(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("1e63c105", new Object[]{context}) : PreferenceManager.getDefaultSharedPreferences(context).getString("instantpatch_effective_version", "");
    }

    public static String getPatchType(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("fa18d18b", new Object[]{context}) : PreferenceManager.getDefaultSharedPreferences(context).getString(INSTANT_PATCH_EFFECTIVE_TYPE, "");
    }

    @Override // com.taobao.tinct.model.BaseChangeInfo
    public String getTinctTag() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("8f9becd3", new Object[]{this}) : String.format("escort|instant|%s", this.version);
    }
}
