package com.taobao.tinct.model;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes.dex */
public class a extends BaseChangeInfo {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private boolean b = false;

    /* renamed from: a  reason: collision with root package name */
    private String f22958a = "";

    public a() {
        this.changeType = ChangeType.DYNAMIC_FEATURE;
    }

    @Override // com.taobao.tinct.model.BaseChangeInfo
    public String getTinctTag() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("8f9becd3", new Object[]{this}) : String.format("dynamic|bundle|%s", this.f22958a);
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : !TextUtils.isEmpty(this.f22958a);
    }

    public boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : this.b;
    }

    public void a(Context context) {
        SharedPreferences sharedPreferences;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{this, context});
        } else if (context == null || (sharedPreferences = context.getSharedPreferences("dynamicdeploy_features", 0)) == null) {
        } else {
            String m = com.taobao.tinct.impl.config.a.m();
            this.f22958a = sharedPreferences.getString("deploy_version_" + m, "");
            if (!a()) {
                return;
            }
            this.b = sharedPreferences.getBoolean("deploy_beta_" + m, false);
        }
    }
}
