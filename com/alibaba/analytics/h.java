package com.alibaba.analytics;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.ta.utdid2.device.UTDevice;
import com.taobao.login4android.api.Login;
import com.taobao.tao.Globals;
import com.taobao.tao.util.TaoHelper;
import com.tmall.android.dai.adapter.DAIUserAdapter;

/* loaded from: classes2.dex */
public class h implements DAIUserAdapter {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private SharedPreferences f2117a = Globals.getApplication().getSharedPreferences("taobao-dai", 0);
    private String b = this.f2117a.getString("userId", null);

    @Override // com.tmall.android.dai.adapter.DAIUserAdapter
    public String getTtid() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("99fd2f88", new Object[]{this}) : TaoHelper.getTTID();
    }

    @Override // com.tmall.android.dai.adapter.DAIUserAdapter
    public String getUserId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("58ad3b3d", new Object[]{this});
        }
        String userId = Login.getUserId();
        if (TextUtils.isEmpty(userId)) {
            return this.b;
        }
        if (!TextUtils.equals(userId, this.b)) {
            this.b = userId;
            this.f2117a.edit().putString("userId", this.b).apply();
        }
        return userId;
    }

    @Override // com.tmall.android.dai.adapter.DAIUserAdapter
    public String getUtdid() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("3fdfad6f", new Object[]{this}) : UTDevice.getUtdid(Globals.getApplication());
    }
}
