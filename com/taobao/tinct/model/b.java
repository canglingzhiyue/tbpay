package com.taobao.tinct.model;

import android.content.Context;
import android.preference.PreferenceManager;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes.dex */
public class b extends InstantPatchChangeInfo {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public b(String str, String str2) {
        this.version = str;
        this.verType = str2;
        this.changeType = ChangeType.PATCH_INLINE;
    }

    public b(String str, boolean z) {
        this(str, z ? TYPE_BETA : TYPE_RELEASE);
    }

    @Override // com.taobao.tinct.model.InstantPatchChangeInfo, com.taobao.tinct.model.BaseChangeInfo
    public String getTinctTag() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("8f9becd3", new Object[]{this}) : String.format("escort|inline|%s", this.version);
    }

    public static String a(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bbc5dc40", new Object[]{context}) : PreferenceManager.getDefaultSharedPreferences(context).getString("inlinepatch_effective_version", "");
    }

    public static String b(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("31400281", new Object[]{context}) : PreferenceManager.getDefaultSharedPreferences(context).getString("inlinepatch_effective_type", "");
    }
}
