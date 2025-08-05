package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.update.datasource.local.UpdateInfo;

/* loaded from: classes9.dex */
public class rga {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private boolean f33139a;

    static {
        kge.a(333183731);
    }

    public void startUpdate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f8e3ed2", new Object[]{this});
        } else {
            this.f33139a = true;
        }
    }

    public void finishUpdate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2f93dc3", new Object[]{this});
        } else {
            this.f33139a = false;
        }
    }

    public boolean isUpdating() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9b68ab1b", new Object[]{this})).booleanValue() : this.f33139a;
    }

    public boolean isLocalDataValid(UpdateInfo updateInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("121fc49b", new Object[]{this, updateInfo})).booleanValue();
        }
        String config = rfy.sUpdateAdapter.getConfig(rfx.UPDATE_CONFIG_GROUP, rfx.UPDATE_CACHE_HOUR, "3");
        long intValue = (TextUtils.isEmpty(config) || !TextUtils.isDigitsOnly(config)) ? 0L : Integer.valueOf(config).intValue() * 60 * 60 * 1000;
        return 0 != intValue && updateInfo != null && updateInfo.lastUpdateTime > 0 && rgq.getVersionName().equals(updateInfo.appVersion) && updateInfo.updateList.size() != 0 && System.currentTimeMillis() - updateInfo.lastUpdateTime < intValue;
    }
}
